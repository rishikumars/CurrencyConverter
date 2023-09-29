package com.Rishi;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import java.io.IOException;

public class CurrencyConvert {
    public static double convert(String c1, String c2) throws IOException {
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("https://free.currencyconverterapi.com/api/v5/convert?q=" + c1.toUpperCase() + "_" + c2.toUpperCase() + "&compact=ultra");
        HttpResponse httpResponse = httpClient.execute(httpGet);
        HttpEntity entity = httpResponse.getEntity();
        String responseString = EntityUtils.toString(entity, "UTF-8");
        JSONObject jsonObjectValue = new JSONObject(responseString);
        Double value = jsonObjectValue.getDouble(c1.toUpperCase() + "_" + c2.toUpperCase());
        return value;
    }

    public static double convert(int n, String c1, String c2) throws IOException
    {
        HttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("https://free.currencyconverterapi.com/api/v5/convert?q=" + c1.toUpperCase() + "_" + c2.toUpperCase() + "&compact=ultra");
        HttpResponse httpResponse = httpClient.execute(httpGet);
        HttpEntity entity = httpResponse.getEntity();
        String responseString = EntityUtils.toString(entity, "UTF-8");
        JSONObject jsonObject = new JSONObject(responseString);
        double value = jsonObject.getDouble(c1.toUpperCase() + "_" + c2.toUpperCase());
        return value*n;

    }}

