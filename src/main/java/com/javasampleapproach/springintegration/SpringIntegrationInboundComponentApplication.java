package com.javasampleapproach.springintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:http-inbound-adapter.xml", "classpath:http-inbound-gateway.xml"})
public class SpringIntegrationInboundComponentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationInboundComponentApplication.class, args);
	}
}
