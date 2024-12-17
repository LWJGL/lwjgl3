/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ktxStream_getpos} */
public abstract class ktxStream_getpos extends Callback implements ktxStream_getposI {

    /**
     * Creates a {@code ktxStream_getpos} instance from the specified function pointer.
     *
     * @return the new {@code ktxStream_getpos}
     */
    public static ktxStream_getpos create(long functionPointer) {
        ktxStream_getposI instance = Callback.get(functionPointer);
        return instance instanceof ktxStream_getpos
            ? (ktxStream_getpos)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_getpos createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxStream_getpos} instance that delegates to the specified {@code ktxStream_getposI} instance. */
    public static ktxStream_getpos create(ktxStream_getposI instance) {
        return instance instanceof ktxStream_getpos
            ? (ktxStream_getpos)instance
            : new Container(instance.address(), instance);
    }

    protected ktxStream_getpos() {
        super(CIF);
    }

    ktxStream_getpos(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxStream_getpos {

        private final ktxStream_getposI delegate;

        Container(long functionPointer, ktxStream_getposI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long str, long offset) {
            return delegate.invoke(str, offset);
        }

    }

}