package com.mocadev.fastcampus.abstractfactory.factory;

import com.mocadev.fastcampus.abstractfactory.product.dao.ProductDao;
import com.mocadev.fastcampus.abstractfactory.product.dao.mysql.ProductMySqlDao;
import com.mocadev.fastcampus.abstractfactory.userinfo.dao.UserInfoDao;
import com.mocadev.fastcampus.abstractfactory.userinfo.dao.mysql.UserInfoMySqlDao;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-11
 **/
public class MysqlDaoFactory implements DaoFactory {

	@Override
	public UserInfoDao creatUserInfoDao() {
		return new UserInfoMySqlDao();
	}

	@Override
	public ProductDao createProductDao() {
		return new ProductMySqlDao();
	}

}
