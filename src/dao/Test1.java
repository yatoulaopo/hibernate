package dao;
/**
 * 测试增删改查
 * @author Administrator
 *
 */

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import one2many.Employee;
import util.HibernateUtils;

public class Test1 {
//	/**
//	 * 插入多条记录，瞬时态
//	 */
//	@Test
//	public void test() {
//		Session session = HibernateUtils.getSession();
//		Employee employee = new Employee();
//		for (int i = 0; i < 50; i++) {
//			employee.setUsername("张三"+i);
//			employee.setCity("斯里兰卡"+i*10);
//			employee.setDescription("我们的故事"+i*20);
//			employee.setCountry("中国"+i*5);
//			session.save(employee);
//			session.flush();//强制进行从内存到数据库的同步
//			session.clear();//强制清除Session缓存
//		}
//		session.close();
//	}
//	/**
//	 * 根据id查询
//	 */
//	@Test
//	public void test1() {
//		Session session = HibernateUtils.getSession();
//		Employee employee = session.get(Employee.class, 57);
//		System.out.println(employee.getUsername()+"...."+employee.getCity());
//	}
//	/**
//	 * 删除的操作是：先查询出来，再删除
//	 */
//	@Test
//	public void test2() {
//		Session session = HibernateUtils.getSession();
//		Transaction tx = session.beginTransaction();
//		Employee employee = session.get(Employee.class, 100);
//		session.delete(employee);
//		tx.commit();
//		session.close();
//	}
	/**
	 * 更新的操作是：先根据id查询，再修改，再update
	 */
	@Test
	public void test3() {
		Session session = HibernateUtils.getSession();
		Transaction tx = session.beginTransaction();
		Employee employee = session.get(Employee.class, 106);
		employee.setUsername("东方不败");
		session.update(employee);
		tx.commit();
		session.close();
	}
	
}
