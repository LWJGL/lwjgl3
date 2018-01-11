/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.stb;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.nio.*;
import java.util.*;
import java.util.regex.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.glfw.GLFWUtil.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** STB Easy Font demo. */
abstract class FontDemo {

    protected final String text;
    private final   int    lineCount;

    private long window;
    private int ww = 800;
    private int wh = 600;

    private float
        contentScaleX,
        contentScaleY;

    private boolean ctrlDown;

    private int fontHeight;

    private int   scale;
    private int   lineOffset;
    private float lineHeight;

    private boolean kerningEnabled = true;
    private boolean lineBBEnabled;

    private Callback debugProc;

    protected FontDemo(int fontHeight, String filePath) {
        this.fontHeight = fontHeight;
        this.lineHeight = fontHeight;

        String t;

        int lc;

        try {
            ByteBuffer source = ioResourceToByteBuffer(filePath, 4 * 1024);
            t = memUTF8(source).replaceAll("\t", "    "); // Replace tabs

            lc = 0;
            Matcher m = Pattern.compile("^.*$", Pattern.MULTILINE).matcher(t);
            while (m.find()) {
                lc++;
            }
        } catch (IOException e) {
            e.printStackTrace();

            t = "Failed to load text.";
            lc = 1;
        }

        text = t;
        lineCount = lc;
    }

    public String getText() {
        return text;
    }

    public long getWindow() {
        return window;
    }

    public int getFontHeight() {
        return fontHeight;
    }

    public int getScale() {
        return scale;
    }

    public float getContentScaleX() {
        return contentScaleX;
    }

    public float getContentScaleY() {
        return contentScaleY;
    }

    public int getLineOffset() {
        return lineOffset;
    }

    public boolean isKerningEnabled() {
        return kerningEnabled;
    }

    public boolean isLineBBEnabled() {
        return lineBBEnabled;
    }

    protected void run(String title) {
        try {
            init(title);

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
        if (Platform.get() != Platform.MACOSX) {
            width /= contentScaleX;
            height /= contentScaleY;
        }

        this.ww = width;
        this.wh = height;

        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0.0, width, height, 0.0, -1.0, 1.0);
        glMatrixMode(GL_MODELVIEW);

        FontDemo.this.setLineOffset(lineOffset);
    }

    private static void framebufferSizeChanged(long window, int width, int height) {
        glViewport(0, 0, width, height);
    }

    private void init(String title) {
        GLFWErrorCallback.createPrint().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
        glfwWindowHint(GLFW_OPENGL_DEBUG_CONTEXT, GLFW_TRUE);

        long monitor = glfwGetPrimaryMonitor();

        int framebufferW;
        int framebufferH;
        try (MemoryStack s = stackPush()) {
            FloatBuffer px = s.mallocFloat(1);
            FloatBuffer py = s.mallocFloat(1);

            glfwGetMonitorContentScale(monitor, px, py);

            contentScaleX = px.get(0);
            contentScaleY = py.get(0);

            if (Platform.get() == Platform.MACOSX) {
                framebufferW = ww;
                framebufferH = wh;
            } else {
                framebufferW = round(ww * contentScaleX);
                framebufferH = round(wh * contentScaleY);
            }
        }

        this.window = glfwCreateWindow(framebufferW, framebufferH, title, NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        glfwSetWindowSizeCallback(window, this::windowSizeChanged);
        glfwSetFramebufferSizeCallback(window, FontDemo::framebufferSizeChanged);

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            ctrlDown = (mods & GLFW_MOD_CONTROL) != 0;
            if (action == GLFW_RELEASE) {
                return;
            }

            switch (key) {
                case GLFW_KEY_ESCAPE:
                    glfwSetWindowShouldClose(window, true);
                    break;
                case GLFW_KEY_PAGE_UP:
                    setLineOffset(lineOffset - wh / FontDemo.this.lineHeight);
                    break;
                case GLFW_KEY_PAGE_DOWN:
                    setLineOffset(lineOffset + wh / FontDemo.this.lineHeight);
                    break;
                case GLFW_KEY_HOME:
                    setLineOffset(0);
                    break;
                case GLFW_KEY_END:
                    setLineOffset(lineCount - wh / FontDemo.this.lineHeight);
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
                case GLFW_KEY_B:
                    lineBBEnabled = !lineBBEnabled;
                    break;
                case GLFW_KEY_K:
                    kerningEnabled = !kerningEnabled;
                    break;
            }
        });

        glfwSetScrollCallback(window, (window, xoffset, yoffset) -> {
            if (ctrlDown) {
                setScale(scale + (int)round(yoffset));
            } else {
                setLineOffset(lineOffset - (int)round(yoffset) * 3);
            }
        });

        // Center window
        GLFWVidMode vidmode = Objects.requireNonNull(glfwGetVideoMode(monitor));

        glfwSetWindowPos(
            window,
            (vidmode.width() - framebufferW) / 2,
            (vidmode.height() - framebufferH) / 2
        );

        // Create context
        glfwMakeContextCurrent(window);
        GL.createCapabilities();
        debugProc = GLUtil.setupDebugMessageCallback();

        glfwSwapInterval(1);
        glfwShowWindow(window);

        glfwInvoke(window, this::windowSizeChanged, FontDemo::framebufferSizeChanged);
    }

    private void setScale(int scale) {
        this.scale = max(-3, scale);
        this.lineHeight = fontHeight * (1.0f + this.scale * 0.25f);
        setLineOffset(lineOffset);
    }

    private void setLineOffset(float offset) {
        setLineOffset(round(offset));
    }

    private void setLineOffset(int offset) {
        lineOffset = max(0, min(offset, lineCount - (int)(wh / lineHeight)));
    }

    protected abstract void loop();

    private void destroy() {
        if (debugProc != null) {
            debugProc.free();
        }

        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);
        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

}