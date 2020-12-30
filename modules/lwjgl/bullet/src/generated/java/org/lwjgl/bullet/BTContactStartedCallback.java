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
 *     btPersistentManifold * const *manifold
 * )</code></pre>
 */
public abstract class BTContactStartedCallback extends Callback implements BTContactStartedCallbackI {

    /**
     * Creates a {@code BTContactStartedCallback} instance from the specified function pointer.
     *
     * @return the new {@code BTContactStartedCallback}
     */
    public static BTContactStartedCallback create(long functionPointer) {
        BTContactStartedCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BTContactStartedCallback
            ? (BTContactStartedCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTContactStartedCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTContactStartedCallback} instance that delegates to the specified {@code BTContactStartedCallbackI} instance. */
    public static BTContactStartedCallback create(BTContactStartedCallbackI instance) {
        return instance instanceof BTContactStartedCallback
            ? (BTContactStartedCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BTContactStartedCallback() {
        super(SIGNATURE);
    }

    BTContactStartedCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTContactStartedCallback {

        private final BTContactStartedCallbackI delegate;

        Container(long functionPointer, BTContactStartedCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long manifold) {
            delegate.invoke(manifold);
        }

    }

}