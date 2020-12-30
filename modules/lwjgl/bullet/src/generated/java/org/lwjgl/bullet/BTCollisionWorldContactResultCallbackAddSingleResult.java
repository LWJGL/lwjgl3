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
 *     void *cp,
 *     void *colObj0Wrap,
 *     int partId0,
 *     int index0,
 *     void *colObj1Wrap,
 *     int partId1,
 *     int index1
 * )</code></pre>
 */
public abstract class BTCollisionWorldContactResultCallbackAddSingleResult extends Callback implements BTCollisionWorldContactResultCallbackAddSingleResultI {

    /**
     * Creates a {@code BTCollisionWorldContactResultCallbackAddSingleResult} instance from the specified function pointer.
     *
     * @return the new {@code BTCollisionWorldContactResultCallbackAddSingleResult}
     */
    public static BTCollisionWorldContactResultCallbackAddSingleResult create(long functionPointer) {
        BTCollisionWorldContactResultCallbackAddSingleResultI instance = Callback.get(functionPointer);
        return instance instanceof BTCollisionWorldContactResultCallbackAddSingleResult
            ? (BTCollisionWorldContactResultCallbackAddSingleResult)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTCollisionWorldContactResultCallbackAddSingleResult createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTCollisionWorldContactResultCallbackAddSingleResult} instance that delegates to the specified {@code BTCollisionWorldContactResultCallbackAddSingleResultI} instance. */
    public static BTCollisionWorldContactResultCallbackAddSingleResult create(BTCollisionWorldContactResultCallbackAddSingleResultI instance) {
        return instance instanceof BTCollisionWorldContactResultCallbackAddSingleResult
            ? (BTCollisionWorldContactResultCallbackAddSingleResult)instance
            : new Container(instance.address(), instance);
    }

    protected BTCollisionWorldContactResultCallbackAddSingleResult() {
        super(SIGNATURE);
    }

    BTCollisionWorldContactResultCallbackAddSingleResult(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTCollisionWorldContactResultCallbackAddSingleResult {

        private final BTCollisionWorldContactResultCallbackAddSingleResultI delegate;

        Container(long functionPointer, BTCollisionWorldContactResultCallbackAddSingleResultI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public float invoke(long cp, long colObj0Wrap, int partId0, int index0, long colObj1Wrap, int partId1, int index1) {
            return delegate.invoke(cp, colObj0Wrap, partId0, index0, colObj1Wrap, partId1, index1);
        }

    }

}