package com.A;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.A.Add.insertTest;
import static com.A.Add.insertarea;
import static com.alibaba.fastjson.JSONObject.*;
import static jdk.nashorn.internal.objects.NativeObject.keys;

public class Get {
    public static void Getcoun(String JsonData) throws JSONException, IOException {

        JSONObject object = parseObject(JsonData);

        String[] coun = {"China", "US", "United Kingdom", "Japan",};
        for (int i = 0; i < 4; i++) {
            Country country = new Country();
            JSONObject object1 = (JSONObject) object.get(coun[i]);

            Set<String> keySet= object1.keySet();
            for (String key : keySet) {
                if(key.equals("All")) {
                    System.out.print(object1.get(key));
                    System.out.println("####################################################");
                    JSONObject object2 = (JSONObject) object1.get(key);
                    country.setCountry ((String) object2.get("country"));
                    country.setPopulation(String.valueOf(object2.get("population")));
                    country.setSq_km_area(String.valueOf(object2.get("sq_km_area")));
                    country.setLife_expectancy((String) object2.get("life_expectancy"));
                    country.setElevation_in_meters(String.valueOf(object2.get("elevation_in_meters")));
                    country.setContinent((String) object2.get("continent"));
                    country.setAbbreviation((String) object2.get("abbreviation"));
                    country.setLocation((String) object2.get("location"));
                    country.setIso(String.valueOf(object2.get("iso")));
                    country.setCapital_city((String) object2.get("capital_city"));
                    country.setConfirmed(String.valueOf(object2.get("confirmed")));
                    country.setRecovered(String.valueOf(object2.get("recovered")));
                    country.setDeaths(String.valueOf(object2.get("deaths")));
                    System.out.println(country.toString());
                    insertTest(country);

                }
            }
        }



        }


    public static void Getarea(String JsonData) throws JSONException, IOException {

        JSONObject object = parseObject(JsonData);
        int id=0;
        String[] coun = {"China", "US", "United Kingdom", "Japan",};
        for (int i = 0; i < 4; i++) {
            Area area = new Area();
            JSONObject object1 = (JSONObject) object.get(coun[i]);

            Set<String> keySet= object1.keySet();

            for (String key : keySet) {
                if(key.equals("All")) {
                }
                else{
                    id++;
                    System.out.print(object1.get(key));
                    System.out.println("####################################################");
                    JSONObject object2 = (JSONObject) object1.get(key);
                    area.setName(String.valueOf(key));
                    area.setLat(String.valueOf(object2.get("lat")));
                    area.setLong(String.valueOf(object2.get("long")));
                    area.setConfirmed(String.valueOf(object2.get("confirmed")));
                    area.setRecovered(String.valueOf(object2.get("recovered")));
                    area.setDeaths(String.valueOf(object2.get("deaths")));
                    area.setUpdated(String.valueOf(object2.get("updated")));
                    area.setId(String.valueOf(id));
                    System.out.println(area.toString());
                    insertarea(area);

                }
            }
        }



    }












    }

