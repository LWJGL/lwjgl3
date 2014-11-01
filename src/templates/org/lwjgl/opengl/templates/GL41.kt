/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*

val GL41 = "GL41".nativeClassGL("GL41") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		The core OpenGL 4.1 functionality. OpenGL 4.1 implementations support revision 4.10 of the OpenGL Shading Language.

		Extensions promoted to core in this release:
		${ul(
			registryLinkTo("ARB", "ES2_compatibility"),
			registryLinkTo("ARB", "get_program_binary"),
			registryLinkTo("ARB", "separate_shader_objects"),
			registryLinkTo("ARB", "shader_precision"),
			registryLinkTo("ARB", "vertex_attrib_64bit"),
			registryLinkTo("ARB", "viewport_array")
		)}
		"""


	// ARB_ES2_compatibility

	IntConstant.block(
		"Accepted by the {@code value} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

		"SHADER_COMPILER" _ 0x8DFA,
		"SHADER_BINARY_FORMATS" _ 0x8DF8,
		"NUM_SHADER_BINARY_FORMATS" _ 0x8DF9,
		"MAX_VERTEX_UNIFORM_VECTORS" _ 0x8DFB,
		"MAX_VARYING_VECTORS" _ 0x8DFC,
		"MAX_FRAGMENT_UNIFORM_VECTORS" _ 0x8DFD,
		"IMPLEMENTATION_COLOR_READ_TYPE" _ 0x8B9A,
		"IMPLEMENTATION_COLOR_READ_FORMAT" _ 0x8B9B
	)

	IntConstant.block(
		"Accepted by the {@code type} parameter of VertexAttribPointer.",

		"FIXED" _ 0x140C
	)

	IntConstant.block(
		"Accepted by the {@code precisiontype} parameter of GetShaderPrecisionFormat.",

		"LOW_FLOAT" _ 0x8DF0,
		"MEDIUM_FLOAT" _ 0x8DF1,
		"HIGH_FLOAT" _ 0x8DF2,
		"LOW_INT" _ 0x8DF3,
		"MEDIUM_INT" _ 0x8DF4,
		"HIGH_INT" _ 0x8DF5
	)

	IntConstant.block(
		"Accepted by the {@code format} parameter of most commands taking sized internal formats.",

		"RGB565" _ 0x8D62
	)

	GLvoid.func(
		"ReleaseShaderCompiler",
	    "Releases resources allocated by the shader compiler. This is a hint from the application, and does not prevent later use of the shader compiler."
	)

	GLvoid.func(
		"ShaderBinary",
		"Loads pre-compiled shader binaries.",

		AutoSize("shaders") _ GLsizei.IN("count", "the number of shader object handles contained in {@code shaders}"),
		const _ GLuint_p.IN("shaders", "an array of shader handles into which to load pre-compiled shader binaries"),
		GLenum.IN("binaryformat", "the format of the shader binaries contained in {@code binary}"),
		const _ GLvoid_p.IN("binary", "an array of bytes containing pre-compiled binary shader code"),
		AutoSize("binary") _ GLsizei.IN("length", "the length of the array whose address is given in binary")
	)

	GLvoid.func(
		"GetShaderPrecisionFormat",
		"Retrieves the range and precision for numeric formats supported by the shader compiler.",

		GLenum.IN("shadertype", "the type of shader whose precision to query", "GL20#VERTEX_SHADER GL20#FRAGMENT_SHADER"),
		GLenum.IN("precisiontype", "the numeric format whose precision and range to query"),
		Check(2) _ GLint_p.OUT("range", "the address of array of two integers into which encodings of the implementation's numeric range are returned"),
		mods(Check(1), returnValue) _ GLint_p.OUT("precision", "the address of an integer into which the numeric precision of the implementation is written")
	)

	ReferenceGL("DepthRange") _ GLvoid.func(
		"DepthRangef",
		"Specifies mapping of depth values from normalized device coordinates to window coordinates",

		GLfloat.IN("zNear", "the mapping of the near clipping plane to window coordinates. The initial value is 0.0f."),
		GLfloat.IN("zFar", "the mapping of the far clipping plane to window coordinates. The initial value is 1.0f.")
	)

	GLvoid.func(
		"ClearDepthf",
		"Specifies the clear value for the depth buffer",

		GLfloat.IN("depth", "the depth value used when the depth buffer is cleared. The initial value is 1.0f.")
	)

	// ARB_get_program_binary

	IntConstant.block(
		"Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.",

		"PROGRAM_BINARY_RETRIEVABLE_HINT" _ 0x8257
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetProgramiv.",

		"PROGRAM_BINARY_LENGTH" _ 0x8741
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv and GetDoublev.",

		"NUM_PROGRAM_BINARY_FORMATS" _ 0x87FE,
		"PROGRAM_BINARY_FORMATS" _ 0x87FF
	)

	GLvoid.func(
		"GetProgramBinary",
		"Returns a binary representation of a program object's compiled and linked executable source.",

		GLuint.IN("program", "the name of a program object whose binary representation to retrieve"),
		AutoSize("binary") _ GLsizei.IN("bufSize", "the size of the buffer whose address is given by {@code binary}"),
		mods(Check(1), nullable) _ GLsizei_p.OUT("length", "the address of a variable to receive the number of bytes written into {@code binary}"),
		Check(1) _ GLenum_p.OUT("binaryFormat", "a variable to receive a token indicating the format of the binary data returned by the GL"),
		Return("length", "GL20.glGetProgrami(program, GL_PROGRAM_BINARY_LENGTH)") _ GLvoid_p.OUT(
			"binary",
			"an array into which the GL will return {@code program}'s binary representation"
		)
	)

	GLvoid.func(
		"ProgramBinary",
		"Loads a program object with a program binary.",

		GLuint.IN("program", "the name of a program object into which to load a program binary"),
		GLenum.IN("binaryFormat", "the format of the binary data in binary"),
		const _ GLvoid_p.IN("binary", "an array containing the binary to be loaded into {@code program}"),
		AutoSize("binary") _ GLsizei.IN("length", "the number of bytes contained in {@code binary}")
	)

	ReferenceGL("glProgramParameter") _ GLvoid.func(
		"ProgramParameteri",
		"Specifies the integer value of a program object parameter.",

		GLuint.IN("program", "the name of a program object whose parameter to modify"),
		GLenum.IN("pname", "the name of the parameter to modify", "#PROGRAM_BINARY_RETRIEVABLE_HINT #PROGRAM_SEPARABLE"),
		GLint.IN("value", "the new value of the parameter specified by {@code pname} for {@code program}")
	)

	// ARB_separate_shader_objects

	IntConstant.block(
		"Accepted by {@code stages} parameter to UseProgramStages.",

		"VERTEX_SHADER_BIT" _ 0x00000001,
		"FRAGMENT_SHADER_BIT" _ 0x00000002,
		"GEOMETRY_SHADER_BIT" _ 0x00000004,
		"TESS_CONTROL_SHADER_BIT" _ 0x00000008,
		"TESS_EVALUATION_SHADER_BIT" _ 0x00000010,
		"ALL_SHADER_BITS" _ 0xFFFFFFFF.i
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.",

		"PROGRAM_SEPARABLE" _ 0x8258
	)

	IntConstant.block(
		"Accepted by {@code type} parameter to GetProgramPipelineiv.",

		"ACTIVE_PROGRAM" _ 0x8259
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

		"PROGRAM_PIPELINE_BINDING" _ 0x825A
	)

	GLvoid.func(
		"UseProgramStages",
		"Binds stages of a program object to a program pipeline.",

		GLuint.IN("pipeline", " the program pipeline object to which to bind stages from {@code program}"),
		GLbitfield.IN("stages", "a set of program stages to bind to the program pipeline object"),
		GLuint.IN("program", "the program object containing the shader executables to use in {@code pipeline}")
	)

	GLvoid.func(
		"ActiveShaderProgram",
		"Sets the active program object for a program pipeline object.",

		GLuint.IN("pipeline", "the program pipeline object to set the active program object for"),
		GLuint.IN("program", "the program object to set as the active program pipeline object {@code pipeline}")
	)

	GLuint.func(
		"CreateShaderProgramv",
		"""
		Creates a stand-alone program from an array of null-terminated source code strings.

		{@code glCreateShaderProgram} is equivalent (assuming no errors are generated) to:
		${codeBlock("""
const GLuint shader = glCreateShader(type);
if (shader) {
	glShaderSource(shader, count, strings, NULL);
	glCompileShader(shader);
	const GLuint program = glCreateProgram();
	if (program) {
		GLint compiled = GL_FALSE;
		glGetShaderiv(shader, GL_COMPILE_STATUS, &compiled);
		glProgramParameteri(program, GL_PROGRAM_SEPARABLE, GL_TRUE);
		if (compiled) {
			glAttachShader(program, shader);
			glLinkProgram(program);
			glDetachShader(program, shader);
		}
		// append-shader-info-log-to-program-info-log
	}
	glDeleteShader(shader);
	return program;
} else {
	return 0;
}
		""")}
		The program object created by glCreateShaderProgram has its GL_PROGRAM_SEPARABLE status set to GL_TRUE.
		""",

		GLenum.IN("type", "the type of shader to create"),
		AutoSize("strings") _ GLsizei.IN("count", "the number of source code strings in the array {@code strings}"),
		mods(const, PointerArray(GLcharUTF8_p, "string")) _ GLcharUTF8_pp.IN(
			"strings",
			"an array of pointers to source code strings from which to create the program object"
		)
	)

	GLvoid.func(
		"BindProgramPipeline",
		"Binds a program pipeline to the current context.",

		GLuint.IN("pipeline", "the name of the pipeline object to bind to the context")
	)

	GLvoid.func(
		"DeleteProgramPipelines",
		"Deletes program pipeline objects.",

		AutoSize("pipelines") _ GLsizei.IN("n", "the number of program pipeline objects to delete"),
		mods(const, SingleValue("pipeline")) _ GLuint_p.IN("pipelines", "an array of names of program pipeline objects to delete")
	)

	GLvoid.func(
		"GenProgramPipelines",
		"Reserves program pipeline object names.",

		AutoSize("pipelines") _ GLsizei.IN("n", "the number of program pipeline object names to reserve"),
		returnValue _ GLuint_p.OUT("pipelines", "an array of into which the reserved names will be written")
	)

	GLboolean.func(
		"IsProgramPipeline",
		"Determines if a name corresponds to a program pipeline object.",

		GLuint.IN("pipeline", "a value that may be the name of a program pipeline object")
	)

	GLvoid.func(
		"GetProgramPipelineiv",
		"Retrieves properties of a program pipeline object.",

		GLuint.IN("pipeline", "the name of a program pipeline object whose parameter retrieve"),
		GLenum.IN(
			"pname",
			"the name of the parameter to retrieve",
			"#ACTIVE_PROGRAM GL20#INFO_LOG_LENGTH $SHADER_TYPES"
		),
		mods(Check(1), returnValue) _ GLint_p.OUT("params", "a variable into which will be written the value or values of {@code pname} for {@code pipeline}")
	)

	// ProgramUniform JavaDoc
	val uniProgram = "the handle of the program containing the uniform variable to be modified"
	val uniLocation = "the location of the uniform variable to be modified"
	val uniX = "the uniform x value"
	val uniY = "the uniform y value"
	val uniZ = "the uniform z value"
	val uniW = "the uniform w value"

	val uniArrayCount = "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."
	val uniArrayValue = "an array of {@code count} values that will be used to update the specified uniform variable"

	val uniMatrixCount = "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."
	val uniMatrixTranspose = "whether to transpose the matrix as the values are loaded into the uniform variable"
	val uniMatrixValue = "an array of {@code count} values that will be used to update the specified uniform matrix variable"

	val ProgramUniformRef = ReferenceGL("glProgramUniform")

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform1i",
		"Specifies the value of an int uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLint.IN("x", uniX)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform2i",
		"Specifies the value of an ivec2 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLint.IN("x", uniX),
		GLint.IN("y", uniY)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform3i",
		"Specifies the value of an ivec3 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLint.IN("x", uniX),
		GLint.IN("y", uniY),
		GLint.IN("z", uniZ)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform4i",
		"Specifies the value of an ivec4 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLint.IN("x", uniX),
		GLint.IN("y", uniY),
		GLint.IN("z", uniZ),
		GLint.IN("w", uniW)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform1ui",
		"Specifies the value of a uint uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLuint.IN("x", uniX)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform2ui",
		"Specifies the value of a uvec2 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLuint.IN("x", uniX),
		GLuint.IN("y", uniY)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform3ui",
		"Specifies the value of a uvec3 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLuint.IN("x", uniX),
		GLuint.IN("y", uniY),
		GLuint.IN("z", uniZ)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform4ui",
		"Specifies the value of a uvec4 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLuint.IN("x", uniX),
		GLuint.IN("y", uniY),
		GLuint.IN("z", uniZ),
		GLuint.IN("w", uniW)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform1f",
		"Specifies the value of a float uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLfloat.IN("x", uniX)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform2f",
		"Specifies the value of a vec2 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLfloat.IN("x", uniX),
		GLfloat.IN("y", uniY)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform3f",
		"Specifies the value of a vec3 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLfloat.IN("x", uniX),
		GLfloat.IN("y", uniY),
		GLfloat.IN("z", uniZ)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform4f",
		"Specifies the value of a vec4 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLfloat.IN("x", uniX),
		GLfloat.IN("y", uniY),
		GLfloat.IN("z", uniZ),
		GLfloat.IN("w", uniW)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform1d",
		"Specifies the value of a double uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLdouble.IN("x", uniX)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform2d",
		"Specifies the value of a dvec2 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLdouble.IN("x", uniX),
		GLdouble.IN("y", uniY)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform3d",
		"Specifies the value of a dvec3 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLdouble.IN("x", uniX),
		GLdouble.IN("y", uniY),
		GLdouble.IN("z", uniZ)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform4d",
		"Specifies the value of a dvec4 uniform variable for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		GLdouble.IN("x", uniX),
		GLdouble.IN("y", uniY),
		GLdouble.IN("z", uniZ),
		GLdouble.IN("w", uniW)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform1iv",
		"Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		AutoSize("value") _ GLsizei.IN("count", uniArrayCount),
		const _ GLint_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform2iv",
		"Specifies the value of a single ivec2 uniform variable or a ivec2 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 1) _ GLsizei.IN("count", uniArrayCount),
		const _ GLint_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform3iv",
		"Specifies the value of a single ivec3 uniform variable or a ivec3 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (3 * 3)) _ GLsizei.IN("count", uniArrayCount),
		const _ GLint_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform4iv",
		"Specifies the value of a single ivec4 uniform variable or a ivec4 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", uniArrayCount),
		const _ GLint_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform1uiv",
		"Specifies the value of a single uint uniform variable or a uint uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		AutoSize("value") _ GLsizei.IN("count", uniArrayCount),
		const _ GLuint_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform2uiv",
		"Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 1) _ GLsizei.IN("count", uniArrayCount),
		const _ GLuint_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform3uiv",
		"Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (3 * 3)) _ GLsizei.IN("count", uniArrayCount),
		const _ GLuint_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform4uiv",
		"Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", uniArrayCount),
		const _ GLuint_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform1fv",
		"Specifies the value of a single float uniform variable or a float uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		AutoSize("value") _ GLsizei.IN("count", uniArrayCount),
		const _ GLfloat_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform2fv",
		"Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 1) _ GLsizei.IN("count", uniArrayCount),
		const _ GLfloat_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform3fv",
		"Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (3 * 3)) _ GLsizei.IN("count", uniArrayCount),
		const _ GLfloat_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform4fv",
		"Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", uniArrayCount),
		const _ GLfloat_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform1dv",
		"Specifies the value of a single double uniform variable or a double uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		AutoSize("value") _ GLsizei.IN("count", uniArrayCount),
		const _ GLdouble_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform2dv",
		"Specifies the value of a single dvec2 uniform variable or a dvec2 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 1) _ GLsizei.IN("count", uniArrayCount),
		const _ GLdouble_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform3dv",
		"Specifies the value of a single dvec3 uniform variable or a dvec3 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (3 * 3)) _ GLsizei.IN("count", uniArrayCount),
		const _ GLdouble_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniform4dv",
		"Specifies the value of a single dvec4 uniform variable or a dvec4 uniform variable array for a specified program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", uniArrayCount),
		const _ GLdouble_p.IN("value", uniArrayValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix2fv",
		"Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLfloat_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix3fv",
		"Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (3 * 3)) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLfloat_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix4fv",
		"Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 4) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLfloat_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix2dv",
		"Specifies the value of a single dmat2 uniform variable or a dmat2 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 2) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLdouble_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix3dv",
		"Specifies the value of a single dmat3 uniform variable or a dmat3 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (3 * 3)) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLdouble_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix4dv",
		"Specifies the value of a single dmat4 uniform variable or a dmat4 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 4) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLdouble_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix2x3fv",
		"Specifies the value of a single mat2x3 uniform variable or a mat2x3 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (2 * 3)) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLfloat_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix3x2fv",
		"Specifies the value of a single mat3x2 uniform variable or a mat3x2 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (3 * 2)) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLfloat_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix2x4fv",
		"Specifies the value of a single mat2x4 uniform variable or a mat2x4 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 3) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLfloat_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix4x2fv",
		"Specifies the value of a single mat4x2 uniform variable or a mat4x2 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 3) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLfloat_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix3x4fv",
		"Specifies the value of a single mat3x4 uniform variable or a mat3x4 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (3 * 4)) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLfloat_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix4x3fv",
		"Specifies the value of a single mat4x3 uniform variable or a mat4x3 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (4 * 3)) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLfloat_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix2x3dv",
		"Specifies the value of a single dmat2x3 uniform variable or a dmat2x3 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (2 * 3)) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLdouble_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix3x2dv",
		"Specifies the value of a single dmat3x2 uniform variable or a dmat3x2 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (3 * 2)) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLdouble_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix2x4dv",
		"Specifies the value of a single dmat2x4 uniform variable or a dmat2x4 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 3) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLdouble_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix4x2dv",
		"Specifies the value of a single dmat4x2 uniform variable or a dmat4x2 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") shr 3) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLdouble_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix3x4dv",
		"Specifies the value of a single dmat3x4 uniform variable or a dmat3x4 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (3 * 4)) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLdouble_p.IN("value", uniMatrixValue)
	)

	ProgramUniformRef _ GLvoid.func(
		"ProgramUniformMatrix4x3dv",
		"Specifies the value of a single dmat4x3 uniform variable or a dmat4x3 uniform variable array for the current program object.",

		GLuint.IN("program", uniProgram),
		GLint.IN("location", uniLocation),
		(AutoSize("value") / (4 * 3)) _ GLsizei.IN("count", uniMatrixCount),
		GLboolean.IN("transpose", uniMatrixTranspose),
		const _ GLdouble_p.IN("value", uniMatrixValue)
	)

	GLvoid.func(
		"ValidateProgramPipeline",
		"Validates a program pipeline object against current GL state.",

		GLuint.IN("pipeline", "the name of a program pipeline object to validate")
	)

	GLvoid.func(
		"GetProgramPipelineInfoLog",
		"Retrieves the info log string from a program pipeline object.",

		GLuint.IN("pipeline", "the name of a program pipeline object from which to retrieve the info log"),
		AutoSize("infoLog") _ GLsizei.IN("bufSize", "the maximum number of characters, including the null terminator, that may be written into {@code infoLog}"),
		mods(Check(1), nullable) _ GLsizei_p.OUT("length", "a variable into which will be written the number of characters written into {@code infoLog}"),
		Return("length", "glGetProgramPipelinei(pipeline, GL20.GL_INFO_LOG_LENGTH)") _ GLcharUTF8_p.OUT(
			"infoLog",
			" an array of characters into which will be written the info log for {@code pipeline}"
		)
	)

	// ARB_vertex_attrib_64bit

	// Vertex attrib functions javadoc
	val attribIndex = "the index of the generic vertex attribute to be modified"
	val attribX = "the vertex attribute x component"
	val attribY = "the vertex attribute y component"
	val attribZ = "the vertex attribute z component"
	val attribW = "the vertex attribute w component"
	val attribBuffer = "the vertex attribute buffer"

	val VertexAttribRef = ReferenceGL("glVertexAttrib")

	val VertexAttribL1d = (VertexAttribRef _ GLvoid.func(
		"VertexAttribL1d",
		"Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0 and w to 1.0.",

		GLuint.IN("index", attribIndex),
		GLdouble.IN("x", attribX)
	)).javaDocLink

	val VertexAttribL2d = (VertexAttribRef _ GLvoid.func(
		"VertexAttribL2d",
		"Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0 and w to 1.0.",

		GLuint.IN("index", attribIndex),
		GLdouble.IN("x", attribX),
		GLdouble.IN("y", attribY)
	)).javaDocLink

	val VertexAttribL3d = (VertexAttribRef _ GLvoid.func(
		"VertexAttribL3d",
		"Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0.",

		GLuint.IN("index", attribIndex),
		GLdouble.IN("x", attribX),
		GLdouble.IN("y", attribY),
		GLdouble.IN("z", attribZ)
	)).javaDocLink

	val VertexAttribL4d = (VertexAttribRef _ GLvoid.func(
		"VertexAttribL4d",
		"Specifies the value of a generic vertex attribute.",

		GLuint.IN("index", attribIndex),
		GLdouble.IN("x", attribX),
		GLdouble.IN("y", attribY),
		GLdouble.IN("z", attribZ),
		GLdouble.IN("w", attribW)
	)).javaDocLink

	VertexAttribRef _ GLvoid.func("VertexAttribL1dv", "Pointer version of $VertexAttribL1d.", GLuint.IN("index", attribIndex), mods(Check(1), const) _ GLdouble_p.IN("v", attribBuffer))
	VertexAttribRef _ GLvoid.func("VertexAttribL2dv", "Pointer version of $VertexAttribL2d.", GLuint.IN("index", attribIndex), mods(Check(2), const) _ GLdouble_p.IN("v", attribBuffer))
	VertexAttribRef _ GLvoid.func("VertexAttribL3dv", "Pointer version of $VertexAttribL3d.", GLuint.IN("index", attribIndex), mods(Check(3), const) _ GLdouble_p.IN("v", attribBuffer))
	VertexAttribRef _ GLvoid.func("VertexAttribL4dv", "Pointer version of $VertexAttribL4d.", GLuint.IN("index", attribIndex), mods(Check(4), const) _ GLdouble_p.IN("v", attribBuffer))

	ReferenceGL("glVertexAttribPointer") _ GLvoid.func(
		"VertexAttribLPointer",
		"Specifies the location and organization of a 64-bit vertex attribute array.",

		GLuint.IN("index", attribIndex),
		GLint.IN("size", "the number of values per vertex that are stored in the array. The initial value is 4", "1 2 3 4 GL12#BGRA"),
		AutoType("pointer", GL_DOUBLE) _ GLenum.IN("type", "the data type of each component in the array", "GL11#DOUBLE"),
		GLsizei.IN(
			"stride",
			"""
			the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
			the array. The initial value is 0.
			"""
		),
		mods(const, ARRAY_BUFFER) _ GLvoid_p.IN(
			"pointer",
			"""
			the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
			currently bound to the GL15#ARRAY_BUFFER target. The initial value is 0.
			"""
		)
	)

	ReferenceGL("glGetVertexAttrib") _ GLvoid.func(
		"GetVertexAttribLdv",
		"Double version of GL20#GetVertexAttribi().",

		GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
		GLenum.IN("pname", "the symbolic name of the vertex attribute parameter to be queried"),
		GLdouble_p.IN("params", "the requested data")
	)

	// ARB_viewport_array

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev and GetInteger64v.",

		"MAX_VIEWPORTS" _ 0x825B,
		"VIEWPORT_SUBPIXEL_BITS" _ 0x825C,
		"VIEWPORT_BOUNDS_RANGE" _ 0x825D,
		"LAYER_PROVOKING_VERTEX" _ 0x825E,
		"VIEWPORT_INDEX_PROVOKING_VERTEX" _ 0x825F
	)

	IntConstant.block(
		"Returned in the {@code data} parameter from a Get query with a {@code pname} of LAYER_PROVOKING_VERTEX or VIEWPORT_INDEX_PROVOKING_VERTEX.",

		"UNDEFINED_VERTEX" _ 0x8260
	)

	GLvoid.func(
		"ViewportArrayv",
		"Sets multiple viewports.",

		GLuint.IN("first", "the first viewport to set"),
		(AutoSize("v") shr 2) _ GLsizei.IN("count", "the number of viewports to set"),
		const _ GLfloat_p.IN("v", "an array containing the viewport parameters")
	)

	val ViewportIndexedf = (ReferenceGL("glViewportIndexed") _ GLvoid.func(
		"ViewportIndexedf",
		"Sets a specified viewport.",

		GLuint.IN("index", "the viewport to set"),
		GLfloat.IN("x", "the left viewport coordinate"),
		GLfloat.IN("y", "the bottom viewport coordinate"),
		GLfloat.IN("w", "the viewport width"),
		GLfloat.IN("h", "the viewport height")
	)).javaDocLink

	GLvoid.func(
		"ViewportIndexedfv",
		"Pointer version of $ViewportIndexedf.",

		GLuint.IN("index", "the viewport to set"),
		mods(Check(4), const) _ GLfloat_p.IN("v", "the viewport parameters")
	)

	GLvoid.func(
		"ScissorArrayv",
		"Defines the scissor box for multiple viewports.",

		GLuint.IN("first", "the index of the first viewport whose scissor box to modify"),
		(AutoSize("v") shr 2) _ GLsizei.IN("count", " the number of scissor boxes to modify"),
		const _ GLint_p.IN("v", "an array containing the left, bottom, width and height of each scissor box, in that order")
	)

	val ScissorIndexed = GLvoid.func(
		"ScissorIndexed",
		"Defines the scissor box for a specific viewport.",

		GLuint.IN("index", "the index of the viewport whose scissor box to modify"),
		GLint.IN("left", "the left scissor box coordinate"),
		GLint.IN("bottom", "the bottom scissor box coordinate"),
		GLsizei.IN("width", "the scissor box width"),
		GLsizei.IN("height", "the scissor box height")
	).javaDocLink

	GLvoid.func(
		"ScissorIndexedv",
		"Pointer version of $ScissorIndexed.",

		GLuint.IN("index", "the index of the viewport whose scissor box to modify"),
		mods(Check(4), const) _ GLint_p.IN("v", "an array containing the left, bottom, width and height of each scissor box, in that order")
	)

	GLvoid.func(
		"DepthRangeArrayv",
		"Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified set of viewports.",

		GLuint.IN("first", "the index of the first viewport whose depth range to update"),
		(AutoSize("v") shr 1) _ GLsizei.IN("count", "the number of viewports whose depth range to update"),
		const _ GLdouble_p.IN("v", "n array containing the near and far values for the depth range of each modified viewport")
	)

	GLvoid.func(
		"DepthRangeIndexed",
		"Specifies mapping of depth values from normalized device coordinates to window coordinates for a specified viewport.",

		GLuint.IN("index", "the index of the viewport whose depth range to update"),
		GLdouble.IN("zNear", "the mapping of the near clipping plane to window coordinates. The initial value is 0."),
		GLdouble.IN("zFar", "the mapping of the far clipping plane to window coordinates. The initial value is 1.")
	)

	GLvoid.func(
		"GetFloati_v",
		"Queries the float value of an indexed state variable.",

		GLenum.IN("target", "the indexed state to query"),
		GLuint.IN("index", "the index of the element being queried"),
		mods(Check(1), returnValue) _ GLfloat_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)

	GLvoid.func(
		"GetDoublei_v",
		"Queries the double value of an indexed state variable.",

		GLenum.IN("target", "the indexed state to query"),
		GLuint.IN("index", "the index of the element being queried"),
		mods(Check(1), returnValue) _ GLdouble_p.OUT("data", "a scalar or buffer in which to place the returned data")
	)
}