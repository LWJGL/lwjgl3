/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.nanovg;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.nanovg.NanoVGUtils.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.nanovg.NanoVG.*;
import static org.lwjgl.nanovg.NanoVGGL3.*;
import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/*
 * Copyright (c) 2013 Mikko Mononen memon@inside.org
 *
 * This software is provided 'as-is', without any express or implied
 * warranty.  In no event will the authors be held liable for any damages
 * arising from the use of this software.
 *
 * Permission is granted to anyone to use this software for any purpose,
 * including commercial applications, and to alter it and redistribute it
 * freely, subject to the following restrictions:
 *
 * 1. The origin of this software must not be misrepresented; you must not
 * claim that you wrote the original software. If you use this software
 * in a product, an acknowledgment in the product documentation would be
 * appreciated but is not required.
 * 2. Altered source versions must be plainly marked as such, and must not be
 * misrepresented as being the original software.
 * 3. This notice may not be removed or altered from any source distribution.
 */

/**
 * OpenGL 3.0+ demo.
 *
 * <p>This is a Java port of
 * <a href="https://github.com/memononen/nanovg/blob/master/example/example_gl3.c">https://github.com/memononen/nanovg/blob/master/example/example_gl3.c</a>.</p>
 */
public final class ExampleGL3 extends Demo {

    private ExampleGL3() {
    }

    private static boolean blowup;
    private static boolean screenshot;
    private static boolean premult;

    private static double cursorX;
    private static double cursorY;

    private static int framebufferWidth;
    private static int framebufferHeight;

    private static float contentScaleX;
    private static float contentScaleY;

    public static void main(String[] args) {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new RuntimeException("Failed to init GLFW.");
        }

        if (Platform.get() == Platform.MACOSX) {
            glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
            glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 2);
            glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GLFW_TRUE);
            glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        }
        glfwWindowHint(GLFW_SCALE_TO_MONITOR, GLFW_TRUE);

        boolean DEMO_MSAA = args.length != 0 && "msaa".equalsIgnoreCase(args[0]);
        if (DEMO_MSAA) {
            glfwWindowHint(GLFW_SAMPLES, 8);
        }

        long window = glfwCreateWindow(1000, 600, "NanoVG (OpenGL 3)", NULL, NULL);
        if (window == NULL) {
            glfwTerminate();
            throw new RuntimeException();
        }

        glfwSetKeyCallback(window, (windowHandle, keyCode, scancode, action, mods) -> {
            if (keyCode == GLFW_KEY_ESCAPE && action == GLFW_PRESS) {
                glfwSetWindowShouldClose(windowHandle, true);
            }
            if (keyCode == GLFW_KEY_SPACE && action == GLFW_PRESS) {
                blowup = !blowup;
            }
            if (keyCode == GLFW_KEY_S && action == GLFW_PRESS) {
                screenshot = true;
            }
            if (keyCode == GLFW_KEY_P && action == GLFW_PRESS) {
                premult = !premult;
            }
        });

        glfwSetCursorPosCallback(window, (handle, xpos, ypos) -> {
            cursorX = (int)xpos;
            cursorY = (int)ypos;
        });

        glfwSetFramebufferSizeCallback(window, (handle, w, h) -> {
            framebufferWidth = w;
            framebufferHeight = h;
        });
        glfwSetWindowContentScaleCallback(window, (handle, xscale, yscale) -> {
            contentScaleX = xscale;
            contentScaleY = yscale;
        });

        try (MemoryStack stack = stackPush()) {
            IntBuffer   fw = stack.mallocInt(1);
            IntBuffer   fh = stack.mallocInt(1);
            FloatBuffer sx = stack.mallocFloat(1);
            FloatBuffer sy = stack.mallocFloat(1);

            glfwGetFramebufferSize(window, fw, fh);
            framebufferWidth = fw.get(0);
            framebufferHeight = fh.get(0);

            glfwGetWindowContentScale(window, sx, sy);
            contentScaleX = sx.get(0);
            contentScaleY = sy.get(0);
        }

        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        glfwSwapInterval(0);

        long vg = nvgCreate(DEMO_MSAA ? 0 : NVG_ANTIALIAS);
        if (vg == NULL) {
            throw new RuntimeException("Could not init nanovg.");
        }

        DemoData data = new DemoData();
        if (loadDemoData(vg, data) == -1) {
            throw new RuntimeException();
        }

        GPUtimer gpuTimer = new GPUtimer();

        PerfGraph fps      = new PerfGraph();
        PerfGraph cpuGraph = new PerfGraph();
        PerfGraph gpuGraph = new PerfGraph();

        initGraph(fps, GRAPH_RENDER_FPS, "Frame Time");
        initGraph(cpuGraph, GRAPH_RENDER_MS, "CPU Time");
        initGraph(gpuGraph, GRAPH_RENDER_MS, "GPU Time");

        initGPUTimer(gpuTimer);

        glfwSetTime(0);
        double prevt = glfwGetTime();

        while (!glfwWindowShouldClose(window)) {
            double t  = glfwGetTime();
            double dt = t - prevt;
            prevt = t;
            updateGraph(fps, (float)dt);

            startGPUTimer(gpuTimer);

            // Effective dimensions on hi-dpi devices.
            int width  = (int)(framebufferWidth / contentScaleX);
            int height = (int)(framebufferHeight / contentScaleY);

            // Update and render
            glViewport(0, 0, framebufferWidth, framebufferHeight);
            if (premult) {
                glClearColor(0, 0, 0, 0);
            } else {
                glClearColor(0.3f, 0.3f, 0.32f, 1.0f);
            }
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);

            nvgBeginFrame(vg, width, height, max(contentScaleX, contentScaleY));

            renderDemo(vg, (float)cursorX, (float)cursorY, width, height, (float)t, blowup, data);
            renderGraph(vg, 5, 5, fps);
            renderGraph(vg, 5 + 200 + 5, 5, cpuGraph);
            if (gpuTimer.supported) {
                renderGraph(vg, 5 + 200 + 5 + 200 + 5, 5, gpuGraph);
            }

            nvgEndFrame(vg);

            // Measure the CPU time taken excluding swap buffers (as the swap may wait for GPU)
            double cpuTime = glfwGetTime() - t;

            updateGraph(fps, (float)dt);
            updateGraph(cpuGraph, (float)cpuTime);

            // We may get multiple results.
            int n = stopGPUTimer(gpuTimer, gpuTimes, 3);
            for (int i = 0; i < n; i++) {
                updateGraph(gpuGraph, gpuTimes.get(i));
            }

            if (screenshot) {
                screenshot = false;
                saveScreenShotGL(framebufferWidth, framebufferHeight, premult, "nanovg_gl3.png");
            }

            glfwSwapBuffers(window);
            glfwPollEvents();
        }

        freeDemoData(vg, data);

        nvgDelete(vg);

        System.out.printf("Average Frame Time: %.2f ms\n", getGraphAverage(fps) * 1000.0f);
        System.out.printf("          CPU Time: %.2f ms\n", getGraphAverage(cpuGraph) * 1000.0f);
        System.out.printf("          GPU Time: %.2f ms\n", getGraphAverage(gpuGraph) * 1000.0f);

        GL.setCapabilities(null);

        glfwFreeCallbacks(window);
        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

}