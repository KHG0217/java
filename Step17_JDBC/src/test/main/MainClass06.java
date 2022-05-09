package test.main;

import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnect;

public class MainClass06 {
	public static void main(String[] args) {
		//������ member_seq�� Ȱ���ؼ� ȸ�� ������ �߰��� ������.
		String name="������";
		String addr="������";
		//SELECT �۾��� ���ؼ� �ʿ��� ��ü�� �������� ���� �������� �̸� �����
		Connection conn=null;
		PreparedStatement pstmt=null;//(����)
		try {
			//DBConnect��ü�� �̿��ؼ� Connection ��ü�� �������� ���´�.
			conn=new DBConnect().getConn();
			//������ �̿ϼ��� sql��
			String sql="insert into member "
					+ " (num, name, addr)"
					+ " values(member_seq.nextval, ?, ?)";
			//PreparedStatement ��ü�� ������ ������
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			pstmt.executeUpdate();
			System.out.println("ȸ�������� �����߽��ϴ�.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�.");
	}
}
