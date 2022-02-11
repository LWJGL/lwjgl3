/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import egl.*
import org.lwjgl.generator.*
import glfw.*

val GLFWNativeEGL = "GLFWNativeEGL".nativeClass(Module.GLFW, nativeSubPath = "egl", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    javaImport(
        "javax.annotation.*",
        "org.lwjgl.egl.EGL",
        "org.lwjgl.egl.EGL10",
        "org.lwjgl.opengles.GLES",
        "static org.lwjgl.system.MemoryUtil.*"
    )

    documentation = "Native bindings to the GLFW library's EGL native access functions."

    EGLDisplay(
        "GetEGLDisplay",
        """
        Returns the {@code EGLDisplay} used by GLFW.

        This function may be called from any thread. Access is not synchronized.
        """,

        returnDoc =
        """
        the {@code EGLDisplay} used by GLFW, or EGL10#EGL_NO_DISPLAY if an error occured.

        Possible errors include #NOT_INITIALIZED.
        """,
        since = "version 3.0"
    )

    EGLContext(
        "GetEGLContext",
        """
        Returns the {@code EGLContext} of the specified window.

        This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p("window", "a GLFW window"),

        returnDoc =
        """
        the {@code EGLContext} of the specified window, or EGL10#EGL_NO_CONTEXT if an error occurred.

        Possible errors include #NO_WINDOW_CONTEXT and #NOT_INITIALIZED.
        """,
        since = "version 3.0"
    )

    EGLSurface(
        "GetEGLSurface",
        """
        Returns the {@code EGLSurface} of the specified window.

        This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p("window", ""),

        returnDoc =
        """
        the {@code EGLSurface} of the specified window, or EGL10#EGL_NO_SURFACE if an error occurred.

        Possible errors include #NO_WINDOW_CONTEXT and #NOT_INITIALIZED.
        """,
        since = "version 3.0"
    )

    EGLConfig(
        "GetEGLConfig",
        """
        Returns the {@code EGLConfig} of the specified window.

        This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p("window", ""),

        returnDoc =
        """
        the {@code EGLConfig} of the specified window, or EGL10#EGL_NO_SURFACE if an error occurred.

        Possible errors include #NO_WINDOW_CONTEXT and #NOT_INITIALIZED.
        """,
        since = "version 3.4"
    )

    customMethod("""
    /**
     * Calls {@link #setEGLPath(String)} with the path of the specified {@link SharedLibrary}.
     * 
     * <p>Example usage: ${code("GLFWNativeEGL.setEGLPath(EGL.getFunctionProvider());")}</p> 
     *
     * @param sharedLibrary a {@code FunctionProvider} instance that will be cast to {@code SharedLibrary}
     */
    public static void setEGLPath(FunctionProvider sharedLibrary) {
        if (!(sharedLibrary instanceof SharedLibrary)) {
            apiLog("GLFW EGL path override not set: Function provider is not a shared library.");
            return;
        }

        String path = ((SharedLibrary)sharedLibrary).getPath();
        if (path == null) {
            apiLog("GLFW EGL path override not set: Could not resolve the shared library path.");
            return;

        }

        setEGLPath(path);
    }

    /**
     * Overrides the EGL shared library that GLFW loads internally.
     *
     * <p>This is useful when there's a mismatch between the shared libraries loaded by LWJGL and GLFW.</p>
     *
     * <p>This method must be called before GLFW initializes EGL. The override is available only in the default GLFW build bundled with LWJGL. Using the
     * override with a custom GLFW build will produce a warning in {@code DEBUG} mode (but not an error).</p>
     *
     * @param path the EGL shared library path, or {@code null} to remove the override.
     */
    public static void setEGLPath(@Nullable String path) {
        if (!override("_glfw_egl_library", path)) {
            apiLog("GLFW EGL path override not set: Could not resolve override symbol.");
        }
    }

    /**
     * Calls {@link #setGLESPath(String)} with the path of the specified {@link SharedLibrary}.
     * 
     * <p>Example usage: ${code("GLFWNativeEGL.setGLESPath(GLES.getFunctionProvider());")}</p> 
     *
     * @param sharedLibrary a {@code FunctionProvider} instance that will be cast to {@code SharedLibrary}
     */
    public static void setGLESPath(FunctionProvider sharedLibrary) {
        if (!(sharedLibrary instanceof SharedLibrary)) {
            apiLog("GLFW OpenGL ES path override not set: Function provider is not a shared library.");
            return;
        }

        String path = ((SharedLibrary)sharedLibrary).getPath();
        if (path == null) {
            apiLog("GLFW OpenGL ES path override not set: Could not resolve the shared library path.");
            return;

        }

        setGLESPath(path);
    }

    /**
     * Overrides the OpenGL ES shared library that GLFW loads internally.
     *
     * <p>This is useful when there's a mismatch between the shared libraries loaded by LWJGL and GLFW.</p>
     *
     * <p>This method must be called before GLFW initializes OpenGL ES. The override is available only in the default GLFW build bundled with LWJGL. Using the
     * override with a custom GLFW build will produce a warning in {@code DEBUG} mode (but not an error).</p>
     *
     * @param path the OpenGL ES shared library path, or {@code null} to remove the override.
     */
    public static void setGLESPath(@Nullable String path) {
        if (!override("_glfw_opengles_library", path)) {
            apiLog("GLFW OpenGL ES path override not set: Could not resolve override symbol.");
        }
    }

    private static boolean override(String symbol, @Nullable String path) {
        long override = GLFW.getLibrary().getFunctionAddress(symbol);
        if (override == NULL) {
            return false;
        }

        long a = memGetAddress(override);
        if (a != NULL) {
            nmemFree(a);
        }
        memPutAddress(override, path == null ? NULL : memAddress(memUTF8(path)));
        return true;
    }""")
}