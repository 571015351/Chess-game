import javax.swing.JFrame;
import java.awt.Dimension;

public class Frame extends JFrame {
	public static final int WIDTH = 600;
	public static final int HEIGTH = 600;
	public Frame() {
		
		
		this.setContentPane(new  Panel());
		this.setTitle("nah");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.getContentPane().setPreferredSize(new Dimension(WIDTH,WIDTH));
		this.pack();
		this.setLocationRelativeTo(null);
		
	}
	
	
	
}
