/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.jspecify.annotations.*;

import static org.lwjgl.system.MemoryUtil.*;

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

    /** {@code int glfwGetOSMesaColorBuffer(GLFWwindow * window, int * width, int * height, int * format, void ** buffer)} */
    public static int nglfwGetOSMesaColorBuffer(long window, long width, long height, long format, long buffer) {
        long __functionAddress = Functions.GetOSMesaColorBuffer;
        if (CHECKS) {
            check(window);
        }
        return invokePPPPPI(window, width, height, format, buffer, __functionAddress);
    }

    /** {@code int glfwGetOSMesaColorBuffer(GLFWwindow * window, int * width, int * height, int * format, void ** buffer)} */
    @NativeType("int")
    public static boolean glfwGetOSMesaColorBuffer(@NativeType("GLFWwindow *") long window, @NativeType("int *") @Nullable IntBuffer width, @NativeType("int *") @Nullable IntBuffer height, @NativeType("int *") @Nullable IntBuffer format, @NativeType("void **") @Nullable PointerBuffer buffer) {
        if (CHECKS) {
            checkSafe(width, 1);
            checkSafe(height, 1);
            checkSafe(format, 1);
            checkSafe(buffer, 1);
        }
        return nglfwGetOSMesaColorBuffer(window, memAddressSafe(width), memAddressSafe(height), memAddressSafe(format), memAddressSafe(buffer)) != 0;
    }

    // --- [ glfwGetOSMesaDepthBuffer ] ---

    /** {@code int glfwGetOSMesaDepthBuffer(GLFWwindow * window, int * width, int * height, int * bytesPerValue, void ** buffer)} */
    public static int nglfwGetOSMesaDepthBuffer(long window, long width, long height, long bytesPerValue, long buffer) {
        long __functionAddress = Functions.GetOSMesaDepthBuffer;
        if (CHECKS) {
            check(window);
        }
        return invokePPPPPI(window, width, height, bytesPerValue, buffer, __functionAddress);
    }

    /** {@code int glfwGetOSMesaDepthBuffer(GLFWwindow * window, int * width, int * height, int * bytesPerValue, void ** buffer)} */
    public static int glfwGetOSMesaDepthBuffer(@NativeType("GLFWwindow *") long window, @NativeType("int *") @Nullable IntBuffer width, @NativeType("int *") @Nullable IntBuffer height, @NativeType("int *") @Nullable IntBuffer bytesPerValue, @NativeType("void **") @Nullable PointerBuffer buffer) {
        if (CHECKS) {
            checkSafe(width, 1);
            checkSafe(height, 1);
            checkSafe(bytesPerValue, 1);
            checkSafe(buffer, 1);
        }
        return nglfwGetOSMesaDepthBuffer(window, memAddressSafe(width), memAddressSafe(height), memAddressSafe(bytesPerValue), memAddressSafe(buffer));
    }

    // --- [ glfwGetOSMesaContext ] ---

    /** {@code OSMesaContext glfwGetOSMesaContext(GLFWwindow * window)} */
    @NativeType("OSMesaContext")
    public static long glfwGetOSMesaContext(@NativeType("GLFWwindow *") long window) {
        long __functionAddress = Functions.GetOSMesaContext;
        if (CHECKS) {
            check(window);
        }
        return invokePP(window, __functionAddress);
    }

    /** {@code int glfwGetOSMesaColorBuffer(GLFWwindow * window, int * width, int * height, int * format, void ** buffer)} */
    @NativeType("int")
    public static boolean glfwGetOSMesaColorBuffer(@NativeType("GLFWwindow *") long window, @NativeType("int *") int @Nullable [] width, @NativeType("int *") int @Nullable [] height, @NativeType("int *") int @Nullable [] format, @NativeType("void **") @Nullable PointerBuffer buffer) {
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

    /** {@code int glfwGetOSMesaDepthBuffer(GLFWwindow * window, int * width, int * height, int * bytesPerValue, void ** buffer)} */
    public static int glfwGetOSMesaDepthBuffer(@NativeType("GLFWwindow *") long window, @NativeType("int *") int @Nullable [] width, @NativeType("int *") int @Nullable [] height, @NativeType("int *") int @Nullable [] bytesPerValue, @NativeType("void **") @Nullable PointerBuffer buffer) {
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
     * <p>Example usage: {@code GLFWNativeOSMesa.setPath(GL.getFunctionProvider());}</p> 
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
            getAllocator().free(a);
            a = NULL;
        }

        if (path != null) {
            int length = memLengthUTF8(path, true);

            a = getAllocator().malloc(length);
            memUTF8(path, true, memByteBuffer(a, length));
        }

        memPutAddress(override, a);
    }

}