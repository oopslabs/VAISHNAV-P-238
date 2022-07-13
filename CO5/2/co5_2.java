import java.applet.*;
import java.awt.*;

public class co5_2 extends Applet
{
	Frame f=new Frame("Largest among Three");
	TextField t1,t2,t3;
	Font f1;
	public void init()
	{
	
		t1=new TextField(5);
		t2=new TextField(5);
		t3=new TextField(5);
		
		add(t1);
		add(t2);
		add(t3);
		
		t1.setText("0");
		t2.setText("0");
		t3.setText("0");
		f1 = new Font("Arial",Font.BOLD,18);  
		
	}
	
	public void paint(Graphics g)
	{
		int n1,n2,n3,lar;
		n1=Integer.parseInt(t1.getText());
		n2=Integer.parseInt(t2.getText());
		n3=Integer.parseInt(t3.getText());
		
		if(n1>n2 && n1>n3)
		{
			lar=n1;
		}
		else if(n2>n1 && n2>n3)
		{
			lar=n2;
		}
		else
		{
			lar=n3;
		}
		g.setFont(f1);
		g.drawString("Largest:  "+lar,300,80);
		
	}
	
	
}
/*<applet code = "co5_2.class" width=800 height=450></applet>*/
