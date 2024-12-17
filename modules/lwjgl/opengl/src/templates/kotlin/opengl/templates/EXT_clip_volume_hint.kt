/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_clip_volume_hint = "EXTClipVolumeHint".nativeClassGL("EXT_clip_volume_hint", postfix = EXT) {
    IntConstant(
        "CLIP_VOLUME_CLIPPING_HINT_EXT"..0x80F0
    )
}