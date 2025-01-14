package day13;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BtnEvent extends JFrame {
	BtnEvent() {
		setTitle("첫번째 GUI ");

		Container c = getContentPane();
		c.setBackground(Color.green);

		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Action");
		btn1.addActionListener(new MyEvent());
		c.add(btn1);

		JButton btn2 = new JButton("Action");
		btn2.addActionListener(new MyEvent());
		c.add(btn2);
		// 1 리스너를 부착시킨다 (버튼은 액션리스너를 부착한 이벤트 사용 )
		// 버튼이 클릭되는 순간에 마이 이벤트에잇는 액션퍼폼이라는 메소드를 호출한다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BtnEvent gui = new BtnEvent();
	}
}

class MyEvent implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		if(btn.getText().equals("Action")) {
			btn.setText("액션");
		}else {
			btn.setText("Action");
		}
	}
}
