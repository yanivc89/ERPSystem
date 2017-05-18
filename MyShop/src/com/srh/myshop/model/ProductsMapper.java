package com.srh.myshop.model;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductsMapper implements RowMapper<Products>{

	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Products prod = new Products();
		
		prod.setProductId(rs.getInt("PRODUCT_ID"));
		prod.setProductCode(rs.getInt("PRODUCT_CODE"));
		prod.setCompanyId(rs.getInt("COMPANY_ID"));
		prod.setProductCategoryId(rs.getInt("PRODUCT_CATEGORY_ID"));
		prod.setBrandName(rs.getString("BRAND_NAME"));
		prod.setProductName(rs.getString("PRODUCT_NAME"));
		prod.setProductQty(rs.getString("PRODUCT_QUANTITY"));
		prod.setBasicRate(rs.getDouble("BASIC_RATE"));
		prod.setTax(rs.getDouble("TAX"));
		prod.setSellingRate(rs.getDouble("SELLING_RATE"));
		prod.setMinOrderQty(rs.getInt("MIN_ORDER_QUANTITY"));
		prod.setThresholdQty(rs.getInt("THRESHOLS_QUANTITY"));
		prod.setProductStatus(rs.getString("PRODUCT_STATUS"));
		prod.setModifiedDate(rs.getString("MODIFIED_DATE"));
		prod.setStatus(rs.getString("STATUS"));
		return prod;
	}
	

}
