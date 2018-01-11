/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;

import java.util.*;
import java.util.concurrent.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * GLFW demo that showcases rendering to multiple windows from multiple threads. Ported from the GLFW
 * <a href="https://github.com/glfw/glfw/blob/master/tests/threads.c">threads</a> test.
 *
 * @author Brian Matzon <brian@matzon.dk>
 */
public final class Threads {

    private static final String[]  titles = {"Red", "Green", "Blue"};
    private static final float[][] rgb    = {
        {1f, 0f, 0f, 0},
        {0f, 1f, 0f, 0},
        {0f, 0f, 1f, 0}
    };

    private Threads() {
    }

    public static void main(String[] args) {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Failed to initialize GLFW.");
        }

        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);

        CountDownLatch quit = new CountDownLatch(1);

        GLFWThread[] threads = new GLFWThread[titles.length];
        for (int i = 0; i < titles.length; i++) {
            long window = glfwCreateWindow(200, 200, titles[i], NULL, NULL);
            if (window == NULL) {
                throw new IllegalStateException("Failed to create GLFW window.");
            }

            glfwSetKeyCallback(window, (windowHnd, key, scancode, action, mods) -> {
                if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                    glfwSetWindowShouldClose(windowHnd, true);
                }
            });
            glfwSetWindowPos(window, 200 + 250 * i, 200);
            glfwShowWindow(window);

            threads[i] = new GLFWThread(window, i, quit);
            threads[i].start();
        }

        out:
        while (true) {
            glfwWaitEvents();

            for (int i = 0; i < titles.length; i++) {
                if (glfwWindowShouldClose(threads[i].window)) {
                    quit.countDown();
                    break out;
                }
            }
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < threads.length; i++) {
            glfwFreeCallbacks(threads[i].window);
            glfwDestroyWindow(threads[i].window);
        }

        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

    private static class GLFWThread extends Thread {

        final long window;

        final int   index;
        final float r, g, b;

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
            GL.createCapabilities();

            glfwSwapInterval(1);

            while (quit.getCount() != 0) {
                float v = (float)Math.abs(Math.sin(glfwGetTime() * 2f));
                glClearColor(r * v, g * v, b * v, 0f);
                glClear(GL_COLOR_BUFFER_BIT);
                glfwSwapBuffers(window);
            }
        }
    }
}
