package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import one2many.Company;
import util.HibernateUtils;

/**
 * 演示QBC查询
 * @author Administrator
 *
 */
public class Test5 {
//	/**
//	 * 查询所有
//	 */
//	@Test
//	public void test() {
//		Session session = HibernateUtils.getSession();
//		Criteria criteria = session.createCriteria(Company.class);
//		List<Company> list = criteria.list();
//		for (Company company : list) {
//			System.out.println(company.getName()+"...."+company.getLocation());
//		}
//	}
	
//	/**
//	 * 条件查询、模糊查询
//	 */
//	@Test
//	public void test() {
//		Session session = HibernateUtils.getSession();
//		Criteria criteria = session.createCriteria(Company.class);
//		criteria.add(Restrictions.like("location", "北京0"));
//		List<Company> list = criteria.list();
//		for (Company company : list) {
//			System.out.println(company.getName()+"...."+company.getLocation());
//		}
//	}
	
//	/**
//	 * 排序
//	 */
//	@Test
//	public void test() {
//		Session session = HibernateUtils.getSession();
//		Criteria criteria = session.createCriteria(Company.class);
//		criteria.addOrder(Order.asc("location"));
//		List<Company> list = criteria.list();
//		for (Company company : list) {
//			System.out.println(company.getName()+"...."+company.getLocation());
//		}
//	}
	
//	/**
//	 * 分页
//	 */
//	@Test
//	public void test() {
//		Session session = HibernateUtils.getSession();
//		Criteria criteria = session.createCriteria(Company.class);
//		criteria.setFirstResult(2);
//		criteria.setMaxResults(3);
//		List<Company> list = criteria.list();
//		for (Company company : list) {
//			System.out.println(company.getName()+"...."+company.getLocation());
//		}
//	}
	
	/**
	 * 统计
	 */
	@Test
	public void test() {
		Session session = HibernateUtils.getSession();
		Criteria criteria = session.createCriteria(Company.class);
		criteria.setProjection(Projections.rowCount());
		Object count = criteria.uniqueResult();
		Long Long = (Long)count;
		System.out.println(Long.intValue());
	}
}
