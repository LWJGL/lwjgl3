/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.lwjgl.system.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

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
public interface BGFXCaptureFrameCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE))
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