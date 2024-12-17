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
    public static CLEventCallback create(long functionPointer) {
        CLEventCallbackI instance = Callback.get(functionPointer);
        return instance instanceof CLEventCallback
            ? (CLEventCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLEventCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CLEventCallback} instance that delegates to the specified {@code CLEventCallbackI} instance. */
    public static CLEventCallback create(CLEventCallbackI instance) {
        return instance instanceof CLEventCallback
            ? (CLEventCallback)instance
            : new Container(instance.address(), instance);
    }

    protected CLEventCallback() {
        super(CIF);
    }

    CLEventCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CLEventCallback {

        private final CLEventCallbackI delegate;

        Container(long functionPointer, CLEventCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long event, int event_command_exec_status, long user_data) {
            delegate.invoke(event, event_command_exec_status, user_data);
        }

    }

}