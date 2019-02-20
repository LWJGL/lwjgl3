/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@code endMarker} field of the {@link YGMarkerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     YGMarker marker,
 *     YGNodeRef node,
 *     void *data,
 *     void *id
 * )</code></pre>
 */
public abstract class EndMarkerCallback extends Callback implements EndMarkerCallbackI {

    /**
     * Creates a {@code EndMarkerCallback} instance from the specified function pointer.
     *
     * @return the new {@code EndMarkerCallback}
     */
    public static EndMarkerCallback create(long functionPointer) {
        EndMarkerCallbackI instance = Callback.get(functionPointer);
        return instance instanceof EndMarkerCallback
            ? (EndMarkerCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static EndMarkerCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code EndMarkerCallback} instance that delegates to the specified {@code EndMarkerCallbackI} instance. */
    public static EndMarkerCallback create(EndMarkerCallbackI instance) {
        return instance instanceof EndMarkerCallback
            ? (EndMarkerCallback)instance
            : new Container(instance.address(), instance);
    }

    protected EndMarkerCallback() {
        super(SIGNATURE);
    }

    EndMarkerCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends EndMarkerCallback {

        private final EndMarkerCallbackI delegate;

        Container(long functionPointer, EndMarkerCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(int marker, long node, long data, long id) {
            delegate.invoke(marker, node, data, id);
        }

    }

}