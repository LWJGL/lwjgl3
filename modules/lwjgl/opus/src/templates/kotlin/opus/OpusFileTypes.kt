/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus

import org.lwjgl.generator.*

val opus_uint32 = typedef(uint32_t, "opus_uint32")

val OggOpusFile = "OggOpusFile".opaque

val OpusHead = struct(Module.OPUS, "OpusHead", mutable = false) {
    documentation =
        """
        Ogg Opus bitstream information. This contains the basic playback parameters for a stream, and corresponds to the initial ID header packet of an Ogg
        Opus stream.
        """

    int(
        "version",
        """
        the Ogg Opus format version, in the range {@code 0...255}.
        
        The top 4 bits represent a "major" version, and the bottom four bits represent backwards-compatible "minor" revisions. The current specification
        describes version 1. This library will recognize versions up through 15 as backwards compatible with the current specification. An earlier draft of the
        specification described a version 0, but the only difference between version 1 and version 0 is that version 0 did not specify the semantics for
        handling the version field.
        """
    )
    int("channel_count", "the number of channels, in the range {@code 1...255}.")
    unsigned_int("pre_skip", "the number of samples that should be discarded from the beginning of the stream")
    opus_uint32(
        "input_sample_rate",
        """
        the sampling rate of the original input.
        
        All Opus audio is coded at 48 kHz, and should also be decoded at 48 kHz for playback (unless the target hardware does not support this sampling rate).
        However, this field may be used to resample the audio back to the original sampling rate, for example, when saving the output to a file.
        """
    )
    int(
        "output_gain",
        """
        the gain to apply to the decoded output, in dB, as a {@code Q8} value in the range {@code -32768...32767}.
        
        The libopusfile API will automatically apply this gain to the decoded output before returning it, scaling it by
        {@code pow(10,output_gain/(20.0*256))}. You can adjust this behavior with #op_set_gain_offset().
        """
    )
    int(
        "mapping_family",
        """
        the channel mapping family, in the range {@code 0...255}.
        
        Channel mapping family 0 covers mono or stereo in a single stream. Channel mapping family 1 covers 1 to 8 channels in one or more streams, using the
        Vorbis speaker assignments. Channel mapping family 255 covers 1 to 255 channels in one or more streams, but without any defined speaker assignment.
        """
    )
    int("stream_count", "the number of Opus streams in each Ogg packet, in the range {@code 1...255}.")
    int(
        "coupled_count",
        """
        the number of coupled Opus streams in each Ogg packet, in the range {@code 0...127}.
        
        This must satisfy {@code 0 <= coupled_count <= stream_count} and {@code coupled_count + stream_count <= 255}. The coupled streams appear first, before
        all uncoupled streams, in an Ogg Opus packet.
        """
    )
    unsigned_char(
        "mapping",
        """
        the mapping from coded stream channels to output channels.
        
        Let {@code index=mapping[k]} be the value for channel {@code k}. If {@code index < 2*coupled_count}, then it refers to the left channel from stream
        {@code (index/2)} if even, and the right channel from stream {@code (index/2)} if odd. Otherwise, it refers to the output of the uncoupled stream
        {@code (index-coupled_count)}.
        """
    )[255]
}

val OpusTags = struct(Module.OPUS, "OpusTags", mutable = false) {
    documentation =
        """
        The metadata from an Ogg Opus stream.

        This structure holds the in-stream metadata corresponding to the 'comment' header packet of an Ogg Opus stream. The comment header is meant to be used
        much like someone jotting a quick note on the label of a CD. It should be a short, to the point text note that can be more than a couple words, but not
        more than a short paragraph.

        The metadata is stored as a series of (tag, value) pairs, in length-encoded string vectors, using the same format as Vorbis (without the final "framing
        bit"), Theora, and Speex, except for the packet header. The first occurrence of the '=' character delimits the tag and value. A particular tag may
        occur more than once, and order is significant. The character set encoding for the strings is always UTF-8, but the tag names are limited to ASCII, and
        treated as case-insensitive. See ${url("https://www.xiph.org/vorbis/doc/v-comment.html", "the Vorbis comment header specification")} for details.

        In filling in this structure, libopusfile will null-terminate the {@code \#user_comments} strings for safety. However, the bitstream format itself
        treats them as 8-bit clean vectors, possibly containing {@code NUL} characters, so the {@code \#comment_lengths} array should be treated as their
        authoritative length.

        This structure is binary and source-compatible with a {@code vorbis_comment}, and pointers to it may be freely cast to {@code vorbis_comment} pointers,
        and vice versa. It is provided as a separate type to avoid introducing a compile-time dependency on the libvorbis headers.
        """

    charUTF8.p.p("user_comments", "the array of comment string vectors")
    int.p("comment_lengths", "an array of the corresponding length of each vector, in bytes")
    AutoSize("user_comments", "comment_lengths")..int("comments", "the total number of comment streams")
    charUTF8.p("vendor", "the null-terminated vendor string. This identifies the software used to encode the stream.")
}

val OpusPictureTag = struct(Module.OPUS, "OpusPictureTag", mutable = false) {
    documentation = "The contents of a {@code METADATA_BLOCK_PICTURE} tag."

    opus_int32(
        "type",
        """
        the picture type according to the ID3v2 APIC frame:
        ${ol(
            "Other",
            "32x32 pixels 'file icon' (PNG only)",
            "Other file icon",
            "Cover (front)",
            "Cover (back)",
            "Leaflet page",
            "Media (e.g. label side of CD)",
            "Lead artist/lead performer/soloist",
            "Artist/performer",
            "Conductor",
            "Band/Orchestra",
            "Composer",
            "Lyricist/text writer",
            "Recording Location",
            "During recording",
            "During performance",
            "Movie/video screen capture",
            "A bright colored fish",
            "Illustration",
            "Band/artist logotype",
            "Publisher/Studio logotype"
        )}

        Others are reserved and should not be used. There may only be one each of picture type 1 and 2 in a file.
        """
    )
    char.p(
        "mime_type",
        """
        the MIME type of the picture, in printable ASCII characters {@code 0x20-0x7E}.
        
        The MIME type may also be {@code "-->"} to signify that the data part is a URL pointing to the picture instead of the picture data itself. In this
        case, a terminating {@code NUL} is appended to the URL string in {@code \#data}, but {@code \#data_length} is set to the length of the string excluding
        that terminating {@code NUL}.
        """
    )
    charUTF8.p("description", "the description of the picture, in UTF-8")
    opus_uint32("width", "the width of the picture in pixels")
    opus_uint32("height", "the height of the picture in pixels")
    opus_uint32("depth", "the color depth of the picture in bits-per-pixel (<em> not</em> bits-per-channel)")
    opus_uint32("colors", "for indexed-color pictures (e.g., GIF), the number of colors used, or 0 for non-indexed pictures.")
    AutoSize("data")..opus_uint32("data_length", "the length of the picture data in bytes")
    unsigned_char.p("data", "the binary picture data")
    int("format", "the format of the picture data, if known").links("PIC_FORMAT_\\w+")
}

/*
val OpusServerInfo = struct(Module.OPUS, "OpusServerInfo", mutable = false) {
    documentation = "HTTP/Shoutcast/Icecast server information associated with a URL."

    nullable..charUTF8.p(
        "name",
        "the name of the server ({@code icy-name/ice-name}). This is #NULL if there was no {@code icy-name} or {@code ice-name} header."
    )
    nullable..charUTF8.p(
        "description",
        """
        a short description of the server ({@code icy-description/ice-description}). This is #NULL if there was no {@code icy-description} or
        {@code ice-description} header.
        """
    )
    nullable..charUTF8.p(
        "genre",
        "the genre the server falls under ({@code icy-genre/ice-genre}). This is #NULL if there was no {@code icy-genre} or {@code ice-genre} header."
    )
    nullable..charUTF8.p(
        "url",
        "the homepage for the server ({@code icy-url/ice-url}). This is #NULL if there was no {@code icy-url} or {@code ice-url} header."
    )
    nullable..charUTF8.p("server", "the software used by the origin server ({@code Server}). This is #NULL if there was no {@code Server} header.")
    nullable..charUTF8.p(
        "content_type",
        "the media type of the entity sent to the recepient ({@code Content-Type}). This is #NULL if there was no {@code Content-Type} header."
    )
    opus_int32(
        "bitrate_kbps",
        "the nominal stream bitrate in kbps ({@code icy-br/ice-bitrate}). This is {@code -1} if there was no {@code icy-br} or {@code ice-bitrate} header."
    )
    int(
        "is_public",
        """
        flag indicating whether the server is public ({@code 1}) or not ({@code 0}) ({@code icy-pub/ice-public}). This is {@code -1} if there was no
        {@code icy-pub} or {@code ice-public} header.
        """
    )
    int(
        "is_ssl",
        """
        flag indicating whether the server is using HTTPS instead of HTTP. This is {@code 0} unless HTTPS is being used. This may not match the protocol used
        in the original URL if there were redirections.
        """
    )
}
*/

val op_read_func = Module.OPUS.callback {
    int(
        "OPReadFunc",
        "Reads up to {@code _nbytes} bytes of data from {@code _stream}.",

        Unsafe..void.p("_stream", "the stream to read from"),
        unsigned_char.p("_ptr", "the buffer to store the data in"),
        AutoSize("_ptr")..int(
            "_nbytes",
            "the maximum number of bytes to read. This function may return fewer, though it will not return zero unless it reaches end-of-file."
        ),

        nativeType = "op_read_func",

        returnDoc = "the number of bytes successfully read, or a negative value on error"
    ) {
        documentation = "Instances of this interface may be set to ##OpusFileCallbacks."
    }
}

val op_seek_func = Module.OPUS.callback {
    int(
        "OPSeekFunc",
        """
        Sets the position indicator for {@code _stream}.
        
        The new position, measured in bytes, is obtained by adding {@code _offset} bytes to the position specified by {@code _whence}. If {@code _whence} is
        set to {@code SEEK_SET}, {@code SEEK_CUR}, or {@code SEEK_END}, the offset is relative to the start of the stream, the current position indicator, or
        end-of-file, respectively.
        """,

        Unsafe..void.p("_stream", ""),
        long_long("_offset", ""),
        int("_whence", ""),

        nativeType = "op_seek_func",

        returnDoc = "{@code 0}: Success. {@code -1}: Seeking is not supported or an error occurred. {@code errno} need not be set."
    ) {
        documentation = "Instances of this interface may be set to ##OpusFileCallbacks."
    }
}

val op_tell_func = Module.OPUS.callback {
    long_long(
        "OPTellFunc",
        "Obtains the current value of the position indicator for {@code _stream}.",

        Unsafe..void.p("_stream", ""),

        nativeType = "op_tell_func",

        returnDoc = "the current position indicator"
    ) {
        documentation = "Instances of this interface may be set to ##OpusFileCallbacks."
    }
}

val op_close_func = Module.OPUS.callback {
    int(
        "OPCloseFunc",
        "Closes the underlying stream.",

        Unsafe..void.p("_stream", ""),

        nativeType = "op_close_func",

        returnDoc = "{@code 0:} Success. {@code EOF}: An error occurred. {@code errno} need not be set.}"
    ) {
        documentation = "Instances of this interface may be set to ##OpusFileCallbacks."
    }
}

val OpusFileCallbacks = struct(Module.OPUS, "OpusFileCallbacks") {
    documentation =
        """
        The callbacks used to access non-{@code FILE} stream resources.
        
        The function prototypes are basically the same as for the stdio functions {@code fread()}, {@code fseek()}, {@code ftell()}, and {@code fclose()}. The
        differences are that the {@code FILE *} arguments have been replaced with a {@code void *}, which is to be used as a pointer to whatever internal data
        these functions might need, that {@code seek} and {@code tell} take and return 64-bit offsets, and that {@code seek} <em>must</em> return {@code -1} if
        the stream is unseekable.
        """

    op_read_func("read", "used to read data from the stream. This must not be #NULL.")
    nullable..op_seek_func("seek", "used to seek in the stream. This may be #NULL if seeking is not implemented.")
    nullable..op_tell_func("tell", "used to return the current read position in the stream. This may be #NULL if seeking is not implemented.")
    nullable..op_close_func("close", "used to close the stream when the decoder is freed. This may be #NULL to leave the stream open.")
}

val ogg_int64_t = typedef(int64_t, "ogg_int64_t")
val ogg_packet = struct(Module.OPUS, "OGGPacket", nativeName = "ogg_packet", mutable = false) {
    unsigned_char.p("packet", "")
    AutoSize("packet")..long("bytes", "")
    long("b_o_s", "")
    long("e_o_s", "")

    ogg_int64_t("granulepos", "")

    ogg_int64_t(
        "packetno",
        """
        sequence number for decode; the framing knows where there's a hole in the data, but we need coupling so that the codec (which is in a separate
        abstraction layer) also knows about the gap
        """
    )
}

val op_decode_cb_func = Module.OPUS.callback {
    int(
        "OPDecodeCBFunc",
        """
        Called to decode an Opus packet.
        
        This should invoke the functional equivalent of #multistream_decode() or #multistream_decode_float(), except that it returns {@code 0} on success
        instead of the number of decoded samples (which is known a priori).
        """,

        opaque_p("_ctx", "the application-provided callback context"),
        OpusMSDecoder.p("_decoder", "the decoder to use to decode the packet"),
        Unsafe..void.p(
            "_pcm",
            """
            the buffer to decode into.
            
            This will always have enough room for {@code _nchannels} of {@code _nsamples} samples, which should be placed into this buffer interleaved.
            """
        ),
        ogg_packet.const.p("_op", "the packet to decode. This will always have its granule position set to a valid value."),
        int("_nsamples", "the number of samples expected from the packet"),
        int("_nchannels", "the number of channels expected from the packet"),
        int("_format", "the desired sample output format. This is either #DEC_FORMAT_SHORT or #DEC_FORMAT_FLOAT."),
        int("_li", "the index of the link from which this packet was decoded"),

        nativeType = "op_decode_cb_func",

        returnDoc =
        """
        a non-negative value on success, or a negative value on error.
        
        Any error codes should be the same as those returned by #multistream_decode() or #multistream_decode_float(). Success codes are as follows:
        ${ul(
            """
            {@code 0}: Decoding was successful. The application has filled the buffer with exactly {@code _nsamples* _nchannels} samples in the requested
            format.
            """,
            "#DEC_USE_DEFAULT: No decoding was done. libopusfile should do the decoding by itself instead."
        )}
        """
    ) {
        documentation = "Instances of this interface may be passed to the #op_set_decode_callback() method."
    }
}