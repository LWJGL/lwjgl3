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

import org.jspecify.annotations.*;
import org.lwjgl.system.macosx.*;

import static org.lwjgl.system.MemoryUtil.*;

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

    /** {@code id glfwGetNSGLContext(GLFWwindow * window)} */
    @NativeType("id")
    public static long glfwGetNSGLContext(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetNSGLContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

}