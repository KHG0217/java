package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import test.util.DBConnect;

public class MainClass15 {
	public static void main(String[] args) {
		//삭제할 회원의 번호를 입력 받는다.
		Scanner scan= new Scanner(System.in);
		System.out.println("삭제 할 회원번호 입력:");
		int num=scan.nextInt();
		
		boolean isSuccess =delete(num);
		
		if(isSuccess) {
			System.out.println(num +"번 회원을 삭제 되었습니다.");
		}else {
			System.out.println(num+"번 회원은 존재하지 않습니다.");
		}
	}
	/*
	 * 	인자로 전달된 번호에 해당하는 회원정보를 삭제하고
	 *	작업의 성공여부를 리턴하는 메소드
	 */
	public static boolean delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		boolean isDelete=false;
		try {
			conn=new DBConnect().getConn();
			String sql="delete from member "
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			//sql문 실행하고 수정(추가, 수정, 삭제)된 row의 갯수 리턴받기
			int updatedRowCount =pstmt.executeUpdate();
			
			if(updatedRowCount>0) {
				isDelete=true;
			}else {
				isDelete=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
	        try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         }catch(Exception e) {}
	       }
		return isDelete; 
	  }	 
}

