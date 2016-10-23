/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val IMG_filter_cubic = "IMGFilterCubic".nativeClassVK("IMG_filter_cubic", postfix = IMG) {
	documentation =
		"""
		{@code VK_IMG_filter_cubic} adds an additional, high quality cubic filtering mode to Vulkan, using a Catmull-Rom bicubic filter. Performing this kind of filtering can be done in a shader by using 16 samples and a number of instructions, but this can be inefficient. The cubic filter mode exposes an optimized high quality texture sampling using fixed texture sampling hardware.
		"""

	IntConstant(
		"The extension specification version.",

		"IMG_FILTER_CUBIC_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"IMG_FILTER_CUBIC_EXTENSION_NAME".."VK_IMG_filter_cubic"
	)

	EnumConstant(
		"Extends {@code VkFilter}.",

		"FILTER_CUBIC_IMG".."1000015000"
	)

	EnumConstant(
		"Extends {@code VkFormatFeatureFlagBits}.",

		"FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG".enum(0x00002000)
	)
}