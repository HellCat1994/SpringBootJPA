package com.springboot.jpa.demo;

import com.springboot.jpa.demo.dao.BlogMapper;
import com.springboot.jpa.demo.dao.BlogSearchMapper;
import com.springboot.jpa.demo.pojo.BlogSearch;
import com.springboot.jpa.demo.pojo.BlogTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private BlogSearchMapper blogSearchMapper;
    @Autowired
    private BlogMapper blogMapper;
    @Test
    public void contextLoads() {
        BlogSearch blogSearch = blogSearchMapper.save(new BlogSearch("1", "2", "3"));
    }
    @Test
    public void test1(){
        List<BlogTest> all = blogMapper.findAll();
    }

}
