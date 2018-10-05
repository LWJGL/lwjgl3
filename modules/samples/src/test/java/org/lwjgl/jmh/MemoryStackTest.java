/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.lwjgl.opengl.*;
import org.lwjgl.system.*;
import org.openjdk.jmh.annotations.*;

import java.nio.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Compares the MemoryStack to Java arrays.
 *
 * The array version may look fast, but generates tons of garbage. The reason is that Escape Analysis cannot eliminate the allocation, since the array
 * reference is passed to a JNI method and JNI code is opaque to the JVM. This can be verified by enabling JMH's GC Profiler.
 */
@State(Scope.Benchmark)
public class MemoryStackTest {

    private long window;

    @State(Scope.Thread)
    public static class ThreadState {
        private final MemoryStack stack = MemoryStack.create(32 * 1024);
    }

    @Setup
    public void init() {
        glfwInit();

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);

        window = glfwCreateWindow(1, 1, "MemoryStack Benchmark", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        glfwMakeContextCurrent(window);
        GL.createCapabilities();
    }

    @TearDown
    public void destroy() {
        GL.setCapabilities(null);
        glfwDestroyWindow(window);
        glfwTerminate();
    }

    @Benchmark
    public void array() {
        float[] fp = new float[1];
        fp[0] = 16.0f;
        glVertexAttrib1fv(1, fp);
    }

    @Benchmark
    public void stackParam(ThreadState state) {
        try (MemoryStack stack = state.stack.push()) {
            FloatBuffer fp = stack.mallocFloat(1);
            fp.put(0, 16.0f);
            glVertexAttrib1fv(1, fp);
        }
    }

    @Benchmark
    public void stackTL() {
        try (MemoryStack stack = stackPush()) {
            FloatBuffer fp = stack.mallocFloat(1);
            fp.put(0, 16.0f);
            glVertexAttrib1fv(1, fp);
        }
    }


}
