package core_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Triangle t= new Triangle();
		ApplicationContext context = new ClassPathXmlApplicationContext("/core_spring/spring.xml");
		Triangle t= (Triangle) context.getBean("t");
		t.draw();
		
		

	}

}
