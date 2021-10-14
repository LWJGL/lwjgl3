/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import javax.annotation.*;
import org.lwjgl.opengl.GL;

import static org.lwjgl.system.MemoryUtil.*;

/** Native bindings to the GLFW library's GLX native access functions. */
public class GLFWNativeOSMesa {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            GetOSMesaColorBuffer = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetOSMesaColorBuffer"),
            GetOSMesaDepthBuffer = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetOSMesaDepthBuffer"),
            GetOSMesaContext     = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetOSMesaContext");

    }

    protected GLFWNativeOSMesa() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwGetOSMesaColorBuffer ] ---

    /** Unsafe version of: {@link #glfwGetOSMesaColorBuffer GetOSMesaColorBuffer} */
    public static int nglfwGetOSMesaColorBuffer(long window, long width, long height, long format, long buffer) {
        long __functionAddress = Functions.GetOSMesaColorBuffer;
        if (CHECKS) {
            check(window);
        }
        return invokePPPPPI(window, width, height, format, buffer, __functionAddress);
    }

    /**
     * Retrieves the color buffer associated with the specified window.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the window whose color buffer to retrieve
     * @param width  where to store the width of the color buffer, or {@code NULL}
     * @param height where to store the height of the color buffer, or {@code NULL}
     * @param format where to store the OSMesa pixel format of the color buffer, or {@code NULL}
     * @param buffer where to store the address of the color buffer, or {@code NULL}
     *
     * @return {@link GLFW#GLFW_TRUE TRUE} if successful, or {@link GLFW#GLFW_FALSE FALSE} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} and {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.3
     */
    @NativeType("int")
    public static boolean glfwGetOSMesaColorBuffer(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") IntBuffer width, @Nullable @NativeType("int *") IntBuffer height, @Nullable @NativeType("int *") IntBuffer format, @Nullable @NativeType("void **") PointerBuffer buffer) {
        if (CHECKS) {
            checkSafe(width, 1);
            checkSafe(height, 1);
            checkSafe(format, 1);
            checkSafe(buffer, 1);
        }
        return nglfwGetOSMesaColorBuffer(window, memAddressSafe(width), memAddressSafe(height), memAddressSafe(format), memAddressSafe(buffer)) != 0;
    }

    // --- [ glfwGetOSMesaDepthBuffer ] ---

    /** Unsafe version of: {@link #glfwGetOSMesaDepthBuffer GetOSMesaDepthBuffer} */
    public static int nglfwGetOSMesaDepthBuffer(long window, long width, long height, long bytesPerValue, long buffer) {
        long __functionAddress = Functions.GetOSMesaDepthBuffer;
        if (CHECKS) {
            check(window);
        }
        return invokePPPPPI(window, width, height, bytesPerValue, buffer, __functionAddress);
    }

    /**
     * Retrieves the depth buffer associated with the specified window.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window        the window whose depth buffer to retrieve
     * @param width         where to store the width of the depth buffer, or {@code NULL}
     * @param height        where to store the height of the depth buffer, or {@code NULL}
     * @param bytesPerValue where to store the number of bytes per depth buffer element, or {@code NULL}
     * @param buffer        where to store the address of the depth buffer, or {@code NULL}
     *
     * @return {@link GLFW#GLFW_TRUE TRUE} if successful, or {@link GLFW#GLFW_FALSE FALSE} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} and {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.3
     */
    public static int glfwGetOSMesaDepthBuffer(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") IntBuffer width, @Nullable @NativeType("int *") IntBuffer height, @Nullable @NativeType("int *") IntBuffer bytesPerValue, @Nullable @NativeType("void **") PointerBuffer buffer) {
        if (CHECKS) {
            checkSafe(width, 1);
            checkSafe(height, 1);
            checkSafe(bytesPerValue, 1);
            checkSafe(buffer, 1);
        }
        return nglfwGetOSMesaDepthBuffer(window, memAddressSafe(width), memAddressSafe(height), memAddressSafe(bytesPerValue), memAddressSafe(buffer));
    }

    // --- [ glfwGetOSMesaContext ] ---

    /**
     * Returns the {@code OSMesaContext} of the specified window.
     * 
     * <p>This function may be called from any thread. Access is not synchronized.</p>
     *
     * @param window the window whose context to retrieve
     *
     * @return the {@code OSMesaContext} of the specified window, or {@code NULL} if an error occurred.
     *         
     *         <p>Possible errors include {@link GLFW#GLFW_NO_WINDOW_CONTEXT NO_WINDOW_CONTEXT} and {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     *
     * @since version 3.3
     */
    @NativeType("OSMesaContext")
    public static long glfwGetOSMesaContext(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetOSMesaContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** Array version of: {@link #glfwGetOSMesaColorBuffer GetOSMesaColorBuffer} */
    @NativeType("int")
    public static boolean glfwGetOSMesaColorBuffer(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") int[] width, @Nullable @NativeType("int *") int[] height, @Nullable @NativeType("int *") int[] format, @Nullable @NativeType("void **") PointerBuffer buffer) {
        long __functionAddress = Functions.GetOSMesaColorBuffer;
        if (CHECKS) {
            check(window);
            checkSafe(width, 1);
            checkSafe(height, 1);
            checkSafe(format, 1);
            checkSafe(buffer, 1);
        }
        return invokePPPPPI(window, width, height, format, memAddressSafe(buffer), __functionAddress) != 0;
    }

    /** Array version of: {@link #glfwGetOSMesaDepthBuffer GetOSMesaDepthBuffer} */
    public static int glfwGetOSMesaDepthBuffer(@NativeType("GLFWwindow *") long window, @Nullable @NativeType("int *") int[] width, @Nullable @NativeType("int *") int[] height, @Nullable @NativeType("int *") int[] bytesPerValue, @Nullable @NativeType("void **") PointerBuffer buffer) {
        long __functionAddress = Functions.GetOSMesaDepthBuffer;
        if (CHECKS) {
            check(window);
            checkSafe(width, 1);
            checkSafe(height, 1);
            checkSafe(bytesPerValue, 1);
            checkSafe(buffer, 1);
        }
        return invokePPPPPI(window, width, height, bytesPerValue, memAddressSafe(buffer), __functionAddress);
    }

    /**
     * Calls {@link #setPath(String)} with the path of the specified {@link SharedLibrary}.
     * 
     * <p>Example usage: <code>GLFWNativeOSMesa.setPath(GL.getFunctionProvider());</code></p> 
     *
     * @param sharedLibrary a {@code FunctionProvider} instance that will be cast to {@code SharedLibrary}
     */
    public static void setPath(FunctionProvider sharedLibrary) {
        if (!(sharedLibrary instanceof SharedLibrary)) {
            apiLog("GLFW OSMesa path override not set: Function provider is not a shared library.");
            return;
        }

        String path = ((SharedLibrary)sharedLibrary).getPath();
        if (path == null) {
            apiLog("GLFW OSMesa path override not set: Could not resolve the OSMesa shared library path.");
            return;
        }

        setPath(path);
    }

    /**
     * Overrides the OSMesa shared library that GLFW loads internally.
     *
     * <p>This is useful when there's a mismatch between the shared libraries loaded by LWJGL and GLFW.</p>
     *
     * <p>This method must be called before GLFW initializes OpenGL. The override is available only in the default GLFW build bundled with LWJGL. Using the
     * override with a custom GLFW build will produce a warning in {@code DEBUG} mode (but not an error).</p>
     *
     * @param path the OSMesa shared library path, or {@code null} to remove the override.
     */
    public static void setPath(@Nullable String path) {
        long override = GLFW.getLibrary().getFunctionAddress("_glfw_mesa_library");
        if (override == NULL) {
            apiLog("GLFW OSMesa path override not set: Could not resolve override symbol.");
            return;
        }

        long a = memGetAddress(override);
        if (a != NULL) {
            nmemFree(a);
        }
        memPutAddress(override, path == null ? NULL : memAddress(memUTF8(path)));
    }

}