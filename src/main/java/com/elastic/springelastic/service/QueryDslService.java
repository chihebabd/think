package com.elastic.springelastic.service;
import java.util.List;

import org.elasticsearch.index.query.MultiMatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import com.elastic.springelastic.model.pts_ticket;
@Service
public class QueryDslService {
	@Autowired
	private ElasticsearchTemplate template;

	public List<pts_ticket> searchMultiField(String desc) {
		QueryBuilder query = QueryBuilders.boolQuery().must(QueryBuilders.matchQuery("short_description", desc));
				
				
		NativeSearchQuery nativeSearchQuery = new NativeSearchQueryBuilder().withQuery(query).build();
		List<pts_ticket> customers = template.queryForList(nativeSearchQuery, pts_ticket.class);
		return customers;
	}


}
