package com.train.info.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.train.info.dao.StudentGradeMapper;
import com.train.info.pojo.StudentGrade;
import com.train.info.pojo.StudentGradeExample;
import com.train.info.service.StudentGradeManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentGradeManagementImpl implements StudentGradeManagement {

    @Autowired
    private StudentGradeMapper studentGradeMapper;

    @Override
    public List<JSONObject> getGrade(String id) {
        List<JSONObject> result = new ArrayList<>();
        StudentGradeExample example = new StudentGradeExample();
        StudentGradeExample.Criteria criteria = example.createCriteria();
        if (!"".equals(id) && id.matches("\\d+")) {
            criteria.andIdEqualTo(Integer.parseInt(id));
        }
        List<StudentGrade> list = studentGradeMapper.selectByExample(example);
        for (StudentGrade grade : list) {
            JSONObject returnJson = (JSONObject) JSON.toJSON(grade);
            result.add(returnJson);
        }
        return result;
    }

}
