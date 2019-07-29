package com.elastic.springelastic.config;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
//import org.elasticsearch.node.NodeBuilder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import com.elastic.springelastic.service.QueryDslService;

import ch.qos.logback.core.net.server.Client;

@Configuration()
@EnableElasticsearchRepositories(basePackages="com.elastic.springelastic.repository")
public class config{
   @Value("${elasticsearch.host:localhost}") 
    public String host;
    @Value("${elasticsearch.port:9300}") 
    public int port;
    public String getHost() {
return host;
}
public int getPort() {
return port;
    }
   
    @Bean
    public TransportClient client(){
        TransportClient client = null;
        try{
            System.out.println("host:"+ host+"port:"+port);
            client = new PreBuiltTransportClient(Settings.EMPTY)
            .addTransportAddress(new TransportAddress(InetAddress.getByName(host), port));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return client;
    }

	/*@Bean
	public NodeBuilder builder() {
		return new NodeBuilder();
	}*/
   /* @Bean
	public ElasticsearchOperations ElasticsearchTemplate() throws IOException {
		return new ElasticsearchTemplate(builder().local(true).node().client());
	}*/
    
    
}
