/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opus.templates

import opus.*
import org.lwjgl.generator.*

val OpusFile = "OpusFile".nativeClass(Module.OPUS, prefix = "OP", prefixMethod = "opus_", binding = OPUS_BINDING_DELEGATE) {
    documentation =
        """
        <h3>Introduction</h3>

        This is the documentation for the <b>libopusfile</b> C API.
        
        The libopusfile package provides a convenient high-level API for decoding and basic manipulation of all Ogg Opus audio streams. libopusfile is
        implemented as a layer on top of Xiph.Org's reference ${url("https://www.xiph.org/ogg/doc/libogg/reference.html", "libogg")} and
        ${url("https://opus-codec.org/docs/opus_api-1.3.1/", "libopus")} libraries.

        libopusfile provides several sets of built-in routines for file/stream access, and may also use custom stream I/O routines provided by the embedded
        environment. There are built-in I/O routines provided for ANSI-compliant {@code stdio} ({@code FILE *}), memory buffers, and URLs (including
        {@code file:} URLs, plus optionally {@code http:} and {@code https:} URLs).

        <h3>Organization</h3> 

        The main API is divided into several sections:
        ${ul(
            "stream_open_close",
            "stream_info",
            "stream_decoding",
            "stream_seeking"
        )}

        Several additional sections are not tied to the main API.
        ${ul(
            "stream_callbacks",
            "header_info",
            "error_codes"
        )}

        <h3>Overview</h3>

        The libopusfile API always decodes files to 48 kHz. The original sample rate is not preserved by the lossy compression, though it is stored in the
        header to allow you to resample to it after decoding (the libopusfile API does not currently provide a resampler, but the
        ${url("https://www.speex.org/docs/manual/speex-manual/node7.html\\#SECTION00760000000000000000", "the Speex resampler")} is a good choice if you need
        one). In general, if you are playing back the audio, you should leave it at 48 kHz, provided your audio hardware supports it. When decoding to a file,
        it may be worth resampling back to the original sample rate, so as not to surprise users who might not expect the sample rate to change after encoding
        to Opus and decoding.

        Opus files can contain anywhere from 1 to 255 channels of audio. The channel mappings for up to 8 channels are the same as the
        ${url("https://www.xiph.org/vorbis/doc/Vorbis_I_spec.html\\#x1-810004.3.9", "Vorbis mappings")}. A special stereo API can convert everything to 2
        channels, making it simple to support multichannel files in an application which only has stereo output. Although the libopusfile ABI provides support
        for the theoretical maximum number of channels, the current implementation does not support files with more than 8 channels, as they do not have
        well-defined channel mappings.

        Like all Ogg files, Opus files may be "chained". That is, multiple Opus files may be combined into a single, longer file just by concatenating the
        original files. This is commonly done in internet radio streaming, as it allows the title and artist to be updated each time the song changes, since
        each link in the chain includes its own set of metadata.

        libopusfile fully supports chained files. It will decode the first Opus stream found in each link of a chained file (ignoring any other streams that
        might be concurrently multiplexed with it, such as a video stream).

        The channel count can also change between links. If your application is not prepared to deal with this, it can use the stereo API to ensure the audio
        from all links will always get decoded into a common format. Since libopusfile always decodes to 48 kHz, you do not have to worry about the sample rate
        changing between links (as was possible with Vorbis). This makes application support for chained files with libopusfile very easy.
        """
    
    EnumConstant(
        "Error codes.",

        "FALSE".enum("A request did not succeed.", "-1"),
        "EOF".enum("Currently not used externally.", "-2"),
        "HOLE".enum("There was a hole in the page sequence numbers (e.g., a page was corrupt or missing).", "-3"),
        "EREAD".enum("An underlying read, seek, or tell operation failed when it should have succeeded.", "-128"),
        "EFAULT".enum(
            "A #NULL pointer was passed where one was unexpected, or an internal memory allocation failed, or an internal library error was encountered.",
            "-129"
        ),
        "EIMPL".enum("The stream used a feature that is not implemented, such as an unsupported channel family.", "-130"),
        "EINVAL".enum("One or more parameters to a function were invalid.", "-131"),
        "ENOTFORMAT".enum(
            """
            A purported Ogg Opus stream did not begin with an Ogg page, a purported header packet did not start with one of the required strings, "OpusHead" or
            "OpusTags", or a link in a chained file was encountered that did not contain any logical Opus streams.
            """,
            "-132"
        ),
        "EBADHEADER".enum("A required header packet was not properly formatted, contained illegal values, or was missing altogether.", "-133"),
        "EVERSION".enum("The ID header contained an unrecognized version number", "-134"),
        "ENOTAUDIO".enum("Currently not used at all.", "-135"),
        "EBADPACKET".enum(
            """
            An audio packet failed to decode properly. This is usually caused by a multistream Ogg packet where the durations of the individual Opus packets
            contained in it are not all the same.
            """,
            "-136"
        ),
        "EBADLINK".enum(
            """
            We failed to find data we had seen before, or the bitstream structure was sufficiently malformed that seeking to the target destination was
            impossible.
            """,
            "-137"
        ),
        "ENOSEEK".enum("An operation that requires seeking was requested on an unseekable stream.", "-138"),
        "EBADTIMESTAMP".enum("The first or last granule position of a link failed basic validity checks.", "-139")
    )

    IntConstant("", "OPUS_CHANNEL_COUNT_MAX".."255").noPrefix()
    
    EnumConstant(
        "Picture tag image formats.",

        "PIC_FORMAT_UNKNOWN".enum("The MIME type was not recognized, or the image data did not match the declared MIME type.", "-1"),
        "PIC_FORMAT_URL".enum("The MIME type indicates the image data is really a URL.", "0"),
        "PIC_FORMAT_JPEG".enum("The image is a JPEG.", "1"),
        "PIC_FORMAT_PNG".enum("The image is a PNG.", "2"),
        "PIC_FORMAT_GIF".enum("The image is a GIF.", "3")
    )

    IntConstant(
        "These are the raw numbers used to define the request codes. They should not be used directly.",

        "SSL_SKIP_CERTIFICATE_CHECK_REQUEST".."6464",
        "HTTP_PROXY_HOST_REQUEST".."6528",
        "HTTP_PROXY_PORT_REQUEST".."6592",
        "HTTP_PROXY_USER_REQUEST".."6656",
        "HTTP_PROXY_PASS_REQUEST".."6720",
        "GET_SERVER_INFO_REQUEST".."6784"
    )

    IntConstant(
        "Indicates that the decoding callback should produce signed 16-bit native-endian output samples.",

        "DEC_FORMAT_SHORT".."7008"
    )

    IntConstant(
        "Indicates that the decoding callback should produce 32-bit native-endian float samples.",

        "DEC_FORMAT_FLOAT".."7040"
    )

    IntConstant(
        "Indicates that the decoding callback did not decode anything, and that libopusfile should decode normally instead.",

        "DEC_USE_DEFAULT".."6720"
    )

    IntConstant(
        """
        Gain offset type that indicates that the provided offset is relative to the header gain.
    
        This is the default.
        """,

        "HEADER_GAIN".."0"
    )
    IntConstant(
        "Gain offset type that indicates that the provided offset is relative to the {@code R128_ALBUM_GAIN} value (if any), in addition to the header gain.",

        "ALBUM_GAIN".."3007"
    )
    IntConstant(
        "Gain offset type that indicates that the provided offset is relative to the {@code R128_TRACK_GAIN} value (if any), in addition to the header gain.",

        "TRACK_GAIN".."3008"
    )
    IntConstant(
        "Gain offset type that indicates that the provided offset should be used as the gain directly, without applying any the header or track gains.",

        "ABSOLUTE_GAIN".."3009"
    )

    int(
        "head_parse",
        "Parses the contents of the ID header packet of an Ogg Opus stream.",

        OpusHead.p(
            "_head",
            """
            returns the contents of the parsed packet. The contents of this structure are untouched on error. This may be #NULL to merely test the header for
            validity.
            """
        ),
        unsigned_char.const.p("_data", "the contents of the ID header packet"),
        AutoSize("_data")..size_t("_len", "the number of bytes of data in the ID header packet"),

        returnDoc =
        """
        0 on success or a negative value on error:
        ${ul(
            "#ENOTFORMAT If the data does not start with the \"OpusHead\" string.",
            "#EVERSION If the version field signaled a version this library does not know how to parse.",
            "#EIMPL If the channel mapping family was 255, which general purpose players should not attempt to play.",
            """
            #EBADHEADER If the contents of the packet otherwise violate the Ogg Opus specification:
            ${ul(
                "Insufficient data",
                "Too much data for the known minor versions",
                "An unrecognized channel mapping family",
                "Zero channels or too many channels",
                "Zero coded streams",
                "Too many coupled streams, or",
                "An invalid channel mapping index"
            )}
            """
        )}
        """
    )

    ogg_int64_t(
        "granule_sample",
        """
        Converts a granule position to a sample offset for a given Ogg Opus stream.
        
        The sample offset is simply {@code _gp-_head->pre_skip}. Granule position values smaller than ##OpusHead{@code ::pre_skip} correspond to audio that
        should never be played, and thus have no associated sample offset. This function returns {@code -1} for such values. This function also correctly
        handles extremely large granule positions, which may have wrapped around to a negative number when stored in a signed {@code ogg_int64_t} value.
        """,

        OpusHead.const.p("_head", "the {@code OpusHead} information from the ID header of the stream"),
        ogg_int64_t("_gp", "the granule position to convert"),

        returnDoc =
        """
        the sample offset associated with the given granule position (counting at a 48 kHz sampling rate), or the special value {@code -1} on error (i.e., the
        granule position was smaller than the pre-skip amount)
        """
    )

    int(
        "tags_parse",
        "Parses the contents of the 'comment' header packet of an Ogg Opus stream.",

        nullable..OpusTags.p(
            "_tags",
            """
            an uninitialized {@code OpusTags} structure. This returns the contents of the parsed packet. The contents of this structure are untouched on error.
            This may be #NULL to merely test the header for validity.
            """
        ),
        unsigned_char.const.p("_data", "the contents of the 'comment' header packet"),
        AutoSize("_data")..size_t("_len", "the number of bytes of data in the 'info' header packet"),

        returnDoc =
        """
        ${ul(
            "{@code 0}: Success",
            "#ENOTFORMAT If the data does not start with the \"OpusTags\" string",
            "#EBADHEADER If the contents of the packet otherwise violate the Ogg Opus specification",
            "#EFAULT If there wasn't enough memory to store the tags"
        )}
        """
    )

    int(
        "tags_copy",
        "Performs a deep copy of an {@code OpusTags} structure.",

        OpusTags.p("_dst", "the {@code OpusTags} structure to copy into. If this function fails, the contents of this structure remain untouched."),
        OpusTags.const.p("_src", "the {@code OpusTags} structure to copy from"),

        returnDoc =
        """
        ${ul(
            "{@code 0}: Success",
            "#EFAULT If there wasn't enough memory to copy the tags"
        )}
        """
    )

    void(
        "tags_init",
        "Initializes an {@code OpusTags} structure. This should be called on a freshly allocated {@code OpusTags} structure before attempting to use it.",

        OpusTags.p("_tags", "the {@code OpusTags} structure to initialize")
    )

    int(
        "tags_add",
        """
        Add a (tag, value) pair to an initialized {@code OpusTags} structure.

        ${note("""
        Neither {@code opus_tags_add()} nor #tags_add_comment() support values containing embedded {@code NUL}s, although the bitstream format does support
        them. To add such tags, you will need to manipulate the {@code OpusTags} structure directly.
        """)}
        """,

        OpusTags.p("_tags", "the {@code OpusTags} structure to add the (tag, value) pair to"),
        charASCII.const.p("_tag", "a {@code NUL}-terminated, case-insensitive, ASCII string containing the tag to add (without an {@code '='} character)"),
        charUTF8.const.p("_value", "a {@code NUL}-terminated UTF-8 containing the corresponding value"),

        returnDoc =
        """
        0 on success, or a negative value on failure: 
        ${ul(
            "#EFAULT An internal memory allocation failed"
        )}
        """
    )

    int(
        "tags_add_comment",
        """
        Add a comment to an initialized {@code OpusTags} structure.

        ${note("""
        Neither {@code opus_tags_add_comment()} nor #tags_add() support comments containing embedded {@code NUL}s, although the bitstream format does support
        them. To add such tags, you will need to manipulate the {@code OpusTags} structure directly.
        """)}
        """,

        OpusTags.p("_tags", "the {@code OpusTags} structure to add the comment to"),
        charUTF8.const.p("_comment", "a {@code NUL}-terminated UTF-8 string containing the comment in {@code \"TAG=value\"} form"),

        returnDoc =
        """
        0 on success, or a negative value on failure: 
        ${ul(
            "#EFAULT An internal memory allocation failed"
        )}
        """
    )

    int(
        "tags_set_binary_suffix",
        "Replace the binary suffix data at the end of the packet (if any).",

        OpusTags.p("_tags", "an initialized {@code OpusTags} structure"),
        nullable..unsigned_char.const.p(
            "_data",
            """
            a buffer of binary data to append after the encoded user comments. The least significant bit of the first byte of this data must be set (to ensure
            the data is preserved by other editors).
            """
        ),
        AutoSize("_data")..int("_len", "the number of bytes of binary data to append. This may be zero to remove any existing binary suffix data."),

        returnDoc =
        """
        0 on success, or a negative value on failure: 
        ${ul(
            """
            #EINVAL {@code _len} was negative, or {@code _len} was positive but {@code _data} was #NULL or the least significant bit of the first byte was not
            set
            """,
            "#EFAULT An internal memory allocation failed"
        )} 
        """
    )

    charUTF8.const.p(
        "tags_query",
        "Look up a comment value by its tag.",

        OpusTags.const.p("_tags", "an initialized {@code OpusTags} structure"),
        charASCII.const.p("_tag", "the tag to look up"),
        int(
            "_count",
            """
            the instance of the tag.
            
            The same tag can appear multiple times, each with a distinct value, so an index is required to retrieve them all. The order in which these values
            appear is significant and should be preserved. Use #tags_query_count() to get the legal range for the {@code _count} parameter.
            """
        ),

        returnDoc =
        """
        a pointer to the queried tag's value.
        
        This points directly to data in the {@code OpusTags} structure. It should not be modified or freed by the application, and modifications to the
        structure may invalidate the pointer. #NULL if no matching tag is found.
        """
    )

    int(
        "tags_query_count",
        """
        Look up the number of instances of a tag.
        
        Call this first when querying for a specific tag and then iterate over the number of instances with separate calls to #tags_query() to retrieve all the
        values for that tag in order.
        """,

        OpusTags.const.p("_tags", "an initialized {@code OpusTags} structure"),
        charASCII.const.p("_tag", "the tag to look up"),

        returnDoc = "the number of instances of this particular tag"
    )

    unsigned_char.const.p(
        "tags_get_binary_suffix",
        "Retrieve the binary suffix data at the end of the packet (if any).",

        OpusTags.const.p("_tags", "an initialized {@code OpusTags} structure"),
        AutoSizeResult..Check(1)..int.p("_len", "returns the number of bytes of binary suffix data returned"),

        returnDoc = "a pointer to the binary suffix data, or #NULL if none was present"
    )

    int(
        "tags_get_album_gain",
        """
        Get the album gain from an {@code R128_ALBUM_GAIN} tag, if one was specified. This searches for the first {@code R128_ALBUM_GAIN} tag with a valid
        signed, 16-bit decimal integer value and returns the value. This routine is exposed merely for convenience for applications which wish to do something
        special with the album gain (i.e., display it). If you simply wish to apply the album gain instead of the header gain, you can use
        #op_set_gain_offset() with an #ALBUM_GAIN type and no offset.
        """,

        OpusTags.const.p("_tags", "an initialized {@code OpusTags} structure"),
        Check(1)..int.p(
            "_gain_q8",
            """
            the album gain, in {@code 1/256ths} of a dB. This will lie in the range {@code [-32768,32767]}, and should be applied in <em>addition</em> to the
            header gain. On error, no value is returned, and the previous contents remain unchanged.
            """
        ),

        returnDoc =
        """
        0 on success, or a negative value on failure: 
        ${ul(
            "#FALSE There was no album gain available in the given tags"
        )}   
        """
    )

    int(
        "tags_get_track_gain",
        """
        Get the track gain from an {@code R128_TRACK_GAIN} tag, if one was specified.
        
        This searches for the first {@code R128_TRACK_GAIN} tag with a valid signed, 16-bit decimal integer value and returns the value. This routine is
        exposed merely for convenience for applications which wish to do something special with the track gain (i.e., display it). If you simply wish to apply
        the track gain instead of the header gain, you can use #op_set_gain_offset() with an #TRACK_GAIN type and no offset.
        """,

        OpusTags.const.p("_tags", "an initialized {@code OpusTags} structure"),
        Check(1)..int.p(
            "_gain_q8",
            """
            the track gain, in {@code 1/256ths} of a dB. This will lie in the range {@code [-32768,32767]}, and should be applied in <em>addition</em> to the
            header gain. On error, no value is returned, and the previous contents remain unchanged.
            """
        ),

        returnDoc =
        """
        0 on success, or a negative value on failure: 
        ${ul(
            "#FALSE There was no track gain available in the given tags"
        )}   
        """
    )

    void(
        "tags_clear",
        """
        Clears the {@code OpusTags} structure.
        
        This should be called on an {@code OpusTags} structure after it is no longer needed. It will free all memory used by the structure members.
        """,

        OpusTags.p("_tags", "the {@code OpusTags} structure to clear")
    )

    int(
        "tagcompare",
        "Check if {@code _comment} is an instance of a {@code _tag_name} tag.",

        charASCII.const.p(
            "_tag_name",
            "a {@code NUL}-terminated, case-insensitive, ASCII string containing the name of the tag to check for (without the terminating {@code '='} character)"
        ),
        charUTF8.const.p("_comment", "the comment string to check"),

        returnDoc =
        """
        an integer less than, equal to, or greater than zero if {@code _comment} is found respectively, to be less than, to match, or be greater than a
        {@code "tag=value"} string whose tag matches {@code _tag_name}
        """
    )

    int(
        "tagncompare",
        """
        Check if {@code _comment} is an instance of a {@code _tag_name} tag.
        
        This version is slightly more efficient than #tagcompare() if the length of the tag name is already known (e.g., because it is a constant).
        """,

        charASCII.const.p(
            "_tag_name",
            "a case-insensitive ASCII string containing the name of the tag to check for (without the terminating {@code '='} character)"
        ),
        AutoSize("_tag_name")..int("_tag_len", "the number of characters in the tag name. This must be non-negative."),
        charUTF8.const.p("_comment", "the comment string to check"),

        returnDoc =
        """
        an integer less than, equal to, or greater than zero if {@code _comment} is found respectively, to be less than, to match, or be greater than a
        {@code "tag=value"} string whose tag matches the first {@code _tag_len} characters of {@code _tag_name}
        """
    )

    int(
        "picture_tag_parse",
        """
        Parse a single {@code METADATA_BLOCK_PICTURE} tag.
        
        This decodes the BASE64-encoded content of the tag and returns a structure with the MIME type, description, image parameters (if known), and the
        compressed image data. If the MIME type indicates the presence of an image format we recognize (JPEG, PNG, or GIF) and the actual image data contains
        the magic signature associated with that format, then the ##OpusPictureTag{@code ::format} field will be set to the corresponding format. This is
        provided as a convenience to avoid requiring applications to parse the MIME type and/or do their own format detection for the commonly used formats. In
        this case, we also attempt to extract the image parameters directly from the image data (overriding any that were present in the tag, which the
        specification says applications are not meant to rely on). The application must still provide its own support for actually decoding the image data and,
        if applicable, retrieving that data from URLs.
        """,

        OpusPictureTag.p(
            "_pic",
            """
            returns the parsed picture data.
            
            No sanitation is done on the type, MIME type, or description fields, so these might return invalid values. The contents of this structure are left
            unmodified on failure.
            """
        ),
        charASCII.const.p(
            "_tag",
            """
            the {@code METADATA_BLOCK_PICTURE} tag contents. The leading {@code "METADATA_BLOCK_PICTURE="} portion is optional, to allow the function to be
            used on either directly on the values in ##OpusTags{@code ::user_comments} or on the return value of #tags_query().
            """
        ),

        returnDoc =
        """
        0 on success, or a negative value on failure: 
        ${ul(
            "#ENOTFORMAT The METADATA_BLOCK_PICTURE contents were not valid",
            "#EFAULT There was not enough memory to store the picture tag contents"
        )}
        """
    )

    void(
        "picture_tag_init",
        """
        Initializes an {@code OpusPictureTag} structure. This should be called on a freshly allocated {@code OpusPictureTag} structure before attempting to use
        it.
        """,

        OpusPictureTag.p("_pic", "the {@code OpusPictureTag} structure to initialize")
    )

    void(
        "picture_tag_clear",
        """
        Clears the {@code OpusPictureTag} structure.
        
        This should be called on an {@code OpusPictureTag} structure after it is no longer needed. It will free all memory used by the structure members.
        """,

        OpusPictureTag.p("_pic", "the {@code OpusPictureTag} structure to clear")
    )

    /*void(
        "server_info_init",
        """
        Initializes an {@code OpusServerInfo} structure.

        All fields are set as if the corresponding header was not available.
        """,

        OpusServerInfo.p("_info", "the {@code OpusServerInfo} structure to initialize")
    )

    void(
        "server_info_clear",
        """
        Clears the {@code OpusServerInfo} structure.

        This should be called on an {@code OpusServerInfo} structure after it is no longer needed. It will free all memory used by the structure members.
        """,

        OpusServerInfo.p("_info", "the {@code OpusServerInfo} structure to clear")
    )*/

    opaque_p(
        "op_fopen",
        """
        Opens a stream with {@code fopen()} and fills in a set of callbacks that can be used to access it.
        
        This is useful to avoid writing your own portable 64-bit seeking wrappers, and also avoids cross-module linking issues on Windows, where a
        {@code FILE *} must be accessed by routines defined in the same module that opened it.
        """,

        OpusFileCallbacks.p("_cb", "the callbacks to use for this file. If there is an error opening the file, nothing will be filled in here."),
        charUTF8.const.p(
            "_path",
            """
            the path to the file to open. On Windows, this string must be UTF-8 (to allow access to files whose names cannot be represented in the current MBCS
            code page). All other systems use the native character encoding.
            """
        ),
        charASCII.const.p("_mode", "the mode to open the file in"),

        returnDoc = "a stream handle to use with the callbacks, or #NULL on error",

        noPrefix = true
    )

    opaque_p(
        "op_fdopen",
        """
        Opens a stream with {@code fdopen()} and fills in a set of callbacks that can be used to access it.
        
        This is useful to avoid writing your own portable 64-bit seeking wrappers, and also avoids cross-module linking issues on Windows, where a
        {@code FILE *} must be accessed by routines defined in the same module that opened it.
        """,

        OpusFileCallbacks.p("_cb", "the callbacks to use for this file. If there is an error opening the file, nothing will be filled in here."),
        int("_fd", "the file descriptor to open"),
        charASCII.const.p("_mode", "the mode to open the file in"),

        returnDoc = "a stream handle to use with the callbacks, or #NULL on error",

        noPrefix = true
    )

    opaque_p(
        "op_freopen",
        """
        Opens a stream with {@code freopen()} and fills in a set of callbacks that can be used to access it.
        
        This is useful to avoid writing your own portable 64-bit seeking wrappers, and also avoids cross-module linking issues on Windows, where a
        {@code FILE *} must be accessed by routines defined in the same module that opened it.
        """,

        OpusFileCallbacks.p("_cb", "the callbacks to use for this file. If there is an error opening the file, nothing will be filled in here."),
        charUTF8.const.p(
            "_path",
            """
            the path to the file to open. On Windows, this string must be UTF-8 (to allow access to files whose names cannot be represented in the current MBCS
            code page). All other systems use the native character encoding.
            """
        ),
        charASCII.const.p("_mode", "the mode to open the file in"),
        opaque_p("_stream", "a stream previously returned by #op_fopen(), #op_fdopen(), or #op_freopen()"),

        returnDoc = "a stream handle to use with the callbacks, or #NULL on error",

        noPrefix = true
    )

    opaque_p(
        "op_mem_stream_create",
        """
        Creates a stream that reads from the given block of memory.
        
        This block of memory must contain the complete stream to decode. This is useful for caching small streams (e.g., sound effects) in RAM.
        """,

        OpusFileCallbacks.p("_cb", "the callbacks to use for this stream. If there is an error creating the stream, nothing will be filled in here."),
        unsigned_char.const.p("_data", "the block of memory to read from"),
        AutoSize("_data")..size_t("_size", "the size of the block of memory"),

        returnDoc = "a stream handle to use with the callbacks, or #NULL on error",

        noPrefix = true
    )

    /*opaque_p(
        "op_url_stream_vcreate",
        """
        Creates a stream that reads from the given URL.

        This function behaves identically to #op_url_stream_create(), except that it takes a va_list instead of a variable number of arguments. It does not call
        the {@code va_end} macro, and because it invokes the {@code va_arg} macro, the value of {@code _ap} is undefined after the call.
        """,

        OpusFileCallbacks.p("_cb", "the callbacks to use for this stream. If there is an error creating the stream, nothing will be filled in here."),
        charUTF8.const.p(
            "_url",
            """
            the URL to read from.

            Currently only the {@code file :}, {@code http:}, and {@code https:} schemes are supported. Both {@code http:} and {@code https:} may be disabled
            at compile time, in which case opening such URLs will always fail. Currently this only supports URIs. IRIs should be converted to UTF-8 and
            URL-escaped, with internationalized domain names encoded in punycode, before passing them to this function.
            """
        ),
        va_list("_ap", "a list of the \"optional flags\" to use. This is a variable-length list of options terminated with #NULL."),

        returnDoc = "a stream handle to use with the callbacks, or #NULL on error",

        noPrefix = true
    )

    opaque_p(
        "op_url_stream_create",
        """
        Creates a stream that reads from the given URL.

        <b>LWJGL note</b>: This is a vararg function that should be called with {@link Functions\#op_url_stream_create op_url_stream_create} via the libffi
        bindings.
        """,

        OpusFileCallbacks.p("_cb", "the callbacks to use for this stream. If there is an error creating the stream, nothing will be filled in here."),
        charUTF8.const.p(
            "_url",
            """
            the URL to read from.

            Currently only the {@code file:}, {@code http:}, and {@code https:} schemes are supported. Both {@code http:} and {@code https:} may be disabled at
            compile time, in which case opening such URLs will always fail. Currently this only supports URIs. IRIs should be converted to UTF-8 and
            URL-escaped, with internationalized domain names encoded in punycode, before passing them to this function.
            """
        ),

        returnDoc = "a stream handle to use with the callbacks, or #NULL on error",

        noPrefix = true
    )*/

    int(
        "op_test",
        """
        Test to see if this is an Opus stream.
        
        For good results, you will need at least 57 bytes (for a pure Opus-only stream). Something like 512 bytes will give more reliable results for
        multiplexed streams. This function is meant to be a quick-rejection filter. Its purpose is not to guarantee that a stream is a valid Opus stream, but
        to ensure that it looks enough like Opus that it isn't going to be recognized as some other format (except possibly an Opus stream that is also
        multiplexed with other codecs, such as video).
        """,

        nullable..OpusHead.p(
            "_head",
            """
            the parsed ID header contents. You may pass #NULL if you do not need this information. If the function fails, the contents of this structure remain
            untouched.
            """
        ),
        unsigned_char.const.p("_initial_data", "an initial buffer of data from the start of the stream"),
        AutoSize("_initial_data")..size_t("_initial_bytes", "the number of bytes in {@code _initial_data}"),

        returnDoc =
        """
        0 if the data appears to be Opus, or a negative value on error.
        ${ul(
            "#FALSE There was not enough data to tell if this was an Opus stream or not",
            "#EFAULT An internal memory allocation failed",
            "#EIMPL The stream used a feature that is not implemented, such as an unsupported channel family",
            "#ENOTFORMAT If the data did not contain a recognizable ID header for an Opus stream",
            "#EVERSION If the version field signaled a version this library does not know how to parse",
            "#EBADHEADER The ID header was not properly formatted or contained illegal values"
        )}
        """,

        noPrefix = true
    )

    OggOpusFile.p(
        "op_open_file",
        "Open a stream from the given file path.",

        charUTF8.const.p("_path", "the path to the file to open"),
        Check(1)..nullable..int.p(
            "_error",
            """
            returns 0 on success, or a failure code on error.
            
            You may pass in #NULL if you don't want the failure code. The failure code will be #EFAULT if the file could not be opened, or one of the other
            failure codes from #op_open_callbacks() otherwise.
            """
        ),

        returnDoc = "a freshly opened {@code OggOpusFile}, or #NULL on error",

        noPrefix = true
    )

    OggOpusFile.p(
        "op_open_memory",
        "Open a stream from a memory buffer.",

        unsigned_char.const.p("_data", "the memory buffer to open"),
        AutoSize("_data")..size_t("_size", "the number of bytes in the buffer"),
        Check(1)..nullable..int.p(
            "_error",
            """
            returns 0 on success, or a failure code on error.
            
            You may pass in #NULL if you don't want the failure code. See #op_open_callbacks() for a full list of failure codes.
            """
        ),

        returnDoc = "a freshly opened {@code OggOpusFile}, or #NULL on error",

        noPrefix = true
    )

    /*OggOpusFile.p(
        "op_vopen_url",
        """
        Open a stream from a URL.

        This function behaves identically to #op_open_url(), except that it takes a {@code va_list} instead of a variable number of arguments. It does not call
        the {@code va_end} macro, and because it invokes the {@code va_arg} macro, the value of {@code _ap} is undefined after the call.
        """,

        charUTF8.const.p(
            "_url",
            """
            the URL to open.

            Currently only the {@code file:}, {@code http:}, and {@code https:} schemes are supported. Both {@code http:} and {@code https:} may be disabled at
            compile time, in which case opening such URLs will always fail. Currently this only supports URIs. IRIs should be converted to UTF-8 and
            URL-escaped, with internationalized domain names encoded in punycode, before passing them to this function.
            """
        ),
        Check(1)..nullable..int.p(
            "_error",
            """
            returns 0 on success, or a failure code on error.

            You may pass in #NULL if you don't want the failure code. See #op_open_callbacks() for a full list of failure codes.
            """
        ),
        va_list("_ap", "a list of the \"optional flags\" to use. This is a variable-length list of options terminated with #NULL."),

        returnDoc = "a freshly opened {@code OggOpusFile}, or #NULL on error",

        noPrefix = true
    )

    OggOpusFile.p(
        "op_open_url",
        """
        Open a stream from a URL.
        
        <b>LWJGL note</b>: This is a vararg function that should be called with {@link Functions\#op_open_url op_open_url} via the libffi bindings.
        """,

        charUTF8.const.p(
            "_url",
            """
            the URL to open.
            
            Currently only the {@code file:}, {@code http:}, and {@code https:} schemes are supported. Both {@code http:} and {@code https:} may be disabled at
            compile time, in which case opening such URLs will always fail. Currently this only supports URIs. IRIs should be converted to UTF-8 and
            URL-escaped, with internationalized domain names encoded in punycode, before passing them to this function.
            """
        ),
        Check(1)..nullable..int.p(
            "_error",
            """
            returns 0 on success, or a failure code on error.
            
            You may pass in #NULL if you don't want the failure code. See #op_open_callbacks() for a full list of failure codes.
            """
        ),

        returnDoc = "a freshly opened {@code OggOpusFile}, or #NULL on error",

        noPrefix = true
    )*/

    OggOpusFile.p(
        "op_open_callbacks",
        "Open a stream using the given set of callbacks to access it.",

        opaque_p(
            "_stream",
            "the stream to read from (e.g., a {@code FILE *}). This value will be passed verbatim as the first argument to all of the callbacks."
        ),
        OpusFileCallbacks.const.p(
            "_cb",
            """
            the callbacks with which to access the stream.
            
            {@code "read()"} must be implemented. {@code "seek()"} and {@code "tell()"} may be #NULL, or may always return {@code -1} to indicate a stream is
            unseekable, but if {@code "seek()"} is implemented and succeeds on a particular stream, then {@code "tell()"} must also. {@code "close()"} may be
            #NULL, but if it is not, it will be called when the {@code OggOpusFile} is destroyed by #op_free(). It will not be called if
            {@code op_open_callbacks()} fails with an error.
            """
        ),
        unsigned_char.const.p(
            "_initial_data",
            """
            an initial buffer of data from the start of the stream.
            
            Applications can read some number of bytes from the start of the stream to help identify this as an Opus stream, and then provide them here to
            allow the stream to be opened, even if it is unseekable.
            """
        ),
        AutoSize("_initial_data")..size_t(
            "_initial_bytes",
            """
            the number of bytes in {@code _initial_data}.
            
            If the stream is seekable, its current position (as reported by {@code "tell()"} at the start of this function) must be equal to
            {@code _initial_bytes}. Otherwise, seeking to absolute positions will generate inconsistent results.
            """
        ),
        Check(1)..nullable..int.p(
            "_error",
            """
            returns 0 on success, or a failure code on error.
            
            You may pass in #NULL if you don't want the failure code. The failure code will be one of:
            ${ul(
                """
                #EREAD An underlying read, seek, or tell operation failed when it should have succeeded, or we failed to find data in the stream we had seen before
                """,
                "#EFAULT There was a memory allocation failure, or an internal library error",
                "#EIMPL The stream used a feature that is not implemented, such as an unsupported channel family",
                """
                #EINVAL {@code "seek()"} was implemented and succeeded on this source, but {@code "tell()"} did not, or the starting position indicator was not
                equal to {@code _initial_bytes}
                """,
                "#ENOTFORMAT The stream contained a link that did not have any logical Opus streams in it",
                "#EBADHEADER A required header packet was not properly formatted, contained illegal values, or was missing altogether",
                "#EVERSION An ID header contained an unrecognized version number",
                "#EBADLINK We failed to find data we had seen before after seeking",
                "#EBADTIMESTAMP The first or last timestamp in a link failed basic validity checks"
            )}
            """
        ),

        returnDoc =
        """
        a freshly opened {@code OggOpusFile}, or #NULL on error.
        
        libopusfile does <em>not</em> take ownership of the stream if the call fails. The calling application is responsible for closing the stream if this
        call returns an error.
        """,

        noPrefix = true
    )

    OggOpusFile.p(
        "op_test_file",
        "Partially open a stream from the given file path.",

        charUTF8.const.p("_path", "the path to the file to open"),
        Check(1)..nullable..int.p(
            "_error",
            """
            returns 0 on success, or a failure code on error.
            
            You may pass in #NULL if you don't want the failure code. The failure code will be #EFAULT if the file could not be opened, or one of the other
            failure codes from #op_open_callbacks() otherwise.
            """
        ),

        returnDoc = "a partially opened {@code OggOpusFile}, or #NULL on error",

        noPrefix = true
    )

    OggOpusFile.p(
        "op_test_memory",
        "Partially open a stream from a memory buffer.",

        unsigned_char.const.p("_data", "the memory buffer to open"),
        AutoSize("_data")..size_t("_size", "the number of bytes in the buffer"),
        Check(1)..nullable..int.p(
            "_error",
            """
            returns 0 on success, or a failure code on error.
            
            You may pass in #NULL if you don't want the failure code. See #op_open_callbacks() for a full list of failure codes.
            """
        ),

        returnDoc = "a partially opened {@code OggOpusFile}, or #NULL on error",

        noPrefix = true
    )

    /*OggOpusFile.p(
        "op_vtest_url",
        """
        Partially open a stream from a URL.
        
        This function behaves identically to #op_test_url(), except that it takes a {@code va_list} instead of a variable number of arguments. It does not call
        the {@code va_end} macro, and because it invokes the {@code va_arg} macro, the value of {@code _ap} is undefined after the call.
        """,

        charUTF8.const.p(
            "_url",
            """
            the URL to open.
            
            Currently only the {@code file:}, {@code http:}, and {@code https:} schemes are supported. Both {@code http:} and {@code https:} may be disabled at
            compile time, in which case opening such URLs will always fail. Currently this only supports URIs. IRIs should be converted to UTF-8 and
            URL-escaped, with internationalized domain names encoded in punycode, before passing them to this function.
            """
        ),
        Check(1)..nullable..int.p(
            "_error",
            """
            returns 0 on success, or a failure code on error.
            
            You may pass in #NULL if you don't want the failure code. See #op_open_callbacks() for a full list of failure codes.
            """
        ),
        va_list("_ap", "a list of the {@code \"optional flags\"} to use. This is a variable-length list of options terminated with #NULL."),

        returnDoc = "a partially opened {@code OggOpusFile}, or #NULL on error",

        noPrefix = true
    )

    OggOpusFile.p(
        "op_test_url",
        """
        Partially open a stream from a URL.
        
        <b>LWJGL note</b>: This is a vararg function that should be called with {@link Functions\#op_test_url op_test_url} via the libffi bindings.
        """,

        charUTF8.const.p(
            "_url",
            """
            the URL to open.
            
            Currently only the {@code file:}, {@code http:}, and {@code https:} schemes are supported. Both {@code http:} and {@code https:} may be disabled at
            compile time, in which case opening such URLs will always fail. Currently this only supports URIs. IRIs should be converted to UTF-8 and
            URL-escaped, with internationalized domain names encoded in punycode, before passing them to this function.
            """
        ),
        Check(1)..nullable..int.p(
            "_error",
            """
            returns 0 on success, or a failure code on error.
            
            You may pass in #NULL if you don't want the failure code. See #op_open_callbacks() for a full list of failure codes.
            """
        ),

        returnDoc = "a partially opened {@code OggOpusFile}, or #NULL on error",

        noPrefix = true
    )*/

    OggOpusFile.p(
        "op_test_callbacks",
        """
        Partially open a stream using the given set of callbacks to access it.
        
        This tests for Opusness and loads the headers for the first link. It does not seek (although it tests for seekability). You can query a partially open
        stream for the few pieces of basic information returned by #op_serialno(), #op_channel_count(), #op_head(), and #op_tags() (but only for the first
        link). You may also determine if it is seekable via a call to #op_seekable(). You cannot read audio from the stream, seek, get the size or duration,
        get information from links other than the first one, or even get the total number of links until you finish opening the stream with #op_test_open(). If
        you do not need to do any of these things, you can dispose of it with #op_free() instead.

        This function is provided mostly to simplify porting existing code that used libvorbisfile. For new code, you are likely better off using #op_test()
        instead, which is less resource-intensive, requires less data to succeed, and imposes a hard limit on the amount of data it examines (important for
        unseekable streams, where all such data must be buffered until you are sure of the stream type).
        """,

        opaque_p(
            "_stream",
            "the stream to read from (e.g., a {@code FILE *}). This value will be passed verbatim as the first argument to all of the callbacks."
        ),
        OpusFileCallbacks.const.p(
            "_cb",
            """
            the callbacks with which to access the stream.
            
            {@code "read()"} must be implemented. {@code "seek()"} and {@code "tell()"} may be #NULL, or may always return {@code -1} to indicate a stream is
            unseekable, but if {@code "seek()"} is implemented and succeeds on a particular stream, then {@code "tell()"} must also. {@code "close()"} may be
            #NULL, but if it is not, it will be called when the {@code OggOpusFile} is destroyed by #op_free(). It will not be called if #op_open_callbacks()
            fails with an error.
            """
        ),
        unsigned_char.const.p(
            "_initial_data",
            """
            an initial buffer of data from the start of the stream.
            
            Applications can read some number of bytes from the start of the stream to help identify this as an Opus stream, and then provide them here to
            allow the stream to be tested more thoroughly, even if it is unseekable.
            """
        ),
        AutoSize("_initial_data")..size_t(
            "_initial_bytes",
            """
            the number of bytes in {@code _initial_data}.
            
            If the stream is seekable, its current position (as reported by {@code "tell()"} at the start of this function) must be equal to
            {@code _initial_bytes}. Otherwise, seeking to absolute positions will generate inconsistent results.
            """
        ),
        Check(1)..nullable..int.p(
            "_error",
            """
            returns 0 on success, or a failure code on error.
            
            You may pass in #NULL if you don't want the failure code. See #op_open_callbacks() for a full list of failure codes.
            """
        ),

        returnDoc =
        """
        a partially opened {@code OggOpusFile}, or #NULL on error.
        
        libopusfile does <em>not</em> take ownership of the stream if the call fails. The calling application is responsible for closing the stream if this
        call returns an error.
        """,

        noPrefix = true
    )

    int(
        "op_test_open",
        """
        Finish opening a stream partially opened with #op_test_callbacks() or one of the associated convenience functions.
        
        If this function fails, you are still responsible for freeing the {@code OggOpusFile} with #op_free().
        """,

        OggOpusFile.p("_of", "the {@code OggOpusFile} to finish opening"),

        returnDoc =
        """
        0 on success, or a negative value on error:
        ${ul(
            "#EREAD An underlying read, seek, or tell operation failed when it should have succeeded",
            "#EFAULT There was a memory allocation failure, or an internal library error",
            "#EIMPL The stream used a feature that is not implemented, such as an unsupported channel family",
            "#EINVAL The stream was not partially opened with #op_test_callbacks() or one of the associated convenience functions",
            "#ENOTFORMAT The stream contained a link that did not have any logical Opus streams in it",
            "#EBADHEADER A required header packet was not properly formatted, contained illegal values, or was missing altogether",
            "#EVERSION An ID header contained an unrecognized version number",
            "#EBADLINK We failed to find data we had seen before after seeking",
            "#EBADTIMESTAMP The first or last timestamp in a link failed basic validity checks"
        )}
        """,

        noPrefix = true
    )

    void(
        "op_free",
        "Release all memory used by an {@code OggOpusFile}.",

        OggOpusFile.p("_of", "the {@code OggOpusFile} to free"),

        noPrefix = true
    )

    intb(
        "op_seekable",
        """
        Returns whether or not the stream being read is seekable.
        
        This is true if
        ${ol(
            "The {@code \"seek()\"} and {@code \"tell()\"} callbacks are both non-#NULL",
            "The {@code \"seek()\"} callback was successfully executed at least once, and",
            "The {@code \"tell()\"} callback was successfully able to report the position indicator afterwards"
        )}
        
        This function may be called on partially-opened streams.
        """,

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} whose seekable status is to be returned"),

        returnDoc = "a non-zero value if seekable, and 0 if unseekable",

        noPrefix = true
    )

    int(
        "op_link_count",
        """
        Returns the number of links in this chained stream.
        
        This function may be called on partially-opened streams, but it will always return 1. The actual number of links is not known until the stream is fully
        opened.
        """,

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} from which to retrieve the link count"),

        returnDoc =
        """
        for fully-open seekable streams, this returns the total number of links in the whole stream, which will be at least 1. For partially-open or unseekable
        streams, this always returns 1.
        """,

        noPrefix = true
    )

    opus_uint32(
        "op_serialno",
        """
        Get the serial number of the given link in a (possibly-chained) Ogg Opus stream.
        
        This function may be called on partially-opened streams, but it will always return the serial number of the Opus stream in the first link.
        """,

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} from which to retrieve the serial number"),
        int("_li", "the index of the link whose serial number should be retrieved. Use a negative number to get the serial number of the current link."),

        returnDoc =
        """
        the serial number of the given link.
        
        If {@code _li} is greater than the total number of links, this returns the serial number of the last link. If the stream is not seekable, this always
        returns the serial number of the current link.
        """,

        noPrefix = true
    )

    int(
        "op_channel_count",
        """
        Get the channel count of the given link in a (possibly-chained) Ogg Opus stream.
        
        This is equivalent to {@code op_head(_of,_li)->channel_count}, but is provided for convenience. This function may be called on partially-opened
        streams, but it will always return the channel count of the Opus stream in the first link.
        """,

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} from which to retrieve the channel count"),
        int("_li", "the index of the link whose channel count should be retrieved. Use a negative number to get the channel count of the current link."),

        returnDoc =
        """
        the channel count of the given link.
        
        If {@code _li} is greater than the total number of links, this returns the channel count of the last link. If the stream is not seekable, this always
        returns the channel count of the current link.
        """,

        noPrefix = true
    )

    long_long(
        "op_raw_total",
        """
        Get the total (compressed) size of the stream, or of an individual link in a (possibly-chained) Ogg Opus stream, including all headers and Ogg muxing
        overhead.
        
        Warning: If the Opus stream (or link) is concurrently multiplexed with other logical streams (e.g., video), this returns the size of the entire stream
        (or link), not just the number of bytes in the first logical Opus stream. Returning the latter would require scanning the entire file.
        """,

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} from which to retrieve the compressed size"),
        int("_li", "the index of the link whose compressed size should be computed. Use a negative number to get the compressed size of the entire stream."),

        returnDoc =
        """
        the compressed size of the entire stream if {@code _li} is negative, the compressed size of link {@code _li} if it is non-negative, or a negative value
        on error.
        
        The compressed size of the entire stream may be smaller than that of the underlying stream if trailing garbage was detected in the file.
        
        #EINVAL The stream is not seekable (so we can't know the length),{@code #}_li wasn't less than the total number of links in the stream, or the stream
        was only partially open.
        """,

        noPrefix = true
    )

    ogg_int64_t(
        "op_pcm_total",
        """
        Get the total PCM length (number of samples at 48 kHz) of the stream, or of an individual link in a (possibly-chained) Ogg Opus stream.
        
        Users looking for {@code op_time_total()} should use {@code op_pcm_total()} instead. Because timestamps in Opus are fixed at 48 kHz, there is no need for a
        separate function to convert this to seconds (and leaving it out avoids introducing floating point to the API, for those that wish to avoid it).
        """,

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} from which to retrieve the PCM offset"),
        int("_li", "the index of the link whose PCM length should be computed. Use a negative number to get the PCM length of the entire stream."),

        returnDoc =
        """
        the PCM length of the entire stream if {@code _li} is negative, the PCM length of link {@code _li} if it is non-negative, or a negative value on error.
        
        #EINVAL The stream is not seekable (so we can't know the length), {@code _li} wasn't less than the total number of links in the stream, or the stream
        was only partially open.
        """,

        noPrefix = true
    )

    OpusHead.const.p(
        "op_head",
        """
        Get the ID header information for the given link in a (possibly chained) Ogg Opus stream.
        
        This function may be called on partially-opened streams, but it will always return the ID header information of the Opus stream in the first link.
        """,

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} from which to retrieve the ID header information"),
        int(
            "_li",
            """
            the index of the link whose ID header information should be retrieved. Use a negative number to get the ID header information of the current link.
            For an unseekable stream, {@code _li} is ignored, and the ID header information for the current link is always returned, if available.
            """
        ),

        returnDoc = "the contents of the ID header for the given link",

        noPrefix = true
    )

    OpusTags.const.p(
        "op_tags",
        """
        Get the comment header information for the given link in a (possibly chained) Ogg Opus stream.
        
        This function may be called on partially-opened streams, but it will always return the tags from the Opus stream in the first link.
        """,

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} from which to retrieve the comment header information"),
        int(
            "_li",
            """
            the index of the link whose comment header information should be retrieved. Use a negative number to get the comment header information of the
            current link. For an unseekable stream, {@code _li} is ignored, and the comment header information for the current link is always returned, if
            available.
            """
        ),

        returnDoc =
        "the contents of the comment header for the given link, or #NULL if this is an unseekable stream that encountered an invalid link",

        noPrefix = true
    )

    int(
        "op_current_link",
        """
        Retrieve the index of the current link.
        
        This is the link that produced the data most recently read by #op_read_float() or its associated functions, or, after a seek, the link that the seek
        target landed in. Reading more data may advance the link index (even on the first read after a seek).
        """,

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} from which to retrieve the current link index"),

        returnDoc =
        """
        the index of the current link on success, or a negative value on failure.
        
        For seekable streams, this is a number between 0 (inclusive) and the value returned by #op_link_count() (exclusive). For unseekable streams, this value
        starts at 0 and increments by one each time a new link is encountered (even though {@code op_link_count()} always returns 1).
        
        #EINVAL The stream was only partially open.
        """,

        noPrefix = true
    )

    opus_int32(
        "op_bitrate",
        """
        Computes the bitrate of the stream, or of an individual link in a (possibly-chained) Ogg Opus stream.
        
        The stream must be seekable to compute the bitrate. For unseekable streams, use #op_bitrate_instant() to get periodic estimates.
        
        Warning: If the Opus stream (or link) is concurrently multiplexed with other logical streams (e.g., video), this uses the size of the entire stream (or
        link) to compute the bitrate, not just the number of bytes in the first logical Opus stream. Returning the latter requires scanning the entire file,
        but this may be done by decoding the whole file and calling {@code op_bitrate_instant()} once at the end. Install a trivial decoding callback with
        #op_set_decode_callback() if you wish to skip actual decoding during this process.
        """,

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} from which to retrieve the bitrate"),
        int("_li", "the index of the link whose bitrate should be computed. Use a negative number to get the bitrate of the whole stream."),

        returnDoc =
        """
        the bitrate on success, or a negative value on error.
        
        #EINVAL The stream was only partially open, the stream was not seekable, or {@code _li} was larger than the number of links.
        """,

        noPrefix = true
    )

    opus_int32(
        "op_bitrate_instant",
        """
        Compute the instantaneous bitrate, measured as the ratio of bits to playable samples decoded since
        ${ol(
           "the last call to {@code op_bitrate_instant()},",
           "the last seek, or",
           "the start of playback, whichever was most recent.",
            marker = 'a' 
        )}
                
        This will spike somewhat after a seek or at the start/end of a chain boundary, as pre-skip, pre-roll, and end-trimming causes samples to be decoded but
        not played.
        """,

        OggOpusFile.p("_of", "the {@code OggOpusFile} from which to retrieve the bitrate"),

        returnDoc =
        """
        the bitrate, in bits per second, or a negative value on error:
        ${ul(
            "#FALSE No data has been decoded since any of the events described above",
            "#EINVAL The stream was only partially open"
        )}
        """,

        noPrefix = true
    )

    long_long(
        "op_raw_tell",
        "Obtain the current value of the position indicator for {@code _of}.",

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} from which to retrieve the position indicator"),

        returnDoc = "the byte position that is currently being read from. #EINVAL The stream was only partially open.",

        noPrefix = true
    )

    ogg_int64_t(
        "op_pcm_tell",
        """
        Obtain the PCM offset of the next sample to be read.
        
        If the stream is not properly timestamped, this might not increment by the proper amount between reads, or even return monotonically increasing values.
        """,

        OggOpusFile.const.p("_of", "the {@code OggOpusFile} from which to retrieve the PCM offset"),

        returnDoc = "the PCM offset of the next sample to be read. #EINVAL The stream was only partially open.",

        noPrefix = true
    )

    int(
        "op_raw_seek",
        """
        Seek to a byte offset relative to the <b>compressed</b> data.
        
        This also scans packets to update the PCM cursor. It will cross a logical bitstream boundary, but only if it can't get any packets out of the tail of
        the link to which it seeks.
        """,

        OggOpusFile.p("_of", "the {@code OggOpusFile} in which to seek"),
        long_long("_byte_offset", "the byte position to seek to. This must be between 0 and {@code op_raw_total(_of, -1)} (inclusive)."),

        returnDoc =
        """
        0 on success, or a negative error code on failure:
        ${ul(
            "#EREAD The underlying seek operation failed",
            "#EINVAL The stream was only partially open, or the target was outside the valid range for the stream",
            "#ENOSEEK This stream is not seekable",
            "#EBADLINK Failed to initialize a decoder for a stream for an unknown reason"
        )}
        """,

        noPrefix = true
    )

    int(
        "op_pcm_seek",
        "Seek to the specified PCM offset, such that decoding will begin at exactly the requested position.",

        OggOpusFile.p("_of", "the {@code OggOpusFile} in which to seek"),
        ogg_int64_t("_pcm_offset", "the PCM offset to seek to. This is in samples at 48 kHz relative to the start of the stream."),

        returnDoc =
        """
        0 on success, or a negative value on error:
        ${ul(
            "#EREAD An underlying read or seek operation failed",
            "#EINVAL The stream was only partially open, or the target was outside the valid range for the stream",
            "#ENOSEEK This stream is not seekable",
            """
            #EBADLINK We failed to find data we had seen before, or the bitstream structure was sufficiently malformed that seeking to the target destination
            was impossible
            """
        )}
        """,

        noPrefix = true
    )

    void(
        "op_set_decode_callback",
        """
        Sets the packet decode callback function.
        
        If set, this is called once for each packet that needs to be decoded. This can be used by advanced applications to do additional processing on the
        compressed or uncompressed data. For example, an application might save the final entropy coder state for debugging and testing purposes, or it might
        apply additional filters before the downmixing, dithering, or soft-clipping performed by {@code libopusfile}, so long as these filters do not introduce
        any latency.

        A call to this function is no guarantee that the audio will eventually be delivered to the application. libopusfile may discard some or all of the
        decoded audio data (i.e., at the beginning or end of a link, or after a seek), however the callback is still required to provide all of it.
        """,

        OggOpusFile.p("_of", "the {@code OggOpusFile} on which to set the decode callback"),
        op_decode_cb_func("_decode_cb", "the callback function to call. This may be #NULL to disable calling the callback."),
        opaque_p("_ctx", "the application-provided context pointer to pass to the callback on each call"),

        noPrefix = true
    )

    int(
        "op_set_gain_offset",
        """
        Sets the gain to be used for decoded output.
        
        By default, the gain in the header is applied with no additional offset. The total gain (including header gain and/or track gain, if applicable, and
        this offset), will be clamped to {@code [-32768,32767]/256} dB. This is more than enough to saturate or underflow 16-bit PCM.

        ${note("""
        The new gain will not be applied to any already buffered, decoded output. This means you cannot change it sample-by-sample, as at best it
        will be updated packet-by-packet. It is meant for setting a target volume level, rather than applying smooth fades, etc.
        """)}
        """,

        OggOpusFile.p("_of", "the {@code OggOpusFile} on which to set the gain offset"),
        int("_gain_type", "", "#HEADER_GAIN, #ALBUM_GAIN, #TRACK_GAIN #ABSOLUTE_GAIN"),
        opus_int32("_gain_offset_q8", "the gain offset to apply, in {@code 1/256ths} of a dB"),

        returnDoc = "0 on success or a negative value on error. #EINVAL The {@code _gain_type} was unrecognized.",

        noPrefix = true
    )

    void(
        "op_set_dither_enabled",
        """
        Sets whether or not dithering is enabled for 16-bit decoding.
        
        By default, when libopusfile is compiled to use floating-point internally, calling #op_read() or #op_read_stereo() will first decode to float, and then
        convert to fixed-point using noise-shaping dithering. This flag can be used to disable that dithering. When the application uses #op_read_float() or
        #op_read_float_stereo(), or when the library has been compiled to decode directly to fixed point, this flag has no effect.
        """,

        OggOpusFile.p("_of", "the {@code OggOpusFile} on which to enable or disable dithering"),
        intb("_enabled", "a non-zero value to enable dithering, or 0 to disable it"),

        noPrefix = true
    )

    int(
        "op_read",
        """
        Reads more samples from the stream.

        ${note("""
        Although {@code _buf_size} must indicate the total number of values that can be stored in {@code _pcm}, the return value is the number of samples
        <em>per channel</em>. This is done because
        ${ol(
            """
            The channel count cannot be known a priori (reading more samples might advance us into the next link, with a different channel count), so
            {@code _buf_size} cannot also be in units of samples per channel
            """,
            "Returning the samples per channel matches the libopus API as closely as we're able",
            """
            Returning the total number of values instead of samples per channel would mean the caller would need a division to compute the samples per channel,
            and might worry about the possibility of getting back samples for some channels and not others, and 
            """,
            """
            This approach is relatively fool-proof: if an application passes too small a value to {@code _buf_size}, they will simply get fewer samples back,
            and if they assume the return value is the total number of values, then they will simply read too few (rather than reading too many and going off
            the end of the buffer)
            """
        )}
        """)}
        """,

        OggOpusFile.p("_of", "the {@code OggOpusFile} from which to read"),
        opus_int16.p(
            "_pcm",
            """
            a buffer in which to store the output PCM samples, as signed native-endian 16-bit values at 48 kHz with a nominal range of {@code [-32768,32767)}.
            Multiple channels are interleaved using the ${url("https://www.xiph.org/vorbis/doc/Vorbis_I_spec.html\\#x1-810004.3.9", "Vorbis channel ordering")}.
            This must have room for at least {@code _buf_size} values.
            """
        ),
        AutoSize("_pcm")..int(
            "_buf_size",
            """
            the number of values that can be stored in {@code _pcm}.
            
            It is recommended that this be large enough for at least 120 ms of data at 48 kHz per channel (5760 values per channel). Smaller buffers will
            simply return less data, possibly consuming more memory to buffer the data internally. libopusfile may return less data than requested. If so,
            there is no guarantee that the remaining data in {@code _pcm} will be unmodified.
            """
        ),
        Check(1)..nullable..int.p(
            "_li",
            """
            the index of the link this data was decoded from.
            
            You may pass #NULL if you do not need this information. If this function fails (returning a negative value), this parameter is left unset.
            """
        ),

        returnDoc =
        """
        the number of samples read per channel on success, or a negative value on failure.
        
        The channel count can be retrieved on success by calling {@code op_head(_of,*_li)}. The number of samples returned may be 0 if the buffer was too small
        to store even a single sample for all channels, or if end-of-file was reached. The list of possible failure codes follows. Most of them can only be
        returned by unseekable, chained streams that encounter a new link.
        ${ul(
            "#HOLE There was a hole in the data, and some samples may have been skipped. Call this function again to continue decoding past the hole",
            "#EREAD An underlying read operation failed. This may signal a truncation attack from an {@code https:} source",
            "#EFAULT An internal memory allocation failed",
            "#EIMPL An unseekable stream encountered a new link that used a feature that is not implemented, such as an unsupported channel family",
            "#EINVAL The stream was only partially open",
            "#ENOTFORMAT An unseekable stream encountered a new link that did not have any logical Opus streams in it",
            """
            #EBADHEADER An unseekable stream encountered a new link with a required header packet that was not properly formatted, contained illegal values, or
            was missing altogether
            """,
            "#EVERSION An unseekable stream encountered a new link with an ID header that contained an unrecognized version number",
            "#EBADPACKET Failed to properly decode the next packet",
            "#EBADLINK We failed to find data we had seen before",
            "#EBADTIMESTAMP An unseekable stream encountered a new link with a starting timestamp that failed basic validity checks"
        )}
        """,

        noPrefix = true
    )

    int(
        "op_read_float",
        """
        Reads more samples from the stream.

        ${note("""
        Although {@code _buf_size} must indicate the total number of values that can be stored in {@code _pcm}, the return value is the number of samples
        <em>per channel</em>.
        ${ol(
            """
            The channel count cannot be known a priori (reading more samples might advance us into the next link, with a different channel count), so
            {@code _buf_size} cannot also be in units of samples per channel,
            """,
            "Returning the samples per channel matches the libopus API as closely as we're able,",
            """
            Returning the total number of values instead of samples per channel would mean the caller would need a division to compute the samples per channel,
            and might worry about the possibility of getting back samples for some channels and not others, and
            """,
            """
            This approach is relatively fool-proof: if an application passes too small a value to {@code _buf_size}, they will simply get fewer samples back,
            and if they assume the return value is the total number of values, then they will simply read too few (rather than reading too many and going off
            the end of the buffer).
            """
        )}
        """)}
        """,

        OggOpusFile.p("_of", "the {@code OggOpusFile} from which to read"),
        float.p(
            "_pcm",
            """
            a buffer in which to store the output PCM samples as signed floats at 48 kHz with a nominal range of {@code [-1.0,1.0]}.
            
            Multiple channels are interleaved using the ${url("https://www.xiph.org/vorbis/doc/Vorbis_I_spec.html\\#x1-810004.3.9", "Vorbis channel ordering")}.
            This must have room for at least {@code _buf_size} floats.
            """
        ),
        AutoSize("_pcm")..int(
            "_buf_size",
            """
            the number of floats that can be stored in {@code _pcm}.
            
            It is recommended that this be large enough for at least 120 ms of data at 48 kHz per channel (5760 samples per channel). Smaller buffers will
            simply return less data, possibly consuming more memory to buffer the data internally. If less than {@code _buf_size} values are returned,
            libopusfile makes no guarantee that the remaining data in {@code _pcm} will be unmodified.
            """
        ),
        Check(1)..nullable..int.p(
            "_li",
            """
            the index of the link this data was decoded from.
            
            You may pass #NULL if you do not need this information. If this function fails (returning a negative value), this parameter is left unset.
            """
        ),

        returnDoc =
        """
        the number of samples read per channel on success, or a negative value on failure.
        
        The channel count can be retrieved on success by calling {@code op_head(_of,*_li)}. The number of samples returned may be 0 if the buffer was too small
        to store even a single sample for all channels, or if end-of-file was reached. The list of possible failure codes follows. Most of them can only be
        returned by unseekable, chained streams that encounter a new link.
        
        ${ul(
            "#HOLE There was a hole in the data, and some samples may have been skipped. Call this function again to continue decoding past the hole",
            "#EREAD An underlying read operation failed. This may signal a truncation attack from an {@code https:} source",
            "#EFAULT An internal memory allocation failed",
            "#EIMPL An unseekable stream encountered a new link that used a feature that is not implemented, such as an unsupported channel family",
            "#EINVAL The stream was only partially open",
            "#ENOTFORMAT An unseekable stream encountered a new link that did not have any logical Opus streams in it",
            """
            #EBADHEADER An unseekable stream encountered a new link with a required header packet that was not properly formatted, contained illegal values, or
            was missing altogether
            """,
            "#EVERSION An unseekable stream encountered a new link with an ID header that contained an unrecognized version number",
            "#EBADPACKET Failed to properly decode the next packet",
            "#EBADLINK We failed to find data we had seen before",
            "#EBADTIMESTAMP An unseekable stream encountered a new link with a starting timestamp that failed basic validity checks"
        )}
        """,

        noPrefix = true
    )

    int(
        "op_read_stereo",
        """
        Reads more samples from the stream and downmixes to stereo, if necessary.
        
        This function is intended for simple players that want a uniform output format, even if the channel count changes between links in a chained stream.

        ${note("""
        {@code _buf_size} indicates the total number of values that can be stored in {@code _pcm}, while the return value is the number of samples <em>per
        channel</em>, even though the channel count is known, for consistency with #op_read().
        """)}
        """,

        OggOpusFile.p("_of", "the {@code OggOpusFile} from which to read"),
        opus_int16.p(
            "_pcm",
            """
            a buffer in which to store the output PCM samples, as signed native-endian 16-bit values at 48 kHz with a nominal range of {@code [-32768,32767)}.
            
            The left and right channels are interleaved in the buffer. This must have room for at least {@code _buf_size} values.
            """
        ),
        AutoSize("_pcm")..int(
            "_buf_size",
            """
            the number of values that can be stored in {@code _pcm}.
            
            It is recommended that this be large enough for at least 120 ms of data at 48 kHz per channel (11520 values total). Smaller buffers will simply
            return less data, possibly consuming more memory to buffer the data internally. If less than {@code _buf_size} values are returned, libopusfile
            makes no guarantee that the remaining data in {@code _pcm} will be unmodified.
            """
        ),

        returnDoc =
        """
        the number of samples read per channel on success, or a negative value on failure.
        
        The number of samples returned may be 0 if the buffer was too small to store even a single sample for both channels, or if end-of-file was reached.
        The list of possible failure codes follows. Most of them can only be returned by unseekable, chained streams that encounter a new link.
        ${ul(
            "#HOLE There was a hole in the data, and some samples may have been skipped. Call this function again to continue decoding past the hole",
            "#EREAD An underlying read operation failed. This may signal a truncation attack from an {@code https:} source",
            "#EFAULT An internal memory allocation failed",
            "#EIMPL An unseekable stream encountered a new link that used a feature that is not implemented, such as an unsupported channel family",
            "#EINVAL The stream was only partially open",
            "#ENOTFORMAT An unseekable stream encountered a new link that did not have any logical Opus streams in it",
            """
            #EBADHEADER An unseekable stream encountered a new link with a required header packet that was not properly formatted, contained illegal values, or
            was missing altogether
            """,
            "#EVERSION An unseekable stream encountered a new link with an ID header that contained an unrecognized version number",
            "#EBADPACKET Failed to properly decode the next packet",
            "#EBADLINK We failed to find data we had seen before",
            "#EBADTIMESTAMP An unseekable stream encountered a new link with a starting timestamp that failed basic validity checks"
        )}
        """,

        noPrefix = true
    )

    int(
        "op_read_float_stereo",
        """
        Reads more samples from the stream and downmixes to stereo, if necessary.
        
        This function is intended for simple players that want a uniform output format, even if the channel count changes between links in a chained stream.

        ${note("""
        {@code _buf_size} indicates the total number of values that can be stored in {@code _pcm}, while the return value is the number of samples <em>per
        channel</em>, even though the channel count is known, for consistency with #op_read_float().
        """)}
        """,

        OggOpusFile.p("_of", "the {@code OggOpusFile} from which to read"),
        float.p(
            "_pcm",
            """
            a buffer in which to store the output PCM samples, as signed floats at 48 kHz with a nominal range of {@code [-1.0,1.0]}.
            
            The left and right channels are interleaved in the buffer. This must have room for at least {@code _buf_size} values.
            """
        ),
        AutoSize("_pcm")..int(
            "_buf_size",
            """
            the number of values that can be stored in {@code _pcm}.
            
            It is recommended that this be large enough for at least 120 ms of data at 48 kHz per channel (11520 values total). Smaller buffers will simply
            return less data, possibly consuming more memory to buffer the data internally. If less than {@code _buf_size} values are returned, libopusfile
            makes no guarantee that the remaining data in {@code _pcm} will be unmodified.
            """
        ),

        returnDoc =
        """
        the number of samples read per channel on success, or a negative value on failure.

        The number of samples returned may be 0 if the buffer was too small to store even a single sample for both channels, or if end-of-file was reached. The
        list of possible failure codes follows. Most of them can only be returned by unseekable, chained streams that encounter a new link.
        ${ul(
            "#HOLE There was a hole in the data, and some samples may have been skipped. Call this function again to continue decoding past the hole",
            "#EREAD An underlying read operation failed. This may signal a truncation attack from an {@code https:} source",
            "#EFAULT An internal memory allocation failed",
            "#EIMPL An unseekable stream encountered a new link that used a feature that is not implemented, such as an unsupported channel family",
            "#EINVAL The stream was only partially open",
            "#ENOTFORMAT An unseekable stream encountered a new link that that did not have any logical Opus streams in it",
            """
            #EBADHEADER An unseekable stream encountered a new link with a required header packet that was not properly formatted, contained illegal values, or
            was missing altogether
            """,
            "#EVERSION An unseekable stream encountered a new link with an ID header that contained an unrecognized version number",
            "#EBADPACKET Failed to properly decode the next packet",
            "#EBADLINK We failed to find data we had seen before",
            "#EBADTIMESTAMP An unseekable stream encountered a new link with a starting timestamp that failed basic validity checks"
        )}
        """,

        noPrefix = true
    )
}
