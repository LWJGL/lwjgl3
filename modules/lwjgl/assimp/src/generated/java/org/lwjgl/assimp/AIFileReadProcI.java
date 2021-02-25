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
 * size_t (*) (
 *     struct aiFile *pFile,
 *     char *pBuffer,
 *     size_t size,
 *     size_t count
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("aiFileReadProc")
public interface AIFileReadProcI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_pointer,
        ffi_type_pointer, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        long __result = invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 3 * POINTER_SIZE))
        );
        apiClosureRetP(ret, __result);
    }

    /**
     * File read procedure
     *
     * @param pFile   File pointer to read from
     * @param pBuffer The buffer to read the values
     * @param size    Size in bytes of each element to be read
     * @param count   Number of elements to be read
     */
    @NativeType("size_t") long invoke(@NativeType("struct aiFile *") long pFile, @NativeType("char *") long pBuffer, @NativeType("size_t") long size, @NativeType("size_t") long count);

}