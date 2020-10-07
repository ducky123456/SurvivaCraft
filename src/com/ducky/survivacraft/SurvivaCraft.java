package com.ducky.survivacraft;

import org.lwjgl.opengl.Display;

import com.ducky.survivacraft.renderEngine.DisplayManager;
import com.ducky.survivacraft.renderEngine.Loader;
import com.ducky.survivacraft.renderEngine.RawModel;

public class SurvivaCraft {

	public static void main(String[] args) {
		DisplayManager.createDisplay();
		
		Loader loader = new Loader();
		Renderer renderer = new Renderer();
		
		// Vertices
		float[] vertices = {
				-0.5f, 0.5f, 0f,
				-0.5f, -0.5f, 0f,
				0.5f, -0.5f, 0f,
				0.5f, -0.5f, 0f,
				0.5f, 0.5f, 0f,
				-0.5f, 0.5f, 0f
		};
		
		RawModel model = loader.loadToVAO(vertices);
		
		while(!Display.isCloseRequested()) {
			renderer.prepare();
			// game logic
			renderer.render(model);
			// updating the display
			DisplayManager.updateDisplay();
		}
		
		loader.cleanUp();
		DisplayManager.destroyDisplay();
	}

}
