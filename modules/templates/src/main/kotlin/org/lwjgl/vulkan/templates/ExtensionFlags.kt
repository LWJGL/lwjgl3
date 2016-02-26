/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val EXT = "EXT"
val KHR = "KHR"

val KHR_sampler_mirror_clamp_to_edge = EXT_FLAG.nativeClassVK("KHR_sampler_mirror_clamp_to_edge", postfix = KHR) {
	documentation =
		"""
		When true, the $templateName extension is supported.

		Extends the set of sampler address modes to include an additional mode ({@link VK10#VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE
		SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE}) that effectively uses a texture map twice as large as the original image in which the additional half of
		the new image is a mirror image of the original image.

		This new mode relaxes the need to generate images whose opposite edges match by using the original image to generate a matching "mirror image". This
		mode allows the texture to be mirrored only once in the negative s, t, and r directions.
		"""
}