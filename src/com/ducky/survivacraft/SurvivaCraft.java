package com.ducky.survivacraft;

import org.lwjgl.opengl.Display;

import com.ducky.survivacraft.renderEngine.DisplayManager;

public class SurvivaCraft {

	public static void main(String[] args) {
		DisplayManager.createDisplay();
		
		while(!Display.isCloseRequested()) {
			// Here we update the Display until some one closes the application.
			DisplayManager.updateDisplay();
		}
		
		DisplayManager.destroyDisplay();
	}

}
