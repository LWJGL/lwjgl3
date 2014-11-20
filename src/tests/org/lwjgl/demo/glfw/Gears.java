/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.demo.opengl.AbstractGears;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.glfw.ErrorCallback;
import org.lwjgl.system.glfw.GLFWvidmode;
import org.lwjgl.system.glfw.WindowCallback;
import org.lwjgl.system.glfw.WindowCallbackAdapter;

import java.nio.ByteBuffer;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.glfw.GLFW.*;

/** The Gears demo implemented using GLFW. */
public class Gears extends AbstractGears {

	private long window;

	public static void main(String[] args) {
		new Gears().execute();
	}

	@Override
	protected void init() {
		glfwSetErrorCallback(ErrorCallback.Util.getDefault());

		if ( glfwInit() != GL11.GL_TRUE )
			throw new IllegalStateException("Unable to initialize glfw");

		long monitor = glfwGetPrimaryMonitor();
		ByteBuffer vidmode = glfwGetVideoMode(monitor);

		int monitorWidth = GLFWvidmode.width(vidmode);
		int monitorHeight = GLFWvidmode.height(vidmode);

		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, GL_TRUE);
		glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GL_TRUE);

		int WIDTH = 300;
		int HEIGHT = 300;

		window = glfwCreateWindow(WIDTH, HEIGHT, "GLFW Gears Demo", NULL, NULL);
		if ( window == NULL )
			throw new RuntimeException("Failed to create the GLFW window");

		WindowCallback.set(window, new WindowCallbackAdapter() {
			@Override
			public void key(long window, int key, int scancode, int action, int mods) {
				if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
					glfwSetWindowShouldClose(window, GL_TRUE);
			}
		});

		glfwSetWindowPos(
			window,
			(monitorWidth - WIDTH) / 2,
			(monitorHeight - HEIGHT) / 2
		);

		glfwMakeContextCurrent(window);
		GLContext.createFromCurrent();

		glfwSwapInterval(1);
		glfwShowWindow(window);
	}

	@Override
	protected void loop() {
		long lastUpdate = System.currentTimeMillis();
		int frames = 0;

		while ( glfwWindowShouldClose(window) == GL_FALSE ) {
			renderLoop();

			glfwPollEvents();
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
		try {
			glfwTerminate();
		} catch (Throwable t) {
			System.err.println("CLEANUP FAILED:");
			t.printStackTrace();
		}
	}

}