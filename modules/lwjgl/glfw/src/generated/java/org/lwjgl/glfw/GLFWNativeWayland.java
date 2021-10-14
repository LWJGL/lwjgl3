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

/** Native bindings to the GLFW library's Wayland native access functions. */
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

    /**
     * Returns the {@code struct wl_display*} used by GLFW.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @return the {@code struct wl_display*} used by GLFW, or {@code NULL} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.2
     */
    @NativeType("struct wl_display *")
    public static long glfwGetWaylandDisplay() {
        long __functionAddress = Functions.GetWaylandDisplay;
        return invokeP(__functionAddress);
    }

    // --- [ glfwGetWaylandMonitor ] ---

    /**
     * Returns the {@code struct wl_output*} of the specified monitor.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @return the {@code struct wl_output*} of the specified monitor, or {@code NULL} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.2
     */
    @NativeType("struct wl_output *")
    public static long glfwGetWaylandMonitor(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetWaylandMonitor;
        if (CHECKS) {
            check(monitor);
        }
        return invokePP(monitor, __functionAddress);
    }

    // --- [ glfwGetWaylandWindow ] ---

    /**
     * Returns the main {@code struct wl_surface*} of the specified window.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @return the main {@code struct wl_surface*} of the specified window, or {@code NULL} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.2
     */
    @NativeType("struct wl_surface *")
    public static long glfwGetWaylandWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetWaylandWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

}