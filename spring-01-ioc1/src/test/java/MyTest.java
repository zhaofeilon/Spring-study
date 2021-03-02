import com.xuan.dao.UserDaoImpl;
import com.xuan.dao.UserDaoMySqlImpl;
import com.xuan.service.UserService;
import com.xuan.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        UserService userService=new UserServiceImpl();
//        ((UserServiceImpl)userService).setUserDao(new UserDaoMySqlImpl());
//        userService.getUser();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService=(UserServiceImpl)context.getBean("UserServiceImpl");
        userService.getUser();
    }
}
