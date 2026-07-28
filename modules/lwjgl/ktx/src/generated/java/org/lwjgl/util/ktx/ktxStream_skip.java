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
    public static ktxStream_skip create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_skip createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ktxStream_skip} instance that delegates to the specified {@code ktxStream_skipI} instance. */
    public static ktxStream_skip create(ktxStream_skipI instance) { return create(instance, instance.address()); }

    private static ktxStream_skip create(ktxStream_skipI instance, long functionPointer) {
        return instance instanceof ktxStream_skip
            ? (ktxStream_skip)instance
            : new ktxStream_skip(functionPointer) {
                @Override public int invoke(long str, long count) {
                    return instance.invoke(str, count);
                }
            };
    }

    protected ktxStream_skip() {
        super(DESCRIPTOR);
    }

    ktxStream_skip(long functionPointer) {
        super(functionPointer);
    }

}