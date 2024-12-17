/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_integer_dot_product = "KHRIntegerDotProduct".nativeClassCL("khr_integer_dot_product", KHR) {
    IntConstant(
        "DEVICE_INTEGER_DOT_PRODUCT_CAPABILITIES_KHR"..0x1073,
        "DEVICE_INTEGER_DOT_PRODUCT_ACCELERATION_PROPERTIES_8BIT_KHR"..0x1074,
        "DEVICE_INTEGER_DOT_PRODUCT_ACCELERATION_PROPERTIES_4x8BIT_PACKED_KHR"..0x1075
    )

    IntConstant(
        "DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT_PACKED_KHR".."(1 << 0)",
        "DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT_KHR".."(1 << 1)"
    )
}