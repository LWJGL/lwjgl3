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
public abstract class BTCollisionWorldConvexResultCallbackNeedsCollision extends Callback implements BTCollisionWorldConvexResultCallbackNeedsCollisionI {

    /**
     * Creates a {@code BTCollisionWorldConvexResultCallbackNeedsCollision} instance from the specified function pointer.
     *
     * @return the new {@code BTCollisionWorldConvexResultCallbackNeedsCollision}
     */
    public static BTCollisionWorldConvexResultCallbackNeedsCollision create(long functionPointer) {
        BTCollisionWorldConvexResultCallbackNeedsCollisionI instance = Callback.get(functionPointer);
        return instance instanceof BTCollisionWorldConvexResultCallbackNeedsCollision
            ? (BTCollisionWorldConvexResultCallbackNeedsCollision)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTCollisionWorldConvexResultCallbackNeedsCollision createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTCollisionWorldConvexResultCallbackNeedsCollision} instance that delegates to the specified {@code BTCollisionWorldConvexResultCallbackNeedsCollisionI} instance. */
    public static BTCollisionWorldConvexResultCallbackNeedsCollision create(BTCollisionWorldConvexResultCallbackNeedsCollisionI instance) {
        return instance instanceof BTCollisionWorldConvexResultCallbackNeedsCollision
            ? (BTCollisionWorldConvexResultCallbackNeedsCollision)instance
            : new Container(instance.address(), instance);
    }

    protected BTCollisionWorldConvexResultCallbackNeedsCollision() {
        super(SIGNATURE);
    }

    BTCollisionWorldConvexResultCallbackNeedsCollision(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTCollisionWorldConvexResultCallbackNeedsCollision {

        private final BTCollisionWorldConvexResultCallbackNeedsCollisionI delegate;

        Container(long functionPointer, BTCollisionWorldConvexResultCallbackNeedsCollisionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long proxy0) {
            return delegate.invoke(proxy0);
        }

    }

}