/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*
import org.lwjgl.opengl.*

val INVALID_GL_OBJECT = "CL10GL#INVALID_GL_OBJECT"
val INVALID_MIP_LEVEL = "CL10GL#INVALID_MIP_LEVEL"

val CL10GL = dependsOn(Module.OPENGL) {
	"CL10GL".nativeClassCL("CL10GL") {
		javaImport (
			"org.lwjgl.opengl.GL11",
			"org.lwjgl.opengl.GL12",
			"org.lwjgl.opengl.GL13",
			"org.lwjgl.opengl.GL15",
			"org.lwjgl.opengl.GL30",
			"org.lwjgl.opengl.GL31"
		)

		nativeImport (
			"OpenCL.h",
			"opengl_types.h"
		)

		documentation =
			"""
		The OpenCL 1.0 OpenGL interoperability functionality.

		OpenCL memory objects may be created from OpenGL objects if and only if the OpenCL context has been created from an OpenGL share group object or
		context. OpenGL share groups and contexts are created using platform specific APIs such as EGL, CGL, WGL, and GLX. On MacOS X, an OpenCL context may be
		created from an OpenGL share group object using the OpenCL platform extension <strong>cl_apple_gl_sharing</strong>. On other platforms including
		Microsoft Windows, Linux/Unix and others, an OpenCL context may be created from an OpenGL context using the Khronos platform extension
		<strong>cl_khr_gl_sharing</strong>.

		Any supported OpenGL object defined within the GL share group object, or the share group associated with the GL context from which the CL context is
		created, may be shared, with the exception of the default OpenGL objects (i.e. objects named zero), which may not be shared.
		<h3>Lifetime of Shared Objects</h3>
		An OpenCL memory object created from an OpenGL object (hereinafter refered to as a “shared CL/GL object”) remains valid as long as the corresponding GL
		object has not been deleted. If the GL object is deleted through the GL API (e.g. GL15##glDeleteBuffers(), GL11##glDeleteTextures(), or
		GL30##glDeleteRenderbuffers()), subsequent use of the CL buffer or image object will result in undefined behavior, including but not limited to
		possible CL errors and data corruption, but may not result in program termination.

		The CL context and corresponding command-queues are dependent on the existence of the GL share group object, or the share group associated with the GL
		context from which the CL context is created. If the GL share group object or all GL contexts in the share group are destroyed, any use of the CL
		context or command-queue(s) will result in undefined behavior, which may include program termination. Applications should destroy the CL
		command-queue(s) and CL context before destroying the corresponding GL share group or contexts.
		<h3>Synchronizing OpenCL and OpenGL Access to Shared Objects</h3>
		The application is responsible for maintaining the proper order of operations if the CL and GL contexts are in separate threads.

		If a GL context is bound to a thread other than the one in which #EnqueueReleaseGLObjects() is called, changes to any of the objects in
		{@code mem_objects} may not be visible to that context without additional steps being taken by the application. For an OpenGL 3.1 (or later) context,
		the requirements are described in Appendix D ("Shared Objects and Multiple Contexts") of the OpenGL 3.1 Specification. For prior versions of OpenGL, the
		requirements are implementation dependent.

		Attempting to access the data store of an OpenGL object after it has been acquired by OpenCL and before it has been released will result in undefined
		behavior. Similarly, attempting to access a shared CL/GL object from OpenCL before it has been acquired by the OpenCL command queue, or after it has
		been released, will result in undefined behavior.
		"""

		IntConstant(
			"Error Codes",

			"INVALID_GL_OBJECT" expr "-60",
			"INVALID_MIP_LEVEL" expr "-62"
		)

		val GLObjectTypes = IntConstant(
			"cl_gl_object_type",

			"GL_OBJECT_BUFFER" _ 0x2000,
			"GL_OBJECT_TEXTURE2D" _ 0x2001,
			"GL_OBJECT_TEXTURE3D" _ 0x2002,
			"GL_OBJECT_RENDERBUFFER" _ 0x2003
		).javaDocLinks + " CL12GL#GL_OBJECT_TEXTURE_2D_ARRAY CL12GL#GL_OBJECT_TEXTURE1D CL12GL#GL_OBJECT_TEXTURE1D_ARRAY CL12GL#GL_OBJECT_TEXTURE_BUFFER"

		val GLTextureInfo = IntConstant(
			"cl_gl_texture_info",

			"GL_TEXTURE_TARGET" _ 0x2004,
			"GL_MIPMAP_LEVEL" _ 0x2005
		).javaDocLinks + " KHRGLMSAASharing#GL_NUM_SAMPLES"

		cl_mem(
			"CreateFromGLBuffer",
			"""
		Creates an OpenCL buffer object from an OpenGL buffer object.

		The size of the GL buffer object data store at the time {@code clCreateFromGLBuffer} is called will be used as the size of buffer object returned by
		{@code clCreateFromGLBuffer}. If the state of a GL buffer object is modified through the GL API (e.g. GL15##glBufferData()) while there exists a
		corresponding CL buffer object, subsequent use of the CL buffer object will result in undefined behavior.

		The CL10#RetainMemObject() and CL10#ReleaseMemObject() functions can be used to retain and release the buffer object.
		""",

			cl_context.IN("context", "a valid OpenCL context created from an OpenGL context"),
			cl_mem_flags.IN(
				"flags",
				"a bit-field that is used to specify usage information",
				"CL10#MEM_READ_ONLY CL10#MEM_WRITE_ONLY CL10#MEM_READ_WRITE"
			),
			GLuint.IN(
				"bufobj",
				"""
			the name of a GL buffer object. The data store of the GL buffer object must have have been previously created by calling GL15##glBufferData(),
			although its contents need not be initialized. The size of the data store will be used to determine the size of the CL buffer object.
			"""
			),
			ERROR_RET,

			returnDoc =
			"""
		a valid non-zero OpenCL buffer object and $errcode_ret is set to $SUCCESS if the buffer object is created successfully. Otherwise, it returns a $NULL
		value with one of the following error values returned in $errcode_ret:
		${ul(
				"$INVALID_CONTEXT if {@code context} is not a valid context or was not created from a GL context.",
				"$INVALID_VALUE if values specified in {@code flags} are not valid.",
				"""
			$INVALID_GL_OBJECT if {@code bufobj} is not a GL buffer object or is a GL buffer object but does not have an existing data store or the
			size of the buffer is 0.
			""",
				OORE,
				OOHME
			)}
		"""
		)

		cl_mem(
			"CreateFromGLTexture2D",
			"""
		Creates an OpenCL 2D image object from an OpenGL 2D texture object, or a single face of an OpenGL cubemap texture object.

		If the state of a GL texture object is modified through the GL API (e.g. GL11##glTexImage2D() or the values of the texture parameters
		GL12##GL_TEXTURE_BASE_LEVEL or GL12##GL_TEXTURE_MAX_LEVEL are modified) while there exists a corresponding CL image object, subsequent use
		of the CL image object will result in undefined behavior.

		The CL10#RetainMemObject() and CL10#ReleaseMemObject() functions can be used to retain and release the image objects.
		""",

			cl_context.IN("context", "a valid OpenCL context created from an OpenGL context"),
			cl_mem_flags.IN(
				"flags",
				"a bit-field that is used to specify usage information",
				"CL10#MEM_READ_ONLY CL10#MEM_WRITE_ONLY CL10#MEM_READ_WRITE"
			),
			GLenum.IN(
				"texture_target",
				"defines the image type of {@code texture}. No reference to a bound GL texture object is made or implied by this parameter.",
				"""
			GL11##GL_TEXTURE_2D GL13##GL_TEXTURE_CUBE_MAP_POSITIVE_X GL13##GL_TEXTURE_CUBE_MAP_POSITIVE_Y GL13##GL_TEXTURE_CUBE_MAP_POSITIVE_Z
			GL13##GL_TEXTURE_CUBE_MAP_NEGATIVE_X GL13##GL_TEXTURE_CUBE_MAP_NEGATIVE_Y GL13##GL_TEXTURE_CUBE_MAP_NEGATIVE_Z GL31##GL_TEXTURE_RECTANGLE
			"""
			),
			GLint.IN("miplevel", "the mipmap level to be used. Implementations may return $INVALID_OPERATION for {@code miplevel} values &gt; 0."),
			GLuint.IN(
				"texture",
				"""
			the name of a GL 2D, cubemap or rectangle texture object. The texture object must be a complete texture as per OpenGL rules on texture completeness.
			The texture format and dimensions defined by OpenGL for the specified {@code miplevel} of the texture will be used to create the 2D image object.
			Only GL texture objects with an internal format that maps to appropriate OpenCL image channel order and data type may be used to create a 2D image
			object.
			"""
			),
			ERROR_RET,

			returnDoc =
			"""
		a valid non-zero OpenCL image object and $errcode_ret is set to $SUCCESS if the image object is created successfully. Otherwise, it returns a $NULL
		value with one of the following error values returned in $errcode_ret:
		${ul(
				"$INVALID_CONTEXT if {@code context} is not a valid context or was not created from a GL context.",
				"""
			$INVALID_VALUE if values specified in {@code flags} are not valid or if value specified in {@code texture_target} is not one of the
			values specified in the description of {@code texture_target}.
			""",
				"""
			$INVALID_MIP_LEVEL if {@code miplevel} is less than the value of {@code level}<sub>base</sub> (for OpenGL implementations) or zero (for
			OpenGL ES implementations); or greater than the value of {@code q} (for both OpenGL and OpenGL ES).
			""",
				"""
			$INVALID_MIP_LEVEL if {@code miplevel} is greather than zero and the OpenGL implementation does not support creating from non-zero mipmap
			levels.
			""",
				"""
			$INVALID_GL_OBJECT if {@code texture} is not a GL texture object whose type matches {@code texture_target}, if the specified {@code miplevel}
			of texture is not defined, or if the width or height of the specified {@code miplevel} is zero.
			""",
				"$INVALID_IMAGE_FORMAT_DESCRIPTOR if the OpenGL texture internal format does not map to a supported OpenCL image format.",
				"$INVALID_OPERATION if {@code texture} is a GL texture object created with a border width value greater than zero.",
				OORE,
				OOHME
			)}
		"""
		)

		cl_mem(
			"CreateFromGLTexture3D",
			"""
		Creates an OpenCL 3D image object from an OpenGL 3D texture object.

		If the state of a GL texture object is modified through the GL API (e.g. GL12##glTexImage3D() or the values of the texture parameters
		GL12##GL_TEXTURE_BASE_LEVEL or GL12##GL_TEXTURE_MAX_LEVEL are modified) while there exists a corresponding CL image object, subsequent use
		of the CL image object will result in undefined behavior.

		The CL10#RetainMemObject() and CL10#ReleaseMemObject() functions can be used to retain and release the image objects.
		""",

			cl_context.IN("context", "a valid OpenCL context created from an OpenGL context"),
			cl_mem_flags.IN(
				"flags",
				"a bit-field that is used to specify usage information",
				"CL10#MEM_READ_ONLY CL10#MEM_WRITE_ONLY CL10#MEM_READ_WRITE"
			),
			GLenum.IN(
				"texture_target",
				"defines the image type of {@code texture}. No reference to a bound GL texture object is made or implied by this parameter.",
				"GL12##GL_TEXTURE_3D"
			),
			GLint.IN("miplevel", "the mipmap level to be used"),
			GLuint.IN(
				"texture",
				"""
			the name of a GL 3D texture object. The texture object must be a complete texture as per OpenGL rules on texture completeness. The texture format
			and dimensions defined by OpenGL for the specified {@code miplevel} of the texture will be used to create the 3D image object. Only GL texture
			objects with an internal format that maps to appropriate OpenCL image channel order and data type can be used to create the 3D image object.
			"""
			),
			ERROR_RET,

			returnDoc =
			"""
		a valid non-zero image object and $errcode_ret is set to $SUCCESS if the image object is created successfully. Otherwise, it returns a $NULL value
		with one of the following error values returned in $errcode_ret:
		 ${ul(
				"$INVALID_CONTEXT if {@code context} is not a valid context or was not created from a GL context.",
				"""
			$INVALID_VALUE if values specified in {@code flags} are not valid or if value specified in {@code texture_target} is not one of the
			values specified in the description of {@code texture_target}.
			""",
				"""
			$INVALID_MIP_LEVEL if {@code miplevel} is less than the value of {@code level}<sub>base</sub> (for OpenGL implementations) or zero (for
			OpenGL ES implementations); or greater than the value of {@code q} (for both OpenGL and OpenGL ES).
			""",
				"""
			$INVALID_MIP_LEVEL if {@code miplevel} is greather than zero and the OpenGL implementation does not support creating from non-zero mipmap
			levels.
			""",
				"""
			$INVALID_GL_OBJECT if {@code texture} is not a GL texture object whose type matches {@code texture_target}, if the specified {@code miplevel}
			of texture is not defined, or if the width or height of the specified {@code miplevel} is zero.
			""",
				"$INVALID_IMAGE_FORMAT_DESCRIPTOR if the OpenGL texture internal format does not map to a supported OpenCL image format.",
				"$INVALID_OPERATION if {@code texture} is a GL texture object created with a border width value greater than zero.",
				OORE,
				OOHME
			)}
		"""
		)

		cl_mem(
			"CreateFromGLRenderbuffer",
			"""
		Creates an OpenCL 2D image object from an OpenGL renderbuffer object.

		If the state of a GL renderbuffer object is modified through the GL API (i.e. changes to the dimensions or format used to represent pixels of the GL
		renderbuffer using appropriate GL API calls such as GL30##glRenderbufferStorage()) while there exists a corresponding CL image object, subsequent
		use of the CL image object will result in undefined behavior.

		The CL10#RetainMemObject() and CL10#ReleaseMemObject() functions can be used to retain and release the image objects.
		""",

			cl_context.IN("context", "a valid OpenCL context created from an OpenGL context"),
			cl_mem_flags.IN(
				"flags",
				"a bit-field that is used to specify usage information",
				"CL10#MEM_READ_ONLY CL10#MEM_WRITE_ONLY CL10#MEM_READ_WRITE"
			),
			GLuint.IN(
				"renderbuffer",
				"""
			the name of a GL renderbuffer object. The renderbuffer storage must be specified before the image object can be created. The {@code renderbuffer}
			format and dimensions defined by OpenGL will be used to create the 2D image object. Only GL renderbuffers with internal formats that maps to
			appropriate OpenCL image channel order and data type can be used to create the 2D image object.
			"""
			),
			ERROR_RET,

			returnDoc =
			"""
		a valid non-zero OpenCL image object and $errcode_ret is set to $SUCCESS if the image object is created successfully. Otherwise, it returns a $NULL
		value with one of the following error values returned in $errcode_ret:
		${ul(
				"$INVALID_CONTEXT if {@code context} is not a valid context or was not created from a GL context.",
				"$INVALID_VALUE if values specified in {@code flags} are not valid.",
				"$INVALID_GL_OBJECT if {@code renderbuffer} is not a GL renderbuffer object or if the width or height of {@code renderbuffer} is zero.",
				"$INVALID_IMAGE_FORMAT_DESCRIPTOR if the OpenGL renderbuffer internal format does not map to a supported OpenCL image format.",
				"$INVALID_OPERATION if {@code renderbuffer} is a multi-sample GL renderbuffer object.",
				OORE,
				OOHME
			)}
		"""
		)

		cl_int(
			"GetGLObjectInfo",
			"""
		Queries the OpenGL object used to create the OpenCL memory object and information about the object type i.e. whether it is a texture, renderbuffer or
		buffer object.
		""",

			cl_mem.IN("memobj", "the memory object being queried"),
			nullable _ cl_gl_object_type_p.OUT(
				"gl_object_type",
				"returns the type of GL object attached to {@code memobj}. If {@code gl_object_type} is $NULL, it is ignored.",
				GLObjectTypes
			),
			nullable _ GLuint_p.OUT("gl_object_name", "the GL object name used to create {@code memobj}. If {@code gl_object_name} is $NULL, it is ignored."),

			returnDoc =
			"""
		$SUCCESS if the call was executed successfully. Otherwise, it returns one of the following errors:
		${ul(
				"$INVALID_MEM_OBJECT if {@code memobj} is not a valid OpenCL memory object.",
				"$INVALID_GL_OBJECT if there is no GL object associated with {@code memobj}.",
				OORE,
				OOHME
			)}
		"""
		)

		cl_int(
			"GetGLTextureInfo",
			"Returns additional information about the GL texture object associated with {@code memobj}.",

			cl_mem.IN("memobj", ""),
			cl_gl_texture_info.IN(
				"param_name",
				"specifies what additional information about the GL texture object associated with {@code memobj} to query",
				GLTextureInfo
			),
			PARAM_VALUE_SIZE,
			MultiType(PointerMapping.DATA_INT) _ nullable _ void_p.IN("param_value", param_value),
			PARAM_VALUE_SIZE_RET,

			returnDoc =
			"""
		$SUCCESS if the function is executed successfully. Otherwise, it returns one of the following errors:
		${ul(
				"$INVALID_MEM_OBJECT if {@code memobj} is not a valid OpenCL memory object.",
				"$INVALID_GL_OBJECT if there is no GL texture object associated with {@code memobj}.",
				"""
			$INVALID_VALUE if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return
			type and {@code param_value} is not $NULL, or if {@code param_value} and {@code param_value_size_ret} are $NULL.
			""",
				OORE,
				OOHME
			)}
		"""
		)

		cl_int(
			"EnqueueAcquireGLObjects",
			"""
		Acquire OpenCL memory objects that have been created from OpenGL objects. These objects need to be acquired before they can be used by any OpenCL
		commands queued to a command-queue. The OpenGL objects are acquired by the OpenCL context associated with command_queue and can therefore be used by all
		command-queues associated with the OpenCL context.

		Prior to calling {@code clEnqueueAcquireGLObjects}, the application must ensure that any pending GL operations which access the objects specified in
		{@code mem_objects} have completed. This may be accomplished portably by issuing and waiting for completion of a GL11##glFinish() command on all GL
		contexts with pending references to these objects. Implementations may offer more efficient synchronization methods; for example on some platforms
		calling GL11##glFlush() may be sufficient, or synchronization may be implicit within a thread, or there may be vendor-specific extensions that
		enable placing a fence in the GL command stream and waiting for completion of that fence in the CL command queue. Note that no synchronization methods
		other than GL11##glFinish() are portable between OpenGL implementations at this time.
		""",

			cl_command_queue.IN(
				"command_queue",
				"""
			a valid command-queue. All devices used to create the OpenCL context associated with {@code command_queue} must support acquiring shared CL/GL
			objects. This constraint is enforced at context creation time.
			"""
			),
			AutoSize("mem_objects") _ cl_uint.IN("num_objects", "the number of memory objects to be acquired in {@code mem_objects}"),
			const _ SingleValue("mem_object") _ cl_mem_p.IN("mem_objects", "a pointer to a list of CL memory objects that correspond to GL objects"),
			NEWL,
			EWL,
			EVENT,

			returnDoc =
			"""
		$SUCCESS if the function is executed successfully. If {@code num_objects} is 0 and {@code mem_objects} is $NULL the function does nothing and returns
		$SUCCESS. Otherwise, it returns one of the following errors:
		${ul(
				"""
			$INVALID_VALUE if {@code num_objects} is zero and {@code mem_objects} is not a $NULL value or if {@code num_objects} &gt; 0 and
			{@code mem_objects} is $NULL.
			""",
				"$INVALID_MEM_OBJECT if memory objects in {@code mem_objects} are not valid OpenCL memory objects.",
				ICQE,
				"$INVALID_CONTEXT if context associated with {@code command_queue} was not created from an OpenGL context.",
				"$INVALID_GL_OBJECT if memory objects in {@code mem_objects} have not been created from a GL object(s).",
				IEWLE,
				OORE,
				OOHME
			)}
		"""
		)

		cl_int(
			"EnqueueReleaseGLObjects",
			"""
		Releases OpenCL memory objects that have been created from OpenGL objects. These objects need to be released before they can be used by OpenGL. The
		OpenGL objects are released by the OpenCL context associated with {@code command_queue}.

		After calling {@code clEnqueueReleaseGLObjects}, the application is responsible for ensuring that any pending OpenCL operations which access the objects
		specified in {@code mem_objects} have completed prior to executing subsequent GL commands which reference these objects. This may be accomplished
		portably by calling CL10#WaitForEvents() with the event object returned by {@code clEnqueueReleaseGLObjects}, or by calling CL10#Finish().
		Some implementations may offer more efficient methods.
		""",

			cl_command_queue.IN("command_queue", "a valid command-queue"),
			AutoSize("mem_objects") _ cl_uint.IN("num_objects", "the number of memory objects to be released in {@code mem_objects}"),
			const _ SingleValue("mem_object") _ cl_mem_p.IN("mem_objects", "a pointer to a list of CL memory objects that correpond to GL objects"),
			NEWL,
			EWL,
			EVENT,

			returnDoc =
			"""
		$SUCCESS if the function is executed successfully. If {@code num_objects} is 0 and {@code mem_objects} is $NULL the function does nothing and returns
		$SUCCESS. Otherwise, it returns one of the following errors:
		${ul(
				"""
			$INVALID_VALUE if {@code num_objects} is zero and {@code mem_objects} is not a $NULL value or if {@code num_objects} &gt; 0 and
			{@code mem_objects} is $NULL.
			""",
				"$INVALID_MEM_OBJECT if memory objects in {@code mem_objects} are not valid OpenCL memory objects.",
				ICQE,
				"$INVALID_CONTEXT if context associated with {@code command_queue} was not created from an OpenGL context.",
				"$INVALID_GL_OBJECT if memory objects in {@code mem_objects} have not been created from a GL object(s).",
				IEWLE,
				OORE,
				OOHME
			)}
		"""
		)
	}
}