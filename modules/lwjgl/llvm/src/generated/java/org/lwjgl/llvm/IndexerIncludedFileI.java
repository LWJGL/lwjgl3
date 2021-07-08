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
 * Instances of this interface may be set to the {@code ppIncludedFile} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * CXIdxClientFile (*{@link #invoke}) (
 *     CXClientData client_data,
 *     CXIdxIncludedFileInfo const *info
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("CXIdxClientFile (*) (CXClientData, CXIdxIncludedFileInfo const *)")
public interface IndexerIncludedFileI extends CallbackI {

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

    /** The {@code IndexerCallbacks.ppIncludedFile} callback. */
    @NativeType("CXIdxClientFile") long invoke(@NativeType("CXClientData") long client_data, @NativeType("CXIdxIncludedFileInfo const *") long info);

}