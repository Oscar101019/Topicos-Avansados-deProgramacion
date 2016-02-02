//SimplesSwing.java
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;

public class TwoButtons{

	public static void main(String ar[]){
		// Create Frame
		JFrame frame=new JFrame("Adding Component to JFrame");
		
		//Set the default behavior to exit the aplication
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane=frame.getContentPane();
		JButton closeButton= new JButton("Close");
		JButton helpButton= new JButton("Helps");
		contentPane.add(closeButton);
		contentPane.add(helpButton);
		frame.pack();
		

		//Set thex,y witdth and height propertiesinone go
				

		//Display Frame
		frame.setVisible(true);
	}
}
