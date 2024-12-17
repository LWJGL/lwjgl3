/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val CL22 = "CL22".nativeClassCL("CL22") {
    extends = CL21
    IntConstant(
        "VERSION_2_2".."1"
    )

    IntConstant(
        "INVALID_SPEC_ID".."-71"
    )

    IntConstant(
        "MAX_SIZE_RESTRICTION_EXCEEDED".."-72"
    )

    IntConstant(
        "PROGRAM_SCOPE_GLOBAL_CTORS_PRESENT"..0x116A,
        "PROGRAM_SCOPE_GLOBAL_DTORS_PRESENT"..0x116B
    )

    cl_int(
        "SetProgramReleaseCallback",

        cl_program("program"),
        cl_program_release_callback("pfn_notify"),
        nullable..opaque_p("user_data")
    )

    cl_int(
        "SetProgramSpecializationConstant",

        cl_program("program"),
        cl_uint("spec_id"),
        AutoSize("spec_value")..size_t("spec_size"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_LONG,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void.const.p("spec_value")
    )
}