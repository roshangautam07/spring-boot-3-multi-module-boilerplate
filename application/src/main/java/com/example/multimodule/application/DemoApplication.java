package com.example.multimodule.application;

import com.example.multimodule.core.CoreServices;
import com.example.multimodule.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")
@RestController
public class DemoApplication {

	private final MyService myService;
	private final CoreServices services;

	public DemoApplication(MyService myService,CoreServices services) {
		this.myService = myService;
		this.services = services;
	}

	@GetMapping("/")
	public String home() {
		return myService.message();
	}
	@GetMapping("/core")
	public String coreHome() {
		return services.message();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
