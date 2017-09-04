package kr.co.test.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.test.user.domain.User;


//각각 다른 db, db커넥션을 사용할때 
//상속이나 추상을 이용하여, 핵심코드는제외하고 클래스 바이너리파일만 제공
public abstract class UserDao {
	
	public void add(User user) throws ClassNotFoundException, SQLException {
		
		//jdbc:oracle:thin:@localhost:1521:XE
		
		//중복되는 db Connection객체 제거
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		
		Connection con = getConnection();
		
		PreparedStatement ps = con.prepareStatement(
				"insert into tb_user(userid, name, password) values(?,?,?)");
		
		ps.setString(1, user.getId());
		ps.setString(2, user.getName());
		ps.setString(3, user.getPassword());
		
		ps.executeUpdate();
		
		ps.close();
		con.close();
	}
	
	public User get(String id) throws ClassNotFoundException, SQLException {
		//중복되는 db Connection객체 제거
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
		
		Connection con = getConnection();
		
		
		
		PreparedStatement ps = con.prepareStatement("select * from tb_user where userid = ?");
		
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		User user = new User();
		user.setId(rs.getString("userid"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		
		rs.close();
		ps.close();
		con.close();
		
		return user;
	}
	

	
	//db연결과 관련된부분에 변경이 일어났을경우 이메소드만 바꿔주면 된다.
	//각각 다른 db, db커넥션을 사용할때 
	//상속이나 추상을 이용하여, 핵심코드는제외하고 클래스 바이너리파일만 제공
	public abstract Connection getConnection() throws ClassNotFoundException, SQLException; 
	
//	{
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");
//		
//		return con;
//	}
		
	public class NUserDao extends UserDao {
		public Connection getConnection() throws ClassNotFoundException, SQLException {
			//N사 DB 커넥션 생성코드
			return null;
		} 
	}
	
	public class DUserDao extends UserDao {
		public Connection getConnection() throws ClassNotFoundException, SQLException {
			//D사 DB 커넥션 생성코드
			return null;
		}
	}

}
