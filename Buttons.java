package q2_2012_b_94;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Buttons extends JPanel{
	GridLayout g =new GridLayout(1,4);
	JButton [] buttons;
	
	
	
	public Buttons() {
		buttons = new JButton[4];
		setLayout(g);
		Listener lis = new Listener();
		for(int i=0;i<4;i++) {
			buttons[i] = new JButton("0");
			buttons[i].addActionListener(lis);
			this.add(buttons[i]);
		}

		
	
	
}
	
	
	
	private class Listener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			MyThread t = new MyThread(b);
			t.start();
		}
	}
}
