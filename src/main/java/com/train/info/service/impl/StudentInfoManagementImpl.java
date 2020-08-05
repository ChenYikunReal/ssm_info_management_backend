package com.train.info.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.train.info.dao.StudentInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.train.info.service.StudentInfoManagement;

@Service
public class StudentInfoManagementImpl implements StudentInfoManagement {

    @Autowired
    private StudentInfoMapper studentInfoMapper;

}
