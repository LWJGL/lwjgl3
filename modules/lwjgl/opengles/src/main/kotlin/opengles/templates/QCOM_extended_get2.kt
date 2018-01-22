/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val QCOM_extended_get2 = "QCOMExtendedGet2".nativeClassGLES("QCOM_extended_get2", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables instrumenting the driver for debugging of OpenGL ES applications.
        """

    void(
        "ExtGetShadersQCOM",
        "",

        nullable..GLuint_p.OUT("shaders", ""),
        AutoSize("shaders")..GLint.IN("maxShaders", ""),
        nullable..Check(1)..GLint_p.OUT("numShaders", "")
    )

    void(
        "ExtGetProgramsQCOM",
        "",

        nullable..GLuint_p.OUT("programs", ""),
        AutoSize("programs")..GLint.IN("maxPrograms", ""),
        nullable..Check(1)..GLint_p.OUT("numPrograms", "")
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
        Unsafe..GLcharUTF8_p.OUT("source", ""),
        nullable..Check(1)..GLint_p.OUT("length", "")
    )
}