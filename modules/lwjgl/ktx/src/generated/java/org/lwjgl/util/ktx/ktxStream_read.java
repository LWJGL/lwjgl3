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
    public static ktxStream_read create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_read createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ktxStream_read} instance that delegates to the specified {@code ktxStream_readI} instance. */
    public static ktxStream_read create(ktxStream_readI instance) { return create(instance, instance.address()); }

    private static ktxStream_read create(ktxStream_readI instance, long functionPointer) {
        return instance instanceof ktxStream_read
            ? (ktxStream_read)instance
            : new ktxStream_read(functionPointer) {
                @Override public int invoke(long str, long dst, long count) {
                    return instance.invoke(str, dst, count);
                }
            };
    }

    protected ktxStream_read() {
        super(DESCRIPTOR);
    }

    ktxStream_read(long functionPointer) {
        super(functionPointer);
    }

}