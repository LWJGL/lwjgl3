/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke extent_alloc_t} */
public abstract class ExtentAlloc extends Callback implements ExtentAllocI {

    /**
     * Creates a {@code ExtentAlloc} instance from the specified function pointer.
     *
     * @return the new {@code ExtentAlloc}
     */
    public static ExtentAlloc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExtentAlloc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExtentAlloc} instance that delegates to the specified {@code ExtentAllocI} instance. */
    public static ExtentAlloc create(ExtentAllocI instance) { return create(instance, instance.address()); }

    private static ExtentAlloc create(ExtentAllocI instance, long functionPointer) {
        return instance instanceof ExtentAlloc
            ? (ExtentAlloc)instance
            : new ExtentAlloc(functionPointer) {
                @Override public long invoke(long extent_hooks, long new_addr, long size, long alignment, long zero, long commit, int arena_ind) {
                    return instance.invoke(extent_hooks, new_addr, size, alignment, zero, commit, arena_ind);
                }
            };
    }

    protected ExtentAlloc() {
        super(DESCRIPTOR);
    }

    ExtentAlloc(long functionPointer) {
        super(functionPointer);
    }

}