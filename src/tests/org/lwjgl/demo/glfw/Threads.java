package org.lwjgl.demo.glfw;

import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.glfw.ErrorCallback;

import java.util.concurrent.CountDownLatch;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.WGLEXTSwapControl.*;
import static org.lwjgl.system.glfw.GLFW.*;
import static org.lwjgl.system.windows.GLFWWin32.*;
import static org.lwjgl.system.windows.WinGDI.*;
import static org.lwjgl.system.windows.WinUser.*;

/**
 * Port of https://github.com/elmindreda/glfw/blob/master/tests/threads.c
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public class Threads {

	private static final String[]  titles = { "Red", "Green", "Blue" };
	private static final float[][] rgb    = {
		{ 1f, 0f, 0f, 0 },
		{ 0f, 1f, 0f, 0 },
		{ 0f, 0f, 1f, 0 }
	};

	public static void main(String[] args) {
		Sys.touch();

		GLFWThread[] threads = new GLFWThread[titles.length];

		if ( glfwInit() != GL11.GL_TRUE ) {
			System.out.println("Unable to initialize glfw");
			System.exit(-1);
		}

		glfwSetErrorCallback(new ErrorCallback());

		glfwWindowHint(GLFW_VISIBLE, GL_FALSE);

		CountDownLatch quit = new CountDownLatch(1);

		for ( int i = 0; i < titles.length; i++ ) {
			long window = glfwCreateWindow(200, 200, titles[i], 0, 0);

			if ( window == 0 ) {
				System.out.println("Unable to create glfw window");
				glfwTerminate();
			}

			glfwSetWindowPos(window, 200 + 250 * i, 200);

			threads[i] = new GLFWThread(window, rgb[i][0], rgb[i][1], rgb[i][2], quit);
			threads[i].start();
		}

		out:
		while ( true ) {
			glfwPollEvents();

			for ( int i = 0; i < titles.length; i++ ) {
				if ( glfwWindowShouldClose(threads[i].window) == 1 ) {
					quit.countDown();
					break out;
				}
			}
		}

		for ( int i = 0; i < titles.length; i++ ) {
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		glfwTerminate();
	}

	private static class GLFWThread extends Thread {

		long  window;
		float r, g, b;

		CountDownLatch quit;

		GLFWThread(long window, float r, float g, float b, CountDownLatch quit) {
			System.out.println("GLFWThread: window:" + window + ", rgb: (" + r + ", " + g + ", " + b + ")");

			this.window = window;
			this.r = r;
			this.g = g;
			this.b = b;

			this.quit = quit;
		}

		@Override
		public void run() {
			long HWND = glfwGetWin32Window(window);
			long HDC = GetDC(HWND);

			GLContext context = DemoUtil.initializeOpenGLContext(HDC);

			wglSwapIntervalEXT(1);
			glfwShowWindow(window);

			while ( quit.getCount() != 0 ) {
				float v = (float)Math.abs(Math.sin(glfwGetTime() * 2f));
				glClearColor(r * v, g * v, b * v, 0f);
				glClear(GL_COLOR_BUFFER_BIT);
				SwapBuffers(HDC);
				DemoUtil.pause(16);
			}

			context.destroy();
			glfwDestroyWindow(window);
		}
	}
}
