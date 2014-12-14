/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.demo.opengl.AbstractGears;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWvidmode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.libffi.Closure;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The Gears demo implemented using GLFW. */
public class Gears extends AbstractGears {

	private GLFWErrorCallback errorfun;
	private GLFWKeyCallback   keyfun;

	private Closure debugProc;

	private long window;

	private Boolean toggleMode;

	public static void main(String[] args) {
		new Gears().execute();
	}

	@Override
	protected void init() {
		glfwSetErrorCallback(errorfun = errorCallbackPrint(System.err));
		if ( glfwInit() != GL11.GL_TRUE )
			throw new IllegalStateException("Unable to initialize glfw");

		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);
		glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GL_TRUE);

		keyfun = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				if ( action != GLFW_RELEASE )
					return;

				switch ( key ) {
					case GLFW_KEY_ESCAPE:
						glfwSetWindowShouldClose(window, GL_TRUE);
						break;
					case GLFW_KEY_F:
						if ( glfwGetWindowMonitor(window) == NULL )
							toggleMode = true;
						break;
					case GLFW_KEY_W:
						if ( glfwGetWindowMonitor(window) != NULL )
							toggleMode = false;
						break;
				}
			}
		};

		createWindow(false);
	}

	private void createWindow(boolean fullscreen) {
		int WIDTH = 300;
		int HEIGHT = 300;

		long monitor = glfwGetPrimaryMonitor();
		GLFWvidmode vidmode = new GLFWvidmode(glfwGetVideoMode(monitor));

		long window = fullscreen
			? glfwCreateWindow(vidmode.getWidth(), vidmode.getHeight(), "GLFW Gears Demo", monitor, this.window)
			: glfwCreateWindow(WIDTH, HEIGHT, "GLFW Gears Demo", NULL, this.window);

		if ( window == NULL )
			throw new RuntimeException("Failed to create the GLFW window");

		// Destroy old window
		if ( this.window != NULL ) {
			glfwSetInputMode(this.window, GLFW_CURSOR, GLFW_CURSOR_NORMAL);
			glfwDestroyWindow(this.window);
			if ( debugProc != null )
				debugProc.release();
		}

		glfwSetKeyCallback(window, keyfun);

		if ( fullscreen )
			glfwSetInputMode(window, GLFW_CURSOR, GLFW_CURSOR_DISABLED);
		else {
			// Center window
			glfwSetWindowPos(
				window,
				(vidmode.getWidth() - WIDTH) / 2,
				(vidmode.getHeight() - HEIGHT) / 2
			);
		}

		glfwMakeContextCurrent(window);
		debugProc = GLContext.createFromCurrent().setupDebugMessageCallback();

		glfwSwapInterval(1);
		glfwShowWindow(window);

		this.window = window;
	}

	@Override
	protected void loop() {
		long lastUpdate = System.currentTimeMillis();
		int frames = 0;

		while ( glfwWindowShouldClose(window) == GL_FALSE ) {
			glfwPollEvents();

			if ( toggleMode != null ) {
				// Toggle between windowed and fullscreen modes
				createWindow(toggleMode);
				initGLState();
				toggleMode = null;
			}

			renderLoop();

			glfwSwapBuffers(window);

			frames++;

			long time = System.currentTimeMillis();
			int UPDATE_EVERY = 5; // seconds
			if ( UPDATE_EVERY * 1000L <= time - lastUpdate ) {
				lastUpdate = time;

				System.out.printf("%d frames in %d seconds = %.2f fps\n", frames, UPDATE_EVERY, (frames / (float)UPDATE_EVERY));
				frames = 0;
			}
		}

		glfwDestroyWindow(window);
	}

	@Override
	protected void destroy() {
		if ( debugProc != null )
			debugProc.release();
		keyfun.release();
		glfwTerminate();
		errorfun.release();
	}

}