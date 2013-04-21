package org.lwjgl.demo.glfw;

import org.lwjgl.Sys;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.glfw.ErrorCallback;
import org.lwjgl.system.glfw.WindowCallback;
import org.lwjgl.system.glfw.WindowCallbackAdapter;

import java.util.concurrent.atomic.AtomicInteger;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.glfw.GLFW.*;

/** GLFW demo that showcases rendering to multiple windows from a single thread. */
public final class MultipleWindows {

	private MultipleWindows() {
	}

	public static void main(String[] args) {
		Sys.touch();

		glfwSetErrorCallback(new ErrorCallback());
		if ( glfwInit() == 0 )
			throw new IllegalStateException("Failed to initialize GLFW.");

		try {
			demo();
		} finally {
			glfwTerminate();
		}
	}

	private static void demo() {
		glfwDefaultWindowHints();
		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);

		long[] windows = new long[4];
		GLContext[] contexts = new GLContext[4];

		final AtomicInteger latch = new AtomicInteger(windows.length);

		for ( int i = 0; i < windows.length; i++ ) {
			final int windowIndex = i + 1;

			long window = glfwCreateWindow(300, 200, "GLFW Demo - " + windowIndex, 0L, 0L);
			if ( window == 0L )
				error();

			WindowCallback.set(window, new WindowCallbackAdapter() {
				@Override
				public void cursorEnter(long window, int entered) {
					if ( entered != 0 )
						System.out.println("Mouse entered window: " + windowIndex);
				}

				@Override
				public void key(long window, int key, int action) {
					if ( key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE )
						latch.set(0); // Tests WindowCallback clean-up
				}
			});

			windows[i] = window;

			glfwMakeContextCurrent(window);
			contexts[i] = GLContext.createFromCurrent();

			glClearColor((i & 1), (i >> 1), (i == 1) ? 0.f : 1.f, 0.f);

			glfwShowWindow(window);
			glfwSetWindowPos(window, 100 + (i & 1) * 400, 100 + (i >> 1) * 400);
		}

		while ( latch.get() != 0 ) {
			glfwPollEvents();

			for ( int i = 0; i < 4; i++ ) {
				if ( windows[i] == 0L )
					continue;

				glfwMakeContextCurrent(windows[i]);
				GL.setCurrent(contexts[i]);

				glClear(GL_COLOR_BUFFER_BIT);
				glfwSwapBuffers(windows[i]);

				if ( glfwWindowShouldClose(windows[i]) != 0 ) {
					glfwDestroyWindow(windows[i]);
					windows[i] = NULL;
					contexts[i] = null;

					latch.decrementAndGet();
				}
			}
		}

		for ( int i = 0; i < 4; i++ ) {
			if ( windows[i] != NULL )
				glfwDestroyWindow(windows[i]);
		}
	}

	private static void error() {
		glfwTerminate();
		System.exit(-1);
	}

}