/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Instances of this interface may be passed to the {@link CL20#clEnqueueSVMFree EnqueueSVMFree} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     cl_command_queue queue,
 *     cl_uint num_svm_pointers,
 *     void **svm_pointers,
 *     void *user_data
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (cl_command_queue, cl_uint, void **, void *)")
public interface CLSVMFreeCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        apiStdcall(),
        ffi_type_void,
        ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
    }

    /**
     * Will be called to free shared virtual memory pointers.
     *
     * @param queue            a valid host command-queue
     * @param num_svm_pointers the number of pointers in the {@code svm_pointers} array
     * @param svm_pointers     an array of shared virtual memory pointers to be freed
     * @param user_data        the user-specified value that was passed when calling {@link CL20#clEnqueueSVMFree EnqueueSVMFree}
     */
    void invoke(@NativeType("cl_command_queue") long queue, @NativeType("cl_uint") int num_svm_pointers, @NativeType("void **") long svm_pointers, @NativeType("void *") long user_data);

}