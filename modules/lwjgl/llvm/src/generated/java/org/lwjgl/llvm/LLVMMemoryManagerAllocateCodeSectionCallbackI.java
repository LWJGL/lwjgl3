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

/**
 * Instances of this interface may be passed to the {@link LLVMExecutionEngine#LLVMCreateSimpleMCJITMemoryManager CreateSimpleMCJITMemoryManager} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * uint8_t * (*) (
 *     void *Opaque,
 *     uintptr_t Size,
 *     unsigned int Alignment,
 *     unsigned int SectionID,
 *     char const *SectionName
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("uint8_t * (*) (void *, uintptr_t, unsigned int, unsigned int, char const *)")
public interface LLVMMemoryManagerAllocateCodeSectionCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    @NativeType("uint8_t *") long invoke(@NativeType("void *") long Opaque, @NativeType("uintptr_t") long Size, @NativeType("unsigned int") int Alignment, @NativeType("unsigned int") int SectionID, @NativeType("char const *") long SectionName);

}