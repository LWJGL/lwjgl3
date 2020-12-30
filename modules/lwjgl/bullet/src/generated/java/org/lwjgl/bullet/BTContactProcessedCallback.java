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
 * bool (*) (
 *     btManifoldPoint *cp,
 *     void *body0,
 *     void *body1
 * )</code></pre>
 */
public abstract class BTContactProcessedCallback extends Callback implements BTContactProcessedCallbackI {

    /**
     * Creates a {@code BTContactProcessedCallback} instance from the specified function pointer.
     *
     * @return the new {@code BTContactProcessedCallback}
     */
    public static BTContactProcessedCallback create(long functionPointer) {
        BTContactProcessedCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BTContactProcessedCallback
            ? (BTContactProcessedCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTContactProcessedCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTContactProcessedCallback} instance that delegates to the specified {@code BTContactProcessedCallbackI} instance. */
    public static BTContactProcessedCallback create(BTContactProcessedCallbackI instance) {
        return instance instanceof BTContactProcessedCallback
            ? (BTContactProcessedCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BTContactProcessedCallback() {
        super(SIGNATURE);
    }

    BTContactProcessedCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTContactProcessedCallback {

        private final BTContactProcessedCallbackI delegate;

        Container(long functionPointer, BTContactProcessedCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long cp, long body0, long body1) {
            return delegate.invoke(cp, body0, body1);
        }

    }

}