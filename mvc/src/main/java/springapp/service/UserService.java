package springapp.service;

import springapp.DAO.UserDAO;
import springapp.DAO.UserDAOImpl;
import springapp.domain.User;

public class UserService {
	
	public User getUser(int id){
//		User user = new User("akanksha","avinash","1");
//		
//		return user;
		
		UserDAO userDAO = new UserDAOImpl();
		return userDAO.getUser(1);
		
	}

}
