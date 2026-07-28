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
public abstract class rpmalloc_interface_memory_map extends Callback implements rpmalloc_interface_memory_mapI {

    /**
     * Creates a {@code rpmalloc_interface_memory_map} instance from the specified function pointer.
     *
     * @return the new {@code rpmalloc_interface_memory_map}
     */
    public static rpmalloc_interface_memory_map create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable rpmalloc_interface_memory_map createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code rpmalloc_interface_memory_map} instance that delegates to the specified {@code rpmalloc_interface_memory_mapI} instance. */
    public static rpmalloc_interface_memory_map create(rpmalloc_interface_memory_mapI instance) { return create(instance, instance.address()); }

    private static rpmalloc_interface_memory_map create(rpmalloc_interface_memory_mapI instance, long functionPointer) {
        return instance instanceof rpmalloc_interface_memory_map
            ? (rpmalloc_interface_memory_map)instance
            : new rpmalloc_interface_memory_map(functionPointer) {
                @Override public long invoke(long size, long alignment, long offset, long mapped_size) {
                    return instance.invoke(size, alignment, offset, mapped_size);
                }
            };
    }

    protected rpmalloc_interface_memory_map() {
        super(DESCRIPTOR);
    }

    rpmalloc_interface_memory_map(long functionPointer) {
        super(functionPointer);
    }

}