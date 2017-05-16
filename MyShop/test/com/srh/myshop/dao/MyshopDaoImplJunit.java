package com.srh.myshop.dao;

import org.junit.Test;

import com.srh.myshop.model.UserLogin;
import com.srh.myshop.model.Users;
import com.srh.myshop.service.serviceImpl;

import junit.framework.TestCase;

public class MyshopDaoImplJunit extends TestCase{
	
	
	/*@Test
	public void testInsertDealers(){
		
		Dealers dealers = new Dealers();
		
		MyshopDaoImpl impl = new MyshopDaoImpl();
		
		dealers.setAddress("Bonhoeffer str. 13");
		dealers.setCompanyName("Netto");
		dealers.setCompanyNumber("TIN007");
		dealers.setCp1Name("Sachin");
		dealers.setCp1Phone("1234567890");
		dealers.setCp2Name("Prabhu");
		dealers.setCp2Phone("1234567890");
		dealers.setEmail("yanivc89@gmail.com");
		dealers.setPhone("9738340736");
		dealers.setRemarks("This is a shop to buy cheaper goods");
		impl.insertDealer(dealers);
		
		System.out.println("Hello");	
		
	}
	
	@Test
	public void testUpdateDealers(){
		
		Dealers dealers = new Dealers();
		
		MyshopDaoImpl impl = new MyshopDaoImpl();
		
		dealers.setCompanyId(1L);
		dealers.setAddress("Bonhoeffer str. 13");
		dealers.setCompanyName("Netto");
		dealers.setCompanyNumber("TIN007");
		dealers.setCp1Name("Baral");
		dealers.setCp1Phone("1234567890");
		dealers.setCp2Name("Prabhu");
		dealers.setCp2Phone("1234567890");
		dealers.setEmail("yanivc89@gmail.com");
		dealers.setPhone("9738340736");
		dealers.setRemarks("This is a shop to buy cheaper goods");
		impl.updateDealer(dealers);	
		
		System.out.println("Update Dealers");
		
		
	}
	
	@Test
	public void testInsertProducts(){
		Products prod = new Products();
		
		ProductsDaoImpl impl = new ProductsDaoImpl();
		prod.setProductCode(1001);
		prod.setCompanyId(1);
		prod.setProductCategoryId(1);
		prod.setBrandName("SRH");
		prod.setProductName("Test");
		prod.setProductQty("100g");
		prod.setBasicRate(10.50);
		prod.setTax(12.50);
		prod.setSellingRate(15.00);
		prod.setMinOrderQty(20);
		prod.setThresholdQty(5);
		prod.setProductStatus("Available");
		prod.setStatus("A");
		impl.insertNewProducts(prod);
		
		System.out.println("Inserted Product");
		
	}
}
	*/

	
	/*@Test
	public void testInsertHashedPwd(){
		
		Users users = new Users();
		
		DaoImpl impl = new DaoImpl();
		
		users.setUserId(1L);
		users.setFirstName("Anusha");
		users.setLastName("Nagaraj");
		users.setAddress("address1");
		users.setEmail("anusha@gmail.com");
		users.setTelephone("123645");
		users.setUserType("Purchase manager");
		users.setUserName("anushanagaraj");
		users.setPassword("test");
		
		
		impl.insertUsers(users);	
		
		System.out.println("Inserted Users");
	}*/
	
	/*@Test
	public void testInsertUsersLogin(){
		
		UserLogin userlogin= new UserLogin();
		
		DaoImpl impl = new DaoImpl();
		
		userlogin.setUserId(1L);
		userlogin.setUserName("Anusha");
		userlogin.setPassword("test");
		
		
		impl.insertUsersLogin(userlogin);	
		
		System.out.println("Inserted UsersLogin");
	}
	*/

	@Test
	public void testInsertHashedPwd(){
		
		Users users = new Users();
		
		serviceImpl impl = new serviceImpl();
		
		users.setUserId(1l);
		users.setFirstName("Anusha");
		users.setLastName("Nagaraj");
		users.setAddress("address1");
		users.setEmail("anusha@gmail.com");
		users.setTelephone("123645");
		users.setUserType("Purchase manager");
		users.setUserName("anushanagaraj");
		users.setPassword("test");
		
		
		String print= impl.insertHashedPwd(users);	
		
		System.out.println(print);
	}

	
}