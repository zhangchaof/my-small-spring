package cn.learn.springframework.beans.factory.support;

import cn.learn.springframework.beans.BeansException;
import cn.learn.springframework.beans.factory.config.BeanDefinition;

/**
 * @ClassName AbstractAutowireCapableBeanFactory
 * @Description: AbstractAutowireCapableBeanFactory
 * @Author clark
 * @Date 2022/1/28 14:32
 **/
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }
}
