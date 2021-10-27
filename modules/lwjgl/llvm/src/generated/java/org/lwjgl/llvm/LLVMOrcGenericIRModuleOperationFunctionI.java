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
 * Instances of this interface may be passed to the {@link LLVMOrc#LLVMOrcThreadSafeModuleWithModuleDo OrcThreadSafeModuleWithModuleDo} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMErrorRef (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMModuleRef M
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMOrcGenericIRModuleOperationFunction")
public interface LLVMOrcGenericIRModuleOperationFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /** A function for inspecting/mutating IR modules, suitable for use with {@link LLVMOrc#LLVMOrcThreadSafeModuleWithModuleDo OrcThreadSafeModuleWithModuleDo}. */
    @NativeType("LLVMErrorRef") long invoke(@NativeType("void *") long Ctx, @NativeType("LLVMModuleRef") long M);

}