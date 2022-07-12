package com.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.List;

/**
 * @author 黄建胜
 */
public class Json {

    /**
     * 格式化Json
     * @param list 传入的列表
     * @return 格式化后的json,包括code,msg,count,data
     */
    public static String setJson(List list){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>(100);
        String s = null;
        ObjectMapper objectMapper1 = new ObjectMapper();
        objectObjectHashMap.put("code", 0);
        objectObjectHashMap.put("msg", "请求数据中");
        objectObjectHashMap.put("count", list.size());
        objectObjectHashMap.put("data", list);
        try {
            s = objectMapper1.writeValueAsString(objectObjectHashMap);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static String setJson(String pages,List list){
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>(100);
        String s = null;
        ObjectMapper objectMapper1 = new ObjectMapper();
        objectObjectHashMap.put("code", 0);
        objectObjectHashMap.put("msg", "请求数据中");
        objectObjectHashMap.put("pages", pages);
        objectObjectHashMap.put("data", list);
        try {
            s = objectMapper1.writeValueAsString(objectObjectHashMap);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return s;
    }

}
