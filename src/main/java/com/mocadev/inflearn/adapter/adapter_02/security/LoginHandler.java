package com.mocadev.inflearn.adapter.adapter_02.security;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-16
 **/
public class LoginHandler {

	UserDetailsService userDetailsService;

	public LoginHandler(
		UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	public String login(String username, String password) {
		final UserDetails userDetails = userDetailsService.loadUser(username);
		if (userDetails.getUsername().equals(password)) {
			return userDetails.getUsername();
		}
		throw new IllegalArgumentException();
	}

}
