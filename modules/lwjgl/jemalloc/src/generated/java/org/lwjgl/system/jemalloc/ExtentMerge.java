/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke extent_merge_t} */
public abstract class ExtentMerge extends Callback implements ExtentMergeI {

    /**
     * Creates a {@code ExtentMerge} instance from the specified function pointer.
     *
     * @return the new {@code ExtentMerge}
     */
    public static ExtentMerge create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExtentMerge createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExtentMerge} instance that delegates to the specified {@code ExtentMergeI} instance. */
    public static ExtentMerge create(ExtentMergeI instance) { return create(instance, instance.address()); }

    private static ExtentMerge create(ExtentMergeI instance, long functionPointer) {
        return instance instanceof ExtentMerge
            ? (ExtentMerge)instance
            : new ExtentMerge(functionPointer) {
                @Override public boolean invoke(long extent_hooks, long addr_a, long size_a, long addr_b, long size_b, boolean committed, int arena_ind) {
                    return instance.invoke(extent_hooks, addr_a, size_a, addr_b, size_b, committed, arena_ind);
                }
            };
    }

    protected ExtentMerge() {
        super(DESCRIPTOR);
    }

    ExtentMerge(long functionPointer) {
        super(functionPointer);
    }

}