package com.mocadev.inflearn.adapter.adapter_02;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-11-16
 **/
public class AccountService {

	public Account findAccountByUsername(String username) {
		Account account = new Account();
		account.setName(username);
		account.setPassword(username);
		account.setEmail(username);
		return account;
	}

	public void createNewAccount(Account account) {

	}

	public void updateAccount(Account account) {

	}

}
