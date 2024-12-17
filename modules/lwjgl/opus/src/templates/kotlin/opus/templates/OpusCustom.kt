/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val OpusCustom = "OpusCustom".nativeClass(Module.OPUS, prefix = "OPUS", prefixMethod = "opus_", binding = OPUS_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.util.opus.Opus.*")
    OpusCustomMode.p(
        "custom_mode_create",

        opus_int32("Fs"),
        int("frame_size"),
        Check(1)..nullable..int.p("error")
    )

    void(
        "custom_mode_destroy",

        OpusCustomMode.p("mode")
    )

    int(
        "custom_encoder_get_size",

        OpusCustomMode.const.p("mode"),
        int("channels")
    )

    int(
        "custom_encoder_init",

        OpusCustomEncoder.p("st"),
        OpusCustomMode.const.p("mode"),
        int("channels")
    )

    OpusCustomEncoder.p(
        "custom_encoder_create",

        OpusCustomMode.const.p("mode"),
        int("channels"),
        Check(1)..nullable..int.p("error")
    )

    void(
        "custom_encoder_destroy",

        OpusCustomEncoder.p("st")
    )

    int(
        "custom_encode_float",

        OpusCustomEncoder.p("st"),
        Check(
            // Reading OpusCustomEncoder internal state here
            "frame_size * memGetInt(st + Pointer.POINTER_SIZE)"
        )..float.const.p("pcm"),
        int("frame_size"),
        unsigned_char.p("compressed"),
        AutoSize("compressed")..int("maxCompressedBytes")
    )

    int(
        "custom_encode",

        OpusCustomEncoder.p("st"),
        Check(
            // Reading OpusCustomEncoder internal state here
            "frame_size * memGetInt(st + Pointer.POINTER_SIZE)"
        )..opus_int16.const.p("pcm"),
        int("frame_size"),
        unsigned_char.p("compressed"),
        AutoSize("compressed")..int("maxCompressedBytes")
    )

    private..int(
        "custom_encoder_ctl",

        OpusCustomEncoder.p("st")
    )

    int(
        "custom_decoder_get_size",

        OpusCustomMode.const.p("mode"),
        int("channels")
    )

    int(
        "custom_decoder_init",

        OpusCustomDecoder.p("st"),
        OpusCustomMode.const.p("mode"),
        int("channels")
    )

    OpusCustomDecoder.p(
        "custom_decoder_create",

        OpusCustomMode.const.p("mode"),
        int("channels"),
        Check(1)..nullable..int.p("error")
    )

    void(
        "custom_decoder_destroy",

        OpusCustomDecoder.p("st")
    )

    int(
        "custom_decode_float",

        OpusCustomDecoder.p("st"),
        nullable..unsigned_char.const.p("data"),
        AutoSize("data")..int("len"),
        Check(
            // Reading OpusCustomDecoder internal state here
            "frame_size * memGetInt(st + (Pointer.POINTER_SIZE + 4))"
        )..float.p("pcm"),
        int("frame_size")
    )

    int(
        "custom_decode",

        OpusCustomDecoder.p("st"),
        nullable..unsigned_char.const.p("data"),
        AutoSize("data")..int("len"),
        Check(
            // Reading OpusCustomDecoder internal state here
            "frame_size * memGetInt(st + (Pointer.POINTER_SIZE + 4))"
        )..opus_int16.p("pcm"),
        int("frame_size")
    )

    private..int(
        "custom_decoder_ctl",

        OpusCustomDecoder.p("st")
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