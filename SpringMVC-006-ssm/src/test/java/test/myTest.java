package test;

import com.lonely.pojo.User;
import com.lonely.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) //启动spring容器
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml","classpath:applicationContext_service.xml"})
public class myTest {
    @Autowired
    UserService userService;
    @Test
    public void selectUserPage(){
        List<User> list = userService.selectUserPage(null,null,0);
        list.forEach(user -> System.out.println(user));
    }
}
