import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;


public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avishi","root","root"))
		{
			Statement s = con.createStatement();
		//	s.execute("create table mytable (firstcolumn int)");
			s.execute("insert into mytable values (1)");
			//s.execute("select * from mytable");
			
			
			if (con!=null) {
				System.out.println("connected to database");
			}
			else {
				System.out.println("Failed to connect");
			}
			
		}catch(SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(),e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
