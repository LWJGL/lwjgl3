/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT_validation_flags = "EXTValidationFlags".nativeClassVK("EXT_validation_flags", postfix = EXT) {
	documentation =
		"""
		This extension provides the ##VkValidationFlagsEXT struct that can be included in the {@code pNext} chain at #CreateInstance() time. The new struct
		contains an array of {@code VkValidationCheckEXT} values that will be disabled by the validation layers.
		"""

	IntConstant(
		"The extension specification version.",

		"EXT_VALIDATION_FLAGS_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"EXT_VALIDATION_FLAGS_EXTENSION_NAME".."VK_EXT_validation_flags"
	)

	IntConstant(
		"VkStructureType",

		"STRUCTURE_TYPE_VALIDATION_FLAGS_EXT".."1000061000"
	)

	EnumConstant(
		"VkValidationCheckEXT",

		"VALIDATION_CHECK_ALL_EXT".enum("disables all validation checks")
	)
}