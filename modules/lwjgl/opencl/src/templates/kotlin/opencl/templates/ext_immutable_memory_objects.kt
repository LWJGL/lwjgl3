/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_immutable_memory_objects = "EXTImmutableMemoryObjects".nativeClassCL("ext_immutable_memory_objects", EXT) {
    IntConstant(
        "MEM_IMMUTABLE_EXT".."1 << 6"
    )
}