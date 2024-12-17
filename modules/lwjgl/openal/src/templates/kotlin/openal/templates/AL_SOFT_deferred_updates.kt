/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_deferred_updates = "SOFTDeferredUpdates".nativeClassAL("SOFT_deferred_updates", postfix = SOFT) {
    IntConstant(
        "DEFERRED_UPDATES_SOFT"..0xC002
    )

    ALvoid("DeferUpdatesSOFT").directContext()

    ALvoid("ProcessUpdatesSOFT").directContext()
}