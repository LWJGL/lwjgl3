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

/** Native bindings to the GLFW library's WGL native access functions. */
public class GLFWNativeWGL {

    protected GLFWNativeWGL() {
        throw new UnsupportedOperationException();
    }

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetWGLContext = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWGLContext");

    }

    // --- [ glfwGetWGLContext ] ---

    /**
     * Returns the {@code HGLRC} of the specified window.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the GLFW window
     *
     * @return The {@code HGLRC} of the specified window, or {@code NULL} if an error occurred.
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

}