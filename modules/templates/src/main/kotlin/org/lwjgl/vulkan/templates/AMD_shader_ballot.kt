/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_shader_ballot = "AMDShaderBallot".nativeClassVK("AMD_shader_ballot", postfix = AMD) {
	documentation =
		"""
		This extension introduces two new shader functions:
		${ul(
			"""
			<b>mbcntAMD</b> computes the number of bits set in the provided argument, masked with a thread mask which contains 1 for all active threads less
			than the current thread within a wavefront.
			""",
			"<b>ballotARB</b> returns a 64-bit mask which contains 1 if that thread within the wavefront passed true into the instruction, and 0 otherwise."
		)}
		"""

	IntConstant(
		"The extension specification version.",

		"AMD_SHADER_BALLOT_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"AMD_SHADER_BALLOT_EXTENSION_NAME".."VK_AMD_shader_ballot"
	)
}