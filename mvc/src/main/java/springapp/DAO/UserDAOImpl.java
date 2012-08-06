package springapp.DAO;

import springapp.domain.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public boolean createUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User getUser(int userID) {
		// TODO Auto-generated method stub
		User user = new User("akanksa","avinash","1");
		return user;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
