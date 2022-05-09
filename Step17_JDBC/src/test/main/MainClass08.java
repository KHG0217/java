package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import test.mypac.Member;
import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		Map<String, String>m1 = new HashMap<>();
		//추가할 회원의 정보
		String name="원숭이";
		String addr="동물원";
		m1.put("name", name);
		m1.put("addr", addr);
		//메소드 호출하면서 회원정보가 들어있는 Member객체를 전달한다.
		insert(m1);
	}
	
	//회원 한명의 정보를 추가하는 메소드
	public static void insert(Map<String, String> map) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=new DBConnect().getConn();
			String sql="insert into member "
					+ " (num,name,addr)"
					+ " values(member_seq.nextval,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, map.get("name"));
			pstmt.setString(2, map.get("addr"));
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
	        try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         }catch(Exception e) {}
	       }
	       
	    }
	 }
