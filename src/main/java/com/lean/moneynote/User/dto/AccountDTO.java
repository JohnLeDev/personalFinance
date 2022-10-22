package com.lean.moneynote.User.dto;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AccountDTO {
	
	private Integer id;
	@NotNull(message = " name cannot be null ")
	private String name;
	
	private Long initialBalance;
	
	private Date dob;
	
	@NotNull(message = " password cannot be null ")
	private String password;
	
	private String username;
	
	@NotNull(message = " email cannot be null ")
	@Email(message = "Email should be valid")
	private String email;
	
}
