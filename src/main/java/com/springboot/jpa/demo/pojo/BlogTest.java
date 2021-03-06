package com.springboot.jpa.demo.pojo;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

/**
 * @author whg
 */
@Entity
@Data
@Table(name = "blog_test")
public class BlogTest {
    @Id
    private int id;
    @Column(length = 100)
    private String name;
    @Column(length = 100)
    private String hobbies;
    @Column(length = 5)
    private int age;
    public BlogTest() {
    }
    public BlogTest(String name, String hobbies, int age) {
        this.name = name;
        this.hobbies = hobbies;
        this.age = age;
    }
}
