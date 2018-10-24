/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.*;
import java.util.concurrent.atomic.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** GLFW demo that showcases rendering to multiple windows from a single thread. */
public final class MultipleWindows {

    private MultipleWindows() {
    }

    public static void main(String[] args) {
        GLFWErrorCallback errorfun = GLFWErrorCallback.createPrint();
        glfwSetErrorCallback(errorfun);
        if (!glfwInit()) {
            throw new IllegalStateException("Failed to initialize GLFW.");
        }

        try {
            demo();
        } finally {
            glfwTerminate();
            Objects.requireNonNull(glfwSetErrorCallback(null)).free();
        }
    }

    private static void demo() {
        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_SCALE_TO_MONITOR, GLFW_TRUE);
        if (Platform.get() == Platform.MACOSX) {
            glfwWindowHint(GLFW_COCOA_RETINA_FRAMEBUFFER, GLFW_FALSE);
        }

        int scaleX, scaleY;
        try (MemoryStack s = stackPush()) {
            FloatBuffer px = s.mallocFloat(1);
            FloatBuffer py = s.mallocFloat(1);

            glfwGetMonitorContentScale(glfwGetPrimaryMonitor(), px, py);

            scaleX = (int)px.get(0);
            scaleY = (int)py.get(0);
        }

        Window[] windows = new Window[4];

        AtomicInteger latch = new AtomicInteger(windows.length);

        for (int i = 0; i < windows.length; i++) {
            int windowIndex = i + 1;

            long handle = glfwCreateWindow(300, 200, "GLFW Demo - " + windowIndex, NULL, NULL);
            if (handle == NULL) {
                throw new IllegalStateException("Failed to create GLFW window");
            }

            Window window = new Window(handle);

            glfwSetCursorEnterCallback(handle, (windowHnd, entered) -> {
                if (entered) {
                    System.out.println("Mouse entered window: " + windowIndex);
                }
            });

            glfwSetKeyCallback(handle, (windowHnd, key, scancode, action, mods) -> {
                if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                    Arrays.stream(windows)
                        .filter(Objects::nonNull)
                        .forEach(w -> glfwSetWindowShouldClose(w.handle, true));
                }
            });

            glfwMakeContextCurrent(handle);
            window.capabilities = GL.createCapabilities();

            glClearColor((i & 1), (i >> 1), (i == 1) ? 0.f : 1.f, 0.f);

            glfwShowWindow(handle);
            glfwSetWindowPos(handle, 100 + (i & 1) * (300 * scaleX + 100), 100 + (i >> 1) * (200 * scaleY + 100));

            windows[i] = window;
        }

        while (latch.get() != 0) {
            glfwPollEvents();

            for (int i = 0; i < 4; i++) {
                Window window = windows[i];
                if (window == null) {
                    continue;
                }

                glfwMakeContextCurrent(window.handle);
                GL.setCapabilities(window.capabilities);

                glClear(GL_COLOR_BUFFER_BIT);
                glfwSwapBuffers(window.handle);

                if (glfwWindowShouldClose(window.handle)) {
                    glfwFreeCallbacks(window.handle);
                    glfwDestroyWindow(window.handle);
                    windows[i] = null;

                    latch.decrementAndGet();
                }
            }
        }
        GL.setCapabilities(null);
    }

    private static class Window {
        final long handle;

        GLCapabilities capabilities;

        Window(long handle) {
            this.handle = handle;
        }
    }

}