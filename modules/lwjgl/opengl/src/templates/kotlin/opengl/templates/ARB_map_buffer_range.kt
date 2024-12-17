/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_map_buffer_range = "ARBMapBufferRange".nativeClassGL("ARB_map_buffer_range", postfix = ARB) {
    IntConstant(
        "MAP_READ_BIT"..0x0001,
        "MAP_WRITE_BIT"..0x0002,
        "MAP_INVALIDATE_RANGE_BIT"..0x0004,
        "MAP_INVALIDATE_BUFFER_BIT"..0x0008,
        "MAP_FLUSH_EXPLICIT_BIT"..0x0010,
        "MAP_UNSYNCHRONIZED_BIT"..0x0020
    )

    reuse(GL30C, "MapBufferRange")
    reuse(GL30C, "FlushMappedBufferRange")
}