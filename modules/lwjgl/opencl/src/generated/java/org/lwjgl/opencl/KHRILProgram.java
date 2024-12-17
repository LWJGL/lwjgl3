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

public class KHRILProgram {

    public static final int CL_DEVICE_IL_VERSION_KHR = 0x105B;

    public static final int CL_PROGRAM_IL_KHR = 0x1169;

    protected KHRILProgram() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateProgramWithILKHR ] ---

    /** {@code cl_program clCreateProgramWithILKHR(cl_context context, void const * il, size_t length, cl_int * errcode_ret)} */
    public static long nclCreateProgramWithILKHR(long context, long il, long length, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithILKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPP(context, il, length, errcode_ret, __functionAddress);
    }

    /** {@code cl_program clCreateProgramWithILKHR(cl_context context, void const * il, size_t length, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithILKHR(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer il, @NativeType("cl_int *") @Nullable IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateProgramWithILKHR(context, memAddress(il), il.remaining(), memAddressSafe(errcode_ret));
    }

    /** {@code cl_program clCreateProgramWithILKHR(cl_context context, void const * il, size_t length, cl_int * errcode_ret)} */
    @NativeType("cl_program")
    public static long clCreateProgramWithILKHR(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer il, @NativeType("cl_int *") int @Nullable [] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithILKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(context, memAddress(il), (long)il.remaining(), errcode_ret, __functionAddress);
    }

}