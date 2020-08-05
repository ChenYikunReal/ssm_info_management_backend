package com.train.info.web;

import com.train.info.service.StudentGradeManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentGradeController {

    @Autowired
    private StudentGradeManagement management;

    Logger logger = LoggerFactory.getLogger(StudentGradeController.class);

}
