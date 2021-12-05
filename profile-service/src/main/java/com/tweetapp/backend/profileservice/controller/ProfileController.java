package com.tweetapp.backend.profileservice.controller;

import java.util.Collections;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweetapp.backend.profileservice.model.dto.CreateUserProfile;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

	private static final String MSG_SUCCESS = "Last Action Done";
	private static final String MSG_FAILED = "Last Action Failed";
	private static final String MSG_WARNING = "Last Action Warning";

	private ApiResponse apiResponse(boolean success, String msg, String last_action, Object data) {
	// @formatter:off
		ApiResponse apiResponse = ApiResponse.builder()
				.data(data)
				.last_action(last_action)
				.success(success)
				.msg(msg)
				.build();
		return apiResponse;
	// @formatter:on
	}

	@GetMapping("")
	public ApiResponse getAllProfiles() {
		return apiResponse(true, MSG_SUCCESS, "GET ALL PROFILE", Collections.EMPTY_LIST);
	}

	@PostMapping
	public ApiResponse createNewUserProfile(@Valid @RequestBody CreateUserProfile createUserProfile) {
		return apiResponse(true, MSG_SUCCESS, "CREATE NEW PROFILE", createUserProfile);
	}
}
