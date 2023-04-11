package ExamplePackage;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingWindow extends JFrame {

	JButton buttonClose = new JButton("Close");
	
	SwingWindow()
	{
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(buttonClose);
		
	}
	public static void main(String[] args) {
		SwingWindow okno = new SwingWindow();
		okno.setVisible(true);

	}

}
