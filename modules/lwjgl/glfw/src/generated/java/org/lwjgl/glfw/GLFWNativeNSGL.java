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
import org.lwjgl.opengl.GL;
import org.lwjgl.system.macosx.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the GLFW library's NSGL native access functions. */
public class GLFWNativeNSGL {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetNSGLContext = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetNSGLContext");

    }

    protected GLFWNativeNSGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwGetNSGLContext ] ---

    /**
     * Returns the {@code NSOpenGLContext} of the specified GLFW window.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the GLFW window
     *
     * @return the {@code NSOpenGLContext} of the specified window, or nil if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} and {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.0
     */
    @NativeType("id")
    public static long glfwGetNSGLContext(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetNSGLContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

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
    }

}