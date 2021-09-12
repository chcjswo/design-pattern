package com.mocadev.fastcampus.abstractfactory.factory;

import com.mocadev.fastcampus.abstractfactory.product.dao.ProductDao;
import com.mocadev.fastcampus.abstractfactory.product.dao.oracle.ProductOracleDao;
import com.mocadev.fastcampus.abstractfactory.userinfo.dao.UserInfoDao;
import com.mocadev.fastcampus.abstractfactory.userinfo.dao.oracle.UserInfoOracleDao;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-11
 **/
public class OracleDaoFactory implements DaoFactory {

	@Override
	public UserInfoDao creatUserInfoDao() {
		return new UserInfoOracleDao();
	}

	@Override
	public ProductDao createProductDao() {
		return new ProductOracleDao();
	}

}
