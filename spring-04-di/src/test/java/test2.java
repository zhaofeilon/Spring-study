import com.xuan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test2 {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("userBeans.xml");
    User user=(User) context.getBean("user");
        System.out.println(user.toString());
    }
@Test
    public void test(){
    ApplicationContext context= new ClassPathXmlApplicationContext("userBeans.xml");
    User user1= context.getBean("user2",User.class);
    User user2= context.getBean("user2",User.class);
    //每次从容器中get都会产生新的对象
    System.out.println(user1==user2);
    System.out.println(user1.toString());
    System.out.println(user2.toString());

}

}
