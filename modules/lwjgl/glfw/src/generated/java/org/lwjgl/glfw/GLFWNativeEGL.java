/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;

import javax.annotation.*;
import org.lwjgl.egl.EGL;
import org.lwjgl.egl.EGL10;
import org.lwjgl.opengles.GLES;

import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the GLFW library's EGL native access functions. */
public class GLFWNativeEGL {

    protected GLFWNativeEGL() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetEGLDisplay = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetEGLDisplay"),
            GetEGLContext = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetEGLContext"),
            GetEGLSurface = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetEGLSurface");

    }

    // --- [ glfwGetEGLDisplay ] ---

    /**
     * Returns the {@code EGLDisplay} used by GLFW.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @return the {@code EGLDisplay} used by GLFW, or {@link EGL10#EGL_NO_DISPLAY} if an error occured
     *
     * @since version 3.0
     */
    @NativeType("EGLDisplay")
    public static long glfwGetEGLDisplay() {
        long __functionAddress = Functions.GetEGLDisplay;
        return invokeP(__functionAddress);
    }

    // --- [ glfwGetEGLContext ] ---

    /**
     * Returns the {@code EGLContext} of the specified window.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window a GLFW window
     *
     * @return the {@code EGLContext} of the specified window, or {@link EGL10#EGL_NO_CONTEXT} if an error occurred
     *
     * @since version 3.0
     */
    @NativeType("EGLContext")
    public static long glfwGetEGLContext(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetEGLContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwGetEGLSurface ] ---

    /**
     * Returns the {@code EGLSurface} of the specified window.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @return the {@code EGLSurface} of the specified window, or {@link EGL10#EGL_NO_SURFACE} if an error occurred
     *
     * @since version 3.0
     */
    @NativeType("EGLSurface")
    public static long glfwGetEGLSurface(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetEGLSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** Calls {@link #setEGLPath(String)} with the path of the EGL shared library loaded by LWJGL. */
    public static void setEGLPathLWJGL() {
        FunctionProvider fp = EGL.getFunctionProvider();
        if (!(fp instanceof SharedLibrary)) {
            apiLog("GLFW EGL path override not set: EGL function provider is not a shared library.");
            return;

        }

        String path = ((SharedLibrary)fp).getPath();
        if (path == null) {
            apiLog("GLFW EGL path override not set: Could not resolve the EGL shared library path.");
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
    
    /** Calls {@link #setGLESPath(String)} with the path of the OpenGL ES shared library loaded by LWJGL. */
    public static void setGLESPathLWJGL() {
        FunctionProvider fp = GLES.getFunctionProvider();
        if (!(fp instanceof SharedLibrary)) {
            apiLog("GLFW OpenGL ES path override not set: OpenGL ES function provider is not a shared library.");
            return;

        }

        String path = ((SharedLibrary)fp).getPath();
        if (path == null) {
            apiLog("GLFW OpenGL ES path override not set: Could not resolve the OpenGL ES shared library path.");
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
    }

}