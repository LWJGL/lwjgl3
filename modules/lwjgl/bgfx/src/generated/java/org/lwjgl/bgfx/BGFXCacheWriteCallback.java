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
 * Writes cached item.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     bgfx_callback_interface_t *_this,
 *     uint64_t _id,
 *     void const *_data,
 *     uint32_t _size
 * )</code></pre>
 */
public abstract class BGFXCacheWriteCallback extends Callback implements BGFXCacheWriteCallbackI {

    /**
     * Creates a {@code BGFXCacheWriteCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXCacheWriteCallback}
     */
    public static BGFXCacheWriteCallback create(long functionPointer) {
        BGFXCacheWriteCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BGFXCacheWriteCallback
            ? (BGFXCacheWriteCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BGFXCacheWriteCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BGFXCacheWriteCallback} instance that delegates to the specified {@code BGFXCacheWriteCallbackI} instance. */
    public static BGFXCacheWriteCallback create(BGFXCacheWriteCallbackI instance) {
        return instance instanceof BGFXCacheWriteCallback
            ? (BGFXCacheWriteCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXCacheWriteCallback() {
        super(CIF);
    }

    BGFXCacheWriteCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXCacheWriteCallback {

        private final BGFXCacheWriteCallbackI delegate;

        Container(long functionPointer, BGFXCacheWriteCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long _this, long _id, long _data, int _size) {
            delegate.invoke(_this, _id, _data, _size);
        }

    }

}