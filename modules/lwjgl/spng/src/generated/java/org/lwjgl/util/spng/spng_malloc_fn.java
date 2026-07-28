/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.spng;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke spng_malloc_fn} */
public abstract class spng_malloc_fn extends Callback implements spng_malloc_fnI {

    /**
     * Creates a {@code spng_malloc_fn} instance from the specified function pointer.
     *
     * @return the new {@code spng_malloc_fn}
     */
    public static spng_malloc_fn create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable spng_malloc_fn createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code spng_malloc_fn} instance that delegates to the specified {@code spng_malloc_fnI} instance. */
    public static spng_malloc_fn create(spng_malloc_fnI instance) { return create(instance, instance.address()); }

    private static spng_malloc_fn create(spng_malloc_fnI instance, long functionPointer) {
        return instance instanceof spng_malloc_fn
            ? (spng_malloc_fn)instance
            : new spng_malloc_fn(functionPointer) {
                @Override public long invoke(long size) {
                    return instance.invoke(size);
                }
            };
    }

    protected spng_malloc_fn() {
        super(DESCRIPTOR);
    }

    spng_malloc_fn(long functionPointer) {
        super(functionPointer);
    }

}