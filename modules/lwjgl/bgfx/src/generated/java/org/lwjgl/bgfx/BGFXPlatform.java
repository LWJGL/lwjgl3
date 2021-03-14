/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import javax.annotation.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.JNI.*;

/** Native bindings to the C platform API of the <a target="_blank" href="https://github.com/bkaradzic/bgfx">bgfx</a> library. */
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

    /**
     * Render frame. ({@code bgfx_renderer_frame_t})
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #BGFX_RENDER_FRAME_NO_CONTEXT RENDER_FRAME_NO_CONTEXT}</li>
     * <li>{@link #BGFX_RENDER_FRAME_RENDER RENDER_FRAME_RENDER}</li>
     * <li>{@link #BGFX_RENDER_FRAME_TIMEOUT RENDER_FRAME_TIMEOUT}</li>
     * <li>{@link #BGFX_RENDER_FRAME_EXITING RENDER_FRAME_EXITING}</li>
     * <li>{@link #BGFX_RENDER_FRAME_COUNT RENDER_FRAME_COUNT}</li>
     * </ul>
     */
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

    /**
     * Render frame.
     * 
     * <p>{@code bgfx_render_frame} is blocking call. It waits for {@link BGFX#bgfx_frame frame} to be called from API thread to process frame. If timeout value is passed call will
     * timeout and return even if {@code bgfx_frame} is not called.</p>
     * 
     * <p>This call should be only used on platforms that don't allow creating separate rendering thread. If it is called before to {@link BGFX#bgfx_init init}, render thread won't
     * be created by {@link BGFX#bgfx_init init} call.</p>
     *
     * @param _msecs timeout in milliseconds
     *
     * @return current renderer state. One of: {@link #BGFX_RENDER_FRAME_NO_CONTEXT RENDER_FRAME_NO_CONTEXT} {@link #BGFX_RENDER_FRAME_RENDER RENDER_FRAME_RENDER} {@link #BGFX_RENDER_FRAME_TIMEOUT RENDER_FRAME_TIMEOUT} {@link #BGFX_RENDER_FRAME_EXITING RENDER_FRAME_EXITING} {@link #BGFX_RENDER_FRAME_COUNT RENDER_FRAME_COUNT}
     */
    @NativeType("bgfx_renderer_frame_t")
    public static int bgfx_render_frame(@NativeType("int32_t") int _msecs) {
        long __functionAddress = Functions.render_frame;
        return invokeI(_msecs, __functionAddress);
    }

    // --- [ bgfx_set_platform_data ] ---

    /** Unsafe version of: {@link #bgfx_set_platform_data set_platform_data} */
    public static void nbgfx_set_platform_data(long _data) {
        long __functionAddress = Functions.set_platform_data;
        invokePV(_data, __functionAddress);
    }

    /**
     * Sets platform data.
     * 
     * <p>Must be called before {@link BGFX#bgfx_init init}.</p>
     *
     * @param _data the platform data to set
     */
    public static void bgfx_set_platform_data(@NativeType("bgfx_platform_data_t const *") BGFXPlatformData _data) {
        nbgfx_set_platform_data(_data.address());
    }

    // --- [ bgfx_get_internal_data ] ---

    /** Unsafe version of: {@link #bgfx_get_internal_data get_internal_data} */
    public static long nbgfx_get_internal_data() {
        long __functionAddress = Functions.get_internal_data;
        return invokeP(__functionAddress);
    }

    /** Gets internal data for interop. */
    @Nullable
    @NativeType("bgfx_internal_data_t const *")
    public static BGFXInternalData bgfx_get_internal_data() {
        long __result = nbgfx_get_internal_data();
        return BGFXInternalData.createSafe(__result);
    }

    // --- [ bgfx_override_internal_texture_ptr ] ---

    /**
     * Overrides internal texture with externally created texture. Previously created internal texture will released.
     * 
     * <p>It's expected you understand some bgfx internals before you use this call.</p>
     * 
     * <p>Must be called only on render thread.</p>
     *
     * @param _handle texture handle
     * @param _ptr    native API pointer to texture
     *
     * @return native API pointer to texture. If result is 0, texture is not created yet from the main thread.
     */
    @NativeType("uintptr_t")
    public static long bgfx_override_internal_texture_ptr(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uintptr_t") long _ptr) {
        long __functionAddress = Functions.override_internal_texture_ptr;
        return invokePP(_handle, _ptr, __functionAddress);
    }

    // --- [ bgfx_override_internal_texture ] ---

    /** Unsafe version of: {@link #bgfx_override_internal_texture override_internal_texture} */
    public static long nbgfx_override_internal_texture(short _handle, short _width, short _height, byte _numMips, int _format, long _flags) {
        long __functionAddress = Functions.override_internal_texture;
        return invokeJP(_handle, _width, _height, _numMips, _format, _flags, __functionAddress);
    }

    /**
     * Overrides internal texture by creating new texture. Previously created internal texture will released.
     * 
     * <p>It's expected you understand some bgfx internals before you use this call.</p>
     * 
     * <p>Must be called only on render thread.</p>
     *
     * @param _handle  texture handle
     * @param _width   width
     * @param _height  height
     * @param _numMips number of mip-maps
     * @param _format  texture format
     * @param _flags   default texture sampling mode is linear, and wrap mode is repeat
     *
     * @return native API pointer to texture. If result is 0, texture is not created yet from the main thread.
     */
    @NativeType("uintptr_t")
    public static long bgfx_override_internal_texture(@NativeType("bgfx_texture_handle_t") short _handle, @NativeType("uint16_t") int _width, @NativeType("uint16_t") int _height, @NativeType("uint8_t") int _numMips, @NativeType("bgfx_texture_format_t") int _format, @NativeType("uint64_t") long _flags) {
        return nbgfx_override_internal_texture(_handle, (short)_width, (short)_height, (byte)_numMips, _format, _flags);
    }

}