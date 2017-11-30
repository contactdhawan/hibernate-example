package sf.crom.hibernate_example.hibernate_example;

import java.sql.Connection;
import java.sql.DriverManager;

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

		try {
			Connection connection = DriverManager.getConnection(jdbcURL,username,password);
System.out.println("Connection successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
