package gui.test;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest1 {

	public static void main(String[] args) {
		JFrame jf = new JFrame();
		JLabel jl = new JLabel();
		ImageIcon icon = new ImageIcon("images/따도녀 최보람.jpg");
		jl.setIcon(icon);
		jf.add(jl);
		jf.setTitle("JFrame 연습1");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //진짜로 종료
		jf.setLocation(450, 20); //좌표
		jf.setSize(600, 752); //프레임 크기
		jf.setVisible(true);
	}

}
