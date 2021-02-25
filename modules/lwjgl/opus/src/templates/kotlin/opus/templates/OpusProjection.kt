/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val OpusProjection = "OpusProjection".nativeClass(Module.OPUS, prefix = "OPUS", prefixMethod = "opus_", binding = OPUS_BINDING_DELEGATE) {
    EnumConstant(
        "Projection CTLs",

        "PROJECTION_GET_DEMIXING_MATRIX_GAIN_REQUEST".enum("", "6001"),
        "PROJECTION_GET_DEMIXING_MATRIX_SIZE_REQUEST".enum("", "6003"),
        "PROJECTION_GET_DEMIXING_MATRIX_REQUEST".enum("", "6005")
    ).javaDocLinks

    opus_int32(
        "projection_ambisonics_encoder_get_size",
        "Gets the size of an {@code OpusProjectionEncoder} structure.",

        int("channels", "the total number of input channels to encode. This must be no more than 255."),
        int("mapping_family", "the mapping family to use for selecting the appropriate projection"),

        returnDoc = "the size in bytes on success, or a negative error code"
    )

    OpusProjectionEncoder.p(
        "projection_ambisonics_encoder_create",
        """
        Allocates and initializes a projection encoder state.

        Call #projection_encoder_destroy() to release this object when finished.
        """,

        opus_int32("Fs", "sampling rate of the input signal (in Hz)", "8000 12000 16000 24000 48000"),
        int(
            "channels",
            """
            number of channels in the input signal. This must be at most 255. It may be greater than the number of coded channels ({@code streams +
            coupled_streams}).
            """
        ),
        int("mapping_family", "the mapping family to use for selecting the appropriate projection"),
        Check(1)..int.p("streams", "the total number of streams that will be encoded from the input"),
        Check(1)..int.p("coupled_streams", "number of coupled (2 channel) streams to encode that will be encoded from the input"),
        int("application", "the target encoder application"),
        Check(1)..nullable..int.p("error", "returns #OK on success, or a negative error code on failure")
    )

    int(
        "projection_ambisonics_encoder_init",
        """
        Initialize a previously allocated projection encoder state.

        The memory pointed to by {@code st} must be at least the size returned by #projection_ambisonics_encoder_get_size(). This is intended for applications
        which use their own allocator instead of {@code malloc}.

        To reset a previously initialized state, use the #RESET_STATE CTL.
        """,
        OpusProjectionEncoder.p("st", "projection encoder state to initialize"),
        opus_int32("Fs", "sampling rate of the input signal (in Hz)", "8000 12000 16000 24000 48000"),
        int(
            "channels",
            """
            number of channels in the input signal. This must be at most 255. It may be greater than the number of coded channels ({@code streams +
            coupled_streams}).
            """
        ),
        int("mapping_family", ""),
        Check(1)..int.p("streams", "the total number of streams that will be encoded from the input"),
        Check(1)..int.p(
            "coupled_streams",
            """
            number of coupled (2 channel) streams to encode that will be encoded from the input. Additionally, the total number of encoded channels
            ({@code streams + coupled_streams}) must be no more than the number of input channels."""
        ),
        int("application", "the target encoder application"),

        returnDoc = "#OK on success, or a negative error code on failure"
    )

    int(
        "projection_encode",
        "Encodes a projection Opus frame.",

        OpusProjectionEncoder.p("st", "projection encoder state"),
        Check(
            // Reading OpusProjectionEncoder internal state here
            "frame_size * memGetInt(st + 8 + memGetInt(st) + memGetInt(st + 4))"
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
        "projection_encode_float",
        "Encodes a projection Opus frame from floating point input.",

        OpusProjectionEncoder.p("st", "projection encoder state"),
        Check(
            // Reading OpusProjectionEncoder internal state here
            "frame_size * memGetInt(st + 8 + memGetInt(st) + memGetInt(st + 4))"
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

    private..int(
        "projection_encoder_ctl",
        "Performs a CTL function on an projection Opus encoder.",

        OpusProjectionEncoder.p("st", "projection encoder state")
    )

    int(
        "projection_encoder_destroy",
        "Frees an {@code OpusProjectionEncoder} allocated by #projection_ambisonics_encoder_create().",

        OpusProjectionEncoder.p("st", "projection encoder state to be freed")
    )

    opus_int32(
        "projection_decoder_get_size",
        "Gets the size of an {@code OpusProjectionDecoder} structure.",

        int("channels", "the total number of output channels. This must be no more than 255."),
        int("streams", "the total number of streams coded in the input"),
        int(
            "coupled_streams",
            """
            number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
            coded channels ({@code streams + coupled_streams}) must be no more than 255.
            """
        ),

        returnDoc = "the size in bytes on success, or a negative error code on failure"
    )

    OpusProjectionDecoder.p(
        "projection_decoder_create",
        """
        Allocates and initializes a projection decoder state.

        Call #projection_decoder_destroy() to release this object when finished.
        """,

        opus_int32("Fs", "sampling rate of input signal (Hz)", "8000 12000 16000 24000 48000"),
        int("channels", "number of channels to output"),
        int("streams", "the total number of streams coded in the input. This must be no more than 255."),
        int(
            "coupled_streams",
            """
            number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
            coded channels ({@code streams + coupled_streams}) must be no more than 255.
            """
        ),
        unsigned_char.p("demixing_matrix", "demixing matrix that maps from coded channels to output channels"),
        AutoSize("demixing_matrix")..opus_int32("demixing_matrix_size", "the size in bytes if the demixing matrix"),
        Check(1)..nullable..int.p("error", "returns #OK on success, or a negative error code on failure")
    )

    int(
        "projection_decoder_init",
        """
        Initialize a previously allocated projection decoder state object.

        The memory pointed to by {@code st} must be at least the size returned by #projection_decoder_get_size(). This is intended for applications which use
        their own allocator instead of {@code malloc}.

        To reset a previously initialized state, use the #RESET_STATE CTL.
        """,

        OpusProjectionDecoder.p("st", "projection decoder state to initialize"),
        opus_int32("Fs", "sampling rate of input signal (Hz)", "8000 12000 16000 24000 48000"),
        int(
            "channels",
            "number of channels to output. This mustbe at most 255. It may be different from the number of coded channels ({@code stream + coupled_streams})."
        ),
        int("streams", "the total number of streams coded in the input. This must be no more than 255."),
        int(
            "coupled_streams",
            """
            number streams to decode as coupled (2 channel) streams. This must be no larger than the total number of streams. Additionally, The total number of
            coded channels ({@code streams + coupled_streams}) must be no more than 255.
            """
        ),
        unsigned_char.p("demixing_matrix", "demixing matrix that maps from coded channels to output channels"),
        AutoSize("demixing_matrix")..opus_int32("demixing_matrix_size", "the size in bytes if the demixing matrix"),

        returnDoc = "#OK on success, or a negative error code on failure"
    )

    int(
        "projection_decode",
        "Decode a projection Opus packet.",

        OpusProjectionDecoder.p("st", "projection decoder state"),
        nullable..unsigned_char.const.p("data", "input payload (Use a #NULL pointer to indicate packet loss)"),
        AutoSize("data")..opus_int32("len", "number of bytes in payload"),
        Check(
            // Reading OpusProjectionDecoder internal state here
            "frame_size * memGetInt(st + 4 + memGetInt(st))"
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
        "projection_decode_float",
        "Decode a projection Opus packet with floating point output.",

        OpusMSDecoder.p("st", "projection decoder state"),
        nullable..unsigned_char.const.p("data", "input payload. Use a #NULL pointer to indicate packet loss"),
        AutoSize("data")..opus_int32("len", "number of bytes in payload"),
        Check(
            // Reading OpusProjectionDecoder internal state here
            "frame_size * memGetInt(st + 4 + memGetInt(st))"
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
        "projection_decoder_ctl",
        "Performs a CTL function on an projection Opus decoder.",

        OpusProjectionDecoder.p("st", "projection decoder state")
    )

    int(
        "projection_decoder_destroy",
        "Frees an {@code OpusProjectionDecoder} allocated by #projection_decoder_create().",

        OpusProjectionDecoder.p("st", "projection decoder state to be freed")
    )

    javaImport(
        "static org.lwjgl.util.opus.Opus.*"
    )

    customMethod("""
    /**
     * Performs a CTL function on an projection Opus encoder.
     *
     * @param st      projection encoder state
     * @param request CTL request
     */
    public static int opus_projection_encoder_ctl(@NativeType("OpusProjectionEncoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.projection_encoder_ctl);
    }

    /**
     * Performs a CTL function on an projection Opus encoder.
     *
     * @param st      projection encoder state
     * @param request CTL request
     */
    public static int opus_projection_encoder_ctl(@NativeType("OpusProjectionEncoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.projection_encoder_ctl);
    }

    /**
     * Performs a CTL function on a projection Opus decoder.
     *
     * @param st      projection decoder state
     * @param request CTL request
     */
    public static int opus_projection_decoder_ctl(@NativeType("OpusProjectionDecoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.projection_decoder_ctl);
    }

    /**
     * Performs a CTL function on a projection Opus decoder.
     *
     * @param st      projection decoder state
     * @param request CTL request
     */
    public static int opus_projection_decoder_ctl(@NativeType("OpusProjectionDecoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.projection_decoder_ctl);
    }

    /**
     * Gets the gain (in dB. S7.8-format) of the demixing matrix from the encoder.
     *
     * @return the gain (in dB. S7.8-format) of the demixing matrix.
     */
    public static CTLRequest OPUS_PROJECTION_GET_DEMIXING_MATRIX_GAIN(IntBuffer value) { return new CTLRequestP(OPUS_PROJECTION_GET_DEMIXING_MATRIX_GAIN_REQUEST, memAddress(value)); }

    /**
     * Gets the size in bytes of the demixing matrix from the encoder.
     *
     * @return the size in bytes of the demixing matrix.
     */
    public static CTLRequest OPUS_PROJECTION_GET_DEMIXING_MATRIX_SIZE(IntBuffer value) { return new CTLRequestP(OPUS_PROJECTION_GET_DEMIXING_MATRIX_SIZE_REQUEST, memAddress(value)); }

    /**
     * Copies the demixing matrix to the supplied pointer location.
     *
     * @param matrix returns the demixing matrix to the supplied pointer location.
     */
    public static CTLRequest OPUS_PROJECTION_GET_DEMIXING_MATRIX(ByteBuffer matrix) {  return new CTLRequestPI(OPUS_PROJECTION_GET_DEMIXING_MATRIX_REQUEST, memAddress(matrix), matrix.remaining()); }
    """)
}