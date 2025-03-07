/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.lmdb;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke MDB_cmp_func *} */
public abstract class MDBCmpFunc extends Callback implements MDBCmpFuncI {

    /**
     * Creates a {@code MDBCmpFunc} instance from the specified function pointer.
     *
     * @return the new {@code MDBCmpFunc}
     */
    public static MDBCmpFunc create(long functionPointer) {
        MDBCmpFuncI instance = Callback.get(functionPointer);
        return instance instanceof MDBCmpFunc
            ? (MDBCmpFunc)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable MDBCmpFunc createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code MDBCmpFunc} instance that delegates to the specified {@code MDBCmpFuncI} instance. */
    public static MDBCmpFunc create(MDBCmpFuncI instance) {
        return instance instanceof MDBCmpFunc
            ? (MDBCmpFunc)instance
            : new Container(instance.address(), instance);
    }

    protected MDBCmpFunc() {
        super(CIF);
    }

    MDBCmpFunc(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends MDBCmpFunc {

        private final MDBCmpFuncI delegate;

        Container(long functionPointer, MDBCmpFuncI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long a, long b) {
            return delegate.invoke(a, b);
        }

    }

}