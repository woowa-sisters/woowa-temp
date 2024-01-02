package com.woowa.woowaback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WoowaBackApplication {

	public static void main(String[] args) {
		System.out.println("server on");
		SpringApplication.run(WoowaBackApplication.class, args);
	}

}
