package com.elastic.springelastic.repositroy;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.web.bind.annotation.RestController;

import com.elastic.springelastic.model.pts_ticket;
@SpringBootApplication
@RestController
public interface ptsRepository extends ElasticsearchRepository<pts_ticket, Long> {

	

}
