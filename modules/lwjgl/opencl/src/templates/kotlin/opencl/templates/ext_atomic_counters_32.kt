/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_atomic_counters_32 = "EXTAtomicCounters32".nativeClassCL("ext_atomic_counters_32", EXT) {
    IntConstant(
        "DEVICE_MAX_ATOMIC_COUNTERS_EXT"..0x4032
    )
}