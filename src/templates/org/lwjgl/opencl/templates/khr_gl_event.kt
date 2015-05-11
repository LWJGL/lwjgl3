/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*
import org.lwjgl.opengl.*

val khr_gl_event = dependsOn(Module.OPENGL) {
	"KHRGLEvent".nativeClassCL("khr_gl_event", KHR) {
		nativeImport (
			"OpenCL.h",
			"opengl_types.h"
		)

		documentation =
			"""
		Native bindings to the $extensionName extension.

		This extension allows creating OpenCL event objects linked to OpenGL fence sync objects, potentially improving efficiency of sharing images and buffers
		between the two APIs. The companion {@link org.lwjgl.opengl.ARBCLEvent GL_ARB_cl_event} extension provides the complementary functionality of creating
		an OpenGL sync object from an OpenCL event object.

		In addition, this extension modifies the behavior of CL10GL#EnqueueAcquireGLObjects() and CL10GL#EnqueueReleaseGLObjects() to implicitly
		guarantee synchronization with an OpenGL context bound in the same thread as the OpenCL context.
		"""

		IntConstant(
			"Returned by CL10#GetEventInfo() when {@code param_name} is CL10#EVENT_COMMAND_TYPE.",

			"COMMAND_GL_FENCE_SYNC_OBJECT_KHR" _ 0x200D
		)

		cl_event(
			"CreateEventFromGLsyncKHR",
			"Creates an OpenCL event object from an OpenGL fence sync object.",

			cl_context.IN("context", "the OpenCL context in which to create the event object"),
			GLsync.IN("sync", "the OpenGL fence sync object"),
			ERROR_RET
		)
	}
}