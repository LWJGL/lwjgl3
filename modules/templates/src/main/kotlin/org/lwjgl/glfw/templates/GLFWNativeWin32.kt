/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*
import org.lwjgl.system.windows.*

val GLFWNativeWin32 = "GLFWNativeWin32".nativeClass(packageName = GLFW_PACKAGE, nativeSubPath = "windows", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    documentation = "Native bindings to the GLFW library's Win32 native access functions."

    const..charUTF8_p(
        "GetWin32Adapter",
        """
        Returns the adapter device name of the specified monitor.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWmonitor.IN("monitor", "the GLFW monitor"),
        returnDoc = "The UTF-8 encoded adapter device name (for example `\\\\.\\DISPLAY1`) of the specified monitor, or #NULL if an error occurred.",
        since = "version 3.1"
    )

    const..charUTF8_p(
        "GetWin32Monitor",
        """
        Returns the display device name of the specified monitor.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWmonitor.IN("monitor", "the GLFW monitor"),
        returnDoc = "The UTF-8 encoded display device name (for example `\\\\.\\DISPLAY1\\Monitor0`) of the specified monitor, or #NULL if an error occurred.",
        since = "version 3.1"
    )

    HWND(
        "GetWin32Window",
        """
        Returns the ${code("HWND")} of the specified window.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.IN("window", "the GLFW window"),
        returnDoc = "The ${code("HWND")} of the specified window, or #NULL if an error occurred.",
        since = "version 3.0"
    )
}