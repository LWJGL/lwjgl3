/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

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
@FunctionalInterface
@NativeType("void (*) (bgfx_callback_interface_t *, void const *, uint32_t)")
public interface BGFXCaptureFrameCallbackI extends CallbackI.V {

    String SIGNATURE = "(ppi)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgPointer(args),
            dcbArgInt(args)
        );
    }

    /**
     * Will be called when a frame is captured.
     *
     * @param _this the callback interface
     * @param _data image data
     * @param _size image size
     */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("void const *") long _data, @NativeType("uint32_t") int _size);

}