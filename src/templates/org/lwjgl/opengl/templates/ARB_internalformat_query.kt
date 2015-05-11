/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_internalformat_query = "ARBInternalformatQuery".nativeClassGL("ARB_internalformat_query") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		OpenGL 4.1 has a number of queries to indicate the maximum number of samples available for different formats. These give a coarse-grained query
		mechanism e.g. an implementation can expose different sample counts for integer and floating-point formats, but not for different floating-point
		formats. There is also no convenient way for the user to determine the granularity of sample counts available, only the maximum.

		This extension adds a query mechanism that allows the user to determine which sample counts are available for a specific internal format.

		Requires ${GL30.core} or ${ARB_framebuffer_object.link}. ${GL42.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetInternalformativ.",

		"NUM_SAMPLE_COUNTS" _ 0x9380
	)

	GL42 reuse "GetInternalformativ"
}