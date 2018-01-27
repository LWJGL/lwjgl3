/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.bgfx;

import org.lwjgl.bgfx.*;
import org.lwjgl.glfw.*;
import org.lwjgl.system.*;

import java.nio.*;

import static org.lwjgl.bgfx.BGFX.*;
import static org.lwjgl.bgfx.BGFXPlatform.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * bgfx demo: 25-C99
 *
 * <p>This demo is a Java port of
 * <a href="https://github.com/bkaradzic/bgfx/tree/master/examples/25-c99">https://github.com/bkaradzic/bgfx/tree/master/examples/25-c99</a>.</p>
 */
public final class HelloBGFX {

    private HelloBGFX() {}

    @SuppressWarnings("UnnecessaryLocalVariable")
    public static void main(String[] args) {
        int width  = 1280;
        int height = 720;

        if (!glfwInit()) {
            throw new RuntimeException("Error initializing GLFW");
        }

        // the client (renderer) API is managed by bgfx
        glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);

        long window = glfwCreateWindow(width, height, "25-C99", 0, 0);
        if (window == NULL) {
            throw new RuntimeException("Error creating GLFW window");
        }

        glfwSetKeyCallback(window, (windowHnd, key, scancode, action, mods) -> {
            if (action != GLFW_RELEASE) {
                return;
            }

            switch (key) {
                case GLFW_KEY_ESCAPE:
                    glfwSetWindowShouldClose(windowHnd, true);
                    break;
            }
        });

        try (MemoryStack stack = stackPush()) {
            BGFXPlatformData platformData = BGFXPlatformData.callocStack(stack);

            switch (Platform.get()) {
                case LINUX:
                    platformData.ndt(GLFWNativeX11.glfwGetX11Display());
                    platformData.nwh(GLFWNativeX11.glfwGetX11Window(window));
                    break;
                case MACOSX:
                    platformData.nwh(GLFWNativeCocoa.glfwGetCocoaWindow(window));
                    break;
                case WINDOWS:
                    platformData.nwh(GLFWNativeWin32.glfwGetWin32Window(window));
                    break;
            }

            bgfx_set_platform_data(platformData);
        }

        if (!bgfx_init(BGFX_RENDERER_TYPE_COUNT, BGFX_PCI_ID_NONE, 0, null, null)) {
            throw new RuntimeException("Error initializing bgfx renderer");
        }

        System.out.println("bgfx renderer: " + bgfx_get_renderer_name(bgfx_get_renderer_type()));

        bgfx_reset(width, height, BGFX_RESET_VSYNC);

        // Enable debug text.
        bgfx_set_debug(BGFX_DEBUG_TEXT);

        bgfx_set_view_clear(0, BGFX_CLEAR_COLOR | BGFX_CLEAR_DEPTH, 0x303030ff, 1.0f, 0);

        ByteBuffer logo = Logo.createLogo();

        while (!glfwWindowShouldClose(window)) {
            glfwPollEvents();

            // Set view 0 default viewport.
            bgfx_set_view_rect(0, 0, 0, width, height);

            // This dummy draw call is here to make sure that view 0 is cleared
            // if no other draw calls are submitted to view 0.
            bgfx_touch((byte)0);

            // Use debug font to print information about this example.
            bgfx_dbg_text_clear(0, false);
            bgfx_dbg_text_image(Math.max(width / 2 / 8, 20) - 20,
                Math.max(height / 2 / 16, 6) - 6,
                40,
                12,
                logo,
                160
            );
            bgfx_dbg_text_printf(0, 1, 0x4f, "bgfx/examples/25-c99");
            bgfx_dbg_text_printf(0, 2, 0x6f, "Description: Initialization and debug text with C99 API.");

            // Advance to next frame. Rendering thread will be kicked to
            // process submitted rendering primitives.
            bgfx_frame(false);
        }

        bgfx_shutdown();

        glfwDestroyWindow(window);
        glfwTerminate();
    }

}