/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_transform_feedback2 = "ARBTransformFeedback2".nativeClassGL("ARB_transform_feedback2") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		The ${registryLinkTo("EXT", "transform_feedback")} extension allows applications to capture primitives to one or more buffer objects when transformed by
		the GL. This extension provides a few additional capabilities to these extensions, making transform feedback mode more useful.

		First, it provides transform feedback objects which encapsulate transform feedback-related state, allowing applications to replace the entire transform
		feedback configuration in a single bind call. Second, it provides the ability to pause and resume transform feedback operations. When transform feedback
		is paused, applications may render without transform feedback or may use transform feedback with different state and a different transform feedback
		object. When transform feedback is resumed, additional primitives are captured and appended to previously captured primitives for the object.

		Additionally, this extension provides the ability to draw primitives captured in transform feedback mode without querying the captured primitive count.
		The command #DrawTransformFeedback() is equivalent to ${codeBlock("glDrawArrays(<mode>, 0, <count>)")}, where {@code count} is the number of vertices
		captured to buffer objects during the last transform feedback capture operation on the transform feedback object used. This draw operation only provides
		a vertex count -- it does not automatically set up vertex array state or vertex buffer object bindings, which must be done separately by the application.

		Requires ${GL20.link} or ${ARB_shader_objects.link} and ${registryLinkTo("NV", "transform_feedback")} or ${registryLinkTo("EXT", "transform_feedback")}.
		${GL40.promoted}
		"""

	IntConstant(
		"Accepted by the {@code target} parameter of BindTransformFeedback.",

		"TRANSFORM_FEEDBACK" _ 0x8E22
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"TRANSFORM_FEEDBACK_BUFFER_PAUSED" _ 0x8E23,
		"TRANSFORM_FEEDBACK_BUFFER_ACTIVE" _ 0x8E24,
		"TRANSFORM_FEEDBACK_BINDING" _ 0x8E25
	)

	GL40 reuse "BindTransformFeedback"
	GL40 reuse "DeleteTransformFeedbacks"
	GL40 reuse "GenTransformFeedbacks"
	GL40 reuse "IsTransformFeedback"

	GL40 reuse "PauseTransformFeedback"
	GL40 reuse "ResumeTransformFeedback"

	GL40 reuse "DrawTransformFeedback"
}