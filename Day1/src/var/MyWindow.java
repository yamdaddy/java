package var;

import javax.swing.JOptionPane;

public class MyWindow {

	public static void main(String[] args) {

		// 다이얼로그 활용을 위하서는 JOption 컨트럴 스페이스바
		
		String name = JOptionPane.showInputDialog("당신의 이름을 입력해주세요.");
		System.out.println("당신이 입력한 이름은 " + name);
		
		JOptionPane.showMessageDialog(null, name);
		
		
		
	}

}
