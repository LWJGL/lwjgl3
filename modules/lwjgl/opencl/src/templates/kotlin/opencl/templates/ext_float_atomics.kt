/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_float_atomics = "EXTFloatAtomics".nativeClassCL("ext_float_atomics", EXT) {
    IntConstant(
        "DEVICE_SINGLE_FP_ATOMIC_CAPABILITIES_EXT"..0x4231,
        "DEVICE_DOUBLE_FP_ATOMIC_CAPABILITIES_EXT"..0x4232,
        "DEVICE_HALF_FP_ATOMIC_CAPABILITIES_EXT"..0x4233
    )

    IntConstant(
        "DEVICE_GLOBAL_FP_ATOMIC_LOAD_STORE_EXT".."1 << 0",
        "DEVICE_GLOBAL_FP_ATOMIC_ADD_EXT".."1 << 1",
        "DEVICE_GLOBAL_FP_ATOMIC_MIN_MAX_EXT".."1 << 2",
        "DEVICE_LOCAL_FP_ATOMIC_LOAD_STORE_EXT".."1 << 16",
        "DEVICE_LOCAL_FP_ATOMIC_ADD_EXT".."1 << 17",
        "DEVICE_LOCAL_FP_ATOMIC_MIN_MAX_EXT".."1 << 18"
    )
}