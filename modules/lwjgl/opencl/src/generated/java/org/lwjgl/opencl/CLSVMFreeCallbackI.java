/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke (* anonymous)} */
@FunctionalInterface
@NativeType("void (*) (cl_command_queue, cl_uint, void **, void *)")
public interface CLSVMFreeCallbackI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            apiStdcall(),
            ffi_type_void,
            ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetInt(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
    }

    /** {@code void (*) (cl_command_queue queue, cl_uint num_svm_pointers, void ** svm_pointers, void * user_data)} */
    void invoke(@NativeType("cl_command_queue") long queue, @NativeType("cl_uint") int num_svm_pointers, @NativeType("void **") long svm_pointers, @NativeType("void *") long user_data);

}