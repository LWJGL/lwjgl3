/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val Opus = "Opus".nativeClass(Module.OPUS, prefix = "OPUS", prefixMethod = "opus_", binding = OPUS_BINDING) {
    documentation =
        """
        Native bindings to the ${url("https://opus-codec.org/", "Opus")} library.

        The Opus codec is designed for interactive speech and audio transmission over the Internet. It is designed by the IETF Codec Working Group and
        incorporates technology from Skype's SILK codec and Xiph.Org's CELT codec.

        The Opus codec is designed to handle a wide range of interactive audio applications, including Voice over IP, videoconferencing, in-game chat, and even
        remote live music performances. It can scale from low bit-rate narrowband speech to very high quality stereo music. Its main features are:

        ${ul(
            "Sampling rates from 8 to 48 kHz",
            "Bit-rates from 6 kb/s to 510 kb/s",
            "Support for both constant bit-rate (CBR) and variable bit-rate (VBR)",
            "Audio bandwidth from narrowband to full-band",
            "Support for speech and music",
            "Support for mono and stereo",
            "Support for multichannel (up to 255 channels)",
            "Frame sizes from 2.5 ms to 60 ms",
            "Good loss robustness and packet loss concealment (PLC)",
            "Floating point and fixed-point implementation"
        )}

        <h2>Opus Encoder</h2>
        This section describes the process and functions used to encode Opus.

        Since Opus is a stateful codec, the encoding process starts with creating an encoder state. This can be done with:
        ${codeBlock("""
int error;
OpusEncoder *enc;
enc = opus_encoder_create(Fs, channels, application, &error);""")}

        From this point, {@code enc} can be used for encoding an audio stream. An encoder state <em>must</em> not be used for more than one stream at the
        same time. Similarly, the encoder state <em>must</em> not be re-initialized for each frame.

        While #encoder_create() allocates memory for the state, it's also possible to initialize pre-allocated memory:
        ${codeBlock("""
        int size;
int error;
OpusEncoder *enc;
size = opus_encoder_get_size(channels);
enc = malloc(size);
error = opus_encoder_init(enc, Fs, channels, application);""")}

        where #encoder_get_size() returns the required size for the encoder state. Note that future versions of this code may change the size, so no assuptions
        should be made about it.

        The encoder state is always continuous in memory and only a shallow copy is sufficient to copy it (e.g. {@code memcpy()}).

        It is possible to change some of the encoder's settings using the #encoder_ctl() interface. All these settings already default to the recommended
        value, so they should only be changed when necessary. The most common settings one may want to change are:
        ${codeBlock("""
opus_encoder_ctl(enc, OPUS_SET_BITRATE(bitrate));
opus_encoder_ctl(enc, OPUS_SET_COMPLEXITY(complexity));
opus_encoder_ctl(enc, OPUS_SET_SIGNAL(signal_type));""")}

        where ${ul(
            "{@code bitrate} is in bits per second (b/s),",
            "{@code complexity} is a value from 1 to 10, where 1 is the lowest complexity and 10 is the highest, and",
            "{@code signal_type} is either #AUTO (default), #SIGNAL_VOICE, or #SIGNAL_MUSIC."
        )}

        See Encoder related CTLs and Generic CTLs for a complete list of parameters that can be set or queried. Most parameters can be set or changed at any
        time during a stream.

        To encode a frame, #encode() or #encode_float() must be called with exactly one frame (2.5, 5, 10, 20, 40 or 60 ms) of audio data:
        ${codeBlock("""
len = opus_encode(enc, audio_frame, frame_size, packet, max_packet);""")}

        where ${ul(
            "{@code audio_frame} is the audio data in short (or float for #encode_float()),",
            "{@code frame_size} is the duration of the frame in samples (per channel),",
            "{@code packet} is the byte array to which the compressed data is written, and",
            """
            {@code max_packet} is the maximum number of bytes that can be written in the packet (4000 bytes is recommended). Do not use {@code max_packet} to
            control VBR target bitrate, instead use the #SET_BITRATE_REQUEST CTL.
            """
        )}

        #encode() and #encode_float() return the number of bytes actually written to the packet. The return value <b>can be negative</b>, which indicates that
        an error has occurred. If the return value is 2 bytes or less, then the packet does not need to be transmitted (DTX).

        Once the encoder state if no longer needed, it can be destroyed with
        ${codeBlock("""
opus_encoder_destroy(enc);""")}

        If the encoder was created with #encoder_init() rather than #encoder_create(), then no action is required aside from potentially freeing the memory
        that was manually allocated for it (calling {@code free(enc)} for the example above).

        <h2>Opus Decoder</h2>
        This page describes the process and functions used to decode Opus.

        The decoding process also starts with creating a decoder state. This can be done with:
        ${codeBlock("""
int error;
OpusDecoder *dec;
dec = opus_decoder_create(Fs, channels, &error);""")}

        where ${ul(
            "Fs is the sampling rate and must be 8000, 12000, 16000, 24000, or 48000",
            "channels is the number of channels (1 or 2)",
            "error will hold the error code in case of failure (or #OK on success), and",
            "the return value is a newly created decoder state to be used for decoding."
        )}

        While #decoder_create() allocates memory for the state, it's also possible to initialize pre-allocated memory:
        ${codeBlock("""
int size;
int error;
OpusDecoder *dec;
size = opus_decoder_get_size(channels);
dec = malloc(size);
error = opus_decoder_init(dec, Fs, channels);""")}

        where #decoder_get_size() returns the required size for the decoder state. Note that future versions of this code may change the size, so no assuptions
        should be made about it.

        The decoder state is always continuous in memory and only a shallow copy is sufficient to copy it (e.g. {@code memcpy()}).

        To decode a frame, #decode() or #decode_float() must be called with a packet of compressed audio data:
        ${codeBlock("""
frame_size = opus_decode(dec, packet, len, decoded, max_size, 0);""")}

        where ${ul(
            "{@code packet} is the byte array containing the compressed data",
            "{@code len} is the exact number of bytes contained in the packet",
            "{@code decoded} is the decoded audio data in {@code opus_int16} (or float for #decode_float()), and",
            "{@code max_size} is the max duration of the frame in samples (per channel) that can fit into the {@code decoded_frame} array."
        )}

        #decode() and #decode_float() return the number of samples (per channel) decoded from the packet. If that value is negative, then an error has
        occurred. This can occur if the packet is corrupted or if the audio buffer is too small to hold the decoded audio.

        Opus is a stateful codec with overlapping blocks and as a result Opus packets are not coded independently of each other. Packets must be passed into
        the decoder serially and in the correct order for a correct decode. Lost packets can be replaced with loss concealment by calling the decoder with a
        null pointer and zero length for the missing packet.

        A single codec state may only be accessed from a single thread at a time and any required locking must be performed by the caller. Separate streams
        must be decoded with separate decoder states and can be decoded in parallel unless the library was compiled with {@code NONTHREADSAFE_PSEUDOSTACK}
        defined.

        <h2>Repacketizer</h2>

        The repacketizer can be used to merge multiple Opus packets into a single packet or alternatively to split Opus packets that have previously been
        merged. Splitting valid Opus packets is always guaranteed to succeed, whereas merging valid packets only succeeds if all frames have the same mode,
        bandwidth, and frame size, and when the total duration of the merged packet is no more than 120 ms. The 120 ms limit comes from the specification and
        limits decoder memory requirements at a point where framing overhead becomes negligible.

        The repacketizer currently only operates on elementary Opus streams. It will not manipualte multistream packets successfully, except in the degenerate
        case where they consist of data from a single stream.

        The repacketizing process starts with creating a repacketizer state, either by calling #repacketizer_create() or by allocating the memory yourself,
        e.g., ${codeBlock("""
OpusRepacketizer *rp;
rp = (OpusRepacketizer*)malloc(opus_repacketizer_get_size());
if (rp != NULL)
    opus_repacketizer_init(rp);""")}

        Then the application should submit packets with #repacketizer_cat(), extract new packets with #repacketizer_out() or #repacketizer_out_range(), and
        then reset the state for the next set of input packets via #repacketizer_init().

        For example, to split a sequence of packets into individual frames:
        ${codeBlock("""
unsigned char *data;
int len;
while (get_next_packet(&data, &len))
{
  unsigned char out[1276];
  opus_int32 out_len;
  int nb_frames;
  int err;
  int i;
  err = opus_repacketizer_cat(rp, data, len);
  if (err != OPUS_OK)
  {
    release_packet(data);
    return err;
  }
  nb_frames = opus_repacketizer_get_nb_frames(rp);
  for (i = 0; i < nb_frames; i++)
  {
    out_len = opus_repacketizer_out_range(rp, i, i+1, out, sizeof(out));
    if (out_len < 0)
    {
       release_packet(data);
       return (int)out_len;
    }
    output_next_packet(out, out_len);
  }
  opus_repacketizer_init(rp);
  release_packet(data);
}""")}
        
        Alternatively, to combine a sequence of frames into packets that each contain up to {@code TARGET_DURATION_MS} milliseconds of data:
        ${codeBlock("""
// The maximum number of packets with duration TARGET_DURATION_MS occurs
// when the frame size is 2.5 ms, for a total of (TARGET_DURATION_MS*2/5)
// packets.
unsigned char *data[(TARGET_DURATION_MS*2/5)+1];
opus_int32 len[(TARGET_DURATION_MS*2/5)+1];
int nb_packets;
unsigned char out[1277*(TARGET_DURATION_MS*2/2)];
opus_int32 out_len;
int prev_toc;
nb_packets = 0;
while (get_next_packet(data+nb_packets, len+nb_packets))
{
  int nb_frames;
  int err;
  nb_frames = opus_packet_get_nb_frames(data[nb_packets], len[nb_packets]);
  if (nb_frames < 1)
  {
    release_packets(data, nb_packets+1);
    return nb_frames;
  }
  nb_frames += opus_repacketizer_get_nb_frames(rp);
  // If adding the next packet would exceed our target, or it has an
  // incompatible TOC sequence, output the packets we already have before
  // submitting it.
  // N.B., The nb_packets > 0 check ensures we've submitted at least one
  // packet since the last call to opus_repacketizer_init(). Otherwise a
  // single packet longer than TARGET_DURATION_MS would cause us to try to
  // output an (invalid) empty packet. It also ensures that prev_toc has
  // been set to a valid value. Additionally, len[nb_packets] > 0 is
  // guaranteed by the call to opus_packet_get_nb_frames() above, so the
  // reference to data[nb_packets][0] should be valid.
  if (nb_packets > 0 && (
      ((prev_toc & 0xFC) != (data[nb_packets][0] & 0xFC)) ||
      opus_packet_get_samples_per_frame(data[nb_packets], 48000)*nb_frames >
      TARGET_DURATION_MS*48))
  {
    out_len = opus_repacketizer_out(rp, out, sizeof(out));
    if (out_len < 0)
    {
       release_packets(data, nb_packets+1);
       return (int)out_len;
    }
    output_next_packet(out, out_len);
    opus_repacketizer_init(rp);
    release_packets(data, nb_packets);
    data[0] = data[nb_packets];
    len[0] = len[nb_packets];
    nb_packets = 0;
  }
  err = opus_repacketizer_cat(rp, data[nb_packets], len[nb_packets]);
  if (err != OPUS_OK)
  {
    release_packets(data, nb_packets+1);
    return err;
  }
  prev_toc = data[nb_packets][0];
  nb_packets++;
}
// Output the final, partial packet.
if (nb_packets > 0)
{
  out_len = opus_repacketizer_out(rp, out, sizeof(out));
  release_packets(data, nb_packets);
  if (out_len < 0)
    return (int)out_len;
  output_next_packet(out, out_len);
}""")}

        An alternate way of merging packets is to simply call #repacketizer_cat() unconditionally until it fails. At that point, the merged packet can be
        obtained with {@code opus_repacketizer_out()} and the input packet for which {@code opus_repacketizer_cat()} needs to be re-added to a newly
        reinitialized repacketizer state.
        """

    val ErrorCodes = EnumConstant(
        "Error codes.",

        "OK".enum("No error", "0"),
        "BAD_ARG".enum("One or more invalid/out of range arguments", "-1"),
        "BUFFER_TOO_SMALL".enum("Not enough bytes allocated in the buffer", "-2"),
        "INTERNAL_ERROR".enum("An internal error was detected", "-3"),
        "INVALID_PACKET".enum("The compressed data passed is corrupted", "-4"),
        "UNIMPLEMENTED".enum("Invalid/unsupported request number", "-5"),
        "INVALID_STATE".enum("An encoder or decoder structure is invalid or already freed", "-6"),
        "ALLOC_FAIL".enum("Memory allocation has failed", "-7")
    ).javaDocLinks

    EnumConstant(
        "CTLs",

        "SET_APPLICATION_REQUEST".enum("", "4000"),
        "GET_APPLICATION_REQUEST".enum,
        "SET_BITRATE_REQUEST".enum,
        "GET_BITRATE_REQUEST".enum,
        "SET_MAX_BANDWIDTH_REQUEST".enum,
        "GET_MAX_BANDWIDTH_REQUEST".enum,
        "SET_VBR_REQUEST".enum,
        "GET_VBR_REQUEST".enum,
        "SET_BANDWIDTH_REQUEST".enum,
        "GET_BANDWIDTH_REQUEST".enum,
        "SET_COMPLEXITY_REQUEST".enum,
        "GET_COMPLEXITY_REQUEST".enum,
        "SET_INBAND_FEC_REQUEST".enum,
        "GET_INBAND_FEC_REQUEST".enum,
        "SET_PACKET_LOSS_PERC_REQUEST".enum,
        "GET_PACKET_LOSS_PERC_REQUEST".enum,
        "SET_DTX_REQUEST".enum,
        "GET_DTX_REQUEST".enum,
        "SET_VBR_CONSTRAINT_REQUEST".enum("", "4020"),
        "GET_VBR_CONSTRAINT_REQUEST".enum,
        "SET_FORCE_CHANNELS_REQUEST".enum,
        "GET_FORCE_CHANNELS_REQUEST".enum,
        "SET_SIGNAL_REQUEST".enum,
        "GET_SIGNAL_REQUEST".enum,
        "GET_LOOKAHEAD_REQUEST".enum("", "4027"),
        "RESET_STATE".enum(
            """
            Resets the codec state to be equivalent to a freshly initialized state.

            This should be called when switching streams in order to prevent the back to back decoding from giving different results from one at a time
            decoding.
            """
        ),
        "GET_SAMPLE_RATE_REQUEST".enum,
        "GET_FINAL_RANGE_REQUEST".enum("", "4031"),
        "GET_PITCH_REQUEST".enum("", "4033"),
        "SET_GAIN_REQUEST".enum,
        "GET_GAIN_REQUEST".enum("", "4045"), /* Should have been 4035 */
        "SET_LSB_DEPTH_REQUEST".enum("", "4036"),
        "GET_LSB_DEPTH_REQUEST".enum,
        "GET_LAST_PACKET_DURATION_REQUEST".enum("", "4039"),
        "SET_EXPERT_FRAME_DURATION_REQUEST".enum,
        "GET_EXPERT_FRAME_DURATION_REQUEST".enum,
        "SET_PREDICTION_DISABLED_REQUEST".enum,
        "GET_PREDICTION_DISABLED_REQUEST".enum,
        /* Don't use 4045, it's already taken by OPUS_GET_GAIN_REQUEST */
        "SET_PHASE_INVERSION_DISABLED_REQUEST".enum("", "4046"),
        "GET_PHASE_INVERSION_DISABLED_REQUEST".enum,
        "GET_IN_DTX_REQUEST".enum("", "4049")
    ).javaDocLinks

    IntConstant(
        "Values for the various encoder CTLs.",

        "AUTO".."-1000",
        "BITRATE_MAX".."-1"
    )

    val CodingModes = EnumConstant(
        "Coding modes.",

        "APPLICATION_VOIP".enum("Best for most VoIP/videoconference applications where listening quality and intelligibility matter most", "2048"),
        "APPLICATION_AUDIO".enum("Best for broadcast/high-fidelity application where the decoded audio should be as close as possible to the input"),
        "APPLICATION_RESTRICTED_LOWDELAY".enum("Only use when lowest-achievable latency is what matters most. Voice-optimized modes cannot be used.", "2051")
    ).javaDocLinks

    EnumConstant(
        "",

        "SIGNAL_VOICE".enum("Signal being encoded is voice", "3001"),
        "SIGNAL_MUSIC".enum("Signal being encoded is music")
    )

    EnumConstant(
        "",

        "BANDWIDTH_NARROWBAND".enum("Narrowband (4kHz bandpass)", "1101"),
        "BANDWIDTH_MEDIUMBAND".enum("Mediumband (6kHz bandpass)"),
        "BANDWIDTH_WIDEBAND".enum("Wideband (8kHz bandpass)"),
        "BANDWIDTH_SUPERWIDEBAND".enum("Superwideband (12kHz bandpass)"),
        "BANDWIDTH_FULLBAND".enum("Fullband (20kHz bandpass)")
    )

    EnumConstant(
        "",

        "FRAMESIZE_ARG".enum("Select frame size from the argument (default)", "5000"),
        "FRAMESIZE_2_5_MS".enum("Use 2.5 ms frames"),
        "FRAMESIZE_5_MS".enum("Use 5 ms frames"),
        "FRAMESIZE_10_MS".enum("Use 10 ms frames"),
        "FRAMESIZE_20_MS".enum("Use 20 ms frames"),
        "FRAMESIZE_40_MS".enum("Use 40 ms frames"),
        "FRAMESIZE_60_MS".enum("Use 60 ms frames"),
        "FRAMESIZE_80_MS".enum("Use 80 ms frames"),
        "FRAMESIZE_100_MS".enum("Use 100 ms frames"),
        "FRAMESIZE_120_MS".enum("Use 120 ms frames")
    )

    int(
        "encoder_get_size",
        "Gets the size of an {@code OpusEncoder} structure.",

        int("channels", "number of channels", "1 2"),

        returnDoc = "the size in bytes"
    )

    OpusEncoder.p(
        "encoder_create",
        """
        Allocates and initializes an encoder state.

        There are three coding modes:
        ${ul(
            """
            #APPLICATION_VOIP: gives best quality at a given bitrate for voice signals.

            It enhances the input signal by high-pass filtering and emphasizing formants and harmonics. Optionally it includes in-band forward error correction
            to protect against packet loss. Use this mode for typical VoIP applications. Because of the enhancement, even at high bitrates the output may sound
            different from the input.
            """,
            """
            #APPLICATION_AUDIO: gives best quality at a given bitrate for most non-voice signals like music.

            Use this mode for music and mixed (music/voice) content, broadcast, and applications requiring less than 15 ms of coding delay.
            """,
            """
            #APPLICATION_RESTRICTED_LOWDELAY: configures low-delay mode that disables the speech-optimized mode in exchange for slightly reduced delay.

            This mode can only be set on an newly initialized or freshly reset encoder because it changes the codec delay.
            """
        )}

        This is useful when the caller knows that the speech-optimized modes will not be needed (use with caution).

        ${note("""
        Regardless of the sampling rate and number channels selected, the Opus encoder can switch to a lower audio bandwidth or number of
        channels if the bitrate selected is too low. This also means that it is safe to always use 48 kHz stereo input and let the encoder optimize the
        encoding.""")}
        """,

        opus_int32("Fs", "sampling rate of input signal (Hz)", "8000 12000 16000 24000 48000"),
        int("channels", "number of channels in input signal", "1 2"),
        int("application", "coding mode", CodingModes),
        Check(1)..nullable..int.p("error", "", ErrorCodes)
    )

    int(
        "encoder_init",
        """
        Initializes a previously allocated encoder state.

        The memory pointed to by {@code st} must be at least the size returned by #encoder_get_size(). This is intended for applications which use their own
        allocator instead of {@code malloc}.

        To reset a previously initialized state, use the #RESET_STATE CTL.
        """,

        OpusEncoder.p("st", "encoder state"),
        opus_int32("Fs", "sampling rate of input signal (Hz)", "8000 12000 16000 24000 48000"),
        int("channels", "number of channels in input signal", "1 2"),
        int("application", "coding mode", CodingModes),

        returnDoc = "#OK on success or a negative error code on error"
    )

    opus_int32(
        "encode",
        "Encodes an Opus frame.",

        OpusEncoder.p("st", "encoder state"),
        Check(
            // Reading OpusEncoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..opus_int16.const.p("pcm","input signal (interleaved if 2 channels) (length is {@code frame_size*channels*sizeof(opus_int16)})"),
        int(
            "frame_size",
            """
            number of samples per channel in the input signal. This must be an Opus frame size for the encoder's sampling rate. For example, at 48 kHz the
            permitted values are 120, 240, 480, 960, 1920, and 2880. Passing in a duration of less than 10 ms (480 samples at 48 kHz) will prevent the encoder
            from using the LPC or hybrid modes.
            """
        ),
        unsigned_char.p("data", "output payload"),
        AutoSize("data")..opus_int32(
            "max_data_bytes",
            """
            size of the allocated memory for the output payload. This may be used to impose an upper limit on the instant bitrate, but should not be used as
            the only bitrate control. Use #SET_BITRATE_REQUEST to control the bitrate.
            """
        ),

        returnDoc = "the length of the encoded packet (in bytes) on success or a negative error code on error"
    )

    opus_int32(
        "encode_float",
        "Encodes an Opus frame from floating point input.",

        OpusEncoder.p("st", "encoder state"),
        Check(
            // Reading OpusEncoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..float.const.p(
            "pcm",
            """
            input signal (interleaved if 2 channels) with a normal range of {@code +/-1.0}. Samples with a range beyond {@code +/-1.0} are supported but will
            be clipped by decoders using the integer API and should only be used if it is known that the far end supports extended dynamic range. (length is
            {@code frame_size*channels*sizeof(float)})
            """
        ),
        int("frame_size",
            """
            number of samples per channel in the input signal. This must be an Opus frame size for the encoder's sampling rate. For example, at 48 kHz the
            permitted values are 120, 240, 480, 960, 1920, and 2880. Passing in a duration of less than 10 ms (480 samples at 48 kHz) will prevent the encoder
            from using the LPC or hybrid modes.
            """
        ),
        unsigned_char.p("data", "output payload"),
        AutoSize("data")..opus_int32(
            "max_data_bytes",
            """
            size of the allocated memory for the output payload. This may be used to impose an upper limit on the instant bitrate, but should not be used as
            the only bitrate control. Use #SET_BITRATE_REQUEST to control the bitrate.
            """
        ),

        returnDoc = "the length of the encoded packet (in bytes) on success or a negative error code on error"
    )

    void(
        "encoder_destroy",
        "Frees an {@code OpusEncoder} allocated by #encoder_create().",

        OpusEncoder.p("st", "state to be freed")
    )

    private..int(
        "encoder_ctl",
        "Performs a CTL function on an Opus encoder.",

        OpusEncoder.p("st", "encoder state")
    )

    int(
        "decoder_get_size",
        "Gets the size of an {@code OpusDecoder} structure.",

        int("channels", "number of channels", "1 2"),

        returnDoc = "the size in bytes"
    )

    OpusDecoder.p(
        "decoder_create",
        """
        Allocates and initializes a decoder state.

        Internally Opus stores data at 48000 Hz, so that should be the default value for {@code Fs}. However, the decoder can efficiently decode to buffers at
        8, 12, 16, and 24 kHz so if for some reason the caller cannot use data at the full sample rate, or knows the compressed data doesn't use the full
        frequency range, it can request decoding at a reduced rate. Likewise, the decoder is capable of filling in either mono or interleaved stereo pcm
        buffers, at the caller's request.
        """,

        opus_int32("Fs", "sampling rate of input signal (Hz)", "8000 12000 16000 24000 48000"),
        int("channels", "number of channels to decode", "1 2"),
        Check(1)..nullable..int.p("error", "", ErrorCodes)
    )

    int(
        "decoder_init",
        """
        Initializes a previously allocated decoder state.

        The state must be at least the size returned by #decoder_get_size(). This is intended for applications which use their own allocator instead of
        {@code malloc}.

        To reset a previously initialized state, use the #RESET_STATE CTL.
        """,

        OpusDecoder.p("st", "decoder state"),
        opus_int32("Fs", "sampling rate of input signal (Hz)", "8000 12000 16000 24000 48000"),
        int("channels", "number of channels to decode", "1 2"),

        returnDoc = "#OK on success or a negative error code on error"
    )

    int(
        "decode",
        "Decodes an Opus packet.",

        OpusDecoder.p("st", "decoder state"),
        nullable..unsigned_char.const.p("data", "input payload (Use a #NULL pointer to indicate packet loss)"),
        AutoSize("data")..opus_int32("len", "number of bytes in payload"),
        Check(
            // Reading OpusDecoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..opus_int16.p("pcm", "output signal (interleaved if 2 channels) (length is {@code frame_size*channels*sizeof(opus_int16)}"),
        int(
            "frame_size",
            """
            number of samples per channel of available space in pcm.

            If this is less than the maximum packet duration (120ms; 5760 for 48kHz), this function will not be capable of decoding some packets. In the case
            of PLC ({@code data==NULL}) or FEC ({@code decode_fec=1}), then {@code frame_size} needs to be exactly the duration of audio that is missing,
            otherwise the decoder will not be in the optimal state to decode the next incoming packet. For the PLC and FEC cases, {@code frame_size}
            <b>must</b> be a multiple of 2.5 ms.
            """
        ),
        int(
            "decode_fec",
            """
            flag (0 or 1) to request that any in-band forward error correction data be decoded. If no such data is available, the frame is decoded as if it
            were lost.
            """
        ),

        returnDoc = "number of decoded samples or a negative error code"
    )

    int(
        "decode_float",
        "Decodes an Opus packet with floating point output.",

        OpusDecoder.p("st", "decoder state"),
        nullable..unsigned_char.const.p("data", "input payload (Use a #NULL pointer to indicate packet loss)"),
        AutoSize("data")..opus_int32("len", "number of bytes in payload"),
        Check(
            // Reading OpusDecoder internal state here
            "frame_size * memGetInt(st + 8)"
        )..opus_int16.p("pcm", "output signal (interleaved if 2 channels) (length is {@code frame_size*channels*sizeof(opus_int16)}"),
        int(
            "frame_size",
            """
            number of samples per channel of available space in pcm.

            If this is less than the maximum packet duration (120ms; 5760 for 48kHz), this function will not be capable of decoding some packets. In the case
            of PLC ({@code data==NULL}) or FEC ({@code decode_fec=1}), then {@code frame_size} needs to be exactly the duration of audio that is missing,
            otherwise the decoder will not be in the optimal state to decode the next incoming packet. For the PLC and FEC cases, {@code frame_size}
            <b>must</b> be a multiple of 2.5 ms.
            """
        ),
        int(
            "decode_fec",
            """
            flag (0 or 1) to request that any in-band forward error correction data be decoded. If no such data is available, the frame is decoded as if it
            were lost.
            """
        ),

        returnDoc = "number of decoded samples or a negative error code"
    )

    private..int(
        "decoder_ctl",
        "Performs a CTL function on an Opus decoder.",

        OpusDecoder.p("st", "decoder state")
    )

    void(
        "decoder_destroy",
        "Frees an {@code OpusDecoder} allocated by #decoder_create().",

        OpusDecoder.p("st", "decoder state")
    )

    int(
        "packet_parse",
        """
        Parses an opus packet into one or more frames.

        #decode() will perform this operation internally so most applications do not need to use this function.

        This function does not copy the frames, the returned pointers are pointers into the input packet.
        """,

        unsigned_char.const.p("data", "Opus packet to be parsed"),
        AutoSize("data")..opus_int32("len", "size of data"),
        Check(1)..nullable..unsigned_char.p("out_toc", "TOC pointer"),
        Check(48)..nullable..unsigned_char.const.p.p("frames", "encapsulated frames"),
        Check(48)..opus_int16.p("size", "sizes of the encapsulated frames"),
        Check(1)..nullable..int.p("payload_offset", "returns the position of the payload within the packet (in bytes)")
    )

    int(
        "packet_get_bandwidth",
        "Gets the bandwidth of an Opus packet.",

        Check(1)..unsigned_char.const.p("data", "Opus packet"),

        returnDoc = "the bandwidth of the packer on success, or #INVALID_PACKET if the compressed data passed is corrupted or of an unsupported type"
    )

    int(
        "packet_get_samples_per_frame",
        "Gets the number of samples per frame from an Opus packet.",

        Check(1)..unsigned_char.const.p("data", "Opus packet. This must contain at least one byte of data."),
        opus_int32("Fs", "sampling rate in Hz. This must be a multiple of 400, or inaccurate results will be returned."),

        returnDoc = "number of samples per frame"
    )

    int(
        "packet_get_nb_channels",
        "Gets the number of channels from an Opus packet.",

        Unsafe..unsigned_char.const.p("data", "Opus packet"),

        returnDoc = "number of channels, or #INVALID_PACKET if the compressed data passed is corrupted or of an unsupported type"
    )

    int(
        "packet_get_nb_frames",
        "Gets the number of frames in an Opus packet.",

        unsigned_char.const.p("packet", "Opus packet"),
        AutoSize("packet")..opus_int32("len", "length of packet"),

        returnDoc =
        """
        number of frames, #BAD_ARG if insufficient data was passed to the function, or #INVALID_PACKET if the compressed data passed is corrupted or of an
        unsupported type
        """
    )

    int(
        "packet_get_nb_samples",
        "Gets the number of samples of an Opus packet.",

        unsigned_char.const.p("packet", "Opus packet"),
        AutoSize("packet")..opus_int32("len", "length of packet"),
        opus_int32("Fs", "sampling rate in Hz. This must be a multiple of 400, or inaccurate results will be returned."),

        returnDoc =
        """
        number of samples, #BAD_ARG if insufficient data was passed to the function, or #INVALID_PACKET if the compressed data passed is corrupted or of an
        unsupported type
        """
    )

    int(
        "decoder_get_nb_samples",
        "Gets the number of samples of an Opus packet.",

        OpusDecoder.const.p("dec", "decoder state"),
        unsigned_char.const.p("packet", "Opus packet"),
        AutoSize("packet")..opus_int32("len", "length of packet"),

        returnDoc =
        """
        number of samples, #BAD_ARG if insufficient data was passed to the function, or #INVALID_PACKET if the compressed data passed is corrupted or of an
        unsupported type
        """
    )

    void(
        "pcm_soft_clip",
        """
        Applies soft-clipping to bring a float signal within the {@code [-1,1]} range. If the signal is already in that range, nothing is done. If there are
        values outside of {@code [-1,1]}, then the signal is clipped as smoothly as possible to both fit in the range and avoid creating excessive distortion
        in the process.
        """,

        Check("frame_size * softclip_mem.remaining()")..float.p("pcm", "input PCM and modified PCM"),
        int("frame_size", "number of samples per channel to process"),
        AutoSize("softclip_mem")..int("channels", "number of channels"),
        float.p("softclip_mem", "state memory for the soft clipping process (one float per channel, initialized to zero)")
    )

    int(
        "repacketizer_get_size",
        "Gets the size of an {@code OpusRepacketizer} structure.",

        returnDoc = "the size in bytes"
    )

    OpusRepacketizer.p(
        "repacketizer_init",
        """
        (Re)initializes a previously allocated repacketizer state.

        The state must be at least the size returned by #repacketizer_get_size(). This can be used for applications which use their own allocator instead of
        {@code malloc()}.

        It must also be called to reset the queue of packets waiting to be repacketized, which is necessary if the maximum packet duration of 120 ms is reached
        or if you wish to submit packets with a different Opus configuration (coding mode, audio bandwidth, frame size, or channel count). Failure to do so
        will prevent a new packet from being added with #repacketizer_cat().
        """,

        OpusRepacketizer.p("rp", "the repacketizer state to (re)initialize")
    )

    OpusRepacketizer.p(
        "repacketizer_create",
        "Allocates memory and initializes the new repacketizer with #repacketizer_init().",
        void()
    )

    void(
        "repacketizer_destroy",
        "Frees an {@code OpusRepacketizer} allocated by #repacketizer_create().",

        OpusRepacketizer.p("rp", "state to be freed")
    )

    int(
        "repacketizer_cat",
        """
        Adds a packet to the current repacketizer state.

        This packet must match the configuration of any packets already submitted for repacketization since the last call to #repacketizer_init(). This means
        that it must have the same coding mode, audio bandwidth, frame size, and channel count. This can be checked in advance by examining the top 6 bits of
        the first byte of the packet, and ensuring they match the top 6 bits of the first byte of any previously submitted packet. The total duration of audio
        in the repacketizer state also must not exceed 120 ms, the maximum duration of a single packet, after adding this packet.

        The contents of the current repacketizer state can be extracted into new packets using #repacketizer_out() or #repacketizer_out_range().

        In order to add a packet with a different configuration or to add more audio beyond 120 ms, you must clear the repacketizer state by calling
        #repacketizer_init(). If a packet is too large to add to the current repacketizer state, no part of it is added, even if it contains multiple frames,
        some of which might fit. If you wish to be able to add parts of such packets, you should first use another repacketizer to split the packet into pieces
        and add them individually.
        """,

        OpusRepacketizer.p("rp", "the repacketizer state to which to add the packet"),
        unsigned_char.const.p("data", ""),
        AutoSize("data")..opus_int32("len", "the number of bytes in the packet data"),

        returnDoc =
        """
        #OK on success, or #INVALID_PACKET if the packet did not have a valid TOC sequence, the packet's TOC sequence was not compatible with previously
        submitted packets (because the coding mode, audio bandwidth, frame size, or channel count did not match), or adding this packet would increase the
        total amount of audio stored in the repacketizer state to more than 120 ms.
        """
    )

    opus_int32(
        "repacketizer_out_range",
        "Constructs a new packet from data previously submitted to the repacketizer state via #repacketizer_cat().",

        OpusRepacketizer.p("rp", "the repacketizer state from which to construct the new packet"),
        int("begin", "the index of the first frame in the current repacketizer state to include in the output"),
        int("end", "one past the index of the last frame in the current repacketizer state to include in the output"),
        unsigned_char.const.p("data", "the buffer in which to store the output packet"),
        AutoSize("data")..opus_int32(
            "maxlen",
            """
            the maximum number of bytes to store in the output buffer. In order to guarantee success, this should be at least {@code 1276} for a single frame,
            or for multiple frames, {@code 1277*(end-begin)}. However, {@code 1*(end-begin)} plus the size of all packet data submitted to the repacketizer
            since the last call to #repacketizer_init() or #repacketizer_create() is also sufficient, and possibly much smaller.
            """
        ),

        returnDoc =
        """
        the total size of the output packet on success, #BAD_ARG if {@code [begin,end)} was an invalid range of frames ({@code begin < 0},
        {@code begin >= end}, or {@code end > opus_repacketizer_get_nb_frames()}), or #BUFFER_TOO_SMALL if {@code maxlen} was insufficient to contain the
        complete output packet.
        """
    )

    int(
        "repacketizer_get_nb_frames",
        """
        Returns the total number of frames contained in packet data submitted to the repacketizer state so far via #repacketizer_cat() since the last call to
        #repacketizer_init() or #repacketizer_create().

        This defines the valid range of packets that can be extracted with #repacketizer_out_range() or #repacketizer_out().
        """,

        OpusRepacketizer.p("rp", "the repacketizer state containing the frames"),

        returnDoc = "the total number of frames contained in the packet data submitted to the repacketizer state"
    )

    opus_int32(
        "repacketizer_out",
        """
        Constructs a new packet from data previously submitted to the repacketizer state via #repacketizer_cat().

        This is a convenience routine that returns all the data submitted so far in a single packet. It is equivalent to calling
        {@code opus_repacketizer_out_range(rp, 0, opus_repacketizer_get_nb_frames(rp), data, maxlen)}.
        """,

        OpusRepacketizer.p("rp", "the repacketizer state from which to construct the new packet"),
        unsigned_char.const.p("data", "the buffer in which to store the output packet"),
        AutoSize("data")..opus_int32(
            "maxlen",
            """
            the maximum number of bytes to store in the output buffer. In order to guarantee success, this should be at least
            {@code 1277*opus_repacketizer_get_nb_frames(rp)}. However, {@code 1*opus_repacketizer_get_nb_frames(rp)} plus the size of all packet data submitted
            to the repacketizer since the last call to #repacketizer_init() or #repacketizer_create() is also sufficient, and possibly much smaller.
            """
        ),

        returnDoc = "the total size of the output packet on success, or #BUFFER_TOO_SMALL if maxlen was insufficient to contain the complete output packet"
    )

    int(
        "packet_pad",
        "Pads a given Opus packet to a larger size (possibly changing the TOC sequence).",

        Check("Math.max(len, new_len)")..unsigned_char.const.p("data", "the buffer containing the packet to pad"),
        opus_int32("len", "the size of the packet. This must be at least 1."),
        opus_int32("new_len", "the desired size of the packet after padding. This must be at least as large as {@code len}."),

        returnDoc =
        """
        the new size of the output packet on success, #BAD_ARG if {@code len} was less than 1 or {@code new_len} was less than {@code len}, or #INVALID_PACKET
        if data did not contain a valid Opus packet
        """
    )

    opus_int32(
        "packet_unpad",
        "Removes all padding from a given Opus packet and rewrite the TOC sequence to minimize space usage.",

        Check("len")..unsigned_char.const.p("data", "the buffer containing the packet to strip"),
        opus_int32("len", "the size of the packet. This must be at least 1."),

        returnDoc =
        """
        the new size of the output packet on success, #BAD_ARG if {@code len} was less than 1, or #INVALID_PACKET if {@code data} did not contain a valid Opus
        packet
        """
    )

    int(
        "multistream_packet_pad",
        "Pads a given Opus multi-stream packet to a larger size (possibly changing the TOC sequence).",

        Check("Math.max(len, new_len)")..unsigned_char.const.p("data", "the buffer containing the packet to pad"),
        opus_int32("len", "the size of the packet. This must be at least 1."),
        opus_int32("new_len", "the desired size of the packet after padding. This must be at least 1."),
        int("nb_streams", "the number of streams (not channels) in the packet. This must be at least as large as {@code len}."),

        returnDoc =
        """
        the new size of the output packet on success, #BAD_ARG if {@code len} was less than 1 or {@code new_len} was less than {@code len}, or #INVALID_PACKET
        if {@code data} did not contain a valid Opus packet
        """
    )

    opus_int32(
        "multistream_packet_unpad",
        "Removes all padding from a given Opus multi-stream packet and rewrite the TOC sequence to minimize space usage.",

        Check("len")..unsigned_char.const.p("data", "the buffer containing the packet to strip"),
        opus_int32("len", "the size of the packet. This must be at least 1."),
        int("nb_streams", "the number of streams (not channels) in the packet. This must be at least 1."),

        returnDoc =
        """
        the new size of the output packet on success, #BAD_ARG if {@code len} was less than 1, or #INVALID_PACKET if {@code data} did not contain a valid Opus
        packet
        """
    )

    charASCII.p(
        "strerror",
        "Converts an opus error code into a human readable string.",

        int("error", "error number"),

        returnDoc = "error string"
    )

    charASCII.p(
        "get_version_string",
        """
        Gets the libopus version string.

        Applications may look for the substring "-fixed" in the version string to determine whether they have a fixed-point or floating-point build at runtime.
        """,
        void()
    )

    javaImport(
        "org.lwjgl.system.libffi.*",
        "static org.lwjgl.system.MemoryStack.*",
        "static org.lwjgl.system.libffi.LibFFI.*"
    )

    customMethod("""
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
    """)
}