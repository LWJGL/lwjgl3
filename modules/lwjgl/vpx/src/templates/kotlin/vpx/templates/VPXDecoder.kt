/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vpx.templates

import vpx.*
import org.lwjgl.generator.*

val VPXDecoder = "VPXDecoder".nativeClass(Module.VPX, prefixConstant = "", prefixMethod = "") {
    nativeDirective("""
#include "vpx_decoder.h"
#include "vpx_image.h"
#include "vpx_codec.h"
#include "vp8dx.h"
""")
	
    vpx_codec_iface_t.p(
        "vpx_codec_vp8_dx",
		"Get the vp8 decoder algorithm interface",
		
		void()
	)
    vpx_codec_iface_t.p(
        "vpx_codec_vp9_dx",
		"Get the vp9 decoder algorithm interface",
		
		void()
	)
	
    vpx_codec_err_t(
        "vpx_codec_dec_init_ver",
        """
		Initialize a decoder instance
 *
 * Initializes a decoder context using the given interface. Applications
 * should call the vpx_codec_dec_init convenience macro instead of this
 * function directly, to ensure that the ABI version number parameter
 * is properly initialized.
 *
 * If the library was configured with --disable-multithread, this call
 * is not thread safe and should be guarded with a lock if being used
 * in a multithreaded context.
		""",

        vpx_codec_ctx_t.p("ctx", "Pointer to this instance's context."),
        vpx_codec_iface_t.p("iface", "Pointer to the algorithm interface to use."),
        nullable..vpx_codec_dec_cfg_t.const.p("cfg", "Configuration to use, if known. May be NULL."),
        long("flags", "Bitfield of VPX_CODEC_USE_* flags (type vpx_codec_flags_t)"),
        int("ver", "ABI version number. Must be set to VPX_DECODER_ABI_VERSION"),

        returnDoc = """
VPX_CODEC_OK
    The decoder algorithm initialized.
VPX_CODEC_MEM_ERROR
    Memory allocation failed.
		"""
    )
//vpx_codec_err_t vpx_codec_dec_init_ver(vpx_codec_ctx_t *ctx,
//                                       vpx_codec_iface_t *iface,
//                                       const vpx_codec_dec_cfg_t *cfg,
//                                       vpx_codec_flags_t flags, int ver);

    vpx_codec_err_t(
        "vpx_codec_decode",
        """
		Decode data
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
		""",

        vpx_codec_ctx_t.p("ctx", "Pointer to this instance's context."),
        uint8_t.const.p("data", """
		Pointer to this block of new coded data. If
 *                         NULL, the put_frame callback is invoked for
 *                         the previously decoded frame."""),
        AutoSize("data")..unsigned_int("data_sz", "Size of the coded data, in bytes."),
        Unsafe..void.p("user_priv", "Application specific data to associate with this frame."),
        long("deadline", "Soft deadline the decoder should attempt to meet, in us. Set to zero for unlimited."),

        returnDoc = """
		Returns VPX_CODEC_OK if the coded data was processed completely
*         and future pictures can be decoded without error. Otherwise,
*         see the descriptions of the other error codes in ::vpx_codec_err_t
*         for recoverability capabilities.
		"""
    )
//vpx_codec_err_t vpx_codec_decode(vpx_codec_ctx_t *ctx, const uint8_t *data,
//                                 unsigned int data_sz, void *user_priv,
//                                 long deadline);



    vpx_image_t.p(
        "vpx_codec_get_frame",
        """
		Decoded frames iterator
 *
 * Iterates over a list of the frames available for display. The iterator
 * storage should be initialized to NULL to start the iteration. Iteration is
 * complete when this function returns NULL.
 *
 * The list of available frames becomes valid upon completion of the
 * vpx_codec_decode call, and remains valid until the next call to
 * vpx_codec_decode.
		""",

        vpx_codec_ctx_t.p("ctx", "Pointer to this instance's context"),
        Unsafe..nullable..void.p("iter", "Iterator storage, initialized to NULL"),

        returnDoc = """
Returns a pointer to an image, if one is ready for display. Frames
 *         produced will always be in PTS (presentation time stamp) order.
		"""
    )
//vpx_image_t *vpx_codec_get_frame(vpx_codec_ctx_t *ctx, vpx_codec_iter_t *iter);
}