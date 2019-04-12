package com.example.vosungconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @EnableConfigServer 开启spring cloud config 得服务端功能
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class VosungConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VosungConfigServerApplication.class, args);
	}

}
