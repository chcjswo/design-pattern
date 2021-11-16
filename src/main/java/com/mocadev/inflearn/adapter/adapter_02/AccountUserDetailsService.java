package com.mocadev.inflearn.adapter.adapter_02;

import com.mocadev.inflearn.adapter.adapter_02.security.UserDetails;
import com.mocadev.inflearn.adapter.adapter_02.security.UserDetailsService;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-16
 **/
public class AccountUserDetailsService implements UserDetailsService {

	AccountService accountService;

	public AccountUserDetailsService(
		AccountService accountService) {
		this.accountService = accountService;
	}

	@Override
	public UserDetails loadUser(
		String username) {
		final Account account = accountService.findAccountByUsername(username);
		return new AccountUserDetails(account);
	}

}
