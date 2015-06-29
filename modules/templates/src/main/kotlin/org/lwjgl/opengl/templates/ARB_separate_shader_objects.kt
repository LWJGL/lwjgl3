/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_separate_shader_objects = "ARBSeparateShaderObjects".nativeClassGL("ARB_separate_shader_objects") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Conventional GLSL requires multiple shader stages (vertex, fragment, geometry, tessellation control, and tessellation evaluation) to be linked into a
		single monolithic program object to specify a GLSL shader for each stage.

		While GLSL's monolithic approach has some advantages for optimizing shaders as a unit that span multiple stages, all existing GPU hardware supports the
		more flexible mix-and-match approach.

		Shaders written for HLSL9, Cg, the prior OpenGL assembly program extensions, and game console favor a more flexible "mix-and-match" approach to
		specifying shaders independently for these different shader stages. Many developers build their shader content around the mix-and-match approach where
		they can use a single vertex shader with multiple fragment shaders (or vice versa).

		This extension adopts a "mix-and-match" shader stage model for GLSL allowing multiple different GLSL program objects to be bound at once each to an
		individual rendering pipeline stage independently of other stage bindings. This allows program objects to contain only the shader stages that best suit
		the applications needs.

		This extension introduces the program pipeline object that serves as a container for the program bound to any particular rendering stage. It can be
		bound, unbound, and rebound to simply save and restore the complete shader stage to program object bindings. Like framebuffer and vertex array objects,
		program pipeline objects are "container" objects that are not shared between contexts.

		To bind a program object to a specific shader stage or set of stages, #UseProgramStages() is used. The #VERTEX_SHADER_BIT, #GEOMETRY_SHADER_BIT,
		#FRAGMENT_SHADER_BIT, #TESS_CONTROL_SHADER_BIT, and #TESS_EVALUATION_SHADER_BIT tokens refer to the conventional vertex, geometry, fragment,
		tessellation control and tessellation evaluation stages respectively. #ActiveShaderProgram() specifies the program that Uniform* commands will update.

		While #ActiveShaderProgram() allows the use of conventional Uniform* commands to update uniform variable values for separable program objects, this
		extension provides a preferrable interface in a set of ProgramUniform* commands that update the same uniform variables but take a parameter indicating
		the program object to be updated, rather than updating the currently active program object. These commands mirror those introduced in
		${registryLinkTo("EXT", "direct_state_access")}.

		While #ActiveShaderProgram() provides a selector for setting and querying uniform values of a program object, the glProgramUniform* commands provide a
		selector-free way to modify uniforms of a GLSL program object without an explicit bind. This selector-free model reduces API overhead and provides a
		cleaner interface for applications.

		Separate linking creates the possibility that certain output varyings of a shader may go unread by the subsequent shader inputting varyings. In this
		case, the output varyings are simply ignored. It is also possible input varyings from a shader may not be written as output varyings of a preceding
		shader. In this case, the unwritten input varying values are undefined.

		This extension builds on the proof-of-concept provided by ${registryLinkTo("EXT", "separate_shader_objects")} which demonstrated that separate shader
		objects can work for GLSL. EXT_separate_shader_objects was a response to repeated requests for this functionality from 3D developers.

		This ARB version addresses several "loose ends" in the prior EXT extension. In particular, it allows user-defined varyings with explicitly defined
		locations or implicitly assigned locations.

		This ARB extension extends the GLSL language's use of layout qualifiers to provide cross-stage interfacing.

		Requires ${GL20.core} or ${ARB_shader_objects.link}. ${GL41.promoted}
		"""

	IntConstant(
		"Accepted by {@code stages} parameter to UseProgramStages.",

		"VERTEX_SHADER_BIT" _ 0x00000001,
		"FRAGMENT_SHADER_BIT" _ 0x00000002,
		"GEOMETRY_SHADER_BIT" _ 0x00000004,
		"TESS_CONTROL_SHADER_BIT" _ 0x00000008,
		"TESS_EVALUATION_SHADER_BIT" _ 0x00000010,
		"ALL_SHADER_BITS" _ 0xFFFFFFFF.i
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.",

		"PROGRAM_SEPARABLE" _ 0x8258
	)

	IntConstant(
		"Accepted by {@code type} parameter to GetProgramPipelineiv.",

		"ACTIVE_PROGRAM" _ 0x8259
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

		"PROGRAM_PIPELINE_BINDING" _ 0x825A
	)
	
	GL41 reuse "UseProgramStages"
	GL41 reuse "ActiveShaderProgram"
	GL41 reuse "CreateShaderProgramv"
	GL41 reuse "BindProgramPipeline"
	GL41 reuse "DeleteProgramPipelines"
	GL41 reuse "GenProgramPipelines"
	GL41 reuse "IsProgramPipeline"
	GL41 reuse "ProgramParameteri"
	GL41 reuse "GetProgramPipelineiv"
	GL41 reuse "ProgramUniform1i"
	GL41 reuse "ProgramUniform2i"
	GL41 reuse "ProgramUniform3i"
	GL41 reuse "ProgramUniform4i"
	GL41 reuse "ProgramUniform1ui"
	GL41 reuse "ProgramUniform2ui"
	GL41 reuse "ProgramUniform3ui"
	GL41 reuse "ProgramUniform4ui"
	GL41 reuse "ProgramUniform1f"
	GL41 reuse "ProgramUniform2f"
	GL41 reuse "ProgramUniform3f"
	GL41 reuse "ProgramUniform4f"
	GL41 reuse "ProgramUniform1d"
	GL41 reuse "ProgramUniform2d"
	GL41 reuse "ProgramUniform3d"
	GL41 reuse "ProgramUniform4d"
	GL41 reuse "ProgramUniform1iv"
	GL41 reuse "ProgramUniform2iv"
	GL41 reuse "ProgramUniform3iv"
	GL41 reuse "ProgramUniform4iv"
	GL41 reuse "ProgramUniform1uiv"
	GL41 reuse "ProgramUniform2uiv"
	GL41 reuse "ProgramUniform3uiv"
	GL41 reuse "ProgramUniform4uiv"
	GL41 reuse "ProgramUniform1fv"
	GL41 reuse "ProgramUniform2fv"
	GL41 reuse "ProgramUniform3fv"
	GL41 reuse "ProgramUniform4fv"
	GL41 reuse "ProgramUniform1dv"
	GL41 reuse "ProgramUniform2dv"
	GL41 reuse "ProgramUniform3dv"
	GL41 reuse "ProgramUniform4dv"
	GL41 reuse "ProgramUniformMatrix2fv"
	GL41 reuse "ProgramUniformMatrix3fv"
	GL41 reuse "ProgramUniformMatrix4fv"
	GL41 reuse "ProgramUniformMatrix2dv"
	GL41 reuse "ProgramUniformMatrix3dv"
	GL41 reuse "ProgramUniformMatrix4dv"
	GL41 reuse "ProgramUniformMatrix2x3fv"
	GL41 reuse "ProgramUniformMatrix3x2fv"
	GL41 reuse "ProgramUniformMatrix2x4fv"
	GL41 reuse "ProgramUniformMatrix4x2fv"
	GL41 reuse "ProgramUniformMatrix3x4fv"
	GL41 reuse "ProgramUniformMatrix4x3fv"
	GL41 reuse "ProgramUniformMatrix2x3dv"
	GL41 reuse "ProgramUniformMatrix3x2dv"
	GL41 reuse "ProgramUniformMatrix2x4dv"
	GL41 reuse "ProgramUniformMatrix4x2dv"
	GL41 reuse "ProgramUniformMatrix3x4dv"
	GL41 reuse "ProgramUniformMatrix4x3dv"
	GL41 reuse "ValidateProgramPipeline"
	GL41 reuse "GetProgramPipelineInfoLog"
}