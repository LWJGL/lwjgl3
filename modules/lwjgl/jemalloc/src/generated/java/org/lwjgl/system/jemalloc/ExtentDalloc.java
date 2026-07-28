/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke extent_dalloc_t} */
public abstract class ExtentDalloc extends Callback implements ExtentDallocI {

    /**
     * Creates a {@code ExtentDalloc} instance from the specified function pointer.
     *
     * @return the new {@code ExtentDalloc}
     */
    public static ExtentDalloc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExtentDalloc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExtentDalloc} instance that delegates to the specified {@code ExtentDallocI} instance. */
    public static ExtentDalloc create(ExtentDallocI instance) { return create(instance, instance.address()); }

    private static ExtentDalloc create(ExtentDallocI instance, long functionPointer) {
        return instance instanceof ExtentDalloc
            ? (ExtentDalloc)instance
            : new ExtentDalloc(functionPointer) {
                @Override public boolean invoke(long extent_hooks, long addr, long size, boolean committed, int arena_ind) {
                    return instance.invoke(extent_hooks, addr, size, committed, arena_ind);
                }
            };
    }

    protected ExtentDalloc() {
        super(DESCRIPTOR);
    }

    ExtentDalloc(long functionPointer) {
        super(functionPointer);
    }

}