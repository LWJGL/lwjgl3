/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * int (*) (
 *     MDB_val const *a,
 *     MDB_val const *b
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("MDB_cmp_func *")
public interface MDBCmpFuncI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_sint32,
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

    /**
     * A callback function used to compare two keys in a database.
     *
     * @param a the first item to compare
     * @param b the second item to compare
     *
     * @return &lt; 0 if a &lt; b, 0 if a == b, &gt; 0 if a &gt; b
     */
    int invoke(@NativeType("MDB_val const *") long a, @NativeType("MDB_val const *") long b);

}