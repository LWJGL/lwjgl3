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
 * Instances of this interface may be passed to the {@link LLVMCore#LLVMContextSetDiagnosticHandler ContextSetDiagnosticHandler} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     LLVMDiagnosticInfoRef DiagnosticInfo,
 *     void *DiagnosticContext
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (LLVMDiagnosticInfoRef, void *)")
public interface LLVMDiagnosticHandlerI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
    }

    void invoke(@NativeType("LLVMDiagnosticInfoRef") long DiagnosticInfo, @NativeType("void *") long DiagnosticContext);

}