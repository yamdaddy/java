package window2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Pizza {

	JFrame f;
	JLabel top, count;
	JButton b1, b2, b3;
	JTextField total;
	int sum = 0;
	int combo = 0;
	int potato = 0;
	int bul = 0;

	JTextArea list;

	public Pizza() {

		f = new JFrame();
		f.setSize(350, 200);

		top = new JLabel("�ڹ� ���ڿ� ���Ű��� ȯ���մϴ�. ���ڸ� ������ �ּ���.");
		count = new JLabel("����");
		b1 = new JButton("�޺�����");
		b2 = new JButton("������������");
		b3 = new JButton("�Ұ������");
		total = new JTextField(20);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		list = new JTextArea(3, 30);

		f.add(top);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(count);
		f.add(total);
		f.add(list);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				combo++;
				list.setText("�޺�: " + combo + "��\n"
						+ "��������: " + potato + "��\n"
						+ "�Ұ��: " + bul + "��");

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				potato++;
				list.setText("�޺�: " + combo + "��\n"
						+ "��������: " + potato + "��\n"
						+ "�Ұ��: " + bul + "��");

			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				bul++;
				list.setText("�޺�: " + combo + "��\n"
						+ "��������: " + potato + "��\n"
						+ "�Ұ��: " + bul + "��");

			}
		});

		f.setVisible(true);

	}

	public static void main(String[] args) {

		Pizza p = new Pizza();

	}

}
