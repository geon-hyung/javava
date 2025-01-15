package day14;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ReviewEx1 extends JFrame {
	private int checkNum = 1;
	// 시간체크
	private double startTime;
	private double endTime;

	public ReviewEx1() {
		setTitle("랜덤 버튼 배치");
		Container c = getContentPane();
		c.setLayout(null);
		Random ran = new Random();

		for (int i = 1; i <= 10; i++) {

			JButton btn = new JButton(i + "");

			btn.setSize(50, 50);
			int x = ran.nextInt(400);
			int y = ran.nextInt(400);
			btn.setLocation(x, y);
			btn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JButton btn = (JButton) e.getSource(); // 다운캐스팅
					// "1" => 1
					int btnNum = Integer.parseInt(btn.getText());
					if (btnNum == checkNum) { // 체크넘으로 선언하면서 체크넘을 순차적으로 증가시킨다
						btn.setVisible(false);
						checkNum++;

						if (checkNum == 2) {
							startTime = System.currentTimeMillis(); // 시간가져오는 코드
						}
						if (checkNum > 10) {
							endTime = System.currentTimeMillis(); //

							double time = (endTime - startTime) / 1000; // 밀리세컨즈타임이라 1000으로 나누어준다
							System.out.println(time + "초");
						}
					}
				}
			});
			c.add(btn);
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReviewEx1 myFrame = new ReviewEx1();
	}

}