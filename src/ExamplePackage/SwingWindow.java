package ExamplePackage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SwingWindow extends JFrame {
	
	SwingWindow()
	{
		
		
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton rdbtnOpcja1 = new JRadioButton("opcja 1");
		panel.add(rdbtnOpcja1);
		
		JRadioButton rdbtnOpcja2 = new JRadioButton("opcja 2");
		panel.add(rdbtnOpcja2);
		
		JRadioButton rdbtnOpcja3 = new JRadioButton("opcja 3");
		panel.add(rdbtnOpcja3);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.NORTH);
		
		JSlider slider = new JSlider();
		panel_1.add(slider);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		getContentPane().add(panel_2, BorderLayout.CENTER);
		
	}
	public static void main(String[] args) {
		SwingWindow okno = new SwingWindow();
		okno.setVisible(true);

	}

}
