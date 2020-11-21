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
public abstract class BTCollisionWorldRayResultCallbackNeedsCollision extends Callback implements BTCollisionWorldRayResultCallbackNeedsCollisionI {

    /**
     * Creates a {@code BTCollisionWorldRayResultCallbackNeedsCollision} instance from the specified function pointer.
     *
     * @return the new {@code BTCollisionWorldRayResultCallbackNeedsCollision}
     */
    public static BTCollisionWorldRayResultCallbackNeedsCollision create(long functionPointer) {
        BTCollisionWorldRayResultCallbackNeedsCollisionI instance = Callback.get(functionPointer);
        return instance instanceof BTCollisionWorldRayResultCallbackNeedsCollision
            ? (BTCollisionWorldRayResultCallbackNeedsCollision)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTCollisionWorldRayResultCallbackNeedsCollision createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTCollisionWorldRayResultCallbackNeedsCollision} instance that delegates to the specified {@code BTCollisionWorldRayResultCallbackNeedsCollisionI} instance. */
    public static BTCollisionWorldRayResultCallbackNeedsCollision create(BTCollisionWorldRayResultCallbackNeedsCollisionI instance) {
        return instance instanceof BTCollisionWorldRayResultCallbackNeedsCollision
            ? (BTCollisionWorldRayResultCallbackNeedsCollision)instance
            : new Container(instance.address(), instance);
    }

    protected BTCollisionWorldRayResultCallbackNeedsCollision() {
        super(SIGNATURE);
    }

    BTCollisionWorldRayResultCallbackNeedsCollision(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTCollisionWorldRayResultCallbackNeedsCollision {

        private final BTCollisionWorldRayResultCallbackNeedsCollisionI delegate;

        Container(long functionPointer, BTCollisionWorldRayResultCallbackNeedsCollisionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long proxy0) {
            return delegate.invoke(proxy0);
        }

    }

}