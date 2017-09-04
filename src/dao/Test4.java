package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import one2many.Company;
import util.HibernateUtils;

/**
 * 测试hql查询语句
 * @author Administrator
 *
 */
public class Test4 {
//	/**
//	 * 查询所有记录
//	 */
//	@Test
//	public void test() {
//		Session session = HibernateUtils.getSession();
//		Query query = session.createQuery("from Company");
//		List<Company> list = query.list();
//		for (Company company : list) {
//			System.out.println(company.getName()+"..."+company.getLocation());
//		}
//	}
//	/**
//	 * 条件查询
//	 */
//	@Test
//	public void test() {
//		Session session = HibernateUtils.getSession();
//		Query query = session.createQuery("from Company where location like ?");
//		query.setParameter(0, "北京0%");
//		List<Company> list = query.list();
//		for (Company company : list) {
//			System.out.println(company.getName()+"..."+company.getLocation());
//		}
//	}
	
//	/**
//	 * 排序查询
//	 */
//	@Test
//	public void test() {
//		Session session = HibernateUtils.getSession();
//		Query query = session.createQuery("from Company where name like ? order by location");
//		query.setParameter(0, "百度0%");
//		List<Company> list = query.list();
//		for (Company company : list) {
//			System.out.println(company.getName()+"..."+company.getLocation());
//		}
//	}
	
//	/**
//	 * 分页查询
//	 */
//	@Test
//	public void test() {
//		Session session = HibernateUtils.getSession();
//		Query query = session.createQuery("from Company");
//		query.setFirstResult(2);
//		query.setMaxResults(3);
//		List<Company> list = query.list();
//		for (Company company : list) {
//			System.out.println(company.getName()+"..."+company.getLocation());
//		}
//	}
	
//	/**
//	 * 投影查询
//	 */
//	@Test
//	public void test() {
//		Session session = HibernateUtils.getSession();
//		Query query = session.createQuery("select name,location from Company");
//		List<Object> list = query.list();
//		for (Object object : list) {
//			System.out.println(object);
//		}
//	}
	
	/**
	 * 聚集函数
	 */
	@Test
	public void test() {
		Session session = HibernateUtils.getSession();
		Query query = session.createQuery("select count(*) from Company");
		Object count = query.uniqueResult();
		Long Long = (Long)count;
		System.out.println(Long.intValue());
	}
}
