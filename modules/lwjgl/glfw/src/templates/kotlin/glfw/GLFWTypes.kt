/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw

import org.lwjgl.generator.*

val GLFW_BINDING = simpleBinding(
    Module.GLFW,
    libraryExpression = """Configuration.GLFW_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("glfw"))""",
    bundledWithLWJGL = true
)
val GLFW_BINDING_DELEGATE = GLFW_BINDING.delegate("GLFW.getLibrary()")

val GLFWmonitor = "GLFWmonitor".opaque
val GLFWwindow = "GLFWwindow".opaque

val GLFWvidmode = struct(Module.GLFW, "GLFWVidMode", nativeName = "GLFWvidmode", mutable = false) {
    int("width")
    int("height")
    int("redBits")
    int("greenBits")
    int("blueBits")
    int("refreshRate")
}

val GLFWgammaramp = struct(Module.GLFW, "GLFWGammaRamp", nativeName = "GLFWgammaramp") {
    unsigned_short.p("red")
    unsigned_short.p("green")
    unsigned_short.p("blue")
    AutoSize("red", "green", "blue")..unsigned_int("size")
}

val GLFWcursor = "GLFWcursor".opaque

val GLFWimage = struct(Module.GLFW, "GLFWImage", nativeName = "GLFWimage") {
    int("width")
    int("height")
    unsigned_char.p("pixels")
}

val GLFWgamepadstate = struct(Module.GLFW, "GLFWGamepadState", nativeName = "GLFWgamepadstate") {
    unsigned_char("buttons")[15]
    float("axes")[6]
}

// callback functions

val GLFWallocatefun = Module.GLFW.callback {
    void.p(
        "GLFWAllocateCallback",

        size_t("size"),
        opaque_p("user"),

        nativeType = "GLFWallocatefun"
    )
}

val GLFWreallocatefun = Module.GLFW.callback {
    void.p(
        "GLFWReallocateCallback",

        Unsafe..void.p("block"),
        size_t("size"),
        opaque_p("user"),

        nativeType = "GLFWreallocatefun"
    )
}

val GLFWdeallocatefun = Module.GLFW.callback {
    void(
        "GLFWDeallocateCallback",

        Unsafe..void.p("block"),
        opaque_p("user"),

        nativeType = "GLFWdeallocatefun"
    )
}

val GLFWerrorfun = Module.GLFW.callback {
    void(
        "GLFWErrorCallback",

        int("error"),
        NullTerminated..charUTF8.p("description"),

        nativeType = "GLFWerrorfun"
    ) {
        javaImport(
            "java.io.PrintStream",
            "java.util.Map",
            "static org.lwjgl.glfw.GLFW.*"
        )
        additionalCode = """
    /**
     * Converts the specified {@code GLFWErrorCallback} argument to a String.
     *
     * <p>This method may only be used inside a GLFWErrorCallback invocation.</p>
     *
     * @param description pointer to the UTF-8 encoded description string
     *
     * @return the description as a String
     */
    public static String getDescription(long description) {
        return memUTF8(description);
    }

    /**
     * Returns a {@code GLFWErrorCallback} instance that prints the error to the {@link APIUtil#DEBUG_STREAM}.
     *
     * @return the GLFWerrorCallback
     */
    public static GLFWErrorCallback createPrint() {
        return createPrint(APIUtil.DEBUG_STREAM);
    }

    /**
     * Returns a {@code GLFWErrorCallback} instance that prints the error in the specified {@link PrintStream}.
     *
     * @param stream the PrintStream to use
     *
     * @return the GLFWerrorCallback
     */
    public static GLFWErrorCallback createPrint(PrintStream stream) {
        return new GLFWErrorCallback() {
            private Map<Integer, String> ERROR_CODES = APIUtil.apiClassTokens((field, value) -> 0x10000 < value && value < 0x20000, null, GLFW.class);

            @Override
            public void invoke(int error, long description) {
                String msg = getDescription(description);

                StringBuilder sb = new StringBuilder(512);
                sb
                    .append("[LWJGL] ")
                    .append(ERROR_CODES.get(error))
                    .append(" error\n")
                    .append("\tDescription : ")
                    .append(msg)
                    .append("\n")
                    .append("\tStacktrace  :\n");

                StackTraceElement[] stack = Thread.currentThread().getStackTrace();
                for (int i = 4; i < stack.length; i++) {
                    sb.append("\t\t");
                    sb.append(stack[i]);
                    sb.append("\n");
                }

                stream.print(sb);
            }
        };
    }

    /**
     * Returns a {@code GLFWErrorCallback} instance that throws an {@link IllegalStateException} when an error occurs.
     *
     * @return the GLFWerrorCallback
     */
    public static GLFWErrorCallback createThrow() {
        return new GLFWErrorCallback() {
            @Override
            public void invoke(int error, long description) {
                throw new IllegalStateException(String.format("GLFW error [0x%X]: %s", error, getDescription(description)));
            }
        };
    }

    /** See {@link GLFW#glfwSetErrorCallback SetErrorCallback}. */
    public GLFWErrorCallback set() {
        glfwSetErrorCallback(this);
        return this;
    }
"""
    }
}

val GLFWallocator = struct(Module.GLFW, "GLFWAllocator", nativeName = "GLFWallocator") {
    GLFWallocatefun("allocate")
    GLFWreallocatefun("reallocate")
    GLFWdeallocatefun("deallocate")
    nullable..opaque_p("user")
}

val GLFWmonitorfun = Module.GLFW.callback {
    void(
        "GLFWMonitorCallback",

        GLFWmonitor.p("monitor"),
        int("event"),

        nativeType = "GLFWmonitorfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetMonitorCallback SetMonitorCallback}. */
    public GLFWMonitorCallback set() {
        glfwSetMonitorCallback(this);
        return this;
    }
    """
    }
}

val GLFWjoystickfun = Module.GLFW.callback {
    void(
        "GLFWJoystickCallback",

        int("jid"),
        int("event"),

        nativeType = "GLFWjoystickfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetJoystickCallback SetJoystickCallback}. */
    public GLFWJoystickCallback set() {
        glfwSetJoystickCallback(this);
        return this;
    }
    """
    }
}

val GLFWwindowposfun = Module.GLFW.callback {
    void(
        "GLFWWindowPosCallback",

        GLFWwindow.p("window"),
        int("xpos"),
        int("ypos"),

        nativeType = "GLFWwindowposfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetWindowPosCallback SetWindowPosCallback}. */
    public GLFWWindowPosCallback set(long window) {
        glfwSetWindowPosCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWwindowsizefun = Module.GLFW.callback {
    void(
        "GLFWWindowSizeCallback",

        GLFWwindow.p("window"),
        int("width"),
        int("height"),

        nativeType = "GLFWwindowsizefun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback}. */
    public GLFWWindowSizeCallback set(long window) {
        glfwSetWindowSizeCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWwindowclosefun = Module.GLFW.callback {
    void(
        "GLFWWindowCloseCallback",

        GLFWwindow.p("window"),

        nativeType = "GLFWwindowclosefun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetWindowCloseCallback SetWindowCloseCallback}. */
    public GLFWWindowCloseCallback set(long window) {
        glfwSetWindowCloseCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWwindowrefreshfun = Module.GLFW.callback {
    void(
        "GLFWWindowRefreshCallback",

        GLFWwindow.p("window"),

        nativeType = "GLFWwindowrefreshfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetWindowRefreshCallback SetWindowRefreshCallback}. */
    public GLFWWindowRefreshCallback set(long window) {
        glfwSetWindowRefreshCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWwindowfocusfun = Module.GLFW.callback {
    void(
        "GLFWWindowFocusCallback",

        GLFWwindow.p("window"),
        intb("focused"),

        nativeType = "GLFWwindowfocusfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback}. */
    public GLFWWindowFocusCallback set(long window) {
        glfwSetWindowFocusCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWwindowiconifyfun = Module.GLFW.callback {
    void(
        "GLFWWindowIconifyCallback",

        GLFWwindow.p("window"),
        intb("iconified"),

        nativeType = "GLFWwindowiconifyfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback}. */
    public GLFWWindowIconifyCallback set(long window) {
        glfwSetWindowIconifyCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWwindowmaximizefun = Module.GLFW.callback {
    void(
        "GLFWWindowMaximizeCallback",

        GLFWwindow.p("window"),
        intb("maximized"),

        nativeType = "GLFWwindowmaximizefun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetWindowMaximizeCallback SetWindowMaximizeCallback}. */
    public GLFWWindowMaximizeCallback set(long window) {
        glfwSetWindowMaximizeCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWframebuffersizefun = Module.GLFW.callback {
    void(
        "GLFWFramebufferSizeCallback",

        GLFWwindow.p("window"),
        int("width"),
        int("height"),

        nativeType = "GLFWframebuffersizefun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback}. */
    public GLFWFramebufferSizeCallback set(long window) {
        glfwSetFramebufferSizeCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWwindowcontentscalefun = Module.GLFW.callback {
    void(
        "GLFWWindowContentScaleCallback",

        GLFWwindow.p("window"),
        float("xscale"),
        float("yscale"),

        nativeType = "GLFWwindowcontentscalefun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetWindowContentScaleCallback SetWindowContentScaleCallback}. */
    public GLFWWindowContentScaleCallback set(long window) {
        glfwSetWindowContentScaleCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWkeyfun = Module.GLFW.callback {
    void(
        "GLFWKeyCallback",

        GLFWwindow.p("window"),
        int("key"),
        int("scancode"),
        int("action"),
        int("mods"),

        nativeType = "GLFWkeyfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetKeyCallback SetKeyCallback}. */
    public GLFWKeyCallback set(long window) {
        glfwSetKeyCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWcharfun = Module.GLFW.callback {
    void(
        "GLFWCharCallback",

        GLFWwindow.p("window"),
        unsigned_int("codepoint"),

        nativeType = "GLFWcharfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetCharCallback SetCharCallback}. */
    public GLFWCharCallback set(long window) {
        glfwSetCharCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWcharmodsfun = Module.GLFW.callback {
    void(
        "GLFWCharModsCallback",

        GLFWwindow.p("window"),
        unsigned_int("codepoint"),
        int("mods"),

        nativeType = "GLFWcharmodsfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetCharModsCallback SetCharModsCallback}. */
    public GLFWCharModsCallback set(long window) {
        glfwSetCharModsCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWpreeditfun = Module.GLFW.callback {
    void(
        "GLFWPreeditCallback",

        GLFWwindow.p("window"),
        AutoSize("preedit_string")..int("preedit_count"),
        unsigned_int.p("preedit_string"),
        AutoSize("block_sizes")..int("block_count"),
        int.p("block_sizes"),
        int("focused_block"),
        int("caret"),

        nativeType = "GLFWpreeditfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetPreeditCallback SetPreeditCallback}. */
    public GLFWPreeditCallback set(long window) {
        glfwSetPreeditCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWimestatusfun = Module.GLFW.callback {
    void(
        "GLFWIMEStatusCallback",

        GLFWwindow.p("window"),

        nativeType = "GLFWimestatusfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetIMEStatusCallback SetIMEStatusCallback}. */
    public GLFWIMEStatusCallback set(long window) {
        glfwSetIMEStatusCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWpreeditcandidatefun = Module.GLFW.callback {
    void(
        "GLFWPreeditCandidateCallback",

        GLFWwindow.p("window"),
        int("candidates_count"),
        int("selected_index"),
        int("page_start"),
        int("page_size"),

        nativeType = "GLFWpreeditcandidatefun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetPreeditCandidateCallback SetPreeditCandidateCallback}. */
    public GLFWPreeditCandidateCallback set(long window) {
        glfwSetPreeditCandidateCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWmousebuttonfun = Module.GLFW.callback {
    void(
        "GLFWMouseButtonCallback",

        GLFWwindow.p("window"),
        int("button"),
        int("action"),
        int("mods"),

        nativeType = "GLFWmousebuttonfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetMouseButtonCallback SetMouseButtonCallback}. */
    public GLFWMouseButtonCallback set(long window) {
        glfwSetMouseButtonCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWcursorposfun = Module.GLFW.callback {
    void(
        "GLFWCursorPosCallback",

        GLFWwindow.p("window"),
        double("xpos"),
        double("ypos"),

        nativeType = "GLFWcursorposfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback}. */
    public GLFWCursorPosCallback set(long window) {
        glfwSetCursorPosCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWcursorenterfun = Module.GLFW.callback {
    void(
        "GLFWCursorEnterCallback",

        GLFWwindow.p("window"),
        intb("entered"),

        nativeType = "GLFWcursorenterfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback}. */
    public GLFWCursorEnterCallback set(long window) {
        glfwSetCursorEnterCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWscrollfun = Module.GLFW.callback {
    void(
        "GLFWScrollCallback",

        GLFWwindow.p("window"),
        double("xoffset"),
        double("yoffset"),

        nativeType = "GLFWscrollfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /** See {@link GLFW#glfwSetScrollCallback SetScrollCallback}. */
    public GLFWScrollCallback set(long window) {
        glfwSetScrollCallback(window, this);
        return this;
    }
    """
    }
}

val GLFWdropfun = Module.GLFW.callback {
    void(
        "GLFWDropCallback",

        GLFWwindow.p("window"),
        AutoSize("names")..int("count"),
        char.const.p.p("names"),

        nativeType = "GLFWdropfun"
    ) {
        javaImport("static org.lwjgl.glfw.GLFW.*")
        additionalCode = """
    /**
     * Decodes the specified {@link GLFWDropCallback} arguments to a String.
     *
     * <p>This method may only be used inside a {@code GLFWDropCallback} invocation.</p>
     *
     * @param names pointer to the array of UTF-8 encoded path names of the dropped files
     * @param index the index to decode
     *
     * @return the name at the specified index as a String
     */
    public static String getName(long names, int index) {
        return memUTF8(memGetAddress(names + Pointer.POINTER_SIZE * index));
    }

    /** See {@link GLFW#glfwSetDropCallback SetDropCallback}. */
    public GLFWDropCallback set(long window) {
        glfwSetDropCallback(window, this);
        return this;
    }
    """
    }
}

// OpenGL
val GLFWglproc = "GLFWglproc".handle

// Vulkan
val GLFWvkproc = "GLFWvkproc".handle