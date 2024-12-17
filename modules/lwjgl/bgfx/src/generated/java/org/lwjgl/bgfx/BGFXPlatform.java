/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import org.jspecify.annotations.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

public class BGFXPlatform {

    /** Contains the function pointers loaded from {@code BGFX.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            render_frame                  = apiGetFunctionAddress(BGFX.getLibrary(), "bgfx_render_frame"),
            set_platform_data             = apiGetFunctionAddress(BGFX.getLibrary(), "bgfx_set_platform_data"),
            get_internal_data             = apiGetFunctionAddress(BGFX.getLibrary(), "bgfx_get_internal_data"),
            override_internal_texture_ptr = apiGetFunctionAddress(BGFX.getLibrary(), "bgfx_override_internal_texture_ptr"),
            override_internal_texture     = apiGetFunctionAddress(BGFX.getLibrary(), "bgfx_override_internal_texture");

    }

    public static final int
        BGFX_RENDER_FRAME_NO_CONTEXT = 0,
        BGFX_RENDER_FRAME_RENDER     = 1,
        BGFX_RENDER_FRAME_TIMEOUT    = 2,
        BGFX_RENDER_FRAME_EXITING    = 3,
        BGFX_RENDER_FRAME_COUNT      = 4;

    protected BGFXPlatform() {
        throw new UnsupportedOperationException();
    }

    // --- [ bgfx_render_frame ] ---

    /** {@code bgfx_render_frame_t bgfx_render_frame(int32_t _msecs)} */
    @NativeType("bgfx_render_frame_t")
    public static int bgfx_render_frame(@NativeType("int32_t") int _msecs) {
        long __functionAddress = Functions.render_frame;
        return invokeI(_msecs, __functionAddress);
    }

    // --- [ bgfx_set_platform_data ] ---

    /** {@code void bgfx_set_platform_data(bgfx_platform_data_t const * _data)} */
    public static void nbgfx_set_platform_data(long _data) {
        long __functionAddress = Functions.set_platform_data;
        invokePV(_data, __functionAddress);
    }

    /** {@code void bgfx_set_platform_data(bgfx_platform_data_t const * _data)} */
    public static void bgfx_set_platform_data(@NativeType("bgfx_platform_data_t const *") BGFXPlatformData _data) {
        nbgfx_set_platform_data(_data.address());
    }

    // --- [ bgfx_get_internal_data ] ---

    /** {@code bgfx_internal_data_t const * bgfx_get_internal_data(void)} */
    public static long nbgfx_get_internal_data() {
        long __functionAddress = Functions.get_internal_data;
        return invokeP(__functionAddress);
    }

    /** {@code bgfx_internal_data_t const * bgfx_get_internal_data(void)} */
    @NativeType("bgfx_internal_data_t const *")
    public static @Nullable BGFXInternalData bgfx_get_internal_data() {
        long __result = nbgfx_get_internal_data();
        return BGFXInternalData.createSafe(__result);
    }

    // --- [ bgfx_override_internal_texture_ptr ] ---

    /** {@code uintptr_t bgfx_override_internal_texture_ptr(bgfx_texture_handle_t _handle, uintptr_t _ptr)} */
    @NativeType("uintptr_t")
    public static long bgfx_override_internal_texture_ptr(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uintptr_t") long _ptr) {
        long __functionAddress = Functions.override_internal_texture_ptr;
        return invokeCPP(_handle, _ptr, __functionAddress);
    }

    // --- [ bgfx_override_internal_texture ] ---

    /** {@code uintptr_t bgfx_override_internal_texture(bgfx_texture_handle_t _handle, uint16_t _width, uint16_t _height, uint8_t _numMips, bgfx_texture_format_t _format, uint64_t _flags)} */
    public static long nbgfx_override_internal_texture(short _handle, short _width, short _height, byte _numMips, int _format, long _flags) {
        long __functionAddress = Functions.override_internal_texture;
        return invokeCCCUJP(_handle, _width, _height, _numMips, _format, _flags, __functionAddress);
    }

    /** {@code uintptr_t bgfx_override_internal_texture(bgfx_texture_handle_t _handle, uint16_t _width, uint16_t _height, uint8_t _numMips, bgfx_texture_format_t _format, uint64_t _flags)} */
    @NativeType("uintptr_t")
    public static long bgfx_override_internal_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint8_t") int _numMips, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint64_t") long _flags) {
        return nbgfx_override_internal_texture(_handle, (short)_width, (short)_height, (byte)_numMips, _format, _flags);
    }

}