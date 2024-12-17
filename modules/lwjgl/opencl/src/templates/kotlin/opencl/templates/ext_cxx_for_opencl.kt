/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_cxx_for_opencl = "EXTCXXForOpencl".nativeClassCL("ext_cxx_for_opencl", EXT) {
    IntConstant(
        "DEVICE_CXX_FOR_OPENCL_NUMERIC_VERSION_EXT"..0x4230
    )
}
