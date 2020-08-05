package com.train.info.service;

import com.alibaba.fastjson.JSONObject;

import java.util.List;

public interface StudentGradeManagement {

    List<JSONObject> getGrade(String id);

}
