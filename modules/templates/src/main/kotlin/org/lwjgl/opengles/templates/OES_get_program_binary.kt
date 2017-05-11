/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val OES_get_program_binary = "OESGetProgramBinary".nativeClassGLES("OES_get_program_binary", postfix = OES) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces two new commands. GetProgramBinaryOES empowers an application to use the GL itself as an offline compiler. The resulting
        program binary can be reloaded into the GL via ProgramBinaryOES. This is a very useful path for applications that wish to remain portable by shipping
        pure GLSL source shaders, yet would like to avoid the cost of compiling their shaders at runtime. Instead an application can supply its GLSL source
        shaders during first application run, or even during installation. The application then compiles and links its shaders and reads back the program
        binaries. On subsequent runs, only the program binaries need be supplied! Though the level of optimization may not be identical -- the offline shader
        compiler may have the luxury of more aggressive optimization at its disposal -- program binaries generated online by the GL are interchangeable with
        those generated offline by an SDK tool.

        Note that an implementation supporting this extension need not include an online compiler. That is, it is not required to support loading GLSL shader
        sources via the ShaderSource command. A query of boolean value SHADER_COMPILER can be used to determine if an implementation supports a shader
        compiler. If not, the GetProgramBinaryOES command is rendered virtually useless, but the ProgramBinaryOES command may still be used by vendor
        extensions as a standard method for loading offline-compiled program binaries.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "ccepted by the {@code pname} parameter of GetProgramiv.",

        "PROGRAM_BINARY_LENGTH_OES"..0x8741
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "NUM_PROGRAM_BINARY_FORMATS_OES"..0x87FE,
        "PROGRAM_BINARY_FORMATS_OES"..0x87FF
    )

    void(
        "GetProgramBinaryOES",
        "",

        GLuint.IN("program", ""),
        AutoSize("binary")..GLsizei.IN("bufSize", ""),
        nullable..Check(1)..GLsizei_p.OUT("length", ""),
        Check(1)..GLenum_p.OUT("binaryFormat", ""),
        void_p.OUT("binary", "")
    )

    void(
        "ProgramBinaryOES",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("binaryFormat", ""),
        const..void_p.IN("binary", ""),
        AutoSize("binary")..GLint.IN("length", "")
    )
}