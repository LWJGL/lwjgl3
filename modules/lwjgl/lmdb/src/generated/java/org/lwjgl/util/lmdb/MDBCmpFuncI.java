/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

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
public interface MDBCmpFuncI extends CallbackI.I {

    String SIGNATURE = "(pp)i";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
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