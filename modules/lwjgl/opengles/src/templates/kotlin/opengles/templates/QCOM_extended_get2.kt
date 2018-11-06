/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_extended_get2 = "QCOMExtendedGet2".nativeClassGLES("QCOM_extended_get2", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables instrumenting the driver for debugging of OpenGL ES applications.
        """

    void(
        "ExtGetShadersQCOM",
        "",

        nullable..GLuint.p("shaders", ""),
        AutoSize("shaders")..GLint("maxShaders", ""),
        nullable..Check(1)..GLint.p("numShaders", "")
    )

    void(
        "ExtGetProgramsQCOM",
        "",

        nullable..GLuint.p("programs", ""),
        AutoSize("programs")..GLint("maxPrograms", ""),
        nullable..Check(1)..GLint.p("numPrograms", "")
    )

    GLboolean(
        "ExtIsProgramBinaryQCOM",
        "",

        GLuint("program", "")
    )

    void(
        "ExtGetProgramBinarySourceQCOM",
        "",

        GLuint("program", ""),
        GLenum("shadertype", ""),
        Unsafe..GLcharUTF8.p("source", ""),
        nullable..Check(1)..GLint.p("length", "")
    )
}