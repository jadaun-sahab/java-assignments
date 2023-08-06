package com.masai.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email is not valid")
    private String email;
    
    @NotNull(message = "Age is mandatory")
    @Min(value = 15, message = "Age must be greater than or equal to 15")
    private Integer age;
    
    @NotBlank(message = "Password is mandatory")
    private String password;
    
    @NotBlank(message = "Phone is mandatory")
    private String phone;
    
    @NotBlank(message = "Address is mandatory")
    private String address;

    
    
	public User() {
		super();
	}



	public User(Long userId, @NotBlank(message = "Name is mandatory") String name,
			@NotBlank(message = "Email is mandatory") @Email(message = "Email is not valid") String email,
			@NotNull(message = "Age is mandatory") @Min(value = 16, message = "Age must be greater than or equal to 16") Integer age,
			@NotBlank(message = "Password is mandatory") String password,
			@NotBlank(message = "Phone is mandatory") String phone,
			@NotBlank(message = "Address is mandatory") String address) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.age = age;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
   
}