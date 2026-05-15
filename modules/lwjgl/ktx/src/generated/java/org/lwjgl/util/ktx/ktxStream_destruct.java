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
    public static ktxStream_destruct create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_destruct createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ktxStream_destruct} instance that delegates to the specified {@code ktxStream_destructI} instance. */
    public static ktxStream_destruct create(ktxStream_destructI instance) { return create(instance, instance.address()); }

    private static ktxStream_destruct create(ktxStream_destructI instance, long functionPointer) {
        return instance instanceof ktxStream_destruct
            ? (ktxStream_destruct)instance
            : new ktxStream_destruct(functionPointer) {
                @Override public void invoke(long str) {
                    instance.invoke(str);
                }
            };
    }

    protected ktxStream_destruct() {
        super(DESCRIPTOR);
    }

    ktxStream_destruct(long functionPointer) {
        super(functionPointer);
    }

}