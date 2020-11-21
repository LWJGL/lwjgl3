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
 * void (*) (
 *     btVector3 *triangle,
 *     int partId,
 *     int triangleIndex
 * )</code></pre>
 */
public abstract class BTInternalTriangleIndexCallbackInternalProcessTriangleIndex extends Callback implements BTInternalTriangleIndexCallbackInternalProcessTriangleIndexI {

    /**
     * Creates a {@code BTInternalTriangleIndexCallbackInternalProcessTriangleIndex} instance from the specified function pointer.
     *
     * @return the new {@code BTInternalTriangleIndexCallbackInternalProcessTriangleIndex}
     */
    public static BTInternalTriangleIndexCallbackInternalProcessTriangleIndex create(long functionPointer) {
        BTInternalTriangleIndexCallbackInternalProcessTriangleIndexI instance = Callback.get(functionPointer);
        return instance instanceof BTInternalTriangleIndexCallbackInternalProcessTriangleIndex
            ? (BTInternalTriangleIndexCallbackInternalProcessTriangleIndex)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTInternalTriangleIndexCallbackInternalProcessTriangleIndex createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTInternalTriangleIndexCallbackInternalProcessTriangleIndex} instance that delegates to the specified {@code BTInternalTriangleIndexCallbackInternalProcessTriangleIndexI} instance. */
    public static BTInternalTriangleIndexCallbackInternalProcessTriangleIndex create(BTInternalTriangleIndexCallbackInternalProcessTriangleIndexI instance) {
        return instance instanceof BTInternalTriangleIndexCallbackInternalProcessTriangleIndex
            ? (BTInternalTriangleIndexCallbackInternalProcessTriangleIndex)instance
            : new Container(instance.address(), instance);
    }

    protected BTInternalTriangleIndexCallbackInternalProcessTriangleIndex() {
        super(SIGNATURE);
    }

    BTInternalTriangleIndexCallbackInternalProcessTriangleIndex(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTInternalTriangleIndexCallbackInternalProcessTriangleIndex {

        private final BTInternalTriangleIndexCallbackInternalProcessTriangleIndexI delegate;

        Container(long functionPointer, BTInternalTriangleIndexCallbackInternalProcessTriangleIndexI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long triangle, int partId, int triangleIndex) {
            delegate.invoke(triangle, partId, triangleIndex);
        }

    }

}