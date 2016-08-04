/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_rasterization_order = "AMDRasterizationOrder".nativeClassVK("AMD_rasterization_order", postfix = AMD) {
	documentation =
		"""
		This extension introduces the possibility for the application to control the order of primitive rasterization. In unextended Vulkan, the following
		stages are guaranteed to execute in <b>API order</b>:
		${ul(
			"depth bounds test",
			"stencil test, stencil op, and stencil write",
			"depth test and depth write",
			"occlusion queries",
			"blending, logic op, and color write"
		)}
		This extension enables applications to opt into a relaxed, implementation defined primitive rasterization order that may allow better parallel
		processing of primitives and thus enabling higher primitive throughput. It is applicable in cases where the primitive rasterization order is known to
		not affect the output of the rendering or any differences caused by a different rasterization order are not a concern from the point of view of the
		application's purpose.

		A few examples of cases when using the relaxed primitive rasterization order would not have an effect on the final rendering:
		${ul(
			"If the primitives rendered are known to not overlap in framebuffer space.",
			"""
			If depth testing is used with a comparison operator of #COMPARE_OP_LESS, #COMPARE_OP_LESS_OR_EQUAL, #COMPARE_OP_GREATER, or
			#COMPARE_OP_GREATER_OR_EQUAL, and the primitives rendered are known to not overlap in clip space.
			""",
			"If depth testing is not used and blending is enabled for all attachments with a commutative blend operator."
		)}
		"""

	IntConstant(
		"The extension specification version.",

		"AMD_RASTERIZATION_ORDER_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"AMD_RASTERIZATION_ORDER_EXTENSION_NAME".."VK_AMD_rasterization_order"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_RASTERIZATION_ORDER_AMD".."1000018000"
	)

	EnumConstant(
		"VkRasterizationOrderAMD",

		"RASTERIZATION_ORDER_STRICT_AMD".enum("indicates that primitive rasterization $must follow API order"),
		"RASTERIZATION_ORDER_RELAXED_AMD".enum("indicates that primitive rasterization $may not follow API order")
	)
}