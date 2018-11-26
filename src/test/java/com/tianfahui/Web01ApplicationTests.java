//package com.tianfahui;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class Web01ApplicationTests {
//
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @Test
//    public void test02(){
//
//        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
//        TbkItemGetRequest req = new TbkItemGetRequest();
//        req.setFields("num_iid,title,pict_url,small_images,reserve_price,zk_final_price,user_type,provcity,item_url,seller_id,volume,nick");
//        req.setQ("女装");
//        req.setCat("16,18");
//        req.setItemloc("杭州");
//        req.setSort("tk_rate_des");
//        req.setIsTmall(false);
//        req.setIsOverseas(false);
//        req.setStartPrice(10L);
//        req.setEndPrice(10L);
//        req.setStartTkRate(123L);
//        req.setEndTkRate(123L);
//        req.setPlatform(1L);
//        req.setPageNo(123L);
//        req.setPageSize(20L);
//        TbkItemGetResponse rsp = client.execute(req);
//        System.out.println(rsp.getBody());
//    }
//
//    @Test
//    public void test01(){
//        List l = jdbcTemplate.queryForList("select * from tab_user");
//        System.out.println(l);
//    }
//
//}
