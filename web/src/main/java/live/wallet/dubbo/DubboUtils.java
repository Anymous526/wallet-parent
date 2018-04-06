package live.wallet.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboUtils {
    private static DubboUtils dubboUtils;
    private static ApplicationContext context;

    private DubboUtils() {
	context = new ClassPathXmlApplicationContext(new String[] { "classpath:/config/dubbo-consumer.xml" });
    }

    public static synchronized DubboUtils getInstance() {
	if (dubboUtils == null) {
	    dubboUtils = new DubboUtils();
	}
	return dubboUtils;
    }

    public Object getRemoteBean(String bean) {
	return context.getBean(bean);
    }

}
