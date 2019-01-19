package diary;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MyDiary extends JFrame {
	private JTextField noText;
	private JTextField titleText;

	public MyDiary() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		// 컨트롤+쉬프트+f(자동 정리)
		setTitle("나의 일기장 작성화면");
		setSize(370, 700);

		FlowLayout flow = new FlowLayout();
		getContentPane().setLayout(flow);

		JLabel lblNewLabel = new JLabel("");
		getContentPane().add(lblNewLabel);

		ImageIcon icon = new ImageIcon("일기장-위.png");
		lblNewLabel.setIcon(icon);

		JLabel no = new JLabel("번   호");
		getContentPane().add(no);

		noText = new JTextField();
		noText.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(noText);
		noText.setColumns(15);

		JLabel label = new JLabel("제   목");
		getContentPane().add(label);

		titleText = new JTextField();
		titleText.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(titleText);
		titleText.setColumns(15);

		JLabel label_1 = new JLabel("내   용");
		getContentPane().add(label_1);

		JTextArea contentText = new JTextArea();
		contentText.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		contentText.setRows(5);
		contentText.setColumns(15);
		getContentPane().add(contentText);

		JButton save = new JButton("일기저장");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();
				String titleT = titleText.getText();
				String contentT = contentText.getText();

				try {

					FileWriter f = new FileWriter("c:/diary/" + noT + ".txt");
					f.write(noT + "\r\n");
					f.write(titleT + "\r\n");
					f.write(contentT + "\r\n");
					f.flush();
					f.close();

					noText.setText("");
					titleText.setText("");
					contentText.setText("");

					JOptionPane.showMessageDialog(null, "파일로 저장 성공");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "파일 저장 중 에러 발생");

				}

			}
		});
		save.setForeground(Color.WHITE);
		save.setBackground(Color.BLACK);
		save.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(save);

		JButton read = new JButton("일기읽기");
		read.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String noT = noText.getText();

				try {
					FileReader f2 = new FileReader("c:/diary/" + noT + ".txt");
					BufferedReader reader = new BufferedReader(f2);
					String noR = reader.readLine();
					String titleR = reader.readLine();
					String contentR = reader.readLine();
					noText.setText(noT);
					titleText.setText(titleR);
					contentText.setText(contentR);

					JOptionPane.showMessageDialog(null, "파일 읽기로 읽기 성공");

				} catch (Exception e1) {

					JOptionPane.showMessageDialog(null, "파일 읽기 중 에러 발생");

				}

			}
		});
		read.setForeground(Color.WHITE);
		read.setBackground(Color.BLUE);
		read.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(read);

		JButton clear = new JButton("   Clear   ");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noText.setText("");
				titleText.setText("");
				contentText.setText("");

//				JOptionPane.showMessageDialog(null, "Clear Completed");

			}
		});
		clear.setForeground(Color.WHITE);
		clear.setBackground(Color.RED);
		clear.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 20));
		getContentPane().add(clear);

		setVisible(true);
	}

	public static void main(String[] args) {
		MyDiary name = new MyDiary();
	}

}