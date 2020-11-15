package Swing;

import java.awt.Container;

import javax.swing.JFrame;

public class JButton {
public static void main(String[] args) {
	JFrame frame=new JFrame();
	frame.setBounds(100,20,200,40);
	
	Container c=frame.getContentPane();
	JButton but=new JButton();
	c.add(but);
	
}
}
