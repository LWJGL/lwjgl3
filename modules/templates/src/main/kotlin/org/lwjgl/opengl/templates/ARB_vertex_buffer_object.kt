/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.opengl.*

val ARB_vertex_buffer_object = "ARBVertexBufferObject".nativeClassGL("ARB_vertex_buffer_object", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension defines an interface that allows various types of data (especially vertex array data) to be cached in high-performance graphics memory on
		the server, thereby increasing the rate of data transfers.

		Chunks of data are encapsulated within "buffer objects", which conceptually are nothing more than arrays of bytes, just like any chunk of memory. An API
		is provided whereby applications can read from or write to buffers, either via the GL itself (#BufferDataARB(), #BufferSubDataARB(),
		#GetBufferSubDataARB()) or via a pointer to the memory.

		The latter technique is known as "mapping" a buffer.  When an application maps a buffer, it is given a pointer to the memory. When the application
		finishes reading from or writing to the memory, it is required to "unmap" the buffer before it is once again permitted to use that buffer as a GL data
		source or sink. Mapping often allows applications to eliminate an extra data copy otherwise required to access the buffer, thereby enhancing
		performance. In addition, requiring that applications unmap the buffer to use it as a data source or sink ensures that certain classes of latent
		synchronization bugs cannot occur.

		Although this extension only defines hooks for buffer objects to be used with OpenGL's vertex array APIs, the API defined in this extension permits
		buffer objects to be used as either data sources or sinks for any GL command that takes a pointer as an argument. Normally, in the absence of this
		extension, a pointer passed into the GL is simply a pointer to the user's data. This extension defines a mechanism whereby this pointer is used not as a
		pointer to the data itself, but as an offset into a currently bound buffer object. The buffer object ID zero is reserved, and when buffer object zero is
		bound to a given target, the commands affected by that buffer binding behave normally. When a nonzero buffer ID is bound, then the pointer represents an
		offset.

		In the case of vertex arrays, this extension defines not merely one binding for all attributes, but a separate binding for each individual attribute. As
		a result, applications can source their attributes from multiple buffers. An application might, for example, have a model with constant texture
		coordinates and variable geometry. The texture coordinates might be retrieved from a buffer object with the usage mode "STATIC_DRAW", indicating to the
		GL that the application does not expect to update the contents of the buffer frequently or even at all, while the vertices might be retrieved from a
		buffer object with the usage mode "STREAM_DRAW", indicating that the vertices will be updated on a regular basis.

		In addition, a binding is defined by which applications can source index data (as used by GL11#DrawElements(), GL12#DrawRangeElements(), and
		GL14#MultiDrawElements()) from a buffer object. On some platforms, this enables very large models to be rendered with no more than a few small commands
		to the graphics device.

		It is expected that a future extension will allow sourcing pixel data from and writing pixel data to a buffer object.

        ${GL15.promoted}
		"""

	IntConstant(
		"""
		Accepted by the {@code target} parameters of BindBufferARB, BufferDataARB, BufferSubDataARB, MapBufferARB, UnmapBufferARB, GetBufferSubDataARB,
		GetBufferParameterivARB, and GetBufferPointervARB.
		""",

		"ARRAY_BUFFER_ARB" _ 0x8892,
		"ELEMENT_ARRAY_BUFFER_ARB" _ 0x8893
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"ARRAY_BUFFER_BINDING_ARB" _ 0x8894,
		"ELEMENT_ARRAY_BUFFER_BINDING_ARB" _ 0x8895,
		"VERTEX_ARRAY_BUFFER_BINDING_ARB" _ 0x8896,
		"NORMAL_ARRAY_BUFFER_BINDING_ARB" _ 0x8897,
		"COLOR_ARRAY_BUFFER_BINDING_ARB" _ 0x8898,
		"INDEX_ARRAY_BUFFER_BINDING_ARB" _ 0x8899,
		"TEXTURE_COORD_ARRAY_BUFFER_BINDING_ARB" _ 0x889A,
		"EDGE_FLAG_ARRAY_BUFFER_BINDING_ARB" _ 0x889B,
		"SECONDARY_COLOR_ARRAY_BUFFER_BINDING_ARB" _ 0x889C,
		"FOG_COORDINATE_ARRAY_BUFFER_BINDING_ARB" _ 0x889D,
		"WEIGHT_ARRAY_BUFFER_BINDING_ARB" _ 0x889E
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetVertexAttribivARB.",

		"VERTEX_ATTRIB_ARRAY_BUFFER_BINDING_ARB" _ 0x889F
	)

	val BUFFER_OBJECT_USAGE_HINTS = IntConstant(
		"Accepted by the {@code usage} parameter of BufferDataARB.",

		"STREAM_DRAW_ARB" _ 0x88E0,
		"STREAM_READ_ARB" _ 0x88E1,
		"STREAM_COPY_ARB" _ 0x88E2,
		"STATIC_DRAW_ARB" _ 0x88E4,
		"STATIC_READ_ARB" _ 0x88E5,
		"STATIC_COPY_ARB" _ 0x88E6,
		"DYNAMIC_DRAW_ARB" _ 0x88E8,
		"DYNAMIC_READ_ARB" _ 0x88E9,
		"DYNAMIC_COPY_ARB" _ 0x88EA
	).javaDocLinks

	val BUFFER_OBJECT_ACCESS_POLICIES = IntConstant(
		"Accepted by the {@code access} parameter of MapBufferARB.",

		"READ_ONLY_ARB" _ 0x88B8,
		"WRITE_ONLY_ARB" _ 0x88B9,
		"READ_WRITE_ARB" _ 0x88BA
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBufferParameterivARB.",

		"BUFFER_SIZE_ARB" _ 0x8764,
		"BUFFER_USAGE_ARB" _ 0x8765,
		"BUFFER_ACCESS_ARB" _ 0x88BB,
		"BUFFER_MAPPED_ARB" _ 0x88BC
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBufferPointervARB.",

		"BUFFER_MAP_POINTER_ARB" _ 0x88BD
	)

	GLvoid(
		"BindBufferARB",
		"Binds a named buffer object.",

		GLenum.IN("target", "the target to which the buffer object is bound", BUFFER_OBJECT_TARGETS),
		GLuint.IN("buffer", "the name of a buffer object")
	)

	GLvoid(
		"DeleteBuffersARB",
		"Deletes named buffer objects.",

		AutoSize("buffers") _ GLsizei.IN("n", "the number of buffer objects to be deleted"),
		const _ SingleValue("buffer") _ GLuint_p.IN("buffers", "an array of buffer objects to be deleted")
	)

	GLvoid(
		"GenBuffersARB",
		"Generates buffer object names.",

		AutoSize("buffers") _ GLsizei.IN("n", "the number of buffer object names to be generated"),
		returnValue _ GLuint_p.OUT("buffers", "a buffer in which the generated buffer object names are stored")
	)

	GLboolean(
		"IsBufferARB",
		"Determines if a name corresponds to a buffer object.",

		GLuint.IN("buffer", "a value that may be the name of a buffer object")
	)

	GLvoid(
		"BufferDataARB",
		"""
		Creates and initializes a buffer object's data store.

		{@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
		more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
		{@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
		frequency of access may be one of these:
		${ul(
			"<em>STREAM</em> - The data store contents will be modified once and used at most a few times.",
			"<em>STATIC</em> - The data store contents will be modified once and used many times.",
			"<em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times."
		)}
		The nature of access may be one of these:
		${ul(
			"<em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.",
			"<em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.",
			"<em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands."
		)}
		""",

		GLenum.IN("target", "the target buffer object", BUFFER_OBJECT_TARGETS),
		AutoSize("data") _ GLsizeiptrARB.IN("size", " the size in bytes of the buffer object's new data store"),
		optional _ MultiType(
			PointerMapping.DATA_BYTE,
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_FLOAT,
			PointerMapping.DATA_DOUBLE
		) _ const _ GLvoid_p.IN("data", "a pointer to data that will be copied into the data store for initialization, or NULL if no data is to be copied"),
		GLenum.IN("usage", "the expected usage pattern of the data store", BUFFER_OBJECT_USAGE_HINTS)
	)

	GLvoid(
		"BufferSubDataARB",
		"Updates a subset of a buffer object's data store.",

		GLenum.IN("target", "the target buffer object", BUFFER_OBJECT_TARGETS),
		GLintptrARB.IN("offset", "the offset into the buffer object's data store where data replacement will begin, measured in bytes"),
		AutoSize("data") _ GLsizeiptrARB.IN("size", "the size in bytes of the data store region being replaced"),
		const _ GLvoid_p.IN("data", "a pointer to the new data that will be copied into the data store")
	)

	GLvoid(
		"GetBufferSubDataARB",
		"Returns a subset of a buffer object's data store.",

		GLenum.IN("target", "the target buffer object", BUFFER_OBJECT_TARGETS),
		GLintptrARB.IN("offset", "the offset into the buffer object's data store from which data will be returned, measured in bytes"),
		AutoSize("data") _ GLsizeiptrARB.IN("size", "the size in bytes of the data store region being returned"),
		MultiType(
			PointerMapping.DATA_BYTE,
			PointerMapping.DATA_SHORT,
			PointerMapping.DATA_INT,
			PointerMapping.DATA_FLOAT,
			PointerMapping.DATA_DOUBLE
		) _ GLvoid_p.IN("data", "a pointer to the location where buffer object data is returned")
	)

	(MapPointer("glGetBufferParameteriARB(target, GL_BUFFER_SIZE_ARB)") _ GLvoid_p)(
		"MapBufferARB",
		"""
		Maps a buffer object's data store.

		<b>LWJGL note</b>: This method comes in 3 flavors:
		${ol(
			"ARBVertexBufferObject##glMapBufferARB(int, int) - Calls #GetBufferParameteriARB() to retrieve the buffer size and a new ByteBuffer instance is always returned.",
			"ARBVertexBufferObject##glMapBufferARB(int, int, ByteBuffer) - Calls #GetBufferParameteriARB() to retrieve the buffer size and the {@code old_buffer} parameter is reused if the returned size and pointer match the buffer capacity and address, respectively.",
			"ARBVertexBufferObject##glMapBufferARB(int, int, long, ByteBuffer) - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if {@code size} and the returned pointer match the buffer capacity and address, respectively. This is the most efficient method."
		)}
		""",

		GLenum.IN("target", "the target buffer object being mapped", BUFFER_OBJECT_TARGETS),
		GLenum.IN(
			"access",
			"the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store",
			BUFFER_OBJECT_ACCESS_POLICIES
		)
	)

	GLboolean(
		"UnmapBufferARB",
		"""
		Relinquishes the mapping of a buffer object and invalidates the pointer to its data store.

		Returns TRUE unless data values in the buffer’s data store have become corrupted during the period that the buffer was mapped. Such corruption can be
		the result of a screen resolution change or other window system-dependent event that causes system heaps such as those for high-performance graphics
		memory to be discarded. GL implementations must guarantee that such corruption can occur only during the periods that a buffer’s data store is mapped.
		If such corruption has occurred, UnmapBuffer returns FALSE, and the contents of the buffer’s data store become undefined.
		""",

		GLenum.IN("target", "the target buffer object being unmapped", BUFFER_OBJECT_TARGETS)
	)

	GLvoid(
		"GetBufferParameterivARB",
		"Returns the value of a buffer object parameter.",

		GLenum.IN("target", "the target buffer object", BUFFER_OBJECT_TARGETS),
		GLenum.IN("pname", "the symbolic name of a buffer object parameter", BUFFER_OBJECT_PARAMETERS),
		returnValue _ GLint_p.OUT("params", "the requested parameter")
	)

	GLvoid(
		"GetBufferPointervARB",
		"Returns the pointer to a mapped buffer object's data store.",

		GLenum.IN("target", "the target buffer object", BUFFER_OBJECT_TARGETS),
		GLenum.IN("pname", "the pointer to be returned", "#BUFFER_MAP_POINTER_ARB"),
		returnValue _ GLvoid_pp.OUT("params", "the pointer value specified by {@code pname}")
	)
}