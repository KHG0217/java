package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.mypac.Member;
import test.util.DBConnect;

public class MainClass12 {
	public static void main(String[] args) {
		//메소드가 리턴해주는 전체 회원의 목록을 main 메소드 안에서 사용하고 싶다면 ?
		List<MemberDto> list=getList();//메소드를 호출해서 전체 회원목록을 받아온다.
		for(MemberDto tmp:list) {
			System.out.println(tmp.getNum()+"|"+tmp.getName()+"|"+tmp.getAddr());
		}
		
		
	}
	//전체 회원의 목록을 리턴해주는 메소드
	public static List<MemberDto> getList(){
		ArrayList<MemberDto> DtoList = new ArrayList<>();
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
				MemberDto DtoData = new MemberDto();		
				DtoData.setNum(rs.getInt("num"));
				DtoData.setName(rs.getString("name"));
				DtoData.setAddr(rs.getString("addr"));
				DtoList.add(DtoData);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		 }
		return DtoList;
	
		
		
	}
	
}
