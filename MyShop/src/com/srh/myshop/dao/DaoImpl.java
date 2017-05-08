package com.srh.myshop.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.srh.myshop.model.UserLogin;
import com.srh.myshop.model.Users;
import com.srh.myshop.utility.CommonUtil;

public class DaoImpl {

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
	
	
	public boolean checkUserExist(String userName){
		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();
		
		String sql = "SELECT COUNT(*) FROM ERP_TBL_USERS WHERE USER_NAME=:userName";

		Map<String, String> queryMap = new HashMap<String, String>();
		
		queryMap.put("userName",userName);
		
		
		int userCount = namedJdbcTemplate.queryForInt(sql, queryMap);

		return userCount > 0 ? true : false;
	} 
	
	public void insertUsers(Users users){
		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();
		
		String sql = "INSERT INTO ERP_TBL_USERS(USER_ID,FIRST_NAME,LAST_NAME,ADDRESS,EMAIL,TELEPHONE,USER_TYPE)"
				+ "VALUES( :userId,:firstName,:lastName,:address,:email,:telephone,:userType)";

		Map<String, String> queryMap = new HashMap<String, String>();
		
		queryMap.put("userId",String.valueOf(users.getUserId()));
		queryMap.put("firstName",users.getFirstName());
		queryMap.put("lastName",users.getLastName());
		queryMap.put("address",users.getAddress());
		queryMap.put("email",users.getEmail());
		queryMap.put("telephone",users.getTelephone());
		queryMap.put("userType",users.getUserType());
		
		
		namedJdbcTemplate.update(sql, queryMap);
	} 
public Long getMaxUserId(){
		
		
		JdbcTemplate jdbcTemplate = getJdbcTemplate();

		Long companyId = jdbcTemplate.queryForLong("select max(USER_ID) from ERP_TBL_USERS;");

		return companyId;
	
	} 
	
	
	public void insertUsersLogin(Long userId,String userName,String password){
		
		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();
		
		String sql = "INSERT INTO ERP_TBL_USERS_LOGIN(USER_ID,USER_NAME,PASSWORD)"
				+ "VALUES(:userId,:userName,:password)";

		Map<String, String> queryMap = new HashMap<String, String>();
		queryMap.put("userId", String.valueOf(userId));
		queryMap.put("userName", userName);
		queryMap.put("password",password);
		
		namedJdbcTemplate.update(sql, queryMap);
	} 
	
	public void updateUsers(Users users) {

		NamedParameterJdbcTemplate namedJdbcTemplate = getNamedJdbcTemplate();	
	

		String sql = "UPDATE USERS SET USER_ID=:userid,FIRST_NAME = :firstName,LAST_NAME = :lastName,"
				+ "ADDRESS = :address,EMAIL =:email,TELEPHONE =:telephone,USER_TYPE =:userType";
				

		Map<String, String> queryMap = new HashMap<String, String>();
		queryMap.put("userId", String.valueOf(users.getUserId()));
		queryMap.put("firstName", users.getFirstName());
		queryMap.put("lastName", users.getLastName());
		queryMap.put("address",users.getAddress());
		queryMap.put("email",users.getEmail());
		queryMap.put("telephone",users.getTelephone());
		queryMap.put("userType",users.getUserType());
		
		namedJdbcTemplate.update(sql, queryMap);

	}

}
