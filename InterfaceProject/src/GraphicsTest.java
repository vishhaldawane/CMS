import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class GraphicsTest {
	public static void main(String[] args) {

		
		
		MyFrame frame1 = new MyFrame("My Notepad1",400,250,50,250);
		MyFrame frame2 = new MyFrame("My Notepad2",400,250,350,250);
		MyFrame frame3 = new MyFrame("My Notepad3",400,250,650,250);
		
		Thread t1 = new Thread(frame1);
		Thread t2 = new Thread(frame2);
		Thread t3 = new Thread(frame3);
		
		t1.start();
		t2.start();
		t3.start();
		
	
		
	}
}

class MyFrame extends JFrame implements Runnable
{
	JTextField data = new JTextField(10);
	
	MyFrame(String title, int h, int w, int x, int y) {
		super.setTitle(title);
		super.setSize(h,w);
		super.setLocation(x,y);
		super.setVisible(true);
		setLayout(new FlowLayout());
		add(data);
		
	}
	
	public void run() {
		
			for(int i=0;i<100000;i++) {
				data.setText(""+i);
			}
		
	}
	
}


/*
		Frame frame = new Frame();	
		frame.setTitle("My Notepad");
		frame.setSize(500, 300);
		frame.setLocation(100, 200);
		frame.setVisible(true);
		
		Frame frame2 = new Frame();	
		frame2.setTitle("My Editor");

		frame2.setSize(700, 400);
		frame2.setLocation(200, 400);
		frame2.setVisible(true);
		
		Frame frame3 = new Frame();
		frame3.setTitle("My Word");

		frame3.setSize(300, 800);
		frame3.setLocation(250, 350);
		frame3.setVisible(true);

*/