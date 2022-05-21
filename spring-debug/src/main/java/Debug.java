import beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 源码调试入口
 *
 * @author sherlock.jiang
 */
public class Debug {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		User user = ctx.getBean(User.class);
		System.out.println(user.getName());
	}
}
