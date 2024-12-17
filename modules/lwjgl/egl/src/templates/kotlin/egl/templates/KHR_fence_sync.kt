/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_fence_sync = "KHRFenceSync".nativeClassEGL("KHR_fence_sync", postfix = KHR) {
    IntConstant(
        "SYNC_PRIOR_COMMANDS_COMPLETE_KHR"..0x30F0,
        "SYNC_CONDITION_KHR"..0x30F8,
        "SYNC_FENCE_KHR"..0x30F9
    )

    reuse(KHR_reusable_sync, "CreateSyncKHR")
    reuse(KHR_reusable_sync, "DestroySyncKHR")
    reuse(KHR_reusable_sync, "ClientWaitSyncKHR")
    reuse(KHR_reusable_sync, "GetSyncAttribKHR")
}