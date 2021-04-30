package cp213;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JLabel;

import javax.swing.*;



public class FirstWindowApp extends JFrame implements ActionListener {
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 500;
	
	private JPanel leftPanel;
	private JPanel rightPanel;
	
	private ImageIcon image1;
	private JLabel label1;
	
	private JTextField name;
	

	public FirstWindowApp() {

		super();
		setSize(WIDTH, HEIGHT);
		setTitle("First Window Class");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JButton closeButton = new JButton("press me.");
		//closeButton.addActionListener(this);
		//add(closeButton);
		//setLayout(new BorderLayout());
		
		JPanel biggerPanel = new JPanel();
		biggerPanel.setLayout(new GridLayout(1, 2));
		
		

		
		leftPanel = new JPanel();
		
		leftPanel.setLayout(new GridLayout(1,3));
		
		
		
		
		//image1 = new ImageIcon(getClass().getResource("chocolate.jpg"));
		image1 = new ImageIcon("chocolate.jpg");
		label1 = new JLabel(image1);
		
		
		
		leftPanel.add(label1);
		
		name = new JTextField(20);
		
		leftPanel.add(name);
		
		
		JButton showButton = new JButton("Show Messages");
		showButton.addActionListener(this);
		leftPanel.add(showButton);
		
		
		biggerPanel.add(leftPanel);
		
		
		rightPanel = new JPanel();
		rightPanel.setLayout(new GridLayout(3,3));
		
		JButton no1 = new JButton("1");
		rightPanel.add(no1);
		JButton no2 = new JButton("2");
		rightPanel.add(no2);
		JButton no3 = new JButton("3");
		rightPanel.add(no3);
		JButton no4 = new JButton("4");
		rightPanel.add(no4);
		JButton no5 = new JButton("5");
		rightPanel.add(no5);		
		JButton no6 = new JButton("6");
		rightPanel.add(no6);
		JButton no7 = new JButton("7");
		rightPanel.add(no7);
		JButton no8 = new JButton("8");
		rightPanel.add(no8);
		JButton no9 = new JButton("9");
		rightPanel.add(no9);
		
		biggerPanel.add(rightPanel);
		add(biggerPanel);
	}
	
	

	public void actionPerformed(ActionEvent e) {
		//System.out.println(e.getActionCommand()) ; 
		
		String inputString = name.getText();
		
		JFrame Msgbox = new JFrame("Message");
		Msgbox.setSize(100, 100);
		

		Msgbox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel labelmsg = new JLabel(inputString);
		Msgbox.add(labelmsg);
		Msgbox.setVisible(true);
		
	}

	public static void main(String[] args) {
		FirstWindowApp w = new FirstWindowApp();
		w.setVisible(true);
	}
}