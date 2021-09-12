package com.mocadev.fastcampus.abstractfactory.product.dao;

import com.mocadev.fastcampus.abstractfactory.product.Product;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2021-09-11
 **/
public interface ProductDao {

	void insertProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(Product product);

}
