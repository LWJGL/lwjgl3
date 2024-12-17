/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val APPLE_sync = "APPLESync".nativeClassGLES("APPLE_sync", postfix = APPLE) {
    IntConstant(
        "MAX_SERVER_WAIT_TIMEOUT_APPLE"..0x9111
    )

    IntConstant(
        "OBJECT_TYPE_APPLE"..0x9112,
        "SYNC_CONDITION_APPLE"..0x9113,
        "SYNC_STATUS_APPLE"..0x9114,
        "SYNC_FLAGS_APPLE"..0x9115
    )

    IntConstant(
        "SYNC_FENCE_APPLE"..0x9116
    )

    IntConstant(
        "SYNC_GPU_COMMANDS_COMPLETE_APPLE"..0x9117
    )

    IntConstant(
        "UNSIGNALED_APPLE"..0x9118,
        "SIGNALED_APPLE"..0x9119
    )

    IntConstant(
        "SYNC_FLUSH_COMMANDS_BIT_APPLE"..0x00000001
    )

    LongConstant(
        "TIMEOUT_IGNORED_APPLE".."0xFFFFFFFFFFFFFFFFL"
    )

    IntConstant(
        "ALREADY_SIGNALED_APPLE"..0x911A,
        "TIMEOUT_EXPIRED_APPLE"..0x911B,
        "CONDITION_SATISFIED_APPLE"..0x911C,
        "WAIT_FAILED_APPLE"..0x911D
    )

    IntConstant(
        "SYNC_OBJECT_APPLE"..0x8A53
    )

    GLsync(
        "FenceSyncAPPLE",

        GLenum("condition"),
        GLbitfield("flags")
    )

    GLboolean(
        "IsSyncAPPLE",

        GLsync("sync")
    )

    void(
        "DeleteSyncAPPLE",

        GLsync("sync")
    )

    GLenum(
        "ClientWaitSyncAPPLE",

        GLsync("sync"),
        GLbitfield("flags"),
        GLuint64("timeout")
    )

    void(
        "WaitSyncAPPLE",

        GLsync("sync"),
        GLbitfield("flags"),
        GLuint64("timeout")
    )

    void(
        "GetInteger64vAPPLE",


        GLenum("pname"),
        ReturnParam..Check(1)..GLint64.p("params")
    )

    void(
        "GetSyncivAPPLE",

        GLsync("sync"),
        GLenum("pname"),
        AutoSize("values")..GLsizei("bufSize"),
        nullable..Check(1)..GLsizei.p("length"),
        ReturnParam..GLint.p("values")
    )
}