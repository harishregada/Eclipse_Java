/*package appletsTest;
import java.applet.*;
import java.awt.Graphics;
@SuppressWarnings("deprecation")

public class AppletTest1 extends Applet
{

	private static final long serialVersionUID = 150238142494694960L;

	public void paint(Graphics g)
	{
		g.drawRect(x, y, width, height);
	}	
}
*/

package appletsTest;
import java.applet.*;
import java.awt.*;

//<applet code="First.class" height=400 width=400>
//</applet>


public class AppletTest1 extends Applet
{

	public void paint(Graphics g)
	{  
		g.drawString("welcome",150,150);  
	}
}