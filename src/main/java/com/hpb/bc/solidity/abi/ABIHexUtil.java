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

package com.hpb.bc.solidity.abi;

import com.hpb.bc.solidity.abienum.DirectionEnum;
import org.bouncycastle.util.encoders.*;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

import org.apache.commons.lang3.StringUtils;

public class ABIHexUtil {


    /*
     *
     * General functions
     *
     *
     * */


    /*
     *
     *
     *
     *
     * */


    //Alias for Hex32ToSignedBigInt()
    public static BigInteger Hex32ToInt(String hex) {
        return Hex32ToSignedBigInt(hex);
    }

    //Alias for Hex32ToUnsignedBigInt
    public static BigInteger Hex32ToUInt(String hex) {
        return Hex32ToUnsignedBigInt(hex);
    }

    public static boolean Hex32ToBool(String hex) {
        int boolVal = Hex32ToInteger(hex);
        return boolVal == 1 ? true : false;
    }

    public static String Hex32ToString(String hex, int byteLength) {
        String hexParsed = hex.substring(0, byteLength * 2);
        //System.out.println("hexPARSED" + hexParsed);
        try {
            //System.out.println(Hex.decode(hexParsed.getBytes()));
            return new String(Hex.decode(hexParsed.getBytes()), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
        //return null;
    }

    /*
     * Utility functions for hex to type conversions
     *
     * */
    public static BigInteger Hex32ToSignedBigInt(String hex) {
        return new BigInteger(Hex.decode(hex));
    }

    public static BigInteger Hex32ToUnsignedBigInt(String hex) {
        return new BigInteger(hex, 16);
    }

    public static int Hex32ToInteger(String hex) {
        return Integer.parseInt(hex, 16);
    }

    public static String Hex32ToBytes(String hex) {
        return hex.indexOf("0x") == 0 ? hex : "0x" + hex;
    }


    /*
     *
     * Short-hand type to 32-bit hex
     *
     *
     * */


    public static String intToHex32(BigInteger integer) {
        return padTo32Bytes(intToHex(integer), DirectionEnum.LEFT);
    }

    public static String uIntToHex32(BigInteger integer) {
        return padTo32Bytes(uIntToHex(integer), DirectionEnum.LEFT);
    }

    public static String boolToHex32(boolean bool) {
        return padTo32Bytes(boolToHex(bool), DirectionEnum.LEFT);
    }

    public static String addressToHex32(String str) {
        //Should perhaps add a "protection" clause here, should the string be over 66 chars, for example
        return bytesToHex32(str);
    }

    public static String bytesToHex32(String str) {
        //Should perhaps add a "protection" clause here, should the string be over 66 chars, for example
        return str.indexOf("0x") == 0 ? padTo32Bytes(str.trim().substring(2), DirectionEnum.LEFT) : padTo32Bytes(str.trim(), DirectionEnum.LEFT);
    }

    public static String stringToHex32(String str) {
        return padTo32Bytes(stringToHex(str), DirectionEnum.RIGHT);
    }


    /*
     *
     *
     * TYPE TO HEX CONVERSION FUNCTIONS
     *
     *
     * */


    public static String intToHex(BigInteger integer) {
        return signedBigIntToHex(integer);
    }

    public static String uIntToHex(BigInteger integer) {
        return unsignedBigIntToHex(integer);
    }

    public static String boolToHex(boolean bool) {
        return bool == true ? "1" : "0";
    }

    public static String stringToHex(String str) {
        return new String(Hex.encode(str.getBytes()));
    }


    //////////////////
    //INCOMPLETE: DON'T USE
    public static String signedBigIntToHex(BigInteger integer) {
        //if
        if (integer.signum() == -1) {
            byte[] ass = integer.negate().toByteArray();
            byte[] total = new byte[32];
            System.arraycopy(new byte[32 - ass.length], 0, total, 0, 32 - ass.length);
            System.arraycopy(ass, 0, total, 32 - ass.length, ass.length);

            //total = ~total;
            //Flip the shit
            StringBuffer result = new StringBuffer();
            for (byte b : total) {
                result.append(String.format("%02X", ~b));
            }
            System.out.println("ANAL " + result.toString());

        }
        System.out.println("FUCK: " + integer.bitLength());

        //BigInt to Binary //toString(2)
        String binary = integer.toString(2);
        //Twi's complement of binary
        //binary to hex bytes
        //bytestostring

        byte[] bytes = {9, 10, 11, 15, 16};
        StringBuffer result = new StringBuffer();
        for (byte b : bytes) {
            result.append(String.format("%02X ", b));
            result.append(" "); // delimiter
        }
        System.out.println(result.toString());

        return new String(Hex.encode(integer.toByteArray()));
    }

    public static String unsignedBigIntToHex(BigInteger integer) {
        return new BigInteger(integer.toString(), 16).toString();
    }


    /*
     *
     *
     * BYTE PADDING FUNCTIONS
     *
     *
     * */


    public static String padTo32Bytes(String hexStr, DirectionEnum direction) {
        return padToBytes(hexStr, 32, direction);
    }

    public static String padToBytes(String hexStr, int byteNum, DirectionEnum direction) {
        return padBytes(hexStr, 2 * byteNum, direction);
    }

    public static String padBytes(String hexStr, int byteLength, DirectionEnum direction) {
        int length = hexStr.length();
        int padding = byteLength - length;

        if (direction == DirectionEnum.LEFT) {
            return StringUtils.repeat('0', padding) + hexStr;
        } else if (direction == DirectionEnum.RIGHT) {
            return hexStr + StringUtils.repeat('0', padding);
        } else {
            return null;
        }
    }

}
