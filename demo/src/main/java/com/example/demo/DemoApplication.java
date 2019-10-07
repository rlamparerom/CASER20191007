package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domains.entities.Actor;
import com.example.demo.infraestructure.repositories.ActorRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Autowired
	ActorRepository actorDAO;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola mundo");
		
//		Optional<Actor> o = actorDAO.findById(1);
//		if(o.isPresent()) {
//			Actor actor = o.get();
//			System.out.println(o.get());
//			actor.setLastName("GUINESS");
//			actorDAO.save(actor);
//		} else {
//			System.out.println("No encontrado");
//		}
//		actorDAO.findAll().forEach(item -> System.out.println(item));
		actorDAO.findByActorIdBetweenOrderByFirstNameAsc(1, 10).forEach(item -> System.out.println(item));
		System.out.println("------------------------------");
		actorDAO.findByFirstName("ED").forEach(item -> System.out.println(item));
		System.out.println("------------------------------");
		actorDAO.findByLastNameEndingWith("SS").forEach(item -> System.out.println(item));
	}

}
