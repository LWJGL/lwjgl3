/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.glfw;

import org.lwjgl.glfw.*;
import org.lwjgl.opengl.*;
import org.lwjgl.system.*;

import java.io.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import java.nio.*;
import java.util.*;

import static org.lwjgl.demo.glfw.FFMDemo.*;
import static org.lwjgl.demo.util.IOUtil.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11C.*;
import static org.lwjgl.stb.STBImage.*;
import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.SegmentStack.*;
import static org.lwjgl.system.ffm.FFM.*;

/** FFM port of the GLFW events demo. */
public final class FFMEvents {

    private static final Map<Integer, String> KEY_CODES = apiClassTokens((field, _) -> field.getName().startsWith("GLFW_KEY_"), null, GLFW.class);

    private FFMEvents() {
    }

    static void main() {
        try (var callbackArena = Arena.ofConfined()) {
            glfw.SetErrorCallback(callbackArena, (error_code, description) -> {
                System.err.format("GLFW Error %d: %s%n", error_code, description);

                var stack = Thread.currentThread().getStackTrace();
                for (var i = 2; i < stack.length; i++) {
                    System.err.format("\t%s%n", stack[i]);
                }
            });

            System.err.println("---- [ Error callback test ] ----");
            glfw.DefaultWindowHints();
            System.err.println("---- [ Error callback done ] ----");
            System.err.flush();

            if (!glfw.Init()) {
                throw new IllegalStateException("Failed to initialize GLFW.");
            }

            System.out.println("GLFW initialized");

            demo(callbackArena);
        } finally {
            glfw.Terminate();
            glfw.SetErrorCallback(NULL);
        }
    }

    private static int gcd(int a, int b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

    private static String ratio(int w, int h) {
        var gcd = gcd(w, h);

        var ratioX = w / gcd;
        var ratioY = h / gcd;

        if (ratioX == 8) {
            ratioX <<= 1;
            ratioY <<= 1;
        }

        return ratioX + ":" + ratioY;
    }

    private static void demo(Arena callbackArena) {
        var WIDTH  = 640;
        var HEIGHT = 480;

        try (var s = stackPush()) {
            var pi = s.allocateFrom(ValueLayout.JAVA_INT_UNALIGNED, 1);
            var pj = s.allocateFrom(ValueLayout.JAVA_INT_UNALIGNED, 1);

            var px = s.allocateFrom(ValueLayout.JAVA_FLOAT_UNALIGNED, 1);
            var py = s.allocateFrom(ValueLayout.JAVA_FLOAT_UNALIGNED, 1);

            var primaryMonitor = glfw.GetPrimaryMonitor();

            var count_p     = s.allocateFrom(ValueLayout.JAVA_INT, 1);
            var monitors_pp = glfw.GetMonitors(count_p);
            if (MemorySegment.NULL.equals(monitors_pp)) {
                throw new NullPointerException();
            }

            var count    = memGetInt(count_p, 0L);
            var monitors = monitors_pp.reinterpret(ValueLayout.ADDRESS_UNALIGNED.scale(0L, count));
            for (var i = 0; i < count; i++) {
                var monitor = memGetAddressAtIndex(monitors, i);

                System.out.format("%nMonitor %d:%n----------%n", i);
                System.out.format("\tName: %s%s%n", glfw.GetMonitorName(monitor), primaryMonitor == monitor ? " (primary)" : "");

                glfw.GetMonitorPhysicalSize(monitor, pi, pj);
                var widthMM  = memGetInt(pi, 0L);
                var heightMM = memGetInt(pj, 0L);

                glfw.GetMonitorPos(monitor, pi, pj);
                var xpos = memGetInt(pi, 0L);
                var ypos = memGetInt(pj, 0L);

                glfw.GetMonitorContentScale(monitor, px, py);
                var xscale = memGetFloat(px, 0L);
                var yscale = memGetFloat(py, 0L);

                var MM_TO_INCH = 0.0393701;

                /*GLFWVidMode mode = Objects.requireNonNull(glfwGetVideoMode(monitor));
                System.out.format("\tCurrent mode    : %d x %d @ %d Hz (%s, R%dG%dB%d)%n",
                    mode.width(), mode.height(),
                    mode.refreshRate(),
                    ratio(mode.width(), mode.height()),
                    mode.redBits(), mode.greenBits(), mode.blueBits()
                );*/
                System.out.format("\tContent scale   : %f x %f%n", xscale, yscale);
                /*if (xscale != 1.0f || yscale != 1.0f) {
                    System.out.format("\tContent size    : %d x %d%n", round(mode.width() / xscale), round(mode.height() / yscale));
                }*/
                /*System.out.format("\tPhysical size   : %dmm x %dmm (%d\", %d ppi)%n",
                    widthMM, heightMM,
                    round(Math.sqrt(widthMM * widthMM + heightMM * heightMM) * MM_TO_INCH), // inches
                    round(mode.width() / (widthMM * MM_TO_INCH)) // dpi
                );*/
                System.out.format("\tVirtual position: %d, %d%n", xpos, ypos);
            }
        }

        glfw.DefaultWindowHints();
        glfw.WindowHint(GLFW_VISIBLE, GLFW_FALSE);
        glfw.WindowHint(GLFW_SCALE_TO_MONITOR, GLFW_TRUE);
        if (Platform.get() == Platform.MACOSX) {
            glfw.WindowHint(GLFW_COCOA_RETINA_FRAMEBUFFER, GLFW_FALSE);
        }

        var window = glfw.CreateWindow(WIDTH, HEIGHT, "GLFW Event Demo", NULL, NULL);
        if (window == NULL) {
            throw new IllegalStateException("Failed to create GLFW window.");
        }

        System.out.format("%nWindow opened:%n--------------%n");
        try (var s = stackPush()) {
            var pi = s.allocateFrom(ValueLayout.JAVA_INT_UNALIGNED, 1);
            var pj = s.allocateFrom(ValueLayout.JAVA_INT_UNALIGNED, 1);
            var pk = s.allocateFrom(ValueLayout.JAVA_INT_UNALIGNED, 1);
            var pl = s.allocateFrom(ValueLayout.JAVA_INT_UNALIGNED, 1);

            var px = s.allocateFrom(ValueLayout.JAVA_FLOAT_UNALIGNED, 1);
            var py = s.allocateFrom(ValueLayout.JAVA_FLOAT_UNALIGNED, 1);

            glfw.GetWindowSize(window, pi, pj);
            System.out.format("\tSize: %d x %d%n", memGetInt(pi, 0L), memGetInt(pj, 0L));
            glfw.GetWindowFrameSize(window, pi, pj, pk, pl);
            System.out.format("\tFrame size: %d, %d, %d, %d%n", memGetInt(pi, 0L), memGetInt(pj, 0L), memGetInt(pk, 0L), memGetInt(pl, 0L));
            glfw.GetWindowContentScale(window, px, py);
            System.out.format("\tContent scale: %f x %f%n", memGetFloat(px, 0L), memGetFloat(py, 0L));
            glfw.GetFramebufferSize(window, pi, pj);
            System.out.format("\tFramebuffer size: %d x %d%n", memGetInt(pi, 0L), memGetInt(pj, 0L));
            glfw.GetWindowPos(window, pi, pj);
            System.out.format("\tPosition: %d, %d%n%n", memGetInt(pi, 0L), memGetInt(pj, 0L));
        }

        long cursor;

        try (var s = MemoryStack.stackPush()) {
            // TODO: migrate to FFM API

            var w = s.mallocInt(1);
            var h = s.mallocInt(1);
            var       comp = s.mallocInt(1);

            // Cursor

            ByteBuffer png;
            try {
                png = ioResourceToByteBuffer("demo/cursor.png", 1024);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            var pixels = Objects.requireNonNull(stbi_load_from_memory(png, w, h, comp, 0));
            try {
                var img = GLFWImage.malloc(s)
                    .width(w.get(0))
                    .height(h.get(0))
                    .pixels(pixels);
                cursor = glfwCreateCursor(img, 0, 8);
                glfw.SetCursor(window, cursor);
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

            var icons = GLFWImage.malloc(2, s);

            var pixels16 = Objects.requireNonNull(stbi_load_from_memory(icon16, w, h, comp, 4));
            icons
                .get(0)
                .width(w.get(0))
                .height(h.get(0))
                .pixels(pixels16);

            var pixels32 = Objects.requireNonNull(stbi_load_from_memory(icon32, w, h, comp, 4));
            icons
                .get(1)
                .width(w.get(0))
                .height(h.get(0))
                .pixels(pixels32);

            glfwSetWindowIcon(window, icons);

            stbi_image_free(pixels32);
            stbi_image_free(pixels16);
        }

        glfw.SetMonitorCallback(callbackArena, (monitor, event) -> printEvent("Monitor", "%s", monitor, event == GLFW_CONNECTED ? "connected" : "disconnected"));
        glfw.SetJoystickCallback(callbackArena, (joy, event) -> printEvent("Joystick", "%s %s", joy, glfwGetJoystickName(joy), event == GLFW_CONNECTED
            ? "connected"
            : "disconnected"
        ));

        glfw.SetWindowPosCallback(callbackArena, window, (windowHnd, xpos, ypos) -> printEvent("moved to %d, %d", windowHnd, xpos, ypos));
        glfw.SetWindowSizeCallback(callbackArena, window, (windowHnd, width, height) -> printEvent("resized to %d x %d", windowHnd, width, height));
        glfw.SetWindowCloseCallback(callbackArena, window, windowHnd -> printEvent("closed", windowHnd));
        glfw.SetWindowRefreshCallback(callbackArena, window, windowHnd -> printEvent("refreshed", windowHnd));
        glfw.SetWindowFocusCallback(callbackArena, window, (windowHnd, focused) -> printEvent(focused ? "gained focus" : "lost focus", windowHnd));
        glfw.SetWindowIconifyCallback(callbackArena, window, (windowHnd, iconified) -> printEvent(iconified ? "iconified" : "restored", windowHnd));
        glfw.SetWindowMaximizeCallback(callbackArena, window, (windowHnd, maximized) -> printEvent(maximized ? "maximized" : "restored", windowHnd));
        glfw.SetWindowContentScaleCallback(callbackArena, window, (windowHnd, xscale, yscale) -> printEvent("content scale changed to %f x %f", windowHnd, xscale, yscale));

        glfw.SetFramebufferSizeCallback(callbackArena, window, (windowHnd, width, height) -> printEvent("framebuffer resized to %d x %d", windowHnd, width, height));

        glfw.SetKeyCallback(callbackArena, window, (windowHnd, key, scancode, action, mods) -> {
            printEvent("key %s[%s - %d] was %s", windowHnd, getModState(mods), KEY_CODES.get(key), scancode, switch (action) {
                case GLFW_RELEASE -> "released";
                case GLFW_PRESS -> "pressed";
                case GLFW_REPEAT -> "repeated";
                default -> String.format("Unsupported key action: 0x%X", action);
            });

            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(windowHnd, true);
            }
        });
        glfw.SetCharCallback(callbackArena, window, (windowHnd, codepoint) -> printEvent("char %s", windowHnd, Character.toString((char)codepoint)));
        glfw.SetCharModsCallback(callbackArena, window, (windowHnd, codepoint, mods) -> printEvent(
            "char mods %s%s", windowHnd, getModState(mods), Character.toString((char)codepoint)
        ));
        glfw.SetMouseButtonCallback(callbackArena, window, (windowHnd, button, action, mods) -> printEvent("mouse button %s[0x%X] was %s", windowHnd, getModState(mods), button, switch (action) {
            case GLFW_RELEASE -> "released";
            case GLFW_PRESS -> "pressed";
            default -> String.format("Unsupported mouse button action: 0x%X", action);
        }));
        glfw.SetCursorPosCallback(callbackArena, window, (windowHnd, xpos, ypos) -> printEvent("cursor moved to %f, %f", windowHnd, xpos, ypos));
        glfw.SetCursorEnterCallback(callbackArena, window, (windowHnd, entered) -> printEvent("cursor %s", windowHnd, entered ? "entered" : "left"));
        glfw.SetScrollCallback(callbackArena, window, (windowHnd, xoffset, yoffset) -> printEvent("scroll by %f, %f", windowHnd, xoffset, yoffset));
        glfw.SetDropCallback(callbackArena, window, (windowHnd, count, names) -> {
            printEvent("drop %d file%s", windowHnd, count, count == 1 ? "" : "s");

            for (var i = 0; i < count; i++) {
                System.out.format("\t%d: %s%n", i + 1, memUTF8(memGetAddressAtIndex(names, i)));
            }
        });

        glfw.MakeContextCurrent(window);

        var OPENGL_PROVIDER = Objects.requireNonNull(GL.getFunctionProvider());

        var gl = ffmGenerate(
            MyOpenGL.class,
            ffmConfigBuilder(MethodHandles.lookup())
                .withFunctionProvider(OPENGL_PROVIDER)
                .build()
        );

        glfw.ShowWindow(window);
        glfw.SwapInterval(1);

        gl.ClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        while (!glfw.WindowShouldClose(window)) {
            glfw.WaitEvents();

            gl.Clear(GL_COLOR_BUFFER_BIT);
            glfw.SwapBuffers(window);
        }

        glfw.SetMonitorCallback(null, null);
        glfw.SetJoystickCallback(null, null);

        glfw.SetWindowPosCallback(null, window, null);
        glfw.SetWindowSizeCallback(null, window, null);
        glfw.SetWindowCloseCallback(null, window, null);
        glfw.SetWindowRefreshCallback(null, window, null);
        glfw.SetWindowFocusCallback(null, window, null);
        glfw.SetWindowIconifyCallback(null, window, null);
        glfw.SetWindowMaximizeCallback(null, window, null);
        glfw.SetWindowContentScaleCallback(null, window, null);

        glfw.SetFramebufferSizeCallback(null, window, null);

        glfw.SetKeyCallback(null, window, null);
        glfw.SetCharCallback(null, window, null);
        glfw.SetCharModsCallback(null, window, null);
        glfw.SetMouseButtonCallback(null, window, null);
        glfw.SetCursorPosCallback(null, window, null);
        glfw.SetCursorEnterCallback(null, window, null);
        glfw.SetScrollCallback(null, window, null);
        glfw.SetDropCallback(null, window, null);

        glfw.DestroyCursor(cursor);
        glfw.DestroyWindow(window);
    }

    private static String getModState(int mods) {
        if (mods == 0) {
            return "";
        }

        var modState = new StringBuilder(16);
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
        var formatArgs = new Object[3 + args.length];

        formatArgs[0] = glfwGetTime();
        formatArgs[1] = type;
        formatArgs[2] = object;
        System.arraycopy(args, 0, formatArgs, 3, args.length);

        //noinspection StringConcatenationInFormatCall
        System.out.format("%.3f: %s [0x%X] " + format + "%n", formatArgs);
    }

}