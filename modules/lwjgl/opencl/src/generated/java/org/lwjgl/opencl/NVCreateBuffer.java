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

public class NVCreateBuffer {

    public static final int
        CL_MEM_LOCATION_HOST_NV = (1 << 0),
        CL_MEM_PINNED_NV        = (1 << 1);

    protected NVCreateBuffer() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateBufferNV ] ---

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    public static long nclCreateBufferNV(long context, long flags, long flags_NV, long size, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPJJPPPP(context, flags, flags_NV, size, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("size_t") long size, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, size, NULL, memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") ByteBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, host_ptr.remaining(), memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") ShortBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.remaining()) << 1, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") IntBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") FloatBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") DoubleBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferNV(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.remaining()) << 3, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") ByteBuffer host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJJPPPP(context, flags, flags_NV, (long)host_ptr.remaining(), memAddress(host_ptr), errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") short[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJJPPPP(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.length) << 1, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") int[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJJPPPP(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") float[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJJPPPP(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferNV(cl_context context, cl_mem_flags flags, cl_mem_flags_NV flags_NV, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferNV(@NativeType("cl_context") long context, @NativeType("cl_mem_flags") long flags, @NativeType("cl_mem_flags_NV") long flags_NV, @NativeType("void *") double[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferNV;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPJJPPPP(context, flags, flags_NV, Integer.toUnsignedLong(host_ptr.length) << 3, host_ptr, errcode_ret, __functionAddress);
    }

}