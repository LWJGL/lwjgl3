/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

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
public abstract class MDBRelFunc extends Callback implements MDBRelFuncI {

    /**
     * Creates a {@code MDBRelFunc} instance from the specified function pointer.
     *
     * @return the new {@code MDBRelFunc}
     */
    public static MDBRelFunc create(long functionPointer) {
        MDBRelFuncI instance = Callback.get(functionPointer);
        return instance instanceof MDBRelFunc
            ? (MDBRelFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static MDBRelFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code MDBRelFunc} instance that delegates to the specified {@code MDBRelFuncI} instance. */
    public static MDBRelFunc create(MDBRelFuncI instance) {
        return instance instanceof MDBRelFunc
            ? (MDBRelFunc)instance
            : new Container(instance.address(), instance);
    }

    protected MDBRelFunc() {
        super(CIF);
    }

    MDBRelFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends MDBRelFunc {

        private final MDBRelFuncI delegate;

        Container(long functionPointer, MDBRelFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long item, long oldptr, long newptr, long relctx) {
            delegate.invoke(item, oldptr, newptr, relctx);
        }

    }

}