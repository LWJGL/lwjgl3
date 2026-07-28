/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL31 = "CL31".nativeClassCL("CL31") {
    extends = CL30

    IntConstant(
        "DEVICE_MAX_WORK_GROUP_SIZES"..0x1005
    )

    IntConstant(
        "UUID_SIZE".."16",
        "LUID_SIZE".."8"
    )

    IntConstant(
        "DEVICE_UUID"..0x106A,
        "DRIVER_UUID"..0x106B,
        "DEVICE_LUID_VALID"..0x106C,
        "DEVICE_LUID"..0x106D,
        "DEVICE_NODE_MASK"..0x106E
    )

    IntConstant(
        "DEVICE_INTEGER_DOT_PRODUCT_CAPABILITIES"..0x1073,
        "DEVICE_INTEGER_DOT_PRODUCT_ACCELERATION_PROPERTIES_8BIT"..0x1074,
        "DEVICE_INTEGER_DOT_PRODUCT_ACCELERATION_PROPERTIES_4x8BIT_PACKED"..0x1075
    )

    LongConstant(
        "DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT_PACKED".."(1L << 0)",
        "DEVICE_INTEGER_DOT_PRODUCT_INPUT_4x8BIT".."(1L << 1)"
    )

    IntConstant(
        "DEVICE_SPIRV_EXTENDED_INSTRUCTION_SETS"..0x12B9,
        "DEVICE_SPIRV_EXTENSIONS"..0x12BA,
        "DEVICE_SPIRV_CAPABILITIES"..0x12BB
    )

    cl_int(
        "GetKernelSuggestedLocalWorkSize",

        cl_command_queue("command_queue"),
        cl_kernel("kernel"),
        AutoSize("global_work_size", "suggested_local_work_size", "global_work_offset")..cl_uint("work_dim"),
        nullable..size_t.const.p("global_work_offset"),
        size_t.const.p("global_work_size"),
        size_t.p("suggested_local_work_size")
    )
}