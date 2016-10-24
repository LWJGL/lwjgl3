/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*
import org.lwjgl.system.windows.*

val NV_external_memory_win32 = "NVExternalMemoryWin32".nativeClassVK("NV_external_memory_win32", postfix = NV) {
	documentation =
		"""
		Applications may wish to export memory to other Vulkan instances or other APIs, or import memory from other Vulkan instances or other APIs to enable Vulkan workloads to be split up across application module, process, or API boundaries. This extension enables win32 applications to export win32 handles from Vulkan memory objects such that the underlying resources can be referenced outside the Vulkan instance that created them, and import win32 handles created in the Direct3D API to Vulkan memory objects.
		"""

	IntConstant(
		"The extension specification version.",

		"NV_EXTERNAL_MEMORY_WIN32_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME".."VK_NV_external_memory_win32"
	)

	EnumConstant(
		"Extends {@code VkStructureType}.",

		"STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV".."1000057000",
		"STRUCTURE_TYPE_EXPORT_MEMORY_WIN32_HANDLE_INFO_NV".."1000057001"
	)

	VkResult(
		"GetMemoryWin32HandleNV",
		"""
		retrieve Win32 handle to a device memory object.

		<h5>C Specification</h5>
		To retrieve the handle corresponding to a device memory object created with ##VkExportMemoryAllocateInfoNV{@code ::handleTypes} set to include #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV or #EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV, call:

		<pre><code>VkResult vkGetMemoryWin32HandleNV(
￿    VkDevice                                    device,
￿    VkDeviceMemory                              memory,
￿    VkExternalMemoryHandleTypeFlagsNV           handleType,
￿    HANDLE*                                     pHandle);</code></pre>

		<h5>Valid Usage</h5>
		<ul>
			<li>{@code handleType} <b>must</b> be a flag specified in ##VkExportMemoryAllocateInfoNV{@code ::handleTypes} when allocating {@code memory}</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
			<li>{@code memory} <b>must</b> be a valid {@code VkDeviceMemory} handle</li>
			<li>{@code handleType} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
			<li>{@code handleType} <b>must</b> not be 0</li>
			<li>{@code pHandle} <b>must</b> be a pointer to a {@code HANDLE} value</li>
			<li>{@code memory} <b>must</b> have been created, allocated, or retrieved from {@code device}</li>
		</ul>

		<h5>Return Codes</h5>
		<dl>
			<dt>On success, this command returns</dt>
			<dd><ul>
				<li>#SUCCESS</li>
			</ul></dd>

			<dt>On failure, this command returns</dt>
			<dd><ul>
				<li>#ERROR_TOO_MANY_OBJECTS</li>
				<li>#ERROR_OUT_OF_HOST_MEMORY</li>
			</ul></dd>
		</dl>
		""",

		VkDevice.IN("device", "the logical device that owns the memory."),
		VkDeviceMemory.IN("memory", "the {@code VkDeviceMemory} object."),
		VkExternalMemoryHandleTypeFlagsNV.IN("handleType", "a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsNV} containing a single bit specifying the type of handle requested."),
		HANDLE.p.IN("pHandle", "")
	)
}