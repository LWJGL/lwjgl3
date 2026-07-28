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
    public static ktxStream_setpos create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ktxStream_setpos createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ktxStream_setpos} instance that delegates to the specified {@code ktxStream_setposI} instance. */
    public static ktxStream_setpos create(ktxStream_setposI instance) { return create(instance, instance.address()); }

    private static ktxStream_setpos create(ktxStream_setposI instance, long functionPointer) {
        return instance instanceof ktxStream_setpos
            ? (ktxStream_setpos)instance
            : new ktxStream_setpos(functionPointer) {
                @Override public int invoke(long str, long offset) {
                    return instance.invoke(str, offset);
                }
            };
    }

    protected ktxStream_setpos() {
        super(DESCRIPTOR);
    }

    ktxStream_setpos(long functionPointer) {
        super(functionPointer);
    }

}