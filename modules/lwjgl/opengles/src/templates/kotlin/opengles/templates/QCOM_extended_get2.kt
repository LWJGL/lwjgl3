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

        nullable..GLuint.p.OUT("shaders", ""),
        AutoSize("shaders")..GLint.IN("maxShaders", ""),
        nullable..Check(1)..GLint.p.OUT("numShaders", "")
    )

    void(
        "ExtGetProgramsQCOM",
        "",

        nullable..GLuint.p.OUT("programs", ""),
        AutoSize("programs")..GLint.IN("maxPrograms", ""),
        nullable..Check(1)..GLint.p.OUT("numPrograms", "")
    )

    GLboolean(
        "ExtIsProgramBinaryQCOM",
        "",

        GLuint.IN("program", "")
    )

    void(
        "ExtGetProgramBinarySourceQCOM",
        "",

        GLuint.IN("program", ""),
        GLenum.IN("shadertype", ""),
        Unsafe..GLcharUTF8.p.OUT("source", ""),
        nullable..Check(1)..GLint.p.OUT("length", "")
    )
}