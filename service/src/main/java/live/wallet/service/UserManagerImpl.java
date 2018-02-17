package live.wallet.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;

import live.wallet.dao.UserManagerDao;
import live.wallet.model.User;

@Service
public class UserManagerImpl implements UserManager {

	@Autowired
	private UserManagerDao userDao;

	@Override
	public boolean deleteUser(User user) {

		return userDao.deleteUser(user);
	}

	@Override
	public boolean createUser(User user) {

		return false;
	}

	@Override
	public boolean updateProfile(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
