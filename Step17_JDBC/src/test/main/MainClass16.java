package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass16 {
	public static void main(String[] args) {
		//추가할 회원정보를 입력받아서
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 입력:");
		String name=scan.nextLine();
		System.out.print("주소 입력:");
		String addr=scan.nextLine();
		//회원정보를 MemberDto 객체에 담고
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		//메소드를 호출하면서 전달해서 회원정보를 추가하고 성공여부를 리턴 받는다.
		boolean isSuccess=insert(dto);
		if(isSuccess) {
			System.out.println(name+" 의 정보를 추가 했습니다.");
		}else {
			System.out.println(name+" 정보추가 실패!");
		}
		
	}
	
	public static boolean insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
			conn=new DBConnect().getConn();
			String sql="insert into member "
					+ " (num,name,addr)"
					+ " values(member_seq.nextval,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,dto.getName() );
			pstmt.setString(2,dto.getAddr());
			updatedRowCount =pstmt.executeUpdate();
	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
	        try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         }catch(Exception e) {}
	       }if(updatedRowCount > 0) {
	    	   return true;
	       }else {
	    	   return false;
	       }
	      		
	}
}
