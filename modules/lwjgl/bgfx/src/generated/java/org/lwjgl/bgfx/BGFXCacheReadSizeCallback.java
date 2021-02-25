/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Returns the size of a cached item. Returns 0 if no cached item was found.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * uint32_t (*) (
 *     bgfx_callback_interface_t *_this,
 *     uint64_t _id
 * )</code></pre>
 */
public abstract class BGFXCacheReadSizeCallback extends Callback implements BGFXCacheReadSizeCallbackI {

    /**
     * Creates a {@code BGFXCacheReadSizeCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXCacheReadSizeCallback}
     */
    public static BGFXCacheReadSizeCallback create(long functionPointer) {
        BGFXCacheReadSizeCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BGFXCacheReadSizeCallback
            ? (BGFXCacheReadSizeCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BGFXCacheReadSizeCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BGFXCacheReadSizeCallback} instance that delegates to the specified {@code BGFXCacheReadSizeCallbackI} instance. */
    public static BGFXCacheReadSizeCallback create(BGFXCacheReadSizeCallbackI instance) {
        return instance instanceof BGFXCacheReadSizeCallback
            ? (BGFXCacheReadSizeCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXCacheReadSizeCallback() {
        super(CIF);
    }

    BGFXCacheReadSizeCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXCacheReadSizeCallback {

        private final BGFXCacheReadSizeCallbackI delegate;

        Container(long functionPointer, BGFXCacheReadSizeCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public int invoke(long _this, long _id) {
            return delegate.invoke(_this, _id);
        }

    }

}