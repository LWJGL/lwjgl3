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

public class GLFWNativeCocoa {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetCocoaMonitor = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetCocoaMonitor"),
            GetCocoaWindow  = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetCocoaWindow"),
            GetCocoaView    = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetCocoaView");

    }

    protected GLFWNativeCocoa() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwGetCocoaMonitor ] ---

    /** {@code CGDirectDisplayID glfwGetCocoaMonitor(GLFWmonitor * monitor)} */
    @NativeType("CGDirectDisplayID")
    public static int glfwGetCocoaMonitor(@NativeType("GLFWmonitor *") long monitor) {
        long __functionAddress = Functions.GetCocoaMonitor;
        if (CHECKS) {
            check(monitor);
        }
        return invokePI(monitor, __functionAddress);
    }

    // --- [ glfwGetCocoaWindow ] ---

    /** {@code id glfwGetCocoaWindow(GLFWwindow * window)} */
    @NativeType("id")
    public static long glfwGetCocoaWindow(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetCocoaWindow;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    // --- [ glfwGetCocoaView ] ---

    /** {@code id glfwGetCocoaView(GLFWwindow * window)} */
    @NativeType("id")
    public static long glfwGetCocoaView(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetCocoaView;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

}