package com.cpw.maps;

import com.alibaba.fastjson.JSONObject;
import com.cpw.entry.Person;

import java.util.HashMap;

public class MapSearch {
    public  static String name;
    static {
        name="zs";
    }

    public static void main(String[] args) {
        Person person = new Person("jack", "11", "tj", "男");
        HashMap<String, Object> hashMap = new HashMap<>();
        if (person == null) {

        }
        hashMap.put("name","jack");
        hashMap.put("age","12");
        JSONObject jsonObject = new JSONObject(hashMap);
        System.out.println(jsonObject.toString());


    }
}
