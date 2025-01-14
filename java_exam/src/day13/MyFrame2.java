package day13;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame {
	MyFrame2() {
		 setTitle("첫번째 GUI ");
		 
		 Container c = getContentPane();
		 c.setLayout(new BorderLayout(10,10));
		 c.setBackground(Color.gray);
		 //borderLayout
		 
		 JButton btn1 = new JButton("1번버튼");
				 JButton btn2 = new JButton("2번버튼");
				 JButton btn3 = new JButton("3번버튼");
		c.add(btn1, BorderLayout.EAST);		 
		c.add(btn2, BorderLayout.WEST);		 
		c.add(btn3, BorderLayout.NORTH);		
		c.add(btn3, BorderLayout.SOUTH);		
		for(int i =0; i < 10; i ++) {
			c.add(new JButton("test"+1));
		}
				 
		 
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(300,300);
		 setVisible(true);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFrame2 gui = new MyFrame2();
	}

}
