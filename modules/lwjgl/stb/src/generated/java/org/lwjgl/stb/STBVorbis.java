/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

import org.lwjgl.system.libc.LibCStdlib;

public class STBVorbis {

    static { LibSTB.initialize(); }

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

    /** {@code stb_vorbis_info stb_vorbis_get_info(stb_vorbis * f)} */
    public static native void nstb_vorbis_get_info(long f, long __result);

    /** {@code stb_vorbis_info stb_vorbis_get_info(stb_vorbis * f)} */
    @NativeType("stb_vorbis_info")
    public static STBVorbisInfo stb_vorbis_get_info(@NativeType("stb_vorbis *") long f, @NativeType("stb_vorbis_info") STBVorbisInfo __result) {
        if (CHECKS) {
            check(f);
        }
        nstb_vorbis_get_info(f, __result.address());
        return __result;
    }

    // --- [ stb_vorbis_get_comment ] ---

    /** {@code stb_vorbis_comment stb_vorbis_get_comment(stb_vorbis * f)} */
    public static native void nstb_vorbis_get_comment(long f, long __result);

    /** {@code stb_vorbis_comment stb_vorbis_get_comment(stb_vorbis * f)} */
    @NativeType("stb_vorbis_comment")
    public static STBVorbisComment stb_vorbis_get_comment(@NativeType("stb_vorbis *") long f, @NativeType("stb_vorbis_comment") STBVorbisComment __result) {
        if (CHECKS) {
            check(f);
        }
        nstb_vorbis_get_comment(f, __result.address());
        return __result;
    }

    // --- [ stb_vorbis_get_error ] ---

    /** {@code int stb_vorbis_get_error(stb_vorbis * f)} */
    public static native int nstb_vorbis_get_error(long f);

    /** {@code int stb_vorbis_get_error(stb_vorbis * f)} */
    public static int stb_vorbis_get_error(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_error(f);
    }

    // --- [ stb_vorbis_close ] ---

    /** {@code void stb_vorbis_close(stb_vorbis * f)} */
    public static native void nstb_vorbis_close(long f);

    /** {@code void stb_vorbis_close(stb_vorbis * f)} */
    public static void stb_vorbis_close(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        nstb_vorbis_close(f);
    }

    // --- [ stb_vorbis_get_sample_offset ] ---

    /** {@code int stb_vorbis_get_sample_offset(stb_vorbis * f)} */
    public static native int nstb_vorbis_get_sample_offset(long f);

    /** {@code int stb_vorbis_get_sample_offset(stb_vorbis * f)} */
    public static int stb_vorbis_get_sample_offset(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_sample_offset(f);
    }

    // --- [ stb_vorbis_get_file_offset ] ---

    /** {@code unsigned int stb_vorbis_get_file_offset(stb_vorbis * f)} */
    public static native int nstb_vorbis_get_file_offset(long f);

    /** {@code unsigned int stb_vorbis_get_file_offset(stb_vorbis * f)} */
    @NativeType("unsigned int")
    public static int stb_vorbis_get_file_offset(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_file_offset(f);
    }

    // --- [ stb_vorbis_open_pushdata ] ---

    /** {@code stb_vorbis * stb_vorbis_open_pushdata(unsigned char const * datablock, int datablock_length_in_bytes, int * datablock_memory_consumed_in_bytes, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    public static native long nstb_vorbis_open_pushdata(long datablock, int datablock_length_in_bytes, long datablock_memory_consumed_in_bytes, long error, long alloc_buffer);

    /** {@code stb_vorbis * stb_vorbis_open_pushdata(unsigned char const * datablock, int datablock_length_in_bytes, int * datablock_memory_consumed_in_bytes, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_pushdata(@NativeType("unsigned char const *") ByteBuffer datablock, @NativeType("int *") IntBuffer datablock_memory_consumed_in_bytes, @NativeType("int *") IntBuffer error, @NativeType("stb_vorbis_alloc const *") @Nullable STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            check(datablock_memory_consumed_in_bytes, 1);
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_pushdata(memAddress(datablock), datablock.remaining(), memAddress(datablock_memory_consumed_in_bytes), memAddress(error), memAddressSafe(alloc_buffer));
    }

    // --- [ stb_vorbis_decode_frame_pushdata ] ---

    /** {@code int stb_vorbis_decode_frame_pushdata(stb_vorbis * f, unsigned char const * datablock, int datablock_length_in_bytes, int * channels, float *** output, int * samples)} */
    public static native int nstb_vorbis_decode_frame_pushdata(long f, long datablock, int datablock_length_in_bytes, long channels, long output, long samples);

    /** {@code int stb_vorbis_decode_frame_pushdata(stb_vorbis * f, unsigned char const * datablock, int datablock_length_in_bytes, int * channels, float *** output, int * samples)} */
    public static int stb_vorbis_decode_frame_pushdata(@NativeType("stb_vorbis *") long f, @NativeType("unsigned char const *") ByteBuffer datablock, @NativeType("int *") @Nullable IntBuffer channels, @NativeType("float ***") PointerBuffer output, @NativeType("int *") IntBuffer samples) {
        if (CHECKS) {
            check(f);
            checkSafe(channels, 1);
            check(output, 1);
            check(samples, 1);
        }
        return nstb_vorbis_decode_frame_pushdata(f, memAddress(datablock), datablock.remaining(), memAddressSafe(channels), memAddress(output), memAddress(samples));
    }

    // --- [ stb_vorbis_flush_pushdata ] ---

    /** {@code void stb_vorbis_flush_pushdata(stb_vorbis * f)} */
    public static native void nstb_vorbis_flush_pushdata(long f);

    /** {@code void stb_vorbis_flush_pushdata(stb_vorbis * f)} */
    public static void stb_vorbis_flush_pushdata(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        nstb_vorbis_flush_pushdata(f);
    }

    // --- [ stb_vorbis_decode_filename ] ---

    /** {@code int stb_vorbis_decode_filename(char const * filename, int * channels, int * sample_rate, short ** output)} */
    public static native int nstb_vorbis_decode_filename(long filename, long channels, long sample_rate, long output);

    /** {@code int stb_vorbis_decode_filename(char const * filename, int * channels, int * sample_rate, short ** output)} */
    public static int stb_vorbis_decode_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate, @NativeType("short **") PointerBuffer output) {
        if (CHECKS) {
            checkNT1(filename);
            check(channels, 1);
            check(sample_rate, 1);
            check(output, 1);
        }
        return nstb_vorbis_decode_filename(memAddress(filename), memAddress(channels), memAddress(sample_rate), memAddress(output));
    }

    /** {@code int stb_vorbis_decode_filename(char const * filename, int * channels, int * sample_rate, short ** output)} */
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

    /** {@code int stb_vorbis_decode_filename(char const * filename, int * channels, int * sample_rate, short ** output)} */
    @NativeType("int")
    public static @Nullable ShortBuffer stb_vorbis_decode_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate) {
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

    /** {@code int stb_vorbis_decode_memory(unsigned char const * mem, int len, int * channels, int * sample_rate, short ** output)} */
    public static native int nstb_vorbis_decode_memory(long mem, int len, long channels, long sample_rate, long output);

    /** {@code int stb_vorbis_decode_memory(unsigned char const * mem, int len, int * channels, int * sample_rate, short ** output)} */
    public static int stb_vorbis_decode_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate, @NativeType("short **") PointerBuffer output) {
        if (CHECKS) {
            check(channels, 1);
            check(sample_rate, 1);
            check(output, 1);
        }
        return nstb_vorbis_decode_memory(memAddress(mem), mem.remaining(), memAddress(channels), memAddress(sample_rate), memAddress(output));
    }

    /** {@code int stb_vorbis_decode_memory(unsigned char const * mem, int len, int * channels, int * sample_rate, short ** output)} */
    @NativeType("int")
    public static @Nullable ShortBuffer stb_vorbis_decode_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") IntBuffer channels, @NativeType("int *") IntBuffer sample_rate) {
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

    /** {@code stb_vorbis * stb_vorbis_open_memory(unsigned char const * mem, int len, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    public static native long nstb_vorbis_open_memory(long mem, int len, long error, long alloc_buffer);

    /** {@code stb_vorbis * stb_vorbis_open_memory(unsigned char const * mem, int len, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") IntBuffer error, @NativeType("stb_vorbis_alloc const *") @Nullable STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_memory(memAddress(mem), mem.remaining(), memAddress(error), memAddressSafe(alloc_buffer));
    }

    // --- [ stb_vorbis_open_filename ] ---

    /** {@code stb_vorbis * stb_vorbis_open_filename(char const * filename, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    public static native long nstb_vorbis_open_filename(long filename, long error, long alloc_buffer);

    /** {@code stb_vorbis * stb_vorbis_open_filename(char const * filename, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") IntBuffer error, @NativeType("stb_vorbis_alloc const *") @Nullable STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            checkNT1(filename);
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_filename(memAddress(filename), memAddress(error), memAddressSafe(alloc_buffer));
    }

    /** {@code stb_vorbis * stb_vorbis_open_filename(char const * filename, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") IntBuffer error, @NativeType("stb_vorbis_alloc const *") @Nullable STBVorbisAlloc alloc_buffer) {
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

    /** {@code int stb_vorbis_seek_frame(stb_vorbis * f, unsigned int sample_number)} */
    public static native int nstb_vorbis_seek_frame(long f, int sample_number);

    /** {@code int stb_vorbis_seek_frame(stb_vorbis * f, unsigned int sample_number)} */
    @NativeType("int")
    public static boolean stb_vorbis_seek_frame(@NativeType("stb_vorbis *") long f, @NativeType("unsigned int") int sample_number) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_seek_frame(f, sample_number) != 0;
    }

    // --- [ stb_vorbis_seek ] ---

    /** {@code int stb_vorbis_seek(stb_vorbis * f, unsigned int sample_number)} */
    public static native int nstb_vorbis_seek(long f, int sample_number);

    /** {@code int stb_vorbis_seek(stb_vorbis * f, unsigned int sample_number)} */
    @NativeType("int")
    public static boolean stb_vorbis_seek(@NativeType("stb_vorbis *") long f, @NativeType("unsigned int") int sample_number) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_seek(f, sample_number) != 0;
    }

    // --- [ stb_vorbis_seek_start ] ---

    /** {@code int stb_vorbis_seek_start(stb_vorbis * f)} */
    public static native int nstb_vorbis_seek_start(long f);

    /** {@code int stb_vorbis_seek_start(stb_vorbis * f)} */
    @NativeType("int")
    public static boolean stb_vorbis_seek_start(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_seek_start(f) != 0;
    }

    // --- [ stb_vorbis_stream_length_in_samples ] ---

    /** {@code unsigned int stb_vorbis_stream_length_in_samples(stb_vorbis * f)} */
    public static native int nstb_vorbis_stream_length_in_samples(long f);

    /** {@code unsigned int stb_vorbis_stream_length_in_samples(stb_vorbis * f)} */
    @NativeType("unsigned int")
    public static int stb_vorbis_stream_length_in_samples(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_stream_length_in_samples(f);
    }

    // --- [ stb_vorbis_stream_length_in_seconds ] ---

    /** {@code float stb_vorbis_stream_length_in_seconds(stb_vorbis * f)} */
    public static native float nstb_vorbis_stream_length_in_seconds(long f);

    /** {@code float stb_vorbis_stream_length_in_seconds(stb_vorbis * f)} */
    public static float stb_vorbis_stream_length_in_seconds(@NativeType("stb_vorbis *") long f) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_stream_length_in_seconds(f);
    }

    // --- [ stb_vorbis_get_frame_float ] ---

    /** {@code int stb_vorbis_get_frame_float(stb_vorbis * f, int * channels, float *** output)} */
    public static native int nstb_vorbis_get_frame_float(long f, long channels, long output);

    /** {@code int stb_vorbis_get_frame_float(stb_vorbis * f, int * channels, float *** output)} */
    public static int stb_vorbis_get_frame_float(@NativeType("stb_vorbis *") long f, @NativeType("int *") @Nullable IntBuffer channels, @NativeType("float ***") PointerBuffer output) {
        if (CHECKS) {
            check(f);
            checkSafe(channels, 1);
            check(output, 1);
        }
        return nstb_vorbis_get_frame_float(f, memAddressSafe(channels), memAddress(output));
    }

    // --- [ stb_vorbis_get_frame_short ] ---

    /** {@code int stb_vorbis_get_frame_short(stb_vorbis * f, int num_c, short ** buffer, int num_samples)} */
    public static native int nstb_vorbis_get_frame_short(long f, int num_c, long buffer, int num_samples);

    /** {@code int stb_vorbis_get_frame_short(stb_vorbis * f, int num_c, short ** buffer, int num_samples)} */
    public static int stb_vorbis_get_frame_short(@NativeType("stb_vorbis *") long f, @NativeType("short **") PointerBuffer buffer, int num_samples) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_frame_short(f, buffer.remaining(), memAddress(buffer), num_samples);
    }

    // --- [ stb_vorbis_get_frame_short_interleaved ] ---

    /** {@code int stb_vorbis_get_frame_short_interleaved(stb_vorbis * f, int num_c, short * buffer, int num_shorts)} */
    public static native int nstb_vorbis_get_frame_short_interleaved(long f, int num_c, long buffer, int num_shorts);

    /** {@code int stb_vorbis_get_frame_short_interleaved(stb_vorbis * f, int num_c, short * buffer, int num_shorts)} */
    public static int stb_vorbis_get_frame_short_interleaved(@NativeType("stb_vorbis *") long f, int num_c, @NativeType("short *") ShortBuffer buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_frame_short_interleaved(f, num_c, memAddress(buffer), buffer.remaining());
    }

    // --- [ stb_vorbis_get_samples_float ] ---

    /** {@code int stb_vorbis_get_samples_float(stb_vorbis * f, int channels, float ** buffer, int num_samples)} */
    public static native int nstb_vorbis_get_samples_float(long f, int channels, long buffer, int num_samples);

    /** {@code int stb_vorbis_get_samples_float(stb_vorbis * f, int channels, float ** buffer, int num_samples)} */
    public static int stb_vorbis_get_samples_float(@NativeType("stb_vorbis *") long f, @NativeType("float **") PointerBuffer buffer, int num_samples) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_float(f, buffer.remaining(), memAddress(buffer), num_samples);
    }

    // --- [ stb_vorbis_get_samples_float_interleaved ] ---

    /** {@code int stb_vorbis_get_samples_float_interleaved(stb_vorbis * f, int channels, float * buffer, int num_floats)} */
    public static native int nstb_vorbis_get_samples_float_interleaved(long f, int channels, long buffer, int num_floats);

    /** {@code int stb_vorbis_get_samples_float_interleaved(stb_vorbis * f, int channels, float * buffer, int num_floats)} */
    public static int stb_vorbis_get_samples_float_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("float *") FloatBuffer buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_float_interleaved(f, channels, memAddress(buffer), buffer.remaining());
    }

    // --- [ stb_vorbis_get_samples_short ] ---

    /** {@code int stb_vorbis_get_samples_short(stb_vorbis * f, int channels, short ** buffer, int num_samples)} */
    public static native int nstb_vorbis_get_samples_short(long f, int channels, long buffer, int num_samples);

    /** {@code int stb_vorbis_get_samples_short(stb_vorbis * f, int channels, short ** buffer, int num_samples)} */
    public static int stb_vorbis_get_samples_short(@NativeType("stb_vorbis *") long f, @NativeType("short **") PointerBuffer buffer, int num_samples) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_short(f, buffer.remaining(), memAddress(buffer), num_samples);
    }

    // --- [ stb_vorbis_get_samples_short_interleaved ] ---

    /** {@code int stb_vorbis_get_samples_short_interleaved(stb_vorbis * f, int channels, short * buffer, int num_shorts)} */
    public static native int nstb_vorbis_get_samples_short_interleaved(long f, int channels, long buffer, int num_shorts);

    /** {@code int stb_vorbis_get_samples_short_interleaved(stb_vorbis * f, int channels, short * buffer, int num_shorts)} */
    public static int stb_vorbis_get_samples_short_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("short *") ShortBuffer buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_short_interleaved(f, channels, memAddress(buffer), buffer.remaining());
    }

    /** {@code stb_vorbis * stb_vorbis_open_pushdata(unsigned char const * datablock, int datablock_length_in_bytes, int * datablock_memory_consumed_in_bytes, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    public static native long nstb_vorbis_open_pushdata(long datablock, int datablock_length_in_bytes, int[] datablock_memory_consumed_in_bytes, int[] error, long alloc_buffer);

    /** {@code stb_vorbis * stb_vorbis_open_pushdata(unsigned char const * datablock, int datablock_length_in_bytes, int * datablock_memory_consumed_in_bytes, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_pushdata(@NativeType("unsigned char const *") ByteBuffer datablock, @NativeType("int *") int[] datablock_memory_consumed_in_bytes, @NativeType("int *") int[] error, @NativeType("stb_vorbis_alloc const *") @Nullable STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            check(datablock_memory_consumed_in_bytes, 1);
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_pushdata(memAddress(datablock), datablock.remaining(), datablock_memory_consumed_in_bytes, error, memAddressSafe(alloc_buffer));
    }

    /** {@code int stb_vorbis_decode_frame_pushdata(stb_vorbis * f, unsigned char const * datablock, int datablock_length_in_bytes, int * channels, float *** output, int * samples)} */
    public static native int nstb_vorbis_decode_frame_pushdata(long f, long datablock, int datablock_length_in_bytes, int[] channels, long output, int[] samples);

    /** {@code int stb_vorbis_decode_frame_pushdata(stb_vorbis * f, unsigned char const * datablock, int datablock_length_in_bytes, int * channels, float *** output, int * samples)} */
    public static int stb_vorbis_decode_frame_pushdata(@NativeType("stb_vorbis *") long f, @NativeType("unsigned char const *") ByteBuffer datablock, @NativeType("int *") int @Nullable [] channels, @NativeType("float ***") PointerBuffer output, @NativeType("int *") int[] samples) {
        if (CHECKS) {
            check(f);
            checkSafe(channels, 1);
            check(output, 1);
            check(samples, 1);
        }
        return nstb_vorbis_decode_frame_pushdata(f, memAddress(datablock), datablock.remaining(), channels, memAddress(output), samples);
    }

    /** {@code int stb_vorbis_decode_filename(char const * filename, int * channels, int * sample_rate, short ** output)} */
    public static native int nstb_vorbis_decode_filename(long filename, int[] channels, int[] sample_rate, long output);

    /** {@code int stb_vorbis_decode_filename(char const * filename, int * channels, int * sample_rate, short ** output)} */
    public static int stb_vorbis_decode_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] channels, @NativeType("int *") int[] sample_rate, @NativeType("short **") PointerBuffer output) {
        if (CHECKS) {
            checkNT1(filename);
            check(channels, 1);
            check(sample_rate, 1);
            check(output, 1);
        }
        return nstb_vorbis_decode_filename(memAddress(filename), channels, sample_rate, memAddress(output));
    }

    /** {@code int stb_vorbis_decode_filename(char const * filename, int * channels, int * sample_rate, short ** output)} */
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

    /** {@code int stb_vorbis_decode_memory(unsigned char const * mem, int len, int * channels, int * sample_rate, short ** output)} */
    public static native int nstb_vorbis_decode_memory(long mem, int len, int[] channels, int[] sample_rate, long output);

    /** {@code int stb_vorbis_decode_memory(unsigned char const * mem, int len, int * channels, int * sample_rate, short ** output)} */
    public static int stb_vorbis_decode_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") int[] channels, @NativeType("int *") int[] sample_rate, @NativeType("short **") PointerBuffer output) {
        if (CHECKS) {
            check(channels, 1);
            check(sample_rate, 1);
            check(output, 1);
        }
        return nstb_vorbis_decode_memory(memAddress(mem), mem.remaining(), channels, sample_rate, memAddress(output));
    }

    /** {@code stb_vorbis * stb_vorbis_open_memory(unsigned char const * mem, int len, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    public static native long nstb_vorbis_open_memory(long mem, int len, int[] error, long alloc_buffer);

    /** {@code stb_vorbis * stb_vorbis_open_memory(unsigned char const * mem, int len, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_memory(@NativeType("unsigned char const *") ByteBuffer mem, @NativeType("int *") int[] error, @NativeType("stb_vorbis_alloc const *") @Nullable STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_memory(memAddress(mem), mem.remaining(), error, memAddressSafe(alloc_buffer));
    }

    /** {@code stb_vorbis * stb_vorbis_open_filename(char const * filename, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    public static native long nstb_vorbis_open_filename(long filename, int[] error, long alloc_buffer);

    /** {@code stb_vorbis * stb_vorbis_open_filename(char const * filename, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") ByteBuffer filename, @NativeType("int *") int[] error, @NativeType("stb_vorbis_alloc const *") @Nullable STBVorbisAlloc alloc_buffer) {
        if (CHECKS) {
            checkNT1(filename);
            check(error, 1);
            if (alloc_buffer != null) { STBVorbisAlloc.validate(alloc_buffer.address()); }
        }
        return nstb_vorbis_open_filename(memAddress(filename), error, memAddressSafe(alloc_buffer));
    }

    /** {@code stb_vorbis * stb_vorbis_open_filename(char const * filename, int * error, stb_vorbis_alloc const * alloc_buffer)} */
    @NativeType("stb_vorbis *")
    public static long stb_vorbis_open_filename(@NativeType("char const *") CharSequence filename, @NativeType("int *") int[] error, @NativeType("stb_vorbis_alloc const *") @Nullable STBVorbisAlloc alloc_buffer) {
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

    /** {@code int stb_vorbis_get_frame_float(stb_vorbis * f, int * channels, float *** output)} */
    public static native int nstb_vorbis_get_frame_float(long f, int[] channels, long output);

    /** {@code int stb_vorbis_get_frame_float(stb_vorbis * f, int * channels, float *** output)} */
    public static int stb_vorbis_get_frame_float(@NativeType("stb_vorbis *") long f, @NativeType("int *") int @Nullable [] channels, @NativeType("float ***") PointerBuffer output) {
        if (CHECKS) {
            check(f);
            checkSafe(channels, 1);
            check(output, 1);
        }
        return nstb_vorbis_get_frame_float(f, channels, memAddress(output));
    }

    /** {@code int stb_vorbis_get_frame_short_interleaved(stb_vorbis * f, int num_c, short * buffer, int num_shorts)} */
    public static native int nstb_vorbis_get_frame_short_interleaved(long f, int num_c, short[] buffer, int num_shorts);

    /** {@code int stb_vorbis_get_frame_short_interleaved(stb_vorbis * f, int num_c, short * buffer, int num_shorts)} */
    public static int stb_vorbis_get_frame_short_interleaved(@NativeType("stb_vorbis *") long f, int num_c, @NativeType("short *") short[] buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_frame_short_interleaved(f, num_c, buffer, buffer.length);
    }

    /** {@code int stb_vorbis_get_samples_float_interleaved(stb_vorbis * f, int channels, float * buffer, int num_floats)} */
    public static native int nstb_vorbis_get_samples_float_interleaved(long f, int channels, float[] buffer, int num_floats);

    /** {@code int stb_vorbis_get_samples_float_interleaved(stb_vorbis * f, int channels, float * buffer, int num_floats)} */
    public static int stb_vorbis_get_samples_float_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("float *") float[] buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_float_interleaved(f, channels, buffer, buffer.length);
    }

    /** {@code int stb_vorbis_get_samples_short_interleaved(stb_vorbis * f, int channels, short * buffer, int num_shorts)} */
    public static native int nstb_vorbis_get_samples_short_interleaved(long f, int channels, short[] buffer, int num_shorts);

    /** {@code int stb_vorbis_get_samples_short_interleaved(stb_vorbis * f, int channels, short * buffer, int num_shorts)} */
    public static int stb_vorbis_get_samples_short_interleaved(@NativeType("stb_vorbis *") long f, int channels, @NativeType("short *") short[] buffer) {
        if (CHECKS) {
            check(f);
        }
        return nstb_vorbis_get_samples_short_interleaved(f, channels, buffer, buffer.length);
    }

}