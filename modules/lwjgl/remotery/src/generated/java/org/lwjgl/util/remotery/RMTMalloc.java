/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.remotery;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke rmtMallocPtr} */
public abstract class RMTMalloc extends Callback implements RMTMallocI {

    /**
     * Creates a {@code RMTMalloc} instance from the specified function pointer.
     *
     * @return the new {@code RMTMalloc}
     */
    public static RMTMalloc create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RMTMalloc createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code RMTMalloc} instance that delegates to the specified {@code RMTMallocI} instance. */
    public static RMTMalloc create(RMTMallocI instance) { return create(instance, instance.address()); }

    private static RMTMalloc create(RMTMallocI instance, long functionPointer) {
        return instance instanceof RMTMalloc
            ? (RMTMalloc)instance
            : new RMTMalloc(functionPointer) {
                @Override public long invoke(long mm_context, int size) {
                    return instance.invoke(mm_context, size);
                }
            };
    }

    protected RMTMalloc() {
        super(DESCRIPTOR);
    }

    RMTMalloc(long functionPointer) {
        super(functionPointer);
    }

}