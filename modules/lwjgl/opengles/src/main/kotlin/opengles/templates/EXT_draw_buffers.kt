/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val EXT_draw_buffers = "EXTDrawBuffers".nativeClassGLES("EXT_draw_buffers", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension increases the number of available framebuffer object color attachment points, extends OpenGL ES 2.0 to allow multiple output colors, and
        provides a mechanism for directing those outputs to multiple color buffers.

        This extension is similar to the combination of the GL_NV_draw_buffers and GL_NV_fbo_color_attachments extensions, but imposes certain restrictions
        informed by the OpenGL ES 3.0 API.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegerv.",

        "MAX_COLOR_ATTACHMENTS_EXT"..0x8CDF
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetIntegerv and GetFloatv.",

        "MAX_DRAW_BUFFERS_EXT"..0x8824,
        "DRAW_BUFFER0_EXT"..0x8825,
        "DRAW_BUFFER1_EXT"..0x8826,
        "DRAW_BUFFER2_EXT"..0x8827,
        "DRAW_BUFFER3_EXT"..0x8828,
        "DRAW_BUFFER4_EXT"..0x8829,
        "DRAW_BUFFER5_EXT"..0x882A,
        "DRAW_BUFFER6_EXT"..0x882B,
        "DRAW_BUFFER7_EXT"..0x882C,
        "DRAW_BUFFER8_EXT"..0x882D,
        "DRAW_BUFFER9_EXT"..0x882E,
        "DRAW_BUFFER10_EXT"..0x882F,
        "DRAW_BUFFER11_EXT"..0x8830,
        "DRAW_BUFFER12_EXT"..0x8831,
        "DRAW_BUFFER13_EXT"..0x8832,
        "DRAW_BUFFER14_EXT"..0x8833,
        "DRAW_BUFFER15_EXT"..0x8834
    )

    IntConstant(
        """
        Accepted by the {@code attachment} parameter of FramebufferRenderbuffer, FramebufferTexture2D and GetFramebufferAttachmentParameteriv, and by the
        {@code bufs} parameter of DrawBuffersEXT.
        """,

        "COLOR_ATTACHMENT0_EXT"..0x8CE0,
        "COLOR_ATTACHMENT1_EXT"..0x8CE1,
        "COLOR_ATTACHMENT2_EXT"..0x8CE2,
        "COLOR_ATTACHMENT3_EXT"..0x8CE3,
        "COLOR_ATTACHMENT4_EXT"..0x8CE4,
        "COLOR_ATTACHMENT5_EXT"..0x8CE5,
        "COLOR_ATTACHMENT6_EXT"..0x8CE6,
        "COLOR_ATTACHMENT7_EXT"..0x8CE7,
        "COLOR_ATTACHMENT8_EXT"..0x8CE8,
        "COLOR_ATTACHMENT9_EXT"..0x8CE9,
        "COLOR_ATTACHMENT10_EXT"..0x8CEA,
        "COLOR_ATTACHMENT11_EXT"..0x8CEB,
        "COLOR_ATTACHMENT12_EXT"..0x8CEC,
        "COLOR_ATTACHMENT13_EXT"..0x8CED,
        "COLOR_ATTACHMENT14_EXT"..0x8CEE,
        "COLOR_ATTACHMENT15_EXT"..0x8CEF
    )

    void(
        "DrawBuffersEXT",
        "",

        AutoSize("bufs")..GLsizei.IN("n", ""),
        SingleValue("buf")..const..GLenum_p.IN("bufs", "")
    )
}