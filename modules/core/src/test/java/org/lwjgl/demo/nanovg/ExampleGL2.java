/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.nanovg;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;

import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.nanovg.NanoVG.*;
import static org.lwjgl.nanovg.NanoVGGL2.*;
import static org.lwjgl.opengl.GL11.*;
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
 * OpenGL 2.0+ demo.
 *
 * <p>This is a Java port of
 * <a href="https://github.com/memononen/nanovg/blob/master/example/example_gl2.c">https://github.com/memononen/nanovg/blob/master/example/example_gl2.c</a>.</p>
 */
public final class ExampleGL2 extends Demo {

    private ExampleGL2() {
    }

    private static boolean blowup;
    private static boolean screenshot;
    private static boolean premult;

    public static void main(String[] args) {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new RuntimeException("Failed to init GLFW.");
        }

        DemoData  data = new DemoData();
        PerfGraph fps  = new PerfGraph();

        initGraph(fps, GRAPH_RENDER_FPS, "Frame Time");

        boolean DEMO_MSAA = args.length != 0 && "msaa".equalsIgnoreCase(args[0]);
        if (DEMO_MSAA) {
            glfwWindowHint(GLFW_SAMPLES, 4);
        }

        long window = glfwCreateWindow(1000, 600, "NanoVG", NULL, NULL);
        //window = glfwCreateWindow(1000, 600, "NanoVG", glfwGetPrimaryMonitor(), NULL);
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

        glfwMakeContextCurrent(window);
        GL.createCapabilities();

        long vg = DEMO_MSAA
            ? nvgCreate(NVG_STENCIL_STROKES | NVG_DEBUG)
            : nvgCreate(NVG_ANTIALIAS | NVG_STENCIL_STROKES | NVG_DEBUG);

        if (vg == NULL) {
            throw new RuntimeException("Could not init nanovg.");
        }

        if (loadDemoData(vg, data) == -1) {
            throw new RuntimeException();
        }

        glfwSwapInterval(0);

        glfwSetTime(0);
        double prevt = glfwGetTime();

        while (!glfwWindowShouldClose(window)) {
            double t  = glfwGetTime();
            double dt = t - prevt;
            prevt = t;
            updateGraph(fps, (float)dt);

            glfwGetCursorPos(window, mx, my);
            glfwGetWindowSize(window, winWidth, winHeight);
            glfwGetFramebufferSize(window, fbWidth, fbHeight);

            // Calculate pixel ration for hi-dpi devices.
            float pxRatio = (float)fbWidth.get(0) / (float)winWidth.get(0);

            // Update and render
            glViewport(0, 0, fbWidth.get(0), fbHeight.get(0));
            if (premult) {
                glClearColor(0, 0, 0, 0);
            } else {
                glClearColor(0.3f, 0.3f, 0.32f, 1.0f);
            }
            glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT | GL_STENCIL_BUFFER_BIT);

            nvgBeginFrame(vg, winWidth.get(0), winHeight.get(0), pxRatio);

            renderDemo(vg, (float)mx.get(0), (float)my.get(0), winWidth.get(0), winHeight.get(0), (float)t, blowup, data);
            renderGraph(vg, 5, 5, fps);

            nvgEndFrame(vg);

            if (screenshot) {
                screenshot = false;
                saveScreenShot(fbWidth.get(0), fbHeight.get(0), premult, "dump.png");
            }

            glfwSwapBuffers(window);
            glfwPollEvents();
        }

        freeDemoData(vg, data);

        nvgDelete(vg);

        glfwFreeCallbacks(window);
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

}