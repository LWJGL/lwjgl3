/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.opencl;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class CLEventCallback extends Callback implements CLEventCallbackI {

    /**
     * Creates a {@code CLEventCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLEventCallback}
     */
    public static CLEventCallback create(long functionPointer) { return create(Callback.get(functionPointer), functionPointer); }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLEventCallback createSafe(long functionPointer) { return functionPointer == NULL ? null : create(functionPointer); }

    /** Creates a {@code CLEventCallback} instance that delegates to the specified {@code CLEventCallbackI} instance. */
    public static CLEventCallback create(CLEventCallbackI instance) { return create(instance, instance.address()); }

    private static CLEventCallback create(CLEventCallbackI instance, long functionPointer) {
        return instance instanceof CLEventCallback
            ? (CLEventCallback)instance
            : new CLEventCallback(functionPointer) {
                @Override public void invoke(long event, int event_command_exec_status, long user_data) {
                    instance.invoke(event, event_command_exec_status, user_data);
                }
            };
    }

    protected CLEventCallback() {
        super(DESCRIPTOR);
    }

    CLEventCallback(long functionPointer) {
        super(functionPointer);
    }

}