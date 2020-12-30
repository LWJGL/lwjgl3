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
 * btScalar (*) (
 *     void *convexResult,
 *     bool normalInWorldSpace
 * )</code></pre>
 */
public abstract class BTCollisionWorldConvexResultCallbackAddSingleResult extends Callback implements BTCollisionWorldConvexResultCallbackAddSingleResultI {

    /**
     * Creates a {@code BTCollisionWorldConvexResultCallbackAddSingleResult} instance from the specified function pointer.
     *
     * @return the new {@code BTCollisionWorldConvexResultCallbackAddSingleResult}
     */
    public static BTCollisionWorldConvexResultCallbackAddSingleResult create(long functionPointer) {
        BTCollisionWorldConvexResultCallbackAddSingleResultI instance = Callback.get(functionPointer);
        return instance instanceof BTCollisionWorldConvexResultCallbackAddSingleResult
            ? (BTCollisionWorldConvexResultCallbackAddSingleResult)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTCollisionWorldConvexResultCallbackAddSingleResult createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTCollisionWorldConvexResultCallbackAddSingleResult} instance that delegates to the specified {@code BTCollisionWorldConvexResultCallbackAddSingleResultI} instance. */
    public static BTCollisionWorldConvexResultCallbackAddSingleResult create(BTCollisionWorldConvexResultCallbackAddSingleResultI instance) {
        return instance instanceof BTCollisionWorldConvexResultCallbackAddSingleResult
            ? (BTCollisionWorldConvexResultCallbackAddSingleResult)instance
            : new Container(instance.address(), instance);
    }

    protected BTCollisionWorldConvexResultCallbackAddSingleResult() {
        super(SIGNATURE);
    }

    BTCollisionWorldConvexResultCallbackAddSingleResult(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTCollisionWorldConvexResultCallbackAddSingleResult {

        private final BTCollisionWorldConvexResultCallbackAddSingleResultI delegate;

        Container(long functionPointer, BTCollisionWorldConvexResultCallbackAddSingleResultI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long convexResult, boolean normalInWorldSpace) {
            return delegate.invoke(convexResult, normalInWorldSpace);
        }

    }

}