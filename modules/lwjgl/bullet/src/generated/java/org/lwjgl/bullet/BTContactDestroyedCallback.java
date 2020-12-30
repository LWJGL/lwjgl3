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
 *     void *userPersistentData
 * )</code></pre>
 */
public abstract class BTContactDestroyedCallback extends Callback implements BTContactDestroyedCallbackI {

    /**
     * Creates a {@code BTContactDestroyedCallback} instance from the specified function pointer.
     *
     * @return the new {@code BTContactDestroyedCallback}
     */
    public static BTContactDestroyedCallback create(long functionPointer) {
        BTContactDestroyedCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BTContactDestroyedCallback
            ? (BTContactDestroyedCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTContactDestroyedCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTContactDestroyedCallback} instance that delegates to the specified {@code BTContactDestroyedCallbackI} instance. */
    public static BTContactDestroyedCallback create(BTContactDestroyedCallbackI instance) {
        return instance instanceof BTContactDestroyedCallback
            ? (BTContactDestroyedCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BTContactDestroyedCallback() {
        super(SIGNATURE);
    }

    BTContactDestroyedCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTContactDestroyedCallback {

        private final BTContactDestroyedCallbackI delegate;

        Container(long functionPointer, BTContactDestroyedCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long userPersistentData) {
            return delegate.invoke(userPersistentData);
        }

    }

}