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
    documentation = "Describes a single video mode."

    int("width", "the width, in screen coordinates, of the video mode")
    int("height", "the height, in screen coordinates, of the video mode")
    int("redBits", "the bit depth of the red channel of the video mode")
    int("greenBits", "the bit depth of the green channel of the video mode")
    int("blueBits", "the bit depth of the blue channel of the video mode")
    int("refreshRate", "the refresh rate, in Hz, of the video mode")
}

val GLFWgammaramp = struct(Module.GLFW, "GLFWGammaRamp", nativeName = "GLFWgammaramp") {
    documentation = "Describes the gamma ramp for a monitor."
    since = "version 3.0"

    unsigned_short.p("red", "an array of values describing the response of the red channel")
    unsigned_short.p("green", "an array of values describing the response of the green channel")
    unsigned_short.p("blue", "an array of values describing the response of the blue channel")
    AutoSize("red", "green", "blue")..unsigned_int("size", "the number of elements in each array")
}

val GLFWcursor = "GLFWcursor".opaque

val GLFWimage = struct(Module.GLFW, "GLFWImage", nativeName = "GLFWimage") {
    documentation =
        """
        Image data.

        This describes a single 2D image. See the documentation for each related function to see what the expected pixel format is.
        """
    since = "version 2.1"

    int("width", "the width, in pixels, of this image")
    int("height", "the height, in pixels, of this image")
    unsigned_char.p("pixels", "the pixel data of this image, arranged left-to-right, top-to-bottom")
}

val GLFWgamepadstate = struct(Module.GLFW, "GLFWGamepadState", nativeName = "GLFWgamepadstate") {
    documentation = "Describes the input state of a gamepad."
    since = "version 3.3"

    unsigned_char("buttons", "the states of each gamepad button, #PRESS or #RELEASE")[15]
    float("axes", "the states of each gamepad axis, in the range -1.0 to 1.0 inclusive")[6]
}

// callback functions

val GLFWallocatefun = Module.GLFW.callback {
    void.p(
        "GLFWAllocateCallback",
        "Will be called for memory allocation requests.",

        size_t("size", "the minimum size, in bytes, of the memory block"),
        opaque_p("user", "the user-defined pointer from the allocator"),

        returnDoc = "the address of the newly allocated memory block, or #NULL if an error occurred",
        nativeType = "GLFWallocatefun"
    ) {
        documentation =
            """
            The function pointer type for memory allocation callbacks.

            This is the function pointer type for memory allocation callbacks. A memory allocation callback function has the following signature:
            ${codeBlock("""
void* function_name(size_t size, void* user)""")}

            This function must return either a memory block at least {@code size} bytes long, or #NULL if allocation failed. Note that not all parts of GLFW
            handle allocation failures gracefully yet.
    
            This function may be called during #Init() but before the library is flagged as initialized, as well as during #Terminate() after the library is no
            longer flagged as initialized.
    
            Any memory allocated by this function will be deallocated during library termination or earlier.
    
            The size will always be greater than zero. Allocations of size zero are filtered out before reaching the custom allocator.
        
            ${note(ul(
                "The returned memory block must be valid at least until it is deallocated.",
                "This function should not call any GLFW function.",
                "This function may be called from any thread that calls GLFW functions."
            ))}
            """
        since = "version 3.4"
    }
}


val GLFWreallocatefun = Module.GLFW.callback {
    void.p(
        "GLFWReallocateCallback",
        "Will be called for memory reallocation requests.",

        Unsafe..void.p("block", "the address of the memory block to reallocate"),
        size_t("size", "the new minimum size, in bytes, of the memory block"),
        opaque_p("user", "the user-defined pointer from the allocator"),

        returnDoc = "the address of the newly allocated or resized memory block, or #NULL if an error occurred",
        nativeType = "GLFWreallocatefun"
    ) {
        documentation =
            """
            The function pointer type for memory reallocation callbacks.

            This is the function pointer type for memory reallocation callbacks. A memory reallocation callback function has the following signature:
            ${codeBlock("""
void* function_name(void* block, size_t size, void* user)            """)}

            This function must return a memory block at least {@code size} bytes long, or #NULL if allocation failed. Note that not all parts of GLFW handle
            allocation failures gracefully yet.

            This function may be called during #Init() but before the library is flagged as initialized, as well as during #Terminate() after the library is no
            longer flagged as initialized.

            Any memory allocated by this function will be deallocated during library termination or earlier.

            The block address will never be #NULL and the size will always be greater than zero. Reallocations of a block to size zero are converted into
            deallocations. Reallocations of #NULL to a non-zero size are converted into regular allocations.
        
            ${note(ul(
                "The returned memory block must be valid at least until it is deallocated.",
                "This function should not call any GLFW function.",
                "This function may be called from any thread that calls GLFW functions."
            ))}
            """
        since = "version 3.4"
    }
}

val GLFWdeallocatefun = Module.GLFW.callback {
    void(
        "GLFWDeallocateCallback",
        "Will be called for memory deallocation requests.",

        Unsafe..void.p("block", "the address of the memory block to deallocate"),
        opaque_p("user", "the user-defined pointer from the allocator"),

        nativeType = "GLFWdeallocatefun"
    ) {
        documentation =
            """
            The function pointer type for memory deallocation callbacks.

            This is the function pointer type for memory deallocation callbacks. A memory deallocation callback function has the following signature:
            ${codeBlock("""
void function_name(void* block, void* user)""")}

            This function may deallocate the specified memory block. This memory block will have been allocated with the same allocator.
 
            This function may be called during #Init() but before the library is flagged as initialized, as well as during #Terminate() after the library is no
            longer flagged as initialized.
 
            The block address will never be #NULL. Deallocations of #NULL are filtered out before reaching the custom allocator.
 
            ${note(ul(
                "The specified memory block will not be accessed by GLFW after this function is called.",
                "This function should not call any GLFW function.",
                "This function may be called from any thread that calls GLFW functions."
            ))}
            """
        since = "version 3.4"
    }
}

val GLFWerrorfun = Module.GLFW.callback {
    void(
        "GLFWErrorCallback",
        "Will be called with an error code and a human-readable description when a GLFW error occurs.",

        int("error", "the error code"),
        NullTerminated..charUTF8.p("description", "a pointer to a UTF-8 encoded string describing the error"),

        nativeType = "GLFWerrorfun"
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
    documentation = "A custom memory allocator that can be set with #InitAllocator()."
    since = "version 3.4"

    GLFWallocatefun("allocate", "the memory allocation callback")
    GLFWreallocatefun("reallocate", "the memory reallocation callback")
    GLFWdeallocatefun("deallocate", "the memory deallocation callback")
    nullable..opaque_p("user", "a user-defined pointer that will be passed to the callbacks")
}

val GLFWmonitorfun = Module.GLFW.callback {
    void(
        "GLFWMonitorCallback",
        "Will be called when a monitor is connected to or disconnected from the system.",

        GLFWmonitor.p("monitor", "the monitor that was connected or disconnected"),
        int("event", "one of #CONNECTED or #DISCONNECTED. Remaining values reserved for future use."),

        nativeType = "GLFWmonitorfun"
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
}

val GLFWjoystickfun = Module.GLFW.callback {
    void(
        "GLFWJoystickCallback",
        "Will be called when a joystick is connected to or disconnected from the system.",

        int("jid", "the joystick that was connected or disconnected"),
        int("event", "one of #CONNECTED or #DISCONNECTED. Remaining values reserved for future use."),

        nativeType = "GLFWjoystickfun"
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
}

val GLFWwindowposfun = Module.GLFW.callback {
    void(
        "GLFWWindowPosCallback",
        "Will be called when the specified window moves.",

        GLFWwindow.p("window", "the window that was moved"),
        int("xpos", "the new x-coordinate, in screen coordinates, of the upper-left corner of the content area of the window"),
        int("ypos", "the new y-coordinate, in screen coordinates, of the upper-left corner of the content area of the window"),

        nativeType = "GLFWwindowposfun"
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
}

val GLFWwindowsizefun = Module.GLFW.callback {
    void(
        "GLFWWindowSizeCallback",
        "Will be called when the specified window is resized.",

        GLFWwindow.p("window", "the window that was resized"),
        int("width", "the new width, in screen coordinates, of the window"),
        int("height", "the new height, in screen coordinates, of the window"),

        nativeType = "GLFWwindowsizefun"
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
}

val GLFWwindowclosefun = Module.GLFW.callback {
    void(
        "GLFWWindowCloseCallback",
        "Will be called when the user attempts to close the specified window, for example by clicking the close widget in the title bar.",

        GLFWwindow.p("window", "the window that the user attempted to close"),

        nativeType = "GLFWwindowclosefun"
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
}

val GLFWwindowrefreshfun = Module.GLFW.callback {
    void(
        "GLFWWindowRefreshCallback",
        """
        Will be called when the client area of the specified window needs to be redrawn, for example if the window has been exposed after having been covered by
        another window.
        """,

        GLFWwindow.p("window", "the window whose content needs to be refreshed"),

        nativeType = "GLFWwindowrefreshfun"
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
}

val GLFWwindowfocusfun = Module.GLFW.callback {
    void(
        "GLFWWindowFocusCallback",
        "Will be called when the specified window gains or loses focus.",

        GLFWwindow.p("window", "the window that was focused or defocused"),
        intb("focused", "#TRUE if the window was focused, or #FALSE if it was defocused"),

        nativeType = "GLFWwindowfocusfun"
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
}

val GLFWwindowiconifyfun = Module.GLFW.callback {
    void(
        "GLFWWindowIconifyCallback",
        "Will be called when the specified window is iconified or restored.",

        GLFWwindow.p("window", "the window that was iconified or restored."),
        intb("iconified", "#TRUE if the window was iconified, or #FALSE if it was restored"),

        nativeType = "GLFWwindowiconifyfun"
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
}

val GLFWwindowmaximizefun = Module.GLFW.callback {
    void(
        "GLFWWindowMaximizeCallback",
        "Will be called when the specified window is maximized or restored.",

        GLFWwindow.p("window", "the window that was maximized or restored."),
        intb("maximized", "#TRUE if the window was maximized, or #FALSE if it was restored"),

        nativeType = "GLFWwindowmaximizefun"
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
}

val GLFWframebuffersizefun = Module.GLFW.callback {
    void(
        "GLFWFramebufferSizeCallback",
        "Will be called when the framebuffer of the specified window is resized.",

        GLFWwindow.p("window", "the window whose framebuffer was resized"),
        int("width", "the new width, in pixels, of the framebuffer"),
        int("height", "the new height, in pixels, of the framebuffer"),

        nativeType = "GLFWframebuffersizefun"
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
}

val GLFWwindowcontentscalefun = Module.GLFW.callback {
    void(
        "GLFWWindowContentScaleCallback",
        "Will be called when the window content scale changes.",

        GLFWwindow.p("window", "the window whose content scale changed"),
        float("xscale", "the new x-axis content scale of the window"),
        float("yscale", "the new y-axis content scale of the window"),

        nativeType = "GLFWwindowcontentscalefun"
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
}

val GLFWkeyfun = Module.GLFW.callback {
    void(
        "GLFWKeyCallback",
        "Will be called when a key is pressed, repeated or released.",

        GLFWwindow.p("window", "the window that received the event"),
        int("key", "the keyboard key that was pressed or released"),
        int("scancode", "the platform-specific scancode of the key"),
        int("action", "the key action", "#PRESS #RELEASE #REPEAT"),
        int("mods", "bitfield describing which modifiers keys were held down"),

        nativeType = "GLFWkeyfun"
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
}

val GLFWcharfun = Module.GLFW.callback {
    void(
        "GLFWCharCallback",
        "Will be called when a Unicode character is input.",

        GLFWwindow.p("window", "the window that received the event"),
        unsigned_int("codepoint", "the Unicode code point of the character"),

        nativeType = "GLFWcharfun"
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
}

val GLFWcharmodsfun = Module.GLFW.callback {
    void(
        "GLFWCharModsCallback",
        "Will be called when a Unicode character is input regardless of what modifier keys are used.",

        GLFWwindow.p("window", "the window that received the event"),
        unsigned_int("codepoint", "the Unicode code point of the character"),
        int("mods", "bitfield describing which modifier keys were held down"),

        nativeType = "GLFWcharmodsfun"
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
}

val GLFWmousebuttonfun = Module.GLFW.callback {
    void(
        "GLFWMouseButtonCallback",
        "Will be called when a mouse button is pressed or released.",

        GLFWwindow.p("window", "the window that received the event"),
        int("button", "the mouse button that was pressed or released"),
        int("action", "the button action", "#PRESS #RELEASE"),
        int("mods", "bitfield describing which modifiers keys were held down"),

        nativeType = "GLFWmousebuttonfun"
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
}

val GLFWcursorposfun = Module.GLFW.callback {
    void(
        "GLFWCursorPosCallback",
        """
        Will be called when the cursor is moved.

        The callback function receives the cursor position, measured in screen coordinates but relative to the top-left corner of the window client area. On
        platforms that provide it, the full sub-pixel cursor position is passed on.
        """,

        GLFWwindow.p("window", "the window that received the event"),
        double("xpos", "the new cursor x-coordinate, relative to the left edge of the content area"),
        double("ypos", "the new cursor y-coordinate, relative to the top edge of the content area"),

        nativeType = "GLFWcursorposfun"
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
}

val GLFWcursorenterfun = Module.GLFW.callback {
    void(
        "GLFWCursorEnterCallback",
        "Will be called when the cursor enters or leaves the client area of the window.",

        GLFWwindow.p("window", "the window that received the event"),
        intb("entered", "#TRUE if the cursor entered the window's content area, or #FALSE if it left it"),

        nativeType = "GLFWcursorenterfun"
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
}

val GLFWscrollfun = Module.GLFW.callback {
    void(
        "GLFWScrollCallback",
        "Will be called when a scrolling device is used, such as a mouse wheel or scrolling area of a touchpad.",

        GLFWwindow.p("window", "the window that received the event"),
        double("xoffset", "the scroll offset along the x-axis"),
        double("yoffset", "the scroll offset along the y-axis"),

        nativeType = "GLFWscrollfun"
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
}

val GLFWdropfun = Module.GLFW.callback {
    void(
        "GLFWDropCallback",
        "Will be called when one or more dragged files are dropped on the window.",

        GLFWwindow.p("window", "the window that received the event"),
        AutoSize("names")..int("count", "the number of dropped files"),
        char.const.p.p("names", "pointer to the array of UTF-8 encoded path names of the dropped files"),

        nativeType = "GLFWdropfun"
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
}

// OpenGL
val GLFWglproc = "GLFWglproc".handle

// Vulkan
val GLFWvkproc = "GLFWvkproc".handle