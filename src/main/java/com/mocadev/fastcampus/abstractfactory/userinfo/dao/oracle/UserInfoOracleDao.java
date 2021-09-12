package com.mocadev.fastcampus.abstractfactory.userinfo.dao.oracle;

import com.mocadev.fastcampus.abstractfactory.userinfo.UserInfo;
import com.mocadev.fastcampus.abstractfactory.userinfo.dao.UserInfoDao;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-11
 **/
public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert to oracle userInfo.getUserInfoId() = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update to oracle userInfo.getUserInfoId() = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete to oracle product.getUserInfoId() = " + userInfo.getUserId());
	}

}
