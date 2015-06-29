/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_transform_feedback3 = "ARBTransformFeedback3".nativeClassGL("ARB_transform_feedback3") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension further extends the transform feedback capabilities provided by the ${registryLinkTo("EXT", "transform_feedback")},
		${registryLinkTo("NV", "transform_feedback")}, and ${registryLinkTo("NV", "transform_feedback2")} extensions. Those extensions provided a new transform
		feedback mode, where selected vertex attributes can be recorded to a buffer object for each primitive processed by the GL.

		This extension provides increased flexibility in how vertex attributes can be written to buffer objects. Previous extensions allowed applications to
		record a set of attributes interleaved into a single buffer object (interleaved mode) or to record into multiple objects, but with only a single
		attribute per buffer (separate mode). This extension extends interleaved mode to write into multiple buffers, with multiple attributes per buffer. This
		capability is supported for all three styles of transform feedback:
		${ul(
			"""
			"EXT"-style GLSL transform feedback (${registryLinkTo("EXT", "transform_feedback")}), where a list of varyings is provided prior to linking a
			program object and is used whenever that program object is used.
			""",
		    """
		    "NV"-style GLSL transform feedback (${registryLinkTo("NV", "transform_feedback2")}), where "locations" of active varyings are queried after linking
		    and are then passed to a function that sets the active transform feedback varyings for the program object. Unlike the "EXT"-style mode, the set of
		    varyings to capture can be changed without relinking.
		    """,
		    """
		    Transform feedback for fixed-function or assembly vertex/geometry shaders (${registryLinkTo("NV", "transform_feedback2")}), where applications
		    specify a set of canonical attribute enums/numbers to capture.
            """
		)}

		Additionally, this extension adds new support for multiple separate vertex streams. New geometry shader functionality provided by the
		${ARB_gpu_shader5.link} and ${registryLinkTo("NV", "gpu_program5")} extensions allows geometry shaders to direct each vertex arbitrarily at a specified
		vertex stream. For example, a geometry program might write each "regular" vertex it emits to one vertex stream while writing some per-primitive data it
		computes to a second vertex stream. This extension allows applications to choose a vertex stream for each buffer object it writes to, and allows the
		vertices written to each vertex stream to be recorded in separate buffer objects. Only one stream may be selected for rasterization, and in the initial
		implementation, the geometry shader output topology must be GL11#POINTS if multiple streams are used. When geometry shaders are not used, or when an old
		geometry shader not writing multiple streams is used, all vertices produced by the GL are directed at the stream numbered zero. The set of transform
		feedback-related query targets is extended to accommodate multiple vertex streams, so it is possible to count the number of processed and recorded
		primitives for each stream separately.

		Requires ${GL30.core} or ${registryLinkTo("EXT", "transform_feedback")} or ${registryLinkTo("NV", "transform_feedback")}. ${GL40.promoted}
		"""
	
	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"MAX_TRANSFORM_FEEDBACK_BUFFERS" _ 0x8E70,
		"MAX_VERTEX_STREAMS" _ 0x8E71
	)

	GL40 reuse "DrawTransformFeedbackStream"
	GL40 reuse "BeginQueryIndexed"
	GL40 reuse "EndQueryIndexed"
	GL40 reuse "GetQueryIndexediv"
}