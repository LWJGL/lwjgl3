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
 *     btBroadphaseProxy *proxy0,
 *     btBroadphaseProxy *proxy1
 * )</code></pre>
 */
public abstract class BTOverlapFilterCallbackNeedBroadphaseCollision extends Callback implements BTOverlapFilterCallbackNeedBroadphaseCollisionI {

    /**
     * Creates a {@code BTOverlapFilterCallbackNeedBroadphaseCollision} instance from the specified function pointer.
     *
     * @return the new {@code BTOverlapFilterCallbackNeedBroadphaseCollision}
     */
    public static BTOverlapFilterCallbackNeedBroadphaseCollision create(long functionPointer) {
        BTOverlapFilterCallbackNeedBroadphaseCollisionI instance = Callback.get(functionPointer);
        return instance instanceof BTOverlapFilterCallbackNeedBroadphaseCollision
            ? (BTOverlapFilterCallbackNeedBroadphaseCollision)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTOverlapFilterCallbackNeedBroadphaseCollision createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTOverlapFilterCallbackNeedBroadphaseCollision} instance that delegates to the specified {@code BTOverlapFilterCallbackNeedBroadphaseCollisionI} instance. */
    public static BTOverlapFilterCallbackNeedBroadphaseCollision create(BTOverlapFilterCallbackNeedBroadphaseCollisionI instance) {
        return instance instanceof BTOverlapFilterCallbackNeedBroadphaseCollision
            ? (BTOverlapFilterCallbackNeedBroadphaseCollision)instance
            : new Container(instance.address(), instance);
    }

    protected BTOverlapFilterCallbackNeedBroadphaseCollision() {
        super(SIGNATURE);
    }

    BTOverlapFilterCallbackNeedBroadphaseCollision(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTOverlapFilterCallbackNeedBroadphaseCollision {

        private final BTOverlapFilterCallbackNeedBroadphaseCollisionI delegate;

        Container(long functionPointer, BTOverlapFilterCallbackNeedBroadphaseCollisionI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public boolean invoke(long proxy0, long proxy1) {
            return delegate.invoke(proxy0, proxy1);
        }

    }

}