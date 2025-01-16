package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxEx1 extends JFrame{
	public CheckBoxEx1(){
		setTitle("키 입력 이벤트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JCheckBox check1 = new JCheckBox("사과 ");
		JCheckBox check2 = new JCheckBox("배", true); //true 최초실행시에 체크된 상태로 출력된다  
		ImageIcon phone1 = new ImageIcon("Image/Phone1.png");
		ImageIcon phone2 = new ImageIcon("Image/Phone2color.png");
		JCheckBox check3 = new JCheckBox( phone1);
		check3.setBorderPainted(true);
		check3.setSelectedIcon(phone2); 
		
		
		c.add(check1);
		c.add(check2);
		c.add(check3);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
			setVisible(true);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxEx1();
	}

}
