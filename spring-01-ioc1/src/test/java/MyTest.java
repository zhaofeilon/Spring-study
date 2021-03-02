import com.xuan.dao.UserDaoImpl;
import com.xuan.dao.UserDaoMySqlImpl;
import com.xuan.service.UserService;
import com.xuan.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        ((UserServiceImpl)userService).setUserDao(new UserDaoMySqlImpl());
        userService.getUser();
    }
}
