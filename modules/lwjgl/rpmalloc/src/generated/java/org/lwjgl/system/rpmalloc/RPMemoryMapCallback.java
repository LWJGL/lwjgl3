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
public abstract class RPMemoryMapCallback extends Callback implements RPMemoryMapCallbackI {

    /**
     * Creates a {@code RPMemoryMapCallback} instance from the specified function pointer.
     *
     * @return the new {@code RPMemoryMapCallback}
     */
    public static RPMemoryMapCallback create(long functionPointer) {
        RPMemoryMapCallbackI instance = Callback.get(functionPointer);
        return instance instanceof RPMemoryMapCallback
            ? (RPMemoryMapCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    public static @Nullable RPMemoryMapCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RPMemoryMapCallback} instance that delegates to the specified {@code RPMemoryMapCallbackI} instance. */
    public static RPMemoryMapCallback create(RPMemoryMapCallbackI instance) {
        return instance instanceof RPMemoryMapCallback
            ? (RPMemoryMapCallback)instance
            : new Container(instance.address(), instance);
    }

    protected RPMemoryMapCallback() {
        super(CIF);
    }

    RPMemoryMapCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RPMemoryMapCallback {

        private final RPMemoryMapCallbackI delegate;

        Container(long functionPointer, RPMemoryMapCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long size, long offset) {
            return delegate.invoke(size, offset);
        }

    }

}