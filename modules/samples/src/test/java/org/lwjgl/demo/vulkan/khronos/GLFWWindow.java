/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.vulkan.khronos;

import org.joml.*;
import org.lwjgl.*;
import org.lwjgl.glfw.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.glfw.GLFWVulkan.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.VK10.*;

/** GLFW window implementation. */
public class GLFWWindow implements Window {

    private final long handle;

    public GLFWWindow(int width, int height, String title) {
        // Set up an error callback. The default implementation
        // will print the error message in System.err.
        GLFWErrorCallback.createPrint(System.err).set();

        // Initialize GLFW. Most GLFW functions will not work before doing this.
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }
        if (!glfwVulkanSupported()) {
            throw new RuntimeException("Cannot find a compatible Vulkan installable client driver (ICD)");
        }

        // Configure GLFW
        glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);

        // Create the window
        handle = glfwCreateWindow(width, height, title, NULL, NULL);

        glfwSetKeyCallback(handle, (windowHnd, key, scancode, action, mods) -> {
            if (action != GLFW_RELEASE) {
                return;
            }

            switch (key) {
                case GLFW_KEY_ESCAPE:
                    glfwSetWindowShouldClose(windowHnd, true);
                    break;
            }
        });
    }

    @Override
    public PointerBuffer getRequiredExtensions() {
        PointerBuffer requiredExtensions = glfwGetRequiredInstanceExtensions();
        if (requiredExtensions == null) {
            throw new RuntimeException("glfwGetRequiredInstanceExtensions returned null");
        }
        return requiredExtensions;
    }

    @Override
    public long create_surface(Demo.Instance instance) {
        if (instance == null) {
            return NULL;
        }
        try (MemoryStack stack = stackPush()) {
            LongBuffer pl = stack.mallocLong(1);

            int result = glfwCreateWindowSurface(instance.getHandle(), handle, null, pl);
            if (result != VK_SUCCESS) {
                return NULL;
            }

            return pl.get(0);
        }
    }

    @Override
    public Vector2i getExtent() {
        try (MemoryStack stack = stackPush()) {
            IntBuffer pw = stack.mallocInt(1);
            IntBuffer ph = stack.mallocInt(1);

            glfwGetWindowSize(handle, pw, ph);

            return new Vector2i(pw.get(0), ph.get(0));
        }
    }

    @Override
    public void mainLoop(Demo app) {
        glfwSetWindowSizeCallback(handle, GLFWWindowSizeCallback
            .create((window, w, h) -> app.resize()));

        while (!glfwWindowShouldClose(handle)) {
            glfwPollEvents();
            app.update();
        }
    }

    @Override
    public void close() {
        // Free the window callbacks and destroy the window
        Callbacks.glfwFreeCallbacks(handle);
        glfwDestroyWindow(handle);

        // Terminate GLFW and free the error callback
        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }
}