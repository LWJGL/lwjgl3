/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.nanovg;

import org.lwjgl.glfw.*;
import org.lwjgl.nanovg.*;
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
 * Framebuffer object demo.
 *
 * <p>This is a Java port of
 * <a href="https://github.com/memononen/nanovg/blob/master/example/example_fbo.c">https://github.com/memononen/nanovg/blob/master/example/example_fbo.c</a>.</p>
 */
public final class ExampleFBO extends Demo {

    private static final ByteBuffer RobotoRegular = loadResource("demo/nanovg/Roboto-Regular.ttf", 150 * 1024);
    private static final ByteBuffer RobotoBold    = loadResource("demo/nanovg/Roboto-Bold.ttf", 150 * 1024);

    private static final int FBO_WIDTH  = 100;
    private static final int FBO_HEIGHT = 100;

    private static int framebufferWidth;
    private static int framebufferHeight;

    private static float contentScaleX;
    private static float contentScaleY;

    private static NVGLUFramebuffer fb;

    private ExampleFBO() {
    }

    private static void createPattern(long vg) {
        if (fb != null) {
            nvgluDeleteFramebuffer(vg, fb);
        }

        // The image pattern is tiled, set repeat on x and y.
        fb = nvgluCreateFramebuffer(
            vg,
            (int)(FBO_WIDTH * contentScaleX),
            (int)(100 * contentScaleY),
            NVG_IMAGE_REPEATX | NVG_IMAGE_REPEATY
        );
        if (fb == null) {
            throw new RuntimeException("Could not create FBO.");
        }
    }

    private static void renderPattern(long vg, float t) {
        float s  = 20.0f;
        float sr = ((float)cos(t) + 1) * 0.5f;
        float r  = s * 0.6f * (0.2f + 0.8f * sr);

        // Draw some stuff to an FBO as a test
        nvgluBindFramebuffer(vg, fb);
        glViewport(0, 0, (int)(FBO_WIDTH * contentScaleX), (int)(FBO_HEIGHT * contentScaleY));
        glClearColor(0, 0, 0, 0);
        glClear(GL_COLOR_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);
        nvgBeginFrame(vg, FBO_WIDTH, FBO_HEIGHT, max(contentScaleX, contentScaleY));

        int pw = (int)ceil(FBO_WIDTH / s);
        int ph = (int)ceil(FBO_HEIGHT / s);

        nvgBeginPath(vg);
        for (int y = 0; y < ph; y++) {
            for (int x = 0; x < pw; x++) {
                float cx = (x + 0.5f) * s;
                float cy = (y + 0.5f) * s;
                nvgCircle(vg, cx, cy, r);
            }
        }
        nvgFillColor(vg, rgba(220, 160, 0, 200, colorA));
        nvgFill(vg);

        nvgEndFrame(vg);
        nvgluBindFramebuffer(vg, null);
    }

    private static int loadFonts(long vg) {
        int font;
        font = nvgCreateFontMem(vg, "sans", RobotoRegular, 0);
        if (font == -1) {
            throw new RuntimeException("Could not add font regular.");
        }
        font = nvgCreateFontMem(vg, "sans-bold", RobotoBold, 0);
        if (font == -1) {
            throw new RuntimeException("Could not add font bold.");
        }
        return 0;
    }

    public static void main(String[] args) {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new RuntimeException("Failed to init GLFW.");
        }

        if (Platform.get() == Platform.MACOSX) {
            glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 3);
            glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 2);
            glfwWindowHint(GLFW_OPENGL_FORWARD_COMPAT, GL_TRUE);
            glfwWindowHint(GLFW_OPENGL_PROFILE, GLFW_OPENGL_CORE_PROFILE);
        }
        glfwWindowHint(GLFW_SCALE_TO_MONITOR, GLFW_TRUE);

        boolean DEMO_MSAA = args.length != 0 && "msaa".equalsIgnoreCase(args[0]);
        if (DEMO_MSAA) {
            glfwWindowHint(GLFW_SAMPLES, 8);
        }

        long window = glfwCreateWindow(1000, 600, "NanoVG", NULL, NULL);
        if (window == NULL) {
            glfwTerminate();
            throw new RuntimeException();
        }

        glfwSetKeyCallback(window, (windowHandle, keyCode, scancode, action, mods) -> {
            if (keyCode == GLFW_KEY_ESCAPE && action == GLFW_PRESS) {
                glfwSetWindowShouldClose(windowHandle, true);
            }
        });

        glfwSetFramebufferSizeCallback(window, (handle, w, h) -> {
            framebufferWidth = w;
            framebufferHeight = h;
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

        glfwSetWindowContentScaleCallback(window, (handle, xscale, yscale) -> {
            contentScaleX = xscale;
            contentScaleY = yscale;

            createPattern(vg);
        });

        createPattern(vg);
        loadFonts(vg);

        GPUtimer  gpuTimer = new GPUtimer();
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

            startGPUTimer(gpuTimer);

            // Effective dimensions on hi-dpi devices.
            int width  = (int)(framebufferWidth / contentScaleX);
            int height = (int)(framebufferHeight / contentScaleY);

            renderPattern(vg, (float)t);

            // Update and render
            glViewport(0, 0, framebufferWidth, framebufferHeight);
            glClearColor(0.3f, 0.3f, 0.32f, 1.0f);
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);

            nvgBeginFrame(vg, width, height, max(contentScaleX, contentScaleY));

            // Use the FBO as image pattern.
            NVGPaint img = paintA;
            nvgImagePattern(vg, 0, 0, 100, 100, 0, fb.image(), 1.0f, img);
            nvgSave(vg);

            for (int i = 0; i < 20; i++) {
                nvgBeginPath(vg);
                nvgRect(vg, 10 + i * 30, 10, 10, height - 20);
                nvgHSLA(i / 19.0f, 0.5f, 0.5f, (byte)255, colorA);
                nvgFillColor(vg, colorA);
                nvgFill(vg);
            }

            nvgBeginPath(vg);
            nvgRoundedRect(vg, 140 + (float)Math.sin(t * 1.3f) * 100, 140 + (float)Math.cos(t * 1.71244f) * 100, 250, 250, 20);
            nvgFillPaint(vg, img);
            nvgFill(vg);
            nvgStrokeColor(vg, rgba(220, 160, 0, 255, colorA));
            nvgStrokeWidth(vg, 3.0f);
            nvgStroke(vg);

            nvgRestore(vg);

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

            glfwSwapBuffers(window);
            glfwPollEvents();
        }

        nvgluDeleteFramebuffer(vg, fb);

        freeDemoData();

        nvgDelete(vg);

        System.out.format("Average Frame Time: %.2f ms\n", getGraphAverage(fps) * 1000.0f);
        System.out.format("          CPU Time: %.2f ms\n", getGraphAverage(cpuGraph) * 1000.0f);
        System.out.format("          GPU Time: %.2f ms\n", getGraphAverage(gpuGraph) * 1000.0f);

        GL.setCapabilities(null);

        glfwFreeCallbacks(window);
        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

}