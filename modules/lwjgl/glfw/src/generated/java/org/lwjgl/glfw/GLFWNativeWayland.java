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

public class GLFWNativeWayland {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetWaylandDisplay = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWaylandDisplay"),
            GetWaylandMonitor = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWaylandMonitor"),
            GetWaylandWindow  = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetWaylandWindow");

    }

    protected GLFWNativeWayland() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwGetWaylandDisplay ] ---

    /** {@code struct wl_display * glfwGetWaylandDisplay(void)} */
    @NativeType("struct wl_display *")
    public static long glfwGetWaylandDisplay() {
        long __functionAddress = Functions.GetWaylandDisplay;
        return invokeP(__functionAddress);
    }

    // --- [ glfwGetWaylandMonitor ] ---

    /** {@code struct wl_output * glfwGetWaylandMonitor(GLFWmonitor * monitor)} */
    @NativeType("struct wl_output *")
    public static long glfwGetWaylandMonitor(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetWaylandMonitor;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    // --- [ glfwGetWaylandWindow ] ---

    /** {@code struct wl_surface * glfwGetWaylandWindow(GLFWwindow * window)} */
    @NativeType("struct wl_surface *")
    public static long glfwGetWaylandWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWaylandWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

}