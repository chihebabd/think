package com.elastic.springelastic;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elastic.springelastic.model.pts_ticket;
import com.elastic.springelastic.repositroy.ptsRepository;





@SpringBootApplication
@RestController
public class SpringElasticApplication {
	@Autowired
	private ptsRepository repository;
	@GetMapping("/findAll")
	public Iterable<pts_ticket> findAllCustomers() {
		return repository.findAll();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringElasticApplication.class, args);
	}	

}
