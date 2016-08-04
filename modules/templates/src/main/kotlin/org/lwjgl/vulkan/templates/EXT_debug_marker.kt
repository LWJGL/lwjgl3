/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_debug_marker = "EXTDebugMarker".nativeClassVK("EXT_debug_marker", postfix = EXT) {
	documentation =
		"""
		This extension introduces concepts of object naming and tagging, for better tracking of Vulkan objects, as well as additional commands for recording
		annotations of named sections of a workload to aid organisation and offline analysis in external tools.

		The {@code VK_EXT_debug_marker} extension is a device extension.

		Given the complexity of Vulkan there is a strong need for verbose debugging information to aid the application developer in tracking down errors in the
		application's use of Vulkan, particularly in combination with an external debugger or profiler.

		Object Annotation allows the application to associate a name or binary data with a Vulkan object, while command buffer markers provide the developer
		with a way of associating logical elements of the scene with commands in the command buffer.
		"""

	IntConstant(
		"The extension specification version.",

		"EXT_DEBUG_MARKER_SPEC_VERSION".."3"
	)

	StringConstant(
		"The extension name.",

		"EXT_DEBUG_MARKER_EXTENSION_NAME".."VK_EXT_debug_marker"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT".."1000022000",
		"STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT".."1000022001",
        "STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT".."1000022002"
	)

	VkResult(
		"DebugMarkerSetObjectNameEXT",
		"""
		Gives a user-friendly name to a Vulkan object.

		Applications $may change the name associated with an object simply by calling {@code vkDebugMarkerSetObjectNameEXT} again with a new string. To remove
		a previously set name, {@code pName} should be set to an empty string.

		${ValidityProtos.vkDebugMarkerSetObjectNameEXT}
		""",

		VkDevice.IN("device", "the device that created the object"),
		VkDebugMarkerObjectNameInfoEXT_p.IN(
			"pNameInfo",
			"a pointer to an instance of the ##VkDebugMarkerObjectNameInfoEXT structure specifying the parameters of the name to set on the object"
		)
	)

	VkResult(
		"DebugMarkerSetObjectTagEXT",
		"""
		Attaches arbitrary data to a Vulkan object.

		In addition to setting a name for an object, debugging and validation layers may have uses for additional binary data on a per-object basis that has no
		other place in the Vulkan API. For example, a {@code VkShaderModule} could have additional debugging data attached to it to aid in offline shader
		tracing.

		The {@code tagName} parameter gives a name or identifier to the type of data being tagged. This can be used by debugging layers to easily filter for
		only data that can be used by that implementation.

		${ValidityProtos.vkDebugMarkerSetObjectTagEXT}
		""",

		VkDevice.IN("device", "the device that created the object"),
		VkDebugMarkerObjectTagInfoEXT_p.IN(
			"pTagInfo",
			"a pointer to an instance of the ##VkDebugMarkerObjectTagInfoEXT structure specifying the parameters of the tag to attach to the object"
		)
	)

	void(
		"CmdDebugMarkerBeginEXT",
		"""
		Opens a marker region.

		Typical Vulkan applications will submit many command buffers in each frame, with each command buffer containing a large number of individual commands.
		Being able to logically annotate regions of command buffers that belong together as well as hierarchically subdivide the frame is important to a
		developer's ability to navigate the commands viewed holistically.

		An application $may open a marker region in one command buffer and close it in another, or otherwise split marker regions across multiple command
		buffers or multiple queue submissions. When viewed from the linear series of submissions to a single queue, the calls to
		{@code vkCmdDebugMarkerBeginEXT} and #CmdDebugMarkerEndEXT() $must be matched and balanced.

		Any calls to {@code vkCmdDebugMarkerBeginEXT} within a secondary command buffer must have a matching #CmdDebugMarkerEndEXT() in that same command
		buffer, and marker regions begun outside of the secondary command buffer must not be ended inside it.

		${ValidityProtos.vkCmdDebugMarkerBeginEXT}
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded"),
		VkDebugMarkerMarkerInfoEXT_p.IN(
			"pMarkerInfo",
			"a pointer to an instance of the ##VkDebugMarkerMarkerInfoEXT structure specifying the parameters of the marker region to open"
		)
	)

	void(
		"CmdDebugMarkerEndEXT",
		"""
		Closes a marker region.

		${ValidityProtos.vkCmdDebugMarkerEndEXT}
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer handle")
	)

	void(
		"CmdDebugMarkerInsertEXT",
		"""
		Inserts a single marker label into a command buffer.

		${ValidityProtos.vkCmdDebugMarkerInsertEXT}
		""",

		VkCommandBuffer.IN("commandBuffer", " the command buffer into which the command is recorded"),
		VkDebugMarkerMarkerInfoEXT_p.IN(
			"pMarkerInfo",
			"a pointer to an instance of the ##VkDebugMarkerMarkerInfoEXT structure specifying the parameters of the marker to insert"
		)
	)
}