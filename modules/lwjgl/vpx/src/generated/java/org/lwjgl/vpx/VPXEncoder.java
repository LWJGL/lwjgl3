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

public class VPXEncoder {

    /**
     * vpx_codec_err_t
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VPX_CODEC_OK VPX_CODEC_OK} - Operation completed without error</li>
     * <li>{@link #VPX_CODEC_ERROR VPX_CODEC_ERROR} - Unspecified error</li>
     * <li>{@link #VPX_CODEC_MEM_ERROR VPX_CODEC_MEM_ERROR} - Memory operation failed</li>
     * <li>{@link #VPX_CODEC_ABI_MISMATCH VPX_CODEC_ABI_MISMATCH} - ABI version mismatch</li>
     * <li>{@link #VPX_CODEC_INCAPABLE VPX_CODEC_INCAPABLE} - Algorithm does not have required capability</li>
     * <li>{@link #VPX_CODEC_UNSUP_BITSTREAM VPX_CODEC_UNSUP_BITSTREAM} - 
     * The given bitstream is not supported.
   *
   * The bitstream was unable to be parsed at the highest level. The decoder
   * is unable to proceed. This error \ref SHOULD be treated as fatal to the
   * stream.</li>
     * <li>{@link #VPX_CODEC_UNSUP_FEATURE VPX_CODEC_UNSUP_FEATURE} - 
     * Encoded bitstream uses an unsupported feature
   *
   * The decoder does not implement a feature required by the encoder. This
   * return code should only be used for features that prevent future
   * pictures from being properly decoded. This error \ref MAY be treated as
   * fatal to the stream or \ref MAY be treated as fatal to the current GOP.</li>
     * <li>{@link #VPX_CODEC_CORRUPT_FRAME VPX_CODEC_CORRUPT_FRAME} - 
     * The coded data for this stream is corrupt or incomplete
   *
   * There was a problem decoding the current frame.  This return code
   * should only be used for failures that prevent future pictures from
   * being properly decoded. This error \ref MAY be treated as fatal to the
   * stream or \ref MAY be treated as fatal to the current GOP. If decoding
   * is continued for the current GOP, artifacts may be present.</li>
     * <li>{@link #VPX_CODEC_INVALID_PARAM VPX_CODEC_INVALID_PARAM} - An application-supplied parameter is not valid.</li>
     * <li>{@link #VPX_CODEC_LIST_END VPX_CODEC_LIST_END} - An iterator reached the end of list.</li>
     * </ul>
     */
    public static final int
        VPX_CODEC_OK              = 0,
        VPX_CODEC_ERROR           = 1,
        VPX_CODEC_MEM_ERROR       = 2,
        VPX_CODEC_ABI_MISMATCH    = 3,
        VPX_CODEC_INCAPABLE       = 4,
        VPX_CODEC_UNSUP_BITSTREAM = 5,
        VPX_CODEC_UNSUP_FEATURE   = 6,
        VPX_CODEC_CORRUPT_FRAME   = 7,
        VPX_CODEC_INVALID_PARAM   = 8,
        VPX_CODEC_LIST_END        = 9;

    /** Image is a planar format. */
    public static final int VPX_IMG_FMT_PLANAR = 0x100;

    /** V plane precedes U in memory. */
    public static final int VPX_IMG_FMT_UV_FLIP = 0x200;

    /** Image has an alpha channel. */
    public static final int VPX_IMG_FMT_HAS_ALPHA = 0x400;

    /** Image uses 16bit framebuffer. */
    public static final int VPX_IMG_FMT_HIGHBITDEPTH = 0x800;

    /**
     * vpx_img_fmt_t List of supported image formats
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VPX_IMG_FMT_NONE VPX_IMG_FMT_NONE}</li>
     * <li>{@link #VPX_IMG_FMT_YV12 VPX_IMG_FMT_YV12} - planar YVU</li>
     * <li>{@link #VPX_IMG_FMT_I420 VPX_IMG_FMT_I420}</li>
     * <li>{@link #VPX_IMG_FMT_I422 VPX_IMG_FMT_I422}</li>
     * <li>{@link #VPX_IMG_FMT_I444 VPX_IMG_FMT_I444}</li>
     * <li>{@link #VPX_IMG_FMT_I440 VPX_IMG_FMT_I440}</li>
     * <li>{@link #VPX_IMG_FMT_NV12 VPX_IMG_FMT_NV12}</li>
     * <li>{@link #VPX_IMG_FMT_I42016 VPX_IMG_FMT_I42016}</li>
     * <li>{@link #VPX_IMG_FMT_I42216 VPX_IMG_FMT_I42216}</li>
     * <li>{@link #VPX_IMG_FMT_I44416 VPX_IMG_FMT_I44416}</li>
     * <li>{@link #VPX_IMG_FMT_I44016 VPX_IMG_FMT_I44016}</li>
     * </ul>
     */
    public static final int
        VPX_IMG_FMT_NONE   = 0,
        VPX_IMG_FMT_YV12   = VPX_IMG_FMT_PLANAR | VPX_IMG_FMT_UV_FLIP | 1,
        VPX_IMG_FMT_I420   = VPX_IMG_FMT_PLANAR | 2,
        VPX_IMG_FMT_I422   = VPX_IMG_FMT_PLANAR | 5,
        VPX_IMG_FMT_I444   = VPX_IMG_FMT_PLANAR | 6,
        VPX_IMG_FMT_I440   = VPX_IMG_FMT_PLANAR | 7,
        VPX_IMG_FMT_NV12   = VPX_IMG_FMT_PLANAR | 9,
        VPX_IMG_FMT_I42016 = VPX_IMG_FMT_I420 | VPX_IMG_FMT_HIGHBITDEPTH,
        VPX_IMG_FMT_I42216 = VPX_IMG_FMT_I422 | VPX_IMG_FMT_HIGHBITDEPTH,
        VPX_IMG_FMT_I44416 = VPX_IMG_FMT_I444 | VPX_IMG_FMT_HIGHBITDEPTH,
        VPX_IMG_FMT_I44016 = VPX_IMG_FMT_I440 | VPX_IMG_FMT_HIGHBITDEPTH;

    /**
     * vpx_color_space_t List of supported color spaces
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VPX_CS_UNKNOWN VPX_CS_UNKNOWN} - Unknown</li>
     * <li>{@link #VPX_CS_BT_601 VPX_CS_BT_601} - BT.601</li>
     * <li>{@link #VPX_CS_BT_709 VPX_CS_BT_709} - BT.709</li>
     * <li>{@link #VPX_CS_SMPTE_170 VPX_CS_SMPTE_170} - SMPTE.170</li>
     * <li>{@link #VPX_CS_SMPTE_240 VPX_CS_SMPTE_240} - SMPTE.240</li>
     * <li>{@link #VPX_CS_BT_2020 VPX_CS_BT_2020} - BT.2020</li>
     * <li>{@link #VPX_CS_RESERVED VPX_CS_RESERVED} - Reserved</li>
     * <li>{@link #VPX_CS_SRGB VPX_CS_SRGB} - sRGB</li>
     * </ul>
     */
    public static final int
        VPX_CS_UNKNOWN   = 0x0,
        VPX_CS_BT_601    = 0x1,
        VPX_CS_BT_709    = 0x2,
        VPX_CS_SMPTE_170 = 0x3,
        VPX_CS_SMPTE_240 = 0x4,
        VPX_CS_BT_2020   = 0x5,
        VPX_CS_RESERVED  = 0x6,
        VPX_CS_SRGB      = 0x7;

    /**
     * vpx_color_range_t List of supported color range
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VPX_CR_STUDIO_RANGE VPX_CR_STUDIO_RANGE} - Y [16..235], UV [16..240]</li>
     * <li>{@link #VPX_CR_FULL_RANGE VPX_CR_FULL_RANGE} - YUV/RGB [0..255]</li>
     * </ul>
     */
    public static final int
        VPX_CR_STUDIO_RANGE = 0x0,
        VPX_CR_FULL_RANGE   = 0x1;

    /**
     * vpx_kf_mode
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VPX_KF_FIXED VPX_KF_FIXED} - deprecated, implies VPX_KF_DISABLED</li>
     * <li>{@link #VPX_KF_AUTO VPX_KF_AUTO} - Encoder determines optimal placement automatically</li>
     * <li>{@link #VPX_KF_DISABLED VPX_KF_DISABLED} - Encoder does not place keyframes.</li>
     * </ul>
     */
    public static final int
        VPX_KF_FIXED    = 0,
        VPX_KF_AUTO     = 1,
        VPX_KF_DISABLED = 0x0;

    /**
     * vpx_bit_depth
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VPX_BITS_8 VPX_BITS_8} - 8 bits</li>
     * <li>{@link #VPX_BITS_10 VPX_BITS_10} - 10 bits</li>
     * <li>{@link #VPX_BITS_12 VPX_BITS_12} - 12 bits</li>
     * </ul>
     */
    public static final int
        VPX_BITS_8  = 0x8,
        VPX_BITS_10 = 0xA,
        VPX_BITS_12 = 0xC;

    /**
     * vpx_rc_mode Rate control mode
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VPX_VBR VPX_VBR} - Variable Bit Rate (VBR) mode</li>
     * <li>{@link #VPX_CBR VPX_CBR} - Constant Bit Rate (CBR) mode</li>
     * <li>{@link #VPX_CQ VPX_CQ} - Constrained Quality (CQ)  mode</li>
     * <li>{@link #VPX_Q VPX_Q} - Constant Quality (Q) mode</li>
     * </ul>
     */
    public static final int
        VPX_VBR = 0,
        VPX_CBR = 1,
        VPX_CQ  = 2,
        VPX_Q   = 3;

    /**
     * vpx_enc_pass Multi-pass Encoding Pass
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VPX_RC_ONE_PASS VPX_RC_ONE_PASS} - Single pass mode</li>
     * <li>{@link #VPX_RC_FIRST_PASS VPX_RC_FIRST_PASS} - First pass of multi-pass mode</li>
     * <li>{@link #VPX_RC_LAST_PASS VPX_RC_LAST_PASS} - Final pass of multi-pass mode</li>
     * </ul>
     */
    public static final int
        VPX_RC_ONE_PASS   = 0,
        VPX_RC_FIRST_PASS = 1,
        VPX_RC_LAST_PASS  = 2;

    /**
     * vpx_codec_cx_pkt_kind 
     * Encoder output packet variants
 *
 * This enumeration lists the different kinds of data packets that can be
 * returned by calls to vpx_codec_get_cx_data(). Algorithms \ref MAY
 * extend this list to provide additional functionality.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VPX_CODEC_CX_FRAME_PKT VPX_CODEC_CX_FRAME_PKT} - Compressed video frame</li>
     * <li>{@link #VPX_CODEC_STATS_PKT VPX_CODEC_STATS_PKT} - Two-pass statistics for this frame</li>
     * <li>{@link #VPX_CODEC_FPMB_STATS_PKT VPX_CODEC_FPMB_STATS_PKT} - first pass mb statistics for this frame</li>
     * <li>{@link #VPX_CODEC_PSNR_PKT VPX_CODEC_PSNR_PKT} - PSNR statistics for this frame</li>
     * <li>{@link #VPX_CODEC_CUSTOM_PKT VPX_CODEC_CUSTOM_PKT} - Algorithm extensions</li>
     * </ul>
     */
    public static final int
        VPX_CODEC_CX_FRAME_PKT   = 0,
        VPX_CODEC_STATS_PKT      = 1,
        VPX_CODEC_FPMB_STATS_PKT = 2,
        VPX_CODEC_PSNR_PKT       = 3,
        VPX_CODEC_CUSTOM_PKT     = 0x100;

    /**
     * vpx_enc_frame_flags_t Encoded Frame Flags
 *
 * This type indicates a bitfield to be passed to vpx_codec_encode(), defining
 * per-frame boolean values. By convention, bits common to all codecs will be
 * named VPX_EFLAG_*, and bits specific to an algorithm will be named
 * /algo/_eflag_*. The lower order 16 bits are reserved for common use.
     * 
     * <p>Force this frame to be a keyframe</p>
     */
    public static final int VPX_EFLAG_FORCE_KF = 0x1;

    /**
     * vpx_codec_frame_flags_t Compressed Frame Flags
 *
 * This type represents a bitfield containing information about a compressed
 * frame that may be useful to an application. The most significant 16 bits
 * can be used by an algorithm to provide additional detail, for example to
 * support frame types that are codec specific (MPEG-1 D-frames for example)
     * 
     * <p>frame is the start of a GOP</p>
     */
    public static final int VPX_FRAME_IS_KEY = 0x1;

    /** frame can be dropped without affecting the stream (no future frame depends on this one) */
    public static final int VPX_FRAME_IS_DROPPABLE = 0x2;

    /** frame should be decoded but will not be shown */
    public static final int VPX_FRAME_IS_INVISIBLE = 0x4;

    /** this is a fragment of the encoded frame */
    public static final int VPX_FRAME_IS_FRAGMENT = 0x8;

    static { Library.loadSystem(System::load, System::loadLibrary, VPXEncoder.class, "org.lwjgl.vpx", Platform.mapLibraryNameBundled("lwjgl_vpx")); }

    protected VPXEncoder() {
        throw new UnsupportedOperationException();
    }

    // --- [ vpx_codec_vp8_cx ] ---

    /** Get the vp8 encoder algorithm interface */
    @NativeType("vpx_codec_iface_t *")
    public static native long vpx_codec_vp8_cx();

    // --- [ vpx_codec_vp9_cx ] ---

    /** Get the vp9 encoder algorithm interface */
    @NativeType("vpx_codec_iface_t *")
    public static native long vpx_codec_vp9_cx();

    // --- [ vpx_codec_enc_config_default ] ---

    /** Unsafe version of: {@link #vpx_codec_enc_config_default} */
    public static native int nvpx_codec_enc_config_default(long iface, long cfg, int usage);

    /**
     * Get a default configuration
 *
 * Initializes a encoder configuration structure with default values. Supports
 * the notion of "usages" so that an algorithm may offer different default
 * settings depending on the user's intended goal. This function \ref SHOULD
 * be called by all applications to initialize the configuration structure
 * before specializing the configuration with application specific values.
     *
     * @param iface Pointer to the algorithm interface to use.
     * @param cfg   Configuration buffer to populate.
     * @param usage Must be set to 0.
     *
     * @return VPX_CODEC_OK
     *         The configuration was populated.
VPX_CODEC_INCAPABLE
     *         Interface is not an encoder interface.
VPX_CODEC_INVALID_PARAM
     *         A parameter was NULL, or the usage value was not recognized.
     */
    @NativeType("vpx_codec_err_t")
    public static int vpx_codec_enc_config_default(@NativeType("vpx_codec_iface_t *") long iface, @NativeType("vpx_codec_enc_cfg_t *") vpx_codec_enc_cfg_t cfg, @NativeType("unsigned int") int usage) {
        if (CHECKS) {
            check(iface);
        }
        return nvpx_codec_enc_config_default(iface, cfg.address(), usage);
    }

    // --- [ vpx_codec_enc_init_ver ] ---

    /** Unsafe version of: {@link #vpx_codec_enc_init_ver} */
    public static native int nvpx_codec_enc_init_ver(long ctx, long iface, long cfg, long flags, int ver);

    /**
     * Initialize an encoder instance
 *
 * Initializes a encoder context using the given interface. Applications
 * should call the vpx_codec_enc_init convenience macro instead of this
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
     * @param ver   ABI version number. Must be set to VPX_ENCODER_ABI_VERSION
     *
     * @return VPX_CODEC_OK
     *         The decoder algorithm initialized.
VPX_CODEC_MEM_ERROR
     *         Memory allocation failed.
     */
    @NativeType("vpx_codec_err_t")
    public static int vpx_codec_enc_init_ver(@NativeType("vpx_codec_ctx_t *") vpx_codec_ctx_t ctx, @NativeType("vpx_codec_iface_t *") long iface, @NativeType("vpx_codec_enc_cfg_t const *") vpx_codec_enc_cfg_t cfg, long flags, int ver) {
        if (CHECKS) {
            check(iface);
            vpx_codec_enc_cfg_t.validate(cfg.address());
        }
        return nvpx_codec_enc_init_ver(ctx.address(), iface, cfg.address(), flags, ver);
    }

    // --- [ vpx_codec_encode ] ---

    /** Unsafe version of: {@link #vpx_codec_encode} */
    public static native int nvpx_codec_encode(long ctx, long img, long pts, long duration, long flags, long deadline);

    /**
     * Encode a frame
 *
 * Encodes a video frame at the given "presentation time." The presentation
 * time stamp (PTS) \ref MUST be strictly increasing.
 *
 * The encoder supports the notion of a soft real-time deadline. Given a
 * non-zero value to the deadline parameter, the encoder will make a "best
 * effort" guarantee to  return before the given time slice expires. It is
 * implicit that limiting the available time to encode will degrade the
 * output quality. The encoder can be given an unlimited time to produce the
 * best possible frame by specifying a deadline of '0'. This deadline
 * supersedes the VPx notion of "best quality, good quality, realtime".
 * Applications that wish to map these former settings to the new deadline
 * based system can use the symbols VPX_DL_REALTIME, VPX_DL_GOOD_QUALITY,
 * and VPX_DL_BEST_QUALITY.
 *
 * When the last frame has been passed to the encoder, this function should
 * continue to be called, with the img parameter set to NULL. This will
 * signal the end-of-stream condition to the encoder and allow it to encode
 * any held buffers. Encoding is complete when vpx_codec_encode() is called
 * and vpx_codec_get_cx_data() returns no data.
     *
     * @param ctx      Pointer to this instance's context
     * @param img      Image data to encode, NULL to flush.
     * @param pts      Presentation time stamp, in timebase units.
     * @param duration Duration to show frame, in timebase units.
     * @param flags    Flags to use for encoding this frame. (type vpx_enc_frame_flags_t)
     * @param deadline Time to spend encoding, in microseconds. (0=infinite)
     *
     * @return VPX_CODEC_OK
     *         The configuration was populated.
VPX_CODEC_INCAPABLE
     *         Interface is not an encoder interface.
VPX_CODEC_INVALID_PARAM
     *         A parameter was NULL, the image format is unsupported, etc.
     */
    @NativeType("vpx_codec_err_t")
    public static int vpx_codec_encode(@NativeType("vpx_codec_ctx_t *") vpx_codec_ctx_t ctx, @NativeType("vpx_image_t *") vpx_image_t img, @NativeType("vpx_codec_pts_t") long pts, @NativeType("unsigned long") long duration, long flags, @NativeType("unsigned long") long deadline) {
        return nvpx_codec_encode(ctx.address(), img.address(), pts, duration, flags, deadline);
    }

    // --- [ vpx_codec_get_cx_data ] ---

    /** Unsafe version of: {@link #vpx_codec_get_cx_data} */
    public static native long nvpx_codec_get_cx_data(long ctx, long iter);

    /**
     * Encoded data iterator
 *
 * Iterates over a list of data packets to be passed from the encoder to the
 * application. The different kinds of packets available are enumerated in
 * vpx_codec_cx_pkt_kind.
 *
 * VPX_CODEC_CX_FRAME_PKT packets should be passed to the application's
 * muxer. Multiple compressed frames may be in the list.
 * VPX_CODEC_STATS_PKT packets should be appended to a global buffer.
 *
 * The application \ref MUST silently ignore any packet kinds that it does
 * not recognize or support.
 *
 * The data buffers returned from this function are only guaranteed to be
 * valid until the application makes another call to any vpx_codec_* function.
     *
     * @param ctx  Pointer to this instance's context
     * @param iter Iterator storage, initialized to NULL
     *
     * @return Returns a pointer to an output data packet (compressed frame data,
     *         two-pass statistics, etc.) or NULL to signal end-of-list.
     */
    @Nullable
    @NativeType("vpx_codec_cx_pkt_t *")
    public static vpx_codec_cx_pkt_t vpx_codec_get_cx_data(@NativeType("vpx_codec_ctx_t *") vpx_codec_ctx_t ctx, @Nullable @NativeType("void *") ByteBuffer iter) {
        long __result = nvpx_codec_get_cx_data(ctx.address(), memAddressSafe(iter));
        return vpx_codec_cx_pkt_t.createSafe(__result);
    }

}