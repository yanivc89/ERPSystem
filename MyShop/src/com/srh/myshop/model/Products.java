package com.srh.myshop.model;

public class Products {
	private int productId;
	private int productCode;
	private int companyId;
	private int productCategoryId;
	private String brandName;
	private String productName;
	private String productQty;
	private double basicRate;
	private double tax;
	private double sellingRate;
	private int minOrderQty;
	private int thresholdQty;
	private String productStatus;
	private String modifiedDate;
	private String status;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductQty() {
		return productQty;
	}
	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}
	public double getBasicRate() {
		return basicRate;
	}
	public void setBasicRate(double basicRate) {
		this.basicRate = basicRate;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getSellingRate() {
		return sellingRate;
	}
	public void setSellingRate(double sellingRate) {
		this.sellingRate = sellingRate;
	}
	public int getMinOrderQty() {
		return minOrderQty;
	}
	public void setMinOrderQty(int minOrderQty) {
		this.minOrderQty = minOrderQty;
	}
	public int getThresholdQty() {
		return thresholdQty;
	}
	public void setThresholdQty(int thresholdQty) {
		this.thresholdQty = thresholdQty;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
