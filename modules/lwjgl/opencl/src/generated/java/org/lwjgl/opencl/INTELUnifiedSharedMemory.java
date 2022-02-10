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
 * Native bindings to the <a target="_blank" href="http://www.khronos.org/registry/OpenCL/extensions/intel/cl_intel_unified_shared_memory.txt">intel_unified_shared_memory</a> extension.
 * 
 * <p>This extension adds "Unified Shared Memory" (USM) to OpenCL. Unified Shared Memory provides:</p>
 * 
 * <ul>
 * <li>Easier integration into existing code bases by representing OpenCL allocations as pointers rather than handles (`cl_mems`), with full support for
 * pointer arithmetic into allocations.</li>
 * <li>Fine-grain control over ownership and accessibility of OpenCL allocations, to optimally choose between performance and programmer convenience.</li>
 * <li>A simpler programming model, by automatically migrating some allocations between OpenCL devices and the host.</li>
 * </ul>
 * 
 * <p>While Unified Shared Memory (USM) shares many features with Shared Virtual Memory (SVM), Unified Shared Memory provides a different mix of capabilities
 * and control. Specifically:</p>
 * 
 * <ul>
 * <li>The matrix of USM capabilities supports combinations of features beyond the SVM capability queries.</li>
 * <li>USM provides explicit control over memory placement and migration by supporting host allocations with wide visibility, devices allocations for best
 * performance, and shared allocations that may migrate between devices and the host.</li>
 * <li>USM allocations may be associated with both a device and a context. The USM allocation APIs support additional memory flags and optional properties
 * to affect how memory is allocated and migrated.</li>
 * <li>There is no need for APIs to map or unmap USM allocations, because host accessible USM allocations do not need to be mapped or unmapped to access
 * the contents of a USM allocation on the host.</li>
 * <li>An application may indicate that a kernel may access categories of USM allocations indirectly, without passing a set of all indirectly accessed USM
 * allocations to the kernel, improving usability and reducing driver overhead for kernels that access many USM allocations.</li>
 * <li>USM adds API functions to query properties of a USM allocation and to provide memory advice for an allocation.</li>
 * </ul>
 * 
 * <p>Unified Shared Memory and Shared Virtual Memory can and will coexist for many implementations. All implementations that support Shared Virtual Memory
 * may support at least some types of Unified Shared Memory.</p>
 * 
 * <p>Requires {@link CL20 CL20}.</p>
 */
public class INTELUnifiedSharedMemory {

    /** Accepted value for the {@code param_name} parameter to {@link CL10#clGetDeviceInfo GetDeviceInfo} to query the Unified Shared Memory capabilities of an OpenCL device. */
    public static final int
        CL_DEVICE_HOST_MEM_CAPABILITIES_INTEL                 = 0x4190,
        CL_DEVICE_DEVICE_MEM_CAPABILITIES_INTEL               = 0x4191,
        CL_DEVICE_SINGLE_DEVICE_SHARED_MEM_CAPABILITIES_INTEL = 0x4192,
        CL_DEVICE_CROSS_DEVICE_SHARED_MEM_CAPABILITIES_INTEL  = 0x4193,
        CL_DEVICE_SHARED_SYSTEM_MEM_CAPABILITIES_INTEL        = 0x4194;

    /**
     * Bitfield type and bits describing the Unified Shared Memory capabilities of an OpenCL device.
     * ({@code cl_device_unified_shared_memory_capabilities_intel})
     */
    public static final int
        CL_UNIFIED_SHARED_MEMORY_ACCESS_INTEL                   = 1 << 0,
        CL_UNIFIED_SHARED_MEMORY_ATOMIC_ACCESS_INTEL            = 1 << 1,
        CL_UNIFIED_SHARED_MEMORY_CONCURRENT_ACCESS_INTEL        = 1 << 2,
        CL_UNIFIED_SHARED_MEMORY_CONCURRENT_ATOMIC_ACCESS_INTEL = 1 << 3;

    /** Enumerant value requesting optional allocation properties for a Unified Shared Memory allocation. */
    public static final int CL_MEM_ALLOC_FLAGS_INTEL = 0x4195;

    /**
     * Bitfield type and bits describing optional allocation properties for a Unified Shared Memory allocation. ({@code cl_mem_alloc_flags_intel})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #CL_MEM_ALLOC_WRITE_COMBINED_INTEL MEM_ALLOC_WRITE_COMBINED_INTEL} - 
     * Request write combined (WC) memory.
     * 
     * <p>Write combined memory may improve performance in some cases, however write combined memory must be used with care since it may hurt performance in
     * other cases or use different coherency protocols than non-write combined memory.</p>
     * </li>
     * <li>{@link #CL_MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL} - 
     * Request the implementation to optimize for first access being done by the device.
     * 
     * <p>This flag is valid only for {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}. This flag does not affect functionality and is purely a performance hint.</p>
     * </li>
     * <li>{@link #CL_MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL} - 
     * Request the implementation to optimize for first access being done by the host.
     * 
     * <p>This flag is valid only for {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}. This flag does not affect functionality and is purely a performance hint.</p>
     * 
     * <p>{@code CL_MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL} and {@code CL_MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL} are mutually exclusive.</p>
     * </li>
     * </ul>
     */
    public static final int
        CL_MEM_ALLOC_WRITE_COMBINED_INTEL           = 1 << 0,
        CL_MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL = 1 << 1,
        CL_MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL   = 1 << 2;

    /**
     * Enumeration type and values for the {@code param_name} parameter to {@link #clGetMemAllocInfoINTEL GetMemAllocInfoINTEL} to query information about a Unified Shared Memory
     * allocation. ({@code cl_mem_info_intel})
     * 
     * <p>Optional allocation properties may also be queried using {@code clGetMemAllocInfoINTEL}.</p>
     */
    public static final int
        CL_MEM_ALLOC_TYPE_INTEL     = 0x419A,
        CL_MEM_ALLOC_BASE_PTR_INTEL = 0x419B,
        CL_MEM_ALLOC_SIZE_INTEL     = 0x419C,
        CL_MEM_ALLOC_DEVICE_INTEL   = 0x419D;

    /**
     * Enumeration type and values describing the type of Unified Shared Memory allocation. Returned by {@link #clGetMemAllocInfoINTEL GetMemAllocInfoINTEL} when {@code param_name} is
     * {@link #CL_MEM_ALLOC_TYPE_INTEL MEM_ALLOC_TYPE_INTEL}. ({@code cl_unified_shared_memory_type_intel})
     */
    public static final int
        CL_MEM_TYPE_UNKNOWN_INTEL = 0x4196,
        CL_MEM_TYPE_HOST_INTEL    = 0x4197,
        CL_MEM_TYPE_DEVICE_INTEL  = 0x4198,
        CL_MEM_TYPE_SHARED_INTEL  = 0x4199;

    /**
     * Accepted value for the {@code param_name} parameter to {@link CL20#clSetKernelExecInfo SetKernelExecInfo} to specify that the kernel may indirectly access Unified Shared Memory
     * allocations of the specified type.
     */
    public static final int
        CL_KERNEL_EXEC_INFO_INDIRECT_HOST_ACCESS_INTEL   = 0x4200,
        CL_KERNEL_EXEC_INFO_INDIRECT_DEVICE_ACCESS_INTEL = 0x4201,
        CL_KERNEL_EXEC_INFO_INDIRECT_SHARED_ACCESS_INTEL = 0x4202;

    /**
     * Accepted value for the {@code param_name} parameter to {@link CL20#clSetKernelExecInfo SetKernelExecInfo} to specify a set of Unified Shared Memory allocations that the kernel may
     * indirectly access.
     */
    public static final int CL_KERNEL_EXEC_INFO_USM_PTRS_INTEL = 0x4203;

    /** New return values from {@link CL10#clGetEventInfo GetEventInfo} when {@code param_name} is {@link CL10#CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}. */
    public static final int
        CL_COMMAND_MEMFILL_INTEL    = 0x4204,
        CL_COMMAND_MEMCPY_INTEL     = 0x4205,
        CL_COMMAND_MIGRATEMEM_INTEL = 0x4206,
        CL_COMMAND_MEMADVISE_INTEL  = 0x4207;

    protected INTELUnifiedSharedMemory() {
        throw new UnsupportedOperationException();
    }

    // --- [ clHostMemAllocINTEL ] ---

    /** Unsafe version of: {@link #clHostMemAllocINTEL HostMemAllocINTEL} */
    public static long nclHostMemAllocINTEL(long context, long properties, long size, int alignment, long errcode_ret) {
        long __functionAddress = CL.getICD().clHostMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPP(context, properties, size, alignment, errcode_ret, __functionAddress);
    }

    /**
     * Allocates host Unified Shared Memory.
     *
     * @param context     a valid OpenCL context used to allocate the host memory
     * @param properties  an optional list of allocation properties and their corresponding values.
     *                    
     *                    <p>The list is terminated with the special property {@code 0}. If no allocation properties are required, {@code properties} may be {@code NULL}.</p>
     * @param size        the size in bytes of the requested host allocation
     * @param alignment   the minimum alignment in bytes for the requested host allocation.
     *                    
     *                    <p>It must be a power of two and must be equal to or smaller than the size of the largest data type supported by any OpenCL device in {@code context}.
     *                    If {@code alignment} is {@code 0}, a default alignment will be used that is equal to the size of the largest data type supported by any OpenCL
     *                    device in {@code context}.</p>
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-{@code NULL} address and {@link CL10#CL_SUCCESS SUCCESS} will be returned in {@code errcode_ret} if the host Unified Shared Memory is allocated successfully. Otherwise,
     *         {@code NULL} will be returned, and {@code errcode_ret} will be set to one of the following error values:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@link #CL_DEVICE_HOST_MEM_CAPABILITIES_INTEL DEVICE_HOST_MEM_CAPABILITIES_INTEL} is zero for all devices in {@code context}, indicating that no devices in {@code context}
     *         support host Unified Shared Memory allocations.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code alignment} is not zero or a power of two.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code alignment} is greater than the size of the largest data type supported by any OpenCL device in {@code context} that
     *         supports host Unified Shared Memory allocations.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a memory property name in {@code properties} is not a supported property name, if the value specified for a supported property
     *         name is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if either the {@link #CL_MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL} or {@link #CL_MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL} flags are specified.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is zero or greater than {@link CL10#CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for any OpenCL device in {@code context} that supports host
     *         Unified Shared Memory allocations.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clHostMemAllocINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") LongBuffer properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = nclHostMemAllocINTEL(context, memAddressSafe(properties), size, alignment, memAddressSafe(errcode_ret));
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ clDeviceMemAllocINTEL ] ---

    /** Unsafe version of: {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL} */
    public static long nclDeviceMemAllocINTEL(long context, long device, long properties, long size, int alignment, long errcode_ret) {
        long __functionAddress = CL.getICD().clDeviceMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
        }
        return callPPPPPP(context, device, properties, size, alignment, errcode_ret, __functionAddress);
    }

    /**
     * Allocates Unified Shared Memory specific to an OpenCL device.
     *
     * @param context     a valid OpenCL context used to allocate the device memory
     * @param device      a valid OpenCL device ID to associate with the allocation
     * @param properties  an optional list of allocation properties and their corresponding values.
     *                    
     *                    <p>The list is terminated with the special property {@code 0}. If no allocation properties are required, {@code properties} may be {@code NULL}.</p>
     * @param size        the size in bytes of the requested device allocation
     * @param alignment   the minimum alignment in bytes for the requested device allocation.
     *                    
     *                    <p>It must be a power of two and must be equal to or smaller than the size of the largest data type supported by {@code device}. If {@code alignment}
     *                    is {@code 0}, a default alignment will be used that is equal to the size of largest data type supported by {@code device}.</p>
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-{@code NULL} address and {@link CL10#CL_SUCCESS SUCCESS} will be returned in {@code errcode_ret} if the device Unified Shared Memory is allocated successfully.
     *         Otherwise, {@code NULL} will be returned, and {@code errcode_ret} will be set to one of the following error values:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not a valid device or is not associated with {@code context}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION}` if {@link #CL_DEVICE_DEVICE_MEM_CAPABILITIES_INTEL DEVICE_DEVICE_MEM_CAPABILITIES_INTEL} is zero for {@code device}, indicating that {@code device} does not support device
     *         Unified Shared Memory allocations.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code alignment} is not zero or a power of two.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code alignment} is greater than the size of the largest data type supported by {@code device}.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a memory property name in {@code properties} is not a supported property name, if the value specified for a supported property
     *         name is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if either the {@link #CL_MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL} or {@link #CL_MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL} flags are specified.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is zero or greater than {@link CL10#CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for {@code device}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clDeviceMemAllocINTEL(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @Nullable @NativeType("cl_mem_properties_intel const *") LongBuffer properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = nclDeviceMemAllocINTEL(context, device, memAddressSafe(properties), size, alignment, memAddressSafe(errcode_ret));
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ clSharedMemAllocINTEL ] ---

    /** Unsafe version of: {@link #clSharedMemAllocINTEL SharedMemAllocINTEL} */
    public static long nclSharedMemAllocINTEL(long context, long device, long properties, long size, int alignment, long errcode_ret) {
        long __functionAddress = CL.getICD().clSharedMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPPP(context, device, properties, size, alignment, errcode_ret, __functionAddress);
    }

    /**
     * Allocates Unified Shared Memory with shared ownership between the host and the specified OpenCL device.
     * 
     * <p>If the specified OpenCL device supports cross-device access capabilities, the allocation is also accessible by other OpenCL devices in the context that
     * have cross-device access capabilities.</p>
     *
     * @param context     a valid OpenCL context used to allocate the Unified Shared Memory
     * @param device      an optional OpenCL device ID to associate with the allocation.
     *                    
     *                    <p>If {@code device is} {@code NULL} then the allocation is not associated with any device. Allocations with no associated device are accessible by the host
     *                    and OpenCL devices in the context that have cross-device access capabilities.</p>
     * @param properties  an optional list of allocation properties and their corresponding values.
     *                    
     *                    <p>The list is terminated with the special property {@code 0}. If no allocation properties are required, {@code properties} may be {@code NULL}.</p>
     * @param size        the size in bytes of the requested device allocation
     * @param alignment   the minimum alignment in bytes for the requested shared allocation.
     *                    
     *                    <p>It must be a power of two and must be equal to or smaller than the size of the largest data type supported by {@code device}. If {@code alignment}
     *                    is {@code 0}, a default alignment will be used that is equal to the size of largest data type supported by {@code device}. If {@code device} is
     *                    {@code NULL}, {@code alignment} must be a power of two equal to or smaller than the size of the largest data type supported by any OpenCL device in
     *                    {@code context}, and the default alignment will be equal to the size of the largest data type supported by any OpenCL device in {@code context}.</p>
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-{@code NULL} address and {@link CL10#CL_SUCCESS SUCCESS} will be returned in {@code errcode_ret} if the shared Unified Shared Memory is allocated successfully.
     *         Otherwise, {@code NULL} will be returned, and {@code errcode_ret} will be set to one of the following error values:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not {@code NULL} and is either not a valid device or is not associated with {@code context}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code device} is not {@code NULL} and {@link #CL_DEVICE_SINGLE_DEVICE_SHARED_MEM_CAPABILITIES_INTEL DEVICE_SINGLE_DEVICE_SHARED_MEM_CAPABILITIES_INTEL} and 
     *         {@link #CL_DEVICE_CROSS_DEVICE_SHARED_MEM_CAPABILITIES_INTEL DEVICE_CROSS_DEVICE_SHARED_MEM_CAPABILITIES_INTEL} are both zero, indicating that {@code device} does not support shared Unified Shared Memory
     *         allocations, or if {@code device} is {@code NULL} and no devices in {@code context} support shared Unified Shared Memory allocations.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code alignment} is not zero or a power of two.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code device} is not {@code NULL} and {@code alignment} is greater than the size of the largest data type supported by {@code device},
     *         or if {@code device} is {@code NULL} and {@code alignment} is greater than the size of the largest data type supported by any OpenCL device in
     *         {@code context} that supports shared Unified Shared Memory allocations.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if a memory property name in {@code properties} is not a supported property name, if the value specified for a supported property
     *         name is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if both {@link #CL_MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL MEM_ALLOC_INITIAL_PLACEMENT_DEVICE_INTEL} and {@link #CL_MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL MEM_ALLOC_INITIAL_PLACEMENT_HOST_INTEL} flags are specified.</li>
     *         <li>{@link CL10#CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is zero, or if {@code device} is not {@code NULL} and {@code size} is greater than {@link CL10#CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for
     *         {@code device}, or if {@code device} is {@code NULL} and {@code size} is greater than {@link CL10#CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for any device in {@code context} that
     *         supports shared Unified Shared Memory allocations.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clSharedMemAllocINTEL(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @Nullable @NativeType("cl_mem_properties_intel const *") LongBuffer properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = nclSharedMemAllocINTEL(context, device, memAddressSafe(properties), size, alignment, memAddressSafe(errcode_ret));
        return memByteBufferSafe(__result, (int)size);
    }

    // --- [ clMemFreeINTEL ] ---

    /** Unsafe version of: {@link #clMemFreeINTEL MemFreeINTEL} */
    public static int nclMemFreeINTEL(long context, long ptr) {
        long __functionAddress = CL.getICD().clMemFreeINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPI(context, ptr, __functionAddress);
    }

    /**
     * Frees a Unified Shared Memory allocation.
     * 
     * <p>Note that {@code clMemFreeINTEL} may not wait for previously enqueued commands that may be using {@code ptr} to finish before freeing {@code ptr}. It
     * is the responsibility of the application to make sure enqueued commands that use {@code ptr} are complete before freeing {@code ptr}. Applications
     * should take particular care freeing memory allocations with kernels that may access memory indirectly, since a kernel with indirect memory access
     * counts as using all memory allocations of the specified type or types.</p>
     * 
     * <p>To wait for previously enqueued commands to finish that may be using {@code ptr} before freeing {@code ptr}, use the {@link #clMemBlockingFreeINTEL MemBlockingFreeINTEL} function
     * instead.</p>
     *
     * @param context a valid OpenCL context used to free the Unified Shared Memory allocation
     * @param ptr     the Unified Shared Memory allocation to free.
     *                
     *                <p>It must be a value returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}, or a {@code NULL} pointer. If {@code ptr} is
     *                {@code NULL} then no action occurs.</p>
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function executes successfully. Otherwise, they will return one of the following error values:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is not a value returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}, or a {@code NULL} pointer.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clMemFreeINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("void *") ByteBuffer ptr) {
        return nclMemFreeINTEL(context, memAddressSafe(ptr));
    }

    // --- [ clMemBlockingFreeINTEL ] ---

    /** Unsafe version of: {@link #clMemBlockingFreeINTEL MemBlockingFreeINTEL} */
    public static int nclMemBlockingFreeINTEL(long context, long ptr) {
        long __functionAddress = CL.getICD().clMemBlockingFreeINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPI(context, ptr, __functionAddress);
    }

    /**
     * Frees a Unified Shared Memory allocation.
     *
     * @param context a valid OpenCL context used to free the Unified Shared Memory allocation
     * @param ptr     the Unified Shared Memory allocation to free.
     *                
     *                <p>It must be a value returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}, or a {@code NULL} pointer. If {@code ptr} is
     *                {@code NULL} then no action occurs.</p>
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function executes successfully. Otherwise, they will return one of the following error values:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code ptr} is not a value returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}, or a {@code NULL} pointer.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clMemBlockingFreeINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("void *") ByteBuffer ptr) {
        return nclMemBlockingFreeINTEL(context, memAddressSafe(ptr));
    }

    // --- [ clGetMemAllocInfoINTEL ] ---

    /**
     * Unsafe version of: {@link #clGetMemAllocInfoINTEL GetMemAllocInfoINTEL}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetMemAllocInfoINTEL(long context, long ptr, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMemAllocInfoINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPPI(context, ptr, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Queries information about a Unified Shared Memory allocation.
     *
     * @param context              a valid OpenCL context to query for information about the Unified Shared Memory allocation
     * @param ptr                  a pointer into a Unified Shared Memory allocation to query.
     *                             
     *                             <p>{@code ptr need not be a value} returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}, but the query may be faster if
     *                             it is.</p>
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_MEM_ALLOC_TYPE_INTEL MEM_ALLOC_TYPE_INTEL}</td><td>{@link #CL_MEM_ALLOC_BASE_PTR_INTEL MEM_ALLOC_BASE_PTR_INTEL}</td><td>{@link #CL_MEM_ALLOC_SIZE_INTEL MEM_ALLOC_SIZE_INTEL}</td></tr><tr><td>{@link #CL_MEM_ALLOC_DEVICE_INTEL MEM_ALLOC_DEVICE_INTEL}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned.
     *                             
     *                             <p>If {@code param_value} is {@code NULL}, it is ignored.</p>
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it will return one of the following error values:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not a valid Unified Shared Memory allocation query.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE}` if {@code param_value} is not {@code NULL} and {@code param_value_size} is smaller than the size of the query return type.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clGetMemAllocInfoINTEL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_info_intel") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemAllocInfoINTEL(context, memAddress(ptr), param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Queries information about a Unified Shared Memory allocation.
     *
     * @param context              a valid OpenCL context to query for information about the Unified Shared Memory allocation
     * @param ptr                  a pointer into a Unified Shared Memory allocation to query.
     *                             
     *                             <p>{@code ptr need not be a value} returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}, but the query may be faster if
     *                             it is.</p>
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_MEM_ALLOC_TYPE_INTEL MEM_ALLOC_TYPE_INTEL}</td><td>{@link #CL_MEM_ALLOC_BASE_PTR_INTEL MEM_ALLOC_BASE_PTR_INTEL}</td><td>{@link #CL_MEM_ALLOC_SIZE_INTEL MEM_ALLOC_SIZE_INTEL}</td></tr><tr><td>{@link #CL_MEM_ALLOC_DEVICE_INTEL MEM_ALLOC_DEVICE_INTEL}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned.
     *                             
     *                             <p>If {@code param_value} is {@code NULL}, it is ignored.</p>
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it will return one of the following error values:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not a valid Unified Shared Memory allocation query.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE}` if {@code param_value} is not {@code NULL} and {@code param_value_size} is smaller than the size of the query return type.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clGetMemAllocInfoINTEL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_info_intel") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemAllocInfoINTEL(context, memAddress(ptr), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Queries information about a Unified Shared Memory allocation.
     *
     * @param context              a valid OpenCL context to query for information about the Unified Shared Memory allocation
     * @param ptr                  a pointer into a Unified Shared Memory allocation to query.
     *                             
     *                             <p>{@code ptr need not be a value} returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}, but the query may be faster if
     *                             it is.</p>
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_MEM_ALLOC_TYPE_INTEL MEM_ALLOC_TYPE_INTEL}</td><td>{@link #CL_MEM_ALLOC_BASE_PTR_INTEL MEM_ALLOC_BASE_PTR_INTEL}</td><td>{@link #CL_MEM_ALLOC_SIZE_INTEL MEM_ALLOC_SIZE_INTEL}</td></tr><tr><td>{@link #CL_MEM_ALLOC_DEVICE_INTEL MEM_ALLOC_DEVICE_INTEL}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned.
     *                             
     *                             <p>If {@code param_value} is {@code NULL}, it is ignored.</p>
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it will return one of the following error values:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not a valid Unified Shared Memory allocation query.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE}` if {@code param_value} is not {@code NULL} and {@code param_value_size} is smaller than the size of the query return type.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clGetMemAllocInfoINTEL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_info_intel") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemAllocInfoINTEL(context, memAddress(ptr), param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clSetKernelArgMemPointerINTEL ] ---

    /** Unsafe version of: {@link #clSetKernelArgMemPointerINTEL SetKernelArgMemPointerINTEL} */
    public static int nclSetKernelArgMemPointerINTEL(long kernel, int arg_index, long arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

    /**
     * Sets a pointer into a Unified Shared Memory allocation as an argument to a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index to set.
     *                  
     *                  <p>Arguments to the kernel are referred to by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is the total number
     *                  of arguments declared by a kernel.</p>
     * @param arg_value the pointer value that should be used as the argument specified by {@code arg_index}.
     *                  
     *                  <p>The pointer value will be used as the argument by all API calls that enqueue a kernel until the argument value is set to a different pointer value
     *                  by a subsequent call. A pointer into Unified Shared Memory allocation may only be set as an argument value for an argument declared to be a pointer
     *                  to {@code global} or {@code constant} memory. For devices supporting shared system allocations, any pointer value is valid. Otherwise, the pointer
     *                  value must be {@code NULL} or must point into a Unified Shared Memory allocation returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or
     *                  {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}.</p>
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it will return one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} is not a valid argument value.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") ByteBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /**
     * Sets a pointer into a Unified Shared Memory allocation as an argument to a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index to set.
     *                  
     *                  <p>Arguments to the kernel are referred to by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is the total number
     *                  of arguments declared by a kernel.</p>
     * @param arg_value the pointer value that should be used as the argument specified by {@code arg_index}.
     *                  
     *                  <p>The pointer value will be used as the argument by all API calls that enqueue a kernel until the argument value is set to a different pointer value
     *                  by a subsequent call. A pointer into Unified Shared Memory allocation may only be set as an argument value for an argument declared to be a pointer
     *                  to {@code global} or {@code constant} memory. For devices supporting shared system allocations, any pointer value is valid. Otherwise, the pointer
     *                  value must be {@code NULL} or must point into a Unified Shared Memory allocation returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or
     *                  {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}.</p>
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it will return one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} is not a valid argument value.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") ShortBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /**
     * Sets a pointer into a Unified Shared Memory allocation as an argument to a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index to set.
     *                  
     *                  <p>Arguments to the kernel are referred to by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is the total number
     *                  of arguments declared by a kernel.</p>
     * @param arg_value the pointer value that should be used as the argument specified by {@code arg_index}.
     *                  
     *                  <p>The pointer value will be used as the argument by all API calls that enqueue a kernel until the argument value is set to a different pointer value
     *                  by a subsequent call. A pointer into Unified Shared Memory allocation may only be set as an argument value for an argument declared to be a pointer
     *                  to {@code global} or {@code constant} memory. For devices supporting shared system allocations, any pointer value is valid. Otherwise, the pointer
     *                  value must be {@code NULL} or must point into a Unified Shared Memory allocation returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or
     *                  {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}.</p>
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it will return one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} is not a valid argument value.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") IntBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /**
     * Sets a pointer into a Unified Shared Memory allocation as an argument to a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index to set.
     *                  
     *                  <p>Arguments to the kernel are referred to by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is the total number
     *                  of arguments declared by a kernel.</p>
     * @param arg_value the pointer value that should be used as the argument specified by {@code arg_index}.
     *                  
     *                  <p>The pointer value will be used as the argument by all API calls that enqueue a kernel until the argument value is set to a different pointer value
     *                  by a subsequent call. A pointer into Unified Shared Memory allocation may only be set as an argument value for an argument declared to be a pointer
     *                  to {@code global} or {@code constant} memory. For devices supporting shared system allocations, any pointer value is valid. Otherwise, the pointer
     *                  value must be {@code NULL} or must point into a Unified Shared Memory allocation returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or
     *                  {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}.</p>
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it will return one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} is not a valid argument value.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") LongBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /**
     * Sets a pointer into a Unified Shared Memory allocation as an argument to a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index to set.
     *                  
     *                  <p>Arguments to the kernel are referred to by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is the total number
     *                  of arguments declared by a kernel.</p>
     * @param arg_value the pointer value that should be used as the argument specified by {@code arg_index}.
     *                  
     *                  <p>The pointer value will be used as the argument by all API calls that enqueue a kernel until the argument value is set to a different pointer value
     *                  by a subsequent call. A pointer into Unified Shared Memory allocation may only be set as an argument value for an argument declared to be a pointer
     *                  to {@code global} or {@code constant} memory. For devices supporting shared system allocations, any pointer value is valid. Otherwise, the pointer
     *                  value must be {@code NULL} or must point into a Unified Shared Memory allocation returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or
     *                  {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}.</p>
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it will return one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} is not a valid argument value.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") FloatBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /**
     * Sets a pointer into a Unified Shared Memory allocation as an argument to a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index to set.
     *                  
     *                  <p>Arguments to the kernel are referred to by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is the total number
     *                  of arguments declared by a kernel.</p>
     * @param arg_value the pointer value that should be used as the argument specified by {@code arg_index}.
     *                  
     *                  <p>The pointer value will be used as the argument by all API calls that enqueue a kernel until the argument value is set to a different pointer value
     *                  by a subsequent call. A pointer into Unified Shared Memory allocation may only be set as an argument value for an argument declared to be a pointer
     *                  to {@code global} or {@code constant} memory. For devices supporting shared system allocations, any pointer value is valid. Otherwise, the pointer
     *                  value must be {@code NULL} or must point into a Unified Shared Memory allocation returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or
     *                  {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}.</p>
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it will return one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} is not a valid argument value.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") DoubleBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    /**
     * Sets a pointer into a Unified Shared Memory allocation as an argument to a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index to set.
     *                  
     *                  <p>Arguments to the kernel are referred to by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is the total number
     *                  of arguments declared by a kernel.</p>
     * @param arg_value the pointer value that should be used as the argument specified by {@code arg_index}.
     *                  
     *                  <p>The pointer value will be used as the argument by all API calls that enqueue a kernel until the argument value is set to a different pointer value
     *                  by a subsequent call. A pointer into Unified Shared Memory allocation may only be set as an argument value for an argument declared to be a pointer
     *                  to {@code global} or {@code constant} memory. For devices supporting shared system allocations, any pointer value is valid. Otherwise, the pointer
     *                  value must be {@code NULL} or must point into a Unified Shared Memory allocation returned by {@link #clHostMemAllocINTEL HostMemAllocINTEL}, {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL}, or
     *                  {@link #clSharedMemAllocINTEL SharedMemAllocINTEL}.</p>
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it will return one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link CL10#CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} is not a valid argument value.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") PointerBuffer arg_value) {
        return nclSetKernelArgMemPointerINTEL(kernel, arg_index, memAddress(arg_value));
    }

    // --- [ clEnqueueMemFillINTEL ] ---

    /**
     * Unsafe version of: {@link #clEnqueueMemFillINTEL EnqueueMemFillINTEL}
     *
     * @param pattern_size            the size of of the value to write to the Unified Shared Memory region, in bytes.
     *                                
     *                                <p>Must be a power of two and must be less than or equal to the size of the largest integer or floating-point vector data type supported by the
     *                                device.</p>
     * @param size                    the size of the memory region to set, in bytes
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueMemFillINTEL(long command_queue, long dst_ptr, long pattern, long pattern_size, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMemFillINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPPPI(command_queue, dst_ptr, pattern, pattern_size, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Fills a region of a memory with the specified pattern.
     *
     * @param command_queue   a valid host command queue.
     *                        
     *                        <p>The memory fill command will be queued for execution on the device associated with {@code command_queue}.</p>
     * @param dst_ptr         a pointer to the start of the memory region to fill.
     *                        
     *                        <p>The Unified Shared Memory allocation pointed to by {@code dst_ptr} must be valid for the context associated with {@code command_queue}, must be
     *                        accessible by the device associated with {@code command_queue}, and must be aligned to {@code pattern_size} bytes.</p>
     * @param pattern         a pointer to the value to write to the Unified Shared Memory region.
     *                        
     *                        <p>The memory associated with {@code pattern} can be reused or freed after the function returns.</p>
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the command is queued successfully. Otherwise, it will return one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid host command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code dst_ptr} is {@code NULL}, or if {@code dst_ptr} is not aligned to {@code pattern_size} bytes.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pattern} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pattern_size} is not a power of two or is greater than the size of the largest integer or floating-point vector data type
     *         supported by the device associated with {@code command_queue}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code size} is not a multiple of {@code pattern_size}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} is greater than zero, or if
     *         {@code event_wait_list} is not {@code NULL} and {@code num_events_in_wait_list} is zero, or if event objects in {@code event_wait_list} are not valid
     *         events.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clEnqueueMemFillINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("void *") ByteBuffer dst_ptr, @NativeType("void const *") ByteBuffer pattern, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMemFillINTEL(command_queue, memAddress(dst_ptr), memAddress(pattern), pattern.remaining(), dst_ptr.remaining(), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMemcpyINTEL ] ---

    /**
     * Unsafe version of: {@link #clEnqueueMemcpyINTEL EnqueueMemcpyINTEL}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueMemcpyINTEL(long command_queue, int blocking, long dst_ptr, long src_ptr, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMemcpyINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPPPPI(command_queue, blocking, dst_ptr, src_ptr, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Copies a region of memory from one location to another.
     *
     * @param command_queue   a valid host command queue.
     *                        
     *                        <p>The memory copy command will be queued for execution on the device associated with {@code command_queue}.</p>
     * @param blocking        indicates if the copy operation is blocking or non-blocking.
     *                        
     *                        <p>If {@code blocking is} {@link CL10#CL_TRUE TRUE}, the copy command is blocking, and the function will not return until the copy command is complete. Otherwise, if
     *                        {@code blocking} is {@link CL10#CL_FALSE FALSE}, the copy command is non-blocking, and the contents of the {@code dst_ptr} cannot be used nor can the contents of the
     *                        {@code src_ptr} be overwritten until the copy command is complete.</p>
     * @param dst_ptr         a pointer to the start of the memory region to copy to.
     *                        
     *                        <p>If {@code dst_ptr} is a pointer into a Unified Shared Memory allocation it must be valid for the context associated with {@code command_queue}.</p>
     * @param src_ptr         a pointer to the start of the memory region to copy from.
     *                        
     *                        <p>If {@code src_ptr is} a pointer into a Unified Shared Memory allocation it must be valid for the context associated with {@code command_queue}.</p>
     * @param size            the size of the memory region to copy, in bytes
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the command is queued successfully. Otherwise, it will return one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid host command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if either {@code dst_ptr} or {@code src_ptr} are {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} is greater than zero, or if
     *         {@code event_wait_list} is not {@code NULL} and {@code num_events_in_wait_list} is zero, or if event objects in {@code event_wait_list} are not valid
     *         events.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the copy operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link CL10#CL_MEM_COPY_OVERLAP MEM_COPY_OVERLAP} if the values specified for {@code dst_ptr}, {@code src_ptr} and {@code size} result in an overlapping copy.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clEnqueueMemcpyINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_bool") boolean blocking, @NativeType("void *") ByteBuffer dst_ptr, @NativeType("void const *") ByteBuffer src_ptr, @NativeType("size_t") long size, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(dst_ptr, size);
            check(src_ptr, size);
            checkSafe(event, 1);
        }
        return nclEnqueueMemcpyINTEL(command_queue, blocking ? 1 : 0, memAddress(dst_ptr), memAddress(src_ptr), size, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMigrateMemINTEL ] ---

    /**
     * Unsafe version of: {@link #clEnqueueMigrateMemINTEL EnqueueMigrateMemINTEL}
     *
     * @param size                    the size of the memory region to migrate
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueMigrateMemINTEL(long command_queue, long ptr, long size, long flags, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMigrateMemINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPJPPI(command_queue, ptr, size, flags, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Explicitly migrates a region of a shared Unified Shared Memory allocation to the device associated with {@code command_queue}.
     * 
     * <p>This is a hint that may improve performance and is not required for correctness. Memory migration may not be supported for all allocation types for all
     * devices. If memory migration is not supported for the specified memory range then the migration hint may be ignored. Memory migration may only be
     * supported at a device-specific granularity, such as a page boundary. In this case, the memory range may be expanded such that the start and end of the
     * range satisfy the granularity requirements.</p>
     *
     * @param command_queue   a valid host command queue.
     *                        
     *                        <p>The memory migration command will be queued for execution on the device associated with {@code command_queue}.</p>
     * @param ptr             a pointer to the start of the shared Unified Shared Memory allocation to migrate
     * @param flags           a bit-field that is used to specify memory migration options
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the command is queued successfully. Otherwise, it will return one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid host command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code flags} is zero or is not a supported combination of memory migration flags.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} is greater than zero, or if
     *         {@code event_wait_list} is not {@code NULL} and {@code num_events_in_wait_list} is zero, or if event objects in {@code event_wait_list} are not valid
     *         events.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clEnqueueMigrateMemINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_migration_flags") long flags, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMigrateMemINTEL(command_queue, memAddress(ptr), ptr.remaining(), flags, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMemAdviseINTEL ] ---

    /**
     * Unsafe version of: {@link #clEnqueueMemAdviseINTEL EnqueueMemAdviseINTEL}
     *
     * @param size                    the size of the memory region
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueMemAdviseINTEL(long command_queue, long ptr, long size, long advice, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMemAdviseINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPJPPI(command_queue, ptr, size, advice, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Provides advice about a region of a shared Unified Shared Memory allocation.
     * 
     * <p>Memory advice is a performance hint only and is not required for correctness.  Providing memory advice hints may override driver heuristics that
     * control shared memory behavior. Not all memory advice hints may be supported for all allocation types for all devices. If a memory advice hint is not
     * supported by the device it will be ignored. Memory advice hints may only be supported at a device-specific granularity, such as at a page boundary. In
     * this case, the memory range may be expanded such that the start and end of the range satisfy the granularity requirements.</p>
     *
     * @param command_queue   a valid host command queue.
     *                        
     *                        <p>The memory advice hints will be queued for the device associated with {@code command_queue}.</p>
     * @param ptr             a pointer to the start of the shared Unified Shared Memory allocation
     * @param advice          a bit-field describing the memory advice hints for the region
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the command is queued successfully. Otherwise, it will return one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid host command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code advice} is not supported advice for the device associated with {@code command_queue}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} is greater than zero, or if
     *         {@code event_wait_list} is not {@code NULL} and {@code num_events_in_wait_list} is zero, or if event objects in {@code event_wait_list} are not valid
     *         events.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     */
    @NativeType("cl_int")
    public static int clEnqueueMemAdviseINTEL(@NativeType("cl_command_queue") long command_queue, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_advice_intel") long advice, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMemAdviseINTEL(command_queue, memAddress(ptr), ptr.remaining(), advice, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** Array version of: {@link #clHostMemAllocINTEL HostMemAllocINTEL} */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clHostMemAllocINTEL(@NativeType("cl_context") long context, @Nullable @NativeType("cl_mem_properties_intel const *") long[] properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clHostMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = callPPPPP(context, properties, size, alignment, errcode_ret, __functionAddress);
        return memByteBufferSafe(__result, (int)size);
    }

    /** Array version of: {@link #clDeviceMemAllocINTEL DeviceMemAllocINTEL} */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clDeviceMemAllocINTEL(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @Nullable @NativeType("cl_mem_properties_intel const *") long[] properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clDeviceMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            check(device);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = callPPPPPP(context, device, properties, size, alignment, errcode_ret, __functionAddress);
        return memByteBufferSafe(__result, (int)size);
    }

    /** Array version of: {@link #clSharedMemAllocINTEL SharedMemAllocINTEL} */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clSharedMemAllocINTEL(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @Nullable @NativeType("cl_mem_properties_intel const *") long[] properties, @NativeType("size_t") long size, @NativeType("cl_uint") int alignment, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clSharedMemAllocINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        long __result = callPPPPPP(context, device, properties, size, alignment, errcode_ret, __functionAddress);
        return memByteBufferSafe(__result, (int)size);
    }

    /** Array version of: {@link #clGetMemAllocInfoINTEL GetMemAllocInfoINTEL} */
    @NativeType("cl_int")
    public static int clGetMemAllocInfoINTEL(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_mem_info_intel") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMemAllocInfoINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPI(context, memAddress(ptr), param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** Array version of: {@link #clSetKernelArgMemPointerINTEL SetKernelArgMemPointerINTEL} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") short[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

    /** Array version of: {@link #clSetKernelArgMemPointerINTEL SetKernelArgMemPointerINTEL} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") int[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

    /** Array version of: {@link #clSetKernelArgMemPointerINTEL SetKernelArgMemPointerINTEL} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") long[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

    /** Array version of: {@link #clSetKernelArgMemPointerINTEL SetKernelArgMemPointerINTEL} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") float[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

    /** Array version of: {@link #clSetKernelArgMemPointerINTEL SetKernelArgMemPointerINTEL} */
    @NativeType("cl_int")
    public static int clSetKernelArgMemPointerINTEL(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") double[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArgMemPointerINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPI(kernel, arg_index, arg_value, __functionAddress);
    }

}