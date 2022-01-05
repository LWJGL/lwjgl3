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

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/** The core OpenCL 1.0 functionality. */
public class CL10 {

    /** Error Codes */
    public static final int
        CL_SUCCESS                         = 0,
        CL_DEVICE_NOT_FOUND                = -1,
        CL_DEVICE_NOT_AVAILABLE            = -2,
        CL_COMPILER_NOT_AVAILABLE          = -3,
        CL_MEM_OBJECT_ALLOCATION_FAILURE   = -4,
        CL_OUT_OF_RESOURCES                = -5,
        CL_OUT_OF_HOST_MEMORY              = -6,
        CL_PROFILING_INFO_NOT_AVAILABLE    = -7,
        CL_MEM_COPY_OVERLAP                = -8,
        CL_IMAGE_FORMAT_MISMATCH           = -9,
        CL_IMAGE_FORMAT_NOT_SUPPORTED      = -10,
        CL_BUILD_PROGRAM_FAILURE           = -11,
        CL_MAP_FAILURE                     = -12,
        CL_INVALID_VALUE                   = -30,
        CL_INVALID_DEVICE_TYPE             = -31,
        CL_INVALID_PLATFORM                = -32,
        CL_INVALID_DEVICE                  = -33,
        CL_INVALID_CONTEXT                 = -34,
        CL_INVALID_QUEUE_PROPERTIES        = -35,
        CL_INVALID_COMMAND_QUEUE           = -36,
        CL_INVALID_HOST_PTR                = -37,
        CL_INVALID_MEM_OBJECT              = -38,
        CL_INVALID_IMAGE_FORMAT_DESCRIPTOR = -39,
        CL_INVALID_IMAGE_SIZE              = -40,
        CL_INVALID_SAMPLER                 = -41,
        CL_INVALID_BINARY                  = -42,
        CL_INVALID_BUILD_OPTIONS           = -43,
        CL_INVALID_PROGRAM                 = -44,
        CL_INVALID_PROGRAM_EXECUTABLE      = -45,
        CL_INVALID_KERNEL_NAME             = -46,
        CL_INVALID_KERNEL_DEFINITION       = -47,
        CL_INVALID_KERNEL                  = -48,
        CL_INVALID_ARG_INDEX               = -49,
        CL_INVALID_ARG_VALUE               = -50,
        CL_INVALID_ARG_SIZE                = -51,
        CL_INVALID_KERNEL_ARGS             = -52,
        CL_INVALID_WORK_DIMENSION          = -53,
        CL_INVALID_WORK_GROUP_SIZE         = -54,
        CL_INVALID_WORK_ITEM_SIZE          = -55,
        CL_INVALID_GLOBAL_OFFSET           = -56,
        CL_INVALID_EVENT_WAIT_LIST         = -57,
        CL_INVALID_EVENT                   = -58,
        CL_INVALID_OPERATION               = -59,
        CL_INVALID_BUFFER_SIZE             = -61,
        CL_INVALID_GLOBAL_WORK_SIZE        = -63;

    /** OpenCL Version */
    public static final int CL_VERSION_1_0 = 1;

    /** cl_bool */
    public static final int
        CL_FALSE = 0,
        CL_TRUE  = 1;

    /** cl_platform_info */
    public static final int
        CL_PLATFORM_PROFILE    = 0x900,
        CL_PLATFORM_VERSION    = 0x901,
        CL_PLATFORM_NAME       = 0x902,
        CL_PLATFORM_VENDOR     = 0x903,
        CL_PLATFORM_EXTENSIONS = 0x904;

    /** cl_device_type - bitfield */
    public static final int
        CL_DEVICE_TYPE_DEFAULT     = 1 << 0,
        CL_DEVICE_TYPE_CPU         = 1 << 1,
        CL_DEVICE_TYPE_GPU         = 1 << 2,
        CL_DEVICE_TYPE_ACCELERATOR = 1 << 3,
        CL_DEVICE_TYPE_ALL         = 0xFFFFFFFF;

    /** cl_device_info */
    public static final int
        CL_DEVICE_TYPE                          = 0x1000,
        CL_DEVICE_VENDOR_ID                     = 0x1001,
        CL_DEVICE_MAX_COMPUTE_UNITS             = 0x1002,
        CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS      = 0x1003,
        CL_DEVICE_MAX_WORK_GROUP_SIZE           = 0x1004,
        CL_DEVICE_MAX_WORK_ITEM_SIZES           = 0x1005,
        CL_DEVICE_PREFERRED_VECTOR_WIDTH_CHAR   = 0x1006,
        CL_DEVICE_PREFERRED_VECTOR_WIDTH_SHORT  = 0x1007,
        CL_DEVICE_PREFERRED_VECTOR_WIDTH_INT    = 0x1008,
        CL_DEVICE_PREFERRED_VECTOR_WIDTH_LONG   = 0x1009,
        CL_DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT  = 0x100A,
        CL_DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE = 0x100B,
        CL_DEVICE_MAX_CLOCK_FREQUENCY           = 0x100C,
        CL_DEVICE_ADDRESS_BITS                  = 0x100D,
        CL_DEVICE_MAX_READ_IMAGE_ARGS           = 0x100E,
        CL_DEVICE_MAX_WRITE_IMAGE_ARGS          = 0x100F,
        CL_DEVICE_MAX_MEM_ALLOC_SIZE            = 0x1010,
        CL_DEVICE_IMAGE2D_MAX_WIDTH             = 0x1011,
        CL_DEVICE_IMAGE2D_MAX_HEIGHT            = 0x1012,
        CL_DEVICE_IMAGE3D_MAX_WIDTH             = 0x1013,
        CL_DEVICE_IMAGE3D_MAX_HEIGHT            = 0x1014,
        CL_DEVICE_IMAGE3D_MAX_DEPTH             = 0x1015,
        CL_DEVICE_IMAGE_SUPPORT                 = 0x1016,
        CL_DEVICE_MAX_PARAMETER_SIZE            = 0x1017,
        CL_DEVICE_MAX_SAMPLERS                  = 0x1018,
        CL_DEVICE_MEM_BASE_ADDR_ALIGN           = 0x1019,
        CL_DEVICE_MIN_DATA_TYPE_ALIGN_SIZE      = 0x101A,
        CL_DEVICE_SINGLE_FP_CONFIG              = 0x101B,
        CL_DEVICE_GLOBAL_MEM_CACHE_TYPE         = 0x101C,
        CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE     = 0x101D,
        CL_DEVICE_GLOBAL_MEM_CACHE_SIZE         = 0x101E,
        CL_DEVICE_GLOBAL_MEM_SIZE               = 0x101F,
        CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE      = 0x1020,
        CL_DEVICE_MAX_CONSTANT_ARGS             = 0x1021,
        CL_DEVICE_LOCAL_MEM_TYPE                = 0x1022,
        CL_DEVICE_LOCAL_MEM_SIZE                = 0x1023,
        CL_DEVICE_ERROR_CORRECTION_SUPPORT      = 0x1024,
        CL_DEVICE_PROFILING_TIMER_RESOLUTION    = 0x1025,
        CL_DEVICE_ENDIAN_LITTLE                 = 0x1026,
        CL_DEVICE_AVAILABLE                     = 0x1027,
        CL_DEVICE_COMPILER_AVAILABLE            = 0x1028,
        CL_DEVICE_EXECUTION_CAPABILITIES        = 0x1029,
        CL_DEVICE_QUEUE_PROPERTIES              = 0x102A,
        CL_DEVICE_NAME                          = 0x102B,
        CL_DEVICE_VENDOR                        = 0x102C,
        CL_DRIVER_VERSION                       = 0x102D,
        CL_DEVICE_PROFILE                       = 0x102E,
        CL_DEVICE_VERSION                       = 0x102F,
        CL_DEVICE_EXTENSIONS                    = 0x1030,
        CL_DEVICE_PLATFORM                      = 0x1031;

    /** cl_device_fp_config - bitfield */
    public static final int
        CL_FP_DENORM           = 1 << 0,
        CL_FP_INF_NAN          = 1 << 1,
        CL_FP_ROUND_TO_NEAREST = 1 << 2,
        CL_FP_ROUND_TO_ZERO    = 1 << 3,
        CL_FP_ROUND_TO_INF     = 1 << 4,
        CL_FP_FMA              = 1 << 5;

    /** cl_device_mem_cache_type */
    public static final int
        CL_NONE             = 0x0,
        CL_READ_ONLY_CACHE  = 0x1,
        CL_READ_WRITE_CACHE = 0x2;

    /** cl_device_local_mem_type */
    public static final int
        CL_LOCAL  = 0x1,
        CL_GLOBAL = 0x2;

    /** cl_device_exec_capabilities - bitfield */
    public static final int
        CL_EXEC_KERNEL        = 1 << 0,
        CL_EXEC_NATIVE_KERNEL = 1 << 1;

    /** cl_command_queue_properties - bitfield */
    public static final int
        CL_QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE = 1 << 0,
        CL_QUEUE_PROFILING_ENABLE              = 1 << 1;

    /** cl_context_info */
    public static final int
        CL_CONTEXT_REFERENCE_COUNT = 0x1080,
        CL_CONTEXT_DEVICES         = 0x1081,
        CL_CONTEXT_PROPERTIES      = 0x1082;

    /** cl_context_info + cl_context_properties */
    public static final int CL_CONTEXT_PLATFORM = 0x1084;

    /** cl_command_queue_info */
    public static final int
        CL_QUEUE_CONTEXT         = 0x1090,
        CL_QUEUE_DEVICE          = 0x1091,
        CL_QUEUE_REFERENCE_COUNT = 0x1092,
        CL_QUEUE_PROPERTIES      = 0x1093;

    /** cl_mem_flags - bitfield */
    public static final int
        CL_MEM_READ_WRITE     = 1 << 0,
        CL_MEM_WRITE_ONLY     = 1 << 1,
        CL_MEM_READ_ONLY      = 1 << 2,
        CL_MEM_USE_HOST_PTR   = 1 << 3,
        CL_MEM_ALLOC_HOST_PTR = 1 << 4,
        CL_MEM_COPY_HOST_PTR  = 1 << 5;

    /** cl_channel_order */
    public static final int
        CL_R         = 0x10B0,
        CL_A         = 0x10B1,
        CL_RG        = 0x10B2,
        CL_RA        = 0x10B3,
        CL_RGB       = 0x10B4,
        CL_RGBA      = 0x10B5,
        CL_BGRA      = 0x10B6,
        CL_ARGB      = 0x10B7,
        CL_INTENSITY = 0x10B8,
        CL_LUMINANCE = 0x10B9;

    /** cl_channel_type */
    public static final int
        CL_SNORM_INT8       = 0x10D0,
        CL_SNORM_INT16      = 0x10D1,
        CL_UNORM_INT8       = 0x10D2,
        CL_UNORM_INT16      = 0x10D3,
        CL_UNORM_SHORT_565  = 0x10D4,
        CL_UNORM_SHORT_555  = 0x10D5,
        CL_UNORM_INT_101010 = 0x10D6,
        CL_SIGNED_INT8      = 0x10D7,
        CL_SIGNED_INT16     = 0x10D8,
        CL_SIGNED_INT32     = 0x10D9,
        CL_UNSIGNED_INT8    = 0x10DA,
        CL_UNSIGNED_INT16   = 0x10DB,
        CL_UNSIGNED_INT32   = 0x10DC,
        CL_HALF_FLOAT       = 0x10DD,
        CL_FLOAT            = 0x10DE;

    /** cl_mem_object_type */
    public static final int
        CL_MEM_OBJECT_BUFFER  = 0x10F0,
        CL_MEM_OBJECT_IMAGE2D = 0x10F1,
        CL_MEM_OBJECT_IMAGE3D = 0x10F2;

    /** cl_mem_info */
    public static final int
        CL_MEM_TYPE            = 0x1100,
        CL_MEM_FLAGS           = 0x1101,
        CL_MEM_SIZE            = 0x1102,
        CL_MEM_HOST_PTR        = 0x1103,
        CL_MEM_MAP_COUNT       = 0x1104,
        CL_MEM_REFERENCE_COUNT = 0x1105,
        CL_MEM_CONTEXT         = 0x1106;

    /** cl_image_info */
    public static final int
        CL_IMAGE_FORMAT       = 0x1110,
        CL_IMAGE_ELEMENT_SIZE = 0x1111,
        CL_IMAGE_ROW_PITCH    = 0x1112,
        CL_IMAGE_SLICE_PITCH  = 0x1113,
        CL_IMAGE_WIDTH        = 0x1114,
        CL_IMAGE_HEIGHT       = 0x1115,
        CL_IMAGE_DEPTH        = 0x1116;

    /** cl_addressing_mode */
    public static final int
        CL_ADDRESS_NONE          = 0x1130,
        CL_ADDRESS_CLAMP_TO_EDGE = 0x1131,
        CL_ADDRESS_CLAMP         = 0x1132,
        CL_ADDRESS_REPEAT        = 0x1133;

    /** cl_filter_mode */
    public static final int
        CL_FILTER_NEAREST = 0x1140,
        CL_FILTER_LINEAR  = 0x1141;

    /** cl_sampler_info */
    public static final int
        CL_SAMPLER_REFERENCE_COUNT   = 0x1150,
        CL_SAMPLER_CONTEXT           = 0x1151,
        CL_SAMPLER_NORMALIZED_COORDS = 0x1152,
        CL_SAMPLER_ADDRESSING_MODE   = 0x1153,
        CL_SAMPLER_FILTER_MODE       = 0x1154;

    /** cl_map_flags - bitfield */
    public static final int
        CL_MAP_READ  = 1 << 0,
        CL_MAP_WRITE = 1 << 1;

    /** cl_program_info */
    public static final int
        CL_PROGRAM_REFERENCE_COUNT = 0x1160,
        CL_PROGRAM_CONTEXT         = 0x1161,
        CL_PROGRAM_NUM_DEVICES     = 0x1162,
        CL_PROGRAM_DEVICES         = 0x1163,
        CL_PROGRAM_SOURCE          = 0x1164,
        CL_PROGRAM_BINARY_SIZES    = 0x1165,
        CL_PROGRAM_BINARIES        = 0x1166;

    /** cl_program_build_info */
    public static final int
        CL_PROGRAM_BUILD_STATUS  = 0x1181,
        CL_PROGRAM_BUILD_OPTIONS = 0x1182,
        CL_PROGRAM_BUILD_LOG     = 0x1183;

    /** cl_build_status */
    public static final int
        CL_BUILD_SUCCESS     = 0,
        CL_BUILD_NONE        = -1,
        CL_BUILD_ERROR       = -2,
        CL_BUILD_IN_PROGRESS = -3;

    /** cl_kernel_info */
    public static final int
        CL_KERNEL_FUNCTION_NAME   = 0x1190,
        CL_KERNEL_NUM_ARGS        = 0x1191,
        CL_KERNEL_REFERENCE_COUNT = 0x1192,
        CL_KERNEL_CONTEXT         = 0x1193,
        CL_KERNEL_PROGRAM         = 0x1194;

    /** cl_kernel_work_group_info */
    public static final int
        CL_KERNEL_WORK_GROUP_SIZE         = 0x11B0,
        CL_KERNEL_COMPILE_WORK_GROUP_SIZE = 0x11B1,
        CL_KERNEL_LOCAL_MEM_SIZE          = 0x11B2;

    /** cl_event_info */
    public static final int
        CL_EVENT_COMMAND_QUEUE            = 0x11D0,
        CL_EVENT_COMMAND_TYPE             = 0x11D1,
        CL_EVENT_REFERENCE_COUNT          = 0x11D2,
        CL_EVENT_COMMAND_EXECUTION_STATUS = 0x11D3;

    /** cl_command_type */
    public static final int
        CL_COMMAND_NDRANGE_KERNEL       = 0x11F0,
        CL_COMMAND_TASK                 = 0x11F1,
        CL_COMMAND_NATIVE_KERNEL        = 0x11F2,
        CL_COMMAND_READ_BUFFER          = 0x11F3,
        CL_COMMAND_WRITE_BUFFER         = 0x11F4,
        CL_COMMAND_COPY_BUFFER          = 0x11F5,
        CL_COMMAND_READ_IMAGE           = 0x11F6,
        CL_COMMAND_WRITE_IMAGE          = 0x11F7,
        CL_COMMAND_COPY_IMAGE           = 0x11F8,
        CL_COMMAND_COPY_IMAGE_TO_BUFFER = 0x11F9,
        CL_COMMAND_COPY_BUFFER_TO_IMAGE = 0x11FA,
        CL_COMMAND_MAP_BUFFER           = 0x11FB,
        CL_COMMAND_MAP_IMAGE            = 0x11FC,
        CL_COMMAND_UNMAP_MEM_OBJECT     = 0x11FD,
        CL_COMMAND_MARKER               = 0x11FE,
        CL_COMMAND_ACQUIRE_GL_OBJECTS   = 0x11FF,
        CL_COMMAND_RELEASE_GL_OBJECTS   = 0x1200;

    /** command execution status */
    public static final int
        CL_COMPLETE  = 0x0,
        CL_RUNNING   = 0x1,
        CL_SUBMITTED = 0x2,
        CL_QUEUED    = 0x3;

    /** cl_profiling_info */
    public static final int
        CL_PROFILING_COMMAND_QUEUED = 0x1280,
        CL_PROFILING_COMMAND_SUBMIT = 0x1281,
        CL_PROFILING_COMMAND_START  = 0x1282,
        CL_PROFILING_COMMAND_END    = 0x1283;

    protected CL10() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetPlatformIDs ] ---

    /**
     * Unsafe version of: {@link #clGetPlatformIDs GetPlatformIDs}
     *
     * @param num_entries the number of {@code cl_platform_id} entries that can be added to {@code platforms}. If {@code platforms} is not {@code NULL}, the {@code num_entries} must
     *                    be greater than zero.
     */
    public static int nclGetPlatformIDs(int num_entries, long platforms, long num_platforms) {
        long __functionAddress = CL.getICD().clGetPlatformIDs;
        return callPPI(num_entries, platforms, num_platforms, __functionAddress);
    }

    /**
     * Obtains the list of available platforms.
     *
     * @param platforms     returns a list of OpenCL platforms found. The {@code cl_platform_id} values returned in {@code platforms} can be used to identify a specific OpenCL
     *                      platform. If {@code platforms} argument is {@code NULL}, this argument is ignored. The number of OpenCL platforms returned is the minimum of the value
     *                      specified by {@code num_entries} or the number of OpenCL platforms available.
     * @param num_platforms returns the number of OpenCL platforms available. If {@code num_platforms} is {@code NULL}, this argument is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_entries} is equal to zero and {@code platforms} is not {@code NULL} or if both {@code num_platforms} and
     *         {@code platforms} are {@code NULL}.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetPlatformIDs.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetPlatformIDs(@Nullable @NativeType("cl_platform_id *") PointerBuffer platforms, @Nullable @NativeType("cl_uint *") IntBuffer num_platforms) {
        if (CHECKS) {
            checkSafe(num_platforms, 1);
        }
        return nclGetPlatformIDs(remainingSafe(platforms), memAddressSafe(platforms), memAddressSafe(num_platforms));
    }

    // --- [ clGetPlatformInfo ] ---

    /**
     * Unsafe version of: {@link #clGetPlatformInfo GetPlatformInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetPlatformInfo(long platform, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetPlatformInfo;
        if (CHECKS) {
            check(platform);
        }
        return callPPPPI(platform, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns information about the specified OpenCL platform.
     *
     * @param platform             the platform to query
     * @param param_name           the parameter to query. One of:<br><table><tr><td>{@link #CL_PLATFORM_PROFILE PLATFORM_PROFILE}</td><td>{@link #CL_PLATFORM_VERSION PLATFORM_VERSION}</td><td>{@link #CL_PLATFORM_NAME PLATFORM_NAME}</td><td>{@link #CL_PLATFORM_VENDOR PLATFORM_VENDOR}</td></tr><tr><td>{@link #CL_PLATFORM_EXTENSIONS PLATFORM_EXTENSIONS}</td><td>{@link CL21#CL_PLATFORM_HOST_TIMER_RESOLUTION PLATFORM_HOST_TIMER_RESOLUTION}</td></tr></table>
     * @param param_value          the memory location where appropriate values for a given {@code param_name} will be returned
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PLATFORM INVALID_PLATFORM} if {@code platform} is not a valid platform.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetPlatformInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetPlatformInfo(@NativeType("cl_platform_id") long platform, @NativeType("cl_platform_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetPlatformInfo(platform, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about the specified OpenCL platform.
     *
     * @param platform             the platform to query
     * @param param_name           the parameter to query. One of:<br><table><tr><td>{@link #CL_PLATFORM_PROFILE PLATFORM_PROFILE}</td><td>{@link #CL_PLATFORM_VERSION PLATFORM_VERSION}</td><td>{@link #CL_PLATFORM_NAME PLATFORM_NAME}</td><td>{@link #CL_PLATFORM_VENDOR PLATFORM_VENDOR}</td></tr><tr><td>{@link #CL_PLATFORM_EXTENSIONS PLATFORM_EXTENSIONS}</td><td>{@link CL21#CL_PLATFORM_HOST_TIMER_RESOLUTION PLATFORM_HOST_TIMER_RESOLUTION}</td></tr></table>
     * @param param_value          the memory location where appropriate values for a given {@code param_name} will be returned
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PLATFORM INVALID_PLATFORM} if {@code platform} is not a valid platform.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetPlatformInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetPlatformInfo(@NativeType("cl_platform_id") long platform, @NativeType("cl_platform_info") int param_name, @Nullable @NativeType("void *") LongBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetPlatformInfo(platform, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clGetDeviceIDs ] ---

    /**
     * Unsafe version of: {@link #clGetDeviceIDs GetDeviceIDs}
     *
     * @param num_entries the number of {@code cl_device_id} entries that can be added to devices. If {@code devices} is not {@code NULL}, the {@code num_entries} must be greater
     *                    than zero.
     */
    public static int nclGetDeviceIDs(long platform, long device_type, int num_entries, long devices, long num_devices) {
        long __functionAddress = CL.getICD().clGetDeviceIDs;
        return callPJPPI(platform, device_type, num_entries, devices, num_devices, __functionAddress);
    }

    /**
     * Obtains the list of devices available on a platform.
     *
     * @param platform    the platform to query
     * @param device_type a bitfield that identifies the type of OpenCL device. The {@code device_type} can be used to query specific OpenCL devices or all OpenCL devices
     *                    available. One or more of:<br><table><tr><td>{@link #CL_DEVICE_TYPE_DEFAULT DEVICE_TYPE_DEFAULT}</td><td>{@link #CL_DEVICE_TYPE_CPU DEVICE_TYPE_CPU}</td><td>{@link #CL_DEVICE_TYPE_GPU DEVICE_TYPE_GPU}</td><td>{@link #CL_DEVICE_TYPE_ACCELERATOR DEVICE_TYPE_ACCELERATOR}</td></tr><tr><td>{@link #CL_DEVICE_TYPE_ALL DEVICE_TYPE_ALL}</td><td>{@link CL12#CL_DEVICE_TYPE_CUSTOM DEVICE_TYPE_CUSTOM}</td></tr></table>
     * @param devices     returns a list of OpenCL devices found. The {@code cl_device_id} values returned in {@code devices} can be used to identify a specific OpenCL
     *                    device. If {@code devices} argument is {@code NULL}, this argument is ignored. The number of OpenCL devices returned is the minimum of the value specified
     *                    by {@code num_entries} or the number of OpenCL devices whose type matches {@code device_type}.
     * @param num_devices returns the number of OpenCL devices available that match {@code device_type}. If {@code num_devices} is {@code NULL}, this argument is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PLATFORM INVALID_PLATFORM} if {@code platform} is not a valid platform.</li>
     *         <li>{@link #CL_INVALID_DEVICE_TYPE INVALID_DEVICE_TYPE} if {@code device_type} is not a valid value.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_entries} is equal to zero and {@code devices} is not {@code NULL} or if both {@code num_devices} and {@code devices} are {@code NULL}.</li>
     *         <li>{@link #CL_DEVICE_NOT_FOUND DEVICE_NOT_FOUND} if no OpenCL devices that matched {@code device_type} were found.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetDeviceIDs.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetDeviceIDs(@NativeType("cl_platform_id") long platform, @NativeType("cl_device_type") long device_type, @Nullable @NativeType("cl_device_id *") PointerBuffer devices, @Nullable @NativeType("cl_uint *") IntBuffer num_devices) {
        if (CHECKS) {
            checkSafe(num_devices, 1);
        }
        return nclGetDeviceIDs(platform, device_type, remainingSafe(devices), memAddressSafe(devices), memAddressSafe(num_devices));
    }

    // --- [ clGetDeviceInfo ] ---

    /**
     * Unsafe version of: {@link #clGetDeviceInfo GetDeviceInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetDeviceInfo(long device, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetDeviceInfo;
        if (CHECKS) {
            check(device);
        }
        return callPPPPI(device, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns specific information about an OpenCL device. {@code device} may be a device returned by {@link #clGetDeviceIDs GetDeviceIDs} or a sub-device created by
     * {@link CL12#clCreateSubDevices CreateSubDevices}. If {@code device} is a sub-device, the specific information for the sub-device will be returned.
     *
     * @param device               the device to query
     * @param param_name           an enumeration constant tha identifies the device information being queried. One of:<br><table><tr><td>{@link #CL_DEVICE_TYPE DEVICE_TYPE}</td><td>{@link #CL_DEVICE_VENDOR_ID DEVICE_VENDOR_ID}</td></tr><tr><td>{@link #CL_DEVICE_MAX_COMPUTE_UNITS DEVICE_MAX_COMPUTE_UNITS}</td><td>{@link #CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS DEVICE_MAX_WORK_ITEM_DIMENSIONS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_WORK_GROUP_SIZE DEVICE_MAX_WORK_GROUP_SIZE}</td><td>{@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_CHAR DEVICE_PREFERRED_VECTOR_WIDTH_CHAR}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_SHORT DEVICE_PREFERRED_VECTOR_WIDTH_SHORT}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_INT DEVICE_PREFERRED_VECTOR_WIDTH_INT}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_LONG DEVICE_PREFERRED_VECTOR_WIDTH_LONG}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_CLOCK_FREQUENCY DEVICE_MAX_CLOCK_FREQUENCY}</td><td>{@link #CL_DEVICE_ADDRESS_BITS DEVICE_ADDRESS_BITS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_READ_IMAGE_ARGS DEVICE_MAX_READ_IMAGE_ARGS}</td><td>{@link #CL_DEVICE_MAX_WRITE_IMAGE_ARGS DEVICE_MAX_WRITE_IMAGE_ARGS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE}</td><td>{@link #CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT DEVICE_IMAGE2D_MAX_HEIGHT}</td><td>{@link #CL_DEVICE_IMAGE3D_MAX_WIDTH DEVICE_IMAGE3D_MAX_WIDTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT DEVICE_IMAGE3D_MAX_HEIGHT}</td><td>{@link #CL_DEVICE_IMAGE3D_MAX_DEPTH DEVICE_IMAGE3D_MAX_DEPTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT}</td><td>{@link #CL_DEVICE_MAX_PARAMETER_SIZE DEVICE_MAX_PARAMETER_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_SAMPLERS DEVICE_MAX_SAMPLERS}</td><td>{@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN}</td></tr><tr><td>{@link #CL_DEVICE_MIN_DATA_TYPE_ALIGN_SIZE DEVICE_MIN_DATA_TYPE_ALIGN_SIZE}</td><td>{@link #CL_DEVICE_SINGLE_FP_CONFIG DEVICE_SINGLE_FP_CONFIG}</td></tr><tr><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHE_TYPE DEVICE_GLOBAL_MEM_CACHE_TYPE}</td><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE DEVICE_GLOBAL_MEM_CACHELINE_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHE_SIZE DEVICE_GLOBAL_MEM_CACHE_SIZE}</td><td>{@link #CL_DEVICE_GLOBAL_MEM_SIZE DEVICE_GLOBAL_MEM_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE}</td><td>{@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}</td></tr><tr><td>{@link #CL_DEVICE_LOCAL_MEM_TYPE DEVICE_LOCAL_MEM_TYPE}</td><td>{@link #CL_DEVICE_LOCAL_MEM_SIZE DEVICE_LOCAL_MEM_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_ERROR_CORRECTION_SUPPORT DEVICE_ERROR_CORRECTION_SUPPORT}</td><td>{@link #CL_DEVICE_PROFILING_TIMER_RESOLUTION DEVICE_PROFILING_TIMER_RESOLUTION}</td></tr><tr><td>{@link #CL_DEVICE_ENDIAN_LITTLE DEVICE_ENDIAN_LITTLE}</td><td>{@link #CL_DEVICE_AVAILABLE DEVICE_AVAILABLE}</td></tr><tr><td>{@link #CL_DEVICE_COMPILER_AVAILABLE DEVICE_COMPILER_AVAILABLE}</td><td>{@link #CL_DEVICE_EXECUTION_CAPABILITIES DEVICE_EXECUTION_CAPABILITIES}</td></tr><tr><td>{@link #CL_DEVICE_QUEUE_PROPERTIES DEVICE_QUEUE_PROPERTIES}</td><td>{@link #CL_DEVICE_NAME DEVICE_NAME}</td></tr><tr><td>{@link #CL_DEVICE_VENDOR DEVICE_VENDOR}</td><td>{@link #CL_DRIVER_VERSION DRIVER_VERSION}</td></tr><tr><td>{@link #CL_DEVICE_PROFILE DEVICE_PROFILE}</td><td>{@link #CL_DEVICE_VERSION DEVICE_VERSION}</td></tr><tr><td>{@link #CL_DEVICE_EXTENSIONS DEVICE_EXTENSIONS}</td><td>{@link #CL_DEVICE_PLATFORM DEVICE_PLATFORM}</td></tr><tr><td>{@link CL11#CL_DEVICE_PREFERRED_VECTOR_WIDTH_HALF DEVICE_PREFERRED_VECTOR_WIDTH_HALF}</td><td>{@link CL11#CL_DEVICE_HOST_UNIFIED_MEMORY DEVICE_HOST_UNIFIED_MEMORY}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_CHAR DEVICE_NATIVE_VECTOR_WIDTH_CHAR}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_SHORT DEVICE_NATIVE_VECTOR_WIDTH_SHORT}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_INT DEVICE_NATIVE_VECTOR_WIDTH_INT}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_LONG DEVICE_NATIVE_VECTOR_WIDTH_LONG}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_FLOAT DEVICE_NATIVE_VECTOR_WIDTH_FLOAT}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF DEVICE_NATIVE_VECTOR_WIDTH_HALF}</td><td>{@link CL11#CL_DEVICE_OPENCL_C_VERSION DEVICE_OPENCL_C_VERSION}</td></tr><tr><td>{@link CL12#CL_DEVICE_DOUBLE_FP_CONFIG DEVICE_DOUBLE_FP_CONFIG}</td><td>{@link CL12#CL_DEVICE_LINKER_AVAILABLE DEVICE_LINKER_AVAILABLE}</td></tr><tr><td>{@link CL12#CL_DEVICE_BUILT_IN_KERNELS DEVICE_BUILT_IN_KERNELS}</td><td>{@link CL12#CL_DEVICE_IMAGE_MAX_BUFFER_SIZE DEVICE_IMAGE_MAX_BUFFER_SIZE}</td></tr><tr><td>{@link CL12#CL_DEVICE_IMAGE_MAX_ARRAY_SIZE DEVICE_IMAGE_MAX_ARRAY_SIZE}</td><td>{@link CL12#CL_DEVICE_PARENT_DEVICE DEVICE_PARENT_DEVICE}</td></tr><tr><td>{@link CL12#CL_DEVICE_PARTITION_MAX_SUB_DEVICES DEVICE_PARTITION_MAX_SUB_DEVICES}</td><td>{@link CL12#CL_DEVICE_PARTITION_PROPERTIES DEVICE_PARTITION_PROPERTIES}</td></tr><tr><td>{@link CL12#CL_DEVICE_PARTITION_AFFINITY_DOMAIN DEVICE_PARTITION_AFFINITY_DOMAIN}</td><td>{@link CL12#CL_DEVICE_PARTITION_TYPE DEVICE_PARTITION_TYPE}</td></tr><tr><td>{@link CL12#CL_DEVICE_REFERENCE_COUNT DEVICE_REFERENCE_COUNT}</td><td>{@link CL12#CL_DEVICE_PREFERRED_INTEROP_USER_SYNC DEVICE_PREFERRED_INTEROP_USER_SYNC}</td></tr><tr><td>{@link CL12#CL_DEVICE_PRINTF_BUFFER_SIZE DEVICE_PRINTF_BUFFER_SIZE}</td><td>{@link CL20#CL_DEVICE_QUEUE_ON_HOST_PROPERTIES DEVICE_QUEUE_ON_HOST_PROPERTIES}</td></tr><tr><td>{@link CL20#CL_DEVICE_MAX_READ_WRITE_IMAGE_ARGS DEVICE_MAX_READ_WRITE_IMAGE_ARGS}</td><td>{@link CL20#CL_DEVICE_MAX_GLOBAL_VARIABLE_SIZE DEVICE_MAX_GLOBAL_VARIABLE_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_PROPERTIES DEVICE_QUEUE_ON_DEVICE_PROPERTIES}</td><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_MAX_SIZE DEVICE_QUEUE_ON_DEVICE_MAX_SIZE}</td><td>{@link CL20#CL_DEVICE_MAX_ON_DEVICE_QUEUES DEVICE_MAX_ON_DEVICE_QUEUES}</td></tr><tr><td>{@link CL20#CL_DEVICE_MAX_ON_DEVICE_EVENTS DEVICE_MAX_ON_DEVICE_EVENTS}</td><td>{@link CL20#CL_DEVICE_SVM_CAPABILITIES DEVICE_SVM_CAPABILITIES}</td></tr><tr><td>{@link CL20#CL_DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE}</td><td>{@link CL20#CL_DEVICE_MAX_PIPE_ARGS DEVICE_MAX_PIPE_ARGS}</td></tr><tr><td>{@link CL20#CL_DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS}</td><td>{@link CL20#CL_DEVICE_PIPE_MAX_PACKET_SIZE DEVICE_PIPE_MAX_PACKET_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT}</td><td>{@link CL20#CL_DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT}</td></tr><tr><td>{@link CL20#CL_DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT}</td><td>{@link CL21#CL_DEVICE_IL_VERSION DEVICE_IL_VERSION}</td></tr><tr><td>{@link CL21#CL_DEVICE_MAX_NUM_SUB_GROUPS DEVICE_MAX_NUM_SUB_GROUPS}</td><td>{@link CL21#CL_DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not valid.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value or if {@code param_name} is a value that is available as an extension and the
     *         corresponding extension is not supported by the device.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetDeviceInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceInfo(device, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns specific information about an OpenCL device. {@code device} may be a device returned by {@link #clGetDeviceIDs GetDeviceIDs} or a sub-device created by
     * {@link CL12#clCreateSubDevices CreateSubDevices}. If {@code device} is a sub-device, the specific information for the sub-device will be returned.
     *
     * @param device               the device to query
     * @param param_name           an enumeration constant tha identifies the device information being queried. One of:<br><table><tr><td>{@link #CL_DEVICE_TYPE DEVICE_TYPE}</td><td>{@link #CL_DEVICE_VENDOR_ID DEVICE_VENDOR_ID}</td></tr><tr><td>{@link #CL_DEVICE_MAX_COMPUTE_UNITS DEVICE_MAX_COMPUTE_UNITS}</td><td>{@link #CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS DEVICE_MAX_WORK_ITEM_DIMENSIONS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_WORK_GROUP_SIZE DEVICE_MAX_WORK_GROUP_SIZE}</td><td>{@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_CHAR DEVICE_PREFERRED_VECTOR_WIDTH_CHAR}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_SHORT DEVICE_PREFERRED_VECTOR_WIDTH_SHORT}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_INT DEVICE_PREFERRED_VECTOR_WIDTH_INT}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_LONG DEVICE_PREFERRED_VECTOR_WIDTH_LONG}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_CLOCK_FREQUENCY DEVICE_MAX_CLOCK_FREQUENCY}</td><td>{@link #CL_DEVICE_ADDRESS_BITS DEVICE_ADDRESS_BITS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_READ_IMAGE_ARGS DEVICE_MAX_READ_IMAGE_ARGS}</td><td>{@link #CL_DEVICE_MAX_WRITE_IMAGE_ARGS DEVICE_MAX_WRITE_IMAGE_ARGS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE}</td><td>{@link #CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT DEVICE_IMAGE2D_MAX_HEIGHT}</td><td>{@link #CL_DEVICE_IMAGE3D_MAX_WIDTH DEVICE_IMAGE3D_MAX_WIDTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT DEVICE_IMAGE3D_MAX_HEIGHT}</td><td>{@link #CL_DEVICE_IMAGE3D_MAX_DEPTH DEVICE_IMAGE3D_MAX_DEPTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT}</td><td>{@link #CL_DEVICE_MAX_PARAMETER_SIZE DEVICE_MAX_PARAMETER_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_SAMPLERS DEVICE_MAX_SAMPLERS}</td><td>{@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN}</td></tr><tr><td>{@link #CL_DEVICE_MIN_DATA_TYPE_ALIGN_SIZE DEVICE_MIN_DATA_TYPE_ALIGN_SIZE}</td><td>{@link #CL_DEVICE_SINGLE_FP_CONFIG DEVICE_SINGLE_FP_CONFIG}</td></tr><tr><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHE_TYPE DEVICE_GLOBAL_MEM_CACHE_TYPE}</td><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE DEVICE_GLOBAL_MEM_CACHELINE_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHE_SIZE DEVICE_GLOBAL_MEM_CACHE_SIZE}</td><td>{@link #CL_DEVICE_GLOBAL_MEM_SIZE DEVICE_GLOBAL_MEM_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE}</td><td>{@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}</td></tr><tr><td>{@link #CL_DEVICE_LOCAL_MEM_TYPE DEVICE_LOCAL_MEM_TYPE}</td><td>{@link #CL_DEVICE_LOCAL_MEM_SIZE DEVICE_LOCAL_MEM_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_ERROR_CORRECTION_SUPPORT DEVICE_ERROR_CORRECTION_SUPPORT}</td><td>{@link #CL_DEVICE_PROFILING_TIMER_RESOLUTION DEVICE_PROFILING_TIMER_RESOLUTION}</td></tr><tr><td>{@link #CL_DEVICE_ENDIAN_LITTLE DEVICE_ENDIAN_LITTLE}</td><td>{@link #CL_DEVICE_AVAILABLE DEVICE_AVAILABLE}</td></tr><tr><td>{@link #CL_DEVICE_COMPILER_AVAILABLE DEVICE_COMPILER_AVAILABLE}</td><td>{@link #CL_DEVICE_EXECUTION_CAPABILITIES DEVICE_EXECUTION_CAPABILITIES}</td></tr><tr><td>{@link #CL_DEVICE_QUEUE_PROPERTIES DEVICE_QUEUE_PROPERTIES}</td><td>{@link #CL_DEVICE_NAME DEVICE_NAME}</td></tr><tr><td>{@link #CL_DEVICE_VENDOR DEVICE_VENDOR}</td><td>{@link #CL_DRIVER_VERSION DRIVER_VERSION}</td></tr><tr><td>{@link #CL_DEVICE_PROFILE DEVICE_PROFILE}</td><td>{@link #CL_DEVICE_VERSION DEVICE_VERSION}</td></tr><tr><td>{@link #CL_DEVICE_EXTENSIONS DEVICE_EXTENSIONS}</td><td>{@link #CL_DEVICE_PLATFORM DEVICE_PLATFORM}</td></tr><tr><td>{@link CL11#CL_DEVICE_PREFERRED_VECTOR_WIDTH_HALF DEVICE_PREFERRED_VECTOR_WIDTH_HALF}</td><td>{@link CL11#CL_DEVICE_HOST_UNIFIED_MEMORY DEVICE_HOST_UNIFIED_MEMORY}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_CHAR DEVICE_NATIVE_VECTOR_WIDTH_CHAR}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_SHORT DEVICE_NATIVE_VECTOR_WIDTH_SHORT}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_INT DEVICE_NATIVE_VECTOR_WIDTH_INT}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_LONG DEVICE_NATIVE_VECTOR_WIDTH_LONG}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_FLOAT DEVICE_NATIVE_VECTOR_WIDTH_FLOAT}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF DEVICE_NATIVE_VECTOR_WIDTH_HALF}</td><td>{@link CL11#CL_DEVICE_OPENCL_C_VERSION DEVICE_OPENCL_C_VERSION}</td></tr><tr><td>{@link CL12#CL_DEVICE_DOUBLE_FP_CONFIG DEVICE_DOUBLE_FP_CONFIG}</td><td>{@link CL12#CL_DEVICE_LINKER_AVAILABLE DEVICE_LINKER_AVAILABLE}</td></tr><tr><td>{@link CL12#CL_DEVICE_BUILT_IN_KERNELS DEVICE_BUILT_IN_KERNELS}</td><td>{@link CL12#CL_DEVICE_IMAGE_MAX_BUFFER_SIZE DEVICE_IMAGE_MAX_BUFFER_SIZE}</td></tr><tr><td>{@link CL12#CL_DEVICE_IMAGE_MAX_ARRAY_SIZE DEVICE_IMAGE_MAX_ARRAY_SIZE}</td><td>{@link CL12#CL_DEVICE_PARENT_DEVICE DEVICE_PARENT_DEVICE}</td></tr><tr><td>{@link CL12#CL_DEVICE_PARTITION_MAX_SUB_DEVICES DEVICE_PARTITION_MAX_SUB_DEVICES}</td><td>{@link CL12#CL_DEVICE_PARTITION_PROPERTIES DEVICE_PARTITION_PROPERTIES}</td></tr><tr><td>{@link CL12#CL_DEVICE_PARTITION_AFFINITY_DOMAIN DEVICE_PARTITION_AFFINITY_DOMAIN}</td><td>{@link CL12#CL_DEVICE_PARTITION_TYPE DEVICE_PARTITION_TYPE}</td></tr><tr><td>{@link CL12#CL_DEVICE_REFERENCE_COUNT DEVICE_REFERENCE_COUNT}</td><td>{@link CL12#CL_DEVICE_PREFERRED_INTEROP_USER_SYNC DEVICE_PREFERRED_INTEROP_USER_SYNC}</td></tr><tr><td>{@link CL12#CL_DEVICE_PRINTF_BUFFER_SIZE DEVICE_PRINTF_BUFFER_SIZE}</td><td>{@link CL20#CL_DEVICE_QUEUE_ON_HOST_PROPERTIES DEVICE_QUEUE_ON_HOST_PROPERTIES}</td></tr><tr><td>{@link CL20#CL_DEVICE_MAX_READ_WRITE_IMAGE_ARGS DEVICE_MAX_READ_WRITE_IMAGE_ARGS}</td><td>{@link CL20#CL_DEVICE_MAX_GLOBAL_VARIABLE_SIZE DEVICE_MAX_GLOBAL_VARIABLE_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_PROPERTIES DEVICE_QUEUE_ON_DEVICE_PROPERTIES}</td><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_MAX_SIZE DEVICE_QUEUE_ON_DEVICE_MAX_SIZE}</td><td>{@link CL20#CL_DEVICE_MAX_ON_DEVICE_QUEUES DEVICE_MAX_ON_DEVICE_QUEUES}</td></tr><tr><td>{@link CL20#CL_DEVICE_MAX_ON_DEVICE_EVENTS DEVICE_MAX_ON_DEVICE_EVENTS}</td><td>{@link CL20#CL_DEVICE_SVM_CAPABILITIES DEVICE_SVM_CAPABILITIES}</td></tr><tr><td>{@link CL20#CL_DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE}</td><td>{@link CL20#CL_DEVICE_MAX_PIPE_ARGS DEVICE_MAX_PIPE_ARGS}</td></tr><tr><td>{@link CL20#CL_DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS}</td><td>{@link CL20#CL_DEVICE_PIPE_MAX_PACKET_SIZE DEVICE_PIPE_MAX_PACKET_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT}</td><td>{@link CL20#CL_DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT}</td></tr><tr><td>{@link CL20#CL_DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT}</td><td>{@link CL21#CL_DEVICE_IL_VERSION DEVICE_IL_VERSION}</td></tr><tr><td>{@link CL21#CL_DEVICE_MAX_NUM_SUB_GROUPS DEVICE_MAX_NUM_SUB_GROUPS}</td><td>{@link CL21#CL_DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not valid.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value or if {@code param_name} is a value that is available as an extension and the
     *         corresponding extension is not supported by the device.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetDeviceInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceInfo(device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns specific information about an OpenCL device. {@code device} may be a device returned by {@link #clGetDeviceIDs GetDeviceIDs} or a sub-device created by
     * {@link CL12#clCreateSubDevices CreateSubDevices}. If {@code device} is a sub-device, the specific information for the sub-device will be returned.
     *
     * @param device               the device to query
     * @param param_name           an enumeration constant tha identifies the device information being queried. One of:<br><table><tr><td>{@link #CL_DEVICE_TYPE DEVICE_TYPE}</td><td>{@link #CL_DEVICE_VENDOR_ID DEVICE_VENDOR_ID}</td></tr><tr><td>{@link #CL_DEVICE_MAX_COMPUTE_UNITS DEVICE_MAX_COMPUTE_UNITS}</td><td>{@link #CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS DEVICE_MAX_WORK_ITEM_DIMENSIONS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_WORK_GROUP_SIZE DEVICE_MAX_WORK_GROUP_SIZE}</td><td>{@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_CHAR DEVICE_PREFERRED_VECTOR_WIDTH_CHAR}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_SHORT DEVICE_PREFERRED_VECTOR_WIDTH_SHORT}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_INT DEVICE_PREFERRED_VECTOR_WIDTH_INT}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_LONG DEVICE_PREFERRED_VECTOR_WIDTH_LONG}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_CLOCK_FREQUENCY DEVICE_MAX_CLOCK_FREQUENCY}</td><td>{@link #CL_DEVICE_ADDRESS_BITS DEVICE_ADDRESS_BITS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_READ_IMAGE_ARGS DEVICE_MAX_READ_IMAGE_ARGS}</td><td>{@link #CL_DEVICE_MAX_WRITE_IMAGE_ARGS DEVICE_MAX_WRITE_IMAGE_ARGS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE}</td><td>{@link #CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT DEVICE_IMAGE2D_MAX_HEIGHT}</td><td>{@link #CL_DEVICE_IMAGE3D_MAX_WIDTH DEVICE_IMAGE3D_MAX_WIDTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT DEVICE_IMAGE3D_MAX_HEIGHT}</td><td>{@link #CL_DEVICE_IMAGE3D_MAX_DEPTH DEVICE_IMAGE3D_MAX_DEPTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT}</td><td>{@link #CL_DEVICE_MAX_PARAMETER_SIZE DEVICE_MAX_PARAMETER_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_SAMPLERS DEVICE_MAX_SAMPLERS}</td><td>{@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN}</td></tr><tr><td>{@link #CL_DEVICE_MIN_DATA_TYPE_ALIGN_SIZE DEVICE_MIN_DATA_TYPE_ALIGN_SIZE}</td><td>{@link #CL_DEVICE_SINGLE_FP_CONFIG DEVICE_SINGLE_FP_CONFIG}</td></tr><tr><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHE_TYPE DEVICE_GLOBAL_MEM_CACHE_TYPE}</td><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE DEVICE_GLOBAL_MEM_CACHELINE_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHE_SIZE DEVICE_GLOBAL_MEM_CACHE_SIZE}</td><td>{@link #CL_DEVICE_GLOBAL_MEM_SIZE DEVICE_GLOBAL_MEM_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE}</td><td>{@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}</td></tr><tr><td>{@link #CL_DEVICE_LOCAL_MEM_TYPE DEVICE_LOCAL_MEM_TYPE}</td><td>{@link #CL_DEVICE_LOCAL_MEM_SIZE DEVICE_LOCAL_MEM_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_ERROR_CORRECTION_SUPPORT DEVICE_ERROR_CORRECTION_SUPPORT}</td><td>{@link #CL_DEVICE_PROFILING_TIMER_RESOLUTION DEVICE_PROFILING_TIMER_RESOLUTION}</td></tr><tr><td>{@link #CL_DEVICE_ENDIAN_LITTLE DEVICE_ENDIAN_LITTLE}</td><td>{@link #CL_DEVICE_AVAILABLE DEVICE_AVAILABLE}</td></tr><tr><td>{@link #CL_DEVICE_COMPILER_AVAILABLE DEVICE_COMPILER_AVAILABLE}</td><td>{@link #CL_DEVICE_EXECUTION_CAPABILITIES DEVICE_EXECUTION_CAPABILITIES}</td></tr><tr><td>{@link #CL_DEVICE_QUEUE_PROPERTIES DEVICE_QUEUE_PROPERTIES}</td><td>{@link #CL_DEVICE_NAME DEVICE_NAME}</td></tr><tr><td>{@link #CL_DEVICE_VENDOR DEVICE_VENDOR}</td><td>{@link #CL_DRIVER_VERSION DRIVER_VERSION}</td></tr><tr><td>{@link #CL_DEVICE_PROFILE DEVICE_PROFILE}</td><td>{@link #CL_DEVICE_VERSION DEVICE_VERSION}</td></tr><tr><td>{@link #CL_DEVICE_EXTENSIONS DEVICE_EXTENSIONS}</td><td>{@link #CL_DEVICE_PLATFORM DEVICE_PLATFORM}</td></tr><tr><td>{@link CL11#CL_DEVICE_PREFERRED_VECTOR_WIDTH_HALF DEVICE_PREFERRED_VECTOR_WIDTH_HALF}</td><td>{@link CL11#CL_DEVICE_HOST_UNIFIED_MEMORY DEVICE_HOST_UNIFIED_MEMORY}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_CHAR DEVICE_NATIVE_VECTOR_WIDTH_CHAR}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_SHORT DEVICE_NATIVE_VECTOR_WIDTH_SHORT}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_INT DEVICE_NATIVE_VECTOR_WIDTH_INT}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_LONG DEVICE_NATIVE_VECTOR_WIDTH_LONG}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_FLOAT DEVICE_NATIVE_VECTOR_WIDTH_FLOAT}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF DEVICE_NATIVE_VECTOR_WIDTH_HALF}</td><td>{@link CL11#CL_DEVICE_OPENCL_C_VERSION DEVICE_OPENCL_C_VERSION}</td></tr><tr><td>{@link CL12#CL_DEVICE_DOUBLE_FP_CONFIG DEVICE_DOUBLE_FP_CONFIG}</td><td>{@link CL12#CL_DEVICE_LINKER_AVAILABLE DEVICE_LINKER_AVAILABLE}</td></tr><tr><td>{@link CL12#CL_DEVICE_BUILT_IN_KERNELS DEVICE_BUILT_IN_KERNELS}</td><td>{@link CL12#CL_DEVICE_IMAGE_MAX_BUFFER_SIZE DEVICE_IMAGE_MAX_BUFFER_SIZE}</td></tr><tr><td>{@link CL12#CL_DEVICE_IMAGE_MAX_ARRAY_SIZE DEVICE_IMAGE_MAX_ARRAY_SIZE}</td><td>{@link CL12#CL_DEVICE_PARENT_DEVICE DEVICE_PARENT_DEVICE}</td></tr><tr><td>{@link CL12#CL_DEVICE_PARTITION_MAX_SUB_DEVICES DEVICE_PARTITION_MAX_SUB_DEVICES}</td><td>{@link CL12#CL_DEVICE_PARTITION_PROPERTIES DEVICE_PARTITION_PROPERTIES}</td></tr><tr><td>{@link CL12#CL_DEVICE_PARTITION_AFFINITY_DOMAIN DEVICE_PARTITION_AFFINITY_DOMAIN}</td><td>{@link CL12#CL_DEVICE_PARTITION_TYPE DEVICE_PARTITION_TYPE}</td></tr><tr><td>{@link CL12#CL_DEVICE_REFERENCE_COUNT DEVICE_REFERENCE_COUNT}</td><td>{@link CL12#CL_DEVICE_PREFERRED_INTEROP_USER_SYNC DEVICE_PREFERRED_INTEROP_USER_SYNC}</td></tr><tr><td>{@link CL12#CL_DEVICE_PRINTF_BUFFER_SIZE DEVICE_PRINTF_BUFFER_SIZE}</td><td>{@link CL20#CL_DEVICE_QUEUE_ON_HOST_PROPERTIES DEVICE_QUEUE_ON_HOST_PROPERTIES}</td></tr><tr><td>{@link CL20#CL_DEVICE_MAX_READ_WRITE_IMAGE_ARGS DEVICE_MAX_READ_WRITE_IMAGE_ARGS}</td><td>{@link CL20#CL_DEVICE_MAX_GLOBAL_VARIABLE_SIZE DEVICE_MAX_GLOBAL_VARIABLE_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_PROPERTIES DEVICE_QUEUE_ON_DEVICE_PROPERTIES}</td><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_MAX_SIZE DEVICE_QUEUE_ON_DEVICE_MAX_SIZE}</td><td>{@link CL20#CL_DEVICE_MAX_ON_DEVICE_QUEUES DEVICE_MAX_ON_DEVICE_QUEUES}</td></tr><tr><td>{@link CL20#CL_DEVICE_MAX_ON_DEVICE_EVENTS DEVICE_MAX_ON_DEVICE_EVENTS}</td><td>{@link CL20#CL_DEVICE_SVM_CAPABILITIES DEVICE_SVM_CAPABILITIES}</td></tr><tr><td>{@link CL20#CL_DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE}</td><td>{@link CL20#CL_DEVICE_MAX_PIPE_ARGS DEVICE_MAX_PIPE_ARGS}</td></tr><tr><td>{@link CL20#CL_DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS}</td><td>{@link CL20#CL_DEVICE_PIPE_MAX_PACKET_SIZE DEVICE_PIPE_MAX_PACKET_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT}</td><td>{@link CL20#CL_DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT}</td></tr><tr><td>{@link CL20#CL_DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT}</td><td>{@link CL21#CL_DEVICE_IL_VERSION DEVICE_IL_VERSION}</td></tr><tr><td>{@link CL21#CL_DEVICE_MAX_NUM_SUB_GROUPS DEVICE_MAX_NUM_SUB_GROUPS}</td><td>{@link CL21#CL_DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not valid.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value or if {@code param_name} is a value that is available as an extension and the
     *         corresponding extension is not supported by the device.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetDeviceInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @Nullable @NativeType("void *") LongBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceInfo(device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns specific information about an OpenCL device. {@code device} may be a device returned by {@link #clGetDeviceIDs GetDeviceIDs} or a sub-device created by
     * {@link CL12#clCreateSubDevices CreateSubDevices}. If {@code device} is a sub-device, the specific information for the sub-device will be returned.
     *
     * @param device               the device to query
     * @param param_name           an enumeration constant tha identifies the device information being queried. One of:<br><table><tr><td>{@link #CL_DEVICE_TYPE DEVICE_TYPE}</td><td>{@link #CL_DEVICE_VENDOR_ID DEVICE_VENDOR_ID}</td></tr><tr><td>{@link #CL_DEVICE_MAX_COMPUTE_UNITS DEVICE_MAX_COMPUTE_UNITS}</td><td>{@link #CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS DEVICE_MAX_WORK_ITEM_DIMENSIONS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_WORK_GROUP_SIZE DEVICE_MAX_WORK_GROUP_SIZE}</td><td>{@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_CHAR DEVICE_PREFERRED_VECTOR_WIDTH_CHAR}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_SHORT DEVICE_PREFERRED_VECTOR_WIDTH_SHORT}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_INT DEVICE_PREFERRED_VECTOR_WIDTH_INT}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_LONG DEVICE_PREFERRED_VECTOR_WIDTH_LONG}</td></tr><tr><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT DEVICE_PREFERRED_VECTOR_WIDTH_FLOAT}</td><td>{@link #CL_DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE DEVICE_PREFERRED_VECTOR_WIDTH_DOUBLE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_CLOCK_FREQUENCY DEVICE_MAX_CLOCK_FREQUENCY}</td><td>{@link #CL_DEVICE_ADDRESS_BITS DEVICE_ADDRESS_BITS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_READ_IMAGE_ARGS DEVICE_MAX_READ_IMAGE_ARGS}</td><td>{@link #CL_DEVICE_MAX_WRITE_IMAGE_ARGS DEVICE_MAX_WRITE_IMAGE_ARGS}</td></tr><tr><td>{@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE}</td><td>{@link #CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT DEVICE_IMAGE2D_MAX_HEIGHT}</td><td>{@link #CL_DEVICE_IMAGE3D_MAX_WIDTH DEVICE_IMAGE3D_MAX_WIDTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT DEVICE_IMAGE3D_MAX_HEIGHT}</td><td>{@link #CL_DEVICE_IMAGE3D_MAX_DEPTH DEVICE_IMAGE3D_MAX_DEPTH}</td></tr><tr><td>{@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT}</td><td>{@link #CL_DEVICE_MAX_PARAMETER_SIZE DEVICE_MAX_PARAMETER_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_SAMPLERS DEVICE_MAX_SAMPLERS}</td><td>{@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN}</td></tr><tr><td>{@link #CL_DEVICE_MIN_DATA_TYPE_ALIGN_SIZE DEVICE_MIN_DATA_TYPE_ALIGN_SIZE}</td><td>{@link #CL_DEVICE_SINGLE_FP_CONFIG DEVICE_SINGLE_FP_CONFIG}</td></tr><tr><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHE_TYPE DEVICE_GLOBAL_MEM_CACHE_TYPE}</td><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHELINE_SIZE DEVICE_GLOBAL_MEM_CACHELINE_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_GLOBAL_MEM_CACHE_SIZE DEVICE_GLOBAL_MEM_CACHE_SIZE}</td><td>{@link #CL_DEVICE_GLOBAL_MEM_SIZE DEVICE_GLOBAL_MEM_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE}</td><td>{@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}</td></tr><tr><td>{@link #CL_DEVICE_LOCAL_MEM_TYPE DEVICE_LOCAL_MEM_TYPE}</td><td>{@link #CL_DEVICE_LOCAL_MEM_SIZE DEVICE_LOCAL_MEM_SIZE}</td></tr><tr><td>{@link #CL_DEVICE_ERROR_CORRECTION_SUPPORT DEVICE_ERROR_CORRECTION_SUPPORT}</td><td>{@link #CL_DEVICE_PROFILING_TIMER_RESOLUTION DEVICE_PROFILING_TIMER_RESOLUTION}</td></tr><tr><td>{@link #CL_DEVICE_ENDIAN_LITTLE DEVICE_ENDIAN_LITTLE}</td><td>{@link #CL_DEVICE_AVAILABLE DEVICE_AVAILABLE}</td></tr><tr><td>{@link #CL_DEVICE_COMPILER_AVAILABLE DEVICE_COMPILER_AVAILABLE}</td><td>{@link #CL_DEVICE_EXECUTION_CAPABILITIES DEVICE_EXECUTION_CAPABILITIES}</td></tr><tr><td>{@link #CL_DEVICE_QUEUE_PROPERTIES DEVICE_QUEUE_PROPERTIES}</td><td>{@link #CL_DEVICE_NAME DEVICE_NAME}</td></tr><tr><td>{@link #CL_DEVICE_VENDOR DEVICE_VENDOR}</td><td>{@link #CL_DRIVER_VERSION DRIVER_VERSION}</td></tr><tr><td>{@link #CL_DEVICE_PROFILE DEVICE_PROFILE}</td><td>{@link #CL_DEVICE_VERSION DEVICE_VERSION}</td></tr><tr><td>{@link #CL_DEVICE_EXTENSIONS DEVICE_EXTENSIONS}</td><td>{@link #CL_DEVICE_PLATFORM DEVICE_PLATFORM}</td></tr><tr><td>{@link CL11#CL_DEVICE_PREFERRED_VECTOR_WIDTH_HALF DEVICE_PREFERRED_VECTOR_WIDTH_HALF}</td><td>{@link CL11#CL_DEVICE_HOST_UNIFIED_MEMORY DEVICE_HOST_UNIFIED_MEMORY}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_CHAR DEVICE_NATIVE_VECTOR_WIDTH_CHAR}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_SHORT DEVICE_NATIVE_VECTOR_WIDTH_SHORT}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_INT DEVICE_NATIVE_VECTOR_WIDTH_INT}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_LONG DEVICE_NATIVE_VECTOR_WIDTH_LONG}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_FLOAT DEVICE_NATIVE_VECTOR_WIDTH_FLOAT}</td><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE DEVICE_NATIVE_VECTOR_WIDTH_DOUBLE}</td></tr><tr><td>{@link CL11#CL_DEVICE_NATIVE_VECTOR_WIDTH_HALF DEVICE_NATIVE_VECTOR_WIDTH_HALF}</td><td>{@link CL11#CL_DEVICE_OPENCL_C_VERSION DEVICE_OPENCL_C_VERSION}</td></tr><tr><td>{@link CL12#CL_DEVICE_DOUBLE_FP_CONFIG DEVICE_DOUBLE_FP_CONFIG}</td><td>{@link CL12#CL_DEVICE_LINKER_AVAILABLE DEVICE_LINKER_AVAILABLE}</td></tr><tr><td>{@link CL12#CL_DEVICE_BUILT_IN_KERNELS DEVICE_BUILT_IN_KERNELS}</td><td>{@link CL12#CL_DEVICE_IMAGE_MAX_BUFFER_SIZE DEVICE_IMAGE_MAX_BUFFER_SIZE}</td></tr><tr><td>{@link CL12#CL_DEVICE_IMAGE_MAX_ARRAY_SIZE DEVICE_IMAGE_MAX_ARRAY_SIZE}</td><td>{@link CL12#CL_DEVICE_PARENT_DEVICE DEVICE_PARENT_DEVICE}</td></tr><tr><td>{@link CL12#CL_DEVICE_PARTITION_MAX_SUB_DEVICES DEVICE_PARTITION_MAX_SUB_DEVICES}</td><td>{@link CL12#CL_DEVICE_PARTITION_PROPERTIES DEVICE_PARTITION_PROPERTIES}</td></tr><tr><td>{@link CL12#CL_DEVICE_PARTITION_AFFINITY_DOMAIN DEVICE_PARTITION_AFFINITY_DOMAIN}</td><td>{@link CL12#CL_DEVICE_PARTITION_TYPE DEVICE_PARTITION_TYPE}</td></tr><tr><td>{@link CL12#CL_DEVICE_REFERENCE_COUNT DEVICE_REFERENCE_COUNT}</td><td>{@link CL12#CL_DEVICE_PREFERRED_INTEROP_USER_SYNC DEVICE_PREFERRED_INTEROP_USER_SYNC}</td></tr><tr><td>{@link CL12#CL_DEVICE_PRINTF_BUFFER_SIZE DEVICE_PRINTF_BUFFER_SIZE}</td><td>{@link CL20#CL_DEVICE_QUEUE_ON_HOST_PROPERTIES DEVICE_QUEUE_ON_HOST_PROPERTIES}</td></tr><tr><td>{@link CL20#CL_DEVICE_MAX_READ_WRITE_IMAGE_ARGS DEVICE_MAX_READ_WRITE_IMAGE_ARGS}</td><td>{@link CL20#CL_DEVICE_MAX_GLOBAL_VARIABLE_SIZE DEVICE_MAX_GLOBAL_VARIABLE_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_PROPERTIES DEVICE_QUEUE_ON_DEVICE_PROPERTIES}</td><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE DEVICE_QUEUE_ON_DEVICE_PREFERRED_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_QUEUE_ON_DEVICE_MAX_SIZE DEVICE_QUEUE_ON_DEVICE_MAX_SIZE}</td><td>{@link CL20#CL_DEVICE_MAX_ON_DEVICE_QUEUES DEVICE_MAX_ON_DEVICE_QUEUES}</td></tr><tr><td>{@link CL20#CL_DEVICE_MAX_ON_DEVICE_EVENTS DEVICE_MAX_ON_DEVICE_EVENTS}</td><td>{@link CL20#CL_DEVICE_SVM_CAPABILITIES DEVICE_SVM_CAPABILITIES}</td></tr><tr><td>{@link CL20#CL_DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE DEVICE_GLOBAL_VARIABLE_PREFERRED_TOTAL_SIZE}</td><td>{@link CL20#CL_DEVICE_MAX_PIPE_ARGS DEVICE_MAX_PIPE_ARGS}</td></tr><tr><td>{@link CL20#CL_DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS DEVICE_PIPE_MAX_ACTIVE_RESERVATIONS}</td><td>{@link CL20#CL_DEVICE_PIPE_MAX_PACKET_SIZE DEVICE_PIPE_MAX_PACKET_SIZE}</td></tr><tr><td>{@link CL20#CL_DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT DEVICE_PREFERRED_PLATFORM_ATOMIC_ALIGNMENT}</td><td>{@link CL20#CL_DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT DEVICE_PREFERRED_GLOBAL_ATOMIC_ALIGNMENT}</td></tr><tr><td>{@link CL20#CL_DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT DEVICE_PREFERRED_LOCAL_ATOMIC_ALIGNMENT}</td><td>{@link CL21#CL_DEVICE_IL_VERSION DEVICE_IL_VERSION}</td></tr><tr><td>{@link CL21#CL_DEVICE_MAX_NUM_SUB_GROUPS DEVICE_MAX_NUM_SUB_GROUPS}</td><td>{@link CL21#CL_DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS DEVICE_SUB_GROUP_INDEPENDENT_FORWARD_PROGRESS}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not valid.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value or if {@code param_name} is a value that is available as an extension and the
     *         corresponding extension is not supported by the device.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetDeviceInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceInfo(device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateContext ] ---

    /**
     * Unsafe version of: {@link #clCreateContext CreateContext}
     *
     * @param num_devices the number of devices specified in the {@code devices} argument
     */
    public static long nclCreateContext(long properties, int num_devices, long devices, long pfn_notify, long user_data, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateContext;
        return callPPPPPP(properties, num_devices, devices, pfn_notify, user_data, errcode_ret, __functionAddress);
    }

    /**
     * Creates an OpenCL context. An OpenCL context is created with one or more devices. Contexts are used by the OpenCL runtime for managing objects such as
     * command-queues, memory, program and kernel objects and for executing kernels on one or more devices specified in the context.
     *
     * @param properties  a list of context property names and their corresponding values. Each property name is immediately followed by the corresponding desired value. The
     *                    list is terminated with 0. One of:<br><table><tr><td>{@link #CL_CONTEXT_PLATFORM CONTEXT_PLATFORM}</td><td>{@link CL12#CL_CONTEXT_INTEROP_USER_SYNC CONTEXT_INTEROP_USER_SYNC}</td><td>{@link KHRGLSharing#CL_GL_CONTEXT_KHR GL_CONTEXT_KHR}</td><td>{@link KHRGLSharing#CL_EGL_DISPLAY_KHR EGL_DISPLAY_KHR}</td><td>{@link KHRGLSharing#CL_GLX_DISPLAY_KHR GLX_DISPLAY_KHR}</td></tr><tr><td>{@link KHRGLSharing#CL_WGL_HDC_KHR WGL_HDC_KHR}</td><td>{@link KHRGLSharing#CL_CGL_SHAREGROUP_KHR CGL_SHAREGROUP_KHR}</td></tr></table>
     * @param devices     a list of unique devices returned by {@link #clGetDeviceIDs GetDeviceIDs} or sub-devices created by {@link CL12#clCreateSubDevices CreateSubDevices} for a platform
     * @param pfn_notify  a callback function that can be registered by the application. This callback function will be used by the OpenCL implementation to report
     *                    information on errors during context creation as well as errors that occur at runtime in this context. This callback function may be called
     *                    asynchronously by the OpenCL implementation. It is the application's responsibility to ensure that the callback function is thread-safe.
     *                    
     *                    <p>If {@code pfn_notify} is {@code NULL}, no callback function is registered.</p>
     * @param user_data   will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero context and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the context is created successfully. Otherwise, it returns a {@code NULL} value with the
     *         following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PLATFORM INVALID_PLATFORM} if {@code properties} is {@code NULL} and no platform could be selected or if platform value specified in properties is not a
     *         valid platform.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if context property name in {@code properties} is not a supported property name, if the value specified for a
     *         supported property name is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code devices} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_devices} is equal to zero.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code devices} contains an invalid device.</li>
     *         <li>{@link #CL_DEVICE_NOT_AVAILABLE DEVICE_NOT_AVAILABLE} if a device in {@code devices} is currently not available even though the device was returned by {@link #clGetDeviceIDs GetDeviceIDs}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateContext.html">Reference Page</a>
     */
    @NativeType("cl_context")
    public static long clCreateContext(@Nullable @NativeType("cl_context_properties const *") PointerBuffer properties, @NativeType("cl_device_id const *") PointerBuffer devices, @Nullable @NativeType("void (*) (cl_char const *, void const *, size_t, void *)") CLContextCallbackI pfn_notify, @NativeType("void *") long user_data, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateContext(memAddressSafe(properties), devices.remaining(), memAddress(devices), memAddressSafe(pfn_notify), user_data, memAddressSafe(errcode_ret));
    }

    /**
     * Creates an OpenCL context. An OpenCL context is created with one or more devices. Contexts are used by the OpenCL runtime for managing objects such as
     * command-queues, memory, program and kernel objects and for executing kernels on one or more devices specified in the context.
     *
     * @param properties  a list of context property names and their corresponding values. Each property name is immediately followed by the corresponding desired value. The
     *                    list is terminated with 0. One of:<br><table><tr><td>{@link #CL_CONTEXT_PLATFORM CONTEXT_PLATFORM}</td><td>{@link CL12#CL_CONTEXT_INTEROP_USER_SYNC CONTEXT_INTEROP_USER_SYNC}</td><td>{@link KHRGLSharing#CL_GL_CONTEXT_KHR GL_CONTEXT_KHR}</td><td>{@link KHRGLSharing#CL_EGL_DISPLAY_KHR EGL_DISPLAY_KHR}</td><td>{@link KHRGLSharing#CL_GLX_DISPLAY_KHR GLX_DISPLAY_KHR}</td></tr><tr><td>{@link KHRGLSharing#CL_WGL_HDC_KHR WGL_HDC_KHR}</td><td>{@link KHRGLSharing#CL_CGL_SHAREGROUP_KHR CGL_SHAREGROUP_KHR}</td></tr></table>
     * @param pfn_notify  a callback function that can be registered by the application. This callback function will be used by the OpenCL implementation to report
     *                    information on errors during context creation as well as errors that occur at runtime in this context. This callback function may be called
     *                    asynchronously by the OpenCL implementation. It is the application's responsibility to ensure that the callback function is thread-safe.
     *                    
     *                    <p>If {@code pfn_notify} is {@code NULL}, no callback function is registered.</p>
     * @param user_data   will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero context and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the context is created successfully. Otherwise, it returns a {@code NULL} value with the
     *         following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PLATFORM INVALID_PLATFORM} if {@code properties} is {@code NULL} and no platform could be selected or if platform value specified in properties is not a
     *         valid platform.</li>
     *         <li>{@link CL11#CL_INVALID_PROPERTY INVALID_PROPERTY} if context property name in {@code properties} is not a supported property name, if the value specified for a
     *         supported property name is not valid, or if the same property name is specified more than once.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code devices} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_devices} is equal to zero.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code devices} contains an invalid device.</li>
     *         <li>{@link #CL_DEVICE_NOT_AVAILABLE DEVICE_NOT_AVAILABLE} if a device in {@code devices} is currently not available even though the device was returned by {@link #clGetDeviceIDs GetDeviceIDs}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateContext.html">Reference Page</a>
     */
    @NativeType("cl_context")
    public static long clCreateContext(@Nullable @NativeType("cl_context_properties const *") PointerBuffer properties, @NativeType("cl_device_id const *") long device, @Nullable @NativeType("void (*) (cl_char const *, void const *, size_t, void *)") CLContextCallbackI pfn_notify, @NativeType("void *") long user_data, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer devices = stack.pointers(device);
            return nclCreateContext(memAddressSafe(properties), 1, memAddress(devices), memAddressSafe(pfn_notify), user_data, memAddressSafe(errcode_ret));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clCreateContextFromType ] ---

    /** Unsafe version of: {@link #clCreateContextFromType CreateContextFromType} */
    public static long nclCreateContextFromType(long properties, long device_type, long pfn_notify, long user_data, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateContextFromType;
        return callPJPPPP(properties, device_type, pfn_notify, user_data, errcode_ret, __functionAddress);
    }

    /**
     * Creates a context using devices of the specified type. See {@link #clCreateContext CreateContext} for details.
     *
     * @param properties  a list of context property names and their corresponding values. Each property name is immediately followed by the corresponding desired value. The
     *                    list is terminated with 0.
     * @param device_type a bit-field that identifies the type of device. One of:<br><table><tr><td>{@link #CL_DEVICE_TYPE_DEFAULT DEVICE_TYPE_DEFAULT}</td><td>{@link #CL_DEVICE_TYPE_CPU DEVICE_TYPE_CPU}</td><td>{@link #CL_DEVICE_TYPE_GPU DEVICE_TYPE_GPU}</td><td>{@link #CL_DEVICE_TYPE_ACCELERATOR DEVICE_TYPE_ACCELERATOR}</td></tr><tr><td>{@link #CL_DEVICE_TYPE_ALL DEVICE_TYPE_ALL}</td><td>{@link CL12#CL_DEVICE_TYPE_CUSTOM DEVICE_TYPE_CUSTOM}</td></tr></table>
     * @param pfn_notify  a callback function that can be registered by the application
     * @param user_data   will be passed as the {@code user_data} argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateContextFromType.html">Reference Page</a>
     */
    @NativeType("cl_context")
    public static long clCreateContextFromType(@Nullable @NativeType("cl_context_properties const *") PointerBuffer properties, @NativeType("cl_device_type") long device_type, @Nullable @NativeType("void (*) (cl_char const *, void const *, size_t, void *)") CLContextCallbackI pfn_notify, @NativeType("void *") long user_data, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateContextFromType(memAddressSafe(properties), device_type, memAddressSafe(pfn_notify), user_data, memAddressSafe(errcode_ret));
    }

    // --- [ clRetainContext ] ---

    /**
     * Increments the context reference count.
     * 
     * <p>{@link #clCreateContext CreateContext} and {@link #clCreateContextFromType CreateContextFromType} perform an implicit retain. This is very helpful for 3rd party libraries, which typically get a context passed
     * to them by the application. However, it is possible that the application may delete the context without informing the library. Allowing functions to
     * attach to (i.e. retain) and release a context solves the problem of a context being used by a library no longer being valid.</p>
     *
     * @param context the context to retain
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clRetainContext.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clRetainContext(@NativeType("cl_context") long context) {
        long __functionAddress = CL.getICD().clRetainContext;
        if (CHECKS) {
            check(context);
        }
        return callPI(context, __functionAddress);
    }

    // --- [ clReleaseContext ] ---

    /**
     * Decrements the context reference count.
     * 
     * <p>After the context reference count becomes zero and all the objects attached to context (such as memory objects, command-queues) are released, the
     * context is deleted.</p>
     *
     * @param context the context to release
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clReleaseContext.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clReleaseContext(@NativeType("cl_context") long context) {
        long __functionAddress = CL.getICD().clReleaseContext;
        if (CHECKS) {
            check(context);
        }
        return callPI(context, __functionAddress);
    }

    // --- [ clGetContextInfo ] ---

    /**
     * Unsafe version of: {@link #clGetContextInfo GetContextInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetContextInfo(long context, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetContextInfo;
        if (CHECKS) {
            check(context);
        }
        return callPPPPI(context, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Queries information about a context.
     *
     * @param context              the OpenCL context being queried
     * @param param_name           an enumeration constant that specifies the information to query. One of:<br><table><tr><td>{@link #CL_CONTEXT_REFERENCE_COUNT CONTEXT_REFERENCE_COUNT}</td><td>{@link #CL_CONTEXT_DEVICES CONTEXT_DEVICES}</td><td>{@link #CL_CONTEXT_PROPERTIES CONTEXT_PROPERTIES}</td><td>{@link CL11#CL_CONTEXT_NUM_DEVICES CONTEXT_NUM_DEVICES}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetContextInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetContextInfo(@NativeType("cl_context") long context, @NativeType("cl_context_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetContextInfo(context, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Queries information about a context.
     *
     * @param context              the OpenCL context being queried
     * @param param_name           an enumeration constant that specifies the information to query. One of:<br><table><tr><td>{@link #CL_CONTEXT_REFERENCE_COUNT CONTEXT_REFERENCE_COUNT}</td><td>{@link #CL_CONTEXT_DEVICES CONTEXT_DEVICES}</td><td>{@link #CL_CONTEXT_PROPERTIES CONTEXT_PROPERTIES}</td><td>{@link CL11#CL_CONTEXT_NUM_DEVICES CONTEXT_NUM_DEVICES}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetContextInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetContextInfo(@NativeType("cl_context") long context, @NativeType("cl_context_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetContextInfo(context, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Queries information about a context.
     *
     * @param context              the OpenCL context being queried
     * @param param_name           an enumeration constant that specifies the information to query. One of:<br><table><tr><td>{@link #CL_CONTEXT_REFERENCE_COUNT CONTEXT_REFERENCE_COUNT}</td><td>{@link #CL_CONTEXT_DEVICES CONTEXT_DEVICES}</td><td>{@link #CL_CONTEXT_PROPERTIES CONTEXT_PROPERTIES}</td><td>{@link CL11#CL_CONTEXT_NUM_DEVICES CONTEXT_NUM_DEVICES}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetContextInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetContextInfo(@NativeType("cl_context") long context, @NativeType("cl_context_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetContextInfo(context, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateCommandQueue ] ---

    /** Unsafe version of: {@link #clCreateCommandQueue CreateCommandQueue} */
    public static long nclCreateCommandQueue(long context, long device, long properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueue;
        if (CHECKS) {
            check(context);
            check(device);
        }
        return callPPJPP(context, device, properties, errcode_ret, __functionAddress);
    }

    /**
     * Creates a command-queue on a specific device.
     * 
     * <p>OpenCL objects such as memory, program and kernel objects are created using a context. Operations on these objects are performed using a command-queue.
     * The command-queue can be used to queue a set of operations (referred to as commands) in order. Having multiple command-queues allows applications to
     * queue multiple independent commands without requiring synchronization. Note that this should work as long as these objects are not being shared. Sharing
     * of objects across multiple command-queues will require the application to perform appropriate synchronization.</p>
     *
     * @param context     a valid OpenCL context
     * @param device      a device associated with context. It can either be in the list of devices specified when context is created using {@link #clCreateContext CreateContext} or have the same
     *                    device type as device type specified when context is created using {@link #clCreateContextFromType CreateContextFromType}.
     * @param properties  a bit-field of properties for the command-queue. One of:<br><table><tr><td>{@link #CL_QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE}</td><td>{@link #CL_QUEUE_PROFILING_ENABLE QUEUE_PROFILING_ENABLE}</td><td>{@link CL20#CL_QUEUE_ON_DEVICE QUEUE_ON_DEVICE}</td></tr><tr><td>{@link CL20#CL_QUEUE_ON_DEVICE_DEFAULT QUEUE_ON_DEVICE_DEFAULT}</td></tr></table>
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero command-queue and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the command-queue is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not a valid device or is not associated with {@code context}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code properties} are not valid.</li>
     *         <li>{@link #CL_INVALID_QUEUE_PROPERTIES INVALID_QUEUE_PROPERTIES} if values specified in {@code properties} are valid but are not supported by the device.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.2/docs/man/xhtml/clCreateCommandQueue.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.2</em>
     */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueue(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_command_queue_properties") long properties, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateCommandQueue(context, device, properties, memAddressSafe(errcode_ret));
    }

    // --- [ clRetainCommandQueue ] ---

    /**
     * Increments the {@code command_queue} reference count.
     * 
     * <p>{@link #clCreateCommandQueue CreateCommandQueue} performs an implicit retain. This is very helpful for 3rd party libraries, which typically get a command-queue passed to them by the
     * application. However, it is possible that the application may delete the command-queue without informing the library. Allowing functions to attach to
     * (i.e. retain) and release a command-queue solves the problem of a command-queue being used by a library no longer being valid.</p>
     *
     * @param command_queue the command-queue to retain
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clRetainCommandQueue.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clRetainCommandQueue(@NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clRetainCommandQueue;
        if (CHECKS) {
            check(command_queue);
        }
        return callPI(command_queue, __functionAddress);
    }

    // --- [ clReleaseCommandQueue ] ---

    /**
     * Decrements the {@code command_queue} reference count.
     * 
     * <p>After the {@code command_queue} reference count becomes zero and all commands queued to {@code command_queue} have finished (eg. kernel executions,
     * memory object updates etc.), the command-queue is deleted.</p>
     * 
     * <p>{@code clReleaseCommandQueue} performs an implicit flush to issue any previously queued OpenCL commands in command_queue.</p>
     *
     * @param command_queue the command-queue to release
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clReleaseCommandQueue.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clReleaseCommandQueue(@NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clReleaseCommandQueue;
        if (CHECKS) {
            check(command_queue);
        }
        return callPI(command_queue, __functionAddress);
    }

    // --- [ clGetCommandQueueInfo ] ---

    /**
     * Unsafe version of: {@link #clGetCommandQueueInfo GetCommandQueueInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetCommandQueueInfo(long command_queue, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetCommandQueueInfo;
        if (CHECKS) {
            check(command_queue);
        }
        return callPPPPI(command_queue, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Queries information about a command-queue.
     *
     * @param command_queue        the command-queue being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_QUEUE_CONTEXT QUEUE_CONTEXT}</td><td>{@link #CL_QUEUE_DEVICE QUEUE_DEVICE}</td><td>{@link #CL_QUEUE_REFERENCE_COUNT QUEUE_REFERENCE_COUNT}</td><td>{@link #CL_QUEUE_PROPERTIES QUEUE_PROPERTIES}</td><td>{@link CL20#CL_QUEUE_SIZE QUEUE_SIZE}</td></tr><tr><td>{@link CL21#CL_QUEUE_DEVICE_DEFAULT QUEUE_DEVICE_DEFAULT}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetCommandQueueInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandQueueInfo(command_queue, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Queries information about a command-queue.
     *
     * @param command_queue        the command-queue being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_QUEUE_CONTEXT QUEUE_CONTEXT}</td><td>{@link #CL_QUEUE_DEVICE QUEUE_DEVICE}</td><td>{@link #CL_QUEUE_REFERENCE_COUNT QUEUE_REFERENCE_COUNT}</td><td>{@link #CL_QUEUE_PROPERTIES QUEUE_PROPERTIES}</td><td>{@link CL20#CL_QUEUE_SIZE QUEUE_SIZE}</td></tr><tr><td>{@link CL21#CL_QUEUE_DEVICE_DEFAULT QUEUE_DEVICE_DEFAULT}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetCommandQueueInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandQueueInfo(command_queue, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Queries information about a command-queue.
     *
     * @param command_queue        the command-queue being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_QUEUE_CONTEXT QUEUE_CONTEXT}</td><td>{@link #CL_QUEUE_DEVICE QUEUE_DEVICE}</td><td>{@link #CL_QUEUE_REFERENCE_COUNT QUEUE_REFERENCE_COUNT}</td><td>{@link #CL_QUEUE_PROPERTIES QUEUE_PROPERTIES}</td><td>{@link CL20#CL_QUEUE_SIZE QUEUE_SIZE}</td></tr><tr><td>{@link CL21#CL_QUEUE_DEVICE_DEFAULT QUEUE_DEVICE_DEFAULT}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetCommandQueueInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @Nullable @NativeType("void *") LongBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandQueueInfo(command_queue, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Queries information about a command-queue.
     *
     * @param command_queue        the command-queue being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_QUEUE_CONTEXT QUEUE_CONTEXT}</td><td>{@link #CL_QUEUE_DEVICE QUEUE_DEVICE}</td><td>{@link #CL_QUEUE_REFERENCE_COUNT QUEUE_REFERENCE_COUNT}</td><td>{@link #CL_QUEUE_PROPERTIES QUEUE_PROPERTIES}</td><td>{@link CL20#CL_QUEUE_SIZE QUEUE_SIZE}</td></tr><tr><td>{@link CL21#CL_QUEUE_DEVICE_DEFAULT QUEUE_DEVICE_DEFAULT}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not one of the supported values or if size in bytes specified by {@code param_value_size} is &lt;
     *         size of return type and {@code param_value} is not a {@code NULL} value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetCommandQueueInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandQueueInfo(command_queue, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateBuffer ] ---

    /**
     * Unsafe version of: {@link #clCreateBuffer CreateBuffer}
     *
     * @param size the size in bytes of the buffer memory object to be allocated
     */
    public static long nclCreateBuffer(long context, long flags, long size, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
        }
        return callPJPPPP(context, flags, size, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Creates a buffer object.
     * 
     * <p>If {@code clCreateBuffer} is called with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by {@code host_ptr}
     * at the time of the {@code clCreateBuffer} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBuffer} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and {@code CL_MEM_USE_HOST_PTR} is set in
     * its {@code flags} argument, {@code clCreateBuffer} will succeed and return a valid non-zero buffer object as long as the {@code size} argument is no
     * larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object returned has the shared memory as the underlying
     * storage. Locations in the buffers underlying shared memory can be operated on using atomic operations to the devices level of support as defined in the
     * memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link #CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param size        the size in bytes of the buffer memory object to be allocated
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("size_t") long size, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, size, NULL, memAddressSafe(errcode_ret));
    }

    /**
     * Creates a buffer object.
     * 
     * <p>If {@code clCreateBuffer} is called with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by {@code host_ptr}
     * at the time of the {@code clCreateBuffer} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBuffer} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and {@code CL_MEM_USE_HOST_PTR} is set in
     * its {@code flags} argument, {@code clCreateBuffer} will succeed and return a valid non-zero buffer object as long as the {@code size} argument is no
     * larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object returned has the shared memory as the underlying
     * storage. Locations in the buffers underlying shared memory can be operated on using atomic operations to the devices level of support as defined in the
     * memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link #CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    &#x2265; {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, host_ptr.remaining(), memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a buffer object.
     * 
     * <p>If {@code clCreateBuffer} is called with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by {@code host_ptr}
     * at the time of the {@code clCreateBuffer} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBuffer} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and {@code CL_MEM_USE_HOST_PTR} is set in
     * its {@code flags} argument, {@code clCreateBuffer} will succeed and return a valid non-zero buffer object as long as the {@code size} argument is no
     * larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object returned has the shared memory as the underlying
     * storage. Locations in the buffers underlying shared memory can be operated on using atomic operations to the devices level of support as defined in the
     * memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link #CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    &#x2265; {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ShortBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, Integer.toUnsignedLong(host_ptr.remaining()) << 1, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a buffer object.
     * 
     * <p>If {@code clCreateBuffer} is called with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by {@code host_ptr}
     * at the time of the {@code clCreateBuffer} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBuffer} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and {@code CL_MEM_USE_HOST_PTR} is set in
     * its {@code flags} argument, {@code clCreateBuffer} will succeed and return a valid non-zero buffer object as long as the {@code size} argument is no
     * larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object returned has the shared memory as the underlying
     * storage. Locations in the buffers underlying shared memory can be operated on using atomic operations to the devices level of support as defined in the
     * memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link #CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    &#x2265; {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") IntBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a buffer object.
     * 
     * <p>If {@code clCreateBuffer} is called with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by {@code host_ptr}
     * at the time of the {@code clCreateBuffer} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBuffer} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and {@code CL_MEM_USE_HOST_PTR} is set in
     * its {@code flags} argument, {@code clCreateBuffer} will succeed and return a valid non-zero buffer object as long as the {@code size} argument is no
     * larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object returned has the shared memory as the underlying
     * storage. Locations in the buffers underlying shared memory can be operated on using atomic operations to the devices level of support as defined in the
     * memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link #CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    &#x2265; {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") FloatBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a buffer object.
     * 
     * <p>If {@code clCreateBuffer} is called with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in its {@code flags} argument, the contents of the memory pointed to by {@code host_ptr}
     * at the time of the {@code clCreateBuffer} call define the initial contents of the buffer object.</p>
     * 
     * <p>If {@code clCreateBuffer} is called with a pointer returned by {@link CL20#clSVMAlloc SVMAlloc} as its {@code host_ptr} argument, and {@code CL_MEM_USE_HOST_PTR} is set in
     * its {@code flags} argument, {@code clCreateBuffer} will succeed and return a valid non-zero buffer object as long as the {@code size} argument is no
     * larger than the size argument passed in the original {@code clSVMAlloc} call. The new buffer object returned has the shared memory as the underlying
     * storage. Locations in the buffers underlying shared memory can be operated on using atomic operations to the devices level of support as defined in the
     * memory model.</p>
     *
     * @param context     a valid OpenCL context used to create the buffer object
     * @param flags       a bit-field that is used to specify allocation and usage information such as the memory area that should be used to allocate the buffer object and
     *                    how it will be used. If value specified for flags is 0, the default is used which is {@link #CL_MEM_READ_WRITE MEM_READ_WRITE}. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param host_ptr    a pointer to the buffer data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be
     *                    &#x2265; {@code size} bytes.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero buffer object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the buffer object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_BUFFER_SIZE INVALID_BUFFER_SIZE} if {@code size} is 0 or if {@code size} is greater than {@link #CL_DEVICE_MAX_MEM_ALLOC_SIZE DEVICE_MAX_MEM_ALLOC_SIZE} for all devices in context.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in {@code flags} or if {@code host_ptr} is not
     *         {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in {@code flags}.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for buffer object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") DoubleBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, Integer.toUnsignedLong(host_ptr.remaining()) << 3, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    // --- [ clEnqueueReadBuffer ] ---

    /**
     * Unsafe version of: {@link #clEnqueueReadBuffer EnqueueReadBuffer}
     *
     * @param size                    the size in bytes of data being read
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReadBuffer;
        if (CHECKS) {
            check(command_queue);
            check(buffer);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_read, offset, size, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to read from a buffer object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadBuffer} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr + offset}, where
     * {@code host_ptr} is a pointer to the memory region specified when the buffer object being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet
     * the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
     * read command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer          a valid buffer object
     * @param blocking_read   indicates if the read operation is <em>blocking</em> or <em>non-blocking</em>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadBuffer} does not return until the buffer data has been
     *                        read and copied into memory pointed to by {@code ptr}.</p>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBuffer} queues a non-blocking read command and
     *                        returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                        returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                        the buffer that {@code ptr} points to can be used by the application.</p>
     * @param offset          the offset in bytes in the buffer object to read from
     * @param ptr             the pointer to buffer in host memory where data is to be read into
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
     *         {@code size} is 0.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") ByteBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReadBuffer(command_queue, buffer, blocking_read ? 1 : 0, offset, ptr.remaining(), memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read from a buffer object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadBuffer} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr + offset}, where
     * {@code host_ptr} is a pointer to the memory region specified when the buffer object being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet
     * the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
     * read command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer          a valid buffer object
     * @param blocking_read   indicates if the read operation is <em>blocking</em> or <em>non-blocking</em>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadBuffer} does not return until the buffer data has been
     *                        read and copied into memory pointed to by {@code ptr}.</p>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBuffer} queues a non-blocking read command and
     *                        returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                        returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                        the buffer that {@code ptr} points to can be used by the application.</p>
     * @param offset          the offset in bytes in the buffer object to read from
     * @param ptr             the pointer to buffer in host memory where data is to be read into
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
     *         {@code size} is 0.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") ShortBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReadBuffer(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 1, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read from a buffer object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadBuffer} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr + offset}, where
     * {@code host_ptr} is a pointer to the memory region specified when the buffer object being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet
     * the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
     * read command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer          a valid buffer object
     * @param blocking_read   indicates if the read operation is <em>blocking</em> or <em>non-blocking</em>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadBuffer} does not return until the buffer data has been
     *                        read and copied into memory pointed to by {@code ptr}.</p>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBuffer} queues a non-blocking read command and
     *                        returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                        returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                        the buffer that {@code ptr} points to can be used by the application.</p>
     * @param offset          the offset in bytes in the buffer object to read from
     * @param ptr             the pointer to buffer in host memory where data is to be read into
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
     *         {@code size} is 0.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") IntBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReadBuffer(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 2, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read from a buffer object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadBuffer} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr + offset}, where
     * {@code host_ptr} is a pointer to the memory region specified when the buffer object being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet
     * the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
     * read command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer          a valid buffer object
     * @param blocking_read   indicates if the read operation is <em>blocking</em> or <em>non-blocking</em>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadBuffer} does not return until the buffer data has been
     *                        read and copied into memory pointed to by {@code ptr}.</p>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBuffer} queues a non-blocking read command and
     *                        returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                        returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                        the buffer that {@code ptr} points to can be used by the application.</p>
     * @param offset          the offset in bytes in the buffer object to read from
     * @param ptr             the pointer to buffer in host memory where data is to be read into
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
     *         {@code size} is 0.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") FloatBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReadBuffer(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 2, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read from a buffer object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadBuffer} to read a region of the buffer object with the {@code ptr} argument value set to {@code host_ptr + offset}, where
     * {@code host_ptr} is a pointer to the memory region specified when the buffer object being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet
     * the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this buffer object or a memory object (buffer or image) created from this buffer object have finished execution before the
     * read command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the read command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer          a valid buffer object
     * @param blocking_read   indicates if the read operation is <em>blocking</em> or <em>non-blocking</em>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadBuffer} does not return until the buffer data has been
     *                        read and copied into memory pointed to by {@code ptr}.</p>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadBuffer} queues a non-blocking read command and
     *                        returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                        returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                        the buffer that {@code ptr} points to can be used by the application.</p>
     * @param offset          the offset in bytes in the buffer object to read from
     * @param ptr             the pointer to buffer in host memory where data is to be read into
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
     *         {@code size} is 0.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") DoubleBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReadBuffer(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 3, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueWriteBuffer ] ---

    /**
     * Unsafe version of: {@link #clEnqueueWriteBuffer EnqueueWriteBuffer}
     *
     * @param size                    the size in bytes of data being written
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBuffer;
        if (CHECKS) {
            check(command_queue);
            check(buffer);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_write, offset, size, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to write to a buffer object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteBuffer} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
     * {@code host_ptr + offset}, where {@code host_ptr} is a pointer to the memory region specified when the buffer object being written is created with
     * {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>The host memory region given by {@code (host_ptr + offset, cb)} contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer          a valid buffer object
     * @param blocking_write  indicates if the write operation is <em>blocking</em> or <em>non-blocking</em>
     *                        
     *                        <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
     *                        command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBuffer} call returns.</p>
     *                        
     *                        <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a nonblocking write. As the write is non-blocking
     *                        the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                        {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                        completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param offset          the offset in bytes in the buffer object to write to
     * @param ptr             the pointer to buffer in host memory where data is to be written from
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
     *         {@code size} is 0.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") ByteBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write ? 1 : 0, offset, ptr.remaining(), memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write to a buffer object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteBuffer} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
     * {@code host_ptr + offset}, where {@code host_ptr} is a pointer to the memory region specified when the buffer object being written is created with
     * {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>The host memory region given by {@code (host_ptr + offset, cb)} contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer          a valid buffer object
     * @param blocking_write  indicates if the write operation is <em>blocking</em> or <em>non-blocking</em>
     *                        
     *                        <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
     *                        command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBuffer} call returns.</p>
     *                        
     *                        <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a nonblocking write. As the write is non-blocking
     *                        the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                        {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                        completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param offset          the offset in bytes in the buffer object to write to
     * @param ptr             the pointer to buffer in host memory where data is to be written from
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
     *         {@code size} is 0.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") ShortBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 1, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write to a buffer object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteBuffer} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
     * {@code host_ptr + offset}, where {@code host_ptr} is a pointer to the memory region specified when the buffer object being written is created with
     * {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>The host memory region given by {@code (host_ptr + offset, cb)} contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer          a valid buffer object
     * @param blocking_write  indicates if the write operation is <em>blocking</em> or <em>non-blocking</em>
     *                        
     *                        <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
     *                        command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBuffer} call returns.</p>
     *                        
     *                        <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a nonblocking write. As the write is non-blocking
     *                        the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                        {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                        completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param offset          the offset in bytes in the buffer object to write to
     * @param ptr             the pointer to buffer in host memory where data is to be written from
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
     *         {@code size} is 0.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") IntBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 2, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write to a buffer object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteBuffer} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
     * {@code host_ptr + offset}, where {@code host_ptr} is a pointer to the memory region specified when the buffer object being written is created with
     * {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>The host memory region given by {@code (host_ptr + offset, cb)} contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer          a valid buffer object
     * @param blocking_write  indicates if the write operation is <em>blocking</em> or <em>non-blocking</em>
     *                        
     *                        <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
     *                        command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBuffer} call returns.</p>
     *                        
     *                        <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a nonblocking write. As the write is non-blocking
     *                        the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                        {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                        completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param offset          the offset in bytes in the buffer object to write to
     * @param ptr             the pointer to buffer in host memory where data is to be written from
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
     *         {@code size} is 0.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") FloatBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 2, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write to a buffer object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteBuffer} to update the latest bits in a region of the buffer object with the {@code ptr} argument value set to
     * {@code host_ptr + offset}, where {@code host_ptr} is a pointer to the memory region specified when the buffer object being written is created with
     * {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>The host memory region given by {@code (host_ptr + offset, cb)} contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The buffer object or memory objects created from this buffer object are not mapped.</li>
     * <li>The buffer object or memory objects created from this buffer object are not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the write command will be queued. {@code command_queue} and {@code buffer} must be created with the same OpenCL context.
     * @param buffer          a valid buffer object
     * @param blocking_write  indicates if the write operation is <em>blocking</em> or <em>non-blocking</em>
     *                        
     *                        <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write operation in the
     *                        command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteBuffer} call returns.</p>
     *                        
     *                        <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a nonblocking write. As the write is non-blocking
     *                        the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                        {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                        completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param offset          the offset in bytes in the buffer object to write to
     * @param ptr             the pointer to buffer in host memory where data is to be written from
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code (offset, size)} is out of bounds or if {@code ptr} is a {@code NULL} value or if
     *         {@code size} is 0.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteBuffer} is called on buffer which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") DoubleBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 3, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueCopyBuffer ] ---

    /**
     * Unsafe version of: {@link #clEnqueueCopyBuffer EnqueueCopyBuffer}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueCopyBuffer(long command_queue, long src_buffer, long dst_buffer, long src_offset, long dst_offset, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCopyBuffer;
        if (CHECKS) {
            check(command_queue);
            check(src_buffer);
            check(dst_buffer);
        }
        return callPPPPPPPPI(command_queue, src_buffer, dst_buffer, src_offset, dst_offset, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to copy a buffer object identified by {@code src_buffer} to another buffer object identified by {@code dst_buffer}.
     *
     * @param command_queue   the command-queue in which the copy command will be queued. The OpenCL context associated with {@code command_queue}, {@code src_buffer} and
     *                        {@code dst_buffer} must be the same.
     * @param src_buffer      the source buffer
     * @param dst_buffer      the destination buffer
     * @param src_offset      the offset where to begin copying data from {@code src_buffer}.
     * @param dst_offset      the offset where to begin copying data into {@code dst_buffer}
     * @param size            the size in bytes to copy
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_buffer} and {@code dst_buffer} are not the same or if
     *         the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code src_buffer} and {@code dst_buffer} are not valid buffer objects.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code src_offset}, {@code dst_offset}, {@code size}, {@code src_offset + size} or {@code dst_offset + size} require
     *         accessing elements outside the {@code src_buffer} and {@code dst_buffer} buffer objects respectively.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code size} is 0.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code src_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code dst_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_MEM_COPY_OVERLAP MEM_COPY_OVERLAP} if {@code src_buffer} and {@code dst_buffer} are the same buffer or sub-buffer object and the source and destination
     *         regions overlap or if {@code src_buffer} and {@code dst_buffer} are different sub-buffers of the same associated buffer object and they overlap. The
     *         regions overlap if <code>src_offset &#x2264; dst_offset &#x2264; src_offset + size – 1</code> or if
     *         <code>dst_offset &#x2264; src_offset &#x2264; dst_offset + size – 1</code>.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_buffer} or {@code dst_buffer}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueCopyBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueCopyBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t") long src_offset, @NativeType("size_t") long dst_offset, @NativeType("size_t") long size, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueCopyBuffer(command_queue, src_buffer, dst_buffer, src_offset, dst_offset, size, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMapBuffer ] ---

    /**
     * Unsafe version of: {@link #clEnqueueMapBuffer EnqueueMapBuffer}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static long nclEnqueueMapBuffer(long command_queue, long buffer, int blocking_map, long map_flags, long offset, long size, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret) {
        long __functionAddress = CL.getICD().clEnqueueMapBuffer;
        if (CHECKS) {
            check(command_queue);
            check(buffer);
        }
        return callPPJPPPPPP(command_queue, buffer, blocking_map, map_flags, offset, size, num_events_in_wait_list, event_wait_list, event, errcode_ret, __functionAddress);
    }

    /**
     * Enqueues a command to map a region of the buffer object given by buffer into the host address space and returns a pointer to this mapped region.
     * 
     * <p>The pointer returned maps a region starting at {@code offset} and is at least {@code size} bytes in size. The result of a memory access outside this
     * region is undefined.</p>
     * 
     * <p>If the buffer object is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in {@code mem_flags}, the following will be true:</p>
     * 
     * <ul>
     * <li>The {@code host_ptr} specified in {@link #clCreateBuffer CreateBuffer} is guaranteed to contain the latest bits in the region being mapped when the
     * {@code clEnqueueMapBuffer} command has completed.</li>
     * <li>The pointer value returned by {@code clEnqueueMapBuffer} will be derived from the {@code host_ptr} specified when the buffer object is created.</li>
     * </ul>
     * 
     * <p>Mapped buffer objects are unmapped using {@link #clEnqueueUnmapMemObject EnqueueUnmapMemObject}.</p>
     *
     * @param command_queue   a valid command-queue
     * @param buffer          a valid buffer object. The OpenCL context associated with command_queue and buffer must be the same.
     * @param blocking_map    indicates if the map operation is blocking or non-blocking.
     *                        
     *                        <p>If {@code blocking_map} is {@link #CL_TRUE TRUE}, {@code clEnqueueMapBuffer} does not return until the specified region in buffer is mapped into the host address
     *                        space and the application can access the contents of the mapped region using the pointer returned by {@code clEnqueueMapBuffer}.</p>
     *                        
     *                        <p>If {@code blocking_map} is {@link #CL_FALSE FALSE} i.e. map operation is non-blocking, the pointer to the mapped region returned by {@code clEnqueueMapBuffer}
     *                        cannot be used until the map command has completed. The {@code event} argument returns an event object which can be used to query the execution
     *                        status of the map command. When the map command is completed, the application can access the contents of the mapped region using the pointer
     *                        returned by {@code clEnqueueMapBuffer}.</p>
     * @param map_flags       a bit-field. One of:<br><table><tr><td>{@link #CL_MAP_READ MAP_READ}</td><td>{@link #CL_MAP_WRITE MAP_WRITE}</td><td>{@link CL12#CL_MAP_WRITE_INVALIDATE_REGION MAP_WRITE_INVALIDATE_REGION}</td></tr></table>
     * @param offset          the offset in bytes of the region in the buffer object that is being mapped
     * @param size            the size in bytes of the region in the buffer object that is being mapped
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     * @param errcode_ret     will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a pointer to the mapped region. The {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS}. A {@code NULL} pointer is returned otherwise with one of the following error values
     *         returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and {@code buffer} are not the same or if the context associated with
     *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code buffer} is not a valid buffer object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if region being mapped given by {@code (offset, size)} is out of bounds or if {@code size} is 0 or if values specified in
     *         {@code map_flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_MAP_FAILURE MAP_FAILURE} if there is a failure to map the requested region into the host address space. This error cannot occur for buffer objects
     *         created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the map operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code buffer}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if buffer has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and
     *         {@link #CL_MAP_READ MAP_READ} is set in {@code map_flags} or if {@code buffer} has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and {@link #CL_MAP_WRITE MAP_WRITE} or {@link CL12#CL_MAP_WRITE_INVALIDATE_REGION MAP_WRITE_INVALIDATE_REGION} is set in {@code map_flags}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueMapBuffer.html">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clEnqueueMapBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t") long offset, @NativeType("size_t") long size, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret, @Nullable ByteBuffer old_buffer) {
        if (CHECKS) {
            checkSafe(event, 1);
            checkSafe(errcode_ret, 1);
        }
        long __result = nclEnqueueMapBuffer(command_queue, buffer, blocking_map ? 1 : 0, map_flags, offset, size, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret));
        return apiGetMappedBuffer(old_buffer, __result, (int)size);
    }

    // --- [ clCreateImage2D ] ---

    /** Unsafe version of: {@link #clCreateImage2D CreateImage2D} */
    public static long nclCreateImage2D(long context, long flags, long image_format, long image_width, long image_height, long image_row_pitch, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage2D;
        if (CHECKS) {
            check(context);
        }
        return callPJPPPPPPP(context, flags, image_format, image_width, image_height, image_row_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Creates a 2D image object.
     *
     * @param context         a valid OpenCL context on which the image object is to be created
     * @param flags           a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format    a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_width     the width of the image in pixels
     * @param image_height    the height of the image in pixels
     * @param image_row_pitch the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
     *                        bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
     *                        {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
     * @param host_ptr        a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
     *                        {@code image_row_pitch * image_height}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
     *                        stored as a linear sequence of adjacent scanlines. Each scanline is stored as a linear sequence of image elements.
     * @param errcode_ret     will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if {@code image_width} or {@code image_height} are 0 or if they exceed values specified in
     *         {@link #CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH} or {@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT DEVICE_IMAGE2D_MAX_HEIGHT} respectively for all devices in {@code context} or if values specified
     *         by {@code image_row_pitch} do not follow rules described in the argument description.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if
     *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage2D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @Nullable @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage2D(context, flags, image_format.address(), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a 2D image object.
     *
     * @param context         a valid OpenCL context on which the image object is to be created
     * @param flags           a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format    a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_width     the width of the image in pixels
     * @param image_height    the height of the image in pixels
     * @param image_row_pitch the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
     *                        bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
     *                        {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
     * @param host_ptr        a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
     *                        {@code image_row_pitch * image_height}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
     *                        stored as a linear sequence of adjacent scanlines. Each scanline is stored as a linear sequence of image elements.
     * @param errcode_ret     will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if {@code image_width} or {@code image_height} are 0 or if they exceed values specified in
     *         {@link #CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH} or {@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT DEVICE_IMAGE2D_MAX_HEIGHT} respectively for all devices in {@code context} or if values specified
     *         by {@code image_row_pitch} do not follow rules described in the argument description.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if
     *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage2D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @Nullable @NativeType("void *") ShortBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage2D(context, flags, image_format.address(), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a 2D image object.
     *
     * @param context         a valid OpenCL context on which the image object is to be created
     * @param flags           a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format    a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_width     the width of the image in pixels
     * @param image_height    the height of the image in pixels
     * @param image_row_pitch the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
     *                        bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
     *                        {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
     * @param host_ptr        a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
     *                        {@code image_row_pitch * image_height}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
     *                        stored as a linear sequence of adjacent scanlines. Each scanline is stored as a linear sequence of image elements.
     * @param errcode_ret     will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if {@code image_width} or {@code image_height} are 0 or if they exceed values specified in
     *         {@link #CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH} or {@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT DEVICE_IMAGE2D_MAX_HEIGHT} respectively for all devices in {@code context} or if values specified
     *         by {@code image_row_pitch} do not follow rules described in the argument description.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if
     *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage2D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @Nullable @NativeType("void *") IntBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage2D(context, flags, image_format.address(), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a 2D image object.
     *
     * @param context         a valid OpenCL context on which the image object is to be created
     * @param flags           a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format    a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_width     the width of the image in pixels
     * @param image_height    the height of the image in pixels
     * @param image_row_pitch the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
     *                        bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
     *                        {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
     * @param host_ptr        a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
     *                        {@code image_row_pitch * image_height}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
     *                        stored as a linear sequence of adjacent scanlines. Each scanline is stored as a linear sequence of image elements.
     * @param errcode_ret     will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if {@code image_width} or {@code image_height} are 0 or if they exceed values specified in
     *         {@link #CL_DEVICE_IMAGE2D_MAX_WIDTH DEVICE_IMAGE2D_MAX_WIDTH} or {@link #CL_DEVICE_IMAGE2D_MAX_HEIGHT DEVICE_IMAGE2D_MAX_HEIGHT} respectively for all devices in {@code context} or if values specified
     *         by {@code image_row_pitch} do not follow rules described in the argument description.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if
     *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage2D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @Nullable @NativeType("void *") FloatBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage2D(context, flags, image_format.address(), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    // --- [ clCreateImage3D ] ---

    /** Unsafe version of: {@link #clCreateImage3D CreateImage3D} */
    public static long nclCreateImage3D(long context, long flags, long image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage3D;
        if (CHECKS) {
            check(context);
        }
        return callPJPPPPPPPPP(context, flags, image_format, image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Creates a 3D image object.
     *
     * @param context           a valid OpenCL context on which the image object is to be created
     * @param flags             a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format      a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_width       the width of the image in pixels
     * @param image_height      the height of the image in pixels
     * @param image_depth       the depth of the image in pixels. This must be a value &gt; 1.
     * @param image_row_pitch   the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
     *                          bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
     *                          {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
     * @param image_slice_pitch the size in bytes of each 2D slice in the 3D image. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265;
     *                          {@code image_row_pitch * image_height} if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_slice_pitch = 0},
     *                          {@code image_slice_pitch} is calculated as {@code image_row_pitch * image_height}. If {@code image_slice_pitch} is not 0, it must be a multiple of
     *                          the {@code image_row_pitch}.
     * @param host_ptr          a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
     *                          {@code image_slice_pitch * image_depth}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
     *                          stored as a linear sequence of adjacent 2D slices. Each 2D slice is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
     *                          image elements.
     * @param errcode_ret       will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if {@code image_width}, {@code image_height} are 0 or if {@code image_depth} &#x2264; 1 or if they exceed values
     *         specified in {@link #CL_DEVICE_IMAGE3D_MAX_WIDTH DEVICE_IMAGE3D_MAX_WIDTH}, {@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT DEVICE_IMAGE3D_MAX_HEIGHT} or {@link #CL_DEVICE_IMAGE3D_MAX_DEPTH DEVICE_IMAGE3D_MAX_DEPTH} respectively for
     *         all devices in {@code context} or if values specified by {@code image_row_pitch} and {@code image_slice_pitch} do not follow rules described in the
     *         argument descriptions.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if
     *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage3D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @Nullable @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage3D(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a 3D image object.
     *
     * @param context           a valid OpenCL context on which the image object is to be created
     * @param flags             a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format      a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_width       the width of the image in pixels
     * @param image_height      the height of the image in pixels
     * @param image_depth       the depth of the image in pixels. This must be a value &gt; 1.
     * @param image_row_pitch   the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
     *                          bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
     *                          {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
     * @param image_slice_pitch the size in bytes of each 2D slice in the 3D image. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265;
     *                          {@code image_row_pitch * image_height} if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_slice_pitch = 0},
     *                          {@code image_slice_pitch} is calculated as {@code image_row_pitch * image_height}. If {@code image_slice_pitch} is not 0, it must be a multiple of
     *                          the {@code image_row_pitch}.
     * @param host_ptr          a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
     *                          {@code image_slice_pitch * image_depth}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
     *                          stored as a linear sequence of adjacent 2D slices. Each 2D slice is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
     *                          image elements.
     * @param errcode_ret       will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if {@code image_width}, {@code image_height} are 0 or if {@code image_depth} &#x2264; 1 or if they exceed values
     *         specified in {@link #CL_DEVICE_IMAGE3D_MAX_WIDTH DEVICE_IMAGE3D_MAX_WIDTH}, {@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT DEVICE_IMAGE3D_MAX_HEIGHT} or {@link #CL_DEVICE_IMAGE3D_MAX_DEPTH DEVICE_IMAGE3D_MAX_DEPTH} respectively for
     *         all devices in {@code context} or if values specified by {@code image_row_pitch} and {@code image_slice_pitch} do not follow rules described in the
     *         argument descriptions.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if
     *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage3D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @Nullable @NativeType("void *") ShortBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage3D(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a 3D image object.
     *
     * @param context           a valid OpenCL context on which the image object is to be created
     * @param flags             a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format      a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_width       the width of the image in pixels
     * @param image_height      the height of the image in pixels
     * @param image_depth       the depth of the image in pixels. This must be a value &gt; 1.
     * @param image_row_pitch   the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
     *                          bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
     *                          {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
     * @param image_slice_pitch the size in bytes of each 2D slice in the 3D image. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265;
     *                          {@code image_row_pitch * image_height} if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_slice_pitch = 0},
     *                          {@code image_slice_pitch} is calculated as {@code image_row_pitch * image_height}. If {@code image_slice_pitch} is not 0, it must be a multiple of
     *                          the {@code image_row_pitch}.
     * @param host_ptr          a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
     *                          {@code image_slice_pitch * image_depth}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
     *                          stored as a linear sequence of adjacent 2D slices. Each 2D slice is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
     *                          image elements.
     * @param errcode_ret       will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if {@code image_width}, {@code image_height} are 0 or if {@code image_depth} &#x2264; 1 or if they exceed values
     *         specified in {@link #CL_DEVICE_IMAGE3D_MAX_WIDTH DEVICE_IMAGE3D_MAX_WIDTH}, {@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT DEVICE_IMAGE3D_MAX_HEIGHT} or {@link #CL_DEVICE_IMAGE3D_MAX_DEPTH DEVICE_IMAGE3D_MAX_DEPTH} respectively for
     *         all devices in {@code context} or if values specified by {@code image_row_pitch} and {@code image_slice_pitch} do not follow rules described in the
     *         argument descriptions.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if
     *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage3D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @Nullable @NativeType("void *") IntBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage3D(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a 3D image object.
     *
     * @param context           a valid OpenCL context on which the image object is to be created
     * @param flags             a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_format      a pointer to a {@link CLImageFormat} structure that describes format properties of the image to be allocated
     * @param image_width       the width of the image in pixels
     * @param image_height      the height of the image in pixels
     * @param image_depth       the depth of the image in pixels. This must be a value &gt; 1.
     * @param image_row_pitch   the scan-line pitch in bytes. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265; {@code image_width * size} of element in
     *                          bytes if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_row_pitch} = 0, {@code image_row_pitch} is calculated as
     *                          {@code image_width * size of element} in bytes. If {@code image_row_pitch} is not 0, it must be a multiple of the image element size in bytes.
     * @param image_slice_pitch the size in bytes of each 2D slice in the 3D image. This must be 0 if {@code host_ptr} is {@code NULL} and can be either 0 or &#x2265;
     *                          {@code image_row_pitch * image_height} if {@code host_ptr} is not {@code NULL}. If {@code host_ptr} is not {@code NULL} and {@code image_slice_pitch = 0},
     *                          {@code image_slice_pitch} is calculated as {@code image_row_pitch * image_height}. If {@code image_slice_pitch} is not 0, it must be a multiple of
     *                          the {@code image_row_pitch}.
     * @param host_ptr          a pointer to the image data that may already be allocated by the application. The size of the buffer that {@code host_ptr} points to must be &#x2265;
     *                          {@code image_slice_pitch * image_depth}. The size of each element in bytes must be a power of 2. The image data specified by {@code host_ptr} is
     *                          stored as a linear sequence of adjacent 2D slices. Each 2D slice is a linear sequence of adjacent scanlines. Each scanline is a linear sequence of
     *                          image elements.
     * @param errcode_ret       will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero image object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the image object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values specified in {@code flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_IMAGE_FORMAT_DESCRIPTOR INVALID_IMAGE_FORMAT_DESCRIPTOR} if values specified in {@code image_format} are not valid or if {@code image_format} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if {@code image_width}, {@code image_height} are 0 or if {@code image_depth} &#x2264; 1 or if they exceed values
     *         specified in {@link #CL_DEVICE_IMAGE3D_MAX_WIDTH DEVICE_IMAGE3D_MAX_WIDTH}, {@link #CL_DEVICE_IMAGE3D_MAX_HEIGHT DEVICE_IMAGE3D_MAX_HEIGHT} or {@link #CL_DEVICE_IMAGE3D_MAX_DEPTH DEVICE_IMAGE3D_MAX_DEPTH} respectively for
     *         all devices in {@code context} or if values specified by {@code image_row_pitch} and {@code image_slice_pitch} do not follow rules described in the
     *         argument descriptions.</li>
     *         <li>{@link #CL_INVALID_HOST_PTR INVALID_HOST_PTR} if {@code host_ptr} is {@code NULL} and {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} are set in flags or if
     *         {@code host_ptr} is not {@code NULL} but {@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR} or {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} are not set in flags.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if the {@code image_format} is not supported.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for image object.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are no devices in {@code context} that support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage3D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @Nullable @NativeType("void *") FloatBuffer host_ptr, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage3D(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    // --- [ clGetSupportedImageFormats ] ---

    /**
     * Unsafe version of: {@link #clGetSupportedImageFormats GetSupportedImageFormats}
     *
     * @param num_entries the number of entries that can be returned in the memory location given by {@code image_formats}
     */
    public static int nclGetSupportedImageFormats(long context, long flags, int image_type, int num_entries, long image_formats, long num_image_formats) {
        long __functionAddress = CL.getICD().clGetSupportedImageFormats;
        if (CHECKS) {
            check(context);
        }
        return callPJPPI(context, flags, image_type, num_entries, image_formats, num_image_formats, __functionAddress);
    }

    /**
     * Can be used to get the list of image formats supported by an OpenCL implementation when the following information about an image memory object is
     * specified:
     * 
     * <ul>
     * <li>Context</li>
     * <li>Image type – 1D, 2D, or 3D image, 1D image buffer, 1D or 2D image array</li>
     * <li>Image object allocation information</li>
     * </ul>
     * 
     * <p>{@code clGetSupportedImageFormats} returns a union of image formats supported by all devices in the context.</p>
     *
     * @param context           a valid OpenCL context on which the image object(s) will be created
     * @param flags             a bit-field that is used to specify allocation and usage information about the image memory object being created. One of:<br><table><tr><td>{@link #CL_MEM_READ_WRITE MEM_READ_WRITE}</td><td>{@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY}</td><td>{@link #CL_MEM_READ_ONLY MEM_READ_ONLY}</td><td>{@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}</td><td>{@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}</td></tr><tr><td>{@link #CL_MEM_COPY_HOST_PTR MEM_COPY_HOST_PTR}</td><td>{@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY}</td><td>{@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY}</td><td>{@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}</td></tr></table>
     * @param image_type        the image type. One of:<br><table><tr><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D MEM_OBJECT_IMAGE1D}</td><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D_BUFFER MEM_OBJECT_IMAGE1D_BUFFER}</td><td>{@link #CL_MEM_OBJECT_BUFFER MEM_OBJECT_BUFFER}</td><td>{@link #CL_MEM_OBJECT_IMAGE2D MEM_OBJECT_IMAGE2D}</td></tr><tr><td>{@link #CL_MEM_OBJECT_IMAGE3D MEM_OBJECT_IMAGE3D}</td><td>{@link CL12#CL_MEM_OBJECT_IMAGE1D_ARRAY MEM_OBJECT_IMAGE1D_ARRAY}</td><td>{@link CL12#CL_MEM_OBJECT_IMAGE2D_ARRAY MEM_OBJECT_IMAGE2D_ARRAY}</td><td>{@link CL20#CL_MEM_OBJECT_PIPE MEM_OBJECT_PIPE}</td></tr></table>
     * @param image_formats     a pointer to a memory location where the list of supported image formats are returned. Each entry describes a {@link CLImageFormat} structure
     *                          supported by the OpenCL implementation. If {@code image_formats} is {@code NULL}, it is ignored.
     * @param num_image_formats the actual number of supported image formats for a specific context and values specified by {@code flags}. If {@code num_image_formats} is {@code NULL}, it
     *                          is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code flags} or {@code image_type} are not valid, or if {@code num_entries} is 0 and {@code image_formats} is not {@code NULL}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetSupportedImageFormats.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetSupportedImageFormats(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @Nullable @NativeType("cl_image_format *") CLImageFormat.Buffer image_formats, @Nullable @NativeType("cl_uint *") IntBuffer num_image_formats) {
        if (CHECKS) {
            checkSafe(num_image_formats, 1);
        }
        return nclGetSupportedImageFormats(context, flags, image_type, remainingSafe(image_formats), memAddressSafe(image_formats), memAddressSafe(num_image_formats));
    }

    // --- [ clEnqueueReadImage ] ---

    /**
     * Unsafe version of: {@link #clEnqueueReadImage EnqueueReadImage}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueReadImage(long command_queue, long image, int blocking_read, long origin, long region, long row_pitch, long slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReadImage;
        if (CHECKS) {
            check(command_queue);
            check(image);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_read, origin, region, row_pitch, slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to read from an image or image array object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadImage} to read a region of the image with the {@code ptr} argument value set to
     * {@code host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)}, where {@code host_ptr} is a pointer
     * to the memory region specified when the image being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to
     * avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this image object have finished execution before the read command begins execution.</li>
     * <li>The row_pitch and slice_pitch argument values in clEnqueueReadImage must be set to the image row pitch and slice pitch.</li>
     * <li>The image object is not mapped.</li>
     * <li>The image object is not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the read command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
     * @param image           a valid image or image array object
     * @param blocking_read   indicates if the read operation is blocking or non-blocking.
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadImage} does not return until the buffer data has
     *                        been read and copied into memory pointed to by {@code ptr}.</p>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadImage} queues a non-blocking read command
     *                        and returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                        returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                        the buffer that {@code ptr} points to can be used by the application.</p>
     * @param origin          defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                        {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                        is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                        {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                        {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region          defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
     *                        the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                        {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
     *                        {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param row_pitch       the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code row_pitch} is set
     *                        to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
     * @param slice_pitch     the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being read. This must be 0 if {@code image}
     *                        is a 1D or 2D image. This value must be greater than or equal to {@code row_pitch * height}. If {@code slice_pitch} is set to 0, the appropriate
     *                        slice pitch is calculated based on the {@code row_pitch * height}.
     * @param ptr             the pointer to a buffer in host memory where image data is to be read to
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
     *         {@code NULL} value.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
     *         {@code origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") ByteBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadImage(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read from an image or image array object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadImage} to read a region of the image with the {@code ptr} argument value set to
     * {@code host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)}, where {@code host_ptr} is a pointer
     * to the memory region specified when the image being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to
     * avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this image object have finished execution before the read command begins execution.</li>
     * <li>The row_pitch and slice_pitch argument values in clEnqueueReadImage must be set to the image row pitch and slice pitch.</li>
     * <li>The image object is not mapped.</li>
     * <li>The image object is not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the read command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
     * @param image           a valid image or image array object
     * @param blocking_read   indicates if the read operation is blocking or non-blocking.
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadImage} does not return until the buffer data has
     *                        been read and copied into memory pointed to by {@code ptr}.</p>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadImage} queues a non-blocking read command
     *                        and returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                        returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                        the buffer that {@code ptr} points to can be used by the application.</p>
     * @param origin          defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                        {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                        is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                        {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                        {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region          defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
     *                        the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                        {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
     *                        {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param row_pitch       the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code row_pitch} is set
     *                        to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
     * @param slice_pitch     the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being read. This must be 0 if {@code image}
     *                        is a 1D or 2D image. This value must be greater than or equal to {@code row_pitch * height}. If {@code slice_pitch} is set to 0, the appropriate
     *                        slice pitch is calculated based on the {@code row_pitch * height}.
     * @param ptr             the pointer to a buffer in host memory where image data is to be read to
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
     *         {@code NULL} value.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
     *         {@code origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") ShortBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadImage(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read from an image or image array object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadImage} to read a region of the image with the {@code ptr} argument value set to
     * {@code host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)}, where {@code host_ptr} is a pointer
     * to the memory region specified when the image being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to
     * avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this image object have finished execution before the read command begins execution.</li>
     * <li>The row_pitch and slice_pitch argument values in clEnqueueReadImage must be set to the image row pitch and slice pitch.</li>
     * <li>The image object is not mapped.</li>
     * <li>The image object is not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the read command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
     * @param image           a valid image or image array object
     * @param blocking_read   indicates if the read operation is blocking or non-blocking.
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadImage} does not return until the buffer data has
     *                        been read and copied into memory pointed to by {@code ptr}.</p>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadImage} queues a non-blocking read command
     *                        and returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                        returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                        the buffer that {@code ptr} points to can be used by the application.</p>
     * @param origin          defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                        {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                        is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                        {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                        {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region          defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
     *                        the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                        {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
     *                        {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param row_pitch       the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code row_pitch} is set
     *                        to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
     * @param slice_pitch     the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being read. This must be 0 if {@code image}
     *                        is a 1D or 2D image. This value must be greater than or equal to {@code row_pitch * height}. If {@code slice_pitch} is set to 0, the appropriate
     *                        slice pitch is calculated based on the {@code row_pitch * height}.
     * @param ptr             the pointer to a buffer in host memory where image data is to be read to
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
     *         {@code NULL} value.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
     *         {@code origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") IntBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadImage(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read from an image or image array object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadImage} to read a region of the image with the {@code ptr} argument value set to
     * {@code host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)}, where {@code host_ptr} is a pointer
     * to the memory region specified when the image being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to
     * avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this image object have finished execution before the read command begins execution.</li>
     * <li>The row_pitch and slice_pitch argument values in clEnqueueReadImage must be set to the image row pitch and slice pitch.</li>
     * <li>The image object is not mapped.</li>
     * <li>The image object is not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the read command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
     * @param image           a valid image or image array object
     * @param blocking_read   indicates if the read operation is blocking or non-blocking.
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadImage} does not return until the buffer data has
     *                        been read and copied into memory pointed to by {@code ptr}.</p>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadImage} queues a non-blocking read command
     *                        and returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                        returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                        the buffer that {@code ptr} points to can be used by the application.</p>
     * @param origin          defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                        {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                        is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                        {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                        {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region          defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
     *                        the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                        {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
     *                        {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param row_pitch       the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code row_pitch} is set
     *                        to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
     * @param slice_pitch     the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being read. This must be 0 if {@code image}
     *                        is a 1D or 2D image. This value must be greater than or equal to {@code row_pitch * height}. If {@code slice_pitch} is set to 0, the appropriate
     *                        slice pitch is calculated based on the {@code row_pitch * height}.
     * @param ptr             the pointer to a buffer in host memory where image data is to be read to
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
     *         {@code NULL} value.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
     *         {@code origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") FloatBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadImage(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to read from an image or image array object to host memory.
     * 
     * <p>Calling {@code clEnqueueReadImage} to read a region of the image with the {@code ptr} argument value set to
     * {@code host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)}, where {@code host_ptr} is a pointer
     * to the memory region specified when the image being read is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order to
     * avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>All commands that use this image object have finished execution before the read command begins execution.</li>
     * <li>The row_pitch and slice_pitch argument values in clEnqueueReadImage must be set to the image row pitch and slice pitch.</li>
     * <li>The image object is not mapped.</li>
     * <li>The image object is not used by any command-queue until the read command has finished execution.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the read command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
     * @param image           a valid image or image array object
     * @param blocking_read   indicates if the read operation is blocking or non-blocking.
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_TRUE TRUE} i.e. the read command is blocking, {@code clEnqueueReadImage} does not return until the buffer data has
     *                        been read and copied into memory pointed to by {@code ptr}.</p>
     *                        
     *                        <p>If {@code blocking_read} is {@link #CL_FALSE FALSE} i.e. the read command is non-blocking, {@code clEnqueueReadImage} queues a non-blocking read command
     *                        and returns. The contents of the buffer that {@code ptr} points to cannot be used until the read command has completed. The {@code event} argument
     *                        returns an event object which can be used to query the execution status of the read command. When the read command has completed, the contents of
     *                        the buffer that {@code ptr} points to can be used by the application.</p>
     * @param origin          defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                        {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                        is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                        {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                        {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region          defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
     *                        the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                        {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
     *                        {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param row_pitch       the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code row_pitch} is set
     *                        to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
     * @param slice_pitch     the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being read. This must be 0 if {@code image}
     *                        is a 1D or 2D image. This value must be greater than or equal to {@code row_pitch * height}. If {@code slice_pitch} is set to 0, the appropriate
     *                        slice pitch is calculated based on the {@code row_pitch * height}.
     * @param ptr             the pointer to a buffer in host memory where image data is to be read to
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being read specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
     *         {@code NULL} value.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
     *         {@code origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the read operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") DoubleBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadImage(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueWriteImage ] ---

    /**
     * Unsafe version of: {@link #clEnqueueWriteImage EnqueueWriteImage}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueWriteImage(long command_queue, long image, int blocking_write, long origin, long region, long input_row_pitch, long input_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueWriteImage;
        if (CHECKS) {
            check(command_queue);
            check(image);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_write, origin, region, input_row_pitch, input_slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to write to an image or image array object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteImage} to update the latest bits in a region of the image with the {@code ptr} argument value set to
     * {@code host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)}, where {@code host_ptr} is a pointer
     * to the memory region specified when the image being written is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order
     * to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>The host memory region being written contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The input_row_pitch and input_slice_pitch argument values in clEnqueueWriteImage must be set to the image row pitch and slice pitch.</li>
     * <li>The image object is not mapped.</li>
     * <li>The image object is not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue     the command-queue in which the write command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
     * @param image             a valid image or image array object
     * @param blocking_write    indicates if the read operation is blocking or non-blocking.
     *                          
     *                          <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write command in the
     *                          command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteImage} call returns.</p>
     *                          
     *                          <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
     *                          the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                          {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                          completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param origin            defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                          {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                          is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                          {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                          {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region            defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
     *                          the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                          {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
     *                          {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param input_row_pitch   the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code input_row_pitch} is set
     *                          to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
     * @param input_slice_pitch the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being written. This must be 0 if {@code image}
     *                          is a 1D or 2D image. This value must be greater than or equal to {@code input_row_pitch * height}. If {@code input_slice_pitch} is set to 0, the appropriate
     *                          slice pitch is calculated based on the {@code input_row_pitch * height}.
     * @param ptr               the pointer to a buffer in host memory where image data is to be written from
     * @param event_wait_list   a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                          does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                          {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event             Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                          {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                          complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                          {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
     *         {@code NULL} value.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
     *         {@code origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") ByteBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteImage(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write to an image or image array object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteImage} to update the latest bits in a region of the image with the {@code ptr} argument value set to
     * {@code host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)}, where {@code host_ptr} is a pointer
     * to the memory region specified when the image being written is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order
     * to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>The host memory region being written contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The input_row_pitch and input_slice_pitch argument values in clEnqueueWriteImage must be set to the image row pitch and slice pitch.</li>
     * <li>The image object is not mapped.</li>
     * <li>The image object is not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue     the command-queue in which the write command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
     * @param image             a valid image or image array object
     * @param blocking_write    indicates if the read operation is blocking or non-blocking.
     *                          
     *                          <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write command in the
     *                          command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteImage} call returns.</p>
     *                          
     *                          <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
     *                          the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                          {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                          completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param origin            defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                          {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                          is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                          {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                          {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region            defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
     *                          the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                          {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
     *                          {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param input_row_pitch   the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code input_row_pitch} is set
     *                          to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
     * @param input_slice_pitch the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being written. This must be 0 if {@code image}
     *                          is a 1D or 2D image. This value must be greater than or equal to {@code input_row_pitch * height}. If {@code input_slice_pitch} is set to 0, the appropriate
     *                          slice pitch is calculated based on the {@code input_row_pitch * height}.
     * @param ptr               the pointer to a buffer in host memory where image data is to be written from
     * @param event_wait_list   a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                          does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                          {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event             Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                          {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                          complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                          {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
     *         {@code NULL} value.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
     *         {@code origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") ShortBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteImage(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write to an image or image array object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteImage} to update the latest bits in a region of the image with the {@code ptr} argument value set to
     * {@code host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)}, where {@code host_ptr} is a pointer
     * to the memory region specified when the image being written is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order
     * to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>The host memory region being written contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The input_row_pitch and input_slice_pitch argument values in clEnqueueWriteImage must be set to the image row pitch and slice pitch.</li>
     * <li>The image object is not mapped.</li>
     * <li>The image object is not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue     the command-queue in which the write command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
     * @param image             a valid image or image array object
     * @param blocking_write    indicates if the read operation is blocking or non-blocking.
     *                          
     *                          <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write command in the
     *                          command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteImage} call returns.</p>
     *                          
     *                          <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
     *                          the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                          {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                          completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param origin            defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                          {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                          is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                          {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                          {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region            defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
     *                          the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                          {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
     *                          {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param input_row_pitch   the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code input_row_pitch} is set
     *                          to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
     * @param input_slice_pitch the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being written. This must be 0 if {@code image}
     *                          is a 1D or 2D image. This value must be greater than or equal to {@code input_row_pitch * height}. If {@code input_slice_pitch} is set to 0, the appropriate
     *                          slice pitch is calculated based on the {@code input_row_pitch * height}.
     * @param ptr               the pointer to a buffer in host memory where image data is to be written from
     * @param event_wait_list   a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                          does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                          {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event             Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                          {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                          complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                          {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
     *         {@code NULL} value.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
     *         {@code origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") IntBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteImage(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write to an image or image array object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteImage} to update the latest bits in a region of the image with the {@code ptr} argument value set to
     * {@code host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)}, where {@code host_ptr} is a pointer
     * to the memory region specified when the image being written is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order
     * to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>The host memory region being written contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The input_row_pitch and input_slice_pitch argument values in clEnqueueWriteImage must be set to the image row pitch and slice pitch.</li>
     * <li>The image object is not mapped.</li>
     * <li>The image object is not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue     the command-queue in which the write command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
     * @param image             a valid image or image array object
     * @param blocking_write    indicates if the read operation is blocking or non-blocking.
     *                          
     *                          <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write command in the
     *                          command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteImage} call returns.</p>
     *                          
     *                          <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
     *                          the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                          {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                          completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param origin            defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                          {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                          is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                          {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                          {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region            defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
     *                          the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                          {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
     *                          {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param input_row_pitch   the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code input_row_pitch} is set
     *                          to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
     * @param input_slice_pitch the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being written. This must be 0 if {@code image}
     *                          is a 1D or 2D image. This value must be greater than or equal to {@code input_row_pitch * height}. If {@code input_slice_pitch} is set to 0, the appropriate
     *                          slice pitch is calculated based on the {@code input_row_pitch * height}.
     * @param ptr               the pointer to a buffer in host memory where image data is to be written from
     * @param event_wait_list   a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                          does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                          {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event             Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                          {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                          complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                          {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
     *         {@code NULL} value.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
     *         {@code origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") FloatBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteImage(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to write to an image or image array object from host memory.
     * 
     * <p>Calling {@code clEnqueueWriteImage} to update the latest bits in a region of the image with the {@code ptr} argument value set to
     * {@code host_ptr + (origin[2] * image slice pitch + origin[1] * image row pitch + origin[0] * bytes per pixel)}, where {@code host_ptr} is a pointer
     * to the memory region specified when the image being written is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR}, must meet the following requirements in order
     * to avoid undefined behavior:</p>
     * 
     * <ul>
     * <li>The host memory region being written contains the latest bits when the enqueued write command begins execution.</li>
     * <li>The input_row_pitch and input_slice_pitch argument values in clEnqueueWriteImage must be set to the image row pitch and slice pitch.</li>
     * <li>The image object is not mapped.</li>
     * <li>The image object is not used by any command-queue until the write command has finished execution.</li>
     * </ul>
     *
     * @param command_queue     the command-queue in which the write command will be queued. {@code command_queue} and {@code image} must be created with the same OpenCL context.
     * @param image             a valid image or image array object
     * @param blocking_write    indicates if the read operation is blocking or non-blocking.
     *                          
     *                          <p>If {@code blocking_write} is {@link #CL_TRUE TRUE}, the OpenCL implementation copies the data referred to by {@code ptr} and enqueues the write command in the
     *                          command-queue. The memory pointed to by {@code ptr} can be reused by the application after the {@code clEnqueueWriteImage} call returns.</p>
     *                          
     *                          <p>If {@code blocking_write} is {@link #CL_FALSE FALSE}, the OpenCL implementation will use {@code ptr} to perform a non-blocking write. As the write is non-blocking
     *                          the implementation can return immediately. The memory pointed to by {@code ptr} cannot be reused by the application after the call returns. The
     *                          {@code event} argument returns an event object which can be used to query the execution status of the write command. When the write command has
     *                          completed, the memory pointed to by {@code ptr} can then be reused by the application.</p>
     * @param origin            defines the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                          {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                          is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                          {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                          {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region            defines the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and
     *                          the number of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                          {@code image} is a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and
     *                          {@code region[2]} must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param input_row_pitch   the length of each row in bytes. This value must be greater than or equal to the {@code element size in bytes * width}. If {@code input_row_pitch} is set
     *                          to 0, the appropriate row pitch is calculated based on the size of each element in bytes multiplied by {@code width}.
     * @param input_slice_pitch the size in bytes of the 2D slice of the 3D region of a 3D image or each image of a 1D or 2D image array being written. This must be 0 if {@code image}
     *                          is a 1D or 2D image. This value must be greater than or equal to {@code input_row_pitch * height}. If {@code input_slice_pitch} is set to 0, the appropriate
     *                          slice pitch is calculated based on the {@code input_row_pitch * height}.
     * @param ptr               the pointer to a buffer in host memory where image data is to be written from
     * @param event_wait_list   a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                          does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                          {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event             Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                          {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                          complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                          {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and {@code image} are not the same or if the context associated
     *         with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the region being written specified by {@code origin} and {@code region} is out of bounds or if {@code ptr} is a
     *         {@code NULL} value.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for
     *         {@code origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueReadImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code clEnqueueWriteImage} is called on image which has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the write operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") DoubleBuffer ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteImage(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueCopyImage ] ---

    /**
     * Unsafe version of: {@link #clEnqueueCopyImage EnqueueCopyImage}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueCopyImage(long command_queue, long src_image, long dst_image, long src_origin, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCopyImage;
        if (CHECKS) {
            check(command_queue);
            check(src_image);
            check(dst_image);
        }
        return callPPPPPPPPI(command_queue, src_image, dst_image, src_origin, dst_origin, region, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to copy image objects. {@code src_image} and {@code dst_image} can be 1D, 2D, 3D image or a 1D, 2D image array objects allowing us to
     * perform the following actions:
     * 
     * <ul>
     * <li>Copy a 1D image object to a 1D image object.</li>
     * <li>Copy a 1D image object to a scanline of a 2D image object and vice-versa.</li>
     * <li>Copy a 1D image object to a scanline of a 2D slice of a 3D image object and vice-versa.</li>
     * <li>Copy a 1D image object to a scanline of a specific image index of a 1D or 2D image array object and vice-versa.</li>
     * <li>Copy a 2D image object to a 2D image object.</li>
     * <li>Copy a 2D image object to a 2D slice of a 3D image object and vice-versa.</li>
     * <li>Copy a 2D image object to a specific image index of a 2D image array object and vice-versa.</li>
     * <li>Copy images from a 1D image array object to a 1D image array object.</li>
     * <li>Copy images from a 2D image array object to a 2D image array object.</li>
     * <li>Copy a 3D image object to a 3D image object.</li>
     * </ul>
     *
     * @param command_queue   the command-queue in which the copy command will be queued. The OpenCL context associated with {@code command_queue}, {@code src_image} and
     *                        {@code dst_image} must be the same.
     * @param src_origin      the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                        {@code (x)} offset and the image index in the 1D image array. If {@code src_image} is a 2D image object, {@code src_origin[2]} must be 0. If
     *                        {@code src_image} is a 1D image object, {@code src_origin[1]} and {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object,
     *                        {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object, {@code src_origin[1]} describes the image index in the 1D image
     *                        array. If {@code src_image} is a 2D image array object, {@code src_origin[2]} describes the image index in the 2D image array.
     * @param dst_origin      the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                        {@code (x)} offset and the image index in the 1D image array. If {@code dst_image} is a 2D image object, {@code dst_origin[2]} must be 0. If
     *                        {@code dst_image} is a 1D image or 1D image buffer object, {@code dst_origin[1]} and {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D
     *                        image array object, {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D image array object, {@code dst_origin[1]} describes the image
     *                        index in the 1D image array. If {@code dst_image} is a 2D image array object, {@code dst_origin[2]} describes the image index in the 2D image array.
     * @param region          the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
     *                        of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                        {@code src_image} or {@code dst_image} is a 2D image object, {@code region[2]} must be 1. If {@code src_image} or {@code dst_image} is a 1D image or
     *                        1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If {@code src_image} or {@code dst_image} is a 1D image array object,
     *                        {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_image} and {@code dst_image} are not the same or if the
     *         context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code src_image} and {@code dst_image} are not valid image objects.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_MISMATCH IMAGE_FORMAT_MISMATCH} if {@code src_image} and {@code dst_image} do not use the same image format.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the 2D or 3D rectangular region specified by {@code src_origin} and {@code src_origin + region} refers to a region
     *         outside {@code src_image}, or if the 2D or 3D rectangular region specified by {@code dst_origin} and {@code dst_origin + region} refers to a region
     *         outside {@code dst_image}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code src_origin}, {@code dst_origin} and {@code region} do not follow rules described in the argument
     *         description for {@code src_origin}, {@code dst_origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code src_image} or
     *         {@code dst_image} are not supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code src_image} or {@code dst_image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_image} or {@code dst_image}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_MEM_COPY_OVERLAP MEM_COPY_OVERLAP} if {@code src_image} and {@code dst_image} are the same image object and the source and destination regions overlap.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueCopyImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueCopyImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_image, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueCopyImage(command_queue, src_image, dst_image, memAddress(src_origin), memAddress(dst_origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueCopyImageToBuffer ] ---

    /**
     * Unsafe version of: {@link #clEnqueueCopyImageToBuffer EnqueueCopyImageToBuffer}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueCopyImageToBuffer(long command_queue, long src_image, long dst_buffer, long src_origin, long region, long dst_offset, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCopyImageToBuffer;
        if (CHECKS) {
            check(command_queue);
            check(src_image);
            check(dst_buffer);
        }
        return callPPPPPPPPI(command_queue, src_image, dst_buffer, src_origin, region, dst_offset, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to copy an image object to a buffer object.
     *
     * @param command_queue   a valid command-queue. The OpenCL context associated with {@code command_queue}, {@code src_image} and {@code dst_buffer} must be the same.
     * @param src_image       a valid image object
     * @param dst_buffer      a valid buffer object
     * @param src_origin      the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                        {@code (x)} offset and the image index in the 1D image array. If {@code src_image} is a 2D image object, {@code src_origin[2]} must be 0. If
     *                        {@code src_image} is a 1D image object, {@code src_origin[1]} and {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object,
     *                        {@code src_origin[2]} must be 0. If {@code src_image} is a 1D image array object, {@code src_origin[1]} describes the image index in the 1D image
     *                        array. If {@code src_image} is a 2D image array object, {@code src_origin[2]} describes the image index in the 2D image array.
     * @param region          the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
     *                        of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                        {@code src_image} is a 2D image object, {@code region[2]} must be 1. If {@code src_image} is a 1D image or 1D image buffer object, {@code region[1]}
     *                        and {@code region[2]} must be 1. If {@code src_image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot
     *                        be 0.
     * @param dst_offset      the offset where to begin copying data into {@code dst_buffer}. The size in bytes of the region to be copied referred to as {@code dst_cb} is
     *                        computed as {@code width * height * depth * bytes/image element} if {@code src_image} is a 3D image object, is computed as
     *                        {@code width * height * bytes/image element} if {@code src_image} is a 2D image, is computed as
     *                        {@code width * height * arraysize * bytes/image element} if {@code src_image} is a 2D image array object, is computed as
     *                        {@code width * bytes/image element} if {@code src_image} is a 1D image or 1D image buffer object and is computed as
     *                        {@code width * arraysize * bytes/image element} if {@code src_image} is a 1D image array object.
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_image} and {@code dst_buffer} are not the same or if
     *         the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code src_image} is not a valid image object or {@code dst_buffer} is not a valid buffer object or if
     *         {@code src_image} is a 1D image buffer object created from {@code dst_buffer}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the 1D, 2D or 3D rectangular region specified by {@code src_origin} and {@code src_origin + region} refers to a region
     *         outside {@code src_image}, or if the region specified by {@code dst_offset} and {@code dst_offset + dst_cb} to a region outside {@code dst_buffer}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code src_origin} and region do not follow rules described in the argument description for
     *         {@code src_origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code dst_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code src_image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code src_image} are not supported by device
     *         associated with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_image} or {@code dst_buffer}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueCopyImageToBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueCopyImageToBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long dst_offset, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(src_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueCopyImageToBuffer(command_queue, src_image, dst_buffer, memAddress(src_origin), memAddress(region), dst_offset, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueCopyBufferToImage ] ---

    /**
     * Unsafe version of: {@link #clEnqueueCopyBufferToImage EnqueueCopyBufferToImage}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueCopyBufferToImage(long command_queue, long src_buffer, long dst_image, long src_offset, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCopyBufferToImage;
        if (CHECKS) {
            check(command_queue);
            check(src_buffer);
            check(dst_image);
        }
        return callPPPPPPPPI(command_queue, src_buffer, dst_image, src_offset, dst_origin, region, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to copy a buffer object to an image object.
     *
     * @param command_queue   a valid command-queue. The OpenCL context associated with {@code command_queue}, {@code src_buffer} and {@code dst_image} must be the same.
     * @param src_buffer      a valid buffer object
     * @param dst_image       a valid image object
     * @param src_offset      the offset where to begin copying data from {@code src_buffer}
     * @param dst_origin      the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                        {@code (x)} offset and the image index in the 1D image array. If {@code dst_image} is a 2D image object, {@code dst_origin[2]} must be 0. If
     *                        {@code dst_image} is a 1D image or 1D image buffer object, {@code dst_origin[1]} and {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D
     *                        image array object, {@code dst_origin[2]} must be 0. If {@code dst_image} is a 1D image array object, {@code dst_origin[1]} describes the image
     *                        index in the 1D image array. If {@code dst_image} is a 2D image array object, {@code dst_origin[2]} describes the image index in the 2D image array.
     * @param region          the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
     *                        of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If
     *                        {@code dst_image} is a 2D image object, {@code region[2]} must be 1. If {@code dst_image} is a 1D image or
     *                        1D image buffer object, {@code region[1]} and {@code region[2]} must be 1. If {@code dst_image} is a 1D image array object,
     *                        {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue}, {@code src_buffer} and {@code dst_image} are not the same or if
     *         the context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code src_buffer} is not a valid buffer object or {@code dst_image} is not a valid image object or if
     *         {@code dst_image} is a 1D image buffer object created from {@code src_buffer}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if the 1D, 2D or 3D rectangular region specified by {@code dst_origin} and {@code dst_origin + region} refer to a region
     *         outside {@code dst_image}, or if the region specified by {@code src_offset} and {@code src_offset + src_cb refer} to a region outside
     *         {@code src_buffer}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code dst_origin} and {@code region} do not follow rules described in the argument description for
     *         {@code dst_origin} and {@code region}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if {@code src_buffer} is a sub-buffer object and offset specified when the sub-buffer object is created is
     *         not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code dst_image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code dst_image} are not supported by device
     *         associated with queue.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code src_buffer} or {@code dst_image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueCopyBufferToImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueCopyBufferToImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_image, @NativeType("size_t") long src_offset, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueCopyBufferToImage(command_queue, src_buffer, dst_image, src_offset, memAddress(dst_origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMapImage ] ---

    /**
     * Unsafe version of: {@link #clEnqueueMapImage EnqueueMapImage}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static long nclEnqueueMapImage(long command_queue, long image, int blocking_map, long map_flags, long origin, long region, long image_row_pitch, long image_slice_pitch, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret) {
        long __functionAddress = CL.getICD().clEnqueueMapImage;
        if (CHECKS) {
            check(command_queue);
            check(image);
        }
        return callPPJPPPPPPPP(command_queue, image, blocking_map, map_flags, origin, region, image_row_pitch, image_slice_pitch, num_events_in_wait_list, event_wait_list, event, errcode_ret, __functionAddress);
    }

    /**
     * Enqueues a command to map a region in the image object given by {@code image} into the host address space and returns a pointer to this mapped region.
     * 
     * <p>The pointer returned maps a 1D, 2D or 3D region starting at {@code origin} and is at least {@code region[0]} pixels in size for a 1D image, 1D image
     * buffer or 1D image array, {@code (image_row_pitch * region[1])} pixels in size for a 2D image or 2D image array, and
     * {@code (image_slice_pitch * region[2])} pixels in size for a 3D image. The result of a memory access outside this region is undefined.</p>
     * 
     * <p>If the image object is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in {@code mem_flags}, the following will be true:</p>
     * 
     * <ul>
     * <li>The {@code host_ptr} specified in {@link CL12#clCreateImage CreateImage} is guaranteed to contain the latest bits in the region being mapped when the
     * {@code clEnqueueMapImage} command has completed.</li>
     * <li>The pointer value returned by {@code clEnqueueMapImage} will be derived from the {@code host_ptr} specified when the image object is created.</li>
     * </ul>
     * 
     * <p>Mapped image objects are unmapped using {@link #clEnqueueUnmapMemObject EnqueueUnmapMemObject}.</p>
     *
     * @param command_queue     a valid command-queue
     * @param image             a valid image object. The OpenCL context associated with {@code command_queue} and {@code image} must be the same.
     * @param blocking_map      indicates if the map operation is blocking or non-blocking.
     *                          
     *                          <p>If {@code blocking_map} is {@link #CL_TRUE TRUE}, {@code clEnqueueMapImage} does not return until the specified region in image is mapped into the host address
     *                          space and the application can access the contents of the mapped region using the pointer returned by {@code clEnqueueMapImage}.</p>
     *                          
     *                          <p>If {@code blocking_map} is {@link #CL_FALSE FALSE} i.e. map operation is non-blocking, the pointer to the mapped region returned by {@code clEnqueueMapImage}
     *                          cannot be used until the map command has completed. The {@code event} argument returns an event object which can be used to query the execution
     *                          status of the map command. When the map command is completed, the application can access the contents of the mapped region using the pointer
     *                          returned by {@code clEnqueueMapImage}.</p>
     * @param map_flags         a bit-field. One of:<br><table><tr><td>{@link #CL_MAP_READ MAP_READ}</td><td>{@link #CL_MAP_WRITE MAP_WRITE}</td><td>{@link CL12#CL_MAP_WRITE_INVALIDATE_REGION MAP_WRITE_INVALIDATE_REGION}</td></tr></table>
     * @param origin            the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                          {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                          is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                          {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                          {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region            the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
     *                          of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If {@code image} is
     *                          a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and {@code region[2]}
     *                          must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param image_row_pitch   the scan-line pitch in bytes for the mapped region. This must be a non-{@code NULL} value.
     * @param image_slice_pitch returns the size in bytes of each 2D slice of a 3D image or the size of each 1D or 2D image in a 1D or 2D image array for the mapped region. For a
     *                          1D and 2D image, zero is returned if this argument is not {@code NULL}. For a 3D image, 1D and 2D image array, {@code image_slice_pitch} must be a non-{@code NULL}
     *                          value.
     * @param event_wait_list   a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                          does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                          {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event             Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                          {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                          complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                          {@code event_wait_list} array.
     * @param errcode_ret       will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a pointer to the mapped region. The {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS}. A {@code NULL} pointer is returned otherwise with one of the following error values
     *         returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and image are not the same or if context associated with
     *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if region being mapped given by {@code (origin, origin+region)} is out of bounds or if values specified in
     *         {@code map_flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for {@code origin}
     *         and {@code region}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code image_row_pitch} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code image} is a 3D image, 1D or 2D image array object and {@code image_slice_pitch} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MAP_FAILURE MAP_FAILURE} if there is a failure to map the requested region into the host address space. This error cannot occur for image objects
     *         created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the map operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code image} has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and
     *         {@link #CL_MAP_READ MAP_READ} is set in {@code map_flags} or if image has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and {@link #CL_MAP_WRITE MAP_WRITE} or {@link CL12#CL_MAP_WRITE_INVALIDATE_REGION MAP_WRITE_INVALIDATE_REGION} is set in {@code map_flags}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueMapImage.html">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clEnqueueMapImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t *") PointerBuffer image_row_pitch, @Nullable @NativeType("size_t *") PointerBuffer image_slice_pitch, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret, @Nullable ByteBuffer old_buffer) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            check(image_row_pitch, 1);
            checkSafe(image_slice_pitch, 1);
            checkSafe(event, 1);
            checkSafe(errcode_ret, 1);
        }
        long __result = nclEnqueueMapImage(command_queue, image, blocking_map ? 1 : 0, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret));
        int length = (int)getMemObjectInfoPointer(image, CL_MEM_SIZE);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /**
     * Enqueues a command to map a region in the image object given by {@code image} into the host address space and returns a pointer to this mapped region.
     * 
     * <p>The pointer returned maps a 1D, 2D or 3D region starting at {@code origin} and is at least {@code region[0]} pixels in size for a 1D image, 1D image
     * buffer or 1D image array, {@code (image_row_pitch * region[1])} pixels in size for a 2D image or 2D image array, and
     * {@code (image_slice_pitch * region[2])} pixels in size for a 3D image. The result of a memory access outside this region is undefined.</p>
     * 
     * <p>If the image object is created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} set in {@code mem_flags}, the following will be true:</p>
     * 
     * <ul>
     * <li>The {@code host_ptr} specified in {@link CL12#clCreateImage CreateImage} is guaranteed to contain the latest bits in the region being mapped when the
     * {@code clEnqueueMapImage} command has completed.</li>
     * <li>The pointer value returned by {@code clEnqueueMapImage} will be derived from the {@code host_ptr} specified when the image object is created.</li>
     * </ul>
     * 
     * <p>Mapped image objects are unmapped using {@link #clEnqueueUnmapMemObject EnqueueUnmapMemObject}.</p>
     *
     * @param command_queue     a valid command-queue
     * @param image             a valid image object. The OpenCL context associated with {@code command_queue} and {@code image} must be the same.
     * @param blocking_map      indicates if the map operation is blocking or non-blocking.
     *                          
     *                          <p>If {@code blocking_map} is {@link #CL_TRUE TRUE}, {@code clEnqueueMapImage} does not return until the specified region in image is mapped into the host address
     *                          space and the application can access the contents of the mapped region using the pointer returned by {@code clEnqueueMapImage}.</p>
     *                          
     *                          <p>If {@code blocking_map} is {@link #CL_FALSE FALSE} i.e. map operation is non-blocking, the pointer to the mapped region returned by {@code clEnqueueMapImage}
     *                          cannot be used until the map command has completed. The {@code event} argument returns an event object which can be used to query the execution
     *                          status of the map command. When the map command is completed, the application can access the contents of the mapped region using the pointer
     *                          returned by {@code clEnqueueMapImage}.</p>
     * @param map_flags         a bit-field. One of:<br><table><tr><td>{@link #CL_MAP_READ MAP_READ}</td><td>{@link #CL_MAP_WRITE MAP_WRITE}</td><td>{@link CL12#CL_MAP_WRITE_INVALIDATE_REGION MAP_WRITE_INVALIDATE_REGION}</td></tr></table>
     * @param origin            the {@code (x, y, z)} offset in pixels in the 1D, 2D or 3D image, the {@code (x, y)} offset and the image index in the 2D image array or the
     *                          {@code (x)} offset and the image index in the 1D image array. If {@code image} is a 2D image object, {@code origin[2]} must be 0. If {@code image}
     *                          is a 1D image or 1D image buffer object, {@code origin[1]} and {@code origin[2]} must be 0. If {@code image} is a 1D image array object,
     *                          {@code origin[2]} must be 0. If {@code image} is a 1D image array object, {@code origin[1]} describes the image index in the 1D image array. If
     *                          {@code image} is a 2D image array object, {@code origin[2]} describes the image index in the 2D image array.
     * @param region            the {@code (width, height, depth)} in pixels of the 1D, 2D or 3D rectangle, the {@code (width, height)} in pixels of the 2D rectangle and the number
     *                          of images of a 2D image array or the {@code (width)} in pixels of the 1D rectangle and the number of images of a 1D image array. If {@code image} is
     *                          a 2D image object, {@code region[2]} must be 1. If {@code image} is a 1D image or 1D image buffer object, {@code region[1]} and {@code region[2]}
     *                          must be 1. If {@code image} is a 1D image array object, {@code region[2]} must be 1. The values in {@code region} cannot be 0.
     * @param image_row_pitch   the scan-line pitch in bytes for the mapped region. This must be a non-{@code NULL} value.
     * @param image_slice_pitch returns the size in bytes of each 2D slice of a 3D image or the size of each 1D or 2D image in a 1D or 2D image array for the mapped region. For a
     *                          1D and 2D image, zero is returned if this argument is not {@code NULL}. For a 3D image, 1D and 2D image array, {@code image_slice_pitch} must be a non-{@code NULL}
     *                          value.
     * @param event_wait_list   a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                          does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                          {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event             Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                          {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                          complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                          {@code event_wait_list} array.
     * @param errcode_ret       will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a pointer to the mapped region. The {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS}. A {@code NULL} pointer is returned otherwise with one of the following error values
     *         returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and image are not the same or if context associated with
     *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is not a valid image object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if region being mapped given by {@code (origin, origin+region)} is out of bounds or if values specified in
     *         {@code map_flags} are not valid.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if values in {@code origin} and {@code region} do not follow rules described in the argument description for {@code origin}
     *         and {@code region}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code image_row_pitch} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code image} is a 3D image, 1D or 2D image array object and {@code image_slice_pitch} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if image dimensions (image width, height, specified or compute row and/or slice pitch) for {@code image} are not
     *         supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if image format (image channel order and data type) for {@code image} are not supported by device associated
     *         with queue.</li>
     *         <li>{@link #CL_MAP_FAILURE MAP_FAILURE} if there is a failure to map the requested region into the host address space. This error cannot occur for image objects
     *         created with {@link #CL_MEM_USE_HOST_PTR MEM_USE_HOST_PTR} or {@link #CL_MEM_ALLOC_HOST_PTR MEM_ALLOC_HOST_PTR}.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the map operation is blocking and the execution status of any of the events in
     *         {@code event_wait_list} is a negative integer value.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with {@code image}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} does not support images (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if {@code image} has been created with {@link CL12#CL_MEM_HOST_WRITE_ONLY MEM_HOST_WRITE_ONLY} or {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and
     *         {@link #CL_MAP_READ MAP_READ} is set in {@code map_flags} or if image has been created with {@link CL12#CL_MEM_HOST_READ_ONLY MEM_HOST_READ_ONLY} or
     *         {@link CL12#CL_MEM_HOST_NO_ACCESS MEM_HOST_NO_ACCESS} and {@link #CL_MAP_WRITE MAP_WRITE} or {@link CL12#CL_MAP_WRITE_INVALIDATE_REGION MAP_WRITE_INVALIDATE_REGION} is set in {@code map_flags}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueMapImage.html">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clEnqueueMapImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t *") PointerBuffer image_row_pitch, @Nullable @NativeType("size_t *") PointerBuffer image_slice_pitch, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret, long length, @Nullable ByteBuffer old_buffer) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            check(image_row_pitch, 1);
            checkSafe(image_slice_pitch, 1);
            checkSafe(event, 1);
            checkSafe(errcode_ret, 1);
        }
        long __result = nclEnqueueMapImage(command_queue, image, blocking_map ? 1 : 0, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret));
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    // --- [ clGetImageInfo ] ---

    /**
     * Unsafe version of: {@link #clGetImageInfo GetImageInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetImageInfo(long image, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetImageInfo;
        if (CHECKS) {
            check(image);
        }
        return callPPPPI(image, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns information specific to an image object.
     *
     * @param image                the image object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_IMAGE_FORMAT IMAGE_FORMAT}</td><td>{@link #CL_IMAGE_ELEMENT_SIZE IMAGE_ELEMENT_SIZE}</td><td>{@link #CL_IMAGE_ROW_PITCH IMAGE_ROW_PITCH}</td><td>{@link #CL_IMAGE_SLICE_PITCH IMAGE_SLICE_PITCH}</td><td>{@link #CL_IMAGE_WIDTH IMAGE_WIDTH}</td></tr><tr><td>{@link #CL_IMAGE_HEIGHT IMAGE_HEIGHT}</td><td>{@link #CL_IMAGE_DEPTH IMAGE_DEPTH}</td><td>{@link CL12#CL_IMAGE_ARRAY_SIZE IMAGE_ARRAY_SIZE}</td><td>{@link CL12#CL_IMAGE_BUFFER IMAGE_BUFFER}</td><td>{@link CL12#CL_IMAGE_NUM_MIP_LEVELS IMAGE_NUM_MIP_LEVELS}</td></tr><tr><td>{@link CL12#CL_IMAGE_NUM_SAMPLES IMAGE_NUM_SAMPLES}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is a not a valid image object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetImageInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetImageInfo(@NativeType("cl_mem") long image, @NativeType("cl_image_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageInfo(image, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information specific to an image object.
     *
     * @param image                the image object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_IMAGE_FORMAT IMAGE_FORMAT}</td><td>{@link #CL_IMAGE_ELEMENT_SIZE IMAGE_ELEMENT_SIZE}</td><td>{@link #CL_IMAGE_ROW_PITCH IMAGE_ROW_PITCH}</td><td>{@link #CL_IMAGE_SLICE_PITCH IMAGE_SLICE_PITCH}</td><td>{@link #CL_IMAGE_WIDTH IMAGE_WIDTH}</td></tr><tr><td>{@link #CL_IMAGE_HEIGHT IMAGE_HEIGHT}</td><td>{@link #CL_IMAGE_DEPTH IMAGE_DEPTH}</td><td>{@link CL12#CL_IMAGE_ARRAY_SIZE IMAGE_ARRAY_SIZE}</td><td>{@link CL12#CL_IMAGE_BUFFER IMAGE_BUFFER}</td><td>{@link CL12#CL_IMAGE_NUM_MIP_LEVELS IMAGE_NUM_MIP_LEVELS}</td></tr><tr><td>{@link CL12#CL_IMAGE_NUM_SAMPLES IMAGE_NUM_SAMPLES}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is a not a valid image object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetImageInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetImageInfo(@NativeType("cl_mem") long image, @NativeType("cl_image_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageInfo(image, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information specific to an image object.
     *
     * @param image                the image object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_IMAGE_FORMAT IMAGE_FORMAT}</td><td>{@link #CL_IMAGE_ELEMENT_SIZE IMAGE_ELEMENT_SIZE}</td><td>{@link #CL_IMAGE_ROW_PITCH IMAGE_ROW_PITCH}</td><td>{@link #CL_IMAGE_SLICE_PITCH IMAGE_SLICE_PITCH}</td><td>{@link #CL_IMAGE_WIDTH IMAGE_WIDTH}</td></tr><tr><td>{@link #CL_IMAGE_HEIGHT IMAGE_HEIGHT}</td><td>{@link #CL_IMAGE_DEPTH IMAGE_DEPTH}</td><td>{@link CL12#CL_IMAGE_ARRAY_SIZE IMAGE_ARRAY_SIZE}</td><td>{@link CL12#CL_IMAGE_BUFFER IMAGE_BUFFER}</td><td>{@link CL12#CL_IMAGE_NUM_MIP_LEVELS IMAGE_NUM_MIP_LEVELS}</td></tr><tr><td>{@link CL12#CL_IMAGE_NUM_SAMPLES IMAGE_NUM_SAMPLES}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code image} is a not a valid image object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetImageInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetImageInfo(@NativeType("cl_mem") long image, @NativeType("cl_image_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageInfo(image, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clRetainMemObject ] ---

    /**
     * Increments the {@code memobj} reference count.
     * 
     * <p>{@link #clCreateBuffer CreateBuffer}, {@link CL11#clCreateSubBuffer CreateSubBuffer} and {@link CL12#clCreateImage CreateImage} perform an implicit retain.</p>
     *
     * @param memobj the memory object to retain
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is not a valid memory object (buffer or image object).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clRetainMemObject.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clRetainMemObject(@NativeType("cl_mem") long memobj) {
        long __functionAddress = CL.getICD().clRetainMemObject;
        if (CHECKS) {
            check(memobj);
        }
        return callPI(memobj, __functionAddress);
    }

    // --- [ clReleaseMemObject ] ---

    /**
     * Decrements the {@code memobj} reference count.
     * 
     * <p>After the {@code memobj} reference count becomes zero and commands queued for execution on a command-queue(s) that use {@code memobj} have finished, the
     * memory object is deleted. If {@code memobj} is a buffer object, {@code memobj} cannot be deleted until all sub-buffer objects associated with
     * {@code memobj} are deleted.</p>
     *
     * @param memobj the memory object to release
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is not a valid memory object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clReleaseMemObject.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clReleaseMemObject(@NativeType("cl_mem") long memobj) {
        long __functionAddress = CL.getICD().clReleaseMemObject;
        if (CHECKS) {
            check(memobj);
        }
        return callPI(memobj, __functionAddress);
    }

    // --- [ clEnqueueUnmapMemObject ] ---

    /**
     * Unsafe version of: {@link #clEnqueueUnmapMemObject EnqueueUnmapMemObject}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueUnmapMemObject(long command_queue, long memobj, long mapped_ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueUnmapMemObject;
        if (CHECKS) {
            check(command_queue);
            check(memobj);
        }
        return callPPPPPI(command_queue, memobj, mapped_ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to unmap a previously mapped region of a memory object. Reads or writes from the host using the pointer returned by
     * {@link #clEnqueueMapBuffer EnqueueMapBuffer} or {@link #clEnqueueMapImage EnqueueMapImage} are considered to be complete.
     * 
     * <p>{@link #clEnqueueMapBuffer EnqueueMapBuffer}, and {@link #clEnqueueMapImage EnqueueMapImage} increments the mapped count of the memory object. The initial mapped count value of the memory object is zero.
     * Multiple calls to {@link #clEnqueueMapBuffer EnqueueMapBuffer}, or {@link #clEnqueueMapImage EnqueueMapImage} on the same memory object will increment this mapped count by appropriate number of calls.
     * {@code clEnqueueUnmapMemObject} decrements the mapped count of the memory object. {@link #clEnqueueMapBuffer EnqueueMapBuffer}, and {@link #clEnqueueMapImage EnqueueMapImage} act as synchronization points
     * for a region of the buffer object being mapped.</p>
     *
     * @param command_queue   a valid command-queue
     * @param memobj          a valid memory object. The OpenCL context associated with {@code command_queue} and {@code memobj} must be the same.
     * @param mapped_ptr      the host address returned by a previous call to {@link #clEnqueueMapBuffer EnqueueMapBuffer}, or {@link #clEnqueueMapImage EnqueueMapImage} for {@code memobj}
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code mapped_ptr} is not a valid pointer returned by {@link #clEnqueueMapBuffer EnqueueMapBuffer}, or {@link #clEnqueueMapImage EnqueueMapImage} for {@code memobj}.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and {@code memobj} are not the same or if the context associated with
     *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueUnmapMemObject.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueUnmapMemObject(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long memobj, @NativeType("void *") ByteBuffer mapped_ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueUnmapMemObject(command_queue, memobj, memAddress(mapped_ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clGetMemObjectInfo ] ---

    /**
     * Unsafe version of: {@link #clGetMemObjectInfo GetMemObjectInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetMemObjectInfo(long memobj, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMemObjectInfo;
        if (CHECKS) {
            check(memobj);
        }
        return callPPPPI(memobj, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns information that is common to all memory objects (buffer and image objects).
     *
     * @param memobj               the memory object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_MEM_TYPE MEM_TYPE}</td><td>{@link #CL_MEM_FLAGS MEM_FLAGS}</td><td>{@link #CL_MEM_SIZE MEM_SIZE}</td><td>{@link #CL_MEM_HOST_PTR MEM_HOST_PTR}</td><td>{@link #CL_MEM_MAP_COUNT MEM_MAP_COUNT}</td><td>{@link #CL_MEM_REFERENCE_COUNT MEM_REFERENCE_COUNT}</td></tr><tr><td>{@link #CL_MEM_CONTEXT MEM_CONTEXT}</td><td>{@link CL11#CL_MEM_ASSOCIATED_MEMOBJECT MEM_ASSOCIATED_MEMOBJECT}</td><td>{@link CL11#CL_MEM_OFFSET MEM_OFFSET}</td><td>{@link CL20#CL_MEM_USES_SVM_POINTER MEM_USES_SVM_POINTER}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is a not a valid memory object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetMemObjectInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemObjectInfo(memobj, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information that is common to all memory objects (buffer and image objects).
     *
     * @param memobj               the memory object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_MEM_TYPE MEM_TYPE}</td><td>{@link #CL_MEM_FLAGS MEM_FLAGS}</td><td>{@link #CL_MEM_SIZE MEM_SIZE}</td><td>{@link #CL_MEM_HOST_PTR MEM_HOST_PTR}</td><td>{@link #CL_MEM_MAP_COUNT MEM_MAP_COUNT}</td><td>{@link #CL_MEM_REFERENCE_COUNT MEM_REFERENCE_COUNT}</td></tr><tr><td>{@link #CL_MEM_CONTEXT MEM_CONTEXT}</td><td>{@link CL11#CL_MEM_ASSOCIATED_MEMOBJECT MEM_ASSOCIATED_MEMOBJECT}</td><td>{@link CL11#CL_MEM_OFFSET MEM_OFFSET}</td><td>{@link CL20#CL_MEM_USES_SVM_POINTER MEM_USES_SVM_POINTER}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is a not a valid memory object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetMemObjectInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemObjectInfo(memobj, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information that is common to all memory objects (buffer and image objects).
     *
     * @param memobj               the memory object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_MEM_TYPE MEM_TYPE}</td><td>{@link #CL_MEM_FLAGS MEM_FLAGS}</td><td>{@link #CL_MEM_SIZE MEM_SIZE}</td><td>{@link #CL_MEM_HOST_PTR MEM_HOST_PTR}</td><td>{@link #CL_MEM_MAP_COUNT MEM_MAP_COUNT}</td><td>{@link #CL_MEM_REFERENCE_COUNT MEM_REFERENCE_COUNT}</td></tr><tr><td>{@link #CL_MEM_CONTEXT MEM_CONTEXT}</td><td>{@link CL11#CL_MEM_ASSOCIATED_MEMOBJECT MEM_ASSOCIATED_MEMOBJECT}</td><td>{@link CL11#CL_MEM_OFFSET MEM_OFFSET}</td><td>{@link CL20#CL_MEM_USES_SVM_POINTER MEM_USES_SVM_POINTER}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is a not a valid memory object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetMemObjectInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @Nullable @NativeType("void *") LongBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemObjectInfo(memobj, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information that is common to all memory objects (buffer and image objects).
     *
     * @param memobj               the memory object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_MEM_TYPE MEM_TYPE}</td><td>{@link #CL_MEM_FLAGS MEM_FLAGS}</td><td>{@link #CL_MEM_SIZE MEM_SIZE}</td><td>{@link #CL_MEM_HOST_PTR MEM_HOST_PTR}</td><td>{@link #CL_MEM_MAP_COUNT MEM_MAP_COUNT}</td><td>{@link #CL_MEM_REFERENCE_COUNT MEM_REFERENCE_COUNT}</td></tr><tr><td>{@link #CL_MEM_CONTEXT MEM_CONTEXT}</td><td>{@link CL11#CL_MEM_ASSOCIATED_MEMOBJECT MEM_ASSOCIATED_MEMOBJECT}</td><td>{@link CL11#CL_MEM_OFFSET MEM_OFFSET}</td><td>{@link CL20#CL_MEM_USES_SVM_POINTER MEM_USES_SVM_POINTER}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if {@code memobj} is a not a valid memory object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetMemObjectInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemObjectInfo(memobj, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateSampler ] ---

    /** Unsafe version of: {@link #clCreateSampler CreateSampler} */
    public static long nclCreateSampler(long context, int normalized_coords, int addressing_mode, int filter_mode, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSampler;
        if (CHECKS) {
            check(context);
        }
        return callPPP(context, normalized_coords, addressing_mode, filter_mode, errcode_ret, __functionAddress);
    }

    /**
     * Creates a sampler object.
     * 
     * <p>A sampler object describes how to sample an image when the image is read in the kernel. The built-in functions to read from an image in a kernel take a
     * sampler as an argument. The sampler arguments to the image read function can be sampler objects created using OpenCL functions and passed as argument
     * values to the kernel or can be samplers declared inside a kernel.</p>
     *
     * @param context           a valid OpenCL context
     * @param normalized_coords determines if the image coordinates specified are normalized or not
     * @param addressing_mode   specifies how out-of-range image coordinates are handled when reading from an image. One of:<br><table><tr><td>{@link #CL_ADDRESS_NONE ADDRESS_NONE}</td><td>{@link #CL_ADDRESS_CLAMP_TO_EDGE ADDRESS_CLAMP_TO_EDGE}</td><td>{@link #CL_ADDRESS_CLAMP ADDRESS_CLAMP}</td><td>{@link #CL_ADDRESS_REPEAT ADDRESS_REPEAT}</td></tr><tr><td>{@link CL11#CL_ADDRESS_MIRRORED_REPEAT ADDRESS_MIRRORED_REPEAT}</td></tr></table>
     * @param filter_mode       the type of filter that must be applied when reading an image. One of:<br><table><tr><td>{@link #CL_FILTER_NEAREST FILTER_NEAREST}</td><td>{@link #CL_FILTER_LINEAR FILTER_LINEAR}</td></tr></table>
     * @param errcode_ret       will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero sampler object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the sampler object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code addressing_mode}, {@code filter_mode} or {@code normalized_coords} or combination of these argument values are
     *         not valid.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if images are not supported by any device associated with {@code context} (i.e. {@link #CL_DEVICE_IMAGE_SUPPORT DEVICE_IMAGE_SUPPORT} is
     *         {@link #CL_FALSE FALSE}).</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.2/docs/man/xhtml/clCreateSampler.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.2</em>
     */
    @NativeType("cl_sampler")
    public static long clCreateSampler(@NativeType("cl_context") long context, @NativeType("cl_bool") boolean normalized_coords, @NativeType("cl_addressing_mode") int addressing_mode, @NativeType("cl_filter_mode") int filter_mode, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateSampler(context, normalized_coords ? 1 : 0, addressing_mode, filter_mode, memAddressSafe(errcode_ret));
    }

    // --- [ clRetainSampler ] ---

    /**
     * Increments the sampler reference count. {@link #clCreateSampler CreateSampler} performs an implicit retain.
     *
     * @param sampler the sample object to retain
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} if sampler is not a valid sampler object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clRetainSampler.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clRetainSampler(@NativeType("cl_sampler") long sampler) {
        long __functionAddress = CL.getICD().clRetainSampler;
        if (CHECKS) {
            check(sampler);
        }
        return callPI(sampler, __functionAddress);
    }

    // --- [ clReleaseSampler ] ---

    /**
     * Decrements the sampler reference count. The sampler object is deleted after the reference count becomes zero and commands queued for execution on a
     * command-queue(s) that use sampler have finished.
     *
     * @param sampler the sample object to release
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} if {@code sampler} is not a valid sampler object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clReleaseSampler.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clReleaseSampler(@NativeType("cl_sampler") long sampler) {
        long __functionAddress = CL.getICD().clReleaseSampler;
        if (CHECKS) {
            check(sampler);
        }
        return callPI(sampler, __functionAddress);
    }

    // --- [ clGetSamplerInfo ] ---

    /**
     * Unsafe version of: {@link #clGetSamplerInfo GetSamplerInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetSamplerInfo(long sampler, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetSamplerInfo;
        if (CHECKS) {
            check(sampler);
        }
        return callPPPPI(sampler, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns information about a sampler object.
     *
     * @param sampler              the sampler being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_SAMPLER_REFERENCE_COUNT SAMPLER_REFERENCE_COUNT}</td><td>{@link #CL_SAMPLER_CONTEXT SAMPLER_CONTEXT}</td><td>{@link #CL_SAMPLER_NORMALIZED_COORDS SAMPLER_NORMALIZED_COORDS}</td><td>{@link #CL_SAMPLER_ADDRESSING_MODE SAMPLER_ADDRESSING_MODE}</td></tr><tr><td>{@link #CL_SAMPLER_FILTER_MODE SAMPLER_FILTER_MODE}</td><td>{@link CL20#CL_SAMPLER_MIP_FILTER_MODE SAMPLER_MIP_FILTER_MODE}</td><td>{@link CL20#CL_SAMPLER_LOD_MIN SAMPLER_LOD_MIN}</td><td>{@link CL20#CL_SAMPLER_LOD_MAX SAMPLER_LOD_MAX}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} if {@code sampler} is a not a valid sampler object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetSamplerInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetSamplerInfo(@NativeType("cl_sampler") long sampler, @NativeType("cl_sampler_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSamplerInfo(sampler, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about a sampler object.
     *
     * @param sampler              the sampler being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_SAMPLER_REFERENCE_COUNT SAMPLER_REFERENCE_COUNT}</td><td>{@link #CL_SAMPLER_CONTEXT SAMPLER_CONTEXT}</td><td>{@link #CL_SAMPLER_NORMALIZED_COORDS SAMPLER_NORMALIZED_COORDS}</td><td>{@link #CL_SAMPLER_ADDRESSING_MODE SAMPLER_ADDRESSING_MODE}</td></tr><tr><td>{@link #CL_SAMPLER_FILTER_MODE SAMPLER_FILTER_MODE}</td><td>{@link CL20#CL_SAMPLER_MIP_FILTER_MODE SAMPLER_MIP_FILTER_MODE}</td><td>{@link CL20#CL_SAMPLER_LOD_MIN SAMPLER_LOD_MIN}</td><td>{@link CL20#CL_SAMPLER_LOD_MAX SAMPLER_LOD_MAX}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} if {@code sampler} is a not a valid sampler object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetSamplerInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetSamplerInfo(@NativeType("cl_sampler") long sampler, @NativeType("cl_sampler_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSamplerInfo(sampler, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about a sampler object.
     *
     * @param sampler              the sampler being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_SAMPLER_REFERENCE_COUNT SAMPLER_REFERENCE_COUNT}</td><td>{@link #CL_SAMPLER_CONTEXT SAMPLER_CONTEXT}</td><td>{@link #CL_SAMPLER_NORMALIZED_COORDS SAMPLER_NORMALIZED_COORDS}</td><td>{@link #CL_SAMPLER_ADDRESSING_MODE SAMPLER_ADDRESSING_MODE}</td></tr><tr><td>{@link #CL_SAMPLER_FILTER_MODE SAMPLER_FILTER_MODE}</td><td>{@link CL20#CL_SAMPLER_MIP_FILTER_MODE SAMPLER_MIP_FILTER_MODE}</td><td>{@link CL20#CL_SAMPLER_LOD_MIN SAMPLER_LOD_MIN}</td><td>{@link CL20#CL_SAMPLER_LOD_MAX SAMPLER_LOD_MAX}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} if {@code sampler} is a not a valid sampler object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetSamplerInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetSamplerInfo(@NativeType("cl_sampler") long sampler, @NativeType("cl_sampler_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSamplerInfo(sampler, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateProgramWithSource ] ---

    /**
     * Unsafe version of: {@link #clCreateProgramWithSource CreateProgramWithSource}
     *
     * @param count the number of elements in the {@code strings} and {@code lengths} arrays
     */
    public static long nclCreateProgramWithSource(long context, int count, long strings, long lengths, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithSource;
        if (CHECKS) {
            check(context);
        }
        return callPPPPP(context, count, strings, lengths, errcode_ret, __functionAddress);
    }

    /**
     * Creates a program object for a context, and loads the source code specified by the text strings in the strings array into the program object. The
     * devices associated with the program object are the devices associated with {@code context}. The source code specified by strings is either an OpenCL C
     * program source, header or implementation-defined source for custom devices that support an online compiler.
     *
     * @param context     a valid OpenCL context
     * @param strings     an array of {@code count} pointers to optionally null-terminated character strings that make up the source code
     * @param lengths     an array with the number of chars in each string (the string length). If an element in {@code lengths} is zero, its accompanying string is
     *                    null-terminated. If {@code lengths} is {@code NULL}, all strings in the {@code strings} argument are considered null-terminated. Any length value passed in
     *                    that is greater than zero excludes the null terminator in its count.
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero program object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code count} is zero or if {@code strings} or any entry in {@code strings} is {@code NULL}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithSource.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithSource(@NativeType("cl_context") long context, @NativeType("cl_char const **") PointerBuffer strings, @Nullable @NativeType("size_t const *") PointerBuffer lengths, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(lengths, strings.remaining());
            checkSafe(errcode_ret, 1);
        }
        return nclCreateProgramWithSource(context, strings.remaining(), memAddress(strings), memAddressSafe(lengths), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a program object for a context, and loads the source code specified by the text strings in the strings array into the program object. The
     * devices associated with the program object are the devices associated with {@code context}. The source code specified by strings is either an OpenCL C
     * program source, header or implementation-defined source for custom devices that support an online compiler.
     *
     * @param context     a valid OpenCL context
     * @param strings     an array of {@code count} pointers to optionally null-terminated character strings that make up the source code
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero program object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code count} is zero or if {@code strings} or any entry in {@code strings} is {@code NULL}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithSource.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithSource(@NativeType("cl_context") long context, @NativeType("cl_char const **") CharSequence[] strings, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArrayp(stack, MemoryUtil::memUTF8, strings);
            long __result = nclCreateProgramWithSource(context, strings.length, stringsAddress, stringsAddress - (strings.length << POINTER_SHIFT), memAddressSafe(errcode_ret));
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, strings.length);
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Creates a program object for a context, and loads the source code specified by the text strings in the strings array into the program object. The
     * devices associated with the program object are the devices associated with {@code context}. The source code specified by strings is either an OpenCL C
     * program source, header or implementation-defined source for custom devices that support an online compiler.
     *
     * @param context     a valid OpenCL context
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero program object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code count} is zero or if {@code strings} or any entry in {@code strings} is {@code NULL}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithSource.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithSource(@NativeType("cl_context") long context, @NativeType("cl_char const **") CharSequence string, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long stringsAddress = org.lwjgl.system.APIUtil.apiArrayp(stack, MemoryUtil::memUTF8, string);
            long __result = nclCreateProgramWithSource(context, 1, stringsAddress, stringsAddress - POINTER_SIZE, memAddressSafe(errcode_ret));
            org.lwjgl.system.APIUtil.apiArrayFree(stringsAddress, 1);
            return __result;
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clCreateProgramWithBinary ] ---

    /**
     * Unsafe version of: {@link #clCreateProgramWithBinary CreateProgramWithBinary}
     *
     * @param num_devices the number of devices listed in {@code device_list}
     */
    public static long nclCreateProgramWithBinary(long context, int num_devices, long device_list, long lengths, long binaries, long binary_status, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithBinary;
        if (CHECKS) {
            check(context);
        }
        return callPPPPPPP(context, num_devices, device_list, lengths, binaries, binary_status, errcode_ret, __functionAddress);
    }

    /**
     * Creates a program object for a context, and loads the binary bits specified by {@code binary} into the program object.
     * 
     * <p>The program binaries specified by {@code binaries} contain the bits that describe one of the following:</p>
     * 
     * <ul>
     * <li>a program executable to be run on the device(s) associated with {@code context},</li>
     * <li>a compiled program for device(s) associated with {@code context}, or</li>
     * <li>a library of compiled programs for device(s) associated with {@code context}.</li>
     * </ul>
     * 
     * <p>The program binary can consist of either or both:</p>
     * 
     * <ul>
     * <li>Device-specific code and/or,</li>
     * <li>Implementation-specific intermediate representation (IR) which will be converted to the device-specific code.</li>
     * </ul>
     * 
     * <p>OpenCL allows applications to create a program object using the program source or binary and build appropriate program executables. This can be very
     * useful as it allows applications to load program source and then compile and link to generate a program executable online on its first instance for
     * appropriate OpenCL devices in the system. These executables can now be queried and cached by the application. Future instances of the application
     * launching will no longer need to compile and link the program executables. The cached executables can be read and loaded by the application, which can
     * help significantly reduce the application initialization time.</p>
     *
     * @param context       a valid OpenCL context
     * @param device_list   a pointer to a list of devices that are in {@code context}. device_list must be a non-{@code NULL} value. The binaries are loaded for devices specified in
     *                      this list.
     * @param lengths       an array of the size in bytes of the program binaries to be loaded for devices specified by {@code device_list}.
     * @param binaries      an array of pointers to program binaries to be loaded for devices specified by {@code device_list}. For each device given by {@code device_list[i]},
     *                      the pointer to the program binary for that device is given by {@code binaries[i]} and the length of this corresponding binary is given by
     *                      {@code lengths[i]}. {@code lengths[i]} cannot be zero and {@code binaries[i]} cannot be a {@code NULL} pointer.
     * @param binary_status returns whether the program binary for each device specified in device_list was loaded successfully or not. It is an array of {@code num_devices}
     *                      entries and returns {@link #CL_SUCCESS SUCCESS} in {@code binary_status[i]} if binary was successfully loaded for device specified by {@code device_list[i]};
     *                      otherwise returns {@link #CL_INVALID_VALUE INVALID_VALUE} if {@code lengths[i]} is zero or if {@code binaries[i]} is a {@code NULL} value or {@link #CL_INVALID_BINARY INVALID_BINARY} in
     *                      {@code binary_status[i]} if program binary is not a valid binary for the specified device. If {@code binary_status} is {@code NULL}, it is ignored.
     * @param errcode_ret   will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero program object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} or {@code num_devices} is zero.</li>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with {@code context}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code lengths} or {@code binaries} are {@code NULL} or if any entry in {@code lengths[i]} is zero or {@code binaries[i]} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_BINARY INVALID_BINARY} if an invalid program binary was encountered for any device. {@code binary_status} will return specific status for each device.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithBinary.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithBinary(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("size_t const *") PointerBuffer lengths, @NativeType("cl_uchar const **") PointerBuffer binaries, @Nullable @NativeType("cl_int *") IntBuffer binary_status, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            check(device_list, binaries.remaining());
            check(lengths, binaries.remaining());
            checkSafe(binary_status, binaries.remaining());
            checkSafe(errcode_ret, 1);
        }
        return nclCreateProgramWithBinary(context, binaries.remaining(), memAddress(device_list), memAddress(lengths), memAddress(binaries), memAddressSafe(binary_status), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a program object for a context, and loads the binary bits specified by {@code binary} into the program object.
     * 
     * <p>The program binaries specified by {@code binaries} contain the bits that describe one of the following:</p>
     * 
     * <ul>
     * <li>a program executable to be run on the device(s) associated with {@code context},</li>
     * <li>a compiled program for device(s) associated with {@code context}, or</li>
     * <li>a library of compiled programs for device(s) associated with {@code context}.</li>
     * </ul>
     * 
     * <p>The program binary can consist of either or both:</p>
     * 
     * <ul>
     * <li>Device-specific code and/or,</li>
     * <li>Implementation-specific intermediate representation (IR) which will be converted to the device-specific code.</li>
     * </ul>
     * 
     * <p>OpenCL allows applications to create a program object using the program source or binary and build appropriate program executables. This can be very
     * useful as it allows applications to load program source and then compile and link to generate a program executable online on its first instance for
     * appropriate OpenCL devices in the system. These executables can now be queried and cached by the application. Future instances of the application
     * launching will no longer need to compile and link the program executables. The cached executables can be read and loaded by the application, which can
     * help significantly reduce the application initialization time.</p>
     *
     * @param context       a valid OpenCL context
     * @param device_list   a pointer to a list of devices that are in {@code context}. device_list must be a non-{@code NULL} value. The binaries are loaded for devices specified in
     *                      this list.
     * @param binaries      an array of pointers to program binaries to be loaded for devices specified by {@code device_list}. For each device given by {@code device_list[i]},
     *                      the pointer to the program binary for that device is given by {@code binaries[i]} and the length of this corresponding binary is given by
     *                      {@code lengths[i]}. {@code lengths[i]} cannot be zero and {@code binaries[i]} cannot be a {@code NULL} pointer.
     * @param binary_status returns whether the program binary for each device specified in device_list was loaded successfully or not. It is an array of {@code num_devices}
     *                      entries and returns {@link #CL_SUCCESS SUCCESS} in {@code binary_status[i]} if binary was successfully loaded for device specified by {@code device_list[i]};
     *                      otherwise returns {@link #CL_INVALID_VALUE INVALID_VALUE} if {@code lengths[i]} is zero or if {@code binaries[i]} is a {@code NULL} value or {@link #CL_INVALID_BINARY INVALID_BINARY} in
     *                      {@code binary_status[i]} if program binary is not a valid binary for the specified device. If {@code binary_status} is {@code NULL}, it is ignored.
     * @param errcode_ret   will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero program object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} or {@code num_devices} is zero.</li>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with {@code context}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code lengths} or {@code binaries} are {@code NULL} or if any entry in {@code lengths[i]} is zero or {@code binaries[i]} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_BINARY INVALID_BINARY} if an invalid program binary was encountered for any device. {@code binary_status} will return specific status for each device.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithBinary.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithBinary(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_uchar const **") ByteBuffer[] binaries, @Nullable @NativeType("cl_int *") IntBuffer binary_status, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            check(device_list, binaries.length);
            checkSafe(binary_status, binaries.length);
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long binariesAddress = org.lwjgl.system.APIUtil.apiArrayp(stack, binaries);
            return nclCreateProgramWithBinary(context, binaries.length, memAddress(device_list), binariesAddress - (binaries.length << POINTER_SHIFT), binariesAddress, memAddressSafe(binary_status), memAddressSafe(errcode_ret));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Creates a program object for a context, and loads the binary bits specified by {@code binary} into the program object.
     * 
     * <p>The program binaries specified by {@code binaries} contain the bits that describe one of the following:</p>
     * 
     * <ul>
     * <li>a program executable to be run on the device(s) associated with {@code context},</li>
     * <li>a compiled program for device(s) associated with {@code context}, or</li>
     * <li>a library of compiled programs for device(s) associated with {@code context}.</li>
     * </ul>
     * 
     * <p>The program binary can consist of either or both:</p>
     * 
     * <ul>
     * <li>Device-specific code and/or,</li>
     * <li>Implementation-specific intermediate representation (IR) which will be converted to the device-specific code.</li>
     * </ul>
     * 
     * <p>OpenCL allows applications to create a program object using the program source or binary and build appropriate program executables. This can be very
     * useful as it allows applications to load program source and then compile and link to generate a program executable online on its first instance for
     * appropriate OpenCL devices in the system. These executables can now be queried and cached by the application. Future instances of the application
     * launching will no longer need to compile and link the program executables. The cached executables can be read and loaded by the application, which can
     * help significantly reduce the application initialization time.</p>
     *
     * @param context       a valid OpenCL context
     * @param device_list   a pointer to a list of devices that are in {@code context}. device_list must be a non-{@code NULL} value. The binaries are loaded for devices specified in
     *                      this list.
     * @param binary_status returns whether the program binary for each device specified in device_list was loaded successfully or not. It is an array of {@code num_devices}
     *                      entries and returns {@link #CL_SUCCESS SUCCESS} in {@code binary_status[i]} if binary was successfully loaded for device specified by {@code device_list[i]};
     *                      otherwise returns {@link #CL_INVALID_VALUE INVALID_VALUE} if {@code lengths[i]} is zero or if {@code binaries[i]} is a {@code NULL} value or {@link #CL_INVALID_BINARY INVALID_BINARY} in
     *                      {@code binary_status[i]} if program binary is not a valid binary for the specified device. If {@code binary_status} is {@code NULL}, it is ignored.
     * @param errcode_ret   will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero program object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the program object is created successfully. Otherwise, it returns a {@code NULL}
     *         value with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if {@code context} is not a valid context.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} or {@code num_devices} is zero.</li>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with {@code context}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code lengths} or {@code binaries} are {@code NULL} or if any entry in {@code lengths[i]} is zero or {@code binaries[i]} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_BINARY INVALID_BINARY} if an invalid program binary was encountered for any device. {@code binary_status} will return specific status for each device.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithBinary.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithBinary(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_uchar const **") ByteBuffer binary, @Nullable @NativeType("cl_int *") IntBuffer binary_status, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            check(device_list, 1);
            checkSafe(binary_status, 1);
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            long binariesAddress = org.lwjgl.system.APIUtil.apiArrayp(stack, binary);
            return nclCreateProgramWithBinary(context, 1, memAddress(device_list), binariesAddress - POINTER_SIZE, binariesAddress, memAddressSafe(binary_status), memAddressSafe(errcode_ret));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clRetainProgram ] ---

    /**
     * Increments the {@code program} reference count. {@code clCreateProgram} does an implicit retain.
     *
     * @param program the program object to retain
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clRetainProgram.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clRetainProgram(@NativeType("cl_program") long program) {
        long __functionAddress = CL.getICD().clRetainProgram;
        if (CHECKS) {
            check(program);
        }
        return callPI(program, __functionAddress);
    }

    // --- [ clReleaseProgram ] ---

    /**
     * Decrements the {@code program} reference count. The program object is deleted after all kernel objects associated with program have been deleted and the
     * program reference count becomes zero.
     *
     * @param program the program object to release
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clReleaseProgram.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clReleaseProgram(@NativeType("cl_program") long program) {
        long __functionAddress = CL.getICD().clReleaseProgram;
        if (CHECKS) {
            check(program);
        }
        return callPI(program, __functionAddress);
    }

    // --- [ clBuildProgram ] ---

    /**
     * Unsafe version of: {@link #clBuildProgram BuildProgram}
     *
     * @param num_devices the number of devices listed in {@code device_list}
     */
    public static int nclBuildProgram(long program, int num_devices, long device_list, long options, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clBuildProgram;
        if (CHECKS) {
            check(program);
        }
        return callPPPPPI(program, num_devices, device_list, options, pfn_notify, user_data, __functionAddress);
    }

    /**
     * Builds (compiles &amp; links) a program executable from the program source or binary for all the devices or a specific device(s) in the OpenCL context
     * associated with {@code program}. OpenCL allows program executables to be built using the source or the binary. {@code clBuildProgram} must be called for
     * {@code program} created using either {@link #clCreateProgramWithSource CreateProgramWithSource} or {@link #clCreateProgramWithBinary CreateProgramWithBinary} to build the program executable for one or more devices
     * associated with {@code program}. If {@code program} is created with {@link #clCreateProgramWithBinary CreateProgramWithBinary}, then the program binary must be an executable binary (not
     * a compiled binary or library).
     * 
     * <p>The executable binary can be queried using {@link #clGetProgramInfo GetProgramInfo} and can be specified to {@link #clCreateProgramWithBinary CreateProgramWithBinary} to create a new program object.</p>
     *
     * @param program     the program object
     * @param device_list a pointer to a list of devices associated with {@code program}. If {@code device_list} is a {@code NULL} value, the program executable is built for all
     *                    devices associated with {@code program} for which a source or binary has been loaded. If {@code device_list} is a non-{@code NULL} value, the program
     *                    executable is built for devices specified in this list for which a source or binary has been loaded.
     * @param options     a pointer to a null-terminated string of characters that describes the build options to be used for building the program executable
     * @param pfn_notify  a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
     *                    called when the program executable has been built (successfully or unsuccessfully). If {@code pfn_notify} is not {@code NULL}, {@code clBuildProgram} does
     *                    not need to wait for the build to complete and can return immediately once the build operation can begin. The build operation can begin if the
     *                    context, program whose sources are being compiled and linked, list of devices and build options specified are all valid and appropriate host and
     *                    device resources needed to perform the build are available. If {@code pfn_notify} is {@code NULL}, {@code clBuildProgram} does not return until the build
     *                    has completed. This callback function may be called asynchronously by the OpenCL implementation. It is the application's responsibility to ensure
     *                    that the callback function is thread-safe.
     * @param user_data   will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} and {@code num_devices} is &gt; 0, or if {@code device_list} is not {@code NULL} and {@code num_devices} is 0.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with program.</li>
     *         <li>{@link #CL_INVALID_BINARY INVALID_BINARY} if {@code program} is created with {@link #clCreateProgramWithBinary CreateProgramWithBinary} and devices listed in {@code device_list} do not have a valid
     *         program binary loaded.</li>
     *         <li>{@link #CL_INVALID_BUILD_OPTIONS INVALID_BUILD_OPTIONS} if the build options specified by {@code options} are invalid.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the build of a program executable for any of the devices listed in {@code device_list} by a previous call to
     *         {@code clBuildProgram} for {@code program} has not completed.</li>
     *         <li>{@link #CL_COMPILER_NOT_AVAILABLE COMPILER_NOT_AVAILABLE} if {@code program} is created with {@link #clCreateProgramWithSource CreateProgramWithSource} and a compiler is not available i.e.
     *         {@link #CL_DEVICE_COMPILER_AVAILABLE DEVICE_COMPILER_AVAILABLE} is set to {@link #CL_FALSE FALSE}.</li>
     *         <li>{@link #CL_BUILD_PROGRAM_FAILURE BUILD_PROGRAM_FAILURE} if there is a failure to build the program executable. This error will be returned if {@code clBuildProgram} does
     *         not return until the build has completed.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are kernel objects attached to {@code program}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if program was not created with {@link #clCreateProgramWithSource CreateProgramWithSource} or {@link #clCreateProgramWithBinary CreateProgramWithBinary}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clBuildProgram.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clBuildProgram(@NativeType("cl_program") long program, @Nullable @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") ByteBuffer options, @Nullable @NativeType("void (*) (cl_program, void *)") CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        if (CHECKS) {
            checkNT1(options);
        }
        return nclBuildProgram(program, remainingSafe(device_list), memAddressSafe(device_list), memAddress(options), memAddressSafe(pfn_notify), user_data);
    }

    /**
     * Builds (compiles &amp; links) a program executable from the program source or binary for all the devices or a specific device(s) in the OpenCL context
     * associated with {@code program}. OpenCL allows program executables to be built using the source or the binary. {@code clBuildProgram} must be called for
     * {@code program} created using either {@link #clCreateProgramWithSource CreateProgramWithSource} or {@link #clCreateProgramWithBinary CreateProgramWithBinary} to build the program executable for one or more devices
     * associated with {@code program}. If {@code program} is created with {@link #clCreateProgramWithBinary CreateProgramWithBinary}, then the program binary must be an executable binary (not
     * a compiled binary or library).
     * 
     * <p>The executable binary can be queried using {@link #clGetProgramInfo GetProgramInfo} and can be specified to {@link #clCreateProgramWithBinary CreateProgramWithBinary} to create a new program object.</p>
     *
     * @param program     the program object
     * @param device_list a pointer to a list of devices associated with {@code program}. If {@code device_list} is a {@code NULL} value, the program executable is built for all
     *                    devices associated with {@code program} for which a source or binary has been loaded. If {@code device_list} is a non-{@code NULL} value, the program
     *                    executable is built for devices specified in this list for which a source or binary has been loaded.
     * @param options     a pointer to a null-terminated string of characters that describes the build options to be used for building the program executable
     * @param pfn_notify  a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
     *                    called when the program executable has been built (successfully or unsuccessfully). If {@code pfn_notify} is not {@code NULL}, {@code clBuildProgram} does
     *                    not need to wait for the build to complete and can return immediately once the build operation can begin. The build operation can begin if the
     *                    context, program whose sources are being compiled and linked, list of devices and build options specified are all valid and appropriate host and
     *                    device resources needed to perform the build are available. If {@code pfn_notify} is {@code NULL}, {@code clBuildProgram} does not return until the build
     *                    has completed. This callback function may be called asynchronously by the OpenCL implementation. It is the application's responsibility to ensure
     *                    that the callback function is thread-safe.
     * @param user_data   will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} and {@code num_devices} is &gt; 0, or if {@code device_list} is not {@code NULL} and {@code num_devices} is 0.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with program.</li>
     *         <li>{@link #CL_INVALID_BINARY INVALID_BINARY} if {@code program} is created with {@link #clCreateProgramWithBinary CreateProgramWithBinary} and devices listed in {@code device_list} do not have a valid
     *         program binary loaded.</li>
     *         <li>{@link #CL_INVALID_BUILD_OPTIONS INVALID_BUILD_OPTIONS} if the build options specified by {@code options} are invalid.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the build of a program executable for any of the devices listed in {@code device_list} by a previous call to
     *         {@code clBuildProgram} for {@code program} has not completed.</li>
     *         <li>{@link #CL_COMPILER_NOT_AVAILABLE COMPILER_NOT_AVAILABLE} if {@code program} is created with {@link #clCreateProgramWithSource CreateProgramWithSource} and a compiler is not available i.e.
     *         {@link #CL_DEVICE_COMPILER_AVAILABLE DEVICE_COMPILER_AVAILABLE} is set to {@link #CL_FALSE FALSE}.</li>
     *         <li>{@link #CL_BUILD_PROGRAM_FAILURE BUILD_PROGRAM_FAILURE} if there is a failure to build the program executable. This error will be returned if {@code clBuildProgram} does
     *         not return until the build has completed.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are kernel objects attached to {@code program}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if program was not created with {@link #clCreateProgramWithSource CreateProgramWithSource} or {@link #clCreateProgramWithBinary CreateProgramWithBinary}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clBuildProgram.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clBuildProgram(@NativeType("cl_program") long program, @Nullable @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") CharSequence options, @Nullable @NativeType("void (*) (cl_program, void *)") CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(options, true);
            long optionsEncoded = stack.getPointerAddress();
            return nclBuildProgram(program, remainingSafe(device_list), memAddressSafe(device_list), optionsEncoded, memAddressSafe(pfn_notify), user_data);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Builds (compiles &amp; links) a program executable from the program source or binary for all the devices or a specific device(s) in the OpenCL context
     * associated with {@code program}. OpenCL allows program executables to be built using the source or the binary. {@code clBuildProgram} must be called for
     * {@code program} created using either {@link #clCreateProgramWithSource CreateProgramWithSource} or {@link #clCreateProgramWithBinary CreateProgramWithBinary} to build the program executable for one or more devices
     * associated with {@code program}. If {@code program} is created with {@link #clCreateProgramWithBinary CreateProgramWithBinary}, then the program binary must be an executable binary (not
     * a compiled binary or library).
     * 
     * <p>The executable binary can be queried using {@link #clGetProgramInfo GetProgramInfo} and can be specified to {@link #clCreateProgramWithBinary CreateProgramWithBinary} to create a new program object.</p>
     *
     * @param program    the program object
     * @param options    a pointer to a null-terminated string of characters that describes the build options to be used for building the program executable
     * @param pfn_notify a function pointer to a notification routine. The notification routine is a callback function that an application can register and which will be
     *                   called when the program executable has been built (successfully or unsuccessfully). If {@code pfn_notify} is not {@code NULL}, {@code clBuildProgram} does
     *                   not need to wait for the build to complete and can return immediately once the build operation can begin. The build operation can begin if the
     *                   context, program whose sources are being compiled and linked, list of devices and build options specified are all valid and appropriate host and
     *                   device resources needed to perform the build are available. If {@code pfn_notify} is {@code NULL}, {@code clBuildProgram} does not return until the build
     *                   has completed. This callback function may be called asynchronously by the OpenCL implementation. It is the application's responsibility to ensure
     *                   that the callback function is thread-safe.
     * @param user_data  will be passed as an argument when {@code pfn_notify} is called. {@code user_data} can be {@code NULL}.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code device_list} is {@code NULL} and {@code num_devices} is &gt; 0, or if {@code device_list} is not {@code NULL} and {@code num_devices} is 0.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code pfn_notify} is {@code NULL} but {@code user_data} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if OpenCL devices listed in {@code device_list} are not in the list of devices associated with program.</li>
     *         <li>{@link #CL_INVALID_BINARY INVALID_BINARY} if {@code program} is created with {@link #clCreateProgramWithBinary CreateProgramWithBinary} and devices listed in {@code device_list} do not have a valid
     *         program binary loaded.</li>
     *         <li>{@link #CL_INVALID_BUILD_OPTIONS INVALID_BUILD_OPTIONS} if the build options specified by {@code options} are invalid.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the build of a program executable for any of the devices listed in {@code device_list} by a previous call to
     *         {@code clBuildProgram} for {@code program} has not completed.</li>
     *         <li>{@link #CL_COMPILER_NOT_AVAILABLE COMPILER_NOT_AVAILABLE} if {@code program} is created with {@link #clCreateProgramWithSource CreateProgramWithSource} and a compiler is not available i.e.
     *         {@link #CL_DEVICE_COMPILER_AVAILABLE DEVICE_COMPILER_AVAILABLE} is set to {@link #CL_FALSE FALSE}.</li>
     *         <li>{@link #CL_BUILD_PROGRAM_FAILURE BUILD_PROGRAM_FAILURE} if there is a failure to build the program executable. This error will be returned if {@code clBuildProgram} does
     *         not return until the build has completed.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are kernel objects attached to {@code program}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if program was not created with {@link #clCreateProgramWithSource CreateProgramWithSource} or {@link #clCreateProgramWithBinary CreateProgramWithBinary}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clBuildProgram.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clBuildProgram(@NativeType("cl_program") long program, @NativeType("cl_device_id const *") long device, @NativeType("cl_char const *") CharSequence options, @Nullable @NativeType("void (*) (cl_program, void *)") CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(options, true);
            long optionsEncoded = stack.getPointerAddress();
            PointerBuffer device_list = stack.pointers(device);
            return nclBuildProgram(program, 1, memAddress(device_list), optionsEncoded, memAddressSafe(pfn_notify), user_data);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clUnloadCompiler ] ---

    /**
     * Allows the implementation to release the resources allocated by the OpenCL compiler. This is a hint from the application and does not guarantee that the
     * compiler will not be used in the future or that the compiler will actually be unloaded by the implementation.
     * 
     * <p>Calls to {@link #clBuildProgram BuildProgram} after {@link #clUnloadCompiler UnloadCompiler} will reload the compiler, if necessary, to build the appropriate program executable.</p>
     *
     * @return always {@link #CL_SUCCESS SUCCESS}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clUnloadCompiler.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_int")
    public static int clUnloadCompiler() {
        long __functionAddress = CL.getICD().clUnloadCompiler;
        return callI(__functionAddress);
    }

    // --- [ clGetProgramInfo ] ---

    /**
     * Unsafe version of: {@link #clGetProgramInfo GetProgramInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetProgramInfo(long program, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetProgramInfo;
        if (CHECKS) {
            check(program);
        }
        return callPPPPI(program, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns information about a program object.
     *
     * @param program              the program object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_PROGRAM_REFERENCE_COUNT PROGRAM_REFERENCE_COUNT}</td><td>{@link #CL_PROGRAM_CONTEXT PROGRAM_CONTEXT}</td><td>{@link #CL_PROGRAM_NUM_DEVICES PROGRAM_NUM_DEVICES}</td><td>{@link #CL_PROGRAM_DEVICES PROGRAM_DEVICES}</td></tr><tr><td>{@link #CL_PROGRAM_SOURCE PROGRAM_SOURCE}</td><td>{@link #CL_PROGRAM_BINARY_SIZES PROGRAM_BINARY_SIZES}</td><td>{@link #CL_PROGRAM_BINARIES PROGRAM_BINARIES}</td><td>{@link CL12#CL_PROGRAM_NUM_KERNELS PROGRAM_NUM_KERNELS}</td></tr><tr><td>{@link CL12#CL_PROGRAM_KERNEL_NAMES PROGRAM_KERNEL_NAMES}</td><td>{@link CL21#CL_PROGRAM_IL PROGRAM_IL}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is a not a valid program object.</li>
     *         <li>{@link #CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} if {@code param_name} is {@link CL12#CL_PROGRAM_NUM_KERNELS PROGRAM_NUM_KERNELS} or {@link CL12#CL_PROGRAM_KERNEL_NAMES PROGRAM_KERNEL_NAMES} and a
     *         successful program executable has not been built for at least one device in the list of devices associated with {@code program}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetProgramInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetProgramInfo(@NativeType("cl_program") long program, @NativeType("cl_program_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramInfo(program, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about a program object.
     *
     * @param program              the program object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_PROGRAM_REFERENCE_COUNT PROGRAM_REFERENCE_COUNT}</td><td>{@link #CL_PROGRAM_CONTEXT PROGRAM_CONTEXT}</td><td>{@link #CL_PROGRAM_NUM_DEVICES PROGRAM_NUM_DEVICES}</td><td>{@link #CL_PROGRAM_DEVICES PROGRAM_DEVICES}</td></tr><tr><td>{@link #CL_PROGRAM_SOURCE PROGRAM_SOURCE}</td><td>{@link #CL_PROGRAM_BINARY_SIZES PROGRAM_BINARY_SIZES}</td><td>{@link #CL_PROGRAM_BINARIES PROGRAM_BINARIES}</td><td>{@link CL12#CL_PROGRAM_NUM_KERNELS PROGRAM_NUM_KERNELS}</td></tr><tr><td>{@link CL12#CL_PROGRAM_KERNEL_NAMES PROGRAM_KERNEL_NAMES}</td><td>{@link CL21#CL_PROGRAM_IL PROGRAM_IL}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is a not a valid program object.</li>
     *         <li>{@link #CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} if {@code param_name} is {@link CL12#CL_PROGRAM_NUM_KERNELS PROGRAM_NUM_KERNELS} or {@link CL12#CL_PROGRAM_KERNEL_NAMES PROGRAM_KERNEL_NAMES} and a
     *         successful program executable has not been built for at least one device in the list of devices associated with {@code program}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetProgramInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetProgramInfo(@NativeType("cl_program") long program, @NativeType("cl_program_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramInfo(program, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about a program object.
     *
     * @param program              the program object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_PROGRAM_REFERENCE_COUNT PROGRAM_REFERENCE_COUNT}</td><td>{@link #CL_PROGRAM_CONTEXT PROGRAM_CONTEXT}</td><td>{@link #CL_PROGRAM_NUM_DEVICES PROGRAM_NUM_DEVICES}</td><td>{@link #CL_PROGRAM_DEVICES PROGRAM_DEVICES}</td></tr><tr><td>{@link #CL_PROGRAM_SOURCE PROGRAM_SOURCE}</td><td>{@link #CL_PROGRAM_BINARY_SIZES PROGRAM_BINARY_SIZES}</td><td>{@link #CL_PROGRAM_BINARIES PROGRAM_BINARIES}</td><td>{@link CL12#CL_PROGRAM_NUM_KERNELS PROGRAM_NUM_KERNELS}</td></tr><tr><td>{@link CL12#CL_PROGRAM_KERNEL_NAMES PROGRAM_KERNEL_NAMES}</td><td>{@link CL21#CL_PROGRAM_IL PROGRAM_IL}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is a not a valid program object.</li>
     *         <li>{@link #CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} if {@code param_name} is {@link CL12#CL_PROGRAM_NUM_KERNELS PROGRAM_NUM_KERNELS} or {@link CL12#CL_PROGRAM_KERNEL_NAMES PROGRAM_KERNEL_NAMES} and a
     *         successful program executable has not been built for at least one device in the list of devices associated with {@code program}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetProgramInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetProgramInfo(@NativeType("cl_program") long program, @NativeType("cl_program_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramInfo(program, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clGetProgramBuildInfo ] ---

    /**
     * Unsafe version of: {@link #clGetProgramBuildInfo GetProgramBuildInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetProgramBuildInfo(long program, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetProgramBuildInfo;
        if (CHECKS) {
            check(program);
            check(device);
        }
        return callPPPPPI(program, device, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns build information for each device in the program object.
     *
     * @param program              the program object being queried
     * @param device               the device for which build information is being queried. {@code device} must be a valid device associated with {@code program}.
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_PROGRAM_BUILD_STATUS PROGRAM_BUILD_STATUS}</td><td>{@link #CL_PROGRAM_BUILD_OPTIONS PROGRAM_BUILD_OPTIONS}</td><td>{@link #CL_PROGRAM_BUILD_LOG PROGRAM_BUILD_LOG}</td></tr><tr><td>{@link CL12#CL_PROGRAM_BINARY_TYPE PROGRAM_BINARY_TYPE}</td><td>{@link CL20#CL_PROGRAM_BUILD_GLOBAL_VARIABLE_TOTAL_SIZE PROGRAM_BUILD_GLOBAL_VARIABLE_TOTAL_SIZE}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not in the list of devices associated with program.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is a not a valid program object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetProgramBuildInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetProgramBuildInfo(@NativeType("cl_program") long program, @NativeType("cl_device_id") long device, @NativeType("cl_program_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramBuildInfo(program, device, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns build information for each device in the program object.
     *
     * @param program              the program object being queried
     * @param device               the device for which build information is being queried. {@code device} must be a valid device associated with {@code program}.
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_PROGRAM_BUILD_STATUS PROGRAM_BUILD_STATUS}</td><td>{@link #CL_PROGRAM_BUILD_OPTIONS PROGRAM_BUILD_OPTIONS}</td><td>{@link #CL_PROGRAM_BUILD_LOG PROGRAM_BUILD_LOG}</td></tr><tr><td>{@link CL12#CL_PROGRAM_BINARY_TYPE PROGRAM_BINARY_TYPE}</td><td>{@link CL20#CL_PROGRAM_BUILD_GLOBAL_VARIABLE_TOTAL_SIZE PROGRAM_BUILD_GLOBAL_VARIABLE_TOTAL_SIZE}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not in the list of devices associated with program.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is a not a valid program object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetProgramBuildInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetProgramBuildInfo(@NativeType("cl_program") long program, @NativeType("cl_device_id") long device, @NativeType("cl_program_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramBuildInfo(program, device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns build information for each device in the program object.
     *
     * @param program              the program object being queried
     * @param device               the device for which build information is being queried. {@code device} must be a valid device associated with {@code program}.
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_PROGRAM_BUILD_STATUS PROGRAM_BUILD_STATUS}</td><td>{@link #CL_PROGRAM_BUILD_OPTIONS PROGRAM_BUILD_OPTIONS}</td><td>{@link #CL_PROGRAM_BUILD_LOG PROGRAM_BUILD_LOG}</td></tr><tr><td>{@link CL12#CL_PROGRAM_BINARY_TYPE PROGRAM_BINARY_TYPE}</td><td>{@link CL20#CL_PROGRAM_BUILD_GLOBAL_VARIABLE_TOTAL_SIZE PROGRAM_BUILD_GLOBAL_VARIABLE_TOTAL_SIZE}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not in the list of devices associated with program.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is a not a valid program object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetProgramBuildInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetProgramBuildInfo(@NativeType("cl_program") long program, @NativeType("cl_device_id") long device, @NativeType("cl_program_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramBuildInfo(program, device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateKernel ] ---

    /** Unsafe version of: {@link #clCreateKernel CreateKernel} */
    public static long nclCreateKernel(long program, long kernel_name, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateKernel;
        if (CHECKS) {
            check(program);
        }
        return callPPPP(program, kernel_name, errcode_ret, __functionAddress);
    }

    /**
     * Creates a kernel object.
     * 
     * <p>A kernel is a function declared in a program. A kernel is identified by the {@code __kernel} qualifier applied to any function in a program. A kernel
     * object encapsulates the specific {@code __kernel} function declared in a program and the argument values to be used when executing this {@code __kernel}
     * function.</p>
     * 
     * <p>Kernel objects can only be created once you have a program object with a valid program source or binary loaded into the program object and the program
     * executable has been successfully built for one or more devices associated with program. No changes to the program executable are allowed while there are
     * kernel objects associated with a program object. This means that calls to {@link #clBuildProgram BuildProgram} and {@link CL12#clCompileProgram CompileProgram} return
     * {@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are kernel objects attached to a program object. The OpenCL context associated with program will be the context
     * associated with kernel. The list of devices associated with program are the devices associated with kernel. Devices associated with a program object for
     * which a valid program executable has been built can be used to execute kernels declared in the program object.</p>
     *
     * @param program     a program object with a successfully built executable
     * @param kernel_name a function name in the program declared with the {@code __kernel} qualifier
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero kernel object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the kernel object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
     *         <li>{@link #CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} if there is no successfully built executable for {@code program}.</li>
     *         <li>{@link #CL_INVALID_KERNEL_NAME INVALID_KERNEL_NAME} if {@code kernel_name} is not found in {@code program}.</li>
     *         <li>{@link #CL_INVALID_KERNEL_DEFINITION INVALID_KERNEL_DEFINITION} if the function definition for {@code __kernel} function given by {@code kernel_name} such as the number of
     *         arguments, the argument types are not the same for all devices for which the program executable has been built.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code kernel_name} is {@code NULL}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateKernel.html">Reference Page</a>
     */
    @NativeType("cl_kernel")
    public static long clCreateKernel(@NativeType("cl_program") long program, @NativeType("cl_char const *") ByteBuffer kernel_name, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNT1(kernel_name);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateKernel(program, memAddress(kernel_name), memAddressSafe(errcode_ret));
    }

    /**
     * Creates a kernel object.
     * 
     * <p>A kernel is a function declared in a program. A kernel is identified by the {@code __kernel} qualifier applied to any function in a program. A kernel
     * object encapsulates the specific {@code __kernel} function declared in a program and the argument values to be used when executing this {@code __kernel}
     * function.</p>
     * 
     * <p>Kernel objects can only be created once you have a program object with a valid program source or binary loaded into the program object and the program
     * executable has been successfully built for one or more devices associated with program. No changes to the program executable are allowed while there are
     * kernel objects associated with a program object. This means that calls to {@link #clBuildProgram BuildProgram} and {@link CL12#clCompileProgram CompileProgram} return
     * {@link #CL_INVALID_OPERATION INVALID_OPERATION} if there are kernel objects attached to a program object. The OpenCL context associated with program will be the context
     * associated with kernel. The list of devices associated with program are the devices associated with kernel. Devices associated with a program object for
     * which a valid program executable has been built can be used to execute kernels declared in the program object.</p>
     *
     * @param program     a program object with a successfully built executable
     * @param kernel_name a function name in the program declared with the {@code __kernel} qualifier
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     *
     * @return a valid non-zero kernel object and {@code errcode_ret} is set to {@link #CL_SUCCESS SUCCESS} if the kernel object is created successfully. Otherwise, it returns a {@code NULL} value
     *         with one of the following error values returned in {@code errcode_ret}:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
     *         <li>{@link #CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} if there is no successfully built executable for {@code program}.</li>
     *         <li>{@link #CL_INVALID_KERNEL_NAME INVALID_KERNEL_NAME} if {@code kernel_name} is not found in {@code program}.</li>
     *         <li>{@link #CL_INVALID_KERNEL_DEFINITION INVALID_KERNEL_DEFINITION} if the function definition for {@code __kernel} function given by {@code kernel_name} such as the number of
     *         arguments, the argument types are not the same for all devices for which the program executable has been built.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code kernel_name} is {@code NULL}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateKernel.html">Reference Page</a>
     */
    @NativeType("cl_kernel")
    public static long clCreateKernel(@NativeType("cl_program") long program, @NativeType("cl_char const *") CharSequence kernel_name, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(kernel_name, true);
            long kernel_nameEncoded = stack.getPointerAddress();
            return nclCreateKernel(program, kernel_nameEncoded, memAddressSafe(errcode_ret));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clCreateKernelsInProgram ] ---

    /**
     * Unsafe version of: {@link #clCreateKernelsInProgram CreateKernelsInProgram}
     *
     * @param num_kernels the size of memory pointed to by kernels specified as the number of cl_kernel entries
     */
    public static int nclCreateKernelsInProgram(long program, int num_kernels, long kernels, long num_kernels_ret) {
        long __functionAddress = CL.getICD().clCreateKernelsInProgram;
        if (CHECKS) {
            check(program);
        }
        return callPPPI(program, num_kernels, kernels, num_kernels_ret, __functionAddress);
    }

    /**
     * Creates kernel objects for all kernel functions in {@code program}. Kernel objects are not created for any {@code __kernel} functions in {@code program}
     * that do not have the same function definition across all devices for which a program executable has been successfully built.
     * 
     * <p>See {@link #clCreateKernel CreateKernel} for more details.</p>
     *
     * @param program         a program object with a successfully built executable
     * @param kernels         the buffer where the kernel objects for kernels in {@code program} will be returned. If {@code kernels} is {@code NULL}, it is ignored. If {@code kernels}
     *                        is not {@code NULL}, {@code num_kernels} must be greater than or equal to the number of kernels in {@code program}.
     * @param num_kernels_ret the number of kernels in {@code program}. If {@code num_kernels_ret} is {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the kernel objects were successfully allocated. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object.</li>
     *         <li>{@link #CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} if there is no successfully built executable for any device in {@code program}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code kernels} is not {@code NULL} and {@code num_kernels} is less than the number of kernels in {@code program}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateKernelsInProgram.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clCreateKernelsInProgram(@NativeType("cl_program") long program, @Nullable @NativeType("cl_kernel *") PointerBuffer kernels, @Nullable @NativeType("cl_uint *") IntBuffer num_kernels_ret) {
        if (CHECKS) {
            checkSafe(num_kernels_ret, 1);
        }
        return nclCreateKernelsInProgram(program, remainingSafe(kernels), memAddressSafe(kernels), memAddressSafe(num_kernels_ret));
    }

    // --- [ clRetainKernel ] ---

    /**
     * Increments the {@code kernel} reference count. {@link #clCreateKernel CreateKernel} or {@link #clCreateKernelsInProgram CreateKernelsInProgram} do an implicit retain.
     *
     * @param kernel the kernel to retain
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if kernel is not a valid kernel object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clRetainKernel.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clRetainKernel(@NativeType("cl_kernel") long kernel) {
        long __functionAddress = CL.getICD().clRetainKernel;
        if (CHECKS) {
            check(kernel);
        }
        return callPI(kernel, __functionAddress);
    }

    // --- [ clReleaseKernel ] ---

    /**
     * Decrements the {@code kernel} reference count.
     * 
     * <p>The kernel object is deleted once the number of instances that are retained to {@code kernel} become zero and the kernel object is no longer needed by
     * any enqueued commands that use {@code kernel}.</p>
     *
     * @param kernel the kernel to release
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if kernel is not a valid kernel object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clReleaseKernel.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clReleaseKernel(@NativeType("cl_kernel") long kernel) {
        long __functionAddress = CL.getICD().clReleaseKernel;
        if (CHECKS) {
            check(kernel);
        }
        return callPI(kernel, __functionAddress);
    }

    // --- [ clSetKernelArg ] ---

    /**
     * Unsafe version of: {@link #clSetKernelArg SetKernelArg}
     *
     * @param arg_size the size of the argument value. If the argument is a memory object, the size is the size of the buffer or image object type. For arguments declared
     *                 with the {@code __local} qualifier, the size specified will be the size in bytes of the buffer that must be allocated for the {@code __local}
     *                 argument. If the argument is of type {@code sampler_t}, the {@code arg_size} value must be equal to {@code sizeof(cl_sampler)}. For all other
     *                 arguments, the size will be the size of argument type.
     */
    public static int nclSetKernelArg(long kernel, int arg_index, long arg_size, long arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, arg_size, arg_value, __functionAddress);
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     * @param arg_size  the size of the argument value. If the argument is a memory object, the size is the size of the buffer or image object type. For arguments declared
     *                  with the {@code __local} qualifier, the size specified will be the size in bytes of the buffer that must be allocated for the {@code __local}
     *                  argument. If the argument is of type {@code sampler_t}, the {@code arg_size} value must be equal to {@code sizeof(cl_sampler)}. For all other
     *                  arguments, the size will be the size of argument type.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("size_t") long arg_size) {
        return nclSetKernelArg(kernel, arg_index, arg_size, NULL);
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     * @param arg_value a pointer to data that should be used as the argument value for argument specified by {@code arg_index}. The argument data pointed to by
     *                  {@code arg_value} is copied and the {@code arg_value} pointer can therefore be reused by the application after {@code clSetKernelArg} returns. The
     *                  argument value specified is the value used by all API calls that enqueue kernel ({@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} and {@link #clEnqueueTask EnqueueTask}) until
     *                  the argument value is changed by a call to {@code clSetKernelArg} for {@code kernel}.
     *                  
     *                  <p>If the argument is a memory object (buffer, image or image array), the {@code arg_value} entry will be a pointer to the appropriate buffer, image or
     *                  image array object. The memory object must be created with the context associated with the kernel object. If the argument is a buffer object, the
     *                  {@code arg_value} pointer can be {@code NULL} or point to a {@code NULL} value in which case a {@code NULL} value will be used as the value for the argument declared as
     *                  a pointer to {@code __global} or {@code __constant} memory in the kernel. If the argument is declared with the {@code __local} qualifier, the
     *                  {@code arg_value} entry must be {@code NULL}. If the argument is of type {@code sampler_t}, the {@code arg_value} entry must be a pointer to the sampler
     *                  object.</p>
     *                  
     *                  <p>If the argument is declared to be a pointer of a built-in scalar or vector type, or a user defined structure type in the global or constant address
     *                  space, the memory object specified as argument value must be a buffer object (or {@code NULL}). If the argument is declared with the {@code __constant}
     *                  qualifier, the size in bytes of the memory object cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE} and the number of arguments declared as
     *                  pointers to {@code __constant} memory cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}.</p>
     *                  
     *                  <p>The memory object specified as argument value must be a 2D image object if the argument is declared to be of type {@code image2d_t}. The memory
     *                  object specified as argument value must be a 3D image object if argument is declared to be of type {@code image3d_t}. The memory object specified as
     *                  argument value must be a 1D image object if the argument is declared to be of type {@code image1d_t}. The memory object specified as argument value
     *                  must be a 1D image buffer object if the argument is declared to be of type {@code image1d_buffer_t}. The memory object specified as argument value
     *                  must be a 1D image array object if argument is declared to be of type {@code image1d_array_t}. The memory object specified as argument value must be
     *                  a 2D image array object if argument is declared to be of type {@code image2d_array_t}.</p>
     *                  
     *                  <p>For all other kernel arguments, the {@code arg_value} entry must be a pointer to the actual data to be used as argument value.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") ByteBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, arg_value.remaining(), memAddress(arg_value));
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     * @param arg_value a pointer to data that should be used as the argument value for argument specified by {@code arg_index}. The argument data pointed to by
     *                  {@code arg_value} is copied and the {@code arg_value} pointer can therefore be reused by the application after {@code clSetKernelArg} returns. The
     *                  argument value specified is the value used by all API calls that enqueue kernel ({@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} and {@link #clEnqueueTask EnqueueTask}) until
     *                  the argument value is changed by a call to {@code clSetKernelArg} for {@code kernel}.
     *                  
     *                  <p>If the argument is a memory object (buffer, image or image array), the {@code arg_value} entry will be a pointer to the appropriate buffer, image or
     *                  image array object. The memory object must be created with the context associated with the kernel object. If the argument is a buffer object, the
     *                  {@code arg_value} pointer can be {@code NULL} or point to a {@code NULL} value in which case a {@code NULL} value will be used as the value for the argument declared as
     *                  a pointer to {@code __global} or {@code __constant} memory in the kernel. If the argument is declared with the {@code __local} qualifier, the
     *                  {@code arg_value} entry must be {@code NULL}. If the argument is of type {@code sampler_t}, the {@code arg_value} entry must be a pointer to the sampler
     *                  object.</p>
     *                  
     *                  <p>If the argument is declared to be a pointer of a built-in scalar or vector type, or a user defined structure type in the global or constant address
     *                  space, the memory object specified as argument value must be a buffer object (or {@code NULL}). If the argument is declared with the {@code __constant}
     *                  qualifier, the size in bytes of the memory object cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE} and the number of arguments declared as
     *                  pointers to {@code __constant} memory cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}.</p>
     *                  
     *                  <p>The memory object specified as argument value must be a 2D image object if the argument is declared to be of type {@code image2d_t}. The memory
     *                  object specified as argument value must be a 3D image object if argument is declared to be of type {@code image3d_t}. The memory object specified as
     *                  argument value must be a 1D image object if the argument is declared to be of type {@code image1d_t}. The memory object specified as argument value
     *                  must be a 1D image buffer object if the argument is declared to be of type {@code image1d_buffer_t}. The memory object specified as argument value
     *                  must be a 1D image array object if argument is declared to be of type {@code image1d_array_t}. The memory object specified as argument value must be
     *                  a 2D image array object if argument is declared to be of type {@code image2d_array_t}.</p>
     *                  
     *                  <p>For all other kernel arguments, the {@code arg_value} entry must be a pointer to the actual data to be used as argument value.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") ShortBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << 1, memAddress(arg_value));
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     * @param arg_value a pointer to data that should be used as the argument value for argument specified by {@code arg_index}. The argument data pointed to by
     *                  {@code arg_value} is copied and the {@code arg_value} pointer can therefore be reused by the application after {@code clSetKernelArg} returns. The
     *                  argument value specified is the value used by all API calls that enqueue kernel ({@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} and {@link #clEnqueueTask EnqueueTask}) until
     *                  the argument value is changed by a call to {@code clSetKernelArg} for {@code kernel}.
     *                  
     *                  <p>If the argument is a memory object (buffer, image or image array), the {@code arg_value} entry will be a pointer to the appropriate buffer, image or
     *                  image array object. The memory object must be created with the context associated with the kernel object. If the argument is a buffer object, the
     *                  {@code arg_value} pointer can be {@code NULL} or point to a {@code NULL} value in which case a {@code NULL} value will be used as the value for the argument declared as
     *                  a pointer to {@code __global} or {@code __constant} memory in the kernel. If the argument is declared with the {@code __local} qualifier, the
     *                  {@code arg_value} entry must be {@code NULL}. If the argument is of type {@code sampler_t}, the {@code arg_value} entry must be a pointer to the sampler
     *                  object.</p>
     *                  
     *                  <p>If the argument is declared to be a pointer of a built-in scalar or vector type, or a user defined structure type in the global or constant address
     *                  space, the memory object specified as argument value must be a buffer object (or {@code NULL}). If the argument is declared with the {@code __constant}
     *                  qualifier, the size in bytes of the memory object cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE} and the number of arguments declared as
     *                  pointers to {@code __constant} memory cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}.</p>
     *                  
     *                  <p>The memory object specified as argument value must be a 2D image object if the argument is declared to be of type {@code image2d_t}. The memory
     *                  object specified as argument value must be a 3D image object if argument is declared to be of type {@code image3d_t}. The memory object specified as
     *                  argument value must be a 1D image object if the argument is declared to be of type {@code image1d_t}. The memory object specified as argument value
     *                  must be a 1D image buffer object if the argument is declared to be of type {@code image1d_buffer_t}. The memory object specified as argument value
     *                  must be a 1D image array object if argument is declared to be of type {@code image1d_array_t}. The memory object specified as argument value must be
     *                  a 2D image array object if argument is declared to be of type {@code image2d_array_t}.</p>
     *                  
     *                  <p>For all other kernel arguments, the {@code arg_value} entry must be a pointer to the actual data to be used as argument value.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") IntBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << 2, memAddress(arg_value));
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     * @param arg_value a pointer to data that should be used as the argument value for argument specified by {@code arg_index}. The argument data pointed to by
     *                  {@code arg_value} is copied and the {@code arg_value} pointer can therefore be reused by the application after {@code clSetKernelArg} returns. The
     *                  argument value specified is the value used by all API calls that enqueue kernel ({@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} and {@link #clEnqueueTask EnqueueTask}) until
     *                  the argument value is changed by a call to {@code clSetKernelArg} for {@code kernel}.
     *                  
     *                  <p>If the argument is a memory object (buffer, image or image array), the {@code arg_value} entry will be a pointer to the appropriate buffer, image or
     *                  image array object. The memory object must be created with the context associated with the kernel object. If the argument is a buffer object, the
     *                  {@code arg_value} pointer can be {@code NULL} or point to a {@code NULL} value in which case a {@code NULL} value will be used as the value for the argument declared as
     *                  a pointer to {@code __global} or {@code __constant} memory in the kernel. If the argument is declared with the {@code __local} qualifier, the
     *                  {@code arg_value} entry must be {@code NULL}. If the argument is of type {@code sampler_t}, the {@code arg_value} entry must be a pointer to the sampler
     *                  object.</p>
     *                  
     *                  <p>If the argument is declared to be a pointer of a built-in scalar or vector type, or a user defined structure type in the global or constant address
     *                  space, the memory object specified as argument value must be a buffer object (or {@code NULL}). If the argument is declared with the {@code __constant}
     *                  qualifier, the size in bytes of the memory object cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE} and the number of arguments declared as
     *                  pointers to {@code __constant} memory cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}.</p>
     *                  
     *                  <p>The memory object specified as argument value must be a 2D image object if the argument is declared to be of type {@code image2d_t}. The memory
     *                  object specified as argument value must be a 3D image object if argument is declared to be of type {@code image3d_t}. The memory object specified as
     *                  argument value must be a 1D image object if the argument is declared to be of type {@code image1d_t}. The memory object specified as argument value
     *                  must be a 1D image buffer object if the argument is declared to be of type {@code image1d_buffer_t}. The memory object specified as argument value
     *                  must be a 1D image array object if argument is declared to be of type {@code image1d_array_t}. The memory object specified as argument value must be
     *                  a 2D image array object if argument is declared to be of type {@code image2d_array_t}.</p>
     *                  
     *                  <p>For all other kernel arguments, the {@code arg_value} entry must be a pointer to the actual data to be used as argument value.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") LongBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << 3, memAddress(arg_value));
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     * @param arg_value a pointer to data that should be used as the argument value for argument specified by {@code arg_index}. The argument data pointed to by
     *                  {@code arg_value} is copied and the {@code arg_value} pointer can therefore be reused by the application after {@code clSetKernelArg} returns. The
     *                  argument value specified is the value used by all API calls that enqueue kernel ({@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} and {@link #clEnqueueTask EnqueueTask}) until
     *                  the argument value is changed by a call to {@code clSetKernelArg} for {@code kernel}.
     *                  
     *                  <p>If the argument is a memory object (buffer, image or image array), the {@code arg_value} entry will be a pointer to the appropriate buffer, image or
     *                  image array object. The memory object must be created with the context associated with the kernel object. If the argument is a buffer object, the
     *                  {@code arg_value} pointer can be {@code NULL} or point to a {@code NULL} value in which case a {@code NULL} value will be used as the value for the argument declared as
     *                  a pointer to {@code __global} or {@code __constant} memory in the kernel. If the argument is declared with the {@code __local} qualifier, the
     *                  {@code arg_value} entry must be {@code NULL}. If the argument is of type {@code sampler_t}, the {@code arg_value} entry must be a pointer to the sampler
     *                  object.</p>
     *                  
     *                  <p>If the argument is declared to be a pointer of a built-in scalar or vector type, or a user defined structure type in the global or constant address
     *                  space, the memory object specified as argument value must be a buffer object (or {@code NULL}). If the argument is declared with the {@code __constant}
     *                  qualifier, the size in bytes of the memory object cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE} and the number of arguments declared as
     *                  pointers to {@code __constant} memory cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}.</p>
     *                  
     *                  <p>The memory object specified as argument value must be a 2D image object if the argument is declared to be of type {@code image2d_t}. The memory
     *                  object specified as argument value must be a 3D image object if argument is declared to be of type {@code image3d_t}. The memory object specified as
     *                  argument value must be a 1D image object if the argument is declared to be of type {@code image1d_t}. The memory object specified as argument value
     *                  must be a 1D image buffer object if the argument is declared to be of type {@code image1d_buffer_t}. The memory object specified as argument value
     *                  must be a 1D image array object if argument is declared to be of type {@code image1d_array_t}. The memory object specified as argument value must be
     *                  a 2D image array object if argument is declared to be of type {@code image2d_array_t}.</p>
     *                  
     *                  <p>For all other kernel arguments, the {@code arg_value} entry must be a pointer to the actual data to be used as argument value.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") FloatBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << 2, memAddress(arg_value));
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     * @param arg_value a pointer to data that should be used as the argument value for argument specified by {@code arg_index}. The argument data pointed to by
     *                  {@code arg_value} is copied and the {@code arg_value} pointer can therefore be reused by the application after {@code clSetKernelArg} returns. The
     *                  argument value specified is the value used by all API calls that enqueue kernel ({@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} and {@link #clEnqueueTask EnqueueTask}) until
     *                  the argument value is changed by a call to {@code clSetKernelArg} for {@code kernel}.
     *                  
     *                  <p>If the argument is a memory object (buffer, image or image array), the {@code arg_value} entry will be a pointer to the appropriate buffer, image or
     *                  image array object. The memory object must be created with the context associated with the kernel object. If the argument is a buffer object, the
     *                  {@code arg_value} pointer can be {@code NULL} or point to a {@code NULL} value in which case a {@code NULL} value will be used as the value for the argument declared as
     *                  a pointer to {@code __global} or {@code __constant} memory in the kernel. If the argument is declared with the {@code __local} qualifier, the
     *                  {@code arg_value} entry must be {@code NULL}. If the argument is of type {@code sampler_t}, the {@code arg_value} entry must be a pointer to the sampler
     *                  object.</p>
     *                  
     *                  <p>If the argument is declared to be a pointer of a built-in scalar or vector type, or a user defined structure type in the global or constant address
     *                  space, the memory object specified as argument value must be a buffer object (or {@code NULL}). If the argument is declared with the {@code __constant}
     *                  qualifier, the size in bytes of the memory object cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE} and the number of arguments declared as
     *                  pointers to {@code __constant} memory cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}.</p>
     *                  
     *                  <p>The memory object specified as argument value must be a 2D image object if the argument is declared to be of type {@code image2d_t}. The memory
     *                  object specified as argument value must be a 3D image object if argument is declared to be of type {@code image3d_t}. The memory object specified as
     *                  argument value must be a 1D image object if the argument is declared to be of type {@code image1d_t}. The memory object specified as argument value
     *                  must be a 1D image buffer object if the argument is declared to be of type {@code image1d_buffer_t}. The memory object specified as argument value
     *                  must be a 1D image array object if argument is declared to be of type {@code image1d_array_t}. The memory object specified as argument value must be
     *                  a 2D image array object if argument is declared to be of type {@code image2d_array_t}.</p>
     *                  
     *                  <p>For all other kernel arguments, the {@code arg_value} entry must be a pointer to the actual data to be used as argument value.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") DoubleBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << 3, memAddress(arg_value));
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     * @param arg_value a pointer to data that should be used as the argument value for argument specified by {@code arg_index}. The argument data pointed to by
     *                  {@code arg_value} is copied and the {@code arg_value} pointer can therefore be reused by the application after {@code clSetKernelArg} returns. The
     *                  argument value specified is the value used by all API calls that enqueue kernel ({@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} and {@link #clEnqueueTask EnqueueTask}) until
     *                  the argument value is changed by a call to {@code clSetKernelArg} for {@code kernel}.
     *                  
     *                  <p>If the argument is a memory object (buffer, image or image array), the {@code arg_value} entry will be a pointer to the appropriate buffer, image or
     *                  image array object. The memory object must be created with the context associated with the kernel object. If the argument is a buffer object, the
     *                  {@code arg_value} pointer can be {@code NULL} or point to a {@code NULL} value in which case a {@code NULL} value will be used as the value for the argument declared as
     *                  a pointer to {@code __global} or {@code __constant} memory in the kernel. If the argument is declared with the {@code __local} qualifier, the
     *                  {@code arg_value} entry must be {@code NULL}. If the argument is of type {@code sampler_t}, the {@code arg_value} entry must be a pointer to the sampler
     *                  object.</p>
     *                  
     *                  <p>If the argument is declared to be a pointer of a built-in scalar or vector type, or a user defined structure type in the global or constant address
     *                  space, the memory object specified as argument value must be a buffer object (or {@code NULL}). If the argument is declared with the {@code __constant}
     *                  qualifier, the size in bytes of the memory object cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_BUFFER_SIZE DEVICE_MAX_CONSTANT_BUFFER_SIZE} and the number of arguments declared as
     *                  pointers to {@code __constant} memory cannot exceed {@link #CL_DEVICE_MAX_CONSTANT_ARGS DEVICE_MAX_CONSTANT_ARGS}.</p>
     *                  
     *                  <p>The memory object specified as argument value must be a 2D image object if the argument is declared to be of type {@code image2d_t}. The memory
     *                  object specified as argument value must be a 3D image object if argument is declared to be of type {@code image3d_t}. The memory object specified as
     *                  argument value must be a 1D image object if the argument is declared to be of type {@code image1d_t}. The memory object specified as argument value
     *                  must be a 1D image buffer object if the argument is declared to be of type {@code image1d_buffer_t}. The memory object specified as argument value
     *                  must be a 1D image array object if argument is declared to be of type {@code image1d_array_t}. The memory object specified as argument value must be
     *                  a 2D image array object if argument is declared to be of type {@code image2d_array_t}.</p>
     *                  
     *                  <p>For all other kernel arguments, the {@code arg_value} entry must be a pointer to the actual data to be used as argument value.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") PointerBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << POINTER_SHIFT, memAddress(arg_value));
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg1b(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") byte arg0) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer arg_value = stack.bytes(arg0);
            return nclSetKernelArg(kernel, arg_index, (1 << 0) * 1, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg2b(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") byte arg0, byte arg1) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer arg_value = stack.bytes(arg0, arg1);
            return nclSetKernelArg(kernel, arg_index, (1 << 0) * 2, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg4b(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") byte arg0, byte arg1, byte arg2, byte arg3) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ByteBuffer arg_value = stack.bytes(arg0, arg1, arg2, arg3);
            return nclSetKernelArg(kernel, arg_index, (1 << 0) * 4, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg1s(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") short arg0) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ShortBuffer arg_value = stack.shorts(arg0);
            return nclSetKernelArg(kernel, arg_index, (1 << 1) * 1, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg2s(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") short arg0, short arg1) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ShortBuffer arg_value = stack.shorts(arg0, arg1);
            return nclSetKernelArg(kernel, arg_index, (1 << 1) * 2, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg4s(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") short arg0, short arg1, short arg2, short arg3) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            ShortBuffer arg_value = stack.shorts(arg0, arg1, arg2, arg3);
            return nclSetKernelArg(kernel, arg_index, (1 << 1) * 4, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg1i(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") int arg0) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arg_value = stack.ints(arg0);
            return nclSetKernelArg(kernel, arg_index, (1 << 2) * 1, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg2i(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") int arg0, int arg1) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arg_value = stack.ints(arg0, arg1);
            return nclSetKernelArg(kernel, arg_index, (1 << 2) * 2, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg4i(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") int arg0, int arg1, int arg2, int arg3) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            IntBuffer arg_value = stack.ints(arg0, arg1, arg2, arg3);
            return nclSetKernelArg(kernel, arg_index, (1 << 2) * 4, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg1l(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") long arg0) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer arg_value = stack.longs(arg0);
            return nclSetKernelArg(kernel, arg_index, (1 << 3) * 1, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg2l(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") long arg0, long arg1) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer arg_value = stack.longs(arg0, arg1);
            return nclSetKernelArg(kernel, arg_index, (1 << 3) * 2, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg4l(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") long arg0, long arg1, long arg2, long arg3) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            LongBuffer arg_value = stack.longs(arg0, arg1, arg2, arg3);
            return nclSetKernelArg(kernel, arg_index, (1 << 3) * 4, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg1f(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") float arg0) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer arg_value = stack.floats(arg0);
            return nclSetKernelArg(kernel, arg_index, (1 << 2) * 1, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg2f(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") float arg0, float arg1) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer arg_value = stack.floats(arg0, arg1);
            return nclSetKernelArg(kernel, arg_index, (1 << 2) * 2, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg4f(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") float arg0, float arg1, float arg2, float arg3) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            FloatBuffer arg_value = stack.floats(arg0, arg1, arg2, arg3);
            return nclSetKernelArg(kernel, arg_index, (1 << 2) * 4, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg1d(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") double arg0) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer arg_value = stack.doubles(arg0);
            return nclSetKernelArg(kernel, arg_index, (1 << 3) * 1, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg2d(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") double arg0, double arg1) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer arg_value = stack.doubles(arg0, arg1);
            return nclSetKernelArg(kernel, arg_index, (1 << 3) * 2, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg4d(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") double arg0, double arg1, double arg2, double arg3) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            DoubleBuffer arg_value = stack.doubles(arg0, arg1, arg2, arg3);
            return nclSetKernelArg(kernel, arg_index, (1 << 3) * 4, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg1p(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") long arg0) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer arg_value = stack.pointers(arg0);
            return nclSetKernelArg(kernel, arg_index, (1 << POINTER_SHIFT) * 1, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg2p(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") long arg0, long arg1) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer arg_value = stack.pointers(arg0, arg1);
            return nclSetKernelArg(kernel, arg_index, (1 << POINTER_SHIFT) * 2, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Set the argument value for a specific argument of a kernel.
     *
     * @param kernel    a valid kernel object
     * @param arg_index the argument index. Arguments to the kernel are referred by indices that go from 0 for the leftmost argument to {@code n - 1}, where {@code n} is
     *                  the total number of arguments declared by a kernel.
     *                  
     *                  <p>For example, consider the following kernel:</p>
     *                  
     *                  <pre><code>
     *                  kernel void image_filter (
     *                      int n, int m,
     *                      __constant float *filter_weights,
     *                      __read_only image2d_t src_image,
     *                      __write_only image2d_t dst_image
     *                  ) {
     *                      &hellip;
     *                  }</code></pre>
     *                  
     *                  <p>Argument index values for image_filter will be 0 for {@code n}, 1 for {@code m}, 2 for {@code filter_weights}, 3 for {@code src_image} and 4 for
     *                  {@code dst_image}.</p>
     *                  
     *                  <p><strong>NOTE</strong>: A kernel object does not update the reference count for objects such as memory, sampler objects specified as argument values
     *                  by {@code clSetKernelArg}, Users may not rely on a kernel object to retain objects specified as argument values to the kernel.</p>
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_ARG_INDEX INVALID_ARG_INDEX} if {@code arg_index} is not a valid argument index.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if {@code arg_value} specified is not a valid value.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} for an argument declared to be a memory object when the specified {@code arg_value} is not a valid memory object.</li>
     *         <li>{@link #CL_INVALID_SAMPLER INVALID_SAMPLER} for an argument declared to be of type {@code sampler_t} when the specified {@code arg_value} is not a valid sampler object.</li>
     *         <li>{@link #CL_INVALID_ARG_SIZE INVALID_ARG_SIZE} if {@code arg_size} does not match the size of the data type for an argument that is not a memory object or if the
     *         argument is a memory object and {@code arg_size != sizeof(cl_mem)} or if {@code arg_size} is zero and the argument is declared with the
     *         {@code __local} qualifier or if the argument is a sampler and {@code arg_size != sizeof(cl_sampler)}.</li>
     *         <li>{@link CL22#CL_MAX_SIZE_RESTRICTION_EXCEEDED MAX_SIZE_RESTRICTION_EXCEEDED} if the size in bytes of the memory object (if the argument was declared with constant qualifier) or {@code arg_size}
     *         (if the argument was declared with local qualifier) exceed the maximum size restriction that was set with the optional language attribute. The
     *         optional attribute can be {@code cl::max_size} defined in OpenCL 2.2 C++ Kernel Language specification or {@code SpvDecorationMaxByteOffset}
     *         defined in SPIR-V 1.2 Specification.</li>
     *         <li>{@link #CL_INVALID_ARG_VALUE INVALID_ARG_VALUE} if the argument is an image declared with the {@code read_only} qualifier and {@code arg_value} refers to an image
     *         object created with {@code cl_mem_flags} of {@link #CL_MEM_WRITE_ONLY MEM_WRITE_ONLY} or if the image argument is declared with the {@code write_only} qualifier
     *         and {@code arg_value} refers to an image object created with {@code cl_mem_flags} of {@link #CL_MEM_READ_ONLY MEM_READ_ONLY}.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg4p(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") long arg0, long arg1, long arg2, long arg3) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer arg_value = stack.pointers(arg0, arg1, arg2, arg3);
            return nclSetKernelArg(kernel, arg_index, (1 << POINTER_SHIFT) * 4, memAddress(arg_value));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clGetKernelInfo ] ---

    /**
     * Unsafe version of: {@link #clGetKernelInfo GetKernelInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetKernelInfo(long kernel, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelInfo;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPPI(kernel, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns information about a kernel object.
     *
     * @param kernel               the kernel object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_FUNCTION_NAME KERNEL_FUNCTION_NAME}</td><td>{@link #CL_KERNEL_NUM_ARGS KERNEL_NUM_ARGS}</td><td>{@link #CL_KERNEL_REFERENCE_COUNT KERNEL_REFERENCE_COUNT}</td><td>{@link #CL_KERNEL_CONTEXT KERNEL_CONTEXT}</td></tr><tr><td>{@link #CL_KERNEL_PROGRAM KERNEL_PROGRAM}</td><td>{@link CL12#CL_KERNEL_ATTRIBUTES KERNEL_ATTRIBUTES}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelInfo(kernel, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about a kernel object.
     *
     * @param kernel               the kernel object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_FUNCTION_NAME KERNEL_FUNCTION_NAME}</td><td>{@link #CL_KERNEL_NUM_ARGS KERNEL_NUM_ARGS}</td><td>{@link #CL_KERNEL_REFERENCE_COUNT KERNEL_REFERENCE_COUNT}</td><td>{@link #CL_KERNEL_CONTEXT KERNEL_CONTEXT}</td></tr><tr><td>{@link #CL_KERNEL_PROGRAM KERNEL_PROGRAM}</td><td>{@link CL12#CL_KERNEL_ATTRIBUTES KERNEL_ATTRIBUTES}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelInfo(kernel, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about a kernel object.
     *
     * @param kernel               the kernel object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_FUNCTION_NAME KERNEL_FUNCTION_NAME}</td><td>{@link #CL_KERNEL_NUM_ARGS KERNEL_NUM_ARGS}</td><td>{@link #CL_KERNEL_REFERENCE_COUNT KERNEL_REFERENCE_COUNT}</td><td>{@link #CL_KERNEL_CONTEXT KERNEL_CONTEXT}</td></tr><tr><td>{@link #CL_KERNEL_PROGRAM KERNEL_PROGRAM}</td><td>{@link CL12#CL_KERNEL_ATTRIBUTES KERNEL_ATTRIBUTES}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelInfo(kernel, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clGetKernelWorkGroupInfo ] ---

    /**
     * Unsafe version of: {@link #clGetKernelWorkGroupInfo GetKernelWorkGroupInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetKernelWorkGroupInfo(long kernel, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelWorkGroupInfo;
        if (CHECKS) {
            check(kernel);
            check(device);
        }
        return callPPPPPI(kernel, device, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns information about the kernel object that may be specific to a device.
     *
     * @param kernel               the kernel object being queried
     * @param device               identifies a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL context
     *                             that is associated with {@code kernel}. If the list of devices associated with {@code kernel} is a single device, {@code device} can be a {@code NULL} value.
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_WORK_GROUP_SIZE KERNEL_WORK_GROUP_SIZE}</td><td>{@link #CL_KERNEL_COMPILE_WORK_GROUP_SIZE KERNEL_COMPILE_WORK_GROUP_SIZE}</td></tr><tr><td>{@link #CL_KERNEL_LOCAL_MEM_SIZE KERNEL_LOCAL_MEM_SIZE}</td><td>{@link CL11#CL_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE}</td></tr><tr><td>{@link CL11#CL_KERNEL_PRIVATE_MEM_SIZE KERNEL_PRIVATE_MEM_SIZE}</td><td>{@link CL12#CL_KERNEL_GLOBAL_WORK_SIZE KERNEL_GLOBAL_WORK_SIZE}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not in the list of devices associated with {@code kernel} or if {@code device} is {@code NULL} but there is
     *         more than one device associated with {@code kernel}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is {@link CL12#CL_KERNEL_GLOBAL_WORK_SIZE KERNEL_GLOBAL_WORK_SIZE} and {@code device} is not a custom device or kernel is
     *         not a built-in kernel.</li>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelWorkGroupInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelWorkGroupInfo(kernel, device, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about the kernel object that may be specific to a device.
     *
     * @param kernel               the kernel object being queried
     * @param device               identifies a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL context
     *                             that is associated with {@code kernel}. If the list of devices associated with {@code kernel} is a single device, {@code device} can be a {@code NULL} value.
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_WORK_GROUP_SIZE KERNEL_WORK_GROUP_SIZE}</td><td>{@link #CL_KERNEL_COMPILE_WORK_GROUP_SIZE KERNEL_COMPILE_WORK_GROUP_SIZE}</td></tr><tr><td>{@link #CL_KERNEL_LOCAL_MEM_SIZE KERNEL_LOCAL_MEM_SIZE}</td><td>{@link CL11#CL_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE}</td></tr><tr><td>{@link CL11#CL_KERNEL_PRIVATE_MEM_SIZE KERNEL_PRIVATE_MEM_SIZE}</td><td>{@link CL12#CL_KERNEL_GLOBAL_WORK_SIZE KERNEL_GLOBAL_WORK_SIZE}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not in the list of devices associated with {@code kernel} or if {@code device} is {@code NULL} but there is
     *         more than one device associated with {@code kernel}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is {@link CL12#CL_KERNEL_GLOBAL_WORK_SIZE KERNEL_GLOBAL_WORK_SIZE} and {@code device} is not a custom device or kernel is
     *         not a built-in kernel.</li>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelWorkGroupInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelWorkGroupInfo(kernel, device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about the kernel object that may be specific to a device.
     *
     * @param kernel               the kernel object being queried
     * @param device               identifies a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL context
     *                             that is associated with {@code kernel}. If the list of devices associated with {@code kernel} is a single device, {@code device} can be a {@code NULL} value.
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_WORK_GROUP_SIZE KERNEL_WORK_GROUP_SIZE}</td><td>{@link #CL_KERNEL_COMPILE_WORK_GROUP_SIZE KERNEL_COMPILE_WORK_GROUP_SIZE}</td></tr><tr><td>{@link #CL_KERNEL_LOCAL_MEM_SIZE KERNEL_LOCAL_MEM_SIZE}</td><td>{@link CL11#CL_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE}</td></tr><tr><td>{@link CL11#CL_KERNEL_PRIVATE_MEM_SIZE KERNEL_PRIVATE_MEM_SIZE}</td><td>{@link CL12#CL_KERNEL_GLOBAL_WORK_SIZE KERNEL_GLOBAL_WORK_SIZE}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not in the list of devices associated with {@code kernel} or if {@code device} is {@code NULL} but there is
     *         more than one device associated with {@code kernel}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is {@link CL12#CL_KERNEL_GLOBAL_WORK_SIZE KERNEL_GLOBAL_WORK_SIZE} and {@code device} is not a custom device or kernel is
     *         not a built-in kernel.</li>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelWorkGroupInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @Nullable @NativeType("void *") LongBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelWorkGroupInfo(kernel, device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about the kernel object that may be specific to a device.
     *
     * @param kernel               the kernel object being queried
     * @param device               identifies a specific device in the list of devices associated with {@code kernel}. The list of devices is the list of devices in the OpenCL context
     *                             that is associated with {@code kernel}. If the list of devices associated with {@code kernel} is a single device, {@code device} can be a {@code NULL} value.
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_KERNEL_WORK_GROUP_SIZE KERNEL_WORK_GROUP_SIZE}</td><td>{@link #CL_KERNEL_COMPILE_WORK_GROUP_SIZE KERNEL_COMPILE_WORK_GROUP_SIZE}</td></tr><tr><td>{@link #CL_KERNEL_LOCAL_MEM_SIZE KERNEL_LOCAL_MEM_SIZE}</td><td>{@link CL11#CL_KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE KERNEL_PREFERRED_WORK_GROUP_SIZE_MULTIPLE}</td></tr><tr><td>{@link CL11#CL_KERNEL_PRIVATE_MEM_SIZE KERNEL_PRIVATE_MEM_SIZE}</td><td>{@link CL12#CL_KERNEL_GLOBAL_WORK_SIZE KERNEL_GLOBAL_WORK_SIZE}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_DEVICE INVALID_DEVICE} if {@code device} is not in the list of devices associated with {@code kernel} or if {@code device} is {@code NULL} but there is
     *         more than one device associated with {@code kernel}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is {@link CL12#CL_KERNEL_GLOBAL_WORK_SIZE KERNEL_GLOBAL_WORK_SIZE} and {@code device} is not a custom device or kernel is
     *         not a built-in kernel.</li>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is a not a valid kernel object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelWorkGroupInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelWorkGroupInfo(kernel, device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clEnqueueNDRangeKernel ] ---

    /**
     * Unsafe version of: {@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueNDRangeKernel(long command_queue, long kernel, int work_dim, long global_work_offset, long global_work_size, long local_work_size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueNDRangeKernel;
        if (CHECKS) {
            check(command_queue);
            check(kernel);
        }
        return callPPPPPPPI(command_queue, kernel, work_dim, global_work_offset, global_work_size, local_work_size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to execute a kernel on a device.
     *
     * @param command_queue      a valid command-queue. The kernel will be queued for execution on the device associated with {@code command_queue}.
     * @param kernel             a valid kernel object. The OpenCL context associated with {@code kernel} and {@code command_queue} must be the same.
     * @param work_dim           the number of dimensions used to specify the global work-items and work-items in the work-group. {@code work_dim} must be greater than zero and less
     *                           than or equal to {@link #CL_DEVICE_MAX_WORK_ITEM_DIMENSIONS DEVICE_MAX_WORK_ITEM_DIMENSIONS}.
     * @param global_work_offset can be used to specify an array of {@code work_dim} unsigned values that describe the offset used to calculate the global ID of a work-item. If
     *                           {@code global_work_offset} is {@code NULL}, the global IDs start at offset <code>(0, 0, &hellip; 0)</code>.
     * @param global_work_size   points to an array of {@code work_dim} unsigned values that describe the number of global work-items in {@code work_dim} dimensions that will
     *                           execute the kernel function. The total number of global work-items is computed as <code>global_work_size[0] * &hellip; * global_work_size[work_dim – 1]</code>.
     * @param local_work_size    points to an array of {@code work_dim} unsigned values that describe the number of work-items that make up a work-group (also referred to as the
     *                           size of the work-group) that will execute the kernel specified by {@code kernel}. The total number of work-items in a work-group is computed as
     *                           <code>local_work_size[0] * &hellip; * local_work_size[work_dim – 1]</code>. The total number of work-items in the work-group must be less than or equal to
     *                           the {@link #CL_DEVICE_MAX_WORK_GROUP_SIZE DEVICE_MAX_WORK_GROUP_SIZE} value and the number of work-items specified in <code>local_work_size[0], &hellip; local_work_size[work_dim – 1]</code>
     *                           must be less than or equal to the corresponding values specified by {@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}<code>[0]</code>, &hellip;
     *                           {@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}{@code [work_dim – 1]}. The explicitly specified {@code local_work_size} will be used to determine how to
     *                           break the global work-items specified by {@code global_work_size} into appropriate work-group instances. If {@code local_work_size} is specified, the
     *                           values specified in <code>global_work_size[0], &hellip; global_work_size[work_dim - 1]</code> must be evenly divisible by the corresponding values
     *                           specified in <code>local_work_size[0], &hellip; local_work_size[work_dim – 1]</code>.
     *                           
     *                           <p>The work-group size to be used for kernel can also be specified in the program source using the
     *                           {@code __attribute__((reqd_work_group_size(X, Y, Z)))} qualifier. In this case the size of work group specified by {@code local_work_size} must
     *                           match the value specified by the {@code reqd_work_group_size} attribute qualifier.</p>
     *                           
     *                           <p>{@code local_work_size} can also be a {@code NULL} value in which case the OpenCL implementation will determine how to be break the global work-items into
     *                           appropriate work-group instances.</p>
     * @param event_wait_list    a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                           does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                           {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event              Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                           {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                           complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                           {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the kernel execution was successfully queued. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_PROGRAM_EXECUTABLE INVALID_PROGRAM_EXECUTABLE} if there is no successfully built program executable available for device associated with {@code command_queue}.</li>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_KERNEL INVALID_KERNEL} if {@code kernel} is not a valid kernel object.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and {@code kernel} are not the same or if the context associated with
     *         {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_KERNEL_ARGS INVALID_KERNEL_ARGS} if the kernel argument values have not been specified.</li>
     *         <li>{@link #CL_INVALID_WORK_DIMENSION INVALID_WORK_DIMENSION} if {@code work_dim} is not a valid value (i.e. a value between 1 and 3).</li>
     *         <li>{@link #CL_INVALID_GLOBAL_WORK_SIZE INVALID_GLOBAL_WORK_SIZE} if {@code global_work_size} is {@code NULL}, or if any of the values specified in
     *         <code>global_work_size[0], &hellip; global_work_size[work_dim – 1]</code> are 0 or exceed the range given by the {@code sizeof(size_t)} for the device
     *         on which the kernel execution will be enqueued.</li>
     *         <li>{@link #CL_INVALID_GLOBAL_OFFSET INVALID_GLOBAL_OFFSET} if the value specified in {@code global_work_size} + the corresponding values in {@code global_work_offset} for
     *         any dimensions is greater than the {@code sizeof(size_t)} for the device on which the kernel execution will be enqueued.</li>
     *         <li>{@link #CL_INVALID_WORK_GROUP_SIZE INVALID_WORK_GROUP_SIZE} if {@code local_work_size} is specified and number of work-items specified by {@code global_work_size} is not
     *         evenly divisible by size of work-group given by {@code local_work_size} or does not match the work-group size specified for kernel using the
     *         {@code __attribute__((reqd_work_group_size(X, Y, Z)))} qualifier in program source.</li>
     *         <li>{@link #CL_INVALID_WORK_GROUP_SIZE INVALID_WORK_GROUP_SIZE} if {@code local_work_size} is specified and the total number of work-items in the work-group computed as
     *         <code>local_work_size[0] * &hellip; * local_work_size[work_dim – 1]</code> is greater than the value specified by {@link #CL_DEVICE_MAX_WORK_GROUP_SIZE DEVICE_MAX_WORK_GROUP_SIZE}</li>
     *         <li>{@link #CL_INVALID_WORK_GROUP_SIZE INVALID_WORK_GROUP_SIZE} if {@code local_work_size} is {@code NULL} and the {@code __attribute__((reqd_work_group_size(X, Y, Z)))} qualifier is used to
     *         declare the work-group size for kernel in the program source.</li>
     *         <li>{@link #CL_INVALID_WORK_ITEM_SIZE INVALID_WORK_ITEM_SIZE} if the number of work-items specified in any of <code>local_work_size[0], &hellip; local_work_size[work_dim – 1]</code>
     *         is greater than the corresponding values specified by {@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}{@code [0]}, &hellip; {@link #CL_DEVICE_MAX_WORK_ITEM_SIZES DEVICE_MAX_WORK_ITEM_SIZES}{@code [work_dim – 1]}.</li>
     *         <li>{@link CL11#CL_MISALIGNED_SUB_BUFFER_OFFSET MISALIGNED_SUB_BUFFER_OFFSET} if a sub-buffer object is specified as the value for an argument that is a buffer object and the offset
     *         specified when the sub-buffer object is created is not aligned to {@link #CL_DEVICE_MEM_BASE_ADDR_ALIGN DEVICE_MEM_BASE_ADDR_ALIGN} value for device associated with queue.</li>
     *         <li>{@link #CL_INVALID_IMAGE_SIZE INVALID_IMAGE_SIZE} if an image object is specified as an argument value and the image dimensions (image width, height, specified or
     *         compute row and/or slice pitch) are not supported by device associated with queue.</li>
     *         <li>{@link #CL_IMAGE_FORMAT_NOT_SUPPORTED IMAGE_FORMAT_NOT_SUPPORTED} if an image object is specified as an argument value and the image format (image channel order and data type)
     *         is not supported by device associated with queue.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to queue the execution instance of kernel on the command-queue because of insufficient resources
     *         needed to execute the kernel. For example, the explicitly specified {@code local_work_size} causes a failure to execute the kernel because of
     *         insufficient resources such as registers or local memory. Another example would be the number of read-only image args used in kernel exceed the
     *         {@link #CL_DEVICE_MAX_READ_IMAGE_ARGS DEVICE_MAX_READ_IMAGE_ARGS} value for device or the number of write-only image args used in kernel exceed the
     *         {@link #CL_DEVICE_MAX_WRITE_IMAGE_ARGS DEVICE_MAX_WRITE_IMAGE_ARGS} value for device or the number of samplers used in kernel exceed {@link #CL_DEVICE_MAX_SAMPLERS DEVICE_MAX_SAMPLERS} for device.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with image or buffer objects specified
     *         as arguments to kernel.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueNDRangeKernel.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueNDRangeKernel(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int work_dim, @Nullable @NativeType("size_t const *") PointerBuffer global_work_offset, @Nullable @NativeType("size_t const *") PointerBuffer global_work_size, @Nullable @NativeType("size_t const *") PointerBuffer local_work_size, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(global_work_offset, work_dim);
            checkSafe(global_work_size, work_dim);
            checkSafe(local_work_size, work_dim);
            checkSafe(event, 1);
        }
        return nclEnqueueNDRangeKernel(command_queue, kernel, work_dim, memAddressSafe(global_work_offset), memAddressSafe(global_work_size), memAddressSafe(local_work_size), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueTask ] ---

    /**
     * Unsafe version of: {@link #clEnqueueTask EnqueueTask}
     *
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueTask(long command_queue, long kernel, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueTask;
        if (CHECKS) {
            check(command_queue);
            check(kernel);
        }
        return callPPPPI(command_queue, kernel, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to execute a kernel on a device. The kernel is executed using a single work-item.
     * 
     * <p>{@code clEnqueueTask} is equivalent to calling {@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel} with {@code work_dim = 1}, {@code global_work_offset = NULL},
     * {@code global_work_size[0]} set to 1 and {@code local_work_size[0]} set to 1.</p>
     *
     * @param command_queue   a valid command-queue. The kernel will be queued for execution on the device associated with {@code command_queue}.
     * @param kernel          a valid kernel object. The OpenCL context associated with {@code kernel} and {@code command_queue} must be the same.
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the kernel execution was successfully queued. Otherwise, see {@link #clEnqueueNDRangeKernel EnqueueNDRangeKernel}.
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.2/docs/man/xhtml/clEnqueueTask.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.2</em>
     */
    @NativeType("cl_int")
    public static int clEnqueueTask(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_kernel") long kernel, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueTask(command_queue, kernel, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueNativeKernel ] ---

    /**
     * Unsafe version of: {@link #clEnqueueNativeKernel EnqueueNativeKernel}
     *
     * @param cb_args                 the size in bytes of the args list that {@code args} points to.
     *                                
     *                                <p>The data pointed to by {@code args} and {@code cb_args} bytes in size will be copied and a pointer to this copied region will be passed to
     *                                {@code user_func}. The copy needs to be done because the memory objects (cl_mem values) that args may contain need to be modified and replaced by
     *                                appropriate pointers to global memory. When {@code clEnqueueNativeKernel} returns, the memory region pointed to by args can be reused by the
     *                                application.</p>
     * @param num_mem_objects         the number of buffer objects that are passed in {@code args}
     * @param num_events_in_wait_list the number of events in {@code event_wait_list}
     */
    public static int nclEnqueueNativeKernel(long command_queue, long user_func, long args, long cb_args, int num_mem_objects, long mem_list, long args_mem_loc, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueNativeKernel;
        if (CHECKS) {
            check(command_queue);
        }
        return callPPPPPPPPI(command_queue, user_func, args, cb_args, num_mem_objects, mem_list, args_mem_loc, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /**
     * Enqueues a command to execute a native C/C++ function not compiled using the OpenCL compiler.
     *
     * @param command_queue   a valid command-queue. A native user function can only be executed on a command-queue created on a device that has {@link #CL_EXEC_NATIVE_KERNEL EXEC_NATIVE_KERNEL}
     *                        capability set in {@link #CL_DEVICE_EXECUTION_CAPABILITIES DEVICE_EXECUTION_CAPABILITIES}.
     * @param user_func       a pointer to a host-callable user function
     * @param args            a pointer to the args list that {@code user_func} should be called with
     * @param mem_list        a list of valid buffer objects, if {@code num_mem_objects} &gt; 0. The buffer object values specified in {@code mem_list} are memory object handles
     *                        (cl_mem values) returned by {@link #clCreateBuffer CreateBuffer} or {@code NULL}.
     * @param args_mem_loc    a pointer to appropriate locations that {@code args} points to where memory object handles (cl_mem values) are stored. Before the user function is
     *                        executed, the memory object handles are replaced by pointers to global memory.
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the user function execution instance was successfully queued. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code user_func} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code args} is a {@code NULL} value and {@code cb_args} &gt; 0, or if {@code args} is a {@code NULL} value and
     *         {@code num_mem_objects} &gt; 0.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code args} is not {@code NULL} and {@code cb_args} is 0.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_mem_objects} &gt; 0 and {@code mem_list} or {@code args_mem_loc} are {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_mem_objects} = 0 and {@code mem_list} or {@code args_mem_loc} are not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} cannot execute the native kernel.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if one or more memory objects specified in {@code mem_list} are not valid or are not buffer objects.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to queue the execution instance of kernel on the command-queue because of insufficient resources
     *         needed to execute the kernel.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer objects specified as
     *         arguments to kernel.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueNativeKernel.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueNativeKernel(@NativeType("cl_command_queue") long command_queue, @NativeType("void (*) (void *)") CLNativeKernelI user_func, @Nullable @NativeType("void *") ByteBuffer args, @Nullable @NativeType("cl_mem const *") PointerBuffer mem_list, @Nullable @NativeType("void const **") PointerBuffer args_mem_loc, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(args_mem_loc, remainingSafe(mem_list));
            checkSafe(event, 1);
        }
        return nclEnqueueNativeKernel(command_queue, user_func.address(), memAddressSafe(args), remainingSafe(args), remainingSafe(mem_list), memAddressSafe(mem_list), memAddressSafe(args_mem_loc), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /**
     * Enqueues a command to execute a native C/C++ function not compiled using the OpenCL compiler.
     *
     * @param command_queue   a valid command-queue. A native user function can only be executed on a command-queue created on a device that has {@link #CL_EXEC_NATIVE_KERNEL EXEC_NATIVE_KERNEL}
     *                        capability set in {@link #CL_DEVICE_EXECUTION_CAPABILITIES DEVICE_EXECUTION_CAPABILITIES}.
     * @param user_func       a pointer to a host-callable user function
     * @param args            a pointer to the args list that {@code user_func} should be called with
     * @param event_wait_list a list of events that need to complete before this particular command can be executed. If {@code event_wait_list} is {@code NULL}, then this particular command
     *                        does not wait on any event to complete. The events specified in {@code event_wait_list} act as synchronization points. The context associated with events in
     *                        {@code event_wait_list} and {@code command_queue} must be the same.
     * @param event           Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                        {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                        complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                        {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the user function execution instance was successfully queued. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if context associated with {@code command_queue} and events in {@code event_wait_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code user_func} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code args} is a {@code NULL} value and {@code cb_args} &gt; 0, or if {@code args} is a {@code NULL} value and
     *         {@code num_mem_objects} &gt; 0.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code args} is not {@code NULL} and {@code cb_args} is 0.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_mem_objects} &gt; 0 and {@code mem_list} or {@code args_mem_loc} are {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_mem_objects} = 0 and {@code mem_list} or {@code args_mem_loc} are not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_OPERATION INVALID_OPERATION} if the device associated with {@code command_queue} cannot execute the native kernel.</li>
     *         <li>{@link #CL_INVALID_MEM_OBJECT INVALID_MEM_OBJECT} if one or more memory objects specified in {@code mem_list} are not valid or are not buffer objects.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to queue the execution instance of kernel on the command-queue because of insufficient resources
     *         needed to execute the kernel.</li>
     *         <li>{@link #CL_MEM_OBJECT_ALLOCATION_FAILURE MEM_OBJECT_ALLOCATION_FAILURE} if there is a failure to allocate memory for data store associated with buffer objects specified as
     *         arguments to kernel.</li>
     *         <li>{@link #CL_INVALID_EVENT_WAIT_LIST INVALID_EVENT_WAIT_LIST} if {@code event_wait_list} is {@code NULL} and {@code num_events_in_wait_list} &gt; 0, or {@code event_wait_list} is not
     *         {@code NULL} and {@code num_events_in_wait_list} is 0, or if event objects in {@code event_wait_list} are not valid events.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueNativeKernel.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueNativeKernel(@NativeType("cl_command_queue") long command_queue, @NativeType("void (*) (void *)") CLNativeKernelI user_func, @Nullable @NativeType("void *") ByteBuffer args, @NativeType("cl_mem const *") long memobj, @NativeType("void const **") long memobj_loc, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer mem_list = stack.pointers(memobj);
            PointerBuffer args_mem_loc = stack.pointers(memobj_loc);
            return nclEnqueueNativeKernel(command_queue, user_func.address(), memAddressSafe(args), remainingSafe(args), 1, memAddress(mem_list), memAddress(args_mem_loc), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clWaitForEvents ] ---

    /**
     * Unsafe version of: {@link #clWaitForEvents WaitForEvents}
     *
     * @param num_events the number of events in {@code event_list}
     */
    public static int nclWaitForEvents(int num_events, long event_list) {
        long __functionAddress = CL.getICD().clWaitForEvents;
        return callPI(num_events, event_list, __functionAddress);
    }

    /**
     * Waits on the host thread for commands identified by event objects in {@code event_list} to complete. A command is considered complete if its execution
     * status is {@link #CL_COMPLETE COMPLETE} or a negative value. The events specified in {@code event_list} act as synchronization points.
     *
     * @param event_list the list of events
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the execution status of all events in event_list is {@link #CL_COMPLETE COMPLETE}. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_events} is zero or {@code event_list} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if events specified in {@code event_list} do not belong to the same context.</li>
     *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if event objects specified in {@code event_list} are not valid event objects.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the execution status of any of the events in {@code event_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clWaitForEvents.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clWaitForEvents(@NativeType("cl_event const *") PointerBuffer event_list) {
        return nclWaitForEvents(event_list.remaining(), memAddress(event_list));
    }

    /**
     * Waits on the host thread for commands identified by event objects in {@code event_list} to complete. A command is considered complete if its execution
     * status is {@link #CL_COMPLETE COMPLETE} or a negative value. The events specified in {@code event_list} act as synchronization points.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the execution status of all events in event_list is {@link #CL_COMPLETE COMPLETE}. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_events} is zero or {@code event_list} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if events specified in {@code event_list} do not belong to the same context.</li>
     *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if event objects specified in {@code event_list} are not valid event objects.</li>
     *         <li>{@link CL11#CL_EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST EXEC_STATUS_ERROR_FOR_EVENTS_IN_WAIT_LIST} if the execution status of any of the events in {@code event_list} is a negative integer value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clWaitForEvents.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clWaitForEvents(@NativeType("cl_event const *") long event) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer event_list = stack.pointers(event);
            return nclWaitForEvents(1, memAddress(event_list));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clGetEventInfo ] ---

    /**
     * Unsafe version of: {@link #clGetEventInfo GetEventInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetEventInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetEventInfo;
        if (CHECKS) {
            check(event);
        }
        return callPPPPI(event, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns information about an event object.
     * 
     * <p>Using {@code clGetEventInfo} to determine if a command identified by event has finished execution (i.e. {@link #CL_EVENT_COMMAND_EXECUTION_STATUS EVENT_COMMAND_EXECUTION_STATUS}
     * returns {@link #CL_COMPLETE COMPLETE}) is not a synchronization point. There are no guarantees that the memory objects being modified by command associated with
     * event will be visible to other enqueued commands.</p>
     *
     * @param event                the event object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_EVENT_COMMAND_QUEUE EVENT_COMMAND_QUEUE}</td><td>{@link #CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}</td><td>{@link #CL_EVENT_REFERENCE_COUNT EVENT_REFERENCE_COUNT}</td><td>{@link #CL_EVENT_COMMAND_EXECUTION_STATUS EVENT_COMMAND_EXECUTION_STATUS}</td></tr><tr><td>{@link CL11#CL_EVENT_CONTEXT EVENT_CONTEXT}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if information to query given in {@code param_name} cannot be queried for event.</li>
     *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if {@code event} is a not a valid event object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetEventInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetEventInfo(@NativeType("cl_event") long event, @NativeType("cl_event_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetEventInfo(event, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about an event object.
     * 
     * <p>Using {@code clGetEventInfo} to determine if a command identified by event has finished execution (i.e. {@link #CL_EVENT_COMMAND_EXECUTION_STATUS EVENT_COMMAND_EXECUTION_STATUS}
     * returns {@link #CL_COMPLETE COMPLETE}) is not a synchronization point. There are no guarantees that the memory objects being modified by command associated with
     * event will be visible to other enqueued commands.</p>
     *
     * @param event                the event object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_EVENT_COMMAND_QUEUE EVENT_COMMAND_QUEUE}</td><td>{@link #CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}</td><td>{@link #CL_EVENT_REFERENCE_COUNT EVENT_REFERENCE_COUNT}</td><td>{@link #CL_EVENT_COMMAND_EXECUTION_STATUS EVENT_COMMAND_EXECUTION_STATUS}</td></tr><tr><td>{@link CL11#CL_EVENT_CONTEXT EVENT_CONTEXT}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if information to query given in {@code param_name} cannot be queried for event.</li>
     *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if {@code event} is a not a valid event object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetEventInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetEventInfo(@NativeType("cl_event") long event, @NativeType("cl_event_info") int param_name, @Nullable @NativeType("void *") IntBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetEventInfo(event, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns information about an event object.
     * 
     * <p>Using {@code clGetEventInfo} to determine if a command identified by event has finished execution (i.e. {@link #CL_EVENT_COMMAND_EXECUTION_STATUS EVENT_COMMAND_EXECUTION_STATUS}
     * returns {@link #CL_COMPLETE COMPLETE}) is not a synchronization point. There are no guarantees that the memory objects being modified by command associated with
     * event will be visible to other enqueued commands.</p>
     *
     * @param event                the event object being queried
     * @param param_name           the information to query. One of:<br><table><tr><td>{@link #CL_EVENT_COMMAND_QUEUE EVENT_COMMAND_QUEUE}</td><td>{@link #CL_EVENT_COMMAND_TYPE EVENT_COMMAND_TYPE}</td><td>{@link #CL_EVENT_REFERENCE_COUNT EVENT_REFERENCE_COUNT}</td><td>{@link #CL_EVENT_COMMAND_EXECUTION_STATUS EVENT_COMMAND_EXECUTION_STATUS}</td></tr><tr><td>{@link CL11#CL_EVENT_CONTEXT EVENT_CONTEXT}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if information to query given in {@code param_name} cannot be queried for event.</li>
     *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if {@code event} is a not a valid event object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetEventInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetEventInfo(@NativeType("cl_event") long event, @NativeType("cl_event_info") int param_name, @Nullable @NativeType("void *") PointerBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetEventInfo(event, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clRetainEvent ] ---

    /**
     * Increments the event reference count. The OpenCL commands that return an event perform an implicit retain.
     *
     * @param event the event to retain
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if {@code event} is not a valid event object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clRetainEvent.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clRetainEvent(@NativeType("cl_event") long event) {
        long __functionAddress = CL.getICD().clRetainEvent;
        if (CHECKS) {
            check(event);
        }
        return callPI(event, __functionAddress);
    }

    // --- [ clReleaseEvent ] ---

    /**
     * Decrements the event reference count.
     * 
     * <p>The event object is deleted once the reference count becomes zero, the specific command identified by this event has completed (or terminated) and there
     * are no commands in the command-queues of a context that require a wait for this event to complete.</p>
     * 
     * <p><strong>NOTE</strong>: Developers should be careful when releasing their last reference count on events created by {@link CL11#clCreateUserEvent CreateUserEvent} that
     * have not yet been set to status of {@link #CL_COMPLETE COMPLETE} or an error. If the user event was used in the {@code event_wait_list} argument passed to a
     * clEnqueue*** API or another application host thread is waiting for it in {@link #clWaitForEvents WaitForEvents}, those commands and host threads will continue to wait for the
     * event status to reach {@link #CL_COMPLETE COMPLETE} or error, even after the user has released the object. Since in this scenario the developer has released his
     * last reference count to the user event, it would be in principle no longer valid for him to change the status of the event to unblock all the other
     * machinery. As a result the waiting tasks will wait forever, and associated events, cl_mem objects, command queues and contexts are likely to leak.
     * In-order command-queues caught up in this deadlock may cease to do any work.</p>
     *
     * @param event the event to release
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if {@code event} is not a valid event object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clReleaseEvent.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clReleaseEvent(@NativeType("cl_event") long event) {
        long __functionAddress = CL.getICD().clReleaseEvent;
        if (CHECKS) {
            check(event);
        }
        return callPI(event, __functionAddress);
    }

    // --- [ clEnqueueMarker ] ---

    /** Unsafe version of: {@link #clEnqueueMarker EnqueueMarker} */
    public static int nclEnqueueMarker(long command_queue, long event) {
        long __functionAddress = CL.getICD().clEnqueueMarker;
        if (CHECKS) {
            check(command_queue);
        }
        return callPPI(command_queue, event, __functionAddress);
    }

    /**
     * Enqueues a marker command to {@code command_queue}. The marker command is not completed until all commands enqueued before it have completed. The marker
     * command returns an event which can be waited on, i.e. this event can be waited on to insure that all commands, which have been queued before the marker
     * command, have been completed.
     *
     * @param command_queue the command-queue to insert the marker to
     * @param event         Returns an event object that identifies this particular command and can be used to query or queue a wait for this particular command to complete.
     *                      {@code event} can be {@code NULL} in which case it will not be possible for the application to query the status of this command or queue a wait for this command to
     *                      complete. If the {@code event_wait_list} and the {@code event} arguments are not {@code NULL}, the event argument should not refer to an element of the
     *                      {@code event_wait_list} array.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is successfully executed. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code event} is a {@code NULL} value.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clEnqueueMarker.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_int")
    public static int clEnqueueMarker(@NativeType("cl_command_queue") long command_queue, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMarker(command_queue, memAddressSafe(event));
    }

    // --- [ clEnqueueBarrier ] ---

    /**
     * Enqueues a barrier operation. The {@code clEnqueueBarrier} command ensures that all queued commands in {@code command_queue} have finished execution
     * before the next batch of commands can begin execution. The {@code clEnqueueBarrier} command is a synchronization point.
     *
     * @param command_queue the command-queue to insert the barrier to
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is successfully executed. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clEnqueueBarrier.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_int")
    public static int clEnqueueBarrier(@NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clEnqueueBarrier;
        if (CHECKS) {
            check(command_queue);
        }
        return callPI(command_queue, __functionAddress);
    }

    // --- [ clEnqueueWaitForEvents ] ---

    /**
     * Unsafe version of: {@link #clEnqueueWaitForEvents EnqueueWaitForEvents}
     *
     * @param num_events the number of events in {@code event_list}
     */
    public static int nclEnqueueWaitForEvents(long command_queue, int num_events, long event_list) {
        long __functionAddress = CL.getICD().clEnqueueWaitForEvents;
        if (CHECKS) {
            check(command_queue);
        }
        return callPPI(command_queue, num_events, event_list, __functionAddress);
    }

    /**
     * Enqueues a wait for a specific event or a list of events to complete before any future commands queued in the command-queue are executed.
     *
     * @param command_queue the command-queue
     * @param event_list    the list of events
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was successfully executed. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and events in {@code event_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_events} is zero or {@code event_list} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if event objects specified in {@code event_list} are not valid events.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clEnqueueWaitForEvents.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_int")
    public static int clEnqueueWaitForEvents(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_event const *") PointerBuffer event_list) {
        return nclEnqueueWaitForEvents(command_queue, event_list.remaining(), memAddress(event_list));
    }

    /**
     * Enqueues a wait for a specific event or a list of events to complete before any future commands queued in the command-queue are executed.
     *
     * @param command_queue the command-queue
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function was successfully executed. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_INVALID_CONTEXT INVALID_CONTEXT} if the context associated with {@code command_queue} and events in {@code event_list} are not the same.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code num_events} is zero or {@code event_list} is {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if event objects specified in {@code event_list} are not valid events.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clEnqueueWaitForEvents.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_int")
    public static int clEnqueueWaitForEvents(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_event const *") long event) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer event_list = stack.pointers(event);
            return nclEnqueueWaitForEvents(command_queue, 1, memAddress(event_list));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clGetEventProfilingInfo ] ---

    /**
     * Unsafe version of: {@link #clGetEventProfilingInfo GetEventProfilingInfo}
     *
     * @param param_value_size the size in bytes of memory pointed to by {@code param_value}. This size must be &#x2265; size of return type. If {@code param_value} is {@code NULL}, it is ignored.
     */
    public static int nclGetEventProfilingInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetEventProfilingInfo;
        if (CHECKS) {
            check(event);
        }
        return callPPPPI(event, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /**
     * Returns profiling information for the command associated with {@code event}.
     *
     * @param event                the event object
     * @param param_name           the profiling data to query. One of:<br><table><tr><td>{@link #CL_PROFILING_COMMAND_QUEUED PROFILING_COMMAND_QUEUED}</td><td>{@link #CL_PROFILING_COMMAND_SUBMIT PROFILING_COMMAND_SUBMIT}</td><td>{@link #CL_PROFILING_COMMAND_START PROFILING_COMMAND_START}</td></tr><tr><td>{@link #CL_PROFILING_COMMAND_END PROFILING_COMMAND_END}</td><td>{@link CL20#CL_PROFILING_COMMAND_COMPLETE PROFILING_COMMAND_COMPLETE}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully and the profiling information has been recorded. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_PROFILING_INFO_NOT_AVAILABLE PROFILING_INFO_NOT_AVAILABLE} if the {@link #CL_QUEUE_PROFILING_ENABLE QUEUE_PROFILING_ENABLE} flag is not set for the command-queue, if the execution status of
     *         the command identified by {@code event} is not {@link #CL_COMPLETE COMPLETE} or if {@code event} is a user event object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if {@code event} is a not a valid event object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetEventProfilingInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetEventProfilingInfo(@NativeType("cl_event") long event, @NativeType("cl_profiling_info") int param_name, @Nullable @NativeType("void *") ByteBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetEventProfilingInfo(event, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /**
     * Returns profiling information for the command associated with {@code event}.
     *
     * @param event                the event object
     * @param param_name           the profiling data to query. One of:<br><table><tr><td>{@link #CL_PROFILING_COMMAND_QUEUED PROFILING_COMMAND_QUEUED}</td><td>{@link #CL_PROFILING_COMMAND_SUBMIT PROFILING_COMMAND_SUBMIT}</td><td>{@link #CL_PROFILING_COMMAND_START PROFILING_COMMAND_START}</td></tr><tr><td>{@link #CL_PROFILING_COMMAND_END PROFILING_COMMAND_END}</td><td>{@link CL20#CL_PROFILING_COMMAND_COMPLETE PROFILING_COMMAND_COMPLETE}</td></tr></table>
     * @param param_value          a pointer to memory where the appropriate result being queried is returned. If {@code param_value} is {@code NULL}, it is ignored.
     * @param param_value_size_ret the actual size in bytes of data being queried by {@code param_value}. If {@code NULL}, it is ignored.
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function is executed successfully and the profiling information has been recorded. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_PROFILING_INFO_NOT_AVAILABLE PROFILING_INFO_NOT_AVAILABLE} if the {@link #CL_QUEUE_PROFILING_ENABLE QUEUE_PROFILING_ENABLE} flag is not set for the command-queue, if the execution status of
     *         the command identified by {@code event} is not {@link #CL_COMPLETE COMPLETE} or if {@code event} is a user event object.</li>
     *         <li>{@link #CL_INVALID_VALUE INVALID_VALUE} if {@code param_name} is not valid, or if size in bytes specified by {@code param_value_size} is &lt; size of return type
     *         and {@code param_value} is not {@code NULL}.</li>
     *         <li>{@link #CL_INVALID_EVENT INVALID_EVENT} if {@code event} is a not a valid event object.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetEventProfilingInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetEventProfilingInfo(@NativeType("cl_event") long event, @NativeType("cl_profiling_info") int param_name, @Nullable @NativeType("void *") LongBuffer param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetEventProfilingInfo(event, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clFlush ] ---

    /**
     * Issues all previously queued OpenCL commands in {@code command_queue} to the device associated with {@code command_queue}. {@code clFlush} only
     * guarantees that all queued commands to {@code command_queue} will eventually be submitted to the appropriate device. There is no guarantee that they
     * will be complete after {@code clFlush} returns.
     * 
     * <p>Any blocking commands queued in a command-queue and {@link #clReleaseCommandQueue ReleaseCommandQueue} perform an implicit flush of the command-queue. These blocking commands are
     * {@link #clEnqueueReadBuffer EnqueueReadBuffer}, {@link CL11#clEnqueueReadBufferRect EnqueueReadBufferRect}, {@link #clEnqueueReadImage EnqueueReadImage}, with {@code blocking_read} set to {@link #CL_TRUE TRUE}; {@link #clEnqueueWriteBuffer EnqueueWriteBuffer},
     * {@link CL11#clEnqueueWriteBufferRect EnqueueWriteBufferRect}, {@link #clEnqueueWriteImage EnqueueWriteImage} with {@code blocking_write} set to {@link #CL_TRUE TRUE}; {@link #clEnqueueMapBuffer EnqueueMapBuffer}, {@link #clEnqueueMapImage EnqueueMapImage} with
     * {@code blocking_map} set to {@link #CL_TRUE TRUE}; or {@link #clWaitForEvents WaitForEvents}.</p>
     * 
     * <p>To use event objects that refer to commands enqueued in a command-queue as event objects to wait on by commands enqueued in a different command-queue,
     * the application must call a {@code clFlush} or any blocking commands that perform an implicit flush of the command-queue where the commands that refer
     * to these event objects are enqueued.</p>
     *
     * @param command_queue the command-queue
     *
     * @return {@link #CL_SUCCESS SUCCESS} if the function call was executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link #CL_INVALID_COMMAND_QUEUE INVALID_COMMAND_QUEUE} if {@code command_queue} is not a valid command-queue.</li>
     *         <li>{@link #CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link #CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clFlush.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clFlush(@NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clFlush;
        if (CHECKS) {
            check(command_queue);
        }
        return callPI(command_queue, __functionAddress);
    }

    // --- [ clFinish ] ---

    /**
     * Blocks until all previously queued OpenCL commands in {@code command_queue} are issued to the associated device and have completed. {@code clFinish}
     * does not return until all previously queued commands in {@code command_queue} have been processed and completed. {@code clFinish} is also a
     * synchronization point.
     *
     * @param command_queue the command-queue
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clFinish.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clFinish(@NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clFinish;
        if (CHECKS) {
            check(command_queue);
        }
        return callPI(command_queue, __functionAddress);
    }

    // --- [ clGetExtensionFunctionAddress ] ---

    /** Unsafe version of: {@link #clGetExtensionFunctionAddress GetExtensionFunctionAddress} */
    public static long nclGetExtensionFunctionAddress(long funcname) {
        long __functionAddress = CL.getICD().clGetExtensionFunctionAddress;
        return callPP(funcname, __functionAddress);
    }

    /**
     * Returns the address of the extension function named by {@code funcname}. The pointer returned should be cast to a function pointer type matching the
     * extension function's definition defined in the appropriate extension specification and header file. A return value of {@code NULL} indicates that the specified
     * function does not exist for the implementation. A non-{@code NULL} return value for {@code clGetExtensionFunctionAddress} does not guarantee that an extension
     * function is actually supported. The application must also make a corresponding query using <code>clGetPlatformInfo(platform, CL_PLATFORM_EXTENSIONS, &hellip; )</code>
     * or <code>clGetDeviceInfo(device, CL_DEVICE_EXTENSIONS, &hellip; )</code> to determine if an extension is supported by the OpenCL implementation.
     * 
     * <p>{@code clGetExtensionFunctionAddress} may not be queried for core (non-extension) functions in OpenCL. For functions that are queryable with
     * {@code clGetExtensionFunctionAddress}, implementations may choose to also export those functions statically from the object libraries implementing those
     * functions. However, portable applications cannot rely on this behavior.</p>
     *
     * @param funcname the extension function name
     *
     * @return the extension function address
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clGetExtensionFunctionAddress.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("void *")
    public static long clGetExtensionFunctionAddress(@NativeType("cl_char const *") ByteBuffer funcname) {
        if (CHECKS) {
            checkNT1(funcname);
        }
        return nclGetExtensionFunctionAddress(memAddress(funcname));
    }

    /**
     * Returns the address of the extension function named by {@code funcname}. The pointer returned should be cast to a function pointer type matching the
     * extension function's definition defined in the appropriate extension specification and header file. A return value of {@code NULL} indicates that the specified
     * function does not exist for the implementation. A non-{@code NULL} return value for {@code clGetExtensionFunctionAddress} does not guarantee that an extension
     * function is actually supported. The application must also make a corresponding query using <code>clGetPlatformInfo(platform, CL_PLATFORM_EXTENSIONS, &hellip; )</code>
     * or <code>clGetDeviceInfo(device, CL_DEVICE_EXTENSIONS, &hellip; )</code> to determine if an extension is supported by the OpenCL implementation.
     * 
     * <p>{@code clGetExtensionFunctionAddress} may not be queried for core (non-extension) functions in OpenCL. For functions that are queryable with
     * {@code clGetExtensionFunctionAddress}, implementations may choose to also export those functions statically from the object libraries implementing those
     * functions. However, portable applications cannot rely on this behavior.</p>
     *
     * @param funcname the extension function name
     *
     * @return the extension function address
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clGetExtensionFunctionAddress.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("void *")
    public static long clGetExtensionFunctionAddress(@NativeType("cl_char const *") CharSequence funcname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(funcname, true);
            long funcnameEncoded = stack.getPointerAddress();
            return nclGetExtensionFunctionAddress(funcnameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Array version of: {@link #clGetPlatformIDs GetPlatformIDs}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetPlatformIDs.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetPlatformIDs(@Nullable @NativeType("cl_platform_id *") PointerBuffer platforms, @Nullable @NativeType("cl_uint *") int[] num_platforms) {
        long __functionAddress = CL.getICD().clGetPlatformIDs;
        if (CHECKS) {
            checkSafe(num_platforms, 1);
        }
        return callPPI(remainingSafe(platforms), memAddressSafe(platforms), num_platforms, __functionAddress);
    }

    /**
     * Array version of: {@link #clGetPlatformInfo GetPlatformInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetPlatformInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetPlatformInfo(@NativeType("cl_platform_id") long platform, @NativeType("cl_platform_info") int param_name, @Nullable @NativeType("void *") long[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetPlatformInfo;
        if (CHECKS) {
            check(platform);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(platform, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clGetDeviceIDs GetDeviceIDs}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetDeviceIDs.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetDeviceIDs(@NativeType("cl_platform_id") long platform, @NativeType("cl_device_type") long device_type, @Nullable @NativeType("cl_device_id *") PointerBuffer devices, @Nullable @NativeType("cl_uint *") int[] num_devices) {
        long __functionAddress = CL.getICD().clGetDeviceIDs;
        if (CHECKS) {
            checkSafe(num_devices, 1);
        }
        return callPJPPI(platform, device_type, remainingSafe(devices), memAddressSafe(devices), num_devices, __functionAddress);
    }

    /**
     * Array version of: {@link #clGetDeviceInfo GetDeviceInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetDeviceInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetDeviceInfo;
        if (CHECKS) {
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(device, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clGetDeviceInfo GetDeviceInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetDeviceInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @Nullable @NativeType("void *") long[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetDeviceInfo;
        if (CHECKS) {
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(device, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateContext CreateContext}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateContext.html">Reference Page</a>
     */
    @NativeType("cl_context")
    public static long clCreateContext(@Nullable @NativeType("cl_context_properties const *") PointerBuffer properties, @NativeType("cl_device_id const *") PointerBuffer devices, @Nullable @NativeType("void (*) (cl_char const *, void const *, size_t, void *)") CLContextCallbackI pfn_notify, @NativeType("void *") long user_data, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateContext;
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPPP(memAddressSafe(properties), devices.remaining(), memAddress(devices), memAddressSafe(pfn_notify), user_data, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateContextFromType CreateContextFromType}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateContextFromType.html">Reference Page</a>
     */
    @NativeType("cl_context")
    public static long clCreateContextFromType(@Nullable @NativeType("cl_context_properties const *") PointerBuffer properties, @NativeType("cl_device_type") long device_type, @Nullable @NativeType("void (*) (cl_char const *, void const *, size_t, void *)") CLContextCallbackI pfn_notify, @NativeType("void *") long user_data, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateContextFromType;
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(memAddressSafe(properties), device_type, memAddressSafe(pfn_notify), user_data, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clGetContextInfo GetContextInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetContextInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetContextInfo(@NativeType("cl_context") long context, @NativeType("cl_context_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetContextInfo;
        if (CHECKS) {
            check(context);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(context, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateCommandQueue CreateCommandQueue}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.2/docs/man/xhtml/clCreateCommandQueue.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.2</em>
     */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueue(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_command_queue_properties") long properties, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueue;
        if (CHECKS) {
            check(context);
            check(device);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPP(context, device, properties, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clGetCommandQueueInfo GetCommandQueueInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetCommandQueueInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetCommandQueueInfo;
        if (CHECKS) {
            check(command_queue);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(command_queue, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clGetCommandQueueInfo GetCommandQueueInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetCommandQueueInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @Nullable @NativeType("void *") long[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetCommandQueueInfo;
        if (CHECKS) {
            check(command_queue);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(command_queue, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateBuffer CreateBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(context, flags, (long)host_ptr.remaining(), memAddress(host_ptr), errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateBuffer CreateBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") short[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(context, flags, Integer.toUnsignedLong(host_ptr.length) << 1, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateBuffer CreateBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") int[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(context, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateBuffer CreateBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") float[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(context, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateBuffer CreateBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateBuffer.html">Reference Page</a>
     */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") double[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(context, flags, Integer.toUnsignedLong(host_ptr.length) << 3, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueReadBuffer EnqueueReadBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") short[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBuffer;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 1, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueReadBuffer EnqueueReadBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") int[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBuffer;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 2, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueReadBuffer EnqueueReadBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") float[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBuffer;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 2, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueReadBuffer EnqueueReadBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") double[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBuffer;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 3, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueWriteBuffer EnqueueWriteBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") short[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBuffer;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 1, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueWriteBuffer EnqueueWriteBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") int[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBuffer;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 2, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueWriteBuffer EnqueueWriteBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") float[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBuffer;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 2, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueWriteBuffer EnqueueWriteBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteBuffer.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") double[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBuffer;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 3, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueMapBuffer EnqueueMapBuffer}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueMapBuffer.html">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clEnqueueMapBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t") long offset, @NativeType("size_t") long size, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event, @Nullable @NativeType("cl_int *") int[] errcode_ret, @Nullable ByteBuffer old_buffer) {
        long __functionAddress = CL.getICD().clEnqueueMapBuffer;
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
            checkSafe(errcode_ret, 1);
        }
        long __result = callPPJPPPPPP(command_queue, buffer, blocking_map ? 1 : 0, map_flags, offset, size, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), errcode_ret, __functionAddress);
        return apiGetMappedBuffer(old_buffer, __result, (int)size);
    }

    /**
     * Array version of: {@link #clCreateImage2D CreateImage2D}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage2D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @Nullable @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage2D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateImage2D CreateImage2D}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage2D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @Nullable @NativeType("void *") short[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage2D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_row_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateImage2D CreateImage2D}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage2D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @Nullable @NativeType("void *") int[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage2D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_row_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateImage2D CreateImage2D}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage2D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @Nullable @NativeType("void *") float[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage2D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_row_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateImage3D CreateImage3D}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage3D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @Nullable @NativeType("void *") ByteBuffer host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage3D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateImage3D CreateImage3D}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage3D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @Nullable @NativeType("void *") short[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage3D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateImage3D CreateImage3D}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage3D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @Nullable @NativeType("void *") int[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage3D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateImage3D CreateImage3D}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.1/docs/man/xhtml/clCreateImage3D.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.1</em>
     */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @Nullable @NativeType("void *") float[] host_ptr, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage3D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clGetSupportedImageFormats GetSupportedImageFormats}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetSupportedImageFormats.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetSupportedImageFormats(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @Nullable @NativeType("cl_image_format *") CLImageFormat.Buffer image_formats, @Nullable @NativeType("cl_uint *") int[] num_image_formats) {
        long __functionAddress = CL.getICD().clGetSupportedImageFormats;
        if (CHECKS) {
            check(context);
            checkSafe(num_image_formats, 1);
        }
        return callPJPPI(context, flags, image_type, remainingSafe(image_formats), memAddressSafe(image_formats), num_image_formats, __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueReadImage EnqueueReadImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") short[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadImage;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(image);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueReadImage EnqueueReadImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") int[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadImage;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(image);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueReadImage EnqueueReadImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") float[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadImage;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(image);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueReadImage EnqueueReadImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueReadImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") double[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadImage;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(image);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueWriteImage EnqueueWriteImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") short[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteImage;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(image);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueWriteImage EnqueueWriteImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") int[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteImage;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(image);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueWriteImage EnqueueWriteImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") float[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteImage;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(image);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueWriteImage EnqueueWriteImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueWriteImage.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") double[] ptr, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteImage;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(image);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /**
     * Array version of: {@link #clEnqueueMapImage EnqueueMapImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueMapImage.html">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clEnqueueMapImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t *") PointerBuffer image_row_pitch, @Nullable @NativeType("size_t *") PointerBuffer image_slice_pitch, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event, @Nullable @NativeType("cl_int *") int[] errcode_ret, @Nullable ByteBuffer old_buffer) {
        long __functionAddress = CL.getICD().clEnqueueMapImage;
        if (CHECKS) {
            check(command_queue);
            check(image);
            check(origin, 3);
            check(region, 3);
            check(image_row_pitch, 1);
            checkSafe(image_slice_pitch, 1);
            checkSafe(event, 1);
            checkSafe(errcode_ret, 1);
        }
        long __result = callPPJPPPPPPPP(command_queue, image, blocking_map ? 1 : 0, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), errcode_ret, __functionAddress);
        int length = (int)getMemObjectInfoPointer(image, CL_MEM_SIZE);
        return apiGetMappedBuffer(old_buffer, __result, length);
    }

    /**
     * Array version of: {@link #clEnqueueMapImage EnqueueMapImage}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clEnqueueMapImage.html">Reference Page</a>
     */
    @Nullable
    @NativeType("void *")
    public static ByteBuffer clEnqueueMapImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t *") PointerBuffer image_row_pitch, @Nullable @NativeType("size_t *") PointerBuffer image_slice_pitch, @Nullable @NativeType("cl_event const *") PointerBuffer event_wait_list, @Nullable @NativeType("cl_event *") PointerBuffer event, @Nullable @NativeType("cl_int *") int[] errcode_ret, long length, @Nullable ByteBuffer old_buffer) {
        long __functionAddress = CL.getICD().clEnqueueMapImage;
        if (CHECKS) {
            check(command_queue);
            check(image);
            check(origin, 3);
            check(region, 3);
            check(image_row_pitch, 1);
            checkSafe(image_slice_pitch, 1);
            checkSafe(event, 1);
            checkSafe(errcode_ret, 1);
        }
        long __result = callPPJPPPPPPPP(command_queue, image, blocking_map ? 1 : 0, map_flags, memAddress(origin), memAddress(region), memAddress(image_row_pitch), memAddressSafe(image_slice_pitch), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), errcode_ret, __functionAddress);
        return apiGetMappedBuffer(old_buffer, __result, (int)length);
    }

    /**
     * Array version of: {@link #clGetImageInfo GetImageInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetImageInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetImageInfo(@NativeType("cl_mem") long image, @NativeType("cl_image_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetImageInfo;
        if (CHECKS) {
            check(image);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(image, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clGetMemObjectInfo GetMemObjectInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetMemObjectInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMemObjectInfo;
        if (CHECKS) {
            check(memobj);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(memobj, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clGetMemObjectInfo GetMemObjectInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetMemObjectInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @Nullable @NativeType("void *") long[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMemObjectInfo;
        if (CHECKS) {
            check(memobj);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(memobj, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateSampler CreateSampler}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/1.2/docs/man/xhtml/clCreateSampler.html">Reference Page</a> - <em>This function is deprecated after OpenCL 1.2</em>
     */
    @NativeType("cl_sampler")
    public static long clCreateSampler(@NativeType("cl_context") long context, @NativeType("cl_bool") boolean normalized_coords, @NativeType("cl_addressing_mode") int addressing_mode, @NativeType("cl_filter_mode") int filter_mode, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSampler;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPPP(context, normalized_coords ? 1 : 0, addressing_mode, filter_mode, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clGetSamplerInfo GetSamplerInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetSamplerInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetSamplerInfo(@NativeType("cl_sampler") long sampler, @NativeType("cl_sampler_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetSamplerInfo;
        if (CHECKS) {
            check(sampler);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(sampler, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateProgramWithSource CreateProgramWithSource}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithSource.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithSource(@NativeType("cl_context") long context, @NativeType("cl_char const **") PointerBuffer strings, @Nullable @NativeType("size_t const *") PointerBuffer lengths, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithSource;
        if (CHECKS) {
            check(context);
            checkSafe(lengths, strings.remaining());
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(context, strings.remaining(), memAddress(strings), memAddressSafe(lengths), errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateProgramWithBinary CreateProgramWithBinary}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateProgramWithBinary.html">Reference Page</a>
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithBinary(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("size_t const *") PointerBuffer lengths, @NativeType("cl_uchar const **") PointerBuffer binaries, @Nullable @NativeType("cl_int *") int[] binary_status, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithBinary;
        if (CHECKS) {
            check(context);
            check(device_list, binaries.remaining());
            check(lengths, binaries.remaining());
            checkSafe(binary_status, binaries.remaining());
            checkSafe(errcode_ret, 1);
        }
        return callPPPPPPP(context, binaries.remaining(), memAddress(device_list), memAddress(lengths), memAddress(binaries), binary_status, errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clGetProgramInfo GetProgramInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetProgramInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetProgramInfo(@NativeType("cl_program") long program, @NativeType("cl_program_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetProgramInfo;
        if (CHECKS) {
            check(program);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(program, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clGetProgramBuildInfo GetProgramBuildInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetProgramBuildInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetProgramBuildInfo(@NativeType("cl_program") long program, @NativeType("cl_device_id") long device, @NativeType("cl_program_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetProgramBuildInfo;
        if (CHECKS) {
            check(program);
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPI(program, device, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateKernel CreateKernel}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateKernel.html">Reference Page</a>
     */
    @NativeType("cl_kernel")
    public static long clCreateKernel(@NativeType("cl_program") long program, @NativeType("cl_char const *") ByteBuffer kernel_name, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateKernel;
        if (CHECKS) {
            check(program);
            checkNT1(kernel_name);
            checkSafe(errcode_ret, 1);
        }
        return callPPPP(program, memAddress(kernel_name), errcode_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clCreateKernel CreateKernel}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateKernel.html">Reference Page</a>
     */
    @NativeType("cl_kernel")
    public static long clCreateKernel(@NativeType("cl_program") long program, @NativeType("cl_char const *") CharSequence kernel_name, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateKernel;
        if (CHECKS) {
            check(program);
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(kernel_name, true);
            long kernel_nameEncoded = stack.getPointerAddress();
            return callPPPP(program, kernel_nameEncoded, errcode_ret, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Array version of: {@link #clCreateKernelsInProgram CreateKernelsInProgram}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clCreateKernelsInProgram.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clCreateKernelsInProgram(@NativeType("cl_program") long program, @Nullable @NativeType("cl_kernel *") PointerBuffer kernels, @Nullable @NativeType("cl_uint *") int[] num_kernels_ret) {
        long __functionAddress = CL.getICD().clCreateKernelsInProgram;
        if (CHECKS) {
            check(program);
            checkSafe(num_kernels_ret, 1);
        }
        return callPPPI(program, remainingSafe(kernels), memAddressSafe(kernels), num_kernels_ret, __functionAddress);
    }

    /**
     * Array version of: {@link #clSetKernelArg SetKernelArg}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") short[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, Integer.toUnsignedLong(arg_value.length) << 1, arg_value, __functionAddress);
    }

    /**
     * Array version of: {@link #clSetKernelArg SetKernelArg}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") int[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, Integer.toUnsignedLong(arg_value.length) << 2, arg_value, __functionAddress);
    }

    /**
     * Array version of: {@link #clSetKernelArg SetKernelArg}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") long[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, Integer.toUnsignedLong(arg_value.length) << 3, arg_value, __functionAddress);
    }

    /**
     * Array version of: {@link #clSetKernelArg SetKernelArg}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") float[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, Integer.toUnsignedLong(arg_value.length) << 2, arg_value, __functionAddress);
    }

    /**
     * Array version of: {@link #clSetKernelArg SetKernelArg}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetKernelArg.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") double[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, Integer.toUnsignedLong(arg_value.length) << 3, arg_value, __functionAddress);
    }

    /**
     * Array version of: {@link #clGetKernelInfo GetKernelInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelInfo;
        if (CHECKS) {
            check(kernel);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(kernel, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clGetKernelWorkGroupInfo GetKernelWorkGroupInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelWorkGroupInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelWorkGroupInfo;
        if (CHECKS) {
            check(kernel);
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPI(kernel, device, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clGetKernelWorkGroupInfo GetKernelWorkGroupInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetKernelWorkGroupInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @Nullable @NativeType("void *") long[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelWorkGroupInfo;
        if (CHECKS) {
            check(kernel);
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPI(kernel, device, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clGetEventInfo GetEventInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetEventInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetEventInfo(@NativeType("cl_event") long event, @NativeType("cl_event_info") int param_name, @Nullable @NativeType("void *") int[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetEventInfo;
        if (CHECKS) {
            check(event);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(event, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /**
     * Array version of: {@link #clGetEventProfilingInfo GetEventProfilingInfo}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clGetEventProfilingInfo.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clGetEventProfilingInfo(@NativeType("cl_event") long event, @NativeType("cl_profiling_info") int param_name, @Nullable @NativeType("void *") long[] param_value, @Nullable @NativeType("size_t *") PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetEventProfilingInfo;
        if (CHECKS) {
            check(event);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(event, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    private static long getMemObjectInfoPointer(long cl_mem, int param_name) {
        try (MemoryStack stack = stackPush()) {
            PointerBuffer pp = stack.pointers(0);
            return clGetMemObjectInfo(cl_mem, param_name, pp, null) == CL_SUCCESS ? pp.get(0) : NULL;
        }
    }

}