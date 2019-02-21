
import javax.swing.JButton;

public class MyThread extends Thread{
	JButton b;
	
	public MyThread(JButton b) {
		this.b=b;
	}
	
	public void run() {
		int num=0;
		int count = (int)(Math.random()*100+1);
		try {
			num = Integer.parseInt(b.getText());
		}
		catch(NumberFormatException e) {}
			for(int i=1; i<=count;i++) {
				b.setText(""+(num+1)%10);
			try {
				Thread.sleep(100);
			}
			catch(InterruptedException e) {}
		}
	}
}
