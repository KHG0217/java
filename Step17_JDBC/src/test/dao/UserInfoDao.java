package test.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import test.dto.UserInfoDto;
import test.util.DBConnect;

public class UserInfoDao {
	


	//회원 정보를 저장하는 메소드
	public boolean insert(UserInfoDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
			conn=new DBConnect().getConn();
			String sql="insert into userinfo "
					+ " (num,name,addr,food,allergy,visited,lastvisited)"
					+ " values(userinfo_seq.nextval,?,?,?,?,?,sysdate)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setString(3, dto.getFood());
			pstmt.setString(4, dto.getAllergy());
			pstmt.setInt(5, 1);
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
	
	//회원 정보를 수정하는 메소드
	public boolean update(UserInfoDto dto) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
			conn=new DBConnect().getConn();
			String sql="update userinfo "
					+ " set name=?,addr=?,food=?,allergy=?,visited=?"
					+ " where num=?";		
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,dto.getName() );
			pstmt.setString(2,dto.getAddr());
			pstmt.setString(3, dto.getFood());
			pstmt.setString(4, dto.getAllergy());
			pstmt.setInt(5, dto.getVisited());
			pstmt.setInt(6, dto.getNum());
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
	
	//회원 한명의 정보를 삭제하는 메소드
	public boolean delete(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
			conn=new DBConnect().getConn();
			String sql="delete from userinfo "
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
	
	//회원 한명의 정보를 리턴하는 메소드
	public UserInfoDto getData(int num) {
		UserInfoDto dtoData =null;	
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			String sql ="Select name,addr,food,allergy,visited,lastvisited FROM userinfo"//번호는 인자로 알고있기 때문에 굳이 셀렉트할 필요 x
					+ " where num=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, num);

			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				dtoData=new UserInfoDto();
				dtoData.setNum(num);
				dtoData.setName(rs.getString("name"));
				dtoData.setAddr(rs.getString("addr"));
				dtoData.setFood(rs.getString("food"));
				dtoData.setAllergy(rs.getString("allergy"));
				dtoData.setVisited(rs.getInt("visited"));
				dtoData.setLastvisited(rs.getString("lastvisited"));
				
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
	
	
	//회원 목록을 리턴하는 메소드
	public List<UserInfoDto> getList(){
		List<UserInfoDto> dtoList = new ArrayList<>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			conn=new DBConnect().getConn();
			String sql ="Select num,name,addr,food,allergy,visited,lastvisited FROM userinfo"
					+ " ORDER BY num ASC";
			pstmt=conn.prepareStatement(sql);

			rs=pstmt.executeQuery();

			while(rs.next()) {
				UserInfoDto dtoData = new UserInfoDto();		
				dtoData.setNum(rs.getInt("num"));
				dtoData.setName(rs.getString("name"));
				dtoData.setAddr(rs.getString("addr"));
				dtoData.setFood(rs.getString("food"));
				dtoData.setAllergy(rs.getString("allergy"));
				dtoData.setVisited(rs.getInt("visited"));
				dtoData.setLastvisited(rs.getString("lastvisited"));//
				dtoList.add(dtoData);				
			}
		}catch(Exception e) {
			e.printStackTrace();
		 }
		return dtoList;					
	}
	
	public boolean dateupdate(int num) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		int updatedRowCount=0;
		try {
			conn=new DBConnect().getConn();
			String sql="update userinfo "
					+ " set lastvisited=sysdate"
					+ " where num=?";		
			pstmt=conn.prepareStatement(sql);						
			pstmt.setInt(1, num);
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
