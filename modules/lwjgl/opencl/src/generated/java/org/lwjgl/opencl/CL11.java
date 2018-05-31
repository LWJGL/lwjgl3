/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core OpenCL 1.1 functionality. */
public class CL11 extends CL10 {

    /** Error Codes. */
    public static final int
        CL_MISALIGNED_SUB_BUFFER_OFFSET              = -13,
        CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST = -14,
        CL_INVALID_PROPERTY                          = -64;

    /** OpenCL Version. */
    public static final int CL_VERSION_1_1 = 0x1;

    /** cl_device_info. */
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

    /** cl_device_fp_config - bitfield. */
    public static final int CL_FP_SOFT_FLOAT = 1 << 6;

    /** cl_context_info. */
    public static final int CL_CONTEXT_NUM_DEVICES = 0x1083;

    /** cl_channel_order. */
    public static final int
        CL_Rx   = 0x10BA,
        CL_RGx  = 0x10BB,
        CL_RGBx = 0x10BC;

    /** cl_mem_info. */
    public static final int
        CL_MEM_ASSOCIATED_MEMOBJECT = 0x1107,
        CL_MEM_OFFSET               = 0x1108;

    /** cl_addressing_mode. */
    public static final int CL_ADDRESS_MIRRORED_REPEAT = 0x1134;

    /** cl_kernel_work_group_info. */
    public static final int
        CL_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE = 0x11B3,
        CL_KERNEL_PRIVATE_MEM_SIZE                   = 0x11B4;

    /** cl_event_info. */
    public static final int CL_EVENT_CONTEXT = 0x11D4;

    /** cl_command_type. */
    public static final int
        CL_COMMAND_READ_BUFFER_RECT  = 0x1201,
        CL_COMMAND_WRITE_BUFFER_RECT = 0x1202,
        CL_COMMAND_COPY_BUFFER_RECT  = 0x1203,
        CL_COMMAND_USER              = 0x1204;

    /** cl_buffer_create_type. */
    public static final int CL_BUFFER_CREATE_TYPE_REGION = 0x1220;

    protected CL11() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(CLCapabilities caps) {
        return checkFunctions(
            caps.clCreateSubBuffer, caps.clSetMemObjectDestructorCallback, caps.clEnqueueReadBufferRect, caps.clEnqueueWriteBufferRect, 
            caps.clEnqueueCopyBufferRect, caps.clCreateUserEvent, caps.clSetUserEventStatus, caps.clSetEventCallback
        );
    }

    // --- [ clCreateSubBuffer ] ---

    /** Unsafe version of: {@link #clCreateSubBuffer CreateSubBuffer} */
    public static long nclCreateSubBuffer(long buffer, long flags, int buffer_create_type, long buffer_create_info, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSubBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(buffer);
        }
        return callPJPPP(__functionAddress, buffer, flags, buffer_create_type, buffer_create_info, errcode_ret);
    }

    /**
     * Creates a new buffer object (referred to as a sub-buffer object) from an existing buffer object.
     * 
     * <p><strong>NOTE</strong>: Concurrent reading from, writing to and copying between both a buffer object and its sub-buffer object(s) is undefined.
     * Concurrent reading from, writing to and copying between overlapping sub-buffer objects created with the same buffer object is undefined. Only reading
     * from both a buffer object and its sub-buffer objects or reading from multiple overlapping sub-buffer objects is defined.</p>
     *
     * @param buffer             a valid buffer object and cannot be a sub-buffer object
     * @param flags              a bit-field that is used to specify allocation and usage information about the sub-buffer memory object being created.
     *                           
     *                           <p>If the {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}, {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} or {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} values are not specified in flags, they are
     *                           inherited from the corresponding memory access qualifers associated with buffer. The {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}
     *                           and {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} values cannot be specified in flags but are inherited from the corresponding memory access qualifiers
     *                           associated with buffer. If {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} is specified in the memory access qualifier values associated with buffer it does not
     *                           imply any additional copies when the sub-buffer is created from buffer. If the {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}
     *                           or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} values are not specified in flags, they are inherited from the corresponding memory access qualifiers
     *                           associated with buffer.</p>
     * @param buffer_create_type the type of buffer object to be created. Must be:<br><table><tr><td>{@link #CL_BUFFER_CREATE_TYPE_REGION BUFFER_CREATE_TYPE_REGION}</td></tr></table>
     * @param buffer_create_info details about the buffer object to be created.
     *                           
     *                           <p>When {@code buffer_create_type} is {@link #CL_BUFFER_CREATE_TYPE_REGION BUFFER_CREATE_TYPE_REGION}, then {@code buffer_create_info} is a pointer to a {@link CLBufferRegion}
     *                           structure. {@code (origin, size)} defines the offset and size in bytes in buffer.</p>
     * @param errcode_ret        will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object or is a sub-buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer} was created with {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} and {@code flags} specifies {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}
     *         or {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}, or if {@code buffer} was created with {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} and {@code flags} specifies
     *         {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE} or {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, or if {@code flags} specifies {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or
     *         {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer} was created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} and {@code flags} specify {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY},
     *         or if {@code buffer} was created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} and {@code flags} specify {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, or if
     *         {@code buffer} was created with {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and {@code flags} specify {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if value specified in {@code buffer_create_type} is not valid.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if value(s) specified in {@code buffer_create_info} (for a given {@code buffer_create_type}) is not valid or if
     *         {@code buffer_create_info} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for sub-buffer object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateSubBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateSubBuffer(@NativeType("cl_mem") long buffer, @NativeType("cl_mem_flags") long flags, @NativeType("cl_buffer_create_type") int buffer_create_type, @NativeType("void const *") ByteBuffer buffer_create_info, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateSubBuffer(buffer, flags, buffer_create_type, memAddress(buffer_create_info), memAddressSafe(errcode_ret));
    }

    // --- [ clSetMemObjectDestructorCallback ] ---

    /** Unsafe version of: {@link #clSetMemObjectDestructorCallback SetMemObjectDestructorCallback} */
    public static int nclSetMemObjectDestructorCallback(long memobj, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clSetMemObjectDestructorCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(memobj);
        }
        return callPPPI(__functionAddress, memobj, pfn_notify, user_data);
    }

    /**
     * Registers a user callback function with a memory object. Each call to {@code clSetMemObjectDestructorCallback} registers the specified user callback
     * function on a callback stack associated with {@code memobj}. The registered user callback functions are called in the reverse order in which they were
     * registered. The user callback functions are called and then the memory object's resources are freed and the memory object is deleted. This provides a
     * mechanism for the application (and libraries) using {@code memobj} to be notified when the memory referenced by {@code host_ptr}, specified when the
     * memory object is created and used as the storage bits for the memory object, can be reused or freed.
     *
     * @param memobj     a valid memory object
     * @param pfn_notify the callback function that can be registered by the application. This callback function may be called asynchronously by the OpenCL implementation.
     *                   It is the application's responsibility to ensure that the callback function is thread-safe.
     * @param user_data  will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is not a valid memory object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is NULL.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetMemObjectDestructorCallback.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetMemObjectDestructorCallback(@NativeType("cl_mem") long memobj, @NativeType("void (*) (cl_mem, void *)") CLMemObjectDestructorCallbackI pfn_notify, @NativeType("void *") long user_data) {
        return nclSetMemObjectDestructorCallback(memobj, pfn_notify.address(), user_data);
    }

    // --- [ clEnqueueReadBufferRect ] ---

    /**
     * Unsafe version of: {@link #clEnqueueReadBufferRect EnqueueReadBufferRect}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueReadBufferRect(long command_queue, long buffer, int blocking_read, long buffer_offset, long host_offset, long region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReadBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
        }
        return callPPPPPPPPPPPPI(__functionAddress, command_queue, buffer, blocking_read, buffer_offset, host_offset, region, buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event);
    }

    /**
     * Enqueues a command to read a 2D or 3D rectangular region from a buffer object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadBufferRect} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr} and
     * {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified when the buffer
     * object being read is created with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
     * read command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue      the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer             a valid buffer object
     * @param blocking_read      indicates if the read operation is <em>blocking</em> or <em>nonblocking</em>.
     *                           
     *                           <p>If {@code blocking_read} is {@link CL10#CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadBufferRect} does not return until the buffer data has
     *                           been read and copied into memory pointed to by {@code ptr}.</p>
     *                           
     *                           <p>If {@code blocking_read} is {@link CL10#CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBufferRect} queues a non-blocking read command and
     *                           returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                           returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                           the buffer that {@code ptr} points to can be used by the application.</p>
     * @param buffer_offset      the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]}.
     * @param host_offset        the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]}.
     * @param region             the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
     *                           given by {@code region[2]} should be 1. The values in region cannot be 0.
     * @param buffer_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
     *                           {@code buffer_row_pitch} is computed as {@code region[0]}.
     * @param buffer_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
     *                           {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
     * @param host_row_pitch     the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
     *                           is computed as {@code region[0]}.
     * @param host_slice_pitch   the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
     *                           {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
     * @param ptr                the pointer to buffer in host memory where data is to be read into
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if any {@code region} array element is 0.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") ByteBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadBufferRect(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read a 2D or 3D rectangular region from a buffer object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadBufferRect} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr} and
     * {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified when the buffer
     * object being read is created with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
     * read command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue      the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer             a valid buffer object
     * @param blocking_read      indicates if the read operation is <em>blocking</em> or <em>nonblocking</em>.
     *                           
     *                           <p>If {@code blocking_read} is {@link CL10#CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadBufferRect} does not return until the buffer data has
     *                           been read and copied into memory pointed to by {@code ptr}.</p>
     *                           
     *                           <p>If {@code blocking_read} is {@link CL10#CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBufferRect} queues a non-blocking read command and
     *                           returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                           returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                           the buffer that {@code ptr} points to can be used by the application.</p>
     * @param buffer_offset      the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]}.
     * @param host_offset        the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]}.
     * @param region             the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
     *                           given by {@code region[2]} should be 1. The values in region cannot be 0.
     * @param buffer_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
     *                           {@code buffer_row_pitch} is computed as {@code region[0]}.
     * @param buffer_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
     *                           {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
     * @param host_row_pitch     the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
     *                           is computed as {@code region[0]}.
     * @param host_slice_pitch   the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
     *                           {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
     * @param ptr                the pointer to buffer in host memory where data is to be read into
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if any {@code region} array element is 0.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") ShortBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadBufferRect(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read a 2D or 3D rectangular region from a buffer object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadBufferRect} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr} and
     * {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified when the buffer
     * object being read is created with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
     * read command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue      the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer             a valid buffer object
     * @param blocking_read      indicates if the read operation is <em>blocking</em> or <em>nonblocking</em>.
     *                           
     *                           <p>If {@code blocking_read} is {@link CL10#CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadBufferRect} does not return until the buffer data has
     *                           been read and copied into memory pointed to by {@code ptr}.</p>
     *                           
     *                           <p>If {@code blocking_read} is {@link CL10#CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBufferRect} queues a non-blocking read command and
     *                           returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                           returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                           the buffer that {@code ptr} points to can be used by the application.</p>
     * @param buffer_offset      the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]}.
     * @param host_offset        the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]}.
     * @param region             the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
     *                           given by {@code region[2]} should be 1. The values in region cannot be 0.
     * @param buffer_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
     *                           {@code buffer_row_pitch} is computed as {@code region[0]}.
     * @param buffer_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
     *                           {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
     * @param host_row_pitch     the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
     *                           is computed as {@code region[0]}.
     * @param host_slice_pitch   the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
     *                           {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
     * @param ptr                the pointer to buffer in host memory where data is to be read into
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if any {@code region} array element is 0.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") IntBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadBufferRect(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read a 2D or 3D rectangular region from a buffer object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadBufferRect} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr} and
     * {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified when the buffer
     * object being read is created with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
     * read command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue      the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer             a valid buffer object
     * @param blocking_read      indicates if the read operation is <em>blocking</em> or <em>nonblocking</em>.
     *                           
     *                           <p>If {@code blocking_read} is {@link CL10#CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadBufferRect} does not return until the buffer data has
     *                           been read and copied into memory pointed to by {@code ptr}.</p>
     *                           
     *                           <p>If {@code blocking_read} is {@link CL10#CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBufferRect} queues a non-blocking read command and
     *                           returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                           returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                           the buffer that {@code ptr} points to can be used by the application.</p>
     * @param buffer_offset      the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]}.
     * @param host_offset        the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]}.
     * @param region             the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
     *                           given by {@code region[2]} should be 1. The values in region cannot be 0.
     * @param buffer_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
     *                           {@code buffer_row_pitch} is computed as {@code region[0]}.
     * @param buffer_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
     *                           {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
     * @param host_row_pitch     the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
     *                           is computed as {@code region[0]}.
     * @param host_slice_pitch   the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
     *                           {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
     * @param ptr                the pointer to buffer in host memory where data is to be read into
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if any {@code region} array element is 0.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") FloatBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadBufferRect(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read a 2D or 3D rectangular region from a buffer object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadBufferRect} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr} and
     * {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified when the buffer
     * object being read is created with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
     * read command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue      the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer             a valid buffer object
     * @param blocking_read      indicates if the read operation is <em>blocking</em> or <em>nonblocking</em>.
     *                           
     *                           <p>If {@code blocking_read} is {@link CL10#CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadBufferRect} does not return until the buffer data has
     *                           been read and copied into memory pointed to by {@code ptr}.</p>
     *                           
     *                           <p>If {@code blocking_read} is {@link CL10#CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBufferRect} queues a non-blocking read command and
     *                           returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                           returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                           the buffer that {@code ptr} points to can be used by the application.</p>
     * @param buffer_offset      the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]}.
     * @param host_offset        the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]}.
     * @param region             the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
     *                           given by {@code region[2]} should be 1. The values in region cannot be 0.
     * @param buffer_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
     *                           {@code buffer_row_pitch} is computed as {@code region[0]}.
     * @param buffer_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
     *                           {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
     * @param host_row_pitch     the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
     *                           is computed as {@code region[0]}.
     * @param host_slice_pitch   the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
     *                           {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
     * @param ptr                the pointer to buffer in host memory where data is to be read into
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if any {@code region} array element is 0.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") DoubleBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadBufferRect(command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueWriteBufferRect ] ---

    /**
     * Unsafe version of: {@link #clEnqueueWriteBufferRect EnqueueWriteBufferRect}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueWriteBufferRect(long command_queue, long buffer, int blocking_write, long buffer_offset, long host_offset, long region, long buffer_row_pitch, long buffer_slice_pitch, long host_row_pitch, long host_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
        }
        return callPPPPPPPPPPPPI(__functionAddress, command_queue, buffer, blocking_write, buffer_offset, host_offset, region, buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event);
    }

    /**
     * Enqueues a command to write a 2D or 3D rectangular region to a buffer object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteBufferRect} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
     * {@code host_ptr} and {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified
     * when the buffer object being written is created with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined
     * behavior:</p>
     * 
     * <ul>
     * <li>The host memory region given by {@code (buffer_origin region)} contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue      the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer             a valid buffer object
     * @param blocking_write     indicates if the write operation is <em>blocking</em> or <em>nonblocking</em>.
     *                           
     *                           <p>If {@code blocking_write} is {@link CL10#CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
     *                           command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBufferRect} call returns.</p>
     *                           
     *                           <p>If {@code blocking_write} is {@link CL10#CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
     *                           the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                           {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                           completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param buffer_offset      the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]}.
     * @param host_offset        the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]}.
     * @param region             the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
     *                           given by {@code region[2]} should be 1. The values in region cannot be 0.
     * @param buffer_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
     *                           {@code buffer_row_pitch} is computed as {@code region[0]}.
     * @param buffer_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
     *                           {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
     * @param host_row_pitch     the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
     *                           is computed as {@code region[0]}.
     * @param host_slice_pitch   the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
     *                           {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
     * @param ptr                the pointer to buffer in host memory where data is to be written from
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if any {@code region} array element is 0.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") ByteBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBufferRect(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write a 2D or 3D rectangular region to a buffer object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteBufferRect} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
     * {@code host_ptr} and {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified
     * when the buffer object being written is created with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined
     * behavior:</p>
     * 
     * <ul>
     * <li>The host memory region given by {@code (buffer_origin region)} contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue      the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer             a valid buffer object
     * @param blocking_write     indicates if the write operation is <em>blocking</em> or <em>nonblocking</em>.
     *                           
     *                           <p>If {@code blocking_write} is {@link CL10#CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
     *                           command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBufferRect} call returns.</p>
     *                           
     *                           <p>If {@code blocking_write} is {@link CL10#CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
     *                           the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                           {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                           completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param buffer_offset      the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]}.
     * @param host_offset        the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]}.
     * @param region             the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
     *                           given by {@code region[2]} should be 1. The values in region cannot be 0.
     * @param buffer_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
     *                           {@code buffer_row_pitch} is computed as {@code region[0]}.
     * @param buffer_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
     *                           {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
     * @param host_row_pitch     the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
     *                           is computed as {@code region[0]}.
     * @param host_slice_pitch   the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
     *                           {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
     * @param ptr                the pointer to buffer in host memory where data is to be written from
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if any {@code region} array element is 0.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") ShortBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBufferRect(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write a 2D or 3D rectangular region to a buffer object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteBufferRect} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
     * {@code host_ptr} and {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified
     * when the buffer object being written is created with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined
     * behavior:</p>
     * 
     * <ul>
     * <li>The host memory region given by {@code (buffer_origin region)} contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue      the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer             a valid buffer object
     * @param blocking_write     indicates if the write operation is <em>blocking</em> or <em>nonblocking</em>.
     *                           
     *                           <p>If {@code blocking_write} is {@link CL10#CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
     *                           command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBufferRect} call returns.</p>
     *                           
     *                           <p>If {@code blocking_write} is {@link CL10#CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
     *                           the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                           {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                           completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param buffer_offset      the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]}.
     * @param host_offset        the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]}.
     * @param region             the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
     *                           given by {@code region[2]} should be 1. The values in region cannot be 0.
     * @param buffer_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
     *                           {@code buffer_row_pitch} is computed as {@code region[0]}.
     * @param buffer_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
     *                           {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
     * @param host_row_pitch     the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
     *                           is computed as {@code region[0]}.
     * @param host_slice_pitch   the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
     *                           {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
     * @param ptr                the pointer to buffer in host memory where data is to be written from
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if any {@code region} array element is 0.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") IntBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBufferRect(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write a 2D or 3D rectangular region to a buffer object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteBufferRect} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
     * {@code host_ptr} and {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified
     * when the buffer object being written is created with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined
     * behavior:</p>
     * 
     * <ul>
     * <li>The host memory region given by {@code (buffer_origin region)} contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue      the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer             a valid buffer object
     * @param blocking_write     indicates if the write operation is <em>blocking</em> or <em>nonblocking</em>.
     *                           
     *                           <p>If {@code blocking_write} is {@link CL10#CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
     *                           command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBufferRect} call returns.</p>
     *                           
     *                           <p>If {@code blocking_write} is {@link CL10#CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
     *                           the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                           {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                           completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param buffer_offset      the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]}.
     * @param host_offset        the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]}.
     * @param region             the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
     *                           given by {@code region[2]} should be 1. The values in region cannot be 0.
     * @param buffer_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
     *                           {@code buffer_row_pitch} is computed as {@code region[0]}.
     * @param buffer_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
     *                           {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
     * @param host_row_pitch     the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
     *                           is computed as {@code region[0]}.
     * @param host_slice_pitch   the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
     *                           {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
     * @param ptr                the pointer to buffer in host memory where data is to be written from
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if any {@code region} array element is 0.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") FloatBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBufferRect(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write a 2D or 3D rectangular region to a buffer object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteBufferRect} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
     * {@code host_ptr} and {@code host_origin}, {@code buffer_origin} values are the same, where {@code host_ptr} is a pointer to the memory region specified
     * when the buffer object being written is created with {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined
     * behavior:</p>
     * 
     * <ul>
     * <li>The host memory region given by {@code (buffer_origin region)} contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue      the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer             a valid buffer object
     * @param blocking_write     indicates if the write operation is <em>blocking</em> or <em>nonblocking</em>.
     *                           
     *                           <p>If {@code blocking_write} is {@link CL10#CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
     *                           command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBufferRect} call returns.</p>
     *                           
     *                           <p>If {@code blocking_write} is {@link CL10#CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
     *                           the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                           {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                           completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param buffer_offset      the {@code (x, y, z)} offset in the memory region associated with {@code buffer}. For a 2D rectangle region, the z value given by {@code buffer_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code buffer_origin[2] * buffer_slice_pitch + buffer_origin[1] * buffer_row_pitch + buffer_origin[0]}.
     * @param host_offset        the {@code (x, y, z)} offset in the memory region pointed to by {@code ptr}. For a 2D rectangle region, the z value given by {@code host_origin[2]}
     *                           should be 0. The offset in bytes is computed as {@code host_origin[2] * host_slice_pitch + host_origin[1] * host_row_pitch + host_origin[0]}.
     * @param region             the (width in bytes, height in rows, depth in slices) of the 2D or 3D rectangle being read or written. For a 2D rectangle copy, the depth value
     *                           given by {@code region[2]} should be 1. The values in region cannot be 0.
     * @param buffer_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_row_pitch} is 0,
     *                           {@code buffer_row_pitch} is computed as {@code region[0]}.
     * @param buffer_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code buffer}. If {@code buffer_slice_pitch} is 0,
     *                           {@code buffer_slice_pitch} is computed as {@code region[1] * buffer_row_pitch}.
     * @param host_row_pitch     the length of each row in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_row_pitch} is 0, {@code host_row_pitch}
     *                           is computed as {@code region[0]}.
     * @param host_slice_pitch   the length of each 2D slice in bytes to be used for the memory region pointed to by {@code ptr}. If {@code host_slice_pitch} is 0,
     *                           {@code host_slice_pitch} is computed as {@code region[1] * host_row_pitch}.
     * @param ptr                the pointer to buffer in host memory where data is to be written from
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code (buffer_origin, region, buffer_row_pitch, buffer_slice_pitch)} is out of bounds.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if any {@code region} array element is 0.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code buffer_slice_pitch} is not 0 and is less than {@code region[1] * buffer_row_pitch} and not a multiple of {@code buffer_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_slice_pitch} is not 0 and is less than {@code region[1] * host_row_pitch} and not a multiple of {@code host_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteBufferRect} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") DoubleBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBufferRect(command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueCopyBufferRect ] ---

    /**
     * Unsafe version of: {@link #clEnqueueCopyBufferRect EnqueueCopyBufferRect}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueCopyBufferRect(long command_queue, long src_buffer, long dst_buffer, long src_origin, long dst_origin, long region, long src_row_pitch, long src_slice_pitch, long dst_row_pitch, long dst_slice_pitch, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCopyBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(src_buffer);
            check(dst_buffer);
        }
        return callPPPPPPPPPPPPI(__functionAddress, command_queue, src_buffer, dst_buffer, src_origin, dst_origin, region, src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, num_events_in_wait_list, event_wait_list, event);
    }

    /**
     * Enqueues a command to copy a 2D or 3D rectangular region from the buffer object identified by {@code src_buffer} to a 2D or 3D region in the buffer
     * object identified by {@code dst_buffer}. Copying begins at the source offset and destination offset which are computed as described below in the
     * description for {@code src_origin} and {@code dst_origin}. Each byte of the region's width is copied from the source offset to the destination offset.
     * After copying each width, the source and destination offsets are incremented by their respective source and destination row pitches. After copying each
     * 2D rectangle, the source and destination offsets are incremented by their respective source and destination slice pitches.
     * 
     * <p><strong>NOTE</strong>: If {@code src_buffer} and {@code dst_buffer} are the same buffer object, {@code src_row_pitch} must equal {@code dst_row_pitch}
     * and {@code src_slice_pitch} must equal {@code dst_slice_pitch}.</p>
     *
     * @param command_queue   the command-queue in which the copy command will be queued. The OpenCL context associated with {@code command_queue}, {@code src_buffer} and
     *                        {@code dst_buffer} must be the same.
     * @param src_buffer      the source buffer
     * @param dst_buffer      the destination buffer
     * @param src_origin      the {@code (x, y, z)} offset in the memory region associated with {@code src_buffer}. For a 2D rectangle region, the z value given by {@code src_origin[2]}
     *                        should be 0. The offset in bytes is computed as {@code src_origin[2] * src_slice_pitch + src_origin[1] * src_row_pitch + src_origin[0]}.
     * @param dst_origin      the {@code (x, y, z)} offset in the memory region associated with {@code dst_buffer}. For a 2D rectangle region, the z value given by {@code dst_origin[2]}
     *                        should be 0. The offset in bytes is computed as {@code dst_origin[2] * dst_slice_pitch + dst_origin[1] * dst_row_pitch + dst_origin[0]}.
     * @param region          the ({@code width} in bytes, {@code height} in rows, {@code depth} in slices) of the 2D or 3D rectangle being copied. For a 2D rectangle, the depth
     *                        value given by {@code region[2]} should be 1. The values in {@code region} cannot be 0.
     * @param src_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code src_buffer}. If {@code src_row_pitch} is 0, {@code src_row_pitch}
     *                        is computed as {@code region[0]}.
     * @param src_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code src_buffer}. If {@code src_slice_pitch} is 0,
     *                        {@code src_slice_pitch} is computed as {@code region[1] * src_row_pitch}.
     * @param dst_row_pitch   the length of each row in bytes to be used for the memory region associated with {@code dst_buffer}. If {@code dst_row_pitch} is 0, {@code dst_row_pitch}
     *                        is computed as {@code region[0]}.
     * @param dst_slice_pitch the length of each 2D slice in bytes to be used for the memory region associated with {@code dst_buffer}. If {@code dst_slice_pitch} is 0,
     *                        {@code dst_slice_pitch} is computed as {@code region[1] * dst_row_pitch}.
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_buffer} and {@code dst_buffer} are not the same or
     *         if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code src_buffer} and {@code dst_buffer} are not valid buffer objects.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code (src_origin, region, src_row_pitch, src_slice_pitch)} or {@code (dst_origin, region, dst_row_pitch, dst_slice_pitch)}
     *         require accessing elements outside the {@code src_buffer} and {@code dst_buffer} buffer objects respectively.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if any {@code region} array element is 0.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code src_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code dst_row_pitch} is not 0 and is less than {@code region[0]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code src_slice_pitch} is not 0 and is less than {@code region[1] * src_row_pitch} or if {@code src_slice_pitch}
     *         is not 0 and is not a multiple of {@code src_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code dst_slice_pitch} is not 0 and is less than {@code region[1] * dst_row_pitch} or if {@code dst_slice_pitch}
     *         is not 0 and is not a multiple of {@code dst_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code src_buffer} and {@code dst_buffer} are the same buffer object and {@code src_slice_pitch} is not equal to
     *         {@code dst_slice_pitch} and {@code src_row_pitch} is not equal to {@code dst_row_pitch}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL10#CL_MEM_COPY_OVERLAP MEM_COPY_OVERLAP} if {@code src_buffer} and {@code dst_buffer} are the same buffer or subbuffer object and the source and destination
     *         regions overlap or if {@code src_buffer} and {@code dst_buffer} are different sub-buffers of the same associated buffer object and they overlap.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code src_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code dst_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_buffer} or {@code dst_buffer}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueCopyBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueCopyBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t *") PointerBuffer src_origin, @NativeType("size_t *") PointerBuffer dst_origin, @NativeType("size_t *") PointerBuffer region, @NativeType("size_t") long src_row_pitch, @NativeType("size_t") long src_slice_pitch, @NativeType("size_t") long dst_row_pitch, @NativeType("size_t") long dst_slice_pitch, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueCopyBufferRect(command_queue, src_buffer, dst_buffer, memAddress(src_origin), memAddress(dst_origin), memAddress(region), src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clCreateUserEvent ] ---

    /** Unsafe version of: {@link #clCreateUserEvent CreateUserEvent} */
    public static long nclCreateUserEvent(long context, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateUserEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPP(__functionAddress, context, errcode_ret);
    }

    /**
     * Creates a user event object. User events allow applications to enqueue commands that wait on a user event to finish before the command is executed by
     * the device.
     * 
     * <p>The execution status of the user event object created is set to {@link CL10#CL_SUBMITTED SUBMITTED}.</p>
     *
     * @param context     a valid OpenCL context
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero event object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the user event object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateUserEvent.html">Reference Page</a>
     */
    @NativeType("cl_event")
    public static long clCreateUserEvent(@NativeType("cl_context") long context, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateUserEvent(context, memAddressSafe(errcode_ret));
    }

    // --- [ clSetUserEventStatus ] ---

    /**
     * Sets the execution status of a user event object.
     * 
     * <p><strong>NOTE</strong>: Enqueued commands that specify user events in the {@code event_wait_list} argument of {@code clEnqueue***} commands must ensure
     * that the status of these user events being waited on are set using {@code clSetUserEventStatus} before any OpenCL APIs that release OpenCL objects
     * except for event objects are called; otherwise the behavior is undefined.</p>
     * 
     * <p>For example, the following code sequence will result in undefined behavior of {@link CL10#clReleaseMemObject ReleaseMemObject}.</p>
     * 
     * <pre><code>
     * ev1 = clCreateUserEvent(ctx, NULL);
     * clEnqueueWriteBuffer(cq, buf1, CL_FALSE, ..., 1, &amp;ev1, NULL);
     * clEnqueueWriteBuffer(cq, buf2, CL_FALSE, ...);
     * clReleaseMemObject(buf2);
     * clSetUserEventStatus(ev1, CL_COMPLETE);</code></pre>
     * 
     * <p>The following code sequence, however, works correctly.</p>
     * 
     * <pre><code>
     * ev1 = clCreateUserEvent(ctx, NULL);
     * clEnqueueWriteBuffer(cq, buf1, CL_FALSE, ..., 1, &amp;ev1, NULL);
     * clEnqueueWriteBuffer(cq, buf2, CL_FALSE, ...);
     * clSetUserEventStatus(ev1, CL_COMPLETE);
     * clReleaseMemObject(buf2);</code></pre>
     *
     * @param event            a user event object created using {@link #clCreateUserEvent CreateUserEvent}
     * @param execution_status the new execution status to be set and can be {@link CL10#CL_COMPLETE COMPLETE} or a negative integer value to indicate an error. A negative integer value
     *                         causes all enqueued commands that wait on this user event to be terminated. {@code clSetUserEventStatus} can only be called once to change the
     *                         execution status of event.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_EVENT INVALID_EVENT} if {@code event} is not a valid user event object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the {@code execution_status} is not {@link CL10#CL_COMPLETE COMPLETE} or a negative integer value.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if the {@code execution_status} for event has already been changed by a previous call to {@code clSetUserEventStatus}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetUserEventStatus.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetUserEventStatus(@NativeType("cl_event") long event, @NativeType("cl_int") int execution_status) {
        long __functionAddress = CL.getICD().clSetUserEventStatus;
        if (CHECKS) {
            check(__functionAddress);
            check(event);
        }
        return callPI(__functionAddress, event, execution_status);
    }

    // --- [ clSetEventCallback ] ---

    /** Unsafe version of: {@link #clSetEventCallback SetEventCallback} */
    public static int nclSetEventCallback(long event, int command_exec_callback_type, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clSetEventCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(event);
        }
        return callPPPI(__functionAddress, event, command_exec_callback_type, pfn_notify, user_data);
    }

    /**
     * Registers a user callback function for a specific command execution status. The registered callback function will be called when the execution status of
     * command associated with event changes to an execution status equal to or past the status specified by {@code command_exec_status}.
     * 
     * <p>Each call to {@code clSetEventCallback} registers the specified user callback function on a callback stack associated with event. The order in which the
     * registered user callback functions are called is undefined.</p>
     * 
     * <p>All callbacks registered for an event object must be called. All enqueued callbacks shall be called before the event object is destroyed. Callbacks must
     * return promptly. The behavior of calling expensive system routines, OpenCL API calls to create contexts or command-queues, or blocking OpenCL operations
     * from the following list below, in a callback is undefined.</p>
     * 
     * <ul>
     * <li>{@link CL10#clFinish Finish},</li>
     * <li>{@link CL10#clWaitForEvents WaitForEvents},</li>
     * <li>blocking calls to {@link CL10#clEnqueueReadBuffer EnqueueReadBuffer}, {@link #clEnqueueReadBufferRect EnqueueReadBufferRect}, {@link CL10#clEnqueueWriteBuffer EnqueueWriteBuffer}, {@link #clEnqueueWriteBufferRect EnqueueWriteBufferRect},</li>
     * <li>blocking calls to {@link CL10#clEnqueueReadImage EnqueueReadImage} and {@link CL10#clEnqueueWriteImage EnqueueWriteImage},</li>
     * <li>blocking calls to {@link CL10#clEnqueueMapBuffer EnqueueMapBuffer} and {@link CL10#clEnqueueMapImage EnqueueMapImage},</li>
     * <li>blocking calls to {@link CL10#clBuildProgram BuildProgram}, {@link CL12#clCompileProgram CompileProgram} or {@link CL12#clLinkProgram LinkProgram}</li>
     * </ul>
     * 
     * <p>If an application needs to wait for completion of a routine from the above list in a callback, please use the non-blocking form of the function, and
     * assign a completion callback to it to do the remainder of your work. Note that when a callback (or other code) enqueues commands to a command-queue, the
     * commands are not required to begin execution until the queue is flushed. In standard usage, blocking enqueue calls serve this role by implicitly
     * flushing the queue. Since blocking calls are not permitted in callbacks, those callbacks that enqueue commands on a command queue should either call
     * {@link CL10#clFlush Flush} on the queue before returning or arrange for {@link CL10#clFlush Flush} to be called later on another thread.</p>
     *
     * @param event                      a valid event object
     * @param command_exec_callback_type the command execution status for which the callback is registered. There is no guarantee that the callback functions registered for various
     *                                   execution status values for an event will be called in the exact order that the execution status of a command changes. Furthermore, it should be
     *                                   noted that receiving a call back for an event with a status other than {@link CL10#CL_COMPLETE COMPLETE}, in no way implies that the memory model or
     *                                   execution model as defined by the OpenCL specification has changed. For example, it is not valid to assume that a corresponding memory transfer has
     *                                   completed unless the event is in a state {@link CL10#CL_COMPLETE COMPLETE}. One of:<br><table><tr><td>{@link CL10#CL_SUBMITTED SUBMITTED}</td><td>{@link CL10#CL_RUNNING RUNNING}</td><td>{@link CL10#CL_COMPLETE COMPLETE}</td></tr></table>
     * @param pfn_notify                 the event callback function that can be registered by the application. This callback function may be called asynchronously by the OpenCL
     *                                   implementation. It is the application's responsibility to ensure that the callback function is thread-safe.
     * @param user_data                  will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_EVENT INVALID_EVENT} if {@code event} is not a valid event object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_event_notify} is {@code NULL} or if {@code command_exec_callback_type} is not {@link CL10#CL_SUBMITTED SUBMITTED},
     *         {@link CL10#CL_RUNNING RUNNING} or {@link CL10#CL_COMPLETE COMPLETE}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code event} is a user event object and {@code command_exec_callback_type} is not {@link CL10#CL_COMPLETE COMPLETE}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetEventCallback.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetEventCallback(@NativeType("cl_event") long event, @NativeType("cl_int") int command_exec_callback_type, @NativeType("void (*) (cl_event, cl_int, void *)") CLEventCallbackI pfn_notify, @NativeType("void *") long user_data) {
        return nclSetEventCallback(event, command_exec_callback_type, pfn_notify.address(), user_data);
    }

    /**
     * Array version of: {@link #clCreateSubBuffer CreateSubBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateSubBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateSubBuffer(@NativeType("cl_mem") long buffer, @NativeType("cl_mem_flags") long flags, @NativeType("cl_buffer_create_type") int buffer_create_type, @NativeType("void const *") ByteBuffer buffer_create_info, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSubBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(buffer);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPP(__functionAddress, buffer, flags, buffer_create_type, memAddress(buffer_create_info), errcode_ret);
    }

    /**
     * Array version of: {@link #clEnqueueReadBufferRect EnqueueReadBufferRect}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") short[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(__functionAddress, command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Array version of: {@link #clEnqueueReadBufferRect EnqueueReadBufferRect}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") int[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(__functionAddress, command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Array version of: {@link #clEnqueueReadBufferRect EnqueueReadBufferRect}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") float[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(__functionAddress, command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Array version of: {@link #clEnqueueReadBufferRect EnqueueReadBufferRect}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void *") double[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(__functionAddress, command_queue, buffer, blocking_read ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Array version of: {@link #clEnqueueWriteBufferRect EnqueueWriteBufferRect}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") short[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(__functionAddress, command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Array version of: {@link #clEnqueueWriteBufferRect EnqueueWriteBufferRect}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") int[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(__functionAddress, command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Array version of: {@link #clEnqueueWriteBufferRect EnqueueWriteBufferRect}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") float[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(__functionAddress, command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Array version of: {@link #clEnqueueWriteBufferRect EnqueueWriteBufferRect}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBufferRect.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBufferRect(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer buffer_offset, @NativeType("size_t const *") PointerBuffer host_offset, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long buffer_row_pitch, @NativeType("size_t") long buffer_slice_pitch, @NativeType("size_t") long host_row_pitch, @NativeType("size_t") long host_slice_pitch, @NativeType("void const *") double[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBufferRect;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
            check(buffer_offset, 3);
            check(host_offset, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPPPPI(__functionAddress, command_queue, buffer, blocking_write ? 1 : 0, memAddress(buffer_offset), memAddress(host_offset), memAddress(region), buffer_row_pitch, buffer_slice_pitch, host_row_pitch, host_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Array version of: {@link #clCreateUserEvent CreateUserEvent}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateUserEvent.html">Reference Page</a>
     */
    @NativeType("cl_event")
    public static long clCreateUserEvent(@NativeType("cl_context") long context, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateUserEvent;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPPP(__functionAddress, context, errcode_ret);
    }

}