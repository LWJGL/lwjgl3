/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.glfw.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*
import org.lwjgl.glfw.*

val GLFWNativeEGL = "GLFWNativeEGL".nativeClass(packageName = GLFW_PACKAGE, nativeSubPath = "egl", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    javaImport(
        "org.lwjgl.egl.EGL10"
    )

    documentation = "Native bindings to the GLFW library's EGL native access functions."

    EGLDisplay(
        "GetEGLDisplay",
        """
            Returns the {@code EGLDisplay} used by GLFW.

            This function may be called from any thread. Access is not synchronized.
            """,

        returnDoc = "the {@code EGLDisplay} used by GLFW, or EGL10#EGL_NO_DISPLAY if an error occured",
        since = "version 3.0"
    )

    EGLContext(
        "GetEGLContext",
        """
            Returns the {@code EGLContext} of the specified window.

            This function may be called from any thread. Access is not synchronized.
            """,

        GLFWwindow.IN("window", "a GLFW window"),

        returnDoc = "the {@code EGLContext} of the specified window, or EGL10#EGL_NO_CONTEXT if an error occurred",
        since = "version 3.0"
    )

    EGLSurface(
        "GetEGLSurface",
        """
            Returns the {@code EGLSurface} of the specified window.

            This function may be called from any thread. Access is not synchronized.
            """,

        GLFWwindow.IN("window", ""),

        returnDoc = "the {@code EGLSurface} of the specified window, or EGL10#EGL_NO_SURFACE if an error occurred",
        since = "version 3.0"
    )
}