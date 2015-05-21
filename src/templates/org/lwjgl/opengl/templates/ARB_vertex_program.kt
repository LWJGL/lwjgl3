/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.generator.opengl.AutoType
import org.lwjgl.generator.opengl.BufferType.*

val ARB_vertex_program = "ARBVertexProgram".nativeClassGL("ARB_vertex_program", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Unextended OpenGL mandates a certain set of configurable per-vertex computations defining vertex transformation, texture coordinate generation and
		transformation, and lighting. Several extensions have added further per-vertex computations to OpenGL. For example, extensions have defined new texture
		coordinate generation modes (${ARB_texture_cube_map.link}, ${registryLinkTo("NV", "texgen_reflection")}, ${registryLinkTo("NV", "texgen_emboss")}),
		new vertex transformation modes (${ARB_vertex_blend.link}, ${registryLinkTo("EXT", "vertex_weighting")}), new lighting modes (OpenGL 1.2's separate
		specular and rescale normal functionality), several modes for fog distance generation (${registryLinkTo("NV", "fog_distance")}), and eye-distance point
		size attenuation (${ARB_point_parameters.link}).

		Each such extension adds a small set of relatively inflexible per-vertex computations.

		This inflexibility is in contrast to the typical flexibility provided by the underlying programmable floating point engines (whether micro-coded vertex
		engines, DSPs, or CPUs) that are traditionally used to implement OpenGL's per-vertex computations. The purpose of this extension is to expose to the
		OpenGL application writer a significant degree of per-vertex programmability for computing vertex parameters.

		For the purposes of discussing this extension, a vertex program is a sequence of floating-point 4-component vector operations that determines how a set
		of program parameters (defined outside of OpenGL's GL11#Begin()/GL11#End() pair) and an input set of per-vertex parameters are transformed to a set of
		per-vertex result parameters.

		The per-vertex computations for standard OpenGL given a particular set of lighting and texture coordinate generation modes (along with any state for
		extensions defining per-vertex computations) is, in essence, a vertex program. However, the sequence of operations is defined implicitly by the current
		OpenGL state settings rather than defined explicitly as a sequence of instructions.

		This extension provides an explicit mechanism for defining vertex program instruction sequences for application-defined vertex programs. In order to
		define such vertex programs, this extension defines a vertex programming model including a floating-point 4-component vector instruction set and a
		relatively large set of floating-point 4-component registers.

		The extension's vertex programming model is designed for efficient hardware implementation and to support a wide variety of vertex programs. By design,
		the entire set of existing vertex programs defined by existing OpenGL per-vertex computation extensions can be implemented using the extension's vertex
		programming model.
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of ProgramStringARB, BindProgramARB, ProgramEnvParameter4[df][v]ARB, ProgramLocalParameter4[df][v]ARB,
		GetProgramEnvParameter[df]vARB, GetProgramLocalParameter[df]vARB, GetProgramivARB, and GetProgramStringARB.
		""",

		"VERTEX_PROGRAM_ARB" _ 0x8620
	)

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"VERTEX_PROGRAM_POINT_SIZE_ARB" _ 0x8642,
		"VERTEX_PROGRAM_TWO_SIDE_ARB" _ 0x8643,
		"COLOR_SUM_ARB" _ 0x8458
	)

	IntConstant(
		"Accepted by the {@code format} parameter of ProgramStringARB.",

		"PROGRAM_FORMAT_ASCII_ARB" _ 0x8875
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetVertexAttrib[dfi]vARB.",

		"VERTEX_ATTRIB_ARRAY_ENABLED_ARB" _ 0x8622,
		"VERTEX_ATTRIB_ARRAY_SIZE_ARB" _ 0x8623,
		"VERTEX_ATTRIB_ARRAY_STRIDE_ARB" _ 0x8624,
		"VERTEX_ATTRIB_ARRAY_TYPE_ARB" _ 0x8625,
		"VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB" _ 0x886A,
		"CURRENT_VERTEX_ATTRIB_ARB" _ 0x8626
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetVertexAttribPointervARB.",

		"VERTEX_ATTRIB_ARRAY_POINTER_ARB" _ 0x8645
	)

	val PARAMS = IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramivARB.",

		"PROGRAM_LENGTH_ARB" _ 0x8627,
		"PROGRAM_FORMAT_ARB" _ 0x8876,
		"PROGRAM_BINDING_ARB" _ 0x8677,
		"PROGRAM_INSTRUCTIONS_ARB" _ 0x88A0,
		"MAX_PROGRAM_INSTRUCTIONS_ARB" _ 0x88A1,
		"PROGRAM_NATIVE_INSTRUCTIONS_ARB" _ 0x88A2,
		"MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB" _ 0x88A3,
		"PROGRAM_TEMPORARIES_ARB" _ 0x88A4,
		"MAX_PROGRAM_TEMPORARIES_ARB" _ 0x88A5,
		"PROGRAM_NATIVE_TEMPORARIES_ARB" _ 0x88A6,
		"MAX_PROGRAM_NATIVE_TEMPORARIES_ARB" _ 0x88A7,
		"PROGRAM_PARAMETERS_ARB" _ 0x88A8,
		"MAX_PROGRAM_PARAMETERS_ARB" _ 0x88A9,
		"PROGRAM_NATIVE_PARAMETERS_ARB" _ 0x88AA,
		"MAX_PROGRAM_NATIVE_PARAMETERS_ARB" _ 0x88AB,
		"PROGRAM_ATTRIBS_ARB" _ 0x88AC,
		"MAX_PROGRAM_ATTRIBS_ARB" _ 0x88AD,
		"PROGRAM_NATIVE_ATTRIBS_ARB" _ 0x88AE,
		"MAX_PROGRAM_NATIVE_ATTRIBS_ARB" _ 0x88AF,
		"PROGRAM_ADDRESS_REGISTERS_ARB" _ 0x88B0,
		"MAX_PROGRAM_ADDRESS_REGISTERS_ARB" _ 0x88B1,
		"PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB" _ 0x88B2,
		"MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB" _ 0x88B3,
		"MAX_PROGRAM_LOCAL_PARAMETERS_ARB" _ 0x88B4,
		"MAX_PROGRAM_ENV_PARAMETERS_ARB" _ 0x88B5,
		"PROGRAM_UNDER_NATIVE_LIMITS_ARB" _ 0x88B6
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramStringARB.",

		"PROGRAM_STRING_ARB" _ 0x8628
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"PROGRAM_ERROR_POSITION_ARB" _ 0x864B,
		"CURRENT_MATRIX_ARB" _ 0x8641,
		"TRANSPOSE_CURRENT_MATRIX_ARB" _ 0x88B7,
		"CURRENT_MATRIX_STACK_DEPTH_ARB" _ 0x8640,
		"MAX_VERTEX_ATTRIBS_ARB" _ 0x8869,
		"MAX_PROGRAM_MATRICES_ARB" _ 0x862F,
		"MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB" _ 0x862E
	)

	IntConstant(
		"Accepted by the {@code name} parameter of GetString.",

		"PROGRAM_ERROR_STRING_ARB" _ 0x8874
	)

	IntConstant(
		"Accepted by the {@code mode} parameter of MatrixMode.",

		"MATRIX0_ARB" _ 0x88C0,
		"MATRIX1_ARB" _ 0x88C1,
		"MATRIX2_ARB" _ 0x88C2,
		"MATRIX3_ARB" _ 0x88C3,
		"MATRIX4_ARB" _ 0x88C4,
		"MATRIX5_ARB" _ 0x88C5,
		"MATRIX6_ARB" _ 0x88C6,
		"MATRIX7_ARB" _ 0x88C7,
		"MATRIX8_ARB" _ 0x88C8,
		"MATRIX9_ARB" _ 0x88C9,
		"MATRIX10_ARB" _ 0x88CA,
		"MATRIX11_ARB" _ 0x88CB,
		"MATRIX12_ARB" _ 0x88CC,
		"MATRIX13_ARB" _ 0x88CD,
		"MATRIX14_ARB" _ 0x88CE,
		"MATRIX15_ARB" _ 0x88CF,
		"MATRIX16_ARB" _ 0x88D0,
		"MATRIX17_ARB" _ 0x88D1,
		"MATRIX18_ARB" _ 0x88D2,
		"MATRIX19_ARB" _ 0x88D3,
		"MATRIX20_ARB" _ 0x88D4,
		"MATRIX21_ARB" _ 0x88D5,
		"MATRIX22_ARB" _ 0x88D6,
		"MATRIX23_ARB" _ 0x88D7,
		"MATRIX24_ARB" _ 0x88D8,
		"MATRIX25_ARB" _ 0x88D9,
		"MATRIX26_ARB" _ 0x88DA,
		"MATRIX27_ARB" _ 0x88DB,
		"MATRIX28_ARB" _ 0x88DC,
		"MATRIX29_ARB" _ 0x88DD,
		"MATRIX30_ARB" _ 0x88DE,
		"MATRIX31_ARB" _ 0x88DF
	)

	val VA_INDEX = GLuint.IN("index", "the vertex attribute index")
	val VA_X = "the {@code x} attribute component"
	val VA_Y = "the {@code y} attribute component"
	val VA_Z = "the {@code z} attribute component"
	val VA_W = "the {@code w} attribute component"

	GLvoid("VertexAttrib1sARB", "Short version of #VertexAttrib1fARB()", VA_INDEX, GLshort.IN("x", VA_X))
	GLvoid(
		"VertexAttrib1fARB",
		"Specifies the {@code x} component of the current vertex attribute numbered {@code index}. Components {@code y} and {@code z} are set to 0 and {@code w} to 1.",
		VA_INDEX, GLfloat.IN("x", VA_X)
	)
	GLvoid("VertexAttrib1dARB", "Double version of #VertexAttrib1fARB()", VA_INDEX, GLdouble.IN("x", VA_X))

	GLvoid("VertexAttrib2sARB", "Short version of #VertexAttrib2fARB()", VA_INDEX, GLshort.IN("x", VA_X), GLshort.IN("y", VA_Y))
	GLvoid(
		"VertexAttrib2fARB",
		"Specifies the {@code x} and {@code y} components of the current vertex attribute numbered {@code index}. Component {@code z} is set to 0 and {@code w} to 1.",

		VA_INDEX,
		GLfloat.IN("x", VA_X),
		GLfloat.IN("y", VA_Y)
	)
	GLvoid("VertexAttrib2dARB", "Double version of #VertexAttrib2fARB()", VA_INDEX, GLdouble.IN("x", VA_X), GLdouble.IN("y", VA_Y))

	GLvoid("VertexAttrib3sARB", "Short version of #VertexAttrib3fARB()", VA_INDEX, GLshort.IN("x", VA_X), GLshort.IN("y", VA_Y), GLshort.IN("z", VA_Z))
	GLvoid(
		"VertexAttrib3fARB",
		"Specifies the {@code x}, {@code y} and {@code z} components of the current vertex attribute numbered {@code index}. Component {@code w} is set to 1.",

		VA_INDEX,
		GLfloat.IN("x", VA_X),
		GLfloat.IN("y", VA_Y),
		GLfloat.IN("z", VA_Z)
	)
	GLvoid("VertexAttrib3dARB", "Double version of #VertexAttrib3fARB()", VA_INDEX, GLdouble.IN("x", VA_X), GLdouble.IN("y", VA_Y), GLdouble.IN("z", VA_Z))

	GLvoid("VertexAttrib4sARB", "Short version of #VertexAttrib4fARB()", VA_INDEX, GLshort.IN("x", VA_X), GLshort.IN("y", VA_Y), GLshort.IN("z", VA_Z), GLshort.IN("w", VA_W))
	GLvoid(
		"VertexAttrib4fARB",
		"Specifies the current vertex attribute numbered {@code index}.",

		VA_INDEX,
		GLfloat.IN("x", VA_X),
		GLfloat.IN("y", VA_Y),
		GLfloat.IN("z", VA_Z),
		GLfloat.IN("w", VA_W)
	)
	GLvoid("VertexAttrib4dARB", "Double version of #VertexAttrib4fARB()", VA_INDEX, GLdouble.IN("x", VA_X), GLdouble.IN("y", VA_Y), GLdouble.IN("z", VA_Z), GLdouble.IN("w", VA_W))
	GLvoid("VertexAttrib4NubARB", "Fixed-point unsigned byte version of #VertexAttrib4fARB()", VA_INDEX, GLubyte.IN("x", VA_X), GLubyte.IN("y", VA_Y), GLubyte.IN("z", VA_Z), GLubyte.IN("w", VA_W))

	val VA_V = "a buffer from which to read the attribute value"

	GLvoid("VertexAttrib1svARB", "Pointer version of #VertexAttrib1sARB()", VA_INDEX, const _ Check(1) _ GLshort_p.IN("v", VA_V))
	GLvoid("VertexAttrib1fvARB", "Pointer version of #VertexAttrib1fARB()", VA_INDEX, const _ Check(1) _ GLfloat_p.IN("v", VA_V))
	GLvoid("VertexAttrib1dvARB", "Pointer version of #VertexAttrib1dARB()", VA_INDEX, const _ Check(1) _ GLdouble_p.IN("v", VA_V))

	GLvoid("VertexAttrib2svARB", "Pointer version of #VertexAttrib2sARB()", VA_INDEX, const _ Check(2) _ GLshort_p.IN("v", VA_V))
	GLvoid("VertexAttrib2fvARB", "Pointer version of #VertexAttrib2fARB()", VA_INDEX, const _ Check(2) _ GLfloat_p.IN("v", VA_V))
	GLvoid("VertexAttrib2dvARB", "Pointer version of #VertexAttrib2dARB()", VA_INDEX, const _ Check(2) _ GLdouble_p.IN("v", VA_V))

	GLvoid("VertexAttrib3svARB", "Pointer version of #VertexAttrib3sARB()", VA_INDEX, const _ Check(3) _ GLshort_p.IN("v", VA_V))
	GLvoid("VertexAttrib3fvARB", "Pointer version of #VertexAttrib3fARB()", VA_INDEX, const _ Check(3) _ GLfloat_p.IN("v", VA_V))
	GLvoid("VertexAttrib3dvARB", "Pointer version of #VertexAttrib3dARB()", VA_INDEX, const _ Check(3) _ GLdouble_p.IN("v", VA_V))

	GLvoid("VertexAttrib4fvARB", "Pointer version of #VertexAttrib4fARB()", VA_INDEX, const _ Check(4) _ GLfloat_p.IN("v", VA_V))
	GLvoid("VertexAttrib4bvARB", "Byte version of #VertexAttrib4fvARB()", VA_INDEX, const _ Check(4) _ GLbyte_p.IN("v", VA_V))
	GLvoid("VertexAttrib4svARB", "Pointer version of #VertexAttrib4sARB()", VA_INDEX, const _ Check(4) _ GLshort_p.IN("v", VA_V))
	GLvoid("VertexAttrib4ivARB", "Integer version of #VertexAttrib4fvARB()", VA_INDEX, const _ Check(4) _ GLint_p.IN("v", VA_V))
	GLvoid("VertexAttrib4ubvARB", "Unsigned byte version of #VertexAttrib4fvARB()", VA_INDEX, const _ Check(4) _ GLubyte_p.IN("v", VA_V))
	GLvoid("VertexAttrib4usvARB", "Unsigned short version of #VertexAttrib4fvARB()", VA_INDEX, const _ Check(4) _ GLushort_p.IN("v", VA_V))
	GLvoid("VertexAttrib4uivARB", "Unsigned integer version of #VertexAttrib4fvARB()", VA_INDEX, const _ Check(4) _ GLuint_p.IN("v", VA_V))
	GLvoid("VertexAttrib4dvARB", "Pointer version of #VertexAttrib4dARB()", VA_INDEX, const _ Check(4) _ GLdouble_p.IN("v", VA_V))

	GLvoid("VertexAttrib4NbvARB", "Fixed-point version of #VertexAttrib4bvARB()", VA_INDEX, const _ Check(4) _ GLbyte_p.IN("v", VA_V))
	GLvoid("VertexAttrib4NsvARB", "Fixed-point version of #VertexAttrib4svARB()", VA_INDEX, const _ Check(4) _ GLshort_p.IN("v", VA_V))
	GLvoid("VertexAttrib4NivARB", "Fixed-point version of #VertexAttrib4ivARB()", VA_INDEX, const _ Check(4) _ GLint_p.IN("v", VA_V))

	GLvoid("VertexAttrib4NubvARB", "Fixed-point unsigned version of #VertexAttrib4bvARB()", VA_INDEX, const _ Check(4) _ GLubyte_p.IN("v", VA_V))
	GLvoid("VertexAttrib4NusvARB", "Fixed-point unsigned version of #VertexAttrib4svARB()", VA_INDEX, const _ Check(4) _ GLushort_p.IN("v", VA_V))
	GLvoid("VertexAttrib4NuivARB", "Fixed-point unsigned version of #VertexAttrib4ivARB()", VA_INDEX, const _ Check(4) _ GLuint_p.IN("v", VA_V))

	GLvoid(
		"VertexAttribPointerARB",
		"Specifies the location and organization of a vertex attribute array.",

		VA_INDEX,
		GLint.IN("size", "the vertex attribute number of components", "1 2 3 4"),
		AutoType("pointer", GL_BYTE, GL_UNSIGNED_BYTE, GL_SHORT, GL_UNSIGNED_SHORT, GL_INT, GL_FLOAT, GL_DOUBLE) _ GLenum.IN(
			"type",
			"the data type of the values stored in the array",
			"GL11#BYTE GL11#SHORT GL11#INT GL11#UNSIGNED_BYTE GL11#UNSIGNED_SHORT GL11#UNSIGNED_INT GL30#HALF_FLOAT NVHalfFloat#HALF_FLOAT_NV GL11#FLOAT GL11#DOUBLE"
		),
		GLboolean.IN("normalized", "if GL11#TRUE, fixed-point types are normalized when converted to floating-point"),
		GLsizei.IN("stride", "the vertex stride in bytes. If specified as zero, then array elements are stored sequentially"),
		const _ GLvoid_p.IN("pointer", "the vertex attribute array data")
	)

	GLvoid(
		"EnableVertexAttribArrayARB",
		"Enables an individual generic vertex attribute array.",

		VA_INDEX
	)

	GLvoid(
		"DisableVertexAttribArrayARB",
		"Disables an individual generic vertex attribute array.",

		VA_INDEX
	)

	val TARGET = GLenum.IN("target", "the program target", "#VERTEX_PROGRAM_ARB ARBFragmentProgram#FRAGMENT_PROGRAM_ARB")

	GLvoid(
		"ProgramStringARB",
		"""
		Updates the program string for the current program object for {@code target}.

		When a program string is loaded, it is interpreted according to syntactic and semantic rules corresponding to the program target specified by
		{@code target}. If a program violates the syntactic or semantic restrictions of the program target, ProgramStringARB generates the error
		GL11#INVALID_OPERATION.

		Additionally, ProgramString will update the program error position (#PROGRAM_ERROR_POSITION_ARB) and error string (#PROGRAM_ERROR_STRING_ARB). If a
		program fails to load, the value of the program error position is set to the ubyte offset into the specified program string indicating where the first
		program error was detected. If the program fails to load because of a semantic restriction that is not detected until the program is fully scanned, the
		error position is set to the value of {@code len}. If a program loads successfully, the error position is set to the value negative one. The
		implementation-dependent program error string contains one or more error or warning messages.  If a program loads succesfully, the error string may
		either contain warning messages or be empty.
		""",

		TARGET,
		GLenum.IN("format", "the format of the program string", "#PROGRAM_FORMAT_ASCII_ARB"),
		AutoSize("string") _ GLsizei.IN("len", "the length of the program string, excluding the null-terminator"),
		const _ GLvoid_p.IN("string", "an array of bytes representing the program string being loaded")
	)

	GLvoid(
		"BindProgramARB",
		"""
		Creates a named program object by binding an unused program object name to a valid program target. Also can be used to bind an existing program object
		to a program target.
		""",

		TARGET,
		GLuint.IN(
			"program",
			"""
			the program object to bind. If {@code program} is zero, the default program object for {@code target} is bound.  If {@code program} is the name of
			an existing program object whose associated program target is {@code target}, the named program object is bound.
			"""
		)
	)

	GLvoid(
		"DeleteProgramsARB",
		"Deletes program objects.",

		AutoSize("programs") _ GLsizei.IN("n", "the number of program object to delete"),
		const _ GLuint_p.IN("programs", "an array of {@code n} program objects to be deleted")
	)

	GLvoid(
		"GenProgramsARB",
		"""
		Returns {@code n} currently unused program names in {@code programs}. These names are marked as used, for the purposes of GenProgramsARB only, but
		objects are created only when they are first bound using #BindProgramARB().
		""",

		AutoSize("programs") _ GLsizei.IN("n", "the number of program names to genereate"),
		returnValue _ GLuint_p.OUT("programs", "an array in which to return the generated program names")
	)

	val VP_INDEX = GLuint.IN("index", "the environment parameter index")
	val VP_X = "the {@code x} parameter component"
	val VP_Y = "the {@code y} parameter component"
	val VP_Z = "the {@code z} parameter component"
	val VP_W = "the {@code w} parameter component"

	val VP_V = "a buffer from which to read the parameter value"

	GLvoid("ProgramEnvParameter4dARB", "Double version of #ProgramEnvParameter4fARB().", TARGET, VP_INDEX, GLdouble.IN("x", VP_X), GLdouble.IN("y", VP_Y), GLdouble.IN("z", VP_Z), GLdouble.IN("w", VP_W))
	GLvoid("ProgramEnvParameter4dvARB", "Pointer version of #ProgramEnvParameter4dARB()", TARGET, VP_INDEX, const _ Check(4) _ GLdouble_p.IN("params", VP_V))
	GLvoid(
		"ProgramEnvParameter4fARB",
		"Updates the values of the program environment parameter numbered {@code index} for the specified program target {@code target}.",

		TARGET,
		VP_INDEX,
		GLfloat.IN("x", VP_X),
		GLfloat.IN("y", VP_Y),
		GLfloat.IN("z", VP_Z),
		GLfloat.IN("w", VP_W)
	)
	GLvoid("ProgramEnvParameter4fvARB", "Pointer version of #ProgramEnvParameter4fARB().", TARGET, VP_INDEX, const _ Check(4) _ GLfloat_p.IN("params", VP_V))

	GLvoid("ProgramLocalParameter4dARB", "Double version of #ProgramLocalParameter4fARB().", TARGET, VP_INDEX, GLdouble.IN("x", VP_X), GLdouble.IN("y", VP_Y), GLdouble.IN("z", VP_Z), GLdouble.IN("w", VP_W))
	GLvoid("ProgramLocalParameter4dvARB", "Pointer version of #ProgramLocalParameter4dARB().", TARGET, VP_INDEX, const _ Check(4) _ GLdouble_p.IN("params", VP_V))
	GLvoid(
		"ProgramLocalParameter4fARB",
		"Updates the values of the program local parameter numbered {@code index} for the specified program target {@code target}.",

		TARGET,
		VP_INDEX,
		GLfloat.IN("x", VP_X),
		GLfloat.IN("y", VP_Y),
		GLfloat.IN("z", VP_Z),
		GLfloat.IN("w", VP_W)
	)
	GLvoid("ProgramLocalParameter4fvARB", "Pointer version of #ProgramLocalParameter4fARB().", TARGET, VP_INDEX, const _ Check(4) _ GLfloat_p.IN("params", VP_V))

	GLvoid(
		"GetProgramEnvParameterfvARB",
		"""
		Obtain the current value for the program environment parameter numbered {@code index} for the specified program target {@code target}, and places the
		information in the array {@code params}.
		""",

		TARGET,
		VP_INDEX,
		Check(4) _ GLfloat_p.OUT("params", "a buffer in which to place the current parameter value")
	)

	GLvoid(
		"GetProgramEnvParameterdvARB",
		"Double version of #GetProgramEnvParameterfvARB().",

		TARGET,
		VP_INDEX,
		Check(4) _ GLdouble_p.OUT("params", "a buffer in which to place the current parameter value")
	)

	GLvoid(
		"GetProgramLocalParameterfvARB",
		"""
		Obtain the current value for the program local parameter numbered {@code index} for the specified program target {@code target}, and places the
		information in the array {@code params}.
		""",

		TARGET,
		VP_INDEX,
		Check(4) _ GLfloat_p.OUT("params", "a buffer in which to place the current parameter value")
	)

	GLvoid(
		"GetProgramLocalParameterdvARB",
		"Double version of #GetProgramLocalParameterfvARB().",

		TARGET,
		VP_INDEX,
		Check(4) _ GLdouble_p.OUT("params", "a buffer in which to place the current parameter value")
	)

	GLvoid(
		"GetProgramivARB",
		"""
		Obtains program state for the program target {@code target}, writing the state into the array given by {@code params}. GetProgramivARB can be used to
		determine the properties of the currently bound program object or implementation limits for {@code target}.
		""",

		TARGET,
		GLenum.IN("pname", "the parameter to query", PARAMS),
		returnValue _ Check(1) _ GLint_p.OUT("params", "an array in which to place the parameter value")
	)

	GLvoid(
		"GetProgramStringARB",
		"""
		Obtains the program string for the program object bound to {@code target} and places the information in the array {@code string}.

		{@code n} ubytes are returned into the array program where {@code n} is the length of the program in ubytes, as returned by #GetProgramivARB() when
		{@code pname} is #PROGRAM_LENGTH_ARB. The program string is always returned using the format given when the program string was specified.
		""",

		TARGET,
		GLenum.IN("pname", "the parameter to query", "#PROGRAM_STRING_ARB"),
		Check("glGetProgramiARB(target, GL_PROGRAM_LENGTH_ARB)", debug = true) _ GLvoid_p.OUT("string", "an array in which to place the program string")
	)

	GLvoid(
		"GetVertexAttribfvARB",
		"""
		Obtains the vertex attribute state named by {@code pname} for the vertex attribute numbered {@code index} and places the information in the array
		{@code params}.
		""",

		VA_INDEX,
		GLenum.IN("pname", "the parameter to query", "#CURRENT_VERTEX_ATTRIB_ARB"),
		Check(4) _ GLfloat_p.OUT("params", "an array in which to place the parameter value")
	)

	GLvoid(
		"GetVertexAttribdvARB",
		"Double version of #GetVertexAttribfvARB().",

		VA_INDEX,
		GLenum.IN("pname", "the parameter to query", "#CURRENT_VERTEX_ATTRIB_ARB"),
		Check(4) _ GLdouble_p.OUT("params", "an array in which to place the parameter value")
	)

	GLvoid(
		"GetVertexAttribivARB",
		"Integer version of #GetVertexAttribfvARB().",

		VA_INDEX,
		GLenum.IN(
			"pname",
			"the parameter to query",
			"""
			#VERTEX_ATTRIB_ARRAY_ENABLED_ARB #VERTEX_ATTRIB_ARRAY_SIZE_ARB #VERTEX_ATTRIB_ARRAY_STRIDE_ARB #VERTEX_ATTRIB_ARRAY_TYPE_ARB
			#VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB #CURRENT_VERTEX_ATTRIB_ARB
			"""
		),
		returnValue _ Check(1) _ GLint_p.OUT("params", "an array in which to place the parameter value")
	)

	GLvoid(
		"GetVertexAttribPointervARB",
		"Obtains the pointer named {@code pname} for vertex attribute numbered {@code index} and places the information in the array {@code pointer}.",

		VA_INDEX,
		GLenum.IN("pname", "the parameter to query", "#VERTEX_ATTRIB_ARRAY_POINTER_ARB"),
		returnValue _ Check(1) _ GLvoid_pp.OUT("pointer", "an array in which to place the vertex attribute array pointer")
	)

	GLboolean(
		"IsProgramARB",
		"""
		Returns GL11#TRUE if {@code program} is the name of a program object. If {@code program} is zero or is a non-zero value that is not the name of a
		program object, or if an error condition occurs, IsProgramARB returns GL11#FALSE. A name returned by #GenProgramsARB(), but not yet bound, is not the
		name of a program object.
		""",

		GLuint.IN("program", "the program name")
	)

}