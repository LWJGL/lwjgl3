/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*
import java.nio.*

fun GL33() = "GL33".nativeClassGL("GL33") {
	nativeImport (
		"OpenGL.h"
	)

	javaDoc("The core OpenGL 3.3 functionality.")

	// ARB_blend_func_extended

	IntConstant.block(
		"""
		Accepted by the {@code src} and {@code dst} parameters of BlendFunc and BlendFunci, and by the {@code srcRGB}, {@code dstRGB}, {@code srcAlpha} and
		{@code dstAlpha} parameters of BlendFuncSeparate and BlendFuncSeparatei.
		""",

		"SRC1_COLOR" _ 0x88F9,
		"ONE_MINUS_SRC1_COLOR" _ 0x88FA,
		"ONE_MINUS_SRC1_ALPHA" _ 0x88FB
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev.",

		"MAX_DUAL_SOURCE_DRAW_BUFFERS" _ 0x88FC
	)

	GLvoid.func(
		"BindFragDataLocationIndexed",
		"Binds a user-defined varying out variable to a fragment shader color number and index.",

		GLuint.IN("program", "the name of the program containing varying out variable whose binding to modify"),
		GLuint.IN("colorNumber", "the color number to bind the user-defined varying out variable to"),
		GLuint.IN("index", "the index of the color input to bind the user-defined varying out variable to"),
		const _ GLchar_p.IN("name", "the name of the user-defined varying out variable whose binding to modify")
	)

	GLint.func(
		"GetFragDataIndex",
		"Queries the bindings of color indices to user-defined varying out variables.",

		GLuint.IN("program", "the name of the program containing varying out variable whose binding to query"),
		const _ GLchar_p.IN("name", "the name of the user-defined varying out variable whose index to query")
	)

	// ARB_occlusion_query2

	IntConstant.block(
		"Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

		"ANY_SAMPLES_PASSED" _ 0x8C2F
	)

	// ARB_sampler_objects

	IntConstant.block(
		"Accepted by the {@code value} parameter of the GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev functions.",

		"SAMPLER_BINDING" _ 0x8919
	)

	GLvoid.func(
		"GenSamplers",
		"Generates sampler object names.",

		AutoSize("samplers") _ GLsizei.IN("count", "the number of sampler object names to generate"),
		returnValue _ GLuint_p.OUT("samplers", "an array in which the generated sampler object names are stored")
	)

	GLvoid.func(
		"DeleteSamplers",
		"Deletes named sampler objects.",

		AutoSize("samplers") _ GLsizei.IN("count", "the number of sampler objects to be deleted"),
		mods(const, SingleValue("sampler")) _ GLuint_p.IN("samplers", "an array of sampler objects to be deleted")
	)

	GLboolean.func(
		"IsSampler",
		"Determines if a name corresponds to a sampler object.",

		GLuint.IN("sampler", "a value that may be the name of a sampler object")
	)

	GLvoid.func(
		"BindSampler",
		"Binds a named sampler to a texturing target.",

		GLuint.IN("unit", "the index of the texture unit to which the sampler is bound"),
		GLuint.IN("sampler", "the name of a sampler")
	)

	val SamplerParameters =
		"""
		GL11#GL_TEXTURE_WRAP_S GL11#GL_TEXTURE_WRAP_T GL11#GL_TEXTURE_WRAP_R GL11#GL_TEXTURE_MIN_FILTER GL11#GL_TEXTURE_MAG_FILTER GL12#GL_TEXTURE_MIN_LOD
		GL12#GL_TEXTURE_MAX_LOD GL14#GL_TEXTURE_LOD_BIAS GL14#GL_TEXTURE_COMPARE_MODE GL14#GL_TEXTURE_COMPARE_FUNC
		"""

	val SamplerParameteri = GLvoid.func(
		"SamplerParameteri",
		"Set the integer value of a sampler parameter.",

		GLuint.IN("sampler", "the sampler object whose parameter to modify"),
		GLenum.IN("pname", "the symbolic name of a single-valued sampler parameter", SamplerParameters),
		GLint.IN("param", "the value of {@code pname}")
	).javaDocLink

	val SamplerParameterf = GLvoid.func(
		"SamplerParameterf",
		"Float version of $SamplerParameteri.",

		GLuint.IN("sampler", "the sampler object whose parameter to modify"),
		GLenum.IN("pname", "the symbolic name of a single-valued sampler parameter"),
		GLfloat.IN("param", "the value of {@code pname}")
	).javaDocLink

	val SamplerParameteriv = GLvoid.func(
		"SamplerParameteriv",
		"Pointer version of $SamplerParameteri.",

		GLuint.IN("sampler", "the sampler object whose parameter to modify"),
		GLenum.IN("pname", "the symbolic name of a sampler parameter", "GL11#GL_TEXTURE_BORDER_COLOR $SamplerParameters"),
		const _ GLint_p.IN("params", "an array where the value or values of {@code pname} are stored")
	)

	GLvoid.func(
		"SamplerParameterfv",
		"Float version of $SamplerParameteriv.",

		GLuint.IN("sampler", "the sampler object whose parameter to modify"),
		GLenum.IN("pname", "the symbolic name of a sampler parameter"),
		const _ GLfloat_p.IN("params", "an array where the value or values of {@code pname} are stored")
	)

	GLvoid.func(
		"SamplerParameterIiv",
		"Pure integer version of $SamplerParameteriv.",

		GLuint.IN("sampler", "the sampler object whose parameter to modify"),
		GLenum.IN("pname", "the symbolic name of a sampler parameter"),
		const _ GLint_p.IN("params", "an array where the value or values of {@code pname} are stored")
	)

	GLvoid.func(
		"SamplerParameterIuiv",
		"Unsigned pure integer version of $SamplerParameteriv.",

		GLuint.IN("sampler", "the sampler object whose parameter to modify"),
		GLenum.IN("pname", "the symbolic name of a sampler parameter"),
		const _ GLuint_p.IN("params", "an array where the value or values of {@code pname} are stored")
	)

	val GetSamplerParameteriv = GLvoid.func(
		"GetSamplerParameteriv",
		"Return the integer value(s) of a sampler parameter.",

		GLuint.IN("sampler", "the name of the sampler object from which to retrieve parameters"),
		GLenum.IN("pname", "the symbolic name of a sampler parameter", "$SamplerParameters, GL11#GL_TEXTURE_BORDER_COLOR"),
		mods(Check(1), returnValue) _ GLint_p.OUT("params", "the sampler parameters")
	).javaDocLink

	GLvoid.func(
		"GetSamplerParameterfv",
		"Float version of $GetSamplerParameteriv.",

		GLuint.IN("sampler", "the name of the sampler object from which to retrieve parameters"),
		GLenum.IN("pname", "the symbolic name of a sampler parameter"),
		mods(Check(1), returnValue) _ GLfloat_p.OUT("params", "the sampler parameters")
	)

	GLvoid.func(
		"GetSamplerParameterIiv",
		"Pure integer version of $GetSamplerParameteriv.",

		GLuint.IN("sampler", "the name of the sampler object from which to retrieve parameters"),
		GLenum.IN("pname", "the symbolic name of a sampler parameter"),
		mods(Check(1), returnValue) _ GLint_p.OUT("params", "the sampler parameters")
	)

	GLvoid.func(
		"GetSamplerParameterIuiv",
		"Unsigned pure integer version of $GetSamplerParameteriv.",

		GLuint.IN("sampler", "the name of the sampler object from which to retrieve parameters"),
		GLenum.IN("pname", "the symbolic name of a sampler parameter"),
		mods(Check(1), returnValue) _ GLuint_p.OUT("params", "the sampler parameters")
	)

	// ARB_texture_rgb10_a2ui

	IntConstant.block(
		"""
		Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, RenderbufferStorage and
		RenderbufferStorageMultisample.
		""",

		"RGB10_A2UI" _ 0x906F
	)

	// ARB_texture_swizzle

	IntConstant.block(
		"Accepted by the {@code pname} parameters of TexParameteri, TexParameterf, TexParameteriv, TexParameterfv, GetTexParameterfv, and GetTexParameteriv.",

		"TEXTURE_SWIZZLE_R" _ 0x8E42,
		"TEXTURE_SWIZZLE_G" _ 0x8E43,
		"TEXTURE_SWIZZLE_B" _ 0x8E44,
		"TEXTURE_SWIZZLE_A" _ 0x8E45
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameters of TexParameteriv,  TexParameterfv, GetTexParameterfv, and GetTexParameteriv.",

		"TEXTURE_SWIZZLE_RGBA" _ 0x8E46
	)

	// ARB_timer_query

	IntConstant.block(
		"Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

		"TIME_ELAPSED" _ 0x88BF
	)

	IntConstant.block(
		"""
		Accepted by the {@code target} parameter of GetQueryiv and QueryCounter. Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv,
		GetInteger64v, GetFloatv, and GetDoublev.
		""",

		"TIMESTAMP" _ 0x8E28
	)

	GLvoid.func(
		"QueryCounter",
		"Records the GL time into a query object after all previous commands have reached the GL server but have not yet necessarily executed.",

		GLuint.IN("id", "the name of a query object into which to record the GL time"),
		GLenum.IN("target", "the counter to query", "#GL_TIMESTAMP")
	)

	val GetQueryObjecti64v = GLvoid.func(
		"GetQueryObjecti64v",
		"Returns the 64bit integer value of query object parameter.",

		GLuint.IN("id", "the name of a query object"),
		GLenum.IN("pname", "the symbolic name of a query object parameter", "GL15#GL_QUERY_RESULT GL15#GL_QUERY_RESULT_AVAILABLE"),
		mods(Check(1), returnValue) _ GLint64_p.OUT("params", "the requested data")
	).javaDocLink

	GLvoid.func(
		"GetQueryObjectui64v",
		"Unsigned version of $GetQueryObjecti64v.",

		GLuint.IN("id", "the name of a query object"),
		GLenum.IN("pname", "the symbolic name of a query object parameter"),
		mods(Check(1), returnValue) _ GLuint64_p.OUT("params", "the requested data")
	)

	// ARB_instanced_arrays

	IntConstant.block(
		"Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, and GetVertexAttribiv.",

		"VERTEX_ATTRIB_ARRAY_DIVISOR" _ 0x88FE
	)

	GLvoid.func(
		"VertexAttribDivisor",
		"Modifies the rate at which generic vertex attributes advance during instanced rendering.",

		GLuint.IN("index", "the index of the generic vertex attribute"),
		GLuint.IN("divisor", "the number of instances that will pass between updates of the generic attribute at slot {@code index}")
	)

	// ARB_vertex_type_2_10_10_10_rev

	IntConstant.block(
		"""
		Accepted by the {@code type} parameter of VertexAttribPointer, VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, TexCoordPointer,
		VertexAttribP{1234}ui, VertexP*, TexCoordP*, MultiTexCoordP*, NormalP3ui, ColorP*, SecondaryColorP* and VertexAttribP*.
		""",

		"INT_2_10_10_10_REV" _ 0x8D9F
	)

	// Packed functions javadoc
	val packedType = "type of packing used on the data"
	val packedTypes = "#GL_INT_2_10_10_10_REV GL12#GL_UNSIGNED_INT_2_10_10_10_REV"
	val packedValue = "the packed value"

	val VertexP2ui = (deprecatedGL _ GLvoid.func("VertexP2ui", "Packed component version of {@link GL11#glVertex2f}.", GLenum.IN("type", packedType, packedTypes), GLuint.IN("value", "the packed value"))).javaDocLink
	val VertexP3ui = (deprecatedGL _ GLvoid.func("VertexP3ui", "Packed component version of {@link GL11#glVertex3f}.", GLenum.IN("type", packedType, packedTypes), GLuint.IN("value", "the packed value"))).javaDocLink
	val VertexP4ui = (deprecatedGL _ GLvoid.func("VertexP4ui", "Packed component version of {@link GL11#glVertex4f}.", GLenum.IN("type", packedType, packedTypes), GLuint.IN("value", "the packed value"))).javaDocLink

	GLvoid.func("VertexP2uiv", "Pointer version of $VertexP2ui.", GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("value", packedValue))
	GLvoid.func("VertexP3uiv", "Pointer version of $VertexP3ui.", GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("value", packedValue))
	GLvoid.func("VertexP4uiv", "Pointer version of $VertexP4ui.", GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("value", packedValue))

	val TexCoordP1ui = (deprecatedGL _ GLvoid.func("TexCoordP1ui", "Packed component version of {@link GL11#glTexCoord1f}.", GLenum.IN("type", packedType, packedTypes), GLuint.IN("coords", packedValue))).javaDocLink
	val TexCoordP2ui = (deprecatedGL _ GLvoid.func("TexCoordP2ui", "Packed component version of {@link GL11#glTexCoord2f}.", GLenum.IN("type", packedType, packedTypes), GLuint.IN("coords", packedValue))).javaDocLink
	val TexCoordP3ui = (deprecatedGL _ GLvoid.func("TexCoordP3ui", "Packed component version of {@link GL11#glTexCoord3f}.", GLenum.IN("type", packedType, packedTypes), GLuint.IN("coords", packedValue))).javaDocLink
	val TexCoordP4ui = (deprecatedGL _ GLvoid.func("TexCoordP4ui", "Packed component version of {@link GL11#glTexCoord4f}.", GLenum.IN("type", packedType, packedTypes), GLuint.IN("coords", packedValue))).javaDocLink

	GLvoid.func("TexCoordP1uiv", "Pointer version of $TexCoordP1ui.", GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("coords", packedValue))
	GLvoid.func("TexCoordP2uiv", "Pointer version of $TexCoordP2ui.", GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("coords", packedValue))
	GLvoid.func("TexCoordP3uiv", "Pointer version of $TexCoordP3ui.", GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("coords", packedValue))
	GLvoid.func("TexCoordP4uiv", "Pointer version of $TexCoordP4ui.", GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("coords", packedValue))

	val texCoordTex = "the coordinate set to be modified"
	
	val MultiTexCoordP1ui = (deprecatedGL _ GLvoid.func("MultiTexCoordP1ui", "Packed component version of {@link GL13#glMultiTexCoord1f}.", GLenum.IN("texture", texCoordTex), GLenum.IN("type", packedType, packedType), GLuint.IN("coords", packedValue))).javaDocLink
	val MultiTexCoordP2ui = (deprecatedGL _ GLvoid.func("MultiTexCoordP2ui", "Packed component version of {@link GL13#glMultiTexCoord2f}.", GLenum.IN("texture", texCoordTex), GLenum.IN("type", packedType, packedType), GLuint.IN("coords", packedValue))).javaDocLink
	val MultiTexCoordP3ui = (deprecatedGL _ GLvoid.func("MultiTexCoordP3ui", "Packed component version of {@link GL13#glMultiTexCoord3f}.", GLenum.IN("texture", texCoordTex), GLenum.IN("type", packedType, packedType), GLuint.IN("coords", packedValue))).javaDocLink
	val MultiTexCoordP4ui = (deprecatedGL _ GLvoid.func("MultiTexCoordP4ui", "Packed component version of {@link GL13#glMultiTexCoord4f}.", GLenum.IN("texture", texCoordTex), GLenum.IN("type", packedType, packedType), GLuint.IN("coords", packedValue))).javaDocLink

	GLvoid.func("MultiTexCoordP1uiv", "Pointer version of $MultiTexCoordP1ui.", GLenum.IN("texture", texCoordTex), GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("coords", packedValue))
	GLvoid.func("MultiTexCoordP2uiv", "Pointer version of $MultiTexCoordP2ui.", GLenum.IN("texture", texCoordTex), GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("coords", packedValue))
	GLvoid.func("MultiTexCoordP3uiv", "Pointer version of $MultiTexCoordP3ui.", GLenum.IN("texture", texCoordTex), GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("coords", packedValue))
	GLvoid.func("MultiTexCoordP4uiv", "Pointer version of $MultiTexCoordP4ui.", GLenum.IN("texture", texCoordTex), GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("coords", packedValue))

	val NormalP3ui = GLvoid.func("NormalP3ui", "Packed component version of {@link GL11#glNormal3f}.", GLenum.IN("type", packedType, packedTypes), GLuint.IN("coords", packedValue)).javaDocLink

	GLvoid.func("NormalP3uiv", "Pointer version $NormalP3ui.", GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("coords", packedValue))

	val ColorP3ui = GLvoid.func("ColorP3ui", "Packed component version of {@link GL11#glColor3f}.", GLenum.IN("type", packedType, packedTypes), GLuint.IN("color", packedValue)).javaDocLink
	val ColorP4ui = GLvoid.func("ColorP4ui", "Packed component version of {@link GL11#glColor4f}.", GLenum.IN("type", packedType, packedTypes), GLuint.IN("color", packedValue)).javaDocLink

	GLvoid.func("ColorP3uiv", "Pointer version of $ColorP3ui.", GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("color", packedValue))
	GLvoid.func("ColorP4uiv", "Pointer version of $ColorP4ui.", GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("color", packedValue))

	val SecondaryColorP3ui = GLvoid.func("SecondaryColorP3ui", "Packed component version of {@link GL14#glSecondaryColor3f}.", GLenum.IN("type", packedType, packedTypes), GLuint.IN("color", packedValue)).javaDocLink
	GLvoid.func("SecondaryColorP3uiv", "Pointer version of $SecondaryColorP3ui.", GLenum.IN("type", packedType, packedTypes), mods(Check(1), const) _ GLuint_p.IN("color", packedValue))

	val vertexAttribIndex = "the index of the generic vertex attribute to be modified"
	val vertexAttribNormalized = "whether values should be normalized or cast directly to floating-point"

	val VertexAttribP1ui = GLvoid.func("VertexAttribP1ui", "Packed component version of {@link GL20#glVertexAttrib1f}.", GLuint.IN("index", vertexAttribIndex), GLenum.IN("type", packedType, packedTypes), GLboolean.IN("normalized", vertexAttribNormalized), GLuint.IN("value", packedValue)).javaDocLink
	val VertexAttribP2ui = GLvoid.func("VertexAttribP2ui", "Packed component version of {@link GL20#glVertexAttrib2f}.", GLuint.IN("index", vertexAttribIndex), GLenum.IN("type", packedType, packedTypes), GLboolean.IN("normalized", vertexAttribNormalized), GLuint.IN("value", packedValue)).javaDocLink
	val VertexAttribP3ui = GLvoid.func("VertexAttribP3ui", "Packed component version of {@link GL20#glVertexAttrib3f}.", GLuint.IN("index", vertexAttribIndex), GLenum.IN("type", packedType, packedTypes), GLboolean.IN("normalized", vertexAttribNormalized), GLuint.IN("value", packedValue)).javaDocLink
	val VertexAttribP4ui = GLvoid.func("VertexAttribP4ui", "Packed component version of {@link GL20#glVertexAttrib4f}.", GLuint.IN("index", vertexAttribIndex), GLenum.IN("type", packedType, packedTypes), GLboolean.IN("normalized", vertexAttribNormalized), GLuint.IN("value", packedValue)).javaDocLink

	GLvoid.func("VertexAttribP1uiv", "Pointer version of $VertexAttribP1ui.", GLuint.IN("index", vertexAttribIndex), GLenum.IN("type", packedType, packedTypes), GLboolean.IN("normalized", vertexAttribNormalized), mods(Check(1), const) _ GLuint_p.IN("value", packedValue))
	GLvoid.func("VertexAttribP2uiv", "Pointer version of $VertexAttribP2ui.", GLuint.IN("index", vertexAttribIndex), GLenum.IN("type", packedType, packedTypes), GLboolean.IN("normalized", vertexAttribNormalized), mods(Check(1), const) _ GLuint_p.IN("value", packedValue))
	GLvoid.func("VertexAttribP3uiv", "Pointer version of $VertexAttribP3ui.", GLuint.IN("index", vertexAttribIndex), GLenum.IN("type", packedType, packedTypes), GLboolean.IN("normalized", vertexAttribNormalized), mods(Check(1), const) _ GLuint_p.IN("value", packedValue))
	GLvoid.func("VertexAttribP4uiv", "Pointer version of $VertexAttribP4ui.", GLuint.IN("index", vertexAttribIndex), GLenum.IN("type", packedType, packedTypes), GLboolean.IN("normalized", vertexAttribNormalized), mods(Check(1), const) _ GLuint_p.IN("value", packedValue))

}