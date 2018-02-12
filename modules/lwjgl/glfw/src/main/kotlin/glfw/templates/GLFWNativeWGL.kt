/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.windows.*

val GLFWNativeWGL = "GLFWNativeWGL".nativeClass(Module.GLFW, nativeSubPath = "windows", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    documentation = "Native bindings to the GLFW library's WGL native access functions."

    HGLRC(
        "GetWGLContext",
        """
        Returns the {@code HGLRC} of the specified window.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p.IN("window", "the GLFW window"),
        returnDoc = "The {@code HGLRC} of the specified window, or #NULL if an error occurred.",
        since = "version 3.0"
    )
}