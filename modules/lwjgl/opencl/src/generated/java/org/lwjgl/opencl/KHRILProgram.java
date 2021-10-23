/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to the <strong>khr_il_program</strong> extension.
 * 
 * <p>This extension adds the ability to create programs with intermediate language (IL), usually SPIR-V. Further information about the format and contents
 * of SPIR-V may be found in the SPIR-V Specification. Information about how SPIR-V modules behave in the OpenCL environment may be found in the OpenCL
 * SPIR-V Environment Specification.</p>
 * 
 * <p>This functionality described by this extension is a core feature in OpenCL 2.1.</p>
 */
public class KHRILProgram {

    /**
     * Accepted as a new {@code param_name} argument to {@link CL10#clGetDeviceInfo GetDeviceInfo}. ({@code char[]})
     * 
     * <p>The intermediate languages that are be supported by {@link #clCreateProgramWithILKHR CreateProgramWithILKHR} for this device.</p>
     * 
     * <p>Returns a space separated list of IL version strings of the form:</p>
     * 
     * <pre><code>
     * &lt;IL_Prefix&gt;_&lt;Major_version&gt;.&lt;Minor_version&gt;</code></pre>
     * 
     * <p>A device that supports the {@code cl_khr_il_program} extension must support the “SPIR-V” IL prefix.</p>
     */
    public static final int CL_DEVICE_IL_VERSION_KHR = 0x105B;

    /**
     * Accepted as a new {@code param_name} argument to {@link CL10#clGetProgramInfo GetProgramInfo}. ({@code unsigned char[]})
     * 
     * <p>Returns the program IL for programs created with {@link #clCreateProgramWithILKHR CreateProgramWithILKHR}.</p>
     * 
     * <p>If program is created with {@link CL10#clCreateProgramWithSource CreateProgramWithSource}, {@link CL10#clCreateProgramWithBinary CreateProgramWithBinary}, or {@link CL12#clCreateProgramWithBuiltInKernels CreateProgramWithBuiltInKernels}, the memory pointed to by
     * {@code param_value} will be unchanged and {@code param_value_size_ret} will be set to zero.</p>
     */
    public static final int CL_PROGRAM_IL_KHR = 0x1169;

    protected KHRILProgram() {
        throw new UnsupportedOperationException();
    }

    // --- [ clCreateProgramWithILKHR ] ---

    /**
     * Unsafe version of: {@link #clCreateProgramWithILKHR CreateProgramWithILKHR}
     *
     * @param length the length of the block of memory pointed to by {@code il}
     */
    public static long nclCreateProgramWithILKHR(long context, long il, long length, long errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithILKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
        }
        return callPPPPP(context, il, length, errcode_ret, __functionAddress);
    }

    /**
     * Creates a new program object for context using the {@code length} bytes of intermediate language pointed to by {@code il}.
     *
     * @param context     must be a valid OpenCL context
     * @param il          a pointer to a {@code length}-byte block of memory containing intermediate language
     * @param errcode_ret will return an appropriate error code. If {@code errcode_ret} is {@code NULL}, no error code is returned.
     */
    @NativeType("cl_program")
    public static long clCreateProgramWithILKHR(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer il, @Nullable @NativeType("cl_int *") IntBuffer errcode_ret) {
        if (CHECKS) {
            checkSafe(errcode_ret, 1);
        }
        return nclCreateProgramWithILKHR(context, memAddress(il), il.remaining(), memAddressSafe(errcode_ret));
    }

    /** Array version of: {@link #clCreateProgramWithILKHR CreateProgramWithILKHR} */
    @NativeType("cl_program")
    public static long clCreateProgramWithILKHR(@NativeType("cl_context") long context, @NativeType("void const *") ByteBuffer il, @Nullable @NativeType("cl_int *") int[] errcode_ret) {
        long __functionAddress = CL.getICD().clCreateProgramWithILKHR;
        if (CHECKS) {
            check(__functionAddress);
            check(context);
            checkSafe(errcode_ret, 1);
        }
        return callPPPPP(context, memAddress(il), (long)il.remaining(), errcode_ret, __functionAddress);
    }

}