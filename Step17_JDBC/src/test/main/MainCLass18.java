package test.main;

import java.util.List;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainCLass18 {
	public static void main(String[] args) {
		//1 번 회원의 정보를 얻어와야 한다면?
		MemberDao dao=new MemberDao();
		MemberDto dto=dao.getData(1);	
		//모든 회원의 목록을 얻어와야 한다면?
		List<MemberDto> list=dao.getList();	
	}
}
