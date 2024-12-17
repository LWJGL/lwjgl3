/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_explicit_multisample = "NVExplicitMultisample".nativeClassGL("NV_explicit_multisample", postfix = NV) {
    IntConstant(
        "SAMPLE_POSITION_NV"..0x8E50
    )

    IntConstant(
        "SAMPLE_MASK_NV"..0x8E51
    )

    IntConstant(
        "SAMPLE_MASK_VALUE_NV"..0x8E52
    )

    IntConstant(
        "TEXTURE_BINDING_RENDERBUFFER_NV"..0x8E53,
        "TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV"..0x8E54,
        "MAX_SAMPLE_MASK_WORDS_NV"..0x8E59
    )

    IntConstant(
        "TEXTURE_RENDERBUFFER_NV"..0x8E55
    )

    IntConstant(
        "SAMPLER_RENDERBUFFER_NV"..0x8E56,
        "INT_SAMPLER_RENDERBUFFER_NV"..0x8E57,
        "UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV"..0x8E58
    )

    void(
        "GetMultisamplefvNV",

        GLenum("pname"),
        GLuint("index"),
        Check(2)..GLfloat.p("val")
    )

    void(
        "SampleMaskIndexedNV",

        GLuint("index"),
        GLbitfield("mask")
    )

    void(
        "TexRenderbufferNV",

        GLenum("target"),
        GLuint("renderbuffer")
    )
}