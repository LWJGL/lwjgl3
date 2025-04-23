/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opencl.templates

import org.lwjgl.generator.*
import opencl.*

val ext_migrate_memobject = "EXTMigrateMemobject".nativeClassCL("ext_migrate_memobject", EXT) {
    IntConstant(
        "MIGRATE_MEM_OBJECT_HOST_EXT".."1 << 0"
    )

    IntConstant(
        "COMMAND_MIGRATE_MEM_OBJECT_EXT"..0x4040
    )

    cl_int(
        "EnqueueMigrateMemObjectEXT",

        cl_command_queue("command_queue"),
        AutoSize("mem_objects")..cl_uint("num_mem_objects"),
        cl_mem.const.p("mem_objects"),
        cl_mem_migration_flags_ext("flags"),
        NEWL,
        EWL,
        EVENT
    )

}