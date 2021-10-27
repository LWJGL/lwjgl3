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
 * Instances of this interface may be passed to the {@link LLVMOrc#LLVMOrcIRTransformLayerSetTransform OrcIRTransformLayerSetTransform} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMErrorRef (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMOrcThreadSafeModuleRef *ModInOut,
 *     LLVMOrcMaterializationResponsibilityRef MR
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMOrcIRTransformLayerTransformFunction")
public interface LLVMOrcIRTransformLayerTransformFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * A function for applying transformations as part of an transform layer.
     * 
     * <p>Implementations of this type are responsible for managing the lifetime of the {@code Module} pointed to by {@code ModInOut}: If the
     * {@code LLVMModuleRef} value is overwritten then the function is responsible for disposing of the incoming module. If the module is simply
     * accessed/mutated in-place then ownership returns to the caller and the function does not need to do any lifetime management.</p>
     * 
     * <p>Clients can call {@link LLVMLLJIT#LLVMOrcLLJITGetIRTransformLayer OrcLLJITGetIRTransformLayer} to obtain the transform layer of a {@code LLJIT} instance, and use {@link LLVMOrc#LLVMOrcIRTransformLayerSetTransform OrcIRTransformLayerSetTransform}
     * to set the function. This can be used to override the default transform layer.</p>
     */
    @NativeType("LLVMErrorRef") long invoke(@NativeType("void *") long Ctx, @NativeType("LLVMOrcThreadSafeModuleRef *") long ModInOut, @NativeType("LLVMOrcMaterializationResponsibilityRef") long MR);

}