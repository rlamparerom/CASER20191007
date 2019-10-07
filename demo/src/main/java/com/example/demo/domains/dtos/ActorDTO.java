package com.example.demo.domains.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class ActorDTO {
	private int actorId;
	private String firstName;
	private String lastName;
}
