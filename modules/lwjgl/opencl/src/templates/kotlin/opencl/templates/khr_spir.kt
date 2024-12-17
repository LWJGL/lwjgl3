/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_spir = "KHRSPIR".nativeClassCL("khr_spir", KHR) {
    IntConstant(
        "DEVICE_SPIR_VERSIONS"..0x40E0
    )

    IntConstant(
        "PROGRAM_BINARY_TYPE_INTERMEDIATE"..0x40E1
    )
}