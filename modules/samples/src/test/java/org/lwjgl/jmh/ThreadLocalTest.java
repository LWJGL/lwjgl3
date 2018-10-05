/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.lwjgl.opengl.*;
import org.openjdk.jmh.annotations.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryUtil.*;

@State(Scope.Thread)
public class ThreadLocalTest {

    static {
        glfwInit();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
    }

    long window;

    @Setup
    public void initThread() {
        window = glfwCreateWindow(1024, 768, "ThreadLocal Test", NULL, NULL);
        glfwMakeContextCurrent(window);
        GL.createCapabilities();
    }

    @TearDown
    public void destroyThread() {
        glfwDestroyWindow(window);
    }

    @SuppressWarnings("MethodMayBeStatic")
    @Benchmark
    public void test() {
        GL.getCapabilities();
    }

}