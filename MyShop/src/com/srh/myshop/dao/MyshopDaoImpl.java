package com.srh.myshop.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.srh.myshop.model.Dealers;
import com.srh.myshop.utility.CommonUtil;

public class MyshopDaoImpl{

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


//	public void insertNewUser(Long userId, Users user, String password) throws Exception {
//
//		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();		
//
//		String insertQuery = "INSERT INTO USERS VALUES(:userId, :userName, :addressLine, :telephone, "
//				+ ":city, :country, :email, :firstName, :lastName, :state,"
//				+ ":zipCode, :userType, :companyNumber, :status)";
//
//		Map<String, String> insertMap = new HashMap<String, String>();
//		insertMap.put("userId", userId.toString());
//		insertMap.put("userName", user.getUserName());
//		insertMap.put("addressLine", user.getAddressLine());
//		insertMap.put("telephone", user.getTelephone());
//		insertMap.put("city", user.getCity());
//		insertMap.put("country", user.getCountry());
//		insertMap.put("email", user.getEmail());
//		insertMap.put("firstName", user.getFirstName());
//		insertMap.put("lastName", user.getLastName());
//		insertMap.put("state", user.getState());
//		insertMap.put("zipCode", user.getZipCode());
//		insertMap.put("userType", user.getUserType());
//		insertMap.put("companyNumber", user.getCompanyNumber());
//		insertMap.put("status", "ACTIVE");
//
//
//		namedJdbcTemplate.update(insertQuery, insertMap);
//
//		String query = "INSERT INTO USERPASSWORDS VALUES(:userName, :userPassword)";
//
//		Map<String, String> map = new HashMap<String, String>();
//		map.put("userName", user.getUserName());
//		map.put("userPassword", password);
//
//		namedJdbcTemplate.update(query, map);
//
//	}
//
//	public void updateUser(Long userId, Users user) throws Exception {
//
//		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();	
//
//		String updateQuery = "UPDATE USERS SET USERNAME = :userName, ADDRESSLINE = :addressLine, TELEPHONE = :telephone, "
//				+ "CITY = :city, COUNTRY = :country, EMAIL = :email, FIRSTNAME = :firstName,"
//				+ "LASTNAME = :lastName, USERSTATE = :state, ZIPCODE = :zipCode, COMPANYNUMBER = :companyNumber "
//				+ "WHERE USERID = :userId";
//
//
//		Map<String, String> insertMap = new HashMap<String, String>();
//		insertMap.put("userId", userId.toString());
//		insertMap.put("userName", user.getUserName());
//		insertMap.put("addressLine", user.getAddressLine());
//		insertMap.put("telephone", user.getTelephone());
//		insertMap.put("city", user.getCity());
//		insertMap.put("country", user.getCountry());
//		insertMap.put("email", user.getEmail());
//		insertMap.put("firstName", user.getFirstName());
//		insertMap.put("lastName", user.getLastName());
//		insertMap.put("state", user.getState());
//		insertMap.put("zipCode", user.getZipCode());
//		insertMap.put("companyNumber", user.getCompanyNumber());
//
//		namedJdbcTemplate.update(updateQuery, insertMap);
//
//	}
//
//
//	public UserDto getUserHash(String userName){
//
//
//		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();
//
//		String sql = "SELECT * FROM USERPASSWORDS WHERE USERNAME = :userName";
//
//		Map<String, String> queryMap = new HashMap<String, String>();
//		queryMap.put("userName", userName);
//
//		UserDto userDto = namedJdbcTemplate.queryForObject(sql, queryMap , new UserDtoMapper());		
//
//		return userDto;
//
//	}
//
//	public boolean checkUserExists(String userName) {
//
//
//		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();
//
//		String query = "SELECT COUNT(USERID) FROM USERS WHERE USERNAME = :userName AND STATUS = :status";		
//
//		Map<String, String> queryMap = new HashMap<String, String>();
//
//		queryMap.put("userName", userName);
//		queryMap.put("status", "ACTIVE");
//
//		int userCount = namedJdbcTemplate.queryForInt(query, queryMap);
//
//		return userCount > 0 ? true : false;
//	}



	public void insertDealer(Dealers dealers) {

		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();	
	

		String sql = "INSERT INTO DEALERS(COMPANY_NAME,COMPANY_NUMBER,ADDRESS,CITY,COUNTRY,ZIPCODE,EMAIL,PHONE,CP1_NAME,CP1_PHONE,CP2_NAME,CP2_PHONE,REMARKS,MODIFIED_DATE) "
				+ "VALUES( :companyName,:companyNumber,:address,:city,:country,:zipCode,:phone,:email,:cp1Name,:cp1Phone,:cp2Name,:cp2Phone,:remarks,:createdDate )";

		Map<String, String> queryMap = new HashMap<String, String>();


		queryMap.put("companyName", dealers.getCompanyName());
		queryMap.put("companyNumber", dealers.getCompanyNumber());
		queryMap.put("address", dealers.getAddress());
		queryMap.put("city", dealers.getCity());
		queryMap.put("country", dealers.getCountry());
		queryMap.put("zipCode", dealers.getZipCode());
		queryMap.put("phone", dealers.getPhone());
		queryMap.put("email", dealers.getEmail());
		queryMap.put("cp1Name", dealers.getCp1Name());
		queryMap.put("cp1Phone", dealers.getCp1Phone());
		queryMap.put("cp2Name", dealers.getCp2Name());
		queryMap.put("cp2Phone", dealers.getCp2Phone());
		queryMap.put("remarks", dealers.getRemarks());
		queryMap.put("createdDate", CommonUtil.getTodaysDate());
		
	
		


		namedJdbcTemplate.update(sql, queryMap);

	}
	
	
	public void updateDealer(Dealers dealers) {

		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();	
	

		String sql = "UPDATE DEALERS SET COMPANY_NAME = :companyName,COMPANY_NUMBER = :companyNumber,"
				+ "ADDRESS = :address,CITY = :city, COUNTY = :country, ZIPCODE = :zipCode, EMAIL =:email,"
				+ "PHONE =:phone,CP1_NAME =:cp1Name,CP1_PHONE =:cp1Phone,"
				+ "CP2_NAME =:cp2Name,CP2_PHONE =:cp2Phone,REMARKS = :remarks,MODIFIED_DATE = :modifiedDate"
				+ " WHERE COMPANY_ID = :companyId";
				

		Map<String, String> queryMap = new HashMap<String, String>();
		queryMap.put("companyName", dealers.getCompanyName());
		queryMap.put("companyNumber", dealers.getCompanyNumber());
		queryMap.put("address", dealers.getAddress());
		queryMap.put("city", dealers.getCity());
		queryMap.put("country", dealers.getCountry());
		queryMap.put("zipCode", dealers.getZipCode());
		queryMap.put("phone", dealers.getPhone());
		queryMap.put("email", dealers.getEmail());
		queryMap.put("cp1Name", dealers.getCp1Name());
		queryMap.put("cp1Phone", dealers.getCp1Phone());
		queryMap.put("cp2Name", dealers.getCp2Name());
		queryMap.put("cp2Phone", dealers.getCp2Phone());
		queryMap.put("remarks", dealers.getRemarks());
		queryMap.put("modifiedDate", CommonUtil.getTodaysDate());
		
		queryMap.put("companyId", dealers.getCompanyId().toString());


		namedJdbcTemplate.update(sql, queryMap);

	}

	public void searchDealer( Dealers dealers) {

		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();
		
		int i = 0;
		
		StringBuilder sql = new StringBuilder("SELECT * FROM DEALERS WHERE ");
		
		if( dealers.getCompanyName() != null && !dealers.getCompanyName().equals("") ){
			sql.append("COMPANY_NAME LIKE '" + dealers.getCompanyName() + "'");
			i++;
		}
		
		if( dealers.getCompanyNumber() != null && !dealers.getCompanyNumber().equals("") ){
			if( i > 0 ) sql.append(" AND ");
			sql.append("COMPANY_NUMBER LIKE '" + dealers.getCompanyNumber() + "'");
			i++;
		}
		
		if( dealers.getCity() != null && !dealers.getCity().equals("") ){
			if( i > 0 ) sql.append(" AND ");
			sql.append("CITY LIKE '" + dealers.getCity() + "'");
			i++;
		}
		
		if( dealers.getCountry() != null && !dealers.getCountry().equals("") ){
			if( i > 0 ) sql.append(" AND ");
			sql.append("COUNTRY LIKE '" + dealers.getCountry() + "'");
			i++;
		}
		
		if( dealers.getZipCode() != null && !dealers.getZipCode().equals("") ){
			if( i > 0 ) sql.append(" AND ");
			sql.append("ZIPCODE LIKE '" + dealers.getZipCode() + "'");
			i++;
		}
		
		
		

	}

	


}

