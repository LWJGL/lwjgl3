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
public abstract class BTContactEndedCallback extends Callback implements BTContactEndedCallbackI {

    /**
     * Creates a {@code BTContactEndedCallback} instance from the specified function pointer.
     *
     * @return the new {@code BTContactEndedCallback}
     */
    public static BTContactEndedCallback create(long functionPointer) {
        BTContactEndedCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BTContactEndedCallback
            ? (BTContactEndedCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTContactEndedCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTContactEndedCallback} instance that delegates to the specified {@code BTContactEndedCallbackI} instance. */
    public static BTContactEndedCallback create(BTContactEndedCallbackI instance) {
        return instance instanceof BTContactEndedCallback
            ? (BTContactEndedCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BTContactEndedCallback() {
        super(SIGNATURE);
    }

    BTContactEndedCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTContactEndedCallback {

        private final BTContactEndedCallbackI delegate;

        Container(long functionPointer, BTContactEndedCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long manifold) {
            delegate.invoke(manifold);
        }

    }

}