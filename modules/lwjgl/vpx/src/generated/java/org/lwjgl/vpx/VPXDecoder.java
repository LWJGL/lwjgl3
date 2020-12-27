/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vpx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

public class VPXDecoder {

    static { Library.loadSystem(System::load, System::loadLibrary, VPXDecoder.class, "org.lwjgl.vpx", Platform.mapLibraryNameBundled("lwjgl_vpx")); }

    protected VPXDecoder() {
        throw new UnsupportedOperationException();
    }

    // --- [ vpx_codec_dec_init_ver ] ---

    /** Unsafe version of: {@link #vpx_codec_dec_init_ver} */
    public static native int nvpx_codec_dec_init_ver(long ctx, long iface, long cfg, long flags, int ver);

    /**
     * Initialize a decoder instance
 *
 * Initializes a decoder context using the given interface. Applications
 * should call the vpx_codec_dec_init convenience macro instead of this
 * function directly, to ensure that the ABI version number parameter
 * is properly initialized.
 *
 * If the library was configured with --disable-multithread, this call
 * is not thread safe and should be guarded with a lock if being used
 * in a multithreaded context.
     *
     * @param ctx   Pointer to this instance's context.
     * @param iface Pointer to the algorithm interface to use.
     * @param cfg   Configuration to use, if known. May be NULL.
     * @param flags Bitfield of VPX_CODEC_USE_* flags (type vpx_codec_flags_t)
     * @param ver   ABI version number. Must be set to VPX_DECODER_ABI_VERSION
     *
     * @return VPX_CODEC_OK
     *         The decoder algorithm initialized.
VPX_CODEC_MEM_ERROR
     *         Memory allocation failed.
     */
    @NativeType("vpx_codec_err_t")
    public static int vpx_codec_dec_init_ver(@NativeType("vpx_codec_ctx_t *") vpx_codec_ctx_t ctx, @NativeType("vpx_codec_iface_t *") long iface, @Nullable @NativeType("vpx_codec_dec_cfg_t const *") vpx_codec_dec_cfg_t cfg, long flags, int ver) {
        if (CHECKS) {
            check(iface);
        }
        return nvpx_codec_dec_init_ver(ctx.address(), iface, memAddressSafe(cfg), flags, ver);
    }

    // --- [ vpx_codec_decode ] ---

    /**
     * Unsafe version of: {@link #vpx_codec_decode}
     *
     * @param data_sz Size of the coded data, in bytes.
     */
    public static native int nvpx_codec_decode(long ctx, long data, int data_sz, long user_priv, long deadline);

    /**
     * Decode data
 *
 * Processes a buffer of coded data. If the processing results in a new
 * decoded frame becoming available, put_slice and put_frame callbacks may be
 * invoked, as appropriate. Encoded data \ref MUST be passed in DTS (decode
 * time stamp) order. Frames produced will always be in PTS (presentation
 * time stamp) order.
 * If the decoder is configured with VPX_CODEC_USE_INPUT_FRAGMENTS enabled,
 * data and data_sz can contain a fragment of the encoded frame. Fragment
 * n must contain at least partition n, but can also contain subsequent
 * partitions (n+1 - n+i), and if so, fragments n+1, .., n+i must
 * be empty. When no more data is available, this function should be called
 * with NULL as data and 0 as data_sz. The memory passed to this function
 * must be available until the frame has been decoded.
     *
     * @param ctx       Pointer to this instance's context.
     * @param data      Pointer to this block of new coded data. If
 *                         NULL, the put_frame callback is invoked for
 *                         the previously decoded frame.
     * @param user_priv Application specific data to associate with this frame.
     * @param deadline  Soft deadline the decoder should attempt to meet, in us. Set to zero for unlimited.
     *
     * @return Returns VPX_CODEC_OK if the coded data was processed completely
*         and future pictures can be decoded without error. Otherwise,
*         see the descriptions of the other error codes in ::vpx_codec_err_t
*         for recoverability capabilities.
     */
    @NativeType("vpx_codec_err_t")
    public static int vpx_codec_decode(@NativeType("vpx_codec_ctx_t *") vpx_codec_ctx_t ctx, @NativeType("uint8_t const *") ByteBuffer data, @NativeType("void *") ByteBuffer user_priv, long deadline) {
        return nvpx_codec_decode(ctx.address(), memAddress(data), data.remaining(), memAddress(user_priv), deadline);
    }

    // --- [ vpx_codec_get_frame ] ---

    /** Unsafe version of: {@link #vpx_codec_get_frame} */
    public static native long nvpx_codec_get_frame(long ctx, long iter);

    /**
     * Decoded frames iterator
 *
 * Iterates over a list of the frames available for display. The iterator
 * storage should be initialized to NULL to start the iteration. Iteration is
 * complete when this function returns NULL.
 *
 * The list of available frames becomes valid upon completion of the
 * vpx_codec_decode call, and remains valid until the next call to
 * vpx_codec_decode.
     *
     * @param ctx  Pointer to this instance's context
     * @param iter Iterator storage, initialized to NULL
     *
     * @return Returns a pointer to an image, if one is ready for display. Frames
 *         produced will always be in PTS (presentation time stamp) order.
     */
    @Nullable
    @NativeType("vpx_image_t *")
    public static vpx_image_t vpx_codec_get_frame(@NativeType("vpx_codec_ctx_t *") vpx_codec_ctx_t ctx, @Nullable @NativeType("void *") ByteBuffer iter) {
        long __result = nvpx_codec_get_frame(ctx.address(), memAddressSafe(iter));
        return vpx_image_t.createSafe(__result);
    }

}