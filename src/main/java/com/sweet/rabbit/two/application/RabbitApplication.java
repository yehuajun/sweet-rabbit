package com.sweet.rabbit.two.application;

import com.sweet.rabbit.two.config.RabbitConfig;
import com.sweet.rabbit.two.recv.Receiver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {
		RabbitConfig.class,
		Receiver.class
})
public class RabbitApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitApplication.class, args);
	}
}
