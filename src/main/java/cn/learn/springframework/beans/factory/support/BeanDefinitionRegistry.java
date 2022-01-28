package cn.learn.springframework.beans.factory.support;

import cn.learn.springframework.beans.factory.config.BeanDefinition;

/**
 * @ClassName BeanDefinitionRegistry
 * @Description: bean注册
 * @Author clark
 * @Date 2022/1/28 14:50
 **/
public interface BeanDefinitionRegistry {

    /**
     * 注册bean
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
