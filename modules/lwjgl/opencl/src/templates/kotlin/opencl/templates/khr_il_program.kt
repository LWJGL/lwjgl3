/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val khr_il_program = "KHRILProgram".nativeClassCL("khr_il_program", KHR) {
    IntConstant(
        "DEVICE_IL_VERSION_KHR"..0x105B
    )

    IntConstant(
        "PROGRAM_IL_KHR"..0x1169
    )

    cl_program(
        "CreateProgramWithILKHR",

        cl_context("context"),
        void.const.p("il"),
        AutoSize("il")..size_t("length"),
        ERROR_RET
    )
}