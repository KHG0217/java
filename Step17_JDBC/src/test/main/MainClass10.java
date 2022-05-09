package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		//수정할 회원의 정보
		int num=1;
		String name="호빵";
		String addr="분식집";
		
		MemberDto mDto = new MemberDto();
		mDto.setNum(num);
		mDto.setName(name);
		mDto.setAddr(addr);
		update(mDto);
		
	}
	//회원 1명의 정보를 수정하는 메소드
	public static void update(MemberDto m) {
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=new DBConnect().getConn();
			String sql="update member "
					+ " set name=?,addr=?"
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getAddr());
			pstmt.setInt(3, m.getNum());
			pstmt.executeUpdate();
			System.out.println("획원정보를 수정했습니다.");
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