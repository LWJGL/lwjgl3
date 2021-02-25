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
 * Allocates memory.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void * (*) (
 *     bgfx_allocator_interface_t *_this,
 *     void *_ptr,
 *     size_t _size,
 *     size_t _align,
 *     char *_file,
 *     uint32_t _line
 * )</code></pre>
 */
public abstract class BGFXReallocCallback extends Callback implements BGFXReallocCallbackI {

    /**
     * Creates a {@code BGFXReallocCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXReallocCallback}
     */
    public static BGFXReallocCallback create(long functionPointer) {
        BGFXReallocCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BGFXReallocCallback
            ? (BGFXReallocCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BGFXReallocCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BGFXReallocCallback} instance that delegates to the specified {@code BGFXReallocCallbackI} instance. */
    public static BGFXReallocCallback create(BGFXReallocCallbackI instance) {
        return instance instanceof BGFXReallocCallback
            ? (BGFXReallocCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXReallocCallback() {
        super(CIF);
    }

    BGFXReallocCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXReallocCallback {

        private final BGFXReallocCallbackI delegate;

        Container(long functionPointer, BGFXReallocCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public long invoke(long _this, long _ptr, long _size, long _align, long _file, int _line) {
            return delegate.invoke(_this, _ptr, _size, _align, _file, _line);
        }

    }

}