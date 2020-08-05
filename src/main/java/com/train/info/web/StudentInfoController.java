package com.train.info.web;

import com.alibaba.fastjson.JSONObject;
import com.train.info.service.StudentInfoManagement;
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
public class StudentInfoController {

    @Autowired
    private StudentInfoManagement management;

    private Logger logger = LoggerFactory.getLogger(StudentInfoController.class);

    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    @ResponseBody
    public List<JSONObject> getInfo(String id) {
        logger.info("获取id为 " + ("".equals(id) ? "全部": id) + " 的学生信息");
        return management.getInfo(id);
    }

}
