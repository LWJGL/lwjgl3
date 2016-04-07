/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val IMG_filter_cubic = "IMGFilterCubic".nativeClassVK("IMG_filter_cubic", postfix = IMG) {
	documentation =
		"The $templateName extension."

	IntConstant(
		"The extension specification version.",

		"IMG_FILTER_CUBIC_SPEC_VERSION" expr "1"
	)

	StringConstant(
		"The extension name.",

		"IMG_FILTER_CUBIC_EXTENSION_NAME".."VK_IMG_filter_cubic"
	)

	IntConstant(
		"VkFilter",

		"FILTER_CUBIC_IMG"..1000015000
	)

	IntConstant(
		"VkFormatFeatureFlagBits",

		"FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG"..0x00002000
	)
}