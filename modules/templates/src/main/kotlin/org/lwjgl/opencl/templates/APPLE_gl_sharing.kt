/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val apple_gl_sharing = dependsOn(Module.OPENGL) {
	"APPLEGLSharing".nativeClassCL("APPLE_gl_sharing", APPLE) {
		nativeImport (
			"OpenCL.h"
		)

		documentation = "Native bindings to the $extensionName extension."

		IntConstant(
			"Error code returned by #GetGLContextInfoAPPLE() if an invalid {@code platform_gl_ctx} is provided.",

			"INVALID_GL_CONTEXT_APPLE" _ -1000
		)

		IntConstant(
			"""
		This enumerated value can be specified as part of the {@code properties} argument passed to CL10#CreateContext() to allow OpenCL compliant
		devices in an existing CGL share group to be used as the devices in the newly created CL context. GL objects that were allocated in the specified CGL share
		group can now be shared between CL and GL.
		""",

			"CONTEXT_PROPERTY_USE_CGL_SHAREGROUP_APPLE" _ 0x10000000
		)

		IntConstant(
			"""
		Accepted as the {@code param_name} argument of #GetGLContextInfoAPPLE(). Returns an array of {@code cl_device_ids} for the CL device(s)
		corresponding to the virtual screen(s) for the specified CGL context.
		""",

			"CGL_DEVICES_FOR_SUPPORTED_VIRTUAL_SCREENS_APPLE" _ 0x10000003
		)

		IntConstant(
			"""
		Accepted as the {@code param_name} argument of #GetGLContextInfoAPPLE(). Returns a {@code cl_device_id} for the CL device associated with the
		virtual screen for the specified CGL context.
		""",

			"CGL_DEVICE_FOR_CURRENT_VIRTUAL_SCREEN_APPLE" _ 0x10000002
		)

		cl_int(
			"GetGLContextInfoAPPLE",
			"""
		Provides a query mechanism to retrieve OpenGL context specific information from an OpenCL context to help identify device specific mappings and usage.

		For example, one possible usage would be to allow the client to map a CGL virtual screen index to an appropriate CL device id to insure that the
		rendering device and the compute device are the same, thus guaranteeing any shared OpenGL memory that is attached o a CL memory object remains resident
		on the active device.
		""",

			cl_context.IN("context", "the context being queried"),
			voidptr.IN("platform_gl_ctx", "the OpenGL context handle"),
			cl_gl_platform_info.IN(
				"param_name",
				"a constant that specifies the GL context information to query",
				"#CGL_DEVICES_FOR_SUPPORTED_VIRTUAL_SCREENS_APPLE #CGL_DEVICE_FOR_CURRENT_VIRTUAL_SCREEN_APPLE"
			),
			PARAM_VALUE_SIZE,
			MultiType(PointerMapping.DATA_POINTER) _ nullable _ void_p.IN("param_value", param_value),
			PARAM_VALUE_SIZE_RET
		)

		// TODO: Add support for clCreateImageFromIOSurface2DAPPLE (requires MacOSX 10.7+)
	}
}