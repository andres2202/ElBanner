package controllers;

 import views.JFrameDisplay;

public class Display {
	
	public static void main(String[] args) throws InterruptedException {
		JFrameDisplay jFrameDisplay = new JFrameDisplay(20,150);
		for (int i = 0; i < 1000; i++) {
			jFrameDisplay.set(500<<6,i,true);
			Thread.sleep(100);
			jFrameDisplay.set(100<<6,i,false);
		}
	}
}
