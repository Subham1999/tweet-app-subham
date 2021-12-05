package com.tweetapp.backend.profileservice.model.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tweetapp.backend.profileservice.model.Gender;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ViewUserProfile {

	private long id;

	private String firstName;

	private String lastName;

	private String email;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date dob;

	private Gender gender;
}
