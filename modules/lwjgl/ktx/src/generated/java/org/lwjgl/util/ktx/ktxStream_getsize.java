/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ktxStream_getsize} */
public abstract class ktxStream_getsize extends Callback implements ktxStream_getsizeI {

    /**
     * Creates a {@code ktxStream_getsize} instance from the specified function pointer.
     *
     * @return the new {@code ktxStream_getsize}
     */
    public static ktxStream_getsize create(long functionPointer) {
        ktxStream_getsizeI instance = Callback.get(functionPointer);
        return instance instanceof ktxStream_getsize
            ? (ktxStream_getsize)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_getsize createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxStream_getsize} instance that delegates to the specified {@code ktxStream_getsizeI} instance. */
    public static ktxStream_getsize create(ktxStream_getsizeI instance) {
        return instance instanceof ktxStream_getsize
            ? (ktxStream_getsize)instance
            : new Container(instance.address(), instance);
    }

    protected ktxStream_getsize() {
        super(CIF);
    }

    ktxStream_getsize(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxStream_getsize {

        private final ktxStream_getsizeI delegate;

        Container(long functionPointer, ktxStream_getsizeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long str, long size) {
            return delegate.invoke(str, size);
        }

    }

}