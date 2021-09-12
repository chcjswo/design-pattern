package com.mocadev.fastcampus.abstractfactory.product.dao.oracle;

import com.mocadev.fastcampus.abstractfactory.product.Product;
import com.mocadev.fastcampus.abstractfactory.product.dao.ProductDao;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-11
 **/
public class ProductOracleDao implements ProductDao {

	@Override
	public void insertProduct(Product product) {
		System.out.println("insert to oracle product.getProductId() = " + product.getProductId());
	}

	@Override
	public void updateProduct(Product product) {
		System.out.println("update to oracle product.getProductId() = " + product.getProductId());
	}

	@Override
	public void deleteProduct(Product product) {
		System.out.println("delete to oracle product.getProductId() = " + product.getProductId());
	}

}
