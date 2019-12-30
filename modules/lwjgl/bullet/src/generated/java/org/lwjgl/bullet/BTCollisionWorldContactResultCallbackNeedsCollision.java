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
 *     void *proxy0
 * )</code></pre>
 */
public abstract class BTCollisionWorldContactResultCallbackNeedsCollision extends Callback implements BTCollisionWorldContactResultCallbackNeedsCollisionI {

    /**
     * Creates a {@code BTCollisionWorldContactResultCallbackNeedsCollision} instance from the specified function pointer.
     *
     * @return the new {@code BTCollisionWorldContactResultCallbackNeedsCollision}
     */
    public static BTCollisionWorldContactResultCallbackNeedsCollision create(long functionPointer) {
        BTCollisionWorldContactResultCallbackNeedsCollisionI instance = Callback.get(functionPointer);
        return instance instanceof BTCollisionWorldContactResultCallbackNeedsCollision
            ? (BTCollisionWorldContactResultCallbackNeedsCollision)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTCollisionWorldContactResultCallbackNeedsCollision createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTCollisionWorldContactResultCallbackNeedsCollision} instance that delegates to the specified {@code BTCollisionWorldContactResultCallbackNeedsCollisionI} instance. */
    public static BTCollisionWorldContactResultCallbackNeedsCollision create(BTCollisionWorldContactResultCallbackNeedsCollisionI instance) {
        return instance instanceof BTCollisionWorldContactResultCallbackNeedsCollision
            ? (BTCollisionWorldContactResultCallbackNeedsCollision)instance
            : new Container(instance.address(), instance);
    }

    protected BTCollisionWorldContactResultCallbackNeedsCollision() {
        super(SIGNATURE);
    }

    BTCollisionWorldContactResultCallbackNeedsCollision(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTCollisionWorldContactResultCallbackNeedsCollision {

        private final BTCollisionWorldContactResultCallbackNeedsCollisionI delegate;

        Container(long functionPointer, BTCollisionWorldContactResultCallbackNeedsCollisionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long proxy0) {
            return delegate.invoke(proxy0);
        }

    }

}