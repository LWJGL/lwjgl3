/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the GLFW library's X11 native access functions. */
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

    /**
     * Returns the {@code Display} used by GLFW.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @return the {@code Display} used by GLFW, or {@code NULL} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.0
     */
    @NativeType("Display *")
    public static long glfwGetX11Display() {
        long __functionAddress = Functions.GetX11Display;
        return invokeP(__functionAddress);
    }

    // --- [ glfwGetX11Adapter ] ---

    /**
     * Returns the {@code RRCrtc} of the specified monitor.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the GLFW monitor
     *
     * @return the {@code RRCrtc} of the specified monitor, or {@code None} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.1
     */
    @NativeType("RRCrtc")
    public static long glfwGetX11Adapter(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetX11Adapter;
        if (CHECKS) {
            check(monitor);
        }
        return invokePN(monitor, __functionAddress);
    }

    // --- [ glfwGetX11Monitor ] ---

    /**
     * Returns the {@code RROutput} of the specified monitor.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the GLFW monitor
     *
     * @return the {@code RROutput} of the specified monitor, or {@code None} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.1
     */
    @NativeType("RROutput")
    public static long glfwGetX11Monitor(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetX11Monitor;
        if (CHECKS) {
            check(monitor);
        }
        return invokePN(monitor, __functionAddress);
    }

    // --- [ glfwGetX11Window ] ---

    /**
     * Returns the {@code Window} of the specified window.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window a GLFW window
     *
     * @return the {@code Window} of the specified window, or {@code None} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.0
     */
    @NativeType("Window")
    public static long glfwGetX11Window(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetX11Window;
        if (CHECKS) {
            check(window);
        }
        return invokePN(window, __functionAddress);
    }

    // --- [ glfwSetX11SelectionString ] ---

    /** Unsafe version of: {@link #glfwSetX11SelectionString SetX11SelectionString} */
    public static void nglfwSetX11SelectionString(long string) {
        long __functionAddress = Functions.SetX11SelectionString;
        invokePV(string, __functionAddress);
    }

    /**
     * Sets the current primary selection to the specified string.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param string a UTF-8 encoded string. The specified string is copied before this function returns.
     *
     * @since version 3.3
     */
    public static void glfwSetX11SelectionString(@NativeType("char const *") ByteBuffer string) {
        if (CHECKS) {
            checkNT1(string);
        }
        nglfwSetX11SelectionString(memAddress(string));
    }

    /**
     * Sets the current primary selection to the specified string.
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param string a UTF-8 encoded string. The specified string is copied before this function returns.
     *
     * @since version 3.3
     */
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

    /** Unsafe version of: {@link #glfwGetX11SelectionString GetX11SelectionString} */
    public static long nglfwGetX11SelectionString() {
        long __functionAddress = Functions.GetX11SelectionString;
        return invokeP(__functionAddress);
    }

    /**
     * Returns the contents of the current primary selection as a string.
     * 
     * <p>If the selection is empty or if its contents cannot be converted, {@code NULL} is returned and a {@link GLFW#GLFW_FORMAT_UNAVAILABLE FORMAT_UNAVAILABLE} error is generated.</p>
     * 
     * <p>The returned string is allocated and freed by GLFW. You should not free it yourself. It is valid until the next call to {@link #glfwGetX11SelectionString GetX11SelectionString} or
     * {@link #glfwSetX11SelectionString SetX11SelectionString}, or until the library is terminated.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @return the contents of the selection as a UTF-8 encoded string, or {@code NULL} if an error occurred
     *
     * @since version 3.3
     */
    @Nullable
    @NativeType("char const *")
    public static String glfwGetX11SelectionString() {
        long __result = nglfwGetX11SelectionString();
        return memUTF8Safe(__result);
    }

}