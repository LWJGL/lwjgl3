/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ktxStream_write} */
public abstract class ktxStream_write extends Callback implements ktxStream_writeI {

    /**
     * Creates a {@code ktxStream_write} instance from the specified function pointer.
     *
     * @return the new {@code ktxStream_write}
     */
    public static ktxStream_write create(long functionPointer) {
        ktxStream_writeI instance = Callback.get(functionPointer);
        return instance instanceof ktxStream_write
            ? (ktxStream_write)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_write createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxStream_write} instance that delegates to the specified {@code ktxStream_writeI} instance. */
    public static ktxStream_write create(ktxStream_writeI instance) {
        return instance instanceof ktxStream_write
            ? (ktxStream_write)instance
            : new Container(instance.address(), instance);
    }

    protected ktxStream_write() {
        super(CIF);
    }

    ktxStream_write(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxStream_write {

        private final ktxStream_writeI delegate;

        Container(long functionPointer, ktxStream_writeI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long str, long src, long size, long count) {
            return delegate.invoke(str, src, size, count);
        }

    }

}