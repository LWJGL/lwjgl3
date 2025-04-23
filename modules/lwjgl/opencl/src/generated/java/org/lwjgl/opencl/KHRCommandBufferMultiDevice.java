/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class KHRCommandBufferMultiDevice {

    public static final int CL_PLATFORM_COMMAND_BUFFER_CAPABILITIES_KHR = 0x908;

    public static final int
        CL_COMMAND_BUFFER_PLATFORM_UNIVERSAL_SYNC_KHR  = 1 << 0,
        CL_COMMAND_BUFFER_PLATFORM_REMAP_QUEUES_KHR    = 1 << 1,
        CL_COMMAND_BUFFER_PLATFORM_AUTOMATIC_REMAP_KHR = 1 << 2;

    public static final int
        CL_DEVICE_COMMAND_BUFFER_NUM_SYNC_DEVICES_KHR = 0x12AB,
        CL_DEVICE_COMMAND_BUFFER_SYNC_DEVICES_KHR     = 0x12AC;

    public static final int CL_COMMAND_BUFFER_CAPABILITY_MULTIPLE_QUEUE_KHR = 1 << 4;

    public static final int CL_COMMAND_BUFFER_DEVICE_SIDE_SYNC_KHR = 1 << 2;

    protected KHRCommandBufferMultiDevice() {
        throw new UnsupportedOperationException();
    }

    // --- [ clRemapCommandBufferKHR ] ---

    /** {@code cl_command_buffer_khr clRemapCommandBufferKHR(cl_command_buffer_khr command_buffer, cl_bool automatic, cl_uint num_queues, cl_command_queue const * queues, cl_uint num_handles, cl_mutable_command_khr const * handles, cl_mutable_command_khr * handles_ret, cl_int * errcode_ret)} */
    public static long nclRemapCommandBufferKHR(long command_buffer, int automatic, int num_queues, long queues, int num_handles, long handles, long handles_ret, long errcode_ret) {
        long __functionAddress = CL.getICD().clRemapCommandBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
        }
        return callPPPPPP(command_buffer, automatic, num_queues, queues, num_handles, handles, handles_ret, errcode_ret, __functionAddress);
    }

    /** {@code cl_command_buffer_khr clRemapCommandBufferKHR(cl_command_buffer_khr command_buffer, cl_bool automatic, cl_uint num_queues, cl_command_queue const * queues, cl_uint num_handles, cl_mutable_command_khr const * handles, cl_mutable_command_khr * handles_ret, cl_int * errcode_ret)} */
    @NativeType("cl_command_buffer_khr")
    public static long clRemapCommandBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_bool") boolean automatic, @NativeType("cl_command_queue const *") PointerBuffer queues, @NativeType("cl_mutable_command_khr const *") @Nullable PointerBuffer handles, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer handles_ret, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(handles_ret, remainingSafe(handles));
            checkSafe(errcode_ret, 1);
        }
        return nclRemapCommandBufferKHR(command_buffer, automatic ? 1 : 0, queues.remaining(), memAddress(queues), remainingSafe(handles), memAddressSafe(handles), memAddressSafe(handles_ret), memAddressSafe(errcode_ret));
    }

    /** {@code cl_command_buffer_khr clRemapCommandBufferKHR(cl_command_buffer_khr command_buffer, cl_bool automatic, cl_uint num_queues, cl_command_queue const * queues, cl_uint num_handles, cl_mutable_command_khr const * handles, cl_mutable_command_khr * handles_ret, cl_int * errcode_ret)} */
    @NativeType("cl_command_buffer_khr")
    public static long clRemapCommandBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_bool") boolean automatic, @NativeType("cl_command_queue const *") PointerBuffer queues, @NativeType("cl_mutable_command_khr const *") @Nullable PointerBuffer handles, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer handles_ret, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clRemapCommandBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkSafe(handles_ret, remainingSafe(handles));
            checkSafe(errcode_ret, 1);
        }
        return callPPPPPP(command_buffer, automatic ? 1 : 0, queues.remaining(), memAddress(queues), remainingSafe(handles), memAddressSafe(handles), memAddressSafe(handles_ret), errcode_ret, __functionAddress);
    }

}