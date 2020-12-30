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
 *     void *rayResult,
 *     bool normalInWorldSpace
 * )</code></pre>
 */
public abstract class BTCollisionWorldRayResultCallbackAddSingleResult extends Callback implements BTCollisionWorldRayResultCallbackAddSingleResultI {

    /**
     * Creates a {@code BTCollisionWorldRayResultCallbackAddSingleResult} instance from the specified function pointer.
     *
     * @return the new {@code BTCollisionWorldRayResultCallbackAddSingleResult}
     */
    public static BTCollisionWorldRayResultCallbackAddSingleResult create(long functionPointer) {
        BTCollisionWorldRayResultCallbackAddSingleResultI instance = Callback.get(functionPointer);
        return instance instanceof BTCollisionWorldRayResultCallbackAddSingleResult
            ? (BTCollisionWorldRayResultCallbackAddSingleResult)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTCollisionWorldRayResultCallbackAddSingleResult createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTCollisionWorldRayResultCallbackAddSingleResult} instance that delegates to the specified {@code BTCollisionWorldRayResultCallbackAddSingleResultI} instance. */
    public static BTCollisionWorldRayResultCallbackAddSingleResult create(BTCollisionWorldRayResultCallbackAddSingleResultI instance) {
        return instance instanceof BTCollisionWorldRayResultCallbackAddSingleResult
            ? (BTCollisionWorldRayResultCallbackAddSingleResult)instance
            : new Container(instance.address(), instance);
    }

    protected BTCollisionWorldRayResultCallbackAddSingleResult() {
        super(SIGNATURE);
    }

    BTCollisionWorldRayResultCallbackAddSingleResult(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTCollisionWorldRayResultCallbackAddSingleResult {

        private final BTCollisionWorldRayResultCallbackAddSingleResultI delegate;

        Container(long functionPointer, BTCollisionWorldRayResultCallbackAddSingleResultI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long rayResult, boolean normalInWorldSpace) {
            return delegate.invoke(rayResult, normalInWorldSpace);
        }

    }

}