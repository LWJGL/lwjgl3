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
public abstract class RPMemoryMapCallback extends Callback implements RPMemoryMapCallbackI {

    /**
     * Creates a {@code RPMemoryMapCallback} instance from the specified function pointer.
     *
     * @return the new {@code RPMemoryMapCallback}
     */
    public static RPMemoryMapCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RPMemoryMapCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code RPMemoryMapCallback} instance that delegates to the specified {@code RPMemoryMapCallbackI} instance. */
    public static RPMemoryMapCallback create(RPMemoryMapCallbackI instance) { return create(instance, instance.address()); }

    private static RPMemoryMapCallback create(RPMemoryMapCallbackI instance, long functionPointer) {
        return instance instanceof RPMemoryMapCallback
            ? (RPMemoryMapCallback)instance
            : new RPMemoryMapCallback(functionPointer) {
                @Override public long invoke(long size, long offset) {
                    return instance.invoke(size, offset);
                }
            };
    }

    protected RPMemoryMapCallback() {
        super(DESCRIPTOR);
    }

    RPMemoryMapCallback(long functionPointer) {
        super(functionPointer);
    }

}