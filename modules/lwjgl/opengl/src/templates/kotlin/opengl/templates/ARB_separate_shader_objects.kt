/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

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
        ${EXT_direct_state_access.link}.

        While #ActiveShaderProgram() provides a selector for setting and querying uniform values of a program object, the glProgramUniform* commands provide a
        selector-free way to modify uniforms of a GLSL program object without an explicit bind. This selector-free model reduces API overhead and provides a
        cleaner interface for applications.

        Separate linking creates the possibility that certain output varyings of a shader may go unread by the subsequent shader inputting varyings. In this
        case, the output varyings are simply ignored. It is also possible input varyings from a shader may not be written as output varyings of a preceding
        shader. In this case, the unwritten input varying values are undefined.

        This extension builds on the proof-of-concept provided by ${EXT_separate_shader_objects.link} which demonstrated that separate shader objects can work
        for GLSL. {@code EXT_separate_shader_objects} was a response to repeated requests for this functionality from 3D developers.

        This ARB version addresses several "loose ends" in the prior EXT extension. In particular, it allows user-defined varyings with explicitly defined
        locations or implicitly assigned locations.

        This ARB extension extends the GLSL language's use of layout qualifiers to provide cross-stage interfacing.

        Requires ${GL20.core} or ${ARB_shader_objects.link}. ${GL41.promoted}
        """

    IntConstant(
        "Accepted by {@code stages} parameter to UseProgramStages.",

        "VERTEX_SHADER_BIT"..0x00000001,
        "FRAGMENT_SHADER_BIT"..0x00000002,
        "GEOMETRY_SHADER_BIT"..0x00000004,
        "TESS_CONTROL_SHADER_BIT"..0x00000008,
        "TESS_EVALUATION_SHADER_BIT"..0x00000010,
        "ALL_SHADER_BITS"..0xFFFFFFFF.i
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of ProgramParameteri and GetProgramiv.",

        "PROGRAM_SEPARABLE"..0x8258
    )

    IntConstant(
        "Accepted by {@code type} parameter to GetProgramPipelineiv.",

        "ACTIVE_PROGRAM"..0x8259
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "PROGRAM_PIPELINE_BINDING"..0x825A
    )

    reuse(GL41C, "UseProgramStages")
    reuse(GL41C, "ActiveShaderProgram")
    reuse(GL41C, "CreateShaderProgramv")
    reuse(GL41C, "BindProgramPipeline")
    reuse(GL41C, "DeleteProgramPipelines")
    reuse(GL41C, "GenProgramPipelines")
    reuse(GL41C, "IsProgramPipeline")
    reuse(GL41C, "ProgramParameteri")
    reuse(GL41C, "GetProgramPipelineiv")
    reuse(GL41C, "ProgramUniform1i")
    reuse(GL41C, "ProgramUniform2i")
    reuse(GL41C, "ProgramUniform3i")
    reuse(GL41C, "ProgramUniform4i")
    reuse(GL41C, "ProgramUniform1ui")
    reuse(GL41C, "ProgramUniform2ui")
    reuse(GL41C, "ProgramUniform3ui")
    reuse(GL41C, "ProgramUniform4ui")
    reuse(GL41C, "ProgramUniform1f")
    reuse(GL41C, "ProgramUniform2f")
    reuse(GL41C, "ProgramUniform3f")
    reuse(GL41C, "ProgramUniform4f")
    reuse(GL41C, "ProgramUniform1d")
    reuse(GL41C, "ProgramUniform2d")
    reuse(GL41C, "ProgramUniform3d")
    reuse(GL41C, "ProgramUniform4d")
    reuse(GL41C, "ProgramUniform1iv")
    reuse(GL41C, "ProgramUniform2iv")
    reuse(GL41C, "ProgramUniform3iv")
    reuse(GL41C, "ProgramUniform4iv")
    reuse(GL41C, "ProgramUniform1uiv")
    reuse(GL41C, "ProgramUniform2uiv")
    reuse(GL41C, "ProgramUniform3uiv")
    reuse(GL41C, "ProgramUniform4uiv")
    reuse(GL41C, "ProgramUniform1fv")
    reuse(GL41C, "ProgramUniform2fv")
    reuse(GL41C, "ProgramUniform3fv")
    reuse(GL41C, "ProgramUniform4fv")
    reuse(GL41C, "ProgramUniform1dv")
    reuse(GL41C, "ProgramUniform2dv")
    reuse(GL41C, "ProgramUniform3dv")
    reuse(GL41C, "ProgramUniform4dv")
    reuse(GL41C, "ProgramUniformMatrix2fv")
    reuse(GL41C, "ProgramUniformMatrix3fv")
    reuse(GL41C, "ProgramUniformMatrix4fv")
    reuse(GL41C, "ProgramUniformMatrix2dv")
    reuse(GL41C, "ProgramUniformMatrix3dv")
    reuse(GL41C, "ProgramUniformMatrix4dv")
    reuse(GL41C, "ProgramUniformMatrix2x3fv")
    reuse(GL41C, "ProgramUniformMatrix3x2fv")
    reuse(GL41C, "ProgramUniformMatrix2x4fv")
    reuse(GL41C, "ProgramUniformMatrix4x2fv")
    reuse(GL41C, "ProgramUniformMatrix3x4fv")
    reuse(GL41C, "ProgramUniformMatrix4x3fv")
    reuse(GL41C, "ProgramUniformMatrix2x3dv")
    reuse(GL41C, "ProgramUniformMatrix3x2dv")
    reuse(GL41C, "ProgramUniformMatrix2x4dv")
    reuse(GL41C, "ProgramUniformMatrix4x2dv")
    reuse(GL41C, "ProgramUniformMatrix3x4dv")
    reuse(GL41C, "ProgramUniformMatrix4x3dv")
    reuse(GL41C, "ValidateProgramPipeline")
    reuse(GL41C, "GetProgramPipelineInfoLog")
}