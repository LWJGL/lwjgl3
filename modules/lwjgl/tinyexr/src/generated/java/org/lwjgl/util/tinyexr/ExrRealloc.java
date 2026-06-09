/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class ExrRealloc extends Callback implements ExrReallocI {

    /**
     * Creates a {@code ExrRealloc} instance from the specified function pointer.
     *
     * @return the new {@code ExrRealloc}
     */
    public static ExrRealloc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExrRealloc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExrRealloc} instance that delegates to the specified {@code ExrReallocI} instance. */
    public static ExrRealloc create(ExrReallocI instance) { return create(instance, instance.address()); }

    private static ExrRealloc create(ExrReallocI instance, long functionPointer) {
        return instance instanceof ExrRealloc
            ? (ExrRealloc)instance
            : new ExrRealloc(functionPointer) {
                @Override public long invoke(long userdata, long ptr, long old_size, long new_size, long alignment) {
                    return instance.invoke(userdata, ptr, old_size, new_size, alignment);
                }
            };
    }

    protected ExrRealloc() {
        super(DESCRIPTOR);
    }

    ExrRealloc(long functionPointer) {
        super(functionPointer);
    }

}