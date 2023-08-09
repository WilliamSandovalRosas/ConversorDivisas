package Controller;

import View.GuiConversor;
import View.WelcomeGui;

public class ControladorConversor {
	
	private static WelcomeGui mainGui = new WelcomeGui();
	private static GuiConversor guiConversor = new GuiConversor();
	
	public static void showMainGui() {
		mainGui.setVisible(true);
	}
	
	public static void showGuiConversor() {
		guiConversor.setVisible(true);
	}
	
	

}
