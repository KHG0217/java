package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.mypac.Member;
import test.util.DBConnect;

public class MainClass13 {
	public static void main(String[] args) {
		//�޼ҵ尡 �������ִ� ��ü ȸ���� ����� main �޼ҵ� �ȿ��� ����ϰ� �ʹٸ� ?
		List<MemberDto> list=getList();//�޼ҵ带 ȣ���ؼ� ��ü ȸ������� �޾ƿ´�.
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum()+"|"+tmp.getName()+"|"+tmp.getAddr());
		}
		
		
	}
	//��ü ȸ���� ����� �������ִ� �޼ҵ�
	public static List<MemberDto> getList(){
		List<MemberDto> dtoList = new ArrayList<>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			String sql ="Select num,name,addr FROM member"
					+ " ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);

			rs=pstmt.executeQuery();

			while(rs.next()) {
				MemberDto dtoData = new MemberDto();		
				dtoData.setNum(rs.getInt("num"));
				dtoData.setName(rs.getString("name"));
				dtoData.setAddr(rs.getString("addr"));
				dtoList.add(dtoData);				
			}
		}catch(Exception e) {
			e.printStackTrace();
		 }
		return dtoList;					
	}
	
}
