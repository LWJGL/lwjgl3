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
 * Screenshot captured. Screenshot format is always 4-byte BGRA.
 * 
 * <h3>Type</h3>
 * 
 * <pre><code>
 * void (*) (
 *     bgfx_callback_interface_t *_this,
 *     char const *_filePath,
 *     uint32_t _width,
 *     uint32_t _height,
 *     uint32_t _pitch,
 *     void const *_data,
 *     uint32_t _size,
 *     bool _yflip
 * )</code></pre>
 */
@FunctionalInterface
@NativeType("void (*) (bgfx_callback_interface_t *, char const *, uint32_t, uint32_t, uint32_t, void const *, uint32_t, bool)")
public interface BGFXScreenShotCallbackI extends CallbackI {

    FFICIF CIF = apiCreateCIF(
        FFI_DEFAULT_ABI,
        ffi_type_void,
        ffi_type_pointer, ffi_type_pointer, ffi_type_uint32, ffi_type_uint32, ffi_type_uint32, ffi_type_pointer, ffi_type_uint32, ffi_type_uint8
    );

    @Override
    default FFICIF getCallInterface() { return CIF; }

    @Override
    default void callback(long ret, long args) {
        invoke(
            memGetAddress(memGetAddress(args)),
            memGetAddress(memGetAddress(args + POINTER_SIZE)),
            memGetInt(memGetAddress(args + 2 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 3 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 4 * POINTER_SIZE)),
            memGetAddress(memGetAddress(args + 5 * POINTER_SIZE)),
            memGetInt(memGetAddress(args + 6 * POINTER_SIZE)),
            memGetByte(memGetAddress(args + 7 * POINTER_SIZE)) != 0
        );
    }

    /**
     * @param _this     the callback interface
     * @param _filePath file path
     * @param _width    image width
     * @param _height   image height
     * @param _pitch    number of bytes to skip between the start of each horizontal line of the image
     * @param _data     image data
     * @param _size     image size
     * @param _yflip    if true, image origin is bottom left
     */
    void invoke(@NativeType("bgfx_callback_interface_t *") long _this, @NativeType("char const *") long _filePath, @NativeType("uint32_t") int _width, @NativeType("uint32_t") int _height, @NativeType("uint32_t") int _pitch, @NativeType("void const *") long _data, @NativeType("uint32_t") int _size, @NativeType("bool") boolean _yflip);

}