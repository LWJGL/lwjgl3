/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke rmtReallocPtr} */
public abstract class RMTRealloc extends Callback implements RMTReallocI {

    /**
     * Creates a {@code RMTRealloc} instance from the specified function pointer.
     *
     * @return the new {@code RMTRealloc}
     */
    public static RMTRealloc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RMTRealloc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code RMTRealloc} instance that delegates to the specified {@code RMTReallocI} instance. */
    public static RMTRealloc create(RMTReallocI instance) { return create(instance, instance.address()); }

    private static RMTRealloc create(RMTReallocI instance, long functionPointer) {
        return instance instanceof RMTRealloc
            ? (RMTRealloc)instance
            : new RMTRealloc(functionPointer) {
                @Override public long invoke(long mm_context, long ptr, int size) {
                    return instance.invoke(mm_context, ptr, size);
                }
            };
    }

    protected RMTRealloc() {
        super(DESCRIPTOR);
    }

    RMTRealloc(long functionPointer) {
        super(functionPointer);
    }

}