/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.opus;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.JNI.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import static org.lwjgl.util.opus.Opus.*;

/**
 * This is the documentation for the <a target="_blank" href="https://github.com/xiph/libopusenc">libopusenc</a> C API.
 * 
 * <p>The {@code libopusenc} package provides a convenient high-level API for encoding Ogg Opus files.</p>
 * 
 * <h3>Organization</h3>
 * 
 * <p>The main API is divided into several sections:</p>
 * 
 * <ul>
 * <li>encoding</li>
 * <li>comments</li>
 * <li>encoder_ctl</li>
 * <li>callbacks</li>
 * <li>error_codes</li>
 * </ul>
 * 
 * <h4>Error Codes</h4>
 * 
 * <p>Many of the functions in this library return a negative error code when a function fails.</p>
 */
public class OpusEnc {

    /** Contains the function pointers loaded from {@code Opus.getLibrary()}. */
    public static final class Functions {

        private Functions() {}

        /** Function address. */
        public static final long
            comments_create                    = apiGetFunctionAddress(Opus.getLibrary(), "ope_comments_create"),
            comments_copy                      = apiGetFunctionAddress(Opus.getLibrary(), "ope_comments_copy"),
            comments_destroy                   = apiGetFunctionAddress(Opus.getLibrary(), "ope_comments_destroy"),
            comments_add                       = apiGetFunctionAddress(Opus.getLibrary(), "ope_comments_add"),
            comments_add_string                = apiGetFunctionAddress(Opus.getLibrary(), "ope_comments_add_string"),
            comments_add_picture               = apiGetFunctionAddress(Opus.getLibrary(), "ope_comments_add_picture"),
            comments_add_picture_from_memory   = apiGetFunctionAddress(Opus.getLibrary(), "ope_comments_add_picture_from_memory"),
            encoder_create_file                = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_create_file"),
            encoder_create_callbacks           = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_create_callbacks"),
            encoder_create_pull                = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_create_pull"),
            encoder_deferred_init_with_mapping = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_deferred_init_with_mapping"),
            encoder_write_float                = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_write_float"),
            encoder_write                      = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_write"),
            encoder_get_page                   = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_get_page"),
            encoder_drain                      = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_drain"),
            encoder_destroy                    = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_destroy"),
            encoder_chain_current              = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_chain_current"),
            encoder_continue_new_file          = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_continue_new_file"),
            encoder_continue_new_callbacks     = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_continue_new_callbacks"),
            encoder_flush_header               = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_flush_header"),
            encoder_ctl                        = apiGetFunctionAddress(Opus.getLibrary(), "ope_encoder_ctl"),
            strerror                           = apiGetFunctionAddress(Opus.getLibrary(), "ope_strerror"),
            get_version_string                 = apiGetFunctionAddress(Opus.getLibrary(), "ope_get_version_string"),
            get_abi_version                    = apiGetFunctionAddress(Opus.getLibrary(), "ope_get_abi_version");

    }

    /** API version for this header. Can be used to check for features at compile time. */
    public static final int OPE_API_VERSION = 0;

    /** Error codes. */
    public static final int
        OPE_OK              = 0,
        OPE_BAD_ARG         = -11,
        OPE_INTERNAL_ERROR  = -13,
        OPE_UNIMPLEMENTED   = -15,
        OPE_ALLOC_FAIL      = -17,
        OPE_CANNOT_OPEN     = -30,
        OPE_TOO_LATE        = -31,
        OPE_INVALID_PICTURE = -32,
        OPE_INVALID_ICON    = -33,
        OPE_WRITE_FAIL      = -34,
        OPE_CLOSE_FAIL      = -35;

    /**
     * "Raw" request values -- they should usually not be used.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #OPE_SET_DECISION_DELAY_REQUEST SET_DECISION_DELAY_REQUEST}</li>
     * <li>{@link #OPE_GET_DECISION_DELAY_REQUEST GET_DECISION_DELAY_REQUEST}</li>
     * <li>{@link #OPE_SET_MUXING_DELAY_REQUEST SET_MUXING_DELAY_REQUEST}</li>
     * <li>{@link #OPE_GET_MUXING_DELAY_REQUEST GET_MUXING_DELAY_REQUEST}</li>
     * <li>{@link #OPE_SET_COMMENT_PADDING_REQUEST SET_COMMENT_PADDING_REQUEST}</li>
     * <li>{@link #OPE_GET_COMMENT_PADDING_REQUEST GET_COMMENT_PADDING_REQUEST}</li>
     * <li>{@link #OPE_SET_SERIALNO_REQUEST SET_SERIALNO_REQUEST}</li>
     * <li>{@link #OPE_GET_SERIALNO_REQUEST GET_SERIALNO_REQUEST}</li>
     * <li>{@link #OPE_SET_PACKET_CALLBACK_REQUEST SET_PACKET_CALLBACK_REQUEST}</li>
     * <li>{@link #OPE_SET_HEADER_GAIN_REQUEST SET_HEADER_GAIN_REQUEST}</li>
     * <li>{@link #OPE_GET_HEADER_GAIN_REQUEST GET_HEADER_GAIN_REQUEST}</li>
     * <li>{@link #OPE_GET_NB_STREAMS_REQUEST GET_NB_STREAMS_REQUEST}</li>
     * <li>{@link #OPE_GET_NB_COUPLED_STREAMS_REQUEST GET_NB_COUPLED_STREAMS_REQUEST}</li>
     * </ul>
     */
    public static final int
        OPE_SET_DECISION_DELAY_REQUEST     = 14000,
        OPE_GET_DECISION_DELAY_REQUEST     = 14001,
        OPE_SET_MUXING_DELAY_REQUEST       = 14002,
        OPE_GET_MUXING_DELAY_REQUEST       = 14003,
        OPE_SET_COMMENT_PADDING_REQUEST    = 14004,
        OPE_GET_COMMENT_PADDING_REQUEST    = 14005,
        OPE_SET_SERIALNO_REQUEST           = 14006,
        OPE_GET_SERIALNO_REQUEST           = 14007,
        OPE_SET_PACKET_CALLBACK_REQUEST    = 14008,
        OPE_SET_HEADER_GAIN_REQUEST        = 14010,
        OPE_GET_HEADER_GAIN_REQUEST        = 14011,
        OPE_GET_NB_STREAMS_REQUEST         = 14013,
        OPE_GET_NB_COUPLED_STREAMS_REQUEST = 14015;

    protected OpusEnc() {
        throw new UnsupportedOperationException();
    }

    // --- [ ope_comments_create ] ---

    /**
     * Create a new comments object.
     *
     * @return newly-created comments object
     */
    @NativeType("OggOpusComments *")
    public static long ope_comments_create() {
        long __functionAddress = Functions.comments_create;
        return invokeP(__functionAddress);
    }

    // --- [ ope_comments_copy ] ---

    /**
     * Create a deep copy of a comments object.
     *
     * @param comments comments object to copy
     *
     * @return deep copy of input
     */
    @NativeType("OggOpusComments *")
    public static long ope_comments_copy(@NativeType("OggOpusComments *") long comments) {
        long __functionAddress = Functions.comments_copy;
        if (CHECKS) {
            check(comments);
        }
        return invokePP(comments, __functionAddress);
    }

    // --- [ ope_comments_destroy ] ---

    /**
     * Destroys a comments object.
     *
     * @param comments comments object to destroy
     */
    public static void ope_comments_destroy(@NativeType("OggOpusComments *") long comments) {
        long __functionAddress = Functions.comments_destroy;
        if (CHECKS) {
            check(comments);
        }
        invokePV(comments, __functionAddress);
    }

    // --- [ ope_comments_add ] ---

    /** Unsafe version of: {@link #ope_comments_add comments_add} */
    public static int nope_comments_add(long comments, long tag, long val) {
        long __functionAddress = Functions.comments_add;
        if (CHECKS) {
            check(comments);
        }
        return invokePPPI(comments, tag, val, __functionAddress);
    }

    /**
     * Add a comment.
     *
     * @param comments where to add the comments
     * @param tag      tag for the comment (must not contain {@code =} char)
     * @param val      value for the tag
     *
     * @return error code
     */
    public static int ope_comments_add(@NativeType("OggOpusComments *") long comments, @NativeType("char const *") ByteBuffer tag, @NativeType("char const *") ByteBuffer val) {
        if (CHECKS) {
            checkNT1(tag);
            checkNT1(val);
        }
        return nope_comments_add(comments, memAddress(tag), memAddress(val));
    }

    /**
     * Add a comment.
     *
     * @param comments where to add the comments
     * @param tag      tag for the comment (must not contain {@code =} char)
     * @param val      value for the tag
     *
     * @return error code
     */
    public static int ope_comments_add(@NativeType("OggOpusComments *") long comments, @NativeType("char const *") CharSequence tag, @NativeType("char const *") CharSequence val) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(tag, true);
            long tagEncoded = stack.getPointerAddress();
            stack.nUTF8(val, true);
            long valEncoded = stack.getPointerAddress();
            return nope_comments_add(comments, tagEncoded, valEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ope_comments_add_string ] ---

    /** Unsafe version of: {@link #ope_comments_add_string comments_add_string} */
    public static int nope_comments_add_string(long comments, long tag_and_val) {
        long __functionAddress = Functions.comments_add_string;
        if (CHECKS) {
            check(comments);
        }
        return invokePPI(comments, tag_and_val, __functionAddress);
    }

    /**
     * Add a comment as a single tag=value string.
     *
     * @param comments    where to add the comments
     * @param tag_and_val string of the form {@code tag=value} (must contain {@code =} char)
     *
     * @return error code
     */
    public static int ope_comments_add_string(@NativeType("OggOpusComments *") long comments, @NativeType("char const *") ByteBuffer tag_and_val) {
        if (CHECKS) {
            checkNT1(tag_and_val);
        }
        return nope_comments_add_string(comments, memAddress(tag_and_val));
    }

    /**
     * Add a comment as a single tag=value string.
     *
     * @param comments    where to add the comments
     * @param tag_and_val string of the form {@code tag=value} (must contain {@code =} char)
     *
     * @return error code
     */
    public static int ope_comments_add_string(@NativeType("OggOpusComments *") long comments, @NativeType("char const *") CharSequence tag_and_val) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(tag_and_val, true);
            long tag_and_valEncoded = stack.getPointerAddress();
            return nope_comments_add_string(comments, tag_and_valEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ope_comments_add_picture ] ---

    /** Unsafe version of: {@link #ope_comments_add_picture comments_add_picture} */
    public static int nope_comments_add_picture(long comments, long filename, int picture_type, long description) {
        long __functionAddress = Functions.comments_add_picture;
        if (CHECKS) {
            check(comments);
        }
        return invokePPPI(comments, filename, picture_type, description, __functionAddress);
    }

    /**
     * Add a picture from a file.
     *
     * @param comments     where to add the comments
     * @param filename     file name for the picture
     * @param picture_type type of picture ({@code -1} for default)
     * @param description  description ({@code NULL} means no comment)
     *
     * @return error code
     */
    public static int ope_comments_add_picture(@NativeType("OggOpusComments *") long comments, @NativeType("char const *") ByteBuffer filename, int picture_type, @Nullable @NativeType("char const *") ByteBuffer description) {
        if (CHECKS) {
            checkNT1(filename);
            checkNT1Safe(description);
        }
        return nope_comments_add_picture(comments, memAddress(filename), picture_type, memAddressSafe(description));
    }

    /**
     * Add a picture from a file.
     *
     * @param comments     where to add the comments
     * @param filename     file name for the picture
     * @param picture_type type of picture ({@code -1} for default)
     * @param description  description ({@code NULL} means no comment)
     *
     * @return error code
     */
    public static int ope_comments_add_picture(@NativeType("OggOpusComments *") long comments, @NativeType("char const *") CharSequence filename, int picture_type, @Nullable @NativeType("char const *") CharSequence description) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            stack.nUTF8Safe(description, true);
            long descriptionEncoded = description == null ? NULL : stack.getPointerAddress();
            return nope_comments_add_picture(comments, filenameEncoded, picture_type, descriptionEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ope_comments_add_picture_from_memory ] ---

    /**
     * Unsafe version of: {@link #ope_comments_add_picture_from_memory comments_add_picture_from_memory}
     *
     * @param size size of picture pointed to by {@code ptr}
     */
    public static int nope_comments_add_picture_from_memory(long comments, long ptr, long size, int picture_type, long description) {
        long __functionAddress = Functions.comments_add_picture_from_memory;
        if (CHECKS) {
            check(comments);
        }
        return invokePPPPI(comments, ptr, size, picture_type, description, __functionAddress);
    }

    /**
     * Add a picture already in memory.
     *
     * @param comments     where to add the comments
     * @param ptr          pointer to picture in memory
     * @param picture_type type of picture ({@code -1} for default)
     * @param description  description ({@code NULL} means no comment)
     *
     * @return error code
     */
    public static int ope_comments_add_picture_from_memory(@NativeType("OggOpusComments *") long comments, @NativeType("char const *") ByteBuffer ptr, int picture_type, @Nullable @NativeType("char const *") ByteBuffer description) {
        if (CHECKS) {
            checkNT1Safe(description);
        }
        return nope_comments_add_picture_from_memory(comments, memAddress(ptr), ptr.remaining(), picture_type, memAddressSafe(description));
    }

    /**
     * Add a picture already in memory.
     *
     * @param comments     where to add the comments
     * @param ptr          pointer to picture in memory
     * @param picture_type type of picture ({@code -1} for default)
     * @param description  description ({@code NULL} means no comment)
     *
     * @return error code
     */
    public static int ope_comments_add_picture_from_memory(@NativeType("OggOpusComments *") long comments, @NativeType("char const *") ByteBuffer ptr, int picture_type, @Nullable @NativeType("char const *") CharSequence description) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(description, true);
            long descriptionEncoded = description == null ? NULL : stack.getPointerAddress();
            return nope_comments_add_picture_from_memory(comments, memAddress(ptr), ptr.remaining(), picture_type, descriptionEncoded);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ope_encoder_create_file ] ---

    /** Unsafe version of: {@link #ope_encoder_create_file encoder_create_file} */
    public static long nope_encoder_create_file(long path, long comments, int rate, int channels, int family, long error) {
        long __functionAddress = Functions.encoder_create_file;
        if (CHECKS) {
            check(comments);
        }
        return invokePPPP(path, comments, rate, channels, family, error, __functionAddress);
    }

    /**
     * Create a new OggOpus file.
     *
     * @param path     path where to create the file
     * @param comments comments associated with the stream
     * @param rate     input sampling rate (48 kHz is faster)
     * @param channels number of channels
     * @param family   mapping family (0 for mono/stereo, 1 for surround)
     * @param error    error code ({@code NULL} if no error is to be returned)
     *
     * @return newly-created encoder
     */
    @NativeType("OggOpusEnc *")
    public static long ope_encoder_create_file(@NativeType("char const *") ByteBuffer path, @NativeType("OggOpusComments *") long comments, @NativeType("opus_int32") int rate, int channels, int family, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkNT1(path);
            checkSafe(error, 1);
        }
        return nope_encoder_create_file(memAddress(path), comments, rate, channels, family, memAddressSafe(error));
    }

    /**
     * Create a new OggOpus file.
     *
     * @param path     path where to create the file
     * @param comments comments associated with the stream
     * @param rate     input sampling rate (48 kHz is faster)
     * @param channels number of channels
     * @param family   mapping family (0 for mono/stereo, 1 for surround)
     * @param error    error code ({@code NULL} if no error is to be returned)
     *
     * @return newly-created encoder
     */
    @NativeType("OggOpusEnc *")
    public static long ope_encoder_create_file(@NativeType("char const *") CharSequence path, @NativeType("OggOpusComments *") long comments, @NativeType("opus_int32") int rate, int channels, int family, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nope_encoder_create_file(pathEncoded, comments, rate, channels, family, memAddressSafe(error));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ope_encoder_create_callbacks ] ---

    /** Unsafe version of: {@link #ope_encoder_create_callbacks encoder_create_callbacks} */
    public static long nope_encoder_create_callbacks(long callbacks, long user_data, long comments, int rate, int channels, int family, long error) {
        long __functionAddress = Functions.encoder_create_callbacks;
        if (CHECKS) {
            OpusEncCallbacks.validate(callbacks);
            check(user_data);
            check(comments);
        }
        return invokePPPPP(callbacks, user_data, comments, rate, channels, family, error, __functionAddress);
    }

    /**
     * Create a new OggOpus stream to be handled using callbacks
     *
     * @param callbacks callback functions
     * @param user_data pointer to be associated with the stream and passed to the callbacks
     * @param comments  comments associated with the stream
     * @param rate      input sampling rate (48 kHz is faster)
     * @param channels  number of channels
     * @param family    mapping family ({@code 0} for mono/stereo, {@code 1} for surround)
     * @param error     error code ({@code NULL} if no error is to be returned)
     *
     * @return newly-created encoder
     */
    @NativeType("OggOpusEnc *")
    public static long ope_encoder_create_callbacks(@NativeType("OpusEncCallbacks const *") OpusEncCallbacks callbacks, @NativeType("void *") long user_data, @NativeType("OggOpusComments *") long comments, @NativeType("opus_int32") int rate, int channels, int family, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nope_encoder_create_callbacks(callbacks.address(), user_data, comments, rate, channels, family, memAddressSafe(error));
    }

    // --- [ ope_encoder_create_pull ] ---

    /** Unsafe version of: {@link #ope_encoder_create_pull encoder_create_pull} */
    public static long nope_encoder_create_pull(long comments, int rate, int channels, int family, long error) {
        long __functionAddress = Functions.encoder_create_pull;
        if (CHECKS) {
            check(comments);
        }
        return invokePPP(comments, rate, channels, family, error, __functionAddress);
    }

    /**
     * Create a new OggOpus stream to be used along with {@link #ope_encoder_get_page encoder_get_page}. This is mostly useful for muxing with other streams.
     *
     * @param comments comments associated with the stream
     * @param rate     input sampling rate (48 kHz is faster)
     * @param channels number of channels
     * @param family   mapping family (0 for mono/stereo, 1 for surround)
     * @param error    error code ({@code NULL} if no error is to be returned)
     *
     * @return newly-created encoder
     */
    @NativeType("OggOpusEnc *")
    public static long ope_encoder_create_pull(@NativeType("OggOpusComments *") long comments, @NativeType("opus_int32") int rate, int channels, int family, @Nullable @NativeType("int *") IntBuffer error) {
        if (CHECKS) {
            checkSafe(error, 1);
        }
        return nope_encoder_create_pull(comments, rate, channels, family, memAddressSafe(error));
    }

    // --- [ ope_encoder_deferred_init_with_mapping ] ---

    /** Unsafe version of: {@link #ope_encoder_deferred_init_with_mapping encoder_deferred_init_with_mapping} */
    public static int nope_encoder_deferred_init_with_mapping(long enc, int family, int streams, int coupled_streams, long mapping) {
        long __functionAddress = Functions.encoder_deferred_init_with_mapping;
        if (CHECKS) {
            check(enc);
        }
        return invokePPI(enc, family, streams, coupled_streams, mapping, __functionAddress);
    }

    /**
     * Deferred initialization of the encoder to force an explicit channel mapping. This can be used to override the default channel coupling, but using it
     * for regular surround will almost certainly lead to worse quality.
     *
     * @param enc             encoder
     * @param family          mapping family ({@code 0} for mono/stereo, {@code 1} for surround)
     * @param streams         total number of streams
     * @param coupled_streams number of coupled streams
     * @param mapping         channel mapping
     *
     * @return error code
     */
    public static int ope_encoder_deferred_init_with_mapping(@NativeType("OggOpusEnc *") long enc, int family, int streams, int coupled_streams, @NativeType("unsigned char const *") ByteBuffer mapping) {
        return nope_encoder_deferred_init_with_mapping(enc, family, streams, coupled_streams, memAddress(mapping));
    }

    // --- [ ope_encoder_write_float ] ---

    /** Unsafe version of: {@link #ope_encoder_write_float encoder_write_float} */
    public static int nope_encoder_write_float(long enc, long pcm, int samples_per_channel) {
        long __functionAddress = Functions.encoder_write_float;
        if (CHECKS) {
            check(enc);
        }
        return invokePPI(enc, pcm, samples_per_channel, __functionAddress);
    }

    /**
     * Add/encode any number of float samples to the stream.
     *
     * @param enc                 encoder
     * @param pcm                 floating-point PCM values in the {@code +/-1} range (interleaved if multiple channels)
     * @param samples_per_channel number of samples for each channel
     *
     * @return error code
     */
    public static int ope_encoder_write_float(@NativeType("OggOpusEnc *") long enc, @NativeType("float const *") FloatBuffer pcm, int samples_per_channel) {
        return nope_encoder_write_float(enc, memAddress(pcm), samples_per_channel);
    }

    // --- [ ope_encoder_write ] ---

    /** Unsafe version of: {@link #ope_encoder_write encoder_write} */
    public static int nope_encoder_write(long enc, long pcm, int samples_per_channel) {
        long __functionAddress = Functions.encoder_write;
        if (CHECKS) {
            check(enc);
        }
        return invokePPI(enc, pcm, samples_per_channel, __functionAddress);
    }

    /**
     * Add/encode any number of 16-bit linear samples to the stream.
     *
     * @param enc                 encoder
     * @param pcm                 linear 16-bit PCM values in the {@code [-32768,32767]} range (interleaved if multiple channels)
     * @param samples_per_channel number of samples for each channel
     *
     * @return error code
     */
    public static int ope_encoder_write(@NativeType("OggOpusEnc *") long enc, @NativeType("opus_int16 const *") ShortBuffer pcm, int samples_per_channel) {
        return nope_encoder_write(enc, memAddress(pcm), samples_per_channel);
    }

    // --- [ ope_encoder_get_page ] ---

    /** Unsafe version of: {@link #ope_encoder_get_page encoder_get_page} */
    public static int nope_encoder_get_page(long enc, long page, long len, int flush) {
        long __functionAddress = Functions.encoder_get_page;
        if (CHECKS) {
            check(enc);
        }
        return invokePPPI(enc, page, len, flush, __functionAddress);
    }

    /**
     * Get the next page from the stream (only if using {@link #ope_encoder_create_pull encoder_create_pull}).
     *
     * @param enc   encoder
     * @param page  next available encoded page
     * @param len   size (in bytes) of the page returned
     * @param flush if non-zero, forces a flush of the page (if any data available)
     *
     * @return 1 if there is a page available, 0 if not
     */
    @NativeType("int")
    public static boolean ope_encoder_get_page(@NativeType("OggOpusEnc *") long enc, @NativeType("unsigned char **") PointerBuffer page, @NativeType("opus_int32 *") IntBuffer len, @NativeType("int") boolean flush) {
        if (CHECKS) {
            check(page, 1);
            check(len, 1);
        }
        return nope_encoder_get_page(enc, memAddress(page), memAddress(len), flush ? 1 : 0) != 0;
    }

    // --- [ ope_encoder_drain ] ---

    /**
     * Finalizes the stream, but does not deallocate the object.
     *
     * @param enc encoder
     *
     * @return error code
     */
    public static int ope_encoder_drain(@NativeType("OggOpusEnc *") long enc) {
        long __functionAddress = Functions.encoder_drain;
        if (CHECKS) {
            check(enc);
        }
        return invokePI(enc, __functionAddress);
    }

    // --- [ ope_encoder_destroy ] ---

    /**
     * Deallocates the obect. Make sure to {@link #ope_encoder_drain encoder_drain} first.
     *
     * @param enc encoder
     */
    public static void ope_encoder_destroy(@NativeType("OggOpusEnc *") long enc) {
        long __functionAddress = Functions.encoder_destroy;
        if (CHECKS) {
            check(enc);
        }
        invokePV(enc, __functionAddress);
    }

    // --- [ ope_encoder_chain_current ] ---

    /**
     * Ends the stream and create a new stream within the same file.
     *
     * @param enc      encoder
     * @param comments comments associated with the stream
     *
     * @return error code
     */
    public static int ope_encoder_chain_current(@NativeType("OggOpusEnc *") long enc, @NativeType("OggOpusComments *") long comments) {
        long __functionAddress = Functions.encoder_chain_current;
        if (CHECKS) {
            check(enc);
            check(comments);
        }
        return invokePPI(enc, comments, __functionAddress);
    }

    // --- [ ope_encoder_continue_new_file ] ---

    /** Unsafe version of: {@link #ope_encoder_continue_new_file encoder_continue_new_file} */
    public static int nope_encoder_continue_new_file(long enc, long path, long comments) {
        long __functionAddress = Functions.encoder_continue_new_file;
        if (CHECKS) {
            check(enc);
            check(comments);
        }
        return invokePPPI(enc, path, comments, __functionAddress);
    }

    /**
     * Ends the stream and create a new file.
     *
     * @param enc      encoder
     * @param path     path where to write the new file
     * @param comments comments associated with the stream
     *
     * @return error code
     */
    public static int ope_encoder_continue_new_file(@NativeType("OggOpusEnc *") long enc, @NativeType("char const *") ByteBuffer path, @NativeType("OggOpusComments *") long comments) {
        if (CHECKS) {
            checkNT1(path);
        }
        return nope_encoder_continue_new_file(enc, memAddress(path), comments);
    }

    /**
     * Ends the stream and create a new file.
     *
     * @param enc      encoder
     * @param path     path where to write the new file
     * @param comments comments associated with the stream
     *
     * @return error code
     */
    public static int ope_encoder_continue_new_file(@NativeType("OggOpusEnc *") long enc, @NativeType("char const *") CharSequence path, @NativeType("OggOpusComments *") long comments) {
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            return nope_encoder_continue_new_file(enc, pathEncoded, comments);
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ ope_encoder_continue_new_callbacks ] ---

    /**
     * Ends the stream and create a new file (callback-based).
     *
     * @param enc       encoder
     * @param user_data pointer to be associated with the new stream and passed to the callbacks
     * @param comments  comments associated with the stream
     *
     * @return error code
     */
    public static int ope_encoder_continue_new_callbacks(@NativeType("OggOpusEnc *") long enc, @NativeType("void *") long user_data, @NativeType("OggOpusComments *") long comments) {
        long __functionAddress = Functions.encoder_continue_new_callbacks;
        if (CHECKS) {
            check(enc);
            check(user_data);
            check(comments);
        }
        return invokePPPI(enc, user_data, comments, __functionAddress);
    }

    // --- [ ope_encoder_flush_header ] ---

    /**
     * Write out the header now rather than wait for audio to begin.
     *
     * @param enc encoder
     *
     * @return error code
     */
    public static int ope_encoder_flush_header(@NativeType("OggOpusEnc *") long enc) {
        long __functionAddress = Functions.encoder_flush_header;
        if (CHECKS) {
            check(enc);
        }
        return invokePI(enc, __functionAddress);
    }

    // --- [ ope_encoder_ctl ] ---

    /**
     * Sets encoder options.
     *
     * @param enc encoder
     *
     * @return error code
     */
    private static int ope_encoder_ctl(@NativeType("OggOpusEnc *") long enc) {
        long __functionAddress = Functions.encoder_ctl;
        if (CHECKS) {
            check(enc);
        }
        return invokePI(enc, __functionAddress);
    }

    // --- [ ope_strerror ] ---

    /** Unsafe version of: {@link #ope_strerror strerror} */
    public static long nope_strerror(int error) {
        long __functionAddress = Functions.strerror;
        return invokeP(error, __functionAddress);
    }

    /**
     * Converts a libopusenc error code into a human readable string.
     *
     * @param error error number
     *
     * @return error string
     */
    @Nullable
    @NativeType("char const *")
    public static String ope_strerror(int error) {
        long __result = nope_strerror(error);
        return memUTF8Safe(__result);
    }

    // --- [ ope_get_version_string ] ---

    /** Unsafe version of: {@link #ope_get_version_string get_version_string} */
    public static long nope_get_version_string() {
        long __functionAddress = Functions.get_version_string;
        return invokeP(__functionAddress);
    }

    /**
     * Returns a string representing the version of libopusenc being used at run time.
     *
     * @return a string describing the version of this library
     */
    @Nullable
    @NativeType("char const *")
    public static String ope_get_version_string() {
        long __result = nope_get_version_string();
        return memUTF8Safe(__result);
    }

    // --- [ ope_get_abi_version ] ---

    /**
     * ABI version for this header. Can be used to check for features at run time.
     *
     * @return an integer representing the ABI version
     */
    public static int ope_get_abi_version() {
        long __functionAddress = Functions.get_abi_version;
        return invokeI(__functionAddress);
    }

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

}