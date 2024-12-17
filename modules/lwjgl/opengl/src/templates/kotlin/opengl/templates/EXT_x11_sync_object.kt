/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val EXT_x11_sync_object = "EXTX11SyncObject".nativeClassGL("EXT_x11_sync_object", postfix = EXT) {
    IntConstant(
        "SYNC_X11_FENCE_EXT"..0x90E1
    )

    GLsync(
        "ImportSyncEXT",

        GLenum("external_sync_type"),
        GLintptr("external_sync"),
        GLbitfield("flags")
    )
}