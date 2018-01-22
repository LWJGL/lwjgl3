/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val EXT_clip_volume_hint = "EXTClipVolumeHint".nativeClassGL("EXT_clip_volume_hint", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        EXT_clip_volume_hint provides a mechanism for applications to indicate that they do not require clip volume clipping for primitives. It allows
        applications to maximize performance in situations where they know that clipping is unnecessary. EXT_clip_volume_hint is only an indication, though,
        and implementations are free to ignore it.
        """

    IntConstant(
        "Accepted by the target parameter of Hint and the pname parameter of GetBooleanv, GetDoublev, GetFloatv and GetIntegerv.",

        "CLIP_VOLUME_CLIPPING_HINT_EXT"..0x80F0
    )
}