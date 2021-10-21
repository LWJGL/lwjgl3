/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.rpmalloc;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@link RPMallocConfig} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*{@link #invoke}) (
 *     char const *message
 * )</code></pre>
 */
public abstract class RPErrorCallback extends Callback implements RPErrorCallbackI {

    /**
     * Creates a {@code RPErrorCallback} instance from the specified function pointer.
     *
     * @return the new {@code RPErrorCallback}
     */
    public static RPErrorCallback create(long functionPointer) {
        RPErrorCallbackI instance = Callback.get(functionPointer);
        return instance instanceof RPErrorCallback
            ? (RPErrorCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static RPErrorCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RPErrorCallback} instance that delegates to the specified {@code RPErrorCallbackI} instance. */
    public static RPErrorCallback create(RPErrorCallbackI instance) {
        return instance instanceof RPErrorCallback
            ? (RPErrorCallback)instance
            : new Container(instance.address(), instance);
    }

    protected RPErrorCallback() {
        super(CIF);
    }

    RPErrorCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RPErrorCallback {

        private final RPErrorCallbackI delegate;

        Container(long functionPointer, RPErrorCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long message) {
            delegate.invoke(message);
        }

    }

}