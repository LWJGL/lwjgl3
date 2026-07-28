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
public abstract class rpmalloc_interface_memory_decommit extends Callback implements rpmalloc_interface_memory_decommitI {

    /**
     * Creates a {@code rpmalloc_interface_memory_decommit} instance from the specified function pointer.
     *
     * @return the new {@code rpmalloc_interface_memory_decommit}
     */
    public static rpmalloc_interface_memory_decommit create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable rpmalloc_interface_memory_decommit createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code rpmalloc_interface_memory_decommit} instance that delegates to the specified {@code rpmalloc_interface_memory_decommitI} instance. */
    public static rpmalloc_interface_memory_decommit create(rpmalloc_interface_memory_decommitI instance) { return create(instance, instance.address()); }

    private static rpmalloc_interface_memory_decommit create(rpmalloc_interface_memory_decommitI instance, long functionPointer) {
        return instance instanceof rpmalloc_interface_memory_decommit
            ? (rpmalloc_interface_memory_decommit)instance
            : new rpmalloc_interface_memory_decommit(functionPointer) {
                @Override public int invoke(long address, long size) {
                    return instance.invoke(address, size);
                }
            };
    }

    protected rpmalloc_interface_memory_decommit() {
        super(DESCRIPTOR);
    }

    rpmalloc_interface_memory_decommit(long functionPointer) {
        super(functionPointer);
    }

}