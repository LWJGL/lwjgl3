/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ExrFetchCancel} */
public abstract class ExrFetchCancel extends Callback implements ExrFetchCancelI {

    /**
     * Creates a {@code ExrFetchCancel} instance from the specified function pointer.
     *
     * @return the new {@code ExrFetchCancel}
     */
    public static ExrFetchCancel create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExrFetchCancel createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExrFetchCancel} instance that delegates to the specified {@code ExrFetchCancelI} instance. */
    public static ExrFetchCancel create(ExrFetchCancelI instance) { return create(instance, instance.address()); }

    private static ExrFetchCancel create(ExrFetchCancelI instance, long functionPointer) {
        return instance instanceof ExrFetchCancel
            ? (ExrFetchCancel)instance
            : new ExrFetchCancel(functionPointer) {
                @Override public void invoke(long userdata, long offset, long size) {
                    instance.invoke(userdata, offset, size);
                }
            };
    }

    protected ExrFetchCancel() {
        super(DESCRIPTOR);
    }

    ExrFetchCancel(long functionPointer) {
        super(functionPointer);
    }

}