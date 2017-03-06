package com.java.tutorials.tests.filesTests;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileTestNet {

    private static final String FLOWERS_SEED = "http://services.hanselandpetal.com/feeds/flowers.xml";
    // for JSON parsing
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;

    public static void main(String[] args) throws IOException {

        InputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;

        try {
            URL url = new URL(FLOWERS_SEED);
            inputStream = url.openStream();
            bufferedInputStream = new BufferedInputStream(inputStream);

            StringBuilder stringBuilder = new StringBuilder();
            while (true) {
                int data = bufferedInputStream.read();
                if (data == -1) {
                    break;
                } else {
                    stringBuilder.append((char) data);
                }
            }


            FileTestNet fileTestNet = new FileTestNet();
            fileTestNet.parseFromXmlToJson(stringBuilder);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            bufferedInputStream.close();
        }



    }

    public void parseFromXmlToJson(StringBuilder stringBuilder) {
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(stringBuilder.toString());
            String jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            System.out.println(jsonPrettyPrintString);
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
    }

}
