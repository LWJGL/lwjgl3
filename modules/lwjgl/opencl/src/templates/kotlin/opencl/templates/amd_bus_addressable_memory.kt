/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val amd_bus_addressable_memory = "AMDBusAddressableMemory".nativeClassCL("amd_bus_addressable_memory", AMD) {
    IntConstant(
        "MEM_BUS_ADDRESSABLE_AMD".."1<<30"
    )

    IntConstant(
        "MEM_EXTERNAL_PHYSICAL_AMD".."1<<31"
    )

    IntConstant(
        "COMMAND_WAIT_SIGNAL_AMD"..0x4080,
        "COMMAND_WRITE_SIGNAL_AMD"..0x4081,
        "COMMAND_MAKE_BUFFERS_RESIDENT_AMD"..0x4082
    )

    cl_int(
        "EnqueueWaitSignalAMD",

        cl_command_queue("command_queue"),
        cl_mem("mem_object"),
        cl_uint("value"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueWriteSignalAMD",

        cl_command_queue("command_queue"),
        cl_mem("mem_object"),
        cl_uint("value"),
        cl_ulong("offset"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueMakeBuffersResidentAMD",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects", "bus_addresses")..cl_uint("num_mem_objs"),
        cl_mem.const.p("mem_objects"),
        cl_bool("blocking_make_resident"),
        cl_bus_address_amd.p("bus_addresses"),
        NEWL,
        EWL,
        EVENT
    )
}