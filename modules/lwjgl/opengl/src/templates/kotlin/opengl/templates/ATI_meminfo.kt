/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ATI_meminfo = "ATIMeminfo".nativeClassGL("ATI_meminfo", postfix = ATI) {
    IntConstant(
        "VBO_FREE_MEMORY_ATI"..0x87FB,
        "TEXTURE_FREE_MEMORY_ATI"..0x87FC,
        "RENDERBUFFER_FREE_MEMORY_ATI"..0x87FD
    )
}
