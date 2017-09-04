package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import many2many.Course;
import many2many.Student;
import util.HibernateUtils;

/**
 * 演示多对多关系 学生-课程关系
 * @author Administrator
 *
 */
public class Test3 {
	/**
	 * 批量插入多条记录，级联保存
	 */
	@Test
	public void test() {
		Session session = HibernateUtils.getSession();
		Transaction tx = session.beginTransaction();
		for (int i = 0; i < 5; i++) {
			Student student = new Student();
			student.setHobbies("游泳"+i*2);
			student.setName("路飞"+i*30);
			for (int j = 0; j < 10; j++) {
				Course course = new Course();
				course.setName("地理"+j*3);
				course.setTeacher("陈政"+j*25);
				student.getCourseSet().add(course);
			}
			session.save(student);
			
		}
		tx.commit();
		session.close();
	}
}
