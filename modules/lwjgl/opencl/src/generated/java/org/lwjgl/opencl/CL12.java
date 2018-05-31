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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core OpenCL 1.2 functionality. */
public class CL12 extends CL11 {

    /** Error Codes. */
    public static final int
        CL_COMPILE_PROGRAM_FAILURE        = -15,
        CL_LINKER_NOT_AVAILABLE           = -16,
        CL_LINK_PROGRAM_FAILURE           = -17,
        CL_DEVICE_PARTITION_FAILED        = -18,
        CL_KERNEL_ARG_INFO_NOT_AVAILABLE  = -19,
        CL_INVALID_IMAGE_DESCRIPTOR       = -65,
        CL_INVALID_COMPILER_OPTIONS       = -66,
        CL_INVALID_LINKER_OPTIONS         = -67,
        CL_INVALID_DEVICE_PARTITION_COUNT = -68;

    /** OpenCL Version. */
    public static final int CL_VERSION_1_2 = 1;

    /** cl_bool */
    public static final int
        CL_BLOCKING     = CL10.CL_TRUE,
        CL_NON_BLOCKING = CL10.CL_FALSE;

    /** cl_device_type - bitfield */
    public static final int CL_DEVICE_TYPE_CUSTOM = 1 << 4;

    /** cl_device_info */
    public static final int
        CL_DEVICE_DOUBLE_FP_CONFIG            = 0x1032,
        CL_DEVICE_LINKER_AVAILABLE            = 0x103E,
        CL_DEVICE_BUILT_IN_KERNELS            = 0x103F,
        CL_DEVICE_IMAGE_MAX_BUFFER_SIZE       = 0x1040,
        CL_DEVICE_IMAGE_MAX_ARRAY_SIZE        = 0x1041,
        CL_DEVICE_PARENT_DEVICE               = 0x1042,
        CL_DEVICE_PARTITION_MAX_SUB_DEVICES   = 0x1043,
        CL_DEVICE_PARTITION_PROPERTIES        = 0x1044,
        CL_DEVICE_PARTITION_AFFINITY_DOMAIN   = 0x1045,
        CL_DEVICE_PARTITION_TYPE              = 0x1046,
        CL_DEVICE_REFERENCE_COUNT             = 0x1047,
        CL_DEVICE_PREFERRED_INTEROP_USER_SYNC = 0x1048,
        CL_DEVICE_PRINTF_BUFFER_SIZE          = 0x1049;

    /** cl_device_fp_config - bitfield */
    public static final int CL_FP_CORRECTLY_ROUNDED_DIVIDE_SQRT = 1 << 7;

    /** cl_context_properties */
    public static final int CL_CONTEXT_INTEROP_USER_SYNC = 0x1085;

    /** cl_device_partition_property list null-terminator */
    public static final int CL_DEVICE_PARTITION_BY_COUNTS_LIST_END = 0x0;

    /**
     * Split the aggregate device into as many smaller aggregate devices as can be created, each containing {@code n} compute units. The value {@code n} is
     * passed as the value accompanying this property. If {@code n} does not divide evenly into {@code DEVICE_PARTITION_MAX_COMPUTE_UNITS}, then the
     * remaining compute units are not used.
     */
    public static final int CL_DEVICE_PARTITION_EQUALLY = 0x1086;

    /**
     * This property is followed by a {@link #CL_DEVICE_PARTITION_BY_COUNTS_LIST_END DEVICE_PARTITION_BY_COUNTS_LIST_END} terminated list of compute unit counts. For each nonzero count {@code m}
     * in the list, a sub-device is created with {@code m} compute units in it.
     * 
     * <p>The number of non-zero count entries in the list may not exceed {@link #CL_DEVICE_PARTITION_MAX_SUB_DEVICES DEVICE_PARTITION_MAX_SUB_DEVICES}.</p>
     * 
     * <p>The total number of compute units specified may not exceed {@code DEVICE_PARTITION_MAX_COMPUTE_UNITS}.</p>
     */
    public static final int CL_DEVICE_PARTITION_BY_COUNTS = 0x1087;

    /**
     * Split the device into smaller aggregate devices containing one or more compute units that all share part of a cache hierarchy. The value accompanying
     * this property may be drawn from the following list:
     * 
     * <ul>
     * <li>{@link #CL_DEVICE_AFFINITY_DOMAIN_NUMA DEVICE_AFFINITY_DOMAIN_NUMA} &ndash; Split the device into sub-devices comprised of compute units that share a NUMA node.</li>
     * <li>{@link #CL_DEVICE_AFFINITY_DOMAIN_L4_CACHE DEVICE_AFFINITY_DOMAIN_L4_CACHE} &ndash; Split the device into sub-devices comprised of compute units that share a level 4 data cache.</li>
     * <li>{@link #CL_DEVICE_AFFINITY_DOMAIN_L3_CACHE DEVICE_AFFINITY_DOMAIN_L3_CACHE} &ndash; Split the device into sub-devices comprised of compute units that share a level 3 data cache.</li>
     * <li>{@link #CL_DEVICE_AFFINITY_DOMAIN_L2_CACHE DEVICE_AFFINITY_DOMAIN_L2_CACHE} &ndash; Split the device into sub-devices comprised of compute units that share a level 2 data cache.</li>
     * <li>{@link #CL_DEVICE_AFFINITY_DOMAIN_L1_CACHE DEVICE_AFFINITY_DOMAIN_L1_CACHE} &ndash; Split the device into sub-devices comprised of compute units that share a level 1 data cache.</li>
     * <li>{@link #CL_DEVICE_AFFINITY_DOMAIN_NEXT_PARTITIONABLE DEVICE_AFFINITY_DOMAIN_NEXT_PARTITIONABLE} &ndash; Split the device along the next partitionable affinity domain. The implementation
     * shall find the first level along which the device or sub-device may be further subdivided in the order NUMA, L4, L3, L2, L1, and partition the
     * device into sub-devices comprised of compute units that share memory subsystems at this level.</li>
     * </ul>
     * 
     * <p>The user may determine what happened by calling {@link CL10#clGetDeviceInfo GetDeviceInfo}({@link #CL_DEVICE_PARTITION_TYPE DEVICE_PARTITION_TYPE}) on the sub-devices.</p>
     */
    public static final int CL_DEVICE_PARTITION_BY_AFFINITY_DOMAIN = 0x1088;

    /** cl_device_affinity_domain */
    public static final int
        CL_DEVICE_AFFINITY_DOMAIN_NUMA               = 1 << 0,
        CL_DEVICE_AFFINITY_DOMAIN_L4_CACHE           = 1 << 1,
        CL_DEVICE_AFFINITY_DOMAIN_L3_CACHE           = 1 << 2,
        CL_DEVICE_AFFINITY_DOMAIN_L2_CACHE           = 1 << 3,
        CL_DEVICE_AFFINITY_DOMAIN_L1_CACHE           = 1 << 4,
        CL_DEVICE_AFFINITY_DOMAIN_NEXT_PARTITIONABLE = 1 << 5;

    /** cl_mem_flags - bitfield */
    public static final int
        CL_MEM_HOST_WRITE_ONLY = 1 << 7,
        CL_MEM_HOST_READ_ONLY  = 1 << 8,
        CL_MEM_HOST_NO_ACCESS  = 1 << 9;

    /** cl_mem_migration_flags - bitfield */
    public static final int
        CL_MIGRATE_MEM_OBJECT_HOST              = 1 << 0,
        CL_MIGRATE_MEM_OBJECT_CONTENT_UNDEFINED = 1 << 1;

    /** cl_mem_object_type */
    public static final int
        CL_MEM_OBJECT_IMAGE2D_ARRAY  = 0x10F3,
        CL_MEM_OBJECT_IMAGE1D        = 0x10F4,
        CL_MEM_OBJECT_IMAGE1D_ARRAY  = 0x10F5,
        CL_MEM_OBJECT_IMAGE1D_BUFFER = 0x10F6;

    /** cl_image_info */
    public static final int
        CL_IMAGE_ARRAY_SIZE     = 0x1117,
        CL_IMAGE_BUFFER         = 0x1118,
        CL_IMAGE_NUM_MIP_LEVELS = 0x1119,
        CL_IMAGE_NUM_SAMPLES    = 0x111A;

    /** cl_map_flags - bitfield */
    public static final int CL_MAP_WRITE_INVALIDATE_REGION = 1 << 2;

    /** cl_program_info */
    public static final int
        CL_PROGRAM_NUM_KERNELS  = 0x1167,
        CL_PROGRAM_KERNEL_NAMES = 0x1168;

    /** cl_program_build_info */
    public static final int CL_PROGRAM_BINARY_TYPE = 0x1184;

    /** cl_program_binary_type */
    public static final int
        CL_PROGRAM_BINARY_TYPE_NONE            = 0x0,
        CL_PROGRAM_BINARY_TYPE_COMPILED_OBJECT = 0x1,
        CL_PROGRAM_BINARY_TYPE_LIBRARY         = 0x2,
        CL_PROGRAM_BINARY_TYPE_EXECUTABLE      = 0x4;

    /** cl_kernel_info */
    public static final int CL_KERNEL_ATTRIBUTES = 0x1195;

    /** cl_kernel_arg_info */
    public static final int
        CL_KERNEL_ARG_ADDRESS_QUALIFIER = 0x1196,
        CL_KERNEL_ARG_ACCESS_QUALIFIER  = 0x1197,
        CL_KERNEL_ARG_TYPE_NAME         = 0x1198,
        CL_KERNEL_ARG_TYPE_QUALIFIER    = 0x1999,
        CL_KERNEL_ARG_NAME              = 0x119A;

    /** cl_kernel_arg_address_qualifier */
    public static final int
        CL_KERNEL_ARG_ADDRESS_GLOBAL   = 0x119A,
        CL_KERNEL_ARG_ADDRESS_LOCAL    = 0x119B,
        CL_KERNEL_ARG_ADDRESS_CONSTANT = 0x119C,
        CL_KERNEL_ARG_ADDRESS_PRIVATE  = 0x119D;

    /** cl_kernel_arg_access_qualifier */
    public static final int
        CL_KERNEL_ARG_ACCESS_READ_ONLY  = 0x11A0,
        CL_KERNEL_ARG_ACCESS_WRITE_ONLY = 0x11A1,
        CL_KERNEL_ARG_ACCESS_READ_WRITE = 0x11A2,
        CL_KERNEL_ARG_ACCESS_NONE       = 0x11A3;

    /** cl_kernel_arg_type_qualifier */
    public static final int
        CL_KERNEL_ARG_TYPE_NONE     = 0,
        CL_KERNEL_ARG_TYPE_CONST    = 1 << 0,
        CL_KERNEL_ARG_TYPE_RESTRICT = 1 << 1,
        CL_KERNEL_ARG_TYPE_VOLATILE = 1 << 2;

    /** cl_kernel_work_group_info */
    public static final int CL_KERNEL_GLOBAL_WORK_SIZE = 0x11B5;

    /** cl_command_type */
    public static final int
        CL_COMMAND_BARRIER             = 0x1205,
        CL_COMMAND_MIGRATE_MEM_OBJECTS = 0x1206,
        CL_COMMAND_FILL_BUFFER         = 0x1207,
        CL_COMMAND_FILL_IMAGE          = 0x1208;

    protected CL12() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(CLCapabilities caps) {
        return checkFunctions(
            caps.clGetExtensionFunctionAddressForPlatform, caps.clRetainDevice, caps.clReleaseDevice, caps.clCreateSubDevices, caps.clCreateImage, 
            caps.clCreateProgramWithBuiltInKernels, caps.clCompileProgram, caps.clLinkProgram, caps.clUnloadPlatformCompiler, caps.clGetKernelArgInfo, 
            caps.clEnqueueFillBuffer, caps.clEnqueueFillImage, caps.clEnqueueMigrateMemObjects, caps.clEnqueueMarkerWithWaitList, 
            caps.clEnqueueBarrierWithWaitList
        );
    }

    // --- [ clGetExtensionFunctionAddressForPlatform ] ---

    /** Unsafe version of: {@link #clGetExtensionFunctionAddressForPlatform GetExtensionFunctionAddressForPlatform} */
    public static long nclGetExtensionFunctionAddressForPlatform(long platform, long funcname) {
        long __functionAddress = CL.getICD().clGetExtensionFunctionAddressForPlatform;
        if (CHECKS) {
            check(__functionAddress);
            check(platform);
        }
        return callPPP(__functionAddress, platform, funcname);
    }

    /**
     * Returns the address of the extension function named by {@code funcname} for a given {@code platform}. The pointer returned should be cast to a function
     * pointer type matching the extension function's definition defined in the appropriate extension specification and header file. A return value of {@code NULL}
     * indicates that the specified function does not exist for the implementation or platform is not a valid platform. A non-{@code NULL} return value for
     * {@code clGetExtensionFunctionAddressForPlatform} does not guarantee that an extension function is actually supported by the platform. The application
     * must also make a corresponding query using <code>clGetPlatformInfo(platform, CL_PLATFORM_EXTENSIONS, &hellip; )</code> or
     * <code>clGetDeviceInfo(device, CL_DEVICE_EXTENSIONS, &hellip; )</code> to determine if an extension is supported by the OpenCL implementation.
     * 
     * <p>{@code clGetExtensionFunctionAddressForPlatform} may not be queried for core (non-extension) functions in OpenCL. For functions that are queryable with
     * {@code clGetExtensionFunctionAddressForPlatform}, implementations may choose to also export those functions statically from the object libraries
     * implementing those functions. However, portable applications cannot rely on this behavior.</p>
     *
     * @param platform the platform to query
     * @param funcname the extension function name
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetExtensionFunctionAddressForPlatform.html">Reference Page</a>
     */
    @NativeType("void *")
    public static long clGetExtensionFunctionAddressForPlatform(@NativeType("cl_platform_id") long platform, @NativeType("cl_char const *") ByteBuffer funcname) {
        if (CHECKS) {
            checkNT1(funcname);
        }
        return nclGetExtensionFunctionAddressForPlatform(platform, memAddress(funcname));
    }

    /**
     * Returns the address of the extension function named by {@code funcname} for a given {@code platform}. The pointer returned should be cast to a function
     * pointer type matching the extension function's definition defined in the appropriate extension specification and header file. A return value of {@code NULL}
     * indicates that the specified function does not exist for the implementation or platform is not a valid platform. A non-{@code NULL} return value for
     * {@code clGetExtensionFunctionAddressForPlatform} does not guarantee that an extension function is actually supported by the platform. The application
     * must also make a corresponding query using <code>clGetPlatformInfo(platform, CL_PLATFORM_EXTENSIONS, &hellip; )</code> or
     * <code>clGetDeviceInfo(device, CL_DEVICE_EXTENSIONS, &hellip; )</code> to determine if an extension is supported by the OpenCL implementation.
     * 
     * <p>{@code clGetExtensionFunctionAddressForPlatform} may not be queried for core (non-extension) functions in OpenCL. For functions that are queryable with
     * {@code clGetExtensionFunctionAddressForPlatform}, implementations may choose to also export those functions statically from the object libraries
     * implementing those functions. However, portable applications cannot rely on this behavior.</p>
     *
     * @param platform the platform to query
     * @param funcname the extension function name
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetExtensionFunctionAddressForPlatform.html">Reference Page</a>
     */
    @NativeType("void *")
    public static long clGetExtensionFunctionAddressForPlatform(@NativeType("cl_platform_id") long platform, @NativeType("cl_char const *") CharSequence funcname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer funcnameEncoded = stack.ASCII(funcname);
            return nclGetExtensionFunctionAddressForPlatform(platform, memAddress(funcnameEncoded));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clRetainDevice ] ---

    /**
     * Increments the device reference count if {@code device} is a valid sub-device created by a call to {@link #clCreateSubDevices CreateSubDevices}. If {@code device} is a
     * root level device i.e. a {@code cl_device_id} returned by {@link CL10#clGetDeviceIDs GetDeviceIDs}, the device reference count remains unchanged.
     *
     * @param device the device to retain
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully or the device is a root-level device. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not a valid sub-device created by a call to {@link #clCreateSubDevices CreateSubDevices}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clRetainDevice.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clRetainDevice(@NativeType("cl_device_id") long device) {
        long __functionAddress = CL.getICD().clRetainDevice;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPI(__functionAddress, device);
    }

    // --- [ clReleaseDevice ] ---

    /**
     * Decrements the device reference count if {@code device} is a valid sub-device created by a call to {@link #clCreateSubDevices CreateSubDevices}. If {@code device} is a
     * root level device i.e. a {@code cl_device_id} returned by {@link CL10#clGetDeviceIDs GetDeviceIDs}, the device reference count remains unchanged.
     * 
     * <p>After the {@code device} reference count becomes zero and all the objects attached to {@code device} (such as command-queues) are released, the device
     * object is deleted.</p>
     *
     * @param device the device to release
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not a valid sub-device created by a call to {@link #clCreateSubDevices CreateSubDevices}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clReleaseDevice.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clReleaseDevice(@NativeType("cl_device_id") long device) {
        long __functionAddress = CL.getICD().clReleaseDevice;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPI(__functionAddress, device);
    }

    // --- [ clCreateSubDevices ] ---

    /**
     * Unsafe version of: {@link #clCreateSubDevices CreateSubDevices}
     *
     * @param num_devices the size of memory pointed to by {@code out_devices} specified as the number of {@code cl_device_id} entries.
     */
    public static int nclCreateSubDevices(long in_device, long properties, int num_devices, long out_devices, long num_devices_ret) {
        long __functionAddress = CL.getICD().clCreateSubDevices;
        if (CHECKS) {
            check(__functionAddress);
            check(in_device);
        }
        return callPPPPI(__functionAddress, in_device, properties, num_devices, out_devices, num_devices_ret);
    }

    /**
     * Creates an array of sub-devices that each reference a non-intersecting set of compute units within {@code in_device}, according to a partition scheme
     * given by {@code properties}. The output sub-devices may be used in every way that the root (or parent) device can be used, including creating contexts,
     * building programs, further calls to {@code clCreateSubDevices} and creating command-queues. When a command-queue is created against a sub-device, the
     * commands enqueued on the queue are executed only on the sub-device.
     * 
     * <p>A few examples that describe how to specify partition properties in {@code properties} argument to {@code clCreateSubDevices} are given below:</p>
     * 
     * <ul>
     * <li>To partition a device containing 16 compute units into two sub-devices, each containing 8 compute units, pass the following in {@code properties}:<br>
     * [ {@link #CL_DEVICE_PARTITION_EQUALLY DEVICE_PARTITION_EQUALLY}, 8, 0 ]</li>
     * <li>To partition a device with four compute units into two sub-devices with one sub-device containing 3 compute units and the other sub-device 1 compute
     * unit, pass the following in {@code properties} argument:<br>
     * [ {@link #CL_DEVICE_PARTITION_BY_COUNTS DEVICE_PARTITION_BY_COUNTS}, 3, 1, {@link #CL_DEVICE_PARTITION_BY_COUNTS_LIST_END DEVICE_PARTITION_BY_COUNTS_LIST_END}, 0 ]</li>
     * <li>To split a device along the outermost cache line (if any), pass the following in {@code properties} argument:<br>
     * [ {@link #CL_DEVICE_PARTITION_BY_AFFINITY_DOMAIN DEVICE_PARTITION_BY_AFFINITY_DOMAIN}, {@link #CL_DEVICE_AFFINITY_DOMAIN_NEXT_PARTITIONABLE DEVICE_AFFINITY_DOMAIN_NEXT_PARTITIONABLE}, 0 ]</li>
     * </ul>
     *
     * @param in_device       the device to be partitioned
     * @param properties      specifies how {@code in_device} is to be partition described by a partition name and its corresponding value. Each partition name is immediately
     *                        followed by the corresponding desired value. The list is terminated with 0. Only one partitioning scheme can be specified in {@code properties}. One of:<br><table><tr><td>{@link #CL_DEVICE_PARTITION_EQUALLY DEVICE_PARTITION_EQUALLY}</td><td>{@link #CL_DEVICE_PARTITION_BY_COUNTS DEVICE_PARTITION_BY_COUNTS}</td></tr><tr><td>{@link #CL_DEVICE_PARTITION_BY_AFFINITY_DOMAIN DEVICE_PARTITION_BY_AFFINITY_DOMAIN}</td></tr></table>
     * @param out_devices     the buffer where the OpenCL sub-devices will be returned. If {@code out_devices} is {@code NULL}, this argument is ignored. If {@code out_devices} is not
     *                        {@code NULL}, {@code num_devices} must be greater than or equal to the number of sub-devices that device may be partitioned into according to the
     *                        partitioning scheme specified in {@code properties}.
     * @param num_devices_ret the number of sub-devices that device may be partitioned into according to the partitioning scheme specified in {@code properties}. If {@code num_devices_ret}
     *                        is {@code NULL}, it is ignored.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the partition is created successfully. Otherwise, it returns a {@code NULL} value with the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if {@code in_device} is not valid.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code properties} are not valid or if values specified in {@code properties} are valid but not
     *         supported by the device.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code out_devices} is not {@code NULL} and {@code num_devices} is less than the number of sub-devices created by the
     *         partition scheme.</li>
     *         <li>{@link #CL_DEVICE_PARTITION_FAILED DEVICE_PARTITION_FAILED} if the partition name is supported by the implementation but {@code in_device} could not be further partitioned.</li>
     *         <li>{@link #CL_INVALID_DEVICE_PARTITION_COUNT INVALID_DEVICE_PARTITION_COUNT} if the partition name specified in {@code properties} is {@link #CL_DEVICE_PARTITION_BY_COUNTS DEVICE_PARTITION_BY_COUNTS} and the
     *         number of sub-devices requested exceeds {@link #CL_DEVICE_PARTITION_MAX_SUB_DEVICES DEVICE_PARTITION_MAX_SUB_DEVICES} or the total number of compute units requested exceeds
     *         {@code DEVICE_PARTITION_MAX_COMPUTE_UNITS} for {@code in_device}, or the number of compute units requested for one or more sub-devices is less
     *         than zero or the number of sub-devices requested exceeds {@code DEVICE_PARTITION_MAX_COMPUTE_UNITS} for {@code in_device}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateSubDevices.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clCreateSubDevices(@NativeType("cl_device_id") long in_device, @NativeType("cl_device_partition_property const *") PointerBuffer properties, @Nullable @NativeType("cl_device_id *") PointerBuffer out_devices, @Nullable @NativeType("cl_uint *") IntBuffer num_devices_ret) {
        if (CHECKS) {
            checkNT(properties);
            checkSafe(num_devices_ret, 1);
        }
        return nclCreateSubDevices(in_device, memAddress(properties), remainingSafe(out_devices), memAddressSafe(out_devices), memAddressSafe(num_devices_ret));
    }

    // --- [ clCreateImage ] ---

    /** Unsafe version of: {@link #clCreateImage CreateImage} */
    public static long nclCreateImage(long context, long flags, long image_format, long image_desc, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPPPPP(__functionAddress, context, flags, image_format, image_desc, host_ptr, errcode_ret);
    }

    /**
     * Creates a 1D image, 1D image buffer, 1D image array, 2D image, 2D image array or 3D image object.
     * 
     * <p>For a 3D image or 2D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 2D image slices or 2D images
     * respectively. Each 2D image is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of image elements.</p>
     * 
     * <p>For a 2D image, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
     * image elements.</p>
     * 
     * <p>For a 1D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 1D images respectively. Each 1D image or
     * 1D image buffer is a single scanline which is a linear sequence of adjacent elements.</p>
     *
     * @param context      a valid OpenCL context on which the image object is to be created
     * @param flags        a bit-field that is used to specify allocation and usage information about the image memory object being created.
     *                     
     *                     <p>For all image types except {@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}, if value specified for {@code flags} is 0, the default is used which is
     *                     {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}.</p>
     *                     
     *                     <p>For {@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER} image type, if the {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}, {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} or {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}
     *                     values are not specified in {@code flags}, they are inherited from the corresponding memory access qualifers associated with buffer. The
     *                     {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} and {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} values cannot be specified in {@code flags}
     *                     but are inherited from the corresponding memory access qualifiers associated with buffer. If {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} is specified in the
     *                     memory access qualifier values associated with buffer it does not imply any additional copies when the sub-buffer is created from buffer. If the
     *                     {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} values are not specified in {@code flags}, they
     *                     are inherited from the corresponding memory access qualifiers associated with buffer. One of:<br></p><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_desc   a pointer to a {@link CLImageDesc} structure that describes type and dimensions of the image to be allocated
     * @param host_ptr     a pointer to the image data that may already be allocated by the application. Refer to table below for a description of how large the buffer that
     *                     {@code host_ptr} points to must be.
     *                     
     *                     <table class=striped>
     *                     <tr><th>ImageType</th><th>Size of buffer that {@code host_ptr} points to</th></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D MEM_OBJECT_IMAGE1D}</td><td>&#x2265; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}</td><td>&#x2265; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}</td><td>&#x2265; {@code image_row_pitch * image_height}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE3D MEM_OBJECT_IMAGE3D}</td><td>&#x2265; {@code image_slice_pitch * image_depth}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D_ARRAY MEM_OBJECT_IMAGE1D_ARRAY}</td><td>&#x2265; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE2D_ARRAY MEM_OBJECT_IMAGE2D_ARRAY}</td><td>&#x2265; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     </table>
     * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and the {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a buffer and the row pitch and base address alignment does not follow the rules
     *         described for creating a 2D image from a buffer.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a 2D image object and the rules described above are not followed.</li>
     *         <li>{@link #CL_INVALID_IMAGE_DESCRIPTOR INVALID_IMAGE_DESCRIPTOR} if values specified in {@code image_desc} are not valid or if {@code image_desc} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions specified in {@code image_desc} exceed the maximum image dimensions for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image buffer is being created and the buffer object was created with {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} and flags specifies
     *         {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE} or {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}, or if the buffer object was created with {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} and flags specifies {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE} or
     *         {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, or if flags specifies {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image buffer is being created or an image is being created from another memory object (image or buffer) and the
     *         {@code mem_object} object was created with {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} and flags specifies {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}, or if {@code mem_object} was created with
     *         {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} and flags specifies {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, or if {@code mem_object} was created with {@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and flags specifies
     *         {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}.</li>
     *         <li>{@link CL10#CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in context that support images.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImage.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage(context, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a 1D image, 1D image buffer, 1D image array, 2D image, 2D image array or 3D image object.
     * 
     * <p>For a 3D image or 2D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 2D image slices or 2D images
     * respectively. Each 2D image is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of image elements.</p>
     * 
     * <p>For a 2D image, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
     * image elements.</p>
     * 
     * <p>For a 1D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 1D images respectively. Each 1D image or
     * 1D image buffer is a single scanline which is a linear sequence of adjacent elements.</p>
     *
     * @param context      a valid OpenCL context on which the image object is to be created
     * @param flags        a bit-field that is used to specify allocation and usage information about the image memory object being created.
     *                     
     *                     <p>For all image types except {@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}, if value specified for {@code flags} is 0, the default is used which is
     *                     {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}.</p>
     *                     
     *                     <p>For {@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER} image type, if the {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}, {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} or {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}
     *                     values are not specified in {@code flags}, they are inherited from the corresponding memory access qualifers associated with buffer. The
     *                     {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} and {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} values cannot be specified in {@code flags}
     *                     but are inherited from the corresponding memory access qualifiers associated with buffer. If {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} is specified in the
     *                     memory access qualifier values associated with buffer it does not imply any additional copies when the sub-buffer is created from buffer. If the
     *                     {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} values are not specified in {@code flags}, they
     *                     are inherited from the corresponding memory access qualifiers associated with buffer. One of:<br></p><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_desc   a pointer to a {@link CLImageDesc} structure that describes type and dimensions of the image to be allocated
     * @param host_ptr     a pointer to the image data that may already be allocated by the application. Refer to table below for a description of how large the buffer that
     *                     {@code host_ptr} points to must be.
     *                     
     *                     <table class=striped>
     *                     <tr><th>ImageType</th><th>Size of buffer that {@code host_ptr} points to</th></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D MEM_OBJECT_IMAGE1D}</td><td>&#x2265; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}</td><td>&#x2265; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}</td><td>&#x2265; {@code image_row_pitch * image_height}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE3D MEM_OBJECT_IMAGE3D}</td><td>&#x2265; {@code image_slice_pitch * image_depth}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D_ARRAY MEM_OBJECT_IMAGE1D_ARRAY}</td><td>&#x2265; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE2D_ARRAY MEM_OBJECT_IMAGE2D_ARRAY}</td><td>&#x2265; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     </table>
     * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and the {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a buffer and the row pitch and base address alignment does not follow the rules
     *         described for creating a 2D image from a buffer.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a 2D image object and the rules described above are not followed.</li>
     *         <li>{@link #CL_INVALID_IMAGE_DESCRIPTOR INVALID_IMAGE_DESCRIPTOR} if values specified in {@code image_desc} are not valid or if {@code image_desc} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions specified in {@code image_desc} exceed the maximum image dimensions for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image buffer is being created and the buffer object was created with {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} and flags specifies
     *         {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE} or {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}, or if the buffer object was created with {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} and flags specifies {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE} or
     *         {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, or if flags specifies {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image buffer is being created or an image is being created from another memory object (image or buffer) and the
     *         {@code mem_object} object was created with {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} and flags specifies {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}, or if {@code mem_object} was created with
     *         {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} and flags specifies {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, or if {@code mem_object} was created with {@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and flags specifies
     *         {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}.</li>
     *         <li>{@link CL10#CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in context that support images.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImage.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") ShortBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage(context, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a 1D image, 1D image buffer, 1D image array, 2D image, 2D image array or 3D image object.
     * 
     * <p>For a 3D image or 2D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 2D image slices or 2D images
     * respectively. Each 2D image is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of image elements.</p>
     * 
     * <p>For a 2D image, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
     * image elements.</p>
     * 
     * <p>For a 1D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 1D images respectively. Each 1D image or
     * 1D image buffer is a single scanline which is a linear sequence of adjacent elements.</p>
     *
     * @param context      a valid OpenCL context on which the image object is to be created
     * @param flags        a bit-field that is used to specify allocation and usage information about the image memory object being created.
     *                     
     *                     <p>For all image types except {@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}, if value specified for {@code flags} is 0, the default is used which is
     *                     {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}.</p>
     *                     
     *                     <p>For {@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER} image type, if the {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}, {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} or {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}
     *                     values are not specified in {@code flags}, they are inherited from the corresponding memory access qualifers associated with buffer. The
     *                     {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} and {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} values cannot be specified in {@code flags}
     *                     but are inherited from the corresponding memory access qualifiers associated with buffer. If {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} is specified in the
     *                     memory access qualifier values associated with buffer it does not imply any additional copies when the sub-buffer is created from buffer. If the
     *                     {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} values are not specified in {@code flags}, they
     *                     are inherited from the corresponding memory access qualifiers associated with buffer. One of:<br></p><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_desc   a pointer to a {@link CLImageDesc} structure that describes type and dimensions of the image to be allocated
     * @param host_ptr     a pointer to the image data that may already be allocated by the application. Refer to table below for a description of how large the buffer that
     *                     {@code host_ptr} points to must be.
     *                     
     *                     <table class=striped>
     *                     <tr><th>ImageType</th><th>Size of buffer that {@code host_ptr} points to</th></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D MEM_OBJECT_IMAGE1D}</td><td>&#x2265; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}</td><td>&#x2265; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}</td><td>&#x2265; {@code image_row_pitch * image_height}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE3D MEM_OBJECT_IMAGE3D}</td><td>&#x2265; {@code image_slice_pitch * image_depth}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D_ARRAY MEM_OBJECT_IMAGE1D_ARRAY}</td><td>&#x2265; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE2D_ARRAY MEM_OBJECT_IMAGE2D_ARRAY}</td><td>&#x2265; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     </table>
     * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and the {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a buffer and the row pitch and base address alignment does not follow the rules
     *         described for creating a 2D image from a buffer.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a 2D image object and the rules described above are not followed.</li>
     *         <li>{@link #CL_INVALID_IMAGE_DESCRIPTOR INVALID_IMAGE_DESCRIPTOR} if values specified in {@code image_desc} are not valid or if {@code image_desc} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions specified in {@code image_desc} exceed the maximum image dimensions for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image buffer is being created and the buffer object was created with {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} and flags specifies
     *         {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE} or {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}, or if the buffer object was created with {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} and flags specifies {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE} or
     *         {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, or if flags specifies {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image buffer is being created or an image is being created from another memory object (image or buffer) and the
     *         {@code mem_object} object was created with {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} and flags specifies {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}, or if {@code mem_object} was created with
     *         {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} and flags specifies {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, or if {@code mem_object} was created with {@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and flags specifies
     *         {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}.</li>
     *         <li>{@link CL10#CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in context that support images.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImage.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") IntBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage(context, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a 1D image, 1D image buffer, 1D image array, 2D image, 2D image array or 3D image object.
     * 
     * <p>For a 3D image or 2D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 2D image slices or 2D images
     * respectively. Each 2D image is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of image elements.</p>
     * 
     * <p>For a 2D image, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
     * image elements.</p>
     * 
     * <p>For a 1D image array, the image data specified by {@code host_ptr} is stored as a linear sequence of adjacent 1D images respectively. Each 1D image or
     * 1D image buffer is a single scanline which is a linear sequence of adjacent elements.</p>
     *
     * @param context      a valid OpenCL context on which the image object is to be created
     * @param flags        a bit-field that is used to specify allocation and usage information about the image memory object being created.
     *                     
     *                     <p>For all image types except {@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}, if value specified for {@code flags} is 0, the default is used which is
     *                     {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}.</p>
     *                     
     *                     <p>For {@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER} image type, if the {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}, {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} or {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}
     *                     values are not specified in {@code flags}, they are inherited from the corresponding memory access qualifers associated with buffer. The
     *                     {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} and {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} values cannot be specified in {@code flags}
     *                     but are inherited from the corresponding memory access qualifiers associated with buffer. If {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} is specified in the
     *                     memory access qualifier values associated with buffer it does not imply any additional copies when the sub-buffer is created from buffer. If the
     *                     {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} values are not specified in {@code flags}, they
     *                     are inherited from the corresponding memory access qualifiers associated with buffer. One of:<br></p><table><tr><td>{@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_desc   a pointer to a {@link CLImageDesc} structure that describes type and dimensions of the image to be allocated
     * @param host_ptr     a pointer to the image data that may already be allocated by the application. Refer to table below for a description of how large the buffer that
     *                     {@code host_ptr} points to must be.
     *                     
     *                     <table class=striped>
     *                     <tr><th>ImageType</th><th>Size of buffer that {@code host_ptr} points to</th></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D MEM_OBJECT_IMAGE1D}</td><td>&#x2265; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}</td><td>&#x2265; {@code image_row_pitch}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}</td><td>&#x2265; {@code image_row_pitch * image_height}</td></tr>
     *                     <tr><td>{@link CL10#CL_MEM_OBJECT_IMAGE3D MEM_OBJECT_IMAGE3D}</td><td>&#x2265; {@code image_slice_pitch * image_depth}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE1D_ARRAY MEM_OBJECT_IMAGE1D_ARRAY}</td><td>&#x2265; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     <tr><td>{@link #CL_MEM_OBJECT_IMAGE2D_ARRAY MEM_OBJECT_IMAGE2D_ARRAY}</td><td>&#x2265; {@code image_slice_pitch * image_array_size}</td></tr>
     *                     </table>
     * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and the {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a buffer and the row pitch and base address alignment does not follow the rules
     *         described for creating a 2D image from a buffer.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if a 2D image is created from a 2D image object and the rules described above are not followed.</li>
     *         <li>{@link #CL_INVALID_IMAGE_DESCRIPTOR INVALID_IMAGE_DESCRIPTOR} if values specified in {@code image_desc} are not valid or if {@code image_desc} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions specified in {@code image_desc} exceed the maximum image dimensions for all devices in context.</li>
     *         <li>{@link CL10#CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if {@code host_ptr} is not
     *         {@code NULL} but {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image buffer is being created and the buffer object was created with {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} and flags specifies
     *         {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE} or {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY}, or if the buffer object was created with {@link CL10#CL_MEM_READ_ONLY MEM_READ_ONLY} and flags specifies {@link CL10#CL_MEM_READ_WRITE MEM_READ_WRITE} or
     *         {@link CL10#CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}, or if flags specifies {@link CL10#CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link CL10#CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR} or {@link CL10#CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if an image buffer is being created or an image is being created from another memory object (image or buffer) and the
     *         {@code mem_object} object was created with {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} and flags specifies {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}, or if {@code mem_object} was created with
     *         {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} and flags specifies {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}, or if {@code mem_object} was created with {@link #CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and flags specifies
     *         {@link #CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or {@link #CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}.</li>
     *         <li>{@link CL10#CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in context that support images.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImage.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") FloatBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage(context, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    // --- [ clCreateProgramWithBuiltInKernels ] ---

    /**
     * Unsafe version of: {@link #clCreateProgramWithBuiltInKernels CreateProgramWithBuiltInKernels}
     *
     * @param num_devices the number of devices listed in {@code device_list}
     */
    public static long nclCreateProgramWithBuiltInKernels(long context, int num_devices, long device_list, long kernel_names, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithBuiltInKernels;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPP(__functionAddress, context, num_devices, device_list, kernel_names, errcode_ret);
    }

    /**
     * Creates a program object for a context, and loads the information related to the built-in kernels into a program object.
     *
     * @param context      a valid OpenCL context
     * @param device_list  a pointer to a list of devices that are in {@code context}. {@code device_list} must be a non-{@code NULL} value. The built-in kernels are loaded for
     *                     devices specified in this list.
     *                     
     *                     <p>The devices associated with the program object will be the list of devices specified by {@code device_list}. The list of devices specified by
     *                     {@code device_list} must be devices associated with {@code context}.</p>
     * @param kernel_names a semi-colon separated list of built-in kernel names
     * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero program object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} or {@code num_devices} is zero.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code kernel_names} is {@code NULL} or {@code kernel_names} contains a kernel name that is not supported by any of the
     *         devices in {@code device_list}.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if devices listed in {@code device_list} are not in the list of devices associated with {@code context}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithBuiltInKernels.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithBuiltInKernels(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") ByteBuffer kernel_names, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNT1(kernel_names);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateProgramWithBuiltInKernels(context, device_list.remaining(), memAddress(device_list), memAddress(kernel_names), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a program object for a context, and loads the information related to the built-in kernels into a program object.
     *
     * @param context      a valid OpenCL context
     * @param device_list  a pointer to a list of devices that are in {@code context}. {@code device_list} must be a non-{@code NULL} value. The built-in kernels are loaded for
     *                     devices specified in this list.
     *                     
     *                     <p>The devices associated with the program object will be the list of devices specified by {@code device_list}. The list of devices specified by
     *                     {@code device_list} must be devices associated with {@code context}.</p>
     * @param kernel_names a semi-colon separated list of built-in kernel names
     * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero program object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} or {@code num_devices} is zero.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code kernel_names} is {@code NULL} or {@code kernel_names} contains a kernel name that is not supported by any of the
     *         devices in {@code device_list}.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if devices listed in {@code device_list} are not in the list of devices associated with {@code context}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithBuiltInKernels.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithBuiltInKernels(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") CharSequence kernel_names, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer kernel_namesEncoded = stack.ASCII(kernel_names);
            return nclCreateProgramWithBuiltInKernels(context, device_list.remaining(), memAddress(device_list), memAddress(kernel_namesEncoded), memAddressSafe(errcode_ret));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Creates a program object for a context, and loads the information related to the built-in kernels into a program object.
     *
     * @param context      a valid OpenCL context
     * @param kernel_names a semi-colon separated list of built-in kernel names
     * @param errcode_ret  will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero program object and {@code errcode_ret} is set to {@link CL10#CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} or {@code num_devices} is zero.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code kernel_names} is {@code NULL} or {@code kernel_names} contains a kernel name that is not supported by any of the
     *         devices in {@code device_list}.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if devices listed in {@code device_list} are not in the list of devices associated with {@code context}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithBuiltInKernels.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithBuiltInKernels(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") long device, @NativeType("cl_char const *") CharSequence kernel_names, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer kernel_namesEncoded = stack.ASCII(kernel_names);
            PointerBuffer device_list = stack.pointers(device);
            return nclCreateProgramWithBuiltInKernels(context, 1, memAddress(device_list), memAddress(kernel_namesEncoded), memAddressSafe(errcode_ret));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clCompileProgram ] ---

    /**
     * Unsafe version of: {@link #clCompileProgram CompileProgram}
     *
     * @param num_devices       the number of devices listed in {@code device_list}
     * @param num_input_headers the number of programs that describe headers in the array referenced by {@code input_headers}
     */
    public static int nclCompileProgram(long program, int num_devices, long device_list, long options, int num_input_headers, long input_headers, long header_include_names, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clCompileProgram;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPPPPPI(__functionAddress, program, num_devices, device_list, options, num_input_headers, input_headers, header_include_names, pfn_notify, user_data);
    }

    /**
     * Compiles a program's source for all the devices or a specific device(s) in the OpenCL context associated with {@code program}. The pre-processor runs
     * before the program sources are compiled. The compiled binary is built for all devices associated with {@code program} or the list of devices specified.
     * The compiled binary can be queried using {@link CL10#clGetProgramInfo GetProgramInfo}(program, {@link CL10#CL_PROGRAM_BINARIES PROGRAM_BINARIES}, &hellip;) and can be specified
     * to {@link CL10#clCreateProgramWithBinary CreateProgramWithBinary} to create a new program object.
     *
     * @param program              the program object that is the compilation target
     * @param device_list          a pointer to a list of devices associated with {@code program}. If {@code device_list} is a {@code NULL} value, the compile is performed for all devices
     *                             associated with program. If {@code device_list} is a non-{@code NULL} value, the compile is performed for devices specified in this list.
     * @param options              a pointer to a null-terminated string of characters that describes the compilation options to be used for building the program executable
     * @param input_headers        an array of program embedded headers created with {@link CL10#clCreateProgramWithSource CreateProgramWithSource}
     * @param header_include_names an array that has a one to one correspondence with {@code input_headers}. Each entry in {@code header_include_names} specifies the include name used
     *                             by source in program that comes from an embedded header. The corresponding entry in {@code input_headers} identifies the program object which
     *                             contains the header source to be used. The embedded headers are first searched before the headers in the list of directories specified by the –I
     *                             compile option. If multiple entries in {@code header_include_names} refer to the same header name, the first one encountered will be used.
     * @param pfn_notify           a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
     *                             called when the program executable has been built (successfully or unsuccessfully).
     *                             
     *                             <p>If {@code pfn_notify} is not {@code NULL}, {@code clCompileProgram} does not need to wait for the compiler to complete and can return immediately once the
     *                             compilation can begin. The compilation can begin if the context, program whose sources are being compiled, list of devices, input headers, programs
     *                             that describe input headers and compiler options specified are all valid and appropriate host and device resources needed to perform the compile are
     *                             available.</p>
     *                             
     *                             <p>If {@code pfn_notify} is {@code NULL}, {@code clCompileProgram} does not return until the compiler has completed. This callback function may be called
     *                             asynchronously by the OpenCL implementation. It is the application's responsibility to ensure that the callback function is thread-safe.</p>
     * @param user_data            will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} and {@code num_devices} is greater than zero, or if {@code device_list} is not {@code NULL}
     *         and {@code num_devices} is zero.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code num_input_headers} is zero and {@code header_include_names} or {@code input_headers} are not {@code NULL} or if
     *         {@code num_input_headers} is not zero and {@code header_include_names} or {@code input_headers} are {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with program.</li>
     *         <li>{@link #CL_INVALID_COMPILER_OPTIONS INVALID_COMPILER_OPTIONS} if the compiler options specified by options are invalid.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if the compilation or build of a program executable for any of the devices listed in {@code device_list} by a
     *         previous call to {@code clCompileProgram} or {@link CL10#clBuildProgram BuildProgram} for program has not completed.</li>
     *         <li>{@link CL10#CL_COMPILER_NOT_AVAILABLE COMPILER_NOT_AVAILABLE} if a compiler is not available i.e. {@link CL10#CL_DEVICE_COMPILER_AVAILABLE DEVICE_COMPILER_AVAILABLE} is set to {@link CL10#CL_FALSE FALSE}.</li>
     *         <li>{@link #CL_COMPILE_PROGRAM_FAILURE COMPILE_PROGRAM_FAILURE} if there is a failure to compile the program source. This error will be returned if {@code clCompileProgram}
     *         does not return until the compile has completed.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if there are kernel objects attached to {@code program}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code program} has no source i.e. it has not been created with {@link CL10#clCreateProgramWithSource CreateProgramWithSource}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCompileProgram.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clCompileProgram(@NativeType("cl_program") long program, @Nullable @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") ByteBuffer options, @Nullable @NativeType("cl_program const *") PointerBuffer input_headers, @Nullable @NativeType("cl_char const **") PointerBuffer header_include_names, @Nullable @NativeType("void (*) (cl_program, void *)") CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        if (CHECKS) {
            checkNT1(options);
            checkSafe(header_include_names, remainingSafe(input_headers));
        }
        return nclCompileProgram(program, remainingSafe(device_list), memAddressSafe(device_list), memAddress(options), remainingSafe(input_headers), memAddressSafe(input_headers), memAddressSafe(header_include_names), memAddressSafe(pfn_notify), user_data);
    }

    /**
     * Compiles a program's source for all the devices or a specific device(s) in the OpenCL context associated with {@code program}. The pre-processor runs
     * before the program sources are compiled. The compiled binary is built for all devices associated with {@code program} or the list of devices specified.
     * The compiled binary can be queried using {@link CL10#clGetProgramInfo GetProgramInfo}(program, {@link CL10#CL_PROGRAM_BINARIES PROGRAM_BINARIES}, &hellip;) and can be specified
     * to {@link CL10#clCreateProgramWithBinary CreateProgramWithBinary} to create a new program object.
     *
     * @param program              the program object that is the compilation target
     * @param device_list          a pointer to a list of devices associated with {@code program}. If {@code device_list} is a {@code NULL} value, the compile is performed for all devices
     *                             associated with program. If {@code device_list} is a non-{@code NULL} value, the compile is performed for devices specified in this list.
     * @param options              a pointer to a null-terminated string of characters that describes the compilation options to be used for building the program executable
     * @param input_headers        an array of program embedded headers created with {@link CL10#clCreateProgramWithSource CreateProgramWithSource}
     * @param header_include_names an array that has a one to one correspondence with {@code input_headers}. Each entry in {@code header_include_names} specifies the include name used
     *                             by source in program that comes from an embedded header. The corresponding entry in {@code input_headers} identifies the program object which
     *                             contains the header source to be used. The embedded headers are first searched before the headers in the list of directories specified by the –I
     *                             compile option. If multiple entries in {@code header_include_names} refer to the same header name, the first one encountered will be used.
     * @param pfn_notify           a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
     *                             called when the program executable has been built (successfully or unsuccessfully).
     *                             
     *                             <p>If {@code pfn_notify} is not {@code NULL}, {@code clCompileProgram} does not need to wait for the compiler to complete and can return immediately once the
     *                             compilation can begin. The compilation can begin if the context, program whose sources are being compiled, list of devices, input headers, programs
     *                             that describe input headers and compiler options specified are all valid and appropriate host and device resources needed to perform the compile are
     *                             available.</p>
     *                             
     *                             <p>If {@code pfn_notify} is {@code NULL}, {@code clCompileProgram} does not return until the compiler has completed. This callback function may be called
     *                             asynchronously by the OpenCL implementation. It is the application's responsibility to ensure that the callback function is thread-safe.</p>
     * @param user_data            will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} and {@code num_devices} is greater than zero, or if {@code device_list} is not {@code NULL}
     *         and {@code num_devices} is zero.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code num_input_headers} is zero and {@code header_include_names} or {@code input_headers} are not {@code NULL} or if
     *         {@code num_input_headers} is not zero and {@code header_include_names} or {@code input_headers} are {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with program.</li>
     *         <li>{@link #CL_INVALID_COMPILER_OPTIONS INVALID_COMPILER_OPTIONS} if the compiler options specified by options are invalid.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if the compilation or build of a program executable for any of the devices listed in {@code device_list} by a
     *         previous call to {@code clCompileProgram} or {@link CL10#clBuildProgram BuildProgram} for program has not completed.</li>
     *         <li>{@link CL10#CL_COMPILER_NOT_AVAILABLE COMPILER_NOT_AVAILABLE} if a compiler is not available i.e. {@link CL10#CL_DEVICE_COMPILER_AVAILABLE DEVICE_COMPILER_AVAILABLE} is set to {@link CL10#CL_FALSE FALSE}.</li>
     *         <li>{@link #CL_COMPILE_PROGRAM_FAILURE COMPILE_PROGRAM_FAILURE} if there is a failure to compile the program source. This error will be returned if {@code clCompileProgram}
     *         does not return until the compile has completed.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if there are kernel objects attached to {@code program}.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if {@code program} has no source i.e. it has not been created with {@link CL10#clCreateProgramWithSource CreateProgramWithSource}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCompileProgram.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clCompileProgram(@NativeType("cl_program") long program, @Nullable @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") CharSequence options, @Nullable @NativeType("cl_program const *") PointerBuffer input_headers, @Nullable @NativeType("cl_char const **") PointerBuffer header_include_names, @Nullable @NativeType("void (*) (cl_program, void *)") CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        if (CHECKS) {
            checkSafe(header_include_names, remainingSafe(input_headers));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer optionsEncoded = stack.ASCII(options);
            return nclCompileProgram(program, remainingSafe(device_list), memAddressSafe(device_list), memAddress(optionsEncoded), remainingSafe(input_headers), memAddressSafe(input_headers), memAddressSafe(header_include_names), memAddressSafe(pfn_notify), user_data);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clLinkProgram ] ---

    /**
     * Unsafe version of: {@link #clLinkProgram LinkProgram}
     *
     * @param num_devices        the number of devices listed in {@code device_list}
     * @param num_input_programs the number of programs in array referenced by {@code input_programs}
     */
    public static long nclLinkProgram(long context, int num_devices, long device_list, long options, int num_input_programs, long input_programs, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clLinkProgram;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPPPP(__functionAddress, context, num_devices, device_list, options, num_input_programs, input_programs, pfn_notify, user_data);
    }

    /**
     * Links a set of compiled program objects and libraries for all the devices or a specific device(s) in the OpenCL context and creates an executable.
     * {@code clLinkProgram} creates a new program object which contains this executable. The executable binary can be queried using
     * {@link CL10#clGetProgramInfo GetProgramInfo}(program, {@link CL10#CL_PROGRAM_BINARIES PROGRAM_BINARIES}, &hellip;) and can be specified to {@link CL10#clCreateProgramWithBinary CreateProgramWithBinary} to
     * create a new program object.
     * 
     * <p>The devices associated with the returned program object will be the list of devices specified by {@code device_list} or if {@code device_list} is {@code NULL}
     * it will be the list of devices associated with context.</p>
     *
     * @param context        a valid OpenCL context
     * @param device_list    a pointer to a list of devices that are in {@code context}. If {@code device_list} is a {@code NULL} value, the link is performed for all devices
     *                       associated with {@code context} for which a compiled object is available. If {@code device_list} is a non-{@code NULL} value, the link is performed for
     *                       devices specified in this list for which a compiled object is available.
     * @param options        a pointer to a null-terminated string of characters that describes the link options to be used for building the program executable
     * @param input_programs an array of program objects that are compiled binaries or libraries that are to be linked to create the program executable. For each device in
     *                       {@code device_list} or if {@code device_list} is {@code NULL} the list of devices associated with {@code context}, the following cases occur:
     *                       
     *                       <ul>
     *                       <li>All programs specified by {@code input_programs} contain a compiled binary or library for the device. In this case, a link is performed to
     *                       generate a program executable for this device.</li>
     *                       <li>None of the programs contain a compiled binary or library for that device. In this case, no link is performed and there will be no program
     *                       executable generated for this device.</li>
     *                       <li>All other cases will return a {@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} error.</li>
     *                       </ul>
     * @param pfn_notify     a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
     *                       called when the program executable has been built (successfully or unsuccessfully).
     *                       
     *                       <p>If {@code pfn_notify} is not {@code NULL}, {@code clLinkProgram} does not need to wait for the linker to complete and can return immediately once the
     *                       linking operation can begin. Once the linker has completed, the {@code pfn_notify} callback function is called which returns the program object
     *                       returned by {@code clLinkProgram}. The application can query the link status and log for this program object. This callback function may be called
     *                       asynchronously by the OpenCL implementation. It is the application's responsibility to ensure that the callback function is thread-safe.</p>
     *                       
     *                       <p>If {@code pfn_notify} is {@code NULL}, {@code clLinkProgram} does not return until the linker has completed.</p>
     * @param user_data      will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     *
     * @return a valid non-zero program object, if the linking operation can begin. The linking operation can begin if the context, list of devices, input programs and
     *         linker options specified are all valid and appropriate host and device resources needed to perform the link are available.
     *         
     *         <p>If {@code pfn_notify} is {@code NULL}, the {@code errcode_ret} will be set to {@link CL10#CL_SUCCESS SUCCESS} if the link operation was successful and {@link #CL_LINK_PROGRAM_FAILURE LINK_PROGRAM_FAILURE} if
     *         there is a failure to link the compiled binaries and/or libraries.</p>
     *         
     *         <p>If {@code pfn_notify} is not {@code NULL}, {@code clLinkProgram} does not have to wait until the linker to complete and can return {@link CL10#CL_SUCCESS SUCCESS} in {@code errcode_ret}
     *         if the linking operation can begin. The {@code pfn_notify} callback function will return a {@link CL10#CL_SUCCESS SUCCESS} or {@link #CL_LINK_PROGRAM_FAILURE LINK_PROGRAM_FAILURE} if the
     *         linking operation was successful or not.</p>
     *         
     *         <p>Otherwise {@code clLinkProgram} returns a {@code NULL} program object with an appropriate error in {@code errcode_ret}. The application should query the linker status
     *         of this program object to check if the link was successful or not. The list of errors that can be returned are:</p>
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} and {@code num_devices} is greater than zero, or if {@code device_list} is not {@code NULL}
     *         and {@code num_devices} is zero.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code num_input_programs} is zero and {@code input_programs} is {@code NULL} or if {@code num_input_programs} is zero and
     *         {@code input_programs} is not {@code NULL} or if {@code num_input_programs} is not zero and {@code input_programs} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_PROGRAM INVALID_PROGRAM} if programs specified in {@code input_programs} are not valid program objects.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with {@code context}.</li>
     *         <li>{@link #CL_INVALID_LINKER_OPTIONS INVALID_LINKER_OPTIONS} if the linker options specified by {@code options} are invalid.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if the compilation or build of a program executable for any of the devices listed in {@code device_list} by a
     *         previous call to {@link #clCompileProgram CompileProgram} or {@link CL10#clBuildProgram BuildProgram} for program has not completed.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if the rules for devices containing compiled binaries or libraries as described in {@code input_programs} argument
     *         above are not followed.</li>
     *         <li>{@link #CL_LINKER_NOT_AVAILABLE LINKER_NOT_AVAILABLE} if a linker is not available i.e. {@link #CL_DEVICE_LINKER_AVAILABLE DEVICE_LINKER_AVAILABLE} is set to {@link CL10#CL_FALSE FALSE}.</li>
     *         <li>{@link #CL_LINK_PROGRAM_FAILURE LINK_PROGRAM_FAILURE} if there is a failure to link the compiled binaries and/or libraries.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clLinkProgram.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clLinkProgram(@NativeType("cl_context") long context, @Nullable @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") ByteBuffer options, @Nullable @NativeType("cl_program const *") PointerBuffer input_programs, @Nullable @NativeType("void (*) (cl_program, void *)") CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        if (CHECKS) {
            checkNT1(options);
        }
        return nclLinkProgram(context, remainingSafe(device_list), memAddressSafe(device_list), memAddress(options), remainingSafe(input_programs), memAddressSafe(input_programs), memAddressSafe(pfn_notify), user_data);
    }

    /**
     * Links a set of compiled program objects and libraries for all the devices or a specific device(s) in the OpenCL context and creates an executable.
     * {@code clLinkProgram} creates a new program object which contains this executable. The executable binary can be queried using
     * {@link CL10#clGetProgramInfo GetProgramInfo}(program, {@link CL10#CL_PROGRAM_BINARIES PROGRAM_BINARIES}, &hellip;) and can be specified to {@link CL10#clCreateProgramWithBinary CreateProgramWithBinary} to
     * create a new program object.
     * 
     * <p>The devices associated with the returned program object will be the list of devices specified by {@code device_list} or if {@code device_list} is {@code NULL}
     * it will be the list of devices associated with context.</p>
     *
     * @param context        a valid OpenCL context
     * @param device_list    a pointer to a list of devices that are in {@code context}. If {@code device_list} is a {@code NULL} value, the link is performed for all devices
     *                       associated with {@code context} for which a compiled object is available. If {@code device_list} is a non-{@code NULL} value, the link is performed for
     *                       devices specified in this list for which a compiled object is available.
     * @param options        a pointer to a null-terminated string of characters that describes the link options to be used for building the program executable
     * @param input_programs an array of program objects that are compiled binaries or libraries that are to be linked to create the program executable. For each device in
     *                       {@code device_list} or if {@code device_list} is {@code NULL} the list of devices associated with {@code context}, the following cases occur:
     *                       
     *                       <ul>
     *                       <li>All programs specified by {@code input_programs} contain a compiled binary or library for the device. In this case, a link is performed to
     *                       generate a program executable for this device.</li>
     *                       <li>None of the programs contain a compiled binary or library for that device. In this case, no link is performed and there will be no program
     *                       executable generated for this device.</li>
     *                       <li>All other cases will return a {@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} error.</li>
     *                       </ul>
     * @param pfn_notify     a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
     *                       called when the program executable has been built (successfully or unsuccessfully).
     *                       
     *                       <p>If {@code pfn_notify} is not {@code NULL}, {@code clLinkProgram} does not need to wait for the linker to complete and can return immediately once the
     *                       linking operation can begin. Once the linker has completed, the {@code pfn_notify} callback function is called which returns the program object
     *                       returned by {@code clLinkProgram}. The application can query the link status and log for this program object. This callback function may be called
     *                       asynchronously by the OpenCL implementation. It is the application's responsibility to ensure that the callback function is thread-safe.</p>
     *                       
     *                       <p>If {@code pfn_notify} is {@code NULL}, {@code clLinkProgram} does not return until the linker has completed.</p>
     * @param user_data      will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     *
     * @return a valid non-zero program object, if the linking operation can begin. The linking operation can begin if the context, list of devices, input programs and
     *         linker options specified are all valid and appropriate host and device resources needed to perform the link are available.
     *         
     *         <p>If {@code pfn_notify} is {@code NULL}, the {@code errcode_ret} will be set to {@link CL10#CL_SUCCESS SUCCESS} if the link operation was successful and {@link #CL_LINK_PROGRAM_FAILURE LINK_PROGRAM_FAILURE} if
     *         there is a failure to link the compiled binaries and/or libraries.</p>
     *         
     *         <p>If {@code pfn_notify} is not {@code NULL}, {@code clLinkProgram} does not have to wait until the linker to complete and can return {@link CL10#CL_SUCCESS SUCCESS} in {@code errcode_ret}
     *         if the linking operation can begin. The {@code pfn_notify} callback function will return a {@link CL10#CL_SUCCESS SUCCESS} or {@link #CL_LINK_PROGRAM_FAILURE LINK_PROGRAM_FAILURE} if the
     *         linking operation was successful or not.</p>
     *         
     *         <p>Otherwise {@code clLinkProgram} returns a {@code NULL} program object with an appropriate error in {@code errcode_ret}. The application should query the linker status
     *         of this program object to check if the link was successful or not. The list of errors that can be returned are:</p>
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} and {@code num_devices} is greater than zero, or if {@code device_list} is not {@code NULL}
     *         and {@code num_devices} is zero.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code num_input_programs} is zero and {@code input_programs} is {@code NULL} or if {@code num_input_programs} is zero and
     *         {@code input_programs} is not {@code NULL} or if {@code num_input_programs} is not zero and {@code input_programs} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_PROGRAM INVALID_PROGRAM} if programs specified in {@code input_programs} are not valid program objects.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with {@code context}.</li>
     *         <li>{@link #CL_INVALID_LINKER_OPTIONS INVALID_LINKER_OPTIONS} if the linker options specified by {@code options} are invalid.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if the compilation or build of a program executable for any of the devices listed in {@code device_list} by a
     *         previous call to {@link #clCompileProgram CompileProgram} or {@link CL10#clBuildProgram BuildProgram} for program has not completed.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if the rules for devices containing compiled binaries or libraries as described in {@code input_programs} argument
     *         above are not followed.</li>
     *         <li>{@link #CL_LINKER_NOT_AVAILABLE LINKER_NOT_AVAILABLE} if a linker is not available i.e. {@link #CL_DEVICE_LINKER_AVAILABLE DEVICE_LINKER_AVAILABLE} is set to {@link CL10#CL_FALSE FALSE}.</li>
     *         <li>{@link #CL_LINK_PROGRAM_FAILURE LINK_PROGRAM_FAILURE} if there is a failure to link the compiled binaries and/or libraries.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clLinkProgram.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clLinkProgram(@NativeType("cl_context") long context, @Nullable @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") CharSequence options, @Nullable @NativeType("cl_program const *") PointerBuffer input_programs, @Nullable @NativeType("void (*) (cl_program, void *)") CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer optionsEncoded = stack.ASCII(options);
            return nclLinkProgram(context, remainingSafe(device_list), memAddressSafe(device_list), memAddress(optionsEncoded), remainingSafe(input_programs), memAddressSafe(input_programs), memAddressSafe(pfn_notify), user_data);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Links a set of compiled program objects and libraries for all the devices or a specific device(s) in the OpenCL context and creates an executable.
     * {@code clLinkProgram} creates a new program object which contains this executable. The executable binary can be queried using
     * {@link CL10#clGetProgramInfo GetProgramInfo}(program, {@link CL10#CL_PROGRAM_BINARIES PROGRAM_BINARIES}, &hellip;) and can be specified to {@link CL10#clCreateProgramWithBinary CreateProgramWithBinary} to
     * create a new program object.
     * 
     * <p>The devices associated with the returned program object will be the list of devices specified by {@code device_list} or if {@code device_list} is {@code NULL}
     * it will be the list of devices associated with context.</p>
     *
     * @param context     a valid OpenCL context
     * @param device_list a pointer to a list of devices that are in {@code context}. If {@code device_list} is a {@code NULL} value, the link is performed for all devices
     *                    associated with {@code context} for which a compiled object is available. If {@code device_list} is a non-{@code NULL} value, the link is performed for
     *                    devices specified in this list for which a compiled object is available.
     * @param options     a pointer to a null-terminated string of characters that describes the link options to be used for building the program executable
     * @param pfn_notify  a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
     *                    called when the program executable has been built (successfully or unsuccessfully).
     *                    
     *                    <p>If {@code pfn_notify} is not {@code NULL}, {@code clLinkProgram} does not need to wait for the linker to complete and can return immediately once the
     *                    linking operation can begin. Once the linker has completed, the {@code pfn_notify} callback function is called which returns the program object
     *                    returned by {@code clLinkProgram}. The application can query the link status and log for this program object. This callback function may be called
     *                    asynchronously by the OpenCL implementation. It is the application's responsibility to ensure that the callback function is thread-safe.</p>
     *                    
     *                    <p>If {@code pfn_notify} is {@code NULL}, {@code clLinkProgram} does not return until the linker has completed.</p>
     * @param user_data   will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     *
     * @return a valid non-zero program object, if the linking operation can begin. The linking operation can begin if the context, list of devices, input programs and
     *         linker options specified are all valid and appropriate host and device resources needed to perform the link are available.
     *         
     *         <p>If {@code pfn_notify} is {@code NULL}, the {@code errcode_ret} will be set to {@link CL10#CL_SUCCESS SUCCESS} if the link operation was successful and {@link #CL_LINK_PROGRAM_FAILURE LINK_PROGRAM_FAILURE} if
     *         there is a failure to link the compiled binaries and/or libraries.</p>
     *         
     *         <p>If {@code pfn_notify} is not {@code NULL}, {@code clLinkProgram} does not have to wait until the linker to complete and can return {@link CL10#CL_SUCCESS SUCCESS} in {@code errcode_ret}
     *         if the linking operation can begin. The {@code pfn_notify} callback function will return a {@link CL10#CL_SUCCESS SUCCESS} or {@link #CL_LINK_PROGRAM_FAILURE LINK_PROGRAM_FAILURE} if the
     *         linking operation was successful or not.</p>
     *         
     *         <p>Otherwise {@code clLinkProgram} returns a {@code NULL} program object with an appropriate error in {@code errcode_ret}. The application should query the linker status
     *         of this program object to check if the link was successful or not. The list of errors that can be returned are:</p>
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} and {@code num_devices} is greater than zero, or if {@code device_list} is not {@code NULL}
     *         and {@code num_devices} is zero.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code num_input_programs} is zero and {@code input_programs} is {@code NULL} or if {@code num_input_programs} is zero and
     *         {@code input_programs} is not {@code NULL} or if {@code num_input_programs} is not zero and {@code input_programs} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_PROGRAM INVALID_PROGRAM} if programs specified in {@code input_programs} are not valid program objects.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with {@code context}.</li>
     *         <li>{@link #CL_INVALID_LINKER_OPTIONS INVALID_LINKER_OPTIONS} if the linker options specified by {@code options} are invalid.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if the compilation or build of a program executable for any of the devices listed in {@code device_list} by a
     *         previous call to {@link #clCompileProgram CompileProgram} or {@link CL10#clBuildProgram BuildProgram} for program has not completed.</li>
     *         <li>{@link CL10#CL_INVALID_OPERATION INVALID_OPERATION} if the rules for devices containing compiled binaries or libraries as described in {@code input_programs} argument
     *         above are not followed.</li>
     *         <li>{@link #CL_LINKER_NOT_AVAILABLE LINKER_NOT_AVAILABLE} if a linker is not available i.e. {@link #CL_DEVICE_LINKER_AVAILABLE DEVICE_LINKER_AVAILABLE} is set to {@link CL10#CL_FALSE FALSE}.</li>
     *         <li>{@link #CL_LINK_PROGRAM_FAILURE LINK_PROGRAM_FAILURE} if there is a failure to link the compiled binaries and/or libraries.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clLinkProgram.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clLinkProgram(@NativeType("cl_context") long context, @Nullable @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") CharSequence options, @Nullable @NativeType("cl_program const *") long input_program, @Nullable @NativeType("void (*) (cl_program, void *)") CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer optionsEncoded = stack.ASCII(options);
            PointerBuffer input_programs = stack.pointers(input_program);
            return nclLinkProgram(context, remainingSafe(device_list), memAddressSafe(device_list), memAddress(optionsEncoded), 1, memAddress(input_programs), memAddressSafe(pfn_notify), user_data);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clUnloadPlatformCompiler ] ---

    /**
     * Allows the implementation to release the resources allocated by the OpenCL compiler for platform. This is a hint from the application and does not
     * guarantee that the compiler will not be used in the future or that the compiler will actually be unloaded by the implementation. Calls to
     * {@link CL10#clBuildProgram BuildProgram}, {@link #clCompileProgram CompileProgram} or {@link #clLinkProgram LinkProgram} after {@code clUnloadPlatformCompiler} will reload the compiler, if necessary, to build the
     * appropriate program executable.
     *
     * @param platform the platform for which to unload the compiler
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_PLATFORM INVALID_PLATFORM} if {@code platform} is not a valid platform.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clUnloadPlatformCompiler.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clUnloadPlatformCompiler(@NativeType("cl_platform_id") long platform) {
        long __functionAddress = CL.getICD().clUnloadPlatformCompiler;
        if (CHECKS) {
            check(__functionAddress);
            check(platform);
        }
        return callPI(__functionAddress, platform);
    }

    // --- [ clGetKernelArgInfo ] ---

    /**
     * Unsafe version of: {@link #clGetKernelArgInfo GetKernelArgInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetKernelArgInfo(long kernel, int arg_indx, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelArgInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPPPI(__functionAddress, kernel, arg_indx, param_name, param_value_size, param_value, param_value_size_ret);
    }

    /**
     * Returns information about the arguments of a kernel. Kernel argument information is only available if the program object associated with kernel is
     * created with {@link CL10#clCreateProgramWithSource CreateProgramWithSource} and the program executable is built with the {@code -cl-kernel-arg-info} option specified in options
     * argument to {@link CL10#clBuildProgram BuildProgram} or {@link #clCompileProgram CompileProgram}.
     *
     * @param kernel               specifies the kernel object being queried
     * @param arg_indx             the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                             the total number of arguments declared by a kernel.
     * @param param_name           the argument information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_ARG_ADDRESS_QUALIFIER KERNEL_ARG_ADDRESS_QUALIFIER}</td><td>{@link #CL_KERNEL_ARG_ACCESS_QUALIFIER KERNEL_ARG_ACCESS_QUALIFIER}</td><td>{@link #CL_KERNEL_ARG_TYPE_NAME KERNEL_ARG_TYPE_NAME}</td></tr><tr><td>{@link #CL_KERNEL_ARG_TYPE_QUALIFIER KERNEL_ARG_TYPE_QUALIFIER}</td><td>{@link #CL_KERNEL_ARG_NAME KERNEL_ARG_NAME}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_indx} is not a valid argument index.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value} size is &lt; size of return
     *         type and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_KERNEL_ARG_INFO_NOT_AVAILABLE KERNEL_ARG_INFO_NOT_AVAILABLE} if the argument information is not available for {@code kernel}.</li>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelArgInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelArgInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_indx, @NativeType("cl_kernel_arg_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelArgInfo(kernel, arg_indx, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about the arguments of a kernel. Kernel argument information is only available if the program object associated with kernel is
     * created with {@link CL10#clCreateProgramWithSource CreateProgramWithSource} and the program executable is built with the {@code -cl-kernel-arg-info} option specified in options
     * argument to {@link CL10#clBuildProgram BuildProgram} or {@link #clCompileProgram CompileProgram}.
     *
     * @param kernel               specifies the kernel object being queried
     * @param arg_indx             the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                             the total number of arguments declared by a kernel.
     * @param param_name           the argument information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_ARG_ADDRESS_QUALIFIER KERNEL_ARG_ADDRESS_QUALIFIER}</td><td>{@link #CL_KERNEL_ARG_ACCESS_QUALIFIER KERNEL_ARG_ACCESS_QUALIFIER}</td><td>{@link #CL_KERNEL_ARG_TYPE_NAME KERNEL_ARG_TYPE_NAME}</td></tr><tr><td>{@link #CL_KERNEL_ARG_TYPE_QUALIFIER KERNEL_ARG_TYPE_QUALIFIER}</td><td>{@link #CL_KERNEL_ARG_NAME KERNEL_ARG_NAME}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_indx} is not a valid argument index.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value} size is &lt; size of return
     *         type and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_KERNEL_ARG_INFO_NOT_AVAILABLE KERNEL_ARG_INFO_NOT_AVAILABLE} if the argument information is not available for {@code kernel}.</li>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelArgInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelArgInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_indx, @NativeType("cl_kernel_arg_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelArgInfo(kernel, arg_indx, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about the arguments of a kernel. Kernel argument information is only available if the program object associated with kernel is
     * created with {@link CL10#clCreateProgramWithSource CreateProgramWithSource} and the program executable is built with the {@code -cl-kernel-arg-info} option specified in options
     * argument to {@link CL10#clBuildProgram BuildProgram} or {@link #clCompileProgram CompileProgram}.
     *
     * @param kernel               specifies the kernel object being queried
     * @param arg_indx             the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                             the total number of arguments declared by a kernel.
     * @param param_name           the argument information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_ARG_ADDRESS_QUALIFIER KERNEL_ARG_ADDRESS_QUALIFIER}</td><td>{@link #CL_KERNEL_ARG_ACCESS_QUALIFIER KERNEL_ARG_ACCESS_QUALIFIER}</td><td>{@link #CL_KERNEL_ARG_TYPE_NAME KERNEL_ARG_TYPE_NAME}</td></tr><tr><td>{@link #CL_KERNEL_ARG_TYPE_QUALIFIER KERNEL_ARG_TYPE_QUALIFIER}</td><td>{@link #CL_KERNEL_ARG_NAME KERNEL_ARG_NAME}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_indx} is not a valid argument index.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value} size is &lt; size of return
     *         type and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_KERNEL_ARG_INFO_NOT_AVAILABLE KERNEL_ARG_INFO_NOT_AVAILABLE} if the argument information is not available for {@code kernel}.</li>
     *         <li>{@link CL10#CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelArgInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelArgInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_indx, @NativeType("cl_kernel_arg_info") int param_name, @Nullable @NativeType("void *") LongBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelArgInfo(kernel, arg_indx, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clEnqueueFillBuffer ] ---

    /**
     * Unsafe version of: {@link #clEnqueueFillBuffer EnqueueFillBuffer}
     *
     * @param pattern_size            the pattern size
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueFillBuffer(long command_queue, long buffer, long pattern, long pattern_size, long offset, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueFillBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
        }
        return callPPPPPPPPI(__functionAddress, command_queue, buffer, pattern, pattern_size, offset, size, num_events_in_wait_list, event_wait_list, event);
    }

    /**
     * Enqueues a command to fill a buffer object with a pattern of a given pattern size. The usage information which indicates whether the memory object can
     * be read or written by a kernel and/or the host and is given by the {@code cl_mem_flags} argument value specified when buffer is created is ignored by
     * {@code clEnqueueFillBuffer}.
     *
     * @param command_queue   the command-queue in which the fill command will be queued. The OpenCL context associated with {@code command_queue} and {@code buffer} must be the same.
     * @param buffer          a valid buffer object
     * @param pattern         pointer to the data pattern of size {@code pattern_size} in bytes. {@code pattern} will be used to fill a region in buffer starting at {@code offset}
     *                        and is {@code size} bytes in size. The data pattern must be a scalar or vector integer or floating-point data type supported by OpenCL. For example,
     *                        if buffer is to be filled with a pattern of {@code float4} values, then pattern will be a pointer to a {@code cl_float4} value and {@code pattern_size}
     *                        will be {@code sizeof(cl_float4)}. The maximum value of {@code pattern_size} is the size of the largest integer or floating-point vector data type
     *                        supported by the OpenCL device. The memory associated with {@code pattern} can be reused or freed after the function returns.
     * @param offset          the location in bytes of the region being filled in {@code buffer} and must be a multiple of {@code pattern_size}
     * @param size            the size in bytes of region being filled in {@code buffer} and must be a multiple of {@code pattern_size}
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
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context
     *         associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code offset} or {@code offset + size} require accessing elements outside the buffer buffer object respectively.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code pattern} is {@code NULL} or if {@code pattern_size} is 0 or if {@code pattern_size} is not one of
     *         {@code [1, 2, 4, 8, 16, 32, 64, 128]}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code offset} and {@code size} are not a multiple of {@code pattern_size}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link CL10#CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueFillBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueFillBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("void const *") ByteBuffer pattern, @NativeType("size_t") long offset, @NativeType("size_t") long size, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueFillBuffer(command_queue, buffer, memAddress(pattern), pattern.remaining(), offset, size, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueFillImage ] ---

    /**
     * Unsafe version of: {@link #clEnqueueFillImage EnqueueFillImage}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueFillImage(long command_queue, long image, long fill_color, long origin, long region, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueFillImage;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(image);
        }
        return callPPPPPPPI(__functionAddress, command_queue, image, fill_color, origin, region, num_events_in_wait_list, event_wait_list, event);
    }

    /**
     * Enqueues a command to fill an image object with a specified color. The usage information which indicates whether the memory object can be read or
     * written by a kernel and/or the host and is given by the {@code cl_mem_flags} argument value specified when image is created is ignored by
     * {@code clEnqueueFillImage}.
     *
     * @param command_queue   the command-queue in which the fill command will be queued. The OpenCL context associated with {@code command_queue} and {@code image} must be the same.
     * @param image           a valid image object
     * @param fill_color      the fill color. The fill color is a four component RGBA floating-point color value if the {@code image} channel data type is not an unnormalized
     *                        signed and unsigned integer type, is a four component signed integer value if the {@code image} channel data type is an unnormalized signed integer
     *                        type and is a four component unsigned integer value if the {@code image} channel data type is an unnormalized unsigned integer type. The fill color
     *                        will be converted to the appropriate image channel format and order associated with {@code image}.
     * @param origin          the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the {@code (x)}
     *                        offset and the image index in the 1D image array. If image is a 2D image object, {@code origin[2]} must be 0. If image is a 1D image or 1D image
     *                        buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If image is a 1D image array object, {@code origin[2]} must be 0. If image is a 1D
     *                        image array object, {@code origin[1]} describes the image index in the 1D image array. If image is a 2D image array object, {@code origin[2]}
     *                        describes the image index in the 2D image array.
     * @param region          the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
     *                        of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If image is a 2D
     *                        image object, {@code region[2]} must be 1. If image is a 1D image or 1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If
     *                        image is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
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
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code fill_color} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being filled as specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for {@code origin} and {@code region}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for image are not supported by device associated with queue.</li>
     *         <li>{@link CL10#CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for image are not supported by device associated with queue.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueFillImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueFillImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") ByteBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(fill_color, 16);
            check(origin, 1);
            check(region, 1);
            checkSafe(event, 1);
        }
        return nclEnqueueFillImage(command_queue, image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to fill an image object with a specified color. The usage information which indicates whether the memory object can be read or
     * written by a kernel and/or the host and is given by the {@code cl_mem_flags} argument value specified when image is created is ignored by
     * {@code clEnqueueFillImage}.
     *
     * @param command_queue   the command-queue in which the fill command will be queued. The OpenCL context associated with {@code command_queue} and {@code image} must be the same.
     * @param image           a valid image object
     * @param fill_color      the fill color. The fill color is a four component RGBA floating-point color value if the {@code image} channel data type is not an unnormalized
     *                        signed and unsigned integer type, is a four component signed integer value if the {@code image} channel data type is an unnormalized signed integer
     *                        type and is a four component unsigned integer value if the {@code image} channel data type is an unnormalized unsigned integer type. The fill color
     *                        will be converted to the appropriate image channel format and order associated with {@code image}.
     * @param origin          the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the {@code (x)}
     *                        offset and the image index in the 1D image array. If image is a 2D image object, {@code origin[2]} must be 0. If image is a 1D image or 1D image
     *                        buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If image is a 1D image array object, {@code origin[2]} must be 0. If image is a 1D
     *                        image array object, {@code origin[1]} describes the image index in the 1D image array. If image is a 2D image array object, {@code origin[2]}
     *                        describes the image index in the 2D image array.
     * @param region          the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
     *                        of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If image is a 2D
     *                        image object, {@code region[2]} must be 1. If image is a 1D image or 1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If
     *                        image is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
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
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code fill_color} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being filled as specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for {@code origin} and {@code region}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for image are not supported by device associated with queue.</li>
     *         <li>{@link CL10#CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for image are not supported by device associated with queue.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueFillImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueFillImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") IntBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(fill_color, 16 >> 2);
            check(origin, 1);
            check(region, 1);
            checkSafe(event, 1);
        }
        return nclEnqueueFillImage(command_queue, image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to fill an image object with a specified color. The usage information which indicates whether the memory object can be read or
     * written by a kernel and/or the host and is given by the {@code cl_mem_flags} argument value specified when image is created is ignored by
     * {@code clEnqueueFillImage}.
     *
     * @param command_queue   the command-queue in which the fill command will be queued. The OpenCL context associated with {@code command_queue} and {@code image} must be the same.
     * @param image           a valid image object
     * @param fill_color      the fill color. The fill color is a four component RGBA floating-point color value if the {@code image} channel data type is not an unnormalized
     *                        signed and unsigned integer type, is a four component signed integer value if the {@code image} channel data type is an unnormalized signed integer
     *                        type and is a four component unsigned integer value if the {@code image} channel data type is an unnormalized unsigned integer type. The fill color
     *                        will be converted to the appropriate image channel format and order associated with {@code image}.
     * @param origin          the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the {@code (x)}
     *                        offset and the image index in the 1D image array. If image is a 2D image object, {@code origin[2]} must be 0. If image is a 1D image or 1D image
     *                        buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If image is a 1D image array object, {@code origin[2]} must be 0. If image is a 1D
     *                        image array object, {@code origin[1]} describes the image index in the 1D image array. If image is a 2D image array object, {@code origin[2]}
     *                        describes the image index in the 2D image array.
     * @param region          the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
     *                        of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If image is a 2D
     *                        image object, {@code region[2]} must be 1. If image is a 1D image or 1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If
     *                        image is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
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
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code fill_color} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if the region being filled as specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a {@code NULL} value.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for {@code origin} and {@code region}.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL10#CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for image are not supported by device associated with queue.</li>
     *         <li>{@link CL10#CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for image are not supported by device associated with queue.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueFillImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueFillImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") FloatBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(fill_color, 16 >> 2);
            check(origin, 1);
            check(region, 1);
            checkSafe(event, 1);
        }
        return nclEnqueueFillImage(command_queue, image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMigrateMemObjects ] ---

    /**
     * Unsafe version of: {@link #clEnqueueMigrateMemObjects EnqueueMigrateMemObjects}
     *
     * @param num_mem_objects         the number of memory objects specified in {@code mem_objects}
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueMigrateMemObjects(long command_queue, int num_mem_objects, long mem_objects, long flags, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMigrateMemObjects;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPJPPI(__functionAddress, command_queue, num_mem_objects, mem_objects, flags, num_events_in_wait_list, event_wait_list, event);
    }

    /**
     * Enqueues a command to indicate which device a set of memory objects should be associated with. Typically, memory objects are implicitly migrated to a
     * device for which enqueued commands, using the memory object, are targeted. {@code clEnqueueMigrateMemObjects} allows this migration to be explicitly
     * performed ahead of the dependent commands. This allows a user to preemptively change the association of a memory object, through regular command queue
     * scheduling, in order to prepare for another upcoming command. This also permits an application to overlap the placement of memory objects with other
     * unrelated operations before these memory objects are needed potentially hiding transfer latencies. Once the event, returned from {@code clEnqueueMigrateMemObjects},
     * has been marked {@link CL10#CL_COMPLETE COMPLETE} the memory objects specified in {@code mem_objects} have been successfully migrated to the device associated
     * with {@code command_queue}. The migrated memory object shall remain resident on the device until another command is enqueued that either implicitly or
     * explicitly migrates it away.
     * 
     * <p>{@code clEnqueueMigrateMemObjects} can also be used to direct the initial placement of a memory object, after creation, possibly avoiding the initial
     * overhead of instantiating the object on the first enqueued command to use it.</p>
     * 
     * <p>The user is responsible for managing the event dependencies, associated with this command, in order to avoid overlapping access to memory objects.
     * Improperly specified event dependencies passed to {@code clEnqueueMigrateMemObjects} could result in undefined results.</p>
     *
     * @param command_queue   a valid command-queue. The specified set of memory objects in {@code mem_objects} will be migrated to the OpenCL device associated with
     *                        {@code command_queue} or to the host if the {@link #CL_MIGRATE_MEM_OBJECT_HOST MIGRATE_MEM_OBJECT_HOST} has been specified.
     * @param mem_objects     a pointer to a list of memory objects
     * @param flags           a bit-field that is used to specify migration options. One of:<br><table><tr><td>{@link #CL_MIGRATE_MEM_OBJECT_HOST MIGRATE_MEM_OBJECT_HOST}</td><td>{@link #CL_MIGRATE_MEM_OBJECT_CONTENT_UNDEFINED MIGRATE_MEM_OBJECT_CONTENT_UNDEFINED}</td></tr></table>
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
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and memory objects in {@code mem_objects} are not the same or
     *         if the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if any of the memory objects in {@code mem_objects} is not a valid memory object.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code num_mem_objects} is zero or if {@code mem_objects} is {@code NULL}.</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code flags} is not 0 or is not any of the values described in the table above.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL10#CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for the specified set of memory objects in {@code mem_objects}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueMigrateMemObjects.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueMigrateMemObjects(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_mem_migration_flags") long flags, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMigrateMemObjects(command_queue, mem_objects.remaining(), memAddress(mem_objects), flags, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMarkerWithWaitList ] ---

    /**
     * Unsafe version of: {@link #clEnqueueMarkerWithWaitList EnqueueMarkerWithWaitList}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueMarkerWithWaitList(long command_queue, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMarkerWithWaitList;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPI(__functionAddress, command_queue, num_events_in_wait_list, event_wait_list, event);
    }

    /**
     * Enqueues a marker command which waits for either a list of events to complete, or if the list is empty it waits for all commands previously enqueued in
     * {@code command_queue} to complete before it completes. This command returns an event which can be waited on, i.e. this event can be waited on to insure
     * that all events either in the {@code event_wait_list} or all previously enqueued commands, queued before this command to {@code command_queue}, have
     * completed.
     *
     * @param command_queue   a valid command-queue
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is successfully executed. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueMarkerWithWaitList.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueMarkerWithWaitList(@NativeType("cl_command_queue") long command_queue, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMarkerWithWaitList(command_queue, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueBarrierWithWaitList ] ---

    /**
     * Unsafe version of: {@link #clEnqueueBarrierWithWaitList EnqueueBarrierWithWaitList}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueBarrierWithWaitList(long command_queue, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueBarrierWithWaitList;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPI(__functionAddress, command_queue, num_events_in_wait_list, event_wait_list, event);
    }

    /**
     * enqueues a barrier command which waits for either a list of events to complete, or if the list is empty it waits for all commands previously enqueued in
     * {@code command_queue} to complete before it completes. This command blocks command execution, that is, any following commands enqueued after it do not
     * execute until it completes. This command returns an event which can be waited on, i.e. this event can be waited on to insure that all events either in
     * the {@code event_wait_list} or all previously enqueued commands, queued before this command to {@code command_queue}, have completed.
     *
     * @param command_queue   a valid command-queue
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is successfully executed. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link CL10#CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link CL10#CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueBarrierWithWaitList.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueBarrierWithWaitList(@NativeType("cl_command_queue") long command_queue, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueBarrierWithWaitList(command_queue, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Array version of: {@link #clCreateSubDevices CreateSubDevices}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateSubDevices.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clCreateSubDevices(@NativeType("cl_device_id") long in_device, @NativeType("cl_device_partition_property const *") PointerBuffer properties, @Nullable @NativeType("cl_device_id *") PointerBuffer out_devices, @Nullable @NativeType("cl_uint *") int[] num_devices_ret) {
        long __functionAddress = CL.getICD().clCreateSubDevices;
        if (CHECKS) {
            check(__functionAddress);
            check(in_device);
            checkNT(properties);
            checkSafe(num_devices_ret, 1);
        }
        return callPPPPI(__functionAddress, in_device, memAddress(properties), remainingSafe(out_devices), memAddressSafe(out_devices), num_devices_ret);
    }

    /**
     * Array version of: {@link #clCreateImage CreateImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImage.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPP(__functionAddress, context, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), errcode_ret);
    }

    /**
     * Array version of: {@link #clCreateImage CreateImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImage.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") short[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPP(__functionAddress, context, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret);
    }

    /**
     * Array version of: {@link #clCreateImage CreateImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImage.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") int[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPP(__functionAddress, context, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret);
    }

    /**
     * Array version of: {@link #clCreateImage CreateImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateImage.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @Nullable @NativeType("void *") float[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPP(__functionAddress, context, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret);
    }

    /**
     * Array version of: {@link #clCreateProgramWithBuiltInKernels CreateProgramWithBuiltInKernels}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithBuiltInKernels.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithBuiltInKernels(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") ByteBuffer kernel_names, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithBuiltInKernels;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNT1(kernel_names);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(__functionAddress, context, device_list.remaining(), memAddress(device_list), memAddress(kernel_names), errcode_ret);
    }

    /**
     * Array version of: {@link #clCreateProgramWithBuiltInKernels CreateProgramWithBuiltInKernels}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithBuiltInKernels.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithBuiltInKernels(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") CharSequence kernel_names, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithBuiltInKernels;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer kernel_namesEncoded = stack.ASCII(kernel_names);
            return callPPPPP(__functionAddress, context, device_list.remaining(), memAddress(device_list), memAddress(kernel_namesEncoded), errcode_ret);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Array version of: {@link #clGetKernelArgInfo GetKernelArgInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelArgInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelArgInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_indx, @NativeType("cl_kernel_arg_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelArgInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(__functionAddress, kernel, arg_indx, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret));
    }

    /**
     * Array version of: {@link #clGetKernelArgInfo GetKernelArgInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelArgInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelArgInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_indx, @NativeType("cl_kernel_arg_info") int param_name, @Nullable @NativeType("void *") long[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelArgInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(__functionAddress, kernel, arg_indx, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret));
    }

    /**
     * Array version of: {@link #clEnqueueFillImage EnqueueFillImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueFillImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueFillImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") int[] fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueFillImage;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(image);
            check(fill_color, 16 >> 2);
            check(origin, 1);
            check(region, 1);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(__functionAddress, command_queue, image, fill_color, memAddress(origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Array version of: {@link #clEnqueueFillImage EnqueueFillImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueFillImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueFillImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") float[] fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueFillImage;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(image);
            check(fill_color, 16 >> 2);
            check(origin, 1);
            check(region, 1);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(__functionAddress, command_queue, image, fill_color, memAddress(origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

}