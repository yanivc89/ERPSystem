package com.srh.myshop.service;

import com.srh.myshop.dao.DaoImpl;
import com.srh.myshop.model.Users;

public class serviceImpl {

		public String insertHashedPwd( Users users ) throws Exception {

			DaoImpl daoImpl = new DaoImpl();

			boolean exists = daoImpl.checkUserExist( users.getUserName());

			if( exists ){

				return "This Username already exists.";

			}else{

				String salt =  BCrypt.gensalt(10);

				String hashed = BCrypt.hashpw(users.getPassword(), salt);
				users.setPassword(hashed);
				
				daoImpl.insertUsersLogin(users.getUserId()+1, users.getUserName(), users.getPassword());
				daoImpl.insertUsers(users);
			}

			return "User successfully added";



		}

	/*	public String updateUserProfile( Users user ) throws Exception {

			ECommerceDaoImpl daoImpl = new ECommerceDaoImpl();

			Users userExists = daoImpl.getUserDetails( user.getUserName() );

			if( user.getUserType() != null && user.getUserType().equalsIgnoreCase("V") ){

				try{

					daoImpl.updateCompany( userExists.getCompanyNumber(), user.getCompanyName(), user.getCompanyNumber() );

				}catch(Exception exp){

					return "Please enter unique company number and name";
				}
			}
			
			System.out.println(" userExists.getUserId()      ::::: " + userExists.getUserId() );

			daoImpl.updateUser( userExists.getUserId() , user);

			return "User profile successfully updated";



		}

		
		

		public Users getUserDetails(String userName) {

			ECommerceDaoImpl daoImpl = new ECommerceDaoImpl();	

			Users user = daoImpl.getUserDetails(userName);	

			String companyName = "";

			if( user.getCompanyNumber() != null )
				companyName = daoImpl.getCompanyName(user.getCompanyNumber());

			user.setCompanyName(companyName);

			return user;
		}

	
	
	*/
	
}
