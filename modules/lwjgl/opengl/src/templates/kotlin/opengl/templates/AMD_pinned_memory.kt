/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_pinned_memory = "AMDPinnedMemory".nativeClassGL("AMD_pinned_memory", postfix = AMD) {
    IntConstant(
        "EXTERNAL_VIRTUAL_MEMORY_BUFFER_AMD"..0x9160
    )
}