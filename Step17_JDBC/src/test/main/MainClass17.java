package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass17 {
	public static void main(String[] args) {
		//추가할 회원정보를 입력받아서
		Scanner scan=new Scanner(System.in);		
		
		System.out.print("수정되어질 번호 입력:");
		int num=scan.nextInt();
		scan.nextLine(); //위에서 입력한 개행기호를 없애기 없애지 않으면 수정할 이름에 개행값이 들어감.
		System.out.print("수정할 이름 입력:");
		String name=scan.nextLine();
		
		System.out.print("수정할 주소 입력:");
		String addr=scan.nextLine();
		

			
		//회원정보를 MemberDto 객체에 담고
		MemberDto dto=new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		//메소드를 호출하면서 전달해서 회원정보를 추가하고 성공여부를 리턴 받는다.
		boolean isSuccess=update(dto);
		if(isSuccess) {
			System.out.println(name+" 의 정보를 수정 했습니다.");
		}else {
			System.out.println(name+" 정보수정 실패!");
		}
		
	}
	
	public static boolean update(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
			conn=new DBConnect().getConn();
			String sql="update member "
					+ " set name=?,addr=?"
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,dto.getName() );
			pstmt.setString(2,dto.getAddr());
			pstmt.setInt(3, dto.getNum());
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
