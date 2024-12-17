/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val OpusMultistream = "OpusMultistream".nativeClass(Module.OPUS, prefix = "OPUS", prefixMethod = "opus_", binding = OPUS_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.util.opus.Opus.*")

    EnumConstant(
        "MULTISTREAM_GET_ENCODER_STATE_REQUEST".enum("5120"),
        "MULTISTREAM_GET_DECODER_STATE_REQUEST".enum("5122")
    )

    opus_int32(
        "multistream_encoder_get_size",

        int("streams"),
        int("coupled_streams")
    )

    opus_int32(
        "multistream_surround_encoder_get_size",

        int("channels"),
        int("mapping_family")
    )

    OpusMSEncoder.p(
        "multistream_encoder_create",

        opus_int32("Fs"),
        AutoSize("mapping")..int("channels"),
        int("streams"),
        int("coupled_streams"),
        unsigned_char.const.p("mapping"),
        int("application"),
        Check(1)..nullable..int.p("error")
    )

    OpusMSEncoder.p(
        "multistream_surround_encoder_create",

        opus_int32("Fs"),
        AutoSize("mapping")..int("channels"),
        int("mapping_family"),
        Check(1)..int.p("streams"),
        Check(1)..int.p("coupled_streams"),
        unsigned_char.p("mapping"),
        int("application"),
        Check(1)..nullable..int.p("error")
    )

    int(
        "multistream_encoder_init",

        OpusMSEncoder.p("st"),
        opus_int32("Fs"),
        AutoSize("mapping")..int("channels"),
        int("streams"),
        int("coupled_streams"),
        unsigned_char.const.p("mapping"),
        int("application")
    )

    int(
        "multistream_surround_encoder_init",

        OpusMSEncoder.p("st"),
        opus_int32("Fs"),
        AutoSize("mapping")..int("channels"),
        Check(1)..int.p("streams"),
        Check(1)..int.p("coupled_streams"),
        unsigned_char.const.p("mapping"),
        int("application")
    )

    int(
        "multistream_encode",

        OpusMSEncoder.p("st"),
        Check(
            // Reading OpusMSEncoder internal state here
            "frame_size * memGetInt(st)"
        )..opus_int16.const.p("pcm"),
        int("frame_size"),
        unsigned_char.p("data"),
        AutoSize("data")..opus_int32("max_data_bytes")
    )

    int(
        "multistream_encode_float",

        OpusMSEncoder.p("st"),
        Check(
            // Reading OpusMSEncoder internal state here
            "frame_size * memGetInt(st)"
        )..float.const.p("pcm"),
        int("frame_size"),
        unsigned_char.p("data"),
        AutoSize("data")..opus_int32("max_data_bytes")
    )

    void(
        "multistream_encoder_destroy",

        OpusMSEncoder.p("st")
    )

    private..int(
        "multistream_encoder_ctl",

        OpusMSEncoder.p("st")
    )

    opus_int32(
        "multistream_decoder_get_size",

        int("streams"),
        int("coupled_streams")
    )

    OpusMSDecoder.p(
        "multistream_decoder_create",

        opus_int32("Fs"),
        AutoSize("mapping")..int("channels"),
        int("streams"),
        int("coupled_streams"),
        unsigned_char.const.p("mapping"),
        Check(1)..nullable..int.p("error")
    )

    int(
        "multistream_decoder_init",

        OpusMSDecoder.p("st"),
        opus_int32("Fs"),
        AutoSize("mapping")..int("channels"),
        int("streams"),
        int("coupled_streams"),
        unsigned_char.const.p("mapping")
    )

    int(
        "multistream_decode",

        OpusMSDecoder.p("st"),
        nullable..unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("len"),
        Check(
            // Reading OpusMSDecoder internal state here
            "frame_size * memGetInt(st)"
        )..opus_int16.p("pcm"),
        int("frame_size"),
        int("decode_fec")
    )

    int(
        "multistream_decode_float",

        OpusMSDecoder.p("st"),
        nullable..unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("len"),
        Check(
            // Reading OpusMSDecoder internal state here
            "frame_size * memGetInt(st)"
        )..float.p("pcm"),
        int("frame_size"),
        int("decode_fec")
    )

    private..int(
        "multistream_decoder_ctl",

        OpusMSDecoder.p("st")
    )

    void(
        "multistream_decoder_destroy",

        OpusMSDecoder.p("st")
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