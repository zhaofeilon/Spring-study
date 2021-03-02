import com.xuan.service.UserService;
import com.xuan.service.UserServiceImpl2;

public class MyTest2 {
    public static void main(String[] args) {
        UserService service=new UserServiceImpl2();
        service.getUser();
    }
}
