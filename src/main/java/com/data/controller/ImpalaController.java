package com.data.controller;

import com.alibaba.fastjson.JSON;
import com.data.model.Person;
import com.data.services.ImpalaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class ImpalaController {

    @Resource
    private ImpalaService impalaService;

    @GetMapping("/test")
    public String insertPerson() {
        Person person = new Person();
        person.setId(1);
        person.setName("张三");
        impalaService.executeSql(person);
        return "新增记录成功！"+ JSON.toJSONString(person);
    }


    @GetMapping("/all")
    public String getAll() {
        List<Person> people = impalaService.selectSql();
        //StringBuffer sb = new StringBuffer();
        //people.stream().forEach(person -> sb.append(JSON.toJSONString(person)));
        return JSON.toJSONString(people);

    }
}

