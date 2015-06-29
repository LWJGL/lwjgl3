/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_viewport_array = "ARBViewportArray".nativeClassGL("ARB_viewport_array") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		OpenGL is modeled on a pipeline of operations. The final stage in this pipeline before rasterization is the viewport transformation. This stage
		transforms vertices from view space into window coordinates and allows the application to specify a rectangular region of screen space into which OpenGL
		should draw primitives. Unextended OpenGL implementations provide a single viewport per context. In order to draw primitives into multiple viewports,
		the OpenGL viewport may be changed between several draw calls. With the advent of Geometry Shaders, it has become possible for an application to amplify
		geometry and produce multiple output primitives for each primitive input to the Geometry Shader. It is possible to direct these primitives to render
		into a selected render target. However, all render targets share the same, global OpenGL viewport.

		This extension enhances OpenGL by providing a mechanism to expose multiple viewports. Each viewport is specified as a rectangle. The destination
		viewport may be selected per-primitive by the geometry shader. This allows the Geometry Shader to produce different versions of primitives destined for
		separate viewport rectangles on the same surface. Additionally, when combined with multiple framebuffer attachments, it allows a different viewport
		rectangle to be selected for each. This extension also exposes a separate scissor rectangle for each viewport. Finally, the viewport bounds are now
		floating point quantities allowing fractional pixel offsets to be applied during the viewport transform.

		Requires ${GL32.core} or ${registryLinkTo("EXT", "geometry_shader4")} or ${ARB_geometry_shader4.link}. ${GL41.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v.",

		"MAX_VIEWPORTS" _ 0x825B,
		"VIEWPORT_SUBPIXEL_BITS" _ 0x825C,
		"VIEWPORT_BOUNDS_RANGE" _ 0x825D,
		"LAYER_PROVOKING_VERTEX" _ 0x825E,
		"VIEWPORT_INDEX_PROVOKING_VERTEX" _ 0x825F
	)

	IntConstant(
		"Returned in the {@code data} parameter from a Get query with a {@code pname} of LAYER_PROVOKING_VERTEX or VIEWPORT_INDEX_PROVOKING_VERTEX.",

		"UNDEFINED_VERTEX" _ 0x8260
	)

	GL41 reuse "ViewportArrayv"
    GL41 reuse "ViewportIndexedf"
    GL41 reuse "ViewportIndexedfv"
    GL41 reuse "ScissorArrayv"
    GL41 reuse "ScissorIndexed"
    GL41 reuse "ScissorIndexedv"
    GL41 reuse "DepthRangeArrayv"
    GL41 reuse "DepthRangeIndexed"
    GL41 reuse "GetFloati_v"
    GL41 reuse "GetDoublei_v"

	/* TODO: enable these
	EXT_draw_buffers2 reuse "GetIntegerIndexedvEXT"
	EXT_draw_buffers2 reuse "EnableIndexedEXT"
	EXT_draw_buffers2 reuse "DisableIndexedEXT"
	EXT_draw_buffers2 reuse "IsEnabledIndexedEXT"
	*/
}