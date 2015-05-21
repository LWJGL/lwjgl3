/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.opengl.*

val GL40 = "GL40".nativeClassGL("GL40") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		The core OpenGL 4.0 functionality. OpenGL 4.0 implementations support revision 4.00 of the OpenGL Shading Language.

		Extensions promoted to core in this release:
		${ul(
			registryLinkTo("ARB", "texture_query_lod"),
			registryLinkTo("ARB", "draw_buffers_blend"),
			registryLinkTo("ARB", "draw_indirect"),
			registryLinkTo("ARB", "gpu_shader5"),
			registryLinkTo("ARB", "gpu_shader_fp64"),
			registryLinkTo("ARB", "sample_shading"),
			registryLinkTo("ARB", "shader_subroutine"),
			registryLinkTo("ARB", "tessellation_shader"),
			registryLinkTo("ARB", "texture_buffer_object_rgb32"),
			registryLinkTo("ARB", "texture_cube_map_array"),
			registryLinkTo("ARB", "texture_gather"),
			registryLinkTo("ARB", "transform_feedback2"),
			registryLinkTo("ARB", "transform_feedback3")
		)}
		"""

	// ARB_draw_buffers_blend

	val blendEquations = "GL14#FUNC_ADD GL14#FUNC_SUBTRACT GL14#FUNC_REVERSE_SUBTRACT GL14#MIN GL14#MAX"

	ReferenceGL("glBlendEquation") _ GLvoid(
		"BlendEquationi",
		"Specifies the equation used for both the RGB blend equation and the Alpha blend equation for the specified draw buffer.",

		GLuint.IN("buf", "the index of the draw buffer for which to set the blend equation"),
		GLenum.IN("mode", "how source and destination colors are combined", blendEquations)
	)

	ReferenceGL("glBlendEquationSeparate") _ GLvoid(
		"BlendEquationSeparatei",
		"Sets the RGB blend equation and the alpha blend equation separately for the specified draw buffer.",

		GLuint.IN("buf", "the index of the draw buffer for which to set the blend equations"),
		GLenum.IN("modeRGB", "the RGB blend equation, how the red, green, and blue components of the source and destination colors are combined", blendEquations),
		GLenum.IN("modeAlpha", "the alpha blend equation, how the alpha component of the source and destination colors are combined", blendEquations)
	)

	GLvoid(
		"BlendFunci",
		"Specifies pixel arithmetic for the specified draw buffer.",

		GLuint.IN("buf", "the index of the draw buffer for which to set the blend function"),
		GLenum.IN("sfactor", "how the red, green, blue, and alpha source blending factors are computed"),
		GLenum.IN("dfactor", "how the red, green, blue, and alpha destination blending factors are computed")
	)

	GLvoid(
		"BlendFuncSeparatei",
		"Specifies pixel arithmetic for RGB and alpha components separately for the specified draw buffer.",

		GLuint.IN("buf", "the index of the draw buffer for which to set the blend functions"),
		GLenum.IN("srcRGB", "how the red, green, and blue blending factors are computed"),
		GLenum.IN("dstRGB", "how the red, green, and blue destination blending factors are computed"),
		GLenum.IN("srcAlpha", "how the alpha source blending factor is computed"),
		GLenum.IN("dstAlpha", "how the alpha destination blending factor is computed")
	)

	// ARB_draw_indirect

	IntConstant(
		"""
		Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
		MapBufferRange, FlushMappedBufferRange, GetBufferParameteriv, and CopyBufferSubData.
		""",

		"DRAW_INDIRECT_BUFFER" _ 0x8F3F
	)

	IntConstant(
		"Accepted by the {@code value} parameter of GetIntegerv, GetBooleanv, GetFloatv, and GetDoublev.",

		"DRAW_INDIRECT_BUFFER_BINDING" _ 0x8F43
	)

	GLvoid(
		"DrawArraysIndirect",
		"""
		Renders primitives from array data, taking parameters from memory.

		{@code glDrawArraysIndirect} behaves similarly to GL42#DrawArraysInstancedBaseInstance(), except that the parameters to
		glDrawArraysInstancedBaseInstance are stored in memory at the address given by {@code indirect}.

		The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):
		${codeBlock("""
typedef struct {
	uint count;
	uint primCount;
	uint first;
	uint baseInstance; // must be 0 unless OpenGL 4.2 is supported
} DrawArraysIndirectCommand;

const DrawArraysIndirectCommand *cmd = (const DrawArraysIndirectCommand *)indirect;
glDrawArraysInstancedBaseInstance(mode, cmd->first, cmd->count, cmd->primCount, cmd->baseInstance);
		""")}
		""",

		GLenum.IN("mode", "what kind of primitives to render", PRIMITIVE_TYPES),
		Check(
			expression = "4 * 4", bytes = true
		) _ MultiType(
			PointerMapping.DATA_INT
		) _ DRAW_INDIRECT_BUFFER _ const _ GLvoid_p.IN("indirect", "a structure containing the draw parameters")
	)

	GLvoid(
		"DrawElementsIndirect",
		"""
		Renders indexed primitives from array data, taking parameters from memory.

		{@code glDrawElementsIndirect} behaves similarly to GL42#DrawElementsInstancedBaseVertexBaseInstance(), execpt that the parameters to
		glDrawElementsInstancedBaseVertexBaseInstance are stored in memory at the address given by {@code indirect}.

		The parameters addressed by {@code indirect} are packed into a structure that takes the form (in C):
		${codeBlock("""
typedef struct {
	uint count;
	uint primCount;
	uint firstIndex;
	uint baseVertex;
	uint baseInstance;
} DrawElementsIndirectCommand;
		""")}

		{@code glDrawElementsIndirect} is equivalent to:
		${codeBlock("""
void glDrawElementsIndirect(GLenum mode, GLenum type, const void *indirect) {
	const DrawElementsIndirectCommand *cmd  = (const DrawElementsIndirectCommand *)indirect;
	glDrawElementsInstancedBaseVertexBaseInstance(
		mode,
		cmd->count,
		type,
		cmd->firstIndex + size-of-type,
		cmd->primCount,
		cmd->baseVertex,
		cmd->baseInstance
	);
}
		""")}
		""",

		GLenum.IN("mode", "what kind of primitives to render", PRIMITIVE_TYPES),
		GLenum.IN(
			"type",
			"the type of data in the buffer bound to the GL15#ELEMENT_ARRAY_BUFFER binding",
			"GL11#UNSIGNED_BYTE GL11#UNSIGNED_SHORT GL11#UNSIGNED_INT"
		),
		Check(
			expression = "5 * 4", bytes = true
		) _ MultiType(
			PointerMapping.DATA_INT
		) _ DRAW_INDIRECT_BUFFER _ const _ GLvoid_p.IN("indirect", "the address of a structure containing the draw parameters")
	)

	// ARB_gpu_shader5

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramiv.",

		"GEOMETRY_SHADER_INVOCATIONS" _ 0x887F
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.",

		"MAX_GEOMETRY_SHADER_INVOCATIONS" _ 0x8E5A,
		"MIN_FRAGMENT_INTERPOLATION_OFFSET" _ 0x8E5B,
		"MAX_FRAGMENT_INTERPOLATION_OFFSET" _ 0x8E5C,
		"FRAGMENT_INTERPOLATION_OFFSET_BITS" _ 0x8E5D
	)

	// ARB_gpu_shader_fp64

	IntConstant(
		"Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.",

		"DOUBLE_VEC2" _ 0x8FFC,
		"DOUBLE_VEC3" _ 0x8FFD,
		"DOUBLE_VEC4" _ 0x8FFE,
		"DOUBLE_MAT2" _ 0x8F46,
		"DOUBLE_MAT3" _ 0x8F47,
		"DOUBLE_MAT4" _ 0x8F48,
		"DOUBLE_MAT2x3" _ 0x8F49,
		"DOUBLE_MAT2x4" _ 0x8F4A,
		"DOUBLE_MAT3x2" _ 0x8F4B,
		"DOUBLE_MAT3x4" _ 0x8F4C,
		"DOUBLE_MAT4x2" _ 0x8F4D,
		"DOUBLE_MAT4x3" _ 0x8F4E
	)

	// Uniform functions javadoc

	val uniformLocation = "the location of the uniform variable to be modified"
	val uniformX = "the uniform x value"
	val uniformY = "the uniform y value"
	val uniformZ = "the uniform z value"
	val uniformW = "the uniform w value"

	val uniformArrayCount = "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."
	val uniformArrayValue = "a pointer to an array of {@code count} values that will be used to update the specified uniform variable"

	val uniformMatrixCount = "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."
	val uniformMatrixTranspose = "whether to transpose the matrix as the values are loaded into the uniform variable"
	val uniformMatrixValue = "a pointer to an array of {@code count} values that will be used to update the specified uniform matrix variable"

	GLvoid(
		"Uniform1d",
		"Specifies the value of a double uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLdouble.IN("x", uniformX)
	)

	GLvoid(
		"Uniform2d",
		"Specifies the value of a dvec2 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLdouble.IN("x", uniformX),
		GLdouble.IN("y", uniformY)
	)

	GLvoid(
		"Uniform3d",
		"Specifies the value of a dvec3 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLdouble.IN("x", uniformX),
		GLdouble.IN("y", uniformY),
		GLdouble.IN("z", uniformZ)
	)

	GLvoid(
		"Uniform4d",
		"Specifies the value of a dvec4 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLdouble.IN("x", uniformX),
		GLdouble.IN("y", uniformY),
		GLdouble.IN("z", uniformZ),
		GLdouble.IN("w", uniformW)
	)

	GLvoid(
		"Uniform1dv",
		"Specifies the value of a single double uniform variable or a double uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value") _ GLsizei.IN("count", uniformArrayCount),
		const _ GLdouble_p.IN("value", uniformArrayValue)
	)

	GLvoid(
		"Uniform2dv",
		"Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") shr 1) _ GLsizei.IN("count", uniformArrayCount),
		const _ GLdouble_p.IN("value", uniformArrayValue)
	)

	GLvoid(
		"Uniform3dv",
		"Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") / 3) _ GLsizei.IN("count", uniformArrayCount),
		const _ GLdouble_p.IN("value", uniformArrayValue)
	)

	GLvoid(
		"Uniform4dv",
		"Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", uniformArrayCount),
		const _ GLdouble_p.IN("value", uniformArrayValue)
	)

	GLvoid(
		"UniformMatrix2dv",
		"Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", uniformMatrixCount),
		GLboolean.IN("transpose", uniformMatrixTranspose),
		const _ GLdouble_p.IN("value", uniformMatrixValue)
	)

	GLvoid(
		"UniformMatrix3dv",
		"Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") / (3 * 3)) _ GLsizei.IN("count", uniformMatrixCount),
		GLboolean.IN("transpose", uniformMatrixTranspose),
		const _ GLdouble_p.IN("value", uniformMatrixValue)
	)

	GLvoid(
		"UniformMatrix4dv",
		"Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") shr 4) _ GLsizei.IN("count", uniformMatrixCount),
		GLboolean.IN("transpose", uniformMatrixTranspose),
		const _ GLdouble_p.IN("value", uniformMatrixValue)
	)

	GLvoid(
		"UniformMatrix2x3dv",
		"Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") / (2 * 3)) _ GLsizei.IN("count", uniformMatrixCount),
		GLboolean.IN("transpose", uniformMatrixTranspose),
		const _ GLdouble_p.IN("value", uniformMatrixValue)
	)

	GLvoid(
		"UniformMatrix2x4dv",
		"Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") shr 3) _ GLsizei.IN("count", uniformMatrixCount),
		GLboolean.IN("transpose", uniformMatrixTranspose),
		const _ GLdouble_p.IN("value", uniformMatrixValue)
	)

	GLvoid(
		"UniformMatrix3x2dv",
		"Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") / (3 * 2)) _ GLsizei.IN("count", uniformMatrixCount),
		GLboolean.IN("transpose", uniformMatrixTranspose),
		const _ GLdouble_p.IN("value", uniformMatrixValue)

	)

	GLvoid(
		"UniformMatrix3x4dv",
		"Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") / (3 * 4)) _ GLsizei.IN("count", uniformMatrixCount),
		GLboolean.IN("transpose", uniformMatrixTranspose),
		const _ GLdouble_p.IN("value", uniformMatrixValue)

	)

	GLvoid(
		"UniformMatrix4x2dv",
		"Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") shr 3) _ GLsizei.IN("count", uniformMatrixCount),
		GLboolean.IN("transpose", uniformMatrixTranspose),
		const _ GLdouble_p.IN("value", uniformMatrixValue)

	)

	GLvoid(
		"UniformMatrix4x3dv",
		"Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		(AutoSize("value") / (4 * 3)) _ GLsizei.IN("count", uniformMatrixCount),
		GLboolean.IN("transpose", uniformMatrixTranspose),
		const _ GLdouble_p.IN("value", uniformMatrixValue)

	)

	GLvoid(
		"GetUniformdv",
		"Returns the double value(s) of a uniform variable.",

		GLuint.IN("program", "the program object to be queried"),
		GLint.IN("location", "the location of the uniform variable to be queried"),
		Check(1) _ returnValue _ GLdouble_p.OUT("params", "the value of the specified uniform variable")
	)

	// ARB_sample_shading

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"SAMPLE_SHADING" _ 0x8C36
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"MIN_SAMPLE_SHADING_VALUE" _ 0x8C37
	)

	GLvoid(
		"MinSampleShading",
		"Specifies the minimum rate at which sample shading takes place.",

		GLfloat.IN("value", "the rate at which samples are shaded within each covered pixel")
	)

	// ARB_shader_subroutine

	val ProgramStageProperties = IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramStageiv.",

		"ACTIVE_SUBROUTINES" _ 0x8DE5,
		"ACTIVE_SUBROUTINE_UNIFORMS" _ 0x8DE6,
		"ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS" _ 0x8E47,
		"ACTIVE_SUBROUTINE_MAX_LENGTH" _ 0x8E48,
		"ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH" _ 0x8E49
	).javaDocLinks

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.",

		"MAX_SUBROUTINES" _ 0x8DE7,
		"MAX_SUBROUTINE_UNIFORM_LOCATIONS" _ 0x8DE8
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetActiveSubroutineUniformiv.",

		"NUM_COMPATIBLE_SUBROUTINES" _ 0x8E4A,
		"COMPATIBLE_SUBROUTINES" _ 0x8E4B
	)

	GLint(
		"GetSubroutineUniformLocation",
		"Retrieves the location of a subroutine uniform of a given shader stage within a program.",

		GLuint.IN("program", "the name of the program containing shader stage"),
		GLenum.IN("shadertype", "the shader stage from which to query for subroutine uniform index", SHADER_TYPES),
		const _ GLcharASCII_p.IN("name", "the name of the subroutine uniform whose index to query.")
	)

	GLuint(
		"GetSubroutineIndex",
		"Retrieves the index of a subroutine function of a given shader stage within a program.",

		GLuint.IN("program", "the name of the program containing shader stage"),
		GLenum.IN("shadertype", "the shader stage from which to query for subroutine function index", SHADER_TYPES),
		const _ GLcharASCII_p.IN("name", "the name of the subroutine function whose index to query")
	)

	GLvoid(
		"GetActiveSubroutineUniformiv",
		"Queries a property of an active shader subroutine uniform.",

		GLuint.IN("program", "the name of the program containing the subroutine"),
		GLenum.IN("shadertype", "the shader stage from which to query for the subroutine parameter", SHADER_TYPES),
		GLuint.IN("index", "the index of the shader subroutine uniform"),
		GLenum.IN(
			"pname",
			"the parameter of the shader subroutine uniform to query",
			"#NUM_COMPATIBLE_SUBROUTINES #COMPATIBLE_SUBROUTINES GL31#UNIFORM_SIZE GL31#UNIFORM_NAME_LENGTH"
		),
		Check(1) _ returnValue _ GLint_p.OUT("values", "the address of a buffer into which the queried value or values will be placed")
	)

	GLvoid(
		"GetActiveSubroutineUniformName",
		"Queries the name of an active shader subroutine uniform.",

		GLuint.IN("program", "the name of the program containing the subroutine"),
		GLenum.IN("shadertype", "the shader stage from which to query for the subroutine parameter", SHADER_TYPES),
		GLuint.IN("index", "the index of the shader subroutine uniform"),
		AutoSize("name") _ GLsizei.IN("bufsize", "the size of the buffer whose address is given in {@code name}"),
		Check(1) _ nullable _ GLsizei_p.OUT("length", "the address of a variable into which is written the number of characters copied into {@code name}"),
		Return(
			"length", "glGetActiveSubroutineUniformi(program, shadertype, index, GL31.GL_UNIFORM_NAME_LENGTH)"
		) _ GLcharASCII_p.OUT("name", "the address of a buffer that will receive the name of the specified shader subroutine uniform")
	)

	GLvoid(
		"GetActiveSubroutineName",
		"Queries the name of an active shader subroutine.",

		GLuint.IN("program", "the name of the program containing the subroutine"),
		GLenum.IN("shadertype", "the shader stage from which to query the subroutine name", SHADER_TYPES),
		GLuint.IN("index", "the index of the shader subroutine uniform"),
		AutoSize("name") _ GLsizei.IN("bufsize", "the size of the buffer whose address is given in {@code name}"),
		Check(1) _ nullable _ GLsizei_p.OUT("length", "a variable which is to receive the length of the shader subroutine uniform name"),
		Return(
			"length", "glGetProgramStagei(program, shadertype, GL_ACTIVE_SUBROUTINE_MAX_LENGTH)"
		) _ GLcharASCII_p.OUT("name", "an array into which the name of the shader subroutine uniform will be written")
	)

	GLvoid(
		"UniformSubroutinesuiv",
		"Loads active subroutine uniforms.",

		GLenum.IN("shadertype", "the shader stage to update", SHADER_TYPES),
		AutoSize("indices") _ GLsizei.IN("count", "the number of uniform indices stored in {@code indices}"),
		const _ SingleValue("index") _ GLuint_p.IN("indices", "an array holding the indices to load into the shader subroutine variables")
	)

	GLvoid(
		"GetUniformSubroutineuiv",
		"Retrieves the value of a subroutine uniform of a given shader stage of the current program.",

		GLenum.IN("shadertype", "the shader stage from which to query for subroutine uniform index", SHADER_TYPES),
		GLint.IN("location", "the location of the subroutine uniform"),
		Check(1) _ returnValue _ GLuint_p.OUT("params", "a variable to receive the value or values of the subroutine uniform")
	)

	GLvoid(
		"GetProgramStageiv",
		"Retrieves properties of a program object corresponding to a specified shader stage.",

		GLuint.IN("program", "the name of the program containing shader stage"),
		GLenum.IN("shadertype", "the shader stage from which to query for the subroutine parameter", SHADER_TYPES),
		GLenum.IN("pname", " the parameter of the shader to query", ProgramStageProperties),
		Check(1) _ returnValue _ GLint_p.OUT("values", " a variable into which the queried value or values will be placed")
	)

	// ARB_tesselation_shader

	IntConstant(
		"Accepted by the {@code mode} parameter of Begin and all vertex array functions that implicitly call Begin.",

		"PATCHES" _ 0xE
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of PatchParameteri, GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.",

		"PATCH_VERTICES" _ 0x8E72
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of PatchParameterfv, GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv, and GetInteger64v.",

		"PATCH_DEFAULT_INNER_LEVEL" _ 0x8E73,
		"PATCH_DEFAULT_OUTER_LEVEL" _ 0x8E74
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramiv.",

		"TESS_CONTROL_OUTPUT_VERTICES" _ 0x8E75,
		"TESS_GEN_MODE" _ 0x8E76,
		"TESS_GEN_SPACING" _ 0x8E77,
		"TESS_GEN_VERTEX_ORDER" _ 0x8E78,
		"TESS_GEN_POINT_MODE" _ 0x8E79
	)

	IntConstant(
		"Returned by GetProgramiv when {@code pname} is TESS_GEN_MODE.",

		"ISOLINES" _ 0x8E7A
	)

	IntConstant(
		"Returned by GetProgramiv when {@code pname} is TESS_GEN_SPACING.",

		"FRACTIONAL_ODD" _ 0x8E7B,
		"FRACTIONAL_EVEN" _ 0x8E7C
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.",

		"MAX_PATCH_VERTICES" _ 0x8E7D,
		"MAX_TESS_GEN_LEVEL" _ 0x8E7E,
		"MAX_TESS_CONTROL_UNIFORM_COMPONENTS" _ 0x8E7F,
		"MAX_TESS_EVALUATION_UNIFORM_COMPONENTS" _ 0x8E80,
		"MAX_TESS_CONTROL_TEXTURE_IMAGE_UNITS" _ 0x8E81,
		"MAX_TESS_EVALUATION_TEXTURE_IMAGE_UNITS" _ 0x8E82,
		"MAX_TESS_CONTROL_OUTPUT_COMPONENTS" _ 0x8E83,
		"MAX_TESS_PATCH_COMPONENTS" _ 0x8E84,
		"MAX_TESS_CONTROL_TOTAL_OUTPUT_COMPONENTS" _ 0x8E85,
		"MAX_TESS_EVALUATION_OUTPUT_COMPONENTS" _ 0x8E86,
		"MAX_TESS_CONTROL_UNIFORM_BLOCKS" _ 0x8E89,
		"MAX_TESS_EVALUATION_UNIFORM_BLOCKS" _ 0x8E8A,
		"MAX_TESS_CONTROL_INPUT_COMPONENTS" _ 0x886C,
		"MAX_TESS_EVALUATION_INPUT_COMPONENTS" _ 0x886D,
		"MAX_COMBINED_TESS_CONTROL_UNIFORM_COMPONENTS" _ 0x8E1E,
		"MAX_COMBINED_TESS_EVALUATION_UNIFORM_COMPONENTS" _ 0x8E1F
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.",

		"UNIFORM_BLOCK_REFERENCED_BY_TESS_CONTROL_SHADER" _ 0x84F0,
		"UNIFORM_BLOCK_REFERENCED_BY_TESS_EVALUATION_SHADER" _ 0x84F1
	)

	IntConstant(
		"Accepted by the {@code type} parameter of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

		"TESS_EVALUATION_SHADER" _ 0x8E87,
		"TESS_CONTROL_SHADER" _ 0x8E88
	)

	GLvoid(
		"PatchParameteri",
		"Specifies the integer value of the specified parameter for patch primitives.",

		GLenum.IN("pname", "the name of the parameter to set", "#PATCH_VERTICES"),
		GLint.IN("value", "the new value for the parameter given by {@code pname}")
	)

	GLvoid(
		"PatchParameterfv",
		"Specifies an array of float values for the specified parameter for patch primitives.",

		GLenum.IN("pname", "the name of the parameter to set", "#PATCH_DEFAULT_OUTER_LEVEL #PATCH_DEFAULT_INNER_LEVEL"),
		Check(
			expression = "GL11.glGetInteger(GL_PATCH_VERTICES)", debug = true
		) _ const _ GLfloat_p.IN("values", "an array containing the new values for the parameter given by {@code pname}")
	)

	// ARB_texture_cube_map_array

	IntConstant(
		"Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, BindTexture, and GenerateMipmap.",

		"TEXTURE_CUBE_MAP_ARRAY" _ 0x9009
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.",

		"TEXTURE_BINDING_CUBE_MAP_ARRAY" _ 0x900A
	)

	IntConstant(
		"Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CompressedTeximage3D, CompressedTexSubImage3D and CopyTexSubImage3D.",

		"PROXY_TEXTURE_CUBE_MAP_ARRAY" _ 0x900B
	)

	IntConstant(
		"Returned by the {@code type} parameter of GetActiveUniform.",

		"SAMPLER_CUBE_MAP_ARRAY" _ 0x900C,
		"SAMPLER_CUBE_MAP_ARRAY_SHADOW" _ 0x900D,
		"INT_SAMPLER_CUBE_MAP_ARRAY" _ 0x900E,
		"UNSIGNED_INT_SAMPLER_CUBE_MAP_ARRAY" _ 0x900F
	)

	// ARB_texture_gather

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MIN_PROGRAM_TEXTURE_GATHER_OFFSET" _ 0x8E5E,
		"MAX_PROGRAM_TEXTURE_GATHER_OFFSET" _ 0x8E5F,
		"MAX_PROGRAM_TEXTURE_GATHER_COMPONENTS" _ 0x8F9F
	)

	// ARB_transform_feedback2

	IntConstant(
		"Accepted by the {@code target} parameter of BindTransformFeedback.",

		"TRANSFORM_FEEDBACK" _ 0x8E22
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"TRANSFORM_FEEDBACK_BUFFER_PAUSED" _ 0x8E23,
		"TRANSFORM_FEEDBACK_BUFFER_ACTIVE" _ 0x8E24,
		"TRANSFORM_FEEDBACK_BINDING" _ 0x8E25
	)

	GLvoid(
		"BindTransformFeedback",
		"Binds a transform feedback object.",

		GLenum.IN("target", "the target to which to bind the transform feedback object {@code id}", "#TRANSFORM_FEEDBACK"),
		GLuint.IN("id", "the name of a transform feedback object")
	)

	GLvoid(
		"DeleteTransformFeedbacks",
		"Deletes transform feedback objects.",

		AutoSize("ids") _ GLsizei.IN("n", "the number of transform feedback objects to delete"),
		const _ SingleValue("id") _ GLuint_p.IN("ids", "an array of names of transform feedback objects to delete")
	)

	GLvoid(
		"GenTransformFeedbacks",
		"Reserves transform feedback object names.",

		AutoSize("ids") _ GLsizei.IN("n", "the number of transform feedback object names to reserve"),
		returnValue _ GLuint_p.OUT("ids", "an array of into which the reserved names will be written")
	)

	GLboolean(
		"IsTransformFeedback",
		"Determines if a name corresponds to a transform feedback object.",

		GLuint.IN("id", "a value that may be the name of a transform feedback object")
	)

	GLvoid(
		"PauseTransformFeedback",
		"""
		Pauses transform feedback operations for the currently bound transform feedback object.

		When transform feedback operations are paused, transform feedback is still considered active and changing most transform feedback state related to the
		object results in an error. However, a new transform feedback object may be bound while transform feedback is paused. The error GL11#INVALID_OPERATION
		is generated by PauseTransformFeedback if the currently bound transform feedback is not active or is paused.

		When transform feedback is active and not paused, all geometric primitives generated must be compatible with the value of {@code primitiveMode} passed
		to GL30#BeginTransformFeedback(). The error GL11#INVALID_OPERATION is generated by GL11#Begin() or any operation that implicitly calls GL11#Begin()
		(such as GL11#DrawElements()) if {@code mode} is not one of the allowed modes. If a geometry shader is active, its output primitive type is used instead
		of the {@code mode} parameter passed to GL11#Begin() for the purposes of this error check. Any primitive type may be used while transform feedback is
		paused.
		"""
	)

	GLvoid(
		"ResumeTransformFeedback",
		"""
		Resumes transform feedback operations for the currently bound transform feedback object.

		The error GL11#INVALID_OPERATION is generated by #ResumeTransformFeedback() if the currently bound transform feedback is not active or is not paused.
		"""
	)

	GLvoid(
		"DrawTransformFeedback",
		"Render primitives using a count derived from a transform feedback object.",

		GLenum.IN("mode", "what kind of primitives to render", PRIMITIVE_TYPES),
		GLuint.IN("id", "the name of a transform feedback object from which to retrieve a primitive count")
	)

	// ARB_transform_feedback3

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"MAX_TRANSFORM_FEEDBACK_BUFFERS" _ 0x8E70,
		"MAX_VERTEX_STREAMS" _ 0x8E71
	)

	GLvoid(
		"DrawTransformFeedbackStream",
		"Renders primitives using a count derived from a specifed stream of a transform feedback object.",

		GLenum.IN("mode", "what kind of primitives to render", PRIMITIVE_TYPES),
		GLuint.IN("id", "the name of a transform feedback object from which to retrieve a primitive count"),
		GLuint.IN("stream", "the index of the transform feedback stream from which to retrieve a primitive count")
	)

	GLvoid(
		"BeginQueryIndexed",
		"Begins a query object on an indexed target",

		GLenum.IN(
			"target",
			"the target type of query object established between {@code glBeginQueryIndexed} and the subsequent #EndQueryIndexed()",
			QUERY_TARGETS
		),
		GLuint.IN("index", "the index of the query target upon which to begin the query"),
		GLuint.IN("id", "the name of a query object")
	)

	ReferenceGL("glBeginQueryIndexed") _ GLvoid(
		"EndQueryIndexed",
		"Ends a query object on an indexed target",

		GLenum.IN("target", "the target type of query object to be concluded", QUERY_TARGETS),
		GLuint.IN("index", "the index of the query target upon which to end the query")
	)

	GLvoid(
		"GetQueryIndexediv",
		"Returns parameters of an indexed query object target.",

		GLenum.IN("target", "a query object target", QUERY_TARGETS),
		GLuint.IN("index", "the index of the query object target"),
		GLenum.IN("pname", "the symbolic name of a query object target parameter"),
		Check(1) _ returnValue _ GLint_p.OUT("params", "the requested data")
	)

}