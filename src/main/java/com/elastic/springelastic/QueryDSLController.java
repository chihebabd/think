package com.elastic.springelastic;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elastic.springelastic.model.pts_ticket;
import com.elastic.springelastic.service.QueryDslService;
@RestController
public class QueryDSLController {

	@Autowired
	private QueryDslService service;
	 @Autowired
	 private ElasticsearchTemplate esTemplate;

	 
	

	 @RequestMapping(value="/serachMultiField/{short_description}", method=RequestMethod.GET)
	public List<pts_ticket> serachByMultiField(@PathVariable ("short_description") String desc ) {
		return service.searchMultiField(desc);
	}

	

}


