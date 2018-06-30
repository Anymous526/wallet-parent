package live.wallet.dubbo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.dubbo.config.annotation.Reference;

import live.wallet.service.UserManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/config/dubbo-consumer.xml")
public class Client {
	//private static ApplicationContext context;

	@Reference
	private UserManager userManager;

	// @BeforeClass
	public static void init() {
		//context = new ClassPathXmlApplicationContext("classpath:/config/dubbo-consumer.xml");
	}

	@Test
	public void testA() {
		/* UserManager u = context.getBean("userManager", UserManager.class); */
		userManager.getUser("1");

	}

}
