import com.xuan.config.XuanConfig;
import com.xuan.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MyTest {
    @Test
    public  void test(){
        ApplicationContext context= new AnnotationConfigApplicationContext(XuanConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
    }
}
