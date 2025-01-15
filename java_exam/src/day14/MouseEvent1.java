package day14;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent1 extends JFrame{
	public MouseEvent1() {
		setTitle("마우스이벤트");
		Container c = getContentPane();
		c.setLayout(null);
		c.setSize(50,20);
		JLabel label = new JLabel("test!");
		c.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX(); //마우스를 누른 위치에 x값이 리턴된다
				int y = e.getY();
				label.setLocation(x, y);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		label.setSize(50,20);
		label.setSize(30,30);
		
		c.add(label);
		 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
		c.setLocation(30, 30);
		
		c.add(label);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseEvent1 event = new MouseEvent1();

	}

}
