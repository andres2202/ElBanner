package controllers;

import models.Letter;
import views.JFrameDisplay;

public class Display {
	
	private JFrameDisplay jFrameDisplay;
	
	public Display() {
		jFrameDisplay = new JFrameDisplay(10, 64);
	}
	
	public void showLetter(char character,int position) throws InterruptedException {
		Letter letter = new Letter(10, 10, character);
		int [][] displayLetter = letter.getLetter();
		for (int i = 0; i < displayLetter[0].length; i++) {
			for (int j = (position-1)*10; j < (displayLetter.length)*position; j++) {
				if(displayLetter[j-(10*(position-1))][i] == 1) {
					jFrameDisplay.set(j-(10*(position-1)), i+(10*(position-1) + (position-1)),true);
				}
				Thread.sleep(10);
			}
		}
	}
	
	public void showMessage(String word) throws InterruptedException {
		for (int i = 0; i < word.length(); i++) {
			showLetter(word.charAt(i), (i+1));
		}
		jFrameDisplay.setOff();
	}
	
	public static void main(String[] args) throws InterruptedException {
		Display display = new Display();
		display.showMessage("ESTA");
		display.showMessage("HOLA!!");
		display.showMessage("SI");
		display.showMessage("MUNDO");
		display.showMessage("WAO");
	}
}
