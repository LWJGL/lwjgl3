/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.libc.LibCStdlib;

/**
 * Native bindings to stb_vorbis.c from the <a href="https://github.com/nothings/stb">stb library</a>.
 * 
 * <p>Ogg Vorbis audio decoder.</p>
 * 
 * <h3>Limitations</h3>
 * 
 * <ul>
 * <li>floor 0 not supported (used in old ogg vorbis files pre-2004)</li>
 * <li>lossless sample-truncation at beginning ignored</li>
 * <li>cannot concatenate multiple vorbis streams</li>
 * <li>sample positions are 32-bit, limiting seekable 192Khz files to around 6 hours (Ogg supports 64-bit)</li>
 * </ul>
 * 
 * <h3>THREAD SAFETY</h3>
 * 
 * <p>Individual stb_vorbis* handles are not thread-safe; you cannot decode from them from multiple threads at the same time. However, you can have multiple
 * {@code stb_vorbis*} handles and decode from them independently in multiple threads.</p>
 * 
 * <h3>PUSHDATA API</h3>
 * 
 * <p>This API allows you to get blocks of data from any source and hand them to stb_vorbis. you have to buffer them; stb_vorbis will tell you how much it
 * used, and you have to give it the rest next time; and stb_vorbis may not have enough data to work with and you will need to give it the same data
 * again PLUS more. Note that the Vorbis specification does not bound the size of an individual frame.</p>
 * 
 * <h3>PULLING INPUT API</h3>
 * 
 * <p>This API assumes stb_vorbis is allowed to pull data from a source -- either a block of memory containing the _entire_ vorbis stream, or a FILE * that
 * you or it create, or possibly some other reading mechanism if you go modify the source to replace the FILE * case with some kind of callback to your
 * code. (But if you don't support seeking, you may just want to go ahead and use pushdata.)</p>
 */
public class STBVorbis {

    static { LibSTB.initialize(); }

    /**
     * Error code.
     * 
     * <h5>Enum values:</h5>
     * 
     * <ul>
     * <li>{@link #VORBIS__no_error _no_error}</li>
     * <li>{@link #VORBIS_need_more_data need_more_data}</li>
     * <li>{@link #VORBIS_invalid_api_mixing invalid_api_mixing}</li>
     * <li>{@link #VORBIS_outofmem outofmem}</li>
     * <li>{@link #VORBIS_feature_not_supported feature_not_supported}</li>
     * <li>{@link #VORBIS_too_many_channels too_many_channels}</li>
     * <li>{@link #VORBIS_file_open_failure file_open_failure}</li>
     * <li>{@link #VORBIS_seek_without_length seek_without_length}</li>
     * <li>{@link #VORBIS_unexpected_eof unexpected_eof}</li>
     * <li>{@link #VORBIS_seek_invalid seek_invalid}</li>
     * <li>{@link #VORBIS_invalid_setup invalid_setup}</li>
     * <li>{@link #VORBIS_invalid_stream invalid_stream}</li>
     * <li>{@link #VORBIS_missing_capture_pattern missing_capture_pattern}</li>
     * <li>{@link #VORBIS_invalid_stream_structure_version invalid_stream_structure_version}</li>
     * <li>{@link #VORBIS_continued_packet_flag_invalid continued_packet_flag_invalid}</li>
     * <li>{@link #VORBIS_incorrect_stream_serial_number incorrect_stream_serial_number}</li>
     * <li>{@link #VORBIS_invalid_first_page invalid_first_page}</li>
     * <li>{@link #VORBIS_bad_packet_type bad_packet_type}</li>
     * <li>{@link #VORBIS_cant_find_last_page cant_find_last_page}</li>
     * <li>{@link #VORBIS_seek_failed seek_failed}</li>
     * <li>{@link #VORBIS_ogg_skeleton_not_supported ogg_skeleton_not_supported}</li>
     * </ul>
     */
    public static final int
        VORBIS__no_error                        = 0,
        VORBIS_need_more_data                   = 1,
        VORBIS_invalid_api_mixing               = 2,
        VORBIS_outofmem                         = 3,
        VORBIS_feature_not_supported            = 4,
        VORBIS_too_many_channels                = 5,
        VORBIS_file_open_failure                = 6,
        VORBIS_seek_without_length              = 7,
        VORBIS_unexpected_eof                   = 10,
        VORBIS_seek_invalid                     = 11,
        VORBIS_invalid_setup                    = 20,
        VORBIS_invalid_stream                   = 21,
        VORBIS_missing_capture_pattern          = 30,
        VORBIS_invalid_stream_structure_version = 31,
        VORBIS_continued_packet_flag_invalid    = 32,
        VORBIS_incorrect_stream_serial_number   = 33,
        VORBIS_invalid_first_page               = 34,
        VORBIS_bad_packet_type                  = 35,
        VORBIS_cant_find_last_page              = 36,
        VORBIS_seek_failed                      = 37,
        VORBIS_ogg_skeleton_not_supported       = 38;

    protected STBVorbis() {
        throw new UnsupportedOperationException();
    }

    // --- [ stb_vorbis_get_info ] ---

    /** Unsafe version of: {@link #stb_vorbis_get_info get_info} */
    public static native void nstb_vorbis_get_info(long f, long __result);

    /**
     * Returns general information about the specified file.
     *
     * @param f an ogg vorbis file decoder
     */
    @NativeType("stb_vorbis_info")
    public static STBVorbisInfo stb_vorbis_get_info(@NativeType("stb_vorbis *") long f, @NativeType("stb_vorbis_info") STBVorbisInfo __result) {
        if (CHECKS) {
            check(f);
        }
        nstb_vorbis_get_info(f, __result.address());
        return __result;
    }

    // --- [ stb_vorbis_get_comment ] ---

    /** Unsafe version of: {@link #stb_vorbis_get_comment get_comment} */
    public static native void nstb_vorbis_get_comment(long f, long __result);

    /**
     * Returns ogg comments.
     *
     * @param f an ogg vorbis file decoder
     */
    @NativeType("stb_vorbis_comment")
    public static STBVorbisComment stb_vorbis_get_comment(@NativeType("stb_vorbis *") long f, @NativeType("stb_vorbis_comment") STBVorbisComment __result) {
        if (CHECKS) {
            check(f);
        }
        nstb_vorbis_get_comment(f, __result.address());
        return __result;
    }

    // --- [ stb_vorbis_get_error ] ---

    /** Unsafe version of: {@link #stb_vorbis_get_error get_error} */
    public static native int nstb_vorbis_get_error(long f);

    /**
     * Returns the last error detected (clears it, too).
     *
     * @param f an ogg vorbis file decoder
     */
    public static int stb_vorbis_get_error(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_error(f);
    }

    // --- [ stb_vorbis_close ] ---

    /** Unsafe version of: {@link #stb_vorbis_close close} */
    public static native void nstb_vorbis_close(long f);

    /**
     * Closes an ogg vorbis file and free all memory in use
     *
     * @param f an ogg vorbis file decoder
     */
    public static void stb_vorbis_close(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        nstb_vorbis_close(f);
    }

    // --- [ stb_vorbis_get_sample_offset ] ---

    /** Unsafe version of: {@link #stb_vorbis_get_sample_offset get_sample_offset} */
    public static native int nstb_vorbis_get_sample_offset(long f);

    /**
     * Returns the offset (in samples) from the beginning of the file that will be returned by the next decode, if it is known, or -1 otherwise. After a
     * {@link #stb_vorbis_flush_pushdata flush_pushdata} call, this may take a while before it becomes valid again.
     * 
     * <p>NOT WORKING YET after a seek with PULLDATA API.</p>
     *
     * @param f an ogg vorbis file decoder
     */
    public static int stb_vorbis_get_sample_offset(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_sample_offset(f);
    }

    // --- [ stb_vorbis_get_file_offset ] ---

    /** Unsafe version of: {@link #stb_vorbis_get_file_offset get_file_offset} */
    public static native int nstb_vorbis_get_file_offset(long f);

    /**
     * Returns the current seek point within the file, or offset from the beginning of the memory buffer. In pushdata mode it returns 0.
     *
     * @param f an ogg vorbis file decoder
     */
    @NativeType("unsigned int")
    public static int stb_vorbis_get_file_offset(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_file_offset(f);
    }

    // --- [ stb_vorbis_open_pushdata ] ---

    /**
     * Unsafe version of: {@link #stb_vorbis_open_pushdata open_pushdata}
     *
     * @param datablock_length_in_bytes the length of {@code datablock}, in bytes
     */
    public static native long nstb_vorbis_open_pushdata(long datablock, int datablock_length_in_bytes, long datablock_memory_consumed_in_bytes, long error, long alloc_buffer);

    /**
     * Creates a vorbis decoder by passing in the initial data block containing the ogg&amp;vorbis headers (you don't need to do parse them, just provide the
     * first N bytes of the file -- you're told if it's not enough, see below)
     *
     * @param datablock                          the data block containing the ogg vorbis headers
     * @param datablock_memory_consumed_in_bytes returns the amount of data parsed/consumed, in bytes
     * @param error                              returns the error code
     * @param alloc_buffer                       an {@link STBVorbisAlloc} struct
     *
     * @return On success, returns an {@code stb_vorbis *}, does not set error, returns the amount of data parsed/consumed on this call in
     *         {@code *datablock_memory_consumed_in_bytes}; On failure, returns {@code NULL} on error and sets {@code *error}, does not change
     *         {@code *datablock_memory_consumed}. If it returns {@code NULL} and {@code *error} is {@link #VORBIS_need_more_data need_more_data}, then the input block was incomplete and you need to pass
     *         in a larger block from the start of the file.
     */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_pushdata(@NativeType("unsigned char const *") ByteBuffer datablock, @NativeType("int *") IntBuffer datablock_memory_consumed_in_bytes, @NativeType("int *") IntBuffer error, @Nullable @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            check(datablock_memory_consumed_in_bytes, 1);
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_pushdata(memAddress(datablock), datablock.remaining(), memAddress(datablock_memory_consumed_in_bytes), memAddress(error), memAddressSafe(alloc_buffer));
    }

    // --- [ stb_vorbis_decode_frame_pushdata ] ---

    /**
     * Unsafe version of: {@link #stb_vorbis_decode_frame_pushdata decode_frame_pushdata}
     *
     * @param datablock_length_in_bytes the length of {@code datablock}, in bytes
     */
    public static native int nstb_vorbis_decode_frame_pushdata(long f, long datablock, int datablock_length_in_bytes, long channels, long output, long samples);

    /**
     * Decodes a frame of audio sample data if possible from the passed-in data block.
     * 
     * <p>Note that on resynch, stb_vorbis will rarely consume all of the buffer, instead only {@code datablock_length_in_bytes-3} or less. This is because it
     * wants to avoid missing parts of a page header if they cross a datablock boundary, without writing state-machiney code to record a partial detection.</p>
     * 
     * <p>The number of channels returned are stored in *channels (which can be {@code NULL} -- it is always the same as the number of channels reported by {@link #stb_vorbis_get_info get_info}).
     * {@code *output} will contain an array of {@code float*} buffers, one per channel. In other words, {@code (*output)[0][0]} contains the first sample
     * from the first channel, and {@code (*output)[1][0]} contains the first sample from the second channel.</p>
     * 
     * <p>{@code *output} points into stb_vorbis's internal output buffer storage; these buffers are owned by stb_vorbis and application code should not free
     * them or modify their contents. They are transient and will be overwritten once you ask for more data to get decoded, so be sure to grab any data you
     * need before then.</p>
     *
     * @param f         an ogg vorbis file decoder
     * @param datablock the data block containing the audio sample data
     * @param channels  place to write number of {@code float *} buffers
     * @param output    place to write float ** array of float * buffers
     * @param samples   place to write number of output samples
     *
     * @return the number of bytes we used from datablock. Possible cases:
     *         
     *         <ul>
     *         <li>0 bytes used, 0 samples output (need more data)</li>
     *         <li>N bytes used, 0 samples output (resynching the stream, keep going)</li>
     *         <li>N bytes used, M samples output (one frame of data)</li>
     *         </ul>
     *         
     *         <p>Note that after opening a file, you will ALWAYS get one N-bytes,0-sample frame, because Vorbis always "discards" the first frame.</p>
     */
    public static int stb_vorbis_decode_frame_pushdata(@NativeType("stb_vorbis *") long f, @NativeType("unsigned char const *") ByteBuffer datablock, @Nullable @NativeType("int *") IntBuffer channels, @NativeType("float ***") PointerBuffer output, @NativeType("int *") IntBuffer samples) {
        if (CHECKS) {
            check(f);
            checkSafe(channels, 1);
            check(output, 1);
            check(samples, 1);
        }
        return nstb_vorbis_decode_frame_pushdata(f, memAddress(datablock), datablock.remaining(), memAddressSafe(channels), memAddress(output), memAddress(samples));
    }

    // --- [ stb_vorbis_flush_pushdata ] ---

    /** Unsafe version of: {@link #stb_vorbis_flush_pushdata flush_pushdata} */
    public static native void nstb_vorbis_flush_pushdata(long f);

    /**
     * Inform stb_vorbis that your next datablock will not be contiguous with previous ones (e.g. you've seeked in the data); future attempts to decode frames
     * will cause stb_vorbis to resynchronize (as noted above), and once it sees a valid Ogg page (typically 4-8KB, as large as 64KB), it will begin decoding
     * the <b>next</b> frame.
     * 
     * <p>If you want to seek using pushdata, you need to seek in your file, then call stb_vorbis_flush_pushdata(), then start calling decoding, then once
     * decoding is returning you data, call {@link #stb_vorbis_get_sample_offset get_sample_offset}, and if you don't like the result, seek your file again and repeat.</p>
     *
     * @param f an ogg vorbis file decoder
     */
    public static void stb_vorbis_flush_pushdata(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        nstb_vorbis_flush_pushdata(f);
    }

    // --- [ stb_vorbis_decode_filename ] ---

    /** Unsafe version of: {@link #stb_vorbis_decode_filename decode_filename} */
    public static native int nstb_vorbis_decode_filename(long filename, long channels, long sample_rate, long output);

    /**
     * Decode an entire file and output the data interleaved into a {@code malloc()ed} buffer stored in {@code *output}. When you're done with it, just
     * {@link LibCStdlib#free} the pointer returned in {@code *output}.
     *
     * @param filename    the file name
     * @param channels    returns the number of channels
     * @param sample_rate returns the sample rate
     * @param output      returns a pointer to the decoded data
     *
     * @return the number of samples decoded, or -1 if the file could not be opened or was not an ogg vorbis file
     */
    public static int stb_vorbis_decode_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate, @NativeType("short **") PointerBuffer output) {
        if (CHECKS) {
            checkNT1(filename);
            check(channels, 1);
            check(sample_rate, 1);
            check(output, 1);
        }
        return nstb_vorbis_decode_filename(memAddress(filename), memAddress(channels), memAddress(sample_rate), memAddress(output));
    }

    /**
     * Decode an entire file and output the data interleaved into a {@code malloc()ed} buffer stored in {@code *output}. When you're done with it, just
     * {@link LibCStdlib#free} the pointer returned in {@code *output}.
     *
     * @param filename    the file name
     * @param channels    returns the number of channels
     * @param sample_rate returns the sample rate
     * @param output      returns a pointer to the decoded data
     *
     * @return the number of samples decoded, or -1 if the file could not be opened or was not an ogg vorbis file
     */
    public static int stb_vorbis_decode_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate, @NativeType("short **") PointerBuffer output) {
        if (CHECKS) {
            check(channels, 1);
            check(sample_rate, 1);
            check(output, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstb_vorbis_decode_filename(filenameEncoded, memAddress(channels), memAddress(sample_rate), memAddress(output));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /**
     * Decode an entire file and output the data interleaved into a {@code malloc()ed} buffer stored in {@code *output}. When you're done with it, just
     * {@link LibCStdlib#free} the pointer returned in {@code *output}.
     *
     * @param filename    the file name
     * @param channels    returns the number of channels
     * @param sample_rate returns the sample rate
     *
     * @return the number of samples decoded, or -1 if the file could not be opened or was not an ogg vorbis file
     */
    @Nullable
    @NativeType("int")
    public static ShortBuffer stb_vorbis_decode_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate) {
        if (CHECKS) {
            check(channels, 1);
            check(sample_rate, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            PointerBuffer output = stack.pointers(NULL);
            int __result = nstb_vorbis_decode_filename(filenameEncoded, memAddress(channels), memAddress(sample_rate), memAddress(output));
            return memShortBufferSafe(output.get(0), __result * channels.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stb_vorbis_decode_memory ] ---

    /**
     * Unsafe version of: {@link #stb_vorbis_decode_memory decode_memory}
     *
     * @param len the {@code data} length, in bytes
     */
    public static native int nstb_vorbis_decode_memory(long mem, int len, long channels, long sample_rate, long output);

    /**
     * In-memory version of {@link #stb_vorbis_decode_filename decode_filename}.
     *
     * @param mem         the data to decode
     * @param channels    returns the number of channels
     * @param sample_rate returns the sample rate
     * @param output      returns a pointer to the decoded data
     */
    public static int stb_vorbis_decode_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate, @NativeType("short **") PointerBuffer output) {
        if (CHECKS) {
            check(channels, 1);
            check(sample_rate, 1);
            check(output, 1);
        }
        return nstb_vorbis_decode_memory(memAddress(mem), mem.remaining(), memAddress(channels), memAddress(sample_rate), memAddress(output));
    }

    /**
     * In-memory version of {@link #stb_vorbis_decode_filename decode_filename}.
     *
     * @param mem         the data to decode
     * @param channels    returns the number of channels
     * @param sample_rate returns the sample rate
     */
    @Nullable
    @NativeType("int")
    public static ShortBuffer stb_vorbis_decode_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate) {
        if (CHECKS) {
            check(channels, 1);
            check(sample_rate, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            PointerBuffer output = stack.pointers(NULL);
            int __result = nstb_vorbis_decode_memory(memAddress(mem), mem.remaining(), memAddress(channels), memAddress(sample_rate), memAddress(output));
            return memShortBufferSafe(output.get(0), __result * channels.get(0));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stb_vorbis_open_memory ] ---

    /**
     * Unsafe version of: {@link #stb_vorbis_open_memory open_memory}
     *
     * @param len the {@code data} length, in bytes
     */
    public static native long nstb_vorbis_open_memory(long mem, int len, long error, long alloc_buffer);

    /**
     * Creates an ogg vorbis decoder from an ogg vorbis stream in memory (note this must be the entire stream!).
     *
     * @param mem          the data to decode
     * @param error        returns an error code
     * @param alloc_buffer an {@link STBVorbisAlloc} struct
     *
     * @return the ogg vorbis decoder. On failure, returns {@code NULL} and sets {@code *error}.
     */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") IntBuffer error, @Nullable @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_memory(memAddress(mem), mem.remaining(), memAddress(error), memAddressSafe(alloc_buffer));
    }

    // --- [ stb_vorbis_open_filename ] ---

    /** Unsafe version of: {@link #stb_vorbis_open_filename open_filename} */
    public static native long nstb_vorbis_open_filename(long filename, long error, long alloc_buffer);

    /**
     * Creates an ogg vorbis decoder from a file name.
     *
     * @param filename     the file name
     * @param error        returns an error code
     * @param alloc_buffer an {@link STBVorbisAlloc} struct
     *
     * @return the ogg vorbis decoder. On failure, returns {@code NULL} and sets {@code *error}.
     */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer error, @Nullable @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            checkNT1(filename);
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_filename(memAddress(filename), memAddress(error), memAddressSafe(alloc_buffer));
    }

    /**
     * Creates an ogg vorbis decoder from a file name.
     *
     * @param filename     the file name
     * @param error        returns an error code
     * @param alloc_buffer an {@link STBVorbisAlloc} struct
     *
     * @return the ogg vorbis decoder. On failure, returns {@code NULL} and sets {@code *error}.
     */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer error, @Nullable @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstb_vorbis_open_filename(filenameEncoded, memAddress(error), memAddressSafe(alloc_buffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    // --- [ stb_vorbis_seek_frame ] ---

    /** Unsafe version of: {@link #stb_vorbis_seek_frame seek_frame} */
    public static native int nstb_vorbis_seek_frame(long f, int sample_number);

    /**
     * Seeks in the Vorbis file to (approximately) {@code sample_number}. After calling seek_frame(), the next call to {@code get_frame_*()} will include the
     * specified sample.
     *
     * @param f             an ogg vorbis file decoder
     * @param sample_number the sample index
     */
    @NativeType("int")
    public static boolean stb_vorbis_seek_frame(@NativeType("stb_vorbis *") long f, @NativeType("unsigned int") int sample_number) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_seek_frame(f, sample_number) != 0;
    }

    // --- [ stb_vorbis_seek ] ---

    /** Unsafe version of: {@link #stb_vorbis_seek seek} */
    public static native int nstb_vorbis_seek(long f, int sample_number);

    /**
     * Seeks in the Vorbis file to (approximately) {@code sample_number}. After calling stb_vorbis_seek(), the next call to {@code stb_vorbis_get_samples_*}
     * will start with the specified sample.
     *
     * @param f             an ogg vorbis file decoder
     * @param sample_number the sample index
     */
    @NativeType("int")
    public static boolean stb_vorbis_seek(@NativeType("stb_vorbis *") long f, @NativeType("unsigned int") int sample_number) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_seek(f, sample_number) != 0;
    }

    // --- [ stb_vorbis_seek_start ] ---

    /** Unsafe version of: {@link #stb_vorbis_seek_start seek_start} */
    public static native int nstb_vorbis_seek_start(long f);

    /**
     * This function is equivalent to {@link #stb_vorbis_seek seek}(f,0).
     *
     * @param f an ogg vorbis file decoder
     */
    @NativeType("int")
    public static boolean stb_vorbis_seek_start(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_seek_start(f) != 0;
    }

    // --- [ stb_vorbis_stream_length_in_samples ] ---

    /** Unsafe version of: {@link #stb_vorbis_stream_length_in_samples stream_length_in_samples} */
    public static native int nstb_vorbis_stream_length_in_samples(long f);

    /**
     * Returns the total length of the vorbis stream, in samples.
     *
     * @param f an ogg vorbis file decoder
     */
    @NativeType("unsigned int")
    public static int stb_vorbis_stream_length_in_samples(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_stream_length_in_samples(f);
    }

    // --- [ stb_vorbis_stream_length_in_seconds ] ---

    /** Unsafe version of: {@link #stb_vorbis_stream_length_in_seconds stream_length_in_seconds} */
    public static native float nstb_vorbis_stream_length_in_seconds(long f);

    /**
     * Returns the total length of the vorbis stream, in samples.
     *
     * @param f an ogg vorbis file decoder
     */
    public static float stb_vorbis_stream_length_in_seconds(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_stream_length_in_seconds(f);
    }

    // --- [ stb_vorbis_get_frame_float ] ---

    /** Unsafe version of: {@link #stb_vorbis_get_frame_float get_frame_float} */
    public static native int nstb_vorbis_get_frame_float(long f, long channels, long output);

    /**
     * Decodes the next frame and return the number of samples.
     * 
     * <p>You generally should not intermix calls to {@code stb_vorbis_get_frame_*()} and {@code stb_vorbis_get_samples_*()}, since the latter calls the former.</p>
     *
     * @param f        an ogg vorbis file decoder
     * @param channels returns the number of channels. Can be {@code NULL} -- it is always the same as the number of channels reported by {@link #stb_vorbis_get_info get_info}.
     * @param output   returns a pointer to an array of float* buffers, one per channel. These outputs will be overwritten on the next call to
     *                 {@code stb_vorbis_get_frame_*}.
     *
     * @return the number of samples per channel
     */
    public static int stb_vorbis_get_frame_float(@NativeType("stb_vorbis *") long f, @Nullable @NativeType("int *") IntBuffer channels, @NativeType("float ***") PointerBuffer output) {
        if (CHECKS) {
            check(f);
            checkSafe(channels, 1);
            check(output, 1);
        }
        return nstb_vorbis_get_frame_float(f, memAddressSafe(channels), memAddress(output));
    }

    // --- [ stb_vorbis_get_frame_short ] ---

    /**
     * Unsafe version of: {@link #stb_vorbis_get_frame_short get_frame_short}
     *
     * @param num_c the number of channels
     */
    public static native int nstb_vorbis_get_frame_short(long f, int num_c, long buffer, int num_samples);

    /**
     * Decodes the next frame and returns the number of <b>samples</b> per channel. Note that for interleaved data, you pass in the number of shorts (the size
     * of your array), but the return value is the number of samples per channel, not the total number of samples.
     * 
     * <p>The data is coerced to the number of channels you request according to the channel coercion rules (see below). You must pass in the size of your
     * buffer(s) so that stb_vorbis will not overwrite the end of the buffer. The maximum buffer size needed can be gotten from {@link #stb_vorbis_get_info get_info}; however, the
     * Vorbis I specification implies an absolute maximum of 4096 samples per channel.</p>
     * 
     * <h3>Channel coercion rules</h3>
     * 
     * <p>Let M be the number of channels requested, and N the number of channels present, and Cn be the nth channel; let stereo L be the sum of all L and center
     * channels, and stereo R be the sum of all R and center channels (channel assignment from the vorbis spec).</p>
     * 
     * <pre><code>
     * M    N      output
     * 1    k      sum(Ck) for all k
     * 2    *      stereo L, stereo R
     * k    l      k &gt; l, the first l channels, then 0s
     * k    l      k &le; l, the first k channels</code></pre>
     * 
     * <p>Note that this is not <b>good</b> surround etc. mixing at all! It's just so you get something useful.</p>
     *
     * @param f           an ogg vorbis file decoder
     * @param buffer      the output buffer, an array of pointers with length {@code num_c}, each pointing to a short array with length {@code num_samples}
     * @param num_samples the number of samples
     *
     * @return the number of samples per channel
     */
    public static int stb_vorbis_get_frame_short(@NativeType("stb_vorbis *") long f, @NativeType("short **") PointerBuffer buffer, int num_samples) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_frame_short(f, buffer.remaining(), memAddress(buffer), num_samples);
    }

    // --- [ stb_vorbis_get_frame_short_interleaved ] ---

    /**
     * Unsafe version of: {@link #stb_vorbis_get_frame_short_interleaved get_frame_short_interleaved}
     *
     * @param num_shorts the size of {@code buffer}
     */
    public static native int nstb_vorbis_get_frame_short_interleaved(long f, int num_c, long buffer, int num_shorts);

    /**
     * Interleaved version of {@link #stb_vorbis_get_frame_short get_frame_short}.
     * 
     * <p>Note that for interleaved data, you pass in the number of shorts (the size of your array), but the return value is the number of samples per channel,
     * not the total number of samples.</p>
     *
     * @param f      an ogg vorbis file decoder
     * @param num_c  the number of channels
     * @param buffer the output buffer
     *
     * @return the number of samples per channel
     */
    public static int stb_vorbis_get_frame_short_interleaved(@NativeType("stb_vorbis *") long f, int num_c, @NativeType("short *") ShortBuffer buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_frame_short_interleaved(f, num_c, memAddress(buffer), buffer.remaining());
    }

    // --- [ stb_vorbis_get_samples_float ] ---

    /**
     * Unsafe version of: {@link #stb_vorbis_get_samples_float get_samples_float}
     *
     * @param channels the number of channels to decode
     */
    public static native int nstb_vorbis_get_samples_float(long f, int channels, long buffer, int num_samples);

    /**
     * Gets {@code num_samples} samples, not necessarily on a frame boundary -- this requires buffering so you have to supply the buffers. DOES NOT APPLY THE
     * COERCION RULES.
     *
     * @param f           an ogg vorbis file decoder
     * @param buffer      the output buffer, an array of pointers with length {@code channels}, each pointing to a float array with length {@code num_samples}
     * @param num_samples the number of samples to decode
     *
     * @return the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0.
     */
    public static int stb_vorbis_get_samples_float(@NativeType("stb_vorbis *") long f, @NativeType("float **") PointerBuffer buffer, int num_samples) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_float(f, buffer.remaining(), memAddress(buffer), num_samples);
    }

    // --- [ stb_vorbis_get_samples_float_interleaved ] ---

    /**
     * Unsafe version of: {@link #stb_vorbis_get_samples_float_interleaved get_samples_float_interleaved}
     *
     * @param num_floats the size of {@code buffer}
     */
    public static native int nstb_vorbis_get_samples_float_interleaved(long f, int channels, long buffer, int num_floats);

    /**
     * Interleaved version of {@link #stb_vorbis_get_samples_float get_samples_float}.
     *
     * @param f        an ogg vorbis file decoder
     * @param channels the number of channels
     * @param buffer   the output buffer
     *
     * @return the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0.
     */
    public static int stb_vorbis_get_samples_float_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("float *") FloatBuffer buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_float_interleaved(f, channels, memAddress(buffer), buffer.remaining());
    }

    // --- [ stb_vorbis_get_samples_short ] ---

    /**
     * Unsafe version of: {@link #stb_vorbis_get_samples_short get_samples_short}
     *
     * @param channels the number of channels
     */
    public static native int nstb_vorbis_get_samples_short(long f, int channels, long buffer, int num_samples);

    /**
     * Gets {@code num_samples} samples, not necessarily on a frame boundary -- this requires buffering so you have to supply the buffers. Applies the
     * coercion rules above to produce {@code channels} channels.
     *
     * @param f           an ogg vorbis file decoder
     * @param buffer      the output buffer, an array of pointers with length {@code channels}, each pointing to a short array with length {@code num_samples}
     * @param num_samples the number of samples
     *
     * @return the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0.
     */
    public static int stb_vorbis_get_samples_short(@NativeType("stb_vorbis *") long f, @NativeType("short **") PointerBuffer buffer, int num_samples) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_short(f, buffer.remaining(), memAddress(buffer), num_samples);
    }

    // --- [ stb_vorbis_get_samples_short_interleaved ] ---

    /**
     * Unsafe version of: {@link #stb_vorbis_get_samples_short_interleaved get_samples_short_interleaved}
     *
     * @param num_shorts the size of {@code buffer}
     */
    public static native int nstb_vorbis_get_samples_short_interleaved(long f, int channels, long buffer, int num_shorts);

    /**
     * Interleaved version of {@link #stb_vorbis_get_samples_short get_samples_short}.
     *
     * @param f        an ogg vorbis file decoder
     * @param channels the number of channels
     * @param buffer   the output buffer
     *
     * @return the number of samples stored per channel; it may be less than requested at the end of the file. If there are no more samples in the file, returns 0.
     */
    public static int stb_vorbis_get_samples_short_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("short *") ShortBuffer buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_short_interleaved(f, channels, memAddress(buffer), buffer.remaining());
    }

    /** Array version of: {@link #nstb_vorbis_open_pushdata} */
    public static native long nstb_vorbis_open_pushdata(long datablock, int datablock_length_in_bytes, int[] datablock_memory_consumed_in_bytes, int[] error, long alloc_buffer);

    /** Array version of: {@link #stb_vorbis_open_pushdata open_pushdata} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_pushdata(@NativeType("unsigned char const *") ByteBuffer datablock, @NativeType("int *") int[] datablock_memory_consumed_in_bytes, @NativeType("int *") int[] error, @Nullable @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            check(datablock_memory_consumed_in_bytes, 1);
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_pushdata(memAddress(datablock), datablock.remaining(), datablock_memory_consumed_in_bytes, error, memAddressSafe(alloc_buffer));
    }

    /** Array version of: {@link #nstb_vorbis_decode_frame_pushdata} */
    public static native int nstb_vorbis_decode_frame_pushdata(long f, long datablock, int datablock_length_in_bytes, int[] channels, long output, int[] samples);

    /** Array version of: {@link #stb_vorbis_decode_frame_pushdata decode_frame_pushdata} */
    public static int stb_vorbis_decode_frame_pushdata(@NativeType("stb_vorbis *") long f, @NativeType("unsigned char const *") ByteBuffer datablock, @Nullable @NativeType("int *") int[] channels, @NativeType("float ***") PointerBuffer output, @NativeType("int *") int[] samples) {
        if (CHECKS) {
            check(f);
            checkSafe(channels, 1);
            check(output, 1);
            check(samples, 1);
        }
        return nstb_vorbis_decode_frame_pushdata(f, memAddress(datablock), datablock.remaining(), channels, memAddress(output), samples);
    }

    /** Array version of: {@link #nstb_vorbis_decode_filename} */
    public static native int nstb_vorbis_decode_filename(long filename, int[] channels, int[] sample_rate, long output);

    /** Array version of: {@link #stb_vorbis_decode_filename decode_filename} */
    public static int stb_vorbis_decode_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] channels, @NativeType("int *") int[] sample_rate, @NativeType("short **") PointerBuffer output) {
        if (CHECKS) {
            checkNT1(filename);
            check(channels, 1);
            check(sample_rate, 1);
            check(output, 1);
        }
        return nstb_vorbis_decode_filename(memAddress(filename), channels, sample_rate, memAddress(output));
    }

    /** Array version of: {@link #stb_vorbis_decode_filename decode_filename} */
    public static int stb_vorbis_decode_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] channels, @NativeType("int *") int[] sample_rate, @NativeType("short **") PointerBuffer output) {
        if (CHECKS) {
            check(channels, 1);
            check(sample_rate, 1);
            check(output, 1);
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstb_vorbis_decode_filename(filenameEncoded, channels, sample_rate, memAddress(output));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nstb_vorbis_decode_memory} */
    public static native int nstb_vorbis_decode_memory(long mem, int len, int[] channels, int[] sample_rate, long output);

    /** Array version of: {@link #stb_vorbis_decode_memory decode_memory} */
    public static int stb_vorbis_decode_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") int[] channels, @NativeType("int *") int[] sample_rate, @NativeType("short **") PointerBuffer output) {
        if (CHECKS) {
            check(channels, 1);
            check(sample_rate, 1);
            check(output, 1);
        }
        return nstb_vorbis_decode_memory(memAddress(mem), mem.remaining(), channels, sample_rate, memAddress(output));
    }

    /** Array version of: {@link #nstb_vorbis_open_memory} */
    public static native long nstb_vorbis_open_memory(long mem, int len, int[] error, long alloc_buffer);

    /** Array version of: {@link #stb_vorbis_open_memory open_memory} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") int[] error, @Nullable @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_memory(memAddress(mem), mem.remaining(), error, memAddressSafe(alloc_buffer));
    }

    /** Array version of: {@link #nstb_vorbis_open_filename} */
    public static native long nstb_vorbis_open_filename(long filename, int[] error, long alloc_buffer);

    /** Array version of: {@link #stb_vorbis_open_filename open_filename} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] error, @Nullable @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            checkNT1(filename);
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_filename(memAddress(filename), error, memAddressSafe(alloc_buffer));
    }

    /** Array version of: {@link #stb_vorbis_open_filename open_filename} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] error, @Nullable @NativeType("stb_vorbis_alloc const *") STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
        try {
            stack.nASCII(filename, true);
            long filenameEncoded = stack.getPointerAddress();
            return nstb_vorbis_open_filename(filenameEncoded, error, memAddressSafe(alloc_buffer));
        } finally {
            stack.setPointer(stackPointer);
        }
    }

    /** Array version of: {@link #nstb_vorbis_get_frame_float} */
    public static native int nstb_vorbis_get_frame_float(long f, int[] channels, long output);

    /** Array version of: {@link #stb_vorbis_get_frame_float get_frame_float} */
    public static int stb_vorbis_get_frame_float(@NativeType("stb_vorbis *") long f, @Nullable @NativeType("int *") int[] channels, @NativeType("float ***") PointerBuffer output) {
        if (CHECKS) {
            check(f);
            checkSafe(channels, 1);
            check(output, 1);
        }
        return nstb_vorbis_get_frame_float(f, channels, memAddress(output));
    }

    /** Array version of: {@link #nstb_vorbis_get_frame_short_interleaved} */
    public static native int nstb_vorbis_get_frame_short_interleaved(long f, int num_c, short[] buffer, int num_shorts);

    /** Array version of: {@link #stb_vorbis_get_frame_short_interleaved get_frame_short_interleaved} */
    public static int stb_vorbis_get_frame_short_interleaved(@NativeType("stb_vorbis *") long f, int num_c, @NativeType("short *") short[] buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_frame_short_interleaved(f, num_c, buffer, buffer.length);
    }

    /** Array version of: {@link #nstb_vorbis_get_samples_float_interleaved} */
    public static native int nstb_vorbis_get_samples_float_interleaved(long f, int channels, float[] buffer, int num_floats);

    /** Array version of: {@link #stb_vorbis_get_samples_float_interleaved get_samples_float_interleaved} */
    public static int stb_vorbis_get_samples_float_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("float *") float[] buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_float_interleaved(f, channels, buffer, buffer.length);
    }

    /** Array version of: {@link #nstb_vorbis_get_samples_short_interleaved} */
    public static native int nstb_vorbis_get_samples_short_interleaved(long f, int channels, short[] buffer, int num_shorts);

    /** Array version of: {@link #stb_vorbis_get_samples_short_interleaved get_samples_short_interleaved} */
    public static int stb_vorbis_get_samples_short_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("short *") short[] buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_short_interleaved(f, channels, buffer, buffer.length);
    }

}