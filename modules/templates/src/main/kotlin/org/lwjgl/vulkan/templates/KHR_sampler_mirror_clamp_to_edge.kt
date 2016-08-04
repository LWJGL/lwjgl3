/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val KHR_sampler_mirror_clamp_to_edge = "KHRSamplerMirrorClampToEdge".nativeClassVK("KHR_sampler_mirror_clamp_to_edge", postfix = KHR) {
	documentation =
		"""
		Extends the set of sampler address modes to include an additional mode (#SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE) that effectively uses a texture map
		twice as large as the original image in which the additional half of the new image is a mirror image of the original image.

		This new mode relaxes the need to generate images whose opposite edges match by using the original image to generate a matching "mirror image". This
		mode allows the texture to be mirrored only once in the negative s, t, and r directions.
		"""

	IntConstant(
		"The extension specification version.",

		"KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME".."VK_KHR_sampler_mirror_clamp_to_edge"
	)

	IntConstant(
		"Indicates that the mirror clamp to edge wrap mode will be used.",

		"SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE".."4"
	)
}