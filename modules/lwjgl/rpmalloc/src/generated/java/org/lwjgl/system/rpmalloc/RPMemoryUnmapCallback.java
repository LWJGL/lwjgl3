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
public abstract class RPMemoryUnmapCallback extends Callback implements RPMemoryUnmapCallbackI {

    /**
     * Creates a {@code RPMemoryUnmapCallback} instance from the specified function pointer.
     *
     * @return the new {@code RPMemoryUnmapCallback}
     */
    public static RPMemoryUnmapCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RPMemoryUnmapCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code RPMemoryUnmapCallback} instance that delegates to the specified {@code RPMemoryUnmapCallbackI} instance. */
    public static RPMemoryUnmapCallback create(RPMemoryUnmapCallbackI instance) { return create(instance, instance.address()); }

    private static RPMemoryUnmapCallback create(RPMemoryUnmapCallbackI instance, long functionPointer) {
        return instance instanceof RPMemoryUnmapCallback
            ? (RPMemoryUnmapCallback)instance
            : new RPMemoryUnmapCallback(functionPointer) {
                @Override public void invoke(long address, long size, long offset, boolean release) {
                    instance.invoke(address, size, offset, release);
                }
            };
    }

    protected RPMemoryUnmapCallback() {
        super(DESCRIPTOR);
    }

    RPMemoryUnmapCallback(long functionPointer) {
        super(functionPointer);
    }

}