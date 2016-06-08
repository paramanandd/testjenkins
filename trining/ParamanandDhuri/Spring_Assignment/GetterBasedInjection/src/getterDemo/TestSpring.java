package getterDemo;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Employee e1=(Employee)context.getBean("bean1");
		e1.Display();
 

	}

}
