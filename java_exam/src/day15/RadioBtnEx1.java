package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioBtnEx1 extends JFrame {
	public RadioBtnEx1() {
		setTitle("키 입력 이벤트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		 //그룹으로 묶어서 중복허용이 되지 않도록 한다  
		ButtonGroup gender = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("남");
		JRadioButton radio2 = new JRadioButton("여");
		
		gender.add(radio1);
		gender.add(radio2);
		
		c.add(radio1);
		c.add(radio2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250,200);
			setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioBtnEx1();
	}

}
