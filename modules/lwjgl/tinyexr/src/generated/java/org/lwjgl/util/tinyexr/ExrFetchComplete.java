/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ExrFetchComplete} */
public abstract class ExrFetchComplete extends Callback implements ExrFetchCompleteI {

    /**
     * Creates a {@code ExrFetchComplete} instance from the specified function pointer.
     *
     * @return the new {@code ExrFetchComplete}
     */
    public static ExrFetchComplete create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExrFetchComplete createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExrFetchComplete} instance that delegates to the specified {@code ExrFetchCompleteI} instance. */
    public static ExrFetchComplete create(ExrFetchCompleteI instance) { return create(instance, instance.address()); }

    private static ExrFetchComplete create(ExrFetchCompleteI instance, long functionPointer) {
        return instance instanceof ExrFetchComplete
            ? (ExrFetchComplete)instance
            : new ExrFetchComplete(functionPointer) {
                @Override public void invoke(long userdata, int result, long bytes_read) {
                    instance.invoke(userdata, result, bytes_read);
                }
            };
    }

    protected ExrFetchComplete() {
        super(DESCRIPTOR);
    }

    ExrFetchComplete(long functionPointer) {
        super(functionPointer);
    }

}