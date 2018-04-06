package live.wallet.dao;

import org.springframework.stereotype.Repository;

import live.wallet.model.User;

@Repository
public interface UserManagerDao {

    boolean deleteUser(User user);

}
