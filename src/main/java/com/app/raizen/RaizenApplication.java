package com.app.raizen;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.app.raizen.models.Address;
import com.app.raizen.models.Constants;
import com.app.raizen.models.Device;
import com.app.raizen.models.Provider;
import com.app.raizen.models.User;
import com.app.raizen.repositories.AddressRepository;
import com.app.raizen.repositories.ConstantsRepository;
import com.app.raizen.repositories.DeviceRepository;
import com.app.raizen.repositories.ProviderRepository;
import com.app.raizen.repositories.UserRepository;

@SpringBootApplication
public class RaizenApplication {
	
	@Autowired
	private UserRepository ur;
	
	@Autowired
	private ConstantsRepository cr;
	
	@Autowired
	private ProviderRepository pr;
	
	@Autowired
	private DeviceRepository dr;
	
	@Autowired
	private AddressRepository ar;
	
	@EventListener
	public void appReady(ApplicationReadyEvent event) {
		
		if(ur.findAll().isEmpty() 
				&& cr.findAll().isEmpty()
				&& pr.findAll().isEmpty() 
				&& dr.findAll().isEmpty()
				&& ar.findAll().isEmpty()) {
			
			User user = mockUser("raizenadmin", "raizenadmin",
					"Raizen", "Admin",
					"08070508000178", "canaldeetica@raizen.com",
					null, "+55 11 2344-6200");
			
			cr.save(new Constants());
			
			mockProvider("Lucas", "Santos",
					"18374836509", "lsantos@ficticio.com",
					"Instalação", "+55 11 8877-6655");
			
			mockProvider("Roberto", "Matos",
					"09647365037", "robmatos@ficticio.com.br",
					"Manutenção", "+55 11 1234-4321");
			
			mockProvider("João", "Silva",
					"9363825036", "silvajoao@ficticio.com.br",
					"Instalação", "+55 11 1234-5678");
			
			mockAddress("01547000", "SP",
						"São Paulo", "Jardim da Glória",
						"Rua Cláudio Rossi", 572, "Casa", user);
			
			Address addr = mockAddress("04618030", "SP",
							"São Paulo", "Campo Belo",
							"Rua Edison", 200, "Ap. 54", user);
			
			mockDevice("Painel Solar", 65.0, null, addr);
		}
		
	}

	public static void main(String[] args) { 
		SpringApplication.run(RaizenApplication.class, args);
	}
	
	private User mockUser(String username, String password, String name, String surename, String cpfCnpj, String email, Date birthday, String telephone) {
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
		
		return user;
		
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
	
	private Address mockAddress(String zip_code, String state, String city, String neighborhood, String street, int number, String complement, User user) {
		Address address = new Address();
		
		address.setZip_code(zip_code);
		address.setState(state);
		address.setCity(city);
		address.setNeighborhood(neighborhood);
		address.setStreet(street);
		address.setNumber(number);
		address.setComplement(complement);
		address.setUser(user);
		
		ar.save(address);
		
		return address;
	}
	
	private void mockDevice(String name, double consumption, Date date, Address address) {
		Device device = new Device();
		
		device.setName(name);
		device.setConsumption(consumption);
		device.setLast_maintenance(date);
		device.setAddress(address);
		
		dr.save(device);
	}
	
	public static String encrypt(String string){
		
		return com.google.common.hash.Hashing.sha256()
						.hashString(string, StandardCharsets.UTF_8)
						.toString();
		
	}
}