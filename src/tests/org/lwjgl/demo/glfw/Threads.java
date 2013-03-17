package org.lwjgl.demo.glfw;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.Sys;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.WGLEXTSwapControl;
import org.lwjgl.system.glfw.ErrorCallback;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.glfw.GLFW.*;
import static org.lwjgl.system.windows.GLFWWin32.glfwGetWin32Window;
import static org.lwjgl.system.windows.WinGDI.SwapBuffers;
import static org.lwjgl.system.windows.WinUser.GetDC;

/**
 * Port of https://github.com/elmindreda/glfw/blob/master/tests/threads.c
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public class Threads extends AbstractDemo {
    public static String[] titles = {"Red", "Green", "Blue"};
    private static float[][] rgb = {
            {1f, 0f, 0f, 0},
            {0f, 1f, 0f, 0},
            {0f, 0f, 1f, 0}
    };

    public static void main(String[] args) {
        Sys.touch();
        Threads that = new Threads();

        GLFWThread[] threads = new GLFWThread[titles.length];
        boolean running = true;

        if (glfwInit() != GL11.GL_TRUE) {
            System.out.println("Unable to initialize glfw");
            System.exit(-1);
        }

        glfwSetErrorCallback(new ErrorCallback() {
            @Override
            public void invoke(int error, long description) {
                LWJGLUtil.log("invoke: " + error + ", " + description);
            }

            @Override
            public void callback(int error, String description) {
                LWJGLUtil.log("callback: " + error + ", " + description);
            }
        });

        glfwWindowHint(GLFW_VISIBLE, GL_FALSE);

        for (int i = 0; i < titles.length; i++) {
            long window = glfwCreateWindow(200, 200, titles[i], 0, 0);

            if (window == 0) {
                System.out.println("Unable to create glfw window");
                glfwTerminate();
            }

            glfwSetWindowPos(window, 200 + 250 * i, 200);
            glfwShowWindow(window);

            threads[i] = that.new GLFWThread(window, rgb[i][0], rgb[i][1], rgb[i][2]);
            threads[i].start();
        }

        while (running) {
            for (int i = 0; i < titles.length; i++) {
                if (glfwWindowShouldClose(threads[i].window) == 1) {
                    running = false;
                }
            }
            glfwPollEvents();
        }

        for (int i = 0; i < titles.length; i++) {
            threads[i].running = false;
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        glfwTerminate();
    }

    private class GLFWThread extends Thread {
        long window;
        public volatile boolean running;
        float r, g, b;

        public GLFWThread(long window, float r, float g, float b) {
            System.out.println("GLFWThread: window:" + window + ", rgb: (" + r + ", " + g + ", " + b + ")");
            this.window = window;
            this.r = r;
            this.g = g;
            this.b = b;
            this.running = true;
        }

        @Override
        public void run() {
	        long HWND = glfwGetWin32Window(window);
	        long HDC = GetDC(HWND);

	        GLContext context = initializeOpenGLContext(HDC);

            WGLEXTSwapControl.wglSwapIntervalEXT(1);
            while (running) {
                context.makeCurrent();
                float v = (float) Math.abs(Math.sin(glfwGetTime() * 2f));
                glClearColor(r * v, g * v, b * v, 0f);
                glClear(GL_COLOR_BUFFER_BIT);
                SwapBuffers(HDC);
                try {
                    Thread.sleep(16);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

	        context.destroy();
        }
    }
}
