/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bullet;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     void *world,
 *     btScalar timeStep
 * )</code></pre>
 */
public abstract class BTInternalTickCallback extends Callback implements BTInternalTickCallbackI {

    /**
     * Creates a {@code BTInternalTickCallback} instance from the specified function pointer.
     *
     * @return the new {@code BTInternalTickCallback}
     */
    public static BTInternalTickCallback create(long functionPointer) {
        BTInternalTickCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BTInternalTickCallback
            ? (BTInternalTickCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTInternalTickCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTInternalTickCallback} instance that delegates to the specified {@code BTInternalTickCallbackI} instance. */
    public static BTInternalTickCallback create(BTInternalTickCallbackI instance) {
        return instance instanceof BTInternalTickCallback
            ? (BTInternalTickCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BTInternalTickCallback() {
        super(SIGNATURE);
    }

    BTInternalTickCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTInternalTickCallback {

        private final BTInternalTickCallbackI delegate;

        Container(long functionPointer, BTInternalTickCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long world, float timeStep) {
            delegate.invoke(world, timeStep);
        }

    }

}