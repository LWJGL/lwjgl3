/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**
 * Native bindings to the <a target="_blank" href="https://opus-codec.org/">Opus</a> library.
 * 
 * <p>The Opus codec is designed for interactive speech and audio transmission over the Internet. It is designed by the IETF Codec Working Group and
 * incorporates technology from Skype's SILK codec and Xiph.Org's CELT codec.</p>
 * 
 * <p>The Opus codec is designed to handle a wide range of interactive audio applications, including Voice over IP, videoconferencing, in-game chat, and even
 * remote live music performances. It can scale from low bit-rate narrowband speech to very high quality stereo music. Its main features are:</p>
 * 
 * <ul>
 * <li>Sampling rates from 8 to 48 kHz</li>
 * <li>Bit-rates from 6 kb/s to 510 kb/s</li>
 * <li>Support for both constant bit-rate (CBR) and variable bit-rate (VBR)</li>
 * <li>Audio bandwidth from narrowband to full-band</li>
 * <li>Support for speech and music</li>
 * <li>Support for mono and stereo</li>
 * <li>Support for multichannel (up to 255 channels)</li>
 * <li>Frame sizes from 2.5 ms to 60 ms</li>
 * <li>Good loss robustness and packet loss concealment (PLC)</li>
 * <li>Floating point and fixed-point implementation</li>
 * </ul>
 * 
 * <h2>Opus Encoder</h2>
 * 
 * <p>This section describes the process and functions used to encode Opus.</p>
 * 
 * <p>Since Opus is a stateful codec, the encoding process starts with creating an encoder state. This can be done with:</p>
 * 
 * <pre><code>
 * int error;
 * OpusEncoder *enc;
 * enc = opus_encoder_create(Fs, channels, application, &amp;error);</code></pre>
 * 
 * <p>From this point, {@code enc} can be used for encoding an audio stream. An encoder state <em>must</em> not be used for more than one stream at the
 * same time. Similarly, the encoder state <em>must</em> not be re-initialized for each frame.</p>
 * 
 * <p>While {@link #opus_encoder_create encoder_create} allocates memory for the state, it's also possible to initialize pre-allocated memory:</p>
 * 
 * <pre><code>
 *         int size;
 * int error;
 * OpusEncoder *enc;
 * size = opus_encoder_get_size(channels);
 * enc = malloc(size);
 * error = opus_encoder_init(enc, Fs, channels, application);</code></pre>
 * 
 * <p>where {@link #opus_encoder_get_size encoder_get_size} returns the required size for the encoder state. Note that future versions of this code may change the size, so no assuptions
 * should be made about it.</p>
 * 
 * <p>The encoder state is always continuous in memory and only a shallow copy is sufficient to copy it (e.g. {@code memcpy()}).</p>
 * 
 * <p>It is possible to change some of the encoder's settings using the {@link #opus_encoder_ctl encoder_ctl} interface. All these settings already default to the recommended
 * value, so they should only be changed when necessary. The most common settings one may want to change are:</p>
 * 
 * <pre><code>
 * opus_encoder_ctl(enc, OPUS_SET_BITRATE(bitrate));
 * opus_encoder_ctl(enc, OPUS_SET_COMPLEXITY(complexity));
 * opus_encoder_ctl(enc, OPUS_SET_SIGNAL(signal_type));</code></pre>
 * 
 * <p>where</p><ul>
 * <li>{@code bitrate} is in bits per second (b/s),</li>
 * <li>{@code complexity} is a value from 1 to 10, where 1 is the lowest complexity and 10 is the highest, and</li>
 * <li>{@code signal_type} is either {@link #OPUS_AUTO AUTO} (default), {@link #OPUS_SIGNAL_VOICE SIGNAL_VOICE}, or {@link #OPUS_SIGNAL_MUSIC SIGNAL_MUSIC}.</li>
 * </ul>
 * 
 * <p>See Encoder related CTLs and Generic CTLs for a complete list of parameters that can be set or queried. Most parameters can be set or changed at any
 * time during a stream.</p>
 * 
 * <p>To encode a frame, {@link #opus_encode encode} or {@link #opus_encode_float encode_float} must be called with exactly one frame (2.5, 5, 10, 20, 40 or 60 ms) of audio data:</p>
 * 
 * <pre><code>
 * len = opus_encode(enc, audio_frame, frame_size, packet, max_packet);</code></pre>
 * 
 * <p>where</p><ul>
 * <li>{@code audio_frame} is the audio data in short (or float for {@link #opus_encode_float encode_float}),</li>
 * <li>{@code frame_size} is the duration of the frame in samples (per channel),</li>
 * <li>{@code packet} is the byte array to which the compressed data is written, and</li>
 * <li>{@code max_packet} is the maximum number of bytes that can be written in the packet (4000 bytes is recommended). Do not use {@code max_packet} to
 * control VBR target bitrate, instead use the {@link #OPUS_SET_BITRATE_REQUEST SET_BITRATE_REQUEST} CTL.</li>
 * </ul>
 * 
 * <p>{@link #opus_encode encode} and {@link #opus_encode_float encode_float} return the number of bytes actually written to the packet. The return value <b>can be negative</b>, which indicates that
 * an error has occurred. If the return value is 2 bytes or less, then the packet does not need to be transmitted (DTX).</p>
 * 
 * <p>Once the encoder state if no longer needed, it can be destroyed with</p>
 * 
 * <pre><code>
 * opus_encoder_destroy(enc);</code></pre>
 * 
 * <p>If the encoder was created with {@link #opus_encoder_init encoder_init} rather than {@link #opus_encoder_create encoder_create}, then no action is required aside from potentially freeing the memory
 * that was manually allocated for it (calling {@code free(enc)} for the example above).</p>
 * 
 * <h2>Opus Decoder</h2>
 * 
 * <p>This page describes the process and functions used to decode Opus.</p>
 * 
 * <p>The decoding process also starts with creating a decoder state. This can be done with:</p>
 * 
 * <pre><code>
 * int error;
 * OpusDecoder *dec;
 * dec = opus_decoder_create(Fs, channels, &amp;error);</code></pre>
 * 
 * <p>where</p><ul>
 * <li>Fs is the sampling rate and must be 8000, 12000, 16000, 24000, or 48000</li>
 * <li>channels is the number of channels (1 or 2)</li>
 * <li>error will hold the error code in case of failure (or {@link #OPUS_OK OK} on success), and</li>
 * <li>the return value is a newly created decoder state to be used for decoding.</li>
 * </ul>
 * 
 * <p>While {@link #opus_decoder_create decoder_create} allocates memory for the state, it's also possible to initialize pre-allocated memory:</p>
 * 
 * <pre><code>
 * int size;
 * int error;
 * OpusDecoder *dec;
 * size = opus_decoder_get_size(channels);
 * dec = malloc(size);
 * error = opus_decoder_init(dec, Fs, channels);</code></pre>
 * 
 * <p>where {@link #opus_decoder_get_size decoder_get_size} returns the required size for the decoder state. Note that future versions of this code may change the size, so no assuptions
 * should be made about it.</p>
 * 
 * <p>The decoder state is always continuous in memory and only a shallow copy is sufficient to copy it (e.g. {@code memcpy()}).</p>
 * 
 * <p>To decode a frame, {@link #opus_decode decode} or {@link #opus_decode_float decode_float} must be called with a packet of compressed audio data:</p>
 * 
 * <pre><code>
 * frame_size = opus_decode(dec, packet, len, decoded, max_size, 0);</code></pre>
 * 
 * <p>where</p><ul>
 * <li>{@code packet} is the byte array containing the compressed data</li>
 * <li>{@code len} is the exact number of bytes contained in the packet</li>
 * <li>{@code decoded} is the decoded audio data in {@code opus_int16} (or float for {@link #opus_decode_float decode_float}), and</li>
 * <li>{@code max_size} is the max duration of the frame in samples (per channel) that can fit into the {@code decoded_frame} array.</li>
 * </ul>
 * 
 * <p>{@link #opus_decode decode} and {@link #opus_decode_float decode_float} return the number of samples (per channel) decoded from the packet. If that value is negative, then an error has
 * occurred. This can occur if the packet is corrupted or if the audio buffer is too small to hold the decoded audio.</p>
 * 
 * <p>Opus is a stateful codec with overlapping blocks and as a result Opus packets are not coded independently of each other. Packets must be passed into
 * the decoder serially and in the correct order for a correct decode. Lost packets can be replaced with loss concealment by calling the decoder with a
 * null pointer and zero length for the missing packet.</p>
 * 
 * <p>A single codec state may only be accessed from a single thread at a time and any required locking must be performed by the caller. Separate streams
 * must be decoded with separate decoder states and can be decoded in parallel unless the library was compiled with {@code NONTHREADSAFE_PSEUDOSTACK}
 * defined.</p>
 * 
 * <h2>Repacketizer</h2>
 * 
 * <p>The repacketizer can be used to merge multiple Opus packets into a single packet or alternatively to split Opus packets that have previously been
 * merged. Splitting valid Opus packets is always guaranteed to succeed, whereas merging valid packets only succeeds if all frames have the same mode,
 * bandwidth, and frame size, and when the total duration of the merged packet is no more than 120 ms. The 120 ms limit comes from the specification and
 * limits decoder memory requirements at a point where framing overhead becomes negligible.</p>
 * 
 * <p>The repacketizer currently only operates on elementary Opus streams. It will not manipualte multistream packets successfully, except in the degenerate
 * case where they consist of data from a single stream.</p>
 * 
 * <p>The repacketizing process starts with creating a repacketizer state, either by calling {@link #opus_repacketizer_create repacketizer_create} or by allocating the memory yourself,
 * e.g.,</p><pre><code>
 * OpusRepacketizer *rp;
 * rp = (OpusRepacketizer*)malloc(opus_repacketizer_get_size());
 * if (rp != NULL)
 *     opus_repacketizer_init(rp);</code></pre>
 * 
 * <p>Then the application should submit packets with {@link #opus_repacketizer_cat repacketizer_cat}, extract new packets with {@link #opus_repacketizer_out repacketizer_out} or {@link #opus_repacketizer_out_range repacketizer_out_range}, and
 * then reset the state for the next set of input packets via {@link #opus_repacketizer_init repacketizer_init}.</p>
 * 
 * <p>For example, to split a sequence of packets into individual frames:</p>
 * 
 * <pre><code>
 * unsigned char *data;
 * int len;
 * while (get_next_packet(&amp;data, &amp;len))
 * {
 *   unsigned char out[1276];
 *   opus_int32 out_len;
 *   int nb_frames;
 *   int err;
 *   int i;
 *   err = opus_repacketizer_cat(rp, data, len);
 *   if (err != OPUS_OK)
 *   {
 *     release_packet(data);
 *     return err;
 *   }
 *   nb_frames = opus_repacketizer_get_nb_frames(rp);
 *   for (i = 0; i &lt; nb_frames; i++)
 *   {
 *     out_len = opus_repacketizer_out_range(rp, i, i+1, out, sizeof(out));
 *     if (out_len &lt; 0)
 *     {
 *        release_packet(data);
 *        return (int)out_len;
 *     }
 *     output_next_packet(out, out_len);
 *   }
 *   opus_repacketizer_init(rp);
 *   release_packet(data);
 * }</code></pre>
 * 
 * <p>Alternatively, to combine a sequence of frames into packets that each contain up to {@code TARGET_DURATION_MS} milliseconds of data:</p>
 * 
 * <pre><code>
 * // The maximum number of packets with duration TARGET_DURATION_MS occurs
 * // when the frame size is 2.5 ms, for a total of (TARGET_DURATION_MS*2/5)
 * // packets.
 * unsigned char *data[(TARGET_DURATION_MS*2/5)+1];
 * opus_int32 len[(TARGET_DURATION_MS*2/5)+1];
 * int nb_packets;
 * unsigned char out[1277*(TARGET_DURATION_MS*2/2)];
 * opus_int32 out_len;
 * int prev_toc;
 * nb_packets = 0;
 * while (get_next_packet(data+nb_packets, len+nb_packets))
 * {
 *   int nb_frames;
 *   int err;
 *   nb_frames = opus_packet_get_nb_frames(data[nb_packets], len[nb_packets]);
 *   if (nb_frames &lt; 1)
 *   {
 *     release_packets(data, nb_packets+1);
 *     return nb_frames;
 *   }
 *   nb_frames += opus_repacketizer_get_nb_frames(rp);
 *   // If adding the next packet would exceed our target, or it has an
 *   // incompatible TOC sequence, output the packets we already have before
 *   // submitting it.
 *   // N.B., The nb_packets &gt; 0 check ensures we've submitted at least one
 *   // packet since the last call to opus_repacketizer_init(). Otherwise a
 *   // single packet longer than TARGET_DURATION_MS would cause us to try to
 *   // output an (invalid) empty packet. It also ensures that prev_toc has
 *   // been set to a valid value. Additionally, len[nb_packets] &gt; 0 is
 *   // guaranteed by the call to opus_packet_get_nb_frames() above, so the
 *   // reference to data[nb_packets][0] should be valid.
 *   if (nb_packets &gt; 0 &amp;&amp; (
 *       ((prev_toc &amp; 0xFC) != (data[nb_packets][0] &amp; 0xFC)) ||
 *       opus_packet_get_samples_per_frame(data[nb_packets], 48000)*nb_frames &gt;
 *       TARGET_DURATION_MS*48))
 *   {
 *     out_len = opus_repacketizer_out(rp, out, sizeof(out));
 *     if (out_len &lt; 0)
 *     {
 *        release_packets(data, nb_packets+1);
 *        return (int)out_len;
 *     }
 *     output_next_packet(out, out_len);
 *     opus_repacketizer_init(rp);
 *     release_packets(data, nb_packets);
 *     data[0] = data[nb_packets];
 *     len[0] = len[nb_packets];
 *     nb_packets = 0;
 *   }
 *   err = opus_repacketizer_cat(rp, data[nb_packets], len[nb_packets]);
 *   if (err != OPUS_OK)
 *   {
 *     release_packets(data, nb_packets+1);
 *     return err;
 *   }
 *   prev_toc = data[nb_packets][0];
 *   nb_packets++;
 * }
 * // Output the final, partial packet.
 * if (nb_packets &gt; 0)
 * {
 *   out_len = opus_repacketizer_out(rp, out, sizeof(out));
 *   release_packets(data, nb_packets);
 *   if (out_len &lt; 0)
 *     return (int)out_len;
 *   output_next_packet(out, out_len);
 * }</code></pre>
 * 
 * <p>An alternate way of merging packets is to simply call {@link #opus_repacketizer_cat repacketizer_cat} unconditionally until it fails. At that point, the merged packet can be
 * obtained with {@code opus_repacketizer_out()} and the input packet for which {@code opus_repacketizer_cat()} needs to be re-added to a newly
 * reinitialized repacketizer state.</p>
 */
public class Opus {

    /**
     * Error codes.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OPUS_OK OK} - No error</li>
     * <li>{@link #OPUS_BAD_ARG BAD_ARG} - One or more invalid/out of range arguments</li>
     * <li>{@link #OPUS_BUFFER_TOO_SMALL BUFFER_TOO_SMALL} - Not enough bytes allocated in the buffer</li>
     * <li>{@link #OPUS_INTERNAL_ERROR INTERNAL_ERROR} - An internal error was detected</li>
     * <li>{@link #OPUS_INVALID_PACKET INVALID_PACKET} - The compressed data passed is corrupted</li>
     * <li>{@link #OPUS_UNIMPLEMENTED UNIMPLEMENTED} - Invalid/unsupported request number</li>
     * <li>{@link #OPUS_INVALID_STATE INVALID_STATE} - An encoder or decoder structure is invalid or already freed</li>
     * <li>{@link #OPUS_ALLOC_FAIL ALLOC_FAIL} - Memory allocation has failed</li>
     * </ul>
     */
    public static final int
        OPUS_OK               = 0,
        OPUS_BAD_ARG          = -1,
        OPUS_BUFFER_TOO_SMALL = -2,
        OPUS_INTERNAL_ERROR   = -3,
        OPUS_INVALID_PACKET   = -4,
        OPUS_UNIMPLEMENTED    = -5,
        OPUS_INVALID_STATE    = -6,
        OPUS_ALLOC_FAIL       = -7;

    /**
     * CTLs
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OPUS_SET_APPLICATION_REQUEST SET_APPLICATION_REQUEST}</li>
     * <li>{@link #OPUS_GET_APPLICATION_REQUEST GET_APPLICATION_REQUEST}</li>
     * <li>{@link #OPUS_SET_BITRATE_REQUEST SET_BITRATE_REQUEST}</li>
     * <li>{@link #OPUS_GET_BITRATE_REQUEST GET_BITRATE_REQUEST}</li>
     * <li>{@link #OPUS_SET_MAX_BANDWIDTH_REQUEST SET_MAX_BANDWIDTH_REQUEST}</li>
     * <li>{@link #OPUS_GET_MAX_BANDWIDTH_REQUEST GET_MAX_BANDWIDTH_REQUEST}</li>
     * <li>{@link #OPUS_SET_VBR_REQUEST SET_VBR_REQUEST}</li>
     * <li>{@link #OPUS_GET_VBR_REQUEST GET_VBR_REQUEST}</li>
     * <li>{@link #OPUS_SET_BANDWIDTH_REQUEST SET_BANDWIDTH_REQUEST}</li>
     * <li>{@link #OPUS_GET_BANDWIDTH_REQUEST GET_BANDWIDTH_REQUEST}</li>
     * <li>{@link #OPUS_SET_COMPLEXITY_REQUEST SET_COMPLEXITY_REQUEST}</li>
     * <li>{@link #OPUS_GET_COMPLEXITY_REQUEST GET_COMPLEXITY_REQUEST}</li>
     * <li>{@link #OPUS_SET_INBAND_FEC_REQUEST SET_INBAND_FEC_REQUEST}</li>
     * <li>{@link #OPUS_GET_INBAND_FEC_REQUEST GET_INBAND_FEC_REQUEST}</li>
     * <li>{@link #OPUS_SET_PACKET_LOSS_PERC_REQUEST SET_PACKET_LOSS_PERC_REQUEST}</li>
     * <li>{@link #OPUS_GET_PACKET_LOSS_PERC_REQUEST GET_PACKET_LOSS_PERC_REQUEST}</li>
     * <li>{@link #OPUS_SET_DTX_REQUEST SET_DTX_REQUEST}</li>
     * <li>{@link #OPUS_GET_DTX_REQUEST GET_DTX_REQUEST}</li>
     * <li>{@link #OPUS_SET_VBR_CONSTRAINT_REQUEST SET_VBR_CONSTRAINT_REQUEST}</li>
     * <li>{@link #OPUS_GET_VBR_CONSTRAINT_REQUEST GET_VBR_CONSTRAINT_REQUEST}</li>
     * <li>{@link #OPUS_SET_FORCE_CHANNELS_REQUEST SET_FORCE_CHANNELS_REQUEST}</li>
     * <li>{@link #OPUS_GET_FORCE_CHANNELS_REQUEST GET_FORCE_CHANNELS_REQUEST}</li>
     * <li>{@link #OPUS_SET_SIGNAL_REQUEST SET_SIGNAL_REQUEST}</li>
     * <li>{@link #OPUS_GET_SIGNAL_REQUEST GET_SIGNAL_REQUEST}</li>
     * <li>{@link #OPUS_GET_LOOKAHEAD_REQUEST GET_LOOKAHEAD_REQUEST}</li>
     * <li>{@link #OPUS_RESET_STATE RESET_STATE} - 
     * Resets the codec state to be equivalent to a freshly initialized state.
     * 
     * <p>This should be called when switching streams in order to prevent the back to back decoding from giving different results from one at a time
     * decoding.</p>
     * </li>
     * <li>{@link #OPUS_GET_SAMPLE_RATE_REQUEST GET_SAMPLE_RATE_REQUEST}</li>
     * <li>{@link #OPUS_GET_FINAL_RANGE_REQUEST GET_FINAL_RANGE_REQUEST}</li>
     * <li>{@link #OPUS_GET_PITCH_REQUEST GET_PITCH_REQUEST}</li>
     * <li>{@link #OPUS_SET_GAIN_REQUEST SET_GAIN_REQUEST}</li>
     * <li>{@link #OPUS_GET_GAIN_REQUEST GET_GAIN_REQUEST}</li>
     * <li>{@link #OPUS_SET_LSB_DEPTH_REQUEST SET_LSB_DEPTH_REQUEST}</li>
     * <li>{@link #OPUS_GET_LSB_DEPTH_REQUEST GET_LSB_DEPTH_REQUEST}</li>
     * <li>{@link #OPUS_GET_LAST_PACKET_DURATION_REQUEST GET_LAST_PACKET_DURATION_REQUEST}</li>
     * <li>{@link #OPUS_SET_EXPERT_FRAME_DURATION_REQUEST SET_EXPERT_FRAME_DURATION_REQUEST}</li>
     * <li>{@link #OPUS_GET_EXPERT_FRAME_DURATION_REQUEST GET_EXPERT_FRAME_DURATION_REQUEST}</li>
     * <li>{@link #OPUS_SET_PREDICTION_DISABLED_REQUEST SET_PREDICTION_DISABLED_REQUEST}</li>
     * <li>{@link #OPUS_GET_PREDICTION_DISABLED_REQUEST GET_PREDICTION_DISABLED_REQUEST}</li>
     * <li>{@link #OPUS_SET_PHASE_INVERSION_DISABLED_REQUEST SET_PHASE_INVERSION_DISABLED_REQUEST}</li>
     * <li>{@link #OPUS_GET_PHASE_INVERSION_DISABLED_REQUEST GET_PHASE_INVERSION_DISABLED_REQUEST}</li>
     * <li>{@link #OPUS_GET_IN_DTX_REQUEST GET_IN_DTX_REQUEST}</li>
     * </ul>
     */
    public static final int
        OPUS_SET_APPLICATION_REQUEST              = 4000,
        OPUS_GET_APPLICATION_REQUEST              = 4001,
        OPUS_SET_BITRATE_REQUEST                  = 4002,
        OPUS_GET_BITRATE_REQUEST                  = 4003,
        OPUS_SET_MAX_BANDWIDTH_REQUEST            = 4004,
        OPUS_GET_MAX_BANDWIDTH_REQUEST            = 4005,
        OPUS_SET_VBR_REQUEST                      = 4006,
        OPUS_GET_VBR_REQUEST                      = 4007,
        OPUS_SET_BANDWIDTH_REQUEST                = 4008,
        OPUS_GET_BANDWIDTH_REQUEST                = 4009,
        OPUS_SET_COMPLEXITY_REQUEST               = 4010,
        OPUS_GET_COMPLEXITY_REQUEST               = 4011,
        OPUS_SET_INBAND_FEC_REQUEST               = 4012,
        OPUS_GET_INBAND_FEC_REQUEST               = 4013,
        OPUS_SET_PACKET_LOSS_PERC_REQUEST         = 4014,
        OPUS_GET_PACKET_LOSS_PERC_REQUEST         = 4015,
        OPUS_SET_DTX_REQUEST                      = 4016,
        OPUS_GET_DTX_REQUEST                      = 4017,
        OPUS_SET_VBR_CONSTRAINT_REQUEST           = 4020,
        OPUS_GET_VBR_CONSTRAINT_REQUEST           = 4021,
        OPUS_SET_FORCE_CHANNELS_REQUEST           = 4022,
        OPUS_GET_FORCE_CHANNELS_REQUEST           = 4023,
        OPUS_SET_SIGNAL_REQUEST                   = 4024,
        OPUS_GET_SIGNAL_REQUEST                   = 4025,
        OPUS_GET_LOOKAHEAD_REQUEST                = 4027,
        OPUS_RESET_STATE                          = 4028,
        OPUS_GET_SAMPLE_RATE_REQUEST              = 4029,
        OPUS_GET_FINAL_RANGE_REQUEST              = 4031,
        OPUS_GET_PITCH_REQUEST                    = 4033,
        OPUS_SET_GAIN_REQUEST                     = 4034,
        OPUS_GET_GAIN_REQUEST                     = 4045,
        OPUS_SET_LSB_DEPTH_REQUEST                = 4036,
        OPUS_GET_LSB_DEPTH_REQUEST                = 4037,
        OPUS_GET_LAST_PACKET_DURATION_REQUEST     = 4039,
        OPUS_SET_EXPERT_FRAME_DURATION_REQUEST    = 4040,
        OPUS_GET_EXPERT_FRAME_DURATION_REQUEST    = 4041,
        OPUS_SET_PREDICTION_DISABLED_REQUEST      = 4042,
        OPUS_GET_PREDICTION_DISABLED_REQUEST      = 4043,
        OPUS_SET_PHASE_INVERSION_DISABLED_REQUEST = 4046,
        OPUS_GET_PHASE_INVERSION_DISABLED_REQUEST = 4047,
        OPUS_GET_IN_DTX_REQUEST                   = 4049;

    /** Values for the various encoder CTLs. */
    public static final int
        OPUS_AUTO        = -1000,
        OPUS_BITRATE_MAX = -1;

    /**
     * Coding modes.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OPUS_APPLICATION_VOIP APPLICATION_VOIP} - Best for most VoIP/videoconference applications where listening quality and intelligibility matter most</li>
     * <li>{@link #OPUS_APPLICATION_AUDIO APPLICATION_AUDIO} - Best for broadcast/high-fidelity application where the decoded audio should be as close as possible to the input</li>
     * <li>{@link #OPUS_APPLICATION_RESTRICTED_LOWDELAY APPLICATION_RESTRICTED_LOWDELAY} - Only use when lowest-achievable latency is what matters most. Voice-optimized modes cannot be used.</li>
     * </ul>
     */
    public static final int
        OPUS_APPLICATION_VOIP                = 2048,
        OPUS_APPLICATION_AUDIO               = 2049,
        OPUS_APPLICATION_RESTRICTED_LOWDELAY = 2051;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OPUS_SIGNAL_VOICE SIGNAL_VOICE} - Signal being encoded is voice</li>
     * <li>{@link #OPUS_SIGNAL_MUSIC SIGNAL_MUSIC} - Signal being encoded is music</li>
     * </ul>
     */
    public static final int
        OPUS_SIGNAL_VOICE = 3001,
        OPUS_SIGNAL_MUSIC = 3002;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OPUS_BANDWIDTH_NARROWBAND BANDWIDTH_NARROWBAND} - Narrowband (4kHz bandpass)</li>
     * <li>{@link #OPUS_BANDWIDTH_MEDIUMBAND BANDWIDTH_MEDIUMBAND} - Mediumband (6kHz bandpass)</li>
     * <li>{@link #OPUS_BANDWIDTH_WIDEBAND BANDWIDTH_WIDEBAND} - Wideband (8kHz bandpass)</li>
     * <li>{@link #OPUS_BANDWIDTH_SUPERWIDEBAND BANDWIDTH_SUPERWIDEBAND} - Superwideband (12kHz bandpass)</li>
     * <li>{@link #OPUS_BANDWIDTH_FULLBAND BANDWIDTH_FULLBAND} - Fullband (20kHz bandpass)</li>
     * </ul>
     */
    public static final int
        OPUS_BANDWIDTH_NARROWBAND    = 1101,
        OPUS_BANDWIDTH_MEDIUMBAND    = 1102,
        OPUS_BANDWIDTH_WIDEBAND      = 1103,
        OPUS_BANDWIDTH_SUPERWIDEBAND = 1104,
        OPUS_BANDWIDTH_FULLBAND      = 1105;

    /**
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OPUS_FRAMESIZE_ARG FRAMESIZE_ARG} - Select frame size from the argument (default)</li>
     * <li>{@link #OPUS_FRAMESIZE_2_5_MS FRAMESIZE_2_5_MS} - Use 2.5 ms frames</li>
     * <li>{@link #OPUS_FRAMESIZE_5_MS FRAMESIZE_5_MS} - Use 5 ms frames</li>
     * <li>{@link #OPUS_FRAMESIZE_10_MS FRAMESIZE_10_MS} - Use 10 ms frames</li>
     * <li>{@link #OPUS_FRAMESIZE_20_MS FRAMESIZE_20_MS} - Use 20 ms frames</li>
     * <li>{@link #OPUS_FRAMESIZE_40_MS FRAMESIZE_40_MS} - Use 40 ms frames</li>
     * <li>{@link #OPUS_FRAMESIZE_60_MS FRAMESIZE_60_MS} - Use 60 ms frames</li>
     * <li>{@link #OPUS_FRAMESIZE_80_MS FRAMESIZE_80_MS} - Use 80 ms frames</li>
     * <li>{@link #OPUS_FRAMESIZE_100_MS FRAMESIZE_100_MS} - Use 100 ms frames</li>
     * <li>{@link #OPUS_FRAMESIZE_120_MS FRAMESIZE_120_MS} - Use 120 ms frames</li>
     * </ul>
     */
    public static final int
        OPUS_FRAMESIZE_ARG    = 5000,
        OPUS_FRAMESIZE_2_5_MS = 5001,
        OPUS_FRAMESIZE_5_MS   = 5002,
        OPUS_FRAMESIZE_10_MS  = 5003,
        OPUS_FRAMESIZE_20_MS  = 5004,
        OPUS_FRAMESIZE_40_MS  = 5005,
        OPUS_FRAMESIZE_60_MS  = 5006,
        OPUS_FRAMESIZE_80_MS  = 5007,
        OPUS_FRAMESIZE_100_MS = 5008,
        OPUS_FRAMESIZE_120_MS = 5009;

    protected Opus() {
        throw new UnsupportedOperationException();
    }

    private static final SharedLibrary OPUS = Library.loadNative(Opus.class, "org.lwjgl.opus", Configuration.OPUS_LIBRARY_NAME.get(Platform.mapLibraryNameBundled("opus")), true);

    /** Contains the function pointers loaded from the opus {@link SharedLibrary}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            encoder_get_size             = apiGetFunctionAddress(OPUS, "opus_encoder_get_size"),
            encoder_create               = apiGetFunctionAddress(OPUS, "opus_encoder_create"),
            encoder_init                 = apiGetFunctionAddress(OPUS, "opus_encoder_init"),
            encode                       = apiGetFunctionAddress(OPUS, "opus_encode"),
            encode_float                 = apiGetFunctionAddress(OPUS, "opus_encode_float"),
            encoder_destroy              = apiGetFunctionAddress(OPUS, "opus_encoder_destroy"),
            encoder_ctl                  = apiGetFunctionAddress(OPUS, "opus_encoder_ctl"),
            decoder_get_size             = apiGetFunctionAddress(OPUS, "opus_decoder_get_size"),
            decoder_create               = apiGetFunctionAddress(OPUS, "opus_decoder_create"),
            decoder_init                 = apiGetFunctionAddress(OPUS, "opus_decoder_init"),
            decode                       = apiGetFunctionAddress(OPUS, "opus_decode"),
            decode_float                 = apiGetFunctionAddress(OPUS, "opus_decode_float"),
            decoder_ctl                  = apiGetFunctionAddress(OPUS, "opus_decoder_ctl"),
            decoder_destroy              = apiGetFunctionAddress(OPUS, "opus_decoder_destroy"),
            packet_parse                 = apiGetFunctionAddress(OPUS, "opus_packet_parse"),
            packet_get_bandwidth         = apiGetFunctionAddress(OPUS, "opus_packet_get_bandwidth"),
            packet_get_samples_per_frame = apiGetFunctionAddress(OPUS, "opus_packet_get_samples_per_frame"),
            packet_get_nb_channels       = apiGetFunctionAddress(OPUS, "opus_packet_get_nb_channels"),
            packet_get_nb_frames         = apiGetFunctionAddress(OPUS, "opus_packet_get_nb_frames"),
            packet_get_nb_samples        = apiGetFunctionAddress(OPUS, "opus_packet_get_nb_samples"),
            decoder_get_nb_samples       = apiGetFunctionAddress(OPUS, "opus_decoder_get_nb_samples"),
            pcm_soft_clip                = apiGetFunctionAddress(OPUS, "opus_pcm_soft_clip"),
            repacketizer_get_size        = apiGetFunctionAddress(OPUS, "opus_repacketizer_get_size"),
            repacketizer_init            = apiGetFunctionAddress(OPUS, "opus_repacketizer_init"),
            repacketizer_create          = apiGetFunctionAddress(OPUS, "opus_repacketizer_create"),
            repacketizer_destroy         = apiGetFunctionAddress(OPUS, "opus_repacketizer_destroy"),
            repacketizer_cat             = apiGetFunctionAddress(OPUS, "opus_repacketizer_cat"),
            repacketizer_out_range       = apiGetFunctionAddress(OPUS, "opus_repacketizer_out_range"),
            repacketizer_get_nb_frames   = apiGetFunctionAddress(OPUS, "opus_repacketizer_get_nb_frames"),
            repacketizer_out             = apiGetFunctionAddress(OPUS, "opus_repacketizer_out"),
            packet_pad                   = apiGetFunctionAddress(OPUS, "opus_packet_pad"),
            packet_unpad                 = apiGetFunctionAddress(OPUS, "opus_packet_unpad"),
            multistream_packet_pad       = apiGetFunctionAddress(OPUS, "opus_multistream_packet_pad"),
            multistream_packet_unpad     = apiGetFunctionAddress(OPUS, "opus_multistream_packet_unpad"),
            strerror                     = apiGetFunctionAddress(OPUS, "opus_strerror"),
            get_version_string           = apiGetFunctionAddress(OPUS, "opus_get_version_string");

    }

    /** Returns the opus {@link SharedLibrary}. */
    public static SharedLibrary getLibrary() {
        return OPUS;
    }

    // --- [ opus_encoder_get_size ] ---

    /**
     * Gets the size of an {@code OpusEncoder} structure.
     *
     * @param channels number of channels. One of:<br><table><tr><td>1</td><td>2</td></tr></table>
     *
     * @return the size in bytes
     */
    public static int opus_encoder_get_size(int channels) {
        long __functionAddress = Functions.encoder_get_size;
        return invokeI(channels, __functionAddress);
    }

    // --- [ opus_encoder_create ] ---

    /** Unsafe version of: {@link #opus_encoder_create encoder_create} */
    public static long nopus_encoder_create(int Fs, int channels, int application, long error) {
        long __functionAddress = Functions.encoder_create;
        return invokePP(Fs, channels, application, error, __functionAddress);
    }

    /**
     * Allocates and initializes an encoder state.
     * 
     * <p>There are three coding modes:</p>
     * 
     * <ul>
     * <li>{@link #OPUS_APPLICATION_VOIP APPLICATION_VOIP}: gives best quality at a given bitrate for voice signals.
     * 
     * <p>It enhances the input signal by high-pass filtering and emphasizing formants and harmonics. Optionally it includes in-band forward error correction
     * to protect against packet loss. Use this mode for typical VoIP applications. Because of the enhancement, even at high bitrates the output may sound
     * different from the input.</p></li>
     * <li>{@link #OPUS_APPLICATION_AUDIO APPLICATION_AUDIO}: gives best quality at a given bitrate for most non-voice signals like music.
     * 
     * <p>Use this mode for music and mixed (music/voice) content, broadcast, and applications requiring less than 15 ms of coding delay.</p></li>
     * <li>{@link #OPUS_APPLICATION_RESTRICTED_LOWDELAY APPLICATION_RESTRICTED_LOWDELAY}: configures low-delay mode that disables the speech-optimized mode in exchange for slightly reduced delay.
     * 
     * <p>This mode can only be set on an newly initialized or freshly reset encoder because it changes the codec delay.</p></li>
     * </ul>
     * 
     * <p>This is useful when the caller knows that the speech-optimized modes will not be needed (use with caution).</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Regardless of the sampling rate and number channels selected, the Opus encoder can switch to a lower audio bandwidth or number of
     * channels if the bitrate selected is too low. This also means that it is safe to always use 48 kHz stereo input and let the encoder optimize the
     * encoding.</p></div>
     *
     * @param Fs          sampling rate of input signal (Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param channels    number of channels in input signal. One of:<br><table><tr><td>1</td><td>2</td></tr></table>
     * @param application coding mode. One of:<br><table><tr><td>{@link #OPUS_APPLICATION_VOIP APPLICATION_VOIP}</td><td>{@link #OPUS_APPLICATION_AUDIO APPLICATION_AUDIO}</td><td>{@link #OPUS_APPLICATION_RESTRICTED_LOWDELAY APPLICATION_RESTRICTED_LOWDELAY}</td></tr></table>
     * @param error       one of:<br><table><tr><td>{@link #OPUS_OK OK}</td><td>{@link #OPUS_BAD_ARG BAD_ARG}</td><td>{@link #OPUS_BUFFER_TOO_SMALL BUFFER_TOO_SMALL}</td><td>{@link #OPUS_INTERNAL_ERROR INTERNAL_ERROR}</td><td>{@link #OPUS_INVALID_PACKET INVALID_PACKET}</td><td>{@link #OPUS_UNIMPLEMENTED UNIMPLEMENTED}</td><td>{@link #OPUS_INVALID_STATE INVALID_STATE}</td></tr><tr><td>{@link #OPUS_ALLOC_FAIL ALLOC_FAIL}</td></tr></table>
     */
    @NativeType("OpusEncoder *")
    public static long opus_encoder_create(@NativeType("opus_int32") int Fs, int channels, int application, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_encoder_create(Fs, channels, application, memAddressSafe(error));
    }

    // --- [ opus_encoder_init ] ---

    /**
     * Initializes a previously allocated encoder state.
     * 
     * <p>The memory pointed to by {@code st} must be at least the size returned by {@link #opus_encoder_get_size encoder_get_size}. This is intended for applications which use their own
     * allocator instead of {@code malloc}.</p>
     * 
     * <p>To reset a previously initialized state, use the {@link #OPUS_RESET_STATE RESET_STATE} CTL.</p>
     *
     * @param st          encoder state
     * @param Fs          sampling rate of input signal (Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param channels    number of channels in input signal. One of:<br><table><tr><td>1</td><td>2</td></tr></table>
     * @param application coding mode. One of:<br><table><tr><td>{@link #OPUS_APPLICATION_VOIP APPLICATION_VOIP}</td><td>{@link #OPUS_APPLICATION_AUDIO APPLICATION_AUDIO}</td><td>{@link #OPUS_APPLICATION_RESTRICTED_LOWDELAY APPLICATION_RESTRICTED_LOWDELAY}</td></tr></table>
     *
     * @return {@link #OPUS_OK OK} on success or a negative error code on error
     */
    public static int opus_encoder_init(@NativeType("OpusEncoder *") long st, @NativeType("opus_int32") int Fs, int channels, int application) {
        long __functionAddress = Functions.encoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, Fs, channels, application, __functionAddress);
    }

    // --- [ opus_encode ] ---

    /**
     * Unsafe version of: {@link #opus_encode encode}
     *
     * @param max_data_bytes size of the allocated memory for the output payload. This may be used to impose an upper limit on the instant bitrate, but should not be used as
     *                       the only bitrate control. Use {@link #OPUS_SET_BITRATE_REQUEST SET_BITRATE_REQUEST} to control the bitrate.
     */
    public static int nopus_encode(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.encode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /**
     * Encodes an Opus frame.
     *
     * @param st         encoder state
     * @param pcm        input signal (interleaved if 2 channels) (length is {@code frame_size*channels*sizeof(opus_int16)})
     * @param frame_size number of samples per channel in the input signal. This must be an Opus frame size for the encoder's sampling rate. For example, at 48 kHz the
     *                   permitted values are 120, 240, 480, 960, 1920, and 2880. Passing in a duration of less than 10 ms (480 samples at 48 kHz) will prevent the encoder
     *                   from using the LPC or hybrid modes.
     * @param data       output payload
     *
     * @return the length of the encoded packet (in bytes) on success or a negative error code on error
     */
    @NativeType("opus_int32")
    public static int opus_encode(@NativeType("OpusEncoder *") long st, @NativeType("opus_int16 const *") ShortBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_encode(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_encode_float ] ---

    /**
     * Unsafe version of: {@link #opus_encode_float encode_float}
     *
     * @param max_data_bytes size of the allocated memory for the output payload. This may be used to impose an upper limit on the instant bitrate, but should not be used as
     *                       the only bitrate control. Use {@link #OPUS_SET_BITRATE_REQUEST SET_BITRATE_REQUEST} to control the bitrate.
     */
    public static int nopus_encode_float(long st, long pcm, int frame_size, long data, int max_data_bytes) {
        long __functionAddress = Functions.encode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, pcm, frame_size, data, max_data_bytes, __functionAddress);
    }

    /**
     * Encodes an Opus frame from floating point input.
     *
     * @param st         encoder state
     * @param pcm        input signal (interleaved if 2 channels) with a normal range of {@code +/-1.0}. Samples with a range beyond {@code +/-1.0} are supported but will
     *                   be clipped by decoders using the integer API and should only be used if it is known that the far end supports extended dynamic range. (length is
     *                   {@code frame_size*channels*sizeof(float)})
     * @param frame_size number of samples per channel in the input signal. This must be an Opus frame size for the encoder's sampling rate. For example, at 48 kHz the
     *                   permitted values are 120, 240, 480, 960, 1920, and 2880. Passing in a duration of less than 10 ms (480 samples at 48 kHz) will prevent the encoder
     *                   from using the LPC or hybrid modes.
     * @param data       output payload
     *
     * @return the length of the encoded packet (in bytes) on success or a negative error code on error
     */
    @NativeType("opus_int32")
    public static int opus_encode_float(@NativeType("OpusEncoder *") long st, @NativeType("float const *") FloatBuffer pcm, int frame_size, @NativeType("unsigned char *") ByteBuffer data) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_encode_float(st, memAddress(pcm), frame_size, memAddress(data), data.remaining());
    }

    // --- [ opus_encoder_destroy ] ---

    /**
     * Frees an {@code OpusEncoder} allocated by {@link #opus_encoder_create encoder_create}.
     *
     * @param st state to be freed
     */
    public static void opus_encoder_destroy(@NativeType("OpusEncoder *") long st) {
        long __functionAddress = Functions.encoder_destroy;
        if (CHECKS) {
            check(st);
        }
        invokePV(st, __functionAddress);
    }

    // --- [ opus_encoder_ctl ] ---

    /**
     * Performs a CTL function on an Opus encoder.
     *
     * @param st encoder state
     */
    private static int opus_encoder_ctl(@NativeType("OpusEncoder *") long st) {
        long __functionAddress = Functions.encoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_decoder_get_size ] ---

    /**
     * Gets the size of an {@code OpusDecoder} structure.
     *
     * @param channels number of channels. One of:<br><table><tr><td>1</td><td>2</td></tr></table>
     *
     * @return the size in bytes
     */
    public static int opus_decoder_get_size(int channels) {
        long __functionAddress = Functions.decoder_get_size;
        return invokeI(channels, __functionAddress);
    }

    // --- [ opus_decoder_create ] ---

    /** Unsafe version of: {@link #opus_decoder_create decoder_create} */
    public static long nopus_decoder_create(int Fs, int channels, long error) {
        long __functionAddress = Functions.decoder_create;
        return invokePP(Fs, channels, error, __functionAddress);
    }

    /**
     * Allocates and initializes a decoder state.
     * 
     * <p>Internally Opus stores data at 48000 Hz, so that should be the default value for {@code Fs}. However, the decoder can efficiently decode to buffers at
     * 8, 12, 16, and 24 kHz so if for some reason the caller cannot use data at the full sample rate, or knows the compressed data doesn't use the full
     * frequency range, it can request decoding at a reduced rate. Likewise, the decoder is capable of filling in either mono or interleaved stereo pcm
     * buffers, at the caller's request.</p>
     *
     * @param Fs       sampling rate of input signal (Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param channels number of channels to decode. One of:<br><table><tr><td>1</td><td>2</td></tr></table>
     * @param error    one of:<br><table><tr><td>{@link #OPUS_OK OK}</td><td>{@link #OPUS_BAD_ARG BAD_ARG}</td><td>{@link #OPUS_BUFFER_TOO_SMALL BUFFER_TOO_SMALL}</td><td>{@link #OPUS_INTERNAL_ERROR INTERNAL_ERROR}</td><td>{@link #OPUS_INVALID_PACKET INVALID_PACKET}</td><td>{@link #OPUS_UNIMPLEMENTED UNIMPLEMENTED}</td><td>{@link #OPUS_INVALID_STATE INVALID_STATE}</td></tr><tr><td>{@link #OPUS_ALLOC_FAIL ALLOC_FAIL}</td></tr></table>
     */
    @NativeType("OpusDecoder *")
    public static long opus_decoder_create(@NativeType("opus_int32") int Fs, int channels, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nopus_decoder_create(Fs, channels, memAddressSafe(error));
    }

    // --- [ opus_decoder_init ] ---

    /**
     * Initializes a previously allocated decoder state.
     * 
     * <p>The state must be at least the size returned by {@link #opus_decoder_get_size decoder_get_size}. This is intended for applications which use their own allocator instead of
     * {@code malloc}.</p>
     * 
     * <p>To reset a previously initialized state, use the {@link #OPUS_RESET_STATE RESET_STATE} CTL.</p>
     *
     * @param st       decoder state
     * @param Fs       sampling rate of input signal (Hz). One of:<br><table><tr><td>8000</td><td>12000</td><td>16000</td><td>24000</td><td>48000</td></tr></table>
     * @param channels number of channels to decode. One of:<br><table><tr><td>1</td><td>2</td></tr></table>
     *
     * @return {@link #OPUS_OK OK} on success or a negative error code on error
     */
    public static int opus_decoder_init(@NativeType("OpusDecoder *") long st, @NativeType("opus_int32") int Fs, int channels) {
        long __functionAddress = Functions.decoder_init;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, Fs, channels, __functionAddress);
    }

    // --- [ opus_decode ] ---

    /**
     * Unsafe version of: {@link #opus_decode decode}
     *
     * @param len number of bytes in payload
     */
    public static int nopus_decode(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.decode;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /**
     * Decodes an Opus packet.
     *
     * @param st         decoder state
     * @param data       input payload (Use a {@code NULL} pointer to indicate packet loss)
     * @param pcm        output signal (interleaved if 2 channels) (length is {@code frame_size*channels*sizeof(opus_int16)}
     * @param frame_size number of samples per channel of available space in pcm.
     *                   
     *                   <p>If this is less than the maximum packet duration (120ms; 5760 for 48kHz), this function will not be capable of decoding some packets. In the case
     *                   of PLC ({@code data==NULL}) or FEC ({@code decode_fec=1}), then {@code frame_size} needs to be exactly the duration of audio that is missing,
     *                   otherwise the decoder will not be in the optimal state to decode the next incoming packet. For the PLC and FEC cases, {@code frame_size}
     *                   <b>must</b> be a multiple of 2.5 ms.</p>
     * @param decode_fec flag (0 or 1) to request that any in-band forward error correction data be decoded. If no such data is available, the frame is decoded as if it
     *                   were lost.
     *
     * @return number of decoded samples or a negative error code
     */
    public static int opus_decode(@NativeType("OpusDecoder *") long st, @Nullable @NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int16 *") ShortBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_decode(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_decode_float ] ---

    /**
     * Unsafe version of: {@link #opus_decode_float decode_float}
     *
     * @param len number of bytes in payload
     */
    public static int nopus_decode_float(long st, long data, int len, long pcm, int frame_size, int decode_fec) {
        long __functionAddress = Functions.decode_float;
        if (CHECKS) {
            check(st);
        }
        return invokePPPI(st, data, len, pcm, frame_size, decode_fec, __functionAddress);
    }

    /**
     * Decodes an Opus packet with floating point output.
     *
     * @param st         decoder state
     * @param data       input payload (Use a {@code NULL} pointer to indicate packet loss)
     * @param pcm        output signal (interleaved if 2 channels) (length is {@code frame_size*channels*sizeof(opus_int16)}
     * @param frame_size number of samples per channel of available space in pcm.
     *                   
     *                   <p>If this is less than the maximum packet duration (120ms; 5760 for 48kHz), this function will not be capable of decoding some packets. In the case
     *                   of PLC ({@code data==NULL}) or FEC ({@code decode_fec=1}), then {@code frame_size} needs to be exactly the duration of audio that is missing,
     *                   otherwise the decoder will not be in the optimal state to decode the next incoming packet. For the PLC and FEC cases, {@code frame_size}
     *                   <b>must</b> be a multiple of 2.5 ms.</p>
     * @param decode_fec flag (0 or 1) to request that any in-band forward error correction data be decoded. If no such data is available, the frame is decoded as if it
     *                   were lost.
     *
     * @return number of decoded samples or a negative error code
     */
    public static int opus_decode_float(@NativeType("OpusDecoder *") long st, @Nullable @NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int16 *") ShortBuffer pcm, int frame_size, int decode_fec) {
        if (CHECKS) {
            check(pcm, frame_size * memGetInt(st + 8));
        }
        return nopus_decode_float(st, memAddressSafe(data), remainingSafe(data), memAddress(pcm), frame_size, decode_fec);
    }

    // --- [ opus_decoder_ctl ] ---

    /**
     * Performs a CTL function on an Opus decoder.
     *
     * @param st decoder state
     */
    private static int opus_decoder_ctl(@NativeType("OpusDecoder *") long st) {
        long __functionAddress = Functions.decoder_ctl;
        if (CHECKS) {
            check(st);
        }
        return invokePI(st, __functionAddress);
    }

    // --- [ opus_decoder_destroy ] ---

    /**
     * Frees an {@code OpusDecoder} allocated by {@link #opus_decoder_create decoder_create}.
     *
     * @param st decoder state
     */
    public static void opus_decoder_destroy(@NativeType("OpusDecoder *") long st) {
        long __functionAddress = Functions.decoder_destroy;
        if (CHECKS) {
            check(st);
        }
        invokePV(st, __functionAddress);
    }

    // --- [ opus_packet_parse ] ---

    /**
     * Unsafe version of: {@link #opus_packet_parse packet_parse}
     *
     * @param len size of data
     */
    public static int nopus_packet_parse(long data, int len, long out_toc, long frames, long size, long payload_offset) {
        long __functionAddress = Functions.packet_parse;
        return invokePPPPPI(data, len, out_toc, frames, size, payload_offset, __functionAddress);
    }

    /**
     * Parses an opus packet into one or more frames.
     * 
     * <p>{@link #opus_decode decode} will perform this operation internally so most applications do not need to use this function.</p>
     * 
     * <p>This function does not copy the frames, the returned pointers are pointers into the input packet.</p>
     *
     * @param data           Opus packet to be parsed
     * @param out_toc        TOC pointer
     * @param frames         encapsulated frames
     * @param size           sizes of the encapsulated frames
     * @param payload_offset returns the position of the payload within the packet (in bytes)
     */
    public static int opus_packet_parse(@NativeType("unsigned char const *") ByteBuffer data, @Nullable @NativeType("unsigned char *") ByteBuffer out_toc, @Nullable @NativeType("unsigned char const **") PointerBuffer frames, @NativeType("opus_int16 *") ShortBuffer size, @Nullable @NativeType("int *") IntBuffer payload_offset) {
        if (CHECKS) {
            checkSafe(out_toc, 1);
            checkSafe(frames, 48);
            check(size, 48);
            checkSafe(payload_offset, 1);
        }
        return nopus_packet_parse(memAddress(data), data.remaining(), memAddressSafe(out_toc), memAddressSafe(frames), memAddress(size), memAddressSafe(payload_offset));
    }

    // --- [ opus_packet_get_bandwidth ] ---

    /** Unsafe version of: {@link #opus_packet_get_bandwidth packet_get_bandwidth} */
    public static int nopus_packet_get_bandwidth(long data) {
        long __functionAddress = Functions.packet_get_bandwidth;
        return invokePI(data, __functionAddress);
    }

    /**
     * Gets the bandwidth of an Opus packet.
     *
     * @param data Opus packet
     *
     * @return the bandwidth of the packer on success, or {@link #OPUS_INVALID_PACKET INVALID_PACKET} if the compressed data passed is corrupted or of an unsupported type
     */
    public static int opus_packet_get_bandwidth(@NativeType("unsigned char const *") ByteBuffer data) {
        if (CHECKS) {
            check(data, 1);
        }
        return nopus_packet_get_bandwidth(memAddress(data));
    }

    // --- [ opus_packet_get_samples_per_frame ] ---

    /** Unsafe version of: {@link #opus_packet_get_samples_per_frame packet_get_samples_per_frame} */
    public static int nopus_packet_get_samples_per_frame(long data, int Fs) {
        long __functionAddress = Functions.packet_get_samples_per_frame;
        return invokePI(data, Fs, __functionAddress);
    }

    /**
     * Gets the number of samples per frame from an Opus packet.
     *
     * @param data Opus packet. This must contain at least one byte of data.
     * @param Fs   sampling rate in Hz. This must be a multiple of 400, or inaccurate results will be returned.
     *
     * @return number of samples per frame
     */
    public static int opus_packet_get_samples_per_frame(@NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int32") int Fs) {
        if (CHECKS) {
            check(data, 1);
        }
        return nopus_packet_get_samples_per_frame(memAddress(data), Fs);
    }

    // --- [ opus_packet_get_nb_channels ] ---

    /** Unsafe version of: {@link #opus_packet_get_nb_channels packet_get_nb_channels} */
    public static int nopus_packet_get_nb_channels(long data) {
        long __functionAddress = Functions.packet_get_nb_channels;
        return invokePI(data, __functionAddress);
    }

    /**
     * Gets the number of channels from an Opus packet.
     *
     * @param data Opus packet
     *
     * @return number of channels, or {@link #OPUS_INVALID_PACKET INVALID_PACKET} if the compressed data passed is corrupted or of an unsupported type
     */
    public static int opus_packet_get_nb_channels(@NativeType("unsigned char const *") ByteBuffer data) {
        return nopus_packet_get_nb_channels(memAddress(data));
    }

    // --- [ opus_packet_get_nb_frames ] ---

    /**
     * Unsafe version of: {@link #opus_packet_get_nb_frames packet_get_nb_frames}
     *
     * @param len length of packet
     */
    public static int nopus_packet_get_nb_frames(long packet, int len) {
        long __functionAddress = Functions.packet_get_nb_frames;
        return invokePI(packet, len, __functionAddress);
    }

    /**
     * Gets the number of frames in an Opus packet.
     *
     * @param packet Opus packet
     *
     * @return number of frames, {@link #OPUS_BAD_ARG BAD_ARG} if insufficient data was passed to the function, or {@link #OPUS_INVALID_PACKET INVALID_PACKET} if the compressed data passed is corrupted or of an
     *         unsupported type
     */
    public static int opus_packet_get_nb_frames(@NativeType("unsigned char const *") ByteBuffer packet) {
        return nopus_packet_get_nb_frames(memAddress(packet), packet.remaining());
    }

    // --- [ opus_packet_get_nb_samples ] ---

    /**
     * Unsafe version of: {@link #opus_packet_get_nb_samples packet_get_nb_samples}
     *
     * @param len length of packet
     */
    public static int nopus_packet_get_nb_samples(long packet, int len, int Fs) {
        long __functionAddress = Functions.packet_get_nb_samples;
        return invokePI(packet, len, Fs, __functionAddress);
    }

    /**
     * Gets the number of samples of an Opus packet.
     *
     * @param packet Opus packet
     * @param Fs     sampling rate in Hz. This must be a multiple of 400, or inaccurate results will be returned.
     *
     * @return number of samples, {@link #OPUS_BAD_ARG BAD_ARG} if insufficient data was passed to the function, or {@link #OPUS_INVALID_PACKET INVALID_PACKET} if the compressed data passed is corrupted or of an
     *         unsupported type
     */
    public static int opus_packet_get_nb_samples(@NativeType("unsigned char const *") ByteBuffer packet, @NativeType("opus_int32") int Fs) {
        return nopus_packet_get_nb_samples(memAddress(packet), packet.remaining(), Fs);
    }

    // --- [ opus_decoder_get_nb_samples ] ---

    /**
     * Unsafe version of: {@link #opus_decoder_get_nb_samples decoder_get_nb_samples}
     *
     * @param len length of packet
     */
    public static int nopus_decoder_get_nb_samples(long dec, long packet, int len) {
        long __functionAddress = Functions.decoder_get_nb_samples;
        if (CHECKS) {
            check(dec);
        }
        return invokePPI(dec, packet, len, __functionAddress);
    }

    /**
     * Gets the number of samples of an Opus packet.
     *
     * @param dec    decoder state
     * @param packet Opus packet
     *
     * @return number of samples, {@link #OPUS_BAD_ARG BAD_ARG} if insufficient data was passed to the function, or {@link #OPUS_INVALID_PACKET INVALID_PACKET} if the compressed data passed is corrupted or of an
     *         unsupported type
     */
    public static int opus_decoder_get_nb_samples(@NativeType("OpusDecoder const *") long dec, @NativeType("unsigned char const *") ByteBuffer packet) {
        return nopus_decoder_get_nb_samples(dec, memAddress(packet), packet.remaining());
    }

    // --- [ opus_pcm_soft_clip ] ---

    /**
     * Unsafe version of: {@link #opus_pcm_soft_clip pcm_soft_clip}
     *
     * @param channels number of channels
     */
    public static void nopus_pcm_soft_clip(long pcm, int frame_size, int channels, long softclip_mem) {
        long __functionAddress = Functions.pcm_soft_clip;
        invokePPV(pcm, frame_size, channels, softclip_mem, __functionAddress);
    }

    /**
     * Applies soft-clipping to bring a float signal within the {@code [-1,1]} range. If the signal is already in that range, nothing is done. If there are
     * values outside of {@code [-1,1]}, then the signal is clipped as smoothly as possible to both fit in the range and avoid creating excessive distortion
     * in the process.
     *
     * @param pcm          input PCM and modified PCM
     * @param frame_size   number of samples per channel to process
     * @param softclip_mem state memory for the soft clipping process (one float per channel, initialized to zero)
     */
    public static void opus_pcm_soft_clip(@NativeType("float *") FloatBuffer pcm, int frame_size, @NativeType("float *") FloatBuffer softclip_mem) {
        if (CHECKS) {
            check(pcm, frame_size * softclip_mem.remaining());
        }
        nopus_pcm_soft_clip(memAddress(pcm), frame_size, softclip_mem.remaining(), memAddress(softclip_mem));
    }

    // --- [ opus_repacketizer_get_size ] ---

    /**
     * Gets the size of an {@code OpusRepacketizer} structure.
     *
     * @return the size in bytes
     */
    public static int opus_repacketizer_get_size() {
        long __functionAddress = Functions.repacketizer_get_size;
        return invokeI(__functionAddress);
    }

    // --- [ opus_repacketizer_init ] ---

    /**
     * (Re)initializes a previously allocated repacketizer state.
     * 
     * <p>The state must be at least the size returned by {@link #opus_repacketizer_get_size repacketizer_get_size}. This can be used for applications which use their own allocator instead of
     * {@code malloc()}.</p>
     * 
     * <p>It must also be called to reset the queue of packets waiting to be repacketized, which is necessary if the maximum packet duration of 120 ms is reached
     * or if you wish to submit packets with a different Opus configuration (coding mode, audio bandwidth, frame size, or channel count). Failure to do so
     * will prevent a new packet from being added with {@link #opus_repacketizer_cat repacketizer_cat}.</p>
     *
     * @param rp the repacketizer state to (re)initialize
     */
    @NativeType("OpusRepacketizer *")
    public static long opus_repacketizer_init(@NativeType("OpusRepacketizer *") long rp) {
        long __functionAddress = Functions.repacketizer_init;
        if (CHECKS) {
            check(rp);
        }
        return invokePP(rp, __functionAddress);
    }

    // --- [ opus_repacketizer_create ] ---

    /** Allocates memory and initializes the new repacketizer with {@link #opus_repacketizer_init repacketizer_init}. */
    @NativeType("OpusRepacketizer *")
    public static long opus_repacketizer_create() {
        long __functionAddress = Functions.repacketizer_create;
        return invokeP(__functionAddress);
    }

    // --- [ opus_repacketizer_destroy ] ---

    /**
     * Frees an {@code OpusRepacketizer} allocated by {@link #opus_repacketizer_create repacketizer_create}.
     *
     * @param rp state to be freed
     */
    public static void opus_repacketizer_destroy(@NativeType("OpusRepacketizer *") long rp) {
        long __functionAddress = Functions.repacketizer_destroy;
        if (CHECKS) {
            check(rp);
        }
        invokePV(rp, __functionAddress);
    }

    // --- [ opus_repacketizer_cat ] ---

    /**
     * Unsafe version of: {@link #opus_repacketizer_cat repacketizer_cat}
     *
     * @param len the number of bytes in the packet data
     */
    public static int nopus_repacketizer_cat(long rp, long data, int len) {
        long __functionAddress = Functions.repacketizer_cat;
        if (CHECKS) {
            check(rp);
        }
        return invokePPI(rp, data, len, __functionAddress);
    }

    /**
     * Adds a packet to the current repacketizer state.
     * 
     * <p>This packet must match the configuration of any packets already submitted for repacketization since the last call to {@link #opus_repacketizer_init repacketizer_init}. This means
     * that it must have the same coding mode, audio bandwidth, frame size, and channel count. This can be checked in advance by examining the top 6 bits of
     * the first byte of the packet, and ensuring they match the top 6 bits of the first byte of any previously submitted packet. The total duration of audio
     * in the repacketizer state also must not exceed 120 ms, the maximum duration of a single packet, after adding this packet.</p>
     * 
     * <p>The contents of the current repacketizer state can be extracted into new packets using {@link #opus_repacketizer_out repacketizer_out} or {@link #opus_repacketizer_out_range repacketizer_out_range}.</p>
     * 
     * <p>In order to add a packet with a different configuration or to add more audio beyond 120 ms, you must clear the repacketizer state by calling
     * {@link #opus_repacketizer_init repacketizer_init}. If a packet is too large to add to the current repacketizer state, no part of it is added, even if it contains multiple frames,
     * some of which might fit. If you wish to be able to add parts of such packets, you should first use another repacketizer to split the packet into pieces
     * and add them individually.</p>
     *
     * @param rp the repacketizer state to which to add the packet
     *
     * @return {@link #OPUS_OK OK} on success, or {@link #OPUS_INVALID_PACKET INVALID_PACKET} if the packet did not have a valid TOC sequence, the packet's TOC sequence was not compatible with previously
     *         submitted packets (because the coding mode, audio bandwidth, frame size, or channel count did not match), or adding this packet would increase the
     *         total amount of audio stored in the repacketizer state to more than 120 ms.
     */
    public static int opus_repacketizer_cat(@NativeType("OpusRepacketizer *") long rp, @NativeType("unsigned char const *") ByteBuffer data) {
        return nopus_repacketizer_cat(rp, memAddress(data), data.remaining());
    }

    // --- [ opus_repacketizer_out_range ] ---

    /**
     * Unsafe version of: {@link #opus_repacketizer_out_range repacketizer_out_range}
     *
     * @param maxlen the maximum number of bytes to store in the output buffer. In order to guarantee success, this should be at least {@code 1276} for a single frame,
     *               or for multiple frames, {@code 1277*(end-begin)}. However, {@code 1*(end-begin)} plus the size of all packet data submitted to the repacketizer
     *               since the last call to {@link #opus_repacketizer_init repacketizer_init} or {@link #opus_repacketizer_create repacketizer_create} is also sufficient, and possibly much smaller.
     */
    public static int nopus_repacketizer_out_range(long rp, int begin, int end, long data, int maxlen) {
        long __functionAddress = Functions.repacketizer_out_range;
        if (CHECKS) {
            check(rp);
        }
        return invokePPI(rp, begin, end, data, maxlen, __functionAddress);
    }

    /**
     * Constructs a new packet from data previously submitted to the repacketizer state via {@link #opus_repacketizer_cat repacketizer_cat}.
     *
     * @param rp    the repacketizer state from which to construct the new packet
     * @param begin the index of the first frame in the current repacketizer state to include in the output
     * @param end   one past the index of the last frame in the current repacketizer state to include in the output
     * @param data  the buffer in which to store the output packet
     *
     * @return the total size of the output packet on success, {@link #OPUS_BAD_ARG BAD_ARG} if {@code [begin,end)} was an invalid range of frames ({@code begin < 0},
     *         {@code begin >= end}, or {@code end > opus_repacketizer_get_nb_frames()}), or {@link #OPUS_BUFFER_TOO_SMALL BUFFER_TOO_SMALL} if {@code maxlen} was insufficient to contain the
     *         complete output packet.
     */
    @NativeType("opus_int32")
    public static int opus_repacketizer_out_range(@NativeType("OpusRepacketizer *") long rp, int begin, int end, @NativeType("unsigned char const *") ByteBuffer data) {
        return nopus_repacketizer_out_range(rp, begin, end, memAddress(data), data.remaining());
    }

    // --- [ opus_repacketizer_get_nb_frames ] ---

    /**
     * Returns the total number of frames contained in packet data submitted to the repacketizer state so far via {@link #opus_repacketizer_cat repacketizer_cat} since the last call to
     * {@link #opus_repacketizer_init repacketizer_init} or {@link #opus_repacketizer_create repacketizer_create}.
     * 
     * <p>This defines the valid range of packets that can be extracted with {@link #opus_repacketizer_out_range repacketizer_out_range} or {@link #opus_repacketizer_out repacketizer_out}.</p>
     *
     * @param rp the repacketizer state containing the frames
     *
     * @return the total number of frames contained in the packet data submitted to the repacketizer state
     */
    public static int opus_repacketizer_get_nb_frames(@NativeType("OpusRepacketizer *") long rp) {
        long __functionAddress = Functions.repacketizer_get_nb_frames;
        if (CHECKS) {
            check(rp);
        }
        return invokePI(rp, __functionAddress);
    }

    // --- [ opus_repacketizer_out ] ---

    /**
     * Unsafe version of: {@link #opus_repacketizer_out repacketizer_out}
     *
     * @param maxlen the maximum number of bytes to store in the output buffer. In order to guarantee success, this should be at least
     *               {@code 1277*opus_repacketizer_get_nb_frames(rp)}. However, {@code 1*opus_repacketizer_get_nb_frames(rp)} plus the size of all packet data submitted
     *               to the repacketizer since the last call to {@link #opus_repacketizer_init repacketizer_init} or {@link #opus_repacketizer_create repacketizer_create} is also sufficient, and possibly much smaller.
     */
    public static int nopus_repacketizer_out(long rp, long data, int maxlen) {
        long __functionAddress = Functions.repacketizer_out;
        if (CHECKS) {
            check(rp);
        }
        return invokePPI(rp, data, maxlen, __functionAddress);
    }

    /**
     * Constructs a new packet from data previously submitted to the repacketizer state via {@link #opus_repacketizer_cat repacketizer_cat}.
     * 
     * <p>This is a convenience routine that returns all the data submitted so far in a single packet. It is equivalent to calling
     * {@code opus_repacketizer_out_range(rp, 0, opus_repacketizer_get_nb_frames(rp), data, maxlen)}.</p>
     *
     * @param rp   the repacketizer state from which to construct the new packet
     * @param data the buffer in which to store the output packet
     *
     * @return the total size of the output packet on success, or {@link #OPUS_BUFFER_TOO_SMALL BUFFER_TOO_SMALL} if maxlen was insufficient to contain the complete output packet
     */
    @NativeType("opus_int32")
    public static int opus_repacketizer_out(@NativeType("OpusRepacketizer *") long rp, @NativeType("unsigned char const *") ByteBuffer data) {
        return nopus_repacketizer_out(rp, memAddress(data), data.remaining());
    }

    // --- [ opus_packet_pad ] ---

    /** Unsafe version of: {@link #opus_packet_pad packet_pad} */
    public static int nopus_packet_pad(long data, int len, int new_len) {
        long __functionAddress = Functions.packet_pad;
        return invokePI(data, len, new_len, __functionAddress);
    }

    /**
     * Pads a given Opus packet to a larger size (possibly changing the TOC sequence).
     *
     * @param data    the buffer containing the packet to pad
     * @param len     the size of the packet. This must be at least 1.
     * @param new_len the desired size of the packet after padding. This must be at least as large as {@code len}.
     *
     * @return the new size of the output packet on success, {@link #OPUS_BAD_ARG BAD_ARG} if {@code len} was less than 1 or {@code new_len} was less than {@code len}, or {@link #OPUS_INVALID_PACKET INVALID_PACKET}
     *         if data did not contain a valid Opus packet
     */
    public static int opus_packet_pad(@NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int32") int len, @NativeType("opus_int32") int new_len) {
        if (CHECKS) {
            check(data, Math.max(len, new_len));
        }
        return nopus_packet_pad(memAddress(data), len, new_len);
    }

    // --- [ opus_packet_unpad ] ---

    /** Unsafe version of: {@link #opus_packet_unpad packet_unpad} */
    public static int nopus_packet_unpad(long data, int len) {
        long __functionAddress = Functions.packet_unpad;
        return invokePI(data, len, __functionAddress);
    }

    /**
     * Removes all padding from a given Opus packet and rewrite the TOC sequence to minimize space usage.
     *
     * @param data the buffer containing the packet to strip
     * @param len  the size of the packet. This must be at least 1.
     *
     * @return the new size of the output packet on success, {@link #OPUS_BAD_ARG BAD_ARG} if {@code len} was less than 1, or {@link #OPUS_INVALID_PACKET INVALID_PACKET} if {@code data} did not contain a valid Opus
     *         packet
     */
    @NativeType("opus_int32")
    public static int opus_packet_unpad(@NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int32") int len) {
        if (CHECKS) {
            check(data, len);
        }
        return nopus_packet_unpad(memAddress(data), len);
    }

    // --- [ opus_multistream_packet_pad ] ---

    /** Unsafe version of: {@link #opus_multistream_packet_pad multistream_packet_pad} */
    public static int nopus_multistream_packet_pad(long data, int len, int new_len, int nb_streams) {
        long __functionAddress = Functions.multistream_packet_pad;
        return invokePI(data, len, new_len, nb_streams, __functionAddress);
    }

    /**
     * Pads a given Opus multi-stream packet to a larger size (possibly changing the TOC sequence).
     *
     * @param data       the buffer containing the packet to pad
     * @param len        the size of the packet. This must be at least 1.
     * @param new_len    the desired size of the packet after padding. This must be at least 1.
     * @param nb_streams the number of streams (not channels) in the packet. This must be at least as large as {@code len}.
     *
     * @return the new size of the output packet on success, {@link #OPUS_BAD_ARG BAD_ARG} if {@code len} was less than 1 or {@code new_len} was less than {@code len}, or {@link #OPUS_INVALID_PACKET INVALID_PACKET}
     *         if {@code data} did not contain a valid Opus packet
     */
    public static int opus_multistream_packet_pad(@NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int32") int len, @NativeType("opus_int32") int new_len, int nb_streams) {
        if (CHECKS) {
            check(data, Math.max(len, new_len));
        }
        return nopus_multistream_packet_pad(memAddress(data), len, new_len, nb_streams);
    }

    // --- [ opus_multistream_packet_unpad ] ---

    /** Unsafe version of: {@link #opus_multistream_packet_unpad multistream_packet_unpad} */
    public static int nopus_multistream_packet_unpad(long data, int len, int nb_streams) {
        long __functionAddress = Functions.multistream_packet_unpad;
        return invokePI(data, len, nb_streams, __functionAddress);
    }

    /**
     * Removes all padding from a given Opus multi-stream packet and rewrite the TOC sequence to minimize space usage.
     *
     * @param data       the buffer containing the packet to strip
     * @param len        the size of the packet. This must be at least 1.
     * @param nb_streams the number of streams (not channels) in the packet. This must be at least 1.
     *
     * @return the new size of the output packet on success, {@link #OPUS_BAD_ARG BAD_ARG} if {@code len} was less than 1, or {@link #OPUS_INVALID_PACKET INVALID_PACKET} if {@code data} did not contain a valid Opus
     *         packet
     */
    @NativeType("opus_int32")
    public static int opus_multistream_packet_unpad(@NativeType("unsigned char const *") ByteBuffer data, @NativeType("opus_int32") int len, int nb_streams) {
        if (CHECKS) {
            check(data, len);
        }
        return nopus_multistream_packet_unpad(memAddress(data), len, nb_streams);
    }

    // --- [ opus_strerror ] ---

    /** Unsafe version of: {@link #opus_strerror strerror} */
    public static long nopus_strerror(int error) {
        long __functionAddress = Functions.strerror;
        return invokeP(error, __functionAddress);
    }

    /**
     * Converts an opus error code into a human readable string.
     *
     * @param error error number
     *
     * @return error string
     */
    @Nullable
    @NativeType("char *")
    public static String opus_strerror(int error) {
        long __result = nopus_strerror(error);
        return memASCIISafe(__result);
    }

    // --- [ opus_get_version_string ] ---

    /** Unsafe version of: {@link #opus_get_version_string get_version_string} */
    public static long nopus_get_version_string() {
        long __functionAddress = Functions.get_version_string;
        return invokeP(__functionAddress);
    }

    /**
     * Gets the libopus version string.
     * 
     * <p>Applications may look for the substring "-fixed" in the version string to determine whether they have a fixed-point or floating-point build at runtime.</p>
     */
    @Nullable
    @NativeType("char *")
    public static String opus_get_version_string() {
        long __result = nopus_get_version_string();
        return memASCIISafe(__result);
    }

    public abstract static class CTLRequest {
        protected final FFICIF cif;
        protected final int    request;

        CTLRequest(FFICIF cif, int request) {
            this.cif = cif;
            this.request = request;
        }

        abstract int apply(long st, long __functionAddress);
    }

    public static class CTLRequestV extends CTLRequest {
        private static final FFICIF CIF = apiCreateCIFVar(
            FFI_DEFAULT_ABI, 2, ffi_type_sint,
            ffi_type_pointer, ffi_type_sint
        );

        CTLRequestV(int request) {
            super(CIF, request);
        }

        @Override
        int apply(long st, long __functionAddress) {
            try (MemoryStack stack = stackPush()) {
                ByteBuffer arguments = stack.malloc(POINTER_SIZE + Integer.BYTES);
                PointerBuffer.put(arguments, 0, st);
                arguments.putInt(POINTER_SIZE, request);

                ByteBuffer rvalue = stack.calloc(POINTER_SIZE, POINTER_SIZE);

                long avalues = memAddress(arguments);

                ffi_call(
                    cif, __functionAddress, rvalue,
                    stack.mallocPointer(2)
                        .put(0, avalues)
                        .put(1, avalues + POINTER_SIZE)
                );
                return rvalue.getInt(0);
            }
        }
    }

    public static class CTLRequestI extends CTLRequest {
        private static final FFICIF CIF = apiCreateCIFVar(
            FFI_DEFAULT_ABI, 2, ffi_type_sint,
            ffi_type_pointer, ffi_type_sint, ffi_type_sint32
        );

        private int value;

        CTLRequestI(int request, int value) {
            super(CIF, request);
            this.value = value;
        }

        @Override
        int apply(long st, long __functionAddress) {
            try (MemoryStack stack = stackPush()) {
                ByteBuffer arguments = stack.malloc(POINTER_SIZE + 2 * Integer.BYTES);
                PointerBuffer.put(arguments, 0, st);
                arguments.putInt(POINTER_SIZE, request);
                arguments.putInt(POINTER_SIZE + Integer.BYTES, value);

                ByteBuffer rvalue = stack.calloc(POINTER_SIZE, POINTER_SIZE);

                long avalues = memAddress(arguments);

                ffi_call(
                    cif, __functionAddress, rvalue,
                    stack.mallocPointer(3)
                        .put(0, avalues)
                        .put(1, avalues + POINTER_SIZE)
                        .put(2, avalues + POINTER_SIZE + Integer.BYTES)
                );
                return rvalue.getInt(0);
            }
        }
    }

    public static class CTLRequestP extends CTLRequest {
        private static final FFICIF CIF = apiCreateCIFVar(
            FFI_DEFAULT_ABI, 2, ffi_type_sint,
            ffi_type_pointer, ffi_type_sint, ffi_type_pointer
        );

        private long address;

        CTLRequestP(int request, long address) {
            super(CIF, request);
            this.address = address;
        }

        @Override
        int apply(long st, long __functionAddress) {
            try (MemoryStack stack = stackPush()) {
                ByteBuffer arguments = stack.malloc(POINTER_SIZE + Integer.BYTES + POINTER_SIZE);
                PointerBuffer.put(arguments, 0, st);
                arguments.putInt(POINTER_SIZE, request);
                PointerBuffer.put(arguments, POINTER_SIZE + Integer.BYTES, address);

                ByteBuffer rvalue = stack.calloc(POINTER_SIZE, POINTER_SIZE);

                long avalues = memAddress(arguments);

                ffi_call(
                    cif, __functionAddress, rvalue,
                    stack.mallocPointer(3)
                        .put(0, avalues)
                        .put(1, avalues + POINTER_SIZE)
                        .put(2, avalues + POINTER_SIZE + Integer.BYTES)
                );
                return rvalue.getInt(0);
            }
        }
    }

    public static class CTLRequestPI extends CTLRequest {
        private static final FFICIF CIF = apiCreateCIFVar(
            FFI_DEFAULT_ABI, 2, ffi_type_sint,
            ffi_type_pointer, ffi_type_sint, ffi_type_pointer, ffi_type_sint32
        );

        private long address;
        private int value;

        CTLRequestPI(int request, long address, int value) {
            super(CIF, request);

            this.address = address;
            this.value = value;
        }

        @Override
        int apply(long st, long __functionAddress) {
            try (MemoryStack stack = stackPush()) {
                ByteBuffer arguments = stack.malloc(POINTER_SIZE + Integer.BYTES + POINTER_SIZE + Integer.BYTES);
                PointerBuffer.put(arguments, 0, st);
                arguments.putInt(POINTER_SIZE, request);
                PointerBuffer.put(arguments, POINTER_SIZE + Integer.BYTES, address);
                arguments.putInt(POINTER_SIZE + Integer.BYTES + POINTER_SIZE, value);

                ByteBuffer rvalue = stack.calloc(POINTER_SIZE, POINTER_SIZE);

                long avalues = memAddress(arguments);

                ffi_call(
                    cif, __functionAddress, rvalue,
                    stack.mallocPointer(4)
                        .put(0, avalues)
                        .put(1, avalues + POINTER_SIZE)
                        .put(2, avalues + POINTER_SIZE + Integer.BYTES)
                        .put(3, avalues + POINTER_SIZE + Integer.BYTES + POINTER_SIZE)
                );
                return rvalue.getInt(0);
            }
        }
    }

    /**
     * Performs a CTL function on an Opus encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_encoder_ctl(@NativeType("OpusEncoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.encoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_encoder_ctl(@NativeType("OpusEncoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.encoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_decoder_ctl(@NativeType("OpusDecoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.decoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_decoder_ctl(@NativeType("OpusDecoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.decoder_ctl);
    }

    /**
     * Configures the encoder's computational complexity.
     *
     * <p>The supported range is 0-10 inclusive with 10 representing the highest complexity.</p>
     *
     * @param value 0-10, inclusive
     */
    public static CTLRequest OPUS_SET_COMPLEXITY(int value) { return new CTLRequestI(OPUS_SET_COMPLEXITY_REQUEST, value); }

    /**
     * Gets the encoder's complexity configuration.
     *
     * @return a value in the range 0-10, inclusive
     */
    public static CTLRequest OPUS_GET_COMPLEXITY(IntBuffer value) { return new CTLRequestP(OPUS_GET_COMPLEXITY_REQUEST, memAddress(value)); }

    /**
     * Configures the bitrate in the encoder.
     *
     * <p>Rates from 500 to 512000 bits per second are meaningful, as well as the special values {@link #OPUS_AUTO} and {@link #OPUS_BITRATE_MAX}. The value
     * {@link #OPUS_BITRATE_MAX} can be used to cause the codec to use as much rate as it can, which is useful for controlling the rate by adjusting the output
     * buffer size.</p>
     *
     * @param value bitrate in bits per second. The default is determined based on the number of channels and the input sampling rate.
     */
    public static CTLRequest OPUS_SET_BITRATE(int value) { return new CTLRequestI(OPUS_SET_BITRATE_REQUEST, value); }

    /**
     * Gets the encoder's bitrate configuration.
     *
     * @return the bitrate in bits per second. The default is determined based on the number of channels and the input sampling rate.
     */
    public static CTLRequest OPUS_GET_BITRATE(IntBuffer value) { return new CTLRequestP(OPUS_GET_BITRATE_REQUEST, memAddress(value)); }

    /**
     * Enables or disables variable bitrate (VBR) in the encoder.
     *
     * <p>The configured bitrate may not be met exactly because frames must be an integer number of bytes in length.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>0</dt><dd>Hard CBR. For LPC/hybrid modes at very low bit-rate, this can cause noticeable quality degradation.</dd>
     * <dt>1</dt><dd>VBR (default). The exact type of VBR is controlled by #OPUS_SET_VBR_CONSTRAINT.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_VBR(int value) { return new CTLRequestI(OPUS_SET_VBR_REQUEST, value); }

    /**
     * Determines if variable bitrate (VBR) is enabled in the encoder.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>Hard CBR.</dd>
     * <dt>1</dt><dd>VBR (default). The exact type of VBR may be retrieved via {@link #OPUS_GET_VBR_CONSTRAINT}.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_VBR(IntBuffer value) { return new CTLRequestP(OPUS_GET_VBR_REQUEST, memAddress(value)); }

    /**
     * Enables or disables constrained VBR in the encoder.
     *
     * <p>This setting is ignored when the encoder is in CBR mode. Warning: Only the MDCT mode of Opus currently heeds the constraint. Speech mode ignores it
     * completely, hybrid mode may fail to obey it if the LPC layer uses more bitrate than the constraint would have permitted.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>0</dt><dd>Unconstrained VBR.</dd>
     * <dt>1</dt><dd>Constrained VBR (default). This creates a maximum of one frame of buffering delay assuming a transport with a serialization speed of the nominal bitrate.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_VBR_CONSTRAINT(int value) { return new CTLRequestI(OPUS_SET_VBR_CONSTRAINT_REQUEST, value); }

    /**
     * Determines if constrained VBR is enabled in the encoder.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>Unconstrained VBR.</dd>
     * <dt>1</dt><dd>Constrained VBR (default).</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_VBR_CONSTRAINT(IntBuffer value) { return new CTLRequestP(OPUS_GET_VBR_CONSTRAINT_REQUEST, memAddress(value)); }

    /**
     * Configures mono/stereo forcing in the encoder.
     *
     * <p>This can force the encoder to produce packets encoded as either mono or stereo, regardless of the format of the input audio. This is useful when the
     * caller knows that the input signal is currently a mono source embedded in a stereo stream.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt><dd>Not forced (default)</dd>
     * <dt>1</dt>         <dd>Forced mono</dd>
     * <dt>2</dt>         <dd>Forced stereo</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_FORCE_CHANNELS(int value) { return new CTLRequestI(OPUS_SET_FORCE_CHANNELS_REQUEST, value); }

    /**
     * Gets the encoder's forced channel configuration.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt><dd>Not forced (default)</dd>
     * <dt>1</dt>         <dd>Forced mono</dd>
     * <dt>2</dt>         <dd>Forced stereo</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_FORCE_CHANNELS(IntBuffer value) { return new CTLRequestP(OPUS_GET_FORCE_CHANNELS_REQUEST, memAddress(value)); }

    /**
     * Configures the maximum bandpass that the encoder will select automatically.
     *
     * <p>Applications should normally use this instead of {@link #OPUS_SET_BANDWIDTH} (leaving that set to the default, {@link #OPUS_AUTO}). This allows the
     * application to set an upper bound based on the type of input it is providing, but still gives the encoder the freedom to reduce the bandpass when the
     * bitrate becomes too low, for better overall quality.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>{@link #OPUS_BANDWIDTH_NARROWBAND}</dt>    <dd>4 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_MEDIUMBAND}</dt>    <dd>6 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_WIDEBAND}</dt>      <dd>8 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_SUPERWIDEBAND}</dt><dd>12 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_FULLBAND}</dt>     <dd>20 kHz passband (default)</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_MAX_BANDWIDTH(int value) { return new CTLRequestI(OPUS_SET_MAX_BANDWIDTH_REQUEST, value); }

    /**
     * Gets the encoder's configured maximum allowed bandpass.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_BANDWIDTH_NARROWBAND}</dt>    <dd>4 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_MEDIUMBAND}</dt>    <dd>6 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_WIDEBAND}</dt>      <dd>8 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_SUPERWIDEBAND}</dt><dd>12 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_FULLBAND}</dt>     <dd>20 kHz passband (default)</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_MAX_BANDWIDTH(IntBuffer value) { return new CTLRequestP(OPUS_GET_MAX_BANDWIDTH_REQUEST, memAddress(value)); }

    /**
     * Sets the encoder's bandpass to a specific value.
     *
     * <p>This prevents the encoder from automatically selecting the bandpass based on the available bitrate. If an application knows the bandpass of the input
     * audio it is providing, it should normally use {@link #OPUS_SET_MAX_BANDWIDTH} instead, which still gives the encoder the freedom to reduce the bandpass
     * when the bitrate becomes too low, for better overall quality.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt>                    <dd>(default)</dd>
     * <dt>{@link #OPUS_BANDWIDTH_NARROWBAND}</dt>    <dd>4 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_MEDIUMBAND}</dt>    <dd>6 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_WIDEBAND}</dt>      <dd>8 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_SUPERWIDEBAND}</dt><dd>12 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_FULLBAND}</dt>     <dd>20 kHz passband (default)</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_BANDWIDTH(int value) { return new CTLRequestI(OPUS_SET_BANDWIDTH_REQUEST, value); }

    /**
     * Gets the encoder's configured bandpass or the decoder's last bandpass.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt>                    <dd>(default)</dd>
     * <dt>{@link #OPUS_BANDWIDTH_NARROWBAND}</dt>    <dd>4 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_MEDIUMBAND}</dt>    <dd>6 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_WIDEBAND}</dt>      <dd>8 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_SUPERWIDEBAND}</dt><dd>12 kHz passband</dd>
     * <dt>{@link #OPUS_BANDWIDTH_FULLBAND}</dt>     <dd>20 kHz passband (default)</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_BANDWIDTH(IntBuffer value) { return new CTLRequestP(OPUS_GET_BANDWIDTH_REQUEST, memAddress(value)); }

    /**
     * Configures the type of signal being encoded.
     *
     * <p>This is a hint which helps the encoder's mode selection.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt>        <dd>(default)</dd>
     * <dt>{@link #OPUS_SIGNAL_VOICE}</dt><dd>Bias thresholds towards choosing LPC or Hybrid modes.</dd>
     * <dt>{@link #OPUS_SIGNAL_MUSIC}</dt><dd>Bias thresholds towards choosing MDCT modes.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_SIGNAL(int value) { return new CTLRequestI(OPUS_SET_SIGNAL_REQUEST, value); }

    /**
     * Gets the encoder's configured signal type.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_AUTO}</dt>        <dd>(default)</dd>
     * <dt>{@link #OPUS_SIGNAL_VOICE}</dt><dd>Bias thresholds towards choosing LPC or Hybrid modes.</dd>
     * <dt>{@link #OPUS_SIGNAL_MUSIC}</dt><dd>Bias thresholds towards choosing MDCT modes.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_SIGNAL(IntBuffer value) { return new CTLRequestP(OPUS_GET_SIGNAL_REQUEST, memAddress(value)); }

    /**
     * Configures the encoder's intended application.
     *
     * <p>The initial value is a mandatory argument to the encoder_create function.</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>{@link #OPUS_APPLICATION_VOIP}</dt><dd>Process signal for improved speech intelligibility.</dd>
     * <dt>{@link #OPUS_APPLICATION_AUDIO}</dt><dd>Favor faithfulness to the original input.</dd>
     * <dt>{@link #OPUS_APPLICATION_RESTRICTED_LOWDELAY}</dt><dd>Configure the minimum possible coding delay by disabling certain modes of operation.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_APPLICATION(int value) { return new CTLRequestI(OPUS_SET_APPLICATION_REQUEST, value); }

    /**
     * Gets the encoder's configured application.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_APPLICATION_VOIP}</dt><dd>Process signal for improved speech intelligibility.</dd>
     * <dt>{@link #OPUS_APPLICATION_AUDIO}</dt><dd>Favor faithfulness to the original input.</dd>
     * <dt>{@link #OPUS_APPLICATION_RESTRICTED_LOWDELAY}</dt><dd>Configure the minimum possible coding delay by disabling certain modes of operation.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_APPLICATION(IntBuffer value) { return new CTLRequestP(OPUS_GET_APPLICATION_REQUEST, memAddress(value)); }

    /**
     * Gets the total samples of delay added by the entire codec.
     *
     * <p>This can be queried by the encoder and then the provided number of samples can be skipped on from the start of the decoder's output to provide time
     * aligned input and output. From the perspective of a decoding application the real data begins this many samples late.</p>
     *
     * <p>The decoder contribution to this delay is identical for all decoders, but the encoder portion of the delay may vary from implementation to
     * implementation, version to version, or even depend on the encoder's initial configuration. Applications needing delay compensation should call this CTL
     * rather than hard-coding a value.</p>
     *
     * @return number of lookahead samples
     */
    public static CTLRequest OPUS_GET_LOOKAHEAD(IntBuffer value) { return new CTLRequestP(OPUS_GET_LOOKAHEAD_REQUEST, memAddress(value)); }

    /**
     * Configures the encoder's use of inband forward error correction (FEC).
     *
     * <p>Note: This is only applicable to the LPC layer</p>
     *
     * @param value allowed values:
     * <dl>
     * <dt>0</dt><dd>Disable inband FEC (default).</dd>
     * <dt>1</dt><dd>Enable inband FEC.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_INBAND_FEC(int value) { return new CTLRequestI(OPUS_SET_INBAND_FEC_REQUEST, value); }

    /**
     * Gets encoder's configured use of inband forward error correction.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>Inband FEC disabled (default).</dd>
     * <dt>1</dt><dd>Inband FEC enabled.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_INBAND_FEC(IntBuffer value) { return new CTLRequestP(OPUS_GET_INBAND_FEC_REQUEST, memAddress(value)); }

    /**
     * Configures the encoder's expected packet loss percentage.
     *
     * <p>Higher values trigger progressively more loss resistant behavior in the encoder at the expense of quality at a given bitrate in the absence of packet
     * loss, but greater quality under loss.</p>
     *
     * @param value loss percentage in the range 0-100, inclusive (default: 0)
     */
    public static CTLRequest OPUS_SET_PACKET_LOSS_PERC(int value) { return new CTLRequestI(OPUS_SET_PACKET_LOSS_PERC_REQUEST, value); }

    /**
     * Gets the encoder's configured packet loss percentage.
     *
     * @return the configured loss percentage in the range 0-100, inclusive (default: 0)
     */
    public static CTLRequest OPUS_GET_PACKET_LOSS_PERC(IntBuffer value) { return new CTLRequestP(OPUS_GET_PACKET_LOSS_PERC_REQUEST, memAddress(value)); }

    /**
     * Configures the encoder's use of discontinuous transmission (DTX).
     *
     * <p>Note: This is only applicable to the LPC layer</p>
     *
     * @param value allowed valued:
     * <dl>
     * <dt>0</dt><dd>Disable DTX (default).</dd>
     * <dt>1</dt><dd>Enabled DTX.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_DTX(int value) { return new CTLRequestI(OPUS_SET_DTX_REQUEST, value); }

    /**
     * Gets encoder's configured use of discontinuous transmission.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>DTX disabled (default).</dd>
     * <dt>1</dt><dd>DTX enabled.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_DTX(IntBuffer value) { return new CTLRequestP(OPUS_GET_DTX_REQUEST, memAddress(value)); }

    /**
     * Configures the depth of signal being encoded.
     *
     * <p>This is a hint which helps the encoder identify silence and near-silence. It represents the number of significant bits of linear intensity below
     * which the signal contains ignorable quantization or other noise.</p>
     *
     * <p>For example, {@code OPUS_SET_LSB_DEPTH(14)} would be an appropriate setting for G.711 u-law input. {@code OPUS_SET_LSB_DEPTH(16)} would be
     * appropriate for 16-bit linear pcm input with opus_encode_float().</p>
     *
     * <p>When using {@link #opus_encode} instead of {@link #opus_encode_float}, or when libopus is compiled for fixed-point, the encoder uses the minimum of
     * the value set here and the value 16.</p>
     *
     * @param value input precision in bits, between 8 and 24 (default: 24).
     */
    public static CTLRequest OPUS_SET_LSB_DEPTH(int value) { return new CTLRequestI(OPUS_SET_LSB_DEPTH_REQUEST, value); }

    /**
     * Gets the encoder's configured signal depth.
     *
     * @return input precision in bits, between 8 and 24 (default: 24).
     */
    public static CTLRequest OPUS_GET_LSB_DEPTH(IntBuffer value) { return new CTLRequestP(OPUS_GET_LSB_DEPTH_REQUEST, memAddress(value)); }

    /**
     * Configures the encoder's use of variable duration frames.
     *
     * <p>When variable duration is enabled, the encoder is free to use a shorter frame size than the one requested in the {@code opus_encode*()} call. It is
     * then the user's responsibility to verify how much audio was encoded by checking the ToC byte of the encoded packet. The part of the audio that was not
     * encoded needs to be resent to the encoder for the next call. Do not use this option unless you <b>really</b> know what you are doing.</p>
     *
     * @param value allowed valued:
     * <dl>
     * <dt>{@link #OPUS_FRAMESIZE_ARG}</dt><dd>Select frame size from the argument (default).</dd>
     * <dt>{@link #OPUS_FRAMESIZE_2_5_MS}</dt><dd>Use 2.5 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_5_MS}</dt><dd>Use 5 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_10_MS}</dt><dd>Use 10 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_20_MS}</dt><dd>Use 20 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_40_MS}</dt><dd>Use 40 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_60_MS}</dt><dd>Use 60 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_80_MS}</dt><dd>Use 80 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_100_MS}</dt><dd>Use 100 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_120_MS}</dt><dd>Use 120 ms frames.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_EXPERT_FRAME_DURATION(int value) { return new CTLRequestI(OPUS_SET_EXPERT_FRAME_DURATION_REQUEST, value); }

    /**
     * Gets the encoder's configured use of variable duration frames.
     *
     * @return one of the following values:
     * <dl>
     * <dt>{@link #OPUS_FRAMESIZE_ARG}</dt><dd>Select frame size from the argument (default).</dd>
     * <dt>{@link #OPUS_FRAMESIZE_2_5_MS}</dt><dd>Use 2.5 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_5_MS}</dt><dd>Use 5 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_10_MS}</dt><dd>Use 10 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_20_MS}</dt><dd>Use 20 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_40_MS}</dt><dd>Use 40 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_60_MS}</dt><dd>Use 60 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_80_MS}</dt><dd>Use 80 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_100_MS}</dt><dd>Use 100 ms frames.</dd>
     * <dt>{@link #OPUS_FRAMESIZE_120_MS}</dt><dd>Use 120 ms frames.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_EXPERT_FRAME_DURATION(IntBuffer value) { return new CTLRequestP(OPUS_GET_EXPERT_FRAME_DURATION_REQUEST, memAddress(value)); }

    /**
     * If set to 1, disables almost all use of prediction, making frames almost completely independent. This reduces quality.
     *
     * @param value allowed valued:
     * <dl>
     * <dt>0</dt><dd>Enable prediction (default).</dd>
     * <dt>1</dt><dd>Disable prediction.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_PREDICTION_DISABLED(int value) { return new CTLRequestI(OPUS_SET_PREDICTION_DISABLED_REQUEST, value); }

    /**
     * Gets the encoder's configured prediction status.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>Prediction enabled (default).</dd>
     * <dt>1</dt><dd>Prediction disabled.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_PREDICTION_DISABLED(IntBuffer value) { return new CTLRequestP(OPUS_GET_PREDICTION_DISABLED_REQUEST, memAddress(value)); }

    /**
     * Gets the final state of the codec's entropy coder.
     *
     * <p>This is used for testing purposes. The encoder and decoder state should be identical after coding a payload (assuming no data corruption or software
     * bugs).</p>
     *
     * @return entropy coder state
     */
    public static CTLRequest OPUS_GET_FINAL_RANGE(IntBuffer value) { return new CTLRequestP(OPUS_GET_FINAL_RANGE_REQUEST, memAddress(value)); }

    /**
     * Gets the sampling rate the encoder or decoder was initialized with.
     *
     * <p>This simply returns the {@code Fs} value passed to {@link #opus_encoder_init} or {@link #opus_decoder_init}.</p>
     *
     * @return sampling rate of encoder or decoder.
     */
    public static CTLRequest OPUS_GET_SAMPLE_RATE(IntBuffer value) { return new CTLRequestP(OPUS_GET_SAMPLE_RATE_REQUEST, memAddress(value)); }

    /**
     * If set to 1, disables the use of phase inversion for intensity stereo, improving the quality of mono downmixes, but slightly reducing normal stereo
     * quality.
     *
     * <p>Disabling phase inversion in the decoder does not comply with RFC 6716, although it does not cause any interoperability issue and is expected to
     * become part of the Opus standard once RFC 6716 is updated by draft-ietf-codec-opus-update.</p>
     *
     * @param value allowed valued:
     * <dl>
     * <dt>0</dt><dd>Enable phase inversion (default).</dd>
     * <dt>1</dt><dd>Disable phase inversion.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_SET_PHASE_INVERSION_DISABLED(int value) { return new CTLRequestI(OPUS_SET_PHASE_INVERSION_DISABLED_REQUEST, value); }

    /**
     * Gets the encoder's configured phase inversion status.
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>Stereo phase inversion enabled (default).</dd>
     * <dt>1</dt><dd>Stereo phase inversion disabled.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_PHASE_INVERSION_DISABLED(IntBuffer value) { return new CTLRequestP(OPUS_GET_PHASE_INVERSION_DISABLED_REQUEST, memAddress(value)); }

    /**
     * Gets the DTX state of the encoder.
     *
     * <p>Returns whether the last encoded frame was either a comfort noise update during DTX or not encoded because of DTX.</p>
     *
     * @return one of the following values:
     * <dl>
     * <dt>0</dt><dd>The encoder is not in DTX.</dd>
     * <dt>1</dt><dd>The encoder is in DTX.</dd>
     * </dl>
     */
    public static CTLRequest OPUS_GET_IN_DTX(IntBuffer value) { return new CTLRequestP(OPUS_GET_IN_DTX_REQUEST, memAddress(value)); }

    /**
     * Configures decoder gain adjustment.
     *
     * <p>Scales the decoded output by a factor specified in Q8 dB units. This has a maximum range of -32768 to 32767 inclusive, and returns
     * {@link #OPUS_BAD_ARG} otherwise. The default is zero indicating no adjustment. This setting survives decoder reset.</p>
     *
     * <p>{@code gain = pow(10, x/(20.0*256))}</p>
     *
     * @param value amount to scale PCM signal by in Q8 dB units.
     */
    public static CTLRequest OPUS_SET_GAIN(int value) { return new CTLRequestI(OPUS_SET_GAIN_REQUEST, value); }

    /**
     * Gets the decoder's configured gain adjustment.
     *
     * @return amount to scale PCM signal by in Q8 dB units.
     */
    public static CTLRequest OPUS_GET_GAIN(IntBuffer value) { return new CTLRequestP(OPUS_GET_GAIN_REQUEST, memAddress(value)); }

    /**
     * Gets the duration (in samples) of the last packet successfully decoded or concealed.
     *
     * @return number of samples (at current sampling rate).
     */
    public static CTLRequest OPUS_GET_LAST_PACKET_DURATION(IntBuffer value) { return new CTLRequestP(OPUS_GET_LAST_PACKET_DURATION_REQUEST, memAddress(value)); }

    /**
     * Gets the pitch of the last decoded frame, if available.
     *
     * <p>This can be used for any post-processing algorithm requiring the use of pitch, e.g. time stretching/shortening. If the last frame was not voiced, or
     * if the pitch was not coded in the frame, then zero is returned.</p>
     *
     * <p>This CTL is only implemented for decoder instances.</p>
     *
     * @return pitch period at 48 kHz (or 0 if not available)
     */
    public static CTLRequest OPUS_GET_PITCH(IntBuffer value) { return new CTLRequestP(OPUS_GET_PITCH_REQUEST, memAddress(value)); }

}