package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import test.dto.MemberDto;
import test.mypac.Member;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		
		//추가할 회원의 정보
		String name="김혁규";
		String addr="서울";		
		//MemberDto 객체를 생성해서
		MemberDto m1 = new MemberDto();
		//setter 메소드를 이용해서 회원정보를 담고
		m1.setName(name);
		m1.setAddr(addr);
		//메소드 호출하면서 MemberDto 객체의 참조값 전달하기
		insert(m1);
		
		
	}
	
	//회원 한명의 정보를 추가하는 메소드
	public static void insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=new DBConnect().getConn();
			String sql="insert into member "
					+ " (num,name,addr)"
					+ " values(member_seq.nextval,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
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
