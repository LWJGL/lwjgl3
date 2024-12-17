/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus

import org.lwjgl.generator.*

val opus_uint32 = typedef(uint32_t, "opus_uint32")

val OggOpusFile = "OggOpusFile".opaque

val OpusHead = struct(Module.OPUS, "OpusHead", mutable = false) {
    int("version")
    int("channel_count")
    unsigned_int("pre_skip")
    opus_uint32("input_sample_rate")
    int("output_gain")
    int("mapping_family")
    int("stream_count")
    int("coupled_count")
    unsigned_char("mapping")[255]
}

val OpusTags = struct(Module.OPUS, "OpusTags", mutable = false) {
    charUTF8.p.p("user_comments")
    int.p("comment_lengths")
    AutoSize("user_comments", "comment_lengths")..int("comments")
    charUTF8.p("vendor")
}

val OpusPictureTag = struct(Module.OPUS, "OpusPictureTag", mutable = false) {
    opus_int32("type")
    char.p("mime_type")
    charUTF8.p("description")
    opus_uint32("width")
    opus_uint32("height")
    opus_uint32("depth")
    opus_uint32("colors")
    AutoSize("data")..opus_uint32("data_length")
    unsigned_char.p("data")
    int("format")
}

/*
val OpusServerInfo = struct(Module.OPUS, "OpusServerInfo", mutable = false) {
    nullable..charUTF8.p("name")
    nullable..charUTF8.p("description")
    nullable..charUTF8.p("genre")
    nullable..charUTF8.p("url")
    nullable..charUTF8.p("server")
    nullable..charUTF8.p("content_type")
    opus_int32("bitrate_kbps")
    int("is_public")
    int("is_ssl")
}
*/

val op_read_func = Module.OPUS.callback {
    int(
        "OPReadFunc",

        Unsafe..void.p("_stream"),
        unsigned_char.p("_ptr"),
        AutoSize("_ptr")..int("_nbytes"),

        nativeType = "op_read_func"
    ) {
    }
}

val op_seek_func = Module.OPUS.callback {
    int(
        "OPSeekFunc",

        Unsafe..void.p("_stream"),
        long_long("_offset"),
        int("_whence"),

        nativeType = "op_seek_func"
    ) {
    }
}

val op_tell_func = Module.OPUS.callback {
    long_long(
        "OPTellFunc",

        Unsafe..void.p("_stream"),

        nativeType = "op_tell_func"
    ) {
    }
}

val op_close_func = Module.OPUS.callback {
    int(
        "OPCloseFunc",

        Unsafe..void.p("_stream"),

        nativeType = "op_close_func"
    ) {
    }
}

val OpusFileCallbacks = struct(Module.OPUS, "OpusFileCallbacks") {
    op_read_func("read")
    nullable..op_seek_func("seek")
    nullable..op_tell_func("tell")
    nullable..op_close_func("close")
}

val ogg_int64_t = typedef(int64_t, "ogg_int64_t")
val ogg_packet = struct(Module.OPUS, "OGGPacket", nativeName = "ogg_packet", mutable = false) {
    unsigned_char.p("packet")
    AutoSize("packet")..long("bytes")
    long("b_o_s")
    long("e_o_s")

    ogg_int64_t("granulepos")

    ogg_int64_t("packetno")
}

val op_decode_cb_func = Module.OPUS.callback {
    int(
        "OPDecodeCBFunc",

        opaque_p("_ctx"),
        OpusMSDecoder.p("_decoder"),
        Unsafe..void.p("_pcm"),
        ogg_packet.const.p("_op"),
        int("_nsamples"),
        int("_nchannels"),
        int("_format"),
        int("_li"),

        nativeType = "op_decode_cb_func"
    ) {
    }
}