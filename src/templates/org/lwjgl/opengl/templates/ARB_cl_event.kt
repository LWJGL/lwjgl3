/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.opencl.*

fun ARB_cl_event() = "ARBCLEvent".nativeClassGL("ARB_cl_event", postfix = ARB) {
	javaImport(
		"org.lwjgl.opencl.*"
	)

	nativeImport (
		"OpenGL.h",
	    "OpenCL.h"
	)

	javaDoc("Native bindings to the ${link("http://www.opengl.org/registry/specs/ARB/cl_event.txt", templateName)} extension.")

	IntConstant.block(
		"Returned in {@code values} for {@link GL32#glGetSync} {@code pname} {@link GL32#GL_OBJECT_TYPE}.",

		"SYNC_CL_EVENT_ARB" _ 0x8240
	)

	IntConstant.block(
		"Returned in {@code values} for {@link GL32#glGetSync} {@code pname} {@link GL32#GL_SYNC_CONDITION}.",

		"SYNC_CL_EVENT_COMPLETE_ARB" _ 0x8241
	)

	GLsync.func(
		"CreateSyncFromCLeventARB",
		"""
		Creates a linked sync object. {@code context} and {@code event} must be handles to a valid OpenCL context and a valid event in that context,
		respectively. {@code context} must support sharing with GL, and must have been created with respect to the current GL context, or to a share group
		including the current GL context.

		The status of such a sync object depends on {@code event}. When the status of {@code event} is {@link CL10#CL_QUEUED}, {@link CL10#CL_SUBMITTED}, or
		{@link CL10#CL_RUNNING}, the status of the linked sync object will be {@link GL32#GL_UNSIGNALED}. When the status of {@code event} changes to
		{@link CL1#CL_COMPLETE}, the status of the linked sync object will become {@link GL32#GL_SIGNALED}.

		Creating a linked sync object places a reference on the linked OpenCL event object. When the sync object is deleted, the reference will be removed from
		the event object.
		""",

		cl_context.IN("context", "a valid OpenCL context"),
		cl_event.IN("event", "a valid OpenCL event"),
		GLbitfield.IN("flags", "must be 0 (placeholder for anticipated future extensions of sync object capabilities)")
	)

}