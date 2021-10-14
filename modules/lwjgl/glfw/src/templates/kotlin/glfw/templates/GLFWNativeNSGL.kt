/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.macos.*

val GLFWNativeNSGL = "GLFWNativeNSGL".nativeClass(Module.GLFW, nativeSubPath = "macos", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    javaImport(
        "javax.annotation.*",
        "org.lwjgl.opengl.GL",
        "org.lwjgl.system.macosx.*",
        "static org.lwjgl.system.MemoryUtil.*"
    )

    documentation = "Native bindings to the GLFW library's NSGL native access functions."

    id(
        "GetNSGLContext",
        """
        Returns the {@code NSOpenGLContext} of the specified GLFW window.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p("window", "the GLFW window"),

        returnDoc =
        """
        the {@code NSOpenGLContext} of the specified window, or nil if an error occurred.
        
        Possible errors include #NO_WINDOW_CONTEXT and #NOT_INITIALIZED.
        """,
        since = "version 3.0"
    )

    customMethod("""
    /** Calls {@link #setFramework(String)} with the OpenGL framework loaded by LWJGL. */
    public static void setFrameworkLWJGL() {
        FunctionProvider fp = GL.getFunctionProvider();
        if (!(fp instanceof MacOSXLibraryBundle)) {
            apiLog("GLFW OpenGL path override not set: OpenGL function provider is not a framework.");
            return;

        }

        setFramework(((MacOSXLibraryBundle)fp).getName());
    }

    /**
     * Overrides the OpenGL framework that GLFW loads internally.
     *
     * <p>This is useful when there's a mismatch between the frameworks loaded by LWJGL and GLFW.</p>
     *
     * <p>This method must be called before GLFW initializes OpenGL. The override is available only in the default GLFW build bundled with LWJGL. Using the
     * override with a custom GLFW build will produce a warning in {@code DEBUG} mode (but not an error).</p>
     *
     * @param path the OpenGL framework, or {@code null} to remove the override.
     */
    public static void setFramework(@Nullable String path) {
        long override = GLFW.getLibrary().getFunctionAddress("_glfw_opengl_library");
        if (override == NULL) {
            apiLog("GLFW OpenGL path override not set: Could not resolve override symbol.");
            return;
        }

        long a = memGetAddress(override);
        if (a != NULL) {
            nmemFree(a);
        }
        memPutAddress(override, path == null ? NULL : memAddress(memUTF8(path)));
    }""")
}