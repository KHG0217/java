package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
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

public class MemberFrame extends JFrame implements ActionListener, PropertyChangeListener{
	   //�ʵ�
	   JTextField inputName, inputAddr;
	   DefaultTableModel model;
	   JTable table;
	   MemberDao dao;
	   MemberDto dto;
	   //������
	   public MemberFrame() {
	      setLayout(new BorderLayout());
	      
	      JLabel label1=new JLabel("�̸�");
	      inputName=new JTextField(10);
	      
	      JLabel label2=new JLabel("�ּ�");
	      inputAddr=new JTextField(10);
	      
	      JButton saveBtn=new JButton("����");
	      saveBtn.setActionCommand("save");
	      //��ư�� �������� ������ ������ ���� this:�������� ������
	      saveBtn.addActionListener(this);
	      
	      //���� ��ư �߰�
	      JButton deleteBtn=new JButton("����");
	      deleteBtn.setActionCommand("delete");
	      //��ư�� �������� ������ ������ ���� this:�������� ������
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
		    dao=new MemberDao();
	       List<MemberDto> list =dao.getList();
	                         
	     for (MemberDto tmp:list){
	    	 Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
	    	 //row�� �߰��Ѵ�.
	    	 model.addRow(row);
	     }
	   }
	        
	   // main  �޼ҵ�
	   public static void main(String[] args) {
	      MemberFrame f=new MemberFrame();
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setBounds(100, 100, 800, 500);
	      f.setVisible(true);
	   }

	   @Override
	   public void actionPerformed(ActionEvent e) {
	      String command = e.getActionCommand();
	      
	      dao=new MemberDao();
	      dto=new MemberDto();
	      
	      if(command.equals("save")) {
	    	 //1.�Է��� �̸��� �ּҸ� �ҷ��´�.
		     String name=inputName.getText();
		     String addr=inputAddr.getText();
		     
		     //2.�о�� �̸��� �ּҸ� MemberDto ��ü�� �����ؼ� ��´�.
		     dto.setName(name);
	         dto.setAddr(addr);
	         //3. MemberDao ��ü�� �̿��ؼ� DB�� �����Ѵ�.
	         boolean isSuccess=dao.insert(dto);
	         if(isSuccess) {
	            System.out.println(name+" �� ������ �߰� �߽��ϴ�.");
	            inputName.setText("");
	            inputAddr.setText("");
	            JOptionPane.showMessageDialog(this, name+"�� ������ �߰��߽��ϴ�. ");
	            //4. refresh !
	            this.displayMember();
	            //������ ��ü�ȿ� this�� ��������
	            
	         }else {
	            System.out.println(name+" �����߰� ����!");
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
	      }    	  	           	   
	}
	   
	//���� 

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
            //������ ȸ���� ������ MemberDto ��ü�� ��� 
            dto=new MemberDto(num, name, addr);
            //DB�� �����ϱ� 
            dao.update(dto);
            //�������Ŀ� ���õ� ����Ʈ�� �����.
            table.clearSelection();
		}
	}
}