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

public class CL11 extends CL10 {

    public static final int
        CL_MISALIGNED_SUB_BUFFER_OFFSET              = -13,
        CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST = -14,
        CL_INVALID_PROPERTY                          = -64;

    public static final int CL_VERSION_1_1 = 0x1;

    public static final int
        CL_DEVICE_PREFERRED_VECTOR_WIDTH_HALF = 0x1034,
        CL_DEVICE_HOST_UNIFIED_MEMORY         = 0x1035,
        CL_DEVICE_NATIVE_VECTOR_WIDTH_CHAR    = 0x1036,
        CL_DEVICE_NATIVE_VECTOR_WIDTH_SHORT   = 0x1037,
        CL_DEVICE_NATIVE_VECTOR_WIDTH_INT     = 0x1038,
        CL_DEVICE_NATIVE_VECTOR_WIDTH_LONG    = 0x1039,
        CL_DEVICE_NATIVE_VECTOR_WIDTH_FLOAT   = 0x103A,
        CL_DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE  = 0x103B,
        CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF    = 0x103C,
        CL_DEVICE_OPENCL_C_VERSION            = 0x103D;

    public static final int CL_FP_SOFT_FLOAT = 1 << 6;

    public static final int CL_CONTEXT_NUM_DEVICES = 0x1083;

    public static final int
        CL_Rx   = 0x10BA,
        CL_RGx  = 0x10BB,
        CL_RGBx = 0x10BC;

    public static final int
        CL_MEM_ASSOCIATED_MEMOBJECT = 0x1107,
        CL_MEM_OFFSET               = 0x1108;

    public static final int CL_ADDRESS_MIRRORED_REPEAT = 0x1134;

    public static final int
        CL_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE = 0x11B3,
        CL_KERNEL_PRIVATE_MEM_SIZE                   = 0x11B4;

    public static final int CL_EVENT_CONTEXT = 0x11D4;

    public static final int
        CL_COMMAND_READ_BUFFER_RECT  = 0x1201,
        CL_COMMAND_WRITE_BUFFER_RECT = 0x1202,
        CL_COMMAND_COPY_BUFFER_RECT  = 0x1203,
        CL_COMMAND_USER              = 0x1204;

    public static final int CL_BUFFER_CREATE_TYPE_REGION = 0x1220;

    protected CL11() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateSubBuffer ] ---

    /** {@code cl_mem clCreateSubBuffer(cl_mem buffer, cl_mem_flags flags, cl_buffer_create_type buffer_create_type, void const * buffer_create_info, cl_int * errcode_ret)} */
    public static long nclCreateSubBuffer(long buffer, long flags, int buffer_create_type, long buffer_create_info, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSubBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(buffer);
        }
        return callPJPPP(buffer, flags, buffer_create_type, buffer_create_info, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateSubBuffer(cl_mem buffer, cl_mem_flags flags, cl_buffer_create_type buffer_create_type, void const * buffer_create_info, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateSubBuffer(@NativeType("cl_mem") long buffer, @NativeType("cl_mem_flags") long flags, @NativeType("cl_buffer_create_type") int buffer_create_type, @NativeType("void const *") ByteBuffer buffer_create_info, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateSubBuffer(buffer, flags, buffer_create_type, memAddress(buffer_create_info), memAddressSafe(errcode_ret));
    }

    // --- [ clSetMemObjectDestructorCallback ] ---

    /** {@code cl_int clSetMemObjectDestructorCallback(cl_mem memobj, void (*) (cl_mem, void *) pfn_notify, void * user_data)} */
    public static int nclSetMemObjectDestructorCallback(long memobj, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clSetMemObjectDestructorCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(memobj);
        }
        return callPPPI(memobj, pfn_notify, user_data, __functionAddress);
    }

    /** {@code cl_int clSetMemObjectDestructorCallback(cl_mem memobj, void (*) (cl_mem, void *) pfn_notify, void * user_data)} */
    @NativeType("cl_int")
    public static int clSetMemObjectDestructorCallback(@NativeType("cl_mem") long memobj, @NativeType("void (*) (cl_mem, void *)") CLMemObjectDestructorCallbackI pfn_notify, @NativeType("void *") long user_data) {
        return nclSetMemObjectDestructorCallback(memobj, pfn_notify.address(), user_data);
    }

    // --- [ clEnqueueReadBufferRect ] ---

    /** {@code cl_int clEnqueueReadBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueReadBufferRect(long command_queue, long buffer, int blocking_read, long buffer_origin, long host_origin, long region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReadBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
        }
        return callPPPPPPPPPPPPI(command_queue, buffer, blocking_read, buffer_origin, host_origin, region, buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueReadBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") ByteBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadBufferRect(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") ShortBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadBufferRect(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") IntBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadBufferRect(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") FloatBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadBufferRect(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") DoubleBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadBufferRect(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueWriteBufferRect ] ---

    /** {@code cl_int clEnqueueWriteBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueWriteBufferRect(long command_queue, long buffer, int blocking_write, long buffer_origin, long host_origin, long region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
        }
        return callPPPPPPPPPPPPI(command_queue, buffer, blocking_write, buffer_origin, host_origin, region, buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBufferRect(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") ShortBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBufferRect(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") IntBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBufferRect(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") FloatBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBufferRect(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") DoubleBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBufferRect(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueCopyBufferRect ] ---

    /** {@code cl_int clEnqueueCopyBufferRect(cl_command_queue command_queue, cl_mem src_buffer, cl_mem dst_buffer, size_t * src_origin, size_t * dst_origin, size_t * region, size_t src_row_pitch, size_t src_slice_pitch, size_t dst_row_pitch, size_t dst_slice_pitch, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueCopyBufferRect(long command_queue, long src_buffer, long dst_buffer, long src_origin, long dst_origin, long region, long src_row_pitch, long src_slice_pitch, long dst_row_pitch, long dst_slice_pitch, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCopyBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(src_buffer);
            check(dst_buffer);
        }
        return callPPPPPPPPPPPPI(command_queue, src_buffer, dst_buffer, src_origin, dst_origin, region, src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueCopyBufferRect(cl_command_queue command_queue, cl_mem src_buffer, cl_mem dst_buffer, size_t * src_origin, size_t * dst_origin, size_t * region, size_t src_row_pitch, size_t src_slice_pitch, size_t dst_row_pitch, size_t dst_slice_pitch, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueCopyBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t *") PointerBuffer src_origin, @NativeType("size_t *") PointerBuffer dst_origin, @NativeType("size_t *") PointerBuffer region, @NativeType("size_t") long src_row_pitch, @NativeType("size_t") long src_slice_pitch, @NativeType("size_t") long dst_row_pitch, @NativeType("size_t") long dst_slice_pitch, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueCopyBufferRect(command_queue, src_buffer, dst_buffer, memAddress(src_origin), memAddress(dst_origin), memAddress(region), src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clCreateUserEvent ] ---

    /** {@code cl_event clCreateUserEvent(cl_context context, cl_int * errcode_ret)} */
    public static long nclCreateUserEvent(long context, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateUserEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPP(context, errcode_ret, __functionAddress);
    }

    /** {@code cl_event clCreateUserEvent(cl_context context, cl_int * errcode_ret)} */
    @NativeType("cl_event")
    public static long clCreateUserEvent(@NativeType("cl_context") long context, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateUserEvent(context, memAddressSafe(errcode_ret));
    }

    // --- [ clSetUserEventStatus ] ---

    /** {@code cl_int clSetUserEventStatus(cl_event event, cl_int execution_status)} */
    @NativeType("cl_int")
    public static int clSetUserEventStatus(@NativeType("cl_event") long event, @NativeType("cl_int") int execution_status) {
        long __functionAddress = CL.getICD().clSetUserEventStatus;
        if (CHECKS) {
            check(__functionAddress);
            check(event);
        }
        return callPI(event, execution_status, __functionAddress);
    }

    // --- [ clSetEventCallback ] ---

    /** {@code cl_int clSetEventCallback(cl_event event, cl_int command_exec_callback_type, void (*) (cl_event, cl_int, void *) pfn_notify, void * user_data)} */
    public static int nclSetEventCallback(long event, int command_exec_callback_type, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clSetEventCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(event);
        }
        return callPPPI(event, command_exec_callback_type, pfn_notify, user_data, __functionAddress);
    }

    /** {@code cl_int clSetEventCallback(cl_event event, cl_int command_exec_callback_type, void (*) (cl_event, cl_int, void *) pfn_notify, void * user_data)} */
    @NativeType("cl_int")
    public static int clSetEventCallback(@NativeType("cl_event") long event, @NativeType("cl_int") int command_exec_callback_type, @NativeType("void (*) (cl_event, cl_int, void *)") CLEventCallbackI pfn_notify, @NativeType("void *") long user_data) {
        return nclSetEventCallback(event, command_exec_callback_type, pfn_notify.address(), user_data);
    }

    /** {@code cl_mem clCreateSubBuffer(cl_mem buffer, cl_mem_flags flags, cl_buffer_create_type buffer_create_type, void const * buffer_create_info, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateSubBuffer(@NativeType("cl_mem") long buffer, @NativeType("cl_mem_flags") long flags, @NativeType("cl_buffer_create_type") int buffer_create_type, @NativeType("void const *") ByteBuffer buffer_create_info, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSubBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(buffer);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPP(buffer, flags, buffer_create_type, memAddress(buffer_create_info), errcode_ret, __functionAddress);
    }

    /** {@code cl_int clEnqueueReadBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") short[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBufferRect;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueReadBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") int[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBufferRect;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueReadBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") float[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBufferRect;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueReadBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") double[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBufferRect;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") short[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBufferRect;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") int[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBufferRect;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") float[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBufferRect;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteBufferRect(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t const * buffer_origin, size_t const * host_origin, size_t const * region, size_t buffer_row_pitch, size_t buffer_slice_pitch, size_t host_row_pitch, size_t host_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_origin, @NativeType("size_t const *") PointerBuffer host_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") double[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBufferRect;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_origin, 3);
            check(host_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_origin), memAddress(host_origin), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_event clCreateUserEvent(cl_context context, cl_int * errcode_ret)} */
    @NativeType("cl_event")
    public static long clCreateUserEvent(@NativeType("cl_context") long context, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateUserEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPPP(context, errcode_ret, __functionAddress);
    }

}