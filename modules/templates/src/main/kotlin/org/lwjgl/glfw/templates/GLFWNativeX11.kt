/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*
import org.lwjgl.system.linux.*

val GLFWNativeX11 = "GLFWNativeX11".nativeClass(packageName = GLFW_PACKAGE, nativeSubPath = "linux", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    documentation = "Native bindings to the GLFW library's X11 native access functions."

    Display_p(
        "GetX11Display",
        """
        Returns the ${code("Display")} used by GLFW.

        Note: This function may be called from any thread. Access is not synchronized.
        """,
        returnDoc = "The ${code("Display")} used by GLFW, or #NULL if an error occurred.",
        since = "version 3.0"
    )

    RRCrtc(
        "GetX11Adapter",
        """
        Returns the ${code("RRCrtc")} of the specified monitor.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWmonitor.IN("monitor", "the GLFW monitor"),
        returnDoc = "The ${code("RRCrtc")} of the specified monitor, or {@code None} if an error occurred.",
        since = "version 3.1"
    )

    RROutput(
        "GetX11Monitor",
        """
        Returns the ${code("RROutput")} of the specified monitor.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWmonitor.IN("monitor", "the GLFW monitor"),
        returnDoc = "The ${code("RROutput")} of the specified monitor, or {@code None} if an error occurred.",
        since = "version 3.1"
    )

    Window(
        "GetX11Window",
        """
        Returns the ${code("Window")} of the specified window.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.IN("window", "a GLFW window"),
        returnDoc = " The ${code("Window")} of the specified window, or {@code None} if an error occurred.",
        since = "version 3.0"
    )
}