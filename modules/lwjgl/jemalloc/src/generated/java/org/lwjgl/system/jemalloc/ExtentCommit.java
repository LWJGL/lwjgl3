/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jemalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke extent_commit_t} */
public abstract class ExtentCommit extends Callback implements ExtentCommitI {

    /**
     * Creates a {@code ExtentCommit} instance from the specified function pointer.
     *
     * @return the new {@code ExtentCommit}
     */
    public static ExtentCommit create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExtentCommit createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExtentCommit} instance that delegates to the specified {@code ExtentCommitI} instance. */
    public static ExtentCommit create(ExtentCommitI instance) { return create(instance, instance.address()); }

    private static ExtentCommit create(ExtentCommitI instance, long functionPointer) {
        return instance instanceof ExtentCommit
            ? (ExtentCommit)instance
            : new ExtentCommit(functionPointer) {
                @Override public boolean invoke(long extent_hooks, long addr, long size, long offset, long length, int arena_ind) {
                    return instance.invoke(extent_hooks, addr, size, offset, length, arena_ind);
                }
            };
    }

    protected ExtentCommit() {
        super(DESCRIPTOR);
    }

    ExtentCommit(long functionPointer) {
        super(functionPointer);
    }

}