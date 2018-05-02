package appletsTest;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="ButtonAndImage.class" height=500 width=500>
//</applet>
/*
@SuppressWarnings("deprecation")
public class ButtonAndImage extends Applet implements ActionListener  
{
	Button b1,b2,b3;
	Image i1,i2,i3;
	
	@SuppressWarnings("deprecation")
	public void init()
	{
		b1=new Button("Image 1");
		b1.setBounds(30,30,100,20);
		b1.addActionListener(this);
		add(b1);
		
		b2=new Button("Image 2");
		b2.setBounds(150,30,100,20);
		b2.addActionListener(this);
		add(b2);
		
		b3=new Button("Image 3");
		b3.setBounds(270,30,100,20);
		b3.addActionListener(this);
		add(b3);
		
		i1=getImage(getDocumentBase(),"game freak kick.jpg");
		i2=getImage(getDocumentBase(),"game freak kick.jpg");
		i3=getImage(getDocumentBase(),"game freak kick.jpg");
		
		setLayout(null);
	}

	
	public void actionPerformed(ActionEvent ae)
	{
		Button source=(Button)ae.getSource();
		Graphics g;
		
		if(source.getLabel()=="Image 1")
		{
			public void paint(Graphics g1) //Error 1
			{
				g1.drawImage(i1,30,90,this);
			}
			
			paint(g);
		}
		
		if(source.getLabel()=="Image 2")
		{
			public void paint(Graphics g2)
			{
				g2.drawImage(i2,150,90,this);
			}
			
			paint(g);
		}
		
		if(source.getLabel()=="Image 3")
		{
			public void paint(Graphics g3)
			{
				g3.drawImage(i3,270,90,this);
			}
			
			paint(g);
		}
	}
	
}
*/