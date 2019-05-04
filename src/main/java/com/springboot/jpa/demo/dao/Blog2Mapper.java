package com.springboot.jpa.demo.dao;

import com.springboot.jpa.demo.pojo.BlogTestTwo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Blog2Mapper extends JpaRepository<BlogTestTwo,String> {
}
