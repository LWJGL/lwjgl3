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
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *Ctx
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMOrcDisposeCAPIDefinitionGeneratorFunction")
public interface LLVMOrcDisposeCAPIDefinitionGeneratorFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args))
        );
    }

    /**
     * Disposer for a custom generator.
     * 
     * <p>Will be called by ORC when the {@code JITDylib} that the generator is attached to is destroyed.</p>
     */
    void invoke(@NativeType("void *") long Ctx);

}