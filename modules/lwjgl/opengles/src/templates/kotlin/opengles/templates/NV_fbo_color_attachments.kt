/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_fbo_color_attachments = "NVFboColorAttachments".nativeClassGLES("NV_fbo_color_attachments", postfix = NV) {
    IntConstant(
        "MAX_COLOR_ATTACHMENTS_NV"..0x8CDF
    )

    IntConstant(
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
}