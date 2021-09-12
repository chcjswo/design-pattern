package com.mocadev.fastcampus.abstractfactory.product.dao.mysql;

import com.mocadev.fastcampus.abstractfactory.product.Product;
import com.mocadev.fastcampus.abstractfactory.product.dao.ProductDao;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-11
 **/
public class ProductMySqlDao implements ProductDao {

	@Override
	public void insertProduct(Product product) {
		System.out.println("insert to mysql product.getProductId() = " + product.getProductId());
	}

	@Override
	public void updateProduct(Product product) {
		System.out.println("update to mysql product.getProductId() = " + product.getProductId());
	}

	@Override
	public void deleteProduct(Product product) {
		System.out.println("delete to mysql product.getProductId() = " + product.getProductId());
	}

}
