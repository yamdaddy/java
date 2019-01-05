package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyPicture2 implements ActionListener {

	static JButton b1;
	static JButton b2;
	static JButton b3;
	static JLabel img;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setTitle("나의 그래픽 프로그램");
		f.setSize(320, 570);

		JLabel l = new JLabel("Snow Man");

		img = new JLabel();
		JLabel l2 = new JLabel("         눈사람은 좋으나 눈은 안왔으면         ");

		ImageIcon icon = new ImageIcon("snowman.JPG"); // 273*338 - 300*400

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		img.setIcon(icon);

		b1 = new JButton("루돌프");
		b2 = new JButton("산타");
		b3 = new JButton("초기화면");

		f.add(l);
		f.add(img);
		f.add(l2);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		MyPicture2 pic = new MyPicture2();
		b1.addActionListener(pic);
		b2.addActionListener(pic);

		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b1) {
			ImageIcon icon2 = new ImageIcon("deer.JPG");
			img.setIcon(icon2);
		}

		if (e.getSource() == b2) {
			ImageIcon icon2 = new ImageIcon("santa.JPG");
			img.setIcon(icon2);

		}

		if (e.getSource() == b3) {
			ImageIcon icon = new ImageIcon("snowman.JPG");
			img.setIcon(icon);

		}
	}

}
