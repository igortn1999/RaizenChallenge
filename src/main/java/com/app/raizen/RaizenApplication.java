package com.app.raizen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.app.raizen.models.SolarQuotaConstants;
import com.app.raizen.repositories.SolarQuotaConstantsRepository;

@SpringBootApplication
public class RaizenApplication {
	
	@Autowired
	private SolarQuotaConstantsRepository sqcr;
	
	@EventListener
	public void appReady(ApplicationReadyEvent event) {
		sqcr.save(new SolarQuotaConstants());
	}

	public static void main(String[] args) { 
		SpringApplication.run(RaizenApplication.class, args);
	}

}