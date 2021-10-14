/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import opengl.*

val GLFWNativeOSMesa = "GLFWNativeOSMesa".nativeClass(Module.GLFW, prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    javaImport(
        "javax.annotation.*",
        "org.lwjgl.opengl.GL",
        "static org.lwjgl.system.MemoryUtil.*"
    )

    documentation = "Native bindings to the GLFW library's GLX native access functions."

    intb(
        "GetOSMesaColorBuffer",
        """
        Retrieves the color buffer associated with the specified window.

        This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p("window", "the window whose color buffer to retrieve"),
        nullable..Check(1)..int.p("width", "where to store the width of the color buffer, or #NULL"),
        nullable..Check(1)..int.p("height", "where to store the height of the color buffer, or #NULL"),
        nullable..Check(1)..int.p("format", "where to store the OSMesa pixel format of the color buffer, or #NULL"),
        nullable..Check(1)..void.p.p("buffer", "where to store the address of the color buffer, or #NULL"),

        returnDoc =
        """
        #TRUE if successful, or #FALSE if an error occurred.
        
        Possible errors include #NO_WINDOW_CONTEXT and #NOT_INITIALIZED.
        """,
        since = "version 3.3"
    )

    int(
        "GetOSMesaDepthBuffer",
        """
        Retrieves the depth buffer associated with the specified window.

        This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p("window", "the window whose depth buffer to retrieve"),
        nullable..Check(1)..int.p("width", "where to store the width of the depth buffer, or #NULL"),
        nullable..Check(1)..int.p("height", "where to store the height of the depth buffer, or #NULL"),
        nullable..Check(1)..int.p("bytesPerValue", "where to store the number of bytes per depth buffer element, or #NULL"),
        nullable..Check(1)..void.p.p("buffer", "where to store the address of the depth buffer, or #NULL"),

        returnDoc =
        """
        #TRUE if successful, or #FALSE if an error occurred.
        
        Possible errors include #NO_WINDOW_CONTEXT and #NOT_INITIALIZED.
        """,
        since = "version 3.3"
    )

    "OSMesaContext".handle(
        "GetOSMesaContext",
        """
        Returns the {@code OSMesaContext} of the specified window.

        This function may be called from any thread. Access is not synchronized.
        """,

        GLFWwindow.p("window", "the window whose context to retrieve"),

        returnDoc =
        """
        the {@code OSMesaContext} of the specified window, or #NULL if an error occurred.
        
        Possible errors include #NO_WINDOW_CONTEXT and #NOT_INITIALIZED.
        """,
        since = "version 3.3"
    )

    customMethod("""
    /**
     * Calls {@link #setPath(String)} with the path of the specified {@link SharedLibrary}.
     * 
     * <p>Example usage: ${code("GLFWNativeOSMesa.setPath(GL.getFunctionProvider());")}</p> 
     *
     * @param sharedLibrary a {@code FunctionProvider} instance that will be cast to {@code SharedLibrary}
     */
    public static void setPath(FunctionProvider sharedLibrary) {
        if (!(sharedLibrary instanceof SharedLibrary)) {
            apiLog("GLFW OSMesa path override not set: Function provider is not a shared library.");
            return;
        }

        String path = ((SharedLibrary)sharedLibrary).getPath();
        if (path == null) {
            apiLog("GLFW OSMesa path override not set: Could not resolve the OSMesa shared library path.");
            return;
        }

        setPath(path);
    }

    /**
     * Overrides the OSMesa shared library that GLFW loads internally.
     *
     * <p>This is useful when there's a mismatch between the shared libraries loaded by LWJGL and GLFW.</p>
     *
     * <p>This method must be called before GLFW initializes OpenGL. The override is available only in the default GLFW build bundled with LWJGL. Using the
     * override with a custom GLFW build will produce a warning in {@code DEBUG} mode (but not an error).</p>
     *
     * @param path the OSMesa shared library path, or {@code null} to remove the override.
     */
    public static void setPath(@Nullable String path) {
        long override = GLFW.getLibrary().getFunctionAddress("_glfw_mesa_library");
        if (override == NULL) {
            apiLog("GLFW OSMesa path override not set: Could not resolve override symbol.");
            return;
        }

        long a = memGetAddress(override);
        if (a != NULL) {
            nmemFree(a);
        }
        memPutAddress(override, path == null ? NULL : memAddress(memUTF8(path)));
    }""")
}