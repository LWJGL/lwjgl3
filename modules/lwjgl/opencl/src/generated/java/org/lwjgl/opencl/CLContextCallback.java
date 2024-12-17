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
public abstract class CLContextCallback extends Callback implements CLContextCallbackI {

    /**
     * Creates a {@code CLContextCallback} instance from the specified function pointer.
     *
     * @return the new {@code CLContextCallback}
     */
    public static CLContextCallback create(long functionPointer) {
        CLContextCallbackI instance = Callback.get(functionPointer);
        return instance instanceof CLContextCallback
            ? (CLContextCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CLContextCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CLContextCallback} instance that delegates to the specified {@code CLContextCallbackI} instance. */
    public static CLContextCallback create(CLContextCallbackI instance) {
        return instance instanceof CLContextCallback
            ? (CLContextCallback)instance
            : new Container(instance.address(), instance);
    }

    protected CLContextCallback() {
        super(CIF);
    }

    CLContextCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CLContextCallback {

        private final CLContextCallbackI delegate;

        Container(long functionPointer, CLContextCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long errinfo, long private_info, long cb, long user_data) {
            delegate.invoke(errinfo, private_info, cb, user_data);
        }

    }

}