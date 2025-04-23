/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val intel_program_scope_host_pipe = "INTELProgramScopeHostPipe".nativeClassCL("intel_program_scope_host_pipe", INTEL) {
    IntConstant(
        "COMMAND_READ_HOST_PIPE_INTEL"..0x4214,
        "COMMAND_WRITE_HOST_PIPE_INTEL"..0x4215
    )

    IntConstant(
        "PROGRAM_NUM_HOST_PIPES_INTEL"..0x4216,
        "PROGRAM_HOST_PIPE_NAMES_INTEL"..0x4217,
    )

    cl_int(
        "EnqueueReadHostPipeINTEL",

        cl_command_queue("command_queue"),
        cl_program("program"),
        charUTF8.const.p("pipe_symbol"),
        cl_bool("blocking_read"),
        void.p("ptr"),
        AutoSize("ptr")..size_t("size"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueWriteHostPipeINTEL",

        cl_command_queue("command_queue"),
        cl_program("program"),
        charUTF8.const.p("pipe_symbol"),
        cl_bool("blocking_write"),
        void.const.p("ptr"),
        AutoSize("ptr")..size_t("size"),
        NEWL,
        EWL,
        EVENT
    )
}