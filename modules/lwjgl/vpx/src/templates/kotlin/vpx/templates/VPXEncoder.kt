/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vpx.templates

import vpx.*
import org.lwjgl.generator.*

val VPXEncoder = "VPXEncoder".nativeClass(Module.VPX, prefixConstant = "", prefixMethod = "") {
    nativeDirective("""
#include "vpx_encoder.h"
#include "vpx_image.h"
#include "vpx_codec.h"
#include "vp8cx.h"
""")
EnumConstant(
	"vpx_codec_err_t",
	
    "VPX_CODEC_OK".enum(
        "Operation completed without error"
    ),
    "VPX_CODEC_ERROR".enum(
        "Unspecified error"
    ),
    "VPX_CODEC_MEM_ERROR".enum(
        "Memory operation failed"
    ),
    "VPX_CODEC_ABI_MISMATCH".enum(
        "ABI version mismatch"
    ),
    "VPX_CODEC_INCAPABLE".enum(
        "Algorithm does not have required capability"
    ),
    "VPX_CODEC_UNSUP_BITSTREAM".enum(
        """
		The given bitstream is not supported.
   *
   * The bitstream was unable to be parsed at the highest level. The decoder
   * is unable to proceed. This error \ref SHOULD be treated as fatal to the
   * stream."""
    ),
    "VPX_CODEC_UNSUP_FEATURE".enum(
        """
		Encoded bitstream uses an unsupported feature
   *
   * The decoder does not implement a feature required by the encoder. This
   * return code should only be used for features that prevent future
   * pictures from being properly decoded. This error \ref MAY be treated as
   * fatal to the stream or \ref MAY be treated as fatal to the current GOP."""
    ),
    "VPX_CODEC_CORRUPT_FRAME".enum(
        """
		The coded data for this stream is corrupt or incomplete
   *
   * There was a problem decoding the current frame.  This return code
   * should only be used for failures that prevent future pictures from
   * being properly decoded. This error \ref MAY be treated as fatal to the
   * stream or \ref MAY be treated as fatal to the current GOP. If decoding
   * is continued for the current GOP, artifacts may be present."""
    ),
    "VPX_CODEC_INVALID_PARAM".enum(
        "An application-supplied parameter is not valid."
    ),
    "VPX_CODEC_LIST_END".enum(
        "An iterator reached the end of list."
    )
)
    IntConstant(
        "Image is a planar format.",
        "VPX_IMG_FMT_PLANAR".."0x100"
    )
    IntConstant(
        "V plane precedes U in memory.",
        "VPX_IMG_FMT_UV_FLIP".."0x200"
    )
    IntConstant(
        "Image has an alpha channel.",
        "VPX_IMG_FMT_HAS_ALPHA".."0x400"
    )
    IntConstant(
        "Image uses 16bit framebuffer.",
        "VPX_IMG_FMT_HIGHBITDEPTH".."0x800"
    )
	
EnumConstant(
    "vpx_img_fmt_t List of supported image formats",

    "VPX_IMG_FMT_NONE".enum,
    "VPX_IMG_FMT_YV12".enum("planar YVU", "VPX_IMG_FMT_PLANAR | VPX_IMG_FMT_UV_FLIP | 1" ),
    "VPX_IMG_FMT_I420".enum("", "VPX_IMG_FMT_PLANAR | 2" ),
    "VPX_IMG_FMT_I422".enum("", "VPX_IMG_FMT_PLANAR | 5" ),
    "VPX_IMG_FMT_I444".enum("", "VPX_IMG_FMT_PLANAR | 6" ),
    "VPX_IMG_FMT_I440".enum("", "VPX_IMG_FMT_PLANAR | 7" ),
    "VPX_IMG_FMT_NV12".enum("", "VPX_IMG_FMT_PLANAR | 9" ),
    "VPX_IMG_FMT_I42016".enum("", "VPX_IMG_FMT_I420 | VPX_IMG_FMT_HIGHBITDEPTH" ),
    "VPX_IMG_FMT_I42216".enum("", "VPX_IMG_FMT_I422 | VPX_IMG_FMT_HIGHBITDEPTH" ),
    "VPX_IMG_FMT_I44416".enum("", "VPX_IMG_FMT_I444 | VPX_IMG_FMT_HIGHBITDEPTH" ),
    "VPX_IMG_FMT_I44016".enum("", "VPX_IMG_FMT_I440 | VPX_IMG_FMT_HIGHBITDEPTH" ),
)

EnumConstant(
    "vpx_color_space_t List of supported color spaces",

    "VPX_CS_UNKNOWN".enum("Unknown", 0 ),
    "VPX_CS_BT_601".enum("BT.601", 1 ),
    "VPX_CS_BT_709".enum("BT.709", 2 ),
    "VPX_CS_SMPTE_170".enum("SMPTE.170", 3 ),
    "VPX_CS_SMPTE_240".enum("SMPTE.240", 4 ),
    "VPX_CS_BT_2020".enum("BT.2020", 5 ),
    "VPX_CS_RESERVED".enum("Reserved", 6 ),
    "VPX_CS_SRGB".enum("sRGB", 7 )
)

EnumConstant(
    "vpx_color_range_t List of supported color range",

    "VPX_CR_STUDIO_RANGE".enum(
        "Y [16..235], UV [16..240]",
		0
    ),
    "VPX_CR_FULL_RANGE".enum(
        "YUV/RGB [0..255]",
		1
    )
)

EnumConstant(
    "vpx_kf_mode",

    "VPX_KF_FIXED".enum(
        "deprecated, implies VPX_KF_DISABLED"
    ),
    "VPX_KF_AUTO".enum(
        "Encoder determines optimal placement automatically"
    ),
    "VPX_KF_DISABLED".enum(
        "Encoder does not place keyframes.",
        0
    )
)
EnumConstant(
    "vpx_bit_depth",

    "VPX_BITS_8".enum(
        "8 bits",
        8
    ),
    "VPX_BITS_10".enum(
        "10 bits",
        10
    ),
    "VPX_BITS_12".enum(
        "12 bits",
        12
    )
)
EnumConstant(
    "vpx_rc_mode Rate control mode",

    "VPX_VBR".enum(
        "Variable Bit Rate (VBR) mode"
    ),
    "VPX_CBR".enum(
        "Constant Bit Rate (CBR) mode"
    ),
    "VPX_CQ".enum(
        "Constrained Quality (CQ)  mode"
    ),
    "VPX_Q".enum(
        "Constant Quality (Q) mode"
    )
)
EnumConstant(
    "vpx_enc_pass Multi-pass Encoding Pass",

    "VPX_RC_ONE_PASS".enum(
        "Single pass mode"
    ),
    "VPX_RC_FIRST_PASS".enum(
        "First pass of multi-pass mode"
    ),
    "VPX_RC_LAST_PASS".enum(
        "Final pass of multi-pass mode"
    )
)
    IntConstant(
        """
		vpx_enc_frame_flags_t Encoded Frame Flags
 *
 * This type indicates a bitfield to be passed to vpx_codec_encode(), defining
 * per-frame boolean values. By convention, bits common to all codecs will be
 * named VPX_EFLAG_*, and bits specific to an algorithm will be named
 * /algo/_eflag_*. The lower order 16 bits are reserved for common use.

Force this frame to be a keyframe""",
        "VPX_EFLAG_FORCE_KF".."0x1",
    )
	

    IntConstant(
        """
		vpx_codec_frame_flags_t Compressed Frame Flags
 *
 * This type represents a bitfield containing information about a compressed
 * frame that may be useful to an application. The most significant 16 bits
 * can be used by an algorithm to provide additional detail, for example to
 * support frame types that are codec specific (MPEG-1 D-frames for example)

frame is the start of a GOP""",
        "VPX_FRAME_IS_KEY".."0x1",
    )
    IntConstant(
        "frame can be dropped without affecting the stream (no future frame depends on this one)",
        "VPX_FRAME_IS_DROPPABLE".."0x2",
    )
    IntConstant(
        "frame should be decoded but will not be shown",
        "VPX_FRAME_IS_INVISIBLE".."0x4",
    )
    IntConstant(
        "this is a fragment of the encoded frame",
        "VPX_FRAME_IS_FRAGMENT".."0x8",
    )
	
	
    vpx_codec_iface_t.p(
        "vpx_codec_vp8_cx",
		"Get the vp8 algorithm interface",
		
		void()
	)
    vpx_codec_iface_t.p(
        "vpx_codec_vp9_cx",
		"Get the vp9 algorithm interface",
		
		void()
	)
	
    vpx_codec_err_t(
        "vpx_codec_enc_config_default",
        """
		Get a default configuration
 *
 * Initializes a encoder configuration structure with default values. Supports
 * the notion of "usages" so that an algorithm may offer different default
 * settings depending on the user's intended goal. This function \ref SHOULD
 * be called by all applications to initialize the configuration structure
 * before specializing the configuration with application specific values.
		""",

        vpx_codec_iface_t.p("iface", "Pointer to the algorithm interface to use."),
        vpx_codec_enc_cfg_t.p("cfg", "Configuration buffer to populate."),
        unsigned_int("usage", "Must be set to 0."),

        returnDoc = """
VPX_CODEC_OK
    The configuration was populated.
VPX_CODEC_INCAPABLE
    Interface is not an encoder interface.
VPX_CODEC_INVALID_PARAM
    A parameter was NULL, or the usage value was not recognized.
		"""
    )
//vpx_codec_err_t vpx_codec_enc_config_default(vpx_codec_iface_t *iface,
//                                             vpx_codec_enc_cfg_t *cfg,
//                                             unsigned int usage);


    vpx_codec_err_t(
        "vpx_codec_enc_init_ver",
        """
		Initialize an encoder instance
 *
 * Initializes a encoder context using the given interface. Applications
 * should call the vpx_codec_enc_init convenience macro instead of this
 * function directly, to ensure that the ABI version number parameter
 * is properly initialized.
 *
 * If the library was configured with --disable-multithread, this call
 * is not thread safe and should be guarded with a lock if being used
 * in a multithreaded context.
		""",

        vpx_codec_ctx_t.p("ctx", "Pointer to this instance's context."),
        vpx_codec_iface_t.p("iface", "Pointer to the algorithm interface to use."),
        vpx_codec_enc_cfg_t.const.p("cfg", "Configuration to use, if known. May be NULL."),
        long("flags", "Bitfield of VPX_CODEC_USE_* flags (type vpx_codec_flags_t)"),
        int("ver", "ABI version number. Must be set to VPX_ENCODER_ABI_VERSION"),

        returnDoc = """
VPX_CODEC_OK
    The decoder algorithm initialized.
VPX_CODEC_MEM_ERROR
    Memory allocation failed.
		"""
    )
//vpx_codec_err_t vpx_codec_enc_init_ver(vpx_codec_ctx_t *ctx,
//                                       vpx_codec_iface_t *iface,
//                                       const vpx_codec_enc_cfg_t *cfg,
//                                       vpx_codec_flags_t flags, int ver);


/*!\brief deadline parameter analogous to VPx REALTIME mode. */
//define VPX_DL_REALTIME (1)
/*!\brief deadline parameter analogous to  VPx GOOD QUALITY mode. */
//define VPX_DL_GOOD_QUALITY (1000000)
/*!\brief deadline parameter analogous to VPx BEST QUALITY mode. */
//define VPX_DL_BEST_QUALITY (0)
    vpx_codec_err_t(
        "vpx_codec_encode",
        """
		Encode a frame
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
		""",

        vpx_codec_ctx_t.p("ctx", "Pointer to this instance's context"),
        vpx_image_t.p("img", "Image data to encode, NULL to flush."),
        vpx_codec_pts_t("pts", "Presentation time stamp, in timebase units."),
        unsigned_long("duration", "Duration to show frame, in timebase units."),
        long("flags", "Flags to use for encoding this frame. (type vpx_enc_frame_flags_t)"),
        unsigned_long("deadline", "Time to spend encoding, in microseconds. (0=infinite)"),

        returnDoc = """
VPX_CODEC_OK
    The configuration was populated.
VPX_CODEC_INCAPABLE
    Interface is not an encoder interface.
VPX_CODEC_INVALID_PARAM
    A parameter was NULL, the image format is unsupported, etc.
		"""
    )
//vpx_codec_err_t vpx_codec_encode(vpx_codec_ctx_t *ctx, const vpx_image_t *img,
//                                 vpx_codec_pts_t pts, unsigned long duration,
//                                 vpx_enc_frame_flags_t flags,
//                                 unsigned long deadline);

    vpx_codec_cx_pkt_t.p(
        "vpx_codec_get_cx_data",
        """
		Encoded data iterator
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
		""",

        vpx_codec_ctx_t.p("ctx", "Pointer to this instance's context"),
        Unsafe..nullable..void.p("iter", "Iterator storage, initialized to NULL"),

        returnDoc = """
Returns a pointer to an output data packet (compressed frame data,
        two-pass statistics, etc.) or NULL to signal end-of-list.
		"""
    )
//const vpx_codec_cx_pkt_t *vpx_codec_get_cx_data(vpx_codec_ctx_t *ctx,
//                                                vpx_codec_iter_t *iter);
}