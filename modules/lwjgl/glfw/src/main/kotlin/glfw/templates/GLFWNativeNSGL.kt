/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.macos.*

val GLFWNativeNSGL = "GLFWNativeNSGL".nativeClass(Module.GLFW, nativeSubPath = "macos", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    documentation = "Native bindings to the GLFW library's NSGL native access functions."

    id(
        "GetNSGLContext",
        """
        Returns the {@code NSOpenGLContext} of the specified GLFW window.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p.IN("window", "the GLFW window"),
        returnDoc = "The {@code NSOpenGLContext} of the specified window, or nil if an error occurred.",
        since = "version 3.0"
    )
}