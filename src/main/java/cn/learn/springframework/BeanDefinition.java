package cn.learn.springframework;

/**
 * @ClassName BeanDefinition
 * @Description: 定义bean
 * @Author clark
 * @Date 2022/1/27 20:15
 **/
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
