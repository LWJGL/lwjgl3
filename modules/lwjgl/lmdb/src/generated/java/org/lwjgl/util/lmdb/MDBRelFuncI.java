/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * A callback function used to relocate a position-dependent data item in a fixed-address database.
 * 
 * <p>The {@code newptr} gives the item's desired address in the memory map, and {@code oldptr} gives its previous address. The item's actual data resides at
 * the address in {@code item}. This callback is expected to walk through the fields of the record in {@code item} and modify any values based at the
 * {@code oldptr} address to be relative to the {@code newptr} address.</p>
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     MDB_val *item,
 *     void *oldptr,
 *     void *newptr,
 *     void *relctx
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("MDB_rel_func *")
public interface MDBRelFuncI extends CallbackI.V {

    String SIGNATURE = "(pppp)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /**
     * A callback function used to relocate a position-dependent data item in a fixed-address database.
     *
     * @param item   the item that is to be relocated
     * @param oldptr the previous address
     * @param newptr the new address to relocate to
     * @param relctx an application-provided context, set by {@link LMDB#mdb_set_relctx set_relctx}
     */
    void invoke(@NativeType("MDB_val *") long item, @NativeType("void *") long oldptr, @NativeType("void *") long newptr, @NativeType("void *") long relctx);

}