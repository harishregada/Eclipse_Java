package appletsTest;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="ImageViewer.class" height=600 width=600 >
//</applet>

public class ImageViewer extends Applet implements ActionListener 
{
	Button play_first,play_second,play_third,play_fourth;
	Button stop_first,stop_second,stop_third,stop_fourth;
	
	AudioClip one,two,three,four;
	
	@SuppressWarnings("deprecation")
	public void init()
	{		
		play_first=new Button("Play_1st_Song");
		add(play_first);
		play_first.addActionListener(this);
		
		play_second=new Button("Play_2nd_Song");
		add(play_second);
		play_second.addActionListener(this);
		
		play_third=new Button("Play_3rd_Song");
		add(play_third);
		play_third.addActionListener(this);
		
		play_fourth=new Button("Play_4th_Song");
		add(play_fourth);
		play_fourth.addActionListener(this);
		
		stop_first=new Button("Stop_1");
		add(stop_first);
		stop_first.addActionListener(this);
		
		stop_second=new Button("Stop_2");
		add(stop_second);
		stop_second.addActionListener(this);
		
		stop_third=new Button("Stop_3");
		add(stop_first);
		stop_third.addActionListener(this);
		
		stop_fourth=new Button("Stop_4");
		add(stop_third);
		stop_fourth.addActionListener(this);
		
		one=getAudioClip(getCodeBase(),"one.wav");
		two=getAudioClip(getCodeBase(),"two.wav");
		three=getAudioClip(getCodeBase(),"three.wav");
		four=getAudioClip(getCodeBase(),"four.wav");
		
		//setLayout(null);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		Button source=(Button)ae.getSource();
		
		if(source.getLabel()=="Play_1st_Song");
		one.play();
		
		if(source.getLabel()=="Play_2nd_Song");
		two.play();
		
		if(source.getLabel()=="Play_3rd_Song");
		three.play();
		
		if(source.getLabel()=="Play_4th_Song");
		four.play();
		
		if(source.getLabel()=="Stop_1");
		one.stop();
		
		if(source.getLabel()=="Stop_2");
		two.stop();
		
		if(source.getLabel()=="Stop_3");
		three.stop();
		
		if(source.getLabel()=="Stop_4");
		four.stop();
	}
}
