/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.cuda;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class CUasyncCallback extends Callback implements CUasyncCallbackI {

    /**
     * Creates a {@code CUasyncCallback} instance from the specified function pointer.
     *
     * @return the new {@code CUasyncCallback}
     */
    public static CUasyncCallback create(long functionPointer) {
        CUasyncCallbackI instance = Callback.get(functionPointer);
        return instance instanceof CUasyncCallback
            ? (CUasyncCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable CUasyncCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code CUasyncCallback} instance that delegates to the specified {@code CUasyncCallbackI} instance. */
    public static CUasyncCallback create(CUasyncCallbackI instance) {
        return instance instanceof CUasyncCallback
            ? (CUasyncCallback)instance
            : new Container(instance.address(), instance);
    }

    protected CUasyncCallback() {
        super(CIF);
    }

    CUasyncCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends CUasyncCallback {

        private final CUasyncCallbackI delegate;

        Container(long functionPointer, CUasyncCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long info, long userData, long callback) {
            delegate.invoke(info, userData, callback);
        }

    }

}