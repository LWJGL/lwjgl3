/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class CL30 extends CL22 {

    public static final int CL_VERSION_3_0 = 1;

    public static final int CL_PLATFORM_NUMERIC_VERSION = 0x906;

    public static final int CL_PLATFORM_EXTENSIONS_WITH_VERSION = 0x907;

    public static final int CL_DEVICE_NUMERIC_VERSION = 0x105E;

    public static final int CL_DEVICE_EXTENSIONS_WITH_VERSION = 0x1060;

    public static final int CL_DEVICE_ILS_WITH_VERSION = 0x1061;

    public static final int CL_DEVICE_BUILT_IN_KERNELS_WITH_VERSION = 0x1062;

    public static final int CL_DEVICE_ATOMIC_MEMORY_CAPABILITIES = 0x1063;

    public static final int CL_DEVICE_ATOMIC_FENCE_CAPABILITIES = 0x1064;

    public static final int CL_DEVICE_NON_UNIFORM_WORK_GROUP_SUPPORT = 0x1065;

    public static final int CL_DEVICE_OPENCL_C_ALL_VERSIONS = 0x1066;

    public static final int CL_DEVICE_PREFERRED_WORK_GROUP_SIZE_MULTIPLE = 0x1067;

    public static final int CL_DEVICE_WORK_GROUP_COLLECTIVE_FUNCTIONS_SUPPORT = 0x1068;

    public static final int CL_DEVICE_GENERIC_ADDRESS_SPACE_SUPPORT = 0x1069;

    public static final int CL_DEVICE_OPENCL_C_FEATURES = 0x106F;

    public static final int CL_DEVICE_DEVICE_ENQUEUE_CAPABILITIES = 0x1070;

    public static final int CL_DEVICE_PIPE_SUPPORT = 0x1071;

    public static final int CL_DEVICE_LATEST_CONFORMANCE_VERSION_PASSED = 0x1072;

    public static final int CL_QUEUE_PROPERTIES_ARRAY = 0x1098;

    public static final int CL_MEM_PROPERTIES = 0x110A;

    public static final int CL_PIPE_PROPERTIES = 0x1122;

    public static final int CL_SAMPLER_PROPERTIES = 0x1158;

    public static final int CL_COMMAND_SVM_MIGRATE_MEM = 0x120E;

    public static final int
        CL_DEVICE_ATOMIC_ORDER_RELAXED     = (1 << 0),
        CL_DEVICE_ATOMIC_ORDER_ACQ_REL     = (1 << 1),
        CL_DEVICE_ATOMIC_ORDER_SEQ_CST     = (1 << 2),
        CL_DEVICE_ATOMIC_SCOPE_WORK_ITEM   = (1 << 3),
        CL_DEVICE_ATOMIC_SCOPE_WORK_GROUP  = (1 << 4),
        CL_DEVICE_ATOMIC_SCOPE_DEVICE      = (1 << 5),
        CL_DEVICE_ATOMIC_SCOPE_ALL_DEVICES = (1 << 6);

    public static final int
        CL_DEVICE_QUEUE_SUPPORTED           = (1 << 0),
        CL_DEVICE_QUEUE_REPLACEABLE_DEFAULT = (1 << 1);

    public static final int
        CL_VERSION_MAJOR_BITS = 10,
        CL_VERSION_MINOR_BITS = 10,
        CL_VERSION_PATCH_BITS = 12,
        CL_VERSION_MAJOR_MASK = ((1 << CL_VERSION_MAJOR_BITS) - 1),
        CL_VERSION_MINOR_MASK = ((1 << CL_VERSION_MINOR_BITS) - 1),
        CL_VERSION_PATCH_MASK = ((1 << CL_VERSION_PATCH_BITS) - 1);

    protected CL30() {
        throw new UnsupportedOperationException();
    }

    // --- [ CL_VERSION_MAJOR ] ---

    /** {@code uint32_t CL_VERSION_MAJOR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int CL_VERSION_MAJOR(@NativeType("uint32_t") int version) {
        return version >>> (CL_VERSION_MINOR_BITS + CL_VERSION_PATCH_BITS);
    }

    // --- [ CL_VERSION_MINOR ] ---

    /** {@code uint32_t CL_VERSION_MINOR(uint32_t version)} */
    @NativeType("uint32_t")
    public static int CL_VERSION_MINOR(@NativeType("uint32_t") int version) {
        return (version >>> CL_VERSION_PATCH_BITS) & CL_VERSION_MINOR_MASK;
    }

    // --- [ CL_VERSION_PATCH ] ---

    /** {@code uint32_t CL_VERSION_PATCH(uint32_t version)} */
    @NativeType("uint32_t")
    public static int CL_VERSION_PATCH(@NativeType("uint32_t") int version) {
        return version & CL_VERSION_PATCH_MASK;
    }

    // --- [ CL_MAKE_VERSION ] ---

    /** {@code uint32_t CL_MAKE_VERSION(uint32_t major, uint32_t minor, uint32_t patch)} */
    @NativeType("uint32_t")
    public static int CL_MAKE_VERSION(@NativeType("uint32_t") int major, @NativeType("uint32_t") int minor, @NativeType("uint32_t") int patch) {
        return ((major & CL_VERSION_MAJOR_MASK) << (CL_VERSION_MINOR_BITS + CL_VERSION_PATCH_BITS)) |
               ((minor & CL_VERSION_MINOR_MASK) << CL_VERSION_PATCH_BITS) |
               (patch & CL_VERSION_PATCH_MASK);
    }

    // --- [ clSetContextDestructorCallback ] ---

    /** {@code cl_int clSetContextDestructorCallback(cl_context context, void (*) (cl_context, void *) pfn_notify, void * user_data)} */
    public static int nclSetContextDestructorCallback(long context, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clSetContextDestructorCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPI(context, pfn_notify, user_data, __functionAddress);
    }

    /** {@code cl_int clSetContextDestructorCallback(cl_context context, void (*) (cl_context, void *) pfn_notify, void * user_data)} */
    @NativeType("cl_int")
    public static int clSetContextDestructorCallback(@NativeType("cl_context") long context, @NativeType("void (*) (cl_context, void *)") CLContextDestructorCallbackI pfn_notify, @NativeType("void *") long user_data) {
        return nclSetContextDestructorCallback(context, pfn_notify.address(), user_data);
    }

    // --- [ clCreateBufferWithProperties ] ---

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    public static long nclCreateBufferWithProperties(long context, long properties, long flags, long size, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPJPPPP(context, properties, flags, size, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("size_t") long size, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, size, NULL, memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, host_ptr.remaining(), memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ShortBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 1, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") IntBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") FloatBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") DoubleBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithProperties(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 3, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    // --- [ clCreateImageWithProperties ] ---

    /** {@code cl_mem clCreateImageWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    public static long nclCreateImageWithProperties(long context, long properties, long flags, long image_format, long image_desc, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImageWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPJPPPPP(context, properties, flags, image_format, image_desc, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImageWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") @Nullable ByteBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImageWithProperties(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImageWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") @Nullable ShortBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImageWithProperties(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImageWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") @Nullable IntBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImageWithProperties(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateImageWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") @Nullable FloatBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateImageWithProperties(context, memAddressSafe(properties), flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, (long)host_ptr.remaining(), memAddress(host_ptr), errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") short[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 1, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") int[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") float[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") double[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 3, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImageWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") @Nullable ByteBuffer host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImageWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPPP(context, properties, flags, image_format.address(), image_desc.address(), memAddressSafe(host_ptr), errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImageWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") short @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImageWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPPP(context, properties, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImageWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") int @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImageWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPPP(context, properties, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateImageWithProperties(cl_context context, cl_mem_properties const * properties, cl_mem_flags flags, cl_image_format const * image_format, cl_image_desc const * image_desc, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateImageWithProperties(@NativeType("cl_context") long context, @NativeType("cl_mem_properties const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("cl_image_format const *") CLImageFormat image_format, @NativeType("cl_image_desc const *") CLImageDesc image_desc, @NativeType("void *") float @Nullable [] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateImageWithProperties;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPPP(context, properties, flags, image_format.address(), image_desc.address(), host_ptr, errcode_ret, __functionAddress);
    }

}