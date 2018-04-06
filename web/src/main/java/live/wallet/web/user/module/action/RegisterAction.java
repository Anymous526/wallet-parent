
package live.wallet.web.user.module.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import com.alibaba.citrus.service.form.CustomErrors;
import com.alibaba.citrus.service.form.Group;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormField;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;

import live.wallet.exception.DuplicatedUserException;
import live.wallet.model.User;
import live.wallet.service.UserManager;

public class RegisterAction {

	private UserManager userManager;

	public void doRegister(@FormGroup("register") User user,
			@FormField(name = "registerError", group = "register") CustomErrors err, HttpSession session, Navigator nav)
			throws Exception {
		try {
			userManager.register(user);

			// 在session中创建petstoreUser对象
			// PetstoreUser petstoreUser = (PetstoreUser)
			// session.getAttribute(PETSTORE_USER_SESSION_KEY);

			// 跳转到registerAccount页面
			// nav.redirectTo(PETSTORE_REGISTER_ACCOUNT_LINK);
		} catch (DuplicatedUserException e) {
			Map<String, Object> params = new HashMap(); // createHashMap();
			params.put("userId", user.getUserId());

			err.setMessage("duplicatedUserId", params);
		}
	}

	public void doRegisterAccount(@FormGroup("registerContact") Group registerContact,
			@FormGroup("registerCredit") Group registerCredit, Navigator nav) throws Exception {
		User user = new User();

		// user.setUserId(PetstoreUser.getCurrentUser().getId());

		registerContact.setProperties(user);
		registerCredit.setProperties(user);

		userManager.update(user);

		// nav.redirectTo(PETSTORE_ACCOUNT_LINK);
	}
}
