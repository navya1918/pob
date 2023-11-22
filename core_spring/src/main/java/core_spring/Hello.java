package core_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("/core_spring/hello.xml");
		 hellodisplay h= (hellodisplay) context.getBean("h");
		 System.out.println(h.getValue1());

	}

}
