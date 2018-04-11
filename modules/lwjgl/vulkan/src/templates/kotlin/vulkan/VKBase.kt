/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan

import org.lwjgl.generator.*

fun config() {
    packageInfo(
        Module.VULKAN,
        """
        Contains bindings to ${url("https://www.khronos.org/vulkan/", "Vulkan")}, a new generation graphics and compute API that provides high-efficiency,
        cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.

        Experimental extensions (KHX, NVX, etc) is not supported API. When such an extension is promoted to stable, the corresponding experimental bindings
        will be removed.

        <b>macOS</b>: Vulkan can be used on macOS with a solution that emulates it over Metal, like ${url("https://moltengl.com/moltenvk/", "MoltenVK")}.
        """
    )
}

val VkFlags = typedef(uint32_t, "VkFlags")
val VkBool32 = PrimitiveType("VkBool32", PrimitiveMapping.BOOLEAN4)
val VkDeviceSize = typedef(uint64_t, "VkDeviceSize")
val VkSampleMask = typedef(uint32_t, "VkSampleMask")

val PFN_vkVoidFunction = typedef(opaque_p, "PFN_vkVoidFunction")

fun VK_DEFINE_HANDLE(name: String) = ObjectType(name)
fun VK_DEFINE_NON_DISPATCHABLE_HANDLE(name: String) = typedef(uint64_t, name)