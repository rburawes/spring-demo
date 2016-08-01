package com.demo;

import com.demo.model.Car;
import com.demo.model.Category;
import com.demo.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {

    public static void main(String[] args) {

        //Here we have used the spring-beans.xml sitting under 'src/main/resources' folder
        //to look for beans.
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("spring-beans.xml");
        Employee employee = (Employee) xmlContext.getBean("employee");
        System.out.println(employee);

        //Get the beans declared in configuration class ApplicationConfig.
        ApplicationContext annotationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Car car = (Car) annotationContext.getBean("car");
        System.out.println(car);

        //Get the beans from ApplicationConfig class retrieve through component scanning
        //This configuration class used the @ComponentScan to find the beans.
        Category category = (Category) annotationContext.getBean("category");
        System.out.println(category);
    }
}