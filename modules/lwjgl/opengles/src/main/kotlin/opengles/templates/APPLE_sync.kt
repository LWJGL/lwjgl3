/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val APPLE_sync = "APPLESync".nativeClassGLES("APPLE_sync", postfix = APPLE) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces the concept of "sync objects". Sync objects are a synchronization primitive - a representation of events whose completion
        status can be tested or waited upon. One specific type of sync object, the "fence sync object", is supported in this extension, and additional types
        can easily be added in the future.

        Fence sync objects have corresponding fences, which are inserted into the OpenGL command stream at the time the sync object is created. A sync object
        can be queried for a given condition. The only condition supported for fence sync objects is completion of the corresponding fence command. Fence
        completion allows applications to request a partial Finish, wherein all commands prior to the fence will be forced to complete before control is
        returned to the calling process.

        These new mechanisms allow for synchronization between the host CPU and the GPU, which may be accessing the same resources (typically memory), as well
        as between multiple GL contexts bound to multiple threads in the host CPU.

        Requires ${GLES20.core}.
        """

    IntConstant(
        "Accepted as the {@code pname} parameter of GetInteger64vAPPLE.",

        "MAX_SERVER_WAIT_TIMEOUT_APPLE"..0x9111
    )

    IntConstant(
        "Accepted as the {@code pname} parameter of GetSyncivAPPLE.",

        "OBJECT_TYPE_APPLE"..0x9112,
        "SYNC_CONDITION_APPLE"..0x9113,
        "SYNC_STATUS_APPLE"..0x9114,
        "SYNC_FLAGS_APPLE"..0x9115
    )

    IntConstant(
        "Returned in {@code values} for GetSynciv {@code pname} OBJECT_TYPE_APPLE.",

        "SYNC_FENCE_APPLE"..0x9116
    )

    IntConstant(
        "Returned in {@code values} for GetSyncivAPPLE {@code pname} SYNC_CONDITION_APPLE.",

        "SYNC_GPU_COMMANDS_COMPLETE_APPLE"..0x9117
    )

    IntConstant(
        "Returned in {@code values} for GetSyncivAPPLE {@code pname} SYNC_STATUS_APPLE.",

        "UNSIGNALED_APPLE"..0x9118,
        "SIGNALED_APPLE"..0x9119
    )

    IntConstant(
        "Accepted in the {@code flags} parameter of ClientWaitSyncAPPLE.",

        "SYNC_FLUSH_COMMANDS_BIT_APPLE"..0x00000001
    )

    LongConstant(
        "Accepted in the {@code timeout} parameter of WaitSyncAPPLE.",

        "TIMEOUT_IGNORED_APPLE".."0xFFFFFFFFFFFFFFFFL"
    )

    IntConstant(
        "Returned by ClientWaitSyncAPPLE.",

        "ALREADY_SIGNALED_APPLE"..0x911A,
        "TIMEOUT_EXPIRED_APPLE"..0x911B,
        "CONDITION_SATISFIED_APPLE"..0x911C,
        "WAIT_FAILED_APPLE"..0x911D
    )

    IntConstant(
        "Accepted by the {@code type} parameter of LabelObjectEXT and GetObjectLabelEXT.",

        "SYNC_OBJECT_APPLE"..0x8A53
    )

    GLsync(
        "FenceSyncAPPLE",
        "",

        GLenum.IN("condition", ""),
        GLbitfield.IN("flags", "")
    )

    GLboolean(
        "IsSyncAPPLE",
        "",

        GLsync.IN("sync", "")
    )

    void(
        "DeleteSyncAPPLE",
        "",

        GLsync.IN("sync", "")
    )

    GLenum(
        "ClientWaitSyncAPPLE",
        "",

        GLsync.IN("sync", ""),
        GLbitfield.IN("flags", ""),
        GLuint64.IN("timeout", "")
    )

    void(
        "WaitSyncAPPLE",
        "",

        GLsync.IN("sync", ""),
        GLbitfield.IN("flags", ""),
        GLuint64.IN("timeout", "")
    )

    void(
        "GetInteger64vAPPLE",
        "",

        GLenum.IN("pname", ""),
        ReturnParam..Check(1)..GLint64_p.OUT("params", "")
    )

    void(
        "GetSyncivAPPLE",
        "",

        GLsync.IN("sync", ""),
        GLenum.IN("pname", ""),
        AutoSize("values")..GLsizei.IN("bufSize", ""),
        nullable..Check(1)..GLsizei_p.OUT("length", ""),
        ReturnParam..GLint_p.OUT("values", "")
    )
}