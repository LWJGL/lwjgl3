/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vulkan

import org.lwjgl.generator.*

val VkBool32 = PrimitiveType("VkBool32", PrimitiveMapping.BOOLEAN4)
val VkDeviceAddress = typedef(uint64_t, "VkDeviceAddress")
val VkDeviceSize = typedef(uint64_t, "VkDeviceSize")
val VkFlags = typedef(uint32_t, "VkFlags")
val VkSampleMask = typedef(uint32_t, "VkSampleMask")

val PFN_vkVoidFunction = typedef(opaque_p, "PFN_vkVoidFunction")

fun VK_DEFINE_HANDLE(name: String) = WrappedPointerType(name)
fun VK_DEFINE_NON_DISPATCHABLE_HANDLE(name: String) = typedef(uint64_t, name)