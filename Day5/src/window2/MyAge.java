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

	JFrame f; // ����!(����� �� �ִ� ����)
	JLabel top, name, year, age, result;
	JButton confirm;
	JTextField n, y, a;

	public MyAge() {

		f = new JFrame();
		f.setSize(300, 200);

		top = new JLabel("<<<<<<<���� ���� ���α׷� �Դϴ�.>>>>>>>");
		name = new JLabel("�̸�");
		year = new JLabel("����");
		age = new JLabel("����");
		result = new JLabel();

		confirm = new JButton("����");

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
					result.setText(name + " ���� �����Դϴ�.");
				} else {
					result.setText(name + " ���� �̼������Դϴ�.");
				}

			}
		});

		f.setVisible(true);

	}

	public static void main(String[] args) {

		MyAge age = new MyAge();

	}

}
