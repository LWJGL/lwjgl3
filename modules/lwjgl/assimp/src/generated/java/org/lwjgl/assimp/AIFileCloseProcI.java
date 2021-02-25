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
 * void (*) (
 *     struct aiFileIO *pFileIO,
 *     struct aiFile *pFile
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("aiFileCloseProc")
public interface AIFileCloseProcI extends CallbackI {

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
     * File close procedure
     *
     * @param pFileIO FileIO system pointer
     * @param pFile   File pointer to close
     */
    void invoke(@NativeType("struct aiFileIO *") long pFileIO, @NativeType("struct aiFile *") long pFile);

}