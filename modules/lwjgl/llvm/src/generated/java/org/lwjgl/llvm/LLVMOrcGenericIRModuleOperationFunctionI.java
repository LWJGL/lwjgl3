/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;

import java.lang.invoke.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke LLVMOrcGenericIRModuleOperationFunction} */
@FunctionalInterface
@NativeType("LLVMOrcGenericIRModuleOperationFunction")
public interface LLVMOrcGenericIRModuleOperationFunctionI extends CallbackI {

    Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(
        MethodHandles.lookup(),
        apiCreateCIF(
            ffi_type_pointer,
            ffi_type_pointer, ffi_type_pointer
        )
    );

    @Override
    default Callback.Descriptor getDescriptor() { return DESCRIPTOR; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code LLVMErrorRef (* LLVMOrcGenericIRModuleOperationFunction) (void * Ctx, LLVMModuleRef M)} */
    @NativeType("LLVMErrorRef") long invoke(@NativeType("void *") long Ctx, @NativeType("LLVMModuleRef") long M);

}