/*
 * Copyright 2007-2017 The Europeana Foundation
 *
 *  Licenced under the EUPL, Version 1.1 (the "Licence") and subsequent versions as approved
 *  by the European Commission;
 *  You may not use this work except in compliance with the Licence.
 *
 *  You may obtain a copy of the Licence at:
 *  http://joinup.ec.europa.eu/software/page/eupl
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under
 *  the Licence is distributed on an "AS IS" basis, without warranties or conditions of
 *  any kind, either express or implied.
 *  See the Licence for the specific language governing permissions and limitations under
 *  the Licence.
 */

package com.hpb.bc.service.impl;

import com.hpb.bc.service.MailService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;


@Service
public class MailServiceImpl implements MailService {
    private static final Logger LOG = LogManager.getLogger(MailServiceImpl.class);

    @Autowired
    public JavaMailSender emailSender;

    @Override
    public void sendSimpleMessage(String from, String to, String subject, String messageBody) {
        LOG.debug("send email ...");
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(from);
            message.setTo(to);
            message.setSubject(subject);
            message.setText(messageBody);
            emailSender.send(message);
        } catch (MailException e) {
            LOG.error("Exception occurred sending email message {} ", e);
        }
    }

    @Override
    public void sendSimpleMessageUsingTemplate(String to,
                                               String subject,
                                               SimpleMailMessage template,
                                               String... templateArgs) {
        String messageBody = String.format(template.getText(), templateArgs);
        sendSimpleMessage(template.getFrom(), to, subject, messageBody);
    }

}
