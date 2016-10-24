/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val NV_win32_keyed_mutex = "NVWin32KeyedMutex".nativeClassVK("NV_win32_keyed_mutex", postfix = NV) {
	documentation =
		"""
		Applications that wish to import Direct3D 11 memory objects into the Vulkan API may wish to use the native keyed mutex mechanism to synchronize access to the memory between Vulkan and Direct3D. This extension provides a way for an application to access the keyed mutex associated with an imported Vulkan memory object when submitting command buffers to a queue.
		"""

	IntConstant(
		"The extension specification version.",

		"NV_WIN32_KEYED_MUTEX_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"NV_WIN32_KEYED_MUTEX_EXTENSION_NAME".."VK_NV_win32_keyed_mutex"
	)

	EnumConstant(
		"Extends {@code VkStructureType}.",

		"STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_NV".."1000058000"
	)
}