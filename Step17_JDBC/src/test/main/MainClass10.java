package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		//������ ȸ���� ����
		int num=1;
		String name="ȣ��";
		String addr="�н���";
		
		MemberDto mDto = new MemberDto();
		mDto.setNum(num);
		mDto.setName(name);
		mDto.setAddr(addr);
		update(mDto);
		
	}
	//ȸ�� 1���� ������ �����ϴ� �޼ҵ�
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
			System.out.println("ȹ�������� �����߽��ϴ�.");
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