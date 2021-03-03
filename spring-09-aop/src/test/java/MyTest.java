import com.xuan.service.UserService;
import com.xuan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        动态代理的是接口
        UserService userService =(UserService) context.getBean("userService");
        userService.add();
    }
}
