package live.wallet.service;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class UserManagerImpl implements UserManager {

	@Override
	public String sayHello(String name) {
		return "Hello:" + name;

	}

}
