package cn.learn.springframework.test;

import cn.learn.springframework.BeanDefinition;
import cn.learn.springframework.BeanFactory;
import cn.learn.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @ClassName ApiTest
 * @Description: 测试类
 * @Author clark
 * @Date 2022/1/27 20:16
 **/
public class ApiTest {

    @Test
    public void test_BeanFactory() {
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
