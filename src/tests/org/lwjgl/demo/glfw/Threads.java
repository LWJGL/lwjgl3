package org.lwjgl.demo.glfw;

import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.system.glfw.ErrorCallback;

import java.util.concurrent.CountDownLatch;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.glfw.GLFW.*;

/**
 * Port of https://github.com/elmindreda/glfw/blob/master/tests/threads.c
 * <p/>
 * GLFW demo that showcases rendering to multiple windows from multiple threads.
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public final class Threads {

	private static final String[]  titles = { "Red", "Green", "Blue" };
	private static final float[][] rgb    = {
		{ 1f, 0f, 0f, 0 },
		{ 0f, 1f, 0f, 0 },
		{ 0f, 0f, 1f, 0 }
	};

	private Threads() {
	}

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

			threads[i] = new GLFWThread(window, i, quit);
			threads[i].start();
		}

		out:
		while ( true ) {
			glfwPollEvents();

			for ( int i = 0; i < titles.length; i++ ) {
				if ( glfwWindowShouldClose(threads[i].window) == 1 || !threads[i].isAlive() ) {
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
		int   index;
		float r, g, b;

		CountDownLatch quit;

		GLFWThread(long window, int index, CountDownLatch quit) {
			this.window = window;

			this.index = index;

			this.r = rgb[index][0];
			this.g = rgb[index][1];
			this.b = rgb[index][2];

			System.out.println("GLFWThread: window:" + window + ", rgb: (" + r + ", " + g + ", " + b + ")");

			this.quit = quit;
		}

		@Override
		public void run() {
			glfwMakeContextCurrent(window);
			GLContext.createFromCurrent();

			glfwSwapInterval(1);
			glfwShowWindow(window);

			glfwSetWindowPos(window, 200 + 250 * index, 200);

			while ( quit.getCount() != 0 ) {
				float v = (float)Math.abs(Math.sin(glfwGetTime() * 2f));
				glClearColor(r * v, g * v, b * v, 0f);
				glClear(GL_COLOR_BUFFER_BIT);
				glfwSwapBuffers(window);
			}

			glfwDestroyWindow(window);
		}
	}
}
