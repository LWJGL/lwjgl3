/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val NV_draw_buffers = "NVDrawBuffers".nativeClassGLES("NV_draw_buffers", postfix = NV) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension extends OpenGL ES 2.0 to allow multiple output colors, and provides a mechanism for directing those outputs to multiple color buffers.

        This extension serves a similar purpose to ARB_draw_buffers except that this is for OpenGL ES 2.0.

        When OpenGL ES 3.0 is present, this extension relaxes the order restriction on color attachments to draw framebuffer objects.
        """

    IntConstant(
        "Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_DRAW_BUFFERS_NV"..0x8824,
        "DRAW_BUFFER0_NV"..0x8825,
        "DRAW_BUFFER1_NV"..0x8826,
        "DRAW_BUFFER2_NV"..0x8827,
        "DRAW_BUFFER3_NV"..0x8828,
        "DRAW_BUFFER4_NV"..0x8829,
        "DRAW_BUFFER5_NV"..0x882A,
        "DRAW_BUFFER6_NV"..0x882B,
        "DRAW_BUFFER7_NV"..0x882C,
        "DRAW_BUFFER8_NV"..0x882D,
        "DRAW_BUFFER9_NV"..0x882E,
        "DRAW_BUFFER10_NV"..0x882F,
        "DRAW_BUFFER11_NV"..0x8830,
        "DRAW_BUFFER12_NV"..0x8831,
        "DRAW_BUFFER13_NV"..0x8832,
        "DRAW_BUFFER14_NV"..0x8833,
        "DRAW_BUFFER15_NV"..0x8834
    )

    IntConstant(
        "Accepted by the {@code bufs} parameter of DrawBuffersNV.",

        "COLOR_ATTACHMENT0_NV"..0x8CE0,
        "COLOR_ATTACHMENT1_NV"..0x8CE1,
        "COLOR_ATTACHMENT2_NV"..0x8CE2,
        "COLOR_ATTACHMENT3_NV"..0x8CE3,
        "COLOR_ATTACHMENT4_NV"..0x8CE4,
        "COLOR_ATTACHMENT5_NV"..0x8CE5,
        "COLOR_ATTACHMENT6_NV"..0x8CE6,
        "COLOR_ATTACHMENT7_NV"..0x8CE7,
        "COLOR_ATTACHMENT8_NV"..0x8CE8,
        "COLOR_ATTACHMENT9_NV"..0x8CE9,
        "COLOR_ATTACHMENT10_NV"..0x8CEA,
        "COLOR_ATTACHMENT11_NV"..0x8CEB,
        "COLOR_ATTACHMENT12_NV"..0x8CEC,
        "COLOR_ATTACHMENT13_NV"..0x8CED,
        "COLOR_ATTACHMENT14_NV"..0x8CEE,
        "COLOR_ATTACHMENT15_NV"..0x8CEF
    )

    void(
        "DrawBuffersNV",
        "",

        AutoSize("bufs")..GLsizei.IN("n", ""),
        SingleValue("buf")..const..GLenum_p.IN("bufs", "")
    )
}