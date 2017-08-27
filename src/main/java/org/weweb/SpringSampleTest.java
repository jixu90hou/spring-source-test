package org.weweb;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.weweb.service.HelloService;

import java.io.IOException;

/**
 * Created by jackshen on 2017/8/26.
 */
public class SpringSampleTest {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        String filePath=ClassLoader.getSystemClassLoader().getResource("bean.xml").getPath();
        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource(filePath));
        HelloService helloService= proxy(beanFactory.getBean("helloService"));
        helloService.say("zhang");
        helloService.printHello();
    }

    public static <T> T proxy(Object obj) {
        return (T) obj;
    }
}
