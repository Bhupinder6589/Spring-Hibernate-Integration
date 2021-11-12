package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Student;
import dao.StudentDaoInt;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext cap = new ClassPathXmlApplicationContext("resources/springcfg.xml");
		
		Student student = new Student();
		student.setName("ranu");
		student.setEmail("ranu767@gmail.com");
		student.setMarks("450");
		
		
		StudentDaoInt dao =(StudentDaoInt) cap.getBean("dao");
		int pk = dao.insertStudent(student);
		if(pk!=0) {
		System.out.println("Student Details inserted Successfully");	
		}
		
		
	}

}
