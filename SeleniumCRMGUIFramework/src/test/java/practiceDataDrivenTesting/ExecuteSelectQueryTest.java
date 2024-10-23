package practiceDataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteSelectQueryTest {

	public static void main(String[] args) throws SQLException {
		// step 1 : load/register the database driver
				Driver driverRef = new Driver();
				DriverManager.registerDriver(driverRef);
				Connection conn=null;
				// step 2 : connect to database
				try {
				 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
				System.out.println("=====done=======");
				
				// step 3 : create sql statement
				Statement state = conn.createStatement();
				
				// step 4 : execute select query & get result
				//state.execute("create table project(project_ID INT PRIMARY KEY, created_by VARCHAR(100), created_on VARCHAR(100), project_name VARCHAR(100), status VARCHAR(100), team_size INT CHECK(team_size>0))");
				ResultSet res = state.executeQuery("select * from project");
				while(res.next()) {
					System.out.println(res.getString(1)+ "\t"+res.getString(2)+"\t"+ res.getString(3)+"\t"+res.getString(4)+"\t"+ res.getString(5)+"\t"+res.getString(6) );
				}
				}
				catch(Exception e) {
					System.out.println("handle any type of exception");
				}
				// step 5 : close the connection
				finally {
					conn.close();
					System.out.println("=======close the connection=======");
				}

	}

}
