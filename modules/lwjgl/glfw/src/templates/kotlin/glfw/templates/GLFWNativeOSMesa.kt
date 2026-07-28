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
        "org.jspecify.annotations.*",
        "static org.lwjgl.system.MemoryUtil.*"
    )

    intb(
        "GetOSMesaColorBuffer",

        GLFWwindow.p("window"),
        nullable..Check(1)..int.p("width"),
        nullable..Check(1)..int.p("height"),
        nullable..Check(1)..int.p("format"),
        nullable..Check(1)..void.p.p("buffer")
    )

    int(
        "GetOSMesaDepthBuffer",

        GLFWwindow.p("window"),
        nullable..Check(1)..int.p("width"),
        nullable..Check(1)..int.p("height"),
        nullable..Check(1)..int.p("bytesPerValue"),
        nullable..Check(1)..void.p.p("buffer")
    )

    "OSMesaContext".handle(
        "GetOSMesaContext",

        GLFWwindow.p("window")
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
            getAllocator().free(a);
            a = NULL;
        }

        if (path != null) {
            int length = memLengthUTF8(path, true);

            a = getAllocator().malloc(length);
            memUTF8(path, true, memByteBuffer(a, length));
        }

        memPutAddress(override, a);
    }""")
}