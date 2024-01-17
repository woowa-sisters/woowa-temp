package com.woowa.woowaback;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WoowaBackApplicationTests {

	@Test
	void contextLoads(String[] args) {
		System.out.println("server on");
		SpringApplication.run(WoowaBackApplication.class, args);
	}

}
