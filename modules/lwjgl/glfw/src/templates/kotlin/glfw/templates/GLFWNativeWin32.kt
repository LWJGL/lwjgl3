/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.windows.*

val GLFWNativeWin32 = "GLFWNativeWin32".nativeClass(Module.GLFW, nativeSubPath = "windows", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    documentation = "Native bindings to the GLFW library's Win32 native access functions."

    charUTF8.const.p(
        "GetWin32Adapter",
        """
        Returns the adapter device name of the specified monitor.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWmonitor.p("monitor", "the GLFW monitor"),

        returnDoc =
        """
        the UTF-8 encoded adapter device name (for example `\\.\DISPLAY1`) of the specified monitor, or #NULL if an error occurred.
        
        Possible errors include #NOT_INITIALIZED.
        """,
        since = "version 3.1"
    )

    charUTF8.const.p(
        "GetWin32Monitor",
        """
        Returns the display device name of the specified monitor.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWmonitor.p("monitor", "the GLFW monitor"),

        returnDoc =
        """
        the UTF-8 encoded display device name (for example `\\.\DISPLAY1\Monitor0`) of the specified monitor, or #NULL if an error occurred.
        
        Possible errors include #NOT_INITIALIZED.
        """,
        since = "version 3.1"
    )

    HWND(
        "GetWin32Window",
        """
        Returns the {@code HWND} of the specified window.
        
        The {@code HDC} associated with the window can be queried with the
        ${url("https://docs.microsoft.com/en-us/windows/win32/api/winuser/nf-winuser-getdc", "GetDC")} function.
        ${code("""
        HDC dc = GetDC(glfwGetWin32Window(window));""")}
        This DC is private and does not need to be released.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p("window", "the GLFW window"),

        returnDoc =
        """
        the {@code HWND} of the specified window, or #NULL if an error occurred.
        
        Possible errors include #NOT_INITIALIZED.
        """,
        since = "version 3.0"
    )

    GLFWwindow.p(
        "AttachWin32Window",
        """
        Wraps an existing {@code HWND} in a new GLFW window object.

        This function creates a GLFW window object and its associated OpenGL or OpenGL ES context for an existing {@code HWND}. The {@code HWND} is not
        destroyed by GLFW.

        This function may be called from any thread.

        <b>LWJGL</b>: This functionality is experimental and not officially supported by GLFW yet.
        """,

        HWND("handle", "the {@code HWND} to attach to the window object"),
        nullable..GLFWwindow.p("share", "the window whose context to share resources with, or #NULL to not share resources"),

        returnDoc = "the handle of the created window, or #NULL if an error occurred",
        since = "version 3.3"
    )
}