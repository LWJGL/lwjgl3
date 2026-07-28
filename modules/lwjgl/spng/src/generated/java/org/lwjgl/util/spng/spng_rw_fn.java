/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spng_rw_fn *} */
public abstract class spng_rw_fn extends Callback implements spng_rw_fnI {

    /**
     * Creates a {@code spng_rw_fn} instance from the specified function pointer.
     *
     * @return the new {@code spng_rw_fn}
     */
    public static spng_rw_fn create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable spng_rw_fn createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code spng_rw_fn} instance that delegates to the specified {@code spng_rw_fnI} instance. */
    public static spng_rw_fn create(spng_rw_fnI instance) { return create(instance, instance.address()); }

    private static spng_rw_fn create(spng_rw_fnI instance, long functionPointer) {
        return instance instanceof spng_rw_fn
            ? (spng_rw_fn)instance
            : new spng_rw_fn(functionPointer) {
                @Override public void invoke(long ctx, long user, long dest, long length) {
                    instance.invoke(ctx, user, dest, length);
                }
            };
    }

    protected spng_rw_fn() {
        super(DESCRIPTOR);
    }

    spng_rw_fn(long functionPointer) {
        super(functionPointer);
    }

}