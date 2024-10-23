package practice.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class sampleTest {
	public static void main(String[] args) throws Throwable {
		// step 1 : load/register the database driver
		Driver driverRef = new Driver();
		DriverManager.registerDriver(driverRef);
		
		// step 2 : connect to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		System.out.println("=====done=======");
		
		// step 3 : create sql statement
		Statement state = conn.createStatement();
		
		// step 4 : execute select query & get result
		//state.execute("create table project(project_ID INT PRIMARY KEY, created_by VARCHAR(100), created_on VARCHAR(100), project_name VARCHAR(100), status VARCHAR(100), team_size INT CHECK(team_size>0))");
		ResultSet res = state.executeQuery("select * from project");
		while(res.next()) {
			System.out.println(res.getString(1)+ "\t"+res.getString(2)+"\t"+ res.getString(3)+"\t"+res.getString(4)+"\t"+ res.getString(5)+"\t"+res.getString(6) );
		}
		
		// step 5 : close the connection
		conn.close();
	}

}
