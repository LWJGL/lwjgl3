/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.macos.*

val GLFWNativeCocoa = "GLFWNativeCocoa".nativeClass(Module.GLFW, nativeSubPath = "macos", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    documentation = "Native bindings to the GLFW library's Cocoa native access functions."

    CGDirectDisplayID(
        "GetCocoaMonitor",
        """
        Returns the {@code CGDirectDisplayID} of the specified monitor.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWmonitor.p("monitor", "the GLFW monitor"),

        returnDoc =
        """
        the {@code CGDirectDisplayID} of the specified monitor, or {@code kCGNullDirectDisplay} if an error occurred.
        
        Possible errors include #NOT_INITIALIZED.
        """,
        since = "version 3.1"
    )

    id(
        "GetCocoaWindow",
        """
        Returns the {@code NSWindow} of the specified GLFW window.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p("window", "the GLFW window"),

        returnDoc =
        """
        the {@code NSWindow} of the specified window, or nil if an error occurred.
        
        Possible errors include #NOT_INITIALIZED.
        """,
        since = "version 3.0"
    )
}