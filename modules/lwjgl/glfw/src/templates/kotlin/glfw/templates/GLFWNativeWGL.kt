/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import core.windows.*

val GLFWNativeWGL = "GLFWNativeWGL".nativeClass(Module.GLFW, nativeSubPath = "windows", prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    javaImport(
        "javax.annotation.*",
        "org.lwjgl.opengl.GL",
        "static org.lwjgl.system.MemoryUtil.*"
    )

    documentation = "Native bindings to the GLFW library's WGL native access functions."

    HGLRC(
        "GetWGLContext",
        """
        Returns the {@code HGLRC} of the specified window.
        
        The {@code HDC} associated with the window can be queried with the
        ${url("https://docs.microsoft.com/en-us/windows/win32/api/winuser/nf-winuser-getdc", "GetDC")} function.
        ${code("""
        HDC dc = GetDC(glfwGetWin32Window(window));""")}
        This DC is private and does not need to be released.

        Note: This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p("window", "the GLFW window"),

        returnDoc =
        """
        the {@code HGLRC} of the specified window, or #NULL if an error occurred.
        
        Possible errors include #NO_WINDOW_CONTEXT and #NOT_INITIALIZED.
        """,
        since = "version 3.0"
    )

    customMethod("""
    /**
     * Calls {@link #setPath(String)} with the path of the specified {@link SharedLibrary}.
     * 
     * <p>Example usage: ${code("GLFWNativeWGL.setPath(GL.getFunctionProvider());")}</p> 
     *
     * @param sharedLibrary a {@code FunctionProvider} instance that will be cast to {@code SharedLibrary}
     */
    public static void setPath(FunctionProvider sharedLibrary) {
        if (!(sharedLibrary instanceof SharedLibrary)) {
            apiLog("GLFW OpenGL path override not set: Function provider is not a shared library.");
            return;
        }

        String path = ((SharedLibrary)sharedLibrary).getPath();
        if (path == null) {
            apiLog("GLFW OpenGL path override not set: Could not resolve the shared library path.");
            return;
        }

        setPath(path);
    }

    /**
     * Overrides the OpenGL shared library that GLFW loads internally.
     *
     * <p>This is useful when there's a mismatch between the shared libraries loaded by LWJGL and GLFW.</p>
     *
     * <p>This method must be called before GLFW initializes OpenGL. The override is available only in the default GLFW build bundled with LWJGL. Using the
     * override with a custom GLFW build will produce a warning in {@code DEBUG} mode (but not an error).</p>
     *
     * @param path the OpenGL shared library path, or {@code null} to remove the override.
     */
    public static void setPath(@Nullable String path) {
        long override = GLFW.getLibrary().getFunctionAddress("_glfw_opengl_library");
        if (override == NULL) {
            apiLog("GLFW OpenGL path override not set: Could not resolve override symbol.");
            return;
        }

        long a = memGetAddress(override);
        if (a != NULL) {
            nmemFree(a);
        }
        memPutAddress(override, path == null ? NULL : memAddress(memUTF16(path)));
    }""")
}