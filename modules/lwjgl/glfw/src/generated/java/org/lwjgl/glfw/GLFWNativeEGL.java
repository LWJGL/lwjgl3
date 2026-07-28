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

public class GLFWNativeEGL {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetEGLDisplay = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetEGLDisplay"),
            GetEGLContext = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetEGLContext"),
            GetEGLSurface = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetEGLSurface"),
            GetEGLConfig  = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetEGLConfig");

    }

    protected GLFWNativeEGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwGetEGLDisplay ] ---

    /** {@code EGLDisplay glfwGetEGLDisplay(void)} */
    @NativeType("EGLDisplay")
    public static long glfwGetEGLDisplay() {
        long __functionAddress = Functions.GetEGLDisplay;
        return invokeP(__functionAddress);
    }

    // --- [ glfwGetEGLContext ] ---

    /** {@code EGLContext glfwGetEGLContext(GLFWwindow * window)} */
    @NativeType("EGLContext")
    public static long glfwGetEGLContext(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetEGLContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwGetEGLSurface ] ---

    /** {@code EGLSurface glfwGetEGLSurface(GLFWwindow * window)} */
    @NativeType("EGLSurface")
    public static long glfwGetEGLSurface(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetEGLSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwGetEGLConfig ] ---

    /** {@code int glfwGetEGLConfig(GLFWwindow * window, EGLConfig * config)} */
    public static int nglfwGetEGLConfig(long window, long config) {
        long __functionAddress = Functions.GetEGLConfig;
        if (CHECKS) {
            check(window);
        }
        return invokePPI(window, config, __functionAddress);
    }

    /** {@code int glfwGetEGLConfig(GLFWwindow * window, EGLConfig * config)} */
    @NativeType("int")
    public static boolean glfwGetEGLConfig(@NativeType("GLFWwindow *") long window, @NativeType("EGLConfig *") PointerBuffer config) {
        if (CHECKS) {
            check(config, 1);
        }
        return nglfwGetEGLConfig(window, memAddress(config)) != 0;
    }

    /**
     * Calls {@link #setEGLPath(String)} with the path of the specified {@link SharedLibrary}.
     * 
     * <p>Example usage: {@code GLFWNativeEGL.setEGLPath(EGL.getFunctionProvider());}</p> 
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
     * <p>Example usage: {@code GLFWNativeEGL.setGLESPath(GLES.getFunctionProvider());}</p> 
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
    }

}