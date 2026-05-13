/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_spirv_queries = "KHRSPIRVQueries".nativeClassCL("khr_spirv_queries", KHR) {
    IntConstant(
        "DEVICE_SPIRV_EXTENDED_INSTRUCTION_SETS_KHR"..0x12B9,
        "DEVICE_SPIRV_EXTENSIONS_KHR"..0x12BA,
        "DEVICE_SPIRV_CAPABILITIES_KHR"..0x12BB
    )
}