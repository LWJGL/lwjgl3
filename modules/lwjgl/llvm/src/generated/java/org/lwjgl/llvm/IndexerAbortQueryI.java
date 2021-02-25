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
 * Instances of this interface may be set to the {@code abortQuery} field of the {@link IndexerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*) (
 *     CXClientData client_data,
 *     void *reserved
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("int (*) (CXClientData, void *)")
public interface IndexerAbortQueryI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /** The {@code IndexerCallbacks.abortQuery} callback. */
    int invoke(@NativeType("CXClientData") long client_data, @NativeType("void *") long reserved);

}