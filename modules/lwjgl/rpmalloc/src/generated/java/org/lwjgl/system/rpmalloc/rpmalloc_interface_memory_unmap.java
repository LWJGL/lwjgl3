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
public abstract class rpmalloc_interface_memory_unmap extends Callback implements rpmalloc_interface_memory_unmapI {

    /**
     * Creates a {@code rpmalloc_interface_memory_unmap} instance from the specified function pointer.
     *
     * @return the new {@code rpmalloc_interface_memory_unmap}
     */
    public static rpmalloc_interface_memory_unmap create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable rpmalloc_interface_memory_unmap createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code rpmalloc_interface_memory_unmap} instance that delegates to the specified {@code rpmalloc_interface_memory_unmapI} instance. */
    public static rpmalloc_interface_memory_unmap create(rpmalloc_interface_memory_unmapI instance) { return create(instance, instance.address()); }

    private static rpmalloc_interface_memory_unmap create(rpmalloc_interface_memory_unmapI instance, long functionPointer) {
        return instance instanceof rpmalloc_interface_memory_unmap
            ? (rpmalloc_interface_memory_unmap)instance
            : new rpmalloc_interface_memory_unmap(functionPointer) {
                @Override public void invoke(long address, long offset, long mapped_size) {
                    instance.invoke(address, offset, mapped_size);
                }
            };
    }

    protected rpmalloc_interface_memory_unmap() {
        super(DESCRIPTOR);
    }

    rpmalloc_interface_memory_unmap(long functionPointer) {
        super(functionPointer);
    }

}