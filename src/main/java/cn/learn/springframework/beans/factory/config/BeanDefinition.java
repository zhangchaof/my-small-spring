package cn.learn.springframework.beans.factory.config;

/**
 * @ClassName BeanDefinition
 * @Description: 定义bean
 * @Author clark
 * @Date 2022/1/27 20:15
 **/
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }
}
