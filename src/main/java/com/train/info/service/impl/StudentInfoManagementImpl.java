package com.train.info.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.train.info.dao.StudentInfoMapper;
import com.train.info.pojo.StudentInfo;
import com.train.info.pojo.StudentInfoExample;
import com.train.info.service.StudentInfoManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentInfoManagementImpl implements StudentInfoManagement {

    @Autowired
    private StudentInfoMapper studentInfoMapper;

    @Override
    public List<JSONObject> getInfo(String id) {
        List<JSONObject> result = new ArrayList<>();
        StudentInfoExample example = new StudentInfoExample();
        StudentInfoExample.Criteria criteria = example.createCriteria();
        if (!"".equals(id) && id.matches("\\d+")) {
            criteria.andIdEqualTo(Integer.parseInt(id));
        }
        List<StudentInfo> list = studentInfoMapper.selectByExample(example);
        for (StudentInfo info : list) {
            JSONObject returnJson = (JSONObject) JSON.toJSON(info);
            result.add(returnJson);
        }
        return result;
    }

}
