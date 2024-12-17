/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_map_buffer_alignment = "ARBMapBufferAlignment".nativeClassGL("ARB_map_buffer_alignment") {
    IntConstant(
        "MIN_MAP_BUFFER_ALIGNMENT"..0x90BC
    )
}