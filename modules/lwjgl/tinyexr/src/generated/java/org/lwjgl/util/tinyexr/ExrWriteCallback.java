/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ExrWriteCallback} */
public abstract class ExrWriteCallback extends Callback implements ExrWriteCallbackI {

    /**
     * Creates a {@code ExrWriteCallback} instance from the specified function pointer.
     *
     * @return the new {@code ExrWriteCallback}
     */
    public static ExrWriteCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExrWriteCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExrWriteCallback} instance that delegates to the specified {@code ExrWriteCallbackI} instance. */
    public static ExrWriteCallback create(ExrWriteCallbackI instance) { return create(instance, instance.address()); }

    private static ExrWriteCallback create(ExrWriteCallbackI instance, long functionPointer) {
        return instance instanceof ExrWriteCallback
            ? (ExrWriteCallback)instance
            : new ExrWriteCallback(functionPointer) {
                @Override public int invoke(long userdata, long offset, long data, long size, long on_complete, long complete_userdata) {
                    return instance.invoke(userdata, offset, data, size, on_complete, complete_userdata);
                }
            };
    }

    protected ExrWriteCallback() {
        super(DESCRIPTOR);
    }

    ExrWriteCallback(long functionPointer) {
        super(functionPointer);
    }

}