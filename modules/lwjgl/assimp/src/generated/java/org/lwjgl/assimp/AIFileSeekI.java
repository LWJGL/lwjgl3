/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * aiReturn (*) (
 *     struct aiFile *pFile,
 *     size_t offset,
 *     aiOrigin origin
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("aiFileSeek")
public interface AIFileSeekI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_uint32,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        int __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
        );
        apiClosureRet(ret, __result);
    }

    /**
     * File seek procedure
     *
     * @param pFile  File pointer to seek to
     * @param offset Number of bytes to shift from origin
     * @param origin Position used as reference for the offset.
     */
    @NativeType("aiReturn") int invoke(@NativeType("struct aiFile *") long pFile, @NativeType("size_t") long offset, @NativeType("aiOrigin") int origin);

}