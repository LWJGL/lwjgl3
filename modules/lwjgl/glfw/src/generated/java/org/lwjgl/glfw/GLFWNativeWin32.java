/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GLFWNativeWin32 {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetWin32Adapter   = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Adapter"),
            GetWin32Monitor   = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Monitor"),
            GetWin32Window    = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Window"),
            AttachWin32Window = apiGetFunctionAddressOptional(GLFW.getLibrary(), "glfwAttachWin32Window");

    }

    protected GLFWNativeWin32() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwGetWin32Adapter ] ---

    /** {@code char const * glfwGetWin32Adapter(GLFWmonitor * monitor)} */
    public static long nglfwGetWin32Adapter(long monitor) {
        long __functionAddress = Functions.GetWin32Adapter;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    /** {@code char const * glfwGetWin32Adapter(GLFWmonitor * monitor)} */
    @NativeType("char const *")
    public static @Nullable String glfwGetWin32Adapter(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetWin32Adapter(monitor);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetWin32Monitor ] ---

    /** {@code char const * glfwGetWin32Monitor(GLFWmonitor * monitor)} */
    public static long nglfwGetWin32Monitor(long monitor) {
        long __functionAddress = Functions.GetWin32Monitor;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    /** {@code char const * glfwGetWin32Monitor(GLFWmonitor * monitor)} */
    @NativeType("char const *")
    public static @Nullable String glfwGetWin32Monitor(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetWin32Monitor(monitor);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetWin32Window ] ---

    /** {@code HWND glfwGetWin32Window(GLFWwindow * window)} */
    @NativeType("HWND")
    public static long glfwGetWin32Window(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWin32Window;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwAttachWin32Window ] ---

    /** {@code GLFWwindow * glfwAttachWin32Window(HWND handle, GLFWwindow * share)} */
    @NativeType("GLFWwindow *")
    public static long glfwAttachWin32Window(@NativeType("HWND") long handle, @NativeType("GLFWwindow *") long share) {
        long __functionAddress = Functions.AttachWin32Window;
        if (CHECKS) {
            check(__functionAddress);
            check(handle);
        }
        return invokePPP(handle, share, __functionAddress);
    }

}