package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame{
	public TextFieldEx() {
		setTitle("텍스트 필드 컴포넌트");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel idLabel = new JLabel("아이디: ");
		JTextField id new JTextField(20);
		
		JLabel pwdidLabel = new JLabel("아이디: ");
		JTextField pwd new JPasswordField(18);
		
		
		c.add(idLabel);
		c.add(id);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
			setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextFieldEx();
	}

}
