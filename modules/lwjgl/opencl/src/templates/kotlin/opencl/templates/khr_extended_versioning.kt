/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_extended_versioning = "KHRExtendedVersioning".nativeClassCL("khr_extended_versioning", KHR) {
    IntConstant(
        "VERSION_MAJOR_BITS_KHR".."10",
        "VERSION_MINOR_BITS_KHR ".."10",
        "VERSION_PATCH_BITS_KHR ".."12",
    )

    IntConstant(
        "VERSION_MAJOR_MASK_KHR".."((1 << CL_VERSION_MAJOR_BITS_KHR) - 1)",
        "VERSION_MINOR_MASK_KHR".."((1 << CL_VERSION_MINOR_BITS_KHR) - 1)",
        "VERSION_PATCH_MASK_KHR".."((1 << CL_VERSION_PATCH_BITS_KHR) - 1)"
    )

    macro(
        expression = "version >> (CL_VERSION_MINOR_BITS_KHR + CL_VERSION_PATCH_BITS_KHR)"
    )..uint32_t("CL_VERSION_MAJOR_KHR", uint32_t("version"), noPrefix = true)

    macro(
        expression = "(version >> CL_VERSION_PATCH_BITS_KHR) & CL_VERSION_MINOR_MASK_KHR"
    )..uint32_t("CL_VERSION_MINOR_KHR", uint32_t("version"), noPrefix = true)

    macro(
        expression = "version & CL_VERSION_PATCH_MASK_KHR"
    )..uint32_t("CL_VERSION_PATCH_KHR", uint32_t("version"), noPrefix = true)

    macro(
        expression = "((major & CL_VERSION_MAJOR_MASK_KHR) << (CL_VERSION_MINOR_BITS_KHR + CL_VERSION_PATCH_BITS_KHR)) | ((minor & CL_VERSION_MINOR_MASK_KHR) << CL_VERSION_PATCH_BITS_KHR) | (patch & CL_VERSION_PATCH_MASK_KHR)"
    )..uint32_t(
        "CL_MAKE_VERSION_KHR",

        uint32_t("major"),
        uint32_t("minor"),
        uint32_t("patch"),

        noPrefix = true
    )

    IntConstant(
        "PLATFORM_NUMERIC_VERSION_KHR"..0x0906
    )

    IntConstant(
        "PLATFORM_EXTENSIONS_WITH_VERSION_KHR"..0x0907
    )

    IntConstant(
        "DEVICE_NUMERIC_VERSION_KHR"..0x105E
    )

    IntConstant(
        "DEVICE_OPENCL_C_NUMERIC_VERSION_KHR"..0x105F
    )

    IntConstant(
        "DEVICE_EXTENSIONS_WITH_VERSION_KHR"..0x1060
    )

    IntConstant(
        "DEVICE_ILS_WITH_VERSION_KHR"..0x1061
    )

    IntConstant(
        "DEVICE_BUILT_IN_KERNELS_WITH_VERSION_KHR"..0x1062
    )
}