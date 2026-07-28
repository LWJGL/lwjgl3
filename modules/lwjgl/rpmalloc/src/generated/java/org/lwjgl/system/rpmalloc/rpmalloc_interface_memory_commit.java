/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class rpmalloc_interface_memory_commit extends Callback implements rpmalloc_interface_memory_commitI {

    /**
     * Creates a {@code rpmalloc_interface_memory_commit} instance from the specified function pointer.
     *
     * @return the new {@code rpmalloc_interface_memory_commit}
     */
    public static rpmalloc_interface_memory_commit create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable rpmalloc_interface_memory_commit createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code rpmalloc_interface_memory_commit} instance that delegates to the specified {@code rpmalloc_interface_memory_commitI} instance. */
    public static rpmalloc_interface_memory_commit create(rpmalloc_interface_memory_commitI instance) { return create(instance, instance.address()); }

    private static rpmalloc_interface_memory_commit create(rpmalloc_interface_memory_commitI instance, long functionPointer) {
        return instance instanceof rpmalloc_interface_memory_commit
            ? (rpmalloc_interface_memory_commit)instance
            : new rpmalloc_interface_memory_commit(functionPointer) {
                @Override public int invoke(long address, long size) {
                    return instance.invoke(address, size);
                }
            };
    }

    protected rpmalloc_interface_memory_commit() {
        super(DESCRIPTOR);
    }

    rpmalloc_interface_memory_commit(long functionPointer) {
        super(functionPointer);
    }

}