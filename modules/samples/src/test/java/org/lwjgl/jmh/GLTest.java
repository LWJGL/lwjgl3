/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.jmh;

import org.lwjgl.opengl.*;
import org.openjdk.jmh.annotations.*;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.system.MemoryUtil.*;

@State(Scope.Benchmark)
public class GLTest {

    private long window;

    @Setup
    public void init() {
        glfwInit();

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);

        window = glfwCreateWindow(1, 1, "GL Benchmark", NULL, NULL);
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
    public void gl() {
        glVertexAttrib1f(1, 0.0f);
        //glVertexAttrib2f(0, 0.0f, 0.0f);
        //glVertexAttrib3f(0, 0.0f, 0.0f, 0.0f);
    }
}
