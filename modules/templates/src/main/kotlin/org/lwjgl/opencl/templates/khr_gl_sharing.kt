/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_gl_sharing = dependsOn(Module.OPENGL) {
	"KHRGLSharing".nativeClassCL("khr_gl_sharing", KHR) {
		nativeImport (
			"OpenCL.h"
		)

		documentation = "Native bindings to the $extensionLink extension."

		IntConstant(
			"""
		Returned by CL10#CreateContext(), CL10#CreateContextFromType(), and #GetGLContextInfoKHR() when an invalid OpenGL context or
		share group object handle is specified in {@code properties}.
		""",

			"INVALID_GL_SHAREGROUP_REFERENCE_KHR" _ -1000
		)

		val INVALID_GL_SHAREGROUP_REFERENCE_KHR = "#INVALID_GL_SHAREGROUP_REFERENCE_KHR"

		IntConstant(
			"""
		Accepted as the {@code param_name} argument of #GetGLContextInfoKHR(). Returns a list of all CL devices which may be associated with the
		specified OpenGL context.
		""",

			"DEVICES_FOR_GL_CONTEXT_KHR" _ 0x2007
		)

		IntConstant(
			"""
		Accepted as the {@code param_name} argument of #GetGLContextInfoKHR(). Returns the CL device currently associated with the specified OpenGL
		context.
		""",

			"CURRENT_DEVICE_FOR_GL_CONTEXT_KHR" _ 0x2006
		)


		IntConstant(
			"Accepted as an attribute name in the {@code properties} argument of CL10#CreateContext() and CL10#CreateContextFromType().",

			"GL_CONTEXT_KHR" _ 0x2008,
			"EGL_DISPLAY_KHR" _ 0x2009,
			"GLX_DISPLAY_KHR" _ 0x200A,
			"WGL_HDC_KHR" _ 0x200B,
			"CGL_SHAREGROUP_KHR" _ 0x200C
		)

		cl_int(
			"GetGLContextInfoKHR",
			"""
		Queries the OpenCL device currently corresponding to an OpenGL context.

		Such a device may not always exist (for example, if an OpenGL context is specified on a GPU not supporting OpenCL command queues, but which does support
		shared CL/GL objects), and if it does exist, may change over time. When such a device does exist, acquiring and releasing shared CL/GL objects may be
		faster on a command queue corresponding to this device than on command queues corresponding to other devices available to an OpenCL context.
		""",

			Check(5) _ const _ cl_context_properties_p.IN(
				"properties",
				"""
			points to an attribute list whose format and valid contents are identical to the {code properties} argument of CL10#CreateContext().
			{@code properties} must identify a single valid GL context or GL share group object.
			"""
			),
			cl_gl_context_info.IN(
				"param_name",
				"a constant that specifies the GL context information to query",
				"#DEVICES_FOR_GL_CONTEXT_KHR #CURRENT_DEVICE_FOR_GL_CONTEXT_KHR"
			),
			PARAM_VALUE_SIZE,
			MultiType(PointerMapping.DATA_POINTER) _ nullable _ void_p.IN("param_value", param_value),
			PARAM_VALUE_SIZE_RET,

			returnDoc =
			"""
		$SUCCESS if the function is executed successfully. If no device(s) exist corresponding to {@code param_name}, the call will not fail, but the value
		of {@code param_value_size_ret} will be zero.

		Returns $INVALID_GL_SHAREGROUP_REFERENCE_KHR if a context was specified by any of the following means:
		${ul(
				"A context was specified for an EGL-based OpenGL ES or OpenGL implementation by setting the attributes #GL_CONTEXT_KHR and #EGL_DISPLAY_KHR.",
				"A context was specified for a GLX-based OpenGL implementation by setting the attributes #GL_CONTEXT_KHR and #GLX_DISPLAY_KHR.",
				"A context was specified for a WGL-based OpenGL implementation by setting the attributes #GL_CONTEXT_KHR and #WGL_HDC_KHR."
			)}
		and any of the following conditions hold:
		${ul(
				"The specified display and context attributes do not identify a valid OpenGL or OpenGL ES context.",
				"The specified context does not support buffer and renderbuffer objects.",
				"""
			The specified context is not compatible with the OpenCL context being created (for example, it exists in a physically distinct address space, such
			as another hardware device; or it does not support sharing data with OpenCL due to implementation restrictions).
			"""
			)}

		Returns $INVALID_GL_SHAREGROUP_REFERENCE_KHR if a share group was specified for a CGL-based OpenGL implementation by setting the attribute
		#CGL_SHAREGROUP_KHR, and the specified share group does not identify a valid CGL share group object.

		Returns $INVALID_OPERATION if a context was specified as described above and any of the following conditions hold:
		${ul(
				"""
			A context or share group object was specified for one of CGL, EGL, GLX, or WGL and the OpenGL implementation does not support that window-system
			binding API.
			""",
				"""
			More than one of the attributes #CGL_SHAREGROUP_KHR, #EGL_DISPLAY_KHR, #GLX_DISPLAY_KHR, and
			#WGL_HDC_KHR is set to a non-default value.
			""",
				"Both of the attributes #CGL_SHAREGROUP_KHR and #GL_CONTEXT_KHR are set to non-default values.",
				"Any of the devices specified in the {@code devices} argument cannot support OpenCL objects which share the data store of an OpenGL object."
			)}

		Returns $INVALID_VALUE if an invalid attribute name is specified in {@code properties}.

		Additionally, returns $INVALID_VALUE if {@code param_name} is invalid, or if the size in bytes specified by {@code param_value_size} is
		less than the size of the return type and {@code param_value} is not a $NULL value, CL10#OUT_OF_RESOURCES if there is a failure to allocate
		resources required by the OpenCL implementation on the device, or CL10#OUT_OF_HOST_MEMORY if there is a failure to allocate resources required by
		the OpenCL implementation on the host.
		"""
		)
	}
}