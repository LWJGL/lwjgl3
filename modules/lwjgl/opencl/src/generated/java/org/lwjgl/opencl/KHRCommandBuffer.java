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
import static org.lwjgl.system.Pointer.*;

public class KHRCommandBuffer {

    public static final int
        CL_DEVICE_COMMAND_BUFFER_CAPABILITIES_KHR               = 0x12A9,
        CL_DEVICE_COMMAND_BUFFER_SUPPORTED_QUEUE_PROPERTIES_KHR = 0x129A,
        CL_DEVICE_COMMAND_BUFFER_REQUIRED_QUEUE_PROPERTIES_KHR  = 0x12AA;

    public static final int
        CL_COMMAND_BUFFER_CAPABILITY_KERNEL_PRINTF_KHR       = 0x1 << 0,
        CL_COMMAND_BUFFER_CAPABILITY_DEVICE_SIDE_ENQUEUE_KHR = 0x1 << 1,
        CL_COMMAND_BUFFER_CAPABILITY_SIMULTANEOUS_USE_KHR    = 0x1 << 2;

    public static final int
        CL_COMMAND_BUFFER_STATE_RECORDING_KHR  = 0x0,
        CL_COMMAND_BUFFER_STATE_EXECUTABLE_KHR = 0x1,
        CL_COMMAND_BUFFER_STATE_PENDING_KHR    = 0x2;

    public static final int
        CL_INVALID_COMMAND_BUFFER_KHR       = -1138,
        CL_INVALID_SYNC_POINT_WAIT_LIST_KHR = -1139,
        CL_INCOMPATIBLE_COMMAND_QUEUE_KHR   = -1140;

    public static final int CL_COMMAND_BUFFER_FLAGS_KHR = 0x1293;

    public static final int CL_COMMAND_BUFFER_SIMULTANEOUS_USE_KHR = 0x1 << 0;

    public static final int
        CL_COMMAND_BUFFER_QUEUES_KHR           = 0x1294,
        CL_COMMAND_BUFFER_NUM_QUEUES_KHR       = 0x1295,
        CL_COMMAND_BUFFER_REFERENCE_COUNT_KHR  = 0x1296,
        CL_COMMAND_BUFFER_STATE_KHR            = 0x1297,
        CL_COMMAND_BUFFER_PROPERTIES_ARRAY_KHR = 0x1298,
        CL_COMMAND_BUFFER_CONTEXT_KHR          = 0x1299;

    public static final int CL_COMMAND_COMMAND_BUFFER_KHR = 0x12A8;

    protected KHRCommandBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateCommandBufferKHR ] ---

    /** {@code cl_command_buffer_khr clCreateCommandBufferKHR(cl_uint num_queues, cl_command_queue const * queues, cl_command_buffer_properties_khr const * properties, cl_int * errcode_ret)} */
    public static long nclCreateCommandBufferKHR(int num_queues, long queues, long properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPP(num_queues, queues, properties, errcode_ret, __functionAddress);
    }

    /** {@code cl_command_buffer_khr clCreateCommandBufferKHR(cl_uint num_queues, cl_command_queue const * queues, cl_command_buffer_properties_khr const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_buffer_khr")
    public static long clCreateCommandBufferKHR(@NativeType("cl_command_queue const *") PointerBuffer queues, @NativeType("cl_command_buffer_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateCommandBufferKHR(queues.remaining(), memAddress(queues), memAddressSafe(properties), memAddressSafe(errcode_ret));
    }

    // --- [ clRetainCommandBufferKHR ] ---

    /** {@code cl_int clRetainCommandBufferKHR(cl_command_buffer_khr command_buffer)} */
    @NativeType("cl_int")
    public static int clRetainCommandBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer) {
        long __functionAddress = CL.getICD().clRetainCommandBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
        }
        return callPI(command_buffer, __functionAddress);
    }

    // --- [ clReleaseCommandBufferKHR ] ---

    /** {@code cl_int clReleaseCommandBufferKHR(cl_command_buffer_khr command_buffer)} */
    @NativeType("cl_int")
    public static int clReleaseCommandBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer) {
        long __functionAddress = CL.getICD().clReleaseCommandBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
        }
        return callPI(command_buffer, __functionAddress);
    }

    // --- [ clFinalizeCommandBufferKHR ] ---

    /** {@code cl_int clFinalizeCommandBufferKHR(cl_command_buffer_khr command_buffer)} */
    @NativeType("cl_int")
    public static int clFinalizeCommandBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer) {
        long __functionAddress = CL.getICD().clFinalizeCommandBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
        }
        return callPI(command_buffer, __functionAddress);
    }

    // --- [ clEnqueueCommandBufferKHR ] ---

    /** {@code cl_int clEnqueueCommandBufferKHR(cl_uint num_queues, cl_command_queue * queues, cl_command_buffer_khr command_buffer, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueCommandBufferKHR(int num_queues, long queues, long command_buffer, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCommandBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
        }
        return callPPPPI(num_queues, queues, command_buffer, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueCommandBufferKHR(cl_uint num_queues, cl_command_queue * queues, cl_command_buffer_khr command_buffer, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueCommandBufferKHR(@NativeType("cl_command_queue *") @Nullable PointerBuffer queues, @NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueCommandBufferKHR(remainingSafe(queues), memAddressSafe(queues), command_buffer, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clCommandBarrierWithWaitListKHR ] ---

    /** {@code cl_int clCommandBarrierWithWaitListKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    public static int nclCommandBarrierWithWaitListKHR(long command_buffer, long command_queue, long properties, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandBarrierWithWaitListKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
        }
        return callPPPPPPI(command_buffer, command_queue, properties, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /** {@code cl_int clCommandBarrierWithWaitListKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandBarrierWithWaitListKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandBarrierWithWaitListKHR(command_buffer, command_queue, memAddressSafe(properties), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandCopyBufferKHR ] ---

    /** {@code cl_int clCommandCopyBufferKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_buffer, cl_mem dst_buffer, size_t src_offset, size_t dst_offset, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    public static int nclCommandCopyBufferKHR(long command_buffer, long command_queue, long properties, long src_buffer, long dst_buffer, long src_offset, long dst_offset, long size, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_buffer);
            check(dst_buffer);
        }
        return callPPPPPPPPPPPI(command_buffer, command_queue, properties, src_buffer, dst_buffer, src_offset, dst_offset, size, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /** {@code cl_int clCommandCopyBufferKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_buffer, cl_mem dst_buffer, size_t src_offset, size_t dst_offset, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandCopyBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t") long src_offset, @NativeType("size_t") long dst_offset, @NativeType("size_t") long size, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandCopyBufferKHR(command_buffer, command_queue, memAddressSafe(properties), src_buffer, dst_buffer, src_offset, dst_offset, size, remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandCopyBufferRectKHR ] ---

    /** {@code cl_int clCommandCopyBufferRectKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_buffer, cl_mem dst_buffer, size_t const * src_origin, size_t const * dst_origin, size_t const * region, size_t src_row_pitch, size_t src_slice_pitch, size_t dst_row_pitch, size_t dst_slice_pitch, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    public static int nclCommandCopyBufferRectKHR(long command_buffer, long command_queue, long properties, long src_buffer, long dst_buffer, long src_origin, long dst_origin, long region, long src_row_pitch, long src_slice_pitch, long dst_row_pitch, long dst_slice_pitch, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferRectKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_buffer);
            check(dst_buffer);
        }
        return callPPPPPPPPPPPPPPPI(command_buffer, command_queue, properties, src_buffer, dst_buffer, src_origin, dst_origin, region, src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /** {@code cl_int clCommandCopyBufferRectKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_buffer, cl_mem dst_buffer, size_t const * src_origin, size_t const * dst_origin, size_t const * region, size_t src_row_pitch, size_t src_slice_pitch, size_t dst_row_pitch, size_t dst_slice_pitch, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandCopyBufferRectKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long src_row_pitch, @NativeType("size_t") long src_slice_pitch, @NativeType("size_t") long dst_row_pitch, @NativeType("size_t") long dst_slice_pitch, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandCopyBufferRectKHR(command_buffer, command_queue, memAddressSafe(properties), src_buffer, dst_buffer, memAddress(src_origin), memAddress(dst_origin), memAddress(region), src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandCopyBufferToImageKHR ] ---

    /** {@code cl_int clCommandCopyBufferToImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_buffer, cl_mem dst_image, size_t src_offset, size_t const * dst_origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    public static int nclCommandCopyBufferToImageKHR(long command_buffer, long command_queue, long properties, long src_buffer, long dst_image, long src_offset, long dst_origin, long region, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferToImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_buffer);
            check(dst_image);
        }
        return callPPPPPPPPPPPI(command_buffer, command_queue, properties, src_buffer, dst_image, src_offset, dst_origin, region, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /** {@code cl_int clCommandCopyBufferToImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_buffer, cl_mem dst_image, size_t src_offset, size_t const * dst_origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandCopyBufferToImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_image, @NativeType("size_t") long src_offset, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandCopyBufferToImageKHR(command_buffer, command_queue, memAddressSafe(properties), src_buffer, dst_image, src_offset, memAddress(dst_origin), memAddress(region), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandCopyImageKHR ] ---

    /** {@code cl_int clCommandCopyImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_image, cl_mem dst_image, size_t const * src_origin, size_t const * dst_origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    public static int nclCommandCopyImageKHR(long command_buffer, long command_queue, long properties, long src_image, long dst_image, long src_origin, long dst_origin, long region, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_image);
            check(dst_image);
        }
        return callPPPPPPPPPPPI(command_buffer, command_queue, properties, src_image, dst_image, src_origin, dst_origin, region, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /** {@code cl_int clCommandCopyImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_image, cl_mem dst_image, size_t const * src_origin, size_t const * dst_origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandCopyImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_image, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandCopyImageKHR(command_buffer, command_queue, memAddressSafe(properties), src_image, dst_image, memAddress(src_origin), memAddress(dst_origin), memAddress(region), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandCopyImageToBufferKHR ] ---

    /** {@code cl_int clCommandCopyImageToBufferKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_image, cl_mem dst_buffer, size_t const * src_origin, size_t const * region, size_t dst_offset, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    public static int nclCommandCopyImageToBufferKHR(long command_buffer, long command_queue, long properties, long src_image, long dst_buffer, long src_origin, long region, long dst_offset, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyImageToBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_image);
            check(dst_buffer);
        }
        return callPPPPPPPPPPPI(command_buffer, command_queue, properties, src_image, dst_buffer, src_origin, region, dst_offset, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /** {@code cl_int clCommandCopyImageToBufferKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_image, cl_mem dst_buffer, size_t const * src_origin, size_t const * region, size_t dst_offset, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandCopyImageToBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long dst_offset, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            check(src_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandCopyImageToBufferKHR(command_buffer, command_queue, memAddressSafe(properties), src_image, dst_buffer, memAddress(src_origin), memAddress(region), dst_offset, remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandFillBufferKHR ] ---

    /** {@code cl_int clCommandFillBufferKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem buffer, void const * pattern, size_t pattern_size, size_t offset, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    public static int nclCommandFillBufferKHR(long command_buffer, long command_queue, long properties, long buffer, long pattern, long pattern_size, long offset, long size, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(buffer);
        }
        return callPPPPPPPPPPPI(command_buffer, command_queue, properties, buffer, pattern, pattern_size, offset, size, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /** {@code cl_int clCommandFillBufferKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem buffer, void const * pattern, size_t pattern_size, size_t offset, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandFillBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_mem") long buffer, @NativeType("void const *") ByteBuffer pattern, @NativeType("size_t") long offset, @NativeType("size_t") long size, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandFillBufferKHR(command_buffer, command_queue, memAddressSafe(properties), buffer, memAddress(pattern), pattern.remaining(), offset, size, remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandFillImageKHR ] ---

    /** {@code cl_int clCommandFillImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    public static int nclCommandFillImageKHR(long command_buffer, long command_queue, long properties, long image, long fill_color, long origin, long region, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(image);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, properties, image, fill_color, origin, region, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /** {@code cl_int clCommandFillImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_mem") long image, @NativeType("void const *") ByteBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            check(fill_color, 16);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandFillImageKHR(command_buffer, command_queue, memAddressSafe(properties), image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    /** {@code cl_int clCommandFillImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_mem") long image, @NativeType("void const *") IntBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandFillImageKHR(command_buffer, command_queue, memAddressSafe(properties), image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    /** {@code cl_int clCommandFillImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_mem") long image, @NativeType("void const *") FloatBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandFillImageKHR(command_buffer, command_queue, memAddressSafe(properties), image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandNDRangeKernelKHR ] ---

    /** {@code cl_int clCommandNDRangeKernelKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_ndrange_kernel_command_properties_khr const * properties, cl_kernel kernel, cl_uint work_dim, size_t const * global_work_offset, size_t const * global_work_size, size_t const * local_work_size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    public static int nclCommandNDRangeKernelKHR(long command_buffer, long command_queue, long properties, long kernel, int work_dim, long global_work_offset, long global_work_size, long local_work_size, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandNDRangeKernelKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(kernel);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, properties, kernel, work_dim, global_work_offset, global_work_size, local_work_size, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /** {@code cl_int clCommandNDRangeKernelKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_ndrange_kernel_command_properties_khr const * properties, cl_kernel kernel, cl_uint work_dim, size_t const * global_work_offset, size_t const * global_work_size, size_t const * local_work_size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandNDRangeKernelKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_ndrange_kernel_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int work_dim, @NativeType("size_t const *") @Nullable PointerBuffer global_work_offset, @NativeType("size_t const *") @Nullable PointerBuffer global_work_size, @NativeType("size_t const *") @Nullable PointerBuffer local_work_size, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(global_work_offset, work_dim);
            checkSafe(global_work_size, work_dim);
            checkSafe(local_work_size, work_dim);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandNDRangeKernelKHR(command_buffer, command_queue, memAddressSafe(properties), kernel, work_dim, memAddressSafe(global_work_offset), memAddressSafe(global_work_size), memAddressSafe(local_work_size), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clGetCommandBufferInfoKHR ] ---

    /** {@code cl_int clGetCommandBufferInfoKHR(cl_command_buffer_khr command_buffer, cl_command_buffer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetCommandBufferInfoKHR(long command_buffer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetCommandBufferInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
        }
        return callPPPPI(command_buffer, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetCommandBufferInfoKHR(cl_command_buffer_khr command_buffer, cl_command_buffer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetCommandBufferInfoKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_buffer_info_khr") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandBufferInfoKHR(command_buffer, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetCommandBufferInfoKHR(cl_command_buffer_khr command_buffer, cl_command_buffer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetCommandBufferInfoKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_buffer_info_khr") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandBufferInfoKHR(command_buffer, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetCommandBufferInfoKHR(cl_command_buffer_khr command_buffer, cl_command_buffer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetCommandBufferInfoKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_buffer_info_khr") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandBufferInfoKHR(command_buffer, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCommandSVMMemcpyKHR ] ---

    /** {@code cl_int clCommandSVMMemcpyKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, void * dst_ptr, void const * src_ptr, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    public static int nclCommandSVMMemcpyKHR(long command_buffer, long command_queue, long properties, long dst_ptr, long src_ptr, long size, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandSVMMemcpyKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(command_queue);
        }
        return callPPPPPPPPPI(command_buffer, command_queue, properties, dst_ptr, src_ptr, size, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /** {@code cl_int clCommandSVMMemcpyKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, void * dst_ptr, void const * src_ptr, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandSVMMemcpyKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("void *") ByteBuffer dst_ptr, @NativeType("void const *") ByteBuffer src_ptr, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            check(src_ptr, dst_ptr.remaining());
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandSVMMemcpyKHR(command_buffer, command_queue, memAddressSafe(properties), memAddress(dst_ptr), memAddress(src_ptr), dst_ptr.remaining(), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandSVMMemFillKHR ] ---

    /** {@code cl_int clCommandSVMMemFillKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, void * svm_ptr, void const * pattern, size_t pattern_size, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    public static int nclCommandSVMMemFillKHR(long command_buffer, long command_queue, long properties, long svm_ptr, long pattern, long pattern_size, long size, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandSVMMemFillKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(command_queue);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, properties, svm_ptr, pattern, pattern_size, size, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /** {@code cl_int clCommandSVMMemFillKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, void * svm_ptr, void const * pattern, size_t pattern_size, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandSVMMemFillKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") @Nullable LongBuffer properties, @NativeType("void *") ByteBuffer svm_ptr, @NativeType("void const *") ByteBuffer pattern, @NativeType("cl_sync_point_khr const *") @Nullable IntBuffer sync_point_wait_list, @NativeType("cl_sync_point_khr *") @Nullable IntBuffer sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandSVMMemFillKHR(command_buffer, command_queue, memAddressSafe(properties), memAddress(svm_ptr), memAddress(pattern), pattern.remaining(), svm_ptr.remaining(), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    /** {@code cl_command_buffer_khr clCreateCommandBufferKHR(cl_uint num_queues, cl_command_queue const * queues, cl_command_buffer_properties_khr const * properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_buffer_khr")
    public static long clCreateCommandBufferKHR(@NativeType("cl_command_queue const *") PointerBuffer queues, @NativeType("cl_command_buffer_properties_khr const *") long @Nullable [] properties, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPPP(queues.remaining(), memAddress(queues), properties, errcode_ret, __functionAddress);
    }

    /** {@code cl_int clCommandBarrierWithWaitListKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandBarrierWithWaitListKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandBarrierWithWaitListKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkNTSafe(properties);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPI(command_buffer, command_queue, properties, lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clCommandCopyBufferKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_buffer, cl_mem dst_buffer, size_t src_offset, size_t dst_offset, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandCopyBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t") long src_offset, @NativeType("size_t") long dst_offset, @NativeType("size_t") long size, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkNTSafe(properties);
            check(src_buffer);
            check(dst_buffer);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPPI(command_buffer, command_queue, properties, src_buffer, dst_buffer, src_offset, dst_offset, size, lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clCommandCopyBufferRectKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_buffer, cl_mem dst_buffer, size_t const * src_origin, size_t const * dst_origin, size_t const * region, size_t src_row_pitch, size_t src_slice_pitch, size_t dst_row_pitch, size_t dst_slice_pitch, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandCopyBufferRectKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long src_row_pitch, @NativeType("size_t") long src_slice_pitch, @NativeType("size_t") long dst_row_pitch, @NativeType("size_t") long dst_slice_pitch, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferRectKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkNTSafe(properties);
            check(src_buffer);
            check(dst_buffer);
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPPPPPPI(command_buffer, command_queue, properties, src_buffer, dst_buffer, memAddress(src_origin), memAddress(dst_origin), memAddress(region), src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clCommandCopyBufferToImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_buffer, cl_mem dst_image, size_t src_offset, size_t const * dst_origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandCopyBufferToImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_image, @NativeType("size_t") long src_offset, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferToImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkNTSafe(properties);
            check(src_buffer);
            check(dst_image);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPPI(command_buffer, command_queue, properties, src_buffer, dst_image, src_offset, memAddress(dst_origin), memAddress(region), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clCommandCopyImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_image, cl_mem dst_image, size_t const * src_origin, size_t const * dst_origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandCopyImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_image, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkNTSafe(properties);
            check(src_image);
            check(dst_image);
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPPI(command_buffer, command_queue, properties, src_image, dst_image, memAddress(src_origin), memAddress(dst_origin), memAddress(region), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clCommandCopyImageToBufferKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem src_image, cl_mem dst_buffer, size_t const * src_origin, size_t const * region, size_t dst_offset, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandCopyImageToBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long dst_offset, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyImageToBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkNTSafe(properties);
            check(src_image);
            check(dst_buffer);
            check(src_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPPI(command_buffer, command_queue, properties, src_image, dst_buffer, memAddress(src_origin), memAddress(region), dst_offset, lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clCommandFillBufferKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem buffer, void const * pattern, size_t pattern_size, size_t offset, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandFillBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("cl_mem") long buffer, @NativeType("void const *") ByteBuffer pattern, @NativeType("size_t") long offset, @NativeType("size_t") long size, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkNTSafe(properties);
            check(buffer);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPPI(command_buffer, command_queue, properties, buffer, memAddress(pattern), (long)pattern.remaining(), offset, size, lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clCommandFillImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("cl_mem") long image, @NativeType("void const *") ByteBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkNTSafe(properties);
            check(image);
            check(fill_color, 16);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, properties, image, memAddress(fill_color), memAddress(origin), memAddress(region), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clCommandFillImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("cl_mem") long image, @NativeType("void const *") int[] fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkNTSafe(properties);
            check(image);
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, properties, image, fill_color, memAddress(origin), memAddress(region), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clCommandFillImageKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("cl_mem") long image, @NativeType("void const *") float[] fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkNTSafe(properties);
            check(image);
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, properties, image, fill_color, memAddress(origin), memAddress(region), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clCommandNDRangeKernelKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_ndrange_kernel_command_properties_khr const * properties, cl_kernel kernel, cl_uint work_dim, size_t const * global_work_offset, size_t const * global_work_size, size_t const * local_work_size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandNDRangeKernelKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_ndrange_kernel_command_properties_khr const *") long @Nullable [] properties, @NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int work_dim, @NativeType("size_t const *") @Nullable PointerBuffer global_work_offset, @NativeType("size_t const *") @Nullable PointerBuffer global_work_size, @NativeType("size_t const *") @Nullable PointerBuffer local_work_size, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandNDRangeKernelKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkNTSafe(properties);
            check(kernel);
            checkSafe(global_work_offset, work_dim);
            checkSafe(global_work_size, work_dim);
            checkSafe(local_work_size, work_dim);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, properties, kernel, work_dim, memAddressSafe(global_work_offset), memAddressSafe(global_work_size), memAddressSafe(local_work_size), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clGetCommandBufferInfoKHR(cl_command_buffer_khr command_buffer, cl_command_buffer_info_khr param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetCommandBufferInfoKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_buffer_info_khr") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetCommandBufferInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(command_buffer, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clCommandSVMMemcpyKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, void * dst_ptr, void const * src_ptr, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandSVMMemcpyKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("void *") ByteBuffer dst_ptr, @NativeType("void const *") ByteBuffer src_ptr, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandSVMMemcpyKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(command_queue);
            checkNTSafe(properties);
            check(src_ptr, dst_ptr.remaining());
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPI(command_buffer, command_queue, properties, memAddress(dst_ptr), memAddress(src_ptr), (long)dst_ptr.remaining(), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** {@code cl_int clCommandSVMMemFillKHR(cl_command_buffer_khr command_buffer, cl_command_queue command_queue, cl_command_properties_khr const * properties, void * svm_ptr, void const * pattern, size_t pattern_size, size_t size, cl_uint num_sync_points_in_wait_list, cl_sync_point_khr const * sync_point_wait_list, cl_sync_point_khr * sync_point, cl_mutable_command_khr * mutable_handle)} */
    @NativeType("cl_int")
    public static int clCommandSVMMemFillKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_properties_khr const *") long @Nullable [] properties, @NativeType("void *") ByteBuffer svm_ptr, @NativeType("void const *") ByteBuffer pattern, @NativeType("cl_sync_point_khr const *") int @Nullable [] sync_point_wait_list, @NativeType("cl_sync_point_khr *") int @Nullable [] sync_point, @NativeType("cl_mutable_command_khr *") @Nullable PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandSVMMemFillKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(command_queue);
            checkNTSafe(properties);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, properties, memAddress(svm_ptr), memAddress(pattern), (long)pattern.remaining(), (long)svm_ptr.remaining(), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

}