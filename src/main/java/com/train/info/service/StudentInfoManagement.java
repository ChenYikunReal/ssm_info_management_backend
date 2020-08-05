package com.train.info.service;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface StudentInfoManagement {

    List<JSONObject> getInfo(String id);

}
