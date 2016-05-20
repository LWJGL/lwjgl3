/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD = "AMD"
val EXT = "EXT"
val IMG = "IMG"
val KHR = "KHR"
val NV = "NV"

val AMD_shader_ballot = EXT_FLAG.nativeClassVK("AMD_shader_ballot", postfix = AMD) {
	documentation =
		"""
		When true, the $templateName extension is supported.

		This extension introduces two new shader functions:
		${ul(
			"""
			<b>mbcnt</b> computes the number of bits set in the provided argument, masked with a thread mask which contains 1 for all active threads less than
			the current thread within a wavefront.
			""",
			"<b>ballot</b> returns a 64-bit mask which contains 1 if that thread within the wavefront passed true into the instruction, and 0 otherwise."
		)}
		"""
}