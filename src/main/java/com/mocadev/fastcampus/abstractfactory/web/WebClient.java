package com.mocadev.fastcampus.abstractfactory.web;

import com.mocadev.fastcampus.abstractfactory.factory.DaoFactory;
import com.mocadev.fastcampus.abstractfactory.factory.MysqlDaoFactory;
import com.mocadev.fastcampus.abstractfactory.factory.OracleDaoFactory;
import com.mocadev.fastcampus.abstractfactory.product.Product;
import com.mocadev.fastcampus.abstractfactory.product.dao.ProductDao;
import com.mocadev.fastcampus.abstractfactory.userinfo.UserInfo;
import com.mocadev.fastcampus.abstractfactory.userinfo.dao.UserInfoDao;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-11
 **/
public class WebClient {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		String propFileName = "db.properties";
		InputStream inputStream = WebClient.class.getClassLoader().getResourceAsStream(propFileName);
		prop.load(inputStream);
		String dbtype = prop.getProperty("dbtype");

		UserInfo userInfo = new UserInfo("123", "!!!!", "이순신");
		Product product = new Product("00AA", "TV");

		DaoFactory daoFactory = null;
		if (dbtype.equals("mysql")) {
			daoFactory = new MysqlDaoFactory();
		} else if (dbtype.equals("oracle")) {
			daoFactory = new OracleDaoFactory();
		} else {
			System.out.println("dbtype load error");
			return;
		}

		UserInfoDao userInfoDao = daoFactory.creatUserInfoDao();
		System.out.println("===== UserInfo Transaction ===");
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);

		ProductDao productDao = daoFactory.createProductDao();
		System.out.println("===== Product Transaction ===");
		productDao.insertProduct(product);
		productDao.updateProduct(product);
		productDao.deleteProduct(product);
	}

}
