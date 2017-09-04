package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import one2many.Company;
import one2many.Employee;
import util.HibernateUtils;

/**
 * 用于演示一对多Company和Employee
 * @author Administrator
 *
 */
public class Test2 {
	/**
	 * 批量插入多条记录
	 */
	@Test
	public void test() {
		Session session = HibernateUtils.getSession();
		Transaction tx = session.beginTransaction();
		Company company = new Company();
		for (int i = 0; i < 3; i++) {
			company.setName("百度"+i*5);
			company.setLocation("北京"+i*10);
			for (int j = 0; j < 19; j++) {
				Employee employee = new Employee();
				employee.setUsername("丫头"+j);
				employee.setCity("弋阳"+j*20);
				employee.setCountry("加拿大"+j*50);
				employee.setDescription("我们的故事"+j*100);
				company.getSet().add(employee);
			}
			session.save(company);
			session.flush();
			session.clear();
		}
		tx.commit();
		session.close();
	}
}
