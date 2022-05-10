package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass14 {
	public static void main(String[] args) {
		//메소드를 호출해서 인자로 전달한 번호에 해당하는 회원정보를 얻어와서
		MemberDto dto=getData(1);
		if(dto!=null) {
			//사용하기
			System.out.println("번호:"+dto.getNum()+"이름:"+dto.getName()+" 주소:"+dto.getAddr());
		}else {
			System.out.println("해당 회원은 존재하지 않습니다.");
		}
		
	}
	
	//인자로 전달된 번호에 해당하는 회원 한명의 정보를 리턴하는 메소드
	public static MemberDto getData(int num) {
		//아무것도 안들어있을때 null을 표시함으로써 비어있다는 것을 알려 준다.
		MemberDto dtoData =null;	
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			String sql ="Select name,addr FROM member"//번호는 인자로 알고있기 때문에 굳이 셀렉트할 필요 x
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
