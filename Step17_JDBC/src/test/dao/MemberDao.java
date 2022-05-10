package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {
	
	//ȸ�� ������ �����ϴ� �޼ҵ�
	public boolean insert(MemberDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
			conn=new DBConnect().getConn();
			String sql="insert into member "
					+ " (num,name,addr)"
					+ " values(member_seq.nextval,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			updatedRowCount=pstmt.executeUpdate();
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
	
	//ȸ�� ������ �����ϴ� �޼ҵ�
	public boolean update(MemberDto dto) {
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
	
	//ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�
	public boolean delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
			conn=new DBConnect().getConn();
			String sql="delete from member "
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,num);
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
	
	//ȸ�� �Ѹ��� ������ �����ϴ� �޼ҵ�
	public MemberDto getData(int num) {
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
	
	
	//ȸ�� ����� �����ϴ� �޼ҵ�
	public List<MemberDto> getList(){
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
