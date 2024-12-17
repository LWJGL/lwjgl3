/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.llvm;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/** Callback function: {@link #invoke LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction} */
@FunctionalInterface
@NativeType("LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction")
public interface LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 7 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** {@code LLVMErrorRef (* LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction) (LLVMOrcDefinitionGeneratorRef GeneratorObj, void * Ctx, LLVMOrcLookupStateRef * LookupState, LLVMOrcLookupKind Kind, LLVMOrcJITDylibRef JD, LLVMOrcJITDylibLookupFlags JDLookupFlags, LLVMOrcCLookupSet LookupSet, size_t LookupSetSize)} */
    @NativeType("LLVMErrorRef") long invoke(@NativeType("LLVMOrcDefinitionGeneratorRef") long GeneratorObj, @NativeType("void *") long Ctx, @NativeType("LLVMOrcLookupStateRef *") long LookupState, @NativeType("LLVMOrcLookupKind") int Kind, @NativeType("LLVMOrcJITDylibRef") long JD, @NativeType("LLVMOrcJITDylibLookupFlags") int JDLookupFlags, @NativeType("LLVMOrcCLookupSet") long LookupSet, @NativeType("size_t") long LookupSetSize);

}