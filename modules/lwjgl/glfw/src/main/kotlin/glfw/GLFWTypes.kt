/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.GLFW,
        """
        Contains bindings to the ${url("http://www.glfw.org/", "GLFW")} library.

        GLFW comes with extensive documentation, which you can read online ${url("http://www.glfw.org/docs/latest/", "here")}. The
        ${url("http://www.glfw.org/faq.html", "Frequently Asked Questions")} are also useful.

        On macOS the JVM must be started with the {@code -XstartOnFirstThread} argument for GLFW to work. This is necessary because most GLFW functions must be
        called on the main thread and the Cocoa API on macOS requires that thread to be the first thread in the process. For this reason, on-screen GLFW
        windows and the GLFW event loop are incompatible with other window toolkits (such as AWT/Swing or JavaFX) on macOS. Off-screen GLFW windows can be used
        with other window toolkits, but only if the window toolkit is initialized before GLFW.
        """
    )
}

val GLFW_BINDING = simpleBinding(
    Module.GLFW,
    libraryExpression = """Configuration.GLFW_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("glfw"))""",
    bundledWithLWJGL = true
)
val GLFW_BINDING_DELEGATE = GLFW_BINDING.delegate("GLFW.getLibrary()")

val GLFWmonitor = "GLFWmonitor".opaque
val GLFWwindow = "GLFWwindow".opaque

val GLFWvidmode = struct(Module.GLFW, "GLFWVidMode", nativeName = "GLFWvidmode", mutable = false) {
    documentation = "Describes a single video mode."

    int.member("width", "the width, in screen coordinates, of the video mode")
    int.member("height", "the height, in screen coordinates, of the video mode")
    int.member("redBits", "the bit depth of the red channel of the video mode")
    int.member("greenBits", "the bit depth of the green channel of the video mode")
    int.member("blueBits", "the bit depth of the blue channel of the video mode")
    int.member("refreshRate", "the refresh rate, in Hz, of the video mode")
}

val GLFWgammaramp = struct(Module.GLFW, "GLFWGammaRamp", nativeName = "GLFWgammaramp") {
    documentation = "Describes the gamma ramp for a monitor."
    since = "version 3.0"

    unsigned_short.p.member("red", "an array of values describing the response of the red channel")
    unsigned_short.p.member("green", "an array of values describing the response of the green channel")
    unsigned_short.p.member("blue", "an array of values describing the response of the blue channel")
    AutoSize("red", "green", "blue")..unsigned_int.member("size", "the number of elements in each array")
}

val GLFWcursor = "GLFWcursor".opaque

val GLFWimage = struct(Module.GLFW, "GLFWImage", nativeName = "GLFWimage") {
    documentation =
        """
        Image data.

        This describes a single 2D image. See the documentation for each related function to see what the expected pixel format is.
        """
    since = "version 2.1"

    int.member("width", "the width, in pixels, of this image")
    int.member("height", "the height, in pixels, of this image")
    unsigned_char.p.member("pixels", "the pixel data of this image, arranged left-to-right, top-to-bottom")
}

val GLFWgamepadstate = struct(Module.GLFW, "GLFWGamepadState", nativeName = "GLFWgamepadstate") {
    documentation = "Describes the input state of a gamepad."
    since = "version 3.3"

    unsigned_char.array("buttons", "the states of each gamepad button, #PRESS or #RELEASE", 15)
    float.array("axes", "the states of each gamepad axis, in the range -1.0 to 1.0 inclusive", 6)
}

// callback functions

val GLFWerrorfun = "GLFWerrorfun".callback(
    Module.GLFW, void, "GLFWErrorCallback",
    "Will be called with an error code and a human-readable description when a GLFW error occurs.",
    int.IN("error", "the error code"),
    NullTerminated..charUTF8.p.IN("description", "a pointer to a UTF-8 encoded string describing the error")
) {
    documentation = "Instances of this interface may be passed to the #SetErrorCallback() method."
    since = "version 3.0"
    javaImport(
        "java.io.PrintStream",
        "java.util.Map",
        "static org.lwjgl.glfw.GLFW.*"
    )
    additionalCode = """
    /**
     * Converts the specified {@link GLFWErrorCallback} argument to a String.
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
     * Returns a {@link GLFWErrorCallback} instance that prints the error to the {@link APIUtil#DEBUG_STREAM}.
     *
     * @return the GLFWerrorCallback
     */
    public static GLFWErrorCallback createPrint() {
        return createPrint(APIUtil.DEBUG_STREAM);
    }

    /**
     * Returns a {@link GLFWErrorCallback} instance that prints the error in the specified {@link PrintStream}.
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

                stream.printf("[LWJGL] %s error\n", ERROR_CODES.get(error));
                stream.println("\tDescription : " + msg);
                stream.println("\tStacktrace  :");
                StackTraceElement[] stack = Thread.currentThread().getStackTrace();
                for ( int i = 4; i < stack.length; i++ ) {
                    stream.print("\t\t");
                    stream.println(stack[i].toString());
                }
            }
        };
    }

    /**
     * Returns a {@link GLFWErrorCallback} instance that throws an {@link IllegalStateException} when an error occurs.
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

val GLFWmonitorfun = "GLFWmonitorfun".callback(
    Module.GLFW, void, "GLFWMonitorCallback",
    "Will be called when a monitor is connected to or disconnected from the system.",
    GLFWmonitor.p.IN("monitor", "the monitor that was connected or disconnected"),
    int.IN("event", "one of #CONNECTED or #DISCONNECTED. Remaining values reserved for future use.")
) {
    documentation = "Instances of this interface may be passed to the #SetMonitorCallback() method."
    since = "version 3.0"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetMonitorCallback SetMonitorCallback}. */
    public GLFWMonitorCallback set() {
        glfwSetMonitorCallback(this);
        return this;
    }
    """
}

val GLFWjoystickfun = "GLFWjoystickfun".callback(
    Module.GLFW, void, "GLFWJoystickCallback",
    "Will be called when a joystick is connected to or disconnected from the system.",
    int.IN("jid", "the joystick that was connected or disconnected"),
    int.IN("event", "one of #CONNECTED or #DISCONNECTED. Remaining values reserved for future use.")
) {
    documentation = "Instances of this interface may be passed to the #SetJoystickCallback() method."
    since = "version 3.2"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetJoystickCallback SetJoystickCallback}. */
    public GLFWJoystickCallback set() {
        glfwSetJoystickCallback(this);
        return this;
    }
    """
}

val GLFWwindowposfun = "GLFWwindowposfun".callback(
    Module.GLFW, void, "GLFWWindowPosCallback",
    "Will be called when the specified window moves.",
    GLFWwindow.p.IN("window", "the window that was moved"),
    int.IN("xpos", "the new x-coordinate, in pixels, of the upper-left corner of the client area of the window"),
    int.IN("ypos", "the new y-coordinate, in pixels, of the upper-left corner of the client area of the window")
) {
    documentation = "Instances of this interface may be passed to the #SetWindowPosCallback() method."
    since = "version 3.0"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetWindowPosCallback SetWindowPosCallback}. */
    public GLFWWindowPosCallback set(long window) {
        glfwSetWindowPosCallback(window, this);
        return this;
    }
    """
}

val GLFWwindowsizefun = "GLFWwindowsizefun".callback(
    Module.GLFW, void, "GLFWWindowSizeCallback",
    "Will be called when the specified window is resized.",
    GLFWwindow.p.IN("window", "the window that was resized"),
    int.IN("width", "the new width, in screen coordinates, of the window"),
    int.IN("height", "the new height, in screen coordinates, of the window")
) {
    documentation = "Instances of this interface may be passed to the #SetWindowSizeCallback() method."
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetWindowSizeCallback SetWindowSizeCallback}. */
    public GLFWWindowSizeCallback set(long window) {
        glfwSetWindowSizeCallback(window, this);
        return this;
    }
    """
}

val GLFWwindowclosefun = "GLFWwindowclosefun".callback(
    Module.GLFW, void, "GLFWWindowCloseCallback",
    "Will be called when the user attempts to close the specified window, for example by clicking the close widget in the title bar.",
    GLFWwindow.p.IN("window", "the window that the user attempted to close")
) {
    documentation = "Instances of this interface may be passed to the #SetWindowCloseCallback() method."
    since = "version 2.5"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetWindowCloseCallback SetWindowCloseCallback}. */
    public GLFWWindowCloseCallback set(long window) {
        glfwSetWindowCloseCallback(window, this);
        return this;
    }
    """
}

val GLFWwindowrefreshfun = "GLFWwindowrefreshfun".callback(
    Module.GLFW, void, "GLFWWindowRefreshCallback",
    """
    Will be called when the client area of the specified window needs to be redrawn, for example if the window has been exposed after having been covered by
    another window.
    """,
    GLFWwindow.p.IN("window", "the window whose content needs to be refreshed")
) {
    documentation = "Instances of this interface may be passed to the #SetWindowRefreshCallback() method."
    since = "version 2.5"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetWindowRefreshCallback SetWindowRefreshCallback}. */
    public GLFWWindowRefreshCallback set(long window) {
        glfwSetWindowRefreshCallback(window, this);
        return this;
    }
    """
}

val GLFWwindowfocusfun = "GLFWwindowfocusfun".callback(
    Module.GLFW, void, "GLFWWindowFocusCallback",
    "Will be called when the specified window gains or loses focus.",
    GLFWwindow.p.IN("window", "the window that was focused or defocused"),
    intb.IN("focused", "#TRUE if the window was focused, or #FALSE if it was defocused")
) {
    documentation = "Instances of this interface may be passed to the #SetWindowFocusCallback() method."
    since = "version 3.0"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetWindowFocusCallback SetWindowFocusCallback}. */
    public GLFWWindowFocusCallback set(long window) {
        glfwSetWindowFocusCallback(window, this);
        return this;
    }
    """
}

val GLFWwindowiconifyfun = "GLFWwindowiconifyfun".callback(
    Module.GLFW, void, "GLFWWindowIconifyCallback",
    "Will be called when the specified window is iconified or restored.",
    GLFWwindow.p.IN("window", "the window that was iconified or restored."),
    intb.IN("iconified", "#TRUE if the window was iconified, or #FALSE if it was restored")
) {
    documentation = "Instances of this interface may be passed to the #SetWindowIconifyCallback() method."
    since = "version 3.0"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetWindowIconifyCallback SetWindowIconifyCallback}. */
    public GLFWWindowIconifyCallback set(long window) {
        glfwSetWindowIconifyCallback(window, this);
        return this;
    }
    """
}

val GLFWwindowmaximizefun = "GLFWwindowmaximizefun".callback(
    Module.GLFW, void, "GLFWWindowMaximizeCallback",
    "Will be called when the specified window is maximized or restored.",
    GLFWwindow.p.IN("window", "the window that was maximized or restored."),
    intb.IN("maximized", "#TRUE if the window was maximized, or #FALSE if it was restored")
) {
    documentation = "Instances of this interface may be passed to the #SetWindowMaximizeCallback() method."
    since = "version 3.3"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetWindowMaximizeCallback SetWindowMaximizeCallback}. */
    public GLFWWindowMaximizeCallback set(long window) {
        glfwSetWindowMaximizeCallback(window, this);
        return this;
    }
    """
}

val GLFWframebuffersizefun = "GLFWframebuffersizefun".callback(
    Module.GLFW, void, "GLFWFramebufferSizeCallback",
    "Will be called when the framebuffer of the specified window is resized.",
    GLFWwindow.p.IN("window", "the window whose framebuffer was resized"),
    int.IN("width", "the new width, in pixels, of the framebuffer"),
    int.IN("height", "the new height, in pixels, of the framebuffer")
) {
    documentation = "Instances of this interface may be passed to the #SetFramebufferSizeCallback() method."
    since = "version 3.0"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetFramebufferSizeCallback SetFramebufferSizeCallback}. */
    public GLFWFramebufferSizeCallback set(long window) {
        glfwSetFramebufferSizeCallback(window, this);
        return this;
    }
    """
}

val GLFWwindowcontentscalefun = "GLFWwindowcontentscalefun".callback(
    Module.GLFW, void, "GLFWWindowContentScaleCallback",
    "Will be called when the window content scale changes.",
    GLFWwindow.p.IN("window", "the window whose content scale changed"),
    float.IN("xscale", "the new x-axis content scale of the window"),
    float.IN("yscale", "the new y-axis content scale of the window")
) {
    documentation = "Instances of this interface may be passed to the #SetWindowContentScaleCallback() method."
    since = "version 3.3"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetWindowContentScaleCallback SetWindowContentScaleCallback}. */
    public GLFWWindowContentScaleCallback set(long window) {
        glfwSetWindowContentScaleCallback(window, this);
        return this;
    }
    """
}

val GLFWkeyfun = "GLFWkeyfun".callback(
    Module.GLFW, void, "GLFWKeyCallback",
    "Will be called when a key is pressed, repeated or released.",
    GLFWwindow.p.IN("window", "the window that received the event"),
    int.IN("key", "the keyboard key that was pressed or released"),
    int.IN("scancode", "the system-specific scancode of the key"),
    int.IN("action", "the key action", "#PRESS #RELEASE #REPEAT"),
    int.IN("mods", "bitfield describing which modifiers keys were held down")
) {
    documentation = "Instances of this interface may be passed to the #SetKeyCallback() method."
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetKeyCallback SetKeyCallback}. */
    public GLFWKeyCallback set(long window) {
        glfwSetKeyCallback(window, this);
        return this;
    }
    """
}

val GLFWcharfun = "GLFWcharfun".callback(
    Module.GLFW, void, "GLFWCharCallback",
    "Will be called when a Unicode character is input.",
    GLFWwindow.p.IN("window", "the window that received the event"),
    unsigned_int.IN("codepoint", "the Unicode code point of the character")
) {
    documentation = "Instances of this interface may be passed to the #SetCharCallback() method."
    since = "version 2.4"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetCharCallback SetCharCallback}. */
    public GLFWCharCallback set(long window) {
        glfwSetCharCallback(window, this);
        return this;
    }
    """
}

val GLFWcharmodsfun = "GLFWcharmodsfun".callback(
    Module.GLFW, void, "GLFWCharModsCallback",
    "Will be called when a Unicode character is input regardless of what modifier keys are used.",
    GLFWwindow.p.IN("window", "the window that received the event"),
    unsigned_int.IN("codepoint", "the Unicode code point of the character"),
    int.IN("mods", "bitfield describing which modifier keys were held down")
) {
    documentation =
        """
        Instances of this interface may be passed to the #SetCharModsCallback() method.

        Deprecared: scheduled for removal in version 4.0.
        """
    since = "version 3.1"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetCharModsCallback SetCharModsCallback}. */
    public GLFWCharModsCallback set(long window) {
        glfwSetCharModsCallback(window, this);
        return this;
    }
    """
}

val GLFWmousebuttonfun = "GLFWmousebuttonfun".callback(
    Module.GLFW, void, "GLFWMouseButtonCallback",
    "Will be called when a mouse button is pressed or released.",
    GLFWwindow.p.IN("window", "the window that received the event"),
    int.IN("button", "the mouse button that was pressed or released"),
    int.IN("action", "the button action", "#PRESS #RELEASE #REPEAT"),
    int.IN("mods", "bitfield describing which modifiers keys were held down")
) {
    documentation = "Instances of this interface may be passed to the #SetMouseButtonCallback() method."
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetMouseButtonCallback SetMouseButtonCallback}. */
    public GLFWMouseButtonCallback set(long window) {
        glfwSetMouseButtonCallback(window, this);
        return this;
    }
    """
}

val GLFWcursorposfun = "GLFWcursorposfun".callback(
    Module.GLFW, void, "GLFWCursorPosCallback",
    """
    Will be called when the cursor is moved.

    The callback function receives the cursor position, measured in screen coordinates but relative to the top-left corner of the window client area. On
    platforms that provide it, the full sub-pixel cursor position is passed on.
    """,
    GLFWwindow.p.IN("window", "the window that received the event"),
    double.IN("xpos", "the new cursor x-coordinate, relative to the left edge of the client area"),
    double.IN("ypos", "the new cursor y-coordinate, relative to the top edge of the client area")
) {
    documentation = "Instances of this interface may be passed to the #SetCursorPosCallback() method."
    since = "version 3.0"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetCursorPosCallback SetCursorPosCallback}. */
    public GLFWCursorPosCallback set(long window) {
        glfwSetCursorPosCallback(window, this);
        return this;
    }
    """
}

val GLFWcursorenterfun = "GLFWcursorenterfun".callback(
    Module.GLFW, void, "GLFWCursorEnterCallback",
    "Will be called when the cursor enters or leaves the client area of the window.",
    GLFWwindow.p.IN("window", "the window that received the event"),
    intb.IN("entered", "#TRUE if the cursor entered the window's client area, or #FALSE if it left it")
) {
    documentation = "Instances of this interface may be passed to the #SetCursorEnterCallback() method."
    since = "version 3.0"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetCursorEnterCallback SetCursorEnterCallback}. */
    public GLFWCursorEnterCallback set(long window) {
        glfwSetCursorEnterCallback(window, this);
        return this;
    }
    """
}

val GLFWscrollfun = "GLFWscrollfun".callback(
    Module.GLFW, void, "GLFWScrollCallback",
    "Will be called when a scrolling device is used, such as a mouse wheel or scrolling area of a touchpad.",
    GLFWwindow.p.IN("window", "the window that received the event"),
    double.IN("xoffset", "the scroll offset along the x-axis"),
    double.IN("yoffset", "the scroll offset along the y-axis")
) {
    documentation = "Instances of this interface may be passed to the #SetScrollCallback() method."
    since = "version 3.0"
    javaImport("static org.lwjgl.glfw.GLFW.*")
    additionalCode = """
    /** See {@link GLFW#glfwSetScrollCallback SetScrollCallback}. */
    public GLFWScrollCallback set(long window) {
        glfwSetScrollCallback(window, this);
        return this;
    }
    """
}

val GLFWdropfun = "GLFWdropfun".callback(
    Module.GLFW, void, "GLFWDropCallback",
    "Will be called when one or more dragged files are dropped on the window.",
    GLFWwindow.p.IN("window", "the window that received the event"),
    AutoSize("names")..int.IN("count", "the number of dropped files"),
    char.const.p.p.IN("names", "pointer to the array of UTF-8 encoded path names of the dropped files")
) {
    documentation = "Instances of this interface may be passed to the #SetDropCallback() method."
    since = "version 3.1"
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

// OpenGL
val GLFWglproc = "GLFWglproc".handle

// Vulkan
val GLFWvkproc = "GLFWvkproc".handle