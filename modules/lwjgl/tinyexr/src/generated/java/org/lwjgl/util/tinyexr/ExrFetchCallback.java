/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ExrFetchCallback} */
public abstract class ExrFetchCallback extends Callback implements ExrFetchCallbackI {

    /**
     * Creates a {@code ExrFetchCallback} instance from the specified function pointer.
     *
     * @return the new {@code ExrFetchCallback}
     */
    public static ExrFetchCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExrFetchCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExrFetchCallback} instance that delegates to the specified {@code ExrFetchCallbackI} instance. */
    public static ExrFetchCallback create(ExrFetchCallbackI instance) { return create(instance, instance.address()); }

    private static ExrFetchCallback create(ExrFetchCallbackI instance, long functionPointer) {
        return instance instanceof ExrFetchCallback
            ? (ExrFetchCallback)instance
            : new ExrFetchCallback(functionPointer) {
                @Override public int invoke(long userdata, long offset, long size, long dst, long on_complete, long complete_userdata) {
                    return instance.invoke(userdata, offset, size, dst, on_complete, complete_userdata);
                }
            };
    }

    protected ExrFetchCallback() {
        super(DESCRIPTOR);
    }

    ExrFetchCallback(long functionPointer) {
        super(functionPointer);
    }

}