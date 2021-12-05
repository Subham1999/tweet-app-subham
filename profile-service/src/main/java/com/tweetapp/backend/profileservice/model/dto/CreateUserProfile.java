package com.tweetapp.backend.profileservice.model.dto;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tweetapp.backend.profileservice.model.Gender;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CreateUserProfile {

	@NotBlank(message = "New user must enter first name.")
	private String firstName;

	private String lastName;

	@NotBlank(message = "New user must enter email.")
	private String email;

	@NotBlank(message = "New user must enter password.")
	private String password;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date dob;

	@NotNull(message = "New user must enter gender.")
	private Gender gender;
}
