/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

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

    public static final int
        OP_PIC_FORMAT_UNKNOWN = -1,
        OP_PIC_FORMAT_URL     = 0,
        OP_PIC_FORMAT_JPEG    = 1,
        OP_PIC_FORMAT_PNG     = 2,
        OP_PIC_FORMAT_GIF     = 3;

    public static final int
        OP_SSL_SKIP_CERTIFICATE_CHECK_REQUEST = 6464,
        OP_HTTP_PROXY_HOST_REQUEST            = 6528,
        OP_HTTP_PROXY_PORT_REQUEST            = 6592,
        OP_HTTP_PROXY_USER_REQUEST            = 6656,
        OP_HTTP_PROXY_PASS_REQUEST            = 6720,
        OP_GET_SERVER_INFO_REQUEST            = 6784;

    public static final int OP_DEC_FORMAT_SHORT = 7008;

    public static final int OP_DEC_FORMAT_FLOAT = 7040;

    public static final int OP_DEC_USE_DEFAULT = 6720;

    public static final int OP_HEADER_GAIN = 0;

    public static final int OP_ALBUM_GAIN = 3007;

    public static final int OP_TRACK_GAIN = 3008;

    public static final int OP_ABSOLUTE_GAIN = 3009;

    protected OpusFile() {
        throw new UnsupportedOperationException();
    }

    // --- [ opus_head_parse ] ---

    /** {@code int opus_head_parse(OpusHead * _head, unsigned char const * _data, size_t _len)} */
    public static int nopus_head_parse(long _head, long _data, long _len) {
        long __functionAddress = Functions.head_parse;
        return invokePPPI(_head, _data, _len, __functionAddress);
    }

    /** {@code int opus_head_parse(OpusHead * _head, unsigned char const * _data, size_t _len)} */
    public static int opus_head_parse(@NativeType("OpusHead *") OpusHead _head, @NativeType("unsigned char const *") ByteBuffer _data) {
        return nopus_head_parse(_head.address(), memAddress(_data), _data.remaining());
    }

    // --- [ opus_granule_sample ] ---

    /** {@code ogg_int64_t opus_granule_sample(OpusHead const * _head, ogg_int64_t _gp)} */
    public static long nopus_granule_sample(long _head, long _gp) {
        long __functionAddress = Functions.granule_sample;
        return invokePJJ(_head, _gp, __functionAddress);
    }

    /** {@code ogg_int64_t opus_granule_sample(OpusHead const * _head, ogg_int64_t _gp)} */
    @NativeType("ogg_int64_t")
    public static long opus_granule_sample(@NativeType("OpusHead const *") OpusHead _head, @NativeType("ogg_int64_t") long _gp) {
        return nopus_granule_sample(_head.address(), _gp);
    }

    // --- [ opus_tags_parse ] ---

    /** {@code int opus_tags_parse(OpusTags * _tags, unsigned char const * _data, size_t _len)} */
    public static int nopus_tags_parse(long _tags, long _data, long _len) {
        long __functionAddress = Functions.tags_parse;
        return invokePPPI(_tags, _data, _len, __functionAddress);
    }

    /** {@code int opus_tags_parse(OpusTags * _tags, unsigned char const * _data, size_t _len)} */
    public static int opus_tags_parse(@NativeType("OpusTags *") @Nullable OpusTags _tags, @NativeType("unsigned char const *") ByteBuffer _data) {
        return nopus_tags_parse(memAddressSafe(_tags), memAddress(_data), _data.remaining());
    }

    // --- [ opus_tags_copy ] ---

    /** {@code int opus_tags_copy(OpusTags * _dst, OpusTags const * _src)} */
    public static int nopus_tags_copy(long _dst, long _src) {
        long __functionAddress = Functions.tags_copy;
        return invokePPI(_dst, _src, __functionAddress);
    }

    /** {@code int opus_tags_copy(OpusTags * _dst, OpusTags const * _src)} */
    public static int opus_tags_copy(@NativeType("OpusTags *") OpusTags _dst, @NativeType("OpusTags const *") OpusTags _src) {
        return nopus_tags_copy(_dst.address(), _src.address());
    }

    // --- [ opus_tags_init ] ---

    /** {@code void opus_tags_init(OpusTags * _tags)} */
    public static void nopus_tags_init(long _tags) {
        long __functionAddress = Functions.tags_init;
        invokePV(_tags, __functionAddress);
    }

    /** {@code void opus_tags_init(OpusTags * _tags)} */
    public static void opus_tags_init(@NativeType("OpusTags *") OpusTags _tags) {
        nopus_tags_init(_tags.address());
    }

    // --- [ opus_tags_add ] ---

    /** {@code int opus_tags_add(OpusTags * _tags, char const * _tag, char const * _value)} */
    public static int nopus_tags_add(long _tags, long _tag, long _value) {
        long __functionAddress = Functions.tags_add;
        return invokePPPI(_tags, _tag, _value, __functionAddress);
    }

    /** {@code int opus_tags_add(OpusTags * _tags, char const * _tag, char const * _value)} */
    public static int opus_tags_add(@NativeType("OpusTags *") OpusTags _tags, @NativeType("char const *") ByteBuffer _tag, @NativeType("char const *") ByteBuffer _value) {
        if (CHECKS) {
            checkNT1(_tag);
            checkNT1(_value);
        }
        return nopus_tags_add(_tags.address(), memAddress(_tag), memAddress(_value));
    }

    /** {@code int opus_tags_add(OpusTags * _tags, char const * _tag, char const * _value)} */
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

    /** {@code int opus_tags_add_comment(OpusTags * _tags, char const * _comment)} */
    public static int nopus_tags_add_comment(long _tags, long _comment) {
        long __functionAddress = Functions.tags_add_comment;
        return invokePPI(_tags, _comment, __functionAddress);
    }

    /** {@code int opus_tags_add_comment(OpusTags * _tags, char const * _comment)} */
    public static int opus_tags_add_comment(@NativeType("OpusTags *") OpusTags _tags, @NativeType("char const *") ByteBuffer _comment) {
        if (CHECKS) {
            checkNT1(_comment);
        }
        return nopus_tags_add_comment(_tags.address(), memAddress(_comment));
    }

    /** {@code int opus_tags_add_comment(OpusTags * _tags, char const * _comment)} */
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

    /** {@code int opus_tags_set_binary_suffix(OpusTags * _tags, unsigned char const * _data, int _len)} */
    public static int nopus_tags_set_binary_suffix(long _tags, long _data, int _len) {
        long __functionAddress = Functions.tags_set_binary_suffix;
        return invokePPI(_tags, _data, _len, __functionAddress);
    }

    /** {@code int opus_tags_set_binary_suffix(OpusTags * _tags, unsigned char const * _data, int _len)} */
    public static int opus_tags_set_binary_suffix(@NativeType("OpusTags *") OpusTags _tags, @NativeType("unsigned char const *") @Nullable ByteBuffer _data) {
        return nopus_tags_set_binary_suffix(_tags.address(), memAddressSafe(_data), remainingSafe(_data));
    }

    // --- [ opus_tags_query ] ---

    /** {@code char const * opus_tags_query(OpusTags const * _tags, char const * _tag, int _count)} */
    public static long nopus_tags_query(long _tags, long _tag, int _count) {
        long __functionAddress = Functions.tags_query;
        return invokePPP(_tags, _tag, _count, __functionAddress);
    }

    /** {@code char const * opus_tags_query(OpusTags const * _tags, char const * _tag, int _count)} */
    @NativeType("char const *")
    public static @Nullable String opus_tags_query(@NativeType("OpusTags const *") OpusTags _tags, @NativeType("char const *") ByteBuffer _tag, int _count) {
        if (CHECKS) {
            checkNT1(_tag);
        }
        long __result = nopus_tags_query(_tags.address(), memAddress(_tag), _count);
        return memUTF8Safe(__result);
    }

    /** {@code char const * opus_tags_query(OpusTags const * _tags, char const * _tag, int _count)} */
    @NativeType("char const *")
    public static @Nullable String opus_tags_query(@NativeType("OpusTags const *") OpusTags _tags, @NativeType("char const *") CharSequence _tag, int _count) {
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

    /** {@code int opus_tags_query_count(OpusTags const * _tags, char const * _tag)} */
    public static int nopus_tags_query_count(long _tags, long _tag) {
        long __functionAddress = Functions.tags_query_count;
        return invokePPI(_tags, _tag, __functionAddress);
    }

    /** {@code int opus_tags_query_count(OpusTags const * _tags, char const * _tag)} */
    public static int opus_tags_query_count(@NativeType("OpusTags const *") OpusTags _tags, @NativeType("char const *") ByteBuffer _tag) {
        if (CHECKS) {
            checkNT1(_tag);
        }
        return nopus_tags_query_count(_tags.address(), memAddress(_tag));
    }

    /** {@code int opus_tags_query_count(OpusTags const * _tags, char const * _tag)} */
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

    /** {@code unsigned char const * opus_tags_get_binary_suffix(OpusTags const * _tags, int * _len)} */
    public static long nopus_tags_get_binary_suffix(long _tags, long _len) {
        long __functionAddress = Functions.tags_get_binary_suffix;
        return invokePPP(_tags, _len, __functionAddress);
    }

    /** {@code unsigned char const * opus_tags_get_binary_suffix(OpusTags const * _tags, int * _len)} */
    @NativeType("unsigned char const *")
    public static @Nullable ByteBuffer opus_tags_get_binary_suffix(@NativeType("OpusTags const *") OpusTags _tags) {
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

    /** {@code int opus_tags_get_album_gain(OpusTags const * _tags, int * _gain_q8)} */
    public static int nopus_tags_get_album_gain(long _tags, long _gain_q8) {
        long __functionAddress = Functions.tags_get_album_gain;
        return invokePPI(_tags, _gain_q8, __functionAddress);
    }

    /** {@code int opus_tags_get_album_gain(OpusTags const * _tags, int * _gain_q8)} */
    public static int opus_tags_get_album_gain(@NativeType("OpusTags const *") OpusTags _tags, @NativeType("int *") IntBuffer _gain_q8) {
        if (CHECKS) {
            check(_gain_q8, 1);
        }
        return nopus_tags_get_album_gain(_tags.address(), memAddress(_gain_q8));
    }

    // --- [ opus_tags_get_track_gain ] ---

    /** {@code int opus_tags_get_track_gain(OpusTags const * _tags, int * _gain_q8)} */
    public static int nopus_tags_get_track_gain(long _tags, long _gain_q8) {
        long __functionAddress = Functions.tags_get_track_gain;
        return invokePPI(_tags, _gain_q8, __functionAddress);
    }

    /** {@code int opus_tags_get_track_gain(OpusTags const * _tags, int * _gain_q8)} */
    public static int opus_tags_get_track_gain(@NativeType("OpusTags const *") OpusTags _tags, @NativeType("int *") IntBuffer _gain_q8) {
        if (CHECKS) {
            check(_gain_q8, 1);
        }
        return nopus_tags_get_track_gain(_tags.address(), memAddress(_gain_q8));
    }

    // --- [ opus_tags_clear ] ---

    /** {@code void opus_tags_clear(OpusTags * _tags)} */
    public static void nopus_tags_clear(long _tags) {
        long __functionAddress = Functions.tags_clear;
        invokePV(_tags, __functionAddress);
    }

    /** {@code void opus_tags_clear(OpusTags * _tags)} */
    public static void opus_tags_clear(@NativeType("OpusTags *") OpusTags _tags) {
        nopus_tags_clear(_tags.address());
    }

    // --- [ opus_tagcompare ] ---

    /** {@code int opus_tagcompare(char const * _tag_name, char const * _comment)} */
    public static int nopus_tagcompare(long _tag_name, long _comment) {
        long __functionAddress = Functions.tagcompare;
        return invokePPI(_tag_name, _comment, __functionAddress);
    }

    /** {@code int opus_tagcompare(char const * _tag_name, char const * _comment)} */
    public static int opus_tagcompare(@NativeType("char const *") ByteBuffer _tag_name, @NativeType("char const *") ByteBuffer _comment) {
        if (CHECKS) {
            checkNT1(_tag_name);
            checkNT1(_comment);
        }
        return nopus_tagcompare(memAddress(_tag_name), memAddress(_comment));
    }

    /** {@code int opus_tagcompare(char const * _tag_name, char const * _comment)} */
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

    /** {@code int opus_tagncompare(char const * _tag_name, int _tag_len, char const * _comment)} */
    public static int nopus_tagncompare(long _tag_name, int _tag_len, long _comment) {
        long __functionAddress = Functions.tagncompare;
        return invokePPI(_tag_name, _tag_len, _comment, __functionAddress);
    }

    /** {@code int opus_tagncompare(char const * _tag_name, int _tag_len, char const * _comment)} */
    public static int opus_tagncompare(@NativeType("char const *") ByteBuffer _tag_name, @NativeType("char const *") ByteBuffer _comment) {
        if (CHECKS) {
            checkNT1(_comment);
        }
        return nopus_tagncompare(memAddress(_tag_name), _tag_name.remaining(), memAddress(_comment));
    }

    /** {@code int opus_tagncompare(char const * _tag_name, int _tag_len, char const * _comment)} */
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

    /** {@code int opus_picture_tag_parse(OpusPictureTag * _pic, char const * _tag)} */
    public static int nopus_picture_tag_parse(long _pic, long _tag) {
        long __functionAddress = Functions.picture_tag_parse;
        return invokePPI(_pic, _tag, __functionAddress);
    }

    /** {@code int opus_picture_tag_parse(OpusPictureTag * _pic, char const * _tag)} */
    public static int opus_picture_tag_parse(@NativeType("OpusPictureTag *") OpusPictureTag _pic, @NativeType("char const *") ByteBuffer _tag) {
        if (CHECKS) {
            checkNT1(_tag);
        }
        return nopus_picture_tag_parse(_pic.address(), memAddress(_tag));
    }

    /** {@code int opus_picture_tag_parse(OpusPictureTag * _pic, char const * _tag)} */
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

    /** {@code void opus_picture_tag_init(OpusPictureTag * _pic)} */
    public static void nopus_picture_tag_init(long _pic) {
        long __functionAddress = Functions.picture_tag_init;
        invokePV(_pic, __functionAddress);
    }

    /** {@code void opus_picture_tag_init(OpusPictureTag * _pic)} */
    public static void opus_picture_tag_init(@NativeType("OpusPictureTag *") OpusPictureTag _pic) {
        nopus_picture_tag_init(_pic.address());
    }

    // --- [ opus_picture_tag_clear ] ---

    /** {@code void opus_picture_tag_clear(OpusPictureTag * _pic)} */
    public static void nopus_picture_tag_clear(long _pic) {
        long __functionAddress = Functions.picture_tag_clear;
        invokePV(_pic, __functionAddress);
    }

    /** {@code void opus_picture_tag_clear(OpusPictureTag * _pic)} */
    public static void opus_picture_tag_clear(@NativeType("OpusPictureTag *") OpusPictureTag _pic) {
        nopus_picture_tag_clear(_pic.address());
    }

    // --- [ op_fopen ] ---

    /** {@code void * op_fopen(OpusFileCallbacks * _cb, char const * _path, char const * _mode)} */
    public static long nop_fopen(long _cb, long _path, long _mode) {
        long __functionAddress = Functions.op_fopen;
        return invokePPPP(_cb, _path, _mode, __functionAddress);
    }

    /** {@code void * op_fopen(OpusFileCallbacks * _cb, char const * _path, char const * _mode)} */
    @NativeType("void *")
    public static long op_fopen(@NativeType("OpusFileCallbacks *") OpusFileCallbacks _cb, @NativeType("char const *") ByteBuffer _path, @NativeType("char const *") ByteBuffer _mode) {
        if (CHECKS) {
            checkNT1(_path);
            checkNT1(_mode);
        }
        return nop_fopen(_cb.address(), memAddress(_path), memAddress(_mode));
    }

    /** {@code void * op_fopen(OpusFileCallbacks * _cb, char const * _path, char const * _mode)} */
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

    /** {@code void * op_fdopen(OpusFileCallbacks * _cb, int _fd, char const * _mode)} */
    public static long nop_fdopen(long _cb, int _fd, long _mode) {
        long __functionAddress = Functions.op_fdopen;
        return invokePPP(_cb, _fd, _mode, __functionAddress);
    }

    /** {@code void * op_fdopen(OpusFileCallbacks * _cb, int _fd, char const * _mode)} */
    @NativeType("void *")
    public static long op_fdopen(@NativeType("OpusFileCallbacks *") OpusFileCallbacks _cb, int _fd, @NativeType("char const *") ByteBuffer _mode) {
        if (CHECKS) {
            checkNT1(_mode);
        }
        return nop_fdopen(_cb.address(), _fd, memAddress(_mode));
    }

    /** {@code void * op_fdopen(OpusFileCallbacks * _cb, int _fd, char const * _mode)} */
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

    /** {@code void * op_freopen(OpusFileCallbacks * _cb, char const * _path, char const * _mode, void * _stream)} */
    public static long nop_freopen(long _cb, long _path, long _mode, long _stream) {
        long __functionAddress = Functions.op_freopen;
        if (CHECKS) {
            check(_stream);
        }
        return invokePPPPP(_cb, _path, _mode, _stream, __functionAddress);
    }

    /** {@code void * op_freopen(OpusFileCallbacks * _cb, char const * _path, char const * _mode, void * _stream)} */
    @NativeType("void *")
    public static long op_freopen(@NativeType("OpusFileCallbacks *") OpusFileCallbacks _cb, @NativeType("char const *") ByteBuffer _path, @NativeType("char const *") ByteBuffer _mode, @NativeType("void *") long _stream) {
        if (CHECKS) {
            checkNT1(_path);
            checkNT1(_mode);
        }
        return nop_freopen(_cb.address(), memAddress(_path), memAddress(_mode), _stream);
    }

    /** {@code void * op_freopen(OpusFileCallbacks * _cb, char const * _path, char const * _mode, void * _stream)} */
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

    /** {@code void * op_mem_stream_create(OpusFileCallbacks * _cb, unsigned char const * _data, size_t _size)} */
    public static long nop_mem_stream_create(long _cb, long _data, long _size) {
        long __functionAddress = Functions.op_mem_stream_create;
        return invokePPPP(_cb, _data, _size, __functionAddress);
    }

    /** {@code void * op_mem_stream_create(OpusFileCallbacks * _cb, unsigned char const * _data, size_t _size)} */
    @NativeType("void *")
    public static long op_mem_stream_create(@NativeType("OpusFileCallbacks *") OpusFileCallbacks _cb, @NativeType("unsigned char const *") ByteBuffer _data) {
        return nop_mem_stream_create(_cb.address(), memAddress(_data), _data.remaining());
    }

    // --- [ op_test ] ---

    /** {@code int op_test(OpusHead * _head, unsigned char const * _initial_data, size_t _initial_bytes)} */
    public static int nop_test(long _head, long _initial_data, long _initial_bytes) {
        long __functionAddress = Functions.op_test;
        return invokePPPI(_head, _initial_data, _initial_bytes, __functionAddress);
    }

    /** {@code int op_test(OpusHead * _head, unsigned char const * _initial_data, size_t _initial_bytes)} */
    public static int op_test(@NativeType("OpusHead *") @Nullable OpusHead _head, @NativeType("unsigned char const *") ByteBuffer _initial_data) {
        return nop_test(memAddressSafe(_head), memAddress(_initial_data), _initial_data.remaining());
    }

    // --- [ op_open_file ] ---

    /** {@code OggOpusFile * op_open_file(char const * _path, int * _error)} */
    public static long nop_open_file(long _path, long _error) {
        long __functionAddress = Functions.op_open_file;
        return invokePPP(_path, _error, __functionAddress);
    }

    /** {@code OggOpusFile * op_open_file(char const * _path, int * _error)} */
    @NativeType("OggOpusFile *")
    public static long op_open_file(@NativeType("char const *") ByteBuffer _path, @NativeType("int *") @Nullable IntBuffer _error) {
        if (CHECKS) {
            checkNT1(_path);
            checkSafe(_error, 1);
        }
        return nop_open_file(memAddress(_path), memAddressSafe(_error));
    }

    /** {@code OggOpusFile * op_open_file(char const * _path, int * _error)} */
    @NativeType("OggOpusFile *")
    public static long op_open_file(@NativeType("char const *") CharSequence _path, @NativeType("int *") @Nullable IntBuffer _error) {
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

    /** {@code OggOpusFile * op_open_memory(unsigned char const * _data, size_t _size, int * _error)} */
    public static long nop_open_memory(long _data, long _size, long _error) {
        long __functionAddress = Functions.op_open_memory;
        return invokePPPP(_data, _size, _error, __functionAddress);
    }

    /** {@code OggOpusFile * op_open_memory(unsigned char const * _data, size_t _size, int * _error)} */
    @NativeType("OggOpusFile *")
    public static long op_open_memory(@NativeType("unsigned char const *") ByteBuffer _data, @NativeType("int *") @Nullable IntBuffer _error) {
        if (CHECKS) {
            checkSafe(_error, 1);
        }
        return nop_open_memory(memAddress(_data), _data.remaining(), memAddressSafe(_error));
    }

    // --- [ op_open_callbacks ] ---

    /** {@code OggOpusFile * op_open_callbacks(void * _stream, OpusFileCallbacks const * _cb, unsigned char const * _initial_data, size_t _initial_bytes, int * _error)} */
    public static long nop_open_callbacks(long _stream, long _cb, long _initial_data, long _initial_bytes, long _error) {
        long __functionAddress = Functions.op_open_callbacks;
        if (CHECKS) {
            check(_stream);
            OpusFileCallbacks.validate(_cb);
        }
        return invokePPPPPP(_stream, _cb, _initial_data, _initial_bytes, _error, __functionAddress);
    }

    /** {@code OggOpusFile * op_open_callbacks(void * _stream, OpusFileCallbacks const * _cb, unsigned char const * _initial_data, size_t _initial_bytes, int * _error)} */
    @NativeType("OggOpusFile *")
    public static long op_open_callbacks(@NativeType("void *") long _stream, @NativeType("OpusFileCallbacks const *") OpusFileCallbacks _cb, @NativeType("unsigned char const *") ByteBuffer _initial_data, @NativeType("int *") @Nullable IntBuffer _error) {
        if (CHECKS) {
            checkSafe(_error, 1);
        }
        return nop_open_callbacks(_stream, _cb.address(), memAddress(_initial_data), _initial_data.remaining(), memAddressSafe(_error));
    }

    // --- [ op_test_file ] ---

    /** {@code OggOpusFile * op_test_file(char const * _path, int * _error)} */
    public static long nop_test_file(long _path, long _error) {
        long __functionAddress = Functions.op_test_file;
        return invokePPP(_path, _error, __functionAddress);
    }

    /** {@code OggOpusFile * op_test_file(char const * _path, int * _error)} */
    @NativeType("OggOpusFile *")
    public static long op_test_file(@NativeType("char const *") ByteBuffer _path, @NativeType("int *") @Nullable IntBuffer _error) {
        if (CHECKS) {
            checkNT1(_path);
            checkSafe(_error, 1);
        }
        return nop_test_file(memAddress(_path), memAddressSafe(_error));
    }

    /** {@code OggOpusFile * op_test_file(char const * _path, int * _error)} */
    @NativeType("OggOpusFile *")
    public static long op_test_file(@NativeType("char const *") CharSequence _path, @NativeType("int *") @Nullable IntBuffer _error) {
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

    /** {@code OggOpusFile * op_test_memory(unsigned char const * _data, size_t _size, int * _error)} */
    public static long nop_test_memory(long _data, long _size, long _error) {
        long __functionAddress = Functions.op_test_memory;
        return invokePPPP(_data, _size, _error, __functionAddress);
    }

    /** {@code OggOpusFile * op_test_memory(unsigned char const * _data, size_t _size, int * _error)} */
    @NativeType("OggOpusFile *")
    public static long op_test_memory(@NativeType("unsigned char const *") ByteBuffer _data, @NativeType("int *") @Nullable IntBuffer _error) {
        if (CHECKS) {
            checkSafe(_error, 1);
        }
        return nop_test_memory(memAddress(_data), _data.remaining(), memAddressSafe(_error));
    }

    // --- [ op_test_callbacks ] ---

    /** {@code OggOpusFile * op_test_callbacks(void * _stream, OpusFileCallbacks const * _cb, unsigned char const * _initial_data, size_t _initial_bytes, int * _error)} */
    public static long nop_test_callbacks(long _stream, long _cb, long _initial_data, long _initial_bytes, long _error) {
        long __functionAddress = Functions.op_test_callbacks;
        if (CHECKS) {
            check(_stream);
            OpusFileCallbacks.validate(_cb);
        }
        return invokePPPPPP(_stream, _cb, _initial_data, _initial_bytes, _error, __functionAddress);
    }

    /** {@code OggOpusFile * op_test_callbacks(void * _stream, OpusFileCallbacks const * _cb, unsigned char const * _initial_data, size_t _initial_bytes, int * _error)} */
    @NativeType("OggOpusFile *")
    public static long op_test_callbacks(@NativeType("void *") long _stream, @NativeType("OpusFileCallbacks const *") OpusFileCallbacks _cb, @NativeType("unsigned char const *") ByteBuffer _initial_data, @NativeType("int *") @Nullable IntBuffer _error) {
        if (CHECKS) {
            checkSafe(_error, 1);
        }
        return nop_test_callbacks(_stream, _cb.address(), memAddress(_initial_data), _initial_data.remaining(), memAddressSafe(_error));
    }

    // --- [ op_test_open ] ---

    /** {@code int op_test_open(OggOpusFile * _of)} */
    public static int op_test_open(@NativeType("OggOpusFile *") long _of) {
        long __functionAddress = Functions.op_test_open;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, __functionAddress);
    }

    // --- [ op_free ] ---

    /** {@code void op_free(OggOpusFile * _of)} */
    public static void op_free(@NativeType("OggOpusFile *") long _of) {
        long __functionAddress = Functions.op_free;
        if (CHECKS) {
            check(_of);
        }
        invokePV(_of, __functionAddress);
    }

    // --- [ op_seekable ] ---

    /** {@code int op_seekable(OggOpusFile const * _of)} */
    @NativeType("int")
    public static boolean op_seekable(@NativeType("OggOpusFile const *") long _of) {
        long __functionAddress = Functions.op_seekable;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, __functionAddress) != 0;
    }

    // --- [ op_link_count ] ---

    /** {@code int op_link_count(OggOpusFile const * _of)} */
    public static int op_link_count(@NativeType("OggOpusFile const *") long _of) {
        long __functionAddress = Functions.op_link_count;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, __functionAddress);
    }

    // --- [ op_serialno ] ---

    /** {@code opus_uint32 op_serialno(OggOpusFile const * _of, int _li)} */
    @NativeType("opus_uint32")
    public static int op_serialno(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __functionAddress = Functions.op_serialno;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, _li, __functionAddress);
    }

    // --- [ op_channel_count ] ---

    /** {@code int op_channel_count(OggOpusFile const * _of, int _li)} */
    public static int op_channel_count(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __functionAddress = Functions.op_channel_count;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, _li, __functionAddress);
    }

    // --- [ op_raw_total ] ---

    /** {@code long long op_raw_total(OggOpusFile const * _of, int _li)} */
    @NativeType("long long")
    public static long op_raw_total(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __functionAddress = Functions.op_raw_total;
        if (CHECKS) {
            check(_of);
        }
        return invokePJ(_of, _li, __functionAddress);
    }

    // --- [ op_pcm_total ] ---

    /** {@code ogg_int64_t op_pcm_total(OggOpusFile const * _of, int _li)} */
    @NativeType("ogg_int64_t")
    public static long op_pcm_total(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __functionAddress = Functions.op_pcm_total;
        if (CHECKS) {
            check(_of);
        }
        return invokePJ(_of, _li, __functionAddress);
    }

    // --- [ op_head ] ---

    /** {@code OpusHead const * op_head(OggOpusFile const * _of, int _li)} */
    public static long nop_head(long _of, int _li) {
        long __functionAddress = Functions.op_head;
        if (CHECKS) {
            check(_of);
        }
        return invokePP(_of, _li, __functionAddress);
    }

    /** {@code OpusHead const * op_head(OggOpusFile const * _of, int _li)} */
    @NativeType("OpusHead const *")
    public static @Nullable OpusHead op_head(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __result = nop_head(_of, _li);
        return OpusHead.createSafe(__result);
    }

    // --- [ op_tags ] ---

    /** {@code OpusTags const * op_tags(OggOpusFile const * _of, int _li)} */
    public static long nop_tags(long _of, int _li) {
        long __functionAddress = Functions.op_tags;
        if (CHECKS) {
            check(_of);
        }
        return invokePP(_of, _li, __functionAddress);
    }

    /** {@code OpusTags const * op_tags(OggOpusFile const * _of, int _li)} */
    @NativeType("OpusTags const *")
    public static @Nullable OpusTags op_tags(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __result = nop_tags(_of, _li);
        return OpusTags.createSafe(__result);
    }

    // --- [ op_current_link ] ---

    /** {@code int op_current_link(OggOpusFile const * _of)} */
    public static int op_current_link(@NativeType("OggOpusFile const *") long _of) {
        long __functionAddress = Functions.op_current_link;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, __functionAddress);
    }

    // --- [ op_bitrate ] ---

    /** {@code opus_int32 op_bitrate(OggOpusFile const * _of, int _li)} */
    @NativeType("opus_int32")
    public static int op_bitrate(@NativeType("OggOpusFile const *") long _of, int _li) {
        long __functionAddress = Functions.op_bitrate;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, _li, __functionAddress);
    }

    // --- [ op_bitrate_instant ] ---

    /** {@code opus_int32 op_bitrate_instant(OggOpusFile * _of)} */
    @NativeType("opus_int32")
    public static int op_bitrate_instant(@NativeType("OggOpusFile *") long _of) {
        long __functionAddress = Functions.op_bitrate_instant;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, __functionAddress);
    }

    // --- [ op_raw_tell ] ---

    /** {@code long long op_raw_tell(OggOpusFile const * _of)} */
    @NativeType("long long")
    public static long op_raw_tell(@NativeType("OggOpusFile const *") long _of) {
        long __functionAddress = Functions.op_raw_tell;
        if (CHECKS) {
            check(_of);
        }
        return invokePJ(_of, __functionAddress);
    }

    // --- [ op_pcm_tell ] ---

    /** {@code ogg_int64_t op_pcm_tell(OggOpusFile const * _of)} */
    @NativeType("ogg_int64_t")
    public static long op_pcm_tell(@NativeType("OggOpusFile const *") long _of) {
        long __functionAddress = Functions.op_pcm_tell;
        if (CHECKS) {
            check(_of);
        }
        return invokePJ(_of, __functionAddress);
    }

    // --- [ op_raw_seek ] ---

    /** {@code int op_raw_seek(OggOpusFile * _of, long long _byte_offset)} */
    public static int op_raw_seek(@NativeType("OggOpusFile *") long _of, @NativeType("long long") long _byte_offset) {
        long __functionAddress = Functions.op_raw_seek;
        if (CHECKS) {
            check(_of);
        }
        return invokePJI(_of, _byte_offset, __functionAddress);
    }

    // --- [ op_pcm_seek ] ---

    /** {@code int op_pcm_seek(OggOpusFile * _of, ogg_int64_t _pcm_offset)} */
    public static int op_pcm_seek(@NativeType("OggOpusFile *") long _of, @NativeType("ogg_int64_t") long _pcm_offset) {
        long __functionAddress = Functions.op_pcm_seek;
        if (CHECKS) {
            check(_of);
        }
        return invokePJI(_of, _pcm_offset, __functionAddress);
    }

    // --- [ op_set_decode_callback ] ---

    /** {@code void op_set_decode_callback(OggOpusFile * _of, op_decode_cb_func _decode_cb, void * _ctx)} */
    public static void nop_set_decode_callback(long _of, long _decode_cb, long _ctx) {
        long __functionAddress = Functions.op_set_decode_callback;
        if (CHECKS) {
            check(_of);
            check(_ctx);
        }
        invokePPPV(_of, _decode_cb, _ctx, __functionAddress);
    }

    /** {@code void op_set_decode_callback(OggOpusFile * _of, op_decode_cb_func _decode_cb, void * _ctx)} */
    public static void op_set_decode_callback(@NativeType("OggOpusFile *") long _of, @NativeType("op_decode_cb_func") OPDecodeCBFuncI _decode_cb, @NativeType("void *") long _ctx) {
        nop_set_decode_callback(_of, _decode_cb.address(), _ctx);
    }

    // --- [ op_set_gain_offset ] ---

    /** {@code int op_set_gain_offset(OggOpusFile * _of, int _gain_type, opus_int32 _gain_offset_q8)} */
    public static int op_set_gain_offset(@NativeType("OggOpusFile *") long _of, int _gain_type, @NativeType("opus_int32") int _gain_offset_q8) {
        long __functionAddress = Functions.op_set_gain_offset;
        if (CHECKS) {
            check(_of);
        }
        return invokePI(_of, _gain_type, _gain_offset_q8, __functionAddress);
    }

    // --- [ op_set_dither_enabled ] ---

    /** {@code void op_set_dither_enabled(OggOpusFile * _of, int _enabled)} */
    public static void op_set_dither_enabled(@NativeType("OggOpusFile *") long _of, @NativeType("int") boolean _enabled) {
        long __functionAddress = Functions.op_set_dither_enabled;
        if (CHECKS) {
            check(_of);
        }
        invokePV(_of, _enabled ? 1 : 0, __functionAddress);
    }

    // --- [ op_read ] ---

    /** {@code int op_read(OggOpusFile * _of, opus_int16 * _pcm, int _buf_size, int * _li)} */
    public static int nop_read(long _of, long _pcm, int _buf_size, long _li) {
        long __functionAddress = Functions.op_read;
        if (CHECKS) {
            check(_of);
        }
        return invokePPPI(_of, _pcm, _buf_size, _li, __functionAddress);
    }

    /** {@code int op_read(OggOpusFile * _of, opus_int16 * _pcm, int _buf_size, int * _li)} */
    public static int op_read(@NativeType("OggOpusFile *") long _of, @NativeType("opus_int16 *") ShortBuffer _pcm, @NativeType("int *") @Nullable IntBuffer _li) {
        if (CHECKS) {
            checkSafe(_li, 1);
        }
        return nop_read(_of, memAddress(_pcm), _pcm.remaining(), memAddressSafe(_li));
    }

    // --- [ op_read_float ] ---

    /** {@code int op_read_float(OggOpusFile * _of, float * _pcm, int _buf_size, int * _li)} */
    public static int nop_read_float(long _of, long _pcm, int _buf_size, long _li) {
        long __functionAddress = Functions.op_read_float;
        if (CHECKS) {
            check(_of);
        }
        return invokePPPI(_of, _pcm, _buf_size, _li, __functionAddress);
    }

    /** {@code int op_read_float(OggOpusFile * _of, float * _pcm, int _buf_size, int * _li)} */
    public static int op_read_float(@NativeType("OggOpusFile *") long _of, @NativeType("float *") FloatBuffer _pcm, @NativeType("int *") @Nullable IntBuffer _li) {
        if (CHECKS) {
            checkSafe(_li, 1);
        }
        return nop_read_float(_of, memAddress(_pcm), _pcm.remaining(), memAddressSafe(_li));
    }

    // --- [ op_read_stereo ] ---

    /** {@code int op_read_stereo(OggOpusFile * _of, opus_int16 * _pcm, int _buf_size)} */
    public static int nop_read_stereo(long _of, long _pcm, int _buf_size) {
        long __functionAddress = Functions.op_read_stereo;
        if (CHECKS) {
            check(_of);
        }
        return invokePPI(_of, _pcm, _buf_size, __functionAddress);
    }

    /** {@code int op_read_stereo(OggOpusFile * _of, opus_int16 * _pcm, int _buf_size)} */
    public static int op_read_stereo(@NativeType("OggOpusFile *") long _of, @NativeType("opus_int16 *") ShortBuffer _pcm) {
        return nop_read_stereo(_of, memAddress(_pcm), _pcm.remaining());
    }

    // --- [ op_read_float_stereo ] ---

    /** {@code int op_read_float_stereo(OggOpusFile * _of, float * _pcm, int _buf_size)} */
    public static int nop_read_float_stereo(long _of, long _pcm, int _buf_size) {
        long __functionAddress = Functions.op_read_float_stereo;
        if (CHECKS) {
            check(_of);
        }
        return invokePPI(_of, _pcm, _buf_size, __functionAddress);
    }

    /** {@code int op_read_float_stereo(OggOpusFile * _of, float * _pcm, int _buf_size)} */
    public static int op_read_float_stereo(@NativeType("OggOpusFile *") long _of, @NativeType("float *") FloatBuffer _pcm) {
        return nop_read_float_stereo(_of, memAddress(_pcm), _pcm.remaining());
    }

}