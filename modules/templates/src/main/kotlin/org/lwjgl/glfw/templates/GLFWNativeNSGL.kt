/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*
import org.lwjgl.system.macosx.*

val GLFWNativeNSGL = "GLFWNativeNSGL".nativeClass(packageName = GLFW_PACKAGE, nativeSubPath = "macosx", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    documentation = "Native bindings to the GLFW library's NSGL native access functions."

    id(
        "GetNSGLContext",
        """
        Returns the ${code("NSOpenGLContext")} of the specified GLFW window.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.IN("window", "the GLFW window"),
        returnDoc = "The ${code("NSOpenGLContext")} of the specified window, or nil if an error occurred.",
        since = "version 3.0"
    )
}