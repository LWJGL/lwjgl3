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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.vulkan.*;

/** Native bindings to the GLFW library's Vulkan functions. */
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

    /**
     * Sets the desired Vulkan {@code vkGetInstanceProcAddr} function.
     * 
     * <p>This function sets the {@code vkGetInstanceProcAddr} function that GLFW will use for all Vulkan related entry point queries.</p>
     * 
     * <p>This feature is mostly useful on macOS, if your copy of the Vulkan loader is in a location where GLFW cannot find it through dynamic loading, or if you
     * are still using the static library version of the loader.</p>
     * 
     * <p>If set to {@code NULL}, GLFW will try to load the Vulkan loader dynamically by its standard name and get this function from there. This is the default
     * behavior.</p>
     * 
     * <p>The standard name of the loader is {@code vulkan-1.dll} on Windows, {@code libvulkan.so.1} on Linux and other Unix-like systems and
     * {@code libvulkan.1.dylib} on macOS. If your code is also loading it via these names then you probably don't need to use this function.</p>
     * 
     * <p>The function address you set is never reset by GLFW, but it only takes effect during initialization. Once GLFW has been initialized, any updates will
     * be ignored until the library is terminated and initialized again.</p>
     * 
     * <p>This function may be called before {@link GLFW#glfwInit Init}.</p>
     * 
     * <p>This function must only be called from the main thread.</p>
     *
     * @param loader the address of the function to use, or {@code NULL}
     *
     * @since version 3.4
     */
    public static void glfwInitVulkanLoader(@NativeType("PFN_vkGetInstanceProcAddr") long loader) {
        long __functionAddress = Functions.InitVulkanLoader;
        invokePV(loader, __functionAddress);
    }

    // --- [ glfwVulkanSupported ] ---

    /**
     * Returns whether the Vulkan loader has been found. This check is performed by {@link GLFW#glfwInit Init}.
     * 
     * <p>The availability of a Vulkan loader and even an ICD does not by itself guarantee that surface creation or even instance creation is possible. Call
     * {@link #glfwGetRequiredInstanceExtensions GetRequiredInstanceExtensions} to check whether the extensions necessary for Vulkan surface creation are available and
     * {@link #glfwGetPhysicalDevicePresentationSupport GetPhysicalDevicePresentationSupport} to check whether a queue family of a physical device supports image presentation.</p>
     * 
     * <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}.</p>
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @return {@link GLFW#GLFW_TRUE TRUE} if Vulkan is available, or {@link GLFW#GLFW_FALSE FALSE} otherwise
     *
     * @since version 3.2
     */
    @NativeType("int")
    public static boolean glfwVulkanSupported() {
        long __functionAddress = Functions.VulkanSupported;
        return invokeI(__functionAddress) != 0;
    }

    // --- [ glfwGetRequiredInstanceExtensions ] ---

    /**
     * Unsafe version of: {@link #glfwGetRequiredInstanceExtensions GetRequiredInstanceExtensions}
     *
     * @param count where to store the number of extensions in the returned array. This is set to zero if an error occurred.
     */
    public static long nglfwGetRequiredInstanceExtensions(long count) {
        long __functionAddress = Functions.GetRequiredInstanceExtensions;
        return invokePP(count, __functionAddress);
    }

    /**
     * Returns an array of names of Vulkan instance extensions required by GLFW for creating Vulkan surfaces for GLFW windows. If successful, the list will
     * always contain {@code VK_KHR_surface}, so if you don't require any additional extensions you can pass this list directly to the {@link VkInstanceCreateInfo}
     * struct.
     * 
     * <p>If Vulkan is not available on the machine, this function returns {@code NULL} and generates a {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} error. Call {@link #glfwVulkanSupported VulkanSupported} to check whether
     * Vulkan is available.</p>
     * 
     * <p>If Vulkan is available but no set of extensions allowing window surface creation was found, this function returns {@code NULL}. You may still use Vulkan for
     * off-screen rendering and compute work.</p>
     * 
     * <p>Additional extensions may be required by future versions of GLFW. You should check if any extensions you wish to enable are already in the returned
     * array, as it is an error to specify an extension more than once in the {@code VkInstanceCreateInfo} struct.</p>
     * 
     * <p>The returned array is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the library is terminated.</p>
     * 
     * <p>This function may be called from any thread.</p>
     * 
     * <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED} and {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE}.</p>
     *
     * @return an array of ASCII encoded extension names, or {@code NULL} if an error occurred
     *
     * @since version 3.2
     */
    @Nullable
    @NativeType("char const **")
    public static PointerBuffer glfwGetRequiredInstanceExtensions() {
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

    /** Unsafe version of: {@link #glfwGetInstanceProcAddress GetInstanceProcAddress} */
    public static long nglfwGetInstanceProcAddress(long instance, long procname) {
        long __functionAddress = Functions.GetInstanceProcAddress;
        return invokePPP(instance, procname, __functionAddress);
    }

    /**
     * Returns the address of the specified Vulkan core or extension function for the specified instance. If instance is set to {@code NULL} it can return any
     * function exported from the Vulkan loader, including at least the following functions:
     * 
     * <ul>
     * <li>{@link VK10#vkEnumerateInstanceExtensionProperties}</li>
     * <li>{@link VK10#vkEnumerateInstanceLayerProperties}</li>
     * <li>{@link VK10#vkCreateInstance}</li>
     * <li>{@link VK10#vkGetInstanceProcAddr}</li>
     * </ul>
     * 
     * <p>If Vulkan is not available on the machine, this function returns {@code NULL} and generates a {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} error. Call {@link #glfwVulkanSupported VulkanSupported} to check whether
     * Vulkan is available.</p>
     * 
     * <p>This function is equivalent to calling {@link VK10#vkGetInstanceProcAddr} with a platform-specific query of the Vulkan loader as a fallback.</p>
     * 
     * <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED} and {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE}.</p>
     * 
     * <p>The returned function pointer is valid until the library is terminated.</p>
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @param instance the Vulkan instance to query, or {@code NULL} to retrieve functions related to instance creation
     * @param procname the ASCII encoded name of the function
     *
     * @return the address of the function, or {@code NULL} if an error occurred
     *
     * @since version 3.2
     */
    @NativeType("GLFWvkproc")
    public static long glfwGetInstanceProcAddress(@Nullable VkInstance instance, @NativeType("char const *") ByteBuffer procname) {
        if (CHECKS) {
            checkNT1(procname);
        }
        return nglfwGetInstanceProcAddress(memAddressSafe(instance), memAddress(procname));
    }

    /**
     * Returns the address of the specified Vulkan core or extension function for the specified instance. If instance is set to {@code NULL} it can return any
     * function exported from the Vulkan loader, including at least the following functions:
     * 
     * <ul>
     * <li>{@link VK10#vkEnumerateInstanceExtensionProperties}</li>
     * <li>{@link VK10#vkEnumerateInstanceLayerProperties}</li>
     * <li>{@link VK10#vkCreateInstance}</li>
     * <li>{@link VK10#vkGetInstanceProcAddr}</li>
     * </ul>
     * 
     * <p>If Vulkan is not available on the machine, this function returns {@code NULL} and generates a {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} error. Call {@link #glfwVulkanSupported VulkanSupported} to check whether
     * Vulkan is available.</p>
     * 
     * <p>This function is equivalent to calling {@link VK10#vkGetInstanceProcAddr} with a platform-specific query of the Vulkan loader as a fallback.</p>
     * 
     * <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED} and {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE}.</p>
     * 
     * <p>The returned function pointer is valid until the library is terminated.</p>
     * 
     * <p>This function may be called from any thread.</p>
     *
     * @param instance the Vulkan instance to query, or {@code NULL} to retrieve functions related to instance creation
     * @param procname the ASCII encoded name of the function
     *
     * @return the address of the function, or {@code NULL} if an error occurred
     *
     * @since version 3.2
     */
    @NativeType("GLFWvkproc")
    public static long glfwGetInstanceProcAddress(@Nullable VkInstance instance, @NativeType("char const *") CharSequence procname) {
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

    /**
     * Returns whether the specified queue family of the specified physical device supports presentation to the platform GLFW was built for.
     * 
     * <p>If Vulkan or the required window surface creation instance extensions are not available on the machine, or if the specified instance was not created
     * with the required extensions, this function returns {@link GLFW#GLFW_FALSE FALSE} and generates a {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} error. Call {@link #glfwVulkanSupported VulkanSupported} to check whether Vulkan is
     * available and {@link #glfwGetRequiredInstanceExtensions GetRequiredInstanceExtensions} to check what instance extensions are required.</p>
     * 
     * <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}, {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} and {@link GLFW#GLFW_PLATFORM_ERROR PLATFORM_ERROR}.</p>
     * 
     * <p>macOS: This function currently always returns {@link GLFW#GLFW_TRUE TRUE}, as the {@code VK_MVK_macos_surface} and {@code VK_EXT_metal_surface} extensions do not provide a
     * {@code vkGetPhysicalDevice*PresentationSupport} type function.</p>
     * 
     * <p>This function may be called from any thread. For synchronization details of Vulkan objects, see the Vulkan specification.</p>
     *
     * @param instance    the instance that the physical device belongs to
     * @param device      the physical device that the queue family belongs to
     * @param queuefamily the index of the queue family to query
     *
     * @return {@link GLFW#GLFW_TRUE TRUE} if the queue family supports presentation, or {@link GLFW#GLFW_FALSE FALSE} otherwise
     *
     * @since version 3.2
     */
    @NativeType("int")
    public static boolean glfwGetPhysicalDevicePresentationSupport(VkInstance instance, VkPhysicalDevice device, @NativeType("uint32_t") int queuefamily) {
        long __functionAddress = Functions.GetPhysicalDevicePresentationSupport;
        return invokePPI(instance.address(), device.address(), queuefamily, __functionAddress) != 0;
    }

    // --- [ glfwCreateWindowSurface ] ---

    /** Unsafe version of: {@link #glfwCreateWindowSurface CreateWindowSurface} */
    public static int nglfwCreateWindowSurface(long instance, long window, long allocator, long surface) {
        long __functionAddress = Functions.CreateWindowSurface;
        if (CHECKS) {
            check(window);
        }
        return invokePPPPI(instance, window, allocator, surface, __functionAddress);
    }

    /**
     * Creates a Vulkan surface for the specified window.
     * 
     * <p>If the Vulkan loader was not found at initialization, this function returns {@link VK10#VK_ERROR_INITIALIZATION_FAILED} and generates a {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} error.
     * Call {@link #glfwVulkanSupported VulkanSupported} to check whether the Vulkan loader was found.</p>
     * 
     * <p>If the required window surface creation instance extensions are not available or if the specified instance was not created with these extensions
     * enabled, this function returns {@link VK10#VK_ERROR_EXTENSION_NOT_PRESENT} and generates a {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE} error. Call {@link #glfwGetRequiredInstanceExtensions GetRequiredInstanceExtensions} to
     * check what instance extensions are required.</p>
     * 
     * <p>The window surface cannot be shared with another API so the window must have been created with the client api hint set to {@link GLFW#GLFW_NO_API NO_API} otherwise it
     * generates a {@link GLFW#GLFW_INVALID_VALUE INVALID_VALUE} error and returns {@link KHRSurface#VK_ERROR_NATIVE_WINDOW_IN_USE_KHR}.</p>
     * 
     * <p>The window surface must be destroyed before the specified Vulkan instance. It is the responsibility of the caller to destroy the window surface. GLFW
     * does not destroy it for you. Call {@link KHRSurface#vkDestroySurfaceKHR} to destroy the surface.</p>
     * 
     * <p>Possible errors include {@link GLFW#GLFW_NOT_INITIALIZED NOT_INITIALIZED}, {@link GLFW#GLFW_API_UNAVAILABLE API_UNAVAILABLE}, {@link GLFW#GLFW_PLATFORM_ERROR PLATFORM_ERROR} and {@link GLFW#GLFW_INVALID_VALUE INVALID_VALUE}.</p>
     * 
     * <p>If an error occurs before the creation call is made, GLFW returns the Vulkan error code most appropriate for the error. Appropriate use of
     * {@link #glfwVulkanSupported VulkanSupported} and {@code glfwGetRequiredInstanceExtensions} should eliminate almost all occurrences of these errors.</p>
     * 
     * <p>Notes:</p>
     * 
     * <ul>
     * <li>This function may be called from any thread. For synchronization details of Vulkan objects, see the Vulkan specification.</li>
     * <li><b>macOS</b>: GLFW prefers the {@code VK_EXT_metal_surface} extension, with the {@code VK_MVK_macos_surface} extension as a fallback. The name of
     * the selected extension, if any, is included in the array returned by {@code glfwGetRequiredInstanceExtensions}.</li>
     * <li><b>macOS</b>: This function creates and sets a {@code CAMetalLayer} instance for the window content view, which is required for MoltenVK to
     * function.</li>
     * <li><b>x11</b>: By default GLFW prefers the {@code VK_KHR_xcb_surface} extension, with the {@code VK_KHR_xlib_surface} extension as a fallback. You can
     * make {@code VK_KHR_xlib_surface} the preferred extension by setting the {@link GLFW#GLFW_X11_XCB_VULKAN_SURFACE X11_XCB_VULKAN_SURFACE} init hint. The name of the selected extension, if
     * any, is included in the array returned by {@code glfwGetRequiredInstanceExtensions}.</li>
     * </ul>
     *
     * @param instance  the Vulkan instance to create the surface in
     * @param window    the window to create the surface for
     * @param allocator the allocator to use, or {@code NULL} to use the default allocator.
     * @param surface   where to store the handle of the surface. This is set to {@link VK10#VK_NULL_HANDLE} if an error occurred.
     *
     * @return {@link VK10#VK_SUCCESS} if successful, or a Vulkan error code if an error occurred
     *
     * @since version 3.2
     */
    @NativeType("VkResult")
    public static int glfwCreateWindowSurface(VkInstance instance, @NativeType("GLFWwindow *") long window, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks allocator, @NativeType("VkSurfaceKHR *") LongBuffer surface) {
        if (CHECKS) {
            check(surface, 1);
        }
        return nglfwCreateWindowSurface(instance.address(), window, memAddressSafe(allocator), memAddress(surface));
    }

    /** Array version of: {@link #glfwCreateWindowSurface CreateWindowSurface} */
    @NativeType("VkResult")
    public static int glfwCreateWindowSurface(VkInstance instance, @NativeType("GLFWwindow *") long window, @Nullable @NativeType("VkAllocationCallbacks const *") VkAllocationCallbacks allocator, @NativeType("VkSurfaceKHR *") long[] surface) {
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
     * <p>Example usage: <code>GLFWVulkan.setPath(VK.getFunctionProvider());</code></p> 
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
            nmemFree(a);
        }
        memPutAddress(override, path == null ? NULL : memAddress(memUTF8(path)));
    }

}