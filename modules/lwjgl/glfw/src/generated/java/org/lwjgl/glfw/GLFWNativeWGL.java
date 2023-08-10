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

import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the GLFW library's WGL native access functions. */
public class GLFWNativeWGL {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetWGLContext = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWGLContext");

    }

    protected GLFWNativeWGL() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwGetWGLContext ] ---

    /**
     * Returns the {@code HGLRC} of the specified window.
     * 
     * <p>The {@code HDC} associated with the window can be queried with the
     * <a href="https://docs.microsoft.com/en-us/windows/win32/api/winuser/nf-winuser-getdc">GetDC</a> function.
     * <code>
     * HDC dc = GetDC(glfwGetWin32Window(window));</code>
     * This DC is private and does not need to be released.</p>
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the GLFW window
     *
     * @return the {@code HGLRC} of the specified window, or {@code NULL} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} and {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.0
     */
    @NativeType("HGLRC")
    public static long glfwGetWGLContext(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWGLContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /**
     * Calls {@link #setPath(String)} with the path of the specified {@link SharedLibrary}.
     * 
     * <p>Example usage: <code>GLFWNativeWGL.setPath(GL.getFunctionProvider());</code></p> 
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
    }

}