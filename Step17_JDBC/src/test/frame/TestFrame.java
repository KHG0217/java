package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class TestFrame extends JFrame implements ActionListener{
	   //�ʵ�
	   JTextField inputName, inputAddr;
	   DefaultTableModel model;
	   JTable table;
	   MemberDao dao;
	   MemberDto dto;
	   //������
	   public TestFrame() {
	      setLayout(new BorderLayout());
	      
	      JLabel label1=new JLabel("�̸�");
	      inputName=new JTextField(10);
	      
	      JLabel label2=new JLabel("�ּ�");
	      inputAddr=new JTextField(10);
	      
	      JButton saveBtn=new JButton("����");
	      saveBtn.setActionCommand("save");
	      saveBtn.addActionListener(this);
	      
	      //���� ��ư �߰�
	      JButton deleteBtn=new JButton("����");
	      deleteBtn.setActionCommand("delete");
	      deleteBtn.addActionListener(this);
	      
	      JPanel panel=new JPanel();
	      panel.add(label1);
	      panel.add(inputName);
	      panel.add(label2);
	      panel.add(inputAddr);
	      panel.add(saveBtn);
	      panel.add(deleteBtn);
	      
	      add(panel, BorderLayout.NORTH);
	      
	      //ǥ�������� ������ ����ϱ� ���� JTable
	      table=new JTable();
	      //Į������ String[] �� ������� �غ�
	      String[] colNames= {"��ȣ", "�̸�", "�ּ�"};
	      //���̺� ����� ������ ������ �ִ� �� ��ü (Į����, row ����)
	      model=new DefaultTableModel(colNames, 0);
	      //���� ���̺� �����Ѵ�.
	      table.setModel(model);
	      //��ũ���� ���� �ϵ��� ���̺��� JScrollPane �� ���Ѵ�.
	      JScrollPane scroll=new JScrollPane(table);
	      //JScrollPane  �� �������� ����� ��ġ�ϱ� 
	      add(scroll, BorderLayout.CENTER);
	      
	      displayMember();
	   }
	   
	   //���̺� ������ ����ϴ� �޼ҵ�
	   public void displayMember() {
	      //model.setRowCount(0); ���̺� ��µ� ������ reset
	     //table.getSelectedRow(); 
	     
	       dao=new MemberDao();
	       dto=new MemberDto();
	       List<MemberDto> list =dao.getList();                  
	     for (int i=0; i<list.size(); i++) {
	        Vector<Object> vc = new Vector<Object>();
	        vc.add(list.get(i).getNum());
	        vc.add(list.get(i).getName());
	        vc.add(list.get(i).getAddr());
	        model.addRow(vc);
	     }                       
	   }
	        
	   // main  �޼ҵ�
	   public static void main(String[] args) {
	      TestFrame f=new TestFrame();
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setBounds(100, 100, 800, 500);
	      f.setVisible(true);
	   }

	   @Override
	   public void actionPerformed(ActionEvent e) {
	      String command = e.getActionCommand();
	      String name=inputName.getText();
	      String addr=inputAddr.getText();
	      dao=new MemberDao();
	      dto=new MemberDto();
	      
	      if(command.equals("save")) {
	         dto.setName(name);
	         dto.setAddr(addr);
	         boolean isSuccess=dao.insert(dto);
	         if(isSuccess) {
	            System.out.println(name+" �� ������ �߰� �߽��ϴ�.");
	            model.setRowCount(0);
	            displayMember();
	            
	         }else {
	            System.out.println(name+" �����߰� ����!");
	         }

	      }else if(command.equals("delete")){
	    	  int selectedIndex=table.getSelectedRow();

	    	  int num=(int) model.getValueAt(selectedIndex, 0);
	    	  dao.delete(num);
	    	
	         //Ŀ���� ����Ű�°ſ� ��ȣ�� �־�ߵǴµ� ?
	         table.getSelectedRow();
	         model.setRowCount(0);
	         displayMember();
	      }
	      
	   }
	}