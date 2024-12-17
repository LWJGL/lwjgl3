/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Callback function: {@link #invoke (* anonymous)} */
public abstract class RPMapFailCallback extends Callback implements RPMapFailCallbackI {

    /**
     * Creates a {@code RPMapFailCallback} instance from the specified function pointer.
     *
     * @return the new {@code RPMapFailCallback}
     */
    public static RPMapFailCallback create(long functionPointer) {
        RPMapFailCallbackI instance = Callback.get(functionPointer);
        return instance instanceof RPMapFailCallback
            ? (RPMapFailCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RPMapFailCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RPMapFailCallback} instance that delegates to the specified {@code RPMapFailCallbackI} instance. */
    public static RPMapFailCallback create(RPMapFailCallbackI instance) {
        return instance instanceof RPMapFailCallback
            ? (RPMapFailCallback)instance
            : new Container(instance.address(), instance);
    }

    protected RPMapFailCallback() {
        super(CIF);
    }

    RPMapFailCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RPMapFailCallback {

        private final RPMapFailCallbackI delegate;

        Container(long functionPointer, RPMapFailCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long size) {
            return delegate.invoke(size);
        }

    }

}