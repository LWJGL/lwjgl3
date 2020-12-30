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
public abstract class BTTriangleCallbackProcessTriangle extends Callback implements BTTriangleCallbackProcessTriangleI {

    /**
     * Creates a {@code BTTriangleCallbackProcessTriangle} instance from the specified function pointer.
     *
     * @return the new {@code BTTriangleCallbackProcessTriangle}
     */
    public static BTTriangleCallbackProcessTriangle create(long functionPointer) {
        BTTriangleCallbackProcessTriangleI instance = Callback.get(functionPointer);
        return instance instanceof BTTriangleCallbackProcessTriangle
            ? (BTTriangleCallbackProcessTriangle)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BTTriangleCallbackProcessTriangle createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BTTriangleCallbackProcessTriangle} instance that delegates to the specified {@code BTTriangleCallbackProcessTriangleI} instance. */
    public static BTTriangleCallbackProcessTriangle create(BTTriangleCallbackProcessTriangleI instance) {
        return instance instanceof BTTriangleCallbackProcessTriangle
            ? (BTTriangleCallbackProcessTriangle)instance
            : new Container(instance.address(), instance);
    }

    protected BTTriangleCallbackProcessTriangle() {
        super(SIGNATURE);
    }

    BTTriangleCallbackProcessTriangle(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BTTriangleCallbackProcessTriangle {

        private final BTTriangleCallbackProcessTriangleI delegate;

        Container(long functionPointer, BTTriangleCallbackProcessTriangleI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long triangle, int partId, int triangleIndex) {
            delegate.invoke(triangle, partId, triangleIndex);
        }

    }

}