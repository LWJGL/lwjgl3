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
 * Instances of this interface may be passed to the {@link LLVMLLJIT#LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator OrcLLJITBuilderSetObjectLinkingLayerCreator} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMOrcObjectLayerRef (*{@link #invoke}) (
 *     void *Ctx,
 *     LLVMOrcExecutionSessionRef ES,
 *     char const *Triple
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMOrcObjectLayerRef (*) (void *, LLVMOrcExecutionSessionRef, char const *)")
public interface LLVMOrcLLJITBuilderObjectLinkingLayerCreatorFunctionI extends CallbackI {

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
     * A function for constructing an ObjectLinkingLayer instance to be used by an LLJIT instance.
     * 
     * <p>Clients can call {@link LLVMLLJIT#LLVMOrcLLJITBuilderSetObjectLinkingLayerCreator OrcLLJITBuilderSetObjectLinkingLayerCreator} to set the creator function to use when constructing an {@code LLJIT} instance. This
     * can be used to override the default linking layer implementation that would otherwise be chosen by {@code LLJITBuilder}.</p>
     * 
     * <p>Object linking layers returned by this function will become owned by the {@code LLJIT} instance. The client is not responsible for managing their
     * lifetimes after the function returns.</p>
     */
    @NativeType("LLVMOrcObjectLayerRef") long invoke(@NativeType("void *") long Ctx, @NativeType("LLVMOrcExecutionSessionRef") long ES, @NativeType("char const *") long Triple);

}