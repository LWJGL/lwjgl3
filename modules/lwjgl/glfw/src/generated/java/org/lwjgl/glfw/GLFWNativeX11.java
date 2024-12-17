/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class GLFWNativeX11 {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetX11Display         = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Display"),
            GetX11Adapter         = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Adapter"),
            GetX11Monitor         = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Monitor"),
            GetX11Window          = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11Window"),
            SetX11SelectionString = apiGetFunctionAddress(GLFW.getLibrary(), "glfwSetX11SelectionString"),
            GetX11SelectionString = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetX11SelectionString");

    }

    protected GLFWNativeX11() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwGetX11Display ] ---

    /** {@code Display * glfwGetX11Display(void)} */
    @NativeType("Display *")
    public static long glfwGetX11Display() {
        long __functionAddress = Functions.GetX11Display;
        return invokeP(__functionAddress);
    }

    // --- [ glfwGetX11Adapter ] ---

    /** {@code RRCrtc glfwGetX11Adapter(GLFWmonitor * monitor)} */
    @NativeType("RRCrtc")
    public static long glfwGetX11Adapter(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetX11Adapter;
        if (CHECKS) {
            check(monitor);
        }
        return invokePN(monitor, __functionAddress);
    }

    // --- [ glfwGetX11Monitor ] ---

    /** {@code RROutput glfwGetX11Monitor(GLFWmonitor * monitor)} */
    @NativeType("RROutput")
    public static long glfwGetX11Monitor(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetX11Monitor;
        if (CHECKS) {
            check(monitor);
        }
        return invokePN(monitor, __functionAddress);
    }

    // --- [ glfwGetX11Window ] ---

    /** {@code Window glfwGetX11Window(GLFWwindow * window)} */
    @NativeType("Window")
    public static long glfwGetX11Window(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetX11Window;
        if (CHECKS) {
            check(window);
        }
        return invokePN(window, __functionAddress);
    }

    // --- [ glfwSetX11SelectionString ] ---

    /** {@code void glfwSetX11SelectionString(char const * string)} */
    public static void nglfwSetX11SelectionString(long string) {
        long __functionAddress = Functions.SetX11SelectionString;
        invokePV(string, __functionAddress);
    }

    /** {@code void glfwSetX11SelectionString(char const * string)} */
    public static void glfwSetX11SelectionString(@NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        nglfwSetX11SelectionString(memAddress(string));
    }

    /** {@code void glfwSetX11SelectionString(char const * string)} */
    public static void glfwSetX11SelectionString(@NativeType("char const *") CharSequence string) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(string, true);
            long stringEncoded = stack.getPointerAddress();
            nglfwSetX11SelectionString(stringEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwGetX11SelectionString ] ---

    /** {@code char const * glfwGetX11SelectionString(void)} */
    public static long nglfwGetX11SelectionString() {
        long __functionAddress = Functions.GetX11SelectionString;
        return invokeP(__functionAddress);
    }

    /** {@code char const * glfwGetX11SelectionString(void)} */
    @NativeType("char const *")
    public static @Nullable String glfwGetX11SelectionString() {
        long __result = nglfwGetX11SelectionString();
        return memUTF8Safe(__result);
    }

}