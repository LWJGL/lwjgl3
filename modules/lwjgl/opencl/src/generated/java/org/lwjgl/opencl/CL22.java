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

/** The core OpenCL 2.2 functionality. */
public class CL22 extends CL21 {

    /** OpenCL Version. */
    public static final int CL_VERSION_2_2 = 1;

    /** Error Codes */
    public static final int
        CL_INVALID_SPEC_ID               = -71,
        CL_MAX_SIZE_RESTRICTION_EXCEEDED = -72;

    /** cl_program_info */
    public static final int
        CL_PROGRAM_SCOPE_GLOBAL_CTORS_PRESENT = 0x116A,
        CL_PROGRAM_SCOPE_GLOBAL_DTORS_PRESENT = 0x116B;

    protected CL22() {
        throw new UnsupportedOperationException();
    }

    static boolean isAvailable(CLCapabilities caps) {
        return checkFunctions(
            caps.clSetProgramReleaseCallback, caps.clSetProgramSpecializationConstant
        );
    }

    // --- [ clSetProgramReleaseCallback ] ---

    /** Unsafe version of: {@link #clSetProgramReleaseCallback SetProgramReleaseCallback} */
    public static int nclSetProgramReleaseCallback(long program, long pfn_notify, long user_data) {
        long __functionAddress = CL.getICD().clSetProgramReleaseCallback;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(__functionAddress, program, pfn_notify, user_data);
    }

    /**
     * Registers a user callback function with a program object.
     * 
     * <p>Each call to {@code clSetProgramReleaseCallback} registers the specified user callback function on a callback stack associated with program. The
     * registered user callback functions are called in the reverse order in which they were registered. The user callback functions are called after
     * destructors (if any) for program scope global variables (if any) are called and before the program is released. This provides a mechanism for the
     * application (and libraries) to be notified when destructors are complete.</p>
     *
     * @param program    a valid program object
     * @param pfn_notify the callback function that can be registered by the application. This callback function may be called asynchronously by the OpenCL implementation.
     *                   It is the applications responsibility to ensure that the callback function is thread safe.
     * @param user_data  a pointer to user supplied data. {@code user_data} will be passed as the {@code user_data} argument when {@code pfn_notify} is called.
     *                   {@code user_data} can be {@code NULL}.
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramReleaseCallback.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramReleaseCallback(@NativeType("cl_program") long program, @NativeType("void (*) (cl_program, void *)") CLProgramReleaseCallbackI pfn_notify, @NativeType("void *") long user_data) {
        return nclSetProgramReleaseCallback(program, pfn_notify.address(), user_data);
    }

    // --- [ clSetProgramSpecializationConstant ] ---

    /**
     * Unsafe version of: {@link #clSetProgramSpecializationConstant SetProgramSpecializationConstant}
     *
     * @param spec_size specifies the size in bytes of the data pointed to by {@code spec_value}. This should be 1 for boolean constants. For all other constant types this
     *                  should match the size of the specialization constant in the SPIR-V module.
     */
    public static int nclSetProgramSpecializationConstant(long program, int spec_id, long spec_size, long spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(__functionAddress, program, spec_id, spec_size, spec_value);
    }

    /**
     * Sets the values of a SPIR-V specialization constants.
     * 
     * <p>Calling this function multiple times for the same specialization constant shall cause the last provided value to override any previously specified
     * value. The values are used by a subsequent {@link CL10#clBuildProgram BuildProgram} call for the program.</p>
     * 
     * <p>Application is not required to provide values for every specialization constant contained in SPIR-V module. SPIR-V provides default values for all
     * specialization constants.</p>
     *
     * @param program    must be a valid OpenCL program created from a SPIR-V module
     * @param spec_id    identifies the SPIR-V specialization constant whose value will be set
     * @param spec_value a pointer to the memory location that contains the value of the specialization constant. The data pointed to by {@code spec_value} are copied and
     *                   can be safely reused by the application after {@code clSetProgramSpecializationConstant} returns. This specialization value will be used by
     *                   subsequent calls to {@link CL10#clBuildProgram BuildProgram} until another call to {@code clSetProgramSpecializationConstant} changes it. If a specialization constant is a
     *                   boolean constant, {@code spec_value} should be a pointer to a {@code cl_uchar} value. A value of zero will set the specialization constant to
     *                   false; any other value will set it to true.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object created from a SPIR-V module.</li>
     *         <li>{@link #CL_INVALID_SPEC_ID INVALID_SPEC_ID} if {@code spec_id} is not a valid specialization constant ID</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code spec_size} does not match the size of the specialization constant in the SPIR-V module, or if {@code spec_value} is
     *         {@code NULL}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramSpecializationConstant.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") ByteBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, spec_value.remaining(), memAddress(spec_value));
    }

    /**
     * Sets the values of a SPIR-V specialization constants.
     * 
     * <p>Calling this function multiple times for the same specialization constant shall cause the last provided value to override any previously specified
     * value. The values are used by a subsequent {@link CL10#clBuildProgram BuildProgram} call for the program.</p>
     * 
     * <p>Application is not required to provide values for every specialization constant contained in SPIR-V module. SPIR-V provides default values for all
     * specialization constants.</p>
     *
     * @param program    must be a valid OpenCL program created from a SPIR-V module
     * @param spec_id    identifies the SPIR-V specialization constant whose value will be set
     * @param spec_value a pointer to the memory location that contains the value of the specialization constant. The data pointed to by {@code spec_value} are copied and
     *                   can be safely reused by the application after {@code clSetProgramSpecializationConstant} returns. This specialization value will be used by
     *                   subsequent calls to {@link CL10#clBuildProgram BuildProgram} until another call to {@code clSetProgramSpecializationConstant} changes it. If a specialization constant is a
     *                   boolean constant, {@code spec_value} should be a pointer to a {@code cl_uchar} value. A value of zero will set the specialization constant to
     *                   false; any other value will set it to true.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object created from a SPIR-V module.</li>
     *         <li>{@link #CL_INVALID_SPEC_ID INVALID_SPEC_ID} if {@code spec_id} is not a valid specialization constant ID</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code spec_size} does not match the size of the specialization constant in the SPIR-V module, or if {@code spec_value} is
     *         {@code NULL}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramSpecializationConstant.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") ShortBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, Integer.toUnsignedLong(spec_value.remaining()) << 1, memAddress(spec_value));
    }

    /**
     * Sets the values of a SPIR-V specialization constants.
     * 
     * <p>Calling this function multiple times for the same specialization constant shall cause the last provided value to override any previously specified
     * value. The values are used by a subsequent {@link CL10#clBuildProgram BuildProgram} call for the program.</p>
     * 
     * <p>Application is not required to provide values for every specialization constant contained in SPIR-V module. SPIR-V provides default values for all
     * specialization constants.</p>
     *
     * @param program    must be a valid OpenCL program created from a SPIR-V module
     * @param spec_id    identifies the SPIR-V specialization constant whose value will be set
     * @param spec_value a pointer to the memory location that contains the value of the specialization constant. The data pointed to by {@code spec_value} are copied and
     *                   can be safely reused by the application after {@code clSetProgramSpecializationConstant} returns. This specialization value will be used by
     *                   subsequent calls to {@link CL10#clBuildProgram BuildProgram} until another call to {@code clSetProgramSpecializationConstant} changes it. If a specialization constant is a
     *                   boolean constant, {@code spec_value} should be a pointer to a {@code cl_uchar} value. A value of zero will set the specialization constant to
     *                   false; any other value will set it to true.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object created from a SPIR-V module.</li>
     *         <li>{@link #CL_INVALID_SPEC_ID INVALID_SPEC_ID} if {@code spec_id} is not a valid specialization constant ID</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code spec_size} does not match the size of the specialization constant in the SPIR-V module, or if {@code spec_value} is
     *         {@code NULL}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramSpecializationConstant.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") IntBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, Integer.toUnsignedLong(spec_value.remaining()) << 2, memAddress(spec_value));
    }

    /**
     * Sets the values of a SPIR-V specialization constants.
     * 
     * <p>Calling this function multiple times for the same specialization constant shall cause the last provided value to override any previously specified
     * value. The values are used by a subsequent {@link CL10#clBuildProgram BuildProgram} call for the program.</p>
     * 
     * <p>Application is not required to provide values for every specialization constant contained in SPIR-V module. SPIR-V provides default values for all
     * specialization constants.</p>
     *
     * @param program    must be a valid OpenCL program created from a SPIR-V module
     * @param spec_id    identifies the SPIR-V specialization constant whose value will be set
     * @param spec_value a pointer to the memory location that contains the value of the specialization constant. The data pointed to by {@code spec_value} are copied and
     *                   can be safely reused by the application after {@code clSetProgramSpecializationConstant} returns. This specialization value will be used by
     *                   subsequent calls to {@link CL10#clBuildProgram BuildProgram} until another call to {@code clSetProgramSpecializationConstant} changes it. If a specialization constant is a
     *                   boolean constant, {@code spec_value} should be a pointer to a {@code cl_uchar} value. A value of zero will set the specialization constant to
     *                   false; any other value will set it to true.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object created from a SPIR-V module.</li>
     *         <li>{@link #CL_INVALID_SPEC_ID INVALID_SPEC_ID} if {@code spec_id} is not a valid specialization constant ID</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code spec_size} does not match the size of the specialization constant in the SPIR-V module, or if {@code spec_value} is
     *         {@code NULL}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramSpecializationConstant.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") LongBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, Integer.toUnsignedLong(spec_value.remaining()) << 3, memAddress(spec_value));
    }

    /**
     * Sets the values of a SPIR-V specialization constants.
     * 
     * <p>Calling this function multiple times for the same specialization constant shall cause the last provided value to override any previously specified
     * value. The values are used by a subsequent {@link CL10#clBuildProgram BuildProgram} call for the program.</p>
     * 
     * <p>Application is not required to provide values for every specialization constant contained in SPIR-V module. SPIR-V provides default values for all
     * specialization constants.</p>
     *
     * @param program    must be a valid OpenCL program created from a SPIR-V module
     * @param spec_id    identifies the SPIR-V specialization constant whose value will be set
     * @param spec_value a pointer to the memory location that contains the value of the specialization constant. The data pointed to by {@code spec_value} are copied and
     *                   can be safely reused by the application after {@code clSetProgramSpecializationConstant} returns. This specialization value will be used by
     *                   subsequent calls to {@link CL10#clBuildProgram BuildProgram} until another call to {@code clSetProgramSpecializationConstant} changes it. If a specialization constant is a
     *                   boolean constant, {@code spec_value} should be a pointer to a {@code cl_uchar} value. A value of zero will set the specialization constant to
     *                   false; any other value will set it to true.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object created from a SPIR-V module.</li>
     *         <li>{@link #CL_INVALID_SPEC_ID INVALID_SPEC_ID} if {@code spec_id} is not a valid specialization constant ID</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code spec_size} does not match the size of the specialization constant in the SPIR-V module, or if {@code spec_value} is
     *         {@code NULL}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramSpecializationConstant.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") FloatBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, Integer.toUnsignedLong(spec_value.remaining()) << 2, memAddress(spec_value));
    }

    /**
     * Sets the values of a SPIR-V specialization constants.
     * 
     * <p>Calling this function multiple times for the same specialization constant shall cause the last provided value to override any previously specified
     * value. The values are used by a subsequent {@link CL10#clBuildProgram BuildProgram} call for the program.</p>
     * 
     * <p>Application is not required to provide values for every specialization constant contained in SPIR-V module. SPIR-V provides default values for all
     * specialization constants.</p>
     *
     * @param program    must be a valid OpenCL program created from a SPIR-V module
     * @param spec_id    identifies the SPIR-V specialization constant whose value will be set
     * @param spec_value a pointer to the memory location that contains the value of the specialization constant. The data pointed to by {@code spec_value} are copied and
     *                   can be safely reused by the application after {@code clSetProgramSpecializationConstant} returns. This specialization value will be used by
     *                   subsequent calls to {@link CL10#clBuildProgram BuildProgram} until another call to {@code clSetProgramSpecializationConstant} changes it. If a specialization constant is a
     *                   boolean constant, {@code spec_value} should be a pointer to a {@code cl_uchar} value. A value of zero will set the specialization constant to
     *                   false; any other value will set it to true.
     *
     * @return {@link CL10#CL_SUCCESS SUCCESS} if the function is executed successfully. Otherwise, it returns one of the following errors:
     *         
     *         <ul>
     *         <li>{@link CL10#CL_INVALID_PROGRAM INVALID_PROGRAM} if {@code program} is not a valid program object created from a SPIR-V module.</li>
     *         <li>{@link #CL_INVALID_SPEC_ID INVALID_SPEC_ID} if {@code spec_id} is not a valid specialization constant ID</li>
     *         <li>{@link CL10#CL_INVALID_VALUE INVALID_VALUE} if {@code spec_size} does not match the size of the specialization constant in the SPIR-V module, or if {@code spec_value} is
     *         {@code NULL}.</li>
     *         <li>{@link CL10#CL_OUT_OF_RESOURCES OUT_OF_RESOURCES} if there is a failure to allocate resources required by the OpenCL implementation on the device.</li>
     *         <li>{@link CL10#CL_OUT_OF_HOST_MEMORY OUT_OF_HOST_MEMORY} if there is a failure to allocate resources required by the OpenCL implementation on the host.</li>
     *         </ul>
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramSpecializationConstant.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") DoubleBuffer spec_value) {
        return nclSetProgramSpecializationConstant(program, spec_id, Integer.toUnsignedLong(spec_value.remaining()) << 3, memAddress(spec_value));
    }

    /**
     * Array version of: {@link #clSetProgramSpecializationConstant SetProgramSpecializationConstant}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramSpecializationConstant.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") short[] spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(__functionAddress, program, spec_id, Integer.toUnsignedLong(spec_value.length) << 1, spec_value);
    }

    /**
     * Array version of: {@link #clSetProgramSpecializationConstant SetProgramSpecializationConstant}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramSpecializationConstant.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") int[] spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(__functionAddress, program, spec_id, Integer.toUnsignedLong(spec_value.length) << 2, spec_value);
    }

    /**
     * Array version of: {@link #clSetProgramSpecializationConstant SetProgramSpecializationConstant}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramSpecializationConstant.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") long[] spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(__functionAddress, program, spec_id, Integer.toUnsignedLong(spec_value.length) << 3, spec_value);
    }

    /**
     * Array version of: {@link #clSetProgramSpecializationConstant SetProgramSpecializationConstant}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramSpecializationConstant.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") float[] spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(__functionAddress, program, spec_id, Integer.toUnsignedLong(spec_value.length) << 2, spec_value);
    }

    /**
     * Array version of: {@link #clSetProgramSpecializationConstant SetProgramSpecializationConstant}
     * 
     * @see <a target="_blank" href="https://www.khronos.org/registry/OpenCL/sdk/2.1/docs/man/xhtml/clSetProgramSpecializationConstant.html">Reference Page</a>
     */
    @NativeType("cl_int")
    public static int clSetProgramSpecializationConstant(@NativeType("cl_program") long program, @NativeType("cl_uint") int spec_id, @NativeType("void const *") double[] spec_value) {
        long __functionAddress = CL.getICD().clSetProgramSpecializationConstant;
        if (CHECKS) {
            check(__functionAddress);
            check(program);
        }
        return callPPPI(__functionAddress, program, spec_id, Integer.toUnsignedLong(spec_value.length) << 3, spec_value);
    }

}