/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*

val ARB_vertex_shader = "ARBVertexShader".nativeClassGL("ARB_vertex_shader", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds programmable vertex level processing to OpenGL. The application can write vertex shaders in a high level language as defined in the
		OpenGL Shading Language specification. A vertex shader replaces the transformation, texture coordinate generation and lighting parts of OpenGL, and it
		also adds texture access at the vertex level. Furthermore, management of vertex shader objects and loading generic attributes are discussed. A vertex
		shader object, attached to a program object, can be compiled and linked to produce an executable that runs on the vertex processor in OpenGL.
		This extension also defines how such an executable interacts with the fixed functionality vertex processing of OpenGL 1.4.

		${GL20.promoted}
		"""

	IntConstant(
		"Accepted by the {@code shaderType} argument of CreateShaderObjectARB and returned by the {@code params} parameter of GetObjectParameter{if}vARB.",

		"VERTEX_SHADER_ARB" _ 0x8B31
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_VERTEX_UNIFORM_COMPONENTS_ARB" _ 0x8B4A,
		"MAX_VARYING_FLOATS_ARB" _ 0x8B4B,
		"MAX_VERTEX_ATTRIBS_ARB" _ 0x8869,
		"MAX_TEXTURE_IMAGE_UNITS_ARB" _ 0x8872,
		"MAX_VERTEX_TEXTURE_IMAGE_UNITS_ARB" _ 0x8B4C,
		"MAX_COMBINED_TEXTURE_IMAGE_UNITS_ARB" _ 0x8B4D,
		"MAX_TEXTURE_COORDS_ARB" _ 0x8871
	)

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"VERTEX_PROGRAM_POINT_SIZE_ARB" _ 0x8642,
		"VERTEX_PROGRAM_TWO_SIDE_ARB" _ 0x8643
	)

	IntConstant(
		"Accepted by the {@code pname} parameter GetObjectParameter{if}vARB.",

		"OBJECT_ACTIVE_ATTRIBUTES_ARB" _ 0x8B89,
		"OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB" _ 0x8B8A
	)

	val VERTEX_ATTRIBUTES = IntConstant(
		"Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}vARB.",

		"VERTEX_ATTRIB_ARRAY_ENABLED_ARB" _ 0x8622,
		"VERTEX_ATTRIB_ARRAY_SIZE_ARB" _ 0x8623,
		"VERTEX_ATTRIB_ARRAY_STRIDE_ARB" _ 0x8624,
		"VERTEX_ATTRIB_ARRAY_TYPE_ARB" _ 0x8625,
		"VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB" _ 0x886A,
		"CURRENT_VERTEX_ATTRIB_ARB" _ 0x8626
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code pname} parameter of GetVertexAttribPointervARB.",

		"VERTEX_ATTRIB_ARRAY_POINTER_ARB" _ 0x8645
	)

	IntConstant(
		"Returned by the {@code type} parameter of GetActiveAttribARB.",

		"FLOAT" _ 0x1406,
		"FLOAT_VEC2_ARB" _ 0x8B50,
		"FLOAT_VEC3_ARB" _ 0x8B51,
		"FLOAT_VEC4_ARB" _ 0x8B52,
		"FLOAT_MAT2_ARB" _ 0x8B5A,
		"FLOAT_MAT3_ARB" _ 0x8B5B,
		"FLOAT_MAT4_ARB" _ 0x8B5C
	)

	// Vertex attrib functions javadoc
	val vertexAttribIndex = "the index of the generic vertex attribute to be modified"
	val vertexAttribX = "the vertex attribute x component"
	val vertexAttribY = "the vertex attribute y component"
	val vertexAttribZ = "the vertex attribute z component"
	val vertexAttribW = "the vertex attribute w component"
	val vertexAttribBuffer = "the vertex attribute buffer"

	GLvoid(
		"VertexAttrib1fARB",
		"Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.",

		GLuint.IN("index", vertexAttribIndex),
		GLfloat.IN("v0", vertexAttribX)
	)

	GLvoid("VertexAttrib1sARB", "Short version of #VertexAttrib1fARB().", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX))
	GLvoid("VertexAttrib1dARB", "Double version of #VertexAttrib1fARB().", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX))

	GLvoid(
		"VertexAttrib2fARB",
		"Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.",

		GLuint.IN("index", vertexAttribIndex),
		GLfloat.IN("v0", vertexAttribX),
		GLfloat.IN("v1", vertexAttribY)
	)

	GLvoid("VertexAttrib2sARB", "Short version of #VertexAttrib2fARB().", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX), GLshort.IN("v1", vertexAttribY))
	GLvoid("VertexAttrib2dARB", "Double version of #VertexAttrib2fARB().", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX), GLdouble.IN("v1", vertexAttribY))

	GLvoid(
		"VertexAttrib3fARB",
		"Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0f.",

		GLuint.IN("index", vertexAttribIndex),
		GLfloat.IN("v0", vertexAttribX),
		GLfloat.IN("v1", vertexAttribY),
		GLfloat.IN("v2", vertexAttribZ)
	)

	GLvoid("VertexAttrib3sARB", "Short version of #VertexAttrib3fARB().", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX), GLshort.IN("v1", vertexAttribY), GLshort.IN("v2", vertexAttribZ))
	GLvoid("VertexAttrib3dARB", "Double version of #VertexAttrib3fARB().", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX), GLdouble.IN("v1", vertexAttribY), GLdouble.IN("v2", vertexAttribZ))

	GLvoid(
		"VertexAttrib4fARB",
		"Specifies the value of a generic vertex attribute.",

		GLuint.IN("index", vertexAttribIndex),
		GLfloat.IN("v0", vertexAttribX),
		GLfloat.IN("v1", vertexAttribY),
		GLfloat.IN("v2", vertexAttribZ),
		GLfloat.IN("v3", vertexAttribW)
	)

	GLvoid("VertexAttrib4sARB", "Short version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX), GLshort.IN("v1", vertexAttribY), GLshort.IN("v2", vertexAttribZ), GLshort.IN("v3", vertexAttribW))
	GLvoid("VertexAttrib4dARB", "Double version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX), GLdouble.IN("v1", vertexAttribY), GLdouble.IN("v2", vertexAttribZ), GLdouble.IN("v3", vertexAttribW))
	GLvoid("VertexAttrib4NubARB", "Normalized unsigned byte version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), GLubyte.IN("x", vertexAttribX), GLubyte.IN("y", vertexAttribY), GLubyte.IN("z", vertexAttribZ), GLubyte.IN("w", vertexAttribW))

	GLvoid("VertexAttrib1fvARB", "Pointer version of #VertexAttrib1fARB().", GLuint.IN("index", vertexAttribIndex), Check(1) _ const _ GLfloat_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib1svARB", "Pointer version of #VertexAttrib1sARB().", GLuint.IN("index", vertexAttribIndex), Check(1) _ const _ GLshort_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib1dvARB", "Pointer version of #VertexAttrib1dARB().", GLuint.IN("index", vertexAttribIndex), Check(1) _ const _ GLdouble_p.IN("v", vertexAttribBuffer))

	GLvoid("VertexAttrib2fvARB", "Pointer version of #VertexAttrib2fARB().", GLuint.IN("index", vertexAttribIndex), Check(2) _ const _ GLfloat_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib2svARB", "Pointer version of #VertexAttrib2sARB().", GLuint.IN("index", vertexAttribIndex), Check(2) _ const _ GLshort_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib2dvARB", "Pointer version of #VertexAttrib2dARB().", GLuint.IN("index", vertexAttribIndex), Check(2) _ const _ GLdouble_p.IN("v", vertexAttribBuffer))

	GLvoid("VertexAttrib3fvARB", "Pointer version of #VertexAttrib3fARB().", GLuint.IN("index", vertexAttribIndex), Check(3) _ const _ GLfloat_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib3svARB", "Pointer version of #VertexAttrib3sARB().", GLuint.IN("index", vertexAttribIndex), Check(3) _ const _ GLshort_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib3dvARB", "Pointer version of #VertexAttrib3dARB().", GLuint.IN("index", vertexAttribIndex), Check(3) _ const _ GLdouble_p.IN("v", vertexAttribBuffer))

	GLvoid("VertexAttrib4fvARB", "Pointer version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLfloat_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4svARB", "Pointer version of #VertexAttrib4sARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLshort_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4dvARB", "Pointer version of #VertexAttrib4dARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLdouble_p.IN("v", vertexAttribBuffer))

	GLvoid("VertexAttrib4ivARB", "Integer pointer version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLint_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4bvARB", "Byte pointer version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLbyte_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4ubvARB", "Pointer version of #VertexAttrib4NubARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLubyte_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4usvARB", "Unsigned short pointer version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLushort_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4uivARB", "Unsigned int pointer version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLuint_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4NbvARB", "Normalized byte pointer version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLbyte_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4NsvARB", "Normalized short pointer version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLshort_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4NivARB", "Normalized int pointer version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLint_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4NubvARB", "Normalized unsigned byte pointer version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLubyte_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4NusvARB", "Normalized unsigned short pointer version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLushort_p.IN("v", vertexAttribBuffer))
	GLvoid("VertexAttrib4NuivARB", "Normalized unsigned int pointer version of #VertexAttrib4fARB().", GLuint.IN("index", vertexAttribIndex), Check(4) _ const _ GLuint_p.IN("v", vertexAttribBuffer))

	GLvoid(
		"VertexAttribPointerARB",
		"Specifies the location and organization of a vertex attribute array.",

		GLuint.IN("index", vertexAttribIndex),
		GLint.IN("size", "the number of values per vertex that are stored in the array. The initial value is 4", "1 2 3 4 GL12#BGRA"),
		AutoType("pointer", GL_BYTE, GL_UNSIGNED_BYTE, GL_SHORT, GL_UNSIGNED_SHORT, GL_INT, GL_FLOAT, GL_DOUBLE) _ GLenum.IN(
			"type",
			"the data type of each component in the array. The initial value is GL_FLOAT",
			"""
			GL11#BYTE GL11#UNSIGNED_BYTE GL11#SHORT GL11#UNSIGNED_SHORT GL11#INT GL11#UNSIGNED_INT GL30#HALF_FLOAT GL11#FLOAT
			GL11#DOUBLE GL12#UNSIGNED_INT_2_10_10_10_REV GL33#INT_2_10_10_10_REV GL41#FIXED
			"""
		),
		GLboolean.IN("normalized", "whether fixed-point data values should be normalized or converted directly as fixed-point values when they are accessed"),
		GLsizei.IN(
			"stride",
			"""
			the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
			the array. The initial value is 0.
			"""
		),
		const _ ARRAY_BUFFER _ GLvoid_p.IN(
			"pointer",
			"""
			the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
			currently bound to the GL15#ARRAY_BUFFER target. The initial value is 0.
			"""
		)
	)

	GLvoid(
		"EnableVertexAttribArrayARB",
		"Enables a generic vertex attribute array.",

		GLuint.IN("index", "the index of the generic vertex attribute to be enabled")
	)

	GLvoid(
		"DisableVertexAttribArrayARB",
		"Disables a generic vertex attribute array.",

		GLuint.IN("index", "the index of the generic vertex attribute to be disabled")
	)

	GLvoid(
		"BindAttribLocationARB",
		"Associates a generic vertex attribute index with a named attribute variable.",

		GLhandleARB.IN("programObj", "the handle of the program object in which the association is to be made"),
		GLuint.IN("index", "the index of the generic vertex attribute to be bound"),
		const _ GLcharASCII_p.IN("name", "a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound")
	)

	GLvoid(
		"GetActiveAttribARB",
		"Returns information about an active attribute variable for the specified program object.",

		GLhandleARB.IN("programObj", "the program object to be queried"),
		GLuint.IN("index", "the index of the attribute variable to be queried"),
		AutoSize("name") _ GLsizei.IN("maxLength", "the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}"),
		GLsizei_p.OUT(
			"length",
			"the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than NULL is passed"
		),
		GLint_p.OUT("size", "the size of the attribute variable"),
		GLenum_p.OUT("type", "the data type of the attribute variable"),
		Return(
			"length",
			"ARBShaderObjects.glGetObjectParameteriARB(programObj, GL_OBJECT_ACTIVE_ATTRIBUTE_MAX_LENGTH_ARB)"
		) _ GLcharASCII_p.OUT("name", "a null terminated string containing the name of the attribute variable")
	)

	GLint(
		"GetAttribLocationARB",
		"Returns the location of an attribute variable.",

		GLhandleARB.IN("programObj", "the program object to be queried"),
		const _ GLcharASCII_p.IN("name", "a null terminated string containing the name of the attribute variable whose location is to be queried")
	)

	GLvoid(
		"GetVertexAttribivARB",
		"Returns the integer value of a generic vertex attribute parameter.",

		GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
		GLenum.IN(
			"pname",
			"the symbolic name of the vertex attribute parameter to be queried",
			"GL15#VERTEX_ATTRIB_ARRAY_BUFFER_BINDING $VERTEX_ATTRIBUTES GL30#VERTEX_ATTRIB_ARRAY_INTEGER GL33#VERTEX_ATTRIB_ARRAY_DIVISOR"
		),
		Check(1) _ returnValue _ GLint_p.OUT("params", "returns the requested data")
	)

	GLvoid(
		"GetVertexAttribfvARB",
		"Float version of #GetVertexAttribivARB().",

		GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
		GLenum.IN("pname", "the symbolic name of the vertex attribute parameter to be queried"),
		Check(4) _ GLfloat_p.OUT("params", "returns the requested data")
	)

	GLvoid(
		"GetVertexAttribdvARB",
		"Double version of #GetVertexAttribivARB().",

		GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
		GLenum.IN("pname", "the symbolic name of the vertex attribute parameter to be queried"),
		Check(4) _ GLdouble_p.OUT("params", "returns the requested data")
	)


	GLvoid(
		"GetVertexAttribPointervARB",
		"Returns the address of the specified generic vertex attribute pointer.",

		GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
		GLenum.IN("pname", "the symbolic name of the generic vertex attribute parameter to be returned", "#VERTEX_ATTRIB_ARRAY_POINTER_ARB"),
		Check(1) _ returnValue _ GLvoid_pp.OUT("pointer", "the pointer value")
	)
}