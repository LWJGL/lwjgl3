/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.demo.opengl.AbstractGears;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.libffi.Closure;

import java.nio.IntBuffer;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The Gears demo implemented using GLFW. */
public class Gears extends AbstractGears {

	private GLFWErrorCallback      errorCB;
	private GLFWKeyCallback        keyCB;
	private GLFWWindowSizeCallback windowSizeCB;

	private Closure debugProc;

	private long window;

	public static void main(String[] args) {
		new Gears().run();
	}

	private void run() {
		try {
			init();
			initGLState();

			loop();
		} finally {
			try {
				destroy();
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}

	private void init() {
		errorCB = GLFWErrorCallback.createPrint().set();
		if ( glfwInit() != GLFW_TRUE )
			throw new IllegalStateException("Unable to initialize glfw");

		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
		glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
		glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);

		int WIDTH = 300;
		int HEIGHT = 300;

		long window = glfwCreateWindow(WIDTH, HEIGHT, "GLFW Gears Demo", NULL, NULL);
		if ( window == NULL )
			throw new RuntimeException("Failed to create the GLFW window");

		glfwSetWindowSizeLimits(window, WIDTH, HEIGHT, GLFW_DONT_CARE, GLFW_DONT_CARE);
		glfwSetWindowAspectRatio(window, 1, 1);

		final long monitor = glfwGetPrimaryMonitor();
		final GLFWVidMode vidmode = glfwGetVideoMode(monitor);

		// Center window
		glfwSetWindowPos(
			window,
			(vidmode.width() - WIDTH) / 2,
			(vidmode.height() - HEIGHT) / 2
		);

		glfwSetKeyCallback(window, keyCB = new GLFWKeyCallback() {
			private int xpos;
			private int ypos;
			private int width;
			private int height;

			@Override
			public void invoke(long window, int key, int scancode, int action, int mods) {
				if ( action != GLFW_RELEASE )
					return;

				switch ( key ) {
					case GLFW_KEY_ESCAPE:
						glfwSetWindowShouldClose(window, GLFW_TRUE);
						break;
					case GLFW_KEY_F:
						if ( glfwGetWindowMonitor(window) == NULL ) {
							MemoryStack s = stackPush();
							try {
								IntBuffer a = s.ints(0);
								IntBuffer b = s.ints(0);
								glfwGetWindowPos(window, a, b);
								xpos = a.get(0);
								ypos = b.get(0);

								glfwGetWindowSize(window, a, b);
								width = a.get(0);
								height = b.get(0);
							} finally {
								s.pop();
							}
							glfwSetWindowMonitor(window, monitor, 0, 0, vidmode.width(), vidmode.height(), vidmode.refreshRate());
							glfwSwapInterval(1);
						}
						break;
					case GLFW_KEY_W:
						if ( glfwGetWindowMonitor(window) != NULL )
							glfwSetWindowMonitor(window, NULL, xpos, ypos, width, height, 0);
						break;
					case GLFW_KEY_G:
						glfwSetInputMode(window, GLFW_CURSOR, glfwGetInputMode(window, GLFW_CURSOR) == GLFW_CURSOR_NORMAL
							? GLFW_CURSOR_DISABLED
							: GLFW_CURSOR_NORMAL
						);
						break;
				}
			}
		});

		glfwSetWindowSizeCallback(window, windowSizeCB = new GLFWWindowSizeCallback() {
			@Override
			public void invoke(long window, int width, int height) {
				glViewport(0, 0, width, height);
			}
		});

		glfwMakeContextCurrent(window);
		GL.createCapabilities();
		debugProc = GLUtil.setupDebugMessageCallback();

		glfwSwapInterval(1);
		glfwShowWindow(window);

		this.window = window;
	}

	private void loop() {
		long lastUpdate = System.currentTimeMillis();
		int frames = 0;

		while ( glfwWindowShouldClose(window) == GLFW_FALSE ) {
			glfwPollEvents();

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
	}

	private void destroy() {
		if ( debugProc != null )
			debugProc.free();

		if ( window != NULL ) {
			glfwFreeCallbacks(window);
			glfwDestroyWindow(window);
		}

		glfwTerminate();

		if ( errorCB != null )
			errorCB.free();
	}

}