/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke MDB_rel_func *} */
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
    public static @Nullable MDBRelFunc createSafe(long functionPointer) {
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