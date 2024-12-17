/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val OpusProjection = "OpusProjection".nativeClass(Module.OPUS, prefix = "OPUS", prefixMethod = "opus_", binding = OPUS_BINDING_DELEGATE) {
    EnumConstant(
        "PROJECTION_GET_DEMIXING_MATRIX_GAIN_REQUEST".enum("6001"),
        "PROJECTION_GET_DEMIXING_MATRIX_SIZE_REQUEST".enum("6003"),
        "PROJECTION_GET_DEMIXING_MATRIX_REQUEST".enum("6005")
    )

    opus_int32(
        "projection_ambisonics_encoder_get_size",

        int("channels"),
        int("mapping_family")
    )

    OpusProjectionEncoder.p(
        "projection_ambisonics_encoder_create",

        opus_int32("Fs"),
        int("channels"),
        int("mapping_family"),
        Check(1)..int.p("streams"),
        Check(1)..int.p("coupled_streams"),
        int("application"),
        Check(1)..nullable..int.p("error")
    )

    int(
        "projection_ambisonics_encoder_init",
        OpusProjectionEncoder.p("st"),
        opus_int32("Fs"),
        int("channels"),
        int("mapping_family"),
        Check(1)..int.p("streams"),
        Check(1)..int.p("coupled_streams"),
        int("application")
    )

    int(
        "projection_encode",

        OpusProjectionEncoder.p("st"),
        Check(
            // Reading OpusProjectionEncoder internal state here
            "frame_size * memGetInt(st + 8 + memGetInt(st) + memGetInt(st + 4))"
        )..opus_int16.const.p("pcm"),
        int("frame_size"),
        unsigned_char.p("data"),
        AutoSize("data")..opus_int32("max_data_bytes")
    )

    int(
        "projection_encode_float",

        OpusProjectionEncoder.p("st"),
        Check(
            // Reading OpusProjectionEncoder internal state here
            "frame_size * memGetInt(st + 8 + memGetInt(st) + memGetInt(st + 4))"
        )..float.const.p("pcm"),
        int("frame_size"),
        unsigned_char.p("data"),
        AutoSize("data")..opus_int32("max_data_bytes")
    )

    private..int(
        "projection_encoder_ctl",

        OpusProjectionEncoder.p("st")
    )

    int(
        "projection_encoder_destroy",

        OpusProjectionEncoder.p("st")
    )

    opus_int32(
        "projection_decoder_get_size",

        int("channels"),
        int("streams"),
        int("coupled_streams")
    )

    OpusProjectionDecoder.p(
        "projection_decoder_create",

        opus_int32("Fs"),
        int("channels"),
        int("streams"),
        int("coupled_streams"),
        unsigned_char.p("demixing_matrix"),
        AutoSize("demixing_matrix")..opus_int32("demixing_matrix_size"),
        Check(1)..nullable..int.p("error")
    )

    int(
        "projection_decoder_init",

        OpusProjectionDecoder.p("st"),
        opus_int32("Fs"),
        int("channels"),
        int("streams"),
        int("coupled_streams"),
        unsigned_char.p("demixing_matrix"),
        AutoSize("demixing_matrix")..opus_int32("demixing_matrix_size")
    )

    int(
        "projection_decode",

        OpusProjectionDecoder.p("st"),
        nullable..unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("len"),
        Check(
            // Reading OpusProjectionDecoder internal state here
            "frame_size * memGetInt(st + 4 + memGetInt(st))"
        )..opus_int16.p("pcm"),
        int("frame_size"),
        int("decode_fec")
    )

    int(
        "projection_decode_float",

        OpusMSDecoder.p("st"),
        nullable..unsigned_char.const.p("data"),
        AutoSize("data")..opus_int32("len"),
        Check(
            // Reading OpusProjectionDecoder internal state here
            "frame_size * memGetInt(st + 4 + memGetInt(st))"
        )..float.p("pcm"),
        int("frame_size"),
        int("decode_fec")
    )

    private..int(
        "projection_decoder_ctl",

        OpusProjectionDecoder.p("st")
    )

    int(
        "projection_decoder_destroy",

        OpusProjectionDecoder.p("st")
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