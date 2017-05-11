/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.glfw.templates

import org.lwjgl.generator.*
import org.lwjgl.glfw.*
import org.lwjgl.opengl.*

val GLFWNativeGLX = "GLFWNativeGLX".nativeClass(packageName = GLFW_PACKAGE, nativeSubPath = "linux", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    documentation = "Native bindings to the GLFW library's GLX native access functions."

    GLXContext(
        "GetGLXContext",
        """
        Returns the {@code GLXContext} of the specified window.

        This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.IN("window", "a GLFW window"),
        returnDoc = "the {@code GLXContext} of the specified window, or #NULL if an error occurred.",
        since = "version 3.0"
    )

    GLXWindow(
        "GetGLXWindow",
        """
        Returns the {@code GLXWindow} of the specified window.

        This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.IN("window", "a GLFW window"),
        returnDoc = "the {@code GLXWindow} of the specified window, or {@code None} if an error occurred.",
        since = "version 3.2"
    )
}