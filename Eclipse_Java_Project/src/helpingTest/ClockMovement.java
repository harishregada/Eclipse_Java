package helpingTest;
import java.awt.*;
import java.applet.*;

//<applet code="ClockMovement.class" height=500 width=500>
//</applet>

@SuppressWarnings("deprecation")
public class ClockMovement extends Applet
{
	int x1=200,y1=200,x2=200,y2=100;
	int comp1=1,comp2=0,comp3=0,comp4=0;
	
	public void paint(Graphics g)
	{
		try
		{
			g.drawLine(x1,y1,x2,y2);
		
			if(comp1==1 && x2>=200 && x2!=301 && y2>=100 && y2!=201)
			{
				x2++;
				y2++;
				
				if(x2==300 && y2==200)
				{
					comp2=1;
					comp1=0;
				}
			}
			
			if(comp2==1 && x2<=300 && x2!=199 && y2>=200 && y2!=301)
			{
				x2--;
				y2++;
				
				if(x2==200 && y2==300)
				{
					comp3=1;
					comp2=0;
				}
			}
			
			if(comp3==1 && x2<=200 && x2!=99 && y2<=300 && y2!=199)
			{
				x2--;
				y2--;
				
				if(x2==100 && y2==200)
				{
					comp4=1;
					comp3=0;
				}
			}
			
			if(comp4==1 && x2>=100 && x2!=201 && y2<=200 && y2!=101)
			{
				x2++;
				y2--;
				
				if(x2==200 && y2==100)
				{
					
					comp1=1;
					comp4=0;
				}
			}
			System.out.println("COMP4 Worked");
			Thread.sleep(10);
			repaint();
		}
		catch(Exception e) {}
	}
}
