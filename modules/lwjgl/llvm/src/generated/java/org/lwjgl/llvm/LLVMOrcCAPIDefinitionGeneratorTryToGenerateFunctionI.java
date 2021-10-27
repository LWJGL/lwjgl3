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
 * Instances of this interface may be passed to the {@link LLVMOrc#LLVMOrcCreateCustomCAPIDefinitionGenerator OrcCreateCustomCAPIDefinitionGenerator} method.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * LLVMErrorRef (*{@link #invoke}) (
 *     LLVMOrcDefinitionGeneratorRef GeneratorObj,
 *     void *Ctx,
 *     LLVMOrcLookupStateRef *LookupState,
 *     LLVMOrcLookupKind Kind,
 *     LLVMOrcJITDylibRef JD,
 *     LLVMOrcJITDylibLookupFlags JDLookupFlags,
 *     LLVMOrcCLookupSet LookupSet,
 *     size_t LookupSetSize
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunction")
public interface LLVMOrcCAPIDefinitionGeneratorTryToGenerateFunctionI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 7 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * A custom generator function.
     * 
     * <p>This can be used to create a custom generator object using {@link LLVMOrc#LLVMOrcCreateCustomCAPIDefinitionGenerator OrcCreateCustomCAPIDefinitionGenerator}. The resulting object can be attached to a
     * {@code JITDylib}, via {@link LLVMOrc#LLVMOrcJITDylibAddGenerator OrcJITDylibAddGenerator}, to receive callbacks when lookups fail to match existing definitions.</p>
     *
     * @param GeneratorObj  will contain the address of the custom generator object
     * @param Ctx           will contain the context object passed to {@code LLVMOrcCreateCustomCAPIDefinitionGenerator}.
     * @param LookupState   will contain a pointer to an {@code LLVMOrcLookupStateRef} object.
     *                      
     *                      <p>This can optionally be modified to make the definition generation process asynchronous: If the {@code LookupStateRef} value is copied, and the
     *                      original {@code LLVMOrcLookupStateRef} set to null, the lookup will be suspended. Once the asynchronous definition process has been completed
     *                      clients must call {@code LLVMOrcLookupStateContinueLookup} to continue the lookup (this should be done unconditionally, even if errors have
     *                      occurred in the mean time, to free the lookup state memory and notify the query object of the failures). If {@code LookupState} is captured this
     *                      function must return {@link LLVMError#LLVMErrorSuccess ErrorSuccess}.</p>
     * @param Kind          can be inspected to determine the lookup kind (e.g. as-if-during-static-link, or as-if-during-dlsym)
     * @param JD            specifies which {@code JITDylib} the definitions should be generated into
     * @param JDLookupFlags can be inspected to determine whether the original lookup included non-exported symbols
     * @param LookupSet     contains the set of symbols that could not be found in {@code JD} already (the set of generation candidates)
     */
    @NativeType("LLVMErrorRef") long invoke(@NativeType("LLVMOrcDefinitionGeneratorRef") long GeneratorObj, @NativeType("void *") long Ctx, @NativeType("LLVMOrcLookupStateRef *") long LookupState, @NativeType("LLVMOrcLookupKind") int Kind, @NativeType("LLVMOrcJITDylibRef") long JD, @NativeType("LLVMOrcJITDylibLookupFlags") int JDLookupFlags, @NativeType("LLVMOrcCLookupSet") long LookupSet, @NativeType("size_t") long LookupSetSize);

}