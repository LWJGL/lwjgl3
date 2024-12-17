/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_sync = "ARBSync".nativeClassGL("ARB_sync") {
    IntConstant(
        "MAX_SERVER_WAIT_TIMEOUT"..0x9111
    )

    IntConstant(
        "OBJECT_TYPE"..0x9112,
        "SYNC_CONDITION"..0x9113,
        "SYNC_STATUS"..0x9114,
        "SYNC_FLAGS"..0x9115
    )

    IntConstant(
        "SYNC_FENCE"..0x9116
    )

    IntConstant(
        "SYNC_GPU_COMMANDS_COMPLETE"..0x9117
    )

    IntConstant(
        "UNSIGNALED"..0x9118,
        "SIGNALED"..0x9119
    )

    IntConstant(
        "SYNC_FLUSH_COMMANDS_BIT"..0x00000001
    )

    LongConstant(
        "TIMEOUT_IGNORED".."0xFFFFFFFFFFFFFFFFL" // TODO: https://youtrack.jetbrains.com/issue/KT-2780
    )

    IntConstant(
        "ALREADY_SIGNALED"..0x911A,
        "TIMEOUT_EXPIRED"..0x911B,
        "CONDITION_SATISFIED"..0x911C,
        "WAIT_FAILED"..0x911D
    )

    reuse(GL32C, "FenceSync")
    reuse(GL32C, "IsSync")
    reuse(GL32C, "DeleteSync")
    reuse(GL32C, "ClientWaitSync")
    reuse(GL32C, "WaitSync")
    reuse(GL32C, "GetInteger64v")
    reuse(GL32C, "GetSynciv")

}
