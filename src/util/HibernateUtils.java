package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 该工具类用来生成单例的sessionFactory，然后每次调用生成一个全新的session对象
 * @author Administrator
 *
 */
public class HibernateUtils {
	private static SessionFactory sessionFactory;
	private Session session;
	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		sessionFactory = cfg.buildSessionFactory();
	}
	public static Session getSession() {
		return sessionFactory.openSession();
	}
}
