package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import javax.swing.table.DefaultTableModel;


import test.dao.UserInfoDao;
import test.dto.UserInfoDto;


public class UserInfoFrame extends JFrame implements ActionListener, PropertyChangeListener{
	   //필드
	   JTextField inputName, inputAddr, inputFood, inputAllergy, inputVisited, inputLastvisited;
	   DefaultTableModel model;
	   JTable table;
	   UserInfoDao dao;
	   UserInfoDto dto;
	   ImageIcon Icon;
	   ButtonGroup group;
	   JCheckBox man;
	   JCheckBox woman;
	   
	   
	   //생성자
	   public UserInfoFrame() {
		   Icon = new ImageIcon("사진을 넣을 파일경로");
		   
		  setLayout(new BorderLayout());
	      
	      JLabel label1=new JLabel("이름");
	      inputName=new JTextField(10);
	     
	      //라벨 배경색 넣기
	      //label1.setBackground(Color.black);
	      //label1.setOpaque(true);
	      
	      JLabel label2=new JLabel("주소");
	      inputAddr=new JTextField(10);
	     
	      
	      JLabel label3=new JLabel("선호음식");
	      inputFood=new JTextField(10);
	      
	      
	      JLabel label4=new JLabel("알레르기");
	      inputAllergy=new JTextField(10);	      
	      
	      
	      JButton saveBtn=new JButton("저장");
	      saveBtn.setForeground(Color.white);
	      saveBtn.setBackground(new Color(130,192,233));
	      saveBtn.setActionCommand("save");
	      //버튼을 눌렀는지 감시할 리스너 생성 this:프레임의 참조값
	      saveBtn.addActionListener(this);
	      
	      //삭제 버튼 추가
	      JButton deleteBtn=new JButton("삭제");
	      deleteBtn.setForeground(Color.white);
	      deleteBtn.setBackground(new Color(233,130,130));
	      deleteBtn.setActionCommand("delete");
	      //버튼을 눌렀는지 감시할 리스너 생성 this:프레임의 참조값
	      deleteBtn.addActionListener(this);
	      
	      JButton updateBtn=new JButton("날짜갱신");
	      updateBtn.setActionCommand("new");
	      updateBtn.setForeground(Color.white);
	      updateBtn.setBackground(new Color(124,188,117));
	      //버튼을 눌렀는지 감시할 리스너 생성 this:프레임의 참조값
	      updateBtn.addActionListener(this);
	      
	      //남자,여자 둘 중 하나만 선택할 수 있게 버튼 그룹화
	      ButtonGroup group = new ButtonGroup();
	      man=new JCheckBox("남자");
	      man.setForeground(Color.DARK_GRAY);
	      woman=new JCheckBox("여자");
	      woman.setForeground(Color.DARK_GRAY);
	      //그룹에 추가
	      group.add(man);
	      group.add(woman);
	       

	      //무명클레스로 이미지 그리기
	      JPanel panel=new JPanel() {
	    	  public void paintComponent(Graphics g) {	    		 
	    		    g.drawImage(Icon.getImage(), 0, 0, null);
	    		    setOpaque(false);
	    		    super.paintComponent(g);
	    		   }
	    		  };
	    		 
	    	 
	      panel.add(label1);
	      panel.add(inputName);
	      panel.add(label2);
	      panel.add(inputAddr);
	      panel.add(label3);
	      panel.add(inputFood);
	      panel.add(label4);
	      panel.add(inputAllergy);
	      panel.add(saveBtn);
	      panel.add(deleteBtn);
	      panel.add(updateBtn);
	      panel.add(man);
	      panel.add(woman);
	      
	
	      add(panel, BorderLayout.NORTH);
	      
	      //표형식으로 정보를 출력하기 위한 JTable
	      table=new JTable();      	      	      
	      //칼럼명을 String[] 에 순서대로 준비
	      String[] colNames= {"No", "Name", "Addr", "Favraite Food", "Allergy", "Visited","Last visited"};
	      //테이블에 출력할 정보를 가지고 있는 모델 객체 (칼럼명, row 갯수)     
	      model=new DefaultTableModel(colNames, 0) {
	    	  @Override
	    	public boolean isCellEditable(int row, int column) {
	    		System.out.println(row+"|"+column);
	    		  if(column==0) { //0번째 칼럼은
	    			return false; //수정 불가하게 false를 리턴해준다.
	    		}else {// 다른경우는
	    			return true; //모두 수정 가능하게 true를 리턴해준다.
	    		}
	    		
	    	}
	      };
	      
	      
	      //모델을 테이블에 연결한다.
	      table.setModel(model);
	      //스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
	      JScrollPane scroll=new JScrollPane(table);
	      //테이블 배경색 설정
	      scroll.getViewport().setBackground(Color.white);
	      //선택된 셀의 배경색을 설정
	      table.setSelectionBackground(Color.black);
	      //셀의 전경색 설정
	      table.setSelectionForeground(Color.white);
	      
	      //JScrollPane  을 프레임의 가운데에 배치하기 
	      add(scroll, BorderLayout.CENTER);
	      
	      
	      
	      displayMember();
	      
	      //테이블에 값이 바뀌었는지 감시할 리스너
	      table.addPropertyChangeListener(this);
	   }
	   
	   //테이블에 데이터 출력하는 메소드
	   public void displayMember() {
	      //model.setRowCount(0); 테이블에 출력된 데이터 reset
	     //table.getSelectedRow(); 
		   model.setRowCount(0);
		   //실제 DB에 저장된 데이터
		    dao=new UserInfoDao();
	       List<UserInfoDto> list =dao.getList();
	                         
	     for (UserInfoDto tmp:list){
	    	 Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr(), tmp.getFood(), tmp.getAllergy(), tmp.getVisited(), tmp.getLastvisited()};
	    	 //row를 추가한다.
	    	 model.addRow(row);
	     }
	   }
	        
	   // main  메소드
	   public static void main(String[] args) {
	      UserInfoFrame f=new UserInfoFrame();
	      //윈도우창 아이콘 수정을 위한 클레스
	      Toolkit toolkit = Toolkit.getDefaultToolkit();
	      //이미지를 불러오기위한 클래스
	      Image img = toolkit.getImage("아이콘변경 사진넣을 파일경로");
	      f.setTitle("고객명단");
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setBounds(100, 100, 1000, 500);
	      f.setVisible(true);
	      f.setIconImage(img);
 
	   }

	   @Override
	   public void actionPerformed(ActionEvent e) {
	      String command = e.getActionCommand();
	      
	      dao=new UserInfoDao();
	      dto=new UserInfoDto();
	      String name=null;
	      if(command.equals("save")) {
	    	 //남자선택하거나 여자선택할때
	    	  if(man.isSelected()||woman.isSelected()) {
	    		//1.입력한 이름과 주소를 불러온다.
			     //if문으로 남자선택,여자선택분기
	    		  if(man.isSelected()) {
	    			 name=inputName.getText()+" (M)";
	    			 
	    		  }else if(woman.isSelected()) {
	    		   name=inputName.getText()+" (W)";
	    		  }
			     	    		 
	    		 String addr=inputAddr.getText();
			     String food=inputFood.getText();
			     String allergy=inputAllergy.getText();
			     
			    
			      
				     
			     //2.읽어온 이름과 주소를 MemberDto 객체를 생성해서 담는다.
			     dto.setName(name);
		         dto.setAddr(addr);
		         dto.setFood(food);
		         dto.setAllergy(allergy);
		         //dto.setVisited(visited);
		         //3. MemberDao 객체를 이용해서 DB에 저장한다.
		         boolean isSuccess=dao.insert(dto);
		         if(isSuccess) {
		            inputName.setText("");
		            inputAddr.setText("");
		            inputFood.setText("");
		            inputAllergy.setText("");
		            //inputVisited.setText("");
		            JOptionPane.showMessageDialog(this, name+"의 정보를 추가했습니다. ");
		            //4. refresh !
		            this.displayMember();
		            //동일한 객체안에 this는 생략가능
		            
		         }else {
		            System.out.println(name+" 정보추가 실패!");
		         }
	    	 }else {//성별체크를 안할시
	    		 JOptionPane.showMessageDialog(this, "성별을 체크해주세요.");
	    	 }
	    	 

	      }else if(command.equals("delete")){
	    	  //1. 선택한 row가 있는지, 있다면 어떤 row를 선택했는지 알아내기
	    	  //int selectedIndex=table.getSelectedRow();
	    	  int[] rows =table.getSelectedRows();
	    	  if(rows.length == 0) {
	    		  //선택된 row가 없다고 알려준다.
	    		  JOptionPane.showMessageDialog(this, "선택된 row가 없습니다.");
	    		  //프레임 코드실행 못하게 하기.
	    		  return; //void 메소드를 종료하는법.
	    	  } 
	    	  for (int tmp:rows) {
	    		//2. 선택한 row의 가장 첫번째 칼럼에 있는 숫자를 읽어내기.
		    	  int num=(int)model.getValueAt(tmp, 0);
		    	  //3. MemberDao 객체를 이용해서 DB에서 삭제
		    	  dao.delete(num);
	    	  }
	    	  
	    	  //4. refresh !
	    	  this.displayMember();	    	     	  	    		 
	      //갱신버튼을 눌렀을때 날짜와 현재시간으로 갱신한다.
	      }else if(command.equals("new")) {
	    	  int[] rows = table.getSelectedRows();
	    	  if(rows.length ==0) {
	    		  JOptionPane.showMessageDialog(this, "선택된 회원정보가 없습니다.");
	    		  return;
	    	  }
	    	  for(int tmp:rows) {
	    		  int num=(int)model.getValueAt(tmp, 0);
	    		  dao.dateupdate(num);
	    		  this.displayMember();
	    	  }
	      }
	      
	}
	   

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("property name"+evt.getPropertyName());
		
		System.out.println("isEditing:"+table.isEditing());
		/*
		 * 	property name이 "tableCellEditor"이고
		 * 	table이 수정중이 아닐때
		 * 	현재 포커스가 있는 곳의 정보를 모두 읽어와서 DB에 수정반영하기
		 */
		if(evt.getPropertyName().equals("tableCellEditor")&& !table.isEditing()) {
			//현재 포커스가 있는 row의 정보를 DB에 수정반영한다.
            int selectedIndex=table.getSelectedRow();
            int num=(int)model.getValueAt(selectedIndex, 0);
            String name=(String)model.getValueAt(selectedIndex, 1);
            String addr=(String)model.getValueAt(selectedIndex, 2);
            String food=(String)model.getValueAt(selectedIndex, 3);
            String allergy=(String)model.getValueAt(selectedIndex, 4);
            int visited=Integer.parseInt((String)model.getValueAt(selectedIndex, 5));
            //int visited=(int)model.getValueAt(selectedIndex, 5);
            String lastvisited=(String)model.getValueAt(selectedIndex, 6);
            //수정할 회원의 정보를 MemberDto 객체에 담고 
            dto=new UserInfoDto(num, name, addr, food, allergy, visited, lastvisited);
            //DB에 저장하기 
            dao.update(dto);
            //수정된후에 선택된 셀렉트를 지우기.
            table.clearSelection();
		}
	}
}