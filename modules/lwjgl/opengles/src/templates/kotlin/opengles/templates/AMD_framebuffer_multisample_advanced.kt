/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val AMD_framebuffer_multisample_advanced = "AMDFramebufferMultisampleAdvanced".nativeClassGLES("AMD_framebuffer_multisample_advanced", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension extends {@code ARB_framebuffer_object} by allowing compromises between image quality and memory footprint of multisample antialiasing.

        {@code ARB_framebuffer_object} introduced #RenderbufferStorageMultisample() as a method of defining the parameters for a multisample render buffer.
        This function takes a {@code samples} parameter that has strict requirements on behavior such that no compromises in the final image quality are
        allowed. Additionally, {@code ARB_framebuffer_object} requires that all framebuffer attachments have the same number of samples.

        This extension extends {@code ARB_framebuffer_object} by providing a new function, #RenderbufferStorageMultisampleAdvancedAMD(), that distinguishes
        between samples and storage samples for color renderbuffers where the number of storage samples can be less than the number of samples. This extension
        also allows non-matching sample counts between color and depth/stencil renderbuffers.

        This extension does not require any specific combination of sample counts to be supported.

        Requires ${GLES30.link}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetRenderbufferParameteriv().",

        "RENDERBUFFER_STORAGE_SAMPLES_AMD"..0x91B2
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, GetDoublev.",

        "MAX_COLOR_FRAMEBUFFER_SAMPLES_AMD"..0x91B3,
        "MAX_COLOR_FRAMEBUFFER_STORAGE_SAMPLES_AMD"..0x91B4,
        "MAX_DEPTH_STENCIL_FRAMEBUFFER_SAMPLES_AMD"..0x91B5,
        "NUM_SUPPORTED_MULTISAMPLE_MODES_AMD"..0x91B6,
        "SUPPORTED_MULTISAMPLE_MODES_AMD"..0x91B7
    )

    void(
        "RenderbufferStorageMultisampleAdvancedAMD",
        "",

        GLenum("target", ""),
        GLsizei("samples", ""),
        GLsizei("storageSamples", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )

    void(
        "NamedRenderbufferStorageMultisampleAdvancedAMD",
        "",

        GLuint("renderbuffer", ""),
        GLsizei("samples", ""),
        GLsizei("storageSamples", ""),
        GLenum("internalformat", ""),
        GLsizei("width", ""),
        GLsizei("height", "")
    )
}