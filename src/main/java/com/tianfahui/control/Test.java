package com.tianfahui.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @Autowired
    JdbcTemplate jdbcTemplate;

//    @RequestMapping(value="/")
    public Object test01(){
        return jdbcTemplate.queryForList("select * from tab_user");
    }


}
