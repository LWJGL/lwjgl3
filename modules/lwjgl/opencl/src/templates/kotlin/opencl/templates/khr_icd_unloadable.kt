/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_icd_unloadable = "KHRICDUnloadable".nativeClassCL("khr_icd_unloadable", KHR) {
    IntConstant(
        "PLATFORM_UNLOADABLE_KHR"..0x0921
    )
}