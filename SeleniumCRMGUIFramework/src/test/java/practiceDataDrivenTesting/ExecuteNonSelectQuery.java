package practiceDataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteNonSelectQuery {

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
				int res = state.executeUpdate("insert into project values(12, 'SHUBH', '27/09/2024', 'INSTAGRAM', 'On Going', 600);");
				System.out.println(res);
				
				// step 5 : close the connection
				conn.close();

	}

}
