/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val img_use_gralloc_ptr = "IMGUseGrallocPtr".nativeClassCL("img_use_gralloc_ptr", IMG) {
    IntConstant(
        "COMMAND_ACQUIRE_GRALLOC_OBJECTS_IMG"..0x40D2,
        "COMMAND_RELEASE_GRALLOC_OBJECTS_IMG"..0x40D3,
    )

    IntConstant(
        "GRALLOC_RESOURCE_NOT_ACQUIRED_IMG"..0x40D4,
        "INVALID_GRALLOC_OBJECT_IMG"..0x40D5
    )

    IntConstant(
        "MEM_USE_GRALLOC_PTR_IMG".."1 << 28"
    )

    cl_int(
        "EnqueueAcquireGrallocObjectsIMG",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_objects"),
        nullable..cl_mem.const.p("mem_objects"),
        NEWL,
        EWL,
        EVENT
    )

    cl_int(
        "EnqueueReleaseGrallocObjectsIMG",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_objects"),
        nullable..cl_mem.const.p("mem_objects"),
        NEWL,
        EWL,
        EVENT
    )
}