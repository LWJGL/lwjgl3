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
import static org.lwjgl.nanovg.NanoSVG.*;
import static org.lwjgl.opengl.GL12.*;
import static org.lwjgl.stb.STBImageResize.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SVGDemo {

    private final NSVGImage svg;

    private final int svgWidth;
    private final int svgHeight;

    private int texID;

    private long window;

    private int windowWidth;
    private int windowHeight;

    private int framebufferWidth;
    private int framebufferHeight;

    private boolean ctrlDown;

    private int scale;

    private Callback debugProc;

    private SVGDemo(ByteBuffer svgData) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            svg = nsvgParse(svgData, stack.ASCII("px"), 96.0f);
            if (svg == null) {
                throw new IllegalStateException("Failed to parse SVG.");
            }
        } finally {
            memFree(svgData);
        }

        this.svgWidth = (int)svg.width();
        this.svgHeight = (int)svg.height();
    }

    public static void main(String[] args) {
        String spec;
        if (args.length == 0) {
            System.out.println("Use 'ant demo -Dclass=org.lwjgl.demo.nanovg.SVGDemo -Dargs=<url>' to load a different image.\n");
            spec = "https://upload.wikimedia.org/wikipedia/commons/f/fd/Ghostscript_Tiger.svg";
        } else {
            spec = args[0];
        }

        System.out.print("Downloading SVG image...");
        long t = System.nanoTime();

        ByteBuffer svgData = downloadSVG(spec);

        System.out.format("%dms\n", (System.nanoTime() - t) / 1000 / 1000);

        new SVGDemo(svgData).run();
    }

    private void run() {
        try {
            init();

            loop();
        } finally {
            try {
                destroy();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void init() {
        System.out.print("Creating window...");
        long t = System.nanoTime();

        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MAJOR, 2);
        glfwWindowHint(GLFW_CONTEXT_VERSION_MINOR, 1);
        glfwWindowHint(GLFW_SCALE_TO_MONITOR, GLFW_TRUE);

        long        monitor = glfwGetPrimaryMonitor();
        GLFWVidMode vidmode = Objects.requireNonNull(glfwGetVideoMode(monitor));

        int ww = min(svgWidth + 32, vidmode.width());
        int wh = min(svgHeight + 32, vidmode.height());
        if (Platform.get() != Platform.MACOSX) {
            try (MemoryStack stack = stackPush()) {
                FloatBuffer sx = stack.mallocFloat(1);
                FloatBuffer sy = stack.mallocFloat(1);

                glfwGetMonitorContentScale(monitor, sx, sy);

                ww = (int)(ww / sx.get(0));
                wh = (int)(wh / sy.get(0));
            }
        }

        this.window = glfwCreateWindow(ww, wh, "NanoSVG Demo", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        glfwSetWindowRefreshCallback(window, window -> render());
        glfwSetWindowSizeCallback(window, (window, width, height) -> {
            windowWidth = width;
            windowHeight = height;
        });
        glfwSetFramebufferSizeCallback(window, (window, width, height) -> {
            framebufferWidth = width;
            framebufferHeight = height;

            glViewport(0, 0, width, height);
        });
        glfwSetWindowContentScaleCallback(window, (window, xscale, yscale) -> createTexture(xscale, yscale));

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            switch (key) {
                case GLFW_KEY_LEFT_CONTROL:
                case GLFW_KEY_RIGHT_CONTROL:
                    ctrlDown = action != GLFW_RELEASE;
            }

            if (action == GLFW_RELEASE) {
                return;
            }

            switch (key) {
                case GLFW_KEY_ESCAPE:
                    glfwSetWindowShouldClose(window, true);
                    break;
                case GLFW_KEY_KP_ADD:
                case GLFW_KEY_EQUAL:
                    setScale(scale + 1);
                    break;
                case GLFW_KEY_KP_SUBTRACT:
                case GLFW_KEY_MINUS:
                    setScale(scale - 1);
                    break;
                case GLFW_KEY_0:
                case GLFW_KEY_KP_0:
                    if (ctrlDown) {
                        setScale(0);
                    }
                    break;
            }
        });

        glfwSetScrollCallback(window, (window, xoffset, yoffset) -> {
            if (ctrlDown) {
                setScale(scale + (int)yoffset);
            }
        });

        // Create context
        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        debugProc = GLUtil.setupDebugMessageCallback();

        glfwSwapInterval(1);

        t = System.nanoTime() - t;
        System.out.format("%dms\n", t / 1000 / 1000);

        try (MemoryStack stack = stackPush()) {
            IntBuffer   pw = stack.mallocInt(1);
            IntBuffer   ph = stack.mallocInt(1);
            FloatBuffer sx = stack.mallocFloat(1);
            FloatBuffer sy = stack.mallocFloat(1);

            glfwGetWindowSize(window, pw, ph);
            windowWidth = pw.get(0);
            windowHeight = ph.get(0);

            glfwGetFramebufferSize(window, pw, ph);
            framebufferWidth = pw.get(0);
            framebufferHeight = ph.get(0);

            glViewport(0, 0, framebufferWidth, framebufferHeight);

            glfwGetWindowContentScale(window, sx, sy);
            createTexture(sx.get(0), sy.get(0));
        }

        // Center window
        glfwSetWindowPos(
            window,
            (vidmode.width() - windowWidth) / 2,
            (vidmode.height() - windowHeight) / 2
        );
        glfwShowWindow(window);
    }

    private void setScale(int scale) {
        this.scale = max(-9, scale);
    }

    private void createTexture(float contentScaleX, float contentScaleY) {
        if (texID != 0) {
            glDeleteTextures(texID);
        }

        long rast = nsvgCreateRasterizer();
        if (rast == NULL) {
            throw new IllegalStateException("Failed to create SVG rasterizer.");
        }

        int width  = (int)(svgWidth * contentScaleX);
        int height = (int)(svgHeight * contentScaleY);

        ByteBuffer image = memAlloc(width * height * 4);

        System.out.format("Rasterizing image %d x %d...", width, height);
        long t = System.nanoTime();
        nsvgRasterize(rast, svg, 0, 0, min(contentScaleX, contentScaleY), image, width, height, width * 4);
        t = System.nanoTime() - t;
        System.out.format("%dms\n", t / 1000 / 1000);

        nsvgDeleteRasterizer(rast);

        System.out.print("Creating texture...");
        t = System.nanoTime();

        texID = glGenTextures();

        glBindTexture(GL_TEXTURE_2D, texID);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);

        premultiplyAlpha(image, width, height, width * 4);

        glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, width, height, 0, GL_RGBA, GL_UNSIGNED_BYTE, image);

        ByteBuffer input_pixels = image;
        int        input_w      = width;
        int        input_h      = height;
        int        mipmapLevel  = 0;
        while (1 < input_w || 1 < input_h) {
            int output_w = max(1, input_w >> 1);
            int output_h = max(1, input_h >> 1);

            ByteBuffer output_pixels = memAlloc(output_w * output_h * 4);
            stbir_resize_uint8_generic(
                input_pixels, input_w, input_h, input_w * 4,
                output_pixels, output_w, output_h, output_w * 4,
                4, 3, STBIR_FLAG_ALPHA_PREMULTIPLIED,
                STBIR_EDGE_CLAMP,
                STBIR_FILTER_MITCHELL,
                STBIR_COLORSPACE_SRGB
            );

            memFree(input_pixels);

            glTexImage2D(GL_TEXTURE_2D, ++mipmapLevel, GL_RGBA, output_w, output_h, 0, GL_RGBA, GL_UNSIGNED_BYTE, output_pixels);

            input_pixels = output_pixels;
            input_w = output_w;
            input_h = output_h;
        }
        memFree(input_pixels);

        t = System.nanoTime() - t;
        System.out.format("%dms\n", t / 1000 / 1000);
    }

    private void loop() {
        glEnable(GL_BLEND);
        glBlendFunc(GL_ONE, GL_ONE_MINUS_SRC_ALPHA);

        glEnable(GL_TEXTURE_2D);
        glClearColor(43f / 255f, 43f / 255f, 43f / 255f, 0f);

        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();
            render();
        }

        glDisable(GL_TEXTURE_2D);
        glDeleteTextures(texID);
    }

    private void render() {
        glClear(GL_COLOR_BUFFER_BIT);

        float scaleFactor = 1.0f + scale * 0.1f;

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0.0, windowWidth, windowHeight, 0.0, -1.0, 1.0);
        glMatrixMode(GL_MODELVIEW);

        glPushMatrix();
        glTranslatef(windowWidth * 0.5f, windowHeight * 0.5f, 0.0f);
        glScalef(scaleFactor, scaleFactor, 1f);
        glTranslatef(-svgWidth * 0.5f, -svgHeight * 0.5f, 0.0f);

        glBegin(GL_QUADS);
        {
            glTexCoord2f(0.0f, 0.0f);
            glVertex2f(0.0f, 0.0f);

            glTexCoord2f(1.0f, 0.0f);
            glVertex2f(svgWidth, 0.0f);

            glTexCoord2f(1.0f, 1.0f);
            glVertex2f(svgWidth, svgHeight);

            glTexCoord2f(0.0f, 1.0f);
            glVertex2f(0.0f, svgHeight);
        }
        glEnd();

        glPopMatrix();

        glfwSwapBuffers(window);
    }

    private void destroy() {
        GL.setCapabilities(null);

        if (debugProc != null) {
            debugProc.free();
        }

        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);
        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

}
