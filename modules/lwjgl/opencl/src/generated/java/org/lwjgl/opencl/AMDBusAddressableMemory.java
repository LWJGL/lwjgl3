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

public class AMDBusAddressableMemory {

    public static final int CL_MEM_BUS_ADDRESSABLE_AMD = 1<<30;

    public static final int CL_MEM_EXTERNAL_PHYSICAL_AMD = 1<<31;

    public static final int
        CL_COMMAND_WAIT_SIGNAL_AMD           = 0x4080,
        CL_COMMAND_WRITE_SIGNAL_AMD          = 0x4081,
        CL_COMMAND_MAKE_BUFFERS_RESIDENT_AMD = 0x4082;

    protected AMDBusAddressableMemory() {
        throw new UnsupportedOperationException();
    }

    // --- [ clEnqueueWaitSignalAMD ] ---

    /** {@code cl_int clEnqueueWaitSignalAMD(cl_command_queue command_queue, cl_mem mem_object, cl_uint value, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueWaitSignalAMD(long command_queue, long mem_object, int value, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueWaitSignalAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(mem_object);
        }
        return callPPPPI(command_queue, mem_object, value, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueWaitSignalAMD(cl_command_queue command_queue, cl_mem mem_object, cl_uint value, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWaitSignalAMD(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long mem_object, @NativeType("cl_uint") int value, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWaitSignalAMD(command_queue, mem_object, value, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueWriteSignalAMD ] ---

    /** {@code cl_int clEnqueueWriteSignalAMD(cl_command_queue command_queue, cl_mem mem_object, cl_uint value, cl_ulong offset, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueWriteSignalAMD(long command_queue, long mem_object, int value, long offset, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueWriteSignalAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(mem_object);
        }
        return callPPJPPI(command_queue, mem_object, value, offset, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteSignalAMD(cl_command_queue command_queue, cl_mem mem_object, cl_uint value, cl_ulong offset, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteSignalAMD(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long mem_object, @NativeType("cl_uint") int value, @NativeType("cl_ulong") long offset, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWriteSignalAMD(command_queue, mem_object, value, offset, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMakeBuffersResidentAMD ] ---

    /** {@code cl_int clEnqueueMakeBuffersResidentAMD(cl_command_queue command_queue, cl_uint num_mem_objs, cl_mem const * mem_objects, cl_bool blocking_make_resident, cl_bus_address_amd * bus_addresses, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueMakeBuffersResidentAMD(long command_queue, int num_mem_objs, long mem_objects, int blocking_make_resident, long bus_addresses, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMakeBuffersResidentAMD;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPI(command_queue, num_mem_objs, mem_objects, blocking_make_resident, bus_addresses, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueMakeBuffersResidentAMD(cl_command_queue command_queue, cl_uint num_mem_objs, cl_mem const * mem_objects, cl_bool blocking_make_resident, cl_bus_address_amd * bus_addresses, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueMakeBuffersResidentAMD(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_bool") boolean blocking_make_resident, @NativeType("cl_bus_address_amd *") CLBusAddressAMD.Buffer bus_addresses, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(bus_addresses, mem_objects.remaining());
            checkSafe(event, 1);
        }
        return nclEnqueueMakeBuffersResidentAMD(command_queue, mem_objects.remaining(), memAddress(mem_objects), blocking_make_resident ? 1 : 0, bus_addresses.address(), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

}