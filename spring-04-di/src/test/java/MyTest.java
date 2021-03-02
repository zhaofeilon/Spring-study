import com.xuan.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        Student student=(Student) context.getBean("student");
        System.out.println(student.getName());
        System.out.println(student.toString());

        /*
        * Student{
        * name='张三',
        * address=Address{addresss='null'},
        * books=[红楼梦, 西游记, 三国演义, 水浒传],
        * hobbys=[听歌, 跳舞, 飙车, 电影],
        * card={身份证=4164654654645645, 银行卡=3545454654645645},
        *  games=[LOL, BOB, COC],
        * info={学号=270117023aef2fe, 学efaj=27fe01170232, ief=2701170efa232},
        * wife='null'
        * }
         */
    }
}
