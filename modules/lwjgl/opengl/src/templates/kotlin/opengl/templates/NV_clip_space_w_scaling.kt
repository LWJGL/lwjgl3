/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_clip_space_w_scaling = "NVClipSpaceWScaling".nativeClassGL("NV_clip_space_w_scaling", postfix = NV) {
    IntConstant(
        "VIEWPORT_POSITION_W_SCALE_NV"..0x937C
    )

    IntConstant(
        "VIEWPORT_POSITION_W_SCALE_X_COEFF"..0x937D,
        "VIEWPORT_POSITION_W_SCALE_Y_COEFF"..0x937E
    )

    void(
        "ViewportPositionWScaleNV",

        GLuint("index"),
        GLfloat("xcoeff"),
        GLfloat("ycoeff")
    )
}