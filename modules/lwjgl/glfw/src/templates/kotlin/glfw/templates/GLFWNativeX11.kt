/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.linux.*

val GLFWNativeX11 = "GLFWNativeX11".nativeClass(Module.GLFW, nativeSubPath = "linux", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    documentation = "Native bindings to the GLFW library's X11 native access functions."

    Display.p(
        "GetX11Display",
        """
        Returns the {@code Display} used by GLFW.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        returnDoc =
        """
        the {@code Display} used by GLFW, or #NULL if an error occurred.
        
        Possible errors include #NOT_INITIALIZED.
        """,
        since = "version 3.0"
    )

    RRCrtc(
        "GetX11Adapter",
        """
        Returns the {@code RRCrtc} of the specified monitor.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWmonitor.p("monitor", "the GLFW monitor"),

        returnDoc =
        """
        the {@code RRCrtc} of the specified monitor, or {@code None} if an error occurred.
        
        Possible errors include #NOT_INITIALIZED.
        """,
        since = "version 3.1"
    )

    RROutput(
        "GetX11Monitor",
        """
        Returns the {@code RROutput} of the specified monitor.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWmonitor.p("monitor", "the GLFW monitor"),

        returnDoc =
        """
        the {@code RROutput} of the specified monitor, or {@code None} if an error occurred.
        
        Possible errors include #NOT_INITIALIZED.
        """,
        since = "version 3.1"
    )

    Window(
        "GetX11Window",
        """
        Returns the {@code Window} of the specified window.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p("window", "a GLFW window"),
        returnDoc =
        """
        the {@code Window} of the specified window, or {@code None} if an error occurred.
        
        Possible errors include #NOT_INITIALIZED.
        """,
        since = "version 3.0"
    )

    void(
        "SetX11SelectionString",
        """
        Sets the current primary selection to the specified string.

        This function must only be called from the main thread.
        """,

        charUTF8.const.p("string", "a UTF-8 encoded string. The specified string is copied before this function returns."),

        since = "version 3.3"
    )

    charUTF8.const.p(
        "GetX11SelectionString",
        """
        Returns the contents of the current primary selection as a string.

        If the selection is empty or if its contents cannot be converted, #NULL is returned and a #FORMAT_UNAVAILABLE error is generated.

        The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to #GetX11SelectionString() or
        #SetX11SelectionString(), or until the library is terminated.

        This function must only be called from the main thread.
        """,

        returnDoc = "the contents of the selection as a UTF-8 encoded string, or #NULL if an error occurred",
        since = "version 3.3"
    )
}