package com.mocadev.fastcampus.abstractfactory.userinfo.dao;

import com.mocadev.fastcampus.abstractfactory.userinfo.UserInfo;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-11
 **/
public interface UserInfoDao {

	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);

}
