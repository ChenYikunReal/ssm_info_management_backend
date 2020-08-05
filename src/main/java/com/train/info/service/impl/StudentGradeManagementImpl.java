package com.train.info.service.impl;

import com.train.info.dao.StudentGradeMapper;
import com.train.info.service.StudentGradeManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentGradeManagementImpl implements StudentGradeManagement {

    @Autowired
    private StudentGradeMapper studentGradeMapper;

}
