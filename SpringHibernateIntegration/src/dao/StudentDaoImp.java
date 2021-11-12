package dao;

import org.springframework.orm.hibernate4.HibernateTemplate;
import beans.Student;


public class StudentDaoImp implements StudentDaoInt{
	
	private HibernateTemplate ht;
	
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	

	@Override
	public int insertStudent(Student student) {
		
		int pk=(int)ht.save(student);
		
		return pk;
	}
	
	
	
	
}
