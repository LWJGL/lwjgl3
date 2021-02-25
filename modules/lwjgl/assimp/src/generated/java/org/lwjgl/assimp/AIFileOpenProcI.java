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
 * struct aiFile * (*) (
 *     struct aiFileIO *pFileIO,
 *     char const *fileName,
 *     char const *openMode
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("aiFileOpenProc")
public interface AIFileOpenProcI extends CallbackI {

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
     * File open procedure
     *
     * @param pFileIO  FileIO system pointer
     * @param fileName The name of the file to be opened
     * @param openMode The mode in which to open the file
     */
    @NativeType("struct aiFile *") long invoke(@NativeType("struct aiFileIO *") long pFileIO, @NativeType("char const *") long fileName, @NativeType("char const *") long openMode);

}