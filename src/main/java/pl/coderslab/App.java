package pl.coderslab;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.HelloWorld;


public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        HelloWorld hw1 = context.getBean("helloWorld", HelloWorld.class);
        hw1.printMessage();


        context.close();
    }
}
