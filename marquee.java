import java.awt.*;
import java.lang.*;
import java.applet.*;

public class marquee extends Applet implements Runnable

{
	Thread t;int x,y,f;
	String msg;
	public void init()
	{
		x=10;y=100;f=5;msg="This is a growinng marquee";
	}
	public void start ()

	{
		t=new Thread(this);
		t.start();

	}
	public void run ()
	{
		for(;;)
		{
			try
			{
				Thread.sleep(300);
			}
			catch (InterruptedException e){}
			repaint();
		}
	}
	public void stop()
	{
		t.stop();
	}
	public void paint(Graphics g)
	{
		Font newFont=new Font("TimesRoman",Font.BOLD,f);
		g.setFont(newFont);
		FontMetrics fontmetrics = g.getFontMetrics();
		int width = fontmetrics.stringWidth(msg);
		g.drawString(msg,x,y);
		f+=2;
		if(f>50)
			f=2;
	}
}