/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_rasterization_order = "AMDRasterizationOrder".nativeClassVK("AMD_rasterization_order", postfix = AMD) {
	documentation =
		"""
		This extension introduces the possibility for the application to control the order of primitive rasterization. In unextended Vulkan, the following stages are guaranteed to execute in <em>API order</em>:

		<ul>
			<li>depth bounds test</li>
			<li>stencil test, stencil op, and stencil write</li>
			<li>depth test and depth write</li>
			<li>occlusion queries</li>
			<li>blending, logic op, and color write</li>
		</ul>

		This extension enables applications to opt into a relaxed, implementation defined primitive rasterization order that may allow better parallel processing of primitives and thus enabling higher primitive throughput. It is applicable in cases where the primitive rasterization order is known to not affect the output of the rendering or any differences caused by a different rasterization order are not a concern from the point of view of the application's purpose.

		A few examples of cases when using the relaxed primitive rasterization order would not have an effect on the final rendering:

		<ul>
			<li>If the primitives rendered are known to not overlap in framebuffer space.</li>
			<li>If depth testing is used with a comparison operator of #COMPARE_OP_LESS, #COMPARE_OP_LESS_OR_EQUAL, #COMPARE_OP_GREATER, or #COMPARE_OP_GREATER_OR_EQUAL, and the primitives rendered are known to not overlap in clip space.</li>
			<li>If depth testing is not used and blending is enabled for all attachments with a commutative blend operator.</li>
		</ul>
		"""

	IntConstant(
		"The extension specification version.",

		"AMD_RASTERIZATION_ORDER_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"AMD_RASTERIZATION_ORDER_EXTENSION_NAME".."VK_AMD_rasterization_order"
	)

	EnumConstant(
		"Extends {@code VkStructureType}.",

		"STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD".."1000018000"
	)

	EnumConstant(
		"""
		VkRasterizationOrderAMD - (no short description available)

		<h5>Description</h5>
		For more information, see:

		<ul>
			<li>The See Also section for other reference pages using this type.</li>
			<li>The Vulkan Specification.</li>
		</ul>

		<h5>See Also</h5>
		##VkPipelineRasterizationStateRasterizationOrderAMD
		""",

		"RASTERIZATION_ORDER_STRICT_AMD".."0",
		"RASTERIZATION_ORDER_RELAXED_AMD".."1"
	)
}