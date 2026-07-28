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
        "org.jspecify.annotations.*",
        "static org.lwjgl.system.MemoryUtil.*"
    )

    EGLDisplay(
        "GetEGLDisplay",
        void()
    )

    EGLContext(
        "GetEGLContext",

        GLFWwindow.p("window")
    )

    EGLSurface(
        "GetEGLSurface",

        GLFWwindow.p("window")
    )

    intb(
        "GetEGLConfig",

        GLFWwindow.p("window"),
        Check(1)..EGLConfig.p("config")
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
            getAllocator().free(a);
            a = NULL;
        }

        if (path != null) {
            int length = memLengthUTF8(path, true);

            a = getAllocator().malloc(length);
            memUTF8(path, true, memByteBuffer(a, length));
        }

        memPutAddress(override, a);
        return true;
    }""")
}