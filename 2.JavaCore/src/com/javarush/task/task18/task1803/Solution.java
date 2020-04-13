package com.javarush.task.task18.task1803;

/* 
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        byte[] bytes = new byte[255];
        byte byteHigh;
        while (inputStream.available() > 0) {
            byteHigh = (byte)inputStream.read();
            bytes[byteHigh] += 1;
        }

        int maxValue = bytes[0];

        for (byte b : bytes) {
            int tmpData = b;
            if (tmpData > maxValue) maxValue = tmpData;
        }

        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == maxValue) System.out.print(i + " ");
        }

        inputStream.close();

    }
}
