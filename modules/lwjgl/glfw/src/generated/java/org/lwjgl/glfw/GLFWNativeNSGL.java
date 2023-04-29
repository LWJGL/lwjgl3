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

}