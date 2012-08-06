package springapp.DAO;

import springapp.domain.User;

public interface UserDAO {
	
	public boolean createUser(User user);
	public User getUser(int id);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
}
