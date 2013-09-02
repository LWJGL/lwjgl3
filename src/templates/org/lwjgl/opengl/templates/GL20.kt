/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.generator.opengl.*
import org.lwjgl.generator.opengl.BufferType.*
import org.lwjgl.opengl.*

val SHADER_TYPES = "GL20#GL_VERTEX_SHADER GL20#GL_FRAGMENT_SHADER GL32#GL_GEOMETRY_SHADER GL40#GL_TESS_CONTROL_SHADER GL40#GL_TESS_EVALUATION_SHADER"

fun GL20() = "GL20".nativeClassGL("GL20") {
	nativeImport (
		"OpenGL.h"
	)

	javaDoc("The core OpenGL 2.0 functionality.")
	
	// ARB_shading_language_100

	IntConstant.block(
		"Accepted by the {@code name} parameter of GetString.",

		"SHADING_LANGUAGE_VERSION" _ 0x8B8C
	)

	// ARB_shader_objects

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetInteger.",

		"CURRENT_PROGRAM" _ 0x8B8D
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetShaderiv.",

		"SHADER_TYPE" _ 0x8B4F,
		"DELETE_STATUS" _ 0x8B80,
		"COMPILE_STATUS" _ 0x8B81,
		"LINK_STATUS" _ 0x8B82,
		"VALIDATE_STATUS" _ 0x8B83,
		"INFO_LOG_LENGTH" _ 0x8B84,
		"ATTACHED_SHADERS" _ 0x8B85,
		"ACTIVE_UNIFORMS" _ 0x8B86,
		"ACTIVE_UNIFORM_MAX_LENGTH" _ 0x8B87,
		"ACTIVE_ATTRIBUTES" _ 0x8B89,
		"ACTIVE_ATTRIBUTE_MAX_LENGTH" _ 0x8B8A,
		"SHADER_SOURCE_LENGTH" _ 0x8B88
	)

	IntConstant.block(
		"Returned by the {@code type} parameter of GetActiveUniform.",

		"FLOAT_VEC2" _ 0x8B50,
		"FLOAT_VEC3" _ 0x8B51,
		"FLOAT_VEC4" _ 0x8B52,
		"INT_VEC2" _ 0x8B53,
		"INT_VEC3" _ 0x8B54,
		"INT_VEC4" _ 0x8B55,
		"BOOL_VEC2" _ 0x8B57,
		"BOOL_VEC3" _ 0x8B58,
		"BOOL_VEC4" _ 0x8B59,
		"FLOAT_MAT2" _ 0x8B5A,
		"FLOAT_MAT3" _ 0x8B5B,
		"FLOAT_MAT4" _ 0x8B5C,
		"SAMPLER_1D" _ 0x8B5D,
		"SAMPLER_2D" _ 0x8B5E,
		"SAMPLER_3D" _ 0x8B5F,
		"SAMPLER_CUBE" _ 0x8B60,
		"SAMPLER_1D_SHADOW" _ 0x8B61,
		"SAMPLER_2D_SHADOW" _ 0x8B62
	)

	GLuint.func("CreateProgram", "Creates a program object.")

	GLvoid.func(
		"DeleteProgram",
		"Deletes a program object.",

		GLuint.IN("program", "the program object to be deleted")
	)

	GLuint.func(
		"CreateShader",
		"Creates a shader object.",

		GLenum.IN("type", "the type of shader to be created", SHADER_TYPES)
	)

	GLvoid.func(
		"DeleteShader",
		"Deletes a shader object.",

		GLuint.IN("shader", "the shader object to be deleted")
	)

	GLvoid.func(
		"AttachShader",
		"""
		Attaches a shader object to a program object.

		In order to create a complete shader program, there must be a way to specify the list of things that will be linked together. Program objects provide
		this mechanism. Shaders that are to be linked together in a program object must first be attached to that program object. glAttachShader attaches the
		shader object specified by shader to the program object specified by program. This indicates that shader will be included in link operations that will
		be performed on program.

		All operations that can be performed on a shader object are valid whether or not the shader object is attached to a program object. It is permissible to
		attach a shader object to a program object before source code has been loaded into the shader object or before the shader object has been compiled. It
		is permissible to attach multiple shader objects of the same type because each may contain a portion of the complete shader. It is also permissible to
		attach a shader object to more than one program object. If a shader object is deleted while it is attached to a program object, it will be flagged for
		deletion, and deletion will not occur until glDetachShader is called to detach it from all program objects to which it is attached.
		""",

		GLuint.IN("program", "the program object to which a shader object will be attached"),
		GLuint.IN("shader", "the shader object that is to be attached")
	)

	GLvoid.func(
		"DetachShader",
		"Detaches a shader object from a program object to which it is attached.",

		GLuint.IN("program", "the program object from which to detach the shader object"),
		GLuint.IN("shader", "the shader object to be detached")
	)

	GLvoid.func(
		"ShaderSource",
		"""
		Sets the source code in {@code shader} to the source code in the array of strings specified by {@code strings}. Any source code previously stored in the
		shader object is completely replaced. The number of strings in the array is specified by {@code count}. If {@code length} is NULL, each string is
		assumed to be null terminated. If {@code length} is a value other than NULL, it points to an array containing a string length for each of the
		corresponding elements of {@code strings}. Each element in the length array may contain the length of the corresponding string (the null character is not
		counted as part of the string length) or a value less than 0 to indicate that the string is null terminated. The source code strings are not scanned or
		parsed at this time; they are simply copied into the specified shader object.
		""",

		GLuint.IN("shader", "the handle of the shader object whose source code is to be replaced"),
		AutoSize("strings", "length") _ GLsizei.IN("count", "the number of elements in the string and length arrays"),
		mods(const, PointerArray(GLcharUTF8_p, "string", "count", "length")) _ GLcharUTF8_pp.IN(
			"strings",
			"an array of pointers to strings containing the source code to be loaded into the shader"
		),
		mods(const, nullable) _ GLint_p.IN("length", "an array of string lengths")
	)

	GLvoid.func(
		"CompileShader",
		"Compiles a shader object.",

		GLuint.IN("shader", "the shader object to be compiled")
	)

	GLvoid.func(
		"LinkProgram",
		"Links a program object.",

		GLuint.IN("program", "the handle of the program object to be linked")
	)

	GLvoid.func(
		"UseProgram",
		"Installs a program object as part of current rendering state.",

		GLuint.IN("program", "the handle of the program object whose executables are to be used as part of current rendering state")
	)

	GLvoid.func(
		"ValidateProgram",
		"Validates a program object.",

		GLuint.IN("program", "the handle of the program object to be validated")
	)

	// Uniform functions javadoc

	val uniformLocation = "the location of the uniform variable to be modified"
	val uniformX = "the uniform x value"
	val uniformY = "the uniform y value"
	val uniformZ = "the uniform z value"
	val uniformW = "the uniform w value"

	GLvoid.func(
		"Uniform1f",
		"Specifies the value of a float uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLfloat.IN("v0", "the uniform value")
	)

	GLvoid.func(
		"Uniform2f",
		"Specifies the value of a vec2 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLfloat.IN("v0", uniformX),
		GLfloat.IN("v1", uniformY)
	)

	GLvoid.func(
		"Uniform3f",
		"Specifies the value of a vec3 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLfloat.IN("v0", uniformX),
		GLfloat.IN("v1", uniformY),
		GLfloat.IN("v2", uniformZ)
	)

	GLvoid.func(
		"Uniform4f",
		"Specifies the value of a vec4 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLfloat.IN("v0", uniformX),
		GLfloat.IN("v1", uniformY),
		GLfloat.IN("v2", uniformZ),
		GLfloat.IN("v3", uniformW)
	)

	GLvoid.func(
		"Uniform1i",
		"Specifies the value of an int uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLint.IN("v0", "the uniform value")
	)

	GLvoid.func(
		"Uniform2i",
		"Specifies the value of a ivec2 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLint.IN("v0", uniformX),
		GLint.IN("v1", uniformY)
	)

	GLvoid.func(
		"Uniform3i",
		"Specifies the value of a ivec3 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLint.IN("v0", uniformX),
		GLint.IN("v1", uniformY),
		GLint.IN("v2", uniformZ)
	)

	GLvoid.func(
		"Uniform4i",
		"Specifies the value of a ivec4 uniform variable for the current program object.",

		GLint.IN("location", uniformLocation),
		GLint.IN("v0", uniformX),
		GLint.IN("v1", uniformY),
		GLint.IN("v2", uniformZ),
		GLint.IN("v3", uniformW)
	)

	GLvoid.func(
		"Uniform1fv",
		"Specifies the value of a single float uniform variable or a float uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value") _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLfloat_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid.func(
		"Uniform2fv",
		"Specifies the value of a single vec2 uniform variable or a vec2 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value").expression(" >> 1") _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLfloat_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid.func(
		"Uniform3fv",
		"Specifies the value of a single vec3 uniform variable or a vec3 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value").expression(" / 3") _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLfloat_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid.func(
		"Uniform4fv",
		"Specifies the value of a single vec4 uniform variable or a vec4 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value").expression(" >> 2") _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLfloat_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid.func(
		"Uniform1iv",
		"Specifies the value of a single int uniform variable or a int uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value") _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLint_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid.func(
		"Uniform2iv",
		"Specifies the value of a single ivec2 uniform variable or a ivec2 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value").expression(" >> 1") _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLint_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid.func(
		"Uniform3iv",
		"Specifies the value of a single ivec3 uniform variable or a ivec3 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value").expression(" / 3") _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLint_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid.func(
		"Uniform4iv",
		"Specifies the value of a single ivec4 uniform variable or a ivec4 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value").expression(" >> 2") _ GLsizei.IN("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
		const _ GLint_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid.func(
		"UniformMatrix2fv",
		"Specifies the value of a single mat2 uniform variable or a mat2 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value").expression(" >> 2") _ GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
		GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
		const _ GLfloat_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid.func(
		"UniformMatrix3fv",
		"Specifies the value of a single mat3 uniform variable or a mat3 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value").expression(" / (3 * 3)") _ GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
		GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
		const _ GLfloat_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid.func(
		"UniformMatrix4fv",
		"Specifies the value of a single mat4 uniform variable or a mat4 uniform variable array for the current program object.",

		GLint.IN("location", uniformLocation),
		AutoSize("value").expression(" >> 4") _ GLsizei.IN("count", "the number of matrices that are to be modified. This should be 1 if the targeted uniform variable is not an array of matrices, and 1 or more if it is an array of matrices."),
		GLboolean.IN("transpose", "whether to transpose the matrix as the values are loaded into the uniform variable"),
		const _ GLfloat_p.IN("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
	)

	GLvoid.func(
		"GetShaderiv",
		"Returns a parameter from a shader object.",

		GLuint.IN("shader", "the shader object to be queried"),
		GLenum.IN("pname", "the object parameter", "#GL_SHADER_TYPE #GL_DELETE_STATUS #GL_COMPILE_STATUS #GL_INFO_LOG_LENGTH #GL_SHADER_SOURCE_LENGTH"),
		mods(Check(1), returnValue) _ GLint_p.OUT("params", "the requested object parameter")
	)

	GLvoid.func(
		"GetProgramiv",
		"Returns a parameter from a program object.",

		GLuint.IN("shader", "the program object to be queried"),
		GLenum.IN(
			"pname",
			"the object parameter",
		    """
		    #GL_DELETE_STATUS #GL_LINK_STATUS #GL_VALIDATE_STATUS #GL_INFO_LOG_LENGTH #GL_ATTACHED_SHADERS #GL_ACTIVE_ATTRIBUTES #GL_ACTIVE_ATTRIBUTE_MAX_LENGTH
		    #GL_ACTIVE_UNIFORMS #GL_ACTIVE_UNIFORM_MAX_LENGTH GL30#GL_TRANSFORM_FEEDBACK_BUFFER_MODE GL30#GL_TRANSFORM_FEEDBACK_VARYINGS
		    GL30#GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH GL31#GL_ACTIVE_UNIFORM_BLOCKS GL31#GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH
		    GL32#GL_GEOMETRY_VERTICES_OUT GL32#GL_GEOMETRY_INPUT_TYPE GL32#GL_GEOMETRY_OUTPUT_TYPE GL41#GL_PROGRAM_BINARY_LENGTH
		    GL42#GL_ACTIVE_ATOMIC_COUNTER_BUFFERS  GL43#GL_COMPUTE_WORK_GROUP_SIZE
		    """
		),
		mods(Check(1), returnValue) _ GLint_p.OUT("params", "the requested object parameter")
	)

	GLvoid.func(
		"GetShaderInfoLog",
		"Returns the information log for a shader object.",

		GLuint.IN("shader", "the shader object whose information log is to be queried"),
		AutoSize("infoLog") _ GLsizei.IN("maxLength", "the size of the character buffer for storing the returned information log"),
		mods(Check(1), nullable) _ GLsizei_p.OUT("length", "the length of the string returned in {@code infoLog} (excluding the null terminator)"),
		Return(
			"maxLength",
			"length",
			"glGetShaderi(shader, GL_INFO_LOG_LENGTH)"
		) _ GLcharUTF8_p.OUT("infoLog", "an array of characters that is used to return the information log")
	)

	GLvoid.func(
		"GetProgramInfoLog",
		"Returns the information log for a program object.",

		GLuint.IN("program", "the program object whose information log is to be queried"),
		AutoSize("infoLog") _ GLsizei.IN("maxLength", "the size of the character buffer for storing the returned information log"),
		mods(Check(1), nullable) _ GLsizei_p.OUT("length", "the length of the string returned in {@code infoLog} (excluding the null terminator)"),
		Return(
			"maxLength",
			"length",
			"glGetProgrami(program, GL_INFO_LOG_LENGTH)"
		) _ GLcharUTF8_p.OUT("infoLog", "an array of characters that is used to return the information log")
	)

	GLvoid.func(
		"GetAttachedShaders",
		"Returns the handles of the shader objects attached to a program object.",

		GLuint.IN("program", "the program object to be queried"),
		AutoSize("shaders") _ GLsizei.IN("maxCount", "the size of the array for storing the returned object names"),
		mods(Check(1), nullable) _ GLsizei_p.IN("count", "the number of names actually returned in {@code shaders}"),
		GLuint_p.OUT("shaders", "an array that is used to return the names of attached shader objects")
	)

	GLint.func(
		"GetUniformLocation",
		"Returns the location of a uniform variable.",

		GLuint.IN("program", "the program object to be queried"),
		const _ GLcharASCII_p.IN("name", "a null terminated string containing the name of the uniform variable whose location is to be queried")
	)

	GLvoid.func(
		"GetActiveUniform",
		"Returns information about an active uniform variable for the specified program object.",

		GLuint.IN("program", "the program object to be queried"),
		GLuint.IN("index", "the index of the uniform variable to be queried"),
		AutoSize("name") _ GLsizei.IN("maxLength", "the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}"),
		mods(Check(1), nullable) _ GLsizei_p.IN("length", "the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than NULL is passed"),
		Check(1) _ GLint_p.OUT("size", "the size of the uniform variable"),
		Check(1) _ GLenum_p.OUT("type", "the data type of the uniform variable"),
		Return(
			"maxLength",
			"length",
			"glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH)"
		) _ GLcharASCII_p.OUT("name", "a null terminated string containing the name of the uniform variable")
	)

	GLvoid.func(
		"GetUniformfv",
		"Returns the float value(s) of a uniform variable.",

		GLuint.IN("program", "the program object to be queried"),
		GLint.IN("location", "the location of the uniform variable to be queried"),
		mods(Check(1), returnValue) _ GLfloat_p.OUT("params", "the value of the specified uniform variable")
	)

	GLvoid.func(
		"GetUniformiv",
		"Returns the int value(s) of a uniform variable.",

		GLuint.IN("program", "the program object to be queried"),
		GLint.IN("location", "the location of the uniform variable to be queried"),
		mods(Check(1), returnValue) _ GLint_p.OUT("params", "the value of the specified uniform variable")
	)

	GLvoid.func(
		"GetShaderSource",
		"Returns the source code string from a shader object.",

		GLuint.IN("shader", "the shader object to be queried"),
		AutoSize("source") _ GLsizei.IN("maxLength", "the size of the character buffer for storing the returned source code string"),
		mods(Check(1), nullable) _ GLsizei_p.IN("length", "the length of the string returned in source (excluding the null terminator)"),
		Return("maxLength", "length", "glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH)") _ GLcharUTF8_p.OUT("source", "an array of characters that is used to return the source code string")
	)

	// ARB_vertex_shader

	IntConstant.block(
		"Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

		"VERTEX_SHADER" _ 0x8B31
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_VERTEX_UNIFORM_COMPONENTS" _ 0x8B4A,
		"MAX_VARYING_FLOATS" _ 0x8B4B,
		"MAX_VERTEX_ATTRIBS" _ 0x8869,
		"MAX_TEXTURE_IMAGE_UNITS" _ 0x8872,
		"MAX_VERTEX_TEXTURE_IMAGE_UNITS" _ 0x8B4C,
		"MAX_COMBINED_TEXTURE_IMAGE_UNITS" _ 0x8B4D,
		"MAX_TEXTURE_COORDS" _ 0x8871
	)

	IntConstant.block(
		"""
		Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"VERTEX_PROGRAM_POINT_SIZE" _ 0x8642,
		"VERTEX_PROGRAM_TWO_SIDE" _ 0x8643
	)

	val VERTEX_ATTRIBUTES = IntConstant.block(
		"Accepted by the {@code pname} parameter of GetVertexAttrib{dfi}v.",

		"VERTEX_ATTRIB_ARRAY_ENABLED" _ 0x8622,
		"VERTEX_ATTRIB_ARRAY_SIZE" _ 0x8623,
		"VERTEX_ATTRIB_ARRAY_STRIDE" _ 0x8624,
		"VERTEX_ATTRIB_ARRAY_TYPE" _ 0x8625,
		"VERTEX_ATTRIB_ARRAY_NORMALIZED" _ 0x886A,
		"CURRENT_VERTEX_ATTRIB" _ 0x8626
	).toJavaDocLinks()

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetVertexAttribPointerv.",

		"VERTEX_ATTRIB_ARRAY_POINTER" _ 0x8645
	)

	// Vertex attrib functions javadoc
	val vertexAttribIndex = "the index of the generic vertex attribute to be modified"
	val vertexAttribX = "the vertex attribute x component"
	val vertexAttribY = "the vertex attribute y component"
	val vertexAttribZ = "the vertex attribute z component"
	val vertexAttribW = "the vertex attribute w component"
	val vertexAttribBuffer = "the vertex attribute buffer"

	val VertexAttrib1f = GLvoid.func(
		"VertexAttrib1f",
		"Specifies the value of a generic vertex attribute. The y and z components are implicitly set to 0.0f and w to 1.0f.",

		GLuint.IN("index", vertexAttribIndex),
		GLfloat.IN("v0", vertexAttribX)
	).javaDocLink

	val VertexAttrib1s = GLvoid.func("VertexAttrib1s", "Short version of $VertexAttrib1f.", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX)).javaDocLink
	val VertexAttrib1d = GLvoid.func("VertexAttrib1d", "Double version of $VertexAttrib1f.", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX)).javaDocLink

	val VertexAttrib2f = GLvoid.func(
		"VertexAttrib2f",
		"Specifies the value of a generic vertex attribute. The y component is implicitly set to 0.0f and w to 1.0f.",

		GLuint.IN("index", vertexAttribIndex),
		GLfloat.IN("v0", vertexAttribX),
		GLfloat.IN("v1", vertexAttribY)
	).javaDocLink

	val VertexAttrib2s = GLvoid.func("VertexAttrib2s", "Short version of $VertexAttrib2f.", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX), GLshort.IN("v1", vertexAttribY)).javaDocLink
	val VertexAttrib2d = GLvoid.func("VertexAttrib2d", "Double version of $VertexAttrib2f.", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX), GLdouble.IN("v1", vertexAttribY)).javaDocLink

	val VertexAttrib3f = GLvoid.func(
		"VertexAttrib3f",
		"Specifies the value of a generic vertex attribute. The w is implicitly set to 1.0f.",

		GLuint.IN("index", vertexAttribIndex),
		GLfloat.IN("v0", vertexAttribX),
		GLfloat.IN("v1", vertexAttribY),
		GLfloat.IN("v2", vertexAttribZ)
	).javaDocLink

	val VertexAttrib3s = GLvoid.func("VertexAttrib3s", "Short version of $VertexAttrib3f.", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX), GLshort.IN("v1", vertexAttribY), GLshort.IN("v2", vertexAttribZ)).javaDocLink
	val VertexAttrib3d = GLvoid.func("VertexAttrib3d", "Double version of $VertexAttrib3f.", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX), GLdouble.IN("v1", vertexAttribY), GLdouble.IN("v2", vertexAttribZ)).javaDocLink

	val VertexAttrib4f = GLvoid.func(
		"VertexAttrib4f",
		"Specifies the value of a generic vertex attribute.",

		GLuint.IN("index", vertexAttribIndex),
		GLfloat.IN("v0", vertexAttribX),
		GLfloat.IN("v1", vertexAttribY),
		GLfloat.IN("v2", vertexAttribZ),
		GLfloat.IN("v3", vertexAttribW)
	).javaDocLink

	val VertexAttrib4s = GLvoid.func("VertexAttrib4s", "Short version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), GLshort.IN("v0", vertexAttribX), GLshort.IN("v1", vertexAttribY), GLshort.IN("v2", vertexAttribZ), GLshort.IN("v3", vertexAttribW)).javaDocLink
	val VertexAttrib4d = GLvoid.func("VertexAttrib4d", "Double version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), GLdouble.IN("v0", vertexAttribX), GLdouble.IN("v1", vertexAttribY), GLdouble.IN("v2", vertexAttribZ), GLdouble.IN("v3", vertexAttribW)).javaDocLink
	val VertexAttrib4Nub = GLvoid.func("VertexAttrib4Nub", "Normalized unsigned byte version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), GLubyte.IN("x", vertexAttribX), GLubyte.IN("y", vertexAttribY), GLubyte.IN("z", vertexAttribZ), GLubyte.IN("w", vertexAttribW)).javaDocLink

	GLvoid.func("VertexAttrib1fv", "Pointer version of $VertexAttrib1f.", GLuint.IN("index", vertexAttribIndex), mods(Check(1), const) _ GLfloat_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib1sv", "Pointer version of $VertexAttrib1s.", GLuint.IN("index", vertexAttribIndex), mods(Check(1), const) _ GLshort_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib1dv", "Pointer version of $VertexAttrib1d.", GLuint.IN("index", vertexAttribIndex), mods(Check(1), const) _ GLdouble_p.IN("v", vertexAttribBuffer))

	GLvoid.func("VertexAttrib2fv", "Pointer version of $VertexAttrib2f.", GLuint.IN("index", vertexAttribIndex), mods(Check(2), const) _ GLfloat_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib2sv", "Pointer version of $VertexAttrib2s.", GLuint.IN("index", vertexAttribIndex), mods(Check(2), const) _ GLshort_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib2dv", "Pointer version of $VertexAttrib2d.", GLuint.IN("index", vertexAttribIndex), mods(Check(2), const) _ GLdouble_p.IN("v", vertexAttribBuffer))

	GLvoid.func("VertexAttrib3fv", "Pointer version of $VertexAttrib3f.", GLuint.IN("index", vertexAttribIndex), mods(Check(3), const) _ GLfloat_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib3sv", "Pointer version of $VertexAttrib3s.", GLuint.IN("index", vertexAttribIndex), mods(Check(3), const) _ GLshort_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib3dv", "Pointer version of $VertexAttrib3d.", GLuint.IN("index", vertexAttribIndex), mods(Check(3), const) _ GLdouble_p.IN("v", vertexAttribBuffer))

	GLvoid.func("VertexAttrib4fv", "Pointer version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLfloat_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4sv", "Pointer version of $VertexAttrib4s.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLshort_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4dv", "Pointer version of $VertexAttrib4d.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLdouble_p.IN("v", vertexAttribBuffer))

	GLvoid.func("VertexAttrib4iv", "Integer pointer version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLint_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4bv", "Byte pointer version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLbyte_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4ubv", "Pointer version of $VertexAttrib4Nub.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLubyte_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4usv", "Unsigned short pointer version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLushort_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4uiv", "Unsigned int pointer version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLuint_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4Nbv", "Normalized byte pointer version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLbyte_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4Nsv", "Normalized short pointer version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLshort_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4Niv", "Normalized int pointer version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLint_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4Nubv", "Normalized unsigned byte pointer version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLubyte_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4Nusv", "Normalized unsigned short pointer version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLushort_p.IN("v", vertexAttribBuffer))
	GLvoid.func("VertexAttrib4Nuiv", "Normalized unsigned int pointer version of $VertexAttrib4f.", GLuint.IN("index", vertexAttribIndex), mods(Check(4), const) _ GLuint_p.IN("v", vertexAttribBuffer))

	GLvoid.func(
		"VertexAttribPointer",
		"Specifies the location and organization of a vertex attribute array.",

		GLuint.IN("index", vertexAttribIndex),
		GLint.IN("size", "the number of values per vertex that are stored in the array. The initial value is 4", "1 2 3 4 GL12#GL_BGRA"),
		AutoType("pointer", GL_SHORT, GL_INT, GL_FLOAT, GL_DOUBLE) _ GLenum.IN(
			"type",
			"the data type of each component in the array. The initial value is GL_FLOAT",
			"""
			GL11#GL_BYTE GL11#GL_UNSIGNED_BYTE GL11#GL_SHORT GL11#GL_UNSIGNED_SHORT GL11#GL_INT GL11#GL_UNSIGNED_INT GL30#GL_HALF_FLOAT GL11#GL_FLOAT
			GL11#GL_DOUBLE GL12#GL_UNSIGNED_INT_2_10_10_10_REV GL33#GL_INT_2_10_10_10_REV GL41#GL_FIXED
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
		mods(const, ARRAY_BUFFER) _ GLvoid_p.IN(
			"pointer",
			"""
			the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
			currently bound to the GL15#GL_ARRAY_BUFFER target. The initial value is 0.
			"""
		)
	)

	GLvoid.func(
		"EnableVertexAttribArray",
		"Enables a generic vertex attribute array.",

		GLuint.IN("index", "the index of the generic vertex attribute to be enabled")
	)

	ReferenceGL("glEnableVertexAttribArray") _ GLvoid.func(
		"DisableVertexAttribArray",
		"Disables a generic vertex attribute array.",

		GLuint.IN("index", "the index of the generic vertex attribute to be disabled")
	)

	GLvoid.func(
		"BindAttribLocation",
		"Associates a generic vertex attribute index with a named attribute variable.",

		GLuint.IN("program", "the handle of the program object in which the association is to be made"),
		GLuint.IN("index", "the index of the generic vertex attribute to be bound"),
		const _ GLcharASCII_p.IN("name", "a null terminated string containing the name of the vertex shader attribute variable to which {@code index} is to be bound")
	)

	GLvoid.func(
		"GetActiveAttrib",
		"Returns information about an active attribute variable for the specified program object.",

		GLuint.IN("program", "the program object to be queried"),
		GLuint.IN("index", "the index of the attribute variable to be queried"),
		AutoSize("name") _ GLsizei.IN("maxLength", "the maximum number of characters OpenGL is allowed to write in the character buffer indicated by {@code name}"),
		GLsizei_p.OUT(
			"length",
			"the number of characters actually written by OpenGL in the string indicated by {@code name} (excluding the null terminator) if a value other than NULL is passed"
		),
		GLint_p.OUT("size", "the size of the attribute variable"),
		GLenum_p.OUT("type", "the data type of the attribute variable"),
		Return(
			"maxLength",
			"length",
			"glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH)"
		) _ GLcharASCII_p.OUT("name", "a null terminated string containing the name of the attribute variable")
	)

	GLint.func(
		"GetAttribLocation",
		"Returns the location of an attribute variable.",

		GLuint.IN("program", "the program object to be queried"),
		const _ GLcharASCII_p.IN("name", "a null terminated string containing the name of the attribute variable whose location is to be queried")
	)

	val GetVertexAttribiv = GLvoid.func(
		"GetVertexAttribiv",
		"Returns the integer value of a generic vertex attribute parameter.",

		GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
		GLenum.IN(
			"pname",
			"the symbolic name of the vertex attribute parameter to be queried",
			"GL15#GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING $VERTEX_ATTRIBUTES GL30#GL_VERTEX_ATTRIB_ARRAY_INTEGER GL33#GL_VERTEX_ATTRIB_ARRAY_DIVISOR"
		),
		mods(Check(1), returnValue) _ GLint_p.OUT("params", "returns the requested data")
	).javaDocLink

	GLvoid.func(
		"GetVertexAttribfv",
		"Float version of $GetVertexAttribiv.",

		GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
		GLenum.IN("pname", "the symbolic name of the vertex attribute parameter to be queried"),
		Check(4) _ GLfloat_p.OUT("params", "returns the requested data")
	)

	GLvoid.func(
		"GetVertexAttribdv",
		"Double version of $GetVertexAttribiv.",

		GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
		GLenum.IN("pname", "the symbolic name of the vertex attribute parameter to be queried"),
		Check(4) _ GLdouble_p.OUT("params", "returns the requested data")
	)


	GLvoid.func(
		"GetVertexAttribPointerv",
		"Returns the address of the specified generic vertex attribute pointer.",

		GLuint.IN("index", "the generic vertex attribute parameter to be queried"),
		GLenum.IN("pname", "the symbolic name of the generic vertex attribute parameter to be returned", "#GL_VERTEX_ATTRIB_ARRAY_POINTER"),
		mods(Check(1), returnValue) _ GLvoid_pp.OUT("pointer", "the pointer value")
	)
	
	// ARB_fragment_shader

	IntConstant.block(
		"Accepted by the {@code type} argument of CreateShader and returned by the {@code params} parameter of GetShaderiv.",

		"FRAGMENT_SHADER" _ 0x8B30
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_FRAGMENT_UNIFORM_COMPONENTS" _ 0x8B49
	)

	IntConstant.block(
		"Accepted by the {@code target} parameter of Hint and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"FRAGMENT_SHADER_DERIVATIVE_HINT" _ 0x8B8B
	)
	
	// ARB_draw_buffers

	IntConstant.block(
		"Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.",

		"MAX_DRAW_BUFFERS" _ 0x8824,
		"DRAW_BUFFER0" _ 0x8825,
		"DRAW_BUFFER1" _ 0x8826,
		"DRAW_BUFFER2" _ 0x8827,
		"DRAW_BUFFER3" _ 0x8828,
		"DRAW_BUFFER4" _ 0x8829,
		"DRAW_BUFFER5" _ 0x882A,
		"DRAW_BUFFER6" _ 0x882B,
		"DRAW_BUFFER7" _ 0x882C,
		"DRAW_BUFFER8" _ 0x882D,
		"DRAW_BUFFER9" _ 0x882E,
		"DRAW_BUFFER10" _ 0x882F,
		"DRAW_BUFFER11" _ 0x8830,
		"DRAW_BUFFER12" _ 0x8831,
		"DRAW_BUFFER13" _ 0x8832,
		"DRAW_BUFFER14" _ 0x8833,
		"DRAW_BUFFER15" _ 0x8834
	)

	GLvoid.func(
		"DrawBuffers",
		"Specifies a list of color buffers to be drawn into.",

		AutoSize("bufs") _ GLsizei.IN("n", "the number of buffers in {@code bufs}"),
		mods(const, SingleValue("buf")) _ GLenum_p.IN(
			"bufs",
			"an array of symbolic constants specifying the buffers into which fragment colors or data values will be written",
		    """
		    GL11#GL_NONE GL11#GL_FRONT_LEFT GL11#GL_FRONT_RIGHT GL11#GL_BACK_LEFT GL11#GL_BACK_RIGHT GL11#GL_AUX0 GL11#GL_AUX1 GL11#GL_AUX2 GL11#GL_AUX3
		    GL30#GL_COLOR_ATTACHMENT0 GL30.GL_COLOR_ATTACHMENT[1-15]
		    """
		)
	)

	// ARB_point_sprite

	IntConstant.block(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev, and by the {@code target} parameter of TexEnvi, TexEnviv, TexEnvf, TexEnvfv, GetTexEnviv, and GetTexEnvfv.
		""",

		"POINT_SPRITE" _ 0x8861
	)

	IntConstant.block(
		"""
		When the {@code target} parameter of TexEnvf, TexEnvfv, TexEnvi, TexEnviv, GetTexEnvfv, or GetTexEnviv is POINT_SPRITE, then the value of
		{@code pname} may be.
		""",

		"COORD_REPLACE" _ 0x8862
	)

	IntConstant.block(
		"Accepted by the {@code pname} parameter of PointParameter{if}v.",

		"POINT_SPRITE_COORD_ORIGIN" _ 0x8CA0
	)

	IntConstant.block(
		"Accepted by the {@code param} parameter of PointParameter{if}v.",

		"LOWER_LEFT" _ 0x8CA1,
		"UPPER_LEFT" _ 0x8CA2
	)

	// EXT_blend_equation_separate

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"BLEND_EQUATION_RGB" _ 0x8009,
		"BLEND_EQUATION_ALPHA" _ 0x883D
	)

	GLvoid.func(
		"BlendEquationSeparate",
		"Sets the RGB blend equation and the alpha blend equation separately.",

		GLenum.IN(
			"modeRGB",
			"the RGB blend equation, how the red, green, and blue components of the source and destination colors are combined",
			"GL14#GL_FUNC_ADD GL14#GL_FUNC_SUBTRACT GL14#GL_FUNC_REVERSE_SUBTRACT GL14#GL_MIN GL14#GL_MAX"
		),
		GLenum.IN("modeAlpha", " the alpha blend equation, how the alpha component of the source and destination colors are combined")
	)
	
	// ATI_separate_stencil

	IntConstant.block(
		"Accepted by the {@code pname} parameter of GetIntegerv.",

		"STENCIL_BACK_FUNC_ATI" _ 0x8800,
		"STENCIL_BACK_FAIL_ATI" _ 0x8801,
		"STENCIL_BACK_PASS_DEPTH_FAIL_ATI" _ 0x8802,
		"STENCIL_BACK_PASS_DEPTH_PASS_ATI" _ 0x8803,
		"STENCIL_BACK_REF" _ 0x8CA3,
		"STENCIL_BACK_VALUE_MASK" _ 0x8CA4,
		"STENCIL_BACK_WRITEMASK" _ 0x8CA5
	)


	GLvoid.func(
		"StencilOpSeparate",
		"Sets front and/or back stencil test actions.",

		GLenum.IN("face", "whether front and/or back stencil state is updated", "GL11#GL_FRONT GL11#GL_BACK GL11#GL_FRONT_AND_BACK"),
		GLenum.IN(
			"sfail",
			"the action to take when the stencil test fails. The initial value is GL_KEEP",
			"GL11#GL_KEEP GL11#GL_ZERO GL11#GL_REPLACE GL11#GL_INCR GL14#GL_INCR_WRAP GL11#GL_DECR GL14#GL_DECR_WRAP GL11#GL_INVERT"
		),
		GLenum.IN("dpfail", "the stencil action when the stencil test passes, but the depth test fails. The initial value is GL_KEEP"),
		GLenum.IN(
			"dppass",
			"""
			the stencil action when both the stencil test and the depth test pass, or when the stencil test passes and either there is no depth buffer or depth
			testing is not enabled. The initial value is GL_KEEP
			"""
		)
	)

	GLvoid.func(
		"StencilFuncSeparate",
		"Sets front and/or back function and reference value for stencil testing.",

		GLenum.IN("face", "whether front and/or back stencil state is updated", "GL11#GL_FRONT GL11#GL_BACK GL11#GL_FRONT_AND_BACK"),
		GLenum.IN(
			"func",
			"the test function. The initial value is GL_ALWAYS",
			"GL11#GL_NEVER GL11#GL_LESS GL11#GL_LEQUAL GL11#GL_GREATER GL11#GL_GEQUAL GL11#GL_EQUAL GL11#GL_NOTEQUAL GL11#GL_ALWAYS"
		),
		GLint.IN(
			"ref",
			"""
			the reference value for the stencil test. {@code ref} is clamped to the range [0, 2n &ndash; 1], where {@code n} is the number of bitplanes in the stencil
			buffer. The initial value is 0.
			"""
		),
		GLuint.IN("mask", "a mask that is ANDed with both the reference value and the stored stencil value when the test is done. The initial value is all 1's.")
	)

	GLvoid.func(
		"StencilMaskSeparate",
		"Controls the front and/or back writing of individual bits in the stencil planes.",

		GLenum.IN("face", "whether front and/or back stencil writemask is updated", "GL11#GL_FRONT GL11#GL_BACK GL11#GL_FRONT_AND_BACK"),
		GLuint.IN("mask", "a bit mask to enable and disable writing of individual bits in the stencil planes. Initially, the mask is all 1's.")
	)
	
}