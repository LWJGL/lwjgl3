/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan

import org.lwjgl.generator.*

val VULKAN_PACKAGE = "org.lwjgl.vulkan"

fun config() {
	packageInfo(
		VULKAN_PACKAGE,
		"""
		Contains bindings to <a href="https://www.khronos.org/vulkan">Vulkan</a>, a new generation graphics and compute API that provides high-efficiency,
		cross-platform access to modern GPUs used in a wide variety of devices from PCs and consoles to mobile phones and embedded platforms.
		"""
	)
}

val VkFlags = typedef(uint32_t, "VkFlags")
val VkBool32 = PrimitiveType("VkBool32", PrimitiveMapping.BOOLEAN4)
val VkDeviceSize = typedef(uint64_t, "VkDeviceSize")
val VkSampleMask = typedef(uint32_t, "VkSampleMask")

val PFN_vkVoidFunction = typedef(voidptr, "PFN_vkVoidFunction")

val charUTF8_p_const_p = charUTF8_p.p_const_p

fun VK_DEFINE_HANDLE(name: String) = ObjectType(name)
fun VK_DEFINE_NON_DISPATCHABLE_HANDLE(name: String) = typedef(uint64_t, name)

val KHR = "KHR"
val EXT = "EXT"