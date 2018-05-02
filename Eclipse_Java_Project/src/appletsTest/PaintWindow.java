package appletsTest;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="PaintWindow.class" height=550 width=500>
//</applet>

//@SuppressWarnings("deprecated")
public class PaintWindow extends Applet implements MouseMotionListener  
{
	int x,y;
	
	public void init()
	{
		addMouseMotionListener(this);
		setBackground(Color.black);
	}
	
	public void mouseDragged(MouseEvent me)
	{
		Graphics g=getGraphics();  
		g.setColor(Color.green);  
		//g.drawArc(me.getX(),me.getY(),50,50,0,90);
		//g.drawRect(me.getX(), me.getY(), 50, 50);
		g.fillOval(me.getX(),me.getY(),50,50);
	}

	public void mouseMoved(MouseEvent e) 
	{		
	}
}
