/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.*;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.stb.STBImage.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** GLFW events demo. */
public final class Events {

    private static final Map<Integer, String> KEY_CODES = apiClassTokens((field, value) -> field.getName().startsWith("GLFW_KEY_"), null, GLFW.class);

    private Events() {
    }

    public static void main(String[] args) {
        GLFWErrorCallback errorCB = GLFWErrorCallback.createPrint(System.err);
        glfwSetErrorCallback(errorCB);

        System.err.println("---- [ Error callback test ] ----");
        glfwDefaultWindowHints();
        System.err.println("---- [ Error callback done ] ----");
        System.err.flush();

        if (!glfwInit()) {
            throw new IllegalStateException("Failed to initialize GLFW.");
        }

        System.out.println("GLFW initialized");

        try {
            demo();
        } finally {
            glfwTerminate();
            Objects.requireNonNull(glfwSetErrorCallback(null)).free();
        }
    }

    private static int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

    private static String ratio(int w, int h) {
        int gcd = gcd(w, h);

        int ratioX = w / gcd;
        int ratioY = h / gcd;

        if (ratioX == 8) {
            ratioX <<= 1;
            ratioY <<= 1;
        }

        return ratioX + ":" + ratioY;
    }

    private static void demo() {
        int WIDTH  = 640;
        int HEIGHT = 480;

        try (MemoryStack s = stackPush()) {
            IntBuffer pi = s.mallocInt(1);
            IntBuffer pj = s.mallocInt(1);

            FloatBuffer px = s.mallocFloat(1);
            FloatBuffer py = s.mallocFloat(1);

            long primaryMonitor = glfwGetPrimaryMonitor();

            PointerBuffer monitors = Objects.requireNonNull(glfwGetMonitors());
            for (int i = 0; i < monitors.remaining(); i++) {
                long monitor = monitors.get(i);

                System.out.format("%nMonitor %d:%n----------%n", i);
                System.out.format("\tName: %s%s%n", glfwGetMonitorName(monitor), primaryMonitor == monitor ? " (primary)" : "");

                glfwGetMonitorPhysicalSize(monitor, pi, pj);
                int widthMM  = pi.get(0);
                int heightMM = pj.get(0);

                glfwGetMonitorPos(monitor, pi, pj);
                int xpos = pi.get(0);
                int ypos = pj.get(0);

                glfwGetMonitorContentScale(monitor, px, py);
                float xscale = px.get(0);
                float yscale = py.get(0);

                double MM_TO_INCH = 0.0393701;

                GLFWVidMode mode = Objects.requireNonNull(glfwGetVideoMode(monitor));
                System.out.format("\tCurrent mode    : %d x %d @ %d Hz (%s, R%dG%dB%d)%n",
                    mode.width(), mode.height(),
                    mode.refreshRate(),
                    ratio(mode.width(), mode.height()),
                    mode.redBits(), mode.greenBits(), mode.blueBits()
                );
                System.out.format("\tContent scale   : %f x %f%n", xscale, yscale);
                if (xscale != 1.0f || yscale != 1.0f) {
                    System.out.format("\tContent size    : %d x %d%n", round(mode.width() / xscale), round(mode.height() / yscale));
                }
                System.out.format("\tPhysical size   : %dmm x %dmm (%d\", %d ppi)%n",
                    widthMM, heightMM,
                    round(Math.sqrt(widthMM * widthMM + heightMM * heightMM) * MM_TO_INCH), // inches
                    round(mode.width() / (widthMM * MM_TO_INCH)) // dpi
                );
                System.out.format("\tVirtual position: %d, %d%n", xpos, ypos);
            }
        }

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfwWindowHint(GLFW_SCALE_TO_MONITOR, GLFW_TRUE);
        if (Platform.get() == Platform.MACOSX) {
            glfwWindowHint(GLFW_COCOA_RETINA_FRAMEBUFFER, GLFW_FALSE);
        }

        long window = glfwCreateWindow(WIDTH, HEIGHT, "GLFW Event Demo", NULL, NULL);
        if (window == NULL) {
            throw new IllegalStateException("Failed to create GLFW window.");
        }

        System.out.format("%nWindow opened:%n--------------%n");
        try (MemoryStack s = stackPush()) {
            IntBuffer pi = s.mallocInt(1);
            IntBuffer pj = s.mallocInt(1);
            IntBuffer pk = s.mallocInt(1);
            IntBuffer pl = s.mallocInt(1);

            FloatBuffer px = s.mallocFloat(1);
            FloatBuffer py = s.mallocFloat(1);

            glfwGetWindowSize(window, pi, pj);
            System.out.format("\tSize: %d x %d%n", pi.get(0), pj.get(0));
            glfwGetWindowFrameSize(window, pi, pj, pk, pl);
            System.out.format("\tFrame size: %d, %d, %d, %d%n", pi.get(0), pj.get(0), pk.get(0), pl.get(0));
            glfwGetWindowContentScale(window, px, py);
            System.out.format("\tContent scale: %f x %f%n", px.get(0), py.get(0));
            glfwGetFramebufferSize(window, pi, pj);
            System.out.format("\tFramebuffer size: %d x %d%n", pi.get(0), pj.get(0));
            glfwGetWindowPos(window, pi, pj);
            System.out.format("\tPosition: %d, %d%n%n", pi.get(0), pj.get(0));
        }

        long cursor;

        try (MemoryStack s = stackPush()) {
            IntBuffer w    = s.mallocInt(1);
            IntBuffer h    = s.mallocInt(1);
            IntBuffer comp = s.mallocInt(1);

            // Cursor

            ByteBuffer png;
            try {
                png = ioResourceToByteBuffer("demo/cursor.png", 1024);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            ByteBuffer pixels = Objects.requireNonNull(stbi_load_from_memory(png, w, h, comp, 0));
            try {
                GLFWImage img = GLFWImage.malloc(s)
                    .width(w.get(0))
                    .height(h.get(0))
                    .pixels(pixels);
                cursor = glfwCreateCursor(img, 0, 8);
                glfwSetCursor(window, cursor);
            } finally {
                stbi_image_free(pixels);
            }

            // Icons

            ByteBuffer icon16;
            ByteBuffer icon32;
            try {
                icon16 = ioResourceToByteBuffer("lwjgl16.png", 2048);
                icon32 = ioResourceToByteBuffer("lwjgl32.png", 4096);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

            GLFWImage.Buffer icons = GLFWImage.malloc(2, s);

            ByteBuffer pixels16 = Objects.requireNonNull(stbi_load_from_memory(icon16, w, h, comp, 4));
            icons
                .get(0)
                .width(w.get(0))
                .height(h.get(0))
                .pixels(pixels16);

            ByteBuffer pixels32 = Objects.requireNonNull(stbi_load_from_memory(icon32, w, h, comp, 4));
            icons
                .get(1)
                .width(w.get(0))
                .height(h.get(0))
                .pixels(pixels32);

            glfwSetWindowIcon(window, icons);

            stbi_image_free(pixels32);
            stbi_image_free(pixels16);
        }

        glfwSetMonitorCallback((monitor, event) -> printEvent("Monitor", "%s", monitor, event == GLFW_CONNECTED ? "connected" : "disconnected"));
        glfwSetJoystickCallback((joy, event) -> printEvent("Joystick", "%s %s", joy, glfwGetJoystickName(joy), event == GLFW_CONNECTED
            ? "connected"
            : "disconnected"
        ));

        glfwSetWindowPosCallback(window, (windowHnd, xpos, ypos) -> printEvent("moved to %d, %d", windowHnd, xpos, ypos));
        glfwSetWindowSizeCallback(window, (windowHnd, width, height) -> printEvent("resized to %d x %d", windowHnd, width, height));
        glfwSetWindowCloseCallback(window, windowHnd -> printEvent("closed", windowHnd));
        glfwSetWindowRefreshCallback(window, windowHnd -> printEvent("refreshed", windowHnd));
        glfwSetWindowFocusCallback(window, (windowHnd, focused) -> printEvent(focused ? "gained focus" : "lost focus", windowHnd));
        glfwSetWindowIconifyCallback(window, (windowHnd, iconified) -> printEvent(iconified ? "iconified" : "restored", windowHnd));
        glfwSetWindowMaximizeCallback(window, (windowHnd, maximized) -> printEvent(maximized ? "maximized" : "restored", windowHnd));
        glfwSetWindowContentScaleCallback(window, (windowHnd, xscale, yscale) -> printEvent("content scale changed to %f x %f", windowHnd, xscale, yscale));

        glfwSetFramebufferSizeCallback(window, (windowHnd, width, height) -> printEvent("framebuffer resized to %d x %d", windowHnd, width, height));

        glfwSetKeyCallback(window, (windowHnd, key, scancode, action, mods) -> {
            String state;
            switch (action) {
                case GLFW_RELEASE:
                    state = "released";
                    break;
                case GLFW_PRESS:
                    state = "pressed";
                    break;
                case GLFW_REPEAT:
                    state = "repeated";
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unsupported key action: 0x%X", action));
            }

            printEvent("key %s[%s - %d] was %s", windowHnd, getModState(mods), KEY_CODES.get(key), scancode, state);

            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(windowHnd, true);
            }
        });
        glfwSetCharCallback(window, (windowHnd, codepoint) -> printEvent("char %s", windowHnd, Character.toString((char)codepoint)));
        glfwSetCharModsCallback(window, (windowHnd, codepoint, mods) -> printEvent(
            "char mods %s%s", windowHnd, getModState(mods), Character.toString((char)codepoint)
        ));
        glfwSetMouseButtonCallback(window, (windowHnd, button, action, mods) -> {
            String state;
            switch (action) {
                case GLFW_RELEASE:
                    state = "released";
                    break;
                case GLFW_PRESS:
                    state = "pressed";
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unsupported mouse button action: 0x%X", action));
            }
            printEvent("mouse button %s[0x%X] was %s", windowHnd, getModState(mods), button, state);
        });
        glfwSetCursorPosCallback(window, (windowHnd, xpos, ypos) -> printEvent("cursor moved to %f, %f", windowHnd, xpos, ypos));
        glfwSetCursorEnterCallback(window, (windowHnd, entered) -> printEvent("cursor %s", windowHnd, entered ? "entered" : "left"));
        glfwSetScrollCallback(window, (windowHnd, xoffset, yoffset) -> printEvent("scroll by %f, %f", windowHnd, xoffset, yoffset));
        glfwSetDropCallback(window, (windowHnd, count, names) -> {
            printEvent("drop %d file%s", windowHnd, count, count == 1 ? "" : "s");

            for (int i = 0; i < count; i++) {
                System.out.format("\t%d: %s%n", i + 1, GLFWDropCallback.getName(names, i));
            }
        });

        glfwMakeContextCurrent(window);
        GL.createCapabilities();

        glfwShowWindow(window);
        glfwSwapInterval(1);

        glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        while (!glfwWindowShouldClose(window)) {
            glfwWaitEvents();

            glClear(GL_COLOR_BUFFER_BIT);
            glfwSwapBuffers(window);
        }

        GL.setCapabilities(null);

        glfwFreeCallbacks(window);
        Objects.requireNonNull(glfwSetJoystickCallback(null)).free();
        Objects.requireNonNull(glfwSetMonitorCallback(null)).free();

        glfwDestroyCursor(cursor);
        glfwDestroyWindow(window);
    }

    private static String getModState(int mods) {
        if (mods == 0) {
            return "";
        }

        StringBuilder modState = new StringBuilder(16);
        if ((mods & GLFW_MOD_SHIFT) != 0) {
            modState.append("SHIFT+");
        }
        if ((mods & GLFW_MOD_CONTROL) != 0) {
            modState.append("CONTROL+");
        }
        if ((mods & GLFW_MOD_ALT) != 0) {
            modState.append("ALT+");
        }
        if ((mods & GLFW_MOD_SUPER) != 0) {
            modState.append("SUPER+");
        }

        return modState.toString();
    }

    private static void printEvent(String format, long window, Object... args) {
        printEvent("Window", format, window, args);
    }

    private static void printEvent(String type, String format, long object, Object... args) {
        Object[] formatArgs = new Object[3 + args.length];

        formatArgs[0] = glfwGetTime();
        formatArgs[1] = type;
        formatArgs[2] = object;
        System.arraycopy(args, 0, formatArgs, 3, args.length);

        System.out.format("%.3f: %s [0x%X] " + format + "%n", formatArgs);
    }

}