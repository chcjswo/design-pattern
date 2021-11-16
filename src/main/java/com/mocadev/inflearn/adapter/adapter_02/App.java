package com.mocadev.inflearn.adapter.adapter_02;

import com.mocadev.inflearn.adapter.adapter_02.security.LoginHandler;
import com.mocadev.inflearn.adapter.adapter_02.security.UserDetailsService;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-16
 **/
public class App {

	public static void main(String[] args) {
		AccountService accountService = new AccountService();
		UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
		LoginHandler loginHandler = new LoginHandler(userDetailsService);
		final String login = loginHandler.login("chcjswo", "chcjswo");
		System.out.println("login = " + login);
	}

}
