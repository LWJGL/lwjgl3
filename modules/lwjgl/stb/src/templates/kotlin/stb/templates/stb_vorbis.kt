/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package stb.templates

import org.lwjgl.generator.*
import stb.*

// Prefixed with an underscore to avoid a nameclash with the stb_vorbis type
val _stb_vorbis = "STBVorbis".nativeClass(Module.STB, prefixMethod = "stb_vorbis_", prefixConstant = "VORBIS_") {
    includeSTBAPI(
        """#ifdef LWJGL_LINUX
    #include <alloca.h>
#endif
#include "stb_vorbis.c"""")

    javaImport("org.lwjgl.system.libc.LibCStdlib")

    EnumConstant(
        "_no_error".enum,

        "need_more_data".enum, // not a real error

        "invalid_api_mixing".enum, // can't mix API modes
        "outofmem".enum, // not enough memory
        "feature_not_supported".enum, // uses floor 0
        "too_many_channels".enum, // STB_"MAX_CHANNELS".. is too small
        "file_open_failure".enum, // fopen() failed
        "seek_without_length".enum, // can't seek in unknown-length file

        "unexpected_eof".enum("10"), // file is truncated?
        "seek_invalid".enum, // seek past EOF

        // decoding errors (corrupt/invalid stream) -- you probably
        // don't care about the exact details of these

        // vorbis errors:
        "invalid_setup".enum("20"),
        "invalid_stream".enum,

        // ogg errors:
        "missing_capture_pattern".enum("30"),
        "invalid_stream_structure_version".enum,
        "continued_packet_flag_invalid".enum,
        "incorrect_stream_serial_number".enum,
        "invalid_first_page".enum,
        "bad_packet_type".enum,
        "cant_find_last_page".enum,
        "seek_failed".enum,
        "ogg_skeleton_not_supported".enum
    )

    // FUNCTIONS USEABLE WITH ALL INPUT MODES

    val DECODER = stb_vorbis.p("f")

    stb_vorbis_info(
        "get_info",

        DECODER
    )

    stb_vorbis_comment(
        "get_comment",

        DECODER
    )

    int(
        "get_error",

        DECODER
    )

    void(
        "close",

        DECODER
    )

    int(
        "get_sample_offset",

        DECODER
    )

    unsigned_int(
        "get_file_offset",

        DECODER
    )

    // PUSHDATA API

    val open_pushdata = stb_vorbis.p(
        "open_pushdata",

        unsigned_char.const.p("datablock"),
        AutoSize("datablock")..int("datablock_length_in_bytes"),
        Check(1)..int.p("datablock_memory_consumed_in_bytes"),
        Check(1)..int.p("error"),
        nullable..stb_vorbis_alloc.const.p("alloc_buffer")
    )

    int(
        "decode_frame_pushdata",

        DECODER,
        unsigned_char.const.p("datablock"),
        AutoSize("datablock")..int("datablock_length_in_bytes"),
        nullable..Check(1)..int.p("channels"),
        Check(1)..float.p.p.p("output"),
        Check(1)..int.p("samples")
    )

    void(
        "flush_pushdata",

        DECODER
    )

    // PULLING INPUT API

    int(
        "decode_filename",

        charASCII.const.p("filename"),
        Check(1)..int.p("channels"),
        Check(1)..int.p("sample_rate"),
        Return("$RESULT * channels.get(0)")..Check(1)..short.p.p("output")
    )

    int(
        "decode_memory",

        unsigned_char.const.p("mem"),
        AutoSize("mem")..int("len"),
        Check(1)..int.p("channels"),
        Check(1)..int.p("sample_rate"),
        Return("$RESULT * channels.get(0)")..Check(1)..short.p.p("output")
    )

    stb_vorbis.p(
        "open_memory",

        unsigned_char.const.p("mem"),
        AutoSize("mem")..int("len"),
        Check(1)..int.p("error"),
        open_pushdata["alloc_buffer"]
    )

    stb_vorbis.p(
        "open_filename",

        charASCII.const.p("filename"),
        Check(1)..int.p("error"),
        open_pushdata["alloc_buffer"]
    )

    intb(
        "seek_frame",

        DECODER,
        unsigned_int("sample_number")
    )

    intb(
        "seek",

        DECODER,
        unsigned_int("sample_number")
    )

    intb(
        "seek_start",

        DECODER
    )

    unsigned_int(
        "stream_length_in_samples",

        DECODER
    )

    float(
        "stream_length_in_seconds",

        DECODER
    )

    int(
        "get_frame_float",

        DECODER,
        Check(1)..nullable..int.p("channels"),
        Check(1)..float.p.p.p("output")
    )

    int(
        "get_frame_short",

        DECODER,
        AutoSize("buffer")..int("num_c"),
        short.p.p("buffer"),
        int("num_samples")
    )

    int(
        "get_frame_short_interleaved",

        DECODER,
        int("num_c"),
        short.p("buffer"),
        AutoSize("buffer")..int("num_shorts")
    )

    int(
        "get_samples_float",

        DECODER,
        AutoSize("buffer")..int("channels"),
        float.p.p("buffer"),
        int("num_samples")
    )

    int(
        "get_samples_float_interleaved",

        DECODER,
        int("channels"),
        float.p("buffer"),
        AutoSize("buffer")..int("num_floats")
    )

    int(
        "get_samples_short",

        DECODER,
        AutoSize("buffer")..int("channels"),
        short.p.p("buffer"),
        int("num_samples")
    )

    int(
        "get_samples_short_interleaved",

        DECODER,
        int("channels"),
        short.p("buffer"),
        AutoSize("buffer")..int("num_shorts")
    )
}