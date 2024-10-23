package practiceDataDrivenTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class SampleUnitTestCheckProjectInBackend {
	@Test
	public void projectCheckTest() throws SQLException {
		String ExpectedProject="INSTAGRAM";
		boolean flag=false;
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
			String actProjectName = res.getString(4);
			System.out.println(actProjectName);
			if(ExpectedProject.equals(actProjectName)) {
				flag=true;
				System.out.println(ExpectedProject+" is available==PASS");
			}
		}
		if(flag==false) {
			System.out.println(ExpectedProject+" is not available==Fail");
			Assert.fail();
		}
		
		// step 5 : close the connection
		conn.close();

	}

}
