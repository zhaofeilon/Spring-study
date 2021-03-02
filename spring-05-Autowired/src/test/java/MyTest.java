import com.xuan.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      People people=  context.getBean("people", People.class);
      people.getCat().shout();
      people.getDog().shout();
    }
}
