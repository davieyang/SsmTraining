package com.davieyang.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author davieyang
 * @date 2021/06/16
 */
@Service
public class SpringTest {
    /** @Service
     * Spring会自动扫描@Service注解的类，并把这些类纳入进Spring容器中管理
     * 也可以使用@Component注解
     */

    @Test
    public void testSpring() {
        /** ApplicationContext：
         *  ApplicationContext是Spring中较高级别的容器,用于加载配置文件中的bean,并将所有的Bean集中在一起当有请求的分配bean
         *  ClassPathXmlApplicationContext:从类路径ClassPath中寻找指定的XML配置文件，找到并装载完成ApplicationContext的实例化工作
         *  ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
         *  String[] configs = {"bean1.xml","bean2.xml","bean3.xml"};
         *  ApplicationContext cxt = new ClassPathXmlApplicationContext(configs)
         *  FileSystemXmlApplicationContext:从指定的文件系统路径中寻找指定的XML配置文件，找到并装载完成ApplicationContext的实例化工作
         *  ApplicationContext cxt = new FileSystemXMLApplicationContext("bean.xml")
         *  String[] configs = {"c:/bean1.xml", "c:/bean2.xml"}
         *  ApplicationContext cxt = new FileSystemXMLApplicationContext(configs)
         *  XmlWebApplicationContext:从Web应用中寻找指定的XML配置文件,找到并装载完成ApplicationContext的实例化工作
         *  XmlWebApplicationContext:这是为Web工程量身定制的，使用WebApplicationContextUtils类中的getRequiredWebApplicationContext方法
         *  可在JSP与Servlet中取得IOC容器的引用
         */
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringTest springTest = (SpringTest) applicationContext.getBean("springTest");
        springTest.sayHello();

    }

    public void sayHello() {
        System.out.println("hello ay");
    }

}
