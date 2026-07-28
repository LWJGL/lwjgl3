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
    public static ktxStream_getpos create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_getpos createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ktxStream_getpos} instance that delegates to the specified {@code ktxStream_getposI} instance. */
    public static ktxStream_getpos create(ktxStream_getposI instance) { return create(instance, instance.address()); }

    private static ktxStream_getpos create(ktxStream_getposI instance, long functionPointer) {
        return instance instanceof ktxStream_getpos
            ? (ktxStream_getpos)instance
            : new ktxStream_getpos(functionPointer) {
                @Override public int invoke(long str, long offset) {
                    return instance.invoke(str, offset);
                }
            };
    }

    protected ktxStream_getpos() {
        super(DESCRIPTOR);
    }

    ktxStream_getpos(long functionPointer) {
        super(functionPointer);
    }

}