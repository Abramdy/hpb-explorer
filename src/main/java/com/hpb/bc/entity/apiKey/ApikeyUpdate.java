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

package com.hpb.bc.entity.apiKey;

import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;

/**
 * Created by luthien on 4/12/2017.
 */

@JsonInclude(NON_EMPTY)
public class ApikeyUpdate implements ApikeyAction {

    public ApikeyUpdate(String apikey,
                        String firstName,
                        String lastName,
                        String email,
                        String appName,
                        String company,
                        String sector,
                        String website) {
        this.apikey = apikey;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.appName = appName;
        this.company = company;
        this.sector = sector;
        this.website = website;
    }

    //empty constructor needed to facilitate integration testing
    public ApikeyUpdate() {
    }

    private String apikey;
    private String firstName;
    private String lastName;
    private String email;
    private String appName;
    private String company;
    private String sector;
    private String website;

    public String getApikey() {
        return apikey;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public String getAppName() {
        return appName;
    }

    public String getCompany() {
        return company;
    }

    public String getSector() {
        return sector;
    }

    public String getWebsite() {
        return website;
    }
}
