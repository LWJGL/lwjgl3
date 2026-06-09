/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ExrSubmitComplete} */
public abstract class ExrSubmitComplete extends Callback implements ExrSubmitCompleteI {

    /**
     * Creates a {@code ExrSubmitComplete} instance from the specified function pointer.
     *
     * @return the new {@code ExrSubmitComplete}
     */
    public static ExrSubmitComplete create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExrSubmitComplete createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExrSubmitComplete} instance that delegates to the specified {@code ExrSubmitCompleteI} instance. */
    public static ExrSubmitComplete create(ExrSubmitCompleteI instance) { return create(instance, instance.address()); }

    private static ExrSubmitComplete create(ExrSubmitCompleteI instance, long functionPointer) {
        return instance instanceof ExrSubmitComplete
            ? (ExrSubmitComplete)instance
            : new ExrSubmitComplete(functionPointer) {
                @Override public void invoke(long userdata, int result) {
                    instance.invoke(userdata, result);
                }
            };
    }

    protected ExrSubmitComplete() {
        super(DESCRIPTOR);
    }

    ExrSubmitComplete(long functionPointer) {
        super(functionPointer);
    }

}