package live.wallet.service;

import live.wallet.model.User;

public interface UserManager {
	boolean deleteUser(User user);

	boolean createUser(User user);

	boolean updateProfile(User user);

	User login(int userId, String passwd);

	void register(User user);

	void update(User user);

}
