package window2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

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
	private JLabel label;
	private JButton btnNewButton;

	public Pizza() {

		f = new JFrame();
		f.setSize(354, 223);

		top = new JLabel("자바 피자에 오신것을 환영합니다. 피자를 선택해 주세요.");
		count = new JLabel("개수");
		b1 = new JButton("\uCF64\uBCF4\uD53C\uC790!!!!");
		b1.setFont(new Font("HY엽서L", Font.PLAIN, 12));
		b2 = new JButton("포테이토피자");
		b2.setFont(new Font("HY엽서L", Font.PLAIN, 12));
		b3 = new JButton("불고기피자");
		b3.setFont(new Font("HY엽서L", Font.PLAIN, 12));
		total = new JTextField(20);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);

		list = new JTextArea(3, 30);

		f.getContentPane().add(top);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(count);
		f.getContentPane().add(total);
		f.getContentPane().add(list);
		
		label = new JLabel("\uCD1D\uACC4");
		label.setFont(new Font("HY궁서B", Font.PLAIN, 18));
		label.setBackground(Color.YELLOW);
		f.getContentPane().add(label);
		
		btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694!!");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "나를 정말 누르셨군요");
			}
		});
		f.getContentPane().add(btnNewButton);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				combo++;
				list.setText("콤보: " + combo + "개\n"
						+ "포테이토: " + potato + "개\n"
						+ "불고기: " + bul + "개");

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				potato++;
				list.setText("콤보: " + combo + "개\n"
						+ "포테이토: " + potato + "개\n"
						+ "불고기: " + bul + "개");

			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sum++;
				total.setText(sum + "");
				bul++;
				list.setText("콤보: " + combo + "개\n"
						+ "포테이토: " + potato + "개\n"
						+ "불고기: " + bul + "개");

			}
		});

		f.setVisible(true);

	}

	public static void main(String[] args) {

		Pizza p = new Pizza();

	}

}
