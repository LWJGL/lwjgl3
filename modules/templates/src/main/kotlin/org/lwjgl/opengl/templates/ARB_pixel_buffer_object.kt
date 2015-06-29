/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_pixel_buffer_object = "ARBPixelBufferObject".nativeClassGL("ARB_pixel_buffer_object", postfix = ARB) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		 This extension expands on the interface provided by the ${ARB_vertex_buffer_object.link} extension (and later integrated into ${GL15.core}) in order to
		 permit buffer objects to be used not only with vertex array data, but also with pixel data. The intent is to provide more acceleration opportunities
		 for OpenGL pixel commands.

		While a single buffer object can be bound for both vertex arrays and pixel commands, we use the designations vertex buffer object (VBO) and pixel buffer
		object (PBO) to indicate their particular usage in a given situation.

		Recall that buffer objects conceptually are nothing more than arrays of bytes, just like any chunk of memory. ${ARB_vertex_buffer_object.link} allows GL
		commands to source data from a buffer object by binding the buffer object to a given target and then overloading a certain set of GL commands' pointer
		arguments to refer to offsets inside the buffer, rather than pointers to user memory. An offset is encoded in a pointer by adding the offset to a null
		pointer.

		This extension does not add any new functionality to buffer objects themselves.  It simply adds two new targets to which buffer objects can be bound:
		#PIXEL_PACK_BUFFER_ARB and #PIXEL_UNPACK_BUFFER_ARB. When a buffer object is bound to the #PIXEL_PACK_BUFFER_ARB target, commands such as
		GL11#ReadPixels() pack (write) their data into a buffer object. When a buffer object is bound to the #PIXEL_UNPACK_BUFFER_ARB target, commands such as
		GL11#DrawPixels() and GL11#TexImage2D() unpack (read) their data from a buffer object.

		There are a several approaches to improve graphics performance with PBOs. Some of the most interesting approaches are:
		${ul(
			"""
			Streaming texture updates: If the application uses GL15#MapBuffer()/GL15#UnmapBuffer() to write its data for glTexSubImage into a buffer object, at
			least one of the data copies usually required to download a texture can be eliminated, significantly increasing texture download performance.
			""",
		    """
		    Streaming draw pixels: When GL11#DrawPixels() sources client memory, OpenGL says the client memory can be modified immediately after the
		    glDrawPixels command returns without disturbing the drawn image. This typically necessitates unpacking and copying the image prior to glDrawPixels
		    returning. However, when using glDrawPixels with a pixel pack buffer object, glDrawPixels may return prior to image unpacking because future
		    modification of the buffer data requires explicit commands (GL15#MapBuffer(), GL15#BufferData(), or GL15#BufferSubData()).
		    """,
		    """
		    Asynchronous GL11#ReadPixels(): If an application needs to read back a number of images and process them with the CPU, the existing GL interface
		    makes it nearly impossible to pipeline this operation. The driver will typically send the hardware a readback command when glReadPixels is called,
		    and then wait for all of the data to be available before returning control to the application. Then, the application can either process the data
		    immediately or call glReadPixels again; in neither case will the readback overlap with the processing. If the application issues several readbacks
		    into several buffer objects, however, and then maps each one to process its data, then the readbacks can proceed in parallel with the data processing.
		    """,
		    """
		    Render to vertex array: The application can use a fragment program to render some image into one of its buffers, then read this image out into a
		    buffer object via GL11#ReadPixels(). Then, it can use this buffer object as a source of vertex data.
		    """
		)}
		Requires ${GL15.core} or ${ARB_vertex_buffer_object.link}. ${GL21.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferParameteriv, and
		GetBufferPointerv.
		""",

		"PIXEL_PACK_BUFFER_ARB" _ 0x88EB,
		"PIXEL_UNPACK_BUFFER_ARB" _ 0x88EC
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"PIXEL_PACK_BUFFER_BINDING_ARB" _ 0x88ED,
		"PIXEL_UNPACK_BUFFER_BINDING_ARB" _ 0x88EF
	)
}