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
 * <code><pre>
 * void (*) (
 *     void *address
 * )</pre></code>
 */
public abstract class RPMemoryOverwriteCallback extends Callback implements RPMemoryOverwriteCallbackI {

    /**
     * Creates a {@code RPMemoryOverwriteCallback} instance from the specified function pointer.
     *
     * @return the new {@code RPMemoryOverwriteCallback}
     */
    public static RPMemoryOverwriteCallback create(long functionPointer) {
        RPMemoryOverwriteCallbackI instance = Callback.get(functionPointer);
        return instance instanceof RPMemoryOverwriteCallback
            ? (RPMemoryOverwriteCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static RPMemoryOverwriteCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code RPMemoryOverwriteCallback} instance that delegates to the specified {@code RPMemoryOverwriteCallbackI} instance. */
    public static RPMemoryOverwriteCallback create(RPMemoryOverwriteCallbackI instance) {
        return instance instanceof RPMemoryOverwriteCallback
            ? (RPMemoryOverwriteCallback)instance
            : new Container(instance.address(), instance);
    }

    protected RPMemoryOverwriteCallback() {
        super(SIGNATURE);
    }

    private RPMemoryOverwriteCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends RPMemoryOverwriteCallback {

        private final RPMemoryOverwriteCallbackI delegate;

        Container(long functionPointer, RPMemoryOverwriteCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long address) {
            delegate.invoke(address);
        }

    }

}