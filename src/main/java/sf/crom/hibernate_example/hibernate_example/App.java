package sf.crom.hibernate_example.hibernate_example;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		String jdbcURL = "jdbc:mysql://localhost:3306/hibernatedb?useSSL=false";
		String username = "root";
		String password = "root";

		SessionFactory sessionFactory = null;
		try {
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			System.out.println("Connection successfully");

			 sessionFactory = new Configuration().configure("HibernateConfiguration.xml")
					.addAnnotatedClass(User.class).buildSessionFactory();

			Session session = sessionFactory.getCurrentSession();

			session.beginTransaction();
			User user = new User("dhawan", "neeraj", "contactdhawan@gmail.com");
			session.save(user);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sessionFactory.close();
		}
		
	}
}
