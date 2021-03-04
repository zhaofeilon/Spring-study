import com.xuan.mapper.UserMapper;
import com.xuan.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Mytest {
    public static void main(String[] args) throws IOException {
        String res="mybatis-config.xml";
        InputStream ins = Resources.getResourceAsStream(res);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(ins);
        SqlSession sqlSession = sessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.selectUser();
        for (User u :
                users) {
            System.out.println(u);
        }

    }
    @Test
    public void test() throws IOException{
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper mapper =  context.getBean("userMapper",UserMapper.class);
        for (User u :
                mapper.selectUser()) {
            System.out.println(u);
        }

        }
    }

