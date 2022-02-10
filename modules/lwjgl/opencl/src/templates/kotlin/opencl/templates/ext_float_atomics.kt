/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_float_atomics = "EXTFloatAtomics".nativeClassCL("ext_float_atomics", EXT) {
    documentation =
        """
        Native bindings to the $extensionLink extension.

        This extension enables programmers to perform atomic operations on floating-point numbers in memory.

        An OpenCL device supporting this extension may support atomic operations on 16-bit half-precision floating-point values ({@code fp16}), 32-bit
        single-precision floating-point values ({@code fp32}), or 64-bit double-precision floating-point values ({@code fp64}). For these types, an OpenCL
        device may support basic atomic operations (load, store, and exchange), atomic addition and subtraction, and atomic min and max. The floating-point
        numbers may be in global or local memory.

        Requires ${CL20.link}.
        """

    IntConstant(
        "Accepted value for the {@code param_name} parameter to #GetDeviceInfo() to query the floating-point atomic capabilities of an OpenCL device.",

        "DEVICE_SINGLE_FP_ATOMIC_CAPABILITIES_EXT"..0x4231,
        "DEVICE_DOUBLE_FP_ATOMIC_CAPABILITIES_EXT"..0x4232,
        "DEVICE_HALF_FP_ATOMIC_CAPABILITIES_EXT"..0x4233
    )

    IntConstant(
        """
        Bitfield type describing the floating-point atomic capabilities of an OpenCL device. ({@code cl_device_fp_atomic_capabilities_ext}
        
        Subsequent versions of this extension may add additional floating-point atomic capabilities.
        """,

        "DEVICE_GLOBAL_FP_ATOMIC_LOAD_STORE_EXT".."1 << 0",
        "DEVICE_GLOBAL_FP_ATOMIC_ADD_EXT".."1 << 1",
        "DEVICE_GLOBAL_FP_ATOMIC_MIN_MAX_EXT".."1 << 2",
        "DEVICE_LOCAL_FP_ATOMIC_LOAD_STORE_EXT".."1 << 16",
        "DEVICE_LOCAL_FP_ATOMIC_ADD_EXT".."1 << 17",
        "DEVICE_LOCAL_FP_ATOMIC_MIN_MAX_EXT".."1 << 18"
    )
}