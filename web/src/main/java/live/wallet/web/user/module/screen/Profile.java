package live.wallet.web.user.module.screen;

import com.alibaba.citrus.turbine.Context;

import live.wallet.model.User;
import live.wallet.service.UserManager;

public class Profile {

	private UserManager userManager;

	public void execute(Context context) throws Exception {
		User user = new User();
		context.put("user", user);
	}
}
