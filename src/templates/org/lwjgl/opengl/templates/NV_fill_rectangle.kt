/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_fill_rectangle = "NVFillRectangle".nativeClassGL("NV_fill_rectangle", postfix = NV) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds a new GL11#PolygonMode() setting where a triangle is rasterized by computing and filling its axis-aligned screen-space bounding
		box, disregarding the actual triangle edges. This can be useful for drawing a rectangle without being split into two triangles with an internal edge.
		It is also useful to minimize the number of primitives that need to be drawn, particularly for a user-interface.
		"""

	IntConstant(
		"Accepted by the {@code mode} parameter of PolygonMode.",

		"FILL_RECTANGLE_NV" _ 0x933C
	)
}
