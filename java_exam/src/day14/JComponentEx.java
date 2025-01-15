package day14;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JComponentEx extends JFrame {
	public JComponentEx() {
		setTitle("버튼 컴포넌트");
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout());
		
		
		JButton btn1 = new JButton("색상 버튼");
		JButton btn2 = new JButton("비활성 버튼");
		JButton btn3 = new JButton("버튼 활성화");
		
		btn1.setBackground(Color.MAGENTA);
		btn1.setForeground(Color.blue);
		btn1.setFont(new Font("",Font.BOLD,30)); //글자체 , 스타일 , 글자크기 
		
		
		btn2.setEnabled(false);
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				btn2.isEnabled(); //현재 상태 값과 반대로  
				btn2.setEnabled(!btn2.isEnabled());
//				btn1.setVisible(false); //visible 눈에 보이게 false를 사용하면 가려진다 . true가 되면 다시 사용한다
				c.remove(btn1); //만 단독으로 실행했을때 자동으로 갱신이 되지 않아서 사라지지 않음 아래코드와 같이 사용
				revalidate(); //갱신해주는 코드  (아예 사라짐 ) 
				repaint(); // 그려주는 코드 
			}
		});
		
		
		
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
			setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComponentEx();
	}

}
