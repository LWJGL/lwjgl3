/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.nanovg;

import org.lwjgl.bgfx.*;
import org.lwjgl.glfw.*;
import org.lwjgl.system.*;

import java.nio.*;
import java.util.*;

import static java.lang.Math.*;
import static org.lwjgl.bgfx.BGFX.*;
import static org.lwjgl.demo.nanovg.NanoVGUtils.*;
import static org.lwjgl.glfw.Callbacks.*;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.nanovg.NanoVG.*;
import static org.lwjgl.nanovg.NanoVGBGFX.*;
import static org.lwjgl.stb.STBImageWrite.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * bgfx demo.
 *
 * <p>This is a Java port of
 * <a href="https://github.com/memononen/nanovg/blob/master/example/example_gl2.c">https://github.com/memononen/nanovg/blob/master/example/example_gl2.c</a>.</p>
 */
public final class ExampleBGFX extends Demo {

    private ExampleBGFX() {
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

        glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API);
        glfwWindowHint(GLFW_SCALE_TO_MONITOR, GLFW_TRUE);

        long window = glfwCreateWindow(1000, 600, "NanoVG (bgfx)", NULL, NULL);
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

        boolean DEMO_MSAA = args.length != 0 && "msaa".equalsIgnoreCase(args[0]);

        glfwSetFramebufferSizeCallback(window, (handle, w, h) -> {
            framebufferWidth = w;
            framebufferHeight = h;
            bgfx_reset(
                w, h,
                DEMO_MSAA ? BGFX_RESET_MSAA_X8 : BGFX_RESET_NONE,
                BGFX_TEXTURE_FORMAT_UNKNOWN
            );
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

            BGFXInit init = BGFXInit.malloc(stack);
            bgfx_init_ctor(init);
            init
                .callback(BGFXCallbackInterface.calloc()
                    .vtbl(BGFXCallbackVtbl.calloc()
                        .fatal((_this, _filePath, _line, _code, _str) -> { throw new UnsupportedOperationException(); })
                        .trace_vargs((_this, _filePath, _line, _format, _argList) -> { throw new UnsupportedOperationException(); })
                        .profiler_begin((_this, _name, _abgr, _filePath, _line) -> { throw new UnsupportedOperationException(); })
                        .profiler_begin_literal((_this, _name, _abgr, _filePath, _line) -> { throw new UnsupportedOperationException(); })
                        .profiler_end(_this -> { throw new UnsupportedOperationException(); })
                        .cache_read_size((_this, _id) -> { throw new UnsupportedOperationException(); })
                        .cache_read((_this, _id, _data, _size) -> { throw new UnsupportedOperationException(); })
                        .cache_write((_this, _id, _data, _size) -> { throw new UnsupportedOperationException(); })
                        .screen_shot((_this, _filePath, _width, _height, _pitch, _data, _size, _yflip) -> {
                            ByteBuffer image = memByteBuffer(_data, _size);

                            // convert BGRA to RGBA
                            for (int y = 0; y < _height; y++) {
                                int index = y * _pitch;
                                for (int x = 0; x < _width; x++) {
                                    byte b = image.get(index);
                                    image.put(index, image.get(index + 2));
                                    image.put(index + 2, b);
                                    index += 4;
                                }
                            }

                            if (premult) {
                                unpremultiplyAlpha(image, _width, _height, _pitch);
                            } else {
                                setAlpha(image, _width, _height, _pitch, (byte)255);
                            }
                            if (!_yflip) {
                                flipHorizontal(image, _width, _height, _pitch);
                            }

                            nstbi_write_png(_filePath, _width, _height, 4, _data, _pitch);
                        })
                        .capture_begin((_this, _width, _height, _pitch, _format, _yflip) -> { throw new UnsupportedOperationException(); })
                        .capture_frame((_this, _data, _size) -> { throw new UnsupportedOperationException(); })
                        .capture_end(_this -> { throw new UnsupportedOperationException(); })
                    )
                )
                //.type(BGFX_RENDERER_TYPE_DIRECT3D12)
                .resolution(it -> it
                    .width(framebufferWidth)
                    .height(framebufferHeight)
                    .reset(DEMO_MSAA ? BGFX_RESET_MSAA_X8 : BGFX_RESET_NONE));

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
            System.out.println("bgfx renderer: " + bgfx_get_renderer_name(bgfx_get_renderer_type()));
        }
        bgfx_set_view_mode(0, BGFX_VIEW_MODE_SEQUENTIAL);

        long vg = nvgCreate(!DEMO_MSAA, 0, NULL);
        if (vg == NULL) {
            throw new RuntimeException("Could not init nanovg.");
        }

        DemoData data = new DemoData();
        if (loadDemoData(vg, data) == -1) {
            throw new RuntimeException();
        }

        PerfGraph fps = new PerfGraph();
        initGraph(fps, GRAPH_RENDER_FPS, "Frame Time");

        glfwSetTime(0);
        double prevt = glfwGetTime();

        while (!glfwWindowShouldClose(window)) {
            double t  = glfwGetTime();
            double dt = t - prevt;
            prevt = t;
            updateGraph(fps, (float)dt);

            bgfx_set_view_clear(0,
                BGFX_CLEAR_COLOR | BGFX_CLEAR_DEPTH | BGFX_CLEAR_STENCIL,
                premult
                    ? RGBA(0.0f, 0.0f, 0.0f, 0.0f)
                    : RGBA(0.3f, 0.3f, 0.32f, 1.0f),
                1.0f,
                0
            );

            // Effective dimensions on hi-dpi devices.
            int width  = (int)(framebufferWidth / contentScaleX);
            int height = (int)(framebufferHeight / contentScaleY);

            nvgBeginFrame(vg, width, height, max(contentScaleX, contentScaleY));

            renderDemo(vg, (float)cursorX, (float)cursorY, width, height, (float)t, blowup, data);
            renderGraph(vg, 5, 5, fps);

            nvgEndFrame(vg);

            if (screenshot) {
                screenshot = false;
                bgfx_request_screen_shot(BGFX_INVALID_HANDLE, "nanovg_bgfx.png");
            }

            bgfx_frame(false);

            glfwPollEvents();
        }

        freeDemoData(vg, data);

        nvgDelete(vg);

        bgfx_shutdown();

        glfwFreeCallbacks(window);
        glfwTerminate();
        Objects.requireNonNull(glfwSetErrorCallback(null)).free();
    }

    private static int RGBA(float r, float g, float b, float a) {
        return
            round(r * 255.0f) << 24 |
            round(g * 255.0f) << 16 |
            round(b * 255.0f) << 8 |
            round(a * 255.0f);
    }

}