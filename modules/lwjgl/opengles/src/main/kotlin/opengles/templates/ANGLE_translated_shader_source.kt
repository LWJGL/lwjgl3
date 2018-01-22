/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val ANGLE_translated_shader_source = "ANGLETranslatedShaderSource".nativeClassGLES("ANGLE_translated_shader_source", postfix = ANGLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        WebGL uses the GLSL ES 2.0 spec on all platforms, and translates these shaders to the host platform's native language (HLSL, GLSL, and even GLSL ES).
        For debugging purposes, it is useful to be able to examine the shader after translation.

        This extension addes a new function to query the translated shader source, and adds a new enum for GetShaderiv's &lt;pname&gt; parameter to query the
        translated shader source length.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetShaderiv.",

        "TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE"..0x93A0
    )

    void(
        "GetTranslatedShaderSourceANGLE",
        "",

        GLuint.IN("shader", ""),
        AutoSize("source")..GLsizei.IN("bufsize", ""),
        nullable..Check(1)..GLsizei_p.OUT("length", ""),
        Return("length", "GLES20.glGetShaderi(shader, GL_TRANSLATED_SHADER_SOURCE_LENGTH_ANGLE)", heapAllocate = true)..GLcharUTF8_p.OUT("source", "")
    )
}