//package kr.co.test.user.main;
//
//import java.sql.SQLException;
//
//import kr.co.test.user.dao.UserDao;
//import kr.co.test.user.domain.User;
//
//public class Main {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		UserDao dao = new UserDao();
//		
//		User user = new User();
//		user.setId("whiteship");
//		user.setName("백기선");
//		user.setPassword("married");
//		
//		dao.add(user);
//		
//		System.out.println(user.getId() + "등록성공");
//		
//		User user2 = dao.get(user.getId());
//		System.out.println(user2.getName());
//		System.out.println(user2.getPassword());
//		System.out.println(user2.getId() + "조회성공");
//		
//		
//		
//	}
//
//}
