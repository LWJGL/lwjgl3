/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke ExrErrorCallback} */
public abstract class ExrErrorCallback extends Callback implements ExrErrorCallbackI {

    /**
     * Creates a {@code ExrErrorCallback} instance from the specified function pointer.
     *
     * @return the new {@code ExrErrorCallback}
     */
    public static ExrErrorCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable ExrErrorCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code ExrErrorCallback} instance that delegates to the specified {@code ExrErrorCallbackI} instance. */
    public static ExrErrorCallback create(ExrErrorCallbackI instance) { return create(instance, instance.address()); }

    private static ExrErrorCallback create(ExrErrorCallbackI instance, long functionPointer) {
        return instance instanceof ExrErrorCallback
            ? (ExrErrorCallback)instance
            : new ExrErrorCallback(functionPointer) {
                @Override public void invoke(long userdata, long error) {
                    instance.invoke(userdata, error);
                }
            };
    }

    protected ExrErrorCallback() {
        super(DESCRIPTOR);
    }

    ExrErrorCallback(long functionPointer) {
        super(functionPointer);
    }

}