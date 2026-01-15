/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.glfw;

import org.jspecify.annotations.*;
import org.lwjgl.system.ffm.*;

import java.lang.foreign.*;

import static org.lwjgl.system.ffm.FFM.*;

//@FFMCritical
@FFMPrefix("glfw")
@FFMCharset(FFMCharset.Type.UTF8)
@NullMarked
public interface MyGLFW {

    @FFMDefinition("void (* GLFWerrorfun)(int error_code, const char* description);")
    @FunctionalInterface
    interface GLFWerrorfun {
        UpcallBinder<GLFWerrorfun> $ = ffmUpcall(GLFWerrorfun.class);
        void invoke(int error_code, String description);
    }

    @FFMDefinition("void (* GLFWwindowposfun)(GLFWwindow * window, int xpos, int ypos)")
    @FunctionalInterface
    interface GLFWwindowposfun {
        UpcallBinder<GLFWwindowposfun> $ = ffmUpcall(GLFWwindowposfun.class);
        void invoke(@FFMPointer long window, int xpos, int ypos);
    }

    @FFMDefinition("void (* GLFWwindowsizefun)(GLFWwindow* window, int width, int height)")
    @FunctionalInterface
    interface GLFWwindowsizefun {
        UpcallBinder<GLFWwindowsizefun> $ = ffmUpcall(GLFWwindowsizefun.class);
        void invoke(@FFMPointer long window, int width, int height);
    }

    @FFMDefinition("void (* GLFWwindowclosefun)(GLFWwindow* window)")
    @FunctionalInterface
    interface GLFWwindowclosefun {
        UpcallBinder<GLFWwindowclosefun> $ = ffmUpcall(GLFWwindowclosefun.class);
        void invoke(@FFMPointer long window);
    }

    @FFMDefinition("void (* GLFWwindowrefreshfun)(GLFWwindow* window)")
    @FunctionalInterface
    interface GLFWwindowrefreshfun {
        UpcallBinder<GLFWwindowrefreshfun> $ = ffmUpcall(GLFWwindowrefreshfun.class);
        void invoke(@FFMPointer long window);
    }

    @FFMDefinition("void (* GLFWwindowfocusfun)(GLFWwindow* window, int focused)")
    @FunctionalInterface
    interface GLFWwindowfocusfun {
        UpcallBinder<GLFWwindowfocusfun> $ = ffmUpcall(GLFWwindowfocusfun.class);
        void invoke(@FFMPointer long window, @FFMBooleanInt boolean focused);
    }

    @FFMDefinition("void (* GLFWwindowiconifyfun)(GLFWwindow* window, int iconified)")
    @FunctionalInterface
    interface GLFWwindowiconifyfun {
        UpcallBinder<GLFWwindowiconifyfun> $ = ffmUpcall(GLFWwindowiconifyfun.class);
        void invoke(@FFMPointer long window, @FFMBooleanInt boolean iconified);
    }

    @FFMDefinition("void (* GLFWwindowmaximizefun)(GLFWwindow* window, int maximized)")
    @FunctionalInterface
    interface GLFWwindowmaximizefun {
        UpcallBinder<GLFWwindowmaximizefun> $ = ffmUpcall(GLFWwindowmaximizefun.class);
        void invoke(@FFMPointer long window, @FFMBooleanInt boolean maximized);
    }

    @FFMDefinition("void (* GLFWframebuffersizefun)(GLFWwindow* window, int width, int height)")
    @FunctionalInterface
    interface GLFWframebuffersizefun {
        UpcallBinder<GLFWframebuffersizefun> $ = ffmUpcall(GLFWframebuffersizefun.class);
        void invoke(@FFMPointer long window, int width, int height);
    }

    @FFMDefinition("void (* GLFWwindowcontentscalefun)(GLFWwindow* window, float xscale, float yscale)")
    @FunctionalInterface
    interface GLFWwindowcontentscalefun {
        UpcallBinder<GLFWwindowcontentscalefun> $ = ffmUpcall(GLFWwindowcontentscalefun.class);
        void invoke(@FFMPointer long window, float xscale, float yscale);
    }

    @FFMDefinition("void (* GLFWmousebuttonfun)(GLFWwindow* window, int button, int action, int mods)")
    @FunctionalInterface
    interface GLFWmousebuttonfun {
        UpcallBinder<GLFWmousebuttonfun> $ = ffmUpcall(GLFWmousebuttonfun.class);
        void invoke(@FFMPointer long window, int button, int action, int mods);
    }

    @FFMDefinition("void (* GLFWcursorposfun)(GLFWwindow* window, double xpos, double ypos)")
    @FunctionalInterface
    interface GLFWcursorposfun {
        UpcallBinder<GLFWcursorposfun> $ = ffmUpcall(GLFWcursorposfun.class);
        void invoke(@FFMPointer long window, double xpos, double ypos);
    }

    @FFMDefinition("void (* GLFWcursorenterfun)(GLFWwindow* window, int entered)")
    @FunctionalInterface
    interface GLFWcursorenterfun {
        UpcallBinder<GLFWcursorenterfun> $ = ffmUpcall(GLFWcursorenterfun.class);
        void invoke(@FFMPointer long window, @FFMBooleanInt boolean entered);
    }

    @FFMDefinition("void (* GLFWscrollfun)(GLFWwindow* window, double xoffset, double yoffset)")
    @FunctionalInterface
    interface GLFWscrollfun {
        UpcallBinder<GLFWscrollfun> $ = ffmUpcall(GLFWscrollfun.class);
        void invoke(@FFMPointer long window, double xoffset, double yoffset);
    }

    @FFMDefinition("void (* GLFWkeyfun)(GLFWwindow* window, int key, int scancode, int action, int mods)")
    @FunctionalInterface
    interface GLFWkeyfun {
        UpcallBinder<GLFWkeyfun> $ = ffmUpcall(GLFWkeyfun.class);
        void invoke(@FFMPointer long window, int key, int scancode, int action, int mods);
    }

    @FFMDefinition("void (* GLFWcharfun)(GLFWwindow* window, unsigned int codepoint)")
    @FunctionalInterface
    interface GLFWcharfun {
        UpcallBinder<GLFWcharfun> $ = ffmUpcall(GLFWcharfun.class);
        void invoke(@FFMPointer long window, int codepoint);
    }

    @FFMDefinition("void (* GLFWcharmodsfun)(GLFWwindow* window, unsigned int codepoint, int mods)")
    @FunctionalInterface
    interface GLFWcharmodsfun {
        UpcallBinder<GLFWcharmodsfun> $ = ffmUpcall(GLFWcharmodsfun.class);
        void invoke(@FFMPointer long window, int codepoint, int mods);
    }

    @FFMDefinition("void (* GLFWdropfun)(GLFWwindow* window, int path_count, const char* paths[])")
    @FunctionalInterface
    interface GLFWdropfun {
        UpcallBinder<GLFWdropfun> $ = ffmUpcall(GLFWdropfun.class);
        void invoke(@FFMPointer long window, int path_count, MemorySegment paths);
    }

    @FFMDefinition("void (* GLFWmonitorfun)(GLFWmonitor* monitor, int event)")
    @FunctionalInterface
    interface GLFWmonitorfun {
        UpcallBinder<GLFWmonitorfun> $ = ffmUpcall(GLFWmonitorfun.class);
        void invoke(@FFMPointer long monitor, int event);
    }

    @FFMDefinition("void (* GLFWjoystickfun)(int jid, int event)")
    @FunctionalInterface
    interface GLFWjoystickfun {
        UpcallBinder<GLFWjoystickfun> $ = ffmUpcall(GLFWjoystickfun.class);
        void invoke(int jid, int event);
    }

    @FFMDefinition("""
        struct GLFWvidmode {
            int width;
            int height;
            int redBits;
            int greenBits;
            int blueBits;
            int refreshRate;
        }""")
    interface GLFWvidmode {
        StructBinder<GLFWvidmode> GLFWvidmode = ffmStruct(GLFWvidmode.class)
            .m("width", cint)
            .m("height", cint)
            .m("redBits", cint)
            .m("greenBits", cint)
            .m("blueBits", cint)
            .m("refreshRate", cint)
            .build();

        int width();
        int height();
        int redBits();
        int greenBits();
        int blueBits();
        int refreshRate();
    }

    @FFMDefinition("""
        struct GLFWgammaramp {
            unsigned short* red;
            unsigned short* green;
            unsigned short* blue;
            unsigned int size;
        }""")
    interface GLFWgammaramp {
        StructBinder<GLFWgammaramp> GLFWgammaramp = ffmStruct(GLFWgammaramp.class)
            .m("red", unsigned_short.p())
            .m("green", unsigned_short.p())
            .m("blue", unsigned_short.p())
            .m("size", cint)
            .build();

        @FFMSize("size") MemorySegment red();
        @FFMSize("size") MemorySegment green();
        @FFMSize("size") MemorySegment blue();
        int size();

        GLFWgammaramp red(MemorySegment red);
        GLFWgammaramp green(MemorySegment green);
        GLFWgammaramp blue(MemorySegment blue);
        GLFWgammaramp size(int size);
    }

    @FFMDefinition("int glfwInit()")
    @FFMBooleanInt(binary = true)
    boolean Init();

    @FFMDefinition("GLFWerrorfun glfwSetErrorCallback(GLFWerrorfun callback)")
    @FFMPointer long SetErrorCallback(@FFMNullable @FFMPointer long callback);

    @FFMDefinition("GLFWerrorfun glfwSetErrorCallback(GLFWerrorfun callback)")
    @FFMPointer long SetErrorCallback(@Nullable Arena arena, @Nullable GLFWerrorfun callback);

    @FFMDefinition("GLFWmonitor** glfwGetMonitors(int * count)")
    MemorySegment GetMonitors(MemorySegment count); // TODO: auto-size result via stack-allocated count

    @FFMDefinition("GLFWmonitor * glfwGetPrimaryMonitor()")
    @FFMPointer long GetPrimaryMonitor();

    @FFMDefinition("void glfwGetMonitorPos(GLFWmonitor * monitor, int * xpos, int * ypos)")
    void GetMonitorPos(@FFMPointer long monitor, MemorySegment xpos, MemorySegment ypos);

    @FFMDefinition("void glfwGetMonitorPhysicalSize(GLFWmonitor* monitor, int* widthMM, int* heightMM)")
    void GetMonitorPhysicalSize(@FFMPointer long monitor, @Nullable MemorySegment widthMM, @Nullable MemorySegment heightMM);

    @FFMDefinition("void glfwGetMonitorContentScale(GLFWmonitor* monitor, float* xscale, float* yscale)")
    void GetMonitorContentScale(@FFMPointer long monitor, @Nullable MemorySegment xscale, @Nullable MemorySegment yscale);

    @FFMDefinition("char const * glfwGetMonitorName(GLFWmonitor * monitor)")
    String GetMonitorName(@FFMPointer long monitor);

    @FFMDefinition("GLFWmonitorfun glfwSetMonitorCallback(GLFWmonitorfun callback)")
    @FFMPointer long SetMonitorCallback(@Nullable Arena arena, @Nullable GLFWmonitorfun cbfun);

    @FFMDefinition("GLFWvidmode const * glfwGetVideoMode(GLFWmonitor * monitor)")
    GLFWvidmode GetVideoMode(@FFMPointer long monitor);

    @FFMDefinition("void glfwSetGamma(GLFWmonitor * monitor, float gamma)")
    void SetGamma(@FFMPointer long monitor, float gamma);

    @FFMDefinition("GLFWgammaramp const * glfwGetGammaRamp(GLFWmonitor * monitor)")
    GLFWgammaramp GetGammaRamp(@FFMPointer long monitor);

    @FFMDefinition("void glfwSetGammaRamp(GLFWmonitor * monitor, GLFWgammaramp const * ramp)")
    void SetGammaRamp(@FFMPointer long monitor, GLFWgammaramp ramp);

    @FFMDefinition("void glfwDefaultWindowHints()")
    void DefaultWindowHints();

    @FFMDefinition("void glfwWindowHint(int hint, int value)")
    void WindowHint(int hint, int value);

    @FFMDefinition("GLFWwindow * glfwCreateWindow(int width, int height, char const * title, GLFWmonitor * monitor, GLFWwindow * share)")
    @FFMPointer long CreateWindow(int width, int height, String title, @FFMNullable @FFMPointer long monitor, @FFMNullable @FFMPointer long share);

    @FFMDefinition("void glfwDestroyWindow(GLFWwindow * window)")
    void DestroyWindow(@FFMPointer long window);

    @FFMDefinition("void glfwGetWindowPos(GLFWwindow* window, int* xpos, int* ypos)")
    void GetWindowPos(@FFMPointer long window, MemorySegment xpos, MemorySegment ypos);

    @FFMDefinition("void glfwSetWindowPos(GLFWwindow * window, int xpos, int ypos)")
    void SetWindowPos(@FFMPointer long window, int xpos, int ypos);

    @FFMDefinition("void glfwGetWindowSize(GLFWwindow* window, int* width, int* height)")
    void GetWindowSize(@FFMPointer long window, MemorySegment width, MemorySegment height);

    @FFMDefinition("void glfwSetWindowSizeLimits(GLFWwindow * window, int minwidth, int minheight, int maxwidth, int maxheight)")
    void SetWindowSizeLimits(@FFMPointer long window, int minwidth, int minheight, int maxwidth, int maxheight);

    @FFMDefinition("void glfwGetWindowFrameSize(GLFWwindow* window, int* left, int* top, int* right, int* bottom)")
    void GetWindowFrameSize(@FFMPointer long window, MemorySegment left, MemorySegment top, MemorySegment right, MemorySegment bottom);

    @FFMDefinition("void glfwGetWindowContentScale(GLFWwindow* window, float* xscale, float* yscale)")
    void GetWindowContentScale(@FFMPointer long window, MemorySegment xscale, MemorySegment yscale);

    @FFMDefinition("void glfwGetFramebufferSize(GLFWwindow* window, int* width, int* height)")
    void GetFramebufferSize(@FFMPointer long window, MemorySegment width, MemorySegment height);

    @FFMDefinition("void glfwSwapInterval(int interval)")
    void SwapInterval(int interval);

    @FFMDefinition("void glfwShowWindow(GLFWwindow * window)")
    void ShowWindow(@FFMPointer long window);

    @FFMDefinition("int glfwWindowShouldClose(GLFWwindow * window)")
    @FFMBooleanInt(binary = true)
    boolean WindowShouldClose(@FFMPointer long window);

    @FFMDefinition("GLFWwindowposfun glfwSetWindowPosCallback(GLFWwindow * window, GLFWwindowposfun callback)")
    @FFMPointer long SetWindowPosCallback(@FFMPointer long window, @FFMNullable @FFMPointer long callback);

    @FFMDefinition("GLFWwindowposfun glfwSetWindowPosCallback(GLFWwindow * window, GLFWwindowposfun callback)")
    @FFMPointer long SetWindowPosCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWwindowposfun callback);

    @FFMDefinition("GLFWwindowsizefun glfwSetWindowSizeCallback(GLFWwindow* window, GLFWwindowsizefun callback)")
    @FFMPointer long SetWindowSizeCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWwindowsizefun callback);

    @FFMDefinition("GLFWwindowclosefun glfwSetWindowCloseCallback(GLFWwindow* window, GLFWwindowclosefun callback)")
    @FFMPointer long SetWindowCloseCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWwindowclosefun callback);

    @FFMDefinition("GLFWwindowrefreshfun glfwSetWindowRefreshCallback(GLFWwindow* window, GLFWwindowrefreshfun callback)")
    @FFMPointer long SetWindowRefreshCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWwindowrefreshfun callback);

    @FFMDefinition("GLFWwindowfocusfun glfwSetWindowFocusCallback(GLFWwindow* window, GLFWwindowfocusfun callback)")
    @FFMPointer long SetWindowFocusCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWwindowfocusfun callback);

    @FFMDefinition("GLFWwindowiconifyfun glfwSetWindowIconifyCallback(GLFWwindow* window, GLFWwindowiconifyfun callback)")
    @FFMPointer long SetWindowIconifyCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWwindowiconifyfun callback);

    @FFMDefinition("GLFWwindowmaximizefun glfwSetWindowMaximizeCallback(GLFWwindow* window, GLFWwindowmaximizefun callback)")
    @FFMPointer long SetWindowMaximizeCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWwindowmaximizefun callback);

    @FFMDefinition("GLFWframebuffersizefun glfwSetFramebufferSizeCallback(GLFWwindow* window, GLFWframebuffersizefun callback)")
    @FFMPointer long SetFramebufferSizeCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWframebuffersizefun callback);

    @FFMDefinition("GLFWwindowcontentscalefun glfwSetWindowContentScaleCallback(GLFWwindow* window, GLFWwindowcontentscalefun callback)")
    @FFMPointer long SetWindowContentScaleCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWwindowcontentscalefun callback);

    @FFMDefinition("GLFWkeyfun glfwSetKeyCallback(GLFWwindow* window, GLFWkeyfun callback)")
    @FFMPointer long SetKeyCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWkeyfun callback);

    @FFMDefinition("GLFWcharfun glfwSetCharCallback(GLFWwindow* window, GLFWcharfun callback)")
    @FFMPointer long SetCharCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWcharfun callback);

    @FFMDefinition("GLFWcharmodsfun glfwSetCharModsCallback(GLFWwindow* window, GLFWcharmodsfun callback)")
    @FFMPointer long SetCharModsCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWcharmodsfun callback);

    @FFMDefinition("GLFWmousebuttonfun glfwSetMouseButtonCallback(GLFWwindow* window, GLFWmousebuttonfun callback)")
    @FFMPointer long SetMouseButtonCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWmousebuttonfun callback);

    @FFMDefinition("GLFWcursorposfun glfwSetCursorPosCallback(GLFWwindow* window, GLFWcursorposfun callback)")
    @FFMPointer long SetCursorPosCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWcursorposfun callback);

    @FFMDefinition("GLFWcursorenterfun glfwSetCursorEnterCallback(GLFWwindow* window, GLFWcursorenterfun callback)")
    @FFMPointer long SetCursorEnterCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWcursorenterfun callback);

    @FFMDefinition("GLFWscrollfun glfwSetScrollCallback(GLFWwindow* window, GLFWscrollfun callback)")
    @FFMPointer long SetScrollCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWscrollfun callback);

    @FFMDefinition("GLFWdropfun glfwSetDropCallback(GLFWwindow* window, GLFWdropfun callback)")
    @FFMPointer long SetDropCallback(@Nullable Arena arena, @FFMPointer long window, @Nullable GLFWdropfun callback);

    @FFMDefinition("void glfwPollEvents()")
    void PollEvents();

    @FFMDefinition("void glfwWaitEvents()")
    void WaitEvents();

    @FFMDefinition("void glfwDestroyCursor(GLFWcursor* cursor)")
    void DestroyCursor(@FFMPointer long cursor);

    @FFMDefinition("void glfwSetCursor(GLFWwindow* window, GLFWcursor* cursor)")
    void SetCursor(@FFMPointer long window, @FFMPointer long cursor);

    @FFMDefinition("GLFWjoystickfun glfwSetJoystickCallback(GLFWjoystickfun callback)")
    @FFMPointer long SetJoystickCallback(@Nullable Arena arena, @Nullable GLFWjoystickfun cbfun);

    @FFMDefinition("void glfwMakeContextCurrent(GLFWwindow * window)")
    void MakeContextCurrent(@FFMPointer long window);

    @FFMDefinition("void glfwSwapBuffers(GLFWwindow * window)")
    void SwapBuffers(@FFMPointer long window);

    @FFMDefinition("void glfwSwapBuffers(GLFWwindow * window)")
    @FFMFunctionAddress
    void SwapBuffers(MemorySegment address, @FFMPointer long window); // tests @FFMFunctionAddress

    @FFMDefinition("void glfwTerminate(void)")
    void Terminate();

}