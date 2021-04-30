package VendingMachine;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Main class for the Vending Machine.
 *
 * @author your name here
 * @version 2021-03-19
 */
public class Main {
	  

    VendModel model = new VendModel(items);
		VendView vv = new VendView(model);
		final JFrame frame = new JFrame();
		frame.setContentPane(vv);
		frame.setMinimumSize(new Dimension(650, 950));
		frame.pack();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setVisible(true);
  
}
	    
