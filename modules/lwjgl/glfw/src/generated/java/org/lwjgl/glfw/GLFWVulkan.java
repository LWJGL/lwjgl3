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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.vulkan.*;

public class GLFWVulkan {

    /** Contains the function pointers loaded from {@code GLFW.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            InitVulkanLoader                     = apiGetFunctionAddress(GLFW.getLibrary(), "glfwInitVulkanLoader"),
            VulkanSupported                      = apiGetFunctionAddress(GLFW.getLibrary(), "glfwVulkanSupported"),
            GetRequiredInstanceExtensions        = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetRequiredInstanceExtensions"),
            GetInstanceProcAddress               = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetInstanceProcAddress"),
            GetPhysicalDevicePresentationSupport = apiGetFunctionAddress(GLFW.getLibrary(), "glfwGetPhysicalDevicePresentationSupport"),
            CreateWindowSurface                  = apiGetFunctionAddress(GLFW.getLibrary(), "glfwCreateWindowSurface");

    }

    static {
        if (Platform.get() == Platform.MACOSX) {
            setPath(VK.getFunctionProvider());
        }
    }

    protected GLFWVulkan() {
        throw new UnsupportedOperationException();
    }

    // --- [ glfwInitVulkanLoader ] ---

    /** {@code void glfwInitVulkanLoader(PFN_vkGetInstanceProcAddr loader)} */
    public static void glfwInitVulkanLoader(@NativeType("PFN_vkGetInstanceProcAddr") long loader) {
        long __functionAddress = Functions.InitVulkanLoader;
        invokePV(loader, __functionAddress);
    }

    // --- [ glfwVulkanSupported ] ---

    /** {@code int glfwVulkanSupported(void)} */
    @NativeType("int")
    public static boolean glfwVulkanSupported() {
        long __functionAddress = Functions.VulkanSupported;
        return invokeI(__functionAddress) != 0;
    }

    // --- [ glfwGetRequiredInstanceExtensions ] ---

    /** {@code char const ** glfwGetRequiredInstanceExtensions(uint32_t * count)} */
    public static long nglfwGetRequiredInstanceExtensions(long count) {
        long __functionAddress = Functions.GetRequiredInstanceExtensions;
        return invokePP(count, __functionAddress);
    }

    /** {@code char const ** glfwGetRequiredInstanceExtensions(uint32_t * count)} */
    @NativeType("char const **")
    public static @Nullable PointerBuffer glfwGetRequiredInstanceExtensions() {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nglfwGetRequiredInstanceExtensions(memAddress(count));
            return memPointerBufferSafe(__result, count.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwGetInstanceProcAddress ] ---

    /** {@code GLFWvkproc glfwGetInstanceProcAddress(VkInstance instance, char const * procname)} */
    public static long nglfwGetInstanceProcAddress(long instance, long procname) {
        long __functionAddress = Functions.GetInstanceProcAddress;
        return invokePPP(instance, procname, __functionAddress);
    }

    /** {@code GLFWvkproc glfwGetInstanceProcAddress(VkInstance instance, char const * procname)} */
    @NativeType("GLFWvkproc")
    public static long glfwGetInstanceProcAddress(@NativeType("VkInstance") @Nullable VkInstance instance, @NativeType("char const *") ByteBuffer procname) {
        if (CHECKS) {
            checkNT1(procname);
        }
        return nglfwGetInstanceProcAddress(memAddressSafe(instance), memAddress(procname));
    }

    /** {@code GLFWvkproc glfwGetInstanceProcAddress(VkInstance instance, char const * procname)} */
    @NativeType("GLFWvkproc")
    public static long glfwGetInstanceProcAddress(@NativeType("VkInstance") @Nullable VkInstance instance, @NativeType("char const *") CharSequence procname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(procname, true);
            long procnameEncoded = stack.getPointerAddress();
            return nglfwGetInstanceProcAddress(memAddressSafe(instance), procnameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ glfwGetPhysicalDevicePresentationSupport ] ---

    /** {@code int glfwGetPhysicalDevicePresentationSupport(VkInstance instance, VkPhysicalDevice device, uint32_t queuefamily)} */
    @NativeType("int")
    public static boolean glfwGetPhysicalDevicePresentationSupport(VkInstance instance, VkPhysicalDevice device, @NativeType("uint32_t") int queuefamily) {
        long __functionAddress = Functions.GetPhysicalDevicePresentationSupport;
        return invokePPI(instance.address(), device.address(), queuefamily, __functionAddress) != 0;
    }

    // --- [ glfwCreateWindowSurface ] ---

    /** {@code VkResult glfwCreateWindowSurface(VkInstance instance, GLFWwindow * window, VkAllocationCallbacks const * allocator, VkSurfaceKHR * surface)} */
    public static int nglfwCreateWindowSurface(long instance, long window, long allocator, long surface) {
        long __functionAddress = Functions.CreateWindowSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePPPPI(instance, window, allocator, surface, __functionAddress);
    }

    /** {@code VkResult glfwCreateWindowSurface(VkInstance instance, GLFWwindow * window, VkAllocationCallbacks const * allocator, VkSurfaceKHR * surface)} */
    @NativeType("VkResult")
    public static int glfwCreateWindowSurface(VkInstance instance, @NativeType("GLFWwindow *") long window, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks allocator, @NativeType("VkSurfaceKHR *") LongBuffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nglfwCreateWindowSurface(instance.address(), window, memAddressSafe(allocator), memAddress(surface));
    }

    /** {@code VkResult glfwCreateWindowSurface(VkInstance instance, GLFWwindow * window, VkAllocationCallbacks const * allocator, VkSurfaceKHR * surface)} */
    @NativeType("VkResult")
    public static int glfwCreateWindowSurface(VkInstance instance, @NativeType("GLFWwindow *") long window, @NativeType("VkAllocationCallbacks const *") @Nullable VkAllocationCallbacks allocator, @NativeType("VkSurfaceKHR *") long[] surface) {
        long __functionAddress = Functions.CreateWindowSurface;
        if (CHECKS) {
            check(window);
            check(surface, 1);
        }
        return invokePPPPI(instance.address(), window, memAddressSafe(allocator), surface, __functionAddress);
    }

    /**
     * Calls {@link #setPath(String)} with the path of the specified {@link SharedLibrary}.
     * 
     * <p>Example usage: {@code GLFWVulkan.setPath(VK.getFunctionProvider());}</p> 
     *
     * @param sharedLibrary a {@code FunctionProvider} instance that will be cast to {@code SharedLibrary}
     */
    public static void setPath(FunctionProvider sharedLibrary) {
        if (!(sharedLibrary instanceof SharedLibrary)) {
            apiLog("GLFW Vulkan path override not set: function provider is not a shared library.");
            return;
        }

        String path = ((SharedLibrary)sharedLibrary).getPath();
        if (path == null) {
            apiLog("GLFW Vulkan path override not set: Could not resolve the shared library path.");
            return;
        }

        setPath(path);
    }

    /**
     * Overrides the Vulkan shared library that GLFW loads internally.
     *
     * <p>This is useful when there's a mismatch between the shared libraries loaded by LWJGL and GLFW.</p>
     *
     * <p>This method must be called before GLFW initializes Vulkan. The override is available only in the default GLFW build bundled with LWJGL. Using the
     * override with a custom GLFW build will produce a warning in {@code DEBUG} mode (but not an error).</p>
     *
     * @param path the Vulkan shared library path, or {@code null} to remove the override.
     */
    public static void setPath(@Nullable String path) {
        long override = GLFW.getLibrary().getFunctionAddress("_glfw_vulkan_library");
        if (override == NULL) {
            apiLog("GLFW Vulkan path override not set: Could not resolve override symbol.");
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