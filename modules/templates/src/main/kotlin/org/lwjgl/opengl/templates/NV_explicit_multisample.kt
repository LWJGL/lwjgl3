/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_explicit_multisample = "NVExplicitMultisample".nativeClassGL("NV_explicit_multisample", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        In traditional multisample specs, the API only allows access to the samples indirectly through methods such as coverage values and downsampled
        readbacks. NV_explicit_multisample adds a set of new capabilities to allow more precise control over the use of multisamples. Specifically, it adds:
        ${ul(
            "A query in the API to query the location of samples within the pixel",
            "An explicit control for the multisample sample mask to augment the control provided by SampleCoverage",
            "A new texture target to wrap a renderbuffer and allow a restricted class of accesses to the samples",
            "The ability to fetch a specific sample from a multisampled texture from within a shader",
            "A program option to enable the new behavior"
        )}

        Requires ${GL20.core} and ${ARB_multisample.link}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetMultisamplefvNV.",

        "SAMPLE_POSITION_NV"..0x8E50
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "SAMPLE_MASK_NV"..0x8E51
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanIndexedvEXT and GetIntegerIndexedvEXT.",

        "SAMPLE_MASK_VALUE_NV"..0x8E52
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "TEXTURE_BINDING_RENDERBUFFER_NV"..0x8E53,
        "TEXTURE_RENDERBUFFER_DATA_STORE_BINDING_NV"..0x8E54,
        "MAX_SAMPLE_MASK_WORDS_NV"..0x8E59
    )

    IntConstant(
        "Accepted by the {@code target} parameter of BindTexture, and TexRenderbufferNV.",

        "TEXTURE_RENDERBUFFER_NV"..0x8E55
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_RENDERBUFFER_NV"..0x8E56,
        "INT_SAMPLER_RENDERBUFFER_NV"..0x8E57,
        "UNSIGNED_INT_SAMPLER_RENDERBUFFER_NV"..0x8E58
    )

    void(
        "GetMultisamplefvNV",
        "",

        GLenum.IN("pname", ""),
        GLuint.IN("index", ""),
        Check(2)..GLfloat_p.OUT("val", "")
    )

    void(
        "SampleMaskIndexedNV",
        "",

        GLuint.IN("index", ""),
        GLbitfield.IN("mask", "")
    )

    void(
        "TexRenderbufferNV",
        "",

        GLenum.IN("target", ""),
        GLuint.IN("renderbuffer", "")
    )
}