/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ktxStream_read} */
public abstract class ktxStream_read extends Callback implements ktxStream_readI {

    /**
     * Creates a {@code ktxStream_read} instance from the specified function pointer.
     *
     * @return the new {@code ktxStream_read}
     */
    public static ktxStream_read create(long functionPointer) {
        ktxStream_readI instance = Callback.get(functionPointer);
        return instance instanceof ktxStream_read
            ? (ktxStream_read)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_read createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxStream_read} instance that delegates to the specified {@code ktxStream_readI} instance. */
    public static ktxStream_read create(ktxStream_readI instance) {
        return instance instanceof ktxStream_read
            ? (ktxStream_read)instance
            : new Container(instance.address(), instance);
    }

    protected ktxStream_read() {
        super(CIF);
    }

    ktxStream_read(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxStream_read {

        private final ktxStream_readI delegate;

        Container(long functionPointer, ktxStream_readI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long str, long dst, long count) {
            return delegate.invoke(str, dst, count);
        }

    }

}