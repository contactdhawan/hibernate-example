# hibernate-example
Adding hibernate and testing jdbc connection is very easy.
Add two dependency.

<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>4.3.5.Final</version>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.6</version>
		</dependency>
  
  In java class 
  String jdbcURL = "jdbc:mysql://localhost:3306/hibernatedb?useSSL=false";
		String username = "root";
		String password = "root";

		try {
			Connection connection = DriverManager.getConnection(jdbcURL,username,password);
System.out.println("Connection successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
