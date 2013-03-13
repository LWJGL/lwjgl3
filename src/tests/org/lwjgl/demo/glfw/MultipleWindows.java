package org.lwjgl.demo.glfw;

import org.lwjgl.Sys;
import org.lwjgl.system.glfw.ErrorCallback;
import org.lwjgl.system.glfw.WindowCallback;
import org.lwjgl.system.glfw.WindowCallbackAdapter;

import static org.lwjgl.system.glfw.GLFW.*;

public class MultipleWindows {

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

		final long[] windows = new long[4];

		for ( int i = 0; i < windows.length; i++ ) {
			final int windowIndex = i + 1;

			long window = glfwCreateWindow(300, 200, "GLFW Demo - " + windowIndex, 0L, 0L);
			if ( window == 0L )
				error();

			WindowCallback.set(window, new WindowCallbackAdapter() {
				@Override
				public void cursorEnter(final long window, final int entered) {
					if ( entered != 0 )
						System.out.println("Mouse entered window: " + windowIndex);
				}
			});

			windows[i] = window;

			glfwSetWindowPos(window, 100 + (i & 1) * 400, 100 + (i >> 1) * 400);
			glfwShowWindow(window);
		}

		while ( true ) {
			glfwPollEvents();

			boolean noMoreWindowsOpen = true;
			for ( int i = 0; i < 4; i++ ) {
				if ( windows[i] == 0L )
					continue;

				if ( glfwWindowShouldClose(windows[i]) != 0 ) {
					glfwDestroyWindow(windows[i]);
					windows[i] = 0L;
				}

				noMoreWindowsOpen = false;
			}

			if ( noMoreWindowsOpen )
				break;
		}
	}

	private static void error() {
		glfwTerminate();
		System.exit(-1);
	}

}