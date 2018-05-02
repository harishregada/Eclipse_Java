package appletsTest;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//import java.lang.Runnable.run;

//<applet code="ZoomIn.class" height=500 width=500>
//</applet>

public class ZoomIn extends Applet implements Runnable,MouseListener
{
	
	int x,y,width,height;
	
	public void init()
	{
		x=y=width=height=50;
		
		Thread t=new Thread(this);
		addMouseListener(this);
		t.start();
	}
	
	public void run()
	{
		java.util.Random r=new java.util.Random();
		int rise=1;
		
		while(true)
		{
			try
			{
				setForeground(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
				repaint();
				
				height=height+rise;
				width=width+rise;
			
				if(height==100)
					rise=-rise;
			
				if(height==1)
				{
					rise=-rise;
					x=r.nextInt(400);
					y=r.nextInt(400);
				}
				
				Thread.sleep(10);	
			}
			
			catch(Exception e)
			{}	
		}
	}
	
	public void paint(Graphics g)
	{
		g.fillRect(x, y, width, height);
	}
	
	public void mousePressed(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
