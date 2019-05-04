package com.springboot.jpa.demo.dao;

import com.springboot.jpa.demo.pojo.BlogSearch;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author whg
 */
@Repository
public interface BlogSearchMapper extends ElasticsearchRepository<BlogSearch,String> {

}
