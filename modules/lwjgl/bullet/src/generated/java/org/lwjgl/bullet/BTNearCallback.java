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
 *     btBroadphasePair *collisionPair,
 *     btCollisionDispatcher *dispatcher,
 *     btDispatcherInfo *dispatchInfo
 * )</code></pre>
 */
public abstract class BTNearCallback extends Callback implements BTNearCallbackI {

    /**
     * Creates a {@code BTNearCallback} instance from the specified function pointer.
     *
     * @return the new {@code BTNearCallback}
     */
    public static BTNearCallback create(long functionPointer) {
        BTNearCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BTNearCallback
            ? (BTNearCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTNearCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTNearCallback} instance that delegates to the specified {@code BTNearCallbackI} instance. */
    public static BTNearCallback create(BTNearCallbackI instance) {
        return instance instanceof BTNearCallback
            ? (BTNearCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BTNearCallback() {
        super(SIGNATURE);
    }

    BTNearCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTNearCallback {

        private final BTNearCallbackI delegate;

        Container(long functionPointer, BTNearCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long collisionPair, long dispatcher, long dispatchInfo) {
            delegate.invoke(collisionPair, dispatcher, dispatchInfo);
        }

    }

}