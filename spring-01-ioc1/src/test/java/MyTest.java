import com.xuan.service.UserService;
import com.xuan.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        userService.getUser();
    }
}
