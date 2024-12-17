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

public class INTELCreateBufferWithProperties {

    protected INTELCreateBufferWithProperties() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateBufferWithPropertiesINTEL ] ---

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    public static long nclCreateBufferWithPropertiesINTEL(long context, long properties, long flags, long size, long host_ptr, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPJPPPP(context, properties, flags, size, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("size_t") long size, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, size, NULL, memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, host_ptr.remaining(), memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ShortBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 1, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") IntBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") FloatBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 2, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") @Nullable LongBuffer properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") DoubleBuffer host_ptr, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return nclCreateBufferWithPropertiesINTEL(context, memAddressSafe(properties), flags, Integer.toUnsignedLong(host_ptr.remaining()) << 3, memAddress(host_ptr), memAddressSafe(errcode_ret));
    }

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") ByteBuffer host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, (long)host_ptr.remaining(), memAddress(host_ptr), errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") short[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 1, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") int[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") float[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 2, host_ptr, errcode_ret, __functionAddress);
    }

    /** {@code cl_mem clCreateBufferWithPropertiesINTEL(cl_context context, cl_mem_properties_intel const * properties, cl_mem_flags flags, size_t size, void * host_ptr, cl_int * errcode_ret)} */
    @NativeType("cl_mem")
    public static long clCreateBufferWithPropertiesINTEL(@NativeType("cl_context") long context, @NativeType("cl_mem_properties_intel const *") long @Nullable [] properties, @NativeType("cl_mem_flags") long flags, @NativeType("void *") double[] host_ptr, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateBufferWithPropertiesINTEL;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkNTSafe(properties);
            checkSafe(errcode_ret, 1);
        }
        return callPPJPPPP(context, properties, flags, Integer.toUnsignedLong(host_ptr.length) << 3, host_ptr, errcode_ret, __functionAddress);
    }

}