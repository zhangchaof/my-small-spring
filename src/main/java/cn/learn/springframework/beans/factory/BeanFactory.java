package cn.learn.springframework.beans.factory;

import cn.learn.springframework.beans.BeansException;

/**
 * @ClassName BeanFactory
 * @Description:
 * @Author clark
 * @Date 2022/1/27 20:15
 **/
public interface BeanFactory {


    /**
     * 获取bean实例
     *
     * @param name
     * @return
     */
    Object getBean(String name) throws BeansException;
}
