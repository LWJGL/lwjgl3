/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_shading_language_include = "ARBShadingLanguageInclude".nativeClassGL("ARB_shading_language_include", postfix = ARB) {
    val include = "{@code &#35;include}"

    IntConstant(
        "SHADER_INCLUDE_ARB"..0x8DAE
    )

    IntConstant(
        "NAMED_STRING_LENGTH_ARB"..0x8DE9,
        "NAMED_STRING_TYPE_ARB"..0x8DEA
    )

    void(
        "NamedStringARB",

        GLenum("type"),
        AutoSize("name")..GLint("namelen"),
        GLcharASCII.const.p("name"),
        AutoSize("string")..GLint("stringlen"),
        GLcharUTF8.const.p("string")
    )

    void(
        "DeleteNamedStringARB",

        AutoSize("name")..GLint("namelen"),
        GLcharASCII.const.p("name")
    )

    void(
        "CompileShaderIncludeARB",

        GLuint("shader"),
        AutoSize("path", "length")..GLsizei("count"),
        GLcharASCII.const.p.const.p("path"),
        nullable..GLint.const.p("length")
    )

    GLboolean(
        "IsNamedStringARB",

        AutoSize("name")..GLint("namelen"),
        GLcharASCII.const.p("name")
    )

    void(
        "GetNamedStringARB",

        AutoSize("name")..GLint("namelen"),
        GLcharASCII.const.p("name"),
        AutoSize("string")..GLsizei("bufSize"),
        nullable..Check(1)..GLint.p("stringlen"),
        Return(
            "stringlen",
            "glGetNamedStringiARB(name, GL_NAMED_STRING_LENGTH_ARB)"
        )..GLcharUTF8.p("string")
    )

    void(
        "GetNamedStringivARB",

        AutoSize("name")..GLint("namelen"),
        GLcharASCII.const.p("name"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )
}