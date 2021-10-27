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
 * Instances of this interface may be passed to the {@link LLVMTransforms#LLVMAddInternalizePassWithMustPreservePredicate AddInternalizePassWithMustPreservePredicate} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMBool (*{@link #invoke}) (
 *     LLVMValueRef Val,
 *     void *Context
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMBool (*) (LLVMValueRef, void *)")
public interface LLVMMustPreserveI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    @NativeType("LLVMBool") int invoke(@NativeType("LLVMValueRef") long Val, @NativeType("void *") long Context);

}