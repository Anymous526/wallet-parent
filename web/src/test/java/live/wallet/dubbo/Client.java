package live.wallet.dubbo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import live.wallet.service.UserManager;

public class Client {
	private static ApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/dubbo-consumer.xml");
	}

	@Test
	public void testA() {
		UserManager u = (UserManager) context.getBean("userManager");

	}

}
