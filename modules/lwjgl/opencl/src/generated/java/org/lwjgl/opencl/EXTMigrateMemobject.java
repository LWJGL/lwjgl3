/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class EXTMigrateMemobject {

    public static final int CL_MIGRATE_MEM_OBJECT_HOST_EXT = 1 << 0;

    public static final int CL_COMMAND_MIGRATE_MEM_OBJECT_EXT = 0x4040;

    protected EXTMigrateMemobject() {
        throw new UnsupportedOperationException();
    }

    // --- [ clEnqueueMigrateMemObjectEXT ] ---

    /** {@code cl_int clEnqueueMigrateMemObjectEXT(cl_command_queue command_queue, cl_uint num_mem_objects, cl_mem const * mem_objects, cl_mem_migration_flags_ext flags, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueMigrateMemObjectEXT(long command_queue, int num_mem_objects, long mem_objects, long flags, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMigrateMemObjectEXT;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPJPPI(command_queue, num_mem_objects, mem_objects, flags, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueMigrateMemObjectEXT(cl_command_queue command_queue, cl_uint num_mem_objects, cl_mem const * mem_objects, cl_mem_migration_flags_ext flags, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueMigrateMemObjectEXT(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_mem_migration_flags_ext") long flags, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMigrateMemObjectEXT(command_queue, mem_objects.remaining(), memAddress(mem_objects), flags, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

}