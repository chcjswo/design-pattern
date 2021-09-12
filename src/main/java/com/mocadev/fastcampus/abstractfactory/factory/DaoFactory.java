package com.mocadev.fastcampus.abstractfactory.factory;

import com.mocadev.fastcampus.abstractfactory.product.dao.ProductDao;
import com.mocadev.fastcampus.abstractfactory.userinfo.dao.UserInfoDao;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-11
 **/
public interface DaoFactory {

	UserInfoDao creatUserInfoDao();
	ProductDao createProductDao();

}
