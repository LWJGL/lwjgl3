/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vpx;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Encoder configuration structure
 *
 * This structure contains the encoder settings that have common representations
 * across all codecs. This doesn't imply that all codecs support all features,
 * however.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code g_usage} &ndash; Deprecated: Algorithm specific usage value. This value must be zero.</li>
 * <li>{@code g_threads} &ndash; 
Maximum number of threads to use
   *
   * For multi-threaded implementations, use no more than this number of
   * threads. The codec may use fewer threads than allowed. The value
   * 0 is equivalent to the value 1.</li>
 * <li>{@code g_profile} &ndash; 
Bitstream profile to use
   *
   * Some codecs support a notion of multiple bitstream profiles. Typically
   * this maps to a set of features that are turned on or off. Often the
   * profile to use is determined by the features of the intended decoder.
   * Consult the documentation for the codec to determine the valid values
   * for this parameter, or set to zero for a sane default.</li>
 * <li>{@code g_w} &ndash; 
Width of the frame
   *
   * This value identifies the presentation resolution of the frame,
   * in pixels. Note that the frames passed as input to the encoder must
   * have this resolution. Frames will be presented by the decoder in this
   * resolution, independent of any spatial resampling the encoder may do.</li>
 * <li>{@code g_h} &ndash; 
Height of the frame
   *
   * This value identifies the presentation resolution of the frame,
   * in pixels. Note that the frames passed as input to the encoder must
   * have this resolution. Frames will be presented by the decoder in this
   * resolution, independent of any spatial resampling the encoder may do.</li>
 * <li>{@code g_bit_depth} &ndash; 
Bit-depth of the codec
   *
   * This value identifies the bit_depth of the codec,
   * Only certain bit-depths are supported as identified in the
   * vpx_bit_depth_t enum.</li>
 * <li>{@code g_input_bit_depth} &ndash; 
Bit-depth of the input frames
   *
   * This value identifies the bit_depth of the input frames in bits.
   * Note that the frames passed as input to the encoder must have
   * this bit-depth.</li>
 * <li>{@code g_timebase} &ndash; 
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
   * container or multimedia framework (ex: 1/1000 for ms, as in FLV).</li>
 * <li>{@code g_error_resilient} &ndash; 
Enable error resilient modes.
   *
   * The error resilient bitfield indicates to the encoder which features
   * it should enable to take measures for streaming over lossy or noisy
   * links.</li>
 * <li>{@code g_pass} &ndash; 
Multi-pass Encoding Mode
   *
   * This value should be set to the current phase for multi-pass encoding.
   * For single pass, set to VPX_RC_ONE_PASS.</li>
 * <li>{@code g_lag_in_frames} &ndash; 
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
   * feature.</li>
 * <li>{@code rc_dropframe_thresh} &ndash; 
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
   * this feature.</li>
 * <li>{@code rc_resize_allowed} &ndash; 
Enable/disable spatial resampling, if supported by the codec.
   *
   * Spatial resampling allows the codec to compress a lower resolution
   * version of the frame, which is then upscaled by the encoder to the
   * correct presentation resolution. This increases visual quality at
   * low data rates, at the expense of CPU time on the encoder/decoder.</li>
 * <li>{@code rc_scaled_width} &ndash; 
Internal coded frame width.
   *
   * If spatial resampling is enabled this specifies the width of the
   * encoded frame.</li>
 * <li>{@code rc_scaled_height} &ndash; 
Internal coded frame height.
   *
   * If spatial resampling is enabled this specifies the height of the
   * encoded frame.</li>
 * <li>{@code rc_resize_up_thresh} &ndash; 
Spatial resampling up watermark.
   *
   * This threshold is described as a percentage of the target data buffer.
   * When the data buffer rises above this percentage of fullness, the
   * encoder will step up to a higher resolution version of the frame.</li>
 * <li>{@code rc_resize_down_thresh} &ndash; 
Spatial resampling down watermark.
   *
   * This threshold is described as a percentage of the target data buffer.
   * When the data buffer falls below this percentage of fullness, the
   * encoder will step down to a lower resolution version of the frame.</li>
 * <li>{@code rc_end_usage} &ndash; 
Rate control algorithm to use.
   *
   * Indicates whether the end usage of this stream is to be streamed over
   * a bandwidth constrained link, indicating that Constant Bit Rate (CBR)
   * mode should be used, or whether it will be played back on a high
   * bandwidth link, as from a local disk, where higher variations in
   * bitrate are acceptable.</li>
 * <li>{@code rc_twopass_stats_in} &ndash; 
Two-pass stats buffer.
   *
   * A buffer containing all of the stats packets produced in the first
   * pass, concatenated.</li>
 * <li>{@code rc_firstpass_mb_stats_in} &ndash; 
first pass mb stats buffer.
   *
   * A buffer containing all of the first pass mb stats packets produced
   * in the first pass, concatenated.</li>
 * <li>{@code rc_target_bitrate} &ndash; 
Target data rate
   *
   * Target bandwidth to use for this stream, in kilobits per second.</li>
 * <li>{@code rc_min_quantizer} &ndash; 
Minimum (Best Quality) Quantizer
   *
   * The quantizer is the most direct control over the quality of the
   * encoded image. The range of valid values for the quantizer is codec
   * specific. Consult the documentation for the codec to determine the
   * values to use.</li>
 * <li>{@code rc_max_quantizer} &ndash; 
Maximum (Worst Quality) Quantizer
   *
   * The quantizer is the most direct control over the quality of the
   * encoded image. The range of valid values for the quantizer is codec
   * specific. Consult the documentation for the codec to determine the
   * values to use.</li>
 * <li>{@code rc_undershoot_pct} &ndash; 
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
   * Valid values in the range VP8:0-1000 VP9: 0-100.</li>
 * <li>{@code rc_overshoot_pct} &ndash; 
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
   * Valid values in the range VP8:0-1000 VP9: 0-100.</li>
 * <li>{@code rc_buf_sz} &ndash; 
Decoder Buffer Size
   *
   * This value indicates the amount of data that may be buffered by the
   * decoding application. Note that this value is expressed in units of
   * time (milliseconds). For example, a value of 5000 indicates that the
   * client will buffer (at least) 5000ms worth of encoded data. Use the
   * target bitrate (rc_target_bitrate) to convert to bits/bytes, if
   * necessary.</li>
 * <li>{@code rc_buf_initial_sz} &ndash; 
Decoder Buffer Initial Size
   *
   * This value indicates the amount of data that will be buffered by the
   * decoding application prior to beginning playback. This value is
   * expressed in units of time (milliseconds). Use the target bitrate
   * (rc_target_bitrate) to convert to bits/bytes, if necessary.</li>
 * <li>{@code rc_buf_optimal_sz} &ndash; 
Decoder Buffer Optimal Size
   *
   * This value indicates the amount of data that the encoder should try
   * to maintain in the decoder's buffer. This value is expressed in units
   * of time (milliseconds). Use the target bitrate (rc_target_bitrate)
   * to convert to bits/bytes, if necessary.</li>
 * <li>{@code rc_2pass_vbr_bias_pct} &ndash; 
Two-pass mode CBR/VBR bias
   *
   * Bias, expressed on a scale of 0 to 100, for determining target size
   * for the current frame. The value 0 indicates the optimal CBR mode
   * value should be used. The value 100 indicates the optimal VBR mode
   * value should be used. Values in between indicate which way the
   * encoder should "lean."</li>
 * <li>{@code rc_2pass_vbr_minsection_pct} &ndash; 
Two-pass mode per-GOP minimum bitrate
   *
   * This value, expressed as a percentage of the target bitrate, indicates
   * the minimum bitrate to be used for a single GOP (aka "section")</li>
 * <li>{@code rc_2pass_vbr_maxsection_pct} &ndash; 
Two-pass mode per-GOP maximum bitrate
   *
   * This value, expressed as a percentage of the target bitrate, indicates
   * the maximum bitrate to be used for a single GOP (aka "section")</li>
 * <li>{@code rc_2pass_vbr_corpus_complexity} &ndash; 
Two-pass corpus vbr mode complexity control
   * Used only in VP9: A value representing the corpus midpoint complexity
   * for corpus vbr mode. This value defaults to 0 which disables corpus vbr
   * mode in favour of normal vbr mode.</li>
 * <li>{@code kf_mode} &ndash; 
Keyframe placement mode
   *
   * This value indicates whether the encoder should place keyframes at a
   * fixed interval, or determine the optimal placement automatically
   * (as governed by the kf_min_dist and kf_max_dist parameters)</li>
 * <li>{@code kf_min_dist} &ndash; 
Keyframe minimum interval
   *
   * This value, expressed as a number of frames, prevents the encoder from
   * placing a keyframe nearer than kf_min_dist to the previous keyframe. At
   * least kf_min_dist frames non-keyframes will be coded before the next
   * keyframe. Set kf_min_dist equal to kf_max_dist for a fixed interval.</li>
 * <li>{@code kf_max_dist} &ndash; 
Keyframe maximum interval
   *
   * This value, expressed as a number of frames, forces the encoder to code
   * a keyframe if one has not been coded in the last kf_max_dist frames.
   * A value of 0 implies all frames will be keyframes. Set kf_min_dist
   * equal to kf_max_dist for a fixed interval.</li>
 * <li>{@code ss_number_layers} &ndash; 
Number of spatial coding layers.
   *
   * This value specifies the number of spatial coding layers to be used.</li>
 * <li>{@code ss_enable_auto_alt_ref[5]} &ndash; 
Enable auto alt reference flags for each spatial layer.
   *
   * These values specify if auto alt reference frame is enabled for each
   * spatial layer.</li>
 * <li>{@code ss_target_bitrate[5]} &ndash; 
Target bitrate for each spatial layer.
   *
   * These values specify the target coding bitrate to be used for each
   * spatial layer. (in kbps)</li>
 * <li>{@code ts_number_layers} &ndash; 
Number of temporal coding layers.
   *
   * This value specifies the number of temporal layers to be used.</li>
 * <li>{@code ts_target_bitrate[5]} &ndash; 
Target bitrate for each temporal layer.
   *
   * These values specify the target coding bitrate to be used for each
   * temporal layer. (in kbps)</li>
 * <li>{@code ts_rate_decimator[5]} &ndash; 
Frame rate decimation factor for each temporal layer.
   *
   * These values specify the frame rate decimation factors to apply
   * to each temporal layer.</li>
 * <li>{@code ts_periodicity} &ndash; 
Length of the sequence defining frame temporal layer membership.
   *
   * This value specifies the length of the sequence that defines the
   * membership of frames to temporal layers. For example, if the
   * ts_periodicity = 8, then the frames are assigned to coding layers with a
   * repeated sequence of length 8.</li>
 * <li>{@code ts_layer_id[16]} &ndash; 
Template defining the membership of frames to temporal layers.
   *
   * This array defines the membership of frames to temporal coding layers.
   * For a 2-layer encoding that assigns even numbered frames to one temporal
   * layer (0) and odd numbered frames to a second temporal layer (1) with
   * ts_periodicity=8, then ts_layer_id = (0,1,0,1,0,1,0,1).</li>
 * <li>{@code layer_target_bitrate[12]} &ndash; 
Target bitrate for each spatial/temporal layer.
   *
   * These values specify the target coding bitrate to be used for each
   * spatial/temporal layer. (in kbps)</li>
 * <li>{@code temporal_layering_mode} &ndash; 
Temporal layering mode indicating which temporal layering scheme to
   * use.
   *
   * The value (refer to VP9E_TEMPORAL_LAYERING_MODE) specifies the
   * temporal layering mode to use.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct vpx_codec_enc_cfg_t {
 *     unsigned int g_usage;
 *     unsigned int g_threads;
 *     unsigned int g_profile;
 *     unsigned int g_w;
 *     unsigned int g_h;
 *     vpx_bit_depth g_bit_depth;
 *     unsigned int g_input_bit_depth;
 *     {@link vpx_rational vpx_rational} g_timebase;
 *     uint32_t g_error_resilient;
 *     vpx_enc_pass g_pass;
 *     unsigned int g_lag_in_frames;
 *     unsigned int rc_dropframe_thresh;
 *     unsigned int rc_resize_allowed;
 *     unsigned int rc_scaled_width;
 *     unsigned int rc_scaled_height;
 *     unsigned int rc_resize_up_thresh;
 *     unsigned int rc_resize_down_thresh;
 *     vpx_rc_mode rc_end_usage;
 *     {@link vpx_fixed_buf_t vpx_fixed_buf_t} rc_twopass_stats_in;
 *     {@link vpx_fixed_buf_t vpx_fixed_buf_t} rc_firstpass_mb_stats_in;
 *     unsigned int rc_target_bitrate;
 *     unsigned int rc_min_quantizer;
 *     unsigned int rc_max_quantizer;
 *     unsigned int rc_undershoot_pct;
 *     unsigned int rc_overshoot_pct;
 *     unsigned int rc_buf_sz;
 *     unsigned int rc_buf_initial_sz;
 *     unsigned int rc_buf_optimal_sz;
 *     unsigned int rc_2pass_vbr_bias_pct;
 *     unsigned int rc_2pass_vbr_minsection_pct;
 *     unsigned int rc_2pass_vbr_maxsection_pct;
 *     unsigned int rc_2pass_vbr_corpus_complexity;
 *     vpx_kf_mode kf_mode;
 *     unsigned int kf_min_dist;
 *     unsigned int kf_max_dist;
 *     unsigned int ss_number_layers;
 *     int ss_enable_auto_alt_ref[5];
 *     unsigned int ss_target_bitrate[5];
 *     unsigned int ts_number_layers;
 *     unsigned int ts_target_bitrate[5];
 *     unsigned int ts_rate_decimator[5];
 *     unsigned int ts_periodicity;
 *     unsigned int ts_layer_id[16];
 *     unsigned int layer_target_bitrate[12];
 *     int temporal_layering_mode;
 * }</code></pre>
 */
public class vpx_codec_enc_cfg_t extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        G_USAGE,
        G_THREADS,
        G_PROFILE,
        G_W,
        G_H,
        G_BIT_DEPTH,
        G_INPUT_BIT_DEPTH,
        G_TIMEBASE,
        G_ERROR_RESILIENT,
        G_PASS,
        G_LAG_IN_FRAMES,
        RC_DROPFRAME_THRESH,
        RC_RESIZE_ALLOWED,
        RC_SCALED_WIDTH,
        RC_SCALED_HEIGHT,
        RC_RESIZE_UP_THRESH,
        RC_RESIZE_DOWN_THRESH,
        RC_END_USAGE,
        RC_TWOPASS_STATS_IN,
        RC_FIRSTPASS_MB_STATS_IN,
        RC_TARGET_BITRATE,
        RC_MIN_QUANTIZER,
        RC_MAX_QUANTIZER,
        RC_UNDERSHOOT_PCT,
        RC_OVERSHOOT_PCT,
        RC_BUF_SZ,
        RC_BUF_INITIAL_SZ,
        RC_BUF_OPTIMAL_SZ,
        RC_2PASS_VBR_BIAS_PCT,
        RC_2PASS_VBR_MINSECTION_PCT,
        RC_2PASS_VBR_MAXSECTION_PCT,
        RC_2PASS_VBR_CORPUS_COMPLEXITY,
        KF_MODE,
        KF_MIN_DIST,
        KF_MAX_DIST,
        SS_NUMBER_LAYERS,
        SS_ENABLE_AUTO_ALT_REF,
        SS_TARGET_BITRATE,
        TS_NUMBER_LAYERS,
        TS_TARGET_BITRATE,
        TS_RATE_DECIMATOR,
        TS_PERIODICITY,
        TS_LAYER_ID,
        LAYER_TARGET_BITRATE,
        TEMPORAL_LAYERING_MODE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(vpx_rational.SIZEOF, vpx_rational.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(vpx_fixed_buf_t.SIZEOF, vpx_fixed_buf_t.ALIGNOF),
            __member(vpx_fixed_buf_t.SIZEOF, vpx_fixed_buf_t.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 5),
            __array(4, 5),
            __member(4),
            __array(4, 5),
            __array(4, 5),
            __member(4),
            __array(4, 16),
            __array(4, 12),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        G_USAGE = layout.offsetof(0);
        G_THREADS = layout.offsetof(1);
        G_PROFILE = layout.offsetof(2);
        G_W = layout.offsetof(3);
        G_H = layout.offsetof(4);
        G_BIT_DEPTH = layout.offsetof(5);
        G_INPUT_BIT_DEPTH = layout.offsetof(6);
        G_TIMEBASE = layout.offsetof(7);
        G_ERROR_RESILIENT = layout.offsetof(8);
        G_PASS = layout.offsetof(9);
        G_LAG_IN_FRAMES = layout.offsetof(10);
        RC_DROPFRAME_THRESH = layout.offsetof(11);
        RC_RESIZE_ALLOWED = layout.offsetof(12);
        RC_SCALED_WIDTH = layout.offsetof(13);
        RC_SCALED_HEIGHT = layout.offsetof(14);
        RC_RESIZE_UP_THRESH = layout.offsetof(15);
        RC_RESIZE_DOWN_THRESH = layout.offsetof(16);
        RC_END_USAGE = layout.offsetof(17);
        RC_TWOPASS_STATS_IN = layout.offsetof(18);
        RC_FIRSTPASS_MB_STATS_IN = layout.offsetof(19);
        RC_TARGET_BITRATE = layout.offsetof(20);
        RC_MIN_QUANTIZER = layout.offsetof(21);
        RC_MAX_QUANTIZER = layout.offsetof(22);
        RC_UNDERSHOOT_PCT = layout.offsetof(23);
        RC_OVERSHOOT_PCT = layout.offsetof(24);
        RC_BUF_SZ = layout.offsetof(25);
        RC_BUF_INITIAL_SZ = layout.offsetof(26);
        RC_BUF_OPTIMAL_SZ = layout.offsetof(27);
        RC_2PASS_VBR_BIAS_PCT = layout.offsetof(28);
        RC_2PASS_VBR_MINSECTION_PCT = layout.offsetof(29);
        RC_2PASS_VBR_MAXSECTION_PCT = layout.offsetof(30);
        RC_2PASS_VBR_CORPUS_COMPLEXITY = layout.offsetof(31);
        KF_MODE = layout.offsetof(32);
        KF_MIN_DIST = layout.offsetof(33);
        KF_MAX_DIST = layout.offsetof(34);
        SS_NUMBER_LAYERS = layout.offsetof(35);
        SS_ENABLE_AUTO_ALT_REF = layout.offsetof(36);
        SS_TARGET_BITRATE = layout.offsetof(37);
        TS_NUMBER_LAYERS = layout.offsetof(38);
        TS_TARGET_BITRATE = layout.offsetof(39);
        TS_RATE_DECIMATOR = layout.offsetof(40);
        TS_PERIODICITY = layout.offsetof(41);
        TS_LAYER_ID = layout.offsetof(42);
        LAYER_TARGET_BITRATE = layout.offsetof(43);
        TEMPORAL_LAYERING_MODE = layout.offsetof(44);
    }

    /**
     * Creates a {@code vpx_codec_enc_cfg_t} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public vpx_codec_enc_cfg_t(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code g_usage} field. */
    @NativeType("unsigned int")
    public int g_usage() { return ng_usage(address()); }
    /** Returns the value of the {@code g_threads} field. */
    @NativeType("unsigned int")
    public int g_threads() { return ng_threads(address()); }
    /** Returns the value of the {@code g_profile} field. */
    @NativeType("unsigned int")
    public int g_profile() { return ng_profile(address()); }
    /** Returns the value of the {@code g_w} field. */
    @NativeType("unsigned int")
    public int g_w() { return ng_w(address()); }
    /** Returns the value of the {@code g_h} field. */
    @NativeType("unsigned int")
    public int g_h() { return ng_h(address()); }
    /** Returns the value of the {@code g_bit_depth} field. */
    @NativeType("vpx_bit_depth")
    public int g_bit_depth() { return ng_bit_depth(address()); }
    /** Returns the value of the {@code g_input_bit_depth} field. */
    @NativeType("unsigned int")
    public int g_input_bit_depth() { return ng_input_bit_depth(address()); }
    /** Returns a {@link vpx_rational} view of the {@code g_timebase} field. */
    public vpx_rational g_timebase() { return ng_timebase(address()); }
    /** Returns the value of the {@code g_error_resilient} field. */
    @NativeType("uint32_t")
    public int g_error_resilient() { return ng_error_resilient(address()); }
    /** Returns the value of the {@code g_pass} field. */
    @NativeType("vpx_enc_pass")
    public int g_pass() { return ng_pass(address()); }
    /** Returns the value of the {@code g_lag_in_frames} field. */
    @NativeType("unsigned int")
    public int g_lag_in_frames() { return ng_lag_in_frames(address()); }
    /** Returns the value of the {@code rc_dropframe_thresh} field. */
    @NativeType("unsigned int")
    public int rc_dropframe_thresh() { return nrc_dropframe_thresh(address()); }
    /** Returns the value of the {@code rc_resize_allowed} field. */
    @NativeType("unsigned int")
    public int rc_resize_allowed() { return nrc_resize_allowed(address()); }
    /** Returns the value of the {@code rc_scaled_width} field. */
    @NativeType("unsigned int")
    public int rc_scaled_width() { return nrc_scaled_width(address()); }
    /** Returns the value of the {@code rc_scaled_height} field. */
    @NativeType("unsigned int")
    public int rc_scaled_height() { return nrc_scaled_height(address()); }
    /** Returns the value of the {@code rc_resize_up_thresh} field. */
    @NativeType("unsigned int")
    public int rc_resize_up_thresh() { return nrc_resize_up_thresh(address()); }
    /** Returns the value of the {@code rc_resize_down_thresh} field. */
    @NativeType("unsigned int")
    public int rc_resize_down_thresh() { return nrc_resize_down_thresh(address()); }
    /** Returns the value of the {@code rc_end_usage} field. */
    @NativeType("vpx_rc_mode")
    public int rc_end_usage() { return nrc_end_usage(address()); }
    /** Returns a {@link vpx_fixed_buf_t} view of the {@code rc_twopass_stats_in} field. */
    public vpx_fixed_buf_t rc_twopass_stats_in() { return nrc_twopass_stats_in(address()); }
    /** Returns a {@link vpx_fixed_buf_t} view of the {@code rc_firstpass_mb_stats_in} field. */
    public vpx_fixed_buf_t rc_firstpass_mb_stats_in() { return nrc_firstpass_mb_stats_in(address()); }
    /** Returns the value of the {@code rc_target_bitrate} field. */
    @NativeType("unsigned int")
    public int rc_target_bitrate() { return nrc_target_bitrate(address()); }
    /** Returns the value of the {@code rc_min_quantizer} field. */
    @NativeType("unsigned int")
    public int rc_min_quantizer() { return nrc_min_quantizer(address()); }
    /** Returns the value of the {@code rc_max_quantizer} field. */
    @NativeType("unsigned int")
    public int rc_max_quantizer() { return nrc_max_quantizer(address()); }
    /** Returns the value of the {@code rc_undershoot_pct} field. */
    @NativeType("unsigned int")
    public int rc_undershoot_pct() { return nrc_undershoot_pct(address()); }
    /** Returns the value of the {@code rc_overshoot_pct} field. */
    @NativeType("unsigned int")
    public int rc_overshoot_pct() { return nrc_overshoot_pct(address()); }
    /** Returns the value of the {@code rc_buf_sz} field. */
    @NativeType("unsigned int")
    public int rc_buf_sz() { return nrc_buf_sz(address()); }
    /** Returns the value of the {@code rc_buf_initial_sz} field. */
    @NativeType("unsigned int")
    public int rc_buf_initial_sz() { return nrc_buf_initial_sz(address()); }
    /** Returns the value of the {@code rc_buf_optimal_sz} field. */
    @NativeType("unsigned int")
    public int rc_buf_optimal_sz() { return nrc_buf_optimal_sz(address()); }
    /** Returns the value of the {@code rc_2pass_vbr_bias_pct} field. */
    @NativeType("unsigned int")
    public int rc_2pass_vbr_bias_pct() { return nrc_2pass_vbr_bias_pct(address()); }
    /** Returns the value of the {@code rc_2pass_vbr_minsection_pct} field. */
    @NativeType("unsigned int")
    public int rc_2pass_vbr_minsection_pct() { return nrc_2pass_vbr_minsection_pct(address()); }
    /** Returns the value of the {@code rc_2pass_vbr_maxsection_pct} field. */
    @NativeType("unsigned int")
    public int rc_2pass_vbr_maxsection_pct() { return nrc_2pass_vbr_maxsection_pct(address()); }
    /** Returns the value of the {@code rc_2pass_vbr_corpus_complexity} field. */
    @NativeType("unsigned int")
    public int rc_2pass_vbr_corpus_complexity() { return nrc_2pass_vbr_corpus_complexity(address()); }
    /** Returns the value of the {@code kf_mode} field. */
    @NativeType("vpx_kf_mode")
    public int kf_mode() { return nkf_mode(address()); }
    /** Returns the value of the {@code kf_min_dist} field. */
    @NativeType("unsigned int")
    public int kf_min_dist() { return nkf_min_dist(address()); }
    /** Returns the value of the {@code kf_max_dist} field. */
    @NativeType("unsigned int")
    public int kf_max_dist() { return nkf_max_dist(address()); }
    /** Returns the value of the {@code ss_number_layers} field. */
    @NativeType("unsigned int")
    public int ss_number_layers() { return nss_number_layers(address()); }
    /** Returns a {@link IntBuffer} view of the {@code ss_enable_auto_alt_ref} field. */
    @NativeType("int[5]")
    public IntBuffer ss_enable_auto_alt_ref() { return nss_enable_auto_alt_ref(address()); }
    /** Returns the value at the specified index of the {@code ss_enable_auto_alt_ref} field. */
    public int ss_enable_auto_alt_ref(int index) { return nss_enable_auto_alt_ref(address(), index); }
    /** Returns a {@link IntBuffer} view of the {@code ss_target_bitrate} field. */
    @NativeType("unsigned int[5]")
    public IntBuffer ss_target_bitrate() { return nss_target_bitrate(address()); }
    /** Returns the value at the specified index of the {@code ss_target_bitrate} field. */
    @NativeType("unsigned int")
    public int ss_target_bitrate(int index) { return nss_target_bitrate(address(), index); }
    /** Returns the value of the {@code ts_number_layers} field. */
    @NativeType("unsigned int")
    public int ts_number_layers() { return nts_number_layers(address()); }
    /** Returns a {@link IntBuffer} view of the {@code ts_target_bitrate} field. */
    @NativeType("unsigned int[5]")
    public IntBuffer ts_target_bitrate() { return nts_target_bitrate(address()); }
    /** Returns the value at the specified index of the {@code ts_target_bitrate} field. */
    @NativeType("unsigned int")
    public int ts_target_bitrate(int index) { return nts_target_bitrate(address(), index); }
    /** Returns a {@link IntBuffer} view of the {@code ts_rate_decimator} field. */
    @NativeType("unsigned int[5]")
    public IntBuffer ts_rate_decimator() { return nts_rate_decimator(address()); }
    /** Returns the value at the specified index of the {@code ts_rate_decimator} field. */
    @NativeType("unsigned int")
    public int ts_rate_decimator(int index) { return nts_rate_decimator(address(), index); }
    /** Returns the value of the {@code ts_periodicity} field. */
    @NativeType("unsigned int")
    public int ts_periodicity() { return nts_periodicity(address()); }
    /** Returns a {@link IntBuffer} view of the {@code ts_layer_id} field. */
    @NativeType("unsigned int[16]")
    public IntBuffer ts_layer_id() { return nts_layer_id(address()); }
    /** Returns the value at the specified index of the {@code ts_layer_id} field. */
    @NativeType("unsigned int")
    public int ts_layer_id(int index) { return nts_layer_id(address(), index); }
    /** Returns a {@link IntBuffer} view of the {@code layer_target_bitrate} field. */
    @NativeType("unsigned int[12]")
    public IntBuffer layer_target_bitrate() { return nlayer_target_bitrate(address()); }
    /** Returns the value at the specified index of the {@code layer_target_bitrate} field. */
    @NativeType("unsigned int")
    public int layer_target_bitrate(int index) { return nlayer_target_bitrate(address(), index); }
    /** Returns the value of the {@code temporal_layering_mode} field. */
    public int temporal_layering_mode() { return ntemporal_layering_mode(address()); }

    /** Sets the specified value to the {@code g_usage} field. */
    public vpx_codec_enc_cfg_t g_usage(@NativeType("unsigned int") int value) { ng_usage(address(), value); return this; }
    /** Sets the specified value to the {@code g_threads} field. */
    public vpx_codec_enc_cfg_t g_threads(@NativeType("unsigned int") int value) { ng_threads(address(), value); return this; }
    /** Sets the specified value to the {@code g_profile} field. */
    public vpx_codec_enc_cfg_t g_profile(@NativeType("unsigned int") int value) { ng_profile(address(), value); return this; }
    /** Sets the specified value to the {@code g_w} field. */
    public vpx_codec_enc_cfg_t g_w(@NativeType("unsigned int") int value) { ng_w(address(), value); return this; }
    /** Sets the specified value to the {@code g_h} field. */
    public vpx_codec_enc_cfg_t g_h(@NativeType("unsigned int") int value) { ng_h(address(), value); return this; }
    /** Sets the specified value to the {@code g_bit_depth} field. */
    public vpx_codec_enc_cfg_t g_bit_depth(@NativeType("vpx_bit_depth") int value) { ng_bit_depth(address(), value); return this; }
    /** Sets the specified value to the {@code g_input_bit_depth} field. */
    public vpx_codec_enc_cfg_t g_input_bit_depth(@NativeType("unsigned int") int value) { ng_input_bit_depth(address(), value); return this; }
    /** Copies the specified {@link vpx_rational} to the {@code g_timebase} field. */
    public vpx_codec_enc_cfg_t g_timebase(vpx_rational value) { ng_timebase(address(), value); return this; }
    /** Passes the {@code g_timebase} field to the specified {@link java.util.function.Consumer Consumer}. */
    public vpx_codec_enc_cfg_t g_timebase(java.util.function.Consumer<vpx_rational> consumer) { consumer.accept(g_timebase()); return this; }
    /** Sets the specified value to the {@code g_error_resilient} field. */
    public vpx_codec_enc_cfg_t g_error_resilient(@NativeType("uint32_t") int value) { ng_error_resilient(address(), value); return this; }
    /** Sets the specified value to the {@code g_pass} field. */
    public vpx_codec_enc_cfg_t g_pass(@NativeType("vpx_enc_pass") int value) { ng_pass(address(), value); return this; }
    /** Sets the specified value to the {@code g_lag_in_frames} field. */
    public vpx_codec_enc_cfg_t g_lag_in_frames(@NativeType("unsigned int") int value) { ng_lag_in_frames(address(), value); return this; }
    /** Sets the specified value to the {@code rc_dropframe_thresh} field. */
    public vpx_codec_enc_cfg_t rc_dropframe_thresh(@NativeType("unsigned int") int value) { nrc_dropframe_thresh(address(), value); return this; }
    /** Sets the specified value to the {@code rc_resize_allowed} field. */
    public vpx_codec_enc_cfg_t rc_resize_allowed(@NativeType("unsigned int") int value) { nrc_resize_allowed(address(), value); return this; }
    /** Sets the specified value to the {@code rc_scaled_width} field. */
    public vpx_codec_enc_cfg_t rc_scaled_width(@NativeType("unsigned int") int value) { nrc_scaled_width(address(), value); return this; }
    /** Sets the specified value to the {@code rc_scaled_height} field. */
    public vpx_codec_enc_cfg_t rc_scaled_height(@NativeType("unsigned int") int value) { nrc_scaled_height(address(), value); return this; }
    /** Sets the specified value to the {@code rc_resize_up_thresh} field. */
    public vpx_codec_enc_cfg_t rc_resize_up_thresh(@NativeType("unsigned int") int value) { nrc_resize_up_thresh(address(), value); return this; }
    /** Sets the specified value to the {@code rc_resize_down_thresh} field. */
    public vpx_codec_enc_cfg_t rc_resize_down_thresh(@NativeType("unsigned int") int value) { nrc_resize_down_thresh(address(), value); return this; }
    /** Sets the specified value to the {@code rc_end_usage} field. */
    public vpx_codec_enc_cfg_t rc_end_usage(@NativeType("vpx_rc_mode") int value) { nrc_end_usage(address(), value); return this; }
    /** Copies the specified {@link vpx_fixed_buf_t} to the {@code rc_twopass_stats_in} field. */
    public vpx_codec_enc_cfg_t rc_twopass_stats_in(vpx_fixed_buf_t value) { nrc_twopass_stats_in(address(), value); return this; }
    /** Passes the {@code rc_twopass_stats_in} field to the specified {@link java.util.function.Consumer Consumer}. */
    public vpx_codec_enc_cfg_t rc_twopass_stats_in(java.util.function.Consumer<vpx_fixed_buf_t> consumer) { consumer.accept(rc_twopass_stats_in()); return this; }
    /** Copies the specified {@link vpx_fixed_buf_t} to the {@code rc_firstpass_mb_stats_in} field. */
    public vpx_codec_enc_cfg_t rc_firstpass_mb_stats_in(vpx_fixed_buf_t value) { nrc_firstpass_mb_stats_in(address(), value); return this; }
    /** Passes the {@code rc_firstpass_mb_stats_in} field to the specified {@link java.util.function.Consumer Consumer}. */
    public vpx_codec_enc_cfg_t rc_firstpass_mb_stats_in(java.util.function.Consumer<vpx_fixed_buf_t> consumer) { consumer.accept(rc_firstpass_mb_stats_in()); return this; }
    /** Sets the specified value to the {@code rc_target_bitrate} field. */
    public vpx_codec_enc_cfg_t rc_target_bitrate(@NativeType("unsigned int") int value) { nrc_target_bitrate(address(), value); return this; }
    /** Sets the specified value to the {@code rc_min_quantizer} field. */
    public vpx_codec_enc_cfg_t rc_min_quantizer(@NativeType("unsigned int") int value) { nrc_min_quantizer(address(), value); return this; }
    /** Sets the specified value to the {@code rc_max_quantizer} field. */
    public vpx_codec_enc_cfg_t rc_max_quantizer(@NativeType("unsigned int") int value) { nrc_max_quantizer(address(), value); return this; }
    /** Sets the specified value to the {@code rc_undershoot_pct} field. */
    public vpx_codec_enc_cfg_t rc_undershoot_pct(@NativeType("unsigned int") int value) { nrc_undershoot_pct(address(), value); return this; }
    /** Sets the specified value to the {@code rc_overshoot_pct} field. */
    public vpx_codec_enc_cfg_t rc_overshoot_pct(@NativeType("unsigned int") int value) { nrc_overshoot_pct(address(), value); return this; }
    /** Sets the specified value to the {@code rc_buf_sz} field. */
    public vpx_codec_enc_cfg_t rc_buf_sz(@NativeType("unsigned int") int value) { nrc_buf_sz(address(), value); return this; }
    /** Sets the specified value to the {@code rc_buf_initial_sz} field. */
    public vpx_codec_enc_cfg_t rc_buf_initial_sz(@NativeType("unsigned int") int value) { nrc_buf_initial_sz(address(), value); return this; }
    /** Sets the specified value to the {@code rc_buf_optimal_sz} field. */
    public vpx_codec_enc_cfg_t rc_buf_optimal_sz(@NativeType("unsigned int") int value) { nrc_buf_optimal_sz(address(), value); return this; }
    /** Sets the specified value to the {@code rc_2pass_vbr_bias_pct} field. */
    public vpx_codec_enc_cfg_t rc_2pass_vbr_bias_pct(@NativeType("unsigned int") int value) { nrc_2pass_vbr_bias_pct(address(), value); return this; }
    /** Sets the specified value to the {@code rc_2pass_vbr_minsection_pct} field. */
    public vpx_codec_enc_cfg_t rc_2pass_vbr_minsection_pct(@NativeType("unsigned int") int value) { nrc_2pass_vbr_minsection_pct(address(), value); return this; }
    /** Sets the specified value to the {@code rc_2pass_vbr_maxsection_pct} field. */
    public vpx_codec_enc_cfg_t rc_2pass_vbr_maxsection_pct(@NativeType("unsigned int") int value) { nrc_2pass_vbr_maxsection_pct(address(), value); return this; }
    /** Sets the specified value to the {@code rc_2pass_vbr_corpus_complexity} field. */
    public vpx_codec_enc_cfg_t rc_2pass_vbr_corpus_complexity(@NativeType("unsigned int") int value) { nrc_2pass_vbr_corpus_complexity(address(), value); return this; }
    /** Sets the specified value to the {@code kf_mode} field. */
    public vpx_codec_enc_cfg_t kf_mode(@NativeType("vpx_kf_mode") int value) { nkf_mode(address(), value); return this; }
    /** Sets the specified value to the {@code kf_min_dist} field. */
    public vpx_codec_enc_cfg_t kf_min_dist(@NativeType("unsigned int") int value) { nkf_min_dist(address(), value); return this; }
    /** Sets the specified value to the {@code kf_max_dist} field. */
    public vpx_codec_enc_cfg_t kf_max_dist(@NativeType("unsigned int") int value) { nkf_max_dist(address(), value); return this; }
    /** Sets the specified value to the {@code ss_number_layers} field. */
    public vpx_codec_enc_cfg_t ss_number_layers(@NativeType("unsigned int") int value) { nss_number_layers(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code ss_enable_auto_alt_ref} field. */
    public vpx_codec_enc_cfg_t ss_enable_auto_alt_ref(@NativeType("int[5]") IntBuffer value) { nss_enable_auto_alt_ref(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ss_enable_auto_alt_ref} field. */
    public vpx_codec_enc_cfg_t ss_enable_auto_alt_ref(int index, int value) { nss_enable_auto_alt_ref(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code ss_target_bitrate} field. */
    public vpx_codec_enc_cfg_t ss_target_bitrate(@NativeType("unsigned int[5]") IntBuffer value) { nss_target_bitrate(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ss_target_bitrate} field. */
    public vpx_codec_enc_cfg_t ss_target_bitrate(int index, @NativeType("unsigned int") int value) { nss_target_bitrate(address(), index, value); return this; }
    /** Sets the specified value to the {@code ts_number_layers} field. */
    public vpx_codec_enc_cfg_t ts_number_layers(@NativeType("unsigned int") int value) { nts_number_layers(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code ts_target_bitrate} field. */
    public vpx_codec_enc_cfg_t ts_target_bitrate(@NativeType("unsigned int[5]") IntBuffer value) { nts_target_bitrate(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ts_target_bitrate} field. */
    public vpx_codec_enc_cfg_t ts_target_bitrate(int index, @NativeType("unsigned int") int value) { nts_target_bitrate(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code ts_rate_decimator} field. */
    public vpx_codec_enc_cfg_t ts_rate_decimator(@NativeType("unsigned int[5]") IntBuffer value) { nts_rate_decimator(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ts_rate_decimator} field. */
    public vpx_codec_enc_cfg_t ts_rate_decimator(int index, @NativeType("unsigned int") int value) { nts_rate_decimator(address(), index, value); return this; }
    /** Sets the specified value to the {@code ts_periodicity} field. */
    public vpx_codec_enc_cfg_t ts_periodicity(@NativeType("unsigned int") int value) { nts_periodicity(address(), value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code ts_layer_id} field. */
    public vpx_codec_enc_cfg_t ts_layer_id(@NativeType("unsigned int[16]") IntBuffer value) { nts_layer_id(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code ts_layer_id} field. */
    public vpx_codec_enc_cfg_t ts_layer_id(int index, @NativeType("unsigned int") int value) { nts_layer_id(address(), index, value); return this; }
    /** Copies the specified {@link IntBuffer} to the {@code layer_target_bitrate} field. */
    public vpx_codec_enc_cfg_t layer_target_bitrate(@NativeType("unsigned int[12]") IntBuffer value) { nlayer_target_bitrate(address(), value); return this; }
    /** Sets the specified value at the specified index of the {@code layer_target_bitrate} field. */
    public vpx_codec_enc_cfg_t layer_target_bitrate(int index, @NativeType("unsigned int") int value) { nlayer_target_bitrate(address(), index, value); return this; }
    /** Sets the specified value to the {@code temporal_layering_mode} field. */
    public vpx_codec_enc_cfg_t temporal_layering_mode(int value) { ntemporal_layering_mode(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public vpx_codec_enc_cfg_t set(
        int g_usage,
        int g_threads,
        int g_profile,
        int g_w,
        int g_h,
        int g_bit_depth,
        int g_input_bit_depth,
        vpx_rational g_timebase,
        int g_error_resilient,
        int g_pass,
        int g_lag_in_frames,
        int rc_dropframe_thresh,
        int rc_resize_allowed,
        int rc_scaled_width,
        int rc_scaled_height,
        int rc_resize_up_thresh,
        int rc_resize_down_thresh,
        int rc_end_usage,
        vpx_fixed_buf_t rc_twopass_stats_in,
        vpx_fixed_buf_t rc_firstpass_mb_stats_in,
        int rc_target_bitrate,
        int rc_min_quantizer,
        int rc_max_quantizer,
        int rc_undershoot_pct,
        int rc_overshoot_pct,
        int rc_buf_sz,
        int rc_buf_initial_sz,
        int rc_buf_optimal_sz,
        int rc_2pass_vbr_bias_pct,
        int rc_2pass_vbr_minsection_pct,
        int rc_2pass_vbr_maxsection_pct,
        int rc_2pass_vbr_corpus_complexity,
        int kf_mode,
        int kf_min_dist,
        int kf_max_dist,
        int ss_number_layers,
        IntBuffer ss_enable_auto_alt_ref,
        IntBuffer ss_target_bitrate,
        int ts_number_layers,
        IntBuffer ts_target_bitrate,
        IntBuffer ts_rate_decimator,
        int ts_periodicity,
        IntBuffer ts_layer_id,
        IntBuffer layer_target_bitrate,
        int temporal_layering_mode
    ) {
        g_usage(g_usage);
        g_threads(g_threads);
        g_profile(g_profile);
        g_w(g_w);
        g_h(g_h);
        g_bit_depth(g_bit_depth);
        g_input_bit_depth(g_input_bit_depth);
        g_timebase(g_timebase);
        g_error_resilient(g_error_resilient);
        g_pass(g_pass);
        g_lag_in_frames(g_lag_in_frames);
        rc_dropframe_thresh(rc_dropframe_thresh);
        rc_resize_allowed(rc_resize_allowed);
        rc_scaled_width(rc_scaled_width);
        rc_scaled_height(rc_scaled_height);
        rc_resize_up_thresh(rc_resize_up_thresh);
        rc_resize_down_thresh(rc_resize_down_thresh);
        rc_end_usage(rc_end_usage);
        rc_twopass_stats_in(rc_twopass_stats_in);
        rc_firstpass_mb_stats_in(rc_firstpass_mb_stats_in);
        rc_target_bitrate(rc_target_bitrate);
        rc_min_quantizer(rc_min_quantizer);
        rc_max_quantizer(rc_max_quantizer);
        rc_undershoot_pct(rc_undershoot_pct);
        rc_overshoot_pct(rc_overshoot_pct);
        rc_buf_sz(rc_buf_sz);
        rc_buf_initial_sz(rc_buf_initial_sz);
        rc_buf_optimal_sz(rc_buf_optimal_sz);
        rc_2pass_vbr_bias_pct(rc_2pass_vbr_bias_pct);
        rc_2pass_vbr_minsection_pct(rc_2pass_vbr_minsection_pct);
        rc_2pass_vbr_maxsection_pct(rc_2pass_vbr_maxsection_pct);
        rc_2pass_vbr_corpus_complexity(rc_2pass_vbr_corpus_complexity);
        kf_mode(kf_mode);
        kf_min_dist(kf_min_dist);
        kf_max_dist(kf_max_dist);
        ss_number_layers(ss_number_layers);
        ss_enable_auto_alt_ref(ss_enable_auto_alt_ref);
        ss_target_bitrate(ss_target_bitrate);
        ts_number_layers(ts_number_layers);
        ts_target_bitrate(ts_target_bitrate);
        ts_rate_decimator(ts_rate_decimator);
        ts_periodicity(ts_periodicity);
        ts_layer_id(ts_layer_id);
        layer_target_bitrate(layer_target_bitrate);
        temporal_layering_mode(temporal_layering_mode);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public vpx_codec_enc_cfg_t set(vpx_codec_enc_cfg_t src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code vpx_codec_enc_cfg_t} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static vpx_codec_enc_cfg_t malloc() {
        return wrap(vpx_codec_enc_cfg_t.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code vpx_codec_enc_cfg_t} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static vpx_codec_enc_cfg_t calloc() {
        return wrap(vpx_codec_enc_cfg_t.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code vpx_codec_enc_cfg_t} instance allocated with {@link BufferUtils}. */
    public static vpx_codec_enc_cfg_t create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(vpx_codec_enc_cfg_t.class, memAddress(container), container);
    }

    /** Returns a new {@code vpx_codec_enc_cfg_t} instance for the specified memory address. */
    public static vpx_codec_enc_cfg_t create(long address) {
        return wrap(vpx_codec_enc_cfg_t.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_codec_enc_cfg_t createSafe(long address) {
        return address == NULL ? null : wrap(vpx_codec_enc_cfg_t.class, address);
    }

    /**
     * Returns a new {@link vpx_codec_enc_cfg_t.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_enc_cfg_t.Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_enc_cfg_t.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_enc_cfg_t.Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_enc_cfg_t.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_enc_cfg_t.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link vpx_codec_enc_cfg_t.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static vpx_codec_enc_cfg_t.Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static vpx_codec_enc_cfg_t.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@code vpx_codec_enc_cfg_t} instance allocated on the thread-local {@link MemoryStack}. */
    public static vpx_codec_enc_cfg_t mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@code vpx_codec_enc_cfg_t} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static vpx_codec_enc_cfg_t callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@code vpx_codec_enc_cfg_t} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_codec_enc_cfg_t mallocStack(MemoryStack stack) {
        return wrap(vpx_codec_enc_cfg_t.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code vpx_codec_enc_cfg_t} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static vpx_codec_enc_cfg_t callocStack(MemoryStack stack) {
        return wrap(vpx_codec_enc_cfg_t.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link vpx_codec_enc_cfg_t.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_enc_cfg_t.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_codec_enc_cfg_t.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static vpx_codec_enc_cfg_t.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link vpx_codec_enc_cfg_t.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_codec_enc_cfg_t.Buffer mallocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link vpx_codec_enc_cfg_t.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static vpx_codec_enc_cfg_t.Buffer callocStack(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #g_usage}. */
    public static int ng_usage(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.G_USAGE); }
    /** Unsafe version of {@link #g_threads}. */
    public static int ng_threads(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.G_THREADS); }
    /** Unsafe version of {@link #g_profile}. */
    public static int ng_profile(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.G_PROFILE); }
    /** Unsafe version of {@link #g_w}. */
    public static int ng_w(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.G_W); }
    /** Unsafe version of {@link #g_h}. */
    public static int ng_h(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.G_H); }
    /** Unsafe version of {@link #g_bit_depth}. */
    public static int ng_bit_depth(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.G_BIT_DEPTH); }
    /** Unsafe version of {@link #g_input_bit_depth}. */
    public static int ng_input_bit_depth(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.G_INPUT_BIT_DEPTH); }
    /** Unsafe version of {@link #g_timebase}. */
    public static vpx_rational ng_timebase(long struct) { return vpx_rational.create(struct + vpx_codec_enc_cfg_t.G_TIMEBASE); }
    /** Unsafe version of {@link #g_error_resilient}. */
    public static int ng_error_resilient(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.G_ERROR_RESILIENT); }
    /** Unsafe version of {@link #g_pass}. */
    public static int ng_pass(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.G_PASS); }
    /** Unsafe version of {@link #g_lag_in_frames}. */
    public static int ng_lag_in_frames(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.G_LAG_IN_FRAMES); }
    /** Unsafe version of {@link #rc_dropframe_thresh}. */
    public static int nrc_dropframe_thresh(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_DROPFRAME_THRESH); }
    /** Unsafe version of {@link #rc_resize_allowed}. */
    public static int nrc_resize_allowed(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_RESIZE_ALLOWED); }
    /** Unsafe version of {@link #rc_scaled_width}. */
    public static int nrc_scaled_width(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_SCALED_WIDTH); }
    /** Unsafe version of {@link #rc_scaled_height}. */
    public static int nrc_scaled_height(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_SCALED_HEIGHT); }
    /** Unsafe version of {@link #rc_resize_up_thresh}. */
    public static int nrc_resize_up_thresh(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_RESIZE_UP_THRESH); }
    /** Unsafe version of {@link #rc_resize_down_thresh}. */
    public static int nrc_resize_down_thresh(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_RESIZE_DOWN_THRESH); }
    /** Unsafe version of {@link #rc_end_usage}. */
    public static int nrc_end_usage(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_END_USAGE); }
    /** Unsafe version of {@link #rc_twopass_stats_in}. */
    public static vpx_fixed_buf_t nrc_twopass_stats_in(long struct) { return vpx_fixed_buf_t.create(struct + vpx_codec_enc_cfg_t.RC_TWOPASS_STATS_IN); }
    /** Unsafe version of {@link #rc_firstpass_mb_stats_in}. */
    public static vpx_fixed_buf_t nrc_firstpass_mb_stats_in(long struct) { return vpx_fixed_buf_t.create(struct + vpx_codec_enc_cfg_t.RC_FIRSTPASS_MB_STATS_IN); }
    /** Unsafe version of {@link #rc_target_bitrate}. */
    public static int nrc_target_bitrate(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_TARGET_BITRATE); }
    /** Unsafe version of {@link #rc_min_quantizer}. */
    public static int nrc_min_quantizer(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_MIN_QUANTIZER); }
    /** Unsafe version of {@link #rc_max_quantizer}. */
    public static int nrc_max_quantizer(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_MAX_QUANTIZER); }
    /** Unsafe version of {@link #rc_undershoot_pct}. */
    public static int nrc_undershoot_pct(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_UNDERSHOOT_PCT); }
    /** Unsafe version of {@link #rc_overshoot_pct}. */
    public static int nrc_overshoot_pct(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_OVERSHOOT_PCT); }
    /** Unsafe version of {@link #rc_buf_sz}. */
    public static int nrc_buf_sz(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_BUF_SZ); }
    /** Unsafe version of {@link #rc_buf_initial_sz}. */
    public static int nrc_buf_initial_sz(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_BUF_INITIAL_SZ); }
    /** Unsafe version of {@link #rc_buf_optimal_sz}. */
    public static int nrc_buf_optimal_sz(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_BUF_OPTIMAL_SZ); }
    /** Unsafe version of {@link #rc_2pass_vbr_bias_pct}. */
    public static int nrc_2pass_vbr_bias_pct(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_2PASS_VBR_BIAS_PCT); }
    /** Unsafe version of {@link #rc_2pass_vbr_minsection_pct}. */
    public static int nrc_2pass_vbr_minsection_pct(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_2PASS_VBR_MINSECTION_PCT); }
    /** Unsafe version of {@link #rc_2pass_vbr_maxsection_pct}. */
    public static int nrc_2pass_vbr_maxsection_pct(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_2PASS_VBR_MAXSECTION_PCT); }
    /** Unsafe version of {@link #rc_2pass_vbr_corpus_complexity}. */
    public static int nrc_2pass_vbr_corpus_complexity(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.RC_2PASS_VBR_CORPUS_COMPLEXITY); }
    /** Unsafe version of {@link #kf_mode}. */
    public static int nkf_mode(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.KF_MODE); }
    /** Unsafe version of {@link #kf_min_dist}. */
    public static int nkf_min_dist(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.KF_MIN_DIST); }
    /** Unsafe version of {@link #kf_max_dist}. */
    public static int nkf_max_dist(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.KF_MAX_DIST); }
    /** Unsafe version of {@link #ss_number_layers}. */
    public static int nss_number_layers(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.SS_NUMBER_LAYERS); }
    /** Unsafe version of {@link #ss_enable_auto_alt_ref}. */
    public static IntBuffer nss_enable_auto_alt_ref(long struct) { return memIntBuffer(struct + vpx_codec_enc_cfg_t.SS_ENABLE_AUTO_ALT_REF, 5); }
    /** Unsafe version of {@link #ss_enable_auto_alt_ref(int) ss_enable_auto_alt_ref}. */
    public static int nss_enable_auto_alt_ref(long struct, int index) {
        return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.SS_ENABLE_AUTO_ALT_REF + check(index, 5) * 4);
    }
    /** Unsafe version of {@link #ss_target_bitrate}. */
    public static IntBuffer nss_target_bitrate(long struct) { return memIntBuffer(struct + vpx_codec_enc_cfg_t.SS_TARGET_BITRATE, 5); }
    /** Unsafe version of {@link #ss_target_bitrate(int) ss_target_bitrate}. */
    public static int nss_target_bitrate(long struct, int index) {
        return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.SS_TARGET_BITRATE + check(index, 5) * 4);
    }
    /** Unsafe version of {@link #ts_number_layers}. */
    public static int nts_number_layers(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.TS_NUMBER_LAYERS); }
    /** Unsafe version of {@link #ts_target_bitrate}. */
    public static IntBuffer nts_target_bitrate(long struct) { return memIntBuffer(struct + vpx_codec_enc_cfg_t.TS_TARGET_BITRATE, 5); }
    /** Unsafe version of {@link #ts_target_bitrate(int) ts_target_bitrate}. */
    public static int nts_target_bitrate(long struct, int index) {
        return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.TS_TARGET_BITRATE + check(index, 5) * 4);
    }
    /** Unsafe version of {@link #ts_rate_decimator}. */
    public static IntBuffer nts_rate_decimator(long struct) { return memIntBuffer(struct + vpx_codec_enc_cfg_t.TS_RATE_DECIMATOR, 5); }
    /** Unsafe version of {@link #ts_rate_decimator(int) ts_rate_decimator}. */
    public static int nts_rate_decimator(long struct, int index) {
        return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.TS_RATE_DECIMATOR + check(index, 5) * 4);
    }
    /** Unsafe version of {@link #ts_periodicity}. */
    public static int nts_periodicity(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.TS_PERIODICITY); }
    /** Unsafe version of {@link #ts_layer_id}. */
    public static IntBuffer nts_layer_id(long struct) { return memIntBuffer(struct + vpx_codec_enc_cfg_t.TS_LAYER_ID, 16); }
    /** Unsafe version of {@link #ts_layer_id(int) ts_layer_id}. */
    public static int nts_layer_id(long struct, int index) {
        return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.TS_LAYER_ID + check(index, 16) * 4);
    }
    /** Unsafe version of {@link #layer_target_bitrate}. */
    public static IntBuffer nlayer_target_bitrate(long struct) { return memIntBuffer(struct + vpx_codec_enc_cfg_t.LAYER_TARGET_BITRATE, 12); }
    /** Unsafe version of {@link #layer_target_bitrate(int) layer_target_bitrate}. */
    public static int nlayer_target_bitrate(long struct, int index) {
        return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.LAYER_TARGET_BITRATE + check(index, 12) * 4);
    }
    /** Unsafe version of {@link #temporal_layering_mode}. */
    public static int ntemporal_layering_mode(long struct) { return UNSAFE.getInt(null, struct + vpx_codec_enc_cfg_t.TEMPORAL_LAYERING_MODE); }

    /** Unsafe version of {@link #g_usage(int) g_usage}. */
    public static void ng_usage(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.G_USAGE, value); }
    /** Unsafe version of {@link #g_threads(int) g_threads}. */
    public static void ng_threads(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.G_THREADS, value); }
    /** Unsafe version of {@link #g_profile(int) g_profile}. */
    public static void ng_profile(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.G_PROFILE, value); }
    /** Unsafe version of {@link #g_w(int) g_w}. */
    public static void ng_w(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.G_W, value); }
    /** Unsafe version of {@link #g_h(int) g_h}. */
    public static void ng_h(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.G_H, value); }
    /** Unsafe version of {@link #g_bit_depth(int) g_bit_depth}. */
    public static void ng_bit_depth(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.G_BIT_DEPTH, value); }
    /** Unsafe version of {@link #g_input_bit_depth(int) g_input_bit_depth}. */
    public static void ng_input_bit_depth(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.G_INPUT_BIT_DEPTH, value); }
    /** Unsafe version of {@link #g_timebase(vpx_rational) g_timebase}. */
    public static void ng_timebase(long struct, vpx_rational value) { memCopy(value.address(), struct + vpx_codec_enc_cfg_t.G_TIMEBASE, vpx_rational.SIZEOF); }
    /** Unsafe version of {@link #g_error_resilient(int) g_error_resilient}. */
    public static void ng_error_resilient(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.G_ERROR_RESILIENT, value); }
    /** Unsafe version of {@link #g_pass(int) g_pass}. */
    public static void ng_pass(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.G_PASS, value); }
    /** Unsafe version of {@link #g_lag_in_frames(int) g_lag_in_frames}. */
    public static void ng_lag_in_frames(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.G_LAG_IN_FRAMES, value); }
    /** Unsafe version of {@link #rc_dropframe_thresh(int) rc_dropframe_thresh}. */
    public static void nrc_dropframe_thresh(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_DROPFRAME_THRESH, value); }
    /** Unsafe version of {@link #rc_resize_allowed(int) rc_resize_allowed}. */
    public static void nrc_resize_allowed(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_RESIZE_ALLOWED, value); }
    /** Unsafe version of {@link #rc_scaled_width(int) rc_scaled_width}. */
    public static void nrc_scaled_width(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_SCALED_WIDTH, value); }
    /** Unsafe version of {@link #rc_scaled_height(int) rc_scaled_height}. */
    public static void nrc_scaled_height(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_SCALED_HEIGHT, value); }
    /** Unsafe version of {@link #rc_resize_up_thresh(int) rc_resize_up_thresh}. */
    public static void nrc_resize_up_thresh(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_RESIZE_UP_THRESH, value); }
    /** Unsafe version of {@link #rc_resize_down_thresh(int) rc_resize_down_thresh}. */
    public static void nrc_resize_down_thresh(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_RESIZE_DOWN_THRESH, value); }
    /** Unsafe version of {@link #rc_end_usage(int) rc_end_usage}. */
    public static void nrc_end_usage(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_END_USAGE, value); }
    /** Unsafe version of {@link #rc_twopass_stats_in(vpx_fixed_buf_t) rc_twopass_stats_in}. */
    public static void nrc_twopass_stats_in(long struct, vpx_fixed_buf_t value) { memCopy(value.address(), struct + vpx_codec_enc_cfg_t.RC_TWOPASS_STATS_IN, vpx_fixed_buf_t.SIZEOF); }
    /** Unsafe version of {@link #rc_firstpass_mb_stats_in(vpx_fixed_buf_t) rc_firstpass_mb_stats_in}. */
    public static void nrc_firstpass_mb_stats_in(long struct, vpx_fixed_buf_t value) { memCopy(value.address(), struct + vpx_codec_enc_cfg_t.RC_FIRSTPASS_MB_STATS_IN, vpx_fixed_buf_t.SIZEOF); }
    /** Unsafe version of {@link #rc_target_bitrate(int) rc_target_bitrate}. */
    public static void nrc_target_bitrate(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_TARGET_BITRATE, value); }
    /** Unsafe version of {@link #rc_min_quantizer(int) rc_min_quantizer}. */
    public static void nrc_min_quantizer(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_MIN_QUANTIZER, value); }
    /** Unsafe version of {@link #rc_max_quantizer(int) rc_max_quantizer}. */
    public static void nrc_max_quantizer(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_MAX_QUANTIZER, value); }
    /** Unsafe version of {@link #rc_undershoot_pct(int) rc_undershoot_pct}. */
    public static void nrc_undershoot_pct(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_UNDERSHOOT_PCT, value); }
    /** Unsafe version of {@link #rc_overshoot_pct(int) rc_overshoot_pct}. */
    public static void nrc_overshoot_pct(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_OVERSHOOT_PCT, value); }
    /** Unsafe version of {@link #rc_buf_sz(int) rc_buf_sz}. */
    public static void nrc_buf_sz(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_BUF_SZ, value); }
    /** Unsafe version of {@link #rc_buf_initial_sz(int) rc_buf_initial_sz}. */
    public static void nrc_buf_initial_sz(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_BUF_INITIAL_SZ, value); }
    /** Unsafe version of {@link #rc_buf_optimal_sz(int) rc_buf_optimal_sz}. */
    public static void nrc_buf_optimal_sz(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_BUF_OPTIMAL_SZ, value); }
    /** Unsafe version of {@link #rc_2pass_vbr_bias_pct(int) rc_2pass_vbr_bias_pct}. */
    public static void nrc_2pass_vbr_bias_pct(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_2PASS_VBR_BIAS_PCT, value); }
    /** Unsafe version of {@link #rc_2pass_vbr_minsection_pct(int) rc_2pass_vbr_minsection_pct}. */
    public static void nrc_2pass_vbr_minsection_pct(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_2PASS_VBR_MINSECTION_PCT, value); }
    /** Unsafe version of {@link #rc_2pass_vbr_maxsection_pct(int) rc_2pass_vbr_maxsection_pct}. */
    public static void nrc_2pass_vbr_maxsection_pct(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_2PASS_VBR_MAXSECTION_PCT, value); }
    /** Unsafe version of {@link #rc_2pass_vbr_corpus_complexity(int) rc_2pass_vbr_corpus_complexity}. */
    public static void nrc_2pass_vbr_corpus_complexity(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.RC_2PASS_VBR_CORPUS_COMPLEXITY, value); }
    /** Unsafe version of {@link #kf_mode(int) kf_mode}. */
    public static void nkf_mode(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.KF_MODE, value); }
    /** Unsafe version of {@link #kf_min_dist(int) kf_min_dist}. */
    public static void nkf_min_dist(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.KF_MIN_DIST, value); }
    /** Unsafe version of {@link #kf_max_dist(int) kf_max_dist}. */
    public static void nkf_max_dist(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.KF_MAX_DIST, value); }
    /** Unsafe version of {@link #ss_number_layers(int) ss_number_layers}. */
    public static void nss_number_layers(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.SS_NUMBER_LAYERS, value); }
    /** Unsafe version of {@link #ss_enable_auto_alt_ref(IntBuffer) ss_enable_auto_alt_ref}. */
    public static void nss_enable_auto_alt_ref(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + vpx_codec_enc_cfg_t.SS_ENABLE_AUTO_ALT_REF, value.remaining() * 4);
    }
    /** Unsafe version of {@link #ss_enable_auto_alt_ref(int, int) ss_enable_auto_alt_ref}. */
    public static void nss_enable_auto_alt_ref(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.SS_ENABLE_AUTO_ALT_REF + check(index, 5) * 4, value);
    }
    /** Unsafe version of {@link #ss_target_bitrate(IntBuffer) ss_target_bitrate}. */
    public static void nss_target_bitrate(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + vpx_codec_enc_cfg_t.SS_TARGET_BITRATE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #ss_target_bitrate(int, int) ss_target_bitrate}. */
    public static void nss_target_bitrate(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.SS_TARGET_BITRATE + check(index, 5) * 4, value);
    }
    /** Unsafe version of {@link #ts_number_layers(int) ts_number_layers}. */
    public static void nts_number_layers(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.TS_NUMBER_LAYERS, value); }
    /** Unsafe version of {@link #ts_target_bitrate(IntBuffer) ts_target_bitrate}. */
    public static void nts_target_bitrate(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + vpx_codec_enc_cfg_t.TS_TARGET_BITRATE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #ts_target_bitrate(int, int) ts_target_bitrate}. */
    public static void nts_target_bitrate(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.TS_TARGET_BITRATE + check(index, 5) * 4, value);
    }
    /** Unsafe version of {@link #ts_rate_decimator(IntBuffer) ts_rate_decimator}. */
    public static void nts_rate_decimator(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 5); }
        memCopy(memAddress(value), struct + vpx_codec_enc_cfg_t.TS_RATE_DECIMATOR, value.remaining() * 4);
    }
    /** Unsafe version of {@link #ts_rate_decimator(int, int) ts_rate_decimator}. */
    public static void nts_rate_decimator(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.TS_RATE_DECIMATOR + check(index, 5) * 4, value);
    }
    /** Unsafe version of {@link #ts_periodicity(int) ts_periodicity}. */
    public static void nts_periodicity(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.TS_PERIODICITY, value); }
    /** Unsafe version of {@link #ts_layer_id(IntBuffer) ts_layer_id}. */
    public static void nts_layer_id(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 16); }
        memCopy(memAddress(value), struct + vpx_codec_enc_cfg_t.TS_LAYER_ID, value.remaining() * 4);
    }
    /** Unsafe version of {@link #ts_layer_id(int, int) ts_layer_id}. */
    public static void nts_layer_id(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.TS_LAYER_ID + check(index, 16) * 4, value);
    }
    /** Unsafe version of {@link #layer_target_bitrate(IntBuffer) layer_target_bitrate}. */
    public static void nlayer_target_bitrate(long struct, IntBuffer value) {
        if (CHECKS) { checkGT(value, 12); }
        memCopy(memAddress(value), struct + vpx_codec_enc_cfg_t.LAYER_TARGET_BITRATE, value.remaining() * 4);
    }
    /** Unsafe version of {@link #layer_target_bitrate(int, int) layer_target_bitrate}. */
    public static void nlayer_target_bitrate(long struct, int index, int value) {
        UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.LAYER_TARGET_BITRATE + check(index, 12) * 4, value);
    }
    /** Unsafe version of {@link #temporal_layering_mode(int) temporal_layering_mode}. */
    public static void ntemporal_layering_mode(long struct, int value) { UNSAFE.putInt(null, struct + vpx_codec_enc_cfg_t.TEMPORAL_LAYERING_MODE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        vpx_fixed_buf_t.validate(struct + vpx_codec_enc_cfg_t.RC_TWOPASS_STATS_IN);
        vpx_fixed_buf_t.validate(struct + vpx_codec_enc_cfg_t.RC_FIRSTPASS_MB_STATS_IN);
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link vpx_codec_enc_cfg_t} structs. */
    public static class Buffer extends StructBuffer<vpx_codec_enc_cfg_t, Buffer> implements NativeResource {

        private static final vpx_codec_enc_cfg_t ELEMENT_FACTORY = vpx_codec_enc_cfg_t.create(-1L);

        /**
         * Creates a new {@code vpx_codec_enc_cfg_t.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link vpx_codec_enc_cfg_t#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected vpx_codec_enc_cfg_t getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** Returns the value of the {@code g_usage} field. */
        @NativeType("unsigned int")
        public int g_usage() { return vpx_codec_enc_cfg_t.ng_usage(address()); }
        /** Returns the value of the {@code g_threads} field. */
        @NativeType("unsigned int")
        public int g_threads() { return vpx_codec_enc_cfg_t.ng_threads(address()); }
        /** Returns the value of the {@code g_profile} field. */
        @NativeType("unsigned int")
        public int g_profile() { return vpx_codec_enc_cfg_t.ng_profile(address()); }
        /** Returns the value of the {@code g_w} field. */
        @NativeType("unsigned int")
        public int g_w() { return vpx_codec_enc_cfg_t.ng_w(address()); }
        /** Returns the value of the {@code g_h} field. */
        @NativeType("unsigned int")
        public int g_h() { return vpx_codec_enc_cfg_t.ng_h(address()); }
        /** Returns the value of the {@code g_bit_depth} field. */
        @NativeType("vpx_bit_depth")
        public int g_bit_depth() { return vpx_codec_enc_cfg_t.ng_bit_depth(address()); }
        /** Returns the value of the {@code g_input_bit_depth} field. */
        @NativeType("unsigned int")
        public int g_input_bit_depth() { return vpx_codec_enc_cfg_t.ng_input_bit_depth(address()); }
        /** Returns a {@link vpx_rational} view of the {@code g_timebase} field. */
        public vpx_rational g_timebase() { return vpx_codec_enc_cfg_t.ng_timebase(address()); }
        /** Returns the value of the {@code g_error_resilient} field. */
        @NativeType("uint32_t")
        public int g_error_resilient() { return vpx_codec_enc_cfg_t.ng_error_resilient(address()); }
        /** Returns the value of the {@code g_pass} field. */
        @NativeType("vpx_enc_pass")
        public int g_pass() { return vpx_codec_enc_cfg_t.ng_pass(address()); }
        /** Returns the value of the {@code g_lag_in_frames} field. */
        @NativeType("unsigned int")
        public int g_lag_in_frames() { return vpx_codec_enc_cfg_t.ng_lag_in_frames(address()); }
        /** Returns the value of the {@code rc_dropframe_thresh} field. */
        @NativeType("unsigned int")
        public int rc_dropframe_thresh() { return vpx_codec_enc_cfg_t.nrc_dropframe_thresh(address()); }
        /** Returns the value of the {@code rc_resize_allowed} field. */
        @NativeType("unsigned int")
        public int rc_resize_allowed() { return vpx_codec_enc_cfg_t.nrc_resize_allowed(address()); }
        /** Returns the value of the {@code rc_scaled_width} field. */
        @NativeType("unsigned int")
        public int rc_scaled_width() { return vpx_codec_enc_cfg_t.nrc_scaled_width(address()); }
        /** Returns the value of the {@code rc_scaled_height} field. */
        @NativeType("unsigned int")
        public int rc_scaled_height() { return vpx_codec_enc_cfg_t.nrc_scaled_height(address()); }
        /** Returns the value of the {@code rc_resize_up_thresh} field. */
        @NativeType("unsigned int")
        public int rc_resize_up_thresh() { return vpx_codec_enc_cfg_t.nrc_resize_up_thresh(address()); }
        /** Returns the value of the {@code rc_resize_down_thresh} field. */
        @NativeType("unsigned int")
        public int rc_resize_down_thresh() { return vpx_codec_enc_cfg_t.nrc_resize_down_thresh(address()); }
        /** Returns the value of the {@code rc_end_usage} field. */
        @NativeType("vpx_rc_mode")
        public int rc_end_usage() { return vpx_codec_enc_cfg_t.nrc_end_usage(address()); }
        /** Returns a {@link vpx_fixed_buf_t} view of the {@code rc_twopass_stats_in} field. */
        public vpx_fixed_buf_t rc_twopass_stats_in() { return vpx_codec_enc_cfg_t.nrc_twopass_stats_in(address()); }
        /** Returns a {@link vpx_fixed_buf_t} view of the {@code rc_firstpass_mb_stats_in} field. */
        public vpx_fixed_buf_t rc_firstpass_mb_stats_in() { return vpx_codec_enc_cfg_t.nrc_firstpass_mb_stats_in(address()); }
        /** Returns the value of the {@code rc_target_bitrate} field. */
        @NativeType("unsigned int")
        public int rc_target_bitrate() { return vpx_codec_enc_cfg_t.nrc_target_bitrate(address()); }
        /** Returns the value of the {@code rc_min_quantizer} field. */
        @NativeType("unsigned int")
        public int rc_min_quantizer() { return vpx_codec_enc_cfg_t.nrc_min_quantizer(address()); }
        /** Returns the value of the {@code rc_max_quantizer} field. */
        @NativeType("unsigned int")
        public int rc_max_quantizer() { return vpx_codec_enc_cfg_t.nrc_max_quantizer(address()); }
        /** Returns the value of the {@code rc_undershoot_pct} field. */
        @NativeType("unsigned int")
        public int rc_undershoot_pct() { return vpx_codec_enc_cfg_t.nrc_undershoot_pct(address()); }
        /** Returns the value of the {@code rc_overshoot_pct} field. */
        @NativeType("unsigned int")
        public int rc_overshoot_pct() { return vpx_codec_enc_cfg_t.nrc_overshoot_pct(address()); }
        /** Returns the value of the {@code rc_buf_sz} field. */
        @NativeType("unsigned int")
        public int rc_buf_sz() { return vpx_codec_enc_cfg_t.nrc_buf_sz(address()); }
        /** Returns the value of the {@code rc_buf_initial_sz} field. */
        @NativeType("unsigned int")
        public int rc_buf_initial_sz() { return vpx_codec_enc_cfg_t.nrc_buf_initial_sz(address()); }
        /** Returns the value of the {@code rc_buf_optimal_sz} field. */
        @NativeType("unsigned int")
        public int rc_buf_optimal_sz() { return vpx_codec_enc_cfg_t.nrc_buf_optimal_sz(address()); }
        /** Returns the value of the {@code rc_2pass_vbr_bias_pct} field. */
        @NativeType("unsigned int")
        public int rc_2pass_vbr_bias_pct() { return vpx_codec_enc_cfg_t.nrc_2pass_vbr_bias_pct(address()); }
        /** Returns the value of the {@code rc_2pass_vbr_minsection_pct} field. */
        @NativeType("unsigned int")
        public int rc_2pass_vbr_minsection_pct() { return vpx_codec_enc_cfg_t.nrc_2pass_vbr_minsection_pct(address()); }
        /** Returns the value of the {@code rc_2pass_vbr_maxsection_pct} field. */
        @NativeType("unsigned int")
        public int rc_2pass_vbr_maxsection_pct() { return vpx_codec_enc_cfg_t.nrc_2pass_vbr_maxsection_pct(address()); }
        /** Returns the value of the {@code rc_2pass_vbr_corpus_complexity} field. */
        @NativeType("unsigned int")
        public int rc_2pass_vbr_corpus_complexity() { return vpx_codec_enc_cfg_t.nrc_2pass_vbr_corpus_complexity(address()); }
        /** Returns the value of the {@code kf_mode} field. */
        @NativeType("vpx_kf_mode")
        public int kf_mode() { return vpx_codec_enc_cfg_t.nkf_mode(address()); }
        /** Returns the value of the {@code kf_min_dist} field. */
        @NativeType("unsigned int")
        public int kf_min_dist() { return vpx_codec_enc_cfg_t.nkf_min_dist(address()); }
        /** Returns the value of the {@code kf_max_dist} field. */
        @NativeType("unsigned int")
        public int kf_max_dist() { return vpx_codec_enc_cfg_t.nkf_max_dist(address()); }
        /** Returns the value of the {@code ss_number_layers} field. */
        @NativeType("unsigned int")
        public int ss_number_layers() { return vpx_codec_enc_cfg_t.nss_number_layers(address()); }
        /** Returns a {@link IntBuffer} view of the {@code ss_enable_auto_alt_ref} field. */
        @NativeType("int[5]")
        public IntBuffer ss_enable_auto_alt_ref() { return vpx_codec_enc_cfg_t.nss_enable_auto_alt_ref(address()); }
        /** Returns the value at the specified index of the {@code ss_enable_auto_alt_ref} field. */
        public int ss_enable_auto_alt_ref(int index) { return vpx_codec_enc_cfg_t.nss_enable_auto_alt_ref(address(), index); }
        /** Returns a {@link IntBuffer} view of the {@code ss_target_bitrate} field. */
        @NativeType("unsigned int[5]")
        public IntBuffer ss_target_bitrate() { return vpx_codec_enc_cfg_t.nss_target_bitrate(address()); }
        /** Returns the value at the specified index of the {@code ss_target_bitrate} field. */
        @NativeType("unsigned int")
        public int ss_target_bitrate(int index) { return vpx_codec_enc_cfg_t.nss_target_bitrate(address(), index); }
        /** Returns the value of the {@code ts_number_layers} field. */
        @NativeType("unsigned int")
        public int ts_number_layers() { return vpx_codec_enc_cfg_t.nts_number_layers(address()); }
        /** Returns a {@link IntBuffer} view of the {@code ts_target_bitrate} field. */
        @NativeType("unsigned int[5]")
        public IntBuffer ts_target_bitrate() { return vpx_codec_enc_cfg_t.nts_target_bitrate(address()); }
        /** Returns the value at the specified index of the {@code ts_target_bitrate} field. */
        @NativeType("unsigned int")
        public int ts_target_bitrate(int index) { return vpx_codec_enc_cfg_t.nts_target_bitrate(address(), index); }
        /** Returns a {@link IntBuffer} view of the {@code ts_rate_decimator} field. */
        @NativeType("unsigned int[5]")
        public IntBuffer ts_rate_decimator() { return vpx_codec_enc_cfg_t.nts_rate_decimator(address()); }
        /** Returns the value at the specified index of the {@code ts_rate_decimator} field. */
        @NativeType("unsigned int")
        public int ts_rate_decimator(int index) { return vpx_codec_enc_cfg_t.nts_rate_decimator(address(), index); }
        /** Returns the value of the {@code ts_periodicity} field. */
        @NativeType("unsigned int")
        public int ts_periodicity() { return vpx_codec_enc_cfg_t.nts_periodicity(address()); }
        /** Returns a {@link IntBuffer} view of the {@code ts_layer_id} field. */
        @NativeType("unsigned int[16]")
        public IntBuffer ts_layer_id() { return vpx_codec_enc_cfg_t.nts_layer_id(address()); }
        /** Returns the value at the specified index of the {@code ts_layer_id} field. */
        @NativeType("unsigned int")
        public int ts_layer_id(int index) { return vpx_codec_enc_cfg_t.nts_layer_id(address(), index); }
        /** Returns a {@link IntBuffer} view of the {@code layer_target_bitrate} field. */
        @NativeType("unsigned int[12]")
        public IntBuffer layer_target_bitrate() { return vpx_codec_enc_cfg_t.nlayer_target_bitrate(address()); }
        /** Returns the value at the specified index of the {@code layer_target_bitrate} field. */
        @NativeType("unsigned int")
        public int layer_target_bitrate(int index) { return vpx_codec_enc_cfg_t.nlayer_target_bitrate(address(), index); }
        /** Returns the value of the {@code temporal_layering_mode} field. */
        public int temporal_layering_mode() { return vpx_codec_enc_cfg_t.ntemporal_layering_mode(address()); }

        /** Sets the specified value to the {@code g_usage} field. */
        public vpx_codec_enc_cfg_t.Buffer g_usage(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.ng_usage(address(), value); return this; }
        /** Sets the specified value to the {@code g_threads} field. */
        public vpx_codec_enc_cfg_t.Buffer g_threads(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.ng_threads(address(), value); return this; }
        /** Sets the specified value to the {@code g_profile} field. */
        public vpx_codec_enc_cfg_t.Buffer g_profile(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.ng_profile(address(), value); return this; }
        /** Sets the specified value to the {@code g_w} field. */
        public vpx_codec_enc_cfg_t.Buffer g_w(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.ng_w(address(), value); return this; }
        /** Sets the specified value to the {@code g_h} field. */
        public vpx_codec_enc_cfg_t.Buffer g_h(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.ng_h(address(), value); return this; }
        /** Sets the specified value to the {@code g_bit_depth} field. */
        public vpx_codec_enc_cfg_t.Buffer g_bit_depth(@NativeType("vpx_bit_depth") int value) { vpx_codec_enc_cfg_t.ng_bit_depth(address(), value); return this; }
        /** Sets the specified value to the {@code g_input_bit_depth} field. */
        public vpx_codec_enc_cfg_t.Buffer g_input_bit_depth(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.ng_input_bit_depth(address(), value); return this; }
        /** Copies the specified {@link vpx_rational} to the {@code g_timebase} field. */
        public vpx_codec_enc_cfg_t.Buffer g_timebase(vpx_rational value) { vpx_codec_enc_cfg_t.ng_timebase(address(), value); return this; }
        /** Passes the {@code g_timebase} field to the specified {@link java.util.function.Consumer Consumer}. */
        public vpx_codec_enc_cfg_t.Buffer g_timebase(java.util.function.Consumer<vpx_rational> consumer) { consumer.accept(g_timebase()); return this; }
        /** Sets the specified value to the {@code g_error_resilient} field. */
        public vpx_codec_enc_cfg_t.Buffer g_error_resilient(@NativeType("uint32_t") int value) { vpx_codec_enc_cfg_t.ng_error_resilient(address(), value); return this; }
        /** Sets the specified value to the {@code g_pass} field. */
        public vpx_codec_enc_cfg_t.Buffer g_pass(@NativeType("vpx_enc_pass") int value) { vpx_codec_enc_cfg_t.ng_pass(address(), value); return this; }
        /** Sets the specified value to the {@code g_lag_in_frames} field. */
        public vpx_codec_enc_cfg_t.Buffer g_lag_in_frames(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.ng_lag_in_frames(address(), value); return this; }
        /** Sets the specified value to the {@code rc_dropframe_thresh} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_dropframe_thresh(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_dropframe_thresh(address(), value); return this; }
        /** Sets the specified value to the {@code rc_resize_allowed} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_resize_allowed(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_resize_allowed(address(), value); return this; }
        /** Sets the specified value to the {@code rc_scaled_width} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_scaled_width(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_scaled_width(address(), value); return this; }
        /** Sets the specified value to the {@code rc_scaled_height} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_scaled_height(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_scaled_height(address(), value); return this; }
        /** Sets the specified value to the {@code rc_resize_up_thresh} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_resize_up_thresh(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_resize_up_thresh(address(), value); return this; }
        /** Sets the specified value to the {@code rc_resize_down_thresh} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_resize_down_thresh(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_resize_down_thresh(address(), value); return this; }
        /** Sets the specified value to the {@code rc_end_usage} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_end_usage(@NativeType("vpx_rc_mode") int value) { vpx_codec_enc_cfg_t.nrc_end_usage(address(), value); return this; }
        /** Copies the specified {@link vpx_fixed_buf_t} to the {@code rc_twopass_stats_in} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_twopass_stats_in(vpx_fixed_buf_t value) { vpx_codec_enc_cfg_t.nrc_twopass_stats_in(address(), value); return this; }
        /** Passes the {@code rc_twopass_stats_in} field to the specified {@link java.util.function.Consumer Consumer}. */
        public vpx_codec_enc_cfg_t.Buffer rc_twopass_stats_in(java.util.function.Consumer<vpx_fixed_buf_t> consumer) { consumer.accept(rc_twopass_stats_in()); return this; }
        /** Copies the specified {@link vpx_fixed_buf_t} to the {@code rc_firstpass_mb_stats_in} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_firstpass_mb_stats_in(vpx_fixed_buf_t value) { vpx_codec_enc_cfg_t.nrc_firstpass_mb_stats_in(address(), value); return this; }
        /** Passes the {@code rc_firstpass_mb_stats_in} field to the specified {@link java.util.function.Consumer Consumer}. */
        public vpx_codec_enc_cfg_t.Buffer rc_firstpass_mb_stats_in(java.util.function.Consumer<vpx_fixed_buf_t> consumer) { consumer.accept(rc_firstpass_mb_stats_in()); return this; }
        /** Sets the specified value to the {@code rc_target_bitrate} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_target_bitrate(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_target_bitrate(address(), value); return this; }
        /** Sets the specified value to the {@code rc_min_quantizer} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_min_quantizer(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_min_quantizer(address(), value); return this; }
        /** Sets the specified value to the {@code rc_max_quantizer} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_max_quantizer(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_max_quantizer(address(), value); return this; }
        /** Sets the specified value to the {@code rc_undershoot_pct} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_undershoot_pct(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_undershoot_pct(address(), value); return this; }
        /** Sets the specified value to the {@code rc_overshoot_pct} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_overshoot_pct(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_overshoot_pct(address(), value); return this; }
        /** Sets the specified value to the {@code rc_buf_sz} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_buf_sz(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_buf_sz(address(), value); return this; }
        /** Sets the specified value to the {@code rc_buf_initial_sz} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_buf_initial_sz(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_buf_initial_sz(address(), value); return this; }
        /** Sets the specified value to the {@code rc_buf_optimal_sz} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_buf_optimal_sz(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_buf_optimal_sz(address(), value); return this; }
        /** Sets the specified value to the {@code rc_2pass_vbr_bias_pct} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_2pass_vbr_bias_pct(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_2pass_vbr_bias_pct(address(), value); return this; }
        /** Sets the specified value to the {@code rc_2pass_vbr_minsection_pct} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_2pass_vbr_minsection_pct(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_2pass_vbr_minsection_pct(address(), value); return this; }
        /** Sets the specified value to the {@code rc_2pass_vbr_maxsection_pct} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_2pass_vbr_maxsection_pct(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_2pass_vbr_maxsection_pct(address(), value); return this; }
        /** Sets the specified value to the {@code rc_2pass_vbr_corpus_complexity} field. */
        public vpx_codec_enc_cfg_t.Buffer rc_2pass_vbr_corpus_complexity(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nrc_2pass_vbr_corpus_complexity(address(), value); return this; }
        /** Sets the specified value to the {@code kf_mode} field. */
        public vpx_codec_enc_cfg_t.Buffer kf_mode(@NativeType("vpx_kf_mode") int value) { vpx_codec_enc_cfg_t.nkf_mode(address(), value); return this; }
        /** Sets the specified value to the {@code kf_min_dist} field. */
        public vpx_codec_enc_cfg_t.Buffer kf_min_dist(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nkf_min_dist(address(), value); return this; }
        /** Sets the specified value to the {@code kf_max_dist} field. */
        public vpx_codec_enc_cfg_t.Buffer kf_max_dist(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nkf_max_dist(address(), value); return this; }
        /** Sets the specified value to the {@code ss_number_layers} field. */
        public vpx_codec_enc_cfg_t.Buffer ss_number_layers(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nss_number_layers(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code ss_enable_auto_alt_ref} field. */
        public vpx_codec_enc_cfg_t.Buffer ss_enable_auto_alt_ref(@NativeType("int[5]") IntBuffer value) { vpx_codec_enc_cfg_t.nss_enable_auto_alt_ref(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ss_enable_auto_alt_ref} field. */
        public vpx_codec_enc_cfg_t.Buffer ss_enable_auto_alt_ref(int index, int value) { vpx_codec_enc_cfg_t.nss_enable_auto_alt_ref(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code ss_target_bitrate} field. */
        public vpx_codec_enc_cfg_t.Buffer ss_target_bitrate(@NativeType("unsigned int[5]") IntBuffer value) { vpx_codec_enc_cfg_t.nss_target_bitrate(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ss_target_bitrate} field. */
        public vpx_codec_enc_cfg_t.Buffer ss_target_bitrate(int index, @NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nss_target_bitrate(address(), index, value); return this; }
        /** Sets the specified value to the {@code ts_number_layers} field. */
        public vpx_codec_enc_cfg_t.Buffer ts_number_layers(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nts_number_layers(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code ts_target_bitrate} field. */
        public vpx_codec_enc_cfg_t.Buffer ts_target_bitrate(@NativeType("unsigned int[5]") IntBuffer value) { vpx_codec_enc_cfg_t.nts_target_bitrate(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ts_target_bitrate} field. */
        public vpx_codec_enc_cfg_t.Buffer ts_target_bitrate(int index, @NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nts_target_bitrate(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code ts_rate_decimator} field. */
        public vpx_codec_enc_cfg_t.Buffer ts_rate_decimator(@NativeType("unsigned int[5]") IntBuffer value) { vpx_codec_enc_cfg_t.nts_rate_decimator(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ts_rate_decimator} field. */
        public vpx_codec_enc_cfg_t.Buffer ts_rate_decimator(int index, @NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nts_rate_decimator(address(), index, value); return this; }
        /** Sets the specified value to the {@code ts_periodicity} field. */
        public vpx_codec_enc_cfg_t.Buffer ts_periodicity(@NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nts_periodicity(address(), value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code ts_layer_id} field. */
        public vpx_codec_enc_cfg_t.Buffer ts_layer_id(@NativeType("unsigned int[16]") IntBuffer value) { vpx_codec_enc_cfg_t.nts_layer_id(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code ts_layer_id} field. */
        public vpx_codec_enc_cfg_t.Buffer ts_layer_id(int index, @NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nts_layer_id(address(), index, value); return this; }
        /** Copies the specified {@link IntBuffer} to the {@code layer_target_bitrate} field. */
        public vpx_codec_enc_cfg_t.Buffer layer_target_bitrate(@NativeType("unsigned int[12]") IntBuffer value) { vpx_codec_enc_cfg_t.nlayer_target_bitrate(address(), value); return this; }
        /** Sets the specified value at the specified index of the {@code layer_target_bitrate} field. */
        public vpx_codec_enc_cfg_t.Buffer layer_target_bitrate(int index, @NativeType("unsigned int") int value) { vpx_codec_enc_cfg_t.nlayer_target_bitrate(address(), index, value); return this; }
        /** Sets the specified value to the {@code temporal_layering_mode} field. */
        public vpx_codec_enc_cfg_t.Buffer temporal_layering_mode(int value) { vpx_codec_enc_cfg_t.ntemporal_layering_mode(address(), value); return this; }

    }

}