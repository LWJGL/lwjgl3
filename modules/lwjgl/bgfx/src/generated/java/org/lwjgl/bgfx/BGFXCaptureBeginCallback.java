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
 * Called when video capture begins.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     bgfx_callback_interface_t *_this,
 *     uint32_t _width,
 *     uint32_t _height,
 *     uint32_t _pitch,
 *     bgfx_texture_format_t _format,
 *     bool _yflip
 * )</code></pre>
 */
public abstract class BGFXCaptureBeginCallback extends Callback implements BGFXCaptureBeginCallbackI {

    /**
     * Creates a {@code BGFXCaptureBeginCallback} instance from the specified function pointer.
     *
     * @return the new {@code BGFXCaptureBeginCallback}
     */
    public static BGFXCaptureBeginCallback create(long functionPointer) {
        BGFXCaptureBeginCallbackI instance = Callback.get(functionPointer);
        return instance instanceof BGFXCaptureBeginCallback
            ? (BGFXCaptureBeginCallback)instance
            : new Container(functionPointer, instance);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code functionPointer} is {@code NULL}. */
    @Nullable
    public static BGFXCaptureBeginCallback createSafe(long functionPointer) {
        return functionPointer == NULL ? null : create(functionPointer);
    }

    /** Creates a {@code BGFXCaptureBeginCallback} instance that delegates to the specified {@code BGFXCaptureBeginCallbackI} instance. */
    public static BGFXCaptureBeginCallback create(BGFXCaptureBeginCallbackI instance) {
        return instance instanceof BGFXCaptureBeginCallback
            ? (BGFXCaptureBeginCallback)instance
            : new Container(instance.address(), instance);
    }

    protected BGFXCaptureBeginCallback() {
        super(CIF);
    }

    BGFXCaptureBeginCallback(long functionPointer) {
        super(functionPointer);
    }

    private static final class Container extends BGFXCaptureBeginCallback {

        private final BGFXCaptureBeginCallbackI delegate;

        Container(long functionPointer, BGFXCaptureBeginCallbackI delegate) {
            super(functionPointer);
            this.delegate = delegate;
        }

        @Override
        public void invoke(long _this, int _width, int _height, int _pitch, int _format, boolean _yflip) {
            delegate.invoke(_this, _width, _height, _pitch, _format, _yflip);
        }

    }

}