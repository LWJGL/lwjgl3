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
 * Instances of this interface may be passed to the {@link LLVMOrc#LLVMOrcObjectTransformLayerSetTransform OrcObjectTransformLayerSetTransform} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMErrorRef (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMMemoryBufferRef *ObjInOut
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMOrcObjectTransformLayerTransformFunction")
public interface LLVMOrcObjectTransformLayerTransformFunctionI extends CallbackI {

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

    /**
     * A function for applying transformations to an object file buffer.
     * 
     * <p>Implementations of this type are responsible for managing the lifetime of the memory buffer pointed to by {@code ObjInOut}: If the
     * {@code LLVMMemoryBufferRef} value is overwritten then the function is responsible for disposing of the incoming buffer. If the buffer is simply
     * accessed/mutated in-place then ownership returns to the caller and the function does not need to do any lifetime management.</p>
     * 
     * <p>The transform is allowed to return an error, in which case the {@code ObjInOut} buffer should be disposed of and set to null.</p>
     */
    @NativeType("LLVMErrorRef") long invoke(@NativeType("void *") long Ctx, @NativeType("LLVMMemoryBufferRef *") long ObjInOut);

}