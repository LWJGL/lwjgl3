/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the GLFW library's Win32 native access functions. */
public class GLFWNativeWin32 {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetWin32Adapter   = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Adapter"),
            GetWin32Monitor   = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Monitor"),
            GetWin32Window    = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWin32Window"),
            AttachWin32Window = apiGetFunctionAddress(GLFW.getLibrary(), "glfwAttachWin32Window");

    }

    protected GLFWNativeWin32() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwGetWin32Adapter ] ---

    /** Unsafe version of: {@link #glfwGetWin32Adapter GetWin32Adapter} */
    public static long nglfwGetWin32Adapter(long monitor) {
        long __functionAddress = Functions.GetWin32Adapter;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    /**
     * Returns the adapter device name of the specified monitor.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the GLFW monitor
     *
     * @return the UTF-8 encoded adapter device name (for example `\\.\DISPLAY1`) of the specified monitor, or {@code NULL} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.1
     */
    @Nullable
    @NativeType("char const *")
    public static String glfwGetWin32Adapter(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetWin32Adapter(monitor);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetWin32Monitor ] ---

    /** Unsafe version of: {@link #glfwGetWin32Monitor GetWin32Monitor} */
    public static long nglfwGetWin32Monitor(long monitor) {
        long __functionAddress = Functions.GetWin32Monitor;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    /**
     * Returns the display device name of the specified monitor.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the GLFW monitor
     *
     * @return the UTF-8 encoded display device name (for example `\\.\DISPLAY1\Monitor0`) of the specified monitor, or {@code NULL} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.1
     */
    @Nullable
    @NativeType("char const *")
    public static String glfwGetWin32Monitor(@NativeType("GLFWmonitor *") long monitor) {
        long __result = nglfwGetWin32Monitor(monitor);
        return memUTF8Safe(__result);
    }

    // --- [ glfwGetWin32Window ] ---

    /**
     * Returns the {@code HWND} of the specified window.
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
     * @return the {@code HWND} of the specified window, or {@code NULL} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.0
     */
    @NativeType("HWND")
    public static long glfwGetWin32Window(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWin32Window;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwAttachWin32Window ] ---

    /**
     * Wraps an existing {@code HWND} in a new GLFW window object.
     * 
     * <p>This function creates a GLFW window object and its associated OpenGL or OpenGL ES context for an existing {@code HWND}. The {@code HWND} is not
     * destroyed by GLFW.</p>
     * 
     * <p>This function may be called from any thread.</p>
     * 
     * <p><b>LWJGL</b>: This functionality is experimental and not officially supported by GLFW yet.</p>
     *
     * @param handle the {@code HWND} to attach to the window object
     * @param share  the window whose context to share resources with, or {@code NULL} to not share resources
     *
     * @return the handle of the created window, or {@code NULL} if an error occurred
     *
     * @since version 3.3
     */
    @NativeType("GLFWwindow *")
    public static long glfwAttachWin32Window(@NativeType("HWND") long handle, @NativeType("GLFWwindow *") long share) {
        long __functionAddress = Functions.AttachWin32Window;
        if (CHECKS) {
            check(handle);
        }
        return invokePPP(handle, share, __functionAddress);
    }

}