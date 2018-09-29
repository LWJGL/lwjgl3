/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

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
@FunctionalInterface
@NativeType("void (*) (bgfx_callback_interface_t *, uint32_t, uint32_t, uint32_t, bgfx_texture_format_t, bool)")
public interface BGFXCaptureBeginCallbackI extends CallbackI.V {

    String SIGNATURE = "(piiiiB)v";

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default void callback(long args) {
        invoke(
            dcbArgPointer(args),
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgBool(args)
        );
    }

    /**
     * Will be called when video capture begins.
     *
     * @param _this   the callback interface
     * @param _width  image width
     * @param _height image height
     * @param _pitch  number of bytes to skip between the start of each horizontal line of the image
     * @param _format texture format
     * @param _yflip  if true, image origin is bottom left
     */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("uint32_t") int _width, @NativeType("uint32_t") int _height, @NativeType("uint32_t") int _pitch, @NativeType("bgfx_texture_format_t") int _format, @NativeType("bool") boolean _yflip);

}