package com.springboot.jpa.demo.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author whg
 */
@Entity
@Data
@Table(name = "blog_test_two")
public class BlogTestTwo {
    @Id
    private int id;
    @Column(length = 100)
    private String name;
    @Column(length = 100)
    private String hobbies;
    @Column(length = 5)
    private int age;
    public BlogTestTwo() {
    }
    public BlogTestTwo(String name, String hobbies, int age) {
        this.name = name;
        this.hobbies = hobbies;
        this.age = age;
    }
}
