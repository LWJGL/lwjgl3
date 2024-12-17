/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_accelerator = "INTELAccelerator".nativeClassCL("intel_accelerator", INTEL) {
    IntConstant(
        "ACCELERATOR_DESCRIPTOR_INTEL"..0x4090,
        "ACCELERATOR_REFERENCE_COUNT_INTEL"..0x4091,
        "ACCELERATOR_CONTEXT_INTEL"..0x4092,
        "ACCELERATOR_TYPE_INTEL"..0x4093
    )

    IntConstant(
        "INVALID_ACCELERATOR_INTEL".."-1094",
        "INVALID_ACCELERATOR_TYPE_INTEL".."-1095",
        "INVALID_ACCELERATOR_DESCRIPTOR_INTEL".."-1096",
        "ACCELERATOR_TYPE_NOT_SUPPORTED_INTEL".."-1097"
    )

    cl_accelerator_intel(
        "CreateAcceleratorINTEL",

        cl_context("context"),
        cl_accelerator_type_intel("accelerator_type"),
        AutoSize("descriptor")..size_t("descriptor_size"),
        void.const.p("descriptor"),
        ERROR_RET
    )

    cl_int(
        "RetainAcceleratorINTEL",

        cl_accelerator_intel("accelerator")
    )

    cl_int(
        "ReleaseAcceleratorINTEL",

        cl_accelerator_intel("accelerator")
    )

    cl_int(
        "GetAcceleratorInfoINTEL",

        cl_accelerator_intel("accelerator"),
        cl_accelerator_info_intel("param_name"),
        PARAM_VALUE_SIZE,
        MultiType(PointerMapping.DATA_INT, PointerMapping.DATA_POINTER)..nullable..void.p("param_value"),
        PARAM_VALUE_SIZE_RET
    )
}