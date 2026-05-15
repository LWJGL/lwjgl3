/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke extent_decommit_t} */
public abstract class ExtentDecommit extends Callback implements ExtentDecommitI {

    /**
     * Creates a {@code ExtentDecommit} instance from the specified function pointer.
     *
     * @return the new {@code ExtentDecommit}
     */
    public static ExtentDecommit create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExtentDecommit createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExtentDecommit} instance that delegates to the specified {@code ExtentDecommitI} instance. */
    public static ExtentDecommit create(ExtentDecommitI instance) { return create(instance, instance.address()); }

    private static ExtentDecommit create(ExtentDecommitI instance, long functionPointer) {
        return instance instanceof ExtentDecommit
            ? (ExtentDecommit)instance
            : new ExtentDecommit(functionPointer) {
                @Override public boolean invoke(long extent_hooks, long addr, long size, long offset, long length, int arena_ind) {
                    return instance.invoke(extent_hooks, addr, size, offset, length, arena_ind);
                }
            };
    }

    protected ExtentDecommit() {
        super(DESCRIPTOR);
    }

    ExtentDecommit(long functionPointer) {
        super(functionPointer);
    }

}