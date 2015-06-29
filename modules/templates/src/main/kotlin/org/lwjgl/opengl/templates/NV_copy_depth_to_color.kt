/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_copy_depth_to_color = "NVCopyDepthToColor".nativeClassGL("NV_copy_depth_to_color", postfix = NV) {
	documentation =
		"""
		Some applications, especially systems for distributed OpenGL rendering, would like to have a fast way of copying their depth buffer into a color
		buffer; for example, this allows the depth buffer to be scanned out, allowing downstream compositing operations.

		To do this operation in unextended OpenGL, the app must use GL11#ReadPixels() of GL11#DEPTH_COMPONENT data, followed by GL11#DrawPixels() of GL11#RGBA
		data. However, this typically will not provide adequate performance.

		This extension provides a way to copy the depth data directly into the color buffer, by adding two new options for the "type" parameter of
		GL11#CopyPixels(): #DEPTH_STENCIL_TO_RGBA_NV and #DEPTH_STENCIL_TO_BGRA_NV.

		Requires ${NV_packed_depth_stencil.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code type} parameter of CopyPixels.
		""",

		"DEPTH_STENCIL_TO_RGBA_NV" _ 0x886E,
		"DEPTH_STENCIL_TO_BGRA_NV" _ 0x886F
	)
}