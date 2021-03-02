import com.xuan.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main(String[] args) {
        //获取spring的上下文对象！
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象都在spring中管理了 ，要使用直接取出来
        Hello hello=(Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
