/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_bindable_uniform = "EXTBindableUniform".nativeClassGL("EXT_bindable_uniform", postfix = EXT) {
    IntConstant(
        "MAX_VERTEX_BINDABLE_UNIFORMS_EXT"..0x8DE2,
        "MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT"..0x8DE3,
        "MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT"..0x8DE4,
        "MAX_BINDABLE_UNIFORM_SIZE_EXT"..0x8DED,
        "UNIFORM_BUFFER_BINDING_EXT"..0x8DEF
    )

    IntConstant(
        "UNIFORM_BUFFER_EXT"..0x8DEE
    )

    void(
        "UniformBufferEXT",

        GLuint("program"),
        GLint("location"),
        GLuint("buffer")
    )

    GLint(
        "GetUniformBufferSizeEXT",

        GLuint("program"),
        GLint("location")
    )

    GLintptr(
        "GetUniformOffsetEXT",

        GLuint("program"),
        GLint("location")
    )
}