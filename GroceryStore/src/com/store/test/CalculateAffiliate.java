package com.store.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.store.beans.Product;
import com.store.beans.ProductType;
import com.store.beans.User;
import com.store.beans.UserType;
import com.store.service.IRetailWebsite;
import com.store.service.RetailWebsite;


public class CalculateAffiliate {
	@Test
	void test() {
		IRetailWebsite retail=new RetailWebsite();
		List<Product> list=new ArrayList<Product>();
		Product product=new Product();
		Product product1=new Product();
		User user=new User();
		user.setUserId(2);
		user.setUserName("kiran");
		user.setUsertype(UserType.AFFILLIATE);
		user.setRegistrationDate(LocalDate.now());
		product.setProductId(50);
		product.setProductName("tomato");
		product.setProductType(ProductType.GROCERIES);
		product.setQuantity(10);
		product.setRatePerQuantity(10);
		list.add(product);
		product1.setProductId(100);
		product1.setProductName("cotton");
		product1.setProductType(ProductType.CLOTHING);
		product1.setQuantity(10);
		product1.setRatePerQuantity(10);
		list.add(product1);
		user.setProduct(list);
		double bill=retail.calculateBill(user);
		System.out.println(bill);
		assertEquals(185, bill);

}
}
