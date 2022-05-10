package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass14 {
	public static void main(String[] args) {
		//�޼ҵ带 ȣ���ؼ� ���ڷ� ������ ��ȣ�� �ش��ϴ� ȸ�������� ���ͼ�
		MemberDto dto=getData(1);
		if(dto!=null) {
			//����ϱ�
			System.out.println("��ȣ:"+dto.getNum()+"�̸�:"+dto.getName()+" �ּ�:"+dto.getAddr());
		}else {
			System.out.println("�ش� ȸ���� �������� �ʽ��ϴ�.");
		}
		
	}
	
	//���ڷ� ���޵� ��ȣ�� �ش��ϴ� ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�
	public static MemberDto getData(int num) {
		//�ƹ��͵� �ȵ�������� null�� ǥ�������ν� ����ִٴ� ���� �˷� �ش�.
		MemberDto dtoData =null;	
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			String sql ="Select name,addr FROM member"//��ȣ�� ���ڷ� �˰��ֱ� ������ ���� ����Ʈ�� �ʿ� x
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);

			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				dtoData=new MemberDto();
				dtoData.setNum(num);
				dtoData.setName(rs.getString("name"));
				dtoData.setAddr(rs.getString("addr"));
			}						
		}catch(Exception e) {
			e.printStackTrace();
		 }finally {
			 try {
				 if(rs!=null)conn.close();
				 if(pstmt!=null)pstmt.close();
				 if(conn!=null)conn.close();
			 }catch(Exception e) {}
		 }							
		return dtoData;
	}
}
