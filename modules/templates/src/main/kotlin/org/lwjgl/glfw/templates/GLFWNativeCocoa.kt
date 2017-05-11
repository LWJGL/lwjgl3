/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*
import org.lwjgl.system.macosx.*

val GLFWNativeCocoa = "GLFWNativeCocoa".nativeClass(packageName = GLFW_PACKAGE, nativeSubPath = "macosx", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    documentation = "Native bindings to the GLFW library's Cocoa native access functions."

    CGDirectDisplayID(
        "GetCocoaMonitor",
        """
        Returns the ${code("CGDirectDisplayID")} of the specified monitor.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWmonitor.IN("monitor", "the GLFW monitor"),

        returnDoc = "The ${code("CGDirectDisplayID")} of the specified monitor, or {@code kCGNullDirectDisplay} if an error occurred.",
        since = "version 3.1"
    )

    id(
        "GetCocoaWindow",
        """
        Returns the ${code("NSWindow")} of the specified GLFW window.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.IN("window", "the GLFW window"),
        returnDoc = "The ${code("NSWindow")} of the specified window, or nil if an error occurred.",
        since = "version 3.0"
    )
}