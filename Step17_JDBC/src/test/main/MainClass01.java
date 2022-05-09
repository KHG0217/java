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
public class MainClass01 {
	public static void main(String[] args) {
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
		ResultSet rs=null; //(실행의 결과)
		try {
			//실행할 sql문
			String sql ="Select num,name,addr FROM member"
					+ " ORDER BY num ASC";//앞에 한칸 반드시 띄어쓰기
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			
			//PreparedStatement 객체를 이용해서 query문 수행하고
			//결과를 ResultSet 객체로 받아오기
			rs=pstmt.executeQuery();
			/*
			 * 	ResultSet 객체의 .next() 메소드는 cursor 밑에 row가 존재하는 지 확인해서
			 * 	만일 존재한다면 true를 리턴하고, cursor가 한칸 밑으로 이동한다.
			 * 	만일 존재하지 않으면 false를 리턴한다.
			 */
			while(rs.next()) {
				//현재 cursor가 위치한 곳에서 num이라는 칼럼의 정수 얻어내기
				//               "칼럼명"도 되고 숫자도 됨
				int num=rs.getInt("num");
				//현재 cursor가 위치한 곳에서 name이라는 칼럼의 문자열을 얻어내기
				String name=rs.getString("name");
				//현재 cursor가 위치한 곳에서 addr이라는 칼럼의 문자열 얻어내기
				String addr=rs.getString("addr");
				//콘솔창에 출력해보기
				System.out.println(num+" | "+name+" | "+addr);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
