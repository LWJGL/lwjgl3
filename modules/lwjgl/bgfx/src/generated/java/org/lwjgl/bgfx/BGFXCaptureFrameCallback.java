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
 * Captured frame.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     bgfx_callback_interface_t *_this,
 *     void const *_data,
 *     uint32_t _size
 * )</code></pre>
 */
public abstract class BGFXCaptureFrameCallback extends Callback implements BGFXCaptureFrameCallbackI {

    /**
     * Creates a {@code BGFXCaptureFrameCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXCaptureFrameCallback}
     */
    public static BGFXCaptureFrameCallback create(long functionPointer) {
        BGFXCaptureFrameCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BGFXCaptureFrameCallback
            ? (BGFXCaptureFrameCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BGFXCaptureFrameCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BGFXCaptureFrameCallback} instance that delegates to the specified {@code BGFXCaptureFrameCallbackI} instance. */
    public static BGFXCaptureFrameCallback create(BGFXCaptureFrameCallbackI instance) {
        return instance instanceof BGFXCaptureFrameCallback
            ? (BGFXCaptureFrameCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXCaptureFrameCallback() {
        super(CIF);
    }

    BGFXCaptureFrameCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXCaptureFrameCallback {

        private final BGFXCaptureFrameCallbackI delegate;

        Container(long functionPointer, BGFXCaptureFrameCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long _this, long _data, int _size) {
            delegate.invoke(_this, _data, _size);
        }

    }

}