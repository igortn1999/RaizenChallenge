package com.app.raizen;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.app.raizen.models.Constants;
import com.app.raizen.models.Provider;
import com.app.raizen.models.User;
import com.app.raizen.repositories.ConstantsRepository;
import com.app.raizen.repositories.ProviderRepository;
import com.app.raizen.repositories.UserRepository;

@SpringBootApplication
public class RaizenApplication {
	
	@Autowired
	private UserRepository ur;
	
	@Autowired
	private ConstantsRepository sqcr;
	
	@Autowired
	private ProviderRepository pr;
	
	@EventListener
	public void appReady(ApplicationReadyEvent event) {
		
		if(sqcr.findAll().isEmpty() && pr.findAll().isEmpty() && ur.findAll().isEmpty()) {
			
			mockUser("raizenadmin", "raizenadmin",
					"Raizen", "Admin",
					"08070508000178", "canaldeetica@raizen.com",
					null, "+55 11 2344-6200");
			
			sqcr.save(new Constants());
			
			mockProvider("Raízen", null,
					"08070508000178", "canaldeetica@raizen.com",
					"Instalação/Venda", "+55 11 2344-6200");
			
			mockProvider("WEG", null,
					"11111111111111", "weg@ficticio.com.br",
					"Instalação", "+55 11 1234-4321");
			
			mockProvider("Bosch", null,
					"22222222222222", "bosch@ficticio.com.br",
					"Instalação", "+55 11 1234-5678");
		}
		
	}

	public static void main(String[] args) { 
		SpringApplication.run(RaizenApplication.class, args);
	}
	
	private void mockUser(String username, String password, String name, String surename, String cpfCnpj, String email, Date birthday, String telephone) {
		User user = new User();
		
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setSurename(surename);
		user.setCpfcnpj(cpfCnpj);
		user.setEmail(email);
		user.setBirthday(birthday);
		user.setTelephone(telephone);
		
		ur.save(user);
		
	}
	
	private void mockProvider(String name, String surename, String cpfCnpj, String email, String service_type, String telephone){
		Provider provider = new Provider();
		
		provider.setName(name);
		provider.setSurename(surename);
		provider.setCpfcnpj(cpfCnpj);
		provider.setEmail(email);
		provider.setService_type(service_type);
		provider.setTelephone(telephone);
		
		pr.save(provider);
		
	}
	
	public static String encrypt(String string){
		
		return com.google.common.hash.Hashing.sha256()
						.hashString(string, StandardCharsets.UTF_8)
						.toString();
		
	}
}