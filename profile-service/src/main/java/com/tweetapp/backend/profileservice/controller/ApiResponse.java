package com.tweetapp.backend.profileservice.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ApiResponse {
	private boolean success;
	private String msg;
	private String last_action;
	private Object data;
}
