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
 * Instances of this class may be set to the {@code startMarker} field of the {@link YGMarkerCallbacks} struct.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     YGMarker marker,
 *     YGNodeRef node,
 *     void *data
 * )</code></pre>
 */
public abstract class StartMarkerCallback extends Callback implements StartMarkerCallbackI {

    /**
     * Creates a {@code StartMarkerCallback} instance from the specified function pointer.
     *
     * @return the new {@code StartMarkerCallback}
     */
    public static StartMarkerCallback create(long functionPointer) {
        StartMarkerCallbackI instance = Callback.get(functionPointer);
        return instance instanceof StartMarkerCallback
            ? (StartMarkerCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static StartMarkerCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code StartMarkerCallback} instance that delegates to the specified {@code StartMarkerCallbackI} instance. */
    public static StartMarkerCallback create(StartMarkerCallbackI instance) {
        return instance instanceof StartMarkerCallback
            ? (StartMarkerCallback)instance
            : new Container(instance.address(), instance);
    }

    protected StartMarkerCallback() {
        super(SIGNATURE);
    }

    StartMarkerCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends StartMarkerCallback {

        private final StartMarkerCallbackI delegate;

        Container(long functionPointer, StartMarkerCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(int marker, long node, long data) {
            return delegate.invoke(marker, node, data);
        }

    }

}