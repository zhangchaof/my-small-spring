package cn.learn.springframework.beans.factory.config;

/**
 * @ClassName SingletonBeanRegistry
 * @Description: 单利bean注册定义
 * @Author clark
 * @Date 2022/1/28 10:21
 **/
public interface SingletonBeanRegistry {
    /**
     * 获取单利bean
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);
}
