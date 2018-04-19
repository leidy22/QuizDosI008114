package com.example.aula7.quizdosi008114.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by AULA 7 on 19/04/2018.
 */

public class HttpManager {
    public static String  getData(String url) throws IOException {

        BufferedReader bufferedReader;

        URL urlData = new URL(url);

        HttpURLConnection httpURLConnection = (HttpURLConnection) urlData.openConnection();

        StringBuilder stringBuilder = new StringBuilder();

        bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));

        String line;
        while ( (line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line + "\n");

        }

        return stringBuilder.toString();
    }
}




