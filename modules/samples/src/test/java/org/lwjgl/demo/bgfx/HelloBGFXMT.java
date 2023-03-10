/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.bgfx;

import org.lwjgl.bgfx.*;
import org.lwjgl.glfw.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

import static org.lwjgl.bgfx.BGFX.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * bgfx demo: 25-C99
 *
 * <p>This demo is a Java port of
 * <a href="https://github.com/bkaradzic/bgfx/tree/master/examples/25-c99">https://github.com/bkaradzic/bgfx/tree/master/examples/25-c99</a>.</p>
 *
 * <p>Identical to {@link HelloBGFX}, but bgfx runs on a secondary thread. This is useful on macOS, where there are two options:</p>
 * <ul>
 *     <li>Option 1: Run without {@code -XstartOnFirstThread}. Both GLFW and bgfx can run on the main Java thread (like {@code HelloBGFX}), but for GLFW the {@code glfw_async} implementation <b>must</b> be used.</li>
 *     <li>Option 2: Run with {@code -XstartOnFirstThread}. The normal GLFW implementation can be used on the main Java thread, but bgfx must run on a secondary thread. This is the recommended approach.</li>
 * </ul>
 */
public final class HelloBGFXMT implements AutoCloseable {

    private final long window;

    private HelloBGFXMT(int width, int height) {
        GLFWErrorCallback.createThrow().set();
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        glfwDefaultWindowHints();
        glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);
        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
        if (Platform.get() == Platform.MACOSX) {
            glfwWindowHint(GLFW_COCOA_RETINA_FRAMEBUFFER, GLFW_FALSE);
        }

        window = glfwCreateWindow(width, height, "25-C99 - Multithreaded", NULL, NULL);
        if (window == NULL) {
            throw new RuntimeException("Error creating GLFW window");
        }

        glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            if (action == GLFW_RELEASE) {
                return;
            }

            switch (key) {
                case GLFW_KEY_ESCAPE:
                    glfwSetWindowShouldClose(window, true);
                    break;
            }
        });
    }

    @Override
    public void close() {
        glfwFreeCallbacks(window);
        glfwDestroyWindow(window);

        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

    public static void main(String[] args) {
        int width  = 1024;
        int height = 480;
        try (HelloBGFXMT bgfx = new HelloBGFXMT(width, height)) {
            bgfx.runEventLoop(width, height);
        }
    }

    private void runEventLoop(int width, int height) {
        AtomicBoolean hasError = new AtomicBoolean();

        CountDownLatch graphicsLatch = new CountDownLatch(1);
        Thread graphicsThread = new Thread(() -> {
            try (GraphicsRenderer graphicsRenderer = new GraphicsRenderer(window, width, height)) {
                graphicsLatch.countDown();

                while (!glfwWindowShouldClose(window)) {
                    graphicsRenderer.render(width, height);
                    bgfx_frame(false);
                }
            } catch (Throwable t) {
                t.printStackTrace();
                hasError.set(true);
                graphicsLatch.countDown();
            }
        });
        graphicsThread.start();

        while (true) {
            try {
                glfwPollEvents();
                if (graphicsLatch.await(16, TimeUnit.MILLISECONDS)) {
                    break;
                }
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }

        glfwShowWindow(window);
        while (!glfwWindowShouldClose(window) && !hasError.get()) {
            glfwWaitEvents();
        }

        try {
            graphicsThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class GraphicsRenderer implements AutoCloseable {

        private final ByteBuffer logo;

        GraphicsRenderer(long window, int width, int height) {
            try (MemoryStack stack = stackPush()) {
                BGFXInit init = BGFXInit.malloc(stack);
                bgfx_init_ctor(init);
                init
                    //.type(BGFX_RENDERER_TYPE_OPENGL)
                    .resolution(it -> it
                        .width(width)
                        .height(height)
                        .reset(BGFX_RESET_VSYNC));

                switch (Platform.get()) {
                    case LINUX:
                        init.platformData()
                            .ndt(GLFWNativeX11.glfwGetX11Display())
                            .nwh(GLFWNativeX11.glfwGetX11Window(window));
                        break;
                    case MACOSX:
                        init.platformData()
                            .nwh(GLFWNativeCocoa.glfwGetCocoaWindow(window));
                        break;
                    case WINDOWS:
                        init.platformData()
                            .nwh(GLFWNativeWin32.glfwGetWin32Window(window));
                        break;
                }

                if (!bgfx_init(init)) {
                    throw new RuntimeException("Error initializing bgfx renderer");
                }
            }

            System.out.println("bgfx renderer: " + bgfx_get_renderer_name(bgfx_get_renderer_type()));

            // Enable debug text.
            bgfx_set_debug(BGFX_DEBUG_TEXT);

            bgfx_set_view_clear(0, BGFX_CLEAR_COLOR | BGFX_CLEAR_DEPTH, 0x303030ff, 1.0f, 0);

            logo = Logo.createLogo();
        }

        @Override
        public void close() {
            bgfx_shutdown();
        }

        void render(int framebufferW, int framebufferH) {
            // Set view 0 default viewport.
            bgfx_set_view_rect(0, 0, 0, framebufferW, framebufferH);

            // This dummy draw call is here to make sure that view 0 is cleared
            // if no other draw calls are submitted to view 0.
            bgfx_touch(0);

            // Use debug font to print information about this example.
            bgfx_dbg_text_clear(0, false);
            bgfx_dbg_text_image(Math.max(framebufferW / 2 / 8, 20) - 20,
                Math.max(framebufferH / 2 / 16, 6) - 6,
                40,
                12,
                logo,
                160
            );
            bgfx_dbg_text_printf(0, 1, 0x1f, "bgfx/examples/25-c99");
            bgfx_dbg_text_printf(0, 2, 0x3f, "Description: Initialization and debug text with C99 API.");

            bgfx_dbg_text_printf(0, 3, 0x0f, "Color can be changed with ANSI \u001b[9;me\u001b[10;ms\u001b[11;mc\u001b[12;ma\u001b[13;mp\u001b[14;me\u001b[0m code too.");

            bgfx_dbg_text_printf(80, 4, 0x0f, "\u001b[;0m    \u001b[;1m    \u001b[; 2m    \u001b[; 3m    \u001b[; 4m    \u001b[; 5m    \u001b[; 6m    \u001b[; 7m    \u001b[0m");
            bgfx_dbg_text_printf(80, 5, 0x0f, "\u001b[;8m    \u001b[;9m    \u001b[;10m    \u001b[;11m    \u001b[;12m    \u001b[;13m    \u001b[;14m    \u001b[;15m    \u001b[0m");
        }
    }

}