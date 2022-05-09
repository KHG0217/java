package test.main;

import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

public class MainClass06 {
	public static void main(String[] args) {
		//시퀸스 member_seq을 활용해서 회원 정보를 추가해 보세요.
		String name="김혁규";
		String addr="광진구";
		//SELECT 작업을 위해서 필요한 객체의 참조값을 담을 지역변수 미리 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;//(실행)
		try {
			//DBConnect객체를 이용해서 Connection 객체의 참조값을 얻어온다.
			conn=new DBConnect().getConn();
			//실행할 미완성의 sql문
			String sql="insert into member "
					+ " (num, name, addr)"
					+ " values(member_seq.nextval, ?, ?)";
			//PreparedStatement 객체의 참조값 얻어오기
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.executeUpdate();
			System.out.println("회원정보를 저장했습니다.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}
