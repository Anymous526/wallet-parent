package live.wallet.web.user.module.screen;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.citrus.turbine.Context;

import live.wallet.model.User;
import live.wallet.service.UserManager;

public class Profile {

    @Autowired
    private UserManager userManager;

    public void execute(Context context) throws Exception {
	User user = new User();
	context.put("user", user);
    }
}
