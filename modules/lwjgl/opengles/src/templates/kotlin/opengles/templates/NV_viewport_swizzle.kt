/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_viewport_swizzle = "NVViewportSwizzle".nativeClassGLES("NV_viewport_swizzle", postfix = NV) {
    IntConstant(
        "VIEWPORT_SWIZZLE_POSITIVE_X_NV"..0x9350,
        "VIEWPORT_SWIZZLE_NEGATIVE_X_NV"..0x9351,
        "VIEWPORT_SWIZZLE_POSITIVE_Y_NV"..0x9352,
        "VIEWPORT_SWIZZLE_NEGATIVE_Y_NV"..0x9353,
        "VIEWPORT_SWIZZLE_POSITIVE_Z_NV"..0x9354,
        "VIEWPORT_SWIZZLE_NEGATIVE_Z_NV"..0x9355,
        "VIEWPORT_SWIZZLE_POSITIVE_W_NV"..0x9356,
        "VIEWPORT_SWIZZLE_NEGATIVE_W_NV"..0x9357
    )

    IntConstant(
        "VIEWPORT_SWIZZLE_X_NV"..0x9358,
        "VIEWPORT_SWIZZLE_Y_NV"..0x9359,
        "VIEWPORT_SWIZZLE_Z_NV"..0x935A,
        "VIEWPORT_SWIZZLE_W_NV"..0x935B
    )

    void(
        "ViewportSwizzleNV",

        GLuint("index"),
        GLenum("swizzlex"),
        GLenum("swizzley"),
        GLenum("swizzlez"),
        GLenum("swizzlew")
    )
}