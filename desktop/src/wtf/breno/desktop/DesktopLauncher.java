package wtf.breno.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import wtf.breno.JavaGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		// resizing window
		config.width  = 1280;
		config.height = 720;

		// enabling vsync
		config.vSyncEnabled = true;

		// disabling resizable mode
		config.resizable = false;

		new LwjglApplication(new JavaGame(), config);
	}
}
