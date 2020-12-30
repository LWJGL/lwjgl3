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
 *     void *cp,
 *     void *colObj0Wrap,
 *     int partId0,
 *     int index0,
 *     void *colObj1Wrap,
 *     int partId1,
 *     int index1
 * )</code></pre>
 */
public abstract class BTContactAddedCallback extends Callback implements BTContactAddedCallbackI {

    /**
     * Creates a {@code BTContactAddedCallback} instance from the specified function pointer.
     *
     * @return the new {@code BTContactAddedCallback}
     */
    public static BTContactAddedCallback create(long functionPointer) {
        BTContactAddedCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BTContactAddedCallback
            ? (BTContactAddedCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTContactAddedCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTContactAddedCallback} instance that delegates to the specified {@code BTContactAddedCallbackI} instance. */
    public static BTContactAddedCallback create(BTContactAddedCallbackI instance) {
        return instance instanceof BTContactAddedCallback
            ? (BTContactAddedCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BTContactAddedCallback() {
        super(SIGNATURE);
    }

    BTContactAddedCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTContactAddedCallback {

        private final BTContactAddedCallbackI delegate;

        Container(long functionPointer, BTContactAddedCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long cp, long colObj0Wrap, int partId0, int index0, long colObj1Wrap, int partId1, int index1) {
            return delegate.invoke(cp, colObj0Wrap, partId0, index0, colObj1Wrap, partId1, index1);
        }

    }

}