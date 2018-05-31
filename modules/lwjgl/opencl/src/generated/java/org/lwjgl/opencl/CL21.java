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

/** The core OpenCL 2.1 functionality. */
public class CL21 extends CL20 {

    /** OpenCL Version. */
    public static final int CL_VERSION_2_1 = 1;

    /** cl_platform_info */
    public static final int CL_PLATFORM_HOST_TIMER_RESOLUTION = 0x905;

    /** cl_device_info */
    public static final int
        CL_DEVICE_IL_VERSION                             = 0x105B,
        CL_DEVICE_MAX_NUM_SUB_GROUPS                     = 0x105C,
        CL_DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS = 0x105D;

    /** cl_command_queue_info */
    public static final int CL_QUEUE_DEVICE_DEFAULT = 0x1095;

    /** cl_channel_type */
    public static final int CL_UNORM_INT_101010_2 = 0x10E0;

    /** cl_program_info */
    public static final int CL_PROGRAM_IL = 0x1169;

    /** cl_kernel_info */
    public static final int
        CL_KERNEL_MAX_NUM_SUB_GROUPS     = 0x11B9,
        CL_KERNEL_COMPILE_NUM_SUB_GROUPS = 0x11BA;

    /** cl_kernel_sub_group_info */
    public static final int
        CL_KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE = 0x2033,
        CL_KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE    = 0x2034,
        CL_KERNEL_LOCAL_SIZE_FOR_SUB_GROUP_COUNT = 0x11B8;

    protected CL21() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(CLCapabilities caps) {
        return checkFunctions(
            caps.clSetDefaultDeviceCommandQueue, caps.clGetDeviceAndHostTimer, caps.clGetHostTimer, caps.clCreateProgramWithIL, caps.clCloneKernel, 
            caps.clGetKernelSubGroupInfo, caps.clEnqueueSVMMigrateMem
        );
    }

    // --- [ clSetDefaultDeviceCommandQueue ] ---

    /**
     * Replaces a default device command queue created with {@link CL20#clCreateCommandQueueWithProperties CreateCommandQueueWithProperties} and the {@link CL20#CL_QUEUE_ON_DEVICE_DEFAULT QUEUE_ON_DEVICE_DEFAULT} flag.
     *
     * @param context       a valid OpenCL context
     * @param device        a OpenCL device associated with {@code context}
     * @param command_queue a valid command-queue for {@code device}
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not a valid device or is not associated with {@code context}.</li>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetDefaultDeviceCommandQueue.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetDefaultDeviceCommandQueue(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clSetDefaultDeviceCommandQueue;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
            check(command_queue);
        }
        return callPPPI(__functionAddress, context, device, command_queue);
    }

    // --- [ clGetDeviceAndHostTimer ] ---

    /** Unsafe version of: {@link #clGetDeviceAndHostTimer GetDeviceAndHostTimer} */
    public static int nclGetDeviceAndHostTimer(long device, long device_timestamp, long host_timestamp) {
        long __functionAddress = CL.getICD().clGetDeviceAndHostTimer;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPPI(__functionAddress, device, device_timestamp, host_timestamp);
    }

    /**
     * Returns a reasonably synchronized pair of timestamps from the device timer and the host timer as seen by device. Implementations may need to execute
     * this query with a high latency in order to provide reasonable synchronization of the timestamps. The host timestamp and device timestamp returned by
     * this function and {@link #clGetHostTimer GetHostTimer} each have an implementation defined timebase. The timestamps will always be in their respective timebases regardless
     * of which query function is used. The timestamp returned from {@link CL10#clGetEventProfilingInfo GetEventProfilingInfo} for an event on a device and a device timestamp queried from
     * the same device will always be in the same timebase.
     *
     * @param device           a device returned by {@link CL10#clGetDeviceIDs GetDeviceIDs}
     * @param device_timestamp will be updated with the value of the device timer in nanoseconds. The resolution of the timer is the same as the device profiling timer returned
     *                         by {@link CL10#clGetDeviceInfo GetDeviceInfo} and the {@link CL10#CL_DEVICE_PROFILING_TIMER_RESOLUTION DEVICE_PROFILING_TIMER_RESOLUTION} query.
     * @param host_timestamp   will be updated with the value of the host timer in nanoseconds at the closest possible point in time to that at which {@code device_timestamp} was
     *                         returned. The resolution of the timer may be queried via {@link CL10#clGetPlatformInfo GetPlatformInfo} and the flag {@link #CL_PLATFORM_HOST_TIMER_RESOLUTION PLATFORM_HOST_TIMER_RESOLUTION}.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} with a time value in {@code host_timestamp} if provided. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not a valid OpenCL device.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_timestamp} or {@code device_timestamp} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetDeviceAndHostTimer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetDeviceAndHostTimer(@NativeType("cl_device_id") long device, @NativeType("cl_ulong *") LongBuffer device_timestamp, @NativeType("cl_ulong *") LongBuffer host_timestamp) {
        if (CHECKS) {
            check(device_timestamp, 1);
            check(host_timestamp, 1);
        }
        return nclGetDeviceAndHostTimer(device, memAddress(device_timestamp), memAddress(host_timestamp));
    }

    // --- [ clGetHostTimer ] ---

    /** Unsafe version of: {@link #clGetHostTimer GetHostTimer} */
    public static int nclGetHostTimer(long device, long host_timestamp) {
        long __functionAddress = CL.getICD().clGetHostTimer;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPPI(__functionAddress, device, host_timestamp);
    }

    /**
     * Returns the current value of the host clock as seen by device. This value is in the same timebase as the {@code host_timestamp} returned from
     * {@link #clGetDeviceAndHostTimer GetDeviceAndHostTimer}. The implementation will return with as low a latency as possible to allow a correlation with a subsequent application sampled
     * time. The host timestamp and device timestamp returned by this function and {@link #clGetDeviceAndHostTimer GetDeviceAndHostTimer} each have an implementation defined timebase. The
     * timestamps will always be in their respective timebases regardless of which query function is used. The timestamp returned from
     * {@link CL10#clGetEventProfilingInfo GetEventProfilingInfo} for an event on a device and a device timestamp queried from the same device will always be in the same timebase.
     *
     * @param device         a device returned by {@link CL10#clGetDeviceIDs GetDeviceIDs}
     * @param host_timestamp will be updated with the value of the current timer in nanoseconds. The resolution of the timer may be queried via {@link CL10#clGetPlatformInfo GetPlatformInfo} and the
     *                       flag {@link #CL_PLATFORM_HOST_TIMER_RESOLUTION PLATFORM_HOST_TIMER_RESOLUTION}.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} with a time value in {@code host_timestamp} if provided. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not a valid OpenCL device.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code host_timestamp} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetHostTimer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetHostTimer(@NativeType("cl_device_id") long device, @NativeType("cl_ulong *") LongBuffer host_timestamp) {
        if (CHECKS) {
            check(host_timestamp, 1);
        }
        return nclGetHostTimer(device, memAddress(host_timestamp));
    }

    // --- [ clCreateProgramWithIL ] ---

    /**
     * Unsafe version of: {@link #clCreateProgramWithIL CreateProgramWithIL}
     *
     * @param length the number of bytes in {@code il}
     */
    public static long nclCreateProgramWithIL(long context, long il, long length, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithIL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPP(__functionAddress, context, il, length, errcode_ret);
    }

    /**
     * Creates a program object for a context, and loads the IL pointed to by {@code il} and with length in bytes {@code length} into the program object.
     *
     * @param context     a valid OpenCL context
     * @param il          a pointer to a {@code length}-byte block of memory containing SPIR-V or an implementation-defined intermediate language
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero program object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code il} is {@code NULL} or if {@code length} is zero.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the {@code length}-byte memory pointed to by {@code il} does not contain well-formed intermediate language input that can be
     *         consumed by the OpenCL runtime.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithIL.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithIL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer il, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateProgramWithIL(context, memAddress(il), il.remaining(), memAddressSafe(errcode_ret));
    }

    // --- [ clCloneKernel ] ---

    /** Unsafe version of: {@link #clCloneKernel CloneKernel} */
    public static long nclCloneKernel(long source_kernel, long errcode_ret) {
        long __functionAddress = CL.getICD().clCloneKernel;
        if (CHECKS) {
            check(__functionAddress);
            check(source_kernel);
        }
        return callPPP(__functionAddress, source_kernel, errcode_ret);
    }

    /**
     * Makes a shallow copy of the kernel object, its arguments and any information passed to the kernel object using {@link CL20#clSetKernelExecInfo SetKernelExecInfo}. If the kernel
     * object was ready to be enqueued before copying it, the clone of the kernel object is ready to enqueue.
     * 
     * <p>The returned kernel object is an exact copy of {@code source_kernel}, with one caveat: the reference count on the returned kernel object is set as if
     * it had been returned by {@link CL10#clCreateKernel CreateKernel}. The reference count of {@code source_kernel} will not be changed.</p>
     * 
     * <p>The resulting kernel will be in the same state as if {@link CL10#clCreateKernel CreateKernel} is called to create the resultant kernel with the same arguments as those used
     * to create {@code source_kernel}, the latest call to {@link CL10#clSetKernelArg SetKernelArg} or {@link CL20#clSetKernelArgSVMPointer SetKernelArgSVMPointer} for each argument index applied to kernel and
     * the last call to {@link CL20#clSetKernelExecInfo SetKernelExecInfo} for each value of the param name parameter are applied to the new kernel object.</p>
     * 
     * <p>All arguments of the new kernel object must be intact and it may be correctly used in the same situations as kernel except those that assume a
     * pre-existing reference count. Setting arguments on the new kernel object will not affect {@code source_kernel} except insofar as the argument points to
     * a shared underlying entity and in that situation behavior is as if two kernel objects had been created and the same argument applied to each. Only the
     * data stored in the kernel object is copied; data referenced by the kernel's arguments are not copied. For example, if a buffer or pointer argument is
     * set on a kernel object, the pointer is copied but the underlying memory allocation is not.</p>
     *
     * @param source_kernel a valid {@code cl_kernel} object that will be copied. {@code source_kernel} will not be modified in any way by this function.
     * @param errcode_ret   will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero kernel object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the kernel is successfully copied. Otherwise it returns a {@code NULL} value with
     *         one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code source_kernel} is not a valid kernel object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCloneKernel.html">Reference Page</a>
     */
    @NativeType("cl_kernel")
    public static long clCloneKernel(@NativeType("cl_kernel") long source_kernel, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCloneKernel(source_kernel, memAddressSafe(errcode_ret));
    }

    // --- [ clGetKernelSubGroupInfo ] ---

    /**
     * Unsafe version of: {@link #clGetKernelSubGroupInfo GetKernelSubGroupInfo}
     *
     * @param input_value_size the size in bytes of memory pointed to by {@code input_value}
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetKernelSubGroupInfo(long kernel, long device, int param_name, long input_value_size, long input_value, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelSubGroupInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPPPPPPI(__functionAddress, kernel, device, param_name, input_value_size, input_value, param_value_size, param_value, param_value_size_ret);
    }

    /**
     * Returns information about the kernel object.
     *
     * @param kernel               the kernel object being queried
     * @param device               a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL context that is
     *                             associated with {@code kernel}. If the list of devices associated with kernel is a single device, device can be a {@code NULL} value.
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_MAX_NUM_SUB_GROUPS KERNEL_MAX_NUM_SUB_GROUPS}</td><td>{@link #CL_KERNEL_COMPILE_NUM_SUB_GROUPS KERNEL_COMPILE_NUM_SUB_GROUPS}</td></tr><tr><td>{@link #CL_KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE}</td><td>{@link #CL_KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE}</td></tr><tr><td>{@link #CL_KERNEL_LOCAL_SIZE_FOR_SUB_GROUP_COUNT KERNEL_LOCAL_SIZE_FOR_SUB_GROUP_COUNT}</td></tr></table>
     * @param input_value          a pointer to memory where the appropriate parameterization of the query is passed from. If {@code input_value} is {@code NULL}, it is ignored.
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not in the list of devices associated with {@code kernel} or if {@code device} is {@code NULL} but there is more than
     *         one device associated with {@code kernel}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value} is &lt; size of return type and
     *         {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is {@code KERNEL_SUB_GROUP_SIZE_FOR_NDRANGE} and the size in bytes specified by {@code input_value_size} is not valid
     *         or if {@code input_value} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelSubGroupInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelSubGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_sub_group_info") int param_name, @Nullable @NativeType("void const *") ByteBuffer input_value, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelSubGroupInfo(kernel, device, param_name, remainingSafe(input_value), memAddressSafe(input_value), remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about the kernel object.
     *
     * @param kernel               the kernel object being queried
     * @param device               a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL context that is
     *                             associated with {@code kernel}. If the list of devices associated with kernel is a single device, device can be a {@code NULL} value.
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_MAX_NUM_SUB_GROUPS KERNEL_MAX_NUM_SUB_GROUPS}</td><td>{@link #CL_KERNEL_COMPILE_NUM_SUB_GROUPS KERNEL_COMPILE_NUM_SUB_GROUPS}</td></tr><tr><td>{@link #CL_KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE KERNEL_MAX_SUB_GROUP_SIZE_FOR_NDRANGE}</td><td>{@link #CL_KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE KERNEL_SUB_GROUP_COUNT_FOR_NDRANGE}</td></tr><tr><td>{@link #CL_KERNEL_LOCAL_SIZE_FOR_SUB_GROUP_COUNT KERNEL_LOCAL_SIZE_FOR_SUB_GROUP_COUNT}</td></tr></table>
     * @param input_value          a pointer to memory where the appropriate parameterization of the query is passed from. If {@code input_value} is {@code NULL}, it is ignored.
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not in the list of devices associated with {@code kernel} or if {@code device} is {@code NULL} but there is more than
     *         one device associated with {@code kernel}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value} is &lt; size of return type and
     *         {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is {@code KERNEL_SUB_GROUP_SIZE_FOR_NDRANGE} and the size in bytes specified by {@code input_value_size} is not valid
     *         or if {@code input_value} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelSubGroupInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelSubGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_sub_group_info") int param_name, @Nullable @NativeType("void const *") ByteBuffer input_value, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelSubGroupInfo(kernel, device, param_name, remainingSafe(input_value), memAddressSafe(input_value), Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clEnqueueSVMMigrateMem ] ---

    /**
     * Unsafe version of: {@link #clEnqueueSVMMigrateMem EnqueueSVMMigrateMem}
     *
     * @param num_svm_pointers        the number of pointers in the specified {@code svm_pointers} array, and the number of sizes in the {@code sizes} array, if {@code sizes} is not
     *                                {@code NULL}.
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueSVMMigrateMem(long command_queue, int num_svm_pointers, long svm_pointers, long sizes, long flags, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueSVMMigrateMem;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPJPPI(__functionAddress, command_queue, num_svm_pointers, svm_pointers, sizes, flags, num_events_in_wait_list, event_wait_list, event);
    }

    /**
     * Enqueues a command to indicate which device a set of ranges of SVM allocations should be associated with. Once the event returned by
     * {@code clEnqueueSVMMigrateMem} has become {@link CL10#CL_COMPLETE COMPLETE}, the ranges specified by svm pointers and sizes have been successfully migrated to the device
     * associated with command queue.
     * 
     * <p>The user is responsible for managing the event dependencies associated with this command in order to avoid overlapping access to SVM allocations.
     * Improperly specified event dependencies passed to {@code clEnqueueSVMMigrateMem} could result in undefined results.</p>
     *
     * @param command_queue   a valid host command queue. The specified set of allocation ranges will be migrated to the OpenCL device associated with {@code command_queue}.
     * @param svm_pointers    a pointer to an array of pointers. Each pointer in this array must be within an allocation produced by a call to {@link CL20#clSVMAlloc SVMAlloc}.
     * @param sizes           an array of sizes. The pair {@code svm_pointers[i]} and {@code sizes[i]} together define the starting address and number of bytes in a range to be
     *                        migrated. {@code sizes} may be {@code NULL} indicating that every allocation containing any {@code svm_pointer[i]} is to be migrated. Also, if
     *                        {@code sizes[i]} is zero, then the entire allocation containing {@code svm_pointer[i]} is migrated.
     * @param flags           a bit-field that is used to specify migration options
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
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code num_svm_pointers} is zero or {@code svm_pointers} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code sizes[i]} is non-zero range {@code [svm_pointers[i], svm_pointers[i]+sizes[i])} is not contained within an existing
     *         {@link CL20#clSVMAlloc SVMAlloc} allocation.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueSVMMigrateMem.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueSVMMigrateMem(@NativeType("cl_command_queue") long command_queue, @NativeType("void const **") PointerBuffer svm_pointers, @Nullable @NativeType("size_t const *") PointerBuffer sizes, @NativeType("cl_mem_migration_flags") long flags, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(sizes, svm_pointers.remaining());
            checkSafe(event, 1);
        }
        return nclEnqueueSVMMigrateMem(command_queue, svm_pointers.remaining(), memAddress(svm_pointers), memAddressSafe(sizes), flags, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Array version of: {@link #clGetDeviceAndHostTimer GetDeviceAndHostTimer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetDeviceAndHostTimer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetDeviceAndHostTimer(@NativeType("cl_device_id") long device, @NativeType("cl_ulong *") long[] device_timestamp, @NativeType("cl_ulong *") long[] host_timestamp) {
        long __functionAddress = CL.getICD().clGetDeviceAndHostTimer;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            check(device_timestamp, 1);
            check(host_timestamp, 1);
        }
        return callPPPI(__functionAddress, device, device_timestamp, host_timestamp);
    }

    /**
     * Array version of: {@link #clGetHostTimer GetHostTimer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetHostTimer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetHostTimer(@NativeType("cl_device_id") long device, @NativeType("cl_ulong *") long[] host_timestamp) {
        long __functionAddress = CL.getICD().clGetHostTimer;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
            check(host_timestamp, 1);
        }
        return callPPI(__functionAddress, device, host_timestamp);
    }

    /**
     * Array version of: {@link #clCreateProgramWithIL CreateProgramWithIL}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithIL.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithIL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer il, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithIL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(__functionAddress, context, memAddress(il), (long)il.remaining(), errcode_ret);
    }

    /**
     * Array version of: {@link #clCloneKernel CloneKernel}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCloneKernel.html">Reference Page</a>
     */
    @NativeType("cl_kernel")
    public static long clCloneKernel(@NativeType("cl_kernel") long source_kernel, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCloneKernel;
        if (CHECKS) {
            check(__functionAddress);
            check(source_kernel);
            checkSafe(errcode_ret, 1);
        }
        return callPPP(__functionAddress, source_kernel, errcode_ret);
    }

}