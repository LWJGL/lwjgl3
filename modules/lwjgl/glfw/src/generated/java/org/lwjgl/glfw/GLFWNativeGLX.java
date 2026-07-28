/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.jspecify.annotations.*;

import static org.lwjgl.system.MemoryUtil.*;

public class GLFWNativeGLX {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetGLXContext  = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetGLXContext"),
            GetGLXWindow   = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetGLXWindow"),
            GetGLXFBConfig = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetGLXFBConfig");

    }

    protected GLFWNativeGLX() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwGetGLXContext ] ---

    /** {@code GLXContext glfwGetGLXContext(GLFWwindow * window)} */
    @NativeType("GLXContext")
    public static long glfwGetGLXContext(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetGLXContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwGetGLXWindow ] ---

    /** {@code GLXWindow glfwGetGLXWindow(GLFWwindow * window)} */
    @NativeType("GLXWindow")
    public static long glfwGetGLXWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetGLXWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwGetGLXFBConfig ] ---

    /** {@code int glfwGetGLXFBConfig(GLFWwindow * window, GLXFBConfig * config)} */
    public static int nglfwGetGLXFBConfig(long window, long config) {
        long __functionAddress = Functions.GetGLXFBConfig;
        if (CHECKS) {
            check(window);
        }
        return invokePPI(window, config, __functionAddress);
    }

    /** {@code int glfwGetGLXFBConfig(GLFWwindow * window, GLXFBConfig * config)} */
    @NativeType("int")
    public static boolean glfwGetGLXFBConfig(@NativeType("GLFWwindow *") long window, @NativeType("GLXFBConfig *") PointerBuffer config) {
        if (CHECKS) {
            check(config, 1);
        }
        return nglfwGetGLXFBConfig(window, memAddress(config)) != 0;
    }

    /**
     * Calls {@link #setPath(String)} with the path of the specified {@link SharedLibrary}.
     *
     * <p>Example usage: <code>GLFWNativeGLX.setPath(GL.getFunctionProvider());</code></p>
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
            getAllocator().free(a);
            a = NULL;
        }

        if (path != null) {
            int length = memLengthUTF8(path, true);

            a = getAllocator().malloc(length);
            memUTF8(path, true, memByteBuffer(a, length));
        }

        memPutAddress(override, a);
    }

}