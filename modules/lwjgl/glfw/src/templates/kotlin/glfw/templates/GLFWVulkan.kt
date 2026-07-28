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

    customMethod("""
    static {
        if (Platform.get() == Platform.MACOSX) {
            setPath(VK.getFunctionProvider());
        }
    }""")

    void(
        "InitVulkanLoader",

        nullable.."PFN_vkGetInstanceProcAddr".handle("loader")
    )

    intb(
        "VulkanSupported",
        void()
    )

    charASCII.const.p.p(
        "GetRequiredInstanceExtensions",

        AutoSizeResult..uint32_t.p("count")
    )

    GLFWvkproc(
        "GetInstanceProcAddress",

        nullable..VkInstance("instance"),
        charASCII.const.p("procname")
    )

    intb(
        "GetPhysicalDevicePresentationSupport",

        VkInstance("instance"),
        VkPhysicalDevice("device"),
        uint32_t("queuefamily")
    )

    VkResult(
        "CreateWindowSurface",

        VkInstance("instance"),
        GLFWwindow.p("window"),
        nullable..VkAllocationCallbacks.const.p("allocator"),
        Check(1)..VkSurfaceKHR.p("surface")
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
            getAllocator().free(a);
            a = NULL;
        }

        if (path != null) {
            int length = memLengthUTF8(path, true);

            a = getAllocator().malloc(length);
            memUTF8(path, true, memByteBuffer(a, length));
        }

        memPutAddress(override, a);
    }""")
}