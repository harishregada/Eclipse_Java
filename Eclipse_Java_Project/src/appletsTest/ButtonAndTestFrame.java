package appletsTest;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonAndTestFrame extends Applet implements ActionListener
{
	Button b;
	TextArea tf;
	
	public void init()
	{	
		tf=new TextArea();
		tf.setBounds(30,30,150,20);
		b=new Button("Click");
		b.setBounds(60, 150,30, 20);
		b.addActionListener(this);
		
		add(b);
		add(tf);
		
		setLayout(null);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("Welcome");
	}
}
