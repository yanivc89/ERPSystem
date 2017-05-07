package com.srh.myshop.dao;

import org.junit.Test;

import com.srh.myshop.model.Dealers;

import junit.framework.TestCase;

public class MyshopDaoImplJunit extends TestCase{
	
	@Test
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
}
	

