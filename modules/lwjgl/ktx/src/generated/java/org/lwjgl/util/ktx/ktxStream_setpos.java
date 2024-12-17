/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ktxStream_setpos} */
public abstract class ktxStream_setpos extends Callback implements ktxStream_setposI {

    /**
     * Creates a {@code ktxStream_setpos} instance from the specified function pointer.
     *
     * @return the new {@code ktxStream_setpos}
     */
    public static ktxStream_setpos create(long functionPointer) {
        ktxStream_setposI instance = Callback.get(functionPointer);
        return instance instanceof ktxStream_setpos
            ? (ktxStream_setpos)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_setpos createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxStream_setpos} instance that delegates to the specified {@code ktxStream_setposI} instance. */
    public static ktxStream_setpos create(ktxStream_setposI instance) {
        return instance instanceof ktxStream_setpos
            ? (ktxStream_setpos)instance
            : new Container(instance.address(), instance);
    }

    protected ktxStream_setpos() {
        super(CIF);
    }

    ktxStream_setpos(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxStream_setpos {

        private final ktxStream_setposI delegate;

        Container(long functionPointer, ktxStream_setposI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long str, long offset) {
            return delegate.invoke(str, offset);
        }

    }

}