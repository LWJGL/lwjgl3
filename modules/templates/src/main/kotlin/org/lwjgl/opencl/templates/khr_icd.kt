/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opencl.templates

import org.lwjgl.generator.*
import org.lwjgl.opencl.*

val khr_icd = "KHRICD".nativeClassCL("khr_icd", KHR) {
    documentation = "Native bindings to the $extensionLink extension."

    IntConstant(
        "Accepted as {@code param_name} to the function #GetPlatformInfo().",

        "PLATFORM_ICD_SUFFIX_KHR"..0x0920
    )

    IntConstant(
        "Returned by #GetPlatformIDs() when no platforms are found.",

        "PLATFORM_NOT_FOUND_KHR".."-1001"
    )

    // clIcdGetPlatformIDsKHR is not exposed through the ICD.

}