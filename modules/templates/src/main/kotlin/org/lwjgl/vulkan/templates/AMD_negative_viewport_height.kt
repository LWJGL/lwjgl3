/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_negative_viewport_height = "AMDNegativeViewportHeight".nativeClassVK("AMD_negative_viewport_height", postfix = AMD) {
	documentation =
		"""
		This extension allows an application to specify a negative viewport height. The result is that the viewport transformation will flip along the y-axis.
		"""

	IntConstant(
		"The extension specification version.",

		"AMD_NEGATIVE_VIEWPORT_HEIGHT_SPEC_VERSION".."0"
	)

	StringConstant(
		"The extension name.",

		"AMD_NEGATIVE_VIEWPORT_HEIGHT_EXTENSION_NAME".."VK_AMD_negative_viewport_height"
	)
}