/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package vpx

import org.lwjgl.generator.*

val vpx_codec_err_t = "vpx_codec_err_t".enumType

val vpx_codec_iface_t = "vpx_codec_iface_t".opaque

//enum vpx_kf_mode {
//  VPX_KF_FIXED,       /**< deprecated, implies VPX_KF_DISABLED */
//  VPX_KF_AUTO,        /**< Encoder determines optimal placement automatically */
//  VPX_KF_DISABLED = 0 /**< Encoder does not place keyframes. */
//};
val vpx_kf_mode = "vpx_kf_mode".enumType
//typedef enum vpx_bit_depth {
//  VPX_BITS_8 = 8,   /**<  8 bits */
//  VPX_BITS_10 = 10, /**< 10 bits */
//  VPX_BITS_12 = 12, /**< 12 bits */
//} vpx_bit_depth_t;
val vpx_bit_depth = "vpx_bit_depth".enumType

/*!\brief Rate control mode */
//enum vpx_rc_mode {
//  VPX_VBR, /**< Variable Bit Rate (VBR) mode */
//  VPX_CBR, /**< Constant Bit Rate (CBR) mode */
//  VPX_CQ,  /**< Constrained Quality (CQ)  mode */
//  VPX_Q,   /**< Constant Quality (Q) mode */
//};
val vpx_rc_mode = "vpx_rc_mode".enumType

/*!\brief Multi-pass Encoding Pass */
//typedef enum vpx_enc_pass {
//  VPX_RC_ONE_PASS,   /**< Single pass mode */
//  VPX_RC_FIRST_PASS, /**< First pass of multi-pass mode */
//  VPX_RC_LAST_PASS   /**< Final pass of multi-pass mode */
//} vpx_enc_pass;
val vpx_enc_pass = "vpx_enc_pass".enumType

val vpx_rational = struct(Module.VPX, "vpx_rational", nativeName = "vpx_rational") {
    documentation = """
	Rational Number
 *
 * This structure holds a fractional value.
	"""
  int("num", "fraction numerator")
  int("den", "fraction denominator")
}

val vpx_fixed_buf_t = struct(Module.VPX, "vpx_fixed_buf_t", nativeName = "vpx_fixed_buf_t") {
  void.p("buf", "Pointer to the data")
  size_t("sz", "Length of the buffer, in chars")
}
/*!\brief Time Stamp Type
 *
 * An integer, which when multiplied by the stream's time base, provides
 * the absolute time of a sample.
 */
val vpx_codec_pts_t = typedef(int64_t, "vpx_codec_pts_t")
/*!\brief Compressed Frame Flags
 *
 * This type represents a bitfield containing information about a compressed
 * frame that may be useful to an application. The most significant 16 bits
 * can be used by an algorithm to provide additional detail, for example to
 * support frame types that are codec specific (MPEG-1 D-frames for example)
 */
val vpx_codec_frame_flags_t = typedef(uint32_t, "vpx_codec_frame_flags_t")
	
/*!\brief List of supported image formats */
val vpx_img_fmt_t = "vpx_img_fmt_t".enumType

/*!\brief List of supported color spaces */
val vpx_color_space_t = "vpx_color_space_t".enumType

/*!\brief List of supported color range */
val vpx_color_range_t = "vpx_color_range_t".enumType

/**\brief Image Descriptor */
val vpx_image_t = struct(Module.VPX, "vpx_image_t", nativeName = "vpx_image_t") {
  vpx_img_fmt_t("fmt", "Image Format")
  vpx_color_space_t("cs", "Color Space")
  vpx_color_range_t("range", "Color Range")

  /* Image storage dimensions */
  unsigned_int("w", "Stored image width")
  unsigned_int("h", "Stored image height")
  unsigned_int("bit_depth", "Stored image bit-depth")

  /* Image display dimensions */
  unsigned_int("d_w", "Displayed image width")
  unsigned_int("d_h", "Displayed image height")

  /* Image intended rendering dimensions */
  unsigned_int("r_w", "Intended rendering image width")
  unsigned_int("r_h", "Intended rendering image height")

  /* Chroma subsampling info */
  unsigned_int("x_chroma_shift", "subsampling order, X")
  unsigned_int("y_chroma_shift", "subsampling order, Y")

/* Image data pointers. */
//define VPX_PLANE_PACKED 0  /**< To be used for all packed formats */
//define VPX_PLANE_Y 0       /**< Y (Luminance) plane */
//define VPX_PLANE_U 1       /**< U (Chroma) plane */
//define VPX_PLANE_V 2       /**< V (Chroma) plane */
//define VPX_PLANE_ALPHA 3   /**< A (Transparency) plane */
  unsigned_char.p("planes", "pointer to the top left pixel for each plane")[4]
  int("stride", "stride between rows for each plane")[4]

  int("bps", "bits per sample (for packed formats)")

  void.p("user_priv", "The following member may be set by the application to associate data with this image.")

  /* The following members should be treated as private. */
  unsigned_char.p("img_data", "private")
  int("img_data_owner", "private")
  int("self_allocd", "private")

  void.p("fb_priv", "Frame buffer data associated with the image.")
}

val vpx_codec_enc_cfg_t = struct(Module.VPX, "vpx_codec_enc_cfg_t", nativeName = "vpx_codec_enc_cfg_t") {
    documentation = """
	Encoder configuration structure
 *
 * This structure contains the encoder settings that have common representations
 * across all codecs. This doesn't imply that all codecs support all features,
 * however.
	"""
  /*
   * generic settings (g)
   */
  unsigned_int("g_usage", "Deprecated: Algorithm specific usage value. This value must be zero.")

  unsigned_int("g_threads", """
Maximum number of threads to use
   *
   * For multi-threaded implementations, use no more than this number of
   * threads. The codec may use fewer threads than allowed. The value
   * 0 is equivalent to the value 1.
""")

  unsigned_int("g_profile", """
Bitstream profile to use
   *
   * Some codecs support a notion of multiple bitstream profiles. Typically
   * this maps to a set of features that are turned on or off. Often the
   * profile to use is determined by the features of the intended decoder.
   * Consult the documentation for the codec to determine the valid values
   * for this parameter, or set to zero for a sane default.
""")

  unsigned_int("g_w", """
Width of the frame
   *
   * This value identifies the presentation resolution of the frame,
   * in pixels. Note that the frames passed as input to the encoder must
   * have this resolution. Frames will be presented by the decoder in this
   * resolution, independent of any spatial resampling the encoder may do.
""")

  unsigned_int("g_h", """
Height of the frame
   *
   * This value identifies the presentation resolution of the frame,
   * in pixels. Note that the frames passed as input to the encoder must
   * have this resolution. Frames will be presented by the decoder in this
   * resolution, independent of any spatial resampling the encoder may do.
""")

  vpx_bit_depth("g_bit_depth", """
Bit-depth of the codec
   *
   * This value identifies the bit_depth of the codec,
   * Only certain bit-depths are supported as identified in the
   * vpx_bit_depth_t enum.
""")

  unsigned_int("g_input_bit_depth", """
Bit-depth of the input frames
   *
   * This value identifies the bit_depth of the input frames in bits.
   * Note that the frames passed as input to the encoder must have
   * this bit-depth.
""")

 vpx_rational("g_timebase", """
Stream timebase units
   *
   * Indicates the smallest interval of time, in seconds, used by the stream.
   * For fixed frame rate material, or variable frame rate material where
   * frames are timed at a multiple of a given clock (ex: video capture),
   * the \ref RECOMMENDED method is to set the timebase to the reciprocal
   * of the frame rate (ex: 1001/30000 for 29.970 Hz NTSC). This allows the
   * pts to correspond to the frame number, which can be handy. For
   * re-encoding video from containers with absolute time timestamps, the
   * \ref RECOMMENDED method is to set the timebase to that of the parent
   * container or multimedia framework (ex: 1/1000 for ms, as in FLV).
""")

/*!\brief Improve resiliency against losses of whole frames */
//define VPX_ERROR_RESILIENT_DEFAULT 0x1
/*!\brief The frame partitions are independently decodable by the bool decoder,
 * meaning that partitions can be decoded even though earlier partitions have
 * been lost. Note that intra prediction is still done over the partition
 * boundary. */
//define VPX_ERROR_RESILIENT_PARTITIONS 0x2
  uint32_t("g_error_resilient", """
Enable error resilient modes.
   *
   * The error resilient bitfield indicates to the encoder which features
   * it should enable to take measures for streaming over lossy or noisy
   * links.
""")

  vpx_enc_pass("g_pass", """
Multi-pass Encoding Mode
   *
   * This value should be set to the current phase for multi-pass encoding.
   * For single pass, set to VPX_RC_ONE_PASS.
""")

  unsigned_int("g_lag_in_frames", """
Allow lagged encoding
   *
   * If set, this value allows the encoder to consume a number of input
   * frames before producing output frames. This allows the encoder to
   * base decisions for the current frame on future frames. This does
   * increase the latency of the encoding pipeline, so it is not appropriate
   * in all situations (ex: realtime encoding).
   *
   * Note that this is a maximum value -- the encoder may produce frames
   * sooner than the given limit. Set this value to 0 to disable this
   * feature.
""")

  /*
   * rate control settings (rc)
   */

  unsigned_int("rc_dropframe_thresh", """
Temporal resampling configuration, if supported by the codec.
   *
   * Temporal resampling allows the codec to "drop" frames as a strategy to
   * meet its target data rate. This can cause temporal discontinuities in
   * the encoded video, which may appear as stuttering during playback. This
   * trade-off is often acceptable, but for many applications is not. It can
   * be disabled in these cases.
   *
   * This threshold is described as a percentage of the target data buffer.
   * When the data buffer falls below this percentage of fullness, a
   * dropped frame is indicated. Set the threshold to zero (0) to disable
   * this feature.
""")

  unsigned_int("rc_resize_allowed", """
Enable/disable spatial resampling, if supported by the codec.
   *
   * Spatial resampling allows the codec to compress a lower resolution
   * version of the frame, which is then upscaled by the encoder to the
   * correct presentation resolution. This increases visual quality at
   * low data rates, at the expense of CPU time on the encoder/decoder.
""")

  unsigned_int("rc_scaled_width", """
Internal coded frame width.
   *
   * If spatial resampling is enabled this specifies the width of the
   * encoded frame.
""")

  unsigned_int("rc_scaled_height", """
Internal coded frame height.
   *
   * If spatial resampling is enabled this specifies the height of the
   * encoded frame.
""")

  unsigned_int("rc_resize_up_thresh", """
Spatial resampling up watermark.
   *
   * This threshold is described as a percentage of the target data buffer.
   * When the data buffer rises above this percentage of fullness, the
   * encoder will step up to a higher resolution version of the frame.
""")

  unsigned_int("rc_resize_down_thresh", """
Spatial resampling down watermark.
   *
   * This threshold is described as a percentage of the target data buffer.
   * When the data buffer falls below this percentage of fullness, the
   * encoder will step down to a lower resolution version of the frame.
""")

  vpx_rc_mode("rc_end_usage", """
Rate control algorithm to use.
   *
   * Indicates whether the end usage of this stream is to be streamed over
   * a bandwidth constrained link, indicating that Constant Bit Rate (CBR)
   * mode should be used, or whether it will be played back on a high
   * bandwidth link, as from a local disk, where higher variations in
   * bitrate are acceptable.
""")

  vpx_fixed_buf_t("rc_twopass_stats_in", """
Two-pass stats buffer.
   *
   * A buffer containing all of the stats packets produced in the first
   * pass, concatenated.
""")

  vpx_fixed_buf_t("rc_firstpass_mb_stats_in", """
first pass mb stats buffer.
   *
   * A buffer containing all of the first pass mb stats packets produced
   * in the first pass, concatenated.
""")

  unsigned_int("rc_target_bitrate", """
Target data rate
   *
   * Target bandwidth to use for this stream, in kilobits per second.
""")

  /*
   * quantizer settings
   */

  unsigned_int("rc_min_quantizer", """
Minimum (Best Quality) Quantizer
   *
   * The quantizer is the most direct control over the quality of the
   * encoded image. The range of valid values for the quantizer is codec
   * specific. Consult the documentation for the codec to determine the
   * values to use.
""")

  unsigned_int("rc_max_quantizer", """
Maximum (Worst Quality) Quantizer
   *
   * The quantizer is the most direct control over the quality of the
   * encoded image. The range of valid values for the quantizer is codec
   * specific. Consult the documentation for the codec to determine the
   * values to use.
""")

  /*
   * bitrate tolerance
   */

  unsigned_int("rc_undershoot_pct", """
Rate control adaptation undershoot control
   *
   * VP8: Expressed as a percentage of the target bitrate,
   * controls the maximum allowed adaptation speed of the codec.
   * This factor controls the maximum amount of bits that can
   * be subtracted from the target bitrate in order to compensate
   * for prior overshoot.
   * VP9: Expressed as a percentage of the target bitrate, a threshold
   * undershoot level (current rate vs target) beyond which more aggressive
   * corrective measures are taken.
   *   *
   * Valid values in the range VP8:0-1000 VP9: 0-100.
""")

  unsigned_int("rc_overshoot_pct", """
Rate control adaptation overshoot control
   *
   * VP8: Expressed as a percentage of the target bitrate,
   * controls the maximum allowed adaptation speed of the codec.
   * This factor controls the maximum amount of bits that can
   * be added to the target bitrate in order to compensate for
   * prior undershoot.
   * VP9: Expressed as a percentage of the target bitrate, a threshold
   * overshoot level (current rate vs target) beyond which more aggressive
   * corrective measures are taken.
   *
   * Valid values in the range VP8:0-1000 VP9: 0-100.
""")

  /*
   * decoder buffer model parameters
   */

  unsigned_int("rc_buf_sz", """
Decoder Buffer Size
   *
   * This value indicates the amount of data that may be buffered by the
   * decoding application. Note that this value is expressed in units of
   * time (milliseconds). For example, a value of 5000 indicates that the
   * client will buffer (at least) 5000ms worth of encoded data. Use the
   * target bitrate (rc_target_bitrate) to convert to bits/bytes, if
   * necessary.
""")

  unsigned_int("rc_buf_initial_sz", """
Decoder Buffer Initial Size
   *
   * This value indicates the amount of data that will be buffered by the
   * decoding application prior to beginning playback. This value is
   * expressed in units of time (milliseconds). Use the target bitrate
   * (rc_target_bitrate) to convert to bits/bytes, if necessary.
""")

  unsigned_int("rc_buf_optimal_sz", """
Decoder Buffer Optimal Size
   *
   * This value indicates the amount of data that the encoder should try
   * to maintain in the decoder's buffer. This value is expressed in units
   * of time (milliseconds). Use the target bitrate (rc_target_bitrate)
   * to convert to bits/bytes, if necessary.
""")

  /*
   * 2 pass rate control parameters
   */

  unsigned_int("rc_2pass_vbr_bias_pct", """
Two-pass mode CBR/VBR bias
   *
   * Bias, expressed on a scale of 0 to 100, for determining target size
   * for the current frame. The value 0 indicates the optimal CBR mode
   * value should be used. The value 100 indicates the optimal VBR mode
   * value should be used. Values in between indicate which way the
   * encoder should "lean."
""")

  unsigned_int("rc_2pass_vbr_minsection_pct", """
Two-pass mode per-GOP minimum bitrate
   *
   * This value, expressed as a percentage of the target bitrate, indicates
   * the minimum bitrate to be used for a single GOP (aka "section")
""")

  unsigned_int("rc_2pass_vbr_maxsection_pct", """
Two-pass mode per-GOP maximum bitrate
   *
   * This value, expressed as a percentage of the target bitrate, indicates
   * the maximum bitrate to be used for a single GOP (aka "section")
""")

  unsigned_int("rc_2pass_vbr_corpus_complexity", """
Two-pass corpus vbr mode complexity control
   * Used only in VP9: A value representing the corpus midpoint complexity
   * for corpus vbr mode. This value defaults to 0 which disables corpus vbr
   * mode in favour of normal vbr mode.
""")

  /*
   * keyframing settings (kf)
   */

  vpx_kf_mode("kf_mode", """
Keyframe placement mode
   *
   * This value indicates whether the encoder should place keyframes at a
   * fixed interval, or determine the optimal placement automatically
   * (as governed by the kf_min_dist and kf_max_dist parameters)
""")

  unsigned_int("kf_min_dist", """
Keyframe minimum interval
   *
   * This value, expressed as a number of frames, prevents the encoder from
   * placing a keyframe nearer than kf_min_dist to the previous keyframe. At
   * least kf_min_dist frames non-keyframes will be coded before the next
   * keyframe. Set kf_min_dist equal to kf_max_dist for a fixed interval.
""")

  unsigned_int("kf_max_dist", """
Keyframe maximum interval
   *
   * This value, expressed as a number of frames, forces the encoder to code
   * a keyframe if one has not been coded in the last kf_max_dist frames.
   * A value of 0 implies all frames will be keyframes. Set kf_min_dist
   * equal to kf_max_dist for a fixed interval.
""")

  /*
   * Spatial scalability settings (ss)
   */
/*! Temporal Scalability: Maximum length of the sequence defining frame
 * layer membership
 */
//define VPX_TS_MAX_PERIODICITY 16

/*! Temporal Scalability: Maximum number of coding layers */
//define VPX_TS_MAX_LAYERS 5

/*! Temporal+Spatial Scalability: Maximum number of coding layers */
//define VPX_MAX_LAYERS 12  // 3 temporal + 4 spatial layers are allowed.

/*! Spatial Scalability: Maximum number of coding layers */
//define VPX_SS_MAX_LAYERS 5

/*! Spatial Scalability: Default number of coding layers */
//define VPX_SS_DEFAULT_LAYERS 1

  unsigned_int("ss_number_layers", """
Number of spatial coding layers.
   *
   * This value specifies the number of spatial coding layers to be used.
""")

//  int ss_enable_auto_alt_ref[VPX_SS_MAX_LAYERS];
  int("ss_enable_auto_alt_ref", """
Enable auto alt reference flags for each spatial layer.
   *
   * These values specify if auto alt reference frame is enabled for each
   * spatial layer.
""")[5]

//  unsigned int ss_target_bitrate[VPX_SS_MAX_LAYERS];
  unsigned_int("ss_target_bitrate", """
Target bitrate for each spatial layer.
   *
   * These values specify the target coding bitrate to be used for each
   * spatial layer. (in kbps)
""")[5]

  unsigned_int("ts_number_layers", """
Number of temporal coding layers.
   *
   * This value specifies the number of temporal layers to be used.
""")

//  unsigned int ts_target_bitrate[VPX_TS_MAX_LAYERS];
  unsigned_int("ts_target_bitrate", """
Target bitrate for each temporal layer.
   *
   * These values specify the target coding bitrate to be used for each
   * temporal layer. (in kbps)
""")[5]

//  unsigned int ts_rate_decimator[VPX_TS_MAX_LAYERS];
  unsigned_int("ts_rate_decimator", """
Frame rate decimation factor for each temporal layer.
   *
   * These values specify the frame rate decimation factors to apply
   * to each temporal layer.
""")[5]

  unsigned_int("ts_periodicity", """
Length of the sequence defining frame temporal layer membership.
   *
   * This value specifies the length of the sequence that defines the
   * membership of frames to temporal layers. For example, if the
   * ts_periodicity = 8, then the frames are assigned to coding layers with a
   * repeated sequence of length 8.
""")

//  unsigned int ts_layer_id[VPX_TS_MAX_PERIODICITY];
  unsigned_int("ts_layer_id", """
Template defining the membership of frames to temporal layers.
   *
   * This array defines the membership of frames to temporal coding layers.
   * For a 2-layer encoding that assigns even numbered frames to one temporal
   * layer (0) and odd numbered frames to a second temporal layer (1) with
   * ts_periodicity=8, then ts_layer_id = (0,1,0,1,0,1,0,1).
""")[16]

//  unsigned int layer_target_bitrate[VPX_MAX_LAYERS];
  unsigned_int("layer_target_bitrate", """
Target bitrate for each spatial/temporal layer.
   *
   * These values specify the target coding bitrate to be used for each
   * spatial/temporal layer. (in kbps)
""")[12]

  int("temporal_layering_mode", """
Temporal layering mode indicating which temporal layering scheme to
   * use.
   *
   * The value (refer to VP9E_TEMPORAL_LAYERING_MODE) specifies the
   * temporal layering mode to use.
""")
}

val vpx_codec_dec_cfg_t = struct(Module.VPX, "vpx_codec_dec_cfg_t", nativeName = "vpx_codec_dec_cfg_t") {
    documentation = """
	Initialization Configurations
 *
 * This structure is used to pass init time configuration options to the
 * decoder.
	"""
  unsigned_int("threads", "Maximum number of threads to use, default 1")
  unsigned_int("w", "Width")
  unsigned_int("h", "Height")
}

val vpx_codec_ctx_t = struct(Module.VPX, "vpx_codec_ctx_t", nativeName = "vpx_codec_ctx_t") {
    documentation = """
	Codec context structure
 *
 * All codecs \ref MUST support this context structure fully. In general,
 * this data should be considered private to the codec algorithm, and
 * not be manipulated or examined by the calling application. Applications
 * may reference the 'name' member to get a printable description of the
 * algorithm.
	"""
  char.const.p("name", "Printable interface name")
  vpx_codec_iface_t.p("iface", "Interface pointers")
  vpx_codec_err_t("err", "Last returned error")
  char.const.p("err_detail", "Detailed info, if available")
  long("init_flags", "Flags passed at init time")
  union {
    vpx_codec_dec_cfg_t.const.p("dec", "Decoder Configuration Pointer")
    vpx_codec_enc_cfg_t.const.p("enc", "Encoder Configuration Pointer")
    void.const.p("raw", "")
  }// config;               /**< Configuration pointer aliasing union */
  "vpx_codec_priv_t".opaque.p("priv", "Algorithm private storage")
}

val vpx_codec_cx_pkt_t = struct(Module.VPX, "vpx_codec_cx_pkt_t", nativeName = "vpx_codec_cx_pkt_t") {
    documentation = """
	Encoder output packet
 *
 * This structure contains the different kinds of output data the encoder
 * may produce while compressing a frame.
	"""
  "vpx_codec_cx_pkt_kind".enumType("kind", "packet variant")
  union {
    struct {
      void.p("buf", "compressed data buffer")
      size_t("sz", "length of compressed data")
      vpx_codec_pts_t("pts", "time stamp to show frame (in timebase units)")
      unsigned_long("duration", "brief duration to show frame (in timebase units)")
      vpx_codec_frame_flags_t("flags", "flags for this frame")
      int("partition_id", """
	the partition id defines the decoding order of the partitions.
       * Only applicable when "output partition" mode is enabled. First
       * partition has id 0.""")
      unsigned_int("width", "frame width. Width and height of frames in this packet. VP8 will only use the first one.")[5]//[VPX_SS_MAX_LAYERS]
      unsigned_int("height", "frame height")[5]//[VPX_SS_MAX_LAYERS]
      uint8_t("spatial_layer_encoded", """
	Flag to indicate if spatial layer frame in this packet is
       * encoded or dropped. VP8 will always be set to 1.""")[5]//[VPX_SS_MAX_LAYERS]
    }// frame;                            /**< data for compressed frame packet */
    vpx_fixed_buf_t("twopass_stats", "data for two-pass packet")
    vpx_fixed_buf_t("firstpass_mb_stats", "first pass mb packet")
    struct(Module.VPX, "vpx_psnr_pkt", nativeName = "vpx_psnr_pkt") {
      unsigned_int("samples", "Number of samples, total/y/u/v")[4]
      uint64_t("sse", "sum squared error, total/y/u/v")[4]
      double("psnr", "PSNR, total/y/u/v")[4]
    }// psnr;                    /**< data for PSNR packet */
    vpx_fixed_buf_t("raw", "data for arbitrary packets")

    /* This packet size is fixed to allow codecs to extend this
     * interface without having to manage storage for raw packets,
     * i.e., if it's smaller than 128 bytes, you can store in the
     * packet list directly.
     */
    //char pad[128 - sizeof(enum vpx_codec_cx_pkt_kind)]; /**< fixed sz */
  }// data;                                               /**< packet data */
}