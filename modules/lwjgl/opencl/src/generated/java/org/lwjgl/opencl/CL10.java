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

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class CL10 {

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

    public static final int CL_VERSION_1_0 = 1;

    public static final int
        CL_FALSE = 0,
        CL_TRUE  = 1;

    public static final int
        CL_PLATFORM_PROFILE    = 0x900,
        CL_PLATFORM_VERSION    = 0x901,
        CL_PLATFORM_NAME       = 0x902,
        CL_PLATFORM_VENDOR     = 0x903,
        CL_PLATFORM_EXTENSIONS = 0x904;

    public static final int
        CL_DEVICE_TYPE_DEFAULT     = 1 << 0,
        CL_DEVICE_TYPE_CPU         = 1 << 1,
        CL_DEVICE_TYPE_GPU         = 1 << 2,
        CL_DEVICE_TYPE_ACCELERATOR = 1 << 3,
        CL_DEVICE_TYPE_ALL         = 0xFFFFFFFF;

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

    public static final int
        CL_FP_DENORM           = 1 << 0,
        CL_FP_INF_NAN          = 1 << 1,
        CL_FP_ROUND_TO_NEAREST = 1 << 2,
        CL_FP_ROUND_TO_ZERO    = 1 << 3,
        CL_FP_ROUND_TO_INF     = 1 << 4,
        CL_FP_FMA              = 1 << 5;

    public static final int
        CL_NONE             = 0x0,
        CL_READ_ONLY_CACHE  = 0x1,
        CL_READ_WRITE_CACHE = 0x2;

    public static final int
        CL_LOCAL  = 0x1,
        CL_GLOBAL = 0x2;

    public static final int
        CL_EXEC_KERNEL        = 1 << 0,
        CL_EXEC_NATIVE_KERNEL = 1 << 1;

    public static final int
        CL_QUEUE_OUT_OF_ORDER_EXEC_MODE_ENABLE = 1 << 0,
        CL_QUEUE_PROFILING_ENABLE              = 1 << 1;

    public static final int
        CL_CONTEXT_REFERENCE_COUNT = 0x1080,
        CL_CONTEXT_DEVICES         = 0x1081,
        CL_CONTEXT_PROPERTIES      = 0x1082;

    public static final int CL_CONTEXT_PLATFORM = 0x1084;

    public static final int
        CL_QUEUE_CONTEXT         = 0x1090,
        CL_QUEUE_DEVICE          = 0x1091,
        CL_QUEUE_REFERENCE_COUNT = 0x1092,
        CL_QUEUE_PROPERTIES      = 0x1093;

    public static final int
        CL_MEM_READ_WRITE     = 1 << 0,
        CL_MEM_WRITE_ONLY     = 1 << 1,
        CL_MEM_READ_ONLY      = 1 << 2,
        CL_MEM_USE_HOST_PTR   = 1 << 3,
        CL_MEM_ALLOC_HOST_PTR = 1 << 4,
        CL_MEM_COPY_HOST_PTR  = 1 << 5;

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

    public static final int
        CL_MEM_OBJECT_BUFFER  = 0x10F0,
        CL_MEM_OBJECT_IMAGE2D = 0x10F1,
        CL_MEM_OBJECT_IMAGE3D = 0x10F2;

    public static final int
        CL_MEM_TYPE            = 0x1100,
        CL_MEM_FLAGS           = 0x1101,
        CL_MEM_SIZE            = 0x1102,
        CL_MEM_HOST_PTR        = 0x1103,
        CL_MEM_MAP_COUNT       = 0x1104,
        CL_MEM_REFERENCE_COUNT = 0x1105,
        CL_MEM_CONTEXT         = 0x1106;

    public static final int
        CL_IMAGE_FORMAT       = 0x1110,
        CL_IMAGE_ELEMENT_SIZE = 0x1111,
        CL_IMAGE_ROW_PITCH    = 0x1112,
        CL_IMAGE_SLICE_PITCH  = 0x1113,
        CL_IMAGE_WIDTH        = 0x1114,
        CL_IMAGE_HEIGHT       = 0x1115,
        CL_IMAGE_DEPTH        = 0x1116;

    public static final int
        CL_ADDRESS_NONE          = 0x1130,
        CL_ADDRESS_CLAMP_TO_EDGE = 0x1131,
        CL_ADDRESS_CLAMP         = 0x1132,
        CL_ADDRESS_REPEAT        = 0x1133;

    public static final int
        CL_FILTER_NEAREST = 0x1140,
        CL_FILTER_LINEAR  = 0x1141;

    public static final int
        CL_SAMPLER_REFERENCE_COUNT   = 0x1150,
        CL_SAMPLER_CONTEXT           = 0x1151,
        CL_SAMPLER_NORMALIZED_COORDS = 0x1152,
        CL_SAMPLER_ADDRESSING_MODE   = 0x1153,
        CL_SAMPLER_FILTER_MODE       = 0x1154;

    public static final int
        CL_MAP_READ  = 1 << 0,
        CL_MAP_WRITE = 1 << 1;

    public static final int
        CL_PROGRAM_REFERENCE_COUNT = 0x1160,
        CL_PROGRAM_CONTEXT         = 0x1161,
        CL_PROGRAM_NUM_DEVICES     = 0x1162,
        CL_PROGRAM_DEVICES         = 0x1163,
        CL_PROGRAM_SOURCE          = 0x1164,
        CL_PROGRAM_BINARY_SIZES    = 0x1165,
        CL_PROGRAM_BINARIES        = 0x1166;

    public static final int
        CL_PROGRAM_BUILD_STATUS  = 0x1181,
        CL_PROGRAM_BUILD_OPTIONS = 0x1182,
        CL_PROGRAM_BUILD_LOG     = 0x1183;

    public static final int
        CL_BUILD_SUCCESS     = 0,
        CL_BUILD_NONE        = -1,
        CL_BUILD_ERROR       = -2,
        CL_BUILD_IN_PROGRESS = -3;

    public static final int
        CL_KERNEL_FUNCTION_NAME   = 0x1190,
        CL_KERNEL_NUM_ARGS        = 0x1191,
        CL_KERNEL_REFERENCE_COUNT = 0x1192,
        CL_KERNEL_CONTEXT         = 0x1193,
        CL_KERNEL_PROGRAM         = 0x1194;

    public static final int
        CL_KERNEL_WORK_GROUP_SIZE         = 0x11B0,
        CL_KERNEL_COMPILE_WORK_GROUP_SIZE = 0x11B1,
        CL_KERNEL_LOCAL_MEM_SIZE          = 0x11B2;

    public static final int
        CL_EVENT_COMMAND_QUEUE            = 0x11D0,
        CL_EVENT_COMMAND_TYPE             = 0x11D1,
        CL_EVENT_REFERENCE_COUNT          = 0x11D2,
        CL_EVENT_COMMAND_EXECUTION_STATUS = 0x11D3;

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

    public static final int
        CL_COMPLETE  = 0x0,
        CL_RUNNING   = 0x1,
        CL_SUBMITTED = 0x2,
        CL_QUEUED    = 0x3;

    public static final int
        CL_PROFILING_COMMAND_QUEUED = 0x1280,
        CL_PROFILING_COMMAND_SUBMIT = 0x1281,
        CL_PROFILING_COMMAND_START  = 0x1282,
        CL_PROFILING_COMMAND_END    = 0x1283;

    protected CL10() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetPlatformIDs ] ---

    /** {@code cl_int clGetPlatformIDs(cl_uint num_entries, cl_platform_id * platforms, cl_uint * num_platforms)} */
    public static int nclGetPlatformIDs(int num_entries, long platforms, long num_platforms) {
        long __functionAddress = CL.getICD().clGetPlatformIDs;
        return callPPI(num_entries, platforms, num_platforms, __functionAddress);
    }

    /** {@code cl_int clGetPlatformIDs(cl_uint num_entries, cl_platform_id * platforms, cl_uint * num_platforms)} */
    @NativeType("cl_int")
    public static int clGetPlatformIDs(@NativeType("cl_platform_id *") @Nullable PointerBuffer platforms, @NativeType("cl_uint *") @Nullable IntBuffer num_platforms) {
        if (CHECKS) {
            checkSafe(num_platforms, 1);
        }
        return nclGetPlatformIDs(remainingSafe(platforms), memAddressSafe(platforms), memAddressSafe(num_platforms));
    }

    // --- [ clGetPlatformInfo ] ---

    /** {@code cl_int clGetPlatformInfo(cl_platform_id platform, cl_platform_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetPlatformInfo(long platform, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetPlatformInfo;
        if (CHECKS) {
            check(platform);
        }
        return callPPPPI(platform, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetPlatformInfo(cl_platform_id platform, cl_platform_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetPlatformInfo(@NativeType("cl_platform_id") long platform, @NativeType("cl_platform_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetPlatformInfo(platform, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetPlatformInfo(cl_platform_id platform, cl_platform_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetPlatformInfo(@NativeType("cl_platform_id") long platform, @NativeType("cl_platform_info") int param_name, @NativeType("void *") @Nullable LongBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetPlatformInfo(platform, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clGetDeviceIDs ] ---

    /** {@code cl_int clGetDeviceIDs(cl_platform_id platform, cl_device_type device_type, cl_uint num_entries, cl_device_id * devices, cl_uint * num_devices)} */
    public static int nclGetDeviceIDs(long platform, long device_type, int num_entries, long devices, long num_devices) {
        long __functionAddress = CL.getICD().clGetDeviceIDs;
        return callPJPPI(platform, device_type, num_entries, devices, num_devices, __functionAddress);
    }

    /** {@code cl_int clGetDeviceIDs(cl_platform_id platform, cl_device_type device_type, cl_uint num_entries, cl_device_id * devices, cl_uint * num_devices)} */
    @NativeType("cl_int")
    public static int clGetDeviceIDs(@NativeType("cl_platform_id") long platform, @NativeType("cl_device_type") long device_type, @NativeType("cl_device_id *") @Nullable PointerBuffer devices, @NativeType("cl_uint *") @Nullable IntBuffer num_devices) {
        if (CHECKS) {
            checkSafe(num_devices, 1);
        }
        return nclGetDeviceIDs(platform, device_type, remainingSafe(devices), memAddressSafe(devices), memAddressSafe(num_devices));
    }

    // --- [ clGetDeviceInfo ] ---

    /** {@code cl_int clGetDeviceInfo(cl_device_id device, cl_device_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetDeviceInfo(long device, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetDeviceInfo;
        if (CHECKS) {
            check(device);
        }
        return callPPPPI(device, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetDeviceInfo(cl_device_id device, cl_device_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceInfo(device, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetDeviceInfo(cl_device_id device, cl_device_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceInfo(device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetDeviceInfo(cl_device_id device, cl_device_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @NativeType("void *") @Nullable LongBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceInfo(device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetDeviceInfo(cl_device_id device, cl_device_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetDeviceInfo(device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateContext ] ---

    /** {@code cl_context clCreateContext(cl_context_properties const * properties, cl_uint num_devices, cl_device_id const * devices, void (*) (cl_char const *, void const *, size_t, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    public static long nclCreateContext(long properties, int num_devices, long devices, long pfn_notify, long user_data, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateContext;
        return callPPPPPP(properties, num_devices, devices, pfn_notify, user_data, errcode_ret, __functionAddress);
    }

    /** {@code cl_context clCreateContext(cl_context_properties const * properties, cl_uint num_devices, cl_device_id const * devices, void (*) (cl_char const *, void const *, size_t, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    @NativeType("cl_context")
    public static long clCreateContext(@NativeType("cl_context_properties const *") @Nullable PointerBuffer properties, @NativeType("cl_device_id const *") PointerBuffer devices, @NativeType("void (*) (cl_char const *, void const *, size_t, void *)") @Nullable CLContextCallbackI pfn_notify, @NativeType("void *") long user_data, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateContext(memAddressSafe(properties), devices.remaining(), memAddress(devices), memAddressSafe(pfn_notify), user_data, memAddressSafe(errcode_ret));
    }

    /** {@code cl_context clCreateContext(cl_context_properties const * properties, cl_uint num_devices, cl_device_id const * devices, void (*) (cl_char const *, void const *, size_t, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    @NativeType("cl_context")
    public static long clCreateContext(@NativeType("cl_context_properties const *") @Nullable PointerBuffer properties, @NativeType("cl_device_id const *") long device, @NativeType("void (*) (cl_char const *, void const *, size_t, void *)") @Nullable CLContextCallbackI pfn_notify, @NativeType("void *") long user_data, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
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

    /** {@code cl_context clCreateContextFromType(cl_context_properties const * properties, cl_device_type device_type, void (*) (cl_char const *, void const *, size_t, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    public static long nclCreateContextFromType(long properties, long device_type, long pfn_notify, long user_data, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateContextFromType;
        return callPJPPPP(properties, device_type, pfn_notify, user_data, errcode_ret, __functionAddress);
    }

    /** {@code cl_context clCreateContextFromType(cl_context_properties const * properties, cl_device_type device_type, void (*) (cl_char const *, void const *, size_t, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    @NativeType("cl_context")
    public static long clCreateContextFromType(@NativeType("cl_context_properties const *") @Nullable PointerBuffer properties, @NativeType("cl_device_type") long device_type, @NativeType("void (*) (cl_char const *, void const *, size_t, void *)") @Nullable CLContextCallbackI pfn_notify, @NativeType("void *") long user_data, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateContextFromType(memAddressSafe(properties), device_type, memAddressSafe(pfn_notify), user_data, memAddressSafe(errcode_ret));
    }

    // --- [ clRetainContext ] ---

    /** {@code cl_int clRetainContext(cl_context context)} */
    @NativeType("cl_int")
    public static int clRetainContext(@NativeType("cl_context") long context) {
        long __functionAddress = CL.getICD().clRetainContext;
        if (CHECKS) {
            check(context);
        }
        return callPI(context, __functionAddress);
    }

    // --- [ clReleaseContext ] ---

    /** {@code cl_int clReleaseContext(cl_context context)} */
    @NativeType("cl_int")
    public static int clReleaseContext(@NativeType("cl_context") long context) {
        long __functionAddress = CL.getICD().clReleaseContext;
        if (CHECKS) {
            check(context);
        }
        return callPI(context, __functionAddress);
    }

    // --- [ clGetContextInfo ] ---

    /** {@code cl_int clGetContextInfo(cl_context context, cl_context_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetContextInfo(long context, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetContextInfo;
        if (CHECKS) {
            check(context);
        }
        return callPPPPI(context, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetContextInfo(cl_context context, cl_context_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetContextInfo(@NativeType("cl_context") long context, @NativeType("cl_context_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetContextInfo(context, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetContextInfo(cl_context context, cl_context_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetContextInfo(@NativeType("cl_context") long context, @NativeType("cl_context_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetContextInfo(context, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetContextInfo(cl_context context, cl_context_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetContextInfo(@NativeType("cl_context") long context, @NativeType("cl_context_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetContextInfo(context, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateCommandQueue ] ---

    /** {@code cl_command_queue clCreateCommandQueue(cl_context context, cl_device_id device, cl_command_queue_properties properties, cl_int * errcode_ret)} */
    public static long nclCreateCommandQueue(long context, long device, long properties, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueue;
        if (CHECKS) {
            check(context);
            check(device);
        }
        return callPPJPP(context, device, properties, errcode_ret, __functionAddress);
    }

    /** {@code cl_command_queue clCreateCommandQueue(cl_context context, cl_device_id device, cl_command_queue_properties properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueue(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_command_queue_properties") long properties, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateCommandQueue(context, device, properties, memAddressSafe(errcode_ret));
    }

    // --- [ clRetainCommandQueue ] ---

    /** {@code cl_int clRetainCommandQueue(cl_command_queue command_queue)} */
    @NativeType("cl_int")
    public static int clRetainCommandQueue(@NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clRetainCommandQueue;
        if (CHECKS) {
            check(command_queue);
        }
        return callPI(command_queue, __functionAddress);
    }

    // --- [ clReleaseCommandQueue ] ---

    /** {@code cl_int clReleaseCommandQueue(cl_command_queue command_queue)} */
    @NativeType("cl_int")
    public static int clReleaseCommandQueue(@NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clReleaseCommandQueue;
        if (CHECKS) {
            check(command_queue);
        }
        return callPI(command_queue, __functionAddress);
    }

    // --- [ clGetCommandQueueInfo ] ---

    /** {@code cl_int clGetCommandQueueInfo(cl_command_queue command_queue, cl_command_queue_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetCommandQueueInfo(long command_queue, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetCommandQueueInfo;
        if (CHECKS) {
            check(command_queue);
        }
        return callPPPPI(command_queue, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetCommandQueueInfo(cl_command_queue command_queue, cl_command_queue_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandQueueInfo(command_queue, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetCommandQueueInfo(cl_command_queue command_queue, cl_command_queue_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandQueueInfo(command_queue, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetCommandQueueInfo(cl_command_queue command_queue, cl_command_queue_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @NativeType("void *") @Nullable LongBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandQueueInfo(command_queue, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetCommandQueueInfo(cl_command_queue command_queue, cl_command_queue_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetCommandQueueInfo(command_queue, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateBuffer ] ---

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    public static long nclCreateBuffer(long context, long flags, long size, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
        }
        return callPJPPPP(context, flags, size, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("size_t") long size, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, size, NULL, memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, host_ptr.remaining(), memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ShortBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, Integer.toUnsignedLong(host_ptr.remaining()) << 1, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") IntBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") FloatBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") DoubleBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBuffer(context, flags, Integer.toUnsignedLong(host_ptr.remaining()) << 3, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    // --- [ clEnqueueReadBuffer ] ---

    /** {@code cl_int clEnqueueReadBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t offset, size_t size, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueReadBuffer(long command_queue, long buffer, int blocking_read, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReadBuffer;
        if (CHECKS) {
            check(command_queue);
            check(buffer);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_read, offset, size, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueReadBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t offset, size_t size, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") ByteBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReadBuffer(command_queue, buffer, blocking_read ? 1 : 0, offset, ptr.remaining(), memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t offset, size_t size, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") ShortBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReadBuffer(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 1, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t offset, size_t size, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") IntBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReadBuffer(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 2, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t offset, size_t size, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") FloatBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReadBuffer(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 2, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t offset, size_t size, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") DoubleBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueReadBuffer(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 3, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueWriteBuffer ] ---

    /** {@code cl_int clEnqueueWriteBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t offset, size_t size, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueWriteBuffer(long command_queue, long buffer, int blocking_write, long offset, long size, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBuffer;
        if (CHECKS) {
            check(command_queue);
            check(buffer);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_write, offset, size, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t offset, size_t size, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write ? 1 : 0, offset, ptr.remaining(), memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t offset, size_t size, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") ShortBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 1, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t offset, size_t size, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") IntBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 2, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t offset, size_t size, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") FloatBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 2, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t offset, size_t size, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") DoubleBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueWriteBuffer(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.remaining()) << 3, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueCopyBuffer ] ---

    /** {@code cl_int clEnqueueCopyBuffer(cl_command_queue command_queue, cl_mem src_buffer, cl_mem dst_buffer, size_t src_offset, size_t dst_offset, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueCopyBuffer(long command_queue, long src_buffer, long dst_buffer, long src_offset, long dst_offset, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCopyBuffer;
        if (CHECKS) {
            check(command_queue);
            check(src_buffer);
            check(dst_buffer);
        }
        return callPPPPPPPPI(command_queue, src_buffer, dst_buffer, src_offset, dst_offset, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueCopyBuffer(cl_command_queue command_queue, cl_mem src_buffer, cl_mem dst_buffer, size_t src_offset, size_t dst_offset, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueCopyBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t") long src_offset, @NativeType("size_t") long dst_offset, @NativeType("size_t") long size, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueCopyBuffer(command_queue, src_buffer, dst_buffer, src_offset, dst_offset, size, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMapBuffer ] ---

    /** {@code void * clEnqueueMapBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_map, cl_map_flags map_flags, size_t offset, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event, cl_int * errcode_ret)} */
    public static long nclEnqueueMapBuffer(long command_queue, long buffer, int blocking_map, long map_flags, long offset, long size, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret) {
        long __functionAddress = CL.getICD().clEnqueueMapBuffer;
        if (CHECKS) {
            check(command_queue);
            check(buffer);
        }
        return callPPJPPPPPP(command_queue, buffer, blocking_map, map_flags, offset, size, num_events_in_wait_list, event_wait_list, event, errcode_ret, __functionAddress);
    }

    /** {@code void * clEnqueueMapBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_map, cl_map_flags map_flags, size_t offset, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clEnqueueMapBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t") long offset, @NativeType("size_t") long size, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret, @Nullable ByteBuffer old_buffer) {
        if (CHECKS) {
            checkSafe(event, 1);
            checkSafe(errcode_ret, 1);
        }
        long __result = nclEnqueueMapBuffer(command_queue, buffer, blocking_map ? 1 : 0, map_flags, offset, size, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), memAddressSafe(errcode_ret));
        return apiGetMappedBuffer(old_buffer, __result, (int)size);
    }

    // --- [ clCreateImage2D ] ---

    /** {@code cl_mem clCreateImage2D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_row_pitch, void * host_ptr, cl_int * errcode_ret)} */
    public static long nclCreateImage2D(long context, long flags, long image_format, long image_width, long image_height, long image_row_pitch, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage2D;
        if (CHECKS) {
            check(context);
        }
        return callPJPPPPPPP(context, flags, image_format, image_width, image_height, image_row_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage2D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_row_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @NativeType("void *") @Nullable ByteBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage2D(context, flags, image_format.address(), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImage2D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_row_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @NativeType("void *") @Nullable ShortBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage2D(context, flags, image_format.address(), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImage2D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_row_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @NativeType("void *") @Nullable IntBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage2D(context, flags, image_format.address(), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImage2D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_row_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @NativeType("void *") @Nullable FloatBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage2D(context, flags, image_format.address(), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    // --- [ clCreateImage3D ] ---

    /** {@code cl_mem clCreateImage3D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_depth, size_t image_row_pitch, size_t image_slice_pitch, void * host_ptr, cl_int * errcode_ret)} */
    public static long nclCreateImage3D(long context, long flags, long image_format, long image_width, long image_height, long image_depth, long image_row_pitch, long image_slice_pitch, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage3D;
        if (CHECKS) {
            check(context);
        }
        return callPJPPPPPPPPP(context, flags, image_format, image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage3D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_depth, size_t image_row_pitch, size_t image_slice_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @NativeType("void *") @Nullable ByteBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage3D(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImage3D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_depth, size_t image_row_pitch, size_t image_slice_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @NativeType("void *") @Nullable ShortBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage3D(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImage3D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_depth, size_t image_row_pitch, size_t image_slice_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @NativeType("void *") @Nullable IntBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage3D(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImage3D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_depth, size_t image_row_pitch, size_t image_slice_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @NativeType("void *") @Nullable FloatBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage3D(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    // --- [ clGetSupportedImageFormats ] ---

    /** {@code cl_int clGetSupportedImageFormats(cl_context context, cl_mem_flags flags, cl_mem_object_type image_type, cl_uint num_entries, cl_image_format * image_formats, cl_uint * num_image_formats)} */
    public static int nclGetSupportedImageFormats(long context, long flags, int image_type, int num_entries, long image_formats, long num_image_formats) {
        long __functionAddress = CL.getICD().clGetSupportedImageFormats;
        if (CHECKS) {
            check(context);
        }
        return callPJPPI(context, flags, image_type, num_entries, image_formats, num_image_formats, __functionAddress);
    }

    /** {@code cl_int clGetSupportedImageFormats(cl_context context, cl_mem_flags flags, cl_mem_object_type image_type, cl_uint num_entries, cl_image_format * image_formats, cl_uint * num_image_formats)} */
    @NativeType("cl_int")
    public static int clGetSupportedImageFormats(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @NativeType("cl_image_format *") CLImageFormat.@Nullable Buffer image_formats, @NativeType("cl_uint *") @Nullable IntBuffer num_image_formats) {
        if (CHECKS) {
            checkSafe(num_image_formats, 1);
        }
        return nclGetSupportedImageFormats(context, flags, image_type, remainingSafe(image_formats), memAddressSafe(image_formats), memAddressSafe(num_image_formats));
    }

    // --- [ clEnqueueReadImage ] ---

    /** {@code cl_int clEnqueueReadImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_read, size_t const * origin, size_t const * region, size_t row_pitch, size_t slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueReadImage(long command_queue, long image, int blocking_read, long origin, long region, long row_pitch, long slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueReadImage;
        if (CHECKS) {
            check(command_queue);
            check(image);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_read, origin, region, row_pitch, slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueReadImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_read, size_t const * origin, size_t const * region, size_t row_pitch, size_t slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") ByteBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadImage(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_read, size_t const * origin, size_t const * region, size_t row_pitch, size_t slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") ShortBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadImage(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_read, size_t const * origin, size_t const * region, size_t row_pitch, size_t slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") IntBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadImage(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_read, size_t const * origin, size_t const * region, size_t row_pitch, size_t slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") FloatBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadImage(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueReadImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_read, size_t const * origin, size_t const * region, size_t row_pitch, size_t slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") DoubleBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueReadImage(command_queue, image, blocking_read ? 1 : 0, memAddress(origin), memAddress(region), row_pitch, slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueWriteImage ] ---

    /** {@code cl_int clEnqueueWriteImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_write, size_t const * origin, size_t const * region, size_t input_row_pitch, size_t input_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueWriteImage(long command_queue, long image, int blocking_write, long origin, long region, long input_row_pitch, long input_slice_pitch, long ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueWriteImage;
        if (CHECKS) {
            check(command_queue);
            check(image);
        }
        return callPPPPPPPPPI(command_queue, image, blocking_write, origin, region, input_row_pitch, input_slice_pitch, ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_write, size_t const * origin, size_t const * region, size_t input_row_pitch, size_t input_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") ByteBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteImage(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_write, size_t const * origin, size_t const * region, size_t input_row_pitch, size_t input_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") ShortBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteImage(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_write, size_t const * origin, size_t const * region, size_t input_row_pitch, size_t input_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") IntBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteImage(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_write, size_t const * origin, size_t const * region, size_t input_row_pitch, size_t input_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") FloatBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteImage(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueWriteImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_write, size_t const * origin, size_t const * region, size_t input_row_pitch, size_t input_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") DoubleBuffer ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueWriteImage(command_queue, image, blocking_write ? 1 : 0, memAddress(origin), memAddress(region), input_row_pitch, input_slice_pitch, memAddress(ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueCopyImage ] ---

    /** {@code cl_int clEnqueueCopyImage(cl_command_queue command_queue, cl_mem src_image, cl_mem dst_image, size_t const * src_origin, size_t const * dst_origin, size_t const * region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueCopyImage(long command_queue, long src_image, long dst_image, long src_origin, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCopyImage;
        if (CHECKS) {
            check(command_queue);
            check(src_image);
            check(dst_image);
        }
        return callPPPPPPPPI(command_queue, src_image, dst_image, src_origin, dst_origin, region, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueCopyImage(cl_command_queue command_queue, cl_mem src_image, cl_mem dst_image, size_t const * src_origin, size_t const * dst_origin, size_t const * region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueCopyImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_image, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(src_origin, 3);
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueCopyImage(command_queue, src_image, dst_image, memAddress(src_origin), memAddress(dst_origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueCopyImageToBuffer ] ---

    /** {@code cl_int clEnqueueCopyImageToBuffer(cl_command_queue command_queue, cl_mem src_image, cl_mem dst_buffer, size_t const * src_origin, size_t const * region, size_t dst_offset, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueCopyImageToBuffer(long command_queue, long src_image, long dst_buffer, long src_origin, long region, long dst_offset, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCopyImageToBuffer;
        if (CHECKS) {
            check(command_queue);
            check(src_image);
            check(dst_buffer);
        }
        return callPPPPPPPPI(command_queue, src_image, dst_buffer, src_origin, region, dst_offset, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueCopyImageToBuffer(cl_command_queue command_queue, cl_mem src_image, cl_mem dst_buffer, size_t const * src_origin, size_t const * region, size_t dst_offset, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueCopyImageToBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_image, @NativeType("cl_mem") long dst_buffer, @NativeType("size_t const *") PointerBuffer src_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long dst_offset, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(src_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueCopyImageToBuffer(command_queue, src_image, dst_buffer, memAddress(src_origin), memAddress(region), dst_offset, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueCopyBufferToImage ] ---

    /** {@code cl_int clEnqueueCopyBufferToImage(cl_command_queue command_queue, cl_mem src_buffer, cl_mem dst_image, size_t src_offset, size_t const * dst_origin, size_t const * region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueCopyBufferToImage(long command_queue, long src_buffer, long dst_image, long src_offset, long dst_origin, long region, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueCopyBufferToImage;
        if (CHECKS) {
            check(command_queue);
            check(src_buffer);
            check(dst_image);
        }
        return callPPPPPPPPI(command_queue, src_buffer, dst_image, src_offset, dst_origin, region, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueCopyBufferToImage(cl_command_queue command_queue, cl_mem src_buffer, cl_mem dst_image, size_t src_offset, size_t const * dst_origin, size_t const * region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueCopyBufferToImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long src_buffer, @NativeType("cl_mem") long dst_image, @NativeType("size_t") long src_offset, @NativeType("size_t const *") PointerBuffer dst_origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(dst_origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueCopyBufferToImage(command_queue, src_buffer, dst_image, src_offset, memAddress(dst_origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMapImage ] ---

    /** {@code void * clEnqueueMapImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_map, cl_map_flags map_flags, size_t const * origin, size_t const * region, size_t * image_row_pitch, size_t * image_slice_pitch, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event, cl_int * errcode_ret)} */
    public static long nclEnqueueMapImage(long command_queue, long image, int blocking_map, long map_flags, long origin, long region, long image_row_pitch, long image_slice_pitch, int num_events_in_wait_list, long event_wait_list, long event, long errcode_ret) {
        long __functionAddress = CL.getICD().clEnqueueMapImage;
        if (CHECKS) {
            check(command_queue);
            check(image);
        }
        return callPPJPPPPPPPP(command_queue, image, blocking_map, map_flags, origin, region, image_row_pitch, image_slice_pitch, num_events_in_wait_list, event_wait_list, event, errcode_ret, __functionAddress);
    }

    /** {@code void * clEnqueueMapImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_map, cl_map_flags map_flags, size_t const * origin, size_t const * region, size_t * image_row_pitch, size_t * image_slice_pitch, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clEnqueueMapImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t *") PointerBuffer image_row_pitch, @NativeType("size_t *") @Nullable PointerBuffer image_slice_pitch, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret, @Nullable ByteBuffer old_buffer) {
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

    /** {@code void * clEnqueueMapImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_map, cl_map_flags map_flags, size_t const * origin, size_t const * region, size_t * image_row_pitch, size_t * image_slice_pitch, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clEnqueueMapImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t *") PointerBuffer image_row_pitch, @NativeType("size_t *") @Nullable PointerBuffer image_slice_pitch, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret, long length, @Nullable ByteBuffer old_buffer) {
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

    /** {@code cl_int clGetImageInfo(cl_mem image, cl_image_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetImageInfo(long image, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetImageInfo;
        if (CHECKS) {
            check(image);
        }
        return callPPPPI(image, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetImageInfo(cl_mem image, cl_image_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetImageInfo(@NativeType("cl_mem") long image, @NativeType("cl_image_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageInfo(image, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetImageInfo(cl_mem image, cl_image_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetImageInfo(@NativeType("cl_mem") long image, @NativeType("cl_image_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageInfo(image, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetImageInfo(cl_mem image, cl_image_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetImageInfo(@NativeType("cl_mem") long image, @NativeType("cl_image_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetImageInfo(image, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clRetainMemObject ] ---

    /** {@code cl_int clRetainMemObject(cl_mem memobj)} */
    @NativeType("cl_int")
    public static int clRetainMemObject(@NativeType("cl_mem") long memobj) {
        long __functionAddress = CL.getICD().clRetainMemObject;
        if (CHECKS) {
            check(memobj);
        }
        return callPI(memobj, __functionAddress);
    }

    // --- [ clReleaseMemObject ] ---

    /** {@code cl_int clReleaseMemObject(cl_mem memobj)} */
    @NativeType("cl_int")
    public static int clReleaseMemObject(@NativeType("cl_mem") long memobj) {
        long __functionAddress = CL.getICD().clReleaseMemObject;
        if (CHECKS) {
            check(memobj);
        }
        return callPI(memobj, __functionAddress);
    }

    // --- [ clEnqueueUnmapMemObject ] ---

    /** {@code cl_int clEnqueueUnmapMemObject(cl_command_queue command_queue, cl_mem memobj, void * mapped_ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueUnmapMemObject(long command_queue, long memobj, long mapped_ptr, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueUnmapMemObject;
        if (CHECKS) {
            check(command_queue);
            check(memobj);
        }
        return callPPPPPI(command_queue, memobj, mapped_ptr, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueUnmapMemObject(cl_command_queue command_queue, cl_mem memobj, void * mapped_ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueUnmapMemObject(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long memobj, @NativeType("void *") ByteBuffer mapped_ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueUnmapMemObject(command_queue, memobj, memAddress(mapped_ptr), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clGetMemObjectInfo ] ---

    /** {@code cl_int clGetMemObjectInfo(cl_mem memobj, cl_mem_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetMemObjectInfo(long memobj, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMemObjectInfo;
        if (CHECKS) {
            check(memobj);
        }
        return callPPPPI(memobj, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetMemObjectInfo(cl_mem memobj, cl_mem_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemObjectInfo(memobj, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetMemObjectInfo(cl_mem memobj, cl_mem_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemObjectInfo(memobj, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetMemObjectInfo(cl_mem memobj, cl_mem_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @NativeType("void *") @Nullable LongBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemObjectInfo(memobj, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetMemObjectInfo(cl_mem memobj, cl_mem_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetMemObjectInfo(memobj, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateSampler ] ---

    /** {@code cl_sampler clCreateSampler(cl_context context, cl_bool normalized_coords, cl_addressing_mode addressing_mode, cl_filter_mode filter_mode, cl_int * errcode_ret)} */
    public static long nclCreateSampler(long context, int normalized_coords, int addressing_mode, int filter_mode, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSampler;
        if (CHECKS) {
            check(context);
        }
        return callPPP(context, normalized_coords, addressing_mode, filter_mode, errcode_ret, __functionAddress);
    }

    /** {@code cl_sampler clCreateSampler(cl_context context, cl_bool normalized_coords, cl_addressing_mode addressing_mode, cl_filter_mode filter_mode, cl_int * errcode_ret)} */
    @NativeType("cl_sampler")
    public static long clCreateSampler(@NativeType("cl_context") long context, @NativeType("cl_bool") boolean normalized_coords, @NativeType("cl_addressing_mode") int addressing_mode, @NativeType("cl_filter_mode") int filter_mode, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateSampler(context, normalized_coords ? 1 : 0, addressing_mode, filter_mode, memAddressSafe(errcode_ret));
    }

    // --- [ clRetainSampler ] ---

    /** {@code cl_int clRetainSampler(cl_sampler sampler)} */
    @NativeType("cl_int")
    public static int clRetainSampler(@NativeType("cl_sampler") long sampler) {
        long __functionAddress = CL.getICD().clRetainSampler;
        if (CHECKS) {
            check(sampler);
        }
        return callPI(sampler, __functionAddress);
    }

    // --- [ clReleaseSampler ] ---

    /** {@code cl_int clReleaseSampler(cl_sampler sampler)} */
    @NativeType("cl_int")
    public static int clReleaseSampler(@NativeType("cl_sampler") long sampler) {
        long __functionAddress = CL.getICD().clReleaseSampler;
        if (CHECKS) {
            check(sampler);
        }
        return callPI(sampler, __functionAddress);
    }

    // --- [ clGetSamplerInfo ] ---

    /** {@code cl_int clGetSamplerInfo(cl_sampler sampler, cl_sampler_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetSamplerInfo(long sampler, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetSamplerInfo;
        if (CHECKS) {
            check(sampler);
        }
        return callPPPPI(sampler, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetSamplerInfo(cl_sampler sampler, cl_sampler_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSamplerInfo(@NativeType("cl_sampler") long sampler, @NativeType("cl_sampler_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSamplerInfo(sampler, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetSamplerInfo(cl_sampler sampler, cl_sampler_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSamplerInfo(@NativeType("cl_sampler") long sampler, @NativeType("cl_sampler_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSamplerInfo(sampler, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetSamplerInfo(cl_sampler sampler, cl_sampler_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSamplerInfo(@NativeType("cl_sampler") long sampler, @NativeType("cl_sampler_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetSamplerInfo(sampler, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateProgramWithSource ] ---

    /** {@code cl_program clCreateProgramWithSource(cl_context context, cl_uint count, cl_char const ** strings, size_t const * lengths, cl_int * errcode_ret)} */
    public static long nclCreateProgramWithSource(long context, int count, long strings, long lengths, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithSource;
        if (CHECKS) {
            check(context);
        }
        return callPPPPP(context, count, strings, lengths, errcode_ret, __functionAddress);
    }

    /** {@code cl_program clCreateProgramWithSource(cl_context context, cl_uint count, cl_char const ** strings, size_t const * lengths, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithSource(@NativeType("cl_context") long context, @NativeType("cl_char const **") PointerBuffer strings, @NativeType("size_t const *") @Nullable PointerBuffer lengths, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(lengths, strings.remaining());
            checkSafe(errcode_ret, 1);
        }
        return nclCreateProgramWithSource(context, strings.remaining(), memAddress(strings), memAddressSafe(lengths), memAddressSafe(errcode_ret));
    }

    /** {@code cl_program clCreateProgramWithSource(cl_context context, cl_uint count, cl_char const ** strings, size_t const * lengths, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithSource(@NativeType("cl_context") long context, @NativeType("cl_char const **") CharSequence[] strings, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
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

    /** {@code cl_program clCreateProgramWithSource(cl_context context, cl_uint count, cl_char const ** strings, size_t const * lengths, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithSource(@NativeType("cl_context") long context, @NativeType("cl_char const **") CharSequence string, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
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

    /** {@code cl_program clCreateProgramWithBinary(cl_context context, cl_uint num_devices, cl_device_id const * device_list, size_t const * lengths, cl_uchar const ** binaries, cl_int * binary_status, cl_int * errcode_ret)} */
    public static long nclCreateProgramWithBinary(long context, int num_devices, long device_list, long lengths, long binaries, long binary_status, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithBinary;
        if (CHECKS) {
            check(context);
        }
        return callPPPPPPP(context, num_devices, device_list, lengths, binaries, binary_status, errcode_ret, __functionAddress);
    }

    /** {@code cl_program clCreateProgramWithBinary(cl_context context, cl_uint num_devices, cl_device_id const * device_list, size_t const * lengths, cl_uchar const ** binaries, cl_int * binary_status, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithBinary(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("size_t const *") PointerBuffer lengths, @NativeType("cl_uchar const **") PointerBuffer binaries, @NativeType("cl_int *") @Nullable IntBuffer binary_status, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            check(device_list, binaries.remaining());
            check(lengths, binaries.remaining());
            checkSafe(binary_status, binaries.remaining());
            checkSafe(errcode_ret, 1);
        }
        return nclCreateProgramWithBinary(context, binaries.remaining(), memAddress(device_list), memAddress(lengths), memAddress(binaries), memAddressSafe(binary_status), memAddressSafe(errcode_ret));
    }

    /** {@code cl_program clCreateProgramWithBinary(cl_context context, cl_uint num_devices, cl_device_id const * device_list, size_t const * lengths, cl_uchar const ** binaries, cl_int * binary_status, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithBinary(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_uchar const **") ByteBuffer[] binaries, @NativeType("cl_int *") @Nullable IntBuffer binary_status, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
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

    /** {@code cl_program clCreateProgramWithBinary(cl_context context, cl_uint num_devices, cl_device_id const * device_list, size_t const * lengths, cl_uchar const ** binaries, cl_int * binary_status, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithBinary(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_uchar const **") ByteBuffer binary, @NativeType("cl_int *") @Nullable IntBuffer binary_status, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
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

    /** {@code cl_int clRetainProgram(cl_program program)} */
    @NativeType("cl_int")
    public static int clRetainProgram(@NativeType("cl_program") long program) {
        long __functionAddress = CL.getICD().clRetainProgram;
        if (CHECKS) {
            check(program);
        }
        return callPI(program, __functionAddress);
    }

    // --- [ clReleaseProgram ] ---

    /** {@code cl_int clReleaseProgram(cl_program program)} */
    @NativeType("cl_int")
    public static int clReleaseProgram(@NativeType("cl_program") long program) {
        long __functionAddress = CL.getICD().clReleaseProgram;
        if (CHECKS) {
            check(program);
        }
        return callPI(program, __functionAddress);
    }

    // --- [ clBuildProgram ] ---

    /** {@code cl_int clBuildProgram(cl_program program, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, void (*) (cl_program, void *) pfn_notify, void * user_data)} */
    public static int nclBuildProgram(long program, int num_devices, long device_list, long options, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clBuildProgram;
        if (CHECKS) {
            check(program);
        }
        return callPPPPPI(program, num_devices, device_list, options, pfn_notify, user_data, __functionAddress);
    }

    /** {@code cl_int clBuildProgram(cl_program program, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, void (*) (cl_program, void *) pfn_notify, void * user_data)} */
    @NativeType("cl_int")
    public static int clBuildProgram(@NativeType("cl_program") long program, @NativeType("cl_device_id const *") @Nullable PointerBuffer device_list, @NativeType("cl_char const *") ByteBuffer options, @NativeType("void (*) (cl_program, void *)") @Nullable CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        if (CHECKS) {
            checkNT1(options);
        }
        return nclBuildProgram(program, remainingSafe(device_list), memAddressSafe(device_list), memAddress(options), memAddressSafe(pfn_notify), user_data);
    }

    /** {@code cl_int clBuildProgram(cl_program program, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, void (*) (cl_program, void *) pfn_notify, void * user_data)} */
    @NativeType("cl_int")
    public static int clBuildProgram(@NativeType("cl_program") long program, @NativeType("cl_device_id const *") @Nullable PointerBuffer device_list, @NativeType("cl_char const *") CharSequence options, @NativeType("void (*) (cl_program, void *)") @Nullable CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(options, true);
            long optionsEncoded = stack.getPointerAddress();
            return nclBuildProgram(program, remainingSafe(device_list), memAddressSafe(device_list), optionsEncoded, memAddressSafe(pfn_notify), user_data);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code cl_int clBuildProgram(cl_program program, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, void (*) (cl_program, void *) pfn_notify, void * user_data)} */
    @NativeType("cl_int")
    public static int clBuildProgram(@NativeType("cl_program") long program, @NativeType("cl_device_id const *") long device, @NativeType("cl_char const *") CharSequence options, @NativeType("void (*) (cl_program, void *)") @Nullable CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
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

    /** {@code cl_int clUnloadCompiler(void)} */
    @NativeType("cl_int")
    public static int clUnloadCompiler() {
        long __functionAddress = CL.getICD().clUnloadCompiler;
        return callI(__functionAddress);
    }

    // --- [ clGetProgramInfo ] ---

    /** {@code cl_int clGetProgramInfo(cl_program program, cl_program_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetProgramInfo(long program, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetProgramInfo;
        if (CHECKS) {
            check(program);
        }
        return callPPPPI(program, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetProgramInfo(cl_program program, cl_program_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetProgramInfo(@NativeType("cl_program") long program, @NativeType("cl_program_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramInfo(program, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetProgramInfo(cl_program program, cl_program_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetProgramInfo(@NativeType("cl_program") long program, @NativeType("cl_program_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramInfo(program, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetProgramInfo(cl_program program, cl_program_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetProgramInfo(@NativeType("cl_program") long program, @NativeType("cl_program_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramInfo(program, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clGetProgramBuildInfo ] ---

    /** {@code cl_int clGetProgramBuildInfo(cl_program program, cl_device_id device, cl_program_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetProgramBuildInfo(long program, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetProgramBuildInfo;
        if (CHECKS) {
            check(program);
            check(device);
        }
        return callPPPPPI(program, device, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetProgramBuildInfo(cl_program program, cl_device_id device, cl_program_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetProgramBuildInfo(@NativeType("cl_program") long program, @NativeType("cl_device_id") long device, @NativeType("cl_program_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramBuildInfo(program, device, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetProgramBuildInfo(cl_program program, cl_device_id device, cl_program_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetProgramBuildInfo(@NativeType("cl_program") long program, @NativeType("cl_device_id") long device, @NativeType("cl_program_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramBuildInfo(program, device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetProgramBuildInfo(cl_program program, cl_device_id device, cl_program_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetProgramBuildInfo(@NativeType("cl_program") long program, @NativeType("cl_device_id") long device, @NativeType("cl_program_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetProgramBuildInfo(program, device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clCreateKernel ] ---

    /** {@code cl_kernel clCreateKernel(cl_program program, cl_char const * kernel_name, cl_int * errcode_ret)} */
    public static long nclCreateKernel(long program, long kernel_name, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateKernel;
        if (CHECKS) {
            check(program);
        }
        return callPPPP(program, kernel_name, errcode_ret, __functionAddress);
    }

    /** {@code cl_kernel clCreateKernel(cl_program program, cl_char const * kernel_name, cl_int * errcode_ret)} */
    @NativeType("cl_kernel")
    public static long clCreateKernel(@NativeType("cl_program") long program, @NativeType("cl_char const *") ByteBuffer kernel_name, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNT1(kernel_name);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateKernel(program, memAddress(kernel_name), memAddressSafe(errcode_ret));
    }

    /** {@code cl_kernel clCreateKernel(cl_program program, cl_char const * kernel_name, cl_int * errcode_ret)} */
    @NativeType("cl_kernel")
    public static long clCreateKernel(@NativeType("cl_program") long program, @NativeType("cl_char const *") CharSequence kernel_name, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
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

    /** {@code cl_int clCreateKernelsInProgram(cl_program program, cl_uint num_kernels, cl_kernel * kernels, cl_uint * num_kernels_ret)} */
    public static int nclCreateKernelsInProgram(long program, int num_kernels, long kernels, long num_kernels_ret) {
        long __functionAddress = CL.getICD().clCreateKernelsInProgram;
        if (CHECKS) {
            check(program);
        }
        return callPPPI(program, num_kernels, kernels, num_kernels_ret, __functionAddress);
    }

    /** {@code cl_int clCreateKernelsInProgram(cl_program program, cl_uint num_kernels, cl_kernel * kernels, cl_uint * num_kernels_ret)} */
    @NativeType("cl_int")
    public static int clCreateKernelsInProgram(@NativeType("cl_program") long program, @NativeType("cl_kernel *") @Nullable PointerBuffer kernels, @NativeType("cl_uint *") @Nullable IntBuffer num_kernels_ret) {
        if (CHECKS) {
            checkSafe(num_kernels_ret, 1);
        }
        return nclCreateKernelsInProgram(program, remainingSafe(kernels), memAddressSafe(kernels), memAddressSafe(num_kernels_ret));
    }

    // --- [ clRetainKernel ] ---

    /** {@code cl_int clRetainKernel(cl_kernel kernel)} */
    @NativeType("cl_int")
    public static int clRetainKernel(@NativeType("cl_kernel") long kernel) {
        long __functionAddress = CL.getICD().clRetainKernel;
        if (CHECKS) {
            check(kernel);
        }
        return callPI(kernel, __functionAddress);
    }

    // --- [ clReleaseKernel ] ---

    /** {@code cl_int clReleaseKernel(cl_kernel kernel)} */
    @NativeType("cl_int")
    public static int clReleaseKernel(@NativeType("cl_kernel") long kernel) {
        long __functionAddress = CL.getICD().clReleaseKernel;
        if (CHECKS) {
            check(kernel);
        }
        return callPI(kernel, __functionAddress);
    }

    // --- [ clSetKernelArg ] ---

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    public static int nclSetKernelArg(long kernel, int arg_index, long arg_size, long arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, arg_size, arg_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("size_t") long arg_size) {
        return nclSetKernelArg(kernel, arg_index, arg_size, NULL);
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") ByteBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, arg_value.remaining(), memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") ShortBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << 1, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") IntBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << 2, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") LongBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << 3, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") FloatBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << 2, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") DoubleBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << 3, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") PointerBuffer arg_value) {
        return nclSetKernelArg(kernel, arg_index, Integer.toUnsignedLong(arg_value.remaining()) << POINTER_SHIFT, memAddress(arg_value));
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
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

    /** {@code cl_int clGetKernelInfo(cl_kernel kernel, cl_kernel_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetKernelInfo(long kernel, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelInfo;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPPI(kernel, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetKernelInfo(cl_kernel kernel, cl_kernel_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelInfo(kernel, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetKernelInfo(cl_kernel kernel, cl_kernel_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelInfo(kernel, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetKernelInfo(cl_kernel kernel, cl_kernel_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelInfo(kernel, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clGetKernelWorkGroupInfo ] ---

    /** {@code cl_int clGetKernelWorkGroupInfo(cl_kernel kernel, cl_device_id device, cl_kernel_work_group_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetKernelWorkGroupInfo(long kernel, long device, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelWorkGroupInfo;
        if (CHECKS) {
            check(kernel);
            check(device);
        }
        return callPPPPPI(kernel, device, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetKernelWorkGroupInfo(cl_kernel kernel, cl_device_id device, cl_kernel_work_group_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelWorkGroupInfo(kernel, device, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetKernelWorkGroupInfo(cl_kernel kernel, cl_device_id device, cl_kernel_work_group_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelWorkGroupInfo(kernel, device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetKernelWorkGroupInfo(cl_kernel kernel, cl_device_id device, cl_kernel_work_group_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @NativeType("void *") @Nullable LongBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelWorkGroupInfo(kernel, device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetKernelWorkGroupInfo(cl_kernel kernel, cl_device_id device, cl_kernel_work_group_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelWorkGroupInfo(kernel, device, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clEnqueueNDRangeKernel ] ---

    /** {@code cl_int clEnqueueNDRangeKernel(cl_command_queue command_queue, cl_kernel kernel, cl_uint work_dim, size_t const * global_work_offset, size_t const * global_work_size, size_t const * local_work_size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueNDRangeKernel(long command_queue, long kernel, int work_dim, long global_work_offset, long global_work_size, long local_work_size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueNDRangeKernel;
        if (CHECKS) {
            check(command_queue);
            check(kernel);
        }
        return callPPPPPPPI(command_queue, kernel, work_dim, global_work_offset, global_work_size, local_work_size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueNDRangeKernel(cl_command_queue command_queue, cl_kernel kernel, cl_uint work_dim, size_t const * global_work_offset, size_t const * global_work_size, size_t const * local_work_size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueNDRangeKernel(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int work_dim, @NativeType("size_t const *") @Nullable PointerBuffer global_work_offset, @NativeType("size_t const *") @Nullable PointerBuffer global_work_size, @NativeType("size_t const *") @Nullable PointerBuffer local_work_size, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(global_work_offset, work_dim);
            checkSafe(global_work_size, work_dim);
            checkSafe(local_work_size, work_dim);
            checkSafe(event, 1);
        }
        return nclEnqueueNDRangeKernel(command_queue, kernel, work_dim, memAddressSafe(global_work_offset), memAddressSafe(global_work_size), memAddressSafe(local_work_size), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueTask ] ---

    /** {@code cl_int clEnqueueTask(cl_command_queue command_queue, cl_kernel kernel, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueTask(long command_queue, long kernel, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueTask;
        if (CHECKS) {
            check(command_queue);
            check(kernel);
        }
        return callPPPPI(command_queue, kernel, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueTask(cl_command_queue command_queue, cl_kernel kernel, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueTask(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_kernel") long kernel, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueTask(command_queue, kernel, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueNativeKernel ] ---

    /** {@code cl_int clEnqueueNativeKernel(cl_command_queue command_queue, void (*) (void *) user_func, void * args, size_t cb_args, cl_uint num_mem_objects, cl_mem const * mem_list, void const ** args_mem_loc, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueNativeKernel(long command_queue, long user_func, long args, long cb_args, int num_mem_objects, long mem_list, long args_mem_loc, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueNativeKernel;
        if (CHECKS) {
            check(command_queue);
        }
        return callPPPPPPPPI(command_queue, user_func, args, cb_args, num_mem_objects, mem_list, args_mem_loc, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueNativeKernel(cl_command_queue command_queue, void (*) (void *) user_func, void * args, size_t cb_args, cl_uint num_mem_objects, cl_mem const * mem_list, void const ** args_mem_loc, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueNativeKernel(@NativeType("cl_command_queue") long command_queue, @NativeType("void (*) (void *)") CLNativeKernelI user_func, @NativeType("void *") @Nullable ByteBuffer args, @NativeType("cl_mem const *") @Nullable PointerBuffer mem_list, @NativeType("void const **") @Nullable PointerBuffer args_mem_loc, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(args_mem_loc, remainingSafe(mem_list));
            checkSafe(event, 1);
        }
        return nclEnqueueNativeKernel(command_queue, user_func.address(), memAddressSafe(args), remainingSafe(args), remainingSafe(mem_list), memAddressSafe(mem_list), memAddressSafe(args_mem_loc), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueNativeKernel(cl_command_queue command_queue, void (*) (void *) user_func, void * args, size_t cb_args, cl_uint num_mem_objects, cl_mem const * mem_list, void const ** args_mem_loc, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueNativeKernel(@NativeType("cl_command_queue") long command_queue, @NativeType("void (*) (void *)") CLNativeKernelI user_func, @NativeType("void *") @Nullable ByteBuffer args, @NativeType("cl_mem const *") long memobj, @NativeType("void const **") long memobj_loc, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
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

    /** {@code cl_int clWaitForEvents(cl_uint num_events, cl_event const * event_list)} */
    public static int nclWaitForEvents(int num_events, long event_list) {
        long __functionAddress = CL.getICD().clWaitForEvents;
        return callPI(num_events, event_list, __functionAddress);
    }

    /** {@code cl_int clWaitForEvents(cl_uint num_events, cl_event const * event_list)} */
    @NativeType("cl_int")
    public static int clWaitForEvents(@NativeType("cl_event const *") PointerBuffer event_list) {
        return nclWaitForEvents(event_list.remaining(), memAddress(event_list));
    }

    /** {@code cl_int clWaitForEvents(cl_uint num_events, cl_event const * event_list)} */
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

    /** {@code cl_int clGetEventInfo(cl_event event, cl_event_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetEventInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetEventInfo;
        if (CHECKS) {
            check(event);
        }
        return callPPPPI(event, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetEventInfo(cl_event event, cl_event_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetEventInfo(@NativeType("cl_event") long event, @NativeType("cl_event_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetEventInfo(event, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetEventInfo(cl_event event, cl_event_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetEventInfo(@NativeType("cl_event") long event, @NativeType("cl_event_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetEventInfo(event, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetEventInfo(cl_event event, cl_event_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetEventInfo(@NativeType("cl_event") long event, @NativeType("cl_event_info") int param_name, @NativeType("void *") @Nullable PointerBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetEventInfo(event, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << POINTER_SHIFT, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clRetainEvent ] ---

    /** {@code cl_int clRetainEvent(cl_event event)} */
    @NativeType("cl_int")
    public static int clRetainEvent(@NativeType("cl_event") long event) {
        long __functionAddress = CL.getICD().clRetainEvent;
        if (CHECKS) {
            check(event);
        }
        return callPI(event, __functionAddress);
    }

    // --- [ clReleaseEvent ] ---

    /** {@code cl_int clReleaseEvent(cl_event event)} */
    @NativeType("cl_int")
    public static int clReleaseEvent(@NativeType("cl_event") long event) {
        long __functionAddress = CL.getICD().clReleaseEvent;
        if (CHECKS) {
            check(event);
        }
        return callPI(event, __functionAddress);
    }

    // --- [ clEnqueueMarker ] ---

    /** {@code cl_int clEnqueueMarker(cl_command_queue command_queue, cl_event * event)} */
    public static int nclEnqueueMarker(long command_queue, long event) {
        long __functionAddress = CL.getICD().clEnqueueMarker;
        if (CHECKS) {
            check(command_queue);
        }
        return callPPI(command_queue, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueMarker(cl_command_queue command_queue, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueMarker(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMarker(command_queue, memAddressSafe(event));
    }

    // --- [ clEnqueueBarrier ] ---

    /** {@code cl_int clEnqueueBarrier(cl_command_queue command_queue)} */
    @NativeType("cl_int")
    public static int clEnqueueBarrier(@NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clEnqueueBarrier;
        if (CHECKS) {
            check(command_queue);
        }
        return callPI(command_queue, __functionAddress);
    }

    // --- [ clEnqueueWaitForEvents ] ---

    /** {@code cl_int clEnqueueWaitForEvents(cl_command_queue command_queue, cl_uint num_events, cl_event const * event_list)} */
    public static int nclEnqueueWaitForEvents(long command_queue, int num_events, long event_list) {
        long __functionAddress = CL.getICD().clEnqueueWaitForEvents;
        if (CHECKS) {
            check(command_queue);
        }
        return callPPI(command_queue, num_events, event_list, __functionAddress);
    }

    /** {@code cl_int clEnqueueWaitForEvents(cl_command_queue command_queue, cl_uint num_events, cl_event const * event_list)} */
    @NativeType("cl_int")
    public static int clEnqueueWaitForEvents(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_event const *") PointerBuffer event_list) {
        return nclEnqueueWaitForEvents(command_queue, event_list.remaining(), memAddress(event_list));
    }

    /** {@code cl_int clEnqueueWaitForEvents(cl_command_queue command_queue, cl_uint num_events, cl_event const * event_list)} */
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

    /** {@code cl_int clGetEventProfilingInfo(cl_event event, cl_profiling_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetEventProfilingInfo(long event, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetEventProfilingInfo;
        if (CHECKS) {
            check(event);
        }
        return callPPPPI(event, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetEventProfilingInfo(cl_event event, cl_profiling_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetEventProfilingInfo(@NativeType("cl_event") long event, @NativeType("cl_profiling_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetEventProfilingInfo(event, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetEventProfilingInfo(cl_event event, cl_profiling_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetEventProfilingInfo(@NativeType("cl_event") long event, @NativeType("cl_profiling_info") int param_name, @NativeType("void *") @Nullable LongBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetEventProfilingInfo(event, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clFlush ] ---

    /** {@code cl_int clFlush(cl_command_queue command_queue)} */
    @NativeType("cl_int")
    public static int clFlush(@NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clFlush;
        if (CHECKS) {
            check(command_queue);
        }
        return callPI(command_queue, __functionAddress);
    }

    // --- [ clFinish ] ---

    /** {@code cl_int clFinish(cl_command_queue command_queue)} */
    @NativeType("cl_int")
    public static int clFinish(@NativeType("cl_command_queue") long command_queue) {
        long __functionAddress = CL.getICD().clFinish;
        if (CHECKS) {
            check(command_queue);
        }
        return callPI(command_queue, __functionAddress);
    }

    // --- [ clGetExtensionFunctionAddress ] ---

    /** {@code void * clGetExtensionFunctionAddress(cl_char const * funcname)} */
    public static long nclGetExtensionFunctionAddress(long funcname) {
        long __functionAddress = CL.getICD().clGetExtensionFunctionAddress;
        return callPP(funcname, __functionAddress);
    }

    /** {@code void * clGetExtensionFunctionAddress(cl_char const * funcname)} */
    @NativeType("void *")
    public static long clGetExtensionFunctionAddress(@NativeType("cl_char const *") ByteBuffer funcname) {
        if (CHECKS) {
            checkNT1(funcname);
        }
        return nclGetExtensionFunctionAddress(memAddress(funcname));
    }

    /** {@code void * clGetExtensionFunctionAddress(cl_char const * funcname)} */
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

    /** {@code cl_int clGetPlatformIDs(cl_uint num_entries, cl_platform_id * platforms, cl_uint * num_platforms)} */
    @NativeType("cl_int")
    public static int clGetPlatformIDs(@NativeType("cl_platform_id *") @Nullable PointerBuffer platforms, @NativeType("cl_uint *") int @Nullable [] num_platforms) {
        long __functionAddress = CL.getICD().clGetPlatformIDs;
        if (CHECKS) {
            checkSafe(num_platforms, 1);
        }
        return callPPI(remainingSafe(platforms), memAddressSafe(platforms), num_platforms, __functionAddress);
    }

    /** {@code cl_int clGetPlatformInfo(cl_platform_id platform, cl_platform_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetPlatformInfo(@NativeType("cl_platform_id") long platform, @NativeType("cl_platform_info") int param_name, @NativeType("void *") long @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetPlatformInfo;
        if (CHECKS) {
            check(platform);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(platform, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetDeviceIDs(cl_platform_id platform, cl_device_type device_type, cl_uint num_entries, cl_device_id * devices, cl_uint * num_devices)} */
    @NativeType("cl_int")
    public static int clGetDeviceIDs(@NativeType("cl_platform_id") long platform, @NativeType("cl_device_type") long device_type, @NativeType("cl_device_id *") @Nullable PointerBuffer devices, @NativeType("cl_uint *") int @Nullable [] num_devices) {
        long __functionAddress = CL.getICD().clGetDeviceIDs;
        if (CHECKS) {
            checkSafe(num_devices, 1);
        }
        return callPJPPI(platform, device_type, remainingSafe(devices), memAddressSafe(devices), num_devices, __functionAddress);
    }

    /** {@code cl_int clGetDeviceInfo(cl_device_id device, cl_device_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetDeviceInfo;
        if (CHECKS) {
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(device, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetDeviceInfo(cl_device_id device, cl_device_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetDeviceInfo(@NativeType("cl_device_id") long device, @NativeType("cl_device_info") int param_name, @NativeType("void *") long @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetDeviceInfo;
        if (CHECKS) {
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(device, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_context clCreateContext(cl_context_properties const * properties, cl_uint num_devices, cl_device_id const * devices, void (*) (cl_char const *, void const *, size_t, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    @NativeType("cl_context")
    public static long clCreateContext(@NativeType("cl_context_properties const *") @Nullable PointerBuffer properties, @NativeType("cl_device_id const *") PointerBuffer devices, @NativeType("void (*) (cl_char const *, void const *, size_t, void *)") @Nullable CLContextCallbackI pfn_notify, @NativeType("void *") long user_data, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateContext;
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPPP(memAddressSafe(properties), devices.remaining(), memAddress(devices), memAddressSafe(pfn_notify), user_data, errcode_ret, __functionAddress);
    }

    /** {@code cl_context clCreateContextFromType(cl_context_properties const * properties, cl_device_type device_type, void (*) (cl_char const *, void const *, size_t, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    @NativeType("cl_context")
    public static long clCreateContextFromType(@NativeType("cl_context_properties const *") @Nullable PointerBuffer properties, @NativeType("cl_device_type") long device_type, @NativeType("void (*) (cl_char const *, void const *, size_t, void *)") @Nullable CLContextCallbackI pfn_notify, @NativeType("void *") long user_data, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateContextFromType;
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(memAddressSafe(properties), device_type, memAddressSafe(pfn_notify), user_data, errcode_ret, __functionAddress);
    }

    /** {@code cl_int clGetContextInfo(cl_context context, cl_context_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetContextInfo(@NativeType("cl_context") long context, @NativeType("cl_context_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetContextInfo;
        if (CHECKS) {
            check(context);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(context, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_command_queue clCreateCommandQueue(cl_context context, cl_device_id device, cl_command_queue_properties properties, cl_int * errcode_ret)} */
    @NativeType("cl_command_queue")
    public static long clCreateCommandQueue(@NativeType("cl_context") long context, @NativeType("cl_device_id") long device, @NativeType("cl_command_queue_properties") long properties, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateCommandQueue;
        if (CHECKS) {
            check(context);
            check(device);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPP(context, device, properties, errcode_ret, __functionAddress);
    }

    /** {@code cl_int clGetCommandQueueInfo(cl_command_queue command_queue, cl_command_queue_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetCommandQueueInfo;
        if (CHECKS) {
            check(command_queue);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(command_queue, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetCommandQueueInfo(cl_command_queue command_queue, cl_command_queue_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetCommandQueueInfo(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_command_queue_info") int param_name, @NativeType("void *") long @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetCommandQueueInfo;
        if (CHECKS) {
            check(command_queue);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(command_queue, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(context, flags, (long)host_ptr.remaining(), memAddress(host_ptr), errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") short[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(context, flags, Integer.toUnsignedLong(host_ptr.length) << 1, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") int[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(context, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") float[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(context, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBuffer(cl_context context, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBuffer(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("void *") double[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBuffer;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPP(context, flags, Integer.toUnsignedLong(host_ptr.length) << 3, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_int clEnqueueReadBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t offset, size_t size, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") short[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBuffer;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 1, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueReadBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t offset, size_t size, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") int[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBuffer;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 2, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueReadBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t offset, size_t size, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") float[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBuffer;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 2, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueReadBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_read, size_t offset, size_t size, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t") long offset, @NativeType("void *") double[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueReadBuffer;
		if (!blocking_read) { throw new IllegalArgumentException("Non blocking reads cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_read ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 3, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t offset, size_t size, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") short[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBuffer;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 1, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t offset, size_t size, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") int[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBuffer;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 2, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t offset, size_t size, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") float[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBuffer;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 2, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueWriteBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_write, size_t offset, size_t size, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t") long offset, @NativeType("void const *") double[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueWriteBuffer;
		if (!blocking_write) { throw new IllegalArgumentException("Non blocking writes cannot be used when the ptr parameter is a Java array."); }
        if (CHECKS) {
            check(command_queue);
            check(buffer);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, buffer, blocking_write ? 1 : 0, offset, Integer.toUnsignedLong(ptr.length) << 3, ptr, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code void * clEnqueueMapBuffer(cl_command_queue command_queue, cl_mem buffer, cl_bool blocking_map, cl_map_flags map_flags, size_t offset, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clEnqueueMapBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t") long offset, @NativeType("size_t") long size, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event, @NativeType("cl_int *") int @Nullable [] errcode_ret, @Nullable ByteBuffer old_buffer) {
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

    /** {@code cl_mem clCreateImage2D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_row_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @NativeType("void *") @Nullable ByteBuffer host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage2D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_row_pitch, memAddressSafe(host_ptr), errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage2D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_row_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @NativeType("void *") short @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage2D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_row_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage2D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_row_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @NativeType("void *") int @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage2D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_row_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage2D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_row_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage2D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_row_pitch, @NativeType("void *") float @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage2D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_row_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage3D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_depth, size_t image_row_pitch, size_t image_slice_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @NativeType("void *") @Nullable ByteBuffer host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage3D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, memAddressSafe(host_ptr), errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage3D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_depth, size_t image_row_pitch, size_t image_slice_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @NativeType("void *") short @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage3D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage3D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_depth, size_t image_row_pitch, size_t image_slice_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @NativeType("void *") int @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage3D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage3D(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, size_t image_width, size_t image_height, size_t image_depth, size_t image_row_pitch, size_t image_slice_pitch, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage3D(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("size_t") long image_width, @NativeType("size_t") long image_height, @NativeType("size_t") long image_depth, @NativeType("size_t") long image_row_pitch, @NativeType("size_t") long image_slice_pitch, @NativeType("void *") float @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage3D;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPPPPPP(context, flags, image_format.address(), image_width, image_height, image_depth, image_row_pitch, image_slice_pitch, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_int clGetSupportedImageFormats(cl_context context, cl_mem_flags flags, cl_mem_object_type image_type, cl_uint num_entries, cl_image_format * image_formats, cl_uint * num_image_formats)} */
    @NativeType("cl_int")
    public static int clGetSupportedImageFormats(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_object_type") int image_type, @NativeType("cl_image_format *") CLImageFormat.@Nullable Buffer image_formats, @NativeType("cl_uint *") int @Nullable [] num_image_formats) {
        long __functionAddress = CL.getICD().clGetSupportedImageFormats;
        if (CHECKS) {
            check(context);
            checkSafe(num_image_formats, 1);
        }
        return callPJPPI(context, flags, image_type, remainingSafe(image_formats), memAddressSafe(image_formats), num_image_formats, __functionAddress);
    }

    /** {@code cl_int clEnqueueReadImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_read, size_t const * origin, size_t const * region, size_t row_pitch, size_t slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") short[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
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

    /** {@code cl_int clEnqueueReadImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_read, size_t const * origin, size_t const * region, size_t row_pitch, size_t slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") int[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
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

    /** {@code cl_int clEnqueueReadImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_read, size_t const * origin, size_t const * region, size_t row_pitch, size_t slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") float[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
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

    /** {@code cl_int clEnqueueReadImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_read, size_t const * origin, size_t const * region, size_t row_pitch, size_t slice_pitch, void * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueReadImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_read, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long row_pitch, @NativeType("size_t") long slice_pitch, @NativeType("void *") double[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
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

    /** {@code cl_int clEnqueueWriteImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_write, size_t const * origin, size_t const * region, size_t input_row_pitch, size_t input_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") short[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
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

    /** {@code cl_int clEnqueueWriteImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_write, size_t const * origin, size_t const * region, size_t input_row_pitch, size_t input_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") int[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
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

    /** {@code cl_int clEnqueueWriteImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_write, size_t const * origin, size_t const * region, size_t input_row_pitch, size_t input_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") float[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
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

    /** {@code cl_int clEnqueueWriteImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_write, size_t const * origin, size_t const * region, size_t input_row_pitch, size_t input_slice_pitch, void const * ptr, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueWriteImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_write, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t") long input_row_pitch, @NativeType("size_t") long input_slice_pitch, @NativeType("void const *") double[] ptr, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
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

    /** {@code void * clEnqueueMapImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_map, cl_map_flags map_flags, size_t const * origin, size_t const * region, size_t * image_row_pitch, size_t * image_slice_pitch, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clEnqueueMapImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t *") PointerBuffer image_row_pitch, @NativeType("size_t *") @Nullable PointerBuffer image_slice_pitch, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event, @NativeType("cl_int *") int @Nullable [] errcode_ret, @Nullable ByteBuffer old_buffer) {
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

    /** {@code void * clEnqueueMapImage(cl_command_queue command_queue, cl_mem image, cl_bool blocking_map, cl_map_flags map_flags, size_t const * origin, size_t const * region, size_t * image_row_pitch, size_t * image_slice_pitch, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event, cl_int * errcode_ret)} */
    @NativeType("void *")
    public static @Nullable ByteBuffer clEnqueueMapImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("cl_bool") boolean blocking_map, @NativeType("cl_map_flags") long map_flags, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("size_t *") PointerBuffer image_row_pitch, @NativeType("size_t *") @Nullable PointerBuffer image_slice_pitch, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event, @NativeType("cl_int *") int @Nullable [] errcode_ret, long length, @Nullable ByteBuffer old_buffer) {
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

    /** {@code cl_int clGetImageInfo(cl_mem image, cl_image_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetImageInfo(@NativeType("cl_mem") long image, @NativeType("cl_image_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetImageInfo;
        if (CHECKS) {
            check(image);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(image, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetMemObjectInfo(cl_mem memobj, cl_mem_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMemObjectInfo;
        if (CHECKS) {
            check(memobj);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(memobj, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetMemObjectInfo(cl_mem memobj, cl_mem_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetMemObjectInfo(@NativeType("cl_mem") long memobj, @NativeType("cl_mem_info") int param_name, @NativeType("void *") long @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetMemObjectInfo;
        if (CHECKS) {
            check(memobj);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(memobj, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_sampler clCreateSampler(cl_context context, cl_bool normalized_coords, cl_addressing_mode addressing_mode, cl_filter_mode filter_mode, cl_int * errcode_ret)} */
    @NativeType("cl_sampler")
    public static long clCreateSampler(@NativeType("cl_context") long context, @NativeType("cl_bool") boolean normalized_coords, @NativeType("cl_addressing_mode") int addressing_mode, @NativeType("cl_filter_mode") int filter_mode, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateSampler;
        if (CHECKS) {
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPPP(context, normalized_coords ? 1 : 0, addressing_mode, filter_mode, errcode_ret, __functionAddress);
    }

    /** {@code cl_int clGetSamplerInfo(cl_sampler sampler, cl_sampler_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetSamplerInfo(@NativeType("cl_sampler") long sampler, @NativeType("cl_sampler_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetSamplerInfo;
        if (CHECKS) {
            check(sampler);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(sampler, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_program clCreateProgramWithSource(cl_context context, cl_uint count, cl_char const ** strings, size_t const * lengths, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithSource(@NativeType("cl_context") long context, @NativeType("cl_char const **") PointerBuffer strings, @NativeType("size_t const *") @Nullable PointerBuffer lengths, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithSource;
        if (CHECKS) {
            check(context);
            checkSafe(lengths, strings.remaining());
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(context, strings.remaining(), memAddress(strings), memAddressSafe(lengths), errcode_ret, __functionAddress);
    }

    /** {@code cl_program clCreateProgramWithBinary(cl_context context, cl_uint num_devices, cl_device_id const * device_list, size_t const * lengths, cl_uchar const ** binaries, cl_int * binary_status, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithBinary(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("size_t const *") PointerBuffer lengths, @NativeType("cl_uchar const **") PointerBuffer binaries, @NativeType("cl_int *") int @Nullable [] binary_status, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
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

    /** {@code cl_int clGetProgramInfo(cl_program program, cl_program_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetProgramInfo(@NativeType("cl_program") long program, @NativeType("cl_program_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetProgramInfo;
        if (CHECKS) {
            check(program);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(program, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetProgramBuildInfo(cl_program program, cl_device_id device, cl_program_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetProgramBuildInfo(@NativeType("cl_program") long program, @NativeType("cl_device_id") long device, @NativeType("cl_program_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetProgramBuildInfo;
        if (CHECKS) {
            check(program);
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPI(program, device, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_kernel clCreateKernel(cl_program program, cl_char const * kernel_name, cl_int * errcode_ret)} */
    @NativeType("cl_kernel")
    public static long clCreateKernel(@NativeType("cl_program") long program, @NativeType("cl_char const *") ByteBuffer kernel_name, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateKernel;
        if (CHECKS) {
            check(program);
            checkNT1(kernel_name);
            checkSafe(errcode_ret, 1);
        }
        return callPPPP(program, memAddress(kernel_name), errcode_ret, __functionAddress);
    }

    /** {@code cl_kernel clCreateKernel(cl_program program, cl_char const * kernel_name, cl_int * errcode_ret)} */
    @NativeType("cl_kernel")
    public static long clCreateKernel(@NativeType("cl_program") long program, @NativeType("cl_char const *") CharSequence kernel_name, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
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

    /** {@code cl_int clCreateKernelsInProgram(cl_program program, cl_uint num_kernels, cl_kernel * kernels, cl_uint * num_kernels_ret)} */
    @NativeType("cl_int")
    public static int clCreateKernelsInProgram(@NativeType("cl_program") long program, @NativeType("cl_kernel *") @Nullable PointerBuffer kernels, @NativeType("cl_uint *") int @Nullable [] num_kernels_ret) {
        long __functionAddress = CL.getICD().clCreateKernelsInProgram;
        if (CHECKS) {
            check(program);
            checkSafe(num_kernels_ret, 1);
        }
        return callPPPI(program, remainingSafe(kernels), memAddressSafe(kernels), num_kernels_ret, __functionAddress);
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") short[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, Integer.toUnsignedLong(arg_value.length) << 1, arg_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") int[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, Integer.toUnsignedLong(arg_value.length) << 2, arg_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") long[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, Integer.toUnsignedLong(arg_value.length) << 3, arg_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") float[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, Integer.toUnsignedLong(arg_value.length) << 2, arg_value, __functionAddress);
    }

    /** {@code cl_int clSetKernelArg(cl_kernel kernel, cl_uint arg_index, size_t arg_size, void const * arg_value)} */
    @NativeType("cl_int")
    public static int clSetKernelArg(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_index, @NativeType("void const *") double[] arg_value) {
        long __functionAddress = CL.getICD().clSetKernelArg;
        if (CHECKS) {
            check(kernel);
        }
        return callPPPI(kernel, arg_index, Integer.toUnsignedLong(arg_value.length) << 3, arg_value, __functionAddress);
    }

    /** {@code cl_int clGetKernelInfo(cl_kernel kernel, cl_kernel_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_kernel_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelInfo;
        if (CHECKS) {
            check(kernel);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(kernel, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetKernelWorkGroupInfo(cl_kernel kernel, cl_device_id device, cl_kernel_work_group_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelWorkGroupInfo;
        if (CHECKS) {
            check(kernel);
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPI(kernel, device, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetKernelWorkGroupInfo(cl_kernel kernel, cl_device_id device, cl_kernel_work_group_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelWorkGroupInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_device_id") long device, @NativeType("cl_kernel_work_group_info") int param_name, @NativeType("void *") long @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelWorkGroupInfo;
        if (CHECKS) {
            check(kernel);
            check(device);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPPI(kernel, device, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetEventInfo(cl_event event, cl_event_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetEventInfo(@NativeType("cl_event") long event, @NativeType("cl_event_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetEventInfo;
        if (CHECKS) {
            check(event);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(event, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetEventProfilingInfo(cl_event event, cl_profiling_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetEventProfilingInfo(@NativeType("cl_event") long event, @NativeType("cl_profiling_info") int param_name, @NativeType("void *") long @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
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