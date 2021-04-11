/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vpx;

import org.lwjgl.system.*;

public class VPXCodec {

    static { Library.loadSystem(System::load, System::loadLibrary, VPXCodec.class, "org.lwjgl.vpx", Platform.mapLibraryNameBundled("lwjgl_vpx")); }

    protected VPXCodec() {
        throw new UnsupportedOperationException();
    }

    // --- [ vpx_codec_destroy ] ---

    /** Unsafe version of: {@link #vpx_codec_destroy} */
    public static native int nvpx_codec_destroy(long ctx);

    /**
     * Destroy a codec instance
 *
 * Destroys a codec context, freeing any associated memory buffers.
 *
     *
     * @param ctx Pointer to this instance's context
     *
     * @return VPX_CODEC_OK
     *         The codec algorithm initialized.
VPX_CODEC_MEM_ERROR
     *         Memory allocation failed.
     */
    @NativeType("vpx_codec_err_t")
    public static int vpx_codec_destroy(@NativeType("vpx_codec_ctx_t *") vpx_codec_ctx_t ctx) {
        return nvpx_codec_destroy(ctx.address());
    }

    // --- [ vpx_codec_control_ ] ---

    /** Unsafe version of: {@link #vpx_codec_control_} */
    public static native int nvpx_codec_control_(long ctx, int ctrl_id, int data);

    /**
     * Control algorithm
 *
 * This function is used to exchange algorithm specific data with the codec
 * instance. This can be used to implement features specific to a particular
 * algorithm.
 *
 * This wrapper function dispatches the request to the helper function
 * associated with the given ctrl_id. It tries to call this function
 * transparently, but will return VPX_CODEC_ERROR if the request could not
 * be dispatched.
 *
 * Note that this function should not be used directly. Call the
 * vpx_codec_control wrapper macro instead.
 *
     *
     * @param ctx     Pointer to this instance's context
     * @param ctrl_id Algorithm specific control identifier
     * @param data    data
     *
     * @return VPX_CODEC_OK
     *         The control request was processed.
VPX_CODEC_ERROR
     *         The control request was not processed.
VPX_CODEC_INVALID_PARAM
     *         The data was not valid.
     */
    @NativeType("vpx_codec_err_t")
    public static int vpx_codec_control_(@NativeType("vpx_codec_ctx_t *") vpx_codec_ctx_t ctx, int ctrl_id, int data) {
        return nvpx_codec_control_(ctx.address(), ctrl_id, data);
    }

}