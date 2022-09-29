package com.app.raizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.app.raizen.models.Constants;
import com.app.raizen.repositories.ConstantsRepository;

@SpringBootApplication
public class RaizenApplication {
	
	@Autowired
	private ConstantsRepository sqcr;
	
	@EventListener
	public void appReady(ApplicationReadyEvent event) {
		sqcr.save(new Constants());
	}

	public static void main(String[] args) { 
		SpringApplication.run(RaizenApplication.class, args);
	}

}