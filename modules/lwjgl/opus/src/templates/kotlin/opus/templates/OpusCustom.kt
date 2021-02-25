/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val OpusCustom = "OpusCustom".nativeClass(Module.OPUS, prefix = "OPUS", prefixMethod = "opus_", binding = OPUS_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.util.opus.Opus.*")
    documentation =
        """
        Opus Custom is an optional part of the Opus specification and reference implementation which uses a distinct API from the regular API and supports
        frame sizes that are not normally supported. Use of Opus Custom is discouraged for all but very special applications for which a frame size different
        from 2.5, 5, 10, or 20 ms is needed (for either complexity or latency reasons) and where interoperability is less important.

        In addition to the interoperability limitations the use of Opus custom disables a substantial chunk of the codec and generally lowers the quality
        available at a given bitrate. Normally when an application needs a different frame size from the codec it should buffer to match the sizes but this
        adds a small amount of delay which may be important in some very low latency applications. Some transports (especially constant rate RF transports) may
        also work best with frames of particular durations.

        Libopus only supports custom modes if they are enabled at compile time.

        The Opus Custom API is similar to the regular API but the #custom_encoder_create() and #custom_decoder_create() calls take an additional mode parameter
        which is a structure produced by a call to #custom_mode_create(). Both the encoder and decoder must create a mode using the same sample rate (fs) and
        frame size (frame size) so these parameters must either be signaled out of band or fixed in a particular implementation.

        Similar to regular Opus the custom modes support on the fly frame size switching, but the sizes available depend on the particular frame size in use.
        For some initial frame sizes on a single on the fly size is available.
        """

    OpusCustomMode.p(
        "custom_mode_create",
        """
        Creates a new mode struct. This will be passed to an encoder or decoder. The mode MUST NOT BE DESTROYED until the encoders and decoders that use it are
        destroyed as well.
        """,

        opus_int32("Fs", "sampling rate (8000 to 96000 Hz)"),
        int(
            "frame_size",
            """
            number of samples (per channel) to encode in each packet (64 - 1024, prime factorization must contain zero or more 2s, 3s, or 5s and no other primes
            """
        ),
        Check(1)..nullable..int.p("error", "returned error code (if #NULL, no error will be returned)")
    )

    void(
        "custom_mode_destroy",
        "Destroys a mode struct. Only call this after all encoders and decoders using this mode are destroyed as well.",

        OpusCustomMode.p("mode", "mode to be freed")
    )

    int(
        "custom_encoder_get_size",
        "Gets the size of an {@code OpusCustomEncoder} structure.",

        OpusCustomMode.const.p("mode", "mode configuration"),
        int("channels", "number of channels"),

        returnDoc = "size"
    )

    int(
        "custom_encoder_init",
        """
        Initializes a previously allocated encoder state.

        The memory pointed to by {@code st} must be the size returned by #custom_encoder_get_size(). This is intended for applications which use their own
        allocator instead of {@code malloc}.

        To reset a previously initialized state use the #RESET_STATE CTL.
        """,

        OpusCustomEncoder.p("st", "encoder state"),
        OpusCustomMode.const.p(
            "mode",
            "contains all the information about the characteristics of the stream (must be the same characteristics as used for the decoder)"
        ),
        int("channels", "number of channels"),

        returnDoc = "#OK Success or a negative error code"
    )

    OpusCustomEncoder.p(
        "custom_encoder_create",
        """
        Creates a new encoder state.

        Each stream needs its own encoder state (can't be shared across simultaneous streams).
        """,

        OpusCustomMode.const.p(
            "mode",
            "contains all the information about the characteristics of the stream (must be the same characteristics as used for the decoder)"
        ),
        int("channels", "number of channels"),
        Check(1)..nullable..int.p("error", "returns an error code"),

        returnDoc = "newly created encoder state"
    )

    void(
        "custom_encoder_destroy",
        "Destroys an encoder state.",

        OpusCustomEncoder.p("st", "state to be freed")
    )

    int(
        "custom_encode_float",
        "Encodes a frame of audio.",

        OpusCustomEncoder.p("st", "encoder state"),
        Check(
            // Reading OpusCustomEncoder internal state here
            "frame_size * memGetInt(st + Pointer.POINTER_SIZE)"
        )..float.const.p(
            "pcm",
            """
            PCM audio in float format, with a normal range of {@code +/-1.0}. Samples with a range beyond {@code +/-1.0} are supported but will be clipped by
            decoders using the integer API and should only be used if it is known that the far end supports extended dynamic range. There must be exactly
            {@code frame_size} samples per channel.
            """
        ),
        int("frame_size", "number of samples per frame of input signal"),
        unsigned_char.p(
            "compressed",
            "the compressed data is written here. This may not alias {@code pcm} and must be at least {@code maxCompressedBytes} long."
        ),
        AutoSize("compressed")..int("maxCompressedBytes", "maximum number of bytes to use for compressing the frame (can change from one frame to another)"),

        returnDoc = "the number of bytes written to {@code compress} on success, or a negative error code"
    )

    int(
        "custom_encode",
        "Encodes a frame of audio.",

        OpusCustomEncoder.p("st", "encoder state"),
        Check(
            // Reading OpusCustomEncoder internal state here
            "frame_size * memGetInt(st + Pointer.POINTER_SIZE)"
        )..opus_int16.const.p("pcm", "PCM audio in signed 16-bit format (native endian). (There must be exactly {@code frame_size} samples per channel.)"),
        int("frame_size", "number of samples per frame of input signal"),
        unsigned_char.p(
            "compressed",
            "the compressed data is written here. This may not alias {@code pcm} and must be at least {@code maxCompressedBytes} long."
        ),
        AutoSize("compressed")..int("maxCompressedBytes", "maximum number of bytes to use for compressing the frame (can change from one frame to another)"),

        returnDoc = "the number of bytes written to {@code compress} on success, or a negative error code"
    )

    private..int(
        "custom_encoder_ctl",
        "Performs a CTL function on an Opus custom encoder.",

        OpusCustomEncoder.p("st", "encoder state")
    )

    int(
        "custom_decoder_get_size",
        "Gets the size of an {@code OpusCustomDecoder} structure.",

        OpusCustomMode.const.p("mode", "mode configuration"),
        int("channels", "number of channels"),

        returnDoc = "size"
    )

    int(
        "custom_decoder_init",
        """
        Initializes a previously allocated decoder state.

        The memory pointed to by {@code st} must be the size returned by #custom_decoder_get_size(). This is intended for applications which use their own
        allocator instead of {@code malloc}.

        To reset a previously initialized state use the #RESET_STATE CTL.
        """,

        OpusCustomDecoder.p("st", "decoder state"),
        OpusCustomMode.const.p(
            "mode",
            "contains all the information about the characteristics of the stream (must be the same characteristics as used for the encoder)"
        ),
        int("channels", "number of channels"),

        returnDoc = "#OK Success or a negative error code"
    )

    OpusCustomDecoder.p(
        "custom_decoder_create",
        """
        Creates a new decoder state.

        Each stream needs its own decoder state (can't be shared across simultaneous streams).
        """,

        OpusCustomMode.const.p(
            "mode",
            "contains all the information about the characteristics of the stream (must be the same characteristics as used for the encoder)"
        ),
        int("channels", "number of channels"),
        Check(1)..nullable..int.p("error", "returns an error code"),

        returnDoc = "newly created decoder state"
    )

    void(
        "custom_decoder_destroy",
        "Destroys a decoder state.",

        OpusCustomDecoder.p("st", "state to be freed")
    )

    int(
        "custom_decode_float",
        "Decode an opus custom frame with floating point output.",

        OpusCustomDecoder.p("st", "decoder state"),
        nullable..unsigned_char.const.p("data", "input payload. Use a #NULL pointer to indicate packet loss."),
        AutoSize("data")..int("len", "number of bytes in payload"),
        Check(
            // Reading OpusCustomDecoder internal state here
            "frame_size * memGetInt(st + (Pointer.POINTER_SIZE + 4))"
        )..float.p("pcm", "output signal (interleaved if 2 channels) (length is {@code frame_size*channels*sizeof(float)}"),
        int("frame_size", "number of samples per channel of available space in {@code pcm}"),

        returnDoc = "number of decoded samples, or a negative error code"
    )

    int(
        "custom_decode",
        "Decode an opus custom frame.",

        OpusCustomDecoder.p("st", "decoder state"),
        nullable..unsigned_char.const.p("data", "input payload. Use a #NULL pointer to indicate packet loss."),
        AutoSize("data")..int("len", "number of bytes in payload"),
        Check(
            // Reading OpusCustomDecoder internal state here
            "frame_size * memGetInt(st + (Pointer.POINTER_SIZE + 4))"
        )..opus_int16.p("pcm", "output signal (interleaved if 2 channels) (length is {@code frame_size*channels*sizeof(opus_int16)}"),
        int("frame_size", "number of samples per channel of available space in {@code pcm}"),

        returnDoc = "number of decoded samples, or a negative error code"
    )

    private..int(
        "custom_decoder_ctl",
        "Performs a CTL function on an Opus custom decoder.",

        OpusCustomDecoder.p("st", "decoder state")
    )

    customMethod("""
    /**
     * Performs a CTL function on an Opus custom encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_custom_encoder_ctl(@NativeType("OpusCustomEncoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.custom_encoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus custom encoder.
     *
     * @param st      encoder state
     * @param request CTL request
     */
    public static int opus_custom_encoder_ctl(@NativeType("OpusCustomEncoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.custom_encoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus custom decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_custom_decoder_ctl(@NativeType("OpusCustomDecoder *") long st, int request) {
        return new CTLRequestV(request).apply(st, Functions.custom_decoder_ctl);
    }

    /**
     * Performs a CTL function on an Opus custom decoder.
     *
     * @param st      decoder state
     * @param request CTL request
     */
    public static int opus_custom_decoder_ctl(@NativeType("OpusCustomDecoder *") long st, CTLRequest request) {
        return request.apply(st, Functions.custom_decoder_ctl);
    }
    """)
}