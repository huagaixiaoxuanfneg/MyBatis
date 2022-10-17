package com.cx;

import com.alibaba.fastjson.JSONArray;
import lombok.Data;

@Data
public class Person {
    private Integer id;

    private String name;

    private Integer age;

    private Integer score;

    private JSONArray record;


}
