/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val OpusEnc = "OpusEnc".nativeClass(Module.OPUS, prefix = "OPE", prefixMethod = "ope_", binding = OPUS_BINDING_DELEGATE) {
    javaImport("static org.lwjgl.util.opus.Opus.*")

    IntConstant(
        "API_VERSION".."0"
    )
    
    IntConstant(
        "OK".."0",
        "BAD_ARG".."-11",
        "INTERNAL_ERROR".."-13",
        "UNIMPLEMENTED".."-15",
        "ALLOC_FAIL".."-17",
        "CANNOT_OPEN".."-30",
        "TOO_LATE".."-31",
        "INVALID_PICTURE".."-32",
        "INVALID_ICON".."-33",
        "WRITE_FAIL".."-34",
        "CLOSE_FAIL".."-35"
    )

    EnumConstant(
        "SET_DECISION_DELAY_REQUEST".enum("14000"),
        "GET_DECISION_DELAY_REQUEST".enum,
        "SET_MUXING_DELAY_REQUEST".enum,
        "GET_MUXING_DELAY_REQUEST".enum,
        "SET_COMMENT_PADDING_REQUEST".enum,
        "GET_COMMENT_PADDING_REQUEST".enum,
        "SET_SERIALNO_REQUEST".enum,
        "GET_SERIALNO_REQUEST".enum,
        "SET_PACKET_CALLBACK_REQUEST".enum,
        "SET_HEADER_GAIN_REQUEST".enum("14010"),
        "GET_HEADER_GAIN_REQUEST".enum,
        "GET_NB_STREAMS_REQUEST".enum("14013"),
        "GET_NB_COUPLED_STREAMS_REQUEST".enum("14015")
    )

    OggOpusComments.p(
        "comments_create",

        void()
    )

    OggOpusComments.p(
        "comments_copy",

        OggOpusComments.p("comments")
    )

    void(
        "comments_destroy",

        OggOpusComments.p("comments")
    )

    int(
        "comments_add",

        OggOpusComments.p("comments"),
        charUTF8.const.p("tag"),
        charUTF8.const.p("val")
    )

    int(
        "comments_add_string",

        OggOpusComments.p("comments"),
        charUTF8.const.p("tag_and_val")
    )

    int(
        "comments_add_picture",

        OggOpusComments.p("comments"),
        charUTF8.const.p("filename"),
        int("picture_type"),
        nullable..charUTF8.const.p("description")
    )

    int(
        "comments_add_picture_from_memory",

        OggOpusComments.p("comments"),
        char.const.p("ptr"),
        AutoSize("ptr")..size_t("size"),
        int("picture_type"),
        nullable..charUTF8.const.p("description")
    )

    OggOpusEnc.p(
        "encoder_create_file",

        charUTF8.const.p("path"),
        OggOpusComments.p("comments"),
        opus_int32("rate"),
        int("channels"),
        int("family"),
        Check(1)..nullable..int.p("error")
    )

    OggOpusEnc.p(
        "encoder_create_callbacks",

        OpusEncCallbacks.const.p("callbacks"),
        opaque_p("user_data"),
        OggOpusComments.p("comments"),
        opus_int32("rate"),
        int("channels"),
        int("family"),
        Check(1)..nullable..int.p("error")
    )

    OggOpusEnc.p(
        "encoder_create_pull",

        OggOpusComments.p("comments"),
        opus_int32("rate"),
        int("channels"),
        int("family"),
        Check(1)..nullable..int.p("error")
    )

    int(
        "encoder_deferred_init_with_mapping",

        OggOpusEnc.p("enc"),
        int("family"),
        int("streams"),
        int("coupled_streams"),
        Unsafe..unsigned_char.const.p("mapping")
    )

    int(
        "encoder_write_float",

        OggOpusEnc.p("enc"),
        Unsafe..float.const.p("pcm"),
        int("samples_per_channel")
    )

    int(
        "encoder_write",

        OggOpusEnc.p("enc"),
        Unsafe..opus_int16.const.p("pcm"),
        int("samples_per_channel")
    )

    intb(
        "encoder_get_page",

        OggOpusEnc.p("enc"),
        Check(1)..unsigned_char.p.p("page"),
        Check(1)..opus_int32.p("len"),
        intb("flush")
    )

    int(
        "encoder_drain",

        OggOpusEnc.p("enc")
    )

    void(
        "encoder_destroy",

        OggOpusEnc.p("enc")
    )

    int(
        "encoder_chain_current",

        OggOpusEnc.p("enc"),
        OggOpusComments.p("comments")
    )

    int(
        "encoder_continue_new_file",

        OggOpusEnc.p("enc"),
        charUTF8.const.p("path"),
        OggOpusComments.p("comments")
    )

    int(
        "encoder_continue_new_callbacks",

        OggOpusEnc.p("enc"),
        opaque_p("user_data"),
        OggOpusComments.p("comments")
    )

    int(
        "encoder_flush_header",

        OggOpusEnc.p("enc")
    )

    private..int(
        "encoder_ctl",

        OggOpusEnc.p("enc")
    )

    charUTF8.const.p(
        "strerror",

        int("error")
    )

    charUTF8.const.p(
        "get_version_string",

        void()
    )

    int(
        "get_abi_version",

        void()
    )

    customMethod("""
    /**
     * Sets encoder options.
     *
     * @param enc     encoder
     * @param request use a request macro
     *
     * @return error code
     */
    public static int ope_encoder_ctl(@NativeType("OggOpusEnc *") long enc, int request) {
        return new CTLRequestV(request).apply(enc, Functions.encoder_ctl);
    }

    /**
     * Sets encoder options.
     *
     * @param enc     encoder
     * @param request use a request macro
     *
     * @return error code
     */
    public static int ope_encoder_ctl(@NativeType("OggOpusEnc *") long enc, CTLRequest request) {
        return request.apply(enc, Functions.encoder_ctl);
    }

    public static CTLRequest OPE_SET_DECISION_DELAY_REQUEST(int value) { return new CTLRequestI(OPE_SET_DECISION_DELAY_REQUEST, value); }
    public static CTLRequest OPE_GET_DECISION_DELAY_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_DECISION_DELAY_REQUEST, memAddress(__result)); }
    
    public static CTLRequest OPE_SET_MUXING_DELAY_REQUEST(int value) { return new CTLRequestI(OPE_SET_MUXING_DELAY_REQUEST, value); }
    public static CTLRequest OPE_GET_MUXING_DELAY_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_MUXING_DELAY_REQUEST, memAddress(__result)); }
    
    public static CTLRequest OPE_SET_COMMENT_PADDING_REQUEST(int value) { return new CTLRequestI(OPE_SET_COMMENT_PADDING_REQUEST, value); }
    public static CTLRequest OPE_GET_COMMENT_PADDING_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_COMMENT_PADDING_REQUEST, memAddress(__result)); }
    
    public static CTLRequest OPE_SET_SERIALNO_REQUEST(int value) { return new CTLRequestI(OPE_SET_SERIALNO_REQUEST, value); }
    public static CTLRequest OPE_GET_SERIALNO_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_SERIALNO_REQUEST, memAddress(__result)); }
    
    public static CTLRequest OPE_SET_PACKET_CALLBACK_REQUEST(OPEPacketFuncI value) { return new CTLRequestP(OPE_SET_PACKET_CALLBACK_REQUEST, value.address()); }
    
    public static CTLRequest OPE_SET_HEADER_GAIN_REQUEST(int value) { return new CTLRequestI(OPE_SET_HEADER_GAIN_REQUEST, value); }
    public static CTLRequest OPE_GET_HEADER_GAIN_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_HEADER_GAIN_REQUEST, memAddress(__result)); }
    
    public static CTLRequest OPE_GET_NB_STREAMS_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_NB_STREAMS_REQUEST, memAddress(__result)); }
    public static CTLRequest OPE_GET_NB_COUPLED_STREAMS_REQUEST(IntBuffer __result) { return new CTLRequestP(OPE_GET_NB_COUPLED_STREAMS_REQUEST, memAddress(__result)); }
    """)
}
