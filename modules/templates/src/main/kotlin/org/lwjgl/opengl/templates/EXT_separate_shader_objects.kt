/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_separate_shader_objects = "EXTSeparateShaderObjects".nativeClassGL("EXT_separate_shader_objects", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        rior to this extension, GLSL requires multiple shader domains (vertex, fragment, geometry) to be linked into a single monolithic program object to
        specify a GLSL shader for each domain.

        While GLSL's monolithic approach has some advantages for optimizing shaders as a unit that span multiple domains, all existing GPU hardware supports
        the more flexible mix-and-match approach.

        HLSL9, Cg, the prior OpenGL assembly program extensions, and game console programmers favor a more flexible "mix-and-match" approach to specifying
        shaders independently for these different shader domains. Many developers build their shader content around the mix-and-match approach where they can
        use a single vertex shader with multiple fragment shaders (or vice versa).

        This keep-it-simple extension adapts the "mix-and-match" shader domain model for GLSL so different GLSL program objects can be bound to different
        shader domains.

        This extension redefines the operation of glUseProgram(GLenum program) to be equivalent to:
        ${codeBlock("""
 glUseShaderProgramEXT(GL_VERTEX_SHADER, program);
glUseShaderProgramEXT(GL_GEOMETRY_SHADER_EXT, program);
glUseShaderProgramEXT(GL_FRAGMENT_SHADER, program);
glActiveProgramEXT(program);""")}
        You can also call these commands separately to bind each respective domain. The GL_VERTEX_SHADER, GL_GEOMETRY_SHADER_EXT, and GL_FRAGMENT_SHADER tokens
        refer to the conventional vertex, geometry, and fragment domains respectively. glActiveProgramEXT specifies the program that glUniform* commands will
        update.

        Separate linking creates the possibility that certain output varyings of a shader may go unread by the subsequent shader inputting varyings. In this
        case, the output varyings are simply ignored. It is also possible input varyings from a shader may not be written as output varyings of a preceding
        shader. In this case, the unwritten input varying values are undefined. Implementations are encouraged to zero these undefined input varying values.

        This extension is a proof-of-concept that separate shader objects can work for GLSL and a response to repeated requests for this functionality. There
        are various loose ends, particularly when dealing with user-defined varyings. The hope is a future extension will improve this situation.

        Requires ${GL20.core} or ${ARB_shader_objects.link}.
        """

    IntConstant(
        "Accepted by {@code type} parameter to GetIntegerv and GetFloatv.",

        "ACTIVE_PROGRAM_EXT"..0x8B8D
    )

    void(
        "UseShaderProgramEXT",
        "",

        GLenum.IN("type", ""),
        GLuint.IN("program", "")
    )

    void(
        "ActiveProgramEXT",
        "",

        GLuint.IN("program", "")
    )

    GLuint(
        "CreateShaderProgramEXT",
        "",

        GLenum.IN("type", ""),
        const..GLcharUTF8_p.IN("string", "")
    )
}