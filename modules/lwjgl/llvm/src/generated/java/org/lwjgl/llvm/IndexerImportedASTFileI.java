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
 * Instances of this interface may be set to the {@code importedASTFile} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * CXIdxClientASTFile (*) (
 *     CXClientData client_data,
 *     CXIdxImportedASTFileInfo const *info
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("CXIdxClientASTFile (*) (CXClientData, CXIdxImportedASTFileInfo const *)")
public interface IndexerImportedASTFileI extends CallbackI {

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

    /** The {@code IndexerCallbacks.importedASTFile} callback. */
    @NativeType("CXIdxClientASTFile") long invoke(@NativeType("CXClientData") long client_data, @NativeType("CXIdxImportedASTFileInfo const *") long info);

}