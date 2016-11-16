/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_debug_marker = "EXTDebugMarker".nativeClassVK("EXT_debug_marker", postfix = EXT) {
	documentation =
		"""
		The {@code VK_EXT_debug_marker} extension is a device extension. It introduces concepts of object naming and tagging, for better tracking of Vulkan objects, as well as additional commands for recording annotations of named sections of a workload to aid organisation and offline analysis in external tools.
		"""

	IntConstant(
		"The extension specification version.",

		"EXT_DEBUG_MARKER_SPEC_VERSION".."3"
	)

	StringConstant(
		"The extension name.",

		"EXT_DEBUG_MARKER_EXTENSION_NAME".."VK_EXT_debug_marker"
	)

	EnumConstant(
		"Extends {@code VkStructureType}.",

		"STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT".."1000022000",
		"STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT".."1000022001",
		"STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT".."1000022002"
	)

	VkResult(
		"DebugMarkerSetObjectTagEXT",
		"""
		Attach arbitrary data to an object.

		<h5>C Specification</h5>
		In addition to setting a name for an object, debugging and validation layers may have uses for additional binary data on a per-object basis that has no other place in the Vulkan API. For example, a {@code VkShaderModule} could have additional debugging data attached to it to aid in offline shader tracing. To attach data to an object, call:

		<pre><code>VkResult vkDebugMarkerSetObjectTagEXT(
￿    VkDevice                                    device,
￿    VkDebugMarkerObjectTagInfoEXT*              pTagInfo);</code></pre>

		<h5>Valid Usage</h5>
		<ul>
			<li>{@code pTagInfo.object} <b>must</b> be a Vulkan object</li>
			<li>{@code pTagInfo.tagName} <b>must</b> not be 0</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
			<li>{@code pTagInfo} <b>must</b> be a pointer to a ##VkDebugMarkerObjectTagInfoEXT structure</li>
		</ul>

		<h5>Host Synchronization</h5>
		<ul>
			<li>Host access to {@code pTagInfo.object} <b>must</b> be externally synchronized</li>
		</ul>

		<h5>Return Codes</h5>
		<dl>
			<dt>On success, this command returns</dt>
			<dd><ul>
				<li>#SUCCESS</li>
			</ul></dd>

			<dt>On failure, this command returns</dt>
			<dd><ul>
				<li>#ERROR_OUT_OF_HOST_MEMORY</li>
				<li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
			</ul></dd>
		</dl>

		<h5>See Also</h5>
		##VkDebugMarkerObjectTagInfoEXT
		""",

		VkDevice.IN("device", "the device that created the object."),
		VkDebugMarkerObjectTagInfoEXT.p.IN("pTagInfo", "a pointer to an instance of the ##VkDebugMarkerObjectTagInfoEXT structure specifying the parameters of the tag to attach to the object.")
	)

	VkResult(
		"DebugMarkerSetObjectNameEXT",
		"""
		Give a user-friendly name to an object.

		<h5>C Specification</h5>
		An object can be given a user-friendly name by calling:

		<pre><code>VkResult vkDebugMarkerSetObjectNameEXT(
￿    VkDevice                                    device,
￿    VkDebugMarkerObjectNameInfoEXT*             pNameInfo);</code></pre>

		<h5>Valid Usage</h5>
		<ul>
			<li>{@code pNameInfo.object} <b>must</b> be a Vulkan object</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code device} <b>must</b> be a valid {@code VkDevice} handle</li>
			<li>{@code pNameInfo} <b>must</b> be a pointer to a ##VkDebugMarkerObjectNameInfoEXT structure</li>
		</ul>

		<h5>Host Synchronization</h5>
		<ul>
			<li>Host access to {@code pNameInfo.object} <b>must</b> be externally synchronized</li>
		</ul>

		<h5>Return Codes</h5>
		<dl>
			<dt>On success, this command returns</dt>
			<dd><ul>
				<li>#SUCCESS</li>
			</ul></dd>

			<dt>On failure, this command returns</dt>
			<dd><ul>
				<li>#ERROR_OUT_OF_HOST_MEMORY</li>
				<li>#ERROR_OUT_OF_DEVICE_MEMORY</li>
			</ul></dd>
		</dl>

		<h5>See Also</h5>
		##VkDebugMarkerObjectNameInfoEXT
		""",

		VkDevice.IN("device", "the device that created the object."),
		VkDebugMarkerObjectNameInfoEXT.p.IN("pNameInfo", "a pointer to an instance of the ##VkDebugMarkerObjectNameInfoEXT structure specifying the parameters of the name to set on the object.")
	)

	void(
		"CmdDebugMarkerBeginEXT",
		"""
		Open a command buffer marker region.

		<h5>C Specification</h5>
		A marker region can be opened by calling:

		<pre><code>void vkCmdDebugMarkerBeginEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDebugMarkerMarkerInfoEXT*                 pMarkerInfo);</code></pre>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
			<li>{@code pMarkerInfo} <b>must</b> be a pointer to a ##VkDebugMarkerMarkerInfoEXT structure</li>
			<li>{@code commandBuffer} <b>must</b> be in the recording state</li>
			<li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
		</ul>

		<h5>Host Synchronization</h5>
		<ul>
			<li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
		</ul>

		<h5>Command Properties</h5>
		<table class="lwjgl">
			<thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
			<tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
		</table>

		<h5>See Also</h5>
		##VkDebugMarkerMarkerInfoEXT
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
		VkDebugMarkerMarkerInfoEXT.p.IN("pMarkerInfo", "a pointer to an instance of the ##VkDebugMarkerMarkerInfoEXT structure specifying the parameters of the marker region to open.")
	)

	void(
		"CmdDebugMarkerEndEXT",
		"""
		Close a command buffer marker region.

		<h5>C Specification</h5>
		A marker region can be closed by calling:

		<pre><code>void vkCmdDebugMarkerEndEXT(
￿    VkCommandBuffer                             commandBuffer);</code></pre>

		<h5>Description</h5>
		An application <b>may</b> open a marker region in one command buffer and close it in another, or otherwise split marker regions across multiple command buffers or multiple queue submissions. When viewed from the linear series of submissions to a single queue, the calls to #CmdDebugMarkerBeginEXT() and #CmdDebugMarkerEndEXT() <b>must</b> be matched and balanced.

		Any calls to #CmdDebugMarkerBeginEXT() within a secondary command buffer must have a matching #CmdDebugMarkerEndEXT() in that same command buffer, and marker regions begun outside of the secondary command buffer must not be ended inside it.

		<h5>Valid Usage</h5>
		<ul>
			<li>There <b>must</b> be an outstanding #CmdDebugMarkerBeginEXT() command prior to the #CmdDebugMarkerEndEXT() on the queue that {@code commandBuffer} is submitted to</li>
			<li>If the matching #CmdDebugMarkerBeginEXT() command was in a secondary command buffer, the #CmdDebugMarkerEndEXT() must be in the same {@code commandBuffer}</li>
		</ul>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
			<li>{@code commandBuffer} <b>must</b> be in the recording state</li>
			<li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
		</ul>

		<h5>Host Synchronization</h5>
		<ul>
			<li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
		</ul>

		<h5>Command Properties</h5>
		<table class="lwjgl">
			<thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
			<tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
		</table>
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded.")
	)

	void(
		"CmdDebugMarkerInsertEXT",
		"""
		Insert a marker label into a command buffer.

		<h5>C Specification</h5>
		A single marker label can be inserted into a command buffer by calling:

		<pre><code>void vkCmdDebugMarkerInsertEXT(
￿    VkCommandBuffer                             commandBuffer,
￿    VkDebugMarkerMarkerInfoEXT*                 pMarkerInfo);</code></pre>

		<h5>Valid Usage (Implicit)</h5>
		<ul>
			<li>{@code commandBuffer} <b>must</b> be a valid {@code VkCommandBuffer} handle</li>
			<li>{@code pMarkerInfo} <b>must</b> be a pointer to a ##VkDebugMarkerMarkerInfoEXT structure</li>
			<li>{@code commandBuffer} <b>must</b> be in the recording state</li>
			<li>The {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> support graphics, or compute operations</li>
		</ul>

		<h5>Host Synchronization</h5>
		<ul>
			<li>Host access to the {@code VkCommandPool} that {@code commandBuffer} was allocated from <b>must</b> be externally synchronized</li>
		</ul>

		<h5>Command Properties</h5>
		<table class="lwjgl">
			<thead><tr><th>Command Buffer Levels</th><th>Render Pass Scope</th><th>Supported Queue Types</th></tr></thead>
			<tbody><tr><td>Primary Secondary</td><td>Both</td><td>GRAPHICS COMPUTE</td></tr></tbody>
		</table>

		<h5>See Also</h5>
		##VkDebugMarkerMarkerInfoEXT
		""",

		VkCommandBuffer.IN("commandBuffer", "the command buffer into which the command is recorded."),
		VkDebugMarkerMarkerInfoEXT.p.IN("pMarkerInfo", "a pointer to an instance of the ##VkDebugMarkerMarkerInfoEXT structure specifying the parameters of the marker to insert.")
	)
}