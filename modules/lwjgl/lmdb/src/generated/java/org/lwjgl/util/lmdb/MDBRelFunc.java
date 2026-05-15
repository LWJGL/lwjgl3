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
    public static MDBRelFunc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable MDBRelFunc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code MDBRelFunc} instance that delegates to the specified {@code MDBRelFuncI} instance. */
    public static MDBRelFunc create(MDBRelFuncI instance) { return create(instance, instance.address()); }

    private static MDBRelFunc create(MDBRelFuncI instance, long functionPointer) {
        return instance instanceof MDBRelFunc
            ? (MDBRelFunc)instance
            : new MDBRelFunc(functionPointer) {
                @Override public void invoke(long item, long oldptr, long newptr, long relctx) {
                    instance.invoke(item, oldptr, newptr, relctx);
                }
            };
    }

    protected MDBRelFunc() {
        super(DESCRIPTOR);
    }

    MDBRelFunc(long functionPointer) {
        super(functionPointer);
    }

}