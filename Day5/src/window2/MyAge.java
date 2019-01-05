package window2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MyAge {

	JFrame f; // 선언!(사용할 수 있는 범위)
	JLabel top, name, year, age, result;
	JButton confirm;
	JTextField n, y, a;

	public MyAge() {

		f = new JFrame();
		f.setSize(300, 200);

		top = new JLabel("<<<<<<<성인 인증 프로그램 입니다.>>>>>>>");
		name = new JLabel("이름");
		year = new JLabel("생년");
		age = new JLabel("나이");
		result = new JLabel();

		confirm = new JButton("인증");

		n = new JTextField(20);
		y = new JTextField(20);
		a = new JTextField(20);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		f.add(top);
		f.add(name);
		f.add(n);
		f.add(year);
		f.add(y);
		f.add(age);
		f.add(a);
		f.add(confirm);
		f.add(result);

		result.setForeground(Color.BLUE);
		top.setForeground(Color.BLUE);
		confirm.setForeground(Color.BLUE);
		confirm.setBackground(Color.YELLOW);

		confirm.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = n.getText();
				String year = y.getText();
				int yearInt = Integer.parseInt(year);
				int age = 2019 - yearInt;
				a.setText(age + "");

				if (age >= 19) {
					result.setText(name + " 님은 성인입니다.");
				} else {
					result.setText(name + " 님은 미성년자입니다.");
				}

			}
		});

		f.setVisible(true);

	}

	public static void main(String[] args) {

		MyAge age = new MyAge();

	}

}
