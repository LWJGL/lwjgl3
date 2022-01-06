/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package glfw.templates

import org.lwjgl.generator.*
import glfw.*
import vulkan.*

val GLFWVulkan = "GLFWVulkan".dependsOn(Module.VULKAN)?.nativeClass(Module.GLFW, prefix = "GLFW", binding = GLFW_BINDING_DELEGATE) {
    javaImport("org.lwjgl.vulkan.*")

    documentation =
        "Native bindings to the GLFW library's Vulkan functions."

    customMethod("""
    static {
        if (Platform.get() == Platform.MACOSX) {
            setPath(VK.getFunctionProvider());
        }
    }""")

    void(
        "InitVulkanLoader",
        """
        Sets the desired Vulkan {@code vkGetInstanceProcAddr} function.
 
        This function sets the {@code vkGetInstanceProcAddr} function that GLFW will use for all Vulkan related entry point queries.
 
        This feature is mostly useful on macOS, if your copy of the Vulkan loader is in a location where GLFW cannot find it through dynamic loading, or if you
        are still using the static library version of the loader.
 
        If set to #NULL, GLFW will try to load the Vulkan loader dynamically by its standard name and get this function from there. This is the default
        behavior.
 
        The standard name of the loader is {@code vulkan-1.dll} on Windows, {@code libvulkan.so.1} on Linux and other Unix-like systems and
        {@code libvulkan.1.dylib} on macOS. If your code is also loading it via these names then you probably don't need to use this function.
 
        The function address you set is never reset by GLFW, but it only takes effect during initialization. Once GLFW has been initialized, any updates will
        be ignored until the library is terminated and initialized again.
        
        This function may be called before #Init().
        
        This function must only be called from the main thread.
        """,

        nullable.."PFN_vkGetInstanceProcAddr".handle("loader", "the address of the function to use, or #NULL"),

        since = "version 3.4"
    )

    intb(
        "VulkanSupported",
        """
        Returns whether the Vulkan loader has been found. This check is performed by #Init().

        The availability of a Vulkan loader and even an ICD does not by itself guarantee that surface creation or even instance creation is possible. Call
        #GetRequiredInstanceExtensions() to check whether the extensions necessary for Vulkan surface creation are available and
        #GetPhysicalDevicePresentationSupport() to check whether a queue family of a physical device supports image presentation.

        Possible errors include #NOT_INITIALIZED.

        This function may be called from any thread.
        """,

        returnDoc = "#TRUE if Vulkan is available, or #FALSE otherwise",
        since = "version 3.2"
    )

    charASCII.const.p.p(
        "GetRequiredInstanceExtensions",
        """
        Returns an array of names of Vulkan instance extensions required by GLFW for creating Vulkan surfaces for GLFW windows. If successful, the list will
        always contain {@code VK_KHR_surface}, so if you don't require any additional extensions you can pass this list directly to the ##VkInstanceCreateInfo
        struct.

        If Vulkan is not available on the machine, this function returns #NULL and generates a #API_UNAVAILABLE error. Call #VulkanSupported() to check whether
        Vulkan is available.

        If Vulkan is available but no set of extensions allowing window surface creation was found, this function returns #NULL. You may still use Vulkan for
        off-screen rendering and compute work.

        Additional extensions may be required by future versions of GLFW. You should check if any extensions you wish to enable are already in the returned
        array, as it is an error to specify an extension more than once in the {@code VkInstanceCreateInfo} struct.

        The returned array is allocated and freed by GLFW. You should not free it yourself. It is guaranteed to be valid only until the library is terminated.

        This function may be called from any thread.

        Possible errors include #NOT_INITIALIZED and #API_UNAVAILABLE.
        """,

        AutoSizeResult..uint32_t.p(
            "count",
            "where to store the number of extensions in the returned array. This is set to zero if an error occurred."
        ),

        returnDoc = "an array of ASCII encoded extension names, or #NULL if an error occurred",
        since = "version 3.2"
    )

    GLFWvkproc(
        "GetInstanceProcAddress",
        """
        Returns the address of the specified Vulkan core or extension function for the specified instance. If instance is set to #NULL it can return any
        function exported from the Vulkan loader, including at least the following functions:
        ${ul(
            "VK10#vkEnumerateInstanceExtensionProperties()",
            "VK10#vkEnumerateInstanceLayerProperties()",
            "VK10#vkCreateInstance()",
            "VK10#vkGetInstanceProcAddr()"
        )}

        If Vulkan is not available on the machine, this function returns #NULL and generates a #API_UNAVAILABLE error. Call #VulkanSupported() to check whether
        Vulkan is available.

        This function is equivalent to calling VK10#vkGetInstanceProcAddr() with a platform-specific query of the Vulkan loader as a fallback.

        Possible errors include #NOT_INITIALIZED and #API_UNAVAILABLE.

        The returned function pointer is valid until the library is terminated.

        This function may be called from any thread.
        """,

        nullable..VkInstance("instance", "the Vulkan instance to query, or #NULL to retrieve functions related to instance creation"),
        charASCII.const.p("procname", "the ASCII encoded name of the function"),

        returnDoc = "the address of the function, or #NULL if an error occurred",
        since = "version 3.2"
    )

    intb(
        "GetPhysicalDevicePresentationSupport",
        """
        Returns whether the specified queue family of the specified physical device supports presentation to the platform GLFW was built for.

        If Vulkan or the required window surface creation instance extensions are not available on the machine, or if the specified instance was not created
        with the required extensions, this function returns #FALSE and generates a #API_UNAVAILABLE error. Call #VulkanSupported() to check whether Vulkan is
        available and #GetRequiredInstanceExtensions() to check what instance extensions are required.

        Possible errors include #NOT_INITIALIZED, #API_UNAVAILABLE and #PLATFORM_ERROR.
        
        macOS: This function currently always returns #TRUE, as the {@code VK_MVK_macos_surface} and {@code VK_EXT_metal_surface} extensions do not provide a
        {@code vkGetPhysicalDevice*PresentationSupport} type function.

        This function may be called from any thread. For synchronization details of Vulkan objects, see the Vulkan specification.
        """,

        VkInstance("instance", "the instance that the physical device belongs to"),
        VkPhysicalDevice("device", "the physical device that the queue family belongs to"),
        uint32_t("queuefamily", "the index of the queue family to query"),

        returnDoc = "#TRUE if the queue family supports presentation, or #FALSE otherwise",
        since = "version 3.2"
    )

    VkResult(
        "CreateWindowSurface",
        """
        Creates a Vulkan surface for the specified window.

        If the Vulkan loader was not found at initialization, this function returns VK10#VK_ERROR_INITIALIZATION_FAILED and generates a #API_UNAVAILABLE error.
        Call #VulkanSupported() to check whether the Vulkan loader was found.

        If the required window surface creation instance extensions are not available or if the specified instance was not created with these extensions
        enabled, this function returns VK10#VK_ERROR_EXTENSION_NOT_PRESENT and generates a #API_UNAVAILABLE error. Call #GetRequiredInstanceExtensions() to
        check what instance extensions are required.

        The window surface cannot be shared with another API so the window must have been created with the client api hint set to #NO_API otherwise it
        generates a #INVALID_VALUE error and returns KHRSurface#VK_ERROR_NATIVE_WINDOW_IN_USE_KHR.

        The window surface must be destroyed before the specified Vulkan instance. It is the responsibility of the caller to destroy the window surface. GLFW
        does not destroy it for you. Call KHRSurface#vkDestroySurfaceKHR() to destroy the surface.

        Possible errors include #NOT_INITIALIZED, #API_UNAVAILABLE, #PLATFORM_ERROR and #INVALID_VALUE.

        If an error occurs before the creation call is made, GLFW returns the Vulkan error code most appropriate for the error. Appropriate use of
        #VulkanSupported() and {@code glfwGetRequiredInstanceExtensions} should eliminate almost all occurrences of these errors.

        Notes:
        ${ul(
            "This function may be called from any thread. For synchronization details of Vulkan objects, see the Vulkan specification.",
            """
            <b>macOS</b>: GLFW prefers the {@code VK_EXT_metal_surface} extension, with the {@code VK_MVK_macos_surface} extension as a fallback. The name of
            the selected extension, if any, is included in the array returned by {@code glfwGetRequiredInstanceExtensions}.
            """,
            """
            <b>macOS</b>: This function creates and sets a {@code CAMetalLayer} instance for the window content view, which is required for MoltenVK to
            function.
            """,
            """
            <b>x11</b>: By default GLFW prefers the {@code VK_KHR_xcb_surface} extension, with the {@code VK_KHR_xlib_surface} extension as a fallback. You can
            make {@code VK_KHR_xlib_surface} the preferred extension by setting the #X11_XCB_VULKAN_SURFACE init hint. The name of the selected extension, if
            any, is included in the array returned by {@code glfwGetRequiredInstanceExtensions}.
            """
        )}
        """,

        VkInstance("instance", "the Vulkan instance to create the surface in"),
        GLFWwindow.p("window", "the window to create the surface for"),
        nullable..VkAllocationCallbacks.const.p("allocator", "the allocator to use, or #NULL to use the default allocator."),
        Check(1)..VkSurfaceKHR.p("surface", "where to store the handle of the surface. This is set to VK10#VK_NULL_HANDLE if an error occurred."),

        returnDoc = "VK10#VK_SUCCESS if successful, or a Vulkan error code if an error occurred",
        since = "version 3.2"
    )

    customMethod("""
    /**
     * Calls {@link #setPath(String)} with the path of the specified {@link SharedLibrary}.
     * 
     * <p>Example usage: ${code("GLFWVulkan.setPath(VK.getFunctionProvider());")}</p> 
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
    }""")
}