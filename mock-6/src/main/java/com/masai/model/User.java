package com.masai.model;

import java.time.LocalDate; 
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	@NotNull(message = "user name is mandatory")
	private String username;
	@NotNull(message = "password is mandatory")
	private String password;

	@Email(message = "email mandatory")
	private String email;

	@NotNull(message = "RoleType is mandatory")
	@Enumerated
	private RoleType role;

	private LocalDate registrationDate;

}
