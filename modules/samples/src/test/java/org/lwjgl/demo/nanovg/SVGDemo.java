/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.nanovg;

import org.lwjgl.glfw.*;
import org.lwjgl.nanovg.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.glfw.GLFWUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.nanovg.NanoSVG.*;
import static org.lwjgl.opengl.GL12.*;
import static org.lwjgl.stb.STBImageResize.*;
import static org.lwjgl.system.MemoryUtil.*;

public class SVGDemo {

    private final ByteBuffer image;

    private final int w;
    private final int h;

    private long window;
    private int  ww;
    private int  wh;

    private boolean ctrlDown;

    private int scale;

    private Callback debugProc;

    private SVGDemo(ByteBuffer svgData) {
        NSVGImage svg;
        try (MemoryStack stack = MemoryStack.stackPush()) {
            svg = nsvgParse(svgData, stack.ASCII("px"), 96.0f);
            if (svg == null) {
                throw new IllegalStateException("Failed to parse SVG.");
            }
        }

        long rast = nsvgCreateRasterizer();
        if (rast == NULL) {
            throw new IllegalStateException("Failed to create SVG rasterizer.");
        }

        this.w = (int)svg.width();
        this.h = (int)svg.height();

        image = memAlloc(w * h * 4);

        System.out.format("Rasterizing image %d x %d...", w, h);
        long t = System.nanoTime();
        nsvgRasterize(rast, svg, 0, 0, 1, image, w, h, w * 4);
        t = System.nanoTime() - t;
        System.out.format("%dms\n", t / 1000 / 1000);
    }

    public static void main(String[] args) {
        SVGDemo demo;

        ByteBuffer svgData = memAlloc(128 * 1024);
        try {
            String spec;
            if (args.length == 0) {
                System.out.println("Use 'ant demo -Dclass=org.lwjgl.demo.nanovg.SVGDemo -Dargs=<url>' to load a different image.\n");
                spec = "https://upload.wikimedia.org/wikipedia/commons/f/fd/Ghostscript_Tiger.svg";
            } else {
                spec = args[0];
            }

            System.out.print("Downloading SVG image...");

            long t = System.nanoTime();

            URL website = new URL(spec);

            try (ReadableByteChannel rbc = Channels.newChannel(website.openStream())) {
                int c;
                while ((c = rbc.read(svgData)) != -1) {
                    if (c == 0) {
                        svgData = memRealloc(svgData, (svgData.capacity() * 3) >> 1);
                    }
                }
            }

            t = System.nanoTime() - t;
            System.out.format("%dms\n", t / 1000 / 1000);

            svgData.put((byte)0);
            svgData.flip();

            demo = new SVGDemo(svgData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            memFree(svgData);
        }

        demo.run();
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

    private void windowSizeChanged(long window, int width, int height) {
        this.ww = width;
        this.wh = height;

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0.0, width, height, 0.0, -1.0, 1.0);
        glMatrixMode(GL_MODELVIEW);
    }

    private static void framebufferSizeChanged(long window, int width, int height) {
        glViewport(0, 0, width, height);
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

        GLFWVidMode vidmode = Objects.requireNonNull(glfwGetVideoMode(glfwGetPrimaryMonitor()));
        ww = max(800, min(w, vidmode.width() - 160));
        wh = max(600, min(h, vidmode.height() - 120));

        this.window = glfwCreateWindow(ww, wh, "NanoSVG Demo", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        // Center window
        glfwSetWindowPos(
            window,
            (vidmode.width() - ww) / 2,
            (vidmode.height() - wh) / 2
        );

        glfwSetWindowRefreshCallback(window, window -> render());
        glfwSetWindowSizeCallback(window, this::windowSizeChanged);
        glfwSetFramebufferSizeCallback(window, SVGDemo::framebufferSizeChanged);

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            ctrlDown = (mods & GLFW_MOD_CONTROL) != 0;
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
        glfwShowWindow(window);

        glfwInvoke(window, this::windowSizeChanged, SVGDemo::framebufferSizeChanged);

        t = System.nanoTime() - t;
        System.out.format("%dms\n", t / 1000 / 1000);
    }

    private void setScale(int scale) {
        this.scale = max(-9, scale);
    }

    private void premultiplyAlpha() {
        int stride = w * 4;
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                int i = y * stride + x * 4;

                float alpha = (image.get(i + 3) & 0xFF) / 255.0f;
                image.put(i + 0, (byte)round(((image.get(i + 0) & 0xFF) * alpha)));
                image.put(i + 1, (byte)round(((image.get(i + 1) & 0xFF) * alpha)));
                image.put(i + 2, (byte)round(((image.get(i + 2) & 0xFF) * alpha)));
            }
        }
    }

    private int createTexture() {
        System.out.print("Creating texture...");
        long t = System.nanoTime();

        int texID = glGenTextures();

        glBindTexture(GL_TEXTURE_2D, texID);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_LINEAR);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_LINEAR_MIPMAP_LINEAR);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_S, GL_CLAMP_TO_EDGE);
        glTexParameteri(GL_TEXTURE_2D, GL_TEXTURE_WRAP_T, GL_CLAMP_TO_EDGE);

        premultiplyAlpha();

        glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, w, h, 0, GL_RGBA, GL_UNSIGNED_BYTE, image);

        ByteBuffer input_pixels = image;
        int        input_w      = w;
        int        input_h      = h;
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

        return texID;
    }

    private void loop() {
        int texID = createTexture();

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

        glPushMatrix();
        glTranslatef(ww * 0.5f, wh * 0.5f, 0.0f);
        glScalef(scaleFactor, scaleFactor, 1f);
        glTranslatef(-w * 0.5f, -h * 0.5f, 0.0f);

        glBegin(GL_QUADS);
        {
            glTexCoord2f(0.0f, 0.0f);
            glVertex2f(0.0f, 0.0f);

            glTexCoord2f(1.0f, 0.0f);
            glVertex2f(w, 0.0f);

            glTexCoord2f(1.0f, 1.0f);
            glVertex2f(w, h);

            glTexCoord2f(0.0f, 1.0f);
            glVertex2f(0.0f, h);
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
