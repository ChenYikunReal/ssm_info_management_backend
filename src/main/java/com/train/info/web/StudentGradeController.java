package com.train.info.web;

import com.alibaba.fastjson.JSONObject;
import com.train.info.service.StudentGradeManagement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentGradeController {

    @Autowired
    private StudentGradeManagement management;

    private Logger logger = LoggerFactory.getLogger(StudentGradeController.class);

    @RequestMapping(value = "/getGrade", method = RequestMethod.GET)
    @ResponseBody
    public List<JSONObject> getInfo(String id) {
        logger.info("获取id为 " + ("".equals(id) ? "全部": id) + " 的学生成绩");
        return management.getGrade(id);
    }

}
