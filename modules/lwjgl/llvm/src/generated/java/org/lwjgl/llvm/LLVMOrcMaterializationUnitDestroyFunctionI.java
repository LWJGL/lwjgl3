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
 * Instances of this interface may be passed to the {@link LLVMOrc#LLVMOrcCreateCustomMaterializationUnit OrcCreateCustomMaterializationUnit} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     void *Ctx
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMOrcMaterializationUnitDestroyFunction")
public interface LLVMOrcMaterializationUnitDestroyFunctionI extends CallbackI {

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
     * A {@code MaterializationUnit} destruction callback.
     * 
     * <p>If a custom {@code MaterializationUnit} is destroyed before its {@code Materialize} function is called then this function will be called to provide an
     * opportunity for the underlying program representation to be destroyed.</p>
     */
    void invoke(@NativeType("void *") long Ctx);

}