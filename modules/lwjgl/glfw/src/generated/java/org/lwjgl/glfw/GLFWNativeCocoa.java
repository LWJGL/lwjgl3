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

/** Native bindings to the GLFW library's Cocoa native access functions. */
public class GLFWNativeCocoa {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetCocoaMonitor = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetCocoaMonitor"),
            GetCocoaWindow  = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetCocoaWindow");

    }

    protected GLFWNativeCocoa() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwGetCocoaMonitor ] ---

    /**
     * Returns the {@code CGDirectDisplayID} of the specified monitor.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param monitor the GLFW monitor
     *
     * @return the {@code CGDirectDisplayID} of the specified monitor, or {@code kCGNullDirectDisplay} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.1
     */
    @NativeType("CGDirectDisplayID")
    public static int glfwGetCocoaMonitor(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetCocoaMonitor;
        if (CHECKS) {
            check(monitor);
        }
        return invokePI(monitor, __functionAddress);
    }

    // --- [ glfwGetCocoaWindow ] ---

    /**
     * Returns the {@code NSWindow} of the specified GLFW window.
     * 
     * <p>Note: This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the GLFW window
     *
     * @return the {@code NSWindow} of the specified window, or nil if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.0
     */
    @NativeType("id")
    public static long glfwGetCocoaWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetCocoaWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

}