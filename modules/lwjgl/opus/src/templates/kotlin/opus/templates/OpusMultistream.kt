/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val OpusMultistream = "OpusMultistream".nativeClass(Module.OPUS, prefix = "OPUS", prefixMethod = "opus_", binding = OPUS_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.util.opus.Opus.*")
    documentation =
        """
        Opus Multistream API

        The multistream API allows individual Opus streams to be combined into a single packet, enabling support for up to 255 channels. Unlike an elementary
        Opus stream, the encoder and decoder must negotiate the channel configuration before the decoder can successfully interpret the data in the packets
        produced by the encoder. Some basic information, such as packet duration, can be computed without any special negotiation.

        The format for multistream Opus packets is defined in <a href="https://tools.ietf.org/html/rfc7845">RFC 7845</a> and is based on the self-delimited
        Opus framing described in Appendix B of <a href="https://tools.ietf.org/html/rfc6716">RFC 6716</a>. Normal Opus packets are just a degenerate case of
        multistream Opus packets, and can be encoded or decoded with the multistream API by setting {@code streams} to {@code 1} when initializing the encoder
        or decoder.

        Multistream Opus streams can contain up to 255 elementary Opus streams. These may be either "uncoupled" or "coupled", indicating that the decoder is
        configured to decode them to either 1 or 2 channels, respectively. The streams are ordered so that all coupled streams appear at the beginning.

        A {@code mapping} table defines which decoded channel {@code i} should be used for each input/output (I/O) channel {@code j}. This table
        is typically provided as an unsigned char array. Let {@code i = mapping[j]} be the index for I/O channel {@code j}. If {@code i < 2*coupled_streams},
        then I/O channel {@code j} is encoded as the left channel of stream {@code (i/2)} if {@code i} is even, or as the right channel of stream {@code (i/2)}
        if {@code i} is odd. Otherwise, I/O channel {@code j} is encoded as mono in stream {@code (i - coupled_streams)}, unless it has the special value 255,
        in which case it is omitted from the encoding entirely (the decoder will reproduce it as silence). Each value {@code i} must either be the special
        value 255 or be less than {@code streams + coupled_streams}.

        The output channels specified by the encoder should use the <a href="https://www.xiph.org/vorbis/doc/Vorbis_I_spec.html\#x1-810004.3.9">Vorbis channel
        ordering</a>. A decoder may wish to apply an additional permutation to the mapping the encoder used to achieve a different output channel order (e.g.
        for outputing in WAV order).

        Each multistream packet contains an Opus packet for each stream, and all of the Opus packets in a single multistream packet must have the same
        duration. Therefore the duration of a multistream packet can be extracted from the TOC sequence of the first stream, which is located at the beginning
        of the packet, just like an elementary Opus stream:
        ${codeBlock("""
int nb_samples, nb_frames;
nb_frames = opus_packet_get_nb_frames(data, len);
if (nb_frames < 1)
    return nb_frames;
nb_samples = opus_packet_get_samples_per_frame(data, 48000) * nb_frames;""")}

        The general encoding and decoding process proceeds exactly the same as in the normal encoder and decoder APIs. See their documentation for an overview
        of how to use the corresponding multistream functions.
        """

    EnumConstant(
        "Multistream CTLs",

        "MULTISTREAM_GET_ENCODER_STATE_REQUEST".enum("", "5120"),
        "MULTISTREAM_GET_DECODER_STATE_REQUEST".enum("", "5122")
    ).javaDocLinks

    opus_int32(
        "multistream_encoder_get_size",
        "Gets the size of an {@code OpusMSEncoder} structure.",

        int("streams", "the total number of streams to encode from the input. This must be no more than 255."),
        int(
            "coupled_streams",
            """
            number of coupled (2 channel) streams to encode. This must be no larger than the total number of streams. Additionally, The total number of encoded
            channels ({@code streams + coupled_streams}) must be no more than 255.
            """
        ),

        returnDoc = "the size in bytes on success, or a negative error code on error"
    )

    opus_int32(
        "multistream_surround_encoder_get_size",
        "",

        int("channels", ""),
        int("mapping_family", "")
    )

    OpusMSEncoder.p(
        "multistream_encoder_create",
        """
        Allocates and initializes a multistream encoder state.

        Call #multistream_encoder_destroy() to release this object when finished.
        """,

        opus_int32("Fs", "sampling rate of the input signal (in Hz)", "8000 12000 16000 24000 48000"),
        AutoSize("mapping")..int(
            "channels",
            """
            number of channels in the input signal. This must be at most 255. It may be greater than the number of coded channels ({@code streams +
            coupled_streams}).
            """
        ),
        int("streams", "the total number of streams to encode from the input. This must be no more than the number of channels."),
        int(
            "coupled_streams",
            """
            number of coupled (2 channel) streams to encode. This must be no larger than the total number of streams. Additionally, The total number of encoded
            channels ({@code streams + coupled_streams}) must be no more than the number of input channels.
            """
        ),
        unsigned_char.const.p(
            "mapping",
            """
            Mapping from encoded channels to input channels. As an extra constraint, the multistream encoder does not allow encoding coupled streams for which
            one channel is unused since this is never a good idea.
            """
        ),
        int("application", "the target encoder application"),
        Check(1)..nullable..int.p("error", "returns #OK on success, or a negative error code on failure")
    )

    OpusMSEncoder.p(
        "multistream_surround_encoder_create",
        "",

        opus_int32("Fs", ""),
        AutoSize("mapping")..int("channels", ""),
        int("mapping_family", ""),
        Check(1)..int.p("streams", ""),
        Check(1)..int.p("coupled_streams", ""),
        unsigned_char.p("mapping", ""),
        int("application", ""),
        Check(1)..nullable..int.p("error", "")
    )

    int(
        "multistream_encoder_init",
        """
        Initialize a previously allocated multistream encoder state.

        The memory pointed to by {@code st} must be at least the size returned by #multistream_encoder_get_size(). This is intended for applications which use
        their own allocator instead of {@code malloc}.

        To reset a previously initialized state, use the #RESET_STATE CTL.
        """,

        OpusMSEncoder.p("st", "multistream encoder state to initialize"),
        opus_int32("Fs", "sampling rate of input signal (Hz)", "8000 12000 16000 24000 48000"),
        AutoSize("mapping")..int(
            "channels",
            """
            number of channels in the input signal. This must be at most 255. It may be greater than the number of coded channels ({@code streams +
            coupled_streams}).
            """
        ),
        int("streams", "the total number of streams to encode from the input. This must be no more than the number of channels."),
        int(
            "coupled_streams",
            """
            number of coupled (2 channel) streams to encode. This must be no larger than the total number of streams. Additionally, The total number of encoded
            channels ({@code streams + coupled_streams}) must be no more than the number of input channels.
            """
        ),
        unsigned_char.const.p(
            "mapping",
            """
            mapping from encoded channels to input channels. As an extra constraint, the multistream encoder does not allow encoding coupled streams for which
            one channel is unused since this is never a good idea.
            """
        ),
        int("application", "the target encoder application"),

        returnDoc = "#OK on success, or a negative error code on failure"
    )

    int(
        "multistream_surround_encoder_init",
        "",

        OpusMSEncoder.p("st", ""),
        opus_int32("Fs", ""),
        AutoSize("mapping")..int("channels", ""),
        Check(1)..int.p("streams", ""),
        Check(1)..int.p("coupled_streams", ""),
        unsigned_char.const.p("mapping", ""),
        int("application", "")
    )

    int(
        "multistream_encode",
        "Encodes a multistream Opus frame.",

        OpusMSEncoder.p("st", "multistream encoder state"),
        Check(
            // Reading OpusMSEncoder internal state here
            "frame_size * memGetInt(st)"
        )..opus_int16.const.p("pcm", "the input signal as interleaved samples. This must contain {@code frame_size*channels} samples."),
        int("frame_size",
            """
            number of samples per channel in the input signal. This must be an Opus frame size for the encoder's sampling rate. For example, at 48 kHz the
            permitted values are 120, 240, 480, 960, 1920, and 2880. Passing in a duration of less than 10 ms (480 samples at 48 kHz) will prevent the encoder
            from using the LPC or hybrid modes.
            """
        ),
        unsigned_char.p("data", "output payload. This must contain storage for at {@code max_data_bytes}."),
        AutoSize("data")..opus_int32(
            "max_data_bytes",
            """
            size of the allocated memory for the output payload. This may be used to impose an upper limit on the instant bitrate, but should not be used as
            the only bitrate control. Use #SET_BITRATE_REQUEST to control the bitrate.
            """
        ),

        returnDoc = "the length of the encoded packet (in bytes) on success or a negative error code on failure"
    )

    int(
        "multistream_encode_float",
        "Encodes a multistream Opus frame from floating point input.",

        OpusMSEncoder.p("st", "multistream encoder state"),
        Check(
            // Reading OpusMSEncoder internal state here
            "frame_size * memGetInt(st)"
        )..float.const.p(
            "pcm",
            """
            the input signal as interleaved samples with a normal range of {@code +/-1.0}. Samples with a range beyond {@code +/-1.0} are supported but will be
            clipped by decoders using the integer API and should only be used if it is known that the far end supports extended dynamic range. This must
            contain {@code frame_size*channels} samples.
            """
        ),
        int("frame_size",
            """
            number of samples per channel in the input signal. This must be an Opus frame size for the encoder's sampling rate. For example, at 48 kHz the
            permitted values are 120, 240, 480, 960, 1920, and 2880. Passing in a duration of less than 10 ms (480 samples at 48 kHz) will prevent the encoder
            from using the LPC or hybrid modes.
            """
        ),
        unsigned_char.p("data", "output payload. This must contain storage for at {@code max_data_bytes}."),
        AutoSize("data")..opus_int32(
            "max_data_bytes",
            """
            size of the allocated memory for the output payload. This may be used to impose an upper limit on the instant bitrate, but should not be used as
            the only bitrate control. Use #SET_BITRATE_REQUEST to control the bitrate.
            """
        ),

        returnDoc = "the length of the encoded packet (in bytes) on success or a negative error code on failure"
    )

    void(
        "multistream_encoder_destroy",
        "Frees an {@code OpusMSEncoder} allocated by #multistream_encoder_create().",

        OpusMSEncoder.p("st", "multistream encoder state to be freed")
    )

    private..int(
        "multistream_encoder_ctl",
        "Performs a CTL function on an multistream Opus encoder.",

        OpusMSEncoder.p("st", "encoder state")
    )

    opus_int32(
        "multistream_decoder_get_size",
        "Gets the size of an {@code OpusMSDecoder} structure.",

        int("streams", "the total number of streams coded in the input. This must be no more than 255."),
        int(
            "coupled_streams",
            """
            number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
            coded channels ({@code streams + coupled_streams}) must be no more than 255.
            """
        ),

        returnDoc = "the size in bytes on success, or a negative error code on failure"
    )

    OpusMSDecoder.p(
        "multistream_decoder_create",
        """
        Allocates and initializes a multistream decoder state.

        Call #multistream_decoder_destroy() to release this object when finished.
        """,

        opus_int32("Fs", "sampling rate of input signal (Hz)", "8000 12000 16000 24000 48000"),
        AutoSize("mapping")..int("channels", "number of channels to decode", "1 2"),
        int("streams", "the total number of streams coded in the input. This must be no more than 255."),
        int(
            "coupled_streams",
            """
            number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
            coded channels ({@code streams + coupled_streams}) must be no more than 255.
            """
        ),
        unsigned_char.const.p("mapping", "mapping from coded channels to output channels"),
        Check(1)..nullable..int.p("error", "returns #OK on success, or a negative error code on failure")
    )

    int(
        "multistream_decoder_init",
        """
        Intialize a previously allocated decoder state object.

        The memory pointed to by {@code st} must be at least the size returned by #multistream_encoder_get_size(). This is intended for applications which use
        their own allocator instead of {@code malloc}.

        To reset a previously initialized state, use the #RESET_STATE CTL.
        """,

        OpusMSDecoder.p("st", "multistream decoder state to initialize"),
        opus_int32("Fs", "sampling rate of input signal (Hz)", "8000 12000 16000 24000 48000"),
        AutoSize("mapping")..int("channels", "number of channels to decode", "1 2"),
        int("streams", "the total number of streams coded in the input. This must be no more than 255."),
        int(
            "coupled_streams",
            """
            number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
            coded channels ({@code streams + coupled_streams}) must be no more than 255.
            """
        ),
        unsigned_char.const.p("mapping", "mapping from coded channels to output channels"),

        returnDoc = "#OK on success, or a negative error code on failure"
    )

    int(
        "multistream_decode",
        "Decode a multistream Opus packet.",

        OpusMSDecoder.p("st", "multistream decoder"),
        nullable..unsigned_char.const.p("data", "input payload (Use a #NULL pointer to indicate packet loss)"),
        AutoSize("data")..opus_int32("len", "number of bytes in payload"),
        Check(
            // Reading OpusMSDecoder internal state here
            "frame_size * memGetInt(st)"
        )..opus_int16.p("pcm", "output signal, with interleaved samples. This must contain room for {@code frame_size*channels} samples."),
        int(
            "frame_size",
            """
            number of samples per channel of available space in {@code pcm}.

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

        returnDoc = "number of decoded samples on success or a negative error code on failure"
    )

    int(
        "multistream_decode_float",
        "Decode a multistream Opus packet with floating point output.",

        OpusMSDecoder.p("st", "multistream decoder"),
        nullable..unsigned_char.const.p("data", "input payload. Use a #NULL pointer to indicate packet loss"),
        AutoSize("data")..opus_int32("len", "number of bytes in payload"),
        Check(
            // Reading OpusMSDecoder internal state here
            "frame_size * memGetInt(st)"
        )..float.p("pcm", "output signal, with interleaved samples. (This must contain room for {@code frame_size*channels} samples.)"),
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

        returnDoc = "number of decoded samples on success or a negative error code on failure"
    )

    private..int(
        "multistream_decoder_ctl",
        "Performs a CTL function on a multistream Opus decoder.",

        OpusMSDecoder.p("st", "decoder state")
    )

    void(
        "multistream_decoder_destroy",
        "Frees an {@code OpusMSDecoder} allocated by #multistream_decoder_create().",

        OpusMSDecoder.p("st", "multistream decoder state to be freed")
    )

    customMethod("""
    /**
     * Performs a CTL function on an multistream Opus encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_multistream_encoder_ctl(@NativeType("OpusMSEncoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.multistream_encoder_ctl);
    }

    /**
     * Performs a CTL function on an multistream Opus encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_multistream_encoder_ctl(@NativeType("OpusMSEncoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.multistream_encoder_ctl);
    }

    /**
     * Performs a CTL function on a multistream Opus decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_multistream_decoder_ctl(@NativeType("OpusMSDecoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.multistream_decoder_ctl);
    }

    /**
     * Performs a CTL function on a multistream Opus decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_multistream_decoder_ctl(@NativeType("OpusMSDecoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.multistream_decoder_ctl);
    }
    """)
}