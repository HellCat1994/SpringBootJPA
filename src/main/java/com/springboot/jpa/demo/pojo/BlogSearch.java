package com.springboot.jpa.demo.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import java.io.Serializable;

/**
 * @author whg
 */
@Data
@Document(indexName = "blog_search")
public class BlogSearch implements Serializable {
    @Id
    private String id;
    @Field
    private String title;
    @Field
    private String summary;
    @Field
    private String content;
    public BlogSearch() {
    }
    public BlogSearch(String title, String summary, String content) {
        this.title = title;
        this.summary = summary;
        this.content = content;
    }
}

