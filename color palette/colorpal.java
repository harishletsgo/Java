import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class colorpal extends Applet implements ActionListener
{
	Button barr[]=new Button[50];
	Random r= new Random();
	Button fg,bg;
	TextArea ta;
	int val1,val2,val3;
	Panel p1,p2,p3;
	CardLayout cr;

	public void init()
	{
		cr=new CardLayout();
		fg=new Button("foreground");
		bg=new Button("Background");
		ta=new TextArea(5,10);
		add(ta);
		add(fg);
		add(bg);
		fg.addActionListener(this);
		bg.addActionListener(this);
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		p2.setLayout(new GridLayout(5,5));
		p3.setLayout(new GridLayout(5,5));
		p1.setLayout(cr);
			for(int i=0;i<10;i++)
			{
				barr[i]=new Button();
				p2.add(barr[i]);
				barr[i].addActionListener(this);
			}
			for(int i=10;i<20;i++)
			{
				barr[i]=new Button();
				p3.add(barr[i]);
				barr[i].addActionListener(this);
			}
		p1.add(p2,"panel2");
		p1.add(p3,"panel3");
		add(p1);
			for(int i=0;i<20;i++)
			{
				val1=r.nextInt(255);
				val2=r.nextInt(255);
				val3=r.nextInt(255);
				Color c=new Color(val1,val2,val3);
				barr[i].setBackground(c);
			}
	}
public void actionPerformed(ActionEvent ae)
	{
		for(int i=0;i<10;i++)
		{
			if(ae.getSource()==barr[i])
			{
				Color c=barr[i].getBackground();
				ta.setBackground(c);
			}
		}
		for(int i=10;i<20;i++)
		{
			if(ae.getSource()==barr[i])
			{
				Color c=barr[i].getBackground();
				ta.setForeground(c);
			}
		}
	if(ae.getSource()==bg)
	cr.show(p1,"panel2");
	if(ae.getSource()==fg)
	cr.show(p1,"panel3");
	}
}