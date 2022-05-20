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
        List<User> list = userService.selectUserPage("三","男",0);
        list.forEach(user -> System.out.println(user));
    }
    @Test
    public void deleteUserById(){
        System.out.println(userService.deleteUserById("15968162087363060"));
    }
    @Test
    public void getRowCount(){
        System.out.println(userService.getRowCount(null,"男"));
    }
    @Test
    public void createUser(){
        System.out.println(userService.createUser(new User("123456789","123456789","987654321","741852963","963258741","951753","66666")));
    }
}
