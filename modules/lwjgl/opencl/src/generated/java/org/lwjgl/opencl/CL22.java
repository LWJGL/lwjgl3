/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

public class CL22 extends CL21 {

    public static final int CL_VERSION_2_2 = 1;

    public static final int CL_INVALID_SPEC_ID = -71;

    public static final int CL_MAX_SIZE_RESTRICTION_EXCEEDED = -72;

    public static final int
        CL_PROGRAM_SCOPE_GLOBAL_CTORS_PRESENT = 0x116A,
        CL_PROGRAM_SCOPE_GLOBAL_DTORS_PRESENT = 0x116B;

    protected CL22() {
        throw new UnsupportedOperationException();
    }

    // --- [ clSetProgramReleaseCallback ] ---

    /** {@code cl_int clSetProgramReleaseCallback(cl_program program, void (*) (cl_program, void *) pfn_notify, void * user_data)} */
    public static int nclSetProgramReleaseCallback(long program, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clSetProgramReleaseCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(program, pfn_notify, user_data, __functionAddress);
    }

    /** {@code cl_int clSetProgramReleaseCallback(cl_program program, void (*) (cl_program, void *) pfn_notify, void * user_data)} */
    @NativeType("cl_int")
    public static int clSetProgramReleaseCallback(@NativeType("cl_program") long program, @NativeType("void (*) (cl_program, void *)") CLProgramReleaseCallbackI pfn_notify, @NativeType("void *") long user_data) {
        return nclSetProgramReleaseCallback(program, pfn_notify.address(), user_data);
    }

    // --- [ clSetProgramSpecializationConstant ] ---

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    public static int nclSetProgramSpecializationConstant(long program, int spec_id, long spec_size, long spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(program, spec_id, spec_size, spec_value, __functionAddress);
    }

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") ByteBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, spec_value.remaining(), memAddress(spec_value));
    }

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") ShortBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, Integer.toUnsignedLong(spec_value.remaining()) << 1, memAddress(spec_value));
    }

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") IntBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, Integer.toUnsignedLong(spec_value.remaining()) << 2, memAddress(spec_value));
    }

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") LongBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, Integer.toUnsignedLong(spec_value.remaining()) << 3, memAddress(spec_value));
    }

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") FloatBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, Integer.toUnsignedLong(spec_value.remaining()) << 2, memAddress(spec_value));
    }

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") DoubleBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, Integer.toUnsignedLong(spec_value.remaining()) << 3, memAddress(spec_value));
    }

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") short[] spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(program, spec_id, Integer.toUnsignedLong(spec_value.length) << 1, spec_value, __functionAddress);
    }

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") int[] spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(program, spec_id, Integer.toUnsignedLong(spec_value.length) << 2, spec_value, __functionAddress);
    }

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") long[] spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(program, spec_id, Integer.toUnsignedLong(spec_value.length) << 3, spec_value, __functionAddress);
    }

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") float[] spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(program, spec_id, Integer.toUnsignedLong(spec_value.length) << 2, spec_value, __functionAddress);
    }

    /** {@code cl_int clSetProgramSpecializationConstant(cl_program program, cl_uint spec_id, size_t spec_size, void const * spec_value)} */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") double[] spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(program, spec_id, Integer.toUnsignedLong(spec_value.length) << 3, spec_value, __functionAddress);
    }

}