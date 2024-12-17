/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val OpusFile = "OpusFile".nativeClass(Module.OPUS, prefix = "OP", prefixMethod = "opus_", binding = OPUS_BINDING_DELEGATE) {
    EnumConstant(
        "FALSE".enum("-1"),
        "EOF".enum("-2"),
        "HOLE".enum("-3"),
        "EREAD".enum("-128"),
        "EFAULT".enum("-129"),
        "EIMPL".enum("-130"),
        "EINVAL".enum("-131"),
        "ENOTFORMAT".enum("-132"),
        "EBADHEADER".enum("-133"),
        "EVERSION".enum("-134"),
        "ENOTAUDIO".enum("-135"),
        "EBADPACKET".enum("-136"),
        "EBADLINK".enum("-137"),
        "ENOSEEK".enum("-138"),
        "EBADTIMESTAMP".enum("-139")
    )

    IntConstant("OPUS_CHANNEL_COUNT_MAX".."255").noPrefix()

    EnumConstant(
        "PIC_FORMAT_UNKNOWN".enum("-1"),
        "PIC_FORMAT_URL".enum("0"),
        "PIC_FORMAT_JPEG".enum("1"),
        "PIC_FORMAT_PNG".enum("2"),
        "PIC_FORMAT_GIF".enum("3")
    )

    IntConstant(
        "SSL_SKIP_CERTIFICATE_CHECK_REQUEST".."6464",
        "HTTP_PROXY_HOST_REQUEST".."6528",
        "HTTP_PROXY_PORT_REQUEST".."6592",
        "HTTP_PROXY_USER_REQUEST".."6656",
        "HTTP_PROXY_PASS_REQUEST".."6720",
        "GET_SERVER_INFO_REQUEST".."6784"
    )

    IntConstant(
        "DEC_FORMAT_SHORT".."7008"
    )

    IntConstant(
        "DEC_FORMAT_FLOAT".."7040"
    )

    IntConstant(
        "DEC_USE_DEFAULT".."6720"
    )

    IntConstant(
        "HEADER_GAIN".."0"
    )
    IntConstant(
        "ALBUM_GAIN".."3007"
    )
    IntConstant(
        "TRACK_GAIN".."3008"
    )
    IntConstant(
        "ABSOLUTE_GAIN".."3009"
    )

    int(
        "head_parse",

        OpusHead.p("_head"),
        unsigned_char.const.p("_data"),
        AutoSize("_data")..size_t("_len")
    )

    ogg_int64_t(
        "granule_sample",

        OpusHead.const.p("_head"),
        ogg_int64_t("_gp")
    )

    int(
        "tags_parse",

        nullable..OpusTags.p("_tags"),
        unsigned_char.const.p("_data"),
        AutoSize("_data")..size_t("_len")
    )

    int(
        "tags_copy",

        OpusTags.p("_dst"),
        OpusTags.const.p("_src")
    )

    void(
        "tags_init",

        OpusTags.p("_tags")
    )

    int(
        "tags_add",

        OpusTags.p("_tags"),
        charASCII.const.p("_tag"),
        charUTF8.const.p("_value")
    )

    int(
        "tags_add_comment",

        OpusTags.p("_tags"),
        charUTF8.const.p("_comment")
    )

    int(
        "tags_set_binary_suffix",

        OpusTags.p("_tags"),
        nullable..unsigned_char.const.p("_data"),
        AutoSize("_data")..int("_len")
    )

    charUTF8.const.p(
        "tags_query",

        OpusTags.const.p("_tags"),
        charASCII.const.p("_tag"),
        int("_count")
    )

    int(
        "tags_query_count",

        OpusTags.const.p("_tags"),
        charASCII.const.p("_tag")
    )

    unsigned_char.const.p(
        "tags_get_binary_suffix",

        OpusTags.const.p("_tags"),
        AutoSizeResult..Check(1)..int.p("_len")
    )

    int(
        "tags_get_album_gain",

        OpusTags.const.p("_tags"),
        Check(1)..int.p("_gain_q8")
    )

    int(
        "tags_get_track_gain",

        OpusTags.const.p("_tags"),
        Check(1)..int.p("_gain_q8")
    )

    void(
        "tags_clear",

        OpusTags.p("_tags")
    )

    int(
        "tagcompare",

        charASCII.const.p("_tag_name"),
        charUTF8.const.p("_comment")
    )

    int(
        "tagncompare",

        charASCII.const.p("_tag_name"),
        AutoSize("_tag_name")..int("_tag_len"),
        charUTF8.const.p("_comment")
    )

    int(
        "picture_tag_parse",

        OpusPictureTag.p("_pic"),
        charASCII.const.p("_tag")
    )

    void(
        "picture_tag_init",

        OpusPictureTag.p("_pic")
    )

    void(
        "picture_tag_clear",

        OpusPictureTag.p("_pic")
    )

    /*void(
        "server_info_init",

        OpusServerInfo.p("_info")
    )

    void(
        "server_info_clear",

        OpusServerInfo.p("_info")
    )*/

    opaque_p(
        "op_fopen",

        OpusFileCallbacks.p("_cb"),
        charUTF8.const.p("_path"),
        charASCII.const.p("_mode"),

        noPrefix = true
    )

    opaque_p(
        "op_fdopen",

        OpusFileCallbacks.p("_cb"),
        int("_fd"),
        charASCII.const.p("_mode"),

        noPrefix = true
    )

    opaque_p(
        "op_freopen",

        OpusFileCallbacks.p("_cb"),
        charUTF8.const.p("_path"),
        charASCII.const.p("_mode"),
        opaque_p("_stream"),

        noPrefix = true
    )

    opaque_p(
        "op_mem_stream_create",

        OpusFileCallbacks.p("_cb"),
        unsigned_char.const.p("_data"),
        AutoSize("_data")..size_t("_size"),

        noPrefix = true
    )

    /*opaque_p(
        "op_url_stream_vcreate",

        OpusFileCallbacks.p("_cb"),
        charUTF8.const.p("_url"),
        va_list("_ap", "a list of the \"optional flags\" to use. This is a variable-length list of options terminated with #NULL."),

        noPrefix = true
    )

    opaque_p(
        "op_url_stream_create",

        OpusFileCallbacks.p("_cb"),
        charUTF8.const.p("_url"),

        noPrefix = true
    )*/

    int(
        "op_test",

        nullable..OpusHead.p("_head"),
        unsigned_char.const.p("_initial_data"),
        AutoSize("_initial_data")..size_t("_initial_bytes"),

        noPrefix = true
    )

    OggOpusFile.p(
        "op_open_file",

        charUTF8.const.p("_path"),
        Check(1)..nullable..int.p("_error"),

        noPrefix = true
    )

    OggOpusFile.p(
        "op_open_memory",

        unsigned_char.const.p("_data"),
        AutoSize("_data")..size_t("_size"),
        Check(1)..nullable..int.p("_error"),

        noPrefix = true
    )

    /*OggOpusFile.p(
        "op_vopen_url",

        charUTF8.const.p("_url"),
        Check(1)..nullable..int.p("_error"),
        va_list("_ap", "a list of the \"optional flags\" to use. This is a variable-length list of options terminated with #NULL."),

        noPrefix = true
    )

    OggOpusFile.p(
        "op_open_url",

        charUTF8.const.p("_url"),
        Check(1)..nullable..int.p("_error"),

        noPrefix = true
    )*/

    OggOpusFile.p(
        "op_open_callbacks",

        opaque_p("_stream"),
        OpusFileCallbacks.const.p("_cb"),
        unsigned_char.const.p("_initial_data"),
        AutoSize("_initial_data")..size_t("_initial_bytes"),
        Check(1)..nullable..int.p("_error"),

        noPrefix = true
    )

    OggOpusFile.p(
        "op_test_file",

        charUTF8.const.p("_path"),
        Check(1)..nullable..int.p("_error"),

        noPrefix = true
    )

    OggOpusFile.p(
        "op_test_memory",

        unsigned_char.const.p("_data"),
        AutoSize("_data")..size_t("_size"),
        Check(1)..nullable..int.p("_error"),

        noPrefix = true
    )

    /*OggOpusFile.p(
        "op_vtest_url",

        charUTF8.const.p("_url"),
        Check(1)..nullable..int.p("_error"),
        va_list("_ap", "a list of the {@code \"optional flags\"} to use. This is a variable-length list of options terminated with #NULL."),

        noPrefix = true
    )

    OggOpusFile.p(
        "op_test_url",

        charUTF8.const.p("_url"),
        Check(1)..nullable..int.p("_error"),

        noPrefix = true
    )*/

    OggOpusFile.p(
        "op_test_callbacks",

        opaque_p("_stream"),
        OpusFileCallbacks.const.p("_cb"),
        unsigned_char.const.p("_initial_data"),
        AutoSize("_initial_data")..size_t("_initial_bytes"),
        Check(1)..nullable..int.p("_error"),

        noPrefix = true
    )

    int(
        "op_test_open",

        OggOpusFile.p("_of"),

        noPrefix = true
    )

    void(
        "op_free",

        OggOpusFile.p("_of"),

        noPrefix = true
    )

    intb(
        "op_seekable",

        OggOpusFile.const.p("_of"),

        noPrefix = true
    )

    int(
        "op_link_count",

        OggOpusFile.const.p("_of"),

        noPrefix = true
    )

    opus_uint32(
        "op_serialno",

        OggOpusFile.const.p("_of"),
        int("_li"),

        noPrefix = true
    )

    int(
        "op_channel_count",

        OggOpusFile.const.p("_of"),
        int("_li"),

        noPrefix = true
    )

    long_long(
        "op_raw_total",

        OggOpusFile.const.p("_of"),
        int("_li"),

        noPrefix = true
    )

    ogg_int64_t(
        "op_pcm_total",

        OggOpusFile.const.p("_of"),
        int("_li"),

        noPrefix = true
    )

    OpusHead.const.p(
        "op_head",

        OggOpusFile.const.p("_of"),
        int("_li"),

        noPrefix = true
    )

    OpusTags.const.p(
        "op_tags",

        OggOpusFile.const.p("_of"),
        int("_li"),

        noPrefix = true
    )

    int(
        "op_current_link",

        OggOpusFile.const.p("_of"),

        noPrefix = true
    )

    opus_int32(
        "op_bitrate",

        OggOpusFile.const.p("_of"),
        int("_li"),

        noPrefix = true
    )

    opus_int32(
        "op_bitrate_instant",

        OggOpusFile.p("_of"),

        noPrefix = true
    )

    long_long(
        "op_raw_tell",

        OggOpusFile.const.p("_of"),

        noPrefix = true
    )

    ogg_int64_t(
        "op_pcm_tell",

        OggOpusFile.const.p("_of"),

        noPrefix = true
    )

    int(
        "op_raw_seek",

        OggOpusFile.p("_of"),
        long_long("_byte_offset"),

        noPrefix = true
    )

    int(
        "op_pcm_seek",

        OggOpusFile.p("_of"),
        ogg_int64_t("_pcm_offset"),

        noPrefix = true
    )

    void(
        "op_set_decode_callback",

        OggOpusFile.p("_of"),
        op_decode_cb_func("_decode_cb"),
        opaque_p("_ctx"),

        noPrefix = true
    )

    int(
        "op_set_gain_offset",

        OggOpusFile.p("_of"),
        int("_gain_type"),
        opus_int32("_gain_offset_q8"),

        noPrefix = true
    )

    void(
        "op_set_dither_enabled",

        OggOpusFile.p("_of"),
        intb("_enabled"),

        noPrefix = true
    )

    int(
        "op_read",

        OggOpusFile.p("_of"),
        opus_int16.p("_pcm"),
        AutoSize("_pcm")..int("_buf_size"),
        Check(1)..nullable..int.p("_li"),

        noPrefix = true
    )

    int(
        "op_read_float",

        OggOpusFile.p("_of"),
        float.p("_pcm"),
        AutoSize("_pcm")..int("_buf_size"),
        Check(1)..nullable..int.p("_li"),

        noPrefix = true
    )

    int(
        "op_read_stereo",

        OggOpusFile.p("_of"),
        opus_int16.p("_pcm"),
        AutoSize("_pcm")..int("_buf_size"),

        noPrefix = true
    )

    int(
        "op_read_float_stereo",

        OggOpusFile.p("_of"),
        float.p("_pcm"),
        AutoSize("_pcm")..int("_buf_size"),

        noPrefix = true
    )
}
