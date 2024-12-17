/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.ktx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ktxStream_destruct} */
public abstract class ktxStream_destruct extends Callback implements ktxStream_destructI {

    /**
     * Creates a {@code ktxStream_destruct} instance from the specified function pointer.
     *
     * @return the new {@code ktxStream_destruct}
     */
    public static ktxStream_destruct create(long functionPointer) {
        ktxStream_destructI instance = Callback.get(functionPointer);
        return instance instanceof ktxStream_destruct
            ? (ktxStream_destruct)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_destruct createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code ktxStream_destruct} instance that delegates to the specified {@code ktxStream_destructI} instance. */
    public static ktxStream_destruct create(ktxStream_destructI instance) {
        return instance instanceof ktxStream_destruct
            ? (ktxStream_destruct)instance
            : new Container(instance.address(), instance);
    }

    protected ktxStream_destruct() {
        super(CIF);
    }

    ktxStream_destruct(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends ktxStream_destruct {

        private final ktxStream_destructI delegate;

        Container(long functionPointer, ktxStream_destructI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long str) {
            delegate.invoke(str);
        }

    }

}