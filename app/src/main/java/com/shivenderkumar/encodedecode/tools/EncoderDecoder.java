package com.shivenderkumar.encodedecode.tools;

import java.util.Base64;

public class EncoderDecoder {

    public static String getEncodedString(String originalString){
        String encodedString = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        }

        System.out.println("ccccccc EncoderDecoder ENCODED STRING >> "+encodedString);
        return encodedString;
    }

    public static String getDecodedString(String originalString){
        byte[] decodedBytes = new byte[0];
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            decodedBytes = Base64.getDecoder().decode(originalString);
        }
        String decodedString = new String(decodedBytes);

        System.out.println("ccccccc EncoderDecoder DECODED STRING >> "+decodedString);
        return decodedString;
    }

}
