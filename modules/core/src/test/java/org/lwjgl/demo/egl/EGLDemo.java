/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.egl;

import org.lwjgl.egl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.opengles.*;
import org.lwjgl.system.*;

import java.lang.reflect.*;
import java.nio.*;

import static org.lwjgl.egl.EGL10.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFWNativeEGL.*;
import static org.lwjgl.opengles.GLES20.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EGLDemo {

    public EGLDemo() {
    }

    public static void main(String[] args) {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize glfw");
        }

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);

        // GLFW setup for EGL & OpenGL ES
        glfwWindowHint(GLFW_CONTEXT_CREATION_API, GLFW_EGL_CONTEXT_API);
        glfwWindowHint(GLFW_CLIENT_API, GLFW_OPENGL_ES_API);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 2);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 0);

        int WIDTH  = 300;
        int HEIGHT = 300;

        long window = glfwCreateWindow(WIDTH, HEIGHT, "GLFW EGL/OpenGL ES Demo", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        glfwSetKeyCallback(window, (windowHnd, key, scancode, action, mods) -> {
            if (action == GLFW_RELEASE && key == GLFW_KEY_ESCAPE) {
                glfwSetWindowShouldClose(windowHnd, true);
            }
        });

        // EGL capabilities
        long dpy = glfwGetEGLDisplay();

        EGLCapabilities egl;
        try (MemoryStack stack = stackPush()) {
            IntBuffer major = stack.mallocInt(1);
            IntBuffer minor = stack.mallocInt(1);

            if (!eglInitialize(dpy, major, minor)) {
                throw new IllegalStateException(String.format("Failed to initialize EGL [0x%X]", eglGetError()));
            }

            egl = EGL.createDisplayCapabilities(dpy, major.get(0), minor.get(0));
        }

        try {
            System.out.println("EGL Capabilities:");
            for (Field f : EGLCapabilities.class.getFields()) {
                if (f.getType() == boolean.class) {
                    if (f.get(egl).equals(Boolean.TRUE)) {
                        System.out.println("\t" + f.getName());
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        // OpenGL ES capabilities
        glfwMakeContextCurrent(window);
        GLESCapabilities gles = GLES.createCapabilities();

        try {
            System.out.println("OpenGL ES Capabilities:");
            for (Field f : GLESCapabilities.class.getFields()) {
                if (f.getType() == boolean.class) {
                    if (f.get(gles).equals(Boolean.TRUE)) {
                        System.out.println("\t" + f.getName());
                    }
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("GL_VENDOR: " + glGetString(GL_VENDOR));
        System.out.println("GL_VERSION: " + glGetString(GL_VERSION));
        System.out.println("GL_RENDERER: " + glGetString(GL_RENDERER));

        // Render with OpenGL ES
        glfwShowWindow(window);

        glClearColor(0.0f, 0.5f, 1.0f, 0.0f);
        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();

            glClear(GL_COLOR_BUFFER_BIT);
            glfwSwapBuffers(window);
        }

        glfwFreeCallbacks(window);
        glfwTerminate();
    }

}