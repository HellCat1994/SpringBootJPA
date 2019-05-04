package com.springboot.jpa.demo.dao;

import com.springboot.jpa.demo.pojo.BlogTest;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author whg
 */
public interface BlogMapper extends JpaRepository<BlogTest,String> {
}