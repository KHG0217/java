package test.main;

import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * JDBC (Java DataBase Connectivity)
 * 
 * DataBase에 연결해서 SELECT, INSERT, UPDATE, DELETE 작업하기
 * 
 * Oracle에 연결하기 위해서는 드라이버 클래스가 들어잇는 ojdbc6.jar 파일을
 * 사용할 수 있도록 해야한다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		//member 테이블에 추가할 회원의 정보라고 가정
		int num=4;
		String name="주뎅이";
		String addr="봉천동";
		
		
		
		//DB 연결객체를 담을 지역변수 만들기 (접속)
		Connection conn=null;
		
		//오라클 드라이버 로딩
		try {
			              //아까 저장한 드리이버
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        //접속할 DB 의 정보 @아이피주소:port번호:db이름
	        String url="jdbc:oracle:thin:@localhost:1521:xe";
	        //                     localhost:자기자신의 ip주소=(127.0.0.1)=(자바,오라클이 같은 컴퓨터에 있다면)
	        //                     오라클이 다른컴퓨터에 있다면 다른컴퓨터 ip 입력
	        //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기(메소드로)
	        conn=DriverManager.getConnection(url, "scott", "tiger");
	        //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	        System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
		PreparedStatement pstmt=null;//(실행)
		try {
			//실행할 미완성의 sql문
			String sql="insert into member "
					+ " (num, name, addr)"
					+ " values(?, ?, ?)";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			//? 에 값을 바인딩해서 미완성의 sql문을 완성 시킨다.
			//          1 = 첫번째 ?표
			pstmt.setInt(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			//sql문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원정보를 저장했습니다.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
