/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Introduction</h3>
 * 
 * <p>This is the documentation for the <b>libopusfile</b> C API.</p>
 * 
 * <p>The libopusfile package provides a convenient high-level API for decoding and basic manipulation of all Ogg Opus audio streams. libopusfile is
 * implemented as a layer on top of Xiph.Org's reference <a target="_blank" href="https://www.xiph.org/ogg/doc/libogg/reference.html">libogg</a> and
 * <a target="_blank" href="https://opus-codec.org/docs/opus_api-1.3.1/">libopus</a> libraries.</p>
 * 
 * <p>libopusfile provides several sets of built-in routines for file/stream access, and may also use custom stream I/O routines provided by the embedded
 * environment. There are built-in I/O routines provided for ANSI-compliant {@code stdio} ({@code FILE *}), memory buffers, and URLs (including
 * {@code file:} URLs, plus optionally {@code http:} and {@code https:} URLs).</p>
 * 
 * <h3>Organization</h3>
 * 
 * <p>The main API is divided into several sections:</p>
 * 
 * <ul>
 * <li>stream_open_close</li>
 * <li>stream_info</li>
 * <li>stream_decoding</li>
 * <li>stream_seeking</li>
 * </ul>
 * 
 * <p>Several additional sections are not tied to the main API.</p>
 * 
 * <ul>
 * <li>stream_callbacks</li>
 * <li>header_info</li>
 * <li>error_codes</li>
 * </ul>
 * 
 * <h3>Overview</h3>
 * 
 * <p>The libopusfile API always decodes files to 48 kHz. The original sample rate is not preserved by the lossy compression, though it is stored in the
 * header to allow you to resample to it after decoding (the libopusfile API does not currently provide a resampler, but the
 * <a target="_blank" href="https://www.speex.org/docs/manual/speex-manual/node7.html#SECTION00760000000000000000">the Speex resampler</a> is a good choice if you need
 * one). In general, if you are playing back the audio, you should leave it at 48 kHz, provided your audio hardware supports it. When decoding to a file,
 * it may be worth resampling back to the original sample rate, so as not to surprise users who might not expect the sample rate to change after encoding
 * to Opus and decoding.</p>
 * 
 * <p>Opus files can contain anywhere from 1 to 255 channels of audio. The channel mappings for up to 8 channels are the same as the
 * <a target="_blank" href="https://www.xiph.org/vorbis/doc/Vorbis_I_spec.html#x1-810004.3.9">Vorbis mappings</a>. A special stereo API can convert everything to 2
 * channels, making it simple to support multichannel files in an application which only has stereo output. Although the libopusfile ABI provides support
 * for the theoretical maximum number of channels, the current implementation does not support files with more than 8 channels, as they do not have
 * well-defined channel mappings.</p>
 * 
 * <p>Like all Ogg files, Opus files may be "chained". That is, multiple Opus files may be combined into a single, longer file just by concatenating the
 * original files. This is commonly done in internet radio streaming, as it allows the title and artist to be updated each time the song changes, since
 * each link in the chain includes its own set of metadata.</p>
 * 
 * <p>libopusfile fully supports chained files. It will decode the first Opus stream found in each link of a chained file (ignoring any other streams that
 * might be concurrently multiplexed with it, such as a video stream).</p>
 * 
 * <p>The channel count can also change between links. If your application is not prepared to deal with this, it can use the stereo API to ensure the audio
 * from all links will always get decoded into a common format. Since libopusfile always decodes to 48 kHz, you do not have to worry about the sample rate
 * changing between links (as was possible with Vorbis). This makes application support for chained files with libopusfile very easy.</p>
 */
public class OpusFile {

    /** Contains the function pointers loaded from {@code Opus.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            head_parse             = apiGetFunctionAddress(Opus.getLibrary(), "opus_head_parse"),
            granule_sample         = apiGetFunctionAddress(Opus.getLibrary(), "opus_granule_sample"),
            tags_parse             = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_parse"),
            tags_copy              = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_copy"),
            tags_init              = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_init"),
            tags_add               = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_add"),
            tags_add_comment       = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_add_comment"),
            tags_set_binary_suffix = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_set_binary_suffix"),
            tags_query             = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_query"),
            tags_query_count       = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_query_count"),
            tags_get_binary_suffix = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_get_binary_suffix"),
            tags_get_album_gain    = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_get_album_gain"),
            tags_get_track_gain    = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_get_track_gain"),
            tags_clear             = apiGetFunctionAddress(Opus.getLibrary(), "opus_tags_clear"),
            tagcompare             = apiGetFunctionAddress(Opus.getLibrary(), "opus_tagcompare"),
            tagncompare            = apiGetFunctionAddress(Opus.getLibrary(), "opus_tagncompare"),
            picture_tag_parse      = apiGetFunctionAddress(Opus.getLibrary(), "opus_picture_tag_parse"),
            picture_tag_init       = apiGetFunctionAddress(Opus.getLibrary(), "opus_picture_tag_init"),
            picture_tag_clear      = apiGetFunctionAddress(Opus.getLibrary(), "opus_picture_tag_clear"),
            op_fopen               = apiGetFunctionAddress(Opus.getLibrary(), "op_fopen"),
            op_fdopen              = apiGetFunctionAddress(Opus.getLibrary(), "op_fdopen"),
            op_freopen             = apiGetFunctionAddress(Opus.getLibrary(), "op_freopen"),
            op_mem_stream_create   = apiGetFunctionAddress(Opus.getLibrary(), "op_mem_stream_create"),
            op_test                = apiGetFunctionAddress(Opus.getLibrary(), "op_test"),
            op_open_file           = apiGetFunctionAddress(Opus.getLibrary(), "op_open_file"),
            op_open_memory         = apiGetFunctionAddress(Opus.getLibrary(), "op_open_memory"),
            op_open_callbacks      = apiGetFunctionAddress(Opus.getLibrary(), "op_open_callbacks"),
            op_test_file           = apiGetFunctionAddress(Opus.getLibrary(), "op_test_file"),
            op_test_memory         = apiGetFunctionAddress(Opus.getLibrary(), "op_test_memory"),
            op_test_callbacks      = apiGetFunctionAddress(Opus.getLibrary(), "op_test_callbacks"),
            op_test_open           = apiGetFunctionAddress(Opus.getLibrary(), "op_test_open"),
            op_free                = apiGetFunctionAddress(Opus.getLibrary(), "op_free"),
            op_seekable            = apiGetFunctionAddress(Opus.getLibrary(), "op_seekable"),
            op_link_count          = apiGetFunctionAddress(Opus.getLibrary(), "op_link_count"),
            op_serialno            = apiGetFunctionAddress(Opus.getLibrary(), "op_serialno"),
            op_channel_count       = apiGetFunctionAddress(Opus.getLibrary(), "op_channel_count"),
            op_raw_total           = apiGetFunctionAddress(Opus.getLibrary(), "op_raw_total"),
            op_pcm_total           = apiGetFunctionAddress(Opus.getLibrary(), "op_pcm_total"),
            op_head                = apiGetFunctionAddress(Opus.getLibrary(), "op_head"),
            op_tags                = apiGetFunctionAddress(Opus.getLibrary(), "op_tags"),
            op_current_link        = apiGetFunctionAddress(Opus.getLibrary(), "op_current_link"),
            op_bitrate             = apiGetFunctionAddress(Opus.getLibrary(), "op_bitrate"),
            op_bitrate_instant     = apiGetFunctionAddress(Opus.getLibrary(), "op_bitrate_instant"),
            op_raw_tell            = apiGetFunctionAddress(Opus.getLibrary(), "op_raw_tell"),
            op_pcm_tell            = apiGetFunctionAddress(Opus.getLibrary(), "op_pcm_tell"),
            op_raw_seek            = apiGetFunctionAddress(Opus.getLibrary(), "op_raw_seek"),
            op_pcm_seek            = apiGetFunctionAddress(Opus.getLibrary(), "op_pcm_seek"),
            op_set_decode_callback = apiGetFunctionAddress(Opus.getLibrary(), "op_set_decode_callback"),
            op_set_gain_offset     = apiGetFunctionAddress(Opus.getLibrary(), "op_set_gain_offset"),
            op_set_dither_enabled  = apiGetFunctionAddress(Opus.getLibrary(), "op_set_dither_enabled"),
            op_read                = apiGetFunctionAddress(Opus.getLibrary(), "op_read"),
            op_read_float          = apiGetFunctionAddress(Opus.getLibrary(), "op_read_float"),
            op_read_stereo         = apiGetFunctionAddress(Opus.getLibrary(), "op_read_stereo"),
            op_read_float_stereo   = apiGetFunctionAddress(Opus.getLibrary(), "op_read_float_stereo");

    }

    /**
     * Error codes.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OP_FALSE FALSE} - A request did not succeed.</li>
     * <li>{@link #OP_EOF EOF} - Currently not used externally.</li>
     * <li>{@link #OP_HOLE HOLE} - There was a hole in the page sequence numbers (e.g., a page was corrupt or missing).</li>
     * <li>{@link #OP_EREAD EREAD} - An underlying read, seek, or tell operation failed when it should have succeeded.</li>
     * <li>{@link #OP_EFAULT EFAULT} - A {@code NULL} pointer was passed where one was unexpected, or an internal memory allocation failed, or an internal library error was encountered.</li>
     * <li>{@link #OP_EIMPL EIMPL} - The stream used a feature that is not implemented, such as an unsupported channel family.</li>
     * <li>{@link #OP_EINVAL EINVAL} - One or more parameters to a function were invalid.</li>
     * <li>{@link #OP_ENOTFORMAT ENOTFORMAT} - 
     * A purported Ogg Opus stream did not begin with an Ogg page, a purported header packet did not start with one of the required strings, "OpusHead" or
     * "OpusTags", or a link in a chained file was encountered that did not contain any logical Opus streams.
     * </li>
     * <li>{@link #OP_EBADHEADER EBADHEADER} - A required header packet was not properly formatted, contained illegal values, or was missing altogether.</li>
     * <li>{@link #OP_EVERSION EVERSION} - The ID header contained an unrecognized version number</li>
     * <li>{@link #OP_ENOTAUDIO ENOTAUDIO} - Currently not used at all.</li>
     * <li>{@link #OP_EBADPACKET EBADPACKET} - 
     * An audio packet failed to decode properly. This is usually caused by a multistream Ogg packet where the durations of the individual Opus packets
     * contained in it are not all the same.
     * </li>
     * <li>{@link #OP_EBADLINK EBADLINK} - 
     * We failed to find data we had seen before, or the bitstream structure was sufficiently malformed that seeking to the target destination was
     * impossible.
     * </li>
     * <li>{@link #OP_ENOSEEK ENOSEEK} - An operation that requires seeking was requested on an unseekable stream.</li>
     * <li>{@link #OP_EBADTIMESTAMP EBADTIMESTAMP} - The first or last granule position of a link failed basic validity checks.</li>
     * </ul>
     */
    public static final int
        OP_FALSE         = -1,
        OP_EOF           = -2,
        OP_HOLE          = -3,
        OP_EREAD         = -128,
        OP_EFAULT        = -129,
        OP_EIMPL         = -130,
        OP_EINVAL        = -131,
        OP_ENOTFORMAT    = -132,
        OP_EBADHEADER    = -133,
        OP_EVERSION      = -134,
        OP_ENOTAUDIO     = -135,
        OP_EBADPACKET    = -136,
        OP_EBADLINK      = -137,
        OP_ENOSEEK       = -138,
        OP_EBADTIMESTAMP = -139;

    public static final int OPUS_CHANNEL_COUNT_MAX = 255;

    /**
     * Picture tag image formats.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OP_PIC_FORMAT_UNKNOWN PIC_FORMAT_UNKNOWN} - The MIME type was not recognized, or the image data did not match the declared MIME type.</li>
     * <li>{@link #OP_PIC_FORMAT_URL PIC_FORMAT_URL} - The MIME type indicates the image data is really a URL.</li>
     * <li>{@link #OP_PIC_FORMAT_JPEG PIC_FORMAT_JPEG} - The image is a JPEG.</li>
     * <li>{@link #OP_PIC_FORMAT_PNG PIC_FORMAT_PNG} - The image is a PNG.</li>
     * <li>{@link #OP_PIC_FORMAT_GIF PIC_FORMAT_GIF} - The image is a GIF.</li>
     * </ul>
     */
    public static final int
        OP_PIC_FORMAT_UNKNOWN = -1,
        OP_PIC_FORMAT_URL     = 0,
        OP_PIC_FORMAT_JPEG    = 1,
        OP_PIC_FORMAT_PNG     = 2,
        OP_PIC_FORMAT_GIF     = 3;

    /** These are the raw numbers used to define the request codes. They should not be used directly. */
    public static final int
        OP_SSL_SKIP_CERTIFICATE_CHECK_REQUEST = 6464,
        OP_HTTP_PROXY_HOST_REQUEST            = 6528,
        OP_HTTP_PROXY_PORT_REQUEST            = 6592,
        OP_HTTP_PROXY_USER_REQUEST            = 6656,
        OP_HTTP_PROXY_PASS_REQUEST            = 6720,
        OP_GET_SERVER_INFO_REQUEST            = 6784;

    /** Indicates that the decoding callback should produce signed 16-bit native-endian output samples. */
    public static final int OP_DEC_FORMAT_SHORT = 7008;

    /** Indicates that the decoding callback should produce 32-bit native-endian float samples. */
    public static final int OP_DEC_FORMAT_FLOAT = 7040;

    /** Indicates that the decoding callback did not decode anything, and that libopusfile should decode normally instead. */
    public static final int OP_DEC_USE_DEFAULT = 6720;

    /**
     * Gain offset type that indicates that the provided offset is relative to the header gain.
     * 
     * <p>This is the default.</p>
     */
    public static final int OP_HEADER_GAIN = 0;

    /** Gain offset type that indicates that the provided offset is relative to the {@code R128_ALBUM_GAIN} value (if any), in addition to the header gain. */
    public static final int OP_ALBUM_GAIN = 3007;

    /** Gain offset type that indicates that the provided offset is relative to the {@code R128_TRACK_GAIN} value (if any), in addition to the header gain. */
    public static final int OP_TRACK_GAIN = 3008;

    /** Gain offset type that indicates that the provided offset should be used as the gain directly, without applying any the header or track gains. */
    public static final int OP_ABSOLUTE_GAIN = 3009;

    protected OpusFile() {
        throw new UnsupportedOperationException();
    }

    // --- [ opus_head_parse ] ---

    /**
     * Unsafe version of: {@link #opus_head_parse head_parse}
     *
     * @param _len the number of bytes of data in the ID header packet
     */
    public static int nopus_head_parse(long _head, long _data, long _len) {
        long __functionAddress = Functions.head_parse;
        return invokePPPI(_head, _data, _len, __functionAddress);
    }

    /**
     * Parses the contents of the ID header packet of an Ogg Opus stream.
     *
     * @param _head returns the contents of the parsed packet. The contents of this structure are untouched on error. This may be {@code NULL} to merely test the header for
     *              validity.
     * @param _data the contents of the ID header packet
     *
     * @return 0 on success or a negative value on error:
     *         
     *         <ul>
     *         <li>{@link #OP_ENOTFORMAT ENOTFORMAT} If the data does not start with the "OpusHead" string.</li>
     *         <li>{@link #OP_EVERSION EVERSION} If the version field signaled a version this library does not know how to parse.</li>
     *         <li>{@link #OP_EIMPL EIMPL} If the channel mapping family was 255, which general purpose players should not attempt to play.</li>
     *         <li>{@link #OP_EBADHEADER EBADHEADER} If the contents of the packet otherwise violate the Ogg Opus specification:
     *         
     *         <ul>
     *         <li>Insufficient data</li>
     *         <li>Too much data for the known minor versions</li>
     *         <li>An unrecognized channel mapping family</li>
     *         <li>Zero channels or too many channels</li>
     *         <li>Zero coded streams</li>
     *         <li>Too many coupled streams, or</li>
     *         <li>An invalid channel mapping index</li>
     *         </ul></li>
     *         </ul>
     */
    public static int opus_head_parse(@NativeType("OpusHead *") OpusHead _head, @NativeType("unsigned char const *") ByteBuffer _data) {
        return nopus_head_parse(_head.address(), memAddress(_data), _data.remaining());
    }

    // --- [ opus_granule_sample ] ---

    /** Unsafe version of: {@link #opus_granule_sample granule_sample} */
    public static long nopus_granule_sample(long _head, long _gp) {
        long __functionAddress = Functions.granule_sample;
        return invokePJJ(_head, _gp, __functionAddress);
    }

    /**
     * Converts a granule position to a sample offset for a given Ogg Opus stream.
     * 
     * <p>The sample offset is simply {@code _gp-_head->pre_skip}. Granule position values smaller than {@link OpusHead}{@code ::pre_skip} correspond to audio that
     * should never be played, and thus have no associated sample offset. This function returns {@code -1} for such values. This function also correctly
     * handles extremely large granule positions, which may have wrapped around to a negative number when stored in a signed {@code ogg_int64_t} value.</p>
     *
     * @param _head the {@code OpusHead} information from the ID header of the stream
     * @param _gp   the granule position to convert
     *
     * @return the sample offset associated with the given granule position (counting at a 48 kHz sampling rate), or the special value {@code -1} on error (i.e., the
     *         granule position was smaller than the pre-skip amount)
     */
    @NativeType("ogg_int64_t")
    public static long opus_granule_sample(@NativeType("OpusHead const *") OpusHead _head, @NativeType("ogg_int64_t") long _gp) {
        return nopus_granule_sample(_head.address(), _gp);
    }

    // --- [ opus_tags_parse ] ---

    /**
     * Unsafe version of: {@link #opus_tags_parse tags_parse}
     *
     * @param _len the number of bytes of data in the 'info' header packet
     */
    public static int nopus_tags_parse(long _tags, long _data, long _len) {
        long __functionAddress = Functions.tags_parse;
        return invokePPPI(_tags, _data, _len, __functionAddress);
    }

    /**
     * Parses the contents of the 'comment' header packet of an Ogg Opus stream.
     *
     * @param _tags an uninitialized {@code OpusTags} structure. This returns the contents of the parsed packet. The contents of this structure are untouched on error.
     *              This may be {@code NULL} to merely test the header for validity.
     * @param _data the contents of the 'comment' header packet
     *
     * @return <ul>
     *         <li>{@code 0}: Success</li>
     *         <li>{@link #OP_ENOTFORMAT ENOTFORMAT} If the data does not start with the "OpusTags" string</li>
     *         <li>{@link #OP_EBADHEADER EBADHEADER} If the contents of the packet otherwise violate the Ogg Opus specification</li>
     *         <li>{@link #OP_EFAULT EFAULT} If there wasn't enough memory to store the tags</li>
     *         </ul>
     */
    public static int opus_tags_parse(@Nullable @NativeType("OpusTags *") OpusTags _tags, @NativeType("unsigned char const *") ByteBuffer _data) {
        return nopus_tags_parse(memAddressSafe(_tags), memAddress(_data), _data.remaining());
    }

    // --- [ opus_tags_copy ] ---

    /** Unsafe version of: {@link #opus_tags_copy tags_copy} */
    public static int nopus_tags_copy(long _dst, long _src) {
        long __functionAddress = Functions.tags_copy;
        return invokePPI(_dst, _src, __functionAddress);
    }

    /**
     * Performs a deep copy of an {@code OpusTags} structure.
     *
     * @param _dst the {@code OpusTags} structure to copy into. If this function fails, the contents of this structure remain untouched.
     * @param _src the {@code OpusTags} structure to copy from
     *
     * @return <ul>
     *         <li>{@code 0}: Success</li>
     *         <li>{@link #OP_EFAULT EFAULT} If there wasn't enough memory to copy the tags</li>
     *         </ul>
     */
    public static int opus_tags_copy(@NativeType("OpusTags *") OpusTags _dst, @NativeType("OpusTags const *") OpusTags _src) {
        return nopus_tags_copy(_dst.address(), _src.address());
    }

    // --- [ opus_tags_init ] ---

    /** Unsafe version of: {@link #opus_tags_init tags_init} */
    public static void nopus_tags_init(long _tags) {
        long __functionAddress = Functions.tags_init;
        invokePV(_tags, __functionAddress);
    }

    /**
     * Initializes an {@code OpusTags} structure. This should be called on a freshly allocated {@code OpusTags} structure before attempting to use it.
     *
     * @param _tags the {@code OpusTags} structure to initialize
     */
    public static void opus_tags_init(@NativeType("OpusTags *") OpusTags _tags) {
        nopus_tags_init(_tags.address());
    }

    // --- [ opus_tags_add ] ---

    /** Unsafe version of: {@link #opus_tags_add tags_add} */
    public static int nopus_tags_add(long _tags, long _tag, long _value) {
        long __functionAddress = Functions.tags_add;
        return invokePPPI(_tags, _tag, _value, __functionAddress);
    }

    /**
     * Add a (tag, value) pair to an initialized {@code OpusTags} structure.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Neither {@code opus_tags_add()} nor {@link #opus_tags_add_comment tags_add_comment} support values containing embedded {@code NUL}s, although the bitstream format does support
     * them. To add such tags, you will need to manipulate the {@code OpusTags} structure directly.</p>
     * </div>
     *
     * @param _tags  the {@code OpusTags} structure to add the (tag, value) pair to
     * @param _tag   a {@code NUL}-terminated, case-insensitive, ASCII string containing the tag to add (without an {@code '='} character)
     * @param _value a {@code NUL}-terminated UTF-8 containing the corresponding value
     *
     * @return 0 on success, or a negative value on failure:
     *         
     *         <ul>
     *         <li>{@link #OP_EFAULT EFAULT} An internal memory allocation failed</li>
     *         </ul>
     */
    public static int opus_tags_add(@NativeType("OpusTags *") OpusTags _tags, @NativeType("char const *") ByteBuffer _tag, @NativeType("char const *") ByteBuffer _value) {
        if (CHECKS) {
            checkNT1(_tag);
            checkNT1(_value);
        }
        return nopus_tags_add(_tags.address(), memAddress(_tag), memAddress(_value));
    }

    /**
     * Add a (tag, value) pair to an initialized {@code OpusTags} structure.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Neither {@code opus_tags_add()} nor {@link #opus_tags_add_comment tags_add_comment} support values containing embedded {@code NUL}s, although the bitstream format does support
     * them. To add such tags, you will need to manipulate the {@code OpusTags} structure directly.</p>
     * </div>
     *
     * @param _tags  the {@code OpusTags} structure to add the (tag, value) pair to
     * @param _tag   a {@code NUL}-terminated, case-insensitive, ASCII string containing the tag to add (without an {@code '='} character)
     * @param _value a {@code NUL}-terminated UTF-8 containing the corresponding value
     *
     * @return 0 on success, or a negative value on failure:
     *         
     *         <ul>
     *         <li>{@link #OP_EFAULT EFAULT} An internal memory allocation failed</li>
     *         </ul>
     */
    public static int opus_tags_add(@NativeType("OpusTags *") OpusTags _tags, @NativeType("char const *") CharSequence _tag, @NativeType("char const *") CharSequence _value) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(_tag, true);
            long _tagEncoded = stack.getPointerAddress();
            stack.nUTF8(_value, true);
            long _valueEncoded = stack.getPointerAddress();
            return nopus_tags_add(_tags.address(), _tagEncoded, _valueEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ opus_tags_add_comment ] ---

    /** Unsafe version of: {@link #opus_tags_add_comment tags_add_comment} */
    public static int nopus_tags_add_comment(long _tags, long _comment) {
        long __functionAddress = Functions.tags_add_comment;
        return invokePPI(_tags, _comment, __functionAddress);
    }

    /**
     * Add a comment to an initialized {@code OpusTags} structure.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Neither {@code opus_tags_add_comment()} nor {@link #opus_tags_add tags_add} support comments containing embedded {@code NUL}s, although the bitstream format does support
     * them. To add such tags, you will need to manipulate the {@code OpusTags} structure directly.</p>
     * </div>
     *
     * @param _tags    the {@code OpusTags} structure to add the comment to
     * @param _comment a {@code NUL}-terminated UTF-8 string containing the comment in {@code "TAG=value"} form
     *
     * @return 0 on success, or a negative value on failure:
     *         
     *         <ul>
     *         <li>{@link #OP_EFAULT EFAULT} An internal memory allocation failed</li>
     *         </ul>
     */
    public static int opus_tags_add_comment(@NativeType("OpusTags *") OpusTags _tags, @NativeType("char const *") ByteBuffer _comment) {
        if (CHECKS) {
            checkNT1(_comment);
        }
        return nopus_tags_add_comment(_tags.address(), memAddress(_comment));
    }

    /**
     * Add a comment to an initialized {@code OpusTags} structure.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Neither {@code opus_tags_add_comment()} nor {@link #opus_tags_add tags_add} support comments containing embedded {@code NUL}s, although the bitstream format does support
     * them. To add such tags, you will need to manipulate the {@code OpusTags} structure directly.</p>
     * </div>
     *
     * @param _tags    the {@code OpusTags} structure to add the comment to
     * @param _comment a {@code NUL}-terminated UTF-8 string containing the comment in {@code "TAG=value"} form
     *
     * @return 0 on success, or a negative value on failure:
     *         
     *         <ul>
     *         <li>{@link #OP_EFAULT EFAULT} An internal memory allocation failed</li>
     *         </ul>
     */
    public static int opus_tags_add_comment(@NativeType("OpusTags *") OpusTags _tags, @NativeType("char const *") CharSequence _comment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(_comment, true);
            long _commentEncoded = stack.getPointerAddress();
            return nopus_tags_add_comment(_tags.address(), _commentEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ opus_tags_set_binary_suffix ] ---

    /**
     * Unsafe version of: {@link #opus_tags_set_binary_suffix tags_set_binary_suffix}
     *
     * @param _len the number of bytes of binary data to append. This may be zero to remove any existing binary suffix data.
     */
    public static int nopus_tags_set_binary_suffix(long _tags, long _data, int _len) {
        long __functionAddress = Functions.tags_set_binary_suffix;
        return invokePPI(_tags, _data, _len, __functionAddress);
    }

    /**
     * Replace the binary suffix data at the end of the packet (if any).
     *
     * @param _tags an initialized {@code OpusTags} structure
     * @param _data a buffer of binary data to append after the encoded user comments. The least significant bit of the first byte of this data must be set (to ensure
     *              the data is preserved by other editors).
     *
     * @return 0 on success, or a negative value on failure:
     *         
     *         <ul>
     *         <li>{@link #OP_EINVAL EINVAL} {@code _len} was negative, or {@code _len} was positive but {@code _data} was {@code NULL} or the least significant bit of the first byte was not
     *         set</li>
     *         <li>{@link #OP_EFAULT EFAULT} An internal memory allocation failed</li>
     *         </ul>
     */
    public static int opus_tags_set_binary_suffix(@NativeType("OpusTags *") OpusTags _tags, @Nullable @NativeType("unsigned char const *") ByteBuffer _data) {
        return nopus_tags_set_binary_suffix(_tags.address(), memAddressSafe(_data), remainingSafe(_data));
    }

    // --- [ opus_tags_query ] ---

    /** Unsafe version of: {@link #opus_tags_query tags_query} */
    public static long nopus_tags_query(long _tags, long _tag, int _count) {
        long __functionAddress = Functions.tags_query;
        return invokePPP(_tags, _tag, _count, __functionAddress);
    }

    /**
     * Look up a comment value by its tag.
     *
     * @param _tags  an initialized {@code OpusTags} structure
     * @param _tag   the tag to look up
     * @param _count the instance of the tag.
     *               
     *               <p>The same tag can appear multiple times, each with a distinct value, so an index is required to retrieve them all. The order in which these values
     *               appear is significant and should be preserved. Use {@link #opus_tags_query_count tags_query_count} to get the legal range for the {@code _count} parameter.</p>
     *
     * @return a pointer to the queried tag's value.
     *         
     *         <p>This points directly to data in the {@code OpusTags} structure. It should not be modified or freed by the application, and modifications to the
     *         structure may invalidate the pointer. {@code NULL} if no matching tag is found.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static String opus_tags_query(@NativeType("OpusTags const *") OpusTags _tags, @NativeType("char const *") ByteBuffer _tag, int _count) {
        if (CHECKS) {
            checkNT1(_tag);
        }
        long __result = nopus_tags_query(_tags.address(), memAddress(_tag), _count);
        return memUTF8Safe(__result);
    }

    /**
     * Look up a comment value by its tag.
     *
     * @param _tags  an initialized {@code OpusTags} structure
     * @param _tag   the tag to look up
     * @param _count the instance of the tag.
     *               
     *               <p>The same tag can appear multiple times, each with a distinct value, so an index is required to retrieve them all. The order in which these values
     *               appear is significant and should be preserved. Use {@link #opus_tags_query_count tags_query_count} to get the legal range for the {@code _count} parameter.</p>
     *
     * @return a pointer to the queried tag's value.
     *         
     *         <p>This points directly to data in the {@code OpusTags} structure. It should not be modified or freed by the application, and modifications to the
     *         structure may invalidate the pointer. {@code NULL} if no matching tag is found.</p>
     */
    @Nullable
    @NativeType("char const *")
    public static String opus_tags_query(@NativeType("OpusTags const *") OpusTags _tags, @NativeType("char const *") CharSequence _tag, int _count) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(_tag, true);
            long _tagEncoded = stack.getPointerAddress();
            long __result = nopus_tags_query(_tags.address(), _tagEncoded, _count);
            return memUTF8Safe(__result);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ opus_tags_query_count ] ---

    /** Unsafe version of: {@link #opus_tags_query_count tags_query_count} */
    public static int nopus_tags_query_count(long _tags, long _tag) {
        long __functionAddress = Functions.tags_query_count;
        return invokePPI(_tags, _tag, __functionAddress);
    }

    /**
     * Look up the number of instances of a tag.
     * 
     * <p>Call this first when querying for a specific tag and then iterate over the number of instances with separate calls to {@link #opus_tags_query tags_query} to retrieve all the
     * values for that tag in order.</p>
     *
     * @param _tags an initialized {@code OpusTags} structure
     * @param _tag  the tag to look up
     *
     * @return the number of instances of this particular tag
     */
    public static int opus_tags_query_count(@NativeType("OpusTags const *") OpusTags _tags, @NativeType("char const *") ByteBuffer _tag) {
        if (CHECKS) {
            checkNT1(_tag);
        }
        return nopus_tags_query_count(_tags.address(), memAddress(_tag));
    }

    /**
     * Look up the number of instances of a tag.
     * 
     * <p>Call this first when querying for a specific tag and then iterate over the number of instances with separate calls to {@link #opus_tags_query tags_query} to retrieve all the
     * values for that tag in order.</p>
     *
     * @param _tags an initialized {@code OpusTags} structure
     * @param _tag  the tag to look up
     *
     * @return the number of instances of this particular tag
     */
    public static int opus_tags_query_count(@NativeType("OpusTags const *") OpusTags _tags, @NativeType("char const *") CharSequence _tag) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(_tag, true);
            long _tagEncoded = stack.getPointerAddress();
            return nopus_tags_query_count(_tags.address(), _tagEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ opus_tags_get_binary_suffix ] ---

    /**
     * Unsafe version of: {@link #opus_tags_get_binary_suffix tags_get_binary_suffix}
     *
     * @param _len returns the number of bytes of binary suffix data returned
     */
    public static long nopus_tags_get_binary_suffix(long _tags, long _len) {
        long __functionAddress = Functions.tags_get_binary_suffix;
        return invokePPP(_tags, _len, __functionAddress);
    }

    /**
     * Retrieve the binary suffix data at the end of the packet (if any).
     *
     * @param _tags an initialized {@code OpusTags} structure
     *
     * @return a pointer to the binary suffix data, or {@code NULL} if none was present
     */
    @Nullable
    @NativeType("unsigned char const *")
    public static ByteBuffer opus_tags_get_binary_suffix(@NativeType("OpusTags const *") OpusTags _tags) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        IntBuffer _len = stack.callocInt(1);
        try {
            long __result = nopus_tags_get_binary_suffix(_tags.address(), memAddress(_len));
            return memByteBufferSafe(__result, _len.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ opus_tags_get_album_gain ] ---

    /** Unsafe version of: {@link #opus_tags_get_album_gain tags_get_album_gain} */
    public static int nopus_tags_get_album_gain(long _tags, long _gain_q8) {
        long __functionAddress = Functions.tags_get_album_gain;
        return invokePPI(_tags, _gain_q8, __functionAddress);
    }

    /**
     * Get the album gain from an {@code R128_ALBUM_GAIN} tag, if one was specified. This searches for the first {@code R128_ALBUM_GAIN} tag with a valid
     * signed, 16-bit decimal integer value and returns the value. This routine is exposed merely for convenience for applications which wish to do something
     * special with the album gain (i.e., display it). If you simply wish to apply the album gain instead of the header gain, you can use
     * {@link #op_set_gain_offset} with an {@link #OP_ALBUM_GAIN ALBUM_GAIN} type and no offset.
     *
     * @param _tags    an initialized {@code OpusTags} structure
     * @param _gain_q8 the album gain, in {@code 1/256ths} of a dB. This will lie in the range {@code [-32768,32767]}, and should be applied in <em>addition</em> to the
     *                 header gain. On error, no value is returned, and the previous contents remain unchanged.
     *
     * @return 0 on success, or a negative value on failure:
     *         
     *         <ul>
     *         <li>{@link #OP_FALSE FALSE} There was no album gain available in the given tags</li>
     *         </ul>
     */
    public static int opus_tags_get_album_gain(@NativeType("OpusTags const *") OpusTags _tags, @NativeType("int *") IntBuffer _gain_q8) {
        if (CHECKS) {
            check(_gain_q8, 1);
        }
        return nopus_tags_get_album_gain(_tags.address(), memAddress(_gain_q8));
    }

    // --- [ opus_tags_get_track_gain ] ---

    /** Unsafe version of: {@link #opus_tags_get_track_gain tags_get_track_gain} */
    public static int nopus_tags_get_track_gain(long _tags, long _gain_q8) {
        long __functionAddress = Functions.tags_get_track_gain;
        return invokePPI(_tags, _gain_q8, __functionAddress);
    }

    /**
     * Get the track gain from an {@code R128_TRACK_GAIN} tag, if one was specified.
     * 
     * <p>This searches for the first {@code R128_TRACK_GAIN} tag with a valid signed, 16-bit decimal integer value and returns the value. This routine is
     * exposed merely for convenience for applications which wish to do something special with the track gain (i.e., display it). If you simply wish to apply
     * the track gain instead of the header gain, you can use {@link #op_set_gain_offset} with an {@link #OP_TRACK_GAIN TRACK_GAIN} type and no offset.</p>
     *
     * @param _tags    an initialized {@code OpusTags} structure
     * @param _gain_q8 the track gain, in {@code 1/256ths} of a dB. This will lie in the range {@code [-32768,32767]}, and should be applied in <em>addition</em> to the
     *                 header gain. On error, no value is returned, and the previous contents remain unchanged.
     *
     * @return 0 on success, or a negative value on failure:
     *         
     *         <ul>
     *         <li>{@link #OP_FALSE FALSE} There was no track gain available in the given tags</li>
     *         </ul>
     */
    public static int opus_tags_get_track_gain(@NativeType("OpusTags const *") OpusTags _tags, @NativeType("int *") IntBuffer _gain_q8) {
        if (CHECKS) {
            check(_gain_q8, 1);
        }
        return nopus_tags_get_track_gain(_tags.address(), memAddress(_gain_q8));
    }

    // --- [ opus_tags_clear ] ---

    /** Unsafe version of: {@link #opus_tags_clear tags_clear} */
    public static void nopus_tags_clear(long _tags) {
        long __functionAddress = Functions.tags_clear;
        invokePV(_tags, __functionAddress);
    }

    /**
     * Clears the {@code OpusTags} structure.
     * 
     * <p>This should be called on an {@code OpusTags} structure after it is no longer needed. It will free all memory used by the structure members.</p>
     *
     * @param _tags the {@code OpusTags} structure to clear
     */
    public static void opus_tags_clear(@NativeType("OpusTags *") OpusTags _tags) {
        nopus_tags_clear(_tags.address());
    }

    // --- [ opus_tagcompare ] ---

    /** Unsafe version of: {@link #opus_tagcompare tagcompare} */
    public static int nopus_tagcompare(long _tag_name, long _comment) {
        long __functionAddress = Functions.tagcompare;
        return invokePPI(_tag_name, _comment, __functionAddress);
    }

    /**
     * Check if {@code _comment} is an instance of a {@code _tag_name} tag.
     *
     * @param _tag_name a {@code NUL}-terminated, case-insensitive, ASCII string containing the name of the tag to check for (without the terminating {@code '='} character)
     * @param _comment  the comment string to check
     *
     * @return an integer less than, equal to, or greater than zero if {@code _comment} is found respectively, to be less than, to match, or be greater than a
     *         {@code "tag=value"} string whose tag matches {@code _tag_name}
     */
    public static int opus_tagcompare(@NativeType("char const *") ByteBuffer _tag_name, @NativeType("char const *") ByteBuffer _comment) {
        if (CHECKS) {
            checkNT1(_tag_name);
            checkNT1(_comment);
        }
        return nopus_tagcompare(memAddress(_tag_name), memAddress(_comment));
    }

    /**
     * Check if {@code _comment} is an instance of a {@code _tag_name} tag.
     *
     * @param _tag_name a {@code NUL}-terminated, case-insensitive, ASCII string containing the name of the tag to check for (without the terminating {@code '='} character)
     * @param _comment  the comment string to check
     *
     * @return an integer less than, equal to, or greater than zero if {@code _comment} is found respectively, to be less than, to match, or be greater than a
     *         {@code "tag=value"} string whose tag matches {@code _tag_name}
     */
    public static int opus_tagcompare(@NativeType("char const *") CharSequence _tag_name, @NativeType("char const *") CharSequence _comment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(_tag_name, true);
            long _tag_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(_comment, true);
            long _commentEncoded = stack.getPointerAddress();
            return nopus_tagcompare(_tag_nameEncoded, _commentEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ opus_tagncompare ] ---

    /**
     * Unsafe version of: {@link #opus_tagncompare tagncompare}
     *
     * @param _tag_len the number of characters in the tag name. This must be non-negative.
     */
    public static int nopus_tagncompare(long _tag_name, int _tag_len, long _comment) {
        long __functionAddress = Functions.tagncompare;
        return invokePPI(_tag_name, _tag_len, _comment, __functionAddress);
    }

    /**
     * Check if {@code _comment} is an instance of a {@code _tag_name} tag.
     * 
     * <p>This version is slightly more efficient than {@link #opus_tagcompare tagcompare} if the length of the tag name is already known (e.g., because it is a constant).</p>
     *
     * @param _tag_name a case-insensitive ASCII string containing the name of the tag to check for (without the terminating {@code '='} character)
     * @param _comment  the comment string to check
     *
     * @return an integer less than, equal to, or greater than zero if {@code _comment} is found respectively, to be less than, to match, or be greater than a
     *         {@code "tag=value"} string whose tag matches the first {@code _tag_len} characters of {@code _tag_name}
     */
    public static int opus_tagncompare(@NativeType("char const *") ByteBuffer _tag_name, @NativeType("char const *") ByteBuffer _comment) {
        if (CHECKS) {
            checkNT1(_comment);
        }
        return nopus_tagncompare(memAddress(_tag_name), _tag_name.remaining(), memAddress(_comment));
    }

    /**
     * Check if {@code _comment} is an instance of a {@code _tag_name} tag.
     * 
     * <p>This version is slightly more efficient than {@link #opus_tagcompare tagcompare} if the length of the tag name is already known (e.g., because it is a constant).</p>
     *
     * @param _tag_name a case-insensitive ASCII string containing the name of the tag to check for (without the terminating {@code '='} character)
     * @param _comment  the comment string to check
     *
     * @return an integer less than, equal to, or greater than zero if {@code _comment} is found respectively, to be less than, to match, or be greater than a
     *         {@code "tag=value"} string whose tag matches the first {@code _tag_len} characters of {@code _tag_name}
     */
    public static int opus_tagncompare(@NativeType("char const *") CharSequence _tag_name, @NativeType("char const *") CharSequence _comment) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            int _tag_nameEncodedLength = stack.nASCII(_tag_name, false);
            long _tag_nameEncoded = stack.getPointerAddress();
            stack.nUTF8(_comment, true);
            long _commentEncoded = stack.getPointerAddress();
            return nopus_tagncompare(_tag_nameEncoded, _tag_nameEncodedLength, _commentEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ opus_picture_tag_parse ] ---

    /** Unsafe version of: {@link #opus_picture_tag_parse picture_tag_parse} */
    public static int nopus_picture_tag_parse(long _pic, long _tag) {
        long __functionAddress = Functions.picture_tag_parse;
        return invokePPI(_pic, _tag, __functionAddress);
    }

    /**
     * Parse a single {@code METADATA_BLOCK_PICTURE} tag.
     * 
     * <p>This decodes the BASE64-encoded content of the tag and returns a structure with the MIME type, description, image parameters (if known), and the
     * compressed image data. If the MIME type indicates the presence of an image format we recognize (JPEG, PNG, or GIF) and the actual image data contains
     * the magic signature associated with that format, then the {@link OpusPictureTag}{@code ::format} field will be set to the corresponding format. This is
     * provided as a convenience to avoid requiring applications to parse the MIME type and/or do their own format detection for the commonly used formats. In
     * this case, we also attempt to extract the image parameters directly from the image data (overriding any that were present in the tag, which the
     * specification says applications are not meant to rely on). The application must still provide its own support for actually decoding the image data and,
     * if applicable, retrieving that data from URLs.</p>
     *
     * @param _pic returns the parsed picture data.
     *             
     *             <p>No sanitation is done on the type, MIME type, or description fields, so these might return invalid values. The contents of this structure are left
     *             unmodified on failure.</p>
     * @param _tag the {@code METADATA_BLOCK_PICTURE} tag contents. The leading {@code "METADATA_BLOCK_PICTURE="} portion is optional, to allow the function to be
     *             used on either directly on the values in {@link OpusTags}{@code ::user_comments} or on the return value of {@link #opus_tags_query tags_query}.
     *
     * @return 0 on success, or a negative value on failure:
     *         
     *         <ul>
     *         <li>{@link #OP_ENOTFORMAT ENOTFORMAT} The METADATA_BLOCK_PICTURE contents were not valid</li>
     *         <li>{@link #OP_EFAULT EFAULT} There was not enough memory to store the picture tag contents</li>
     *         </ul>
     */
    public static int opus_picture_tag_parse(@NativeType("OpusPictureTag *") OpusPictureTag _pic, @NativeType("char const *") ByteBuffer _tag) {
        if (CHECKS) {
            checkNT1(_tag);
        }
        return nopus_picture_tag_parse(_pic.address(), memAddress(_tag));
    }

    /**
     * Parse a single {@code METADATA_BLOCK_PICTURE} tag.
     * 
     * <p>This decodes the BASE64-encoded content of the tag and returns a structure with the MIME type, description, image parameters (if known), and the
     * compressed image data. If the MIME type indicates the presence of an image format we recognize (JPEG, PNG, or GIF) and the actual image data contains
     * the magic signature associated with that format, then the {@link OpusPictureTag}{@code ::format} field will be set to the corresponding format. This is
     * provided as a convenience to avoid requiring applications to parse the MIME type and/or do their own format detection for the commonly used formats. In
     * this case, we also attempt to extract the image parameters directly from the image data (overriding any that were present in the tag, which the
     * specification says applications are not meant to rely on). The application must still provide its own support for actually decoding the image data and,
     * if applicable, retrieving that data from URLs.</p>
     *
     * @param _pic returns the parsed picture data.
     *             
     *             <p>No sanitation is done on the type, MIME type, or description fields, so these might return invalid values. The contents of this structure are left
     *             unmodified on failure.</p>
     * @param _tag the {@code METADATA_BLOCK_PICTURE} tag contents. The leading {@code "METADATA_BLOCK_PICTURE="} portion is optional, to allow the function to be
     *             used on either directly on the values in {@link OpusTags}{@code ::user_comments} or on the return value of {@link #opus_tags_query tags_query}.
     *
     * @return 0 on success, or a negative value on failure:
     *         
     *         <ul>
     *         <li>{@link #OP_ENOTFORMAT ENOTFORMAT} The METADATA_BLOCK_PICTURE contents were not valid</li>
     *         <li>{@link #OP_EFAULT EFAULT} There was not enough memory to store the picture tag contents</li>
     *         </ul>
     */
    public static int opus_picture_tag_parse(@NativeType("OpusPictureTag *") OpusPictureTag _pic, @NativeType("char const *") CharSequence _tag) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(_tag, true);
            long _tagEncoded = stack.getPointerAddress();
            return nopus_picture_tag_parse(_pic.address(), _tagEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ opus_picture_tag_init ] ---

    /** Unsafe version of: {@link #opus_picture_tag_init picture_tag_init} */
    public static void nopus_picture_tag_init(long _pic) {
        long __functionAddress = Functions.picture_tag_init;
        invokePV(_pic, __functionAddress);
    }

    /**
     * Initializes an {@code OpusPictureTag} structure. This should be called on a freshly allocated {@code OpusPictureTag} structure before attempting to use
     * it.
     *
     * @param _pic the {@code OpusPictureTag} structure to initialize
     */
    public static void opus_picture_tag_init(@NativeType("OpusPictureTag *") OpusPictureTag _pic) {
        nopus_picture_tag_init(_pic.address());
    }

    // --- [ opus_picture_tag_clear ] ---

    /** Unsafe version of: {@link #opus_picture_tag_clear picture_tag_clear} */
    public static void nopus_picture_tag_clear(long _pic) {
        long __functionAddress = Functions.picture_tag_clear;
        invokePV(_pic, __functionAddress);
    }

    /**
     * Clears the {@code OpusPictureTag} structure.
     * 
     * <p>This should be called on an {@code OpusPictureTag} structure after it is no longer needed. It will free all memory used by the structure members.</p>
     *
     * @param _pic the {@code OpusPictureTag} structure to clear
     */
    public static void opus_picture_tag_clear(@NativeType("OpusPictureTag *") OpusPictureTag _pic) {
        nopus_picture_tag_clear(_pic.address());
    }

    // --- [ op_fopen ] ---

    /** Unsafe version of: {@link #op_fopen} */
    public static long nop_fopen(long _cb, long _path, long _mode) {
        long __functionAddress = Functions.op_fopen;
        return invokePPPP(_cb, _path, _mode, __functionAddress);
    }

    /**
     * Opens a stream with {@code fopen()} and fills in a set of callbacks that can be used to access it.
     * 
     * <p>This is useful to avoid writing your own portable 64-bit seeking wrappers, and also avoids cross-module linking issues on Windows, where a
     * {@code FILE *} must be accessed by routines defined in the same module that opened it.</p>
     *
     * @param _cb   the callbacks to use for this file. If there is an error opening the file, nothing will be filled in here.
     * @param _path the path to the file to open. On Windows, this string must be UTF-8 (to allow access to files whose names cannot be represented in the current MBCS
     *              code page). All other systems use the native character encoding.
     * @param _mode the mode to open the file in
     *
     * @return a stream handle to use with the callbacks, or {@code NULL} on error
     */
    @NativeType("void *")
    public static long op_fopen(@NativeType("OpusFileCallbacks *") OpusFileCallbacks _cb, @NativeType("char const *") ByteBuffer _path, @NativeType("char const *") ByteBuffer _mode) {
        if (CHECKS) {
            checkNT1(_path);
            checkNT1(_mode);
        }
        return nop_fopen(_cb.address(), memAddress(_path), memAddress(_mode));
    }

    /**
     * Opens a stream with {@code fopen()} and fills in a set of callbacks that can be used to access it.
     * 
     * <p>This is useful to avoid writing your own portable 64-bit seeking wrappers, and also avoids cross-module linking issues on Windows, where a
     * {@code FILE *} must be accessed by routines defined in the same module that opened it.</p>
     *
     * @param _cb   the callbacks to use for this file. If there is an error opening the file, nothing will be filled in here.
     * @param _path the path to the file to open. On Windows, this string must be UTF-8 (to allow access to files whose names cannot be represented in the current MBCS
     *              code page). All other systems use the native character encoding.
     * @param _mode the mode to open the file in
     *
     * @return a stream handle to use with the callbacks, or {@code NULL} on error
     */
    @NativeType("void *")
    public static long op_fopen(@NativeType("OpusFileCallbacks *") OpusFileCallbacks _cb, @NativeType("char const *") CharSequence _path, @NativeType("char const *") CharSequence _mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(_path, true);
            long _pathEncoded = stack.getPointerAddress();
            stack.nASCII(_mode, true);
            long _modeEncoded = stack.getPointerAddress();
            return nop_fopen(_cb.address(), _pathEncoded, _modeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ op_fdopen ] ---

    /** Unsafe version of: {@link #op_fdopen} */
    public static long nop_fdopen(long _cb, int _fd, long _mode) {
        long __functionAddress = Functions.op_fdopen;
        return invokePPP(_cb, _fd, _mode, __functionAddress);
    }

    /**
     * Opens a stream with {@code fdopen()} and fills in a set of callbacks that can be used to access it.
     * 
     * <p>This is useful to avoid writing your own portable 64-bit seeking wrappers, and also avoids cross-module linking issues on Windows, where a
     * {@code FILE *} must be accessed by routines defined in the same module that opened it.</p>
     *
     * @param _cb   the callbacks to use for this file. If there is an error opening the file, nothing will be filled in here.
     * @param _fd   the file descriptor to open
     * @param _mode the mode to open the file in
     *
     * @return a stream handle to use with the callbacks, or {@code NULL} on error
     */
    @NativeType("void *")
    public static long op_fdopen(@NativeType("OpusFileCallbacks *") OpusFileCallbacks _cb, int _fd, @NativeType("char const *") ByteBuffer _mode) {
        if (CHECKS) {
            checkNT1(_mode);
        }
        return nop_fdopen(_cb.address(), _fd, memAddress(_mode));
    }

    /**
     * Opens a stream with {@code fdopen()} and fills in a set of callbacks that can be used to access it.
     * 
     * <p>This is useful to avoid writing your own portable 64-bit seeking wrappers, and also avoids cross-module linking issues on Windows, where a
     * {@code FILE *} must be accessed by routines defined in the same module that opened it.</p>
     *
     * @param _cb   the callbacks to use for this file. If there is an error opening the file, nothing will be filled in here.
     * @param _fd   the file descriptor to open
     * @param _mode the mode to open the file in
     *
     * @return a stream handle to use with the callbacks, or {@code NULL} on error
     */
    @NativeType("void *")
    public static long op_fdopen(@NativeType("OpusFileCallbacks *") OpusFileCallbacks _cb, int _fd, @NativeType("char const *") CharSequence _mode) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(_mode, true);
            long _modeEncoded = stack.getPointerAddress();
            return nop_fdopen(_cb.address(), _fd, _modeEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ op_freopen ] ---

    /** Unsafe version of: {@link #op_freopen} */
    public static long nop_freopen(long _cb, long _path, long _mode, long _stream) {
        long __functionAddress = Functions.op_freopen;
        if (CHECKS) {
            check(_stream);
        }
        return invokePPPPP(_cb, _path, _mode, _stream, __functionAddress);
    }

    /**
     * Opens a stream with {@code freopen()} and fills in a set of callbacks that can be used to access it.
     * 
     * <p>This is useful to avoid writing your own portable 64-bit seeking wrappers, and also avoids cross-module linking issues on Windows, where a
     * {@code FILE *} must be accessed by routines defined in the same module that opened it.</p>
     *
     * @param _cb     the callbacks to use for this file. If there is an error opening the file, nothing will be filled in here.
     * @param _path   the path to the file to open. On Windows, this string must be UTF-8 (to allow access to files whose names cannot be represented in the current MBCS
     *                code page). All other systems use the native character encoding.
     * @param _mode   the mode to open the file in
     * @param _stream a stream previously returned by {@link #op_fopen}, {@link #op_fdopen}, or {@link #op_freopen}
     *
     * @return a stream handle to use with the callbacks, or {@code NULL} on error
     */
    @NativeType("void *")
    public static long op_freopen(@NativeType("OpusFileCallbacks *") OpusFileCallbacks _cb, @NativeType("char const *") ByteBuffer _path, @NativeType("char const *") ByteBuffer _mode, @NativeType("void *") long _stream) {
        if (CHECKS) {
            checkNT1(_path);
            checkNT1(_mode);
        }
        return nop_freopen(_cb.address(), memAddress(_path), memAddress(_mode), _stream);
    }

    /**
     * Opens a stream with {@code freopen()} and fills in a set of callbacks that can be used to access it.
     * 
     * <p>This is useful to avoid writing your own portable 64-bit seeking wrappers, and also avoids cross-module linking issues on Windows, where a
     * {@code FILE *} must be accessed by routines defined in the same module that opened it.</p>
     *
     * @param _cb     the callbacks to use for this file. If there is an error opening the file, nothing will be filled in here.
     * @param _path   the path to the file to open. On Windows, this string must be UTF-8 (to allow access to files whose names cannot be represented in the current MBCS
     *                code page). All other systems use the native character encoding.
     * @param _mode   the mode to open the file in
     * @param _stream a stream previously returned by {@link #op_fopen}, {@link #op_fdopen}, or {@link #op_freopen}
     *
     * @return a stream handle to use with the callbacks, or {@code NULL} on error
     */
    @NativeType("void *")
    public static long op_freopen(@NativeType("OpusFileCallbacks *") OpusFileCallbacks _cb, @NativeType("char const *") CharSequence _path, @NativeType("char const *") CharSequence _mode, @NativeType("void *") long _stream) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(_path, true);
            long _pathEncoded = stack.getPointerAddress();
            stack.nASCII(_mode, true);
            long _modeEncoded = stack.getPointerAddress();
            return nop_freopen(_cb.address(), _pathEncoded, _modeEncoded, _stream);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ op_mem_stream_create ] ---

    /**
     * Unsafe version of: {@link #op_mem_stream_create}
     *
     * @param _size the size of the block of memory
     */
    public static long nop_mem_stream_create(long _cb, long _data, long _size) {
        long __functionAddress = Functions.op_mem_stream_create;
        return invokePPPP(_cb, _data, _size, __functionAddress);
    }

    /**
     * Creates a stream that reads from the given block of memory.
     * 
     * <p>This block of memory must contain the complete stream to decode. This is useful for caching small streams (e.g., sound effects) in RAM.</p>
     *
     * @param _cb   the callbacks to use for this stream. If there is an error creating the stream, nothing will be filled in here.
     * @param _data the block of memory to read from
     *
     * @return a stream handle to use with the callbacks, or {@code NULL} on error
     */
    @NativeType("void *")
    public static long op_mem_stream_create(@NativeType("OpusFileCallbacks *") OpusFileCallbacks _cb, @NativeType("unsigned char const *") ByteBuffer _data) {
        return nop_mem_stream_create(_cb.address(), memAddress(_data), _data.remaining());
    }

    // --- [ op_test ] ---

    /**
     * Unsafe version of: {@link #op_test}
     *
     * @param _initial_bytes the number of bytes in {@code _initial_data}
     */
    public static int nop_test(long _head, long _initial_data, long _initial_bytes) {
        long __functionAddress = Functions.op_test;
        return invokePPPI(_head, _initial_data, _initial_bytes, __functionAddress);
    }

    /**
     * Test to see if this is an Opus stream.
     * 
     * <p>For good results, you will need at least 57 bytes (for a pure Opus-only stream). Something like 512 bytes will give more reliable results for
     * multiplexed streams. This function is meant to be a quick-rejection filter. Its purpose is not to guarantee that a stream is a valid Opus stream, but
     * to ensure that it looks enough like Opus that it isn't going to be recognized as some other format (except possibly an Opus stream that is also
     * multiplexed with other codecs, such as video).</p>
     *
     * @param _head         the parsed ID header contents. You may pass {@code NULL} if you do not need this information. If the function fails, the contents of this structure remain
     *                      untouched.
     * @param _initial_data an initial buffer of data from the start of the stream
     *
     * @return 0 if the data appears to be Opus, or a negative value on error.
     *         
     *         <ul>
     *         <li>{@link #OP_FALSE FALSE} There was not enough data to tell if this was an Opus stream or not</li>
     *         <li>{@link #OP_EFAULT EFAULT} An internal memory allocation failed</li>
     *         <li>{@link #OP_EIMPL EIMPL} The stream used a feature that is not implemented, such as an unsupported channel family</li>
     *         <li>{@link #OP_ENOTFORMAT ENOTFORMAT} If the data did not contain a recognizable ID header for an Opus stream</li>
     *         <li>{@link #OP_EVERSION EVERSION} If the version field signaled a version this library does not know how to parse</li>
     *         <li>{@link #OP_EBADHEADER EBADHEADER} The ID header was not properly formatted or contained illegal values</li>
     *         </ul>
     */
    public static int op_test(@Nullable @NativeType("OpusHead *") OpusHead _head, @NativeType("unsigned char const *") ByteBuffer _initial_data) {
        return nop_test(memAddressSafe(_head), memAddress(_initial_data), _initial_data.remaining());
    }

    // --- [ op_open_file ] ---

    /** Unsafe version of: {@link #op_open_file} */
    public static long nop_open_file(long _path, long _error) {
        long __functionAddress = Functions.op_open_file;
        return invokePPP(_path, _error, __functionAddress);
    }

    /**
     * Open a stream from the given file path.
     *
     * @param _path  the path to the file to open
     * @param _error returns 0 on success, or a failure code on error.
     *               
     *               <p>You may pass in {@code NULL} if you don't want the failure code. The failure code will be {@link #OP_EFAULT EFAULT} if the file could not be opened, or one of the other
     *               failure codes from {@link #op_open_callbacks} otherwise.</p>
     *
     * @return a freshly opened {@code OggOpusFile}, or {@code NULL} on error
     */
    @NativeType("OggOpusFile *")
    public static long op_open_file(@NativeType("char const *") ByteBuffer _path, @Nullable @NativeType("int *") IntBuffer _error) {
        if (CHECKS) {
            checkNT1(_path);
            checkSafe(_error, 1);
        }
        return nop_open_file(memAddress(_path), memAddressSafe(_error));
    }

    /**
     * Open a stream from the given file path.
     *
     * @param _path  the path to the file to open
     * @param _error returns 0 on success, or a failure code on error.
     *               
     *               <p>You may pass in {@code NULL} if you don't want the failure code. The failure code will be {@link #OP_EFAULT EFAULT} if the file could not be opened, or one of the other
     *               failure codes from {@link #op_open_callbacks} otherwise.</p>
     *
     * @return a freshly opened {@code OggOpusFile}, or {@code NULL} on error
     */
    @NativeType("OggOpusFile *")
    public static long op_open_file(@NativeType("char const *") CharSequence _path, @Nullable @NativeType("int *") IntBuffer _error) {
        if (CHECKS) {
            checkSafe(_error, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(_path, true);
            long _pathEncoded = stack.getPointerAddress();
            return nop_open_file(_pathEncoded, memAddressSafe(_error));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ op_open_memory ] ---

    /**
     * Unsafe version of: {@link #op_open_memory}
     *
     * @param _size the number of bytes in the buffer
     */
    public static long nop_open_memory(long _data, long _size, long _error) {
        long __functionAddress = Functions.op_open_memory;
        return invokePPPP(_data, _size, _error, __functionAddress);
    }

    /**
     * Open a stream from a memory buffer.
     *
     * @param _data  the memory buffer to open
     * @param _error returns 0 on success, or a failure code on error.
     *               
     *               <p>You may pass in {@code NULL} if you don't want the failure code. See {@link #op_open_callbacks} for a full list of failure codes.</p>
     *
     * @return a freshly opened {@code OggOpusFile}, or {@code NULL} on error
     */
    @NativeType("OggOpusFile *")
    public static long op_open_memory(@NativeType("unsigned char const *") ByteBuffer _data, @Nullable @NativeType("int *") IntBuffer _error) {
        if (CHECKS) {
            checkSafe(_error, 1);
        }
        return nop_open_memory(memAddress(_data), _data.remaining(), memAddressSafe(_error));
    }

    // --- [ op_open_callbacks ] ---

    /**
     * Unsafe version of: {@link #op_open_callbacks}
     *
     * @param _initial_bytes the number of bytes in {@code _initial_data}.
     *                       
     *                       <p>If the stream is seekable, its current position (as reported by {@code "tell()"} at the start of this function) must be equal to
     *                       {@code _initial_bytes}. Otherwise, seeking to absolute positions will generate inconsistent results.</p>
     */
    public static long nop_open_callbacks(long _stream, long _cb, long _initial_data, long _initial_bytes, long _error) {
        long __functionAddress = Functions.op_open_callbacks;
        if (CHECKS) {
            check(_stream);
            OpusFileCallbacks.validate(_cb);
        }
        return invokePPPPPP(_stream, _cb, _initial_data, _initial_bytes, _error, __functionAddress);
    }

    /**
     * Open a stream using the given set of callbacks to access it.
     *
     * @param _stream       the stream to read from (e.g., a {@code FILE *}). This value will be passed verbatim as the first argument to all of the callbacks.
     * @param _cb           the callbacks with which to access the stream.
     *                      
     *                      <p>{@code "read()"} must be implemented. {@code "seek()"} and {@code "tell()"} may be {@code NULL}, or may always return {@code -1} to indicate a stream is
     *                      unseekable, but if {@code "seek()"} is implemented and succeeds on a particular stream, then {@code "tell()"} must also. {@code "close()"} may be
     *                      {@code NULL}, but if it is not, it will be called when the {@code OggOpusFile} is destroyed by {@link #op_free}. It will not be called if
     *                      {@code op_open_callbacks()} fails with an error.</p>
     * @param _initial_data an initial buffer of data from the start of the stream.
     *                      
     *                      <p>Applications can read some number of bytes from the start of the stream to help identify this as an Opus stream, and then provide them here to
     *                      allow the stream to be opened, even if it is unseekable.</p>
     * @param _error        returns 0 on success, or a failure code on error.
     *                      
     *                      <p>You may pass in {@code NULL} if you don't want the failure code. The failure code will be one of:</p>
     *                      
     *                      <ul>
     *                      <li>{@link #OP_EREAD EREAD} An underlying read, seek, or tell operation failed when it should have succeeded, or we failed to find data in the stream we had seen before</li>
     *                      <li>{@link #OP_EFAULT EFAULT} There was a memory allocation failure, or an internal library error</li>
     *                      <li>{@link #OP_EIMPL EIMPL} The stream used a feature that is not implemented, such as an unsupported channel family</li>
     *                      <li>{@link #OP_EINVAL EINVAL} {@code "seek()"} was implemented and succeeded on this source, but {@code "tell()"} did not, or the starting position indicator was not
     *                      equal to {@code _initial_bytes}</li>
     *                      <li>{@link #OP_ENOTFORMAT ENOTFORMAT} The stream contained a link that did not have any logical Opus streams in it</li>
     *                      <li>{@link #OP_EBADHEADER EBADHEADER} A required header packet was not properly formatted, contained illegal values, or was missing altogether</li>
     *                      <li>{@link #OP_EVERSION EVERSION} An ID header contained an unrecognized version number</li>
     *                      <li>{@link #OP_EBADLINK EBADLINK} We failed to find data we had seen before after seeking</li>
     *                      <li>{@link #OP_EBADTIMESTAMP EBADTIMESTAMP} The first or last timestamp in a link failed basic validity checks</li>
     *                      </ul>
     *
     * @return a freshly opened {@code OggOpusFile}, or {@code NULL} on error.
     *         
     *         <p>libopusfile does <em>not</em> take ownership of the stream if the call fails. The calling application is responsible for closing the stream if this
     *         call returns an error.</p>
     */
    @NativeType("OggOpusFile *")
    public static long op_open_callbacks(@NativeType("void *") long _stream, @NativeType("OpusFileCallbacks const *") OpusFileCallbacks _cb, @NativeType("unsigned char const *") ByteBuffer _initial_data, @Nullable @NativeType("int *") IntBuffer _error) {
        if (CHECKS) {
            checkSafe(_error, 1);
        }
        return nop_open_callbacks(_stream, _cb.address(), memAddress(_initial_data), _initial_data.remaining(), memAddressSafe(_error));
    }

    // --- [ op_test_file ] ---

    /** Unsafe version of: {@link #op_test_file} */
    public static long nop_test_file(long _path, long _error) {
        long __functionAddress = Functions.op_test_file;
        return invokePPP(_path, _error, __functionAddress);
    }

    /**
     * Partially open a stream from the given file path.
     *
     * @param _path  the path to the file to open
     * @param _error returns 0 on success, or a failure code on error.
     *               
     *               <p>You may pass in {@code NULL} if you don't want the failure code. The failure code will be {@link #OP_EFAULT EFAULT} if the file could not be opened, or one of the other
     *               failure codes from {@link #op_open_callbacks} otherwise.</p>
     *
     * @return a partially opened {@code OggOpusFile}, or {@code NULL} on error
     */
    @NativeType("OggOpusFile *")
    public static long op_test_file(@NativeType("char const *") ByteBuffer _path, @Nullable @NativeType("int *") IntBuffer _error) {
        if (CHECKS) {
            checkNT1(_path);
            checkSafe(_error, 1);
        }
        return nop_test_file(memAddress(_path), memAddressSafe(_error));
    }

    /**
     * Partially open a stream from the given file path.
     *
     * @param _path  the path to the file to open
     * @param _error returns 0 on success, or a failure code on error.
     *               
     *               <p>You may pass in {@code NULL} if you don't want the failure code. The failure code will be {@link #OP_EFAULT EFAULT} if the file could not be opened, or one of the other
     *               failure codes from {@link #op_open_callbacks} otherwise.</p>
     *
     * @return a partially opened {@code OggOpusFile}, or {@code NULL} on error
     */
    @NativeType("OggOpusFile *")
    public static long op_test_file(@NativeType("char const *") CharSequence _path, @Nullable @NativeType("int *") IntBuffer _error) {
        if (CHECKS) {
            checkSafe(_error, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(_path, true);
            long _pathEncoded = stack.getPointerAddress();
            return nop_test_file(_pathEncoded, memAddressSafe(_error));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ op_test_memory ] ---

    /**
     * Unsafe version of: {@link #op_test_memory}
     *
     * @param _size the number of bytes in the buffer
     */
    public static long nop_test_memory(long _data, long _size, long _error) {
        long __functionAddress = Functions.op_test_memory;
        return invokePPPP(_data, _size, _error, __functionAddress);
    }

    /**
     * Partially open a stream from a memory buffer.
     *
     * @param _data  the memory buffer to open
     * @param _error returns 0 on success, or a failure code on error.
     *               
     *               <p>You may pass in {@code NULL} if you don't want the failure code. See {@link #op_open_callbacks} for a full list of failure codes.</p>
     *
     * @return a partially opened {@code OggOpusFile}, or {@code NULL} on error
     */
    @NativeType("OggOpusFile *")
    public static long op_test_memory(@NativeType("unsigned char const *") ByteBuffer _data, @Nullable @NativeType("int *") IntBuffer _error) {
        if (CHECKS) {
            checkSafe(_error, 1);
        }
        return nop_test_memory(memAddress(_data), _data.remaining(), memAddressSafe(_error));
    }

    // --- [ op_test_callbacks ] ---

    /**
     * Unsafe version of: {@link #op_test_callbacks}
     *
     * @param _initial_bytes the number of bytes in {@code _initial_data}.
     *                       
     *                       <p>If the stream is seekable, its current position (as reported by {@code "tell()"} at the start of this function) must be equal to
     *                       {@code _initial_bytes}. Otherwise, seeking to absolute positions will generate inconsistent results.</p>
     */
    public static long nop_test_callbacks(long _stream, long _cb, long _initial_data, long _initial_bytes, long _error) {
        long __functionAddress = Functions.op_test_callbacks;
        if (CHECKS) {
            check(_stream);
            OpusFileCallbacks.validate(_cb);
        }
        return invokePPPPPP(_stream, _cb, _initial_data, _initial_bytes, _error, __functionAddress);
    }

    /**
     * Partially open a stream using the given set of callbacks to access it.
     * 
     * <p>This tests for Opusness and loads the headers for the first link. It does not seek (although it tests for seekability). You can query a partially open
     * stream for the few pieces of basic information returned by {@link #op_serialno}, {@link #op_channel_count}, {@link #op_head}, and {@link #op_tags} (but only for the first
     * link). You may also determine if it is seekable via a call to {@link #op_seekable}. You cannot read audio from the stream, seek, get the size or duration,
     * get information from links other than the first one, or even get the total number of links until you finish opening the stream with {@link #op_test_open}. If
     * you do not need to do any of these things, you can dispose of it with {@link #op_free} instead.</p>
     * 
     * <p>This function is provided mostly to simplify porting existing code that used libvorbisfile. For new code, you are likely better off using {@link #op_test}
     * instead, which is less resource-intensive, requires less data to succeed, and imposes a hard limit on the amount of data it examines (important for
     * unseekable streams, where all such data must be buffered until you are sure of the stream type).</p>
     *
     * @param _stream       the stream to read from (e.g., a {@code FILE *}). This value will be passed verbatim as the first argument to all of the callbacks.
     * @param _cb           the callbacks with which to access the stream.
     *                      
     *                      <p>{@code "read()"} must be implemented. {@code "seek()"} and {@code "tell()"} may be {@code NULL}, or may always return {@code -1} to indicate a stream is
     *                      unseekable, but if {@code "seek()"} is implemented and succeeds on a particular stream, then {@code "tell()"} must also. {@code "close()"} may be
     *                      {@code NULL}, but if it is not, it will be called when the {@code OggOpusFile} is destroyed by {@link #op_free}. It will not be called if {@link #op_open_callbacks}
     *                      fails with an error.</p>
     * @param _initial_data an initial buffer of data from the start of the stream.
     *                      
     *                      <p>Applications can read some number of bytes from the start of the stream to help identify this as an Opus stream, and then provide them here to
     *                      allow the stream to be tested more thoroughly, even if it is unseekable.</p>
     * @param _error        returns 0 on success, or a failure code on error.
     *                      
     *                      <p>You may pass in {@code NULL} if you don't want the failure code. See {@link #op_open_callbacks} for a full list of failure codes.</p>
     *
     * @return a partially opened {@code OggOpusFile}, or {@code NULL} on error.
     *         
     *         <p>libopusfile does <em>not</em> take ownership of the stream if the call fails. The calling application is responsible for closing the stream if this
     *         call returns an error.</p>
     */
    @NativeType("OggOpusFile *")
    public static long op_test_callbacks(@NativeType("void *") long _stream, @NativeType("OpusFileCallbacks const *") OpusFileCallbacks _cb, @NativeType("unsigned char const *") ByteBuffer _initial_data, @Nullable @NativeType("int *") IntBuffer _error) {
        if (CHECKS) {
            checkSafe(_error, 1);
        }
        return nop_test_callbacks(_stream, _cb.address(), memAddress(_initial_data), _initial_data.remaining(), memAddressSafe(_error));
    }

    // --- [ op_test_open ] ---

    /**
     * Finish opening a stream partially opened with {@link #op_test_callbacks} or one of the associated convenience functions.
     * 
     * <p>If this function fails, you are still responsible for freeing the {@code OggOpusFile} with {@link #op_free}.</p>
     *
     * @param _of the {@code OggOpusFile} to finish opening
     *
     * @return 0 on success, or a negative value on error:
     *         
     *         <ul>
     *         <li>{@link #OP_EREAD EREAD} An underlying read, seek, or tell operation failed when it should have succeeded</li>
     *         <li>{@link #OP_EFAULT EFAULT} There was a memory allocation failure, or an internal library error</li>
     *         <li>{@link #OP_EIMPL EIMPL} The stream used a feature that is not implemented, such as an unsupported channel family</li>
     *         <li>{@link #OP_EINVAL EINVAL} The stream was not partially opened with {@link #op_test_callbacks} or one of the associated convenience functions</li>
     *         <li>{@link #OP_ENOTFORMAT ENOTFORMAT} The stream contained a link that did not have any logical Opus streams in it</li>
     *         <li>{@link #OP_EBADHEADER EBADHEADER} A required header packet was not properly formatted, contained illegal values, or was missing altogether</li>
     *         <li>{@link #OP_EVERSION EVERSION} An ID header contained an unrecognized version number</li>
     *         <li>{@link #OP_EBADLINK EBADLINK} We failed to find data we had seen before after seeking</li>
     *         <li>{@link #OP_EBADTIMESTAMP EBADTIMESTAMP} The first or last timestamp in a link failed basic validity checks</li>
     *         </ul>
     */
    public static int op_test_open(@NativeType("OggOpusFile *") long _of) {
        long __functionAddress = Functions.op_test_open;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, __functionAddress);
    }

    // --- [ op_free ] ---

    /**
     * Release all memory used by an {@code OggOpusFile}.
     *
     * @param _of the {@code OggOpusFile} to free
     */
    public static void op_free(@NativeType("OggOpusFile *") long _of) {
        long __functionAddress = Functions.op_free;
        if (CHECKS) {
            check(_of);
        }
        invokePV(_of, __functionAddress);
    }

    // --- [ op_seekable ] ---

    /**
     * Returns whether or not the stream being read is seekable.
     * 
     * <p>This is true if</p>
     * 
     * <ol>
     * <li>The {@code "seek()"} and {@code "tell()"} callbacks are both non-{@code NULL}</li>
     * <li>The {@code "seek()"} callback was successfully executed at least once, and</li>
     * <li>The {@code "tell()"} callback was successfully able to report the position indicator afterwards</li>
     * </ol>
     * 
     * <p>This function may be called on partially-opened streams.</p>
     *
     * @param _of the {@code OggOpusFile} whose seekable status is to be returned
     *
     * @return a non-zero value if seekable, and 0 if unseekable
     */
    @NativeType("int")
    public static boolean op_seekable(@NativeType("OggOpusFile const *") long _of) {
        long __functionAddress = Functions.op_seekable;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, __functionAddress) != 0;
    }

    // --- [ op_link_count ] ---

    /**
     * Returns the number of links in this chained stream.
     * 
     * <p>This function may be called on partially-opened streams, but it will always return 1. The actual number of links is not known until the stream is fully
     * opened.</p>
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the link count
     *
     * @return for fully-open seekable streams, this returns the total number of links in the whole stream, which will be at least 1. For partially-open or unseekable
     *         streams, this always returns 1.
     */
    public static int op_link_count(@NativeType("OggOpusFile const *") long _of) {
        long __functionAddress = Functions.op_link_count;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, __functionAddress);
    }

    // --- [ op_serialno ] ---

    /**
     * Get the serial number of the given link in a (possibly-chained) Ogg Opus stream.
     * 
     * <p>This function may be called on partially-opened streams, but it will always return the serial number of the Opus stream in the first link.</p>
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the serial number
     * @param _li the index of the link whose serial number should be retrieved. Use a negative number to get the serial number of the current link.
     *
     * @return the serial number of the given link.
     *         
     *         <p>If {@code _li} is greater than the total number of links, this returns the serial number of the last link. If the stream is not seekable, this always
     *         returns the serial number of the current link.</p>
     */
    @NativeType("opus_uint32")
    public static int op_serialno(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __functionAddress = Functions.op_serialno;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, _li, __functionAddress);
    }

    // --- [ op_channel_count ] ---

    /**
     * Get the channel count of the given link in a (possibly-chained) Ogg Opus stream.
     * 
     * <p>This is equivalent to {@code op_head(_of,_li)->channel_count}, but is provided for convenience. This function may be called on partially-opened
     * streams, but it will always return the channel count of the Opus stream in the first link.</p>
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the channel count
     * @param _li the index of the link whose channel count should be retrieved. Use a negative number to get the channel count of the current link.
     *
     * @return the channel count of the given link.
     *         
     *         <p>If {@code _li} is greater than the total number of links, this returns the channel count of the last link. If the stream is not seekable, this always
     *         returns the channel count of the current link.</p>
     */
    public static int op_channel_count(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __functionAddress = Functions.op_channel_count;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, _li, __functionAddress);
    }

    // --- [ op_raw_total ] ---

    /**
     * Get the total (compressed) size of the stream, or of an individual link in a (possibly-chained) Ogg Opus stream, including all headers and Ogg muxing
     * overhead.
     * 
     * <p>Warning: If the Opus stream (or link) is concurrently multiplexed with other logical streams (e.g., video), this returns the size of the entire stream
     * (or link), not just the number of bytes in the first logical Opus stream. Returning the latter would require scanning the entire file.</p>
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the compressed size
     * @param _li the index of the link whose compressed size should be computed. Use a negative number to get the compressed size of the entire stream.
     *
     * @return the compressed size of the entire stream if {@code _li} is negative, the compressed size of link {@code _li} if it is non-negative, or a negative value
     *         on error.
     *         
     *         <p>The compressed size of the entire stream may be smaller than that of the underlying stream if trailing garbage was detected in the file.</p>
     *         
     *         <p>{@link #OP_EINVAL EINVAL} The stream is not seekable (so we can't know the length),{@code #}_li wasn't less than the total number of links in the stream, or the stream
     *         was only partially open.</p>
     */
    @NativeType("long long")
    public static long op_raw_total(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __functionAddress = Functions.op_raw_total;
        if (CHECKS) {
            check(_of);
        }
        return invokePJ(_of, _li, __functionAddress);
    }

    // --- [ op_pcm_total ] ---

    /**
     * Get the total PCM length (number of samples at 48 kHz) of the stream, or of an individual link in a (possibly-chained) Ogg Opus stream.
     * 
     * <p>Users looking for {@code op_time_total()} should use {@code op_pcm_total()} instead. Because timestamps in Opus are fixed at 48 kHz, there is no need for a
     * separate function to convert this to seconds (and leaving it out avoids introducing floating point to the API, for those that wish to avoid it).</p>
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the PCM offset
     * @param _li the index of the link whose PCM length should be computed. Use a negative number to get the PCM length of the entire stream.
     *
     * @return the PCM length of the entire stream if {@code _li} is negative, the PCM length of link {@code _li} if it is non-negative, or a negative value on error.
     *         
     *         <p>{@link #OP_EINVAL EINVAL} The stream is not seekable (so we can't know the length), {@code _li} wasn't less than the total number of links in the stream, or the stream
     *         was only partially open.</p>
     */
    @NativeType("ogg_int64_t")
    public static long op_pcm_total(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __functionAddress = Functions.op_pcm_total;
        if (CHECKS) {
            check(_of);
        }
        return invokePJ(_of, _li, __functionAddress);
    }

    // --- [ op_head ] ---

    /** Unsafe version of: {@link #op_head} */
    public static long nop_head(long _of, int _li) {
        long __functionAddress = Functions.op_head;
        if (CHECKS) {
            check(_of);
        }
        return invokePP(_of, _li, __functionAddress);
    }

    /**
     * Get the ID header information for the given link in a (possibly chained) Ogg Opus stream.
     * 
     * <p>This function may be called on partially-opened streams, but it will always return the ID header information of the Opus stream in the first link.</p>
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the ID header information
     * @param _li the index of the link whose ID header information should be retrieved. Use a negative number to get the ID header information of the current link.
     *            For an unseekable stream, {@code _li} is ignored, and the ID header information for the current link is always returned, if available.
     *
     * @return the contents of the ID header for the given link
     */
    @Nullable
    @NativeType("OpusHead const *")
    public static OpusHead op_head(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __result = nop_head(_of, _li);
        return OpusHead.createSafe(__result);
    }

    // --- [ op_tags ] ---

    /** Unsafe version of: {@link #op_tags} */
    public static long nop_tags(long _of, int _li) {
        long __functionAddress = Functions.op_tags;
        if (CHECKS) {
            check(_of);
        }
        return invokePP(_of, _li, __functionAddress);
    }

    /**
     * Get the comment header information for the given link in a (possibly chained) Ogg Opus stream.
     * 
     * <p>This function may be called on partially-opened streams, but it will always return the tags from the Opus stream in the first link.</p>
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the comment header information
     * @param _li the index of the link whose comment header information should be retrieved. Use a negative number to get the comment header information of the
     *            current link. For an unseekable stream, {@code _li} is ignored, and the comment header information for the current link is always returned, if
     *            available.
     *
     * @return the contents of the comment header for the given link, or {@code NULL} if this is an unseekable stream that encountered an invalid link
     */
    @Nullable
    @NativeType("OpusTags const *")
    public static OpusTags op_tags(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __result = nop_tags(_of, _li);
        return OpusTags.createSafe(__result);
    }

    // --- [ op_current_link ] ---

    /**
     * Retrieve the index of the current link.
     * 
     * <p>This is the link that produced the data most recently read by {@link #op_read_float} or its associated functions, or, after a seek, the link that the seek
     * target landed in. Reading more data may advance the link index (even on the first read after a seek).</p>
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the current link index
     *
     * @return the index of the current link on success, or a negative value on failure.
     *         
     *         <p>For seekable streams, this is a number between 0 (inclusive) and the value returned by {@link #op_link_count} (exclusive). For unseekable streams, this value
     *         starts at 0 and increments by one each time a new link is encountered (even though {@code op_link_count()} always returns 1).</p>
     *         
     *         <p>{@link #OP_EINVAL EINVAL} The stream was only partially open.</p>
     */
    public static int op_current_link(@NativeType("OggOpusFile const *") long _of) {
        long __functionAddress = Functions.op_current_link;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, __functionAddress);
    }

    // --- [ op_bitrate ] ---

    /**
     * Computes the bitrate of the stream, or of an individual link in a (possibly-chained) Ogg Opus stream.
     * 
     * <p>The stream must be seekable to compute the bitrate. For unseekable streams, use {@link #op_bitrate_instant} to get periodic estimates.</p>
     * 
     * <p>Warning: If the Opus stream (or link) is concurrently multiplexed with other logical streams (e.g., video), this uses the size of the entire stream (or
     * link) to compute the bitrate, not just the number of bytes in the first logical Opus stream. Returning the latter requires scanning the entire file,
     * but this may be done by decoding the whole file and calling {@code op_bitrate_instant()} once at the end. Install a trivial decoding callback with
     * {@link #op_set_decode_callback} if you wish to skip actual decoding during this process.</p>
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the bitrate
     * @param _li the index of the link whose bitrate should be computed. Use a negative number to get the bitrate of the whole stream.
     *
     * @return the bitrate on success, or a negative value on error.
     *         
     *         <p>{@link #OP_EINVAL EINVAL} The stream was only partially open, the stream was not seekable, or {@code _li} was larger than the number of links.</p>
     */
    @NativeType("opus_int32")
    public static int op_bitrate(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __functionAddress = Functions.op_bitrate;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, _li, __functionAddress);
    }

    // --- [ op_bitrate_instant ] ---

    /**
     * Compute the instantaneous bitrate, measured as the ratio of bits to playable samples decoded since
     * 
     * <ol type=a>
     * <li>the last call to {@code op_bitrate_instant()},</li>
     * <li>the last seek, or</li>
     * <li>the start of playback, whichever was most recent.</li>
     * </ol>
     * 
     * <p>This will spike somewhat after a seek or at the start/end of a chain boundary, as pre-skip, pre-roll, and end-trimming causes samples to be decoded but
     * not played.</p>
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the bitrate
     *
     * @return the bitrate, in bits per second, or a negative value on error:
     *         
     *         <ul>
     *         <li>{@link #OP_FALSE FALSE} No data has been decoded since any of the events described above</li>
     *         <li>{@link #OP_EINVAL EINVAL} The stream was only partially open</li>
     *         </ul>
     */
    @NativeType("opus_int32")
    public static int op_bitrate_instant(@NativeType("OggOpusFile *") long _of) {
        long __functionAddress = Functions.op_bitrate_instant;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, __functionAddress);
    }

    // --- [ op_raw_tell ] ---

    /**
     * Obtain the current value of the position indicator for {@code _of}.
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the position indicator
     *
     * @return the byte position that is currently being read from. {@link #OP_EINVAL EINVAL} The stream was only partially open.
     */
    @NativeType("long long")
    public static long op_raw_tell(@NativeType("OggOpusFile const *") long _of) {
        long __functionAddress = Functions.op_raw_tell;
        if (CHECKS) {
            check(_of);
        }
        return invokePJ(_of, __functionAddress);
    }

    // --- [ op_pcm_tell ] ---

    /**
     * Obtain the PCM offset of the next sample to be read.
     * 
     * <p>If the stream is not properly timestamped, this might not increment by the proper amount between reads, or even return monotonically increasing values.</p>
     *
     * @param _of the {@code OggOpusFile} from which to retrieve the PCM offset
     *
     * @return the PCM offset of the next sample to be read. {@link #OP_EINVAL EINVAL} The stream was only partially open.
     */
    @NativeType("ogg_int64_t")
    public static long op_pcm_tell(@NativeType("OggOpusFile const *") long _of) {
        long __functionAddress = Functions.op_pcm_tell;
        if (CHECKS) {
            check(_of);
        }
        return invokePJ(_of, __functionAddress);
    }

    // --- [ op_raw_seek ] ---

    /**
     * Seek to a byte offset relative to the <b>compressed</b> data.
     * 
     * <p>This also scans packets to update the PCM cursor. It will cross a logical bitstream boundary, but only if it can't get any packets out of the tail of
     * the link to which it seeks.</p>
     *
     * @param _of          the {@code OggOpusFile} in which to seek
     * @param _byte_offset the byte position to seek to. This must be between 0 and {@code op_raw_total(_of, -1)} (inclusive).
     *
     * @return 0 on success, or a negative error code on failure:
     *         
     *         <ul>
     *         <li>{@link #OP_EREAD EREAD} The underlying seek operation failed</li>
     *         <li>{@link #OP_EINVAL EINVAL} The stream was only partially open, or the target was outside the valid range for the stream</li>
     *         <li>{@link #OP_ENOSEEK ENOSEEK} This stream is not seekable</li>
     *         <li>{@link #OP_EBADLINK EBADLINK} Failed to initialize a decoder for a stream for an unknown reason</li>
     *         </ul>
     */
    public static int op_raw_seek(@NativeType("OggOpusFile *") long _of, @NativeType("long long") long _byte_offset) {
        long __functionAddress = Functions.op_raw_seek;
        if (CHECKS) {
            check(_of);
        }
        return invokePJI(_of, _byte_offset, __functionAddress);
    }

    // --- [ op_pcm_seek ] ---

    /**
     * Seek to the specified PCM offset, such that decoding will begin at exactly the requested position.
     *
     * @param _of         the {@code OggOpusFile} in which to seek
     * @param _pcm_offset the PCM offset to seek to. This is in samples at 48 kHz relative to the start of the stream.
     *
     * @return 0 on success, or a negative value on error:
     *         
     *         <ul>
     *         <li>{@link #OP_EREAD EREAD} An underlying read or seek operation failed</li>
     *         <li>{@link #OP_EINVAL EINVAL} The stream was only partially open, or the target was outside the valid range for the stream</li>
     *         <li>{@link #OP_ENOSEEK ENOSEEK} This stream is not seekable</li>
     *         <li>{@link #OP_EBADLINK EBADLINK} We failed to find data we had seen before, or the bitstream structure was sufficiently malformed that seeking to the target destination
     *         was impossible</li>
     *         </ul>
     */
    public static int op_pcm_seek(@NativeType("OggOpusFile *") long _of, @NativeType("ogg_int64_t") long _pcm_offset) {
        long __functionAddress = Functions.op_pcm_seek;
        if (CHECKS) {
            check(_of);
        }
        return invokePJI(_of, _pcm_offset, __functionAddress);
    }

    // --- [ op_set_decode_callback ] ---

    /** Unsafe version of: {@link #op_set_decode_callback} */
    public static void nop_set_decode_callback(long _of, long _decode_cb, long _ctx) {
        long __functionAddress = Functions.op_set_decode_callback;
        if (CHECKS) {
            check(_of);
            check(_ctx);
        }
        invokePPPV(_of, _decode_cb, _ctx, __functionAddress);
    }

    /**
     * Sets the packet decode callback function.
     * 
     * <p>If set, this is called once for each packet that needs to be decoded. This can be used by advanced applications to do additional processing on the
     * compressed or uncompressed data. For example, an application might save the final entropy coder state for debugging and testing purposes, or it might
     * apply additional filters before the downmixing, dithering, or soft-clipping performed by {@code libopusfile}, so long as these filters do not introduce
     * any latency.</p>
     * 
     * <p>A call to this function is no guarantee that the audio will eventually be delivered to the application. libopusfile may discard some or all of the
     * decoded audio data (i.e., at the beginning or end of a link, or after a seek), however the callback is still required to provide all of it.</p>
     *
     * @param _of        the {@code OggOpusFile} on which to set the decode callback
     * @param _decode_cb the callback function to call. This may be {@code NULL} to disable calling the callback.
     * @param _ctx       the application-provided context pointer to pass to the callback on each call
     */
    public static void op_set_decode_callback(@NativeType("OggOpusFile *") long _of, @NativeType("op_decode_cb_func") OPDecodeCBFuncI _decode_cb, @NativeType("void *") long _ctx) {
        nop_set_decode_callback(_of, _decode_cb.address(), _ctx);
    }

    // --- [ op_set_gain_offset ] ---

    /**
     * Sets the gain to be used for decoded output.
     * 
     * <p>By default, the gain in the header is applied with no additional offset. The total gain (including header gain and/or track gain, if applicable, and
     * this offset), will be clamped to {@code [-32768,32767]/256} dB. This is more than enough to saturate or underflow 16-bit PCM.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>The new gain will not be applied to any already buffered, decoded output. This means you cannot change it sample-by-sample, as at best it
     * will be updated packet-by-packet. It is meant for setting a target volume level, rather than applying smooth fades, etc.</p>
     * </div>
     *
     * @param _of             the {@code OggOpusFile} on which to set the gain offset
     * @param _gain_type      one of:<br><table><tr><td>{@link #OP_HEADER_GAIN HEADER_GAIN},</td><td>{@link #OP_ALBUM_GAIN ALBUM_GAIN},</td><td>{@link #OP_TRACK_GAIN TRACK_GAIN}</td><td>{@link #OP_ABSOLUTE_GAIN ABSOLUTE_GAIN}</td></tr></table>
     * @param _gain_offset_q8 the gain offset to apply, in {@code 1/256ths} of a dB
     *
     * @return 0 on success or a negative value on error. {@link #OP_EINVAL EINVAL} The {@code _gain_type} was unrecognized.
     */
    public static int op_set_gain_offset(@NativeType("OggOpusFile *") long _of, int _gain_type, @NativeType("opus_int32") int _gain_offset_q8) {
        long __functionAddress = Functions.op_set_gain_offset;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, _gain_type, _gain_offset_q8, __functionAddress);
    }

    // --- [ op_set_dither_enabled ] ---

    /**
     * Sets whether or not dithering is enabled for 16-bit decoding.
     * 
     * <p>By default, when libopusfile is compiled to use floating-point internally, calling {@link #op_read} or {@link #op_read_stereo} will first decode to float, and then
     * convert to fixed-point using noise-shaping dithering. This flag can be used to disable that dithering. When the application uses {@link #op_read_float} or
     * {@link #op_read_float_stereo}, or when the library has been compiled to decode directly to fixed point, this flag has no effect.</p>
     *
     * @param _of      the {@code OggOpusFile} on which to enable or disable dithering
     * @param _enabled a non-zero value to enable dithering, or 0 to disable it
     */
    public static void op_set_dither_enabled(@NativeType("OggOpusFile *") long _of, @NativeType("int") boolean _enabled) {
        long __functionAddress = Functions.op_set_dither_enabled;
        if (CHECKS) {
            check(_of);
        }
        invokePV(_of, _enabled ? 1 : 0, __functionAddress);
    }

    // --- [ op_read ] ---

    /**
     * Unsafe version of: {@link #op_read}
     *
     * @param _buf_size the number of values that can be stored in {@code _pcm}.
     *                  
     *                  <p>It is recommended that this be large enough for at least 120 ms of data at 48 kHz per channel (5760 values per channel). Smaller buffers will
     *                  simply return less data, possibly consuming more memory to buffer the data internally. libopusfile may return less data than requested. If so,
     *                  there is no guarantee that the remaining data in {@code _pcm} will be unmodified.</p>
     */
    public static int nop_read(long _of, long _pcm, int _buf_size, long _li) {
        long __functionAddress = Functions.op_read;
        if (CHECKS) {
            check(_of);
        }
        return invokePPPI(_of, _pcm, _buf_size, _li, __functionAddress);
    }

    /**
     * Reads more samples from the stream.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Although {@code _buf_size} must indicate the total number of values that can be stored in {@code _pcm}, the return value is the number of samples
     * <em>per channel</em>. This is done because</p>
     * 
     * <ol>
     * <li>The channel count cannot be known a priori (reading more samples might advance us into the next link, with a different channel count), so
     * {@code _buf_size} cannot also be in units of samples per channel</li>
     * <li>Returning the samples per channel matches the libopus API as closely as we're able</li>
     * <li>Returning the total number of values instead of samples per channel would mean the caller would need a division to compute the samples per channel,
     * and might worry about the possibility of getting back samples for some channels and not others, and</li>
     * <li>This approach is relatively fool-proof: if an application passes too small a value to {@code _buf_size}, they will simply get fewer samples back,
     * and if they assume the return value is the total number of values, then they will simply read too few (rather than reading too many and going off
     * the end of the buffer)</li>
     * </ol>
     * </div>
     *
     * @param _of  the {@code OggOpusFile} from which to read
     * @param _pcm a buffer in which to store the output PCM samples, as signed native-endian 16-bit values at 48 kHz with a nominal range of {@code [-32768,32767)}.
     *             Multiple channels are interleaved using the <a target="_blank" href="https://www.xiph.org/vorbis/doc/Vorbis_I_spec.html#x1-810004.3.9">Vorbis channel ordering</a>.
     *             This must have room for at least {@code _buf_size} values.
     * @param _li  the index of the link this data was decoded from.
     *             
     *             <p>You may pass {@code NULL} if you do not need this information. If this function fails (returning a negative value), this parameter is left unset.</p>
     *
     * @return the number of samples read per channel on success, or a negative value on failure.
     *         
     *         <p>The channel count can be retrieved on success by calling {@code op_head(_of,*_li)}. The number of samples returned may be 0 if the buffer was too small
     *         to store even a single sample for all channels, or if end-of-file was reached. The list of possible failure codes follows. Most of them can only be
     *         returned by unseekable, chained streams that encounter a new link.</p>
     *         
     *         <ul>
     *         <li>{@link #OP_HOLE HOLE} There was a hole in the data, and some samples may have been skipped. Call this function again to continue decoding past the hole</li>
     *         <li>{@link #OP_EREAD EREAD} An underlying read operation failed. This may signal a truncation attack from an {@code https:} source</li>
     *         <li>{@link #OP_EFAULT EFAULT} An internal memory allocation failed</li>
     *         <li>{@link #OP_EIMPL EIMPL} An unseekable stream encountered a new link that used a feature that is not implemented, such as an unsupported channel family</li>
     *         <li>{@link #OP_EINVAL EINVAL} The stream was only partially open</li>
     *         <li>{@link #OP_ENOTFORMAT ENOTFORMAT} An unseekable stream encountered a new link that did not have any logical Opus streams in it</li>
     *         <li>{@link #OP_EBADHEADER EBADHEADER} An unseekable stream encountered a new link with a required header packet that was not properly formatted, contained illegal values, or
     *         was missing altogether</li>
     *         <li>{@link #OP_EVERSION EVERSION} An unseekable stream encountered a new link with an ID header that contained an unrecognized version number</li>
     *         <li>{@link #OP_EBADPACKET EBADPACKET} Failed to properly decode the next packet</li>
     *         <li>{@link #OP_EBADLINK EBADLINK} We failed to find data we had seen before</li>
     *         <li>{@link #OP_EBADTIMESTAMP EBADTIMESTAMP} An unseekable stream encountered a new link with a starting timestamp that failed basic validity checks</li>
     *         </ul>
     */
    public static int op_read(@NativeType("OggOpusFile *") long _of, @NativeType("opus_int16 *") ShortBuffer _pcm, @Nullable @NativeType("int *") IntBuffer _li) {
        if (CHECKS) {
            checkSafe(_li, 1);
        }
        return nop_read(_of, memAddress(_pcm), _pcm.remaining(), memAddressSafe(_li));
    }

    // --- [ op_read_float ] ---

    /**
     * Unsafe version of: {@link #op_read_float}
     *
     * @param _buf_size the number of floats that can be stored in {@code _pcm}.
     *                  
     *                  <p>It is recommended that this be large enough for at least 120 ms of data at 48 kHz per channel (5760 samples per channel). Smaller buffers will
     *                  simply return less data, possibly consuming more memory to buffer the data internally. If less than {@code _buf_size} values are returned,
     *                  libopusfile makes no guarantee that the remaining data in {@code _pcm} will be unmodified.</p>
     */
    public static int nop_read_float(long _of, long _pcm, int _buf_size, long _li) {
        long __functionAddress = Functions.op_read_float;
        if (CHECKS) {
            check(_of);
        }
        return invokePPPI(_of, _pcm, _buf_size, _li, __functionAddress);
    }

    /**
     * Reads more samples from the stream.
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>Although {@code _buf_size} must indicate the total number of values that can be stored in {@code _pcm}, the return value is the number of samples
     * <em>per channel</em>.</p>
     * 
     * <ol>
     * <li>The channel count cannot be known a priori (reading more samples might advance us into the next link, with a different channel count), so
     * {@code _buf_size} cannot also be in units of samples per channel,</li>
     * <li>Returning the samples per channel matches the libopus API as closely as we're able,</li>
     * <li>Returning the total number of values instead of samples per channel would mean the caller would need a division to compute the samples per channel,
     * and might worry about the possibility of getting back samples for some channels and not others, and</li>
     * <li>This approach is relatively fool-proof: if an application passes too small a value to {@code _buf_size}, they will simply get fewer samples back,
     * and if they assume the return value is the total number of values, then they will simply read too few (rather than reading too many and going off
     * the end of the buffer).</li>
     * </ol>
     * </div>
     *
     * @param _of  the {@code OggOpusFile} from which to read
     * @param _pcm a buffer in which to store the output PCM samples as signed floats at 48 kHz with a nominal range of {@code [-1.0,1.0]}.
     *             
     *             <p>Multiple channels are interleaved using the <a target="_blank" href="https://www.xiph.org/vorbis/doc/Vorbis_I_spec.html#x1-810004.3.9">Vorbis channel ordering</a>.
     *             This must have room for at least {@code _buf_size} floats.</p>
     * @param _li  the index of the link this data was decoded from.
     *             
     *             <p>You may pass {@code NULL} if you do not need this information. If this function fails (returning a negative value), this parameter is left unset.</p>
     *
     * @return the number of samples read per channel on success, or a negative value on failure.
     *         
     *         <p>The channel count can be retrieved on success by calling {@code op_head(_of,*_li)}. The number of samples returned may be 0 if the buffer was too small
     *         to store even a single sample for all channels, or if end-of-file was reached. The list of possible failure codes follows. Most of them can only be
     *         returned by unseekable, chained streams that encounter a new link.</p>
     *         
     *         <ul>
     *         <li>{@link #OP_HOLE HOLE} There was a hole in the data, and some samples may have been skipped. Call this function again to continue decoding past the hole</li>
     *         <li>{@link #OP_EREAD EREAD} An underlying read operation failed. This may signal a truncation attack from an {@code https:} source</li>
     *         <li>{@link #OP_EFAULT EFAULT} An internal memory allocation failed</li>
     *         <li>{@link #OP_EIMPL EIMPL} An unseekable stream encountered a new link that used a feature that is not implemented, such as an unsupported channel family</li>
     *         <li>{@link #OP_EINVAL EINVAL} The stream was only partially open</li>
     *         <li>{@link #OP_ENOTFORMAT ENOTFORMAT} An unseekable stream encountered a new link that did not have any logical Opus streams in it</li>
     *         <li>{@link #OP_EBADHEADER EBADHEADER} An unseekable stream encountered a new link with a required header packet that was not properly formatted, contained illegal values, or
     *         was missing altogether</li>
     *         <li>{@link #OP_EVERSION EVERSION} An unseekable stream encountered a new link with an ID header that contained an unrecognized version number</li>
     *         <li>{@link #OP_EBADPACKET EBADPACKET} Failed to properly decode the next packet</li>
     *         <li>{@link #OP_EBADLINK EBADLINK} We failed to find data we had seen before</li>
     *         <li>{@link #OP_EBADTIMESTAMP EBADTIMESTAMP} An unseekable stream encountered a new link with a starting timestamp that failed basic validity checks</li>
     *         </ul>
     */
    public static int op_read_float(@NativeType("OggOpusFile *") long _of, @NativeType("float *") FloatBuffer _pcm, @Nullable @NativeType("int *") IntBuffer _li) {
        if (CHECKS) {
            checkSafe(_li, 1);
        }
        return nop_read_float(_of, memAddress(_pcm), _pcm.remaining(), memAddressSafe(_li));
    }

    // --- [ op_read_stereo ] ---

    /**
     * Unsafe version of: {@link #op_read_stereo}
     *
     * @param _buf_size the number of values that can be stored in {@code _pcm}.
     *                  
     *                  <p>It is recommended that this be large enough for at least 120 ms of data at 48 kHz per channel (11520 values total). Smaller buffers will simply
     *                  return less data, possibly consuming more memory to buffer the data internally. If less than {@code _buf_size} values are returned, libopusfile
     *                  makes no guarantee that the remaining data in {@code _pcm} will be unmodified.</p>
     */
    public static int nop_read_stereo(long _of, long _pcm, int _buf_size) {
        long __functionAddress = Functions.op_read_stereo;
        if (CHECKS) {
            check(_of);
        }
        return invokePPI(_of, _pcm, _buf_size, __functionAddress);
    }

    /**
     * Reads more samples from the stream and downmixes to stereo, if necessary.
     * 
     * <p>This function is intended for simple players that want a uniform output format, even if the channel count changes between links in a chained stream.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>{@code _buf_size} indicates the total number of values that can be stored in {@code _pcm}, while the return value is the number of samples <em>per
     * channel</em>, even though the channel count is known, for consistency with {@link #op_read}.</p>
     * </div>
     *
     * @param _of  the {@code OggOpusFile} from which to read
     * @param _pcm a buffer in which to store the output PCM samples, as signed native-endian 16-bit values at 48 kHz with a nominal range of {@code [-32768,32767)}.
     *             
     *             <p>The left and right channels are interleaved in the buffer. This must have room for at least {@code _buf_size} values.</p>
     *
     * @return the number of samples read per channel on success, or a negative value on failure.
     *         
     *         <p>The number of samples returned may be 0 if the buffer was too small to store even a single sample for both channels, or if end-of-file was reached.
     *         The list of possible failure codes follows. Most of them can only be returned by unseekable, chained streams that encounter a new link.</p>
     *         
     *         <ul>
     *         <li>{@link #OP_HOLE HOLE} There was a hole in the data, and some samples may have been skipped. Call this function again to continue decoding past the hole</li>
     *         <li>{@link #OP_EREAD EREAD} An underlying read operation failed. This may signal a truncation attack from an {@code https:} source</li>
     *         <li>{@link #OP_EFAULT EFAULT} An internal memory allocation failed</li>
     *         <li>{@link #OP_EIMPL EIMPL} An unseekable stream encountered a new link that used a feature that is not implemented, such as an unsupported channel family</li>
     *         <li>{@link #OP_EINVAL EINVAL} The stream was only partially open</li>
     *         <li>{@link #OP_ENOTFORMAT ENOTFORMAT} An unseekable stream encountered a new link that did not have any logical Opus streams in it</li>
     *         <li>{@link #OP_EBADHEADER EBADHEADER} An unseekable stream encountered a new link with a required header packet that was not properly formatted, contained illegal values, or
     *         was missing altogether</li>
     *         <li>{@link #OP_EVERSION EVERSION} An unseekable stream encountered a new link with an ID header that contained an unrecognized version number</li>
     *         <li>{@link #OP_EBADPACKET EBADPACKET} Failed to properly decode the next packet</li>
     *         <li>{@link #OP_EBADLINK EBADLINK} We failed to find data we had seen before</li>
     *         <li>{@link #OP_EBADTIMESTAMP EBADTIMESTAMP} An unseekable stream encountered a new link with a starting timestamp that failed basic validity checks</li>
     *         </ul>
     */
    public static int op_read_stereo(@NativeType("OggOpusFile *") long _of, @NativeType("opus_int16 *") ShortBuffer _pcm) {
        return nop_read_stereo(_of, memAddress(_pcm), _pcm.remaining());
    }

    // --- [ op_read_float_stereo ] ---

    /**
     * Unsafe version of: {@link #op_read_float_stereo}
     *
     * @param _buf_size the number of values that can be stored in {@code _pcm}.
     *                  
     *                  <p>It is recommended that this be large enough for at least 120 ms of data at 48 kHz per channel (11520 values total). Smaller buffers will simply
     *                  return less data, possibly consuming more memory to buffer the data internally. If less than {@code _buf_size} values are returned, libopusfile
     *                  makes no guarantee that the remaining data in {@code _pcm} will be unmodified.</p>
     */
    public static int nop_read_float_stereo(long _of, long _pcm, int _buf_size) {
        long __functionAddress = Functions.op_read_float_stereo;
        if (CHECKS) {
            check(_of);
        }
        return invokePPI(_of, _pcm, _buf_size, __functionAddress);
    }

    /**
     * Reads more samples from the stream and downmixes to stereo, if necessary.
     * 
     * <p>This function is intended for simple players that want a uniform output format, even if the channel count changes between links in a chained stream.</p>
     * 
     * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
     * 
     * <p>{@code _buf_size} indicates the total number of values that can be stored in {@code _pcm}, while the return value is the number of samples <em>per
     * channel</em>, even though the channel count is known, for consistency with {@link #op_read_float}.</p>
     * </div>
     *
     * @param _of  the {@code OggOpusFile} from which to read
     * @param _pcm a buffer in which to store the output PCM samples, as signed floats at 48 kHz with a nominal range of {@code [-1.0,1.0]}.
     *             
     *             <p>The left and right channels are interleaved in the buffer. This must have room for at least {@code _buf_size} values.</p>
     *
     * @return the number of samples read per channel on success, or a negative value on failure.
     *         
     *         <p>The number of samples returned may be 0 if the buffer was too small to store even a single sample for both channels, or if end-of-file was reached. The
     *         list of possible failure codes follows. Most of them can only be returned by unseekable, chained streams that encounter a new link.</p>
     *         
     *         <ul>
     *         <li>{@link #OP_HOLE HOLE} There was a hole in the data, and some samples may have been skipped. Call this function again to continue decoding past the hole</li>
     *         <li>{@link #OP_EREAD EREAD} An underlying read operation failed. This may signal a truncation attack from an {@code https:} source</li>
     *         <li>{@link #OP_EFAULT EFAULT} An internal memory allocation failed</li>
     *         <li>{@link #OP_EIMPL EIMPL} An unseekable stream encountered a new link that used a feature that is not implemented, such as an unsupported channel family</li>
     *         <li>{@link #OP_EINVAL EINVAL} The stream was only partially open</li>
     *         <li>{@link #OP_ENOTFORMAT ENOTFORMAT} An unseekable stream encountered a new link that that did not have any logical Opus streams in it</li>
     *         <li>{@link #OP_EBADHEADER EBADHEADER} An unseekable stream encountered a new link with a required header packet that was not properly formatted, contained illegal values, or
     *         was missing altogether</li>
     *         <li>{@link #OP_EVERSION EVERSION} An unseekable stream encountered a new link with an ID header that contained an unrecognized version number</li>
     *         <li>{@link #OP_EBADPACKET EBADPACKET} Failed to properly decode the next packet</li>
     *         <li>{@link #OP_EBADLINK EBADLINK} We failed to find data we had seen before</li>
     *         <li>{@link #OP_EBADTIMESTAMP EBADTIMESTAMP} An unseekable stream encountered a new link with a starting timestamp that failed basic validity checks</li>
     *         </ul>
     */
    public static int op_read_float_stereo(@NativeType("OggOpusFile *") long _of, @NativeType("float *") FloatBuffer _pcm) {
        return nop_read_float_stereo(_of, memAddress(_pcm), _pcm.remaining());
    }

}