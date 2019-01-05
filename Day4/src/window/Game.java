package window;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game implements ActionListener{

	static JButton s, r, p;
	static JFrame f;
	
	public static void main(String[] args) {
		
			
		f = new JFrame();
		f.setTitle("나의 가위바위보");
		f.setSize(650, 340);
		f.setLocation(1000, 100);
		
		s = new JButton();
		r = new JButton();
		p = new JButton();
		
		ImageIcon icon1 = new ImageIcon("s.JPG");
		ImageIcon icon2 = new ImageIcon("r.JPG");
		ImageIcon icon3 = new ImageIcon("p.JPG");
		
		s.setIcon(icon1);
		r.setIcon(icon2);
		p.setIcon(icon3);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(s);
		f.add(r);
		f.add(p);
		
		Game game = new Game();
		s.addActionListener(game);
		r.addActionListener(game);
		p.addActionListener(game);
		
		
		f.setVisible(true);
	}
	
//	public static void main(String[] args) {
//
//		Game game = new Game();
//		
//				
//	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Random random = new Random();
		int computer = random.nextInt(3);
		// 0 가위 , 1 바위, 2, 보
		
		if (e.getSource() == s) {//내가 가위
			if (computer == 0) {
				f.setTitle("비겼음");
			} 
			if (computer == 1) {
				f.setTitle("컴퓨터 승");
			} 
			if (computer == 2) {
				f.setTitle("내가 승");
			} 
		}
		if (e.getSource() == r) {//내가 주먹
			if (computer == 0) {
				f.setTitle("내가 승");
			} 
			if (computer == 1) {
				f.setTitle("비겼음");
			} 
			if (computer == 2) {
				f.setTitle("컴퓨터 승");
			} 
		}
		if (e.getSource() == p) {//내가 가위
			if (computer == 0) {
				f.setTitle("컴퓨터 승");
			} 
			if (computer == 1) {
				f.setTitle("내가 승");
			} 
			if (computer == 2) {
				f.setTitle("비겼음");
			} 
		}
		
		}
		
		
		
	

}
