/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_sync = "NVSync".nativeClassEGL("NV_sync", postfix = NV) {
    IntConstant(
        "SYNC_PRIOR_COMMANDS_COMPLETE_NV"..0x30E6,
        "SYNC_STATUS_NV"..0x30E7,
        "SIGNALED_NV"..0x30E8,
        "UNSIGNALED_NV"..0x30E9,
        "SYNC_FLUSH_COMMANDS_BIT_NV"..0x0001,

        "ALREADY_SIGNALED_NV"..0x30EA,
        "TIMEOUT_EXPIRED_NV"..0x30EB,
        "CONDITION_SATISFIED_NV"..0x30EC,
        "SYNC_TYPE_NV"..0x30ED,
        "SYNC_CONDITION_NV"..0x30EE,
        "SYNC_FENCE_NV"..0x30EF
    )

    LongConstant(
        "FOREVER_NV".."0xFFFFFFFFFFFFFFFFL",
        "NO_SYNC_NV"..0L
    )

    EGLSyncNV(
        "CreateFenceSyncNV",

        EGLDisplay("dpy"),
        EGLenum("condition"),
        noneTerminated..EGLint.const.p("attrib_list")
    )

    EGLBoolean(
        "DestroySyncNV",

        EGLSyncNV("sync")
    )

    EGLBoolean(
        "FenceNV",

        EGLSyncNV("sync")
    )

    EGLint(
        "ClientWaitSyncNV",

        EGLSyncNV("sync"),
        EGLint("flags"),
        EGLTimeNV("timeout")
    )

    EGLBoolean(
        "SignalSyncNV",

        EGLSyncNV("sync"),
        EGLenum("mode")
    )

    EGLBoolean(
        "GetSyncAttribNV",

        EGLSyncNV("sync"),
        EGLint("attribute"),
        Check(1)..EGLint.p("value")
    )
}