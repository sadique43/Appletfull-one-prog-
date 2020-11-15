package Applet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Appletfull extends Applet implements ActionListener{
	int x,y,sum;
	TextField t1=new TextField();
	TextField t2=new TextField();
	Label l1=new Label("first term");
	Label l2=new Label("second term");
	Checkbox c=new Checkbox("male");
	Checkbox c1=new Checkbox("Female");
	
	Button b1=new Button("Add");
	List l=new List();
	TextArea t=new TextArea("Comment here");
	
	public void init()
	{
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		b1.addActionListener(this);
		add(b1);
		add(c);
		add(c1);
		add(t);
		
		
		
	}
	public void paint(Graphics g)
	{
		g.drawString("sum:"+ sum, 20, 70);
	}
	public void actionPerformed(ActionEvent e)
	{
		x=Integer.parseInt(t1.getText());
		y=Integer.parseInt(t2.getText());
		sum=x+y;
		repaint();
	}

}
