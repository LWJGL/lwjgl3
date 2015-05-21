/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_shader_buffer_load = "NVShaderBufferLoad".nativeClassGL("NV_shader_buffer_load", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		At a very coarse level, GL has evolved in a way that allows applications to replace many of the original state machine variables with blocks of
		user-defined data. For example, the current vertex state has been augmented by vertex buffer objects, fixed-function shading state and parameters have
		been replaced by shaders/programs and constant buffers, etc. Applications switch between coarse sets of state by binding objects to the context or to
		other container objects (e.g. vertex array objects) instead of manipulating state variables of the context. In terms of the number of GL commands
		required to draw an object, modern applications are orders of magnitude more efficient than legacy applications, but this explosion of objects bound to
		other objects has led to a new bottleneck - pointer chasing and CPU L2 cache misses in the driver, and general L2 cache pollution.

		This extension provides a mechanism to read from a flat, 64-bit GPU address space from programs/shaders, to query GPU addresses of buffer objects at the
		API level, and to bind buffer objects to the context in such a way that they can be accessed via their GPU addresses in any shader stage.

		The intent is that applications can avoid re-binding buffer objects or updating constants between each Draw call and instead simply use a VertexAttrib
		(or TexCoord, or InstanceID, or...) to "point" to the new object's state. In this way, one of the cheapest "state" updates (from the CPU's point of
		view) can be used to effect a significant state change in the shader similarly to how a pointer change may on the CPU. At the same time, this relieves
		the limits on how many buffer objects can be accessed at once by shaders, and allows these buffer object accesses to be exposed as C-style pointer
		dereferences in the shading language.

		As a very simple example, imagine packing a group of similar objects' constants into a single buffer object and pointing your program at object
		&lt;i&gt; by setting ${codeBlock("glVertexAttribI1iEXT(attrLoc, i);")} and using a shader as such:
		${codeBlock("""
struct MyObjectType {
	mat4x4 modelView;
    vec4 materialPropertyX;
    // etc.
};
uniform MyObjectType *allObjects;
in int objectID; // bound to attrLoc

...

mat4x4 thisObjectsMatrix = allObjects[objectID].modelView;
// do transform, shading, etc.
		""")}
		This is beneficial in much the same way that texture arrays allow choosing between similar, but independent, texture maps with a single coordinate
		identifying which slice of the texture to use. It also resembles instancing, where a lightweight change (incrementing the instance ID) can be used to
		generate a different and interesting result, but with additional flexibility over instancing because the values are app-controlled and not a single incrementing counter.

		Dependent pointer fetches are allowed, so more complex scene graph structures can be built into buffer objects providing significant new flexibility in
		the use of shaders. Another simple example, showing something you can't do with existing functionality, is to do dependent fetches into many buffer
		objects:
		${codeBlock("""
GenBuffers(N, dataBuffers);
GenBuffers(1, &pointerBuffer);

GLuint64EXT gpuAddrs[N];
for (i = 0; i < N; ++i) {
    BindBuffer(target, dataBuffers[i]);
    BufferData(target, size[i], myData[i], STATIC_DRAW);

    // get the address of this buffer and make it resident.
    GetBufferParameterui64vNV(target, BUFFER_GPU_ADDRESS,
                              gpuaddrs[i]);
    MakeBufferResidentNV(target, READ_ONLY);
}

GLuint64EXT pointerBufferAddr;
BindBuffer(target, pointerBuffer);
BufferData(target, sizeof(GLuint64EXT)*N, gpuAddrs, STATIC_DRAW);
GetBufferParameterui64vNV(target, BUFFER_GPU_ADDRESS,
                          &pointerBufferAddr);
MakeBufferResidentNV(target, READ_ONLY);

// now in the shader, we can use a double indirection
vec4 **ptrToBuffers = pointerBufferAddr;
vec4 *ptrToBufferI = ptrToBuffers[i];
		""")}
		This allows simultaneous access to more buffers than ${registryLinkTo("EXT", "bindable_uniform")} (MAX_VERTEX_BINDABLE_UNIFORMS, etc.) and each can be
		larger than MAX_BINDABLE_UNIFORM_SIZE.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBufferParameterui64vNV, GetNamedBufferParameterui64vNV.",

		"BUFFER_GPU_ADDRESS_NV" _ 0x8F1D
	)

	IntConstant(
		"Returned by the {@code type} parameter of GetActiveUniform.",

		"GPU_ADDRESS_NV" _ 0x8F34
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetIntegerui64vNV.",

		"MAX_SHADER_BUFFER_ADDRESS_NV" _ 0x8F35
	)

	GLvoid(
		"MakeBufferResidentNV",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("access", "")
	)

	GLvoid(
		"MakeBufferNonResidentNV",
		"",

		GLenum.IN("target", "")
	)

	GLboolean(
		"IsBufferResidentNV",
		"",

		GLenum.IN("target", "")
	)

	GLvoid(
		"MakeNamedBufferResidentNV",
		"",

		GLuint.IN("buffer", ""),
		GLenum.IN("access", "")
	)

	GLvoid(
		"MakeNamedBufferNonResidentNV",
		"",

		GLuint.IN("buffer", "")
	)

	GLboolean(
		"IsNamedBufferResidentNV",
		"",

		GLuint.IN("buffer", "")
	)

	GLvoid(
		"GetBufferParameterui64vNV",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLuint64EXT_p.OUT("params", "")
	)

	GLvoid(
		"GetNamedBufferParameterui64vNV",
		"",

		GLuint.IN("buffer", ""),
		GLenum.IN("pname", ""),
		Check(1) _ returnValue _ GLuint64EXT_p.OUT("params", "")
	)

	GLvoid(
		"GetIntegerui64vNV",
		"",

		GLenum.IN("value", ""),
		Check(1) _ returnValue _ GLuint64EXT_p.OUT("result", "")
	)

	GLvoid(
		"Uniformui64NV",
		"",

		GLint.IN("location", ""),
		GLuint64EXT.IN("value", "")
	)

	GLvoid(
		"Uniformui64vNV",
		"",

		GLint.IN("location", ""),
		AutoSize("value") _ GLsizei.IN("count", ""),
		const _ GLuint64EXT_p.IN("value", "")
	)

	GLvoid(
		"GetUniformui64vNV",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		Check(1) _ returnValue _ GLuint64EXT_p.OUT("params", "")
	)

	GLvoid(
		"ProgramUniformui64NV",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		GLuint64EXT.IN("value", "")
	)

	GLvoid(
		"ProgramUniformui64vNV",
		"",

		GLuint.IN("program", ""),
		GLint.IN("location", ""),
		AutoSize("value") _ GLsizei.IN("count", ""),
		const _ GLuint64EXT_p.IN("value", "")
	)
}