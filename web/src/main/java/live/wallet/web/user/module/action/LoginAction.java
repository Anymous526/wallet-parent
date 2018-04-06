
package live.wallet.web.user.module.action;

import javax.servlet.http.HttpSession;

import com.alibaba.citrus.service.form.CustomErrors;
import com.alibaba.citrus.service.requestcontext.parser.ParameterParser;
import com.alibaba.citrus.turbine.Navigator;
import com.alibaba.citrus.turbine.dataresolver.FormField;
import com.alibaba.citrus.turbine.dataresolver.FormGroup;
import com.alibaba.citrus.util.StringUtil;

import live.wallet.model.User;
import live.wallet.service.UserManager;

public class LoginAction {
	private UserManager userManager;

	public void doLogin(@FormGroup("login") User user,
			@FormField(name = "loginError", group = "login") CustomErrors err, Navigator nav, HttpSession session,
			ParameterParser params) throws Exception {
		user = userManager.login(user.getUserId(), user.getPasswd());

		if (user != null) {
			// 在session中创建petstoreUser对象
			// PetstoreUser petstoreUser = (PetstoreUser)
			// session.getAttribute(PETSTORE_USER_SESSION_KEY);

			// 跳转到return页面
			redirectToReturnPage(nav, params);
		} else {
			err.setMessage("invalidUserOrPassword");
		}
	}

	public void doLogout(HttpSession session, Navigator nav, ParameterParser params) throws Exception {
		// 清除session中的user
		// session.removeAttribute(PETSTORE_USER_SESSION_KEY);

		// 跳转到return页面
		redirectToReturnPage(nav, params);
	}

	private void redirectToReturnPage(Navigator nav, ParameterParser params) {
		String returnURL = params.getString("return");

		if (StringUtil.isEmpty(returnURL)) {
			// nav.redirectTo(LOGIN_RETURN_DEFAULT_LINK);
		} else {
			nav.redirectToLocation(returnURL);
		}
	}
}
