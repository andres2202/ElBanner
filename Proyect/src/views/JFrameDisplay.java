package views;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JFrameDisplay extends JFrame{
	private static final String APP_TITLE = "Display..";
	private static final int LED_WIDTH = 20;
	private static final int LED_HEIGTH = 20;
	private JRadioButton[][] jRadioButton;
	
	public JFrameDisplay(int rows,int colums) {
		super(APP_TITLE);
		this.jRadioButton = new JRadioButton[rows][colums];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colums; j++) {
				jRadioButton[i][j] = new JRadioButton();
			}
		}
		init();
	}
	
	public void init() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(LED_WIDTH*jRadioButton[0].length,LED_HEIGTH*jRadioButton.length);
		this.setLayout(new GridLayout(jRadioButton.length,jRadioButton[0].length));
		for (int i = 0; i < jRadioButton.length; i++) {
			for (int j = 0; j < jRadioButton[i].length; j++) {
				this.add(jRadioButton[i][j]);
			}
		}
		this.setVisible(true);
	}
	
	public void set(int row,int col,boolean status) {
		jRadioButton[row][col].setSelected(status);
	}
}
