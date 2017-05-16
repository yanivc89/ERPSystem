package com.srh.myshop.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.srh.myshop.model.Products;

public class ProductsDaoImpl {
	private NamedParameterJdbcTemplate getNamedJdbcTemplate(){
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		NamedParameterJdbcTemplate namedJdbcTemplate = (NamedParameterJdbcTemplate) appContext.getBean("namedParameterJdbcTemplate");
		
		return namedJdbcTemplate;
	}
	
	private JdbcTemplate getJdbcTemplate(){
		

		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		JdbcTemplate jdbcTemplate = (JdbcTemplate) appContext.getBean("jdbcTemplate");
		
		return jdbcTemplate;
	}
	
	public void insertNewProducts(Products prod){
		
		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();
		
		String sql = "INSERT INTO ERP_TBL_PRODUCTS (product_code, company_id, product_category_id, brand_Name, product_name, product_quantity, basic_rate, tax, selling_rate, min_order_quantity, threshold_quantity, product_status, status) VALUES (:productCode, :companyId, "
							+ ":productCategoryId, :brandName, :productName, :productQty, :basicRate, :tax, "
							+ ":sellingRate, :minOrderQty, :thresholdQty, :productStatus, "
							+ ":status )";
		
		Map<String, String> insertMap = new HashMap<String, String>();
		insertMap.put("productCode", String.valueOf(prod.getProductCode()));
		insertMap.put("companyId", String.valueOf(prod.getCompanyId()));
		insertMap.put("productCategoryId", String.valueOf(prod.getProductCategoryId()));
		insertMap.put("brandName", prod.getBrandName());
		insertMap.put("productName", prod.getProductName());
		insertMap.put("productQty", prod.getProductQty());
		insertMap.put("basicRate", String.valueOf(prod.getBasicRate()));
		insertMap.put("tax", String.valueOf(prod.getTax()));
		insertMap.put("sellingRate", String.valueOf(prod.getSellingRate()));
		insertMap.put("minOrderQty", String.valueOf(prod.getMinOrderQty()));
		insertMap.put("thresholdQty", String.valueOf(prod.getThresholdQty()));
		insertMap.put("productStatus", prod.getProductStatus());
		insertMap.put("modifiedDate", prod.getModifiedDate());
		insertMap.put("status", prod.getStatus());
		
		namedJdbcTemplate.update(sql, insertMap);
	}

}
