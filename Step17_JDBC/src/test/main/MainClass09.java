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
		
		//�߰��� ȸ���� ����
		String name="������";
		String addr="����";		
		//MemberDto ��ü�� �����ؼ�
		MemberDto m1 = new MemberDto();
		//setter �޼ҵ带 �̿��ؼ� ȸ�������� ���
		m1.setName(name);
		m1.setAddr(addr);
		//�޼ҵ� ȣ���ϸ鼭 MemberDto ��ü�� ������ �����ϱ�
		insert(m1);
		
		
	}
	
	//ȸ�� �Ѹ��� ������ �߰��ϴ� �޼ҵ�
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
