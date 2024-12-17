/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ktxStream_skip} */
public abstract class ktxStream_skip extends Callback implements ktxStream_skipI {

    /**
     * Creates a {@code ktxStream_skip} instance from the specified function pointer.
     *
     * @return the new {@code ktxStream_skip}
     */
    public static ktxStream_skip create(long functionPointer) {
        ktxStream_skipI instance = Callback.get(functionPointer);
        return instance instanceof ktxStream_skip
            ? (ktxStream_skip)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_skip createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxStream_skip} instance that delegates to the specified {@code ktxStream_skipI} instance. */
    public static ktxStream_skip create(ktxStream_skipI instance) {
        return instance instanceof ktxStream_skip
            ? (ktxStream_skip)instance
            : new Container(instance.address(), instance);
    }

    protected ktxStream_skip() {
        super(CIF);
    }

    ktxStream_skip(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxStream_skip {

        private final ktxStream_skipI delegate;

        Container(long functionPointer, ktxStream_skipI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long str, long count) {
            return delegate.invoke(str, count);
        }

    }

}