
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {
	GridLayout g = new GridLayout(1, 4);
	JButton[] ButtonsPanel;

	public ButtonsPanel() {
		ButtonsPanel = new JButton[4];
		setLayout(g);
		Listener lis = new Listener();
		for (int i = 0; i < 4; i++) {
			ButtonsPanel[i] = new JButton("0");
			ButtonsPanel[i].addActionListener(lis);
			this.add(ButtonsPanel[i]);
		}
	}

	private class Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			MyThread t = new MyThread(b);
			t.start();
		}
	}
}
