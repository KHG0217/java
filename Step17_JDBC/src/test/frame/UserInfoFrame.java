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
	   //�ʵ�
	   JTextField inputName, inputAddr, inputFood, inputAllergy, inputVisited, inputLastvisited;
	   DefaultTableModel model;
	   JTable table;
	   UserInfoDao dao;
	   UserInfoDto dto;
	   ImageIcon Icon;
	   ButtonGroup group;
	   JCheckBox man;
	   JCheckBox woman;
	   
	   
	   //������
	   public UserInfoFrame() {
		   Icon = new ImageIcon("������ ���� ���ϰ��");
		   
		  setLayout(new BorderLayout());
	      
	      JLabel label1=new JLabel("�̸�");
	      inputName=new JTextField(10);
	     
	      //�� ���� �ֱ�
	      //label1.setBackground(Color.black);
	      //label1.setOpaque(true);
	      
	      JLabel label2=new JLabel("�ּ�");
	      inputAddr=new JTextField(10);
	     
	      
	      JLabel label3=new JLabel("��ȣ����");
	      inputFood=new JTextField(10);
	      
	      
	      JLabel label4=new JLabel("�˷�����");
	      inputAllergy=new JTextField(10);	      
	      
	      
	      JButton saveBtn=new JButton("����");
	      saveBtn.setForeground(Color.white);
	      saveBtn.setBackground(new Color(130,192,233));
	      saveBtn.setActionCommand("save");
	      //��ư�� �������� ������ ������ ���� this:�������� ������
	      saveBtn.addActionListener(this);
	      
	      //���� ��ư �߰�
	      JButton deleteBtn=new JButton("����");
	      deleteBtn.setForeground(Color.white);
	      deleteBtn.setBackground(new Color(233,130,130));
	      deleteBtn.setActionCommand("delete");
	      //��ư�� �������� ������ ������ ���� this:�������� ������
	      deleteBtn.addActionListener(this);
	      
	      JButton updateBtn=new JButton("��¥����");
	      updateBtn.setActionCommand("new");
	      updateBtn.setForeground(Color.white);
	      updateBtn.setBackground(new Color(124,188,117));
	      //��ư�� �������� ������ ������ ���� this:�������� ������
	      updateBtn.addActionListener(this);
	      
	      //����,���� �� �� �ϳ��� ������ �� �ְ� ��ư �׷�ȭ
	      ButtonGroup group = new ButtonGroup();
	      man=new JCheckBox("����");
	      man.setForeground(Color.DARK_GRAY);
	      woman=new JCheckBox("����");
	      woman.setForeground(Color.DARK_GRAY);
	      //�׷쿡 �߰�
	      group.add(man);
	      group.add(woman);
	       

	      //����Ŭ������ �̹��� �׸���
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
	      
	      //ǥ�������� ������ ����ϱ� ���� JTable
	      table=new JTable();      	      	      
	      //Į������ String[] �� ������� �غ�
	      String[] colNames= {"No", "Name", "Addr", "Favraite Food", "Allergy", "Visited","Last visited"};
	      //���̺� ����� ������ ������ �ִ� �� ��ü (Į����, row ����)     
	      model=new DefaultTableModel(colNames, 0) {
	    	  @Override
	    	public boolean isCellEditable(int row, int column) {
	    		System.out.println(row+"|"+column);
	    		  if(column==0) { //0��° Į����
	    			return false; //���� �Ұ��ϰ� false�� �������ش�.
	    		}else {// �ٸ�����
	    			return true; //��� ���� �����ϰ� true�� �������ش�.
	    		}
	    		
	    	}
	      };
	      
	      
	      //���� ���̺� �����Ѵ�.
	      table.setModel(model);
	      //��ũ���� ���� �ϵ��� ���̺��� JScrollPane �� ���Ѵ�.
	      JScrollPane scroll=new JScrollPane(table);
	      //���̺� ���� ����
	      scroll.getViewport().setBackground(Color.white);
	      //���õ� ���� ������ ����
	      table.setSelectionBackground(Color.black);
	      //���� ����� ����
	      table.setSelectionForeground(Color.white);
	      
	      //JScrollPane  �� �������� ����� ��ġ�ϱ� 
	      add(scroll, BorderLayout.CENTER);
	      
	      
	      
	      displayMember();
	      
	      //���̺� ���� �ٲ������ ������ ������
	      table.addPropertyChangeListener(this);
	   }
	   
	   //���̺� ������ ����ϴ� �޼ҵ�
	   public void displayMember() {
	      //model.setRowCount(0); ���̺� ��µ� ������ reset
	     //table.getSelectedRow(); 
		   model.setRowCount(0);
		   //���� DB�� ����� ������
		    dao=new UserInfoDao();
	       List<UserInfoDto> list =dao.getList();
	                         
	     for (UserInfoDto tmp:list){
	    	 Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr(), tmp.getFood(), tmp.getAllergy(), tmp.getVisited(), tmp.getLastvisited()};
	    	 //row�� �߰��Ѵ�.
	    	 model.addRow(row);
	     }
	   }
	        
	   // main  �޼ҵ�
	   public static void main(String[] args) {
	      UserInfoFrame f=new UserInfoFrame();
	      //������â ������ ������ ���� Ŭ����
	      Toolkit toolkit = Toolkit.getDefaultToolkit();
	      //�̹����� �ҷ��������� Ŭ����
	      Image img = toolkit.getImage("�����ܺ��� �������� ���ϰ��");
	      f.setTitle("�����");
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
	    	 //���ڼ����ϰų� ���ڼ����Ҷ�
	    	  if(man.isSelected()||woman.isSelected()) {
	    		//1.�Է��� �̸��� �ּҸ� �ҷ��´�.
			     //if������ ���ڼ���,���ڼ��úб�
	    		  if(man.isSelected()) {
	    			 name=inputName.getText()+" (M)";
	    			 
	    		  }else if(woman.isSelected()) {
	    		   name=inputName.getText()+" (W)";
	    		  }
			     	    		 
	    		 String addr=inputAddr.getText();
			     String food=inputFood.getText();
			     String allergy=inputAllergy.getText();
			     
			    
			      
				     
			     //2.�о�� �̸��� �ּҸ� MemberDto ��ü�� �����ؼ� ��´�.
			     dto.setName(name);
		         dto.setAddr(addr);
		         dto.setFood(food);
		         dto.setAllergy(allergy);
		         //dto.setVisited(visited);
		         //3. MemberDao ��ü�� �̿��ؼ� DB�� �����Ѵ�.
		         boolean isSuccess=dao.insert(dto);
		         if(isSuccess) {
		            inputName.setText("");
		            inputAddr.setText("");
		            inputFood.setText("");
		            inputAllergy.setText("");
		            //inputVisited.setText("");
		            JOptionPane.showMessageDialog(this, name+"�� ������ �߰��߽��ϴ�. ");
		            //4. refresh !
		            this.displayMember();
		            //������ ��ü�ȿ� this�� ��������
		            
		         }else {
		            System.out.println(name+" �����߰� ����!");
		         }
	    	 }else {//����üũ�� ���ҽ�
	    		 JOptionPane.showMessageDialog(this, "������ üũ���ּ���.");
	    	 }
	    	 

	      }else if(command.equals("delete")){
	    	  //1. ������ row�� �ִ���, �ִٸ� � row�� �����ߴ��� �˾Ƴ���
	    	  //int selectedIndex=table.getSelectedRow();
	    	  int[] rows =table.getSelectedRows();
	    	  if(rows.length == 0) {
	    		  //���õ� row�� ���ٰ� �˷��ش�.
	    		  JOptionPane.showMessageDialog(this, "���õ� row�� �����ϴ�.");
	    		  //������ �ڵ���� ���ϰ� �ϱ�.
	    		  return; //void �޼ҵ带 �����ϴ¹�.
	    	  } 
	    	  for (int tmp:rows) {
	    		//2. ������ row�� ���� ù��° Į���� �ִ� ���ڸ� �о��.
		    	  int num=(int)model.getValueAt(tmp, 0);
		    	  //3. MemberDao ��ü�� �̿��ؼ� DB���� ����
		    	  dao.delete(num);
	    	  }
	    	  
	    	  //4. refresh !
	    	  this.displayMember();	    	     	  	    		 
	      //���Ź�ư�� �������� ��¥�� ����ð����� �����Ѵ�.
	      }else if(command.equals("new")) {
	    	  int[] rows = table.getSelectedRows();
	    	  if(rows.length ==0) {
	    		  JOptionPane.showMessageDialog(this, "���õ� ȸ�������� �����ϴ�.");
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
		 * 	property name�� "tableCellEditor"�̰�
		 * 	table�� �������� �ƴҶ�
		 * 	���� ��Ŀ���� �ִ� ���� ������ ��� �о�ͼ� DB�� �����ݿ��ϱ�
		 */
		if(evt.getPropertyName().equals("tableCellEditor")&& !table.isEditing()) {
			//���� ��Ŀ���� �ִ� row�� ������ DB�� �����ݿ��Ѵ�.
            int selectedIndex=table.getSelectedRow();
            int num=(int)model.getValueAt(selectedIndex, 0);
            String name=(String)model.getValueAt(selectedIndex, 1);
            String addr=(String)model.getValueAt(selectedIndex, 2);
            String food=(String)model.getValueAt(selectedIndex, 3);
            String allergy=(String)model.getValueAt(selectedIndex, 4);
            int visited=Integer.parseInt((String)model.getValueAt(selectedIndex, 5));
            //int visited=(int)model.getValueAt(selectedIndex, 5);
            String lastvisited=(String)model.getValueAt(selectedIndex, 6);
            //������ ȸ���� ������ MemberDto ��ü�� ��� 
            dto=new UserInfoDto(num, name, addr, food, allergy, visited, lastvisited);
            //DB�� �����ϱ� 
            dao.update(dto);
            //�������Ŀ� ���õ� ����Ʈ�� �����.
            table.clearSelection();
		}
	}
}