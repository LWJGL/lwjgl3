/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_transform_feedback_instanced = "ARBTransformFeedbackInstanced".nativeClassGL("ARB_transform_feedback_instanced") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Multiple instances of geometry may be specified to the GL by calling functions such as GL31#DrawArraysInstanced() and GL31#DrawElementsInstanced().
		Further, the results of a transform feedback operation may be returned to the GL by calling GL40#DrawTransformFeedback(), or
		GL40#DrawTransformFeedbackStream(). However, it is not presently possible to draw multiple instances of data transform feedback without using a query
		and the resulting round trip from server to client.

		This extension adds functionality to draw multiple instances of the result of a transform feedback operation.

		Requires ${GL40.core} or ${ARB_transform_feedback2.link}. Requires ${GL31.core} or ${ARB_draw_instanced.link}. ${GL42.promoted}
		"""

	GL42 reuse "DrawTransformFeedbackInstanced"
	GL42 reuse "DrawTransformFeedbackStreamInstanced"
}