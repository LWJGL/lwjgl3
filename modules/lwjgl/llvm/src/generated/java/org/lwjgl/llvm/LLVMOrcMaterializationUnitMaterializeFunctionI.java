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
 *     void *Ctx,
 *     LLVMOrcMaterializationResponsibilityRef MR
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMOrcMaterializationUnitMaterializeFunction")
public interface LLVMOrcMaterializationUnitMaterializeFunctionI extends CallbackI {

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

    /**
     * A {@code MaterializationUnit} materialize callback.
     * 
     * <p>Ownership of the {@code Ctx} and {@code MR} arguments passes to the callback which must adhere to the {@code LLVMOrcMaterializationResponsibilityRef}
     * contract (see comment for that type).</p>
     * 
     * <p>If this callback is called then the {@link LLVMOrcMaterializationUnitDestroyFunction} callback will NOT be called.</p>
     */
    void invoke(@NativeType("void *") long Ctx, @NativeType("LLVMOrcMaterializationResponsibilityRef") long MR);

}