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
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

public class CL12 extends CL11 {

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

    public static final int CL_VERSION_1_2 = 1;

    public static final int
        CL_BLOCKING     = CL10.CL_TRUE,
        CL_NON_BLOCKING = CL10.CL_FALSE;

    public static final int CL_DEVICE_TYPE_CUSTOM = 1 << 4;

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

    public static final int CL_FP_CORRECTLY_ROUNDED_DIVIDE_SQRT = 1 << 7;

    public static final int CL_CONTEXT_INTEROP_USER_SYNC = 0x1085;

    public static final int CL_DEVICE_PARTITION_BY_COUNTS_LIST_END = 0x0;

    public static final int CL_DEVICE_PARTITION_EQUALLY = 0x1086;

    public static final int CL_DEVICE_PARTITION_BY_COUNTS = 0x1087;

    public static final int CL_DEVICE_PARTITION_BY_AFFINITY_DOMAIN = 0x1088;

    public static final int
        CL_DEVICE_AFFINITY_DOMAIN_NUMA               = 1 << 0,
        CL_DEVICE_AFFINITY_DOMAIN_L4_CACHE           = 1 << 1,
        CL_DEVICE_AFFINITY_DOMAIN_L3_CACHE           = 1 << 2,
        CL_DEVICE_AFFINITY_DOMAIN_L2_CACHE           = 1 << 3,
        CL_DEVICE_AFFINITY_DOMAIN_L1_CACHE           = 1 << 4,
        CL_DEVICE_AFFINITY_DOMAIN_NEXT_PARTITIONABLE = 1 << 5;

    public static final int
        CL_MEM_HOST_WRITE_ONLY = 1 << 7,
        CL_MEM_HOST_READ_ONLY  = 1 << 8,
        CL_MEM_HOST_NO_ACCESS  = 1 << 9;

    public static final int
        CL_MIGRATE_MEM_OBJECT_HOST              = 1 << 0,
        CL_MIGRATE_MEM_OBJECT_CONTENT_UNDEFINED = 1 << 1;

    public static final int
        CL_MEM_OBJECT_IMAGE2D_ARRAY  = 0x10F3,
        CL_MEM_OBJECT_IMAGE1D        = 0x10F4,
        CL_MEM_OBJECT_IMAGE1D_ARRAY  = 0x10F5,
        CL_MEM_OBJECT_IMAGE1D_BUFFER = 0x10F6;

    public static final int
        CL_IMAGE_ARRAY_SIZE     = 0x1117,
        CL_IMAGE_BUFFER         = 0x1118,
        CL_IMAGE_NUM_MIP_LEVELS = 0x1119,
        CL_IMAGE_NUM_SAMPLES    = 0x111A;

    public static final int CL_MAP_WRITE_INVALIDATE_REGION = 1 << 2;

    public static final int
        CL_PROGRAM_NUM_KERNELS  = 0x1167,
        CL_PROGRAM_KERNEL_NAMES = 0x1168;

    public static final int CL_PROGRAM_BINARY_TYPE = 0x1184;

    public static final int
        CL_PROGRAM_BINARY_TYPE_NONE            = 0x0,
        CL_PROGRAM_BINARY_TYPE_COMPILED_OBJECT = 0x1,
        CL_PROGRAM_BINARY_TYPE_LIBRARY         = 0x2,
        CL_PROGRAM_BINARY_TYPE_EXECUTABLE      = 0x4;

    public static final int CL_KERNEL_ATTRIBUTES = 0x1195;

    public static final int
        CL_KERNEL_ARG_ADDRESS_QUALIFIER = 0x1196,
        CL_KERNEL_ARG_ACCESS_QUALIFIER  = 0x1197,
        CL_KERNEL_ARG_TYPE_NAME         = 0x1198,
        CL_KERNEL_ARG_TYPE_QUALIFIER    = 0x1199,
        CL_KERNEL_ARG_NAME              = 0x119A;

    public static final int
        CL_KERNEL_ARG_ADDRESS_GLOBAL   = 0x119B,
        CL_KERNEL_ARG_ADDRESS_LOCAL    = 0x119C,
        CL_KERNEL_ARG_ADDRESS_CONSTANT = 0x119D,
        CL_KERNEL_ARG_ADDRESS_PRIVATE  = 0x119E;

    public static final int
        CL_KERNEL_ARG_ACCESS_READ_ONLY  = 0x11A0,
        CL_KERNEL_ARG_ACCESS_WRITE_ONLY = 0x11A1,
        CL_KERNEL_ARG_ACCESS_READ_WRITE = 0x11A2,
        CL_KERNEL_ARG_ACCESS_NONE       = 0x11A3;

    public static final int
        CL_KERNEL_ARG_TYPE_NONE     = 0,
        CL_KERNEL_ARG_TYPE_CONST    = 1 << 0,
        CL_KERNEL_ARG_TYPE_RESTRICT = 1 << 1,
        CL_KERNEL_ARG_TYPE_VOLATILE = 1 << 2;

    public static final int CL_KERNEL_GLOBAL_WORK_SIZE = 0x11B5;

    public static final int
        CL_COMMAND_BARRIER             = 0x1205,
        CL_COMMAND_MIGRATE_MEM_OBJECTS = 0x1206,
        CL_COMMAND_FILL_BUFFER         = 0x1207,
        CL_COMMAND_FILL_IMAGE          = 0x1208;

    protected CL12() {
        throw new UnsupportedOperationException();
    }

    // --- [ clGetExtensionFunctionAddressForPlatform ] ---

    /** {@code void * clGetExtensionFunctionAddressForPlatform(cl_platform_id platform, cl_char const * funcname)} */
    public static long nclGetExtensionFunctionAddressForPlatform(long platform, long funcname) {
        long __functionAddress = CL.getICD().clGetExtensionFunctionAddressForPlatform;
        if (CHECKS) {
            check(__functionAddress);
            check(platform);
        }
        return callPPP(platform, funcname, __functionAddress);
    }

    /** {@code void * clGetExtensionFunctionAddressForPlatform(cl_platform_id platform, cl_char const * funcname)} */
    @NativeType("void *")
    public static long clGetExtensionFunctionAddressForPlatform(@NativeType("cl_platform_id") long platform, @NativeType("cl_char const *") ByteBuffer funcname) {
        if (CHECKS) {
            checkNT1(funcname);
        }
        return nclGetExtensionFunctionAddressForPlatform(platform, memAddress(funcname));
    }

    /** {@code void * clGetExtensionFunctionAddressForPlatform(cl_platform_id platform, cl_char const * funcname)} */
    @NativeType("void *")
    public static long clGetExtensionFunctionAddressForPlatform(@NativeType("cl_platform_id") long platform, @NativeType("cl_char const *") CharSequence funcname) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(funcname, true);
            long funcnameEncoded = stack.getPointerAddress();
            return nclGetExtensionFunctionAddressForPlatform(platform, funcnameEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clRetainDevice ] ---

    /** {@code cl_int clRetainDevice(cl_device_id device)} */
    @NativeType("cl_int")
    public static int clRetainDevice(@NativeType("cl_device_id") long device) {
        long __functionAddress = CL.getICD().clRetainDevice;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPI(device, __functionAddress);
    }

    // --- [ clReleaseDevice ] ---

    /** {@code cl_int clReleaseDevice(cl_device_id device)} */
    @NativeType("cl_int")
    public static int clReleaseDevice(@NativeType("cl_device_id") long device) {
        long __functionAddress = CL.getICD().clReleaseDevice;
        if (CHECKS) {
            check(__functionAddress);
            check(device);
        }
        return callPI(device, __functionAddress);
    }

    // --- [ clCreateSubDevices ] ---

    /** {@code cl_int clCreateSubDevices(cl_device_id in_device, cl_device_partition_property const * properties, cl_uint num_devices, cl_device_id * out_devices, cl_uint * num_devices_ret)} */
    public static int nclCreateSubDevices(long in_device, long properties, int num_devices, long out_devices, long num_devices_ret) {
        long __functionAddress = CL.getICD().clCreateSubDevices;
        if (CHECKS) {
            check(__functionAddress);
            check(in_device);
        }
        return callPPPPI(in_device, properties, num_devices, out_devices, num_devices_ret, __functionAddress);
    }

    /** {@code cl_int clCreateSubDevices(cl_device_id in_device, cl_device_partition_property const * properties, cl_uint num_devices, cl_device_id * out_devices, cl_uint * num_devices_ret)} */
    @NativeType("cl_int")
    public static int clCreateSubDevices(@NativeType("cl_device_id") long in_device, @NativeType("cl_device_partition_property const *") PointerBuffer properties, @NativeType("cl_device_id *") @Nullable PointerBuffer out_devices, @NativeType("cl_uint *") @Nullable IntBuffer num_devices_ret) {
        if (CHECKS) {
            checkNT(properties);
            checkSafe(num_devices_ret, 1);
        }
        return nclCreateSubDevices(in_device, memAddress(properties), remainingSafe(out_devices), memAddressSafe(out_devices), memAddressSafe(num_devices_ret));
    }

    // --- [ clCreateImage ] ---

    /** {@code cl_mem clCreateImage(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    public static long nclCreateImage(long context, long flags, long image_format, long image_desc, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJPPPPP(context, flags, image_format, image_desc, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") @Nullable ByteBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage(context, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImage(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") @Nullable ShortBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage(context, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImage(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") @Nullable IntBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage(context, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImage(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") @Nullable FloatBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImage(context, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    // --- [ clCreateProgramWithBuiltInKernels ] ---

    /** {@code cl_program clCreateProgramWithBuiltInKernels(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * kernel_names, cl_int * errcode_ret)} */
    public static long nclCreateProgramWithBuiltInKernels(long context, int num_devices, long device_list, long kernel_names, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithBuiltInKernels;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPP(context, num_devices, device_list, kernel_names, errcode_ret, __functionAddress);
    }

    /** {@code cl_program clCreateProgramWithBuiltInKernels(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * kernel_names, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithBuiltInKernels(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") ByteBuffer kernel_names, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNT1(kernel_names);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateProgramWithBuiltInKernels(context, device_list.remaining(), memAddress(device_list), memAddress(kernel_names), memAddressSafe(errcode_ret));
    }

    /** {@code cl_program clCreateProgramWithBuiltInKernels(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * kernel_names, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithBuiltInKernels(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") CharSequence kernel_names, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(kernel_names, true);
            long kernel_namesEncoded = stack.getPointerAddress();
            return nclCreateProgramWithBuiltInKernels(context, device_list.remaining(), memAddress(device_list), kernel_namesEncoded, memAddressSafe(errcode_ret));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code cl_program clCreateProgramWithBuiltInKernels(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * kernel_names, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithBuiltInKernels(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") long device, @NativeType("cl_char const *") CharSequence kernel_names, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(kernel_names, true);
            long kernel_namesEncoded = stack.getPointerAddress();
            PointerBuffer device_list = stack.pointers(device);
            return nclCreateProgramWithBuiltInKernels(context, 1, memAddress(device_list), kernel_namesEncoded, memAddressSafe(errcode_ret));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clCompileProgram ] ---

    /** {@code cl_int clCompileProgram(cl_program program, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, cl_uint num_input_headers, cl_program const * input_headers, cl_char const ** header_include_names, void (*) (cl_program, void *) pfn_notify, void * user_data)} */
    public static int nclCompileProgram(long program, int num_devices, long device_list, long options, int num_input_headers, long input_headers, long header_include_names, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clCompileProgram;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPPPPPI(program, num_devices, device_list, options, num_input_headers, input_headers, header_include_names, pfn_notify, user_data, __functionAddress);
    }

    /** {@code cl_int clCompileProgram(cl_program program, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, cl_uint num_input_headers, cl_program const * input_headers, cl_char const ** header_include_names, void (*) (cl_program, void *) pfn_notify, void * user_data)} */
    @NativeType("cl_int")
    public static int clCompileProgram(@NativeType("cl_program") long program, @NativeType("cl_device_id const *") @Nullable PointerBuffer device_list, @NativeType("cl_char const *") ByteBuffer options, @NativeType("cl_program const *") @Nullable PointerBuffer input_headers, @NativeType("cl_char const **") @Nullable PointerBuffer header_include_names, @NativeType("void (*) (cl_program, void *)") @Nullable CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        if (CHECKS) {
            checkNT1(options);
            checkSafe(header_include_names, remainingSafe(input_headers));
        }
        return nclCompileProgram(program, remainingSafe(device_list), memAddressSafe(device_list), memAddress(options), remainingSafe(input_headers), memAddressSafe(input_headers), memAddressSafe(header_include_names), memAddressSafe(pfn_notify), user_data);
    }

    /** {@code cl_int clCompileProgram(cl_program program, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, cl_uint num_input_headers, cl_program const * input_headers, cl_char const ** header_include_names, void (*) (cl_program, void *) pfn_notify, void * user_data)} */
    @NativeType("cl_int")
    public static int clCompileProgram(@NativeType("cl_program") long program, @NativeType("cl_device_id const *") @Nullable PointerBuffer device_list, @NativeType("cl_char const *") CharSequence options, @NativeType("cl_program const *") @Nullable PointerBuffer input_headers, @NativeType("cl_char const **") @Nullable PointerBuffer header_include_names, @NativeType("void (*) (cl_program, void *)") @Nullable CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data) {
        if (CHECKS) {
            checkSafe(header_include_names, remainingSafe(input_headers));
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(options, true);
            long optionsEncoded = stack.getPointerAddress();
            return nclCompileProgram(program, remainingSafe(device_list), memAddressSafe(device_list), optionsEncoded, remainingSafe(input_headers), memAddressSafe(input_headers), memAddressSafe(header_include_names), memAddressSafe(pfn_notify), user_data);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clLinkProgram ] ---

    /** {@code cl_program clLinkProgram(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, cl_uint num_input_programs, cl_program const * input_programs, void (*) (cl_program, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    public static long nclLinkProgram(long context, int num_devices, long device_list, long options, int num_input_programs, long input_programs, long pfn_notify, long user_data, long errcode_ret) {
        long __functionAddress = CL.getICD().clLinkProgram;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPPPPP(context, num_devices, device_list, options, num_input_programs, input_programs, pfn_notify, user_data, errcode_ret, __functionAddress);
    }

    /** {@code cl_program clLinkProgram(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, cl_uint num_input_programs, cl_program const * input_programs, void (*) (cl_program, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clLinkProgram(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") @Nullable PointerBuffer device_list, @NativeType("cl_char const *") ByteBuffer options, @NativeType("cl_program const *") @Nullable PointerBuffer input_programs, @NativeType("void (*) (cl_program, void *)") @Nullable CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNT1(options);
            checkSafe(errcode_ret, 1);
        }
        return nclLinkProgram(context, remainingSafe(device_list), memAddressSafe(device_list), memAddress(options), remainingSafe(input_programs), memAddressSafe(input_programs), memAddressSafe(pfn_notify), user_data, memAddressSafe(errcode_ret));
    }

    /** {@code cl_program clLinkProgram(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, cl_uint num_input_programs, cl_program const * input_programs, void (*) (cl_program, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clLinkProgram(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") @Nullable PointerBuffer device_list, @NativeType("cl_char const *") CharSequence options, @NativeType("cl_program const *") @Nullable PointerBuffer input_programs, @NativeType("void (*) (cl_program, void *)") @Nullable CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(options, true);
            long optionsEncoded = stack.getPointerAddress();
            return nclLinkProgram(context, remainingSafe(device_list), memAddressSafe(device_list), optionsEncoded, remainingSafe(input_programs), memAddressSafe(input_programs), memAddressSafe(pfn_notify), user_data, memAddressSafe(errcode_ret));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code cl_program clLinkProgram(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, cl_uint num_input_programs, cl_program const * input_programs, void (*) (cl_program, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clLinkProgram(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") @Nullable PointerBuffer device_list, @NativeType("cl_char const *") CharSequence options, @NativeType("cl_program const *") long input_program, @NativeType("void (*) (cl_program, void *)") @Nullable CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(options, true);
            long optionsEncoded = stack.getPointerAddress();
            PointerBuffer input_programs = stack.pointers(input_program);
            return nclLinkProgram(context, remainingSafe(device_list), memAddressSafe(device_list), optionsEncoded, 1, memAddress(input_programs), memAddressSafe(pfn_notify), user_data, memAddressSafe(errcode_ret));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ clUnloadPlatformCompiler ] ---

    /** {@code cl_int clUnloadPlatformCompiler(cl_platform_id platform)} */
    @NativeType("cl_int")
    public static int clUnloadPlatformCompiler(@NativeType("cl_platform_id") long platform) {
        long __functionAddress = CL.getICD().clUnloadPlatformCompiler;
        if (CHECKS) {
            check(__functionAddress);
            check(platform);
        }
        return callPI(platform, __functionAddress);
    }

    // --- [ clGetKernelArgInfo ] ---

    /** {@code cl_int clGetKernelArgInfo(cl_kernel kernel, cl_uint arg_indx, cl_kernel_arg_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    public static int nclGetKernelArgInfo(long kernel, int arg_indx, int param_name, long param_value_size, long param_value, long param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelArgInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
        }
        return callPPPPI(kernel, arg_indx, param_name, param_value_size, param_value, param_value_size_ret, __functionAddress);
    }

    /** {@code cl_int clGetKernelArgInfo(cl_kernel kernel, cl_uint arg_indx, cl_kernel_arg_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelArgInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_indx, @NativeType("cl_kernel_arg_info") int param_name, @NativeType("void *") @Nullable ByteBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelArgInfo(kernel, arg_indx, param_name, remainingSafe(param_value), memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetKernelArgInfo(cl_kernel kernel, cl_uint arg_indx, cl_kernel_arg_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelArgInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_indx, @NativeType("cl_kernel_arg_info") int param_name, @NativeType("void *") @Nullable IntBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelArgInfo(kernel, arg_indx, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 2, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    /** {@code cl_int clGetKernelArgInfo(cl_kernel kernel, cl_uint arg_indx, cl_kernel_arg_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelArgInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_indx, @NativeType("cl_kernel_arg_info") int param_name, @NativeType("void *") @Nullable LongBuffer param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        if (CHECKS) {
            checkSafe(param_value_size_ret, 1);
        }
        return nclGetKernelArgInfo(kernel, arg_indx, param_name, Integer.toUnsignedLong(remainingSafe(param_value)) << 3, memAddressSafe(param_value), memAddressSafe(param_value_size_ret));
    }

    // --- [ clEnqueueFillBuffer ] ---

    /** {@code cl_int clEnqueueFillBuffer(cl_command_queue command_queue, cl_mem buffer, void const * pattern, size_t pattern_size, size_t offset, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueFillBuffer(long command_queue, long buffer, long pattern, long pattern_size, long offset, long size, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueFillBuffer;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(buffer);
        }
        return callPPPPPPPPI(command_queue, buffer, pattern, pattern_size, offset, size, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueFillBuffer(cl_command_queue command_queue, cl_mem buffer, void const * pattern, size_t pattern_size, size_t offset, size_t size, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueFillBuffer(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long buffer, @NativeType("void const *") ByteBuffer pattern, @NativeType("size_t") long offset, @NativeType("size_t") long size, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueFillBuffer(command_queue, buffer, memAddress(pattern), pattern.remaining(), offset, size, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueFillImage ] ---

    /** {@code cl_int clEnqueueFillImage(cl_command_queue command_queue, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueFillImage(long command_queue, long image, long fill_color, long origin, long region, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueFillImage;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(image);
        }
        return callPPPPPPPI(command_queue, image, fill_color, origin, region, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueFillImage(cl_command_queue command_queue, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueFillImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") ByteBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(fill_color, 16);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueFillImage(command_queue, image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueFillImage(cl_command_queue command_queue, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueFillImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") IntBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueFillImage(command_queue, image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clEnqueueFillImage(cl_command_queue command_queue, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueFillImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") FloatBuffer fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return nclEnqueueFillImage(command_queue, image, memAddress(fill_color), memAddress(origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMigrateMemObjects ] ---

    /** {@code cl_int clEnqueueMigrateMemObjects(cl_command_queue command_queue, cl_uint num_mem_objects, cl_mem const * mem_objects, cl_mem_migration_flags flags, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueMigrateMemObjects(long command_queue, int num_mem_objects, long mem_objects, long flags, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMigrateMemObjects;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPJPPI(command_queue, num_mem_objects, mem_objects, flags, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueMigrateMemObjects(cl_command_queue command_queue, cl_uint num_mem_objects, cl_mem const * mem_objects, cl_mem_migration_flags flags, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueMigrateMemObjects(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem const *") PointerBuffer mem_objects, @NativeType("cl_mem_migration_flags") long flags, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMigrateMemObjects(command_queue, mem_objects.remaining(), memAddress(mem_objects), flags, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueMarkerWithWaitList ] ---

    /** {@code cl_int clEnqueueMarkerWithWaitList(cl_command_queue command_queue, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueMarkerWithWaitList(long command_queue, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueMarkerWithWaitList;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPI(command_queue, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueMarkerWithWaitList(cl_command_queue command_queue, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueMarkerWithWaitList(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueMarkerWithWaitList(command_queue, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    // --- [ clEnqueueBarrierWithWaitList ] ---

    /** {@code cl_int clEnqueueBarrierWithWaitList(cl_command_queue command_queue, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    public static int nclEnqueueBarrierWithWaitList(long command_queue, int num_events_in_wait_list, long event_wait_list, long event) {
        long __functionAddress = CL.getICD().clEnqueueBarrierWithWaitList;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
        }
        return callPPPI(command_queue, num_events_in_wait_list, event_wait_list, event, __functionAddress);
    }

    /** {@code cl_int clEnqueueBarrierWithWaitList(cl_command_queue command_queue, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueBarrierWithWaitList(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        if (CHECKS) {
            checkSafe(event, 1);
        }
        return nclEnqueueBarrierWithWaitList(command_queue, remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event));
    }

    /** {@code cl_int clCreateSubDevices(cl_device_id in_device, cl_device_partition_property const * properties, cl_uint num_devices, cl_device_id * out_devices, cl_uint * num_devices_ret)} */
    @NativeType("cl_int")
    public static int clCreateSubDevices(@NativeType("cl_device_id") long in_device, @NativeType("cl_device_partition_property const *") PointerBuffer properties, @NativeType("cl_device_id *") @Nullable PointerBuffer out_devices, @NativeType("cl_uint *") int @Nullable [] num_devices_ret) {
        long __functionAddress = CL.getICD().clCreateSubDevices;
        if (CHECKS) {
            check(__functionAddress);
            check(in_device);
            checkNT(properties);
            checkSafe(num_devices_ret, 1);
        }
        return callPPPPI(in_device, memAddress(properties), remainingSafe(out_devices), memAddressSafe(out_devices), num_devices_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") @Nullable ByteBuffer host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPP(context, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") short @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPP(context, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") int @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPP(context, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImage(cl_context context, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImage(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") float @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImage;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJPPPPP(context, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_program clCreateProgramWithBuiltInKernels(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * kernel_names, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithBuiltInKernels(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") ByteBuffer kernel_names, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithBuiltInKernels;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNT1(kernel_names);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(context, device_list.remaining(), memAddress(device_list), memAddress(kernel_names), errcode_ret, __functionAddress);
    }

    /** {@code cl_program clCreateProgramWithBuiltInKernels(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * kernel_names, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithBuiltInKernels(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") PointerBuffer device_list, @NativeType("cl_char const *") CharSequence kernel_names, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithBuiltInKernels;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(kernel_names, true);
            long kernel_namesEncoded = stack.getPointerAddress();
            return callPPPPP(context, device_list.remaining(), memAddress(device_list), kernel_namesEncoded, errcode_ret, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code cl_program clLinkProgram(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, cl_uint num_input_programs, cl_program const * input_programs, void (*) (cl_program, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clLinkProgram(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") @Nullable PointerBuffer device_list, @NativeType("cl_char const *") ByteBuffer options, @NativeType("cl_program const *") @Nullable PointerBuffer input_programs, @NativeType("void (*) (cl_program, void *)") @Nullable CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clLinkProgram;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNT1(options);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPPPPP(context, remainingSafe(device_list), memAddressSafe(device_list), memAddress(options), remainingSafe(input_programs), memAddressSafe(input_programs), memAddressSafe(pfn_notify), user_data, errcode_ret, __functionAddress);
    }

    /** {@code cl_program clLinkProgram(cl_context context, cl_uint num_devices, cl_device_id const * device_list, cl_char const * options, cl_uint num_input_programs, cl_program const * input_programs, void (*) (cl_program, void *) pfn_notify, void * user_data, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clLinkProgram(@NativeType("cl_context") long context, @NativeType("cl_device_id const *") @Nullable PointerBuffer device_list, @NativeType("cl_char const *") CharSequence options, @NativeType("cl_program const *") @Nullable PointerBuffer input_programs, @NativeType("void (*) (cl_program, void *)") @Nullable CLProgramCallbackI pfn_notify, @NativeType("void *") long user_data, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clLinkProgram;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(options, true);
            long optionsEncoded = stack.getPointerAddress();
            return callPPPPPPPP(context, remainingSafe(device_list), memAddressSafe(device_list), optionsEncoded, remainingSafe(input_programs), memAddressSafe(input_programs), memAddressSafe(pfn_notify), user_data, errcode_ret, __functionAddress);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** {@code cl_int clGetKernelArgInfo(cl_kernel kernel, cl_uint arg_indx, cl_kernel_arg_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelArgInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_indx, @NativeType("cl_kernel_arg_info") int param_name, @NativeType("void *") int @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelArgInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(kernel, arg_indx, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 2, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clGetKernelArgInfo(cl_kernel kernel, cl_uint arg_indx, cl_kernel_arg_info param_name, size_t param_value_size, void * param_value, size_t * param_value_size_ret)} */
    @NativeType("cl_int")
    public static int clGetKernelArgInfo(@NativeType("cl_kernel") long kernel, @NativeType("cl_uint") int arg_indx, @NativeType("cl_kernel_arg_info") int param_name, @NativeType("void *") long @Nullable [] param_value, @NativeType("size_t *") @Nullable PointerBuffer param_value_size_ret) {
        long __functionAddress = CL.getICD().clGetKernelArgInfo;
        if (CHECKS) {
            check(__functionAddress);
            check(kernel);
            checkSafe(param_value_size_ret, 1);
        }
        return callPPPPI(kernel, arg_indx, param_name, Integer.toUnsignedLong(lengthSafe(param_value)) << 3, param_value, memAddressSafe(param_value_size_ret), __functionAddress);
    }

    /** {@code cl_int clEnqueueFillImage(cl_command_queue command_queue, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueFillImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") int[] fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueFillImage;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(image);
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, image, fill_color, memAddress(origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

    /** {@code cl_int clEnqueueFillImage(cl_command_queue command_queue, cl_mem image, void const * fill_color, size_t const * origin, size_t const * region, cl_uint num_events_in_wait_list, cl_event const * event_wait_list, cl_event * event)} */
    @NativeType("cl_int")
    public static int clEnqueueFillImage(@NativeType("cl_command_queue") long command_queue, @NativeType("cl_mem") long image, @NativeType("void const *") float[] fill_color, @NativeType("size_t const *") PointerBuffer origin, @NativeType("size_t const *") PointerBuffer region, @NativeType("cl_event const *") @Nullable PointerBuffer event_wait_list, @NativeType("cl_event *") @Nullable PointerBuffer event) {
        long __functionAddress = CL.getICD().clEnqueueFillImage;
        if (CHECKS) {
            check(__functionAddress);
            check(command_queue);
            check(image);
            check(fill_color, 16 >> 2);
            check(origin, 3);
            check(region, 3);
            checkSafe(event, 1);
        }
        return callPPPPPPPI(command_queue, image, fill_color, memAddress(origin), memAddress(region), remainingSafe(event_wait_list), memAddressSafe(event_wait_list), memAddressSafe(event), __functionAddress);
    }

}