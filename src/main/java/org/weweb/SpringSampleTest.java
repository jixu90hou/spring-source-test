package org.weweb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.weweb.service.HelloService;

import java.io.IOException;

/**
 * Created by jackshen on 2017/8/26.
 */
public class SpringSampleTest {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
      /*  String filePath=ClassLoader.getSystemClassLoader().getResource("bean.xml").getPath();
        BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource(filePath));
        HelloService helloService= (HelloService) beanFactory.getBean("helloService");
        DemoService demoService= (DemoService) beanFactory.getBean("demoService");

        helloService.say("zhang");
        helloService.printHello();
        demoService.print();*/
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(new String[]{"bean.xml"});
        HelloService helloService= (HelloService) ctx.getBean("helloService");
        helloService.printHello();
    }
/*
    public static <T> T proxy(Object obj) {
        return (T) obj;
    }*/
}
