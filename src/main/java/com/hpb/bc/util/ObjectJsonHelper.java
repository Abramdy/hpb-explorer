/*
 * Copyright 2020 HPB Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hpb.bc.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;

import io.hpb.web3.protocol.ObjectMapperFactory;
import io.hpb.web3.protocol.core.methods.response.AbiDefinition;
import org.springframework.util.Base64Utils;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author:wanggengle
 * @since:JDK1.8
 * @date:2017-05-15 12:40:32
 * @update:2017-05-15 12:40:32
 * @version:1.0
 * @modifier:修改人
 * @reviewer:复审人
 * @description:json字符串和java对象之间的互转
 */
public class ObjectJsonHelper {
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    private static ObjectMapper om = new ObjectMapper();

    static {
        om.configure(Feature.ALLOW_SINGLE_QUOTES, true);
        om.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        om.setSerializationInclusion(Include.ALWAYS);
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.setDateFormat(new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS));
    }

    /**
     * @return String
     * @Title:serialize
     * @Description:把java对象序列化为字符串
     * @author:wanggengle
     * @date:2017-05-15 12:41:26
     */
    public static String serialize(Object o) throws JsonProcessingException {
        return om.writeValueAsString(o);
    }

    /**
     * @return T
     * @Title:deserialize
     * @Description:把字符串反序列化为java对象
     * @author:wanggengle
     * @date:2017-05-15 12:42:00
     */
    public static <T> T deserialize(String str, Class<T> clazz) throws JsonParseException, JsonMappingException, IOException {
        return om.readValue(str.getBytes(), clazz);
    }
    public static void main(String[] args) throws JsonProcessingException {
        String serialize = "[\"AccountIndex\",\"FE343LEKF\",\"/Account/queryAcountInfo\",\"DF34F\",\"123456\"]";
        byte[] encode = Base64Utils.encode(serialize.getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(encode, StandardCharsets.UTF_8));
        String decodeParam = new String(Base64Utils.decode(encode), StandardCharsets.UTF_8);
        System.out.println(decodeParam);
        String abi = "";
        try {
            ObjectMapper objectMapper = ObjectMapperFactory.getObjectMapper();
            AbiDefinition[] abiDefinition = objectMapper.readValue(abi, AbiDefinition[].class);
            for(int i =0;i<abiDefinition.length;i++){
                AbiDefinition abiDefinitionTemp = abiDefinition[i];
                System.out.println("abi Name = [" + abiDefinitionTemp.getName() + "]");
                System.out.println("abi value = " + GsonUtil.gsonString(abiDefinitionTemp));
                //GsonUtil.gsonString(abiDefinitionTemp);
            }
          //  AbiDefinition abiDefinition = (AbiDefinition) ObjectJsonHelper.deserialize(abi, AbiDefinition.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
