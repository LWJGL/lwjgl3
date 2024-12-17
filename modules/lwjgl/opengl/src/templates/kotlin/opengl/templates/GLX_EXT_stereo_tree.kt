/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_EXT_stereo_tree = "GLXEXTStereoTree".nativeClassGLX("GLX_EXT_stereo_tree", EXT) {
    IntConstant(
        "STEREO_TREE_EXT"..0x20F5
    )

    IntConstant(
        "STEREO_NOTIFY_MASK_EXT"..0x00000001
    )

    IntConstant(
        "STEREO_NOTIFY_EXT"..0x00000000
    )
}