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
import static org.lwjgl.system.Pointer.*;

/**
 * Native bindings to the <strong>khr_command_buffer</strong> extension.
 * 
 * <p>Command-buffers enable a reduction in overhead when enqueuing the same workload multiple times. By separating the command-queue setup from dispatch,
 * the ability to replay a set of previously created commands is introduced.</p>
 * 
 * <p>Device-side {@code cl_sync_point_khr} synchronization-points can be used within command-buffers to define command dependencies. This allows the
 * commands of a command-buffer to execute out-of-order on a single compatible command-queue. The command-buffer itself has no inherent
 * in-order/out-of-order property, this ordering is inferred from the command-queue used on command recording. Out-of-order enqueues without event
 * dependencies of both regular commands, such as {@link CL12#clEnqueueFillBuffer EnqueueFillBuffer}, and command-buffers are allowed to execute concurrently, and it is up to the user
 * to express any dependencies using events.</p>
 * 
 * <p>The command-queues a command-buffer will be executed on can be set on replay via parameters to {@link #clEnqueueCommandBufferKHR EnqueueCommandBufferKHR}, provided they are compatible
 * with the command-queues used on command-buffer recording.</p>
 * 
 * <p>Requires {@link CL12 CL12}.</p>
 */
public class KHRCommandBuffer {

    /** Accepted values for the {@code param_name} parameter to {@link CL10#clGetDeviceInfo GetDeviceInfo}. */
    public static final int
        CL_DEVICE_COMMAND_BUFFER_CAPABILITIES_KHR              = 0x12A9,
        CL_DEVICE_COMMAND_BUFFER_REQUIRED_QUEUE_PROPERTIES_KHR = 0x12AA;

    /** Bits for {@code cl_device_command_buffer_capabilities_khr} bitfield. */
    public static final int
        CL_COMMAND_BUFFER_CAPABILITY_KERNEL_PRINTF_KHR       = 0x1 << 0,
        CL_COMMAND_BUFFER_CAPABILITY_DEVICE_SIDE_ENQUEUE_KHR = 0x1 << 1,
        CL_COMMAND_BUFFER_CAPABILITY_SIMULTANEOUS_USE_KHR    = 0x1 << 2,
        CL_COMMAND_BUFFER_CAPABILITY_OUT_OF_ORDER_KHR        = 0x1 << 3;

    /** Values for {@code cl_command_buffer_state_khr}. */
    public static final int
        CL_COMMAND_BUFFER_STATE_RECORDING_KHR  = 0x0,
        CL_COMMAND_BUFFER_STATE_EXECUTABLE_KHR = 0x1,
        CL_COMMAND_BUFFER_STATE_PENDING_KHR    = 0x2,
        CL_COMMAND_BUFFER_STATE_INVALID_KHR    = 0x3;

    /** Error codes. */
    public static final int
        CL_INVALID_COMMAND_BUFFER_KHR       = -1138,
        CL_INVALID_SYNC_POINT_WAIT_LIST_KHR = -1139,
        CL_INCOMPATIBLE_COMMAND_QUEUE_KHR   = -1140;

    /** Bitfield to {@link #clCreateCommandBufferKHR CreateCommandBufferKHR}. */
    public static final int CL_COMMAND_BUFFER_FLAGS_KHR = 0x1293;

    /** Bits for {@code cl_command_buffer_flags_khr} bitfield. */
    public static final int CL_COMMAND_BUFFER_SIMULTANEOUS_USE_KHR = 0x1 << 0;

    /** {@code cl_command_buffer_info_khr} queries to {@link #clGetCommandBufferInfoKHR GetCommandBufferInfoKHR}. */
    public static final int
        CL_COMMAND_BUFFER_QUEUES_KHR           = 0x1294,
        CL_COMMAND_BUFFER_NUM_QUEUES_KHR       = 0x1295,
        CL_COMMAND_BUFFER_REFERENCE_COUNT_KHR  = 0x1296,
        CL_COMMAND_BUFFER_STATE_KHR            = 0x1297,
        CL_COMMAND_BUFFER_PROPERTIES_ARRAY_KHR = 0x1298;

    /** {@code cl_event} command-buffer enqueue command type. */
    public static final int CL_COMMAND_COMMAND_BUFFER_KHR = 0x12A8;

    protected KHRCommandBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateCommandBufferKHR ] ---

    /**
     * Unsafe version of: {@link #clCreateCommandBufferKHR CreateCommandBufferKHR}
     *
     * @param num_queues the number of command-queues listed in {@code queues}. This extension only supports a single command-queue, so this <b>must</b> be one.
     */
    public static long nclCreateCommandBufferKHR(int num_queues, long queues, long properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
        }
        return callPPPP(num_queues, queues, properties, errcode_ret, __functionAddress);
    }

    /**
     * Creates a command-buffer that can record commands to the specified queues.
     *
     * @param queues      a pointer to a command-queue that the command-buffer commands will be recorded to. {@code queues must} be a non-{@code NULL} value.
     * @param properties  a list of properties for the command-buffer and their corresponding values.
     *                    
     *                    <p>Each property name is immediately followed by the corresponding desired value. The list is terminated with 0. If a supported property and its value
     *                    is not specified in properties, its default value will be used. {@code properties} can be {@code NULL} in which case the default values for supported
     *                    command-buffer properties will be used.</p>
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     */
    @NativeType("cl_command_buffer_khr")
    public static long clCreateCommandBufferKHR(@NativeType("cl_command_queue const *") PointerBuffer queues, @Nullable @NativeType("cl_command_buffer_properties_khr const *") LongBuffer properties, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateCommandBufferKHR(queues.remaining(), memAddress(queues), memAddressSafe(properties), memAddressSafe(errcode_ret));
    }

    // --- [ clRetainCommandBufferKHR ] ---

    /**
     * Increments the {@code command_buffer} reference count.
     *
     * @param command_buffer the command-buffer to retain
     */
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

    /**
     * Decrements the {@code command_buffer} reference count.
     *
     * @param command_buffer the command-buffer to release
     */
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

    /**
     * Finalizes command recording ready for enqueuing the command-buffer on a command-queue.
     *
     * @param command_buffer a valid command-buffer object
     */
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

    /**
     * Unsafe version of: {@link #clEnqueueCommandBufferKHR EnqueueCommandBufferKHR}
     *
     * @param num_queues              the number of command-queues listed in {@code queues}
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueCommandBufferKHR(int num_queues, long queues, long command_buffer, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCommandBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
        }
        return callPPPPI(num_queues, queues, command_buffer, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command-buffer to execute on command-queues specified by {@code queues, or} on default command-queues used during recording if
     * {@code queues} is empty.
     *
     * @param queues          a pointer to an ordered list of command-queues compatible with the command-queues used on recording.
     *                        
     *                        <p>{@code queues} can be {@code NULL} in which case the default command-queues used on command-buffer creation are used and {@code num_queues} must be 0.</p>
     * @param command_buffer  a valid command-buffer object
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     */
    @NativeType("cl_int")
    public static int clEnqueueCommandBufferKHR(@Nullable @NativeType("cl_command_queue *") PointerBuffer queues, @NativeType("cl_command_buffer_khr") long command_buffer, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueCommandBufferKHR(remainingSafe(queues), memAddressSafe(queues), command_buffer, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clCommandBarrierWithWaitListKHR ] ---

    /** Unsafe version of: {@link #clCommandBarrierWithWaitListKHR CommandBarrierWithWaitListKHR} */
    public static int nclCommandBarrierWithWaitListKHR(long command_buffer, long command_queue, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandBarrierWithWaitListKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
        }
        return callPPPPPI(command_buffer, command_queue, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /**
     * Records a barrier operation used as a synchronization point.
     *
     * @param command_buffer       a valid command-buffer object
     * @param command_queue        the command-queue the command will be recorded to.
     *                             
     *                             <p>Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be {@code NULL}.</p>
     * @param sync_point_wait_list the synchronization-points that need to complete before this particular command can be executed.
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not {@code NULL}, the list of
     *                             synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
     *                             The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
     *                             with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
     *                             {@code sync_point_wait_list} can be reused or freed after the function returns.</p>
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, then this particular command waits until all previous recorded commands to {@code command_queue} have
     *                             completed.</p>
     * @param sync_point           returns a synchronization-point ID that identifies this particular command.
     *                             
     *                             <p>Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be {@code NULL} in which case
     *                             it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
     *                             {@code sync_point} arguments are not {@code NULL}, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
     *                             array.</p>
     * @param mutable_handle       returns a handle to the command.
     *                             
     *                             <p>Handle is unused by this extension and must be passed as {@code NULL}.</p>
     */
    @NativeType("cl_int")
    public static int clCommandBarrierWithWaitListKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @Nullable @NativeType("cl_sync_point_khr const *") IntBuffer sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") IntBuffer sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandBarrierWithWaitListKHR(command_buffer, command_queue, remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandCopyBufferKHR ] ---

    /** Unsafe version of: {@link #clCommandCopyBufferKHR CommandCopyBufferKHR} */
    public static int nclCommandCopyBufferKHR(long command_buffer, long command_queue, long src_buffer, long dst_buffer, long src_offset, long dst_offset, long size, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_buffer);
            check(dst_buffer);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, src_buffer, dst_buffer, src_offset, dst_offset, size, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /**
     * Records a command to copy from one buffer object to another.
     *
     * @param command_buffer       a valid command-buffer object
     * @param command_queue        the command-queue the command will be recorded to.
     *                             
     *                             <p>Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be {@code NULL}.</p>
     * @param sync_point_wait_list the synchronization-points that need to complete before this particular command can be executed.
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not {@code NULL}, the list of
     *                             synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
     *                             The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
     *                             with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
     *                             {@code sync_point_wait_list} can be reused or freed after the function returns.</p>
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, then this particular command waits until all previous recorded commands to {@code command_queue} have
     *                             completed.</p>
     * @param sync_point           returns a synchronization-point ID that identifies this particular command.
     *                             
     *                             <p>Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be {@code NULL} in which case
     *                             it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
     *                             {@code sync_point} arguments are not {@code NULL}, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
     *                             array.</p>
     * @param mutable_handle       returns a handle to the command.
     *                             
     *                             <p>Handle is unused by this extension and must be passed as {@code NULL}.</p>
     */
    @NativeType("cl_int")
    public static int clCommandCopyBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t") long src_offset, @NativeType("size_t") long dst_offset, @NativeType("size_t") long size, @Nullable @NativeType("cl_sync_point_khr const *") IntBuffer sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") IntBuffer sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandCopyBufferKHR(command_buffer, command_queue, src_buffer, dst_buffer, src_offset, dst_offset, size, remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandCopyBufferRectKHR ] ---

    /** Unsafe version of: {@link #clCommandCopyBufferRectKHR CommandCopyBufferRectKHR} */
    public static int nclCommandCopyBufferRectKHR(long command_buffer, long command_queue, long src_buffer, long dst_buffer, long src_origin, long dst_origin, long region, long src_row_pitch, long src_slice_pitch, long dst_row_pitch, long dst_slice_pitch, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferRectKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_buffer);
            check(dst_buffer);
        }
        return callPPPPPPPPPPPPPPI(command_buffer, command_queue, src_buffer, dst_buffer, src_origin, dst_origin, region, src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /**
     * Records a command to copy a rectangular region from a buffer object to another buffer object.
     *
     * @param command_buffer       a valid command-buffer object
     * @param command_queue        the command-queue the command will be recorded to.
     *                             
     *                             <p>Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be {@code NULL}.</p>
     * @param sync_point_wait_list the synchronization-points that need to complete before this particular command can be executed.
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not {@code NULL}, the list of
     *                             synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
     *                             The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
     *                             with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
     *                             {@code sync_point_wait_list} can be reused or freed after the function returns.</p>
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, then this particular command waits until all previous recorded commands to {@code command_queue} have
     *                             completed.</p>
     * @param sync_point           returns a synchronization-point ID that identifies this particular command.
     *                             
     *                             <p>Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be {@code NULL} in which case
     *                             it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
     *                             {@code sync_point} arguments are not {@code NULL}, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
     *                             array.</p>
     * @param mutable_handle       returns a handle to the command.
     *                             
     *                             <p>Handle is unused by this extension and must be passed as {@code NULL}.</p>
     */
    @NativeType("cl_int")
    public static int clCommandCopyBufferRectKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long src_row_pitch, @NativeType("size_t") long src_slice_pitch, @NativeType("size_t") long dst_row_pitch, @NativeType("size_t") long dst_slice_pitch, @Nullable @NativeType("cl_sync_point_khr const *") IntBuffer sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") IntBuffer sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        if (CHECKS) {
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandCopyBufferRectKHR(command_buffer, command_queue, src_buffer, dst_buffer, memAddress(src_origin), memAddress(dst_origin), memAddress(region), src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandCopyBufferToImageKHR ] ---

    /** Unsafe version of: {@link #clCommandCopyBufferToImageKHR CommandCopyBufferToImageKHR} */
    public static int nclCommandCopyBufferToImageKHR(long command_buffer, long command_queue, long src_buffer, long dst_image, long src_offset, long dst_origin, long region, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferToImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_buffer);
            check(dst_image);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, src_buffer, dst_image, src_offset, dst_origin, region, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /**
     * Records a command to copy a buffer object to an image object.
     *
     * @param command_buffer       a valid command-buffer object
     * @param command_queue        the command-queue the command will be recorded to.
     *                             
     *                             <p>Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be {@code NULL}.</p>
     * @param sync_point_wait_list the synchronization-points that need to complete before this particular command can be executed.
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not {@code NULL}, the list of
     *                             synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
     *                             The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
     *                             with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
     *                             {@code sync_point_wait_list} can be reused or freed after the function returns.</p>
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, then this particular command waits until all previous recorded commands to {@code command_queue} have
     *                             completed.</p>
     * @param sync_point           returns a synchronization-point ID that identifies this particular command.
     *                             
     *                             <p>Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be {@code NULL} in which case
     *                             it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
     *                             {@code sync_point} arguments are not {@code NULL}, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
     *                             array.</p>
     * @param mutable_handle       returns a handle to the command.
     *                             
     *                             <p>Handle is unused by this extension and must be passed as {@code NULL}.</p>
     */
    @NativeType("cl_int")
    public static int clCommandCopyBufferToImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_image, @NativeType("size_t") long src_offset, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_sync_point_khr const *") IntBuffer sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") IntBuffer sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        if (CHECKS) {
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandCopyBufferToImageKHR(command_buffer, command_queue, src_buffer, dst_image, src_offset, memAddress(dst_origin), memAddress(region), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandCopyImageKHR ] ---

    /** Unsafe version of: {@link #clCommandCopyImageKHR CommandCopyImageKHR} */
    public static int nclCommandCopyImageKHR(long command_buffer, long command_queue, long src_image, long dst_image, long src_origin, long dst_origin, long region, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_image);
            check(dst_image);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, src_image, dst_image, src_origin, dst_origin, region, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /**
     * Records a command to copy image objects.
     *
     * @param command_buffer       a valid command-buffer object
     * @param command_queue        the command-queue the command will be recorded to.
     *                             
     *                             <p>Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be {@code NULL}.</p>
     * @param sync_point_wait_list the synchronization-points that need to complete before this particular command can be executed.
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not {@code NULL}, the list of
     *                             synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
     *                             The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
     *                             with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
     *                             {@code sync_point_wait_list} can be reused or freed after the function returns.</p>
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, then this particular command waits until all previous recorded commands to {@code command_queue} have
     *                             completed.</p>
     * @param sync_point           returns a synchronization-point ID that identifies this particular command.
     *                             
     *                             <p>Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be {@code NULL} in which case
     *                             it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
     *                             {@code sync_point} arguments are not {@code NULL}, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
     *                             array.</p>
     * @param mutable_handle       returns a handle to the command.
     *                             
     *                             <p>Handle is unused by this extension and must be passed as {@code NULL}.</p>
     */
    @NativeType("cl_int")
    public static int clCommandCopyImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_image, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_sync_point_khr const *") IntBuffer sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") IntBuffer sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        if (CHECKS) {
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandCopyImageKHR(command_buffer, command_queue, src_image, dst_image, memAddress(src_origin), memAddress(dst_origin), memAddress(region), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandCopyImageToBufferKHR ] ---

    /** Unsafe version of: {@link #clCommandCopyImageToBufferKHR CommandCopyImageToBufferKHR} */
    public static int nclCommandCopyImageToBufferKHR(long command_buffer, long command_queue, long src_image, long dst_buffer, long src_origin, long region, long dst_offset, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyImageToBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_image);
            check(dst_buffer);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, src_image, dst_buffer, src_origin, region, dst_offset, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /**
     * Records a command to copy an image object to a buffer object.
     *
     * @param command_buffer       a valid command-buffer object
     * @param command_queue        the command-queue the command will be recorded to.
     *                             
     *                             <p>Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be {@code NULL}.</p>
     * @param sync_point_wait_list the synchronization-points that need to complete before this particular command can be executed.
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not {@code NULL}, the list of
     *                             synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
     *                             The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
     *                             with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
     *                             {@code sync_point_wait_list} can be reused or freed after the function returns.</p>
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, then this particular command waits until all previous recorded commands to {@code command_queue} have
     *                             completed.</p>
     * @param sync_point           returns a synchronization-point ID that identifies this particular command.
     *                             
     *                             <p>Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be {@code NULL} in which case
     *                             it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
     *                             {@code sync_point} arguments are not {@code NULL}, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
     *                             array.</p>
     * @param mutable_handle       returns a handle to the command.
     *                             
     *                             <p>Handle is unused by this extension and must be passed as {@code NULL}.</p>
     */
    @NativeType("cl_int")
    public static int clCommandCopyImageToBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long dst_offset, @Nullable @NativeType("cl_sync_point_khr const *") IntBuffer sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") IntBuffer sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        if (CHECKS) {
            check(src_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandCopyImageToBufferKHR(command_buffer, command_queue, src_image, dst_buffer, memAddress(src_origin), memAddress(region), dst_offset, remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandFillBufferKHR ] ---

    /** Unsafe version of: {@link #clCommandFillBufferKHR CommandFillBufferKHR} */
    public static int nclCommandFillBufferKHR(long command_buffer, long command_queue, long buffer, long pattern, long pattern_size, long offset, long size, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(buffer);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, buffer, pattern, pattern_size, offset, size, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /**
     * Records a command to fill a buffer object with a pattern of a given pattern size.
     *
     * @param command_buffer       a valid command-buffer object
     * @param command_queue        the command-queue the command will be recorded to.
     *                             
     *                             <p>Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be {@code NULL}.</p>
     * @param sync_point_wait_list the synchronization-points that need to complete before this particular command can be executed.
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not {@code NULL}, the list of
     *                             synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
     *                             The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
     *                             with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
     *                             {@code sync_point_wait_list} can be reused or freed after the function returns.</p>
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, then this particular command waits until all previous recorded commands to {@code command_queue} have
     *                             completed.</p>
     * @param sync_point           returns a synchronization-point ID that identifies this particular command.
     *                             
     *                             <p>Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be {@code NULL} in which case
     *                             it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
     *                             {@code sync_point} arguments are not {@code NULL}, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
     *                             array.</p>
     * @param mutable_handle       returns a handle to the command.
     *                             
     *                             <p>Handle is unused by this extension and must be passed as {@code NULL}.</p>
     */
    @NativeType("cl_int")
    public static int clCommandFillBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("void const *") ByteBuffer pattern, @NativeType("size_t") long offset, @NativeType("size_t") long size, @Nullable @NativeType("cl_sync_point_khr const *") IntBuffer sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") IntBuffer sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        if (CHECKS) {
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandFillBufferKHR(command_buffer, command_queue, buffer, memAddress(pattern), pattern.remaining(), offset, size, remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandFillImageKHR ] ---

    /** Unsafe version of: {@link #clCommandFillImageKHR CommandFillImageKHR} */
    public static int nclCommandFillImageKHR(long command_buffer, long command_queue, long image, long fill_color, long origin, long region, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(image);
        }
        return callPPPPPPPPPI(command_buffer, command_queue, image, fill_color, origin, region, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /**
     * Records a command to fill an image object with a specified color.
     *
     * @param command_buffer       a valid command-buffer object
     * @param command_queue        the command-queue the command will be recorded to.
     *                             
     *                             <p>Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be {@code NULL}.</p>
     * @param sync_point_wait_list the synchronization-points that need to complete before this particular command can be executed.
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not {@code NULL}, the list of
     *                             synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
     *                             The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
     *                             with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
     *                             {@code sync_point_wait_list} can be reused or freed after the function returns.</p>
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, then this particular command waits until all previous recorded commands to {@code command_queue} have
     *                             completed.</p>
     * @param sync_point           returns a synchronization-point ID that identifies this particular command.
     *                             
     *                             <p>Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be {@code NULL} in which case
     *                             it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
     *                             {@code sync_point} arguments are not {@code NULL}, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
     *                             array.</p>
     * @param mutable_handle       returns a handle to the command.
     *                             
     *                             <p>Handle is unused by this extension and must be passed as {@code NULL}.</p>
     */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") ByteBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_sync_point_khr const *") IntBuffer sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") IntBuffer sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        if (CHECKS) {
            check(fill_color, 16);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandFillImageKHR(command_buffer, command_queue, image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    /**
     * Records a command to fill an image object with a specified color.
     *
     * @param command_buffer       a valid command-buffer object
     * @param command_queue        the command-queue the command will be recorded to.
     *                             
     *                             <p>Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be {@code NULL}.</p>
     * @param sync_point_wait_list the synchronization-points that need to complete before this particular command can be executed.
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not {@code NULL}, the list of
     *                             synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
     *                             The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
     *                             with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
     *                             {@code sync_point_wait_list} can be reused or freed after the function returns.</p>
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, then this particular command waits until all previous recorded commands to {@code command_queue} have
     *                             completed.</p>
     * @param sync_point           returns a synchronization-point ID that identifies this particular command.
     *                             
     *                             <p>Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be {@code NULL} in which case
     *                             it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
     *                             {@code sync_point} arguments are not {@code NULL}, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
     *                             array.</p>
     * @param mutable_handle       returns a handle to the command.
     *                             
     *                             <p>Handle is unused by this extension and must be passed as {@code NULL}.</p>
     */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") IntBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_sync_point_khr const *") IntBuffer sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") IntBuffer sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        if (CHECKS) {
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandFillImageKHR(command_buffer, command_queue, image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    /**
     * Records a command to fill an image object with a specified color.
     *
     * @param command_buffer       a valid command-buffer object
     * @param command_queue        the command-queue the command will be recorded to.
     *                             
     *                             <p>Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be {@code NULL}.</p>
     * @param sync_point_wait_list the synchronization-points that need to complete before this particular command can be executed.
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not {@code NULL}, the list of
     *                             synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
     *                             The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
     *                             with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
     *                             {@code sync_point_wait_list} can be reused or freed after the function returns.</p>
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, then this particular command waits until all previous recorded commands to {@code command_queue} have
     *                             completed.</p>
     * @param sync_point           returns a synchronization-point ID that identifies this particular command.
     *                             
     *                             <p>Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be {@code NULL} in which case
     *                             it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
     *                             {@code sync_point} arguments are not {@code NULL}, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
     *                             array.</p>
     * @param mutable_handle       returns a handle to the command.
     *                             
     *                             <p>Handle is unused by this extension and must be passed as {@code NULL}.</p>
     */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") FloatBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_sync_point_khr const *") IntBuffer sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") IntBuffer sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        if (CHECKS) {
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return nclCommandFillImageKHR(command_buffer, command_queue, image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(sync_point_wait_list), memAddressSafe(sync_point_wait_list), memAddressSafe(sync_point), memAddressSafe(mutable_handle));
    }

    // --- [ clCommandNDRangeKernelKHR ] ---

    /** Unsafe version of: {@link #clCommandNDRangeKernelKHR CommandNDRangeKernelKHR} */
    public static int nclCommandNDRangeKernelKHR(long command_buffer, long command_queue, long properties, long kernel, int work_dim, long global_work_offset, long global_work_size, long local_work_size, int num_sync_points_in_wait_list, long sync_point_wait_list, long sync_point, long mutable_handle) {
        long __functionAddress = CL.getICD().clCommandNDRangeKernelKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(kernel);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, properties, kernel, work_dim, global_work_offset, global_work_size, local_work_size, num_sync_points_in_wait_list, sync_point_wait_list, sync_point, mutable_handle, __functionAddress);
    }

    /**
     * Records a command to execute a kernel on a device.
     *
     * @param command_buffer       a valid command-buffer object
     * @param command_queue        the command-queue the command will be recorded to.
     *                             
     *                             <p>Parameter is unused by this extension as only a single command-queue is supported and <b>must</b> be {@code NULL}.</p>
     * @param kernel               a valid kernel object
     * @param sync_point_wait_list the synchronization-points that need to complete before this particular command can be executed.
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, {@code num_sync_points_in_wait_list} must be 0. If {@code sync_point_wait_list} is not {@code NULL}, the list of
     *                             synchronization-points pointed to by {@code sync_point_wait_list} must be valid and {@code num_sync_points_in_wait_list} must be greater than 0.
     *                             The synchronization-points specified in {@code sync_point_wait_list} are <b>device side</b> synchronization-points. The command-buffer associated 
     *                             with synchronization-points in {@code sync_point_wait_list} must be the same as {@code command_buffer}. The memory associated with
     *                             {@code sync_point_wait_list} can be reused or freed after the function returns.</p>
     *                             
     *                             <p>If {@code sync_point_wait_list} is {@code NULL}, then this particular command waits until all previous recorded commands to {@code command_queue} have
     *                             completed.</p>
     * @param sync_point           returns a synchronization-point ID that identifies this particular command.
     *                             
     *                             <p>Synchronization-point objects are unique and can be used to identify this barrier command later on. {@code sync_point} can be {@code NULL} in which case
     *                             it will not be possible for the application to record a wait for this command to complete. If the {@code sync_point_wait_list} and the
     *                             {@code sync_point} arguments are not {@code NULL}, the {@code sync_point} argument should not refer to an element of the {@code sync_point_wait_list}
     *                             array.</p>
     * @param mutable_handle       returns a handle to the command.
     *                             
     *                             <p>Handle is unused by this extension and must be passed as {@code NULL}.</p>
     */
    @NativeType("cl_int")
    public static int clCommandNDRangeKernelKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @Nullable @NativeType("cl_ndrange_kernel_command_properties_khr const *") LongBuffer properties, @NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int work_dim, @Nullable @NativeType("size_t const *") PointerBuffer global_work_offset, @Nullable @NativeType("size_t const *") PointerBuffer global_work_size, @Nullable @NativeType("size_t const *") PointerBuffer local_work_size, @Nullable @NativeType("cl_sync_point_khr const *") IntBuffer sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") IntBuffer sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
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

    /**
     * Unsafe version of: {@link #clGetCommandBufferInfoKHR GetCommandBufferInfoKHR}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetCommandBufferInfoKHR(long command_buffer, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetCommandBufferInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
        }
        return callPPPPI(command_buffer, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Queries information about a command-buffer.
     *
     * @param command_buffer       the command-buffer being queried
     * @param param_name           the information to query
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetCommandBufferInfoKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_buffer_info_khr") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandBufferInfoKHR(command_buffer, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Queries information about a command-buffer.
     *
     * @param command_buffer       the command-buffer being queried
     * @param param_name           the information to query
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetCommandBufferInfoKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_buffer_info_khr") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandBufferInfoKHR(command_buffer, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Queries information about a command-buffer.
     *
     * @param command_buffer       the command-buffer being queried
     * @param param_name           the information to query
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     */
    @NativeType("cl_int")
    public static int clGetCommandBufferInfoKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_buffer_info_khr") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandBufferInfoKHR(command_buffer, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** Array version of: {@link #clCreateCommandBufferKHR CreateCommandBufferKHR} */
    @NativeType("cl_command_buffer_khr")
    public static long clCreateCommandBufferKHR(@NativeType("cl_command_queue const *") PointerBuffer queues, @Nullable @NativeType("cl_command_buffer_properties_khr const *") long[] properties, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPPP(queues.remaining(), memAddress(queues), properties, errcode_ret, __functionAddress);
    }

    /** Array version of: {@link #clCommandBarrierWithWaitListKHR CommandBarrierWithWaitListKHR} */
    @NativeType("cl_int")
    public static int clCommandBarrierWithWaitListKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @Nullable @NativeType("cl_sync_point_khr const *") int[] sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") int[] sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandBarrierWithWaitListKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPI(command_buffer, command_queue, lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** Array version of: {@link #clCommandCopyBufferKHR CommandCopyBufferKHR} */
    @NativeType("cl_int")
    public static int clCommandCopyBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t") long src_offset, @NativeType("size_t") long dst_offset, @NativeType("size_t") long size, @Nullable @NativeType("cl_sync_point_khr const *") int[] sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") int[] sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_buffer);
            check(dst_buffer);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, src_buffer, dst_buffer, src_offset, dst_offset, size, lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** Array version of: {@link #clCommandCopyBufferRectKHR CommandCopyBufferRectKHR} */
    @NativeType("cl_int")
    public static int clCommandCopyBufferRectKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long src_row_pitch, @NativeType("size_t") long src_slice_pitch, @NativeType("size_t") long dst_row_pitch, @NativeType("size_t") long dst_slice_pitch, @Nullable @NativeType("cl_sync_point_khr const *") int[] sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") int[] sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferRectKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_buffer);
            check(dst_buffer);
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPPPPPI(command_buffer, command_queue, src_buffer, dst_buffer, memAddress(src_origin), memAddress(dst_origin), memAddress(region), src_row_pitch, src_slice_pitch, dst_row_pitch, dst_slice_pitch, lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** Array version of: {@link #clCommandCopyBufferToImageKHR CommandCopyBufferToImageKHR} */
    @NativeType("cl_int")
    public static int clCommandCopyBufferToImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_image, @NativeType("size_t") long src_offset, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_sync_point_khr const *") int[] sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") int[] sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyBufferToImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_buffer);
            check(dst_image);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, src_buffer, dst_image, src_offset, memAddress(dst_origin), memAddress(region), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** Array version of: {@link #clCommandCopyImageKHR CommandCopyImageKHR} */
    @NativeType("cl_int")
    public static int clCommandCopyImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_image, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_sync_point_khr const *") int[] sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") int[] sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_image);
            check(dst_image);
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, src_image, dst_image, memAddress(src_origin), memAddress(dst_origin), memAddress(region), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** Array version of: {@link #clCommandCopyImageToBufferKHR CommandCopyImageToBufferKHR} */
    @NativeType("cl_int")
    public static int clCommandCopyImageToBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long dst_offset, @Nullable @NativeType("cl_sync_point_khr const *") int[] sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") int[] sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandCopyImageToBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(src_image);
            check(dst_buffer);
            check(src_origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, src_image, dst_buffer, memAddress(src_origin), memAddress(region), dst_offset, lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** Array version of: {@link #clCommandFillBufferKHR CommandFillBufferKHR} */
    @NativeType("cl_int")
    public static int clCommandFillBufferKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("void const *") ByteBuffer pattern, @NativeType("size_t") long offset, @NativeType("size_t") long size, @Nullable @NativeType("cl_sync_point_khr const *") int[] sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") int[] sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillBufferKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(buffer);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPPI(command_buffer, command_queue, buffer, memAddress(pattern), (long)pattern.remaining(), offset, size, lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** Array version of: {@link #clCommandFillImageKHR CommandFillImageKHR} */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") ByteBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_sync_point_khr const *") int[] sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") int[] sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(image);
            check(fill_color, 16);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPI(command_buffer, command_queue, image, memAddress(fill_color), memAddress(origin), memAddress(region), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** Array version of: {@link #clCommandFillImageKHR CommandFillImageKHR} */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") int[] fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_sync_point_khr const *") int[] sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") int[] sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(image);
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPI(command_buffer, command_queue, image, fill_color, memAddress(origin), memAddress(region), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** Array version of: {@link #clCommandFillImageKHR CommandFillImageKHR} */
    @NativeType("cl_int")
    public static int clCommandFillImageKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") float[] fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_sync_point_khr const *") int[] sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") int[] sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
        long __functionAddress = CL.getICD().clCommandFillImageKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            check(image);
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(sync_point, 1);
            checkSafe(mutable_handle, 1);
        }
        return callPPPPPPPPPI(command_buffer, command_queue, image, fill_color, memAddress(origin), memAddress(region), lengthSafe(sync_point_wait_list), sync_point_wait_list, sync_point, memAddressSafe(mutable_handle), __functionAddress);
    }

    /** Array version of: {@link #clCommandNDRangeKernelKHR CommandNDRangeKernelKHR} */
    @NativeType("cl_int")
    public static int clCommandNDRangeKernelKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_queue") long command_queue, @Nullable @NativeType("cl_ndrange_kernel_command_properties_khr const *") long[] properties, @NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int work_dim, @Nullable @NativeType("size_t const *") PointerBuffer global_work_offset, @Nullable @NativeType("size_t const *") PointerBuffer global_work_size, @Nullable @NativeType("size_t const *") PointerBuffer local_work_size, @Nullable @NativeType("cl_sync_point_khr const *") int[] sync_point_wait_list, @Nullable @NativeType("cl_sync_point_khr *") int[] sync_point, @Nullable @NativeType("cl_mutable_command_khr *") PointerBuffer mutable_handle) {
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

    /** Array version of: {@link #clGetCommandBufferInfoKHR GetCommandBufferInfoKHR} */
    @NativeType("cl_int")
    public static int clGetCommandBufferInfoKHR(@NativeType("cl_command_buffer_khr") long command_buffer, @NativeType("cl_command_buffer_info_khr") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetCommandBufferInfoKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(command_buffer);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(command_buffer, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

}